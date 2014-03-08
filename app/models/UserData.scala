package models


/**
 * The UserData model that represents the user that uses the form in the Contact Me section
 * @param name
 * @param email
 * @param message
 */
case class UserData(name: String, email: String, message: String)