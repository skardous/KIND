
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
object twitterBootstrapInput extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[helper.FieldElements,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(elements: helper.FieldElements):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.34*/("""

"""),format.raw/*5.52*/("""
    <div class="control-group """),_display_(Seq[Any](/*6.32*/if(elements.hasErrors)/*6.54*/ {_display_(Seq[Any](format.raw/*6.56*/("""error""")))})),format.raw/*6.62*/("""">
      <label class="control-label" for=""""),_display_(Seq[Any](/*7.42*/elements/*7.50*/.id)),format.raw/*7.53*/("""">"""),_display_(Seq[Any](/*7.56*/elements/*7.64*/.label)),format.raw/*7.70*/("""</label>
      <div class="controls">
        """),_display_(Seq[Any](/*9.10*/elements/*9.18*/.input)),format.raw/*9.24*/("""
        <p class="help-block">"""),_display_(Seq[Any](/*10.32*/elements/*10.40*/.infos.mkString(", "))),format.raw/*10.61*/("""</p>
        """),_display_(Seq[Any](/*11.10*/if(elements.hasErrors)/*11.32*/ {_display_(Seq[Any](format.raw/*11.34*/("""
        <p class="help-block">"""),_display_(Seq[Any](/*12.32*/elements/*12.40*/.errors.mkString(", "))),format.raw/*12.62*/("""</p>
        """)))})),format.raw/*13.10*/("""
      </div>
    </div>"""))}
    }
    
    def render(elements:helper.FieldElements) = apply(elements)
    
    def f:((helper.FieldElements) => play.api.templates.Html) = (elements) => apply(elements)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Jun 12 14:45:25 CEST 2012
                    SOURCE: C:/tutoPlay/KIND/app/views/twitterBootstrapInput.scala.html
                    HASH: a135538bd17fac0126ccdabf7ba24b34ee2c7ff4
                    MATRIX: 785->1|894->33|925->194|993->227|1023->249|1062->251|1099->257|1179->302|1195->310|1219->313|1257->316|1273->324|1300->330|1384->379|1400->387|1427->393|1496->426|1513->434|1556->455|1607->470|1638->492|1678->494|1747->527|1764->535|1808->557|1855->572
                    LINES: 27->1|30->1|32->5|33->6|33->6|33->6|33->6|34->7|34->7|34->7|34->7|34->7|34->7|36->9|36->9|36->9|37->10|37->10|37->10|38->11|38->11|38->11|39->12|39->12|39->12|40->13
                    -- GENERATED --
                */
            