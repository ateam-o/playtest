package controllers

import play.api._
import play.api.data.Form
import play.api.data.Forms._
import play.api.mvc._
import views._

object NotificationList extends Controller {

	case class InputBean(noOfEntries:Int, entries: List[Int])
	case class UserEmailBean(name:String, email: String)
	
	val myForm = Form(
		mapping("name" -> text ,"email" -> text)
		(UserEmailBean.apply)(UserEmailBean.unapply)
	)
	
  lazy val inputForm = Form(
    mapping(
      "noOfEntries" -> number,
      "entries" -> list(number.verifying("Please enter an integer between -10 and 10 inclusively.",
        (x: Int) => x >= -10 && x <= 10)))(InputBean.apply)(InputBean.unapply))

  def index = Action {

	var vform = myForm.fill(UserEmailBean("なまえ", "いーめーる"))

    Ok(views.html.nflist(vform))
  }

}