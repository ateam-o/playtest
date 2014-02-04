package controllers

import play.api._
import play.api.mvc._
import views.html.nfcreate

object NotificationCreate extends Controller {

  def index = Action {
    Ok(views.html.nfcreate("Your new application is ready."))
  }

}