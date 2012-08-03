// @SOURCE:C:/tutoPlay/KIND/conf/routes
// @HASH:4e51e919035f067dd0c6d0157860bd2f40af89f9
// @DATE:Thu Aug 02 15:17:09 CEST 2012

import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString


// @LINE:58
// @LINE:56
// @LINE:55
// @LINE:53
// @LINE:51
// @LINE:50
// @LINE:48
// @LINE:47
// @LINE:45
// @LINE:41
// @LINE:40
// @LINE:39
// @LINE:36
// @LINE:35
// @LINE:32
// @LINE:31
// @LINE:30
// @LINE:27
// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
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
                            

// @LINE:58
// @LINE:56
// @LINE:55
// @LINE:53
// @LINE:51
// @LINE:50
// @LINE:48
// @LINE:47
// @LINE:45
// @LINE:41
// @LINE:40
// @LINE:39
// @LINE:36
// @LINE:35
// @LINE:32
// @LINE:31
// @LINE:30
// @LINE:27
// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:12
// @LINE:11
class ReverseApplication {
    


 
// @LINE:35
def newHoraire(id:Long) = {
   Call("POST", "/KIND/newevent/" + implicitly[PathBindable[Long]].unbind("id", id) + "/newHoraire")
}
                                                        
 
// @LINE:23
def eventCreateEmpty() = {
   Call("GET", "/KIND/eventCreate")
}
                                                        
 
// @LINE:16
def updateEvent(id:Long) = {
   Call("POST", "/KIND/eventCreate/" + implicitly[PathBindable[Long]].unbind("id", id) + "/update")
}
                                                        
 
// @LINE:20
def resume(id:Long) = {
   Call("GET", "/KIND/newevent/" + implicitly[PathBindable[Long]].unbind("id", id) + "/resume")
}
                                                        
 
// @LINE:55
def sendMail(id:Long) = {
   Call("POST", "/KIND/eventEdit/" + implicitly[PathBindable[Long]].unbind("id", id) + "/sendmail")
}
                                                        
 
// @LINE:36
def deleteHoraire(id:Long) = {
   Call("POST", "/KIND/newevent/" + implicitly[PathBindable[Long]].unbind("id", id) + "/deleteHoraire")
}
                                                        
 
// @LINE:58
def getPass() = {
   Call("POST", "/KIND/eventEdit/")
}
                                                        
 
// @LINE:30
def addDate(id:Long) = {
   Call("POST", "/KIND/newevent/" + implicitly[PathBindable[Long]].unbind("id", id) + "/addDate")
}
                                                        
 
// @LINE:47
def addParticipant(idhash:String) = {
   Call("POST", "/KIND/eventEdit/" + implicitly[PathBindable[String]].unbind("idhash", idhash) + "/addParticip")
}
                                                        
 
// @LINE:45
def updatePersonne(id:Long) = {
   Call("POST", "/KIND/eventEdit/" + implicitly[PathBindable[Long]].unbind("id", id) + "/updatePersonne")
}
                                                        
 
// @LINE:15
def newEvent() = {
   Call("POST", "/KIND/newevent")
}
                                                        
 
// @LINE:18
def heureSelection(id:Long) = {
   Call("GET", "/KIND/newevent/" + implicitly[PathBindable[Long]].unbind("id", id) + "/heureSelection")
}
                                                        
 
// @LINE:39
def edit(idhash:String) = {
   Call("GET", "/KIND/eventEdit/" + implicitly[PathBindable[String]].unbind("idhash", idhash) + "/consult")
}
                                                        
 
// @LINE:27
def deleteEvent(id:Long) = {
   Call("GET", "/KIND/newevent/" + implicitly[PathBindable[Long]].unbind("id", id) + "/delete")
}
                                                        
 
// @LINE:41
def editAdm(idhash:String, mailhash:String) = {
   Call("GET", "/KIND/eventEdit/" + implicitly[PathBindable[String]].unbind("idhash", idhash) + "/consult/" + implicitly[PathBindable[String]].unbind("mailhash", mailhash) + "/adm")
}
                                                        
 
// @LINE:32
def dateChanged(id:Long) = {
   Call("POST", "/KIND/newevent/" + implicitly[PathBindable[Long]].unbind("id", id) + "/datechanged")
}
                                                        
 
// @LINE:51
def checkBoxJour(id:Long) = {
   Call("POST", "/KIND/eventEdit/" + implicitly[PathBindable[Long]].unbind("id", id) + "/checkBoxJour")
}
                                                        
 
// @LINE:40
def update(id:Long) = {
   Call("POST", "/KIND/eventEdit/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                        
 
// @LINE:19
def invitation(id:Long) = {
   Call("GET", "/KIND/newevent/" + implicitly[PathBindable[Long]].unbind("id", id) + "/invitation")
}
                                                        
 
// @LINE:50
def checkBoxHoraire(id:Long) = {
   Call("POST", "/KIND/eventEdit/" + implicitly[PathBindable[Long]].unbind("id", id) + "/checkBoxHoraire")
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
                                                        
 
// @LINE:31
def removeDate(id:Long) = {
   Call("POST", "/KIND/newevent/" + implicitly[PathBindable[Long]].unbind("id", id) + "/removeDate")
}
                                                        
 
// @LINE:17
def dateSelection(id:Long) = {
   Call("GET", "/KIND/newevent/" + implicitly[PathBindable[Long]].unbind("id", id) + "/dateSelection")
}
                                                        
 
// @LINE:53
def changeObligatoire(id:Long) = {
   Call("POST", "/KIND/eventEdit/" + implicitly[PathBindable[Long]].unbind("id", id) + "/changeObligatoire")
}
                                                        
 
// @LINE:56
def addMail(id:Long) = {
   Call("POST", "/KIND/eventEdit/" + implicitly[PathBindable[Long]].unbind("id", id) + "/addMail")
}
                                                        
 
// @LINE:24
def eventCreateFilled(id:Long) = {
   Call("GET", "/KIND/eventCreate/" + implicitly[PathBindable[Long]].unbind("id", id) + "/filled")
}
                                                        
 
// @LINE:25
def eventlist() = {
   Call("GET", "/KIND/eventlist")
}
                                                        
 
// @LINE:48
def deleteParticipant(id:Long) = {
   Call("POST", "/KIND/eventEdit/" + implicitly[PathBindable[Long]].unbind("id", id) + "/delParticip")
}
                                                        

                      
    
}
                            
}
                    


// @LINE:58
// @LINE:56
// @LINE:55
// @LINE:53
// @LINE:51
// @LINE:50
// @LINE:48
// @LINE:47
// @LINE:45
// @LINE:41
// @LINE:40
// @LINE:39
// @LINE:36
// @LINE:35
// @LINE:32
// @LINE:31
// @LINE:30
// @LINE:27
// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
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
                            

// @LINE:58
// @LINE:56
// @LINE:55
// @LINE:53
// @LINE:51
// @LINE:50
// @LINE:48
// @LINE:47
// @LINE:45
// @LINE:41
// @LINE:40
// @LINE:39
// @LINE:36
// @LINE:35
// @LINE:32
// @LINE:31
// @LINE:30
// @LINE:27
// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:12
// @LINE:11
class ReverseApplication {
    


 
// @LINE:35
def newHoraire = JavascriptReverseRoute(
   "controllers.Application.newHoraire",
   """
      function(id) {
      return _wA({method:"POST", url:"/KIND/newevent/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/newHoraire"})
      }
   """
)
                                                        
 
// @LINE:23
def eventCreateEmpty = JavascriptReverseRoute(
   "controllers.Application.eventCreateEmpty",
   """
      function() {
      return _wA({method:"GET", url:"/KIND/eventCreate"})
      }
   """
)
                                                        
 
// @LINE:16
def updateEvent = JavascriptReverseRoute(
   "controllers.Application.updateEvent",
   """
      function(id) {
      return _wA({method:"POST", url:"/KIND/eventCreate/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/update"})
      }
   """
)
                                                        
 
// @LINE:20
def resume = JavascriptReverseRoute(
   "controllers.Application.resume",
   """
      function(id) {
      return _wA({method:"GET", url:"/KIND/newevent/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/resume"})
      }
   """
)
                                                        
 
// @LINE:55
def sendMail = JavascriptReverseRoute(
   "controllers.Application.sendMail",
   """
      function(id) {
      return _wA({method:"POST", url:"/KIND/eventEdit/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/sendmail"})
      }
   """
)
                                                        
 
// @LINE:36
def deleteHoraire = JavascriptReverseRoute(
   "controllers.Application.deleteHoraire",
   """
      function(id) {
      return _wA({method:"POST", url:"/KIND/newevent/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/deleteHoraire"})
      }
   """
)
                                                        
 
// @LINE:58
def getPass = JavascriptReverseRoute(
   "controllers.Application.getPass",
   """
      function() {
      return _wA({method:"POST", url:"/KIND/eventEdit/"})
      }
   """
)
                                                        
 
// @LINE:30
def addDate = JavascriptReverseRoute(
   "controllers.Application.addDate",
   """
      function(id) {
      return _wA({method:"POST", url:"/KIND/newevent/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/addDate"})
      }
   """
)
                                                        
 
// @LINE:47
def addParticipant = JavascriptReverseRoute(
   "controllers.Application.addParticipant",
   """
      function(idhash) {
      return _wA({method:"POST", url:"/KIND/eventEdit/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("idhash", idhash) + "/addParticip"})
      }
   """
)
                                                        
 
// @LINE:45
def updatePersonne = JavascriptReverseRoute(
   "controllers.Application.updatePersonne",
   """
      function(id) {
      return _wA({method:"POST", url:"/KIND/eventEdit/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/updatePersonne"})
      }
   """
)
                                                        
 
// @LINE:15
def newEvent = JavascriptReverseRoute(
   "controllers.Application.newEvent",
   """
      function() {
      return _wA({method:"POST", url:"/KIND/newevent"})
      }
   """
)
                                                        
 
// @LINE:18
def heureSelection = JavascriptReverseRoute(
   "controllers.Application.heureSelection",
   """
      function(id) {
      return _wA({method:"GET", url:"/KIND/newevent/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/heureSelection"})
      }
   """
)
                                                        
 
// @LINE:39
def edit = JavascriptReverseRoute(
   "controllers.Application.edit",
   """
      function(idhash) {
      return _wA({method:"GET", url:"/KIND/eventEdit/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("idhash", idhash) + "/consult"})
      }
   """
)
                                                        
 
// @LINE:27
def deleteEvent = JavascriptReverseRoute(
   "controllers.Application.deleteEvent",
   """
      function(id) {
      return _wA({method:"GET", url:"/KIND/newevent/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/delete"})
      }
   """
)
                                                        
 
// @LINE:41
def editAdm = JavascriptReverseRoute(
   "controllers.Application.editAdm",
   """
      function(idhash,mailhash) {
      return _wA({method:"GET", url:"/KIND/eventEdit/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("idhash", idhash) + "/consult/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("mailhash", mailhash) + "/adm"})
      }
   """
)
                                                        
 
// @LINE:32
def dateChanged = JavascriptReverseRoute(
   "controllers.Application.dateChanged",
   """
      function(id) {
      return _wA({method:"POST", url:"/KIND/newevent/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/datechanged"})
      }
   """
)
                                                        
 
// @LINE:51
def checkBoxJour = JavascriptReverseRoute(
   "controllers.Application.checkBoxJour",
   """
      function(id) {
      return _wA({method:"POST", url:"/KIND/eventEdit/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/checkBoxJour"})
      }
   """
)
                                                        
 
// @LINE:40
def update = JavascriptReverseRoute(
   "controllers.Application.update",
   """
      function(id) {
      return _wA({method:"POST", url:"/KIND/eventEdit/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                                                        
 
// @LINE:19
def invitation = JavascriptReverseRoute(
   "controllers.Application.invitation",
   """
      function(id) {
      return _wA({method:"GET", url:"/KIND/newevent/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/invitation"})
      }
   """
)
                                                        
 
// @LINE:50
def checkBoxHoraire = JavascriptReverseRoute(
   "controllers.Application.checkBoxHoraire",
   """
      function(id) {
      return _wA({method:"POST", url:"/KIND/eventEdit/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/checkBoxHoraire"})
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
                                                        
 
// @LINE:31
def removeDate = JavascriptReverseRoute(
   "controllers.Application.removeDate",
   """
      function(id) {
      return _wA({method:"POST", url:"/KIND/newevent/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/removeDate"})
      }
   """
)
                                                        
 
// @LINE:17
def dateSelection = JavascriptReverseRoute(
   "controllers.Application.dateSelection",
   """
      function(id) {
      return _wA({method:"GET", url:"/KIND/newevent/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/dateSelection"})
      }
   """
)
                                                        
 
// @LINE:53
def changeObligatoire = JavascriptReverseRoute(
   "controllers.Application.changeObligatoire",
   """
      function(id) {
      return _wA({method:"POST", url:"/KIND/eventEdit/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/changeObligatoire"})
      }
   """
)
                                                        
 
// @LINE:56
def addMail = JavascriptReverseRoute(
   "controllers.Application.addMail",
   """
      function(id) {
      return _wA({method:"POST", url:"/KIND/eventEdit/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/addMail"})
      }
   """
)
                                                        
 
// @LINE:24
def eventCreateFilled = JavascriptReverseRoute(
   "controllers.Application.eventCreateFilled",
   """
      function(id) {
      return _wA({method:"GET", url:"/KIND/eventCreate/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/filled"})
      }
   """
)
                                                        
 
// @LINE:25
def eventlist = JavascriptReverseRoute(
   "controllers.Application.eventlist",
   """
      function() {
      return _wA({method:"GET", url:"/KIND/eventlist"})
      }
   """
)
                                                        
 
// @LINE:48
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
                    


// @LINE:58
// @LINE:56
// @LINE:55
// @LINE:53
// @LINE:51
// @LINE:50
// @LINE:48
// @LINE:47
// @LINE:45
// @LINE:41
// @LINE:40
// @LINE:39
// @LINE:36
// @LINE:35
// @LINE:32
// @LINE:31
// @LINE:30
// @LINE:27
// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
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
                            

// @LINE:58
// @LINE:56
// @LINE:55
// @LINE:53
// @LINE:51
// @LINE:50
// @LINE:48
// @LINE:47
// @LINE:45
// @LINE:41
// @LINE:40
// @LINE:39
// @LINE:36
// @LINE:35
// @LINE:32
// @LINE:31
// @LINE:30
// @LINE:27
// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:12
// @LINE:11
class ReverseApplication {
    


 
// @LINE:35
def newHoraire(id:Long) = new play.api.mvc.HandlerRef(
   controllers.Application.newHoraire(id), HandlerDef(this, "controllers.Application", "newHoraire", Seq(classOf[Long]))
)
                              
 
// @LINE:23
def eventCreateEmpty() = new play.api.mvc.HandlerRef(
   controllers.Application.eventCreateEmpty(), HandlerDef(this, "controllers.Application", "eventCreateEmpty", Seq())
)
                              
 
// @LINE:16
def updateEvent(id:Long) = new play.api.mvc.HandlerRef(
   controllers.Application.updateEvent(id), HandlerDef(this, "controllers.Application", "updateEvent", Seq(classOf[Long]))
)
                              
 
// @LINE:20
def resume(id:Long) = new play.api.mvc.HandlerRef(
   controllers.Application.resume(id), HandlerDef(this, "controllers.Application", "resume", Seq(classOf[Long]))
)
                              
 
// @LINE:55
def sendMail(id:Long) = new play.api.mvc.HandlerRef(
   controllers.Application.sendMail(id), HandlerDef(this, "controllers.Application", "sendMail", Seq(classOf[Long]))
)
                              
 
// @LINE:36
def deleteHoraire(id:Long) = new play.api.mvc.HandlerRef(
   controllers.Application.deleteHoraire(id), HandlerDef(this, "controllers.Application", "deleteHoraire", Seq(classOf[Long]))
)
                              
 
// @LINE:58
def getPass() = new play.api.mvc.HandlerRef(
   controllers.Application.getPass(), HandlerDef(this, "controllers.Application", "getPass", Seq())
)
                              
 
// @LINE:30
def addDate(id:Long) = new play.api.mvc.HandlerRef(
   controllers.Application.addDate(id), HandlerDef(this, "controllers.Application", "addDate", Seq(classOf[Long]))
)
                              
 
// @LINE:47
def addParticipant(idhash:String) = new play.api.mvc.HandlerRef(
   controllers.Application.addParticipant(idhash), HandlerDef(this, "controllers.Application", "addParticipant", Seq(classOf[String]))
)
                              
 
// @LINE:45
def updatePersonne(id:Long) = new play.api.mvc.HandlerRef(
   controllers.Application.updatePersonne(id), HandlerDef(this, "controllers.Application", "updatePersonne", Seq(classOf[Long]))
)
                              
 
// @LINE:15
def newEvent() = new play.api.mvc.HandlerRef(
   controllers.Application.newEvent(), HandlerDef(this, "controllers.Application", "newEvent", Seq())
)
                              
 
// @LINE:18
def heureSelection(id:Long) = new play.api.mvc.HandlerRef(
   controllers.Application.heureSelection(id), HandlerDef(this, "controllers.Application", "heureSelection", Seq(classOf[Long]))
)
                              
 
// @LINE:39
def edit(idhash:String) = new play.api.mvc.HandlerRef(
   controllers.Application.edit(idhash), HandlerDef(this, "controllers.Application", "edit", Seq(classOf[String]))
)
                              
 
// @LINE:27
def deleteEvent(id:Long) = new play.api.mvc.HandlerRef(
   controllers.Application.deleteEvent(id), HandlerDef(this, "controllers.Application", "deleteEvent", Seq(classOf[Long]))
)
                              
 
// @LINE:41
def editAdm(idhash:String, mailhash:String) = new play.api.mvc.HandlerRef(
   controllers.Application.editAdm(idhash, mailhash), HandlerDef(this, "controllers.Application", "editAdm", Seq(classOf[String], classOf[String]))
)
                              
 
// @LINE:32
def dateChanged(id:Long) = new play.api.mvc.HandlerRef(
   controllers.Application.dateChanged(id), HandlerDef(this, "controllers.Application", "dateChanged", Seq(classOf[Long]))
)
                              
 
// @LINE:51
def checkBoxJour(id:Long) = new play.api.mvc.HandlerRef(
   controllers.Application.checkBoxJour(id), HandlerDef(this, "controllers.Application", "checkBoxJour", Seq(classOf[Long]))
)
                              
 
// @LINE:40
def update(id:Long) = new play.api.mvc.HandlerRef(
   controllers.Application.update(id), HandlerDef(this, "controllers.Application", "update", Seq(classOf[Long]))
)
                              
 
// @LINE:19
def invitation(id:Long) = new play.api.mvc.HandlerRef(
   controllers.Application.invitation(id), HandlerDef(this, "controllers.Application", "invitation", Seq(classOf[Long]))
)
                              
 
// @LINE:50
def checkBoxHoraire(id:Long) = new play.api.mvc.HandlerRef(
   controllers.Application.checkBoxHoraire(id), HandlerDef(this, "controllers.Application", "checkBoxHoraire", Seq(classOf[Long]))
)
                              
 
// @LINE:11
def index() = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Seq())
)
                              
 
// @LINE:31
def removeDate(id:Long) = new play.api.mvc.HandlerRef(
   controllers.Application.removeDate(id), HandlerDef(this, "controllers.Application", "removeDate", Seq(classOf[Long]))
)
                              
 
// @LINE:17
def dateSelection(id:Long) = new play.api.mvc.HandlerRef(
   controllers.Application.dateSelection(id), HandlerDef(this, "controllers.Application", "dateSelection", Seq(classOf[Long]))
)
                              
 
// @LINE:53
def changeObligatoire(id:Long) = new play.api.mvc.HandlerRef(
   controllers.Application.changeObligatoire(id), HandlerDef(this, "controllers.Application", "changeObligatoire", Seq(classOf[Long]))
)
                              
 
// @LINE:56
def addMail(id:Long) = new play.api.mvc.HandlerRef(
   controllers.Application.addMail(id), HandlerDef(this, "controllers.Application", "addMail", Seq(classOf[Long]))
)
                              
 
// @LINE:24
def eventCreateFilled(id:Long) = new play.api.mvc.HandlerRef(
   controllers.Application.eventCreateFilled(id), HandlerDef(this, "controllers.Application", "eventCreateFilled", Seq(classOf[Long]))
)
                              
 
// @LINE:25
def eventlist() = new play.api.mvc.HandlerRef(
   controllers.Application.eventlist(), HandlerDef(this, "controllers.Application", "eventlist", Seq())
)
                              
 
// @LINE:48
def deleteParticipant(id:Long) = new play.api.mvc.HandlerRef(
   controllers.Application.deleteParticipant(id), HandlerDef(this, "controllers.Application", "deleteParticipant", Seq(classOf[Long]))
)
                              

                      
    
}
                            
}
                    
                