// @SOURCE:C:/tutoPlay/KIND/conf/routes
// @HASH:4e51e919035f067dd0c6d0157860bd2f40af89f9
// @DATE:Thu Aug 02 15:17:09 CEST 2012

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
val controllers_Application_newEvent3 = Route("POST", PathPattern(List(StaticPart("/KIND/newevent"))))
                    

// @LINE:16
val controllers_Application_updateEvent4 = Route("POST", PathPattern(List(StaticPart("/KIND/eventCreate/"),DynamicPart("id", """[^/]+"""),StaticPart("/update"))))
                    

// @LINE:17
val controllers_Application_dateSelection5 = Route("GET", PathPattern(List(StaticPart("/KIND/newevent/"),DynamicPart("id", """[^/]+"""),StaticPart("/dateSelection"))))
                    

// @LINE:18
val controllers_Application_heureSelection6 = Route("GET", PathPattern(List(StaticPart("/KIND/newevent/"),DynamicPart("id", """[^/]+"""),StaticPart("/heureSelection"))))
                    

// @LINE:19
val controllers_Application_invitation7 = Route("GET", PathPattern(List(StaticPart("/KIND/newevent/"),DynamicPart("id", """[^/]+"""),StaticPart("/invitation"))))
                    

// @LINE:20
val controllers_Application_resume8 = Route("GET", PathPattern(List(StaticPart("/KIND/newevent/"),DynamicPart("id", """[^/]+"""),StaticPart("/resume"))))
                    

// @LINE:23
val controllers_Application_eventCreateEmpty9 = Route("GET", PathPattern(List(StaticPart("/KIND/eventCreate"))))
                    

// @LINE:24
val controllers_Application_eventCreateFilled10 = Route("GET", PathPattern(List(StaticPart("/KIND/eventCreate/"),DynamicPart("id", """[^/]+"""),StaticPart("/filled"))))
                    

// @LINE:25
val controllers_Application_eventlist11 = Route("GET", PathPattern(List(StaticPart("/KIND/eventlist"))))
                    

// @LINE:27
val controllers_Application_deleteEvent12 = Route("GET", PathPattern(List(StaticPart("/KIND/newevent/"),DynamicPart("id", """[^/]+"""),StaticPart("/delete"))))
                    

// @LINE:30
val controllers_Application_addDate13 = Route("POST", PathPattern(List(StaticPart("/KIND/newevent/"),DynamicPart("id", """[^/]+"""),StaticPart("/addDate"))))
                    

// @LINE:31
val controllers_Application_removeDate14 = Route("POST", PathPattern(List(StaticPart("/KIND/newevent/"),DynamicPart("id", """[^/]+"""),StaticPart("/removeDate"))))
                    

// @LINE:32
val controllers_Application_dateChanged15 = Route("POST", PathPattern(List(StaticPart("/KIND/newevent/"),DynamicPart("id", """[^/]+"""),StaticPart("/datechanged"))))
                    

// @LINE:35
val controllers_Application_newHoraire16 = Route("POST", PathPattern(List(StaticPart("/KIND/newevent/"),DynamicPart("id", """[^/]+"""),StaticPart("/newHoraire"))))
                    

// @LINE:36
val controllers_Application_deleteHoraire17 = Route("POST", PathPattern(List(StaticPart("/KIND/newevent/"),DynamicPart("id", """[^/]+"""),StaticPart("/deleteHoraire"))))
                    

// @LINE:39
val controllers_Application_edit18 = Route("GET", PathPattern(List(StaticPart("/KIND/eventEdit/"),DynamicPart("idhash", """[^/]+"""),StaticPart("/consult"))))
                    

// @LINE:40
val controllers_Application_update19 = Route("POST", PathPattern(List(StaticPart("/KIND/eventEdit/"),DynamicPart("id", """[^/]+"""))))
                    

// @LINE:41
val controllers_Application_editAdm20 = Route("GET", PathPattern(List(StaticPart("/KIND/eventEdit/"),DynamicPart("idhash", """[^/]+"""),StaticPart("/consult/"),DynamicPart("mailhash", """[^/]+"""),StaticPart("/adm"))))
                    

// @LINE:45
val controllers_Application_updatePersonne21 = Route("POST", PathPattern(List(StaticPart("/KIND/eventEdit/"),DynamicPart("id", """[^/]+"""),StaticPart("/updatePersonne"))))
                    

// @LINE:47
val controllers_Application_addParticipant22 = Route("POST", PathPattern(List(StaticPart("/KIND/eventEdit/"),DynamicPart("idhash", """[^/]+"""),StaticPart("/addParticip"))))
                    

// @LINE:48
val controllers_Application_deleteParticipant23 = Route("POST", PathPattern(List(StaticPart("/KIND/eventEdit/"),DynamicPart("id", """[^/]+"""),StaticPart("/delParticip"))))
                    

// @LINE:50
val controllers_Application_checkBoxHoraire24 = Route("POST", PathPattern(List(StaticPart("/KIND/eventEdit/"),DynamicPart("id", """[^/]+"""),StaticPart("/checkBoxHoraire"))))
                    

// @LINE:51
val controllers_Application_checkBoxJour25 = Route("POST", PathPattern(List(StaticPart("/KIND/eventEdit/"),DynamicPart("id", """[^/]+"""),StaticPart("/checkBoxJour"))))
                    

// @LINE:53
val controllers_Application_changeObligatoire26 = Route("POST", PathPattern(List(StaticPart("/KIND/eventEdit/"),DynamicPart("id", """[^/]+"""),StaticPart("/changeObligatoire"))))
                    

// @LINE:55
val controllers_Application_sendMail27 = Route("POST", PathPattern(List(StaticPart("/KIND/eventEdit/"),DynamicPart("id", """[^/]+"""),StaticPart("/sendmail"))))
                    

// @LINE:56
val controllers_Application_addMail28 = Route("POST", PathPattern(List(StaticPart("/KIND/eventEdit/"),DynamicPart("id", """[^/]+"""),StaticPart("/addMail"))))
                    

// @LINE:58
val controllers_Application_getPass29 = Route("POST", PathPattern(List(StaticPart("/KIND/eventEdit/"))))
                    
def documentation = List(("""GET""","""/assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)"""),("""GET""","""/KIND/""","""controllers.Application.index()"""),("""GET""","""/KIND""","""controllers.Application.index()"""),("""POST""","""/KIND/newevent""","""controllers.Application.newEvent()"""),("""POST""","""/KIND/eventCreate/$id<[^/]+>/update""","""controllers.Application.updateEvent(id:Long)"""),("""GET""","""/KIND/newevent/$id<[^/]+>/dateSelection""","""controllers.Application.dateSelection(id:Long)"""),("""GET""","""/KIND/newevent/$id<[^/]+>/heureSelection""","""controllers.Application.heureSelection(id:Long)"""),("""GET""","""/KIND/newevent/$id<[^/]+>/invitation""","""controllers.Application.invitation(id:Long)"""),("""GET""","""/KIND/newevent/$id<[^/]+>/resume""","""controllers.Application.resume(id:Long)"""),("""GET""","""/KIND/eventCreate""","""controllers.Application.eventCreateEmpty()"""),("""GET""","""/KIND/eventCreate/$id<[^/]+>/filled""","""controllers.Application.eventCreateFilled(id:Long)"""),("""GET""","""/KIND/eventlist""","""controllers.Application.eventlist()"""),("""GET""","""/KIND/newevent/$id<[^/]+>/delete""","""controllers.Application.deleteEvent(id:Long)"""),("""POST""","""/KIND/newevent/$id<[^/]+>/addDate""","""controllers.Application.addDate(id:Long)"""),("""POST""","""/KIND/newevent/$id<[^/]+>/removeDate""","""controllers.Application.removeDate(id:Long)"""),("""POST""","""/KIND/newevent/$id<[^/]+>/datechanged""","""controllers.Application.dateChanged(id:Long)"""),("""POST""","""/KIND/newevent/$id<[^/]+>/newHoraire""","""controllers.Application.newHoraire(id:Long)"""),("""POST""","""/KIND/newevent/$id<[^/]+>/deleteHoraire""","""controllers.Application.deleteHoraire(id:Long)"""),("""GET""","""/KIND/eventEdit/$idhash<[^/]+>/consult""","""controllers.Application.edit(idhash:String)"""),("""POST""","""/KIND/eventEdit/$id<[^/]+>""","""controllers.Application.update(id:Long)"""),("""GET""","""/KIND/eventEdit/$idhash<[^/]+>/consult/$mailhash<[^/]+>/adm""","""controllers.Application.editAdm(idhash:String, mailhash:String)"""),("""POST""","""/KIND/eventEdit/$id<[^/]+>/updatePersonne""","""controllers.Application.updatePersonne(id:Long)"""),("""POST""","""/KIND/eventEdit/$idhash<[^/]+>/addParticip""","""controllers.Application.addParticipant(idhash:String)"""),("""POST""","""/KIND/eventEdit/$id<[^/]+>/delParticip""","""controllers.Application.deleteParticipant(id:Long)"""),("""POST""","""/KIND/eventEdit/$id<[^/]+>/checkBoxHoraire""","""controllers.Application.checkBoxHoraire(id:Long)"""),("""POST""","""/KIND/eventEdit/$id<[^/]+>/checkBoxJour""","""controllers.Application.checkBoxJour(id:Long)"""),("""POST""","""/KIND/eventEdit/$id<[^/]+>/changeObligatoire""","""controllers.Application.changeObligatoire(id:Long)"""),("""POST""","""/KIND/eventEdit/$id<[^/]+>/sendmail""","""controllers.Application.sendMail(id:Long)"""),("""POST""","""/KIND/eventEdit/$id<[^/]+>/addMail""","""controllers.Application.addMail(id:Long)"""),("""POST""","""/KIND/eventEdit/""","""controllers.Application.getPass()"""))
             
    
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
case controllers_Application_newEvent3(params) => {
   call { 
        invokeHandler(_root_.controllers.Application.newEvent(), HandlerDef(this, "controllers.Application", "newEvent", Nil))
   }
}
                    

// @LINE:16
case controllers_Application_updateEvent4(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(_root_.controllers.Application.updateEvent(id), HandlerDef(this, "controllers.Application", "updateEvent", Seq(classOf[Long])))
   }
}
                    

// @LINE:17
case controllers_Application_dateSelection5(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(_root_.controllers.Application.dateSelection(id), HandlerDef(this, "controllers.Application", "dateSelection", Seq(classOf[Long])))
   }
}
                    

// @LINE:18
case controllers_Application_heureSelection6(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(_root_.controllers.Application.heureSelection(id), HandlerDef(this, "controllers.Application", "heureSelection", Seq(classOf[Long])))
   }
}
                    

// @LINE:19
case controllers_Application_invitation7(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(_root_.controllers.Application.invitation(id), HandlerDef(this, "controllers.Application", "invitation", Seq(classOf[Long])))
   }
}
                    

// @LINE:20
case controllers_Application_resume8(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(_root_.controllers.Application.resume(id), HandlerDef(this, "controllers.Application", "resume", Seq(classOf[Long])))
   }
}
                    

// @LINE:23
case controllers_Application_eventCreateEmpty9(params) => {
   call { 
        invokeHandler(_root_.controllers.Application.eventCreateEmpty(), HandlerDef(this, "controllers.Application", "eventCreateEmpty", Nil))
   }
}
                    

// @LINE:24
case controllers_Application_eventCreateFilled10(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(_root_.controllers.Application.eventCreateFilled(id), HandlerDef(this, "controllers.Application", "eventCreateFilled", Seq(classOf[Long])))
   }
}
                    

// @LINE:25
case controllers_Application_eventlist11(params) => {
   call { 
        invokeHandler(_root_.controllers.Application.eventlist(), HandlerDef(this, "controllers.Application", "eventlist", Nil))
   }
}
                    

// @LINE:27
case controllers_Application_deleteEvent12(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(_root_.controllers.Application.deleteEvent(id), HandlerDef(this, "controllers.Application", "deleteEvent", Seq(classOf[Long])))
   }
}
                    

// @LINE:30
case controllers_Application_addDate13(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(_root_.controllers.Application.addDate(id), HandlerDef(this, "controllers.Application", "addDate", Seq(classOf[Long])))
   }
}
                    

// @LINE:31
case controllers_Application_removeDate14(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(_root_.controllers.Application.removeDate(id), HandlerDef(this, "controllers.Application", "removeDate", Seq(classOf[Long])))
   }
}
                    

// @LINE:32
case controllers_Application_dateChanged15(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(_root_.controllers.Application.dateChanged(id), HandlerDef(this, "controllers.Application", "dateChanged", Seq(classOf[Long])))
   }
}
                    

// @LINE:35
case controllers_Application_newHoraire16(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(_root_.controllers.Application.newHoraire(id), HandlerDef(this, "controllers.Application", "newHoraire", Seq(classOf[Long])))
   }
}
                    

// @LINE:36
case controllers_Application_deleteHoraire17(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(_root_.controllers.Application.deleteHoraire(id), HandlerDef(this, "controllers.Application", "deleteHoraire", Seq(classOf[Long])))
   }
}
                    

// @LINE:39
case controllers_Application_edit18(params) => {
   call(params.fromPath[String]("idhash", None)) { (idhash) =>
        invokeHandler(_root_.controllers.Application.edit(idhash), HandlerDef(this, "controllers.Application", "edit", Seq(classOf[String])))
   }
}
                    

// @LINE:40
case controllers_Application_update19(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(_root_.controllers.Application.update(id), HandlerDef(this, "controllers.Application", "update", Seq(classOf[Long])))
   }
}
                    

// @LINE:41
case controllers_Application_editAdm20(params) => {
   call(params.fromPath[String]("idhash", None), params.fromPath[String]("mailhash", None)) { (idhash, mailhash) =>
        invokeHandler(_root_.controllers.Application.editAdm(idhash, mailhash), HandlerDef(this, "controllers.Application", "editAdm", Seq(classOf[String], classOf[String])))
   }
}
                    

// @LINE:45
case controllers_Application_updatePersonne21(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(_root_.controllers.Application.updatePersonne(id), HandlerDef(this, "controllers.Application", "updatePersonne", Seq(classOf[Long])))
   }
}
                    

// @LINE:47
case controllers_Application_addParticipant22(params) => {
   call(params.fromPath[String]("idhash", None)) { (idhash) =>
        invokeHandler(_root_.controllers.Application.addParticipant(idhash), HandlerDef(this, "controllers.Application", "addParticipant", Seq(classOf[String])))
   }
}
                    

// @LINE:48
case controllers_Application_deleteParticipant23(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(_root_.controllers.Application.deleteParticipant(id), HandlerDef(this, "controllers.Application", "deleteParticipant", Seq(classOf[Long])))
   }
}
                    

// @LINE:50
case controllers_Application_checkBoxHoraire24(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(_root_.controllers.Application.checkBoxHoraire(id), HandlerDef(this, "controllers.Application", "checkBoxHoraire", Seq(classOf[Long])))
   }
}
                    

// @LINE:51
case controllers_Application_checkBoxJour25(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(_root_.controllers.Application.checkBoxJour(id), HandlerDef(this, "controllers.Application", "checkBoxJour", Seq(classOf[Long])))
   }
}
                    

// @LINE:53
case controllers_Application_changeObligatoire26(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(_root_.controllers.Application.changeObligatoire(id), HandlerDef(this, "controllers.Application", "changeObligatoire", Seq(classOf[Long])))
   }
}
                    

// @LINE:55
case controllers_Application_sendMail27(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(_root_.controllers.Application.sendMail(id), HandlerDef(this, "controllers.Application", "sendMail", Seq(classOf[Long])))
   }
}
                    

// @LINE:56
case controllers_Application_addMail28(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(_root_.controllers.Application.addMail(id), HandlerDef(this, "controllers.Application", "addMail", Seq(classOf[Long])))
   }
}
                    

// @LINE:58
case controllers_Application_getPass29(params) => {
   call { 
        invokeHandler(_root_.controllers.Application.getPass(), HandlerDef(this, "controllers.Application", "getPass", Nil))
   }
}
                    
}
    
}
                