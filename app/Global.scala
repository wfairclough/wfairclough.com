import java.io.File
import play.api._
import com.typesafe.config.ConfigFactory

object Global extends GlobalSettings {

  /**
   * Override the onLoadConfig to load production or dev configuration.
   * Also added mailer config file that is in gitignore so everyone doesnt seem my password and mail settings.
   * @param config
   * @param path
   * @param classloader
   * @param mode
   * @return
   */
  override def onLoadConfig(config: Configuration, path: File, classloader: ClassLoader, mode: Mode.Mode): Configuration = {
    val modeSpecificConfig = config ++ Configuration(ConfigFactory.load(s"application.${mode.toString.toLowerCase}.conf"))
    val mailerConfig = modeSpecificConfig ++ Configuration(ConfigFactory.load(s"mailer.conf"))

    play.Logger.info("SendGrid User: " + scala.util.Properties.envOrElse("SENDGRID_USERNAME", "No SendGrid User"))

    super.onLoadConfig(mailerConfig, path, classloader, mode)
  }

}