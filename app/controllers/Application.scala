package controllers

import play.api.mvc._
import play.api.data._
import play.api.data.Forms._
import models.UserData

object Application extends Controller {

  val userForm = Form(
    mapping(
      "name" -> nonEmptyText,
      "email" -> nonEmptyText,
      "message" -> nonEmptyText
    )(UserData.apply)(UserData.unapply)
  )

  def index = Action {
    Ok(views.html.index(userForm))
  }

  def contact = Action {
    Ok(views.html.contact())
  }

  def projects = Action {
    Ok(views.html.projects())
  }

  def about = Action {
    Ok(views.html.projects())
  }


  def sendMessage = Action { implicit request =>
    import play.api.Play.current
    import com.typesafe.plugin._
    val mail = use[MailerPlugin].email

    userForm.bindFromRequest.fold(
      formWithErrors => {
        if (formWithErrors.hasErrors) {
          formWithErrors.errors.foreach(fe => play.Logger.error(s"Error: ${fe.message}"))
        }
        play.Logger.error("Errors")
        Redirect(routes.Application.index)
      },
      userData => {
        play.Logger.debug(userData.toString)

        mail.setSubject("wfairclough.com Message Submitted")
        mail.setRecipient("Will Fairclough <wfairclough@gmail.com>")
        mail.setFrom(s"${userData.name} <${userData.email}>")

        mail.send( s"Message from ${userData.name} <${userData.email}> \n\n ${userData.message}" )

        Redirect(routes.Application.index)
      }
    )

  }

}