import play.*;
import play.libs.*;

import java.util.*;

import com.avaje.ebean.*;

import models.*;

public class Global extends GlobalSettings {
    
    public void onStart(Application app) {
        InitialData.insert(app);
    }
    
    static class InitialData {
        
        public static void insert(Application app) {
            if(Ebean.find(Evenement.class).findRowCount() == 0) {
                
                Map<String,List<Object>> all = (Map<String,List<Object>>)Yaml.load("initial-data.yml");
                
                Ebean.save(all.get("horaire"));
               
                Ebean.save(all.get("jour"));
                for(Object project: all.get("jour")) {                    
                    Ebean.saveManyToManyAssociations(project, "horaires");
                }
                
                Ebean.save(all.get("personne"));
                
                Ebean.save(all.get("evenement"));
                for(Object project: all.get("evenement")) {
                	Ebean.saveManyToManyAssociations(project, "participants");
                    Ebean.saveManyToManyAssociations(project, "jours");
                }
                               
                
                
            }
        }
        
    }
    
}