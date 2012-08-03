
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

    <div class="container">
        <div class="content accueil">    
            <h2 style="text-align:center">Bienvenue sur le gestionnaire de réunions du CHU de Rouen</h2>
            <br />
            <!--<p>KIND : Kind Is Not Doodle</p>-->

            <img id="image" width="250" src=""""),_display_(Seq[Any](/*13.47*/routes/*13.53*/.Assets.at("images/chu_logo.jpg"))),format.raw/*13.86*/(""""/>
            
            <p>
            Cet outil a pour but de permettre à tout le personnel du CHU de Rouen d'avoir accès a un moyen simple de planification d'évènements.
            
            </p>
            
            
            <p>
            Ici, vous pourrez organiser des réunions/évènements, sélectionner plusieurs choix possibles de jours et d'horaires à votre convenance 
            et convier les personnes que vous désirez y inviter en spécifiant leur adresse email.<br>              
            </p>

            <a class="btn btn-large btn-primary" href=""""),_display_(Seq[Any](/*26.57*/routes/*26.63*/.Application.eventCreateEmpty())),format.raw/*26.94*/(""""> Créer un événement </a>
        </div>
    </div>
  
    
""")))})))}
    }
    
    def render() = apply()
    
    def f:(() => play.api.templates.Html) = () => apply()
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Aug 03 10:56:41 CEST 2012
                    SOURCE: C:/tutoPlay/KIND/app/views/index.scala.html
                    HASH: be034a56197af66329cc6f763fd62cebc387073b
                    MATRIX: 835->19|871->21|894->36|933->38|1264->333|1279->339|1334->372|1957->959|1972->965|2025->996
                    LINES: 31->4|32->5|32->5|32->5|40->13|40->13|40->13|53->26|53->26|53->26
                    -- GENERATED --
                */
            