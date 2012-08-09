
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
object resume extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template3[Long,Form[Evenement],Evenement,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(id: Long, eventForm: Form[Evenement], event: Evenement):play.api.templates.Html = {
        _display_ {import helper.twitterBootstrap._

import helper._

implicit def /*6.2*/implicitFieldConstructor/*6.26*/ = {{ FieldConstructor(twitterBootstrapInput.f) }};
Seq[Any](format.raw/*1.58*/("""

"""),format.raw/*5.1*/("""
"""),format.raw/*6.75*/("""



"""),_display_(Seq[Any](/*10.2*/main("Résumé de l'événement")/*10.31*/ {_display_(Seq[Any](format.raw/*10.33*/("""
    
    <div class="container">
        <div class="content">

            <div class="btn-group">
                <a class="btn" href=""""),_display_(Seq[Any](/*16.39*/routes/*16.45*/.Application.eventCreateFilled(event.id))),format.raw/*16.85*/("""">1.Création de l'événement</a>
                <a class="btn" href=""""),_display_(Seq[Any](/*17.39*/routes/*17.45*/.Application.dateSelection(event.id))),format.raw/*17.81*/("""">2.Sélection des dates</a>
                <a class="btn" href=""""),_display_(Seq[Any](/*18.39*/routes/*18.45*/.Application.heureSelection(event.id))),format.raw/*18.82*/("""">3.Sélection des plages horaires</a>
                <a class="btn" href=""""),_display_(Seq[Any](/*19.39*/routes/*19.45*/.Application.invitation(event.id))),format.raw/*19.78*/("""">4.Invitation des participants</a>
                <a class="btn btn-info" href=""""),_display_(Seq[Any](/*20.48*/routes/*20.54*/.Application.resume(event.id))),format.raw/*20.83*/("""">5.Résumé</a>
            </div>

            <h2>Récapitulatif de l'événement</h2>
            
            <b>Titre : </b> """),_display_(Seq[Any](/*25.30*/event/*25.35*/.titre)),format.raw/*25.41*/(""" &nbsp;&nbsp; <br/>      
            <b>Crée par : </b> """),_display_(Seq[Any](/*26.33*/event/*26.38*/.createur)),format.raw/*26.47*/(""" &nbsp;&nbsp;<br/><br/>
             
                
               <div class="styleDates resume" >
                <img id="image" style="display:inline" src=""""),_display_(Seq[Any](/*30.62*/routes/*30.68*/.Assets.at("images/calendar.png"))),format.raw/*30.101*/(""""/>
                <h3 style="display:inline">Dates propos&eacute;es:</h3>                 
                
                <input type="hidden" id="identifiants" value=""""),_display_(Seq[Any](/*33.64*/event/*33.69*/.id)),format.raw/*33.72*/("""">               
                    <ul class="firstClass">
                    """),_display_(Seq[Any](/*35.22*/for(jour <- event.jours) yield /*35.46*/ {_display_(Seq[Any](format.raw/*35.48*/("""
                        <li><i class="mesicones icon-calendar"></i><b style="font-size:18px">"""),_display_(Seq[Any](/*36.95*/jour/*36.99*/.getFRFormat)),format.raw/*36.111*/("""</b> &nbsp;
                            <ul>
                            """),_display_(Seq[Any](/*38.30*/for(horaire <- jour.horaires) yield /*38.59*/ {_display_(Seq[Any](format.raw/*38.61*/("""
                              <li><i class="mesicones icon-time"></i>  """),_display_(Seq[Any](/*39.73*/horaire/*39.80*/.debut)),format.raw/*39.86*/(""" - """),_display_(Seq[Any](/*39.90*/horaire/*39.97*/.fin)),format.raw/*39.101*/("""</li>
                            """)))})),format.raw/*40.30*/("""
                            </ul>
                        </li>
                     
                    """)))})),format.raw/*44.22*/("""
                    </ul>
                </div>         
                <div class="mailList resume">
                    <img id="image" style="display:inline" src=""""),_display_(Seq[Any](/*48.66*/routes/*48.72*/.Assets.at("images/mail.gif"))),format.raw/*48.101*/(""""/>
                    <h3 style="display:inline">Liste des mails invités:</h3> 
                    <div  id="mailList" class="selectDate" style="position:right">
                        
                        <br>
                        <p  id="mailAdressContent">             
                            """),_display_(Seq[Any](/*54.30*/for(l <- event.mailSentList) yield /*54.58*/{_display_(Seq[Any](format.raw/*54.59*/("""
                                <a href="mailto:"""),_display_(Seq[Any](/*55.50*/l/*55.51*/.adresse)),format.raw/*55.59*/("""?subject=KIND:Invitation&body=http://intranet2:9000/KIND/eventEdit/"""),_display_(Seq[Any](/*55.127*/(new sun.misc.BASE64Encoder().encode((event.id.toString).getBytes)))),format.raw/*55.194*/("""/consult">"""),_display_(Seq[Any](/*55.205*/l/*55.206*/.adresse)),format.raw/*55.214*/(""" </a><br>
                            """)))})),format.raw/*56.30*/(""" 
                        </p>
                    </div>
                </div>
                <br/>
                <div>
                    <a href=""""),_display_(Seq[Any](/*62.31*/routes/*62.37*/.Application.invitation(event.id))),format.raw/*62.70*/("""" class="precedent btn btn-primary">Précédent</a>
                    <a href=""""),_display_(Seq[Any](/*63.31*/routes/*63.37*/.Application.editAdm(new sun.misc.BASE64Encoder().encode((event.id.toString).getBytes), new sun.misc.BASE64Encoder().encode((event.email).getBytes)))),format.raw/*63.185*/("""" class="continuer btn btn-primary">Continuer</a>
                </div>
            
               

        </div>
    </div>
    
    
    
    
""")))})))}
    }
    
    def render(id:Long,eventForm:Form[Evenement],event:Evenement) = apply(id,eventForm,event)
    
    def f:((Long,Form[Evenement],Evenement) => play.api.templates.Html) = (id,eventForm,event) => apply(id,eventForm,event)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Aug 08 13:09:26 CEST 2012
                    SOURCE: C:/tutoPlay/KIND/app/views/resume.scala.html
                    HASH: b4b47a20966576bb75df0e2ce28e2dadd873d1e2
                    MATRIX: 780->1|957->117|989->141|1068->57|1098->114|1127->190|1171->199|1209->228|1249->230|1430->375|1445->381|1507->421|1614->492|1629->498|1687->534|1790->601|1805->607|1864->644|1977->721|1992->727|2047->760|2167->844|2182->850|2233->879|2401->1011|2415->1016|2443->1022|2538->1081|2552->1086|2583->1095|2787->1263|2802->1269|2858->1302|3070->1478|3084->1483|3109->1486|3230->1571|3270->1595|3310->1597|3442->1693|3455->1697|3490->1709|3602->1785|3647->1814|3687->1816|3797->1890|3813->1897|3841->1903|3881->1907|3897->1914|3924->1918|3992->1954|4136->2066|4346->2240|4361->2246|4413->2275|4768->2594|4812->2622|4851->2623|4938->2674|4948->2675|4978->2683|5083->2751|5173->2818|5221->2829|5232->2830|5263->2838|5335->2878|5532->3039|5547->3045|5602->3078|5719->3159|5734->3165|5905->3313
                    LINES: 27->1|32->6|32->6|33->1|35->5|36->6|40->10|40->10|40->10|46->16|46->16|46->16|47->17|47->17|47->17|48->18|48->18|48->18|49->19|49->19|49->19|50->20|50->20|50->20|55->25|55->25|55->25|56->26|56->26|56->26|60->30|60->30|60->30|63->33|63->33|63->33|65->35|65->35|65->35|66->36|66->36|66->36|68->38|68->38|68->38|69->39|69->39|69->39|69->39|69->39|69->39|70->40|74->44|78->48|78->48|78->48|84->54|84->54|84->54|85->55|85->55|85->55|85->55|85->55|85->55|85->55|85->55|86->56|92->62|92->62|92->62|93->63|93->63|93->63
                    -- GENERATED --
                */
            