// @SOURCE:C:/tutoPlay/KIND/conf/routes
// @HASH:e6ac5da340912756cbd9e007b034d1a6aefef0eb
// @DATE:Mon Jul 23 12:46:54 CEST 2012

import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString

object Routes extends Router.Routes {


// @LINE:8
val controllers_Assets_at0 = Route("GET", PathPattern(List(StaticPart("/assets/"),DynamicPart("file", """.+"""))))
                    

// @LINE:11
val controllers_Application_index1 = Route("GET", PathPattern(List(StaticPart("/KIND/"))))
                    

// @LINE:12
val controllers_Application_index2 = Route("GET", PathPattern(List(StaticPart("/KIND"))))
                    

// @LINE:15
val controllers_Application_events3 = Route("GET", PathPattern(List(StaticPart("/KIND/newevent"))))
                    

// @LINE:16
val controllers_Application_eventlist4 = Route("GET", PathPattern(List(StaticPart("/KIND/eventlist"))))
                    

// @LINE:18
val controllers_Application_newEvent5 = Route("POST", PathPattern(List(StaticPart("/KIND/newevent"))))
                    

// @LINE:19
val controllers_Application_deleteEvent6 = Route("GET", PathPattern(List(StaticPart("/KIND/newevent/"),DynamicPart("id", """[^/]+"""),StaticPart("/delete"))))
                    

// @LINE:21
val controllers_Application_dateSelection7 = Route("GET", PathPattern(List(StaticPart("/KIND/newevent/"),DynamicPart("id", """[^/]+"""),StaticPart("/dateSelection"))))
                    

// @LINE:22
val controllers_Application_addDate8 = Route("POST", PathPattern(List(StaticPart("/KIND/newevent/"),DynamicPart("id", """[^/]+"""),StaticPart("/addDate"))))
                    

// @LINE:23
val controllers_Application_removeDate9 = Route("POST", PathPattern(List(StaticPart("/KIND/newevent/"),DynamicPart("id", """[^/]+"""),StaticPart("/removeDate"))))
                    

// @LINE:24
val controllers_Application_dateChanged10 = Route("POST", PathPattern(List(StaticPart("/KIND/newevent/"),DynamicPart("id", """[^/]+"""),StaticPart("/datechanged"))))
                    

// @LINE:26
val controllers_Application_heureSelection11 = Route("GET", PathPattern(List(StaticPart("/KIND/newevent/"),DynamicPart("id", """[^/]+"""),StaticPart("/heureSelection"))))
                    

// @LINE:27
val controllers_Application_newHoraire12 = Route("POST", PathPattern(List(StaticPart("/KIND/newevent/"),DynamicPart("id", """[^/]+"""),StaticPart("/newHoraire"))))
                    

// @LINE:28
val controllers_Application_deleteHoraire13 = Route("POST", PathPattern(List(StaticPart("/KIND/newevent/"),DynamicPart("id", """[^/]+"""),StaticPart("/deleteHoraire"))))
                    

// @LINE:31
val controllers_Application_edit14 = Route("GET", PathPattern(List(StaticPart("/KIND/eventEdit/"),DynamicPart("id", """[^/]+"""))))
                    

// @LINE:32
val controllers_Application_update15 = Route("POST", PathPattern(List(StaticPart("/KIND/eventEdit/"),DynamicPart("id", """[^/]+"""))))
                    

// @LINE:33
val controllers_Application_editAdm16 = Route("GET", PathPattern(List(StaticPart("/KIND/eventEdit/"),DynamicPart("id", """[^/]+"""),StaticPart("/adm"))))
                    

// @LINE:35
val controllers_Application_updatePersonne17 = Route("POST", PathPattern(List(StaticPart("/KIND/eventEdit/"),DynamicPart("id", """[^/]+"""),StaticPart("/updatePersonne"))))
                    

// @LINE:37
val controllers_Application_addParticipant18 = Route("POST", PathPattern(List(StaticPart("/KIND/eventEdit/"),DynamicPart("id", """[^/]+"""),StaticPart("/addParticip"))))
                    

// @LINE:38
val controllers_Application_deleteParticipant19 = Route("POST", PathPattern(List(StaticPart("/KIND/eventEdit/"),DynamicPart("id", """[^/]+"""),StaticPart("/delParticip"))))
                    

// @LINE:40
val controllers_Application_checkBoxHoraire20 = Route("POST", PathPattern(List(StaticPart("/KIND/eventEdit/"),DynamicPart("id", """[^/]+"""),StaticPart("/checkBoxHoraire"))))
                    

// @LINE:41
val controllers_Application_checkBoxJour21 = Route("POST", PathPattern(List(StaticPart("/KIND/eventEdit/"),DynamicPart("id", """[^/]+"""),StaticPart("/checkBoxJour"))))
                    

// @LINE:43
val controllers_Application_changeObligatoire22 = Route("POST", PathPattern(List(StaticPart("/KIND/eventEdit/"),DynamicPart("id", """[^/]+"""),StaticPart("/changeObligatoire"))))
                    

// @LINE:45
val controllers_Application_sendMail23 = Route("POST", PathPattern(List(StaticPart("/KIND/eventEdit/"),DynamicPart("id", """[^/]+"""),StaticPart("/sendmail"))))
                    

// @LINE:47
val controllers_Application_getPass24 = Route("POST", PathPattern(List(StaticPart("/KIND/eventEdit/"))))
                    
def documentation = List(("""GET""","""/assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)"""),("""GET""","""/KIND/""","""controllers.Application.index()"""),("""GET""","""/KIND""","""controllers.Application.index()"""),("""GET""","""/KIND/newevent""","""controllers.Application.events()"""),("""GET""","""/KIND/eventlist""","""controllers.Application.eventlist()"""),("""POST""","""/KIND/newevent""","""controllers.Application.newEvent()"""),("""GET""","""/KIND/newevent/$id<[^/]+>/delete""","""controllers.Application.deleteEvent(id:Long)"""),("""GET""","""/KIND/newevent/$id<[^/]+>/dateSelection""","""controllers.Application.dateSelection(id:Long)"""),("""POST""","""/KIND/newevent/$id<[^/]+>/addDate""","""controllers.Application.addDate(id:Long)"""),("""POST""","""/KIND/newevent/$id<[^/]+>/removeDate""","""controllers.Application.removeDate(id:Long)"""),("""POST""","""/KIND/newevent/$id<[^/]+>/datechanged""","""controllers.Application.dateChanged(id:Long)"""),("""GET""","""/KIND/newevent/$id<[^/]+>/heureSelection""","""controllers.Application.heureSelection(id:Long)"""),("""POST""","""/KIND/newevent/$id<[^/]+>/newHoraire""","""controllers.Application.newHoraire(id:Long)"""),("""POST""","""/KIND/newevent/$id<[^/]+>/deleteHoraire""","""controllers.Application.deleteHoraire(id:Long)"""),("""GET""","""/KIND/eventEdit/$id<[^/]+>""","""controllers.Application.edit(id:Long)"""),("""POST""","""/KIND/eventEdit/$id<[^/]+>""","""controllers.Application.update(id:Long)"""),("""GET""","""/KIND/eventEdit/$id<[^/]+>/adm""","""controllers.Application.editAdm(id:Long)"""),("""POST""","""/KIND/eventEdit/$id<[^/]+>/updatePersonne""","""controllers.Application.updatePersonne(id:Long)"""),("""POST""","""/KIND/eventEdit/$id<[^/]+>/addParticip""","""controllers.Application.addParticipant(id:Long)"""),("""POST""","""/KIND/eventEdit/$id<[^/]+>/delParticip""","""controllers.Application.deleteParticipant(id:Long)"""),("""POST""","""/KIND/eventEdit/$id<[^/]+>/checkBoxHoraire""","""controllers.Application.checkBoxHoraire(id:Long)"""),("""POST""","""/KIND/eventEdit/$id<[^/]+>/checkBoxJour""","""controllers.Application.checkBoxJour(id:Long)"""),("""POST""","""/KIND/eventEdit/$id<[^/]+>/changeObligatoire""","""controllers.Application.changeObligatoire(id:Long)"""),("""POST""","""/KIND/eventEdit/$id<[^/]+>/sendmail""","""controllers.Application.sendMail(id:Long)"""),("""POST""","""/KIND/eventEdit/""","""controllers.Application.getPass()"""))
             
    
def routes:PartialFunction[RequestHeader,Handler] = {        

// @LINE:8
case controllers_Assets_at0(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(_root_.controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String])))
   }
}
                    

// @LINE:11
case controllers_Application_index1(params) => {
   call { 
        invokeHandler(_root_.controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Nil))
   }
}
                    

// @LINE:12
case controllers_Application_index2(params) => {
   call { 
        invokeHandler(_root_.controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Nil))
   }
}
                    

// @LINE:15
case controllers_Application_events3(params) => {
   call { 
        invokeHandler(_root_.controllers.Application.events(), HandlerDef(this, "controllers.Application", "events", Nil))
   }
}
                    

// @LINE:16
case controllers_Application_eventlist4(params) => {
   call { 
        invokeHandler(_root_.controllers.Application.eventlist(), HandlerDef(this, "controllers.Application", "eventlist", Nil))
   }
}
                    

// @LINE:18
case controllers_Application_newEvent5(params) => {
   call { 
        invokeHandler(_root_.controllers.Application.newEvent(), HandlerDef(this, "controllers.Application", "newEvent", Nil))
   }
}
                    

// @LINE:19
case controllers_Application_deleteEvent6(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(_root_.controllers.Application.deleteEvent(id), HandlerDef(this, "controllers.Application", "deleteEvent", Seq(classOf[Long])))
   }
}
                    

// @LINE:21
case controllers_Application_dateSelection7(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(_root_.controllers.Application.dateSelection(id), HandlerDef(this, "controllers.Application", "dateSelection", Seq(classOf[Long])))
   }
}
                    

// @LINE:22
case controllers_Application_addDate8(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(_root_.controllers.Application.addDate(id), HandlerDef(this, "controllers.Application", "addDate", Seq(classOf[Long])))
   }
}
                    

// @LINE:23
case controllers_Application_removeDate9(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(_root_.controllers.Application.removeDate(id), HandlerDef(this, "controllers.Application", "removeDate", Seq(classOf[Long])))
   }
}
                    

// @LINE:24
case controllers_Application_dateChanged10(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(_root_.controllers.Application.dateChanged(id), HandlerDef(this, "controllers.Application", "dateChanged", Seq(classOf[Long])))
   }
}
                    

// @LINE:26
case controllers_Application_heureSelection11(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(_root_.controllers.Application.heureSelection(id), HandlerDef(this, "controllers.Application", "heureSelection", Seq(classOf[Long])))
   }
}
                    

// @LINE:27
case controllers_Application_newHoraire12(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(_root_.controllers.Application.newHoraire(id), HandlerDef(this, "controllers.Application", "newHoraire", Seq(classOf[Long])))
   }
}
                    

// @LINE:28
case controllers_Application_deleteHoraire13(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(_root_.controllers.Application.deleteHoraire(id), HandlerDef(this, "controllers.Application", "deleteHoraire", Seq(classOf[Long])))
   }
}
                    

// @LINE:31
case controllers_Application_edit14(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(_root_.controllers.Application.edit(id), HandlerDef(this, "controllers.Application", "edit", Seq(classOf[Long])))
   }
}
                    

// @LINE:32
case controllers_Application_update15(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(_root_.controllers.Application.update(id), HandlerDef(this, "controllers.Application", "update", Seq(classOf[Long])))
   }
}
                    

// @LINE:33
case controllers_Application_editAdm16(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(_root_.controllers.Application.editAdm(id), HandlerDef(this, "controllers.Application", "editAdm", Seq(classOf[Long])))
   }
}
                    

// @LINE:35
case controllers_Application_updatePersonne17(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(_root_.controllers.Application.updatePersonne(id), HandlerDef(this, "controllers.Application", "updatePersonne", Seq(classOf[Long])))
   }
}
                    

// @LINE:37
case controllers_Application_addParticipant18(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(_root_.controllers.Application.addParticipant(id), HandlerDef(this, "controllers.Application", "addParticipant", Seq(classOf[Long])))
   }
}
                    

// @LINE:38
case controllers_Application_deleteParticipant19(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(_root_.controllers.Application.deleteParticipant(id), HandlerDef(this, "controllers.Application", "deleteParticipant", Seq(classOf[Long])))
   }
}
                    

// @LINE:40
case controllers_Application_checkBoxHoraire20(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(_root_.controllers.Application.checkBoxHoraire(id), HandlerDef(this, "controllers.Application", "checkBoxHoraire", Seq(classOf[Long])))
   }
}
                    

// @LINE:41
case controllers_Application_checkBoxJour21(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(_root_.controllers.Application.checkBoxJour(id), HandlerDef(this, "controllers.Application", "checkBoxJour", Seq(classOf[Long])))
   }
}
                    

// @LINE:43
case controllers_Application_changeObligatoire22(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(_root_.controllers.Application.changeObligatoire(id), HandlerDef(this, "controllers.Application", "changeObligatoire", Seq(classOf[Long])))
   }
}
                    

// @LINE:45
case controllers_Application_sendMail23(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(_root_.controllers.Application.sendMail(id), HandlerDef(this, "controllers.Application", "sendMail", Seq(classOf[Long])))
   }
}
                    

// @LINE:47
case controllers_Application_getPass24(params) => {
   call { 
        invokeHandler(_root_.controllers.Application.getPass(), HandlerDef(this, "controllers.Application", "getPass", Nil))
   }
}
                    
}
    
}
                