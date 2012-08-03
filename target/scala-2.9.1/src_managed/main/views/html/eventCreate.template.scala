
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
object eventCreate extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template2[Form[Evenement],Evenement,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(eventForm: Form[Evenement], event: Evenement):play.api.templates.Html = {
        _display_ {import helper.twitterBootstrap._

import helper._

implicit def /*6.2*/implicitFieldConstructor/*6.26*/ = {{ FieldConstructor(twitterBootstrapInput.f) }};
Seq[Any](format.raw/*1.48*/("""

"""),format.raw/*5.1*/("""
"""),format.raw/*6.75*/("""



"""),_display_(Seq[Any](/*10.2*/main("Créer un événement")/*10.28*/ {_display_(Seq[Any](format.raw/*10.30*/("""
    
    <div class="container">
        <div class="content">

            <div class="btn-group">
                <a class="btn btn-info">1.Création de l'événement</a>
                <a class="btn" """),_display_(Seq[Any](/*17.33*/if(event != null)/*17.50*/{_display_(Seq[Any](format.raw/*17.51*/("""href=""""),_display_(Seq[Any](/*17.58*/routes/*17.64*/.Application.dateSelection(event.id))),format.raw/*17.100*/(""""""")))})),format.raw/*17.102*/(""" """),_display_(Seq[Any](/*17.104*/if(event == null)/*17.121*/{_display_(Seq[Any](format.raw/*17.122*/("""disabled""")))})),format.raw/*17.131*/(""">2.Sélection des dates</a>
                <a class="btn" """),_display_(Seq[Any](/*18.33*/if(event != null)/*18.50*/{_display_(Seq[Any](format.raw/*18.51*/("""href=""""),_display_(Seq[Any](/*18.58*/routes/*18.64*/.Application.heureSelection(event.id))),format.raw/*18.101*/(""""""")))})),format.raw/*18.103*/(""" """),_display_(Seq[Any](/*18.105*/if(event == null)/*18.122*/{_display_(Seq[Any](format.raw/*18.123*/("""disabled""")))})),format.raw/*18.132*/(""">3.Sélection des plages horaires</a>
                <a class="btn" """),_display_(Seq[Any](/*19.33*/if(event != null)/*19.50*/{_display_(Seq[Any](format.raw/*19.51*/("""href=""""),_display_(Seq[Any](/*19.58*/routes/*19.64*/.Application.invitation(event.id))),format.raw/*19.97*/(""""""")))})),format.raw/*19.99*/(""" """),_display_(Seq[Any](/*19.101*/if(event == null)/*19.118*/{_display_(Seq[Any](format.raw/*19.119*/("""disabled""")))})),format.raw/*19.128*/(""">4.Invitation des participants</a>
                <a class="btn" """),_display_(Seq[Any](/*20.33*/if(event != null)/*20.50*/{_display_(Seq[Any](format.raw/*20.51*/("""href=""""),_display_(Seq[Any](/*20.58*/routes/*20.64*/.Application.resume(event.id))),format.raw/*20.93*/(""""""")))})),format.raw/*20.95*/(""" """),_display_(Seq[Any](/*20.97*/if(event == null)/*20.114*/{_display_(Seq[Any](format.raw/*20.115*/("""disabled""")))})),format.raw/*20.124*/(""">5.Résumé</a>
            </div>
            
            
            
            <h2>Cr&eacute;er un &eacute;v&eacute;nement</h2>
            """),_display_(Seq[Any](/*26.14*/if(event == null)/*26.31*/{_display_(Seq[Any](format.raw/*26.32*/("""                

                """),_display_(Seq[Any](/*28.18*/form(action = routes.Application.newEvent(), args = 'class -> "form-horizontal")/*28.98*/ {_display_(Seq[Any](format.raw/*28.100*/("""
                    
                    """),_display_(Seq[Any](/*30.22*/inputText(eventForm("titre"), '_label -> "Titre"))),format.raw/*30.71*/("""         
                    """),_display_(Seq[Any](/*31.22*/inputText(eventForm("lieu"), '_label -> "Lieu"))),format.raw/*31.69*/(""" 
                    """),_display_(Seq[Any](/*32.22*/textarea(eventForm("descriptif"), '_label -> "Description", 'rows->6))),format.raw/*32.91*/("""
                    """),_display_(Seq[Any](/*33.22*/inputText(eventForm("createur"), '_label -> "Créateur"))),format.raw/*33.77*/("""
                    """),_display_(Seq[Any](/*34.22*/inputText(eventForm("email"), '_label -> "Email"))),format.raw/*34.71*/(""" ATTENTION: Un lien d'accès à l'administration de l'évènement sera envoyé à cet email: vérifiez bien sa validité.
                    <br><br><br>
                    <input type="submit" value="Continuer" class="continuer btn btn-primary">
                    
                """)))})),format.raw/*38.18*/("""
            """)))}/*39.15*/else/*39.20*/{_display_(Seq[Any](format.raw/*39.21*/("""
                
                """),_display_(Seq[Any](/*41.18*/form(action = routes.Application.updateEvent(event.id), args = 'class -> "form-horizontal")/*41.109*/ {_display_(Seq[Any](format.raw/*41.111*/("""
                    
                    """),_display_(Seq[Any](/*43.22*/inputText(eventForm("titre"), '_label -> "Titre"))),format.raw/*43.71*/("""         
                    """),_display_(Seq[Any](/*44.22*/inputText(eventForm("lieu"), '_label -> "Lieu"))),format.raw/*44.69*/(""" 
                    """),_display_(Seq[Any](/*45.22*/textarea(eventForm("descriptif"), '_label -> "Description", 'rows->6))),format.raw/*45.91*/("""
                    """),_display_(Seq[Any](/*46.22*/inputText(eventForm("createur"), '_label -> "Créateur"))),format.raw/*46.77*/("""
                    """),_display_(Seq[Any](/*47.22*/inputText(eventForm("email"), '_label -> "Email"))),format.raw/*47.71*/(""" ATTENTION: Un lien d'accès à l'administration de l'évènement sera envoyé à cet email: vérifiez bien sa validité.
                    <br><br><br>
                    <input type="submit" value="Continuer" class="continuer btn btn-primary">
                    
                """)))})),format.raw/*51.18*/("""
            """)))})),format.raw/*52.14*/("""     

        </div>
    </div>
    
    
    
    
""")))})))}
    }
    
    def render(eventForm:Form[Evenement],event:Evenement) = apply(eventForm,event)
    
    def f:((Form[Evenement],Evenement) => play.api.templates.Html) = (eventForm,event) => apply(eventForm,event)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Aug 03 10:58:05 CEST 2012
                    SOURCE: C:/tutoPlay/KIND/app/views/eventCreate.scala.html
                    HASH: 31c2bf0c141077dde0133c5f1c722ea401d837ef
                    MATRIX: 780->1|945->102|977->126|1056->47|1084->100|1112->175|1152->180|1187->206|1227->208|1466->411|1492->428|1531->429|1574->436|1589->442|1648->478|1683->480|1722->482|1749->499|1789->500|1831->509|1926->568|1952->585|1991->586|2034->593|2049->599|2109->636|2144->638|2183->640|2210->657|2250->658|2292->667|2397->736|2423->753|2462->754|2505->761|2520->767|2575->800|2609->802|2648->804|2675->821|2715->822|2757->831|2860->898|2886->915|2925->916|2968->923|2983->929|3034->958|3068->960|3106->962|3133->979|3173->980|3215->989|3397->1135|3423->1152|3462->1153|3533->1188|3622->1268|3663->1270|3742->1313|3813->1362|3880->1393|3949->1440|4008->1463|4099->1532|4157->1554|4234->1609|4292->1631|4363->1680|4674->1959|4707->1974|4720->1979|4759->1980|4830->2015|4931->2106|4972->2108|5051->2151|5122->2200|5189->2231|5258->2278|5317->2301|5408->2370|5466->2392|5543->2447|5601->2469|5672->2518|5983->2797|6029->2811
                    LINES: 27->1|32->6|32->6|33->1|35->5|36->6|40->10|40->10|40->10|47->17|47->17|47->17|47->17|47->17|47->17|47->17|47->17|47->17|47->17|47->17|48->18|48->18|48->18|48->18|48->18|48->18|48->18|48->18|48->18|48->18|48->18|49->19|49->19|49->19|49->19|49->19|49->19|49->19|49->19|49->19|49->19|49->19|50->20|50->20|50->20|50->20|50->20|50->20|50->20|50->20|50->20|50->20|50->20|56->26|56->26|56->26|58->28|58->28|58->28|60->30|60->30|61->31|61->31|62->32|62->32|63->33|63->33|64->34|64->34|68->38|69->39|69->39|69->39|71->41|71->41|71->41|73->43|73->43|74->44|74->44|75->45|75->45|76->46|76->46|77->47|77->47|81->51|82->52
                    -- GENERATED --
                */
            