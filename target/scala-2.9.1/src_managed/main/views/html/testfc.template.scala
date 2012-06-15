
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
object testfc extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[helper.FieldElements,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(elements: helper.FieldElements):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.34*/("""

<div class=""""),_display_(Seq[Any](/*3.14*/if(elements.hasErrors)/*3.36*/ {_display_(Seq[Any](format.raw/*3.38*/("""error""")))})),format.raw/*3.44*/("""">
    <label for=""""),_display_(Seq[Any](/*4.18*/elements/*4.26*/.id)),format.raw/*4.29*/("""">"""),_display_(Seq[Any](/*4.32*/elements/*4.40*/.label)),format.raw/*4.46*/("""</label>
    <div class="input">
        """),_display_(Seq[Any](/*6.10*/elements/*6.18*/.input)),format.raw/*6.24*/("""
        <span class="errors">"""),_display_(Seq[Any](/*7.31*/elements/*7.39*/.errors.mkString(", "))),format.raw/*7.61*/("""</span>
        <span class="help">"""),_display_(Seq[Any](/*8.29*/elements/*8.37*/.infos.mkString(", "))),format.raw/*8.58*/("""</span> 
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
                    SOURCE: C:/tutoPlay/KIND/app/views/testfc.scala.html
                    HASH: eb96635807cc1f643e510a5925822d4ff596af61
                    MATRIX: 770->1|879->33|931->50|961->72|1000->74|1037->80|1093->101|1109->109|1133->112|1171->115|1187->123|1214->129|1293->173|1309->181|1336->187|1403->219|1419->227|1462->249|1534->286|1550->294|1592->315
                    LINES: 27->1|30->1|32->3|32->3|32->3|32->3|33->4|33->4|33->4|33->4|33->4|33->4|35->6|35->6|35->6|36->7|36->7|36->7|37->8|37->8|37->8
                    -- GENERATED --
                */
            