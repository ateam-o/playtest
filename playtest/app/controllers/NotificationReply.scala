package controllers

import play.api._
import play.api.mvc._

object NotificationReply extends Controller {

  def index = Action {
    Ok(views.html.nfreply("Your new application is ready."))
  }

}