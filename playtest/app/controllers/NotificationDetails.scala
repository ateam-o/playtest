package controllers

import play.api._
import play.api.mvc._

object NotificationDetails extends Controller {

  def index = Action {
    Ok(views.html.nfdetails("Your new application is ready."))
  }

}