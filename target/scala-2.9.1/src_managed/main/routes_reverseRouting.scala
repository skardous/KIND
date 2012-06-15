// @SOURCE:C:/tutoPlay/KIND/conf/routes
// @HASH:39e0689e7d1650f953e32a8f1b4e21ebf83f6567
// @DATE:Tue Jun 12 14:45:23 CEST 2012

import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString


// @LINE:39
// @LINE:37
// @LINE:36
// @LINE:34
// @LINE:33
// @LINE:31
// @LINE:29
// @LINE:28
// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:16
// @LINE:15
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
                            

// @LINE:39
// @LINE:37
// @LINE:36
// @LINE:34
// @LINE:33
// @LINE:31
// @LINE:29
// @LINE:28
// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:16
// @LINE:15
// @LINE:13
// @LINE:12
// @LINE:9
class ReverseApplication {
    


 
// @LINE:24
def newHoraire(id:Long) = {
   Call("POST", "/events/" + implicitly[PathBindable[Long]].unbind("id", id) + "/newHoraire")
}
                                                        
 
// @LINE:39
def sendMail(id:Long) = {
   Call("POST", "/eventsEdit/" + implicitly[PathBindable[Long]].unbind("id", id) + "/sendmail")
}
                                                        
 
// @LINE:25
def deleteHoraire(id:Long) = {
   Call("POST", "/events/" + implicitly[PathBindable[Long]].unbind("id", id) + "/deleteHoraire")
}
                                                        
 
// @LINE:19
def addDate(id:Long) = {
   Call("POST", "/events/" + implicitly[PathBindable[Long]].unbind("id", id) + "/addDate")
}
                                                        
 
// @LINE:31
def updatePersonne(id:Long) = {
   Call("POST", "/eventsEdit/" + implicitly[PathBindable[Long]].unbind("id", id) + "/updatePersonne")
}
                                                        
 
// @LINE:15
def newEvent() = {
   Call("POST", "/events")
}
                                                        
 
// @LINE:12
def events() = {
   Call("GET", "/events")
}
                                                        
 
// @LINE:23
def heureSelection(id:Long) = {
   Call("GET", "/events/" + implicitly[PathBindable[Long]].unbind("id", id) + "/heureSelection")
}
                                                        
 
// @LINE:16
def deleteEvent(id:Long) = {
   Call("GET", "/events/" + implicitly[PathBindable[Long]].unbind("id", id) + "/delete")
}
                                                        
 
// @LINE:21
def dateChanged(id:Long) = {
   Call("POST", "/events/" + implicitly[PathBindable[Long]].unbind("id", id) + "/datechanged")
}
                                                        
 
// @LINE:37
def checkBoxJour(id:Long) = {
   Call("POST", "/eventsEdit/" + implicitly[PathBindable[Long]].unbind("id", id) + "/checkBoxJour")
}
                                                        
 
// @LINE:29
def update(id:Long) = {
   Call("POST", "/eventsEdit/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                        
 
// @LINE:36
def checkBoxHoraire(id:Long) = {
   Call("POST", "/eventsEdit/" + implicitly[PathBindable[Long]].unbind("id", id) + "/checkBoxHoraire")
}
                                                        
 
// @LINE:33
def addParticipant(id:Long) = {
   Call("POST", "/eventsEdit/" + implicitly[PathBindable[Long]].unbind("id", id) + "/addParticip")
}
                                                        
 
// @LINE:9
def index() = {
   Call("GET", "/")
}
                                                        
 
// @LINE:20
def removeDate(id:Long) = {
   Call("POST", "/events/" + implicitly[PathBindable[Long]].unbind("id", id) + "/removeDate")
}
                                                        
 
// @LINE:28
def edit(id:Long) = {
   Call("GET", "/eventsEdit/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                        
 
// @LINE:18
def dateSelection(id:Long) = {
   Call("GET", "/events/" + implicitly[PathBindable[Long]].unbind("id", id) + "/dateSelection")
}
                                                        
 
// @LINE:13
def eventlist() = {
   Call("GET", "/eventlist")
}
                                                        
 
// @LINE:34
def deleteParticipant(id:Long) = {
   Call("POST", "/eventsEdit/" + implicitly[PathBindable[Long]].unbind("id", id) + "/delParticip")
}
                                                        

                      
    
}
                            
}
                    


// @LINE:39
// @LINE:37
// @LINE:36
// @LINE:34
// @LINE:33
// @LINE:31
// @LINE:29
// @LINE:28
// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:16
// @LINE:15
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
                            

// @LINE:39
// @LINE:37
// @LINE:36
// @LINE:34
// @LINE:33
// @LINE:31
// @LINE:29
// @LINE:28
// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:16
// @LINE:15
// @LINE:13
// @LINE:12
// @LINE:9
class ReverseApplication {
    


 
// @LINE:24
def newHoraire = JavascriptReverseRoute(
   "controllers.Application.newHoraire",
   """
      function(id) {
      return _wA({method:"POST", url:"/events/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/newHoraire"})
      }
   """
)
                                                        
 
// @LINE:39
def sendMail = JavascriptReverseRoute(
   "controllers.Application.sendMail",
   """
      function(id) {
      return _wA({method:"POST", url:"/eventsEdit/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/sendmail"})
      }
   """
)
                                                        
 
// @LINE:25
def deleteHoraire = JavascriptReverseRoute(
   "controllers.Application.deleteHoraire",
   """
      function(id) {
      return _wA({method:"POST", url:"/events/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/deleteHoraire"})
      }
   """
)
                                                        
 
// @LINE:19
def addDate = JavascriptReverseRoute(
   "controllers.Application.addDate",
   """
      function(id) {
      return _wA({method:"POST", url:"/events/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/addDate"})
      }
   """
)
                                                        
 
// @LINE:31
def updatePersonne = JavascriptReverseRoute(
   "controllers.Application.updatePersonne",
   """
      function(id) {
      return _wA({method:"POST", url:"/eventsEdit/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/updatePersonne"})
      }
   """
)
                                                        
 
// @LINE:15
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
                                                        
 
// @LINE:23
def heureSelection = JavascriptReverseRoute(
   "controllers.Application.heureSelection",
   """
      function(id) {
      return _wA({method:"GET", url:"/events/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/heureSelection"})
      }
   """
)
                                                        
 
// @LINE:16
def deleteEvent = JavascriptReverseRoute(
   "controllers.Application.deleteEvent",
   """
      function(id) {
      return _wA({method:"GET", url:"/events/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/delete"})
      }
   """
)
                                                        
 
// @LINE:21
def dateChanged = JavascriptReverseRoute(
   "controllers.Application.dateChanged",
   """
      function(id) {
      return _wA({method:"POST", url:"/events/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/datechanged"})
      }
   """
)
                                                        
 
// @LINE:37
def checkBoxJour = JavascriptReverseRoute(
   "controllers.Application.checkBoxJour",
   """
      function(id) {
      return _wA({method:"POST", url:"/eventsEdit/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/checkBoxJour"})
      }
   """
)
                                                        
 
// @LINE:29
def update = JavascriptReverseRoute(
   "controllers.Application.update",
   """
      function(id) {
      return _wA({method:"POST", url:"/eventsEdit/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                                                        
 
// @LINE:36
def checkBoxHoraire = JavascriptReverseRoute(
   "controllers.Application.checkBoxHoraire",
   """
      function(id) {
      return _wA({method:"POST", url:"/eventsEdit/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/checkBoxHoraire"})
      }
   """
)
                                                        
 
// @LINE:33
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
                                                        
 
// @LINE:20
def removeDate = JavascriptReverseRoute(
   "controllers.Application.removeDate",
   """
      function(id) {
      return _wA({method:"POST", url:"/events/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/removeDate"})
      }
   """
)
                                                        
 
// @LINE:28
def edit = JavascriptReverseRoute(
   "controllers.Application.edit",
   """
      function(id) {
      return _wA({method:"GET", url:"/eventsEdit/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                                                        
 
// @LINE:18
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
                                                        
 
// @LINE:34
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
                    


// @LINE:39
// @LINE:37
// @LINE:36
// @LINE:34
// @LINE:33
// @LINE:31
// @LINE:29
// @LINE:28
// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:16
// @LINE:15
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
                            

// @LINE:39
// @LINE:37
// @LINE:36
// @LINE:34
// @LINE:33
// @LINE:31
// @LINE:29
// @LINE:28
// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:16
// @LINE:15
// @LINE:13
// @LINE:12
// @LINE:9
class ReverseApplication {
    


 
// @LINE:24
def newHoraire(id:Long) = new play.api.mvc.HandlerRef(
   controllers.Application.newHoraire(id), HandlerDef(this, "controllers.Application", "newHoraire", Seq(classOf[Long]))
)
                              
 
// @LINE:39
def sendMail(id:Long) = new play.api.mvc.HandlerRef(
   controllers.Application.sendMail(id), HandlerDef(this, "controllers.Application", "sendMail", Seq(classOf[Long]))
)
                              
 
// @LINE:25
def deleteHoraire(id:Long) = new play.api.mvc.HandlerRef(
   controllers.Application.deleteHoraire(id), HandlerDef(this, "controllers.Application", "deleteHoraire", Seq(classOf[Long]))
)
                              
 
// @LINE:19
def addDate(id:Long) = new play.api.mvc.HandlerRef(
   controllers.Application.addDate(id), HandlerDef(this, "controllers.Application", "addDate", Seq(classOf[Long]))
)
                              
 
// @LINE:31
def updatePersonne(id:Long) = new play.api.mvc.HandlerRef(
   controllers.Application.updatePersonne(id), HandlerDef(this, "controllers.Application", "updatePersonne", Seq(classOf[Long]))
)
                              
 
// @LINE:15
def newEvent() = new play.api.mvc.HandlerRef(
   controllers.Application.newEvent(), HandlerDef(this, "controllers.Application", "newEvent", Seq())
)
                              
 
// @LINE:12
def events() = new play.api.mvc.HandlerRef(
   controllers.Application.events(), HandlerDef(this, "controllers.Application", "events", Seq())
)
                              
 
// @LINE:23
def heureSelection(id:Long) = new play.api.mvc.HandlerRef(
   controllers.Application.heureSelection(id), HandlerDef(this, "controllers.Application", "heureSelection", Seq(classOf[Long]))
)
                              
 
// @LINE:16
def deleteEvent(id:Long) = new play.api.mvc.HandlerRef(
   controllers.Application.deleteEvent(id), HandlerDef(this, "controllers.Application", "deleteEvent", Seq(classOf[Long]))
)
                              
 
// @LINE:21
def dateChanged(id:Long) = new play.api.mvc.HandlerRef(
   controllers.Application.dateChanged(id), HandlerDef(this, "controllers.Application", "dateChanged", Seq(classOf[Long]))
)
                              
 
// @LINE:37
def checkBoxJour(id:Long) = new play.api.mvc.HandlerRef(
   controllers.Application.checkBoxJour(id), HandlerDef(this, "controllers.Application", "checkBoxJour", Seq(classOf[Long]))
)
                              
 
// @LINE:29
def update(id:Long) = new play.api.mvc.HandlerRef(
   controllers.Application.update(id), HandlerDef(this, "controllers.Application", "update", Seq(classOf[Long]))
)
                              
 
// @LINE:36
def checkBoxHoraire(id:Long) = new play.api.mvc.HandlerRef(
   controllers.Application.checkBoxHoraire(id), HandlerDef(this, "controllers.Application", "checkBoxHoraire", Seq(classOf[Long]))
)
                              
 
// @LINE:33
def addParticipant(id:Long) = new play.api.mvc.HandlerRef(
   controllers.Application.addParticipant(id), HandlerDef(this, "controllers.Application", "addParticipant", Seq(classOf[Long]))
)
                              
 
// @LINE:9
def index() = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Seq())
)
                              
 
// @LINE:20
def removeDate(id:Long) = new play.api.mvc.HandlerRef(
   controllers.Application.removeDate(id), HandlerDef(this, "controllers.Application", "removeDate", Seq(classOf[Long]))
)
                              
 
// @LINE:28
def edit(id:Long) = new play.api.mvc.HandlerRef(
   controllers.Application.edit(id), HandlerDef(this, "controllers.Application", "edit", Seq(classOf[Long]))
)
                              
 
// @LINE:18
def dateSelection(id:Long) = new play.api.mvc.HandlerRef(
   controllers.Application.dateSelection(id), HandlerDef(this, "controllers.Application", "dateSelection", Seq(classOf[Long]))
)
                              
 
// @LINE:13
def eventlist() = new play.api.mvc.HandlerRef(
   controllers.Application.eventlist(), HandlerDef(this, "controllers.Application", "eventlist", Seq())
)
                              
 
// @LINE:34
def deleteParticipant(id:Long) = new play.api.mvc.HandlerRef(
   controllers.Application.deleteParticipant(id), HandlerDef(this, "controllers.Application", "deleteParticipant", Seq(classOf[Long]))
)
                              

                      
    
}
                            
}
                    
                