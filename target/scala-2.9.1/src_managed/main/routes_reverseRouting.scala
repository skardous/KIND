// @SOURCE:C:/tutoPlay/doodle/conf/routes
// @HASH:fc0c03afda0a8e204df80f6ec320755d690e378c
// @DATE:Mon Jun 04 14:59:53 CEST 2012

import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString


// @LINE:33
// @LINE:32
// @LINE:30
// @LINE:28
// @LINE:27
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:9
// @LINE:6
package controllers {

// @LINE:6
class ReverseAssets {
    


 
// @LINE:6
def at(file:String) = {
   Call("GET", "/assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                        

                      
    
}
                            

// @LINE:33
// @LINE:32
// @LINE:30
// @LINE:28
// @LINE:27
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:9
class ReverseApplication {
    


 
// @LINE:23
def newHoraire(id:Long) = {
   Call("POST", "/events/" + implicitly[PathBindable[Long]].unbind("id", id) + "/newHoraire")
}
                                                        
 
// @LINE:24
def deleteHoraire(id:Long) = {
   Call("POST", "/events/" + implicitly[PathBindable[Long]].unbind("id", id) + "/deleteHoraire")
}
                                                        
 
// @LINE:18
def addDate(id:Long) = {
   Call("POST", "/events/" + implicitly[PathBindable[Long]].unbind("id", id) + "/addDate")
}
                                                        
 
// @LINE:30
def updatePersonne(id:Long) = {
   Call("POST", "/eventsEdit/" + implicitly[PathBindable[Long]].unbind("id", id) + "/updatePersonne")
}
                                                        
 
// @LINE:14
def newEvent() = {
   Call("POST", "/events")
}
                                                        
 
// @LINE:12
def events() = {
   Call("GET", "/events")
}
                                                        
 
// @LINE:22
def heureSelection(id:Long) = {
   Call("GET", "/events/" + implicitly[PathBindable[Long]].unbind("id", id) + "/heureSelection")
}
                                                        
 
// @LINE:15
def deleteEvent(id:Long) = {
   Call("GET", "/events/" + implicitly[PathBindable[Long]].unbind("id", id) + "/delete")
}
                                                        
 
// @LINE:20
def dateChanged(id:Long) = {
   Call("POST", "/events/" + implicitly[PathBindable[Long]].unbind("id", id) + "/datechanged")
}
                                                        
 
// @LINE:28
def update(id:Long) = {
   Call("POST", "/eventsEdit/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                        
 
// @LINE:32
def addParticipant(id:Long) = {
   Call("POST", "/eventsEdit/" + implicitly[PathBindable[Long]].unbind("id", id) + "/addParticip")
}
                                                        
 
// @LINE:9
def index() = {
   Call("GET", "/")
}
                                                        
 
// @LINE:19
def removeDate(id:Long) = {
   Call("POST", "/events/" + implicitly[PathBindable[Long]].unbind("id", id) + "/removeDate")
}
                                                        
 
// @LINE:27
def edit(id:Long) = {
   Call("GET", "/eventsEdit/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                        
 
// @LINE:17
def dateSelection(id:Long) = {
   Call("GET", "/events/" + implicitly[PathBindable[Long]].unbind("id", id) + "/dateSelection")
}
                                                        
 
// @LINE:13
def eventlist() = {
   Call("GET", "/eventlist")
}
                                                        
 
// @LINE:33
def deleteParticipant(id:Long) = {
   Call("POST", "/eventsEdit/" + implicitly[PathBindable[Long]].unbind("id", id) + "/delParticip")
}
                                                        

                      
    
}
                            
}
                    


// @LINE:33
// @LINE:32
// @LINE:30
// @LINE:28
// @LINE:27
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:9
// @LINE:6
package controllers.javascript {

// @LINE:6
class ReverseAssets {
    


 
// @LINE:6
def at = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"/assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                                                        

                      
    
}
                            

// @LINE:33
// @LINE:32
// @LINE:30
// @LINE:28
// @LINE:27
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:9
class ReverseApplication {
    


 
// @LINE:23
def newHoraire = JavascriptReverseRoute(
   "controllers.Application.newHoraire",
   """
      function(id) {
      return _wA({method:"POST", url:"/events/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/newHoraire"})
      }
   """
)
                                                        
 
// @LINE:24
def deleteHoraire = JavascriptReverseRoute(
   "controllers.Application.deleteHoraire",
   """
      function(id) {
      return _wA({method:"POST", url:"/events/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/deleteHoraire"})
      }
   """
)
                                                        
 
// @LINE:18
def addDate = JavascriptReverseRoute(
   "controllers.Application.addDate",
   """
      function(id) {
      return _wA({method:"POST", url:"/events/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/addDate"})
      }
   """
)
                                                        
 
// @LINE:30
def updatePersonne = JavascriptReverseRoute(
   "controllers.Application.updatePersonne",
   """
      function(id) {
      return _wA({method:"POST", url:"/eventsEdit/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/updatePersonne"})
      }
   """
)
                                                        
 
// @LINE:14
def newEvent = JavascriptReverseRoute(
   "controllers.Application.newEvent",
   """
      function() {
      return _wA({method:"POST", url:"/events"})
      }
   """
)
                                                        
 
// @LINE:12
def events = JavascriptReverseRoute(
   "controllers.Application.events",
   """
      function() {
      return _wA({method:"GET", url:"/events"})
      }
   """
)
                                                        
 
// @LINE:22
def heureSelection = JavascriptReverseRoute(
   "controllers.Application.heureSelection",
   """
      function(id) {
      return _wA({method:"GET", url:"/events/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/heureSelection"})
      }
   """
)
                                                        
 
// @LINE:15
def deleteEvent = JavascriptReverseRoute(
   "controllers.Application.deleteEvent",
   """
      function(id) {
      return _wA({method:"GET", url:"/events/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/delete"})
      }
   """
)
                                                        
 
// @LINE:20
def dateChanged = JavascriptReverseRoute(
   "controllers.Application.dateChanged",
   """
      function(id) {
      return _wA({method:"POST", url:"/events/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/datechanged"})
      }
   """
)
                                                        
 
// @LINE:28
def update = JavascriptReverseRoute(
   "controllers.Application.update",
   """
      function(id) {
      return _wA({method:"POST", url:"/eventsEdit/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                                                        
 
// @LINE:32
def addParticipant = JavascriptReverseRoute(
   "controllers.Application.addParticipant",
   """
      function(id) {
      return _wA({method:"POST", url:"/eventsEdit/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/addParticip"})
      }
   """
)
                                                        
 
// @LINE:9
def index = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"/"})
      }
   """
)
                                                        
 
// @LINE:19
def removeDate = JavascriptReverseRoute(
   "controllers.Application.removeDate",
   """
      function(id) {
      return _wA({method:"POST", url:"/events/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/removeDate"})
      }
   """
)
                                                        
 
// @LINE:27
def edit = JavascriptReverseRoute(
   "controllers.Application.edit",
   """
      function(id) {
      return _wA({method:"GET", url:"/eventsEdit/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                                                        
 
// @LINE:17
def dateSelection = JavascriptReverseRoute(
   "controllers.Application.dateSelection",
   """
      function(id) {
      return _wA({method:"GET", url:"/events/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/dateSelection"})
      }
   """
)
                                                        
 
// @LINE:13
def eventlist = JavascriptReverseRoute(
   "controllers.Application.eventlist",
   """
      function() {
      return _wA({method:"GET", url:"/eventlist"})
      }
   """
)
                                                        
 
// @LINE:33
def deleteParticipant = JavascriptReverseRoute(
   "controllers.Application.deleteParticipant",
   """
      function(id) {
      return _wA({method:"POST", url:"/eventsEdit/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/delParticip"})
      }
   """
)
                                                        

                      
    
}
                            
}
                    


// @LINE:33
// @LINE:32
// @LINE:30
// @LINE:28
// @LINE:27
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:9
// @LINE:6
package controllers.ref {

// @LINE:6
class ReverseAssets {
    


 
// @LINE:6
def at(path:String, file:String) = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]))
)
                              

                      
    
}
                            

// @LINE:33
// @LINE:32
// @LINE:30
// @LINE:28
// @LINE:27
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:9
class ReverseApplication {
    


 
// @LINE:23
def newHoraire(id:Long) = new play.api.mvc.HandlerRef(
   controllers.Application.newHoraire(id), HandlerDef(this, "controllers.Application", "newHoraire", Seq(classOf[Long]))
)
                              
 
// @LINE:24
def deleteHoraire(id:Long) = new play.api.mvc.HandlerRef(
   controllers.Application.deleteHoraire(id), HandlerDef(this, "controllers.Application", "deleteHoraire", Seq(classOf[Long]))
)
                              
 
// @LINE:18
def addDate(id:Long) = new play.api.mvc.HandlerRef(
   controllers.Application.addDate(id), HandlerDef(this, "controllers.Application", "addDate", Seq(classOf[Long]))
)
                              
 
// @LINE:30
def updatePersonne(id:Long) = new play.api.mvc.HandlerRef(
   controllers.Application.updatePersonne(id), HandlerDef(this, "controllers.Application", "updatePersonne", Seq(classOf[Long]))
)
                              
 
// @LINE:14
def newEvent() = new play.api.mvc.HandlerRef(
   controllers.Application.newEvent(), HandlerDef(this, "controllers.Application", "newEvent", Seq())
)
                              
 
// @LINE:12
def events() = new play.api.mvc.HandlerRef(
   controllers.Application.events(), HandlerDef(this, "controllers.Application", "events", Seq())
)
                              
 
// @LINE:22
def heureSelection(id:Long) = new play.api.mvc.HandlerRef(
   controllers.Application.heureSelection(id), HandlerDef(this, "controllers.Application", "heureSelection", Seq(classOf[Long]))
)
                              
 
// @LINE:15
def deleteEvent(id:Long) = new play.api.mvc.HandlerRef(
   controllers.Application.deleteEvent(id), HandlerDef(this, "controllers.Application", "deleteEvent", Seq(classOf[Long]))
)
                              
 
// @LINE:20
def dateChanged(id:Long) = new play.api.mvc.HandlerRef(
   controllers.Application.dateChanged(id), HandlerDef(this, "controllers.Application", "dateChanged", Seq(classOf[Long]))
)
                              
 
// @LINE:28
def update(id:Long) = new play.api.mvc.HandlerRef(
   controllers.Application.update(id), HandlerDef(this, "controllers.Application", "update", Seq(classOf[Long]))
)
                              
 
// @LINE:32
def addParticipant(id:Long) = new play.api.mvc.HandlerRef(
   controllers.Application.addParticipant(id), HandlerDef(this, "controllers.Application", "addParticipant", Seq(classOf[Long]))
)
                              
 
// @LINE:9
def index() = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Seq())
)
                              
 
// @LINE:19
def removeDate(id:Long) = new play.api.mvc.HandlerRef(
   controllers.Application.removeDate(id), HandlerDef(this, "controllers.Application", "removeDate", Seq(classOf[Long]))
)
                              
 
// @LINE:27
def edit(id:Long) = new play.api.mvc.HandlerRef(
   controllers.Application.edit(id), HandlerDef(this, "controllers.Application", "edit", Seq(classOf[Long]))
)
                              
 
// @LINE:17
def dateSelection(id:Long) = new play.api.mvc.HandlerRef(
   controllers.Application.dateSelection(id), HandlerDef(this, "controllers.Application", "dateSelection", Seq(classOf[Long]))
)
                              
 
// @LINE:13
def eventlist() = new play.api.mvc.HandlerRef(
   controllers.Application.eventlist(), HandlerDef(this, "controllers.Application", "eventlist", Seq())
)
                              
 
// @LINE:33
def deleteParticipant(id:Long) = new play.api.mvc.HandlerRef(
   controllers.Application.deleteParticipant(id), HandlerDef(this, "controllers.Application", "deleteParticipant", Seq(classOf[Long]))
)
                              

                      
    
}
                            
}
                    
                