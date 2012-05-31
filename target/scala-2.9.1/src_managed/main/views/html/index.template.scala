
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
object index extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.Html] {

    /**/
    def apply():play.api.templates.Html = {
        _display_ {import helper._


Seq[Any](format.raw/*4.1*/("""
"""),_display_(Seq[Any](/*5.2*/main("Index")/*5.15*/ {_display_(Seq[Any](format.raw/*5.17*/("""
    
    <br /><br />
        Bienvenue....
  
    
""")))})))}
    }
    
    def render() = apply()
    
    def f:(() => play.api.templates.Html) = () => apply()
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Fri May 11 10:03:50 CEST 2012
                    SOURCE: C:/tutoPlay/draft/app/views/index.scala.html
                    HASH: b31259b29fe8a2d99c4543026898fad9ece7c725
                    MATRIX: 835->19|871->21|892->34|931->36
                    LINES: 31->4|32->5|32->5|32->5
                    -- GENERATED --
                */
            