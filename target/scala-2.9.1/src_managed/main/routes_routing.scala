// @SOURCE:C:/tutoPlay/doodle/conf/routes
// @HASH:fc0c03afda0a8e204df80f6ec320755d690e378c
// @DATE:Mon Jun 04 14:59:53 CEST 2012

import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString

object Routes extends Router.Routes {


// @LINE:6
val controllers_Assets_at0 = Route("GET", PathPattern(List(StaticPart("/assets/"),DynamicPart("file", """.+"""))))
                    

// @LINE:9
val controllers_Application_index1 = Route("GET", PathPattern(List(StaticPart("/"))))
                    

// @LINE:12
val controllers_Application_events2 = Route("GET", PathPattern(List(StaticPart("/events"))))
                    

// @LINE:13
val controllers_Application_eventlist3 = Route("GET", PathPattern(List(StaticPart("/eventlist"))))
                    

// @LINE:14
val controllers_Application_newEvent4 = Route("POST", PathPattern(List(StaticPart("/events"))))
                    

// @LINE:15
val controllers_Application_deleteEvent5 = Route("GET", PathPattern(List(StaticPart("/events/"),DynamicPart("id", """[^/]+"""),StaticPart("/delete"))))
                    

// @LINE:17
val controllers_Application_dateSelection6 = Route("GET", PathPattern(List(StaticPart("/events/"),DynamicPart("id", """[^/]+"""),StaticPart("/dateSelection"))))
                    

// @LINE:18
val controllers_Application_addDate7 = Route("POST", PathPattern(List(StaticPart("/events/"),DynamicPart("id", """[^/]+"""),StaticPart("/addDate"))))
                    

// @LINE:19
val controllers_Application_removeDate8 = Route("POST", PathPattern(List(StaticPart("/events/"),DynamicPart("id", """[^/]+"""),StaticPart("/removeDate"))))
                    

// @LINE:20
val controllers_Application_dateChanged9 = Route("POST", PathPattern(List(StaticPart("/events/"),DynamicPart("id", """[^/]+"""),StaticPart("/datechanged"))))
                    

// @LINE:22
val controllers_Application_heureSelection10 = Route("GET", PathPattern(List(StaticPart("/events/"),DynamicPart("id", """[^/]+"""),StaticPart("/heureSelection"))))
                    

// @LINE:23
val controllers_Application_newHoraire11 = Route("POST", PathPattern(List(StaticPart("/events/"),DynamicPart("id", """[^/]+"""),StaticPart("/newHoraire"))))
                    

// @LINE:24
val controllers_Application_deleteHoraire12 = Route("POST", PathPattern(List(StaticPart("/events/"),DynamicPart("id", """[^/]+"""),StaticPart("/deleteHoraire"))))
                    

// @LINE:27
val controllers_Application_edit13 = Route("GET", PathPattern(List(StaticPart("/eventsEdit/"),DynamicPart("id", """[^/]+"""))))
                    

// @LINE:28
val controllers_Application_update14 = Route("POST", PathPattern(List(StaticPart("/eventsEdit/"),DynamicPart("id", """[^/]+"""))))
                    

// @LINE:30
val controllers_Application_updatePersonne15 = Route("POST", PathPattern(List(StaticPart("/eventsEdit/"),DynamicPart("id", """[^/]+"""),StaticPart("/updatePersonne"))))
                    

// @LINE:32
val controllers_Application_addParticipant16 = Route("POST", PathPattern(List(StaticPart("/eventsEdit/"),DynamicPart("id", """[^/]+"""),StaticPart("/addParticip"))))
                    

// @LINE:33
val controllers_Application_deleteParticipant17 = Route("POST", PathPattern(List(StaticPart("/eventsEdit/"),DynamicPart("id", """[^/]+"""),StaticPart("/delParticip"))))
                    
def documentation = List(("""GET""","""/assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)"""),("""GET""","""/""","""controllers.Application.index()"""),("""GET""","""/events""","""controllers.Application.events()"""),("""GET""","""/eventlist""","""controllers.Application.eventlist()"""),("""POST""","""/events""","""controllers.Application.newEvent()"""),("""GET""","""/events/$id<[^/]+>/delete""","""controllers.Application.deleteEvent(id:Long)"""),("""GET""","""/events/$id<[^/]+>/dateSelection""","""controllers.Application.dateSelection(id:Long)"""),("""POST""","""/events/$id<[^/]+>/addDate""","""controllers.Application.addDate(id:Long)"""),("""POST""","""/events/$id<[^/]+>/removeDate""","""controllers.Application.removeDate(id:Long)"""),("""POST""","""/events/$id<[^/]+>/datechanged""","""controllers.Application.dateChanged(id:Long)"""),("""GET""","""/events/$id<[^/]+>/heureSelection""","""controllers.Application.heureSelection(id:Long)"""),("""POST""","""/events/$id<[^/]+>/newHoraire""","""controllers.Application.newHoraire(id:Long)"""),("""POST""","""/events/$id<[^/]+>/deleteHoraire""","""controllers.Application.deleteHoraire(id:Long)"""),("""GET""","""/eventsEdit/$id<[^/]+>""","""controllers.Application.edit(id:Long)"""),("""POST""","""/eventsEdit/$id<[^/]+>""","""controllers.Application.update(id:Long)"""),("""POST""","""/eventsEdit/$id<[^/]+>/updatePersonne""","""controllers.Application.updatePersonne(id:Long)"""),("""POST""","""/eventsEdit/$id<[^/]+>/addParticip""","""controllers.Application.addParticipant(id:Long)"""),("""POST""","""/eventsEdit/$id<[^/]+>/delParticip""","""controllers.Application.deleteParticipant(id:Long)"""))
             
    
def routes:PartialFunction[RequestHeader,Handler] = {        

// @LINE:6
case controllers_Assets_at0(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(_root_.controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String])))
   }
}
                    

// @LINE:9
case controllers_Application_index1(params) => {
   call { 
        invokeHandler(_root_.controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Nil))
   }
}
                    

// @LINE:12
case controllers_Application_events2(params) => {
   call { 
        invokeHandler(_root_.controllers.Application.events(), HandlerDef(this, "controllers.Application", "events", Nil))
   }
}
                    

// @LINE:13
case controllers_Application_eventlist3(params) => {
   call { 
        invokeHandler(_root_.controllers.Application.eventlist(), HandlerDef(this, "controllers.Application", "eventlist", Nil))
   }
}
                    

// @LINE:14
case controllers_Application_newEvent4(params) => {
   call { 
        invokeHandler(_root_.controllers.Application.newEvent(), HandlerDef(this, "controllers.Application", "newEvent", Nil))
   }
}
                    

// @LINE:15
case controllers_Application_deleteEvent5(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(_root_.controllers.Application.deleteEvent(id), HandlerDef(this, "controllers.Application", "deleteEvent", Seq(classOf[Long])))
   }
}
                    

// @LINE:17
case controllers_Application_dateSelection6(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(_root_.controllers.Application.dateSelection(id), HandlerDef(this, "controllers.Application", "dateSelection", Seq(classOf[Long])))
   }
}
                    

// @LINE:18
case controllers_Application_addDate7(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(_root_.controllers.Application.addDate(id), HandlerDef(this, "controllers.Application", "addDate", Seq(classOf[Long])))
   }
}
                    

// @LINE:19
case controllers_Application_removeDate8(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(_root_.controllers.Application.removeDate(id), HandlerDef(this, "controllers.Application", "removeDate", Seq(classOf[Long])))
   }
}
                    

// @LINE:20
case controllers_Application_dateChanged9(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(_root_.controllers.Application.dateChanged(id), HandlerDef(this, "controllers.Application", "dateChanged", Seq(classOf[Long])))
   }
}
                    

// @LINE:22
case controllers_Application_heureSelection10(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(_root_.controllers.Application.heureSelection(id), HandlerDef(this, "controllers.Application", "heureSelection", Seq(classOf[Long])))
   }
}
                    

// @LINE:23
case controllers_Application_newHoraire11(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(_root_.controllers.Application.newHoraire(id), HandlerDef(this, "controllers.Application", "newHoraire", Seq(classOf[Long])))
   }
}
                    

// @LINE:24
case controllers_Application_deleteHoraire12(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(_root_.controllers.Application.deleteHoraire(id), HandlerDef(this, "controllers.Application", "deleteHoraire", Seq(classOf[Long])))
   }
}
                    

// @LINE:27
case controllers_Application_edit13(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(_root_.controllers.Application.edit(id), HandlerDef(this, "controllers.Application", "edit", Seq(classOf[Long])))
   }
}
                    

// @LINE:28
case controllers_Application_update14(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(_root_.controllers.Application.update(id), HandlerDef(this, "controllers.Application", "update", Seq(classOf[Long])))
   }
}
                    

// @LINE:30
case controllers_Application_updatePersonne15(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(_root_.controllers.Application.updatePersonne(id), HandlerDef(this, "controllers.Application", "updatePersonne", Seq(classOf[Long])))
   }
}
                    

// @LINE:32
case controllers_Application_addParticipant16(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(_root_.controllers.Application.addParticipant(id), HandlerDef(this, "controllers.Application", "addParticipant", Seq(classOf[Long])))
   }
}
                    

// @LINE:33
case controllers_Application_deleteParticipant17(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(_root_.controllers.Application.deleteParticipant(id), HandlerDef(this, "controllers.Application", "deleteParticipant", Seq(classOf[Long])))
   }
}
                    
}
    
}
                