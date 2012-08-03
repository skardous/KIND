
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
object invitation extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template3[Long,Form[Evenement],Evenement,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(id: Long, eventForm: Form[Evenement], event: Evenement):play.api.templates.Html = {
        _display_ {import helper.twitterBootstrap._

import helper._

implicit def /*6.2*/implicitFieldConstructor/*6.26*/ = {{ FieldConstructor(twitterBootstrapInput.f) }};
Seq[Any](format.raw/*1.58*/("""

"""),format.raw/*5.1*/("""
"""),format.raw/*6.75*/("""



"""),_display_(Seq[Any](/*10.2*/main("Inviter à l'événement")/*10.31*/ {_display_(Seq[Any](format.raw/*10.33*/("""
    
    <div class="container">
        <div class="content">

            <div class="btn-group">
                <a class="btn" href=""""),_display_(Seq[Any](/*16.39*/routes/*16.45*/.Application.eventCreateFilled(event.id))),format.raw/*16.85*/("""">1.Création de l'événement</a>
                <a class="btn" href=""""),_display_(Seq[Any](/*17.39*/routes/*17.45*/.Application.dateSelection(event.id))),format.raw/*17.81*/("""">2.Sélection des dates</a>
                <a class="btn" href=""""),_display_(Seq[Any](/*18.39*/routes/*18.45*/.Application.heureSelection(event.id))),format.raw/*18.82*/("""">3.Sélection des plages horaires</a>
                <a class="btn btn-info" href=""""),_display_(Seq[Any](/*19.48*/routes/*19.54*/.Application.invitation(event.id))),format.raw/*19.87*/("""">4.Invitation des participants</a>
                <a class="btn" href=""""),_display_(Seq[Any](/*20.39*/routes/*20.45*/.Application.resume(event.id))),format.raw/*20.74*/("""">5.Résumé</a>
            </div>
            
            <h2>Inviter des personnes à l'évenement</h2>
            
            <div class="selectDate" style="position:relative; display:inline-block; width:500px">
                <textarea id="mailsArea" title="Adresses email s&eacute;par&eacute;es par une virgule" rows="4" style="color:grey" placeholder="Entrez ici les adresses mail séparées par une virgule ..."></textarea>
                <i class="checkmail mesicones icon-remove"></i>
                <a id="envoiLien" disabled="true" class="btn">Envoyer Lien</a> <a class="btnMailPerso" title="Ajouter un texte personnalisé au mail"><i class="mesicones icon-plus"></i></a>
                <div class="champPerso" style="display:none">
                    <textarea id="mailPersoArea" rows="6" style="color:grey" placeholder="Entrez un message avec votre mail d'invitation"></textarea>
                </div>
            </div>
           

            <div  id="mailList" class="selectDate" style="position:right;  width:500px">
                    <h5 >Liste des mails invités</h5>
                    <br>
                    <p  id="mailAdressContent">             
                        """),_display_(Seq[Any](/*39.26*/for(l <- event.mailSentList) yield /*39.54*/{_display_(Seq[Any](format.raw/*39.55*/("""
                            """),_display_(Seq[Any](/*40.30*/l/*40.31*/.adresse)),format.raw/*40.39*/(""" <br>
                        """)))})),format.raw/*41.26*/(""" 
                    </p>
                </div>
            
            <a href=""""),_display_(Seq[Any](/*45.23*/routes/*45.29*/.Application.heureSelection(event.id))),format.raw/*45.66*/("""" class="precedent btn btn-primary">Précédent</a>
            <a href=""""),_display_(Seq[Any](/*46.23*/routes/*46.29*/.Application.resume(event.id))),format.raw/*46.58*/("""" class="continuer btn btn-primary">Continuer</a>
               

        </div>
    </div>
    
    <script type="text/javascript" charset="utf-8">
        

        function refreshtable()"""),format.raw("""{"""),format.raw/*55.33*/("""
            $('#divtest').load('/KIND/eventEdit/"""),_display_(Seq[Any](/*56.50*/(new sun.misc.BASE64Encoder().encode((event.id.toString).getBytes)))),format.raw/*56.117*/("""/consult/"""),_display_(Seq[Any](/*56.127*/(new sun.misc.BASE64Encoder().encode((event.email).getBytes)))),format.raw/*56.188*/("""/adm #divtest');
        """),format.raw("""}"""),format.raw/*57.10*/("""

        Mails(""""),_display_(Seq[Any](/*59.17*/routes/*59.23*/.Application.sendMail(event.id))),format.raw/*59.54*/("""");

    </script>
    


    
""")))})))}
    }
    
    def render(id:Long,eventForm:Form[Evenement],event:Evenement) = apply(id,eventForm,event)
    
    def f:((Long,Form[Evenement],Evenement) => play.api.templates.Html) = (id,eventForm,event) => apply(id,eventForm,event)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Aug 03 11:04:28 CEST 2012
                    SOURCE: C:/tutoPlay/KIND/app/views/invitation.scala.html
                    HASH: cf683856ab14d8da3269a0eb06f9c7c3c2bbc426
                    MATRIX: 784->1|961->117|993->141|1072->57|1102->114|1131->190|1175->199|1213->228|1253->230|1434->375|1449->381|1511->421|1618->492|1633->498|1691->534|1794->601|1809->607|1868->644|1990->730|2005->736|2060->769|2171->844|2186->850|2237->879|3496->2102|3540->2130|3579->2131|3646->2162|3656->2163|3686->2171|3750->2203|3875->2292|3890->2298|3949->2335|4058->2408|4073->2414|4124->2443|4372->2644|4459->2695|4549->2762|4596->2772|4680->2833|4754->2860|4810->2880|4825->2886|4878->2917
                    LINES: 27->1|32->6|32->6|33->1|35->5|36->6|40->10|40->10|40->10|46->16|46->16|46->16|47->17|47->17|47->17|48->18|48->18|48->18|49->19|49->19|49->19|50->20|50->20|50->20|69->39|69->39|69->39|70->40|70->40|70->40|71->41|75->45|75->45|75->45|76->46|76->46|76->46|85->55|86->56|86->56|86->56|86->56|87->57|89->59|89->59|89->59
                    -- GENERATED --
                */
            