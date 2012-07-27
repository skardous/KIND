
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
object error extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.Html] {

    /**/
    def apply():play.api.templates.Html = {
        _display_ {import helper._


Seq[Any](format.raw/*2.1*/("""
"""),_display_(Seq[Any](/*3.2*/main("Erreur")/*3.16*/ {_display_(Seq[Any](format.raw/*3.18*/("""    

        <div style="text-align:center">
            <h1>ERREUR</h1>
            <br />
            <h3>Cette page n'existe pas!       
            </h3>
            <img src=""""),_display_(Seq[Any](/*10.24*/routes/*10.30*/.Assets.at("images/not-pass.png"))),format.raw/*10.63*/("""" width="350" alt="You shall not pass!">
        </div>

  
    
""")))})))}
    }
    
    def render() = apply()
    
    def f:(() => play.api.templates.Html) = () => apply()
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Jul 26 15:44:49 CEST 2012
                    SOURCE: C:/tutoPlay/KIND/app/views/error.scala.html
                    HASH: 7c559d424dd87e3e1b1ba4252fe8c79d8453389b
                    MATRIX: 836->18|873->21|895->35|934->37|1159->226|1174->232|1229->265
                    LINES: 31->2|32->3|32->3|32->3|39->10|39->10|39->10
                    -- GENERATED --
                */
            