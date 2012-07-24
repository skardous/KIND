// @SOURCE:C:/tutoPlay/KIND/conf/routes
// @HASH:e6ac5da340912756cbd9e007b034d1a6aefef0eb
// @DATE:Mon Jul 23 12:46:54 CEST 2012

import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString


// @LINE:47
// @LINE:45
// @LINE:43
// @LINE:41
// @LINE:40
// @LINE:38
// @LINE:37
// @LINE:35
// @LINE:33
// @LINE:32
// @LINE:31
// @LINE:28
// @LINE:27
// @LINE:26
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:19
// @LINE:18
// @LINE:16
// @LINE:15
// @LINE:12
// @LINE:11
// @LINE:8
package controllers {

// @LINE:8
class ReverseAssets {
    


 
// @LINE:8
def at(file:String) = {
   Call("GET", "/assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                        

                      
    
}
                            

// @LINE:47
// @LINE:45
// @LINE:43
// @LINE:41
// @LINE:40
// @LINE:38
// @LINE:37
// @LINE:35
// @LINE:33
// @LINE:32
// @LINE:31
// @LINE:28
// @LINE:27
// @LINE:26
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:19
// @LINE:18
// @LINE:16
// @LINE:15
// @LINE:12
// @LINE:11
class ReverseApplication {
    


 
// @LINE:27
def newHoraire(id:Long) = {
   Call("POST", "/KIND/newevent/" + implicitly[PathBindable[Long]].unbind("id", id) + "/newHoraire")
}
                                                        
 
// @LINE:45
def sendMail(id:Long) = {
   Call("POST", "/KIND/eventEdit/" + implicitly[PathBindable[Long]].unbind("id", id) + "/sendmail")
}
                                                        
 
// @LINE:28
def deleteHoraire(id:Long) = {
   Call("POST", "/KIND/newevent/" + implicitly[PathBindable[Long]].unbind("id", id) + "/deleteHoraire")
}
                                                        
 
// @LINE:47
def getPass() = {
   Call("POST", "/KIND/eventEdit/")
}
                                                        
 
// @LINE:22
def addDate(id:Long) = {
   Call("POST", "/KIND/newevent/" + implicitly[PathBindable[Long]].unbind("id", id) + "/addDate")
}
                                                        
 
// @LINE:35
def updatePersonne(id:Long) = {
   Call("POST", "/KIND/eventEdit/" + implicitly[PathBindable[Long]].unbind("id", id) + "/updatePersonne")
}
                                                        
 
// @LINE:18
def newEvent() = {
   Call("POST", "/KIND/newevent")
}
                                                        
 
// @LINE:15
def events() = {
   Call("GET", "/KIND/newevent")
}
                                                        
 
// @LINE:26
def heureSelection(id:Long) = {
   Call("GET", "/KIND/newevent/" + implicitly[PathBindable[Long]].unbind("id", id) + "/heureSelection")
}
                                                        
 
// @LINE:33
def editAdm(id:Long) = {
   Call("GET", "/KIND/eventEdit/" + implicitly[PathBindable[Long]].unbind("id", id) + "/adm")
}
                                                        
 
// @LINE:19
def deleteEvent(id:Long) = {
   Call("GET", "/KIND/newevent/" + implicitly[PathBindable[Long]].unbind("id", id) + "/delete")
}
                                                        
 
// @LINE:24
def dateChanged(id:Long) = {
   Call("POST", "/KIND/newevent/" + implicitly[PathBindable[Long]].unbind("id", id) + "/datechanged")
}
                                                        
 
// @LINE:41
def checkBoxJour(id:Long) = {
   Call("POST", "/KIND/eventEdit/" + implicitly[PathBindable[Long]].unbind("id", id) + "/checkBoxJour")
}
                                                        
 
// @LINE:32
def update(id:Long) = {
   Call("POST", "/KIND/eventEdit/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                        
 
// @LINE:40
def checkBoxHoraire(id:Long) = {
   Call("POST", "/KIND/eventEdit/" + implicitly[PathBindable[Long]].unbind("id", id) + "/checkBoxHoraire")
}
                                                        
 
// @LINE:37
def addParticipant(id:Long) = {
   Call("POST", "/KIND/eventEdit/" + implicitly[PathBindable[Long]].unbind("id", id) + "/addParticip")
}
                                                        
 
// @LINE:12
// @LINE:11
def index() = {
   () match {
// @LINE:11
case () if true => Call("GET", "/KIND/")
                                                                
// @LINE:12
case () if true => Call("GET", "/KIND")
                                                                    
   }
}
                                                        
 
// @LINE:23
def removeDate(id:Long) = {
   Call("POST", "/KIND/newevent/" + implicitly[PathBindable[Long]].unbind("id", id) + "/removeDate")
}
                                                        
 
// @LINE:31
def edit(id:Long) = {
   Call("GET", "/KIND/eventEdit/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                        
 
// @LINE:21
def dateSelection(id:Long) = {
   Call("GET", "/KIND/newevent/" + implicitly[PathBindable[Long]].unbind("id", id) + "/dateSelection")
}
                                                        
 
// @LINE:43
def changeObligatoire(id:Long) = {
   Call("POST", "/KIND/eventEdit/" + implicitly[PathBindable[Long]].unbind("id", id) + "/changeObligatoire")
}
                                                        
 
// @LINE:16
def eventlist() = {
   Call("GET", "/KIND/eventlist")
}
                                                        
 
// @LINE:38
def deleteParticipant(id:Long) = {
   Call("POST", "/KIND/eventEdit/" + implicitly[PathBindable[Long]].unbind("id", id) + "/delParticip")
}
                                                        

                      
    
}
                            
}
                    


// @LINE:47
// @LINE:45
// @LINE:43
// @LINE:41
// @LINE:40
// @LINE:38
// @LINE:37
// @LINE:35
// @LINE:33
// @LINE:32
// @LINE:31
// @LINE:28
// @LINE:27
// @LINE:26
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:19
// @LINE:18
// @LINE:16
// @LINE:15
// @LINE:12
// @LINE:11
// @LINE:8
package controllers.javascript {

// @LINE:8
class ReverseAssets {
    


 
// @LINE:8
def at = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"/assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                                                        

                      
    
}
                            

// @LINE:47
// @LINE:45
// @LINE:43
// @LINE:41
// @LINE:40
// @LINE:38
// @LINE:37
// @LINE:35
// @LINE:33
// @LINE:32
// @LINE:31
// @LINE:28
// @LINE:27
// @LINE:26
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:19
// @LINE:18
// @LINE:16
// @LINE:15
// @LINE:12
// @LINE:11
class ReverseApplication {
    


 
// @LINE:27
def newHoraire = JavascriptReverseRoute(
   "controllers.Application.newHoraire",
   """
      function(id) {
      return _wA({method:"POST", url:"/KIND/newevent/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/newHoraire"})
      }
   """
)
                                                        
 
// @LINE:45
def sendMail = JavascriptReverseRoute(
   "controllers.Application.sendMail",
   """
      function(id) {
      return _wA({method:"POST", url:"/KIND/eventEdit/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/sendmail"})
      }
   """
)
                                                        
 
// @LINE:28
def deleteHoraire = JavascriptReverseRoute(
   "controllers.Application.deleteHoraire",
   """
      function(id) {
      return _wA({method:"POST", url:"/KIND/newevent/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/deleteHoraire"})
      }
   """
)
                                                        
 
// @LINE:47
def getPass = JavascriptReverseRoute(
   "controllers.Application.getPass",
   """
      function() {
      return _wA({method:"POST", url:"/KIND/eventEdit/"})
      }
   """
)
                                                        
 
// @LINE:22
def addDate = JavascriptReverseRoute(
   "controllers.Application.addDate",
   """
      function(id) {
      return _wA({method:"POST", url:"/KIND/newevent/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/addDate"})
      }
   """
)
                                                        
 
// @LINE:35
def updatePersonne = JavascriptReverseRoute(
   "controllers.Application.updatePersonne",
   """
      function(id) {
      return _wA({method:"POST", url:"/KIND/eventEdit/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/updatePersonne"})
      }
   """
)
                                                        
 
// @LINE:18
def newEvent = JavascriptReverseRoute(
   "controllers.Application.newEvent",
   """
      function() {
      return _wA({method:"POST", url:"/KIND/newevent"})
      }
   """
)
                                                        
 
// @LINE:15
def events = JavascriptReverseRoute(
   "controllers.Application.events",
   """
      function() {
      return _wA({method:"GET", url:"/KIND/newevent"})
      }
   """
)
                                                        
 
// @LINE:26
def heureSelection = JavascriptReverseRoute(
   "controllers.Application.heureSelection",
   """
      function(id) {
      return _wA({method:"GET", url:"/KIND/newevent/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/heureSelection"})
      }
   """
)
                                                        
 
// @LINE:33
def editAdm = JavascriptReverseRoute(
   "controllers.Application.editAdm",
   """
      function(id) {
      return _wA({method:"GET", url:"/KIND/eventEdit/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/adm"})
      }
   """
)
                                                        
 
// @LINE:19
def deleteEvent = JavascriptReverseRoute(
   "controllers.Application.deleteEvent",
   """
      function(id) {
      return _wA({method:"GET", url:"/KIND/newevent/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/delete"})
      }
   """
)
                                                        
 
// @LINE:24
def dateChanged = JavascriptReverseRoute(
   "controllers.Application.dateChanged",
   """
      function(id) {
      return _wA({method:"POST", url:"/KIND/newevent/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/datechanged"})
      }
   """
)
                                                        
 
// @LINE:41
def checkBoxJour = JavascriptReverseRoute(
   "controllers.Application.checkBoxJour",
   """
      function(id) {
      return _wA({method:"POST", url:"/KIND/eventEdit/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/checkBoxJour"})
      }
   """
)
                                                        
 
// @LINE:32
def update = JavascriptReverseRoute(
   "controllers.Application.update",
   """
      function(id) {
      return _wA({method:"POST", url:"/KIND/eventEdit/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                                                        
 
// @LINE:40
def checkBoxHoraire = JavascriptReverseRoute(
   "controllers.Application.checkBoxHoraire",
   """
      function(id) {
      return _wA({method:"POST", url:"/KIND/eventEdit/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/checkBoxHoraire"})
      }
   """
)
                                                        
 
// @LINE:37
def addParticipant = JavascriptReverseRoute(
   "controllers.Application.addParticipant",
   """
      function(id) {
      return _wA({method:"POST", url:"/KIND/eventEdit/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/addParticip"})
      }
   """
)
                                                        
 
// @LINE:12
// @LINE:11
def index = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      if (true) {
      return _wA({method:"GET", url:"/KIND/"})
      }
      if (true) {
      return _wA({method:"GET", url:"/KIND"})
      }
      }
   """
)
                                                        
 
// @LINE:23
def removeDate = JavascriptReverseRoute(
   "controllers.Application.removeDate",
   """
      function(id) {
      return _wA({method:"POST", url:"/KIND/newevent/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/removeDate"})
      }
   """
)
                                                        
 
// @LINE:31
def edit = JavascriptReverseRoute(
   "controllers.Application.edit",
   """
      function(id) {
      return _wA({method:"GET", url:"/KIND/eventEdit/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                                                        
 
// @LINE:21
def dateSelection = JavascriptReverseRoute(
   "controllers.Application.dateSelection",
   """
      function(id) {
      return _wA({method:"GET", url:"/KIND/newevent/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/dateSelection"})
      }
   """
)
                                                        
 
// @LINE:43
def changeObligatoire = JavascriptReverseRoute(
   "controllers.Application.changeObligatoire",
   """
      function(id) {
      return _wA({method:"POST", url:"/KIND/eventEdit/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/changeObligatoire"})
      }
   """
)
                                                        
 
// @LINE:16
def eventlist = JavascriptReverseRoute(
   "controllers.Application.eventlist",
   """
      function() {
      return _wA({method:"GET", url:"/KIND/eventlist"})
      }
   """
)
                                                        
 
// @LINE:38
def deleteParticipant = JavascriptReverseRoute(
   "controllers.Application.deleteParticipant",
   """
      function(id) {
      return _wA({method:"POST", url:"/KIND/eventEdit/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/delParticip"})
      }
   """
)
                                                        

                      
    
}
                            
}
                    


// @LINE:47
// @LINE:45
// @LINE:43
// @LINE:41
// @LINE:40
// @LINE:38
// @LINE:37
// @LINE:35
// @LINE:33
// @LINE:32
// @LINE:31
// @LINE:28
// @LINE:27
// @LINE:26
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:19
// @LINE:18
// @LINE:16
// @LINE:15
// @LINE:12
// @LINE:11
// @LINE:8
package controllers.ref {

// @LINE:8
class ReverseAssets {
    


 
// @LINE:8
def at(path:String, file:String) = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]))
)
                              

                      
    
}
                            

// @LINE:47
// @LINE:45
// @LINE:43
// @LINE:41
// @LINE:40
// @LINE:38
// @LINE:37
// @LINE:35
// @LINE:33
// @LINE:32
// @LINE:31
// @LINE:28
// @LINE:27
// @LINE:26
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:19
// @LINE:18
// @LINE:16
// @LINE:15
// @LINE:12
// @LINE:11
class ReverseApplication {
    


 
// @LINE:27
def newHoraire(id:Long) = new play.api.mvc.HandlerRef(
   controllers.Application.newHoraire(id), HandlerDef(this, "controllers.Application", "newHoraire", Seq(classOf[Long]))
)
                              
 
// @LINE:45
def sendMail(id:Long) = new play.api.mvc.HandlerRef(
   controllers.Application.sendMail(id), HandlerDef(this, "controllers.Application", "sendMail", Seq(classOf[Long]))
)
                              
 
// @LINE:28
def deleteHoraire(id:Long) = new play.api.mvc.HandlerRef(
   controllers.Application.deleteHoraire(id), HandlerDef(this, "controllers.Application", "deleteHoraire", Seq(classOf[Long]))
)
                              
 
// @LINE:47
def getPass() = new play.api.mvc.HandlerRef(
   controllers.Application.getPass(), HandlerDef(this, "controllers.Application", "getPass", Seq())
)
                              
 
// @LINE:22
def addDate(id:Long) = new play.api.mvc.HandlerRef(
   controllers.Application.addDate(id), HandlerDef(this, "controllers.Application", "addDate", Seq(classOf[Long]))
)
                              
 
// @LINE:35
def updatePersonne(id:Long) = new play.api.mvc.HandlerRef(
   controllers.Application.updatePersonne(id), HandlerDef(this, "controllers.Application", "updatePersonne", Seq(classOf[Long]))
)
                              
 
// @LINE:18
def newEvent() = new play.api.mvc.HandlerRef(
   controllers.Application.newEvent(), HandlerDef(this, "controllers.Application", "newEvent", Seq())
)
                              
 
// @LINE:15
def events() = new play.api.mvc.HandlerRef(
   controllers.Application.events(), HandlerDef(this, "controllers.Application", "events", Seq())
)
                              
 
// @LINE:26
def heureSelection(id:Long) = new play.api.mvc.HandlerRef(
   controllers.Application.heureSelection(id), HandlerDef(this, "controllers.Application", "heureSelection", Seq(classOf[Long]))
)
                              
 
// @LINE:33
def editAdm(id:Long) = new play.api.mvc.HandlerRef(
   controllers.Application.editAdm(id), HandlerDef(this, "controllers.Application", "editAdm", Seq(classOf[Long]))
)
                              
 
// @LINE:19
def deleteEvent(id:Long) = new play.api.mvc.HandlerRef(
   controllers.Application.deleteEvent(id), HandlerDef(this, "controllers.Application", "deleteEvent", Seq(classOf[Long]))
)
                              
 
// @LINE:24
def dateChanged(id:Long) = new play.api.mvc.HandlerRef(
   controllers.Application.dateChanged(id), HandlerDef(this, "controllers.Application", "dateChanged", Seq(classOf[Long]))
)
                              
 
// @LINE:41
def checkBoxJour(id:Long) = new play.api.mvc.HandlerRef(
   controllers.Application.checkBoxJour(id), HandlerDef(this, "controllers.Application", "checkBoxJour", Seq(classOf[Long]))
)
                              
 
// @LINE:32
def update(id:Long) = new play.api.mvc.HandlerRef(
   controllers.Application.update(id), HandlerDef(this, "controllers.Application", "update", Seq(classOf[Long]))
)
                              
 
// @LINE:40
def checkBoxHoraire(id:Long) = new play.api.mvc.HandlerRef(
   controllers.Application.checkBoxHoraire(id), HandlerDef(this, "controllers.Application", "checkBoxHoraire", Seq(classOf[Long]))
)
                              
 
// @LINE:37
def addParticipant(id:Long) = new play.api.mvc.HandlerRef(
   controllers.Application.addParticipant(id), HandlerDef(this, "controllers.Application", "addParticipant", Seq(classOf[Long]))
)
                              
 
// @LINE:11
def index() = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Seq())
)
                              
 
// @LINE:23
def removeDate(id:Long) = new play.api.mvc.HandlerRef(
   controllers.Application.removeDate(id), HandlerDef(this, "controllers.Application", "removeDate", Seq(classOf[Long]))
)
                              
 
// @LINE:31
def edit(id:Long) = new play.api.mvc.HandlerRef(
   controllers.Application.edit(id), HandlerDef(this, "controllers.Application", "edit", Seq(classOf[Long]))
)
                              
 
// @LINE:21
def dateSelection(id:Long) = new play.api.mvc.HandlerRef(
   controllers.Application.dateSelection(id), HandlerDef(this, "controllers.Application", "dateSelection", Seq(classOf[Long]))
)
                              
 
// @LINE:43
def changeObligatoire(id:Long) = new play.api.mvc.HandlerRef(
   controllers.Application.changeObligatoire(id), HandlerDef(this, "controllers.Application", "changeObligatoire", Seq(classOf[Long]))
)
                              
 
// @LINE:16
def eventlist() = new play.api.mvc.HandlerRef(
   controllers.Application.eventlist(), HandlerDef(this, "controllers.Application", "eventlist", Seq())
)
                              
 
// @LINE:38
def deleteParticipant(id:Long) = new play.api.mvc.HandlerRef(
   controllers.Application.deleteParticipant(id), HandlerDef(this, "controllers.Application", "deleteParticipant", Seq(classOf[Long]))
)
                              

                      
    
}
                            
}
                    
                