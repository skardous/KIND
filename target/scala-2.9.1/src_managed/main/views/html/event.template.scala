
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.api.templates.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import com.avaje.ebean._
import play.mvc.Http.Context.Implicit._
import views.html._
/**/
object event extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[Evenement],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(eventForm: Form[Evenement]):play.api.templates.Html = {
        _display_ {import helper.twitterBootstrap._

import helper._

implicit def /*6.2*/implicitFieldConstructor/*6.26*/ = {{ FieldConstructor(twitterBootstrapInput.f) }};
Seq[Any](format.raw/*1.30*/("""

"""),format.raw/*5.1*/("""
"""),format.raw/*6.75*/("""



"""),_display_(Seq[Any](/*10.2*/main("Créer un événement")/*10.28*/ {_display_(Seq[Any](format.raw/*10.30*/("""
    
    <div class="container">
        <div class="content">

            <div class="btn-group">
                <a class="btn btn-info">1.Création de l'événement</a>
                <a class="btn">2.Sélection des dates</a>
                <a class="btn">3.Sélection des plages horaires</a>
                <a class="btn">4.Invitation des participants</a>
                <a class="btn">5.Résumé</a>
            </div>
            
            
            <h2>Cr&eacute;er un &eacute;v&eacute;nement</h2>
            
            """),_display_(Seq[Any](/*26.14*/form(action = routes.Application.newEvent(), args = 'class -> "form-horizontal")/*26.94*/ {_display_(Seq[Any](format.raw/*26.96*/("""
                
                """),_display_(Seq[Any](/*28.18*/inputText(eventForm("titre"), '_label -> "Titre"))),format.raw/*28.67*/("""         
                """),_display_(Seq[Any](/*29.18*/inputText(eventForm("lieu"), '_label -> "Lieu"))),format.raw/*29.65*/(""" 
                """),_display_(Seq[Any](/*30.18*/textarea(eventForm("descriptif"), '_label -> "Description", 'rows->6))),format.raw/*30.87*/("""
                """),_display_(Seq[Any](/*31.18*/inputText(eventForm("createur"), '_label -> "Créateur"))),format.raw/*31.73*/("""
                """),_display_(Seq[Any](/*32.18*/inputText(eventForm("email"), '_label -> "Email"))),format.raw/*32.67*/(""" ATTENTION: Un lien d'accès à l'administration de l'évènement sera envoyé à cet email: vérifiez bien sa validité.
                <br><br><br>
                <input type="submit" value="Continuer" class="continuer btn btn-info">
                
            """)))})),format.raw/*36.14*/("""

        </div>
    </div>
    
    
    
    
""")))})))}
    }
    
    def render(eventForm:Form[Evenement]) = apply(eventForm)
    
    def f:((Form[Evenement]) => play.api.templates.Html) = (eventForm) => apply(eventForm)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Aug 02 13:34:55 CEST 2012
                    SOURCE: C:/tutoPlay/KIND/app/views/event.scala.html
                    HASH: d84f7152478555e603c67c7712e920d32fa278f9
                    MATRIX: 764->1|911->84|943->108|1022->29|1050->82|1078->157|1118->162|1153->188|1193->190|1765->726|1854->806|1894->808|1965->843|2036->892|2099->919|2168->966|2223->985|2314->1054|2368->1072|2445->1127|2499->1145|2570->1194|2862->1454
                    LINES: 27->1|32->6|32->6|33->1|35->5|36->6|40->10|40->10|40->10|56->26|56->26|56->26|58->28|58->28|59->29|59->29|60->30|60->30|61->31|61->31|62->32|62->32|66->36
                    -- GENERATED --
                */
            