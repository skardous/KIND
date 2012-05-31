// @SOURCE:C:/tutoPlay/draft/conf/routes
// @HASH:8f17c3e6a82e24f60f1a092c83d1ca57f674382e
// @DATE:Wed May 30 09:52:14 CEST 2012

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
                    

// @LINE:18
val controllers_Application_edit6 = Route("GET", PathPattern(List(StaticPart("/eventsEdit/"),DynamicPart("id", """[^/]+"""))))
                    

// @LINE:19
val controllers_Application_update7 = Route("POST", PathPattern(List(StaticPart("/eventsEdit/"),DynamicPart("id", """[^/]+"""))))
                    

// @LINE:21
val controllers_Application_updatePersonne8 = Route("POST", PathPattern(List(StaticPart("/eventsEdit/"),DynamicPart("id", """[^/]+"""),StaticPart("/updatePersonne"))))
                    

// @LINE:23
val controllers_Application_addParticipant9 = Route("POST", PathPattern(List(StaticPart("/eventsEdit/"),DynamicPart("id", """[^/]+"""),StaticPart("/addParticip"))))
                    

// @LINE:24
val controllers_Application_deleteParticipant10 = Route("POST", PathPattern(List(StaticPart("/eventsEdit/"),DynamicPart("id", """[^/]+"""),StaticPart("/delParticip"))))
                    
def documentation = List(("""GET""","""/assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)"""),("""GET""","""/""","""controllers.Application.index()"""),("""GET""","""/events""","""controllers.Application.events()"""),("""GET""","""/eventlist""","""controllers.Application.eventlist()"""),("""POST""","""/events""","""controllers.Application.newEvent()"""),("""GET""","""/events/$id<[^/]+>/delete""","""controllers.Application.deleteEvent(id:Long)"""),("""GET""","""/eventsEdit/$id<[^/]+>""","""controllers.Application.edit(id:Long)"""),("""POST""","""/eventsEdit/$id<[^/]+>""","""controllers.Application.update(id:Long)"""),("""POST""","""/eventsEdit/$id<[^/]+>/updatePersonne""","""controllers.Application.updatePersonne(id:Long)"""),("""POST""","""/eventsEdit/$id<[^/]+>/addParticip""","""controllers.Application.addParticipant(id:Long)"""),("""POST""","""/eventsEdit/$id<[^/]+>/delParticip""","""controllers.Application.deleteParticipant(id:Long)"""))
             
    
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
                    

// @LINE:18
case controllers_Application_edit6(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(_root_.controllers.Application.edit(id), HandlerDef(this, "controllers.Application", "edit", Seq(classOf[Long])))
   }
}
                    

// @LINE:19
case controllers_Application_update7(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(_root_.controllers.Application.update(id), HandlerDef(this, "controllers.Application", "update", Seq(classOf[Long])))
   }
}
                    

// @LINE:21
case controllers_Application_updatePersonne8(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(_root_.controllers.Application.updatePersonne(id), HandlerDef(this, "controllers.Application", "updatePersonne", Seq(classOf[Long])))
   }
}
                    

// @LINE:23
case controllers_Application_addParticipant9(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(_root_.controllers.Application.addParticipant(id), HandlerDef(this, "controllers.Application", "addParticipant", Seq(classOf[Long])))
   }
}
                    

// @LINE:24
case controllers_Application_deleteParticipant10(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(_root_.controllers.Application.deleteParticipant(id), HandlerDef(this, "controllers.Application", "deleteParticipant", Seq(classOf[Long])))
   }
}
                    
}
    
}
                