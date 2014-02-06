package controllers

import play.api._
import play.api.mvc._
import play.api.libs.json.Json

object Application extends Controller {

  def index = Action {
    Ok(views.html.index())
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

}