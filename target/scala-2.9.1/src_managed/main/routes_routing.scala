// @SOURCE:C:/tutoPlay/KIND/conf/routes
// @HASH:61c7d7ecfba4aea88d1c141e72a8fb3545778876
// @DATE:Fri Jul 20 15:30:10 CEST 2012

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
                    

// @LINE:14
val controllers_Application_events2 = Route("GET", PathPattern(List(StaticPart("/KIND/newevent"))))
                    

// @LINE:15
val controllers_Application_eventlist3 = Route("GET", PathPattern(List(StaticPart("/KIND/eventlist"))))
                    

// @LINE:17
val controllers_Application_newEvent4 = Route("POST", PathPattern(List(StaticPart("/KIND/newevent"))))
                    

// @LINE:18
val controllers_Application_deleteEvent5 = Route("GET", PathPattern(List(StaticPart("/KIND/newevent/"),DynamicPart("id", """[^/]+"""),StaticPart("/delete"))))
                    

// @LINE:20
val controllers_Application_dateSelection6 = Route("GET", PathPattern(List(StaticPart("/KIND/newevent/"),DynamicPart("id", """[^/]+"""),StaticPart("/dateSelection"))))
                    

// @LINE:21
val controllers_Application_addDate7 = Route("POST", PathPattern(List(StaticPart("/KIND/newevent/"),DynamicPart("id", """[^/]+"""),StaticPart("/addDate"))))
                    

// @LINE:22
val controllers_Application_removeDate8 = Route("POST", PathPattern(List(StaticPart("/KIND/newevent/"),DynamicPart("id", """[^/]+"""),StaticPart("/removeDate"))))
                    

// @LINE:23
val controllers_Application_dateChanged9 = Route("POST", PathPattern(List(StaticPart("/KIND/newevent/"),DynamicPart("id", """[^/]+"""),StaticPart("/datechanged"))))
                    

// @LINE:25
val controllers_Application_heureSelection10 = Route("GET", PathPattern(List(StaticPart("/KIND/newevent/"),DynamicPart("id", """[^/]+"""),StaticPart("/heureSelection"))))
                    

// @LINE:26
val controllers_Application_newHoraire11 = Route("POST", PathPattern(List(StaticPart("/KIND/newevent/"),DynamicPart("id", """[^/]+"""),StaticPart("/newHoraire"))))
                    

// @LINE:27
val controllers_Application_deleteHoraire12 = Route("POST", PathPattern(List(StaticPart("/KIND/newevent/"),DynamicPart("id", """[^/]+"""),StaticPart("/deleteHoraire"))))
                    

// @LINE:30
val controllers_Application_edit13 = Route("GET", PathPattern(List(StaticPart("/KIND/eventEdit/"),DynamicPart("id", """[^/]+"""))))
                    

// @LINE:31
val controllers_Application_update14 = Route("POST", PathPattern(List(StaticPart("/KIND/eventEdit/"),DynamicPart("id", """[^/]+"""))))
                    

// @LINE:32
val controllers_Application_editAdm15 = Route("GET", PathPattern(List(StaticPart("/KIND/eventEdit/"),DynamicPart("id", """[^/]+"""),StaticPart("/adm"))))
                    

// @LINE:34
val controllers_Application_updatePersonne16 = Route("POST", PathPattern(List(StaticPart("/KIND/eventEdit/"),DynamicPart("id", """[^/]+"""),StaticPart("/updatePersonne"))))
                    

// @LINE:36
val controllers_Application_addParticipant17 = Route("POST", PathPattern(List(StaticPart("/KIND/eventEdit/"),DynamicPart("id", """[^/]+"""),StaticPart("/addParticip"))))
                    

// @LINE:37
val controllers_Application_deleteParticipant18 = Route("POST", PathPattern(List(StaticPart("/KIND/eventEdit/"),DynamicPart("id", """[^/]+"""),StaticPart("/delParticip"))))
                    

// @LINE:39
val controllers_Application_checkBoxHoraire19 = Route("POST", PathPattern(List(StaticPart("/KIND/eventEdit/"),DynamicPart("id", """[^/]+"""),StaticPart("/checkBoxHoraire"))))
                    

// @LINE:40
val controllers_Application_checkBoxJour20 = Route("POST", PathPattern(List(StaticPart("/KIND/eventEdit/"),DynamicPart("id", """[^/]+"""),StaticPart("/checkBoxJour"))))
                    

// @LINE:42
val controllers_Application_changeObligatoire21 = Route("POST", PathPattern(List(StaticPart("/KIND/eventEdit/"),DynamicPart("id", """[^/]+"""),StaticPart("/changeObligatoire"))))
                    

// @LINE:44
val controllers_Application_sendMail22 = Route("POST", PathPattern(List(StaticPart("/KIND/eventEdit/"),DynamicPart("id", """[^/]+"""),StaticPart("/sendmail"))))
                    

// @LINE:46
val controllers_Application_getPass23 = Route("POST", PathPattern(List(StaticPart("/KIND/eventEdit/"))))
                    
def documentation = List(("""GET""","""/assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)"""),("""GET""","""/KIND/""","""controllers.Application.index()"""),("""GET""","""/KIND/newevent""","""controllers.Application.events()"""),("""GET""","""/KIND/eventlist""","""controllers.Application.eventlist()"""),("""POST""","""/KIND/newevent""","""controllers.Application.newEvent()"""),("""GET""","""/KIND/newevent/$id<[^/]+>/delete""","""controllers.Application.deleteEvent(id:Long)"""),("""GET""","""/KIND/newevent/$id<[^/]+>/dateSelection""","""controllers.Application.dateSelection(id:Long)"""),("""POST""","""/KIND/newevent/$id<[^/]+>/addDate""","""controllers.Application.addDate(id:Long)"""),("""POST""","""/KIND/newevent/$id<[^/]+>/removeDate""","""controllers.Application.removeDate(id:Long)"""),("""POST""","""/KIND/newevent/$id<[^/]+>/datechanged""","""controllers.Application.dateChanged(id:Long)"""),("""GET""","""/KIND/newevent/$id<[^/]+>/heureSelection""","""controllers.Application.heureSelection(id:Long)"""),("""POST""","""/KIND/newevent/$id<[^/]+>/newHoraire""","""controllers.Application.newHoraire(id:Long)"""),("""POST""","""/KIND/newevent/$id<[^/]+>/deleteHoraire""","""controllers.Application.deleteHoraire(id:Long)"""),("""GET""","""/KIND/eventEdit/$id<[^/]+>""","""controllers.Application.edit(id:Long)"""),("""POST""","""/KIND/eventEdit/$id<[^/]+>""","""controllers.Application.update(id:Long)"""),("""GET""","""/KIND/eventEdit/$id<[^/]+>/adm""","""controllers.Application.editAdm(id:Long)"""),("""POST""","""/KIND/eventEdit/$id<[^/]+>/updatePersonne""","""controllers.Application.updatePersonne(id:Long)"""),("""POST""","""/KIND/eventEdit/$id<[^/]+>/addParticip""","""controllers.Application.addParticipant(id:Long)"""),("""POST""","""/KIND/eventEdit/$id<[^/]+>/delParticip""","""controllers.Application.deleteParticipant(id:Long)"""),("""POST""","""/KIND/eventEdit/$id<[^/]+>/checkBoxHoraire""","""controllers.Application.checkBoxHoraire(id:Long)"""),("""POST""","""/KIND/eventEdit/$id<[^/]+>/checkBoxJour""","""controllers.Application.checkBoxJour(id:Long)"""),("""POST""","""/KIND/eventEdit/$id<[^/]+>/changeObligatoire""","""controllers.Application.changeObligatoire(id:Long)"""),("""POST""","""/KIND/eventEdit/$id<[^/]+>/sendmail""","""controllers.Application.sendMail(id:Long)"""),("""POST""","""/KIND/eventEdit/""","""controllers.Application.getPass()"""))
             
    
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
                    

// @LINE:14
case controllers_Application_events2(params) => {
   call { 
        invokeHandler(_root_.controllers.Application.events(), HandlerDef(this, "controllers.Application", "events", Nil))
   }
}
                    

// @LINE:15
case controllers_Application_eventlist3(params) => {
   call { 
        invokeHandler(_root_.controllers.Application.eventlist(), HandlerDef(this, "controllers.Application", "eventlist", Nil))
   }
}
                    

// @LINE:17
case controllers_Application_newEvent4(params) => {
   call { 
        invokeHandler(_root_.controllers.Application.newEvent(), HandlerDef(this, "controllers.Application", "newEvent", Nil))
   }
}
                    

// @LINE:18
case controllers_Application_deleteEvent5(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(_root_.controllers.Application.deleteEvent(id), HandlerDef(this, "controllers.Application", "deleteEvent", Seq(classOf[Long])))
   }
}
                    

// @LINE:20
case controllers_Application_dateSelection6(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(_root_.controllers.Application.dateSelection(id), HandlerDef(this, "controllers.Application", "dateSelection", Seq(classOf[Long])))
   }
}
                    

// @LINE:21
case controllers_Application_addDate7(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(_root_.controllers.Application.addDate(id), HandlerDef(this, "controllers.Application", "addDate", Seq(classOf[Long])))
   }
}
                    

// @LINE:22
case controllers_Application_removeDate8(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(_root_.controllers.Application.removeDate(id), HandlerDef(this, "controllers.Application", "removeDate", Seq(classOf[Long])))
   }
}
                    

// @LINE:23
case controllers_Application_dateChanged9(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(_root_.controllers.Application.dateChanged(id), HandlerDef(this, "controllers.Application", "dateChanged", Seq(classOf[Long])))
   }
}
                    

// @LINE:25
case controllers_Application_heureSelection10(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(_root_.controllers.Application.heureSelection(id), HandlerDef(this, "controllers.Application", "heureSelection", Seq(classOf[Long])))
   }
}
                    

// @LINE:26
case controllers_Application_newHoraire11(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(_root_.controllers.Application.newHoraire(id), HandlerDef(this, "controllers.Application", "newHoraire", Seq(classOf[Long])))
   }
}
                    

// @LINE:27
case controllers_Application_deleteHoraire12(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(_root_.controllers.Application.deleteHoraire(id), HandlerDef(this, "controllers.Application", "deleteHoraire", Seq(classOf[Long])))
   }
}
                    

// @LINE:30
case controllers_Application_edit13(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(_root_.controllers.Application.edit(id), HandlerDef(this, "controllers.Application", "edit", Seq(classOf[Long])))
   }
}
                    

// @LINE:31
case controllers_Application_update14(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(_root_.controllers.Application.update(id), HandlerDef(this, "controllers.Application", "update", Seq(classOf[Long])))
   }
}
                    

// @LINE:32
case controllers_Application_editAdm15(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(_root_.controllers.Application.editAdm(id), HandlerDef(this, "controllers.Application", "editAdm", Seq(classOf[Long])))
   }
}
                    

// @LINE:34
case controllers_Application_updatePersonne16(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(_root_.controllers.Application.updatePersonne(id), HandlerDef(this, "controllers.Application", "updatePersonne", Seq(classOf[Long])))
   }
}
                    

// @LINE:36
case controllers_Application_addParticipant17(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(_root_.controllers.Application.addParticipant(id), HandlerDef(this, "controllers.Application", "addParticipant", Seq(classOf[Long])))
   }
}
                    

// @LINE:37
case controllers_Application_deleteParticipant18(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(_root_.controllers.Application.deleteParticipant(id), HandlerDef(this, "controllers.Application", "deleteParticipant", Seq(classOf[Long])))
   }
}
                    

// @LINE:39
case controllers_Application_checkBoxHoraire19(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(_root_.controllers.Application.checkBoxHoraire(id), HandlerDef(this, "controllers.Application", "checkBoxHoraire", Seq(classOf[Long])))
   }
}
                    

// @LINE:40
case controllers_Application_checkBoxJour20(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(_root_.controllers.Application.checkBoxJour(id), HandlerDef(this, "controllers.Application", "checkBoxJour", Seq(classOf[Long])))
   }
}
                    

// @LINE:42
case controllers_Application_changeObligatoire21(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(_root_.controllers.Application.changeObligatoire(id), HandlerDef(this, "controllers.Application", "changeObligatoire", Seq(classOf[Long])))
   }
}
                    

// @LINE:44
case controllers_Application_sendMail22(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(_root_.controllers.Application.sendMail(id), HandlerDef(this, "controllers.Application", "sendMail", Seq(classOf[Long])))
   }
}
                    

// @LINE:46
case controllers_Application_getPass23(params) => {
   call { 
        invokeHandler(_root_.controllers.Application.getPass(), HandlerDef(this, "controllers.Application", "getPass", Nil))
   }
}
                    
}
    
}
                