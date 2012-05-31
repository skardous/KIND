
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
object eventlist extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[List[Evenement],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(events: List[Evenement]):play.api.templates.Html = {
        _display_ {import helper._


Seq[Any](format.raw/*1.27*/("""

"""),format.raw/*4.1*/("""
"""),_display_(Seq[Any](/*5.2*/main("Creer un evenement")/*5.28*/ {_display_(Seq[Any](format.raw/*5.30*/("""
    
    <h1>"""),_display_(Seq[Any](/*7.10*/events/*7.16*/.size())),format.raw/*7.23*/(""" evenement(s)</h1>
    
  
    <ul>
        """),_display_(Seq[Any](/*11.10*/for(e <- events) yield /*11.26*/ {_display_(Seq[Any](format.raw/*11.28*/("""
            <li>
                """),_display_(Seq[Any](/*13.18*/e/*13.19*/.titre)),format.raw/*13.25*/(""" &nbsp;&nbsp; <br/>par:       
                """),_display_(Seq[Any](/*14.18*/e/*14.19*/.createur)),format.raw/*14.28*/(""" &nbsp;&nbsp; <br/>
                <i>"""),_display_(Seq[Any](/*15.21*/e/*15.22*/.descriptif)),format.raw/*15.33*/("""</i>&nbsp;<br/><br/>
                <div class="styleDates" >
                Dates propos&eacute;es: <br/>
                
                <input type="hidden" id="hiddenDates"""),_display_(Seq[Any](/*19.54*/e/*19.55*/.id)),format.raw/*19.58*/("""" value=""""),_display_(Seq[Any](/*19.68*/e/*19.69*/.dates)),format.raw/*19.75*/("""">
                <input type="hidden" id="hiddenHeures"""),_display_(Seq[Any](/*20.55*/e/*20.56*/.id)),format.raw/*20.59*/("""" value=""""),_display_(Seq[Any](/*20.69*/e/*20.70*/.heures)),format.raw/*20.77*/("""">
                <input type="hidden" id="identifiants" value=""""),_display_(Seq[Any](/*21.64*/e/*21.65*/.id)),format.raw/*21.68*/("""">
                <img id="image" src=""""),_display_(Seq[Any](/*22.39*/routes/*22.45*/.Assets.at("images/calendar.png"))),format.raw/*22.78*/(""""/>
                """),format.raw/*23.57*/("""
                Dates : <ul id="datesHeures"""),_display_(Seq[Any](/*24.45*/e/*24.46*/.id)),format.raw/*24.49*/(""""></ul> <br/>
                </div>         
                
                Participants:<br/>
                """),_display_(Seq[Any](/*28.18*/if(e.participants.size > 0)/*28.45*/ {_display_(Seq[Any](format.raw/*28.47*/("""
	                <ul>
	                """),_display_(Seq[Any](/*30.19*/e/*30.20*/.participants.map/*30.37*/ { personne =>_display_(Seq[Any](format.raw/*30.51*/("""
	                    <li><i class="icon-user"></i>&nbsp;"""),_display_(Seq[Any](/*31.58*/personne/*31.66*/.nom)),format.raw/*31.70*/("""</li>
	                """)))})),format.raw/*32.19*/("""
	            	</ul>
            	""")))})),format.raw/*34.15*/(""" 
            	"""),_display_(Seq[Any](/*35.15*/if(e.participants == null)/*35.41*/ {_display_(Seq[Any](format.raw/*35.43*/("""
            		"""),_display_(Seq[Any](/*36.16*/e/*36.17*/.createur)),format.raw/*36.26*/("""
            		""")))})),format.raw/*37.16*/("""
                
                 <!-- """),format.raw/*39.118*/("""  -->
                 <a href=""""),_display_(Seq[Any](/*40.28*/routes/*40.34*/.Application.edit(e.id))),format.raw/*40.57*/("""">Editer evenement</a>         	
                
                
                """),_display_(Seq[Any](/*43.18*/form(routes.Application.deleteEvent(e.id))/*43.60*/ {_display_(Seq[Any](format.raw/*43.62*/("""
                    <input type="submit" value="Supprimer evenement">
                """)))})),format.raw/*45.18*/("""
            </li>
        """)))})),format.raw/*47.10*/("""
    </ul>
    
    <script type="text/javascript" charset="utf-8">
    	$(function() """),format.raw("""{"""),format.raw/*51.20*/("""
    		var nbElem = """"),_display_(Seq[Any](/*52.22*/events/*52.28*/.size)),format.raw/*52.33*/("""";
    		for (i=1; i<=nbElem; i++) """),format.raw("""{"""),format.raw/*53.34*/("""    		
	    	 	var datesArray = ($("#hiddenDates"+i+"").attr("value")).split(',');
	    	 	var heuresArray = ($("#hiddenHeures"+i+"").attr("value")).split(',');
	    	 	for (val in datesArray) """),format.raw("""{"""),format.raw/*56.34*/("""
				 current = new Date(datesArray[val]);
				 currentStr = current.toLocaleString();
				 $("#datesHeures"+i+"").append("<li>"+currentStr.substring(0,currentStr.length-8)+" Horaires: "+heuresArray[val]+"</li>");
				"""),format.raw("""}"""),format.raw/*60.6*/("""
			"""),format.raw("""}"""),format.raw/*61.5*/("""
			
			var txt2="";
//pour chaque textarea, on déclenche une fonction qui parcours l'objet textearea
$('#identifiants').each(function(index, element)"""),format.raw("""{"""),format.raw/*65.50*/("""
//on stocke les éléments récupéré dans notre chaine de caractères
txt2+="["+index+"]="+$(element).val()+"\n";
"""),format.raw("""}"""),format.raw/*68.2*/(""");
//on affiche le résultat sous forme d'alerte
alert(txt2);
    	 	
    	 	
    		//$("#datesHeures").html("<li>"++"</li>");
    		
    	"""),format.raw("""}"""),format.raw/*75.7*/(""");
    
    </script>
""")))})))}
    }
    
    def render(events:List[Evenement]) = apply(events)
    
    def f:((List[Evenement]) => play.api.templates.Html) = (events) => apply(events)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Thu May 31 14:05:19 CEST 2012
                    SOURCE: C:/tutoPlay/draft/app/views/eventlist.scala.html
                    HASH: 220d32f62a04465c56e03c186261a46bd1aed7e3
                    MATRIX: 768->1|886->26|914->45|950->47|984->73|1023->75|1073->90|1087->96|1115->103|1196->148|1228->164|1268->166|1339->201|1349->202|1377->208|1461->256|1471->257|1502->266|1578->306|1588->307|1621->318|1836->497|1846->498|1871->501|1917->511|1927->512|1955->518|2048->575|2058->576|2083->579|2129->589|2139->590|2168->597|2270->663|2280->664|2305->667|2382->708|2397->714|2452->747|2500->807|2581->852|2591->853|2616->856|2767->971|2803->998|2843->1000|2920->1041|2930->1042|2956->1059|3008->1073|3102->1131|3119->1139|3145->1143|3201->1167|3268->1202|3320->1218|3355->1244|3395->1246|3447->1262|3457->1263|3488->1272|3536->1288|3605->1423|3674->1456|3689->1462|3734->1485|3854->1569|3905->1611|3945->1613|4065->1701|4125->1729|4259->1816|4317->1838|4332->1844|4359->1849|4442->1885|4683->2079|4948->2298|4999->2303|5197->2454|5355->2566|5540->2705
                    LINES: 27->1|31->1|33->4|34->5|34->5|34->5|36->7|36->7|36->7|40->11|40->11|40->11|42->13|42->13|42->13|43->14|43->14|43->14|44->15|44->15|44->15|48->19|48->19|48->19|48->19|48->19|48->19|49->20|49->20|49->20|49->20|49->20|49->20|50->21|50->21|50->21|51->22|51->22|51->22|52->23|53->24|53->24|53->24|57->28|57->28|57->28|59->30|59->30|59->30|59->30|60->31|60->31|60->31|61->32|63->34|64->35|64->35|64->35|65->36|65->36|65->36|66->37|68->39|69->40|69->40|69->40|72->43|72->43|72->43|74->45|76->47|80->51|81->52|81->52|81->52|82->53|85->56|89->60|90->61|94->65|97->68|104->75
                    -- GENERATED --
                */
            