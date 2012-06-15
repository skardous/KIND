
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
object event extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template2[List[Evenement],Form[Evenement],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(events: List[Evenement], eventForm: Form[Evenement]):play.api.templates.Html = {
        _display_ {import helper.twitterBootstrap._

import helper._

implicit def /*6.2*/implicitFieldConstructor/*6.26*/ = {{ FieldConstructor(twitterBootstrapInput.f) }};
Seq[Any](format.raw/*1.55*/("""

"""),format.raw/*5.1*/("""
"""),format.raw/*6.75*/("""



"""),_display_(Seq[Any](/*10.2*/main("Creer un evenement")/*10.28*/ {_display_(Seq[Any](format.raw/*10.30*/("""
    
    <h2>Cr&eacute;er un evenement</h2>
    
    """),_display_(Seq[Any](/*14.6*/form(action = routes.Application.newEvent(), args = 'class -> "form-horizontal")/*14.86*/ {_display_(Seq[Any](format.raw/*14.88*/("""
        
        """),_display_(Seq[Any](/*16.10*/inputText(eventForm("titre")))),format.raw/*16.39*/("""         
        """),_display_(Seq[Any](/*17.10*/inputText(eventForm("lieu")))),format.raw/*17.38*/(""" 
        """),_display_(Seq[Any](/*18.10*/textarea(eventForm("descriptif"), 'rows->6))),format.raw/*18.53*/("""
        """),_display_(Seq[Any](/*19.10*/inputText(eventForm("createur")))),format.raw/*19.42*/("""
        """),_display_(Seq[Any](/*20.10*/inputText(eventForm("mail")))),format.raw/*20.38*/("""
        
        <input type="submit" value="Creer">
        
    """)))})),format.raw/*24.6*/("""
    
    
    
""")))})))}
    }
    
    def render(events:List[Evenement],eventForm:Form[Evenement]) = apply(events,eventForm)
    
    def f:((List[Evenement],Form[Evenement]) => play.api.templates.Html) = (events,eventForm) => apply(events,eventForm)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Jun 12 14:45:25 CEST 2012
                    SOURCE: C:/tutoPlay/KIND/app/views/event.scala.html
                    HASH: b092a1b56556ba6b8f02bf23c10314a34e513a72
                    MATRIX: 780->1|952->109|984->133|1063->54|1091->107|1119->182|1159->187|1194->213|1234->215|1324->270|1413->350|1453->352|1508->371|1559->400|1614->419|1664->447|1711->458|1776->501|1822->511|1876->543|1922->553|1972->581|2071->649
                    LINES: 27->1|32->6|32->6|33->1|35->5|36->6|40->10|40->10|40->10|44->14|44->14|44->14|46->16|46->16|47->17|47->17|48->18|48->18|49->19|49->19|50->20|50->20|54->24
                    -- GENERATED --
                */
            