/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.https://mega.nz/folder_F_F_F/ANkWwApD#xeFXqF9HtjKpCHnpa5a1mw/folder/hIcGiADB
 */
package route;

import com.google.gson.Gson;
import controller.PersonController;
import static spark.Spark.*;
import services.PersonService;
// import com.controller.PersonController;

/**
 *
 * @author osmar
 */
public class PersonRoute {
    
    public  PersonRoute() {
        Gson gson = new Gson();
        PersonController personController = new PersonController();
         get("/", (req, res) -> "putito");
         get("/person", (req, res) -> personController.index(),gson::toJson);
         get("/person/:id", "application/json",(req, res)-> {
            int id = Integer.parseInt(req.params(":id"));
            return personController.show(id);
        }, gson::toJson);
         
          get("/person/email/:email", "application/json",(req, res)-> {
            String email = req.params(":email");
            return personController.showbyemail(email);
        }, gson::toJson);
         
         
    }
   
}
