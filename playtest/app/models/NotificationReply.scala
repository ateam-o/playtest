package models

import scala.collection.immutable.List

class NotificationInfo(
    val name: String
    ,var value: String
    ,var attribute: String
    ,var question: List[Question]
    )

class Question(
    val value: String
    ,val qtype: String
    ,val opquestion: List[OptionQuestion]
    ,val opanswer: Int
    ,var chkquestion: List[CheckQuestion]
    )

class OptionQuestion(val index: Int,val label: String)
class CheckQuestion(val index: Int,val label: String,val checked: Boolean)