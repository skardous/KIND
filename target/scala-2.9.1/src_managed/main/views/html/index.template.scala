
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
"""),_display_(Seq[Any](/*5.2*/main("Accueil")/*5.17*/ {_display_(Seq[Any](format.raw/*5.19*/("""
    
    <br /><br />
        <h4>Bienvenue sur le gestionnaire de Réunions du CHU de Rouen</h4>
        <br />
        <p>KIND : Kind Is Not Doodle</p>

        <img id="image" width="250" src=""""),_display_(Seq[Any](/*12.43*/routes/*12.49*/.Assets.at("images/chu_logo.jpg"))),format.raw/*12.82*/(""""/>
        
        <p>
        Cet outil a pour but de permettre à tous le personnel du CHU de Rouen d'avoir accès a un moyen simple de planification d'évenements.
        
        </p>
        
        
        <p>
        Ici, vous pourrez organiser des réunions/évenements, sélectionner plusieurs choix possibles de jours et d'horaires à votre convenance 
        et convier les personnes que vous désirez y inviter en spécifiant leur adresse email.<br>              
        </p>
  
    
""")))})))}
    }
    
    def render() = apply()
    
    def f:(() => play.api.templates.Html) = () => apply()
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Jul 16 08:27:46 CEST 2012
                    SOURCE: C:/tutoPlay/KIND/app/views/index.scala.html
                    HASH: 91c7c7f5570deda88b3e20d0864b72191bdb49f7
                    MATRIX: 835->19|871->21|894->36|933->38|1166->235|1181->241|1236->274
                    LINES: 31->4|32->5|32->5|32->5|39->12|39->12|39->12
                    -- GENERATED --
                */
            