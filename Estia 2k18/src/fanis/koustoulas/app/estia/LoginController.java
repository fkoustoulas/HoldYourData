/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fanis.koustoulas.app.estia;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class LoginController {
    private String username;
    private String password;
    private DBController db = new DBController("ESTIA2","");
    
    LoginController(String username,String password){
        this.username = username;
        this.password = password;
    }
    
    public boolean login(){
        username = username.replaceAll("[-+.^:,=']","");
        password = password.replaceAll("[-+.^:,=']","");
        return db.login("SELECT * FROM ADMIN_USERS WHERE USERNAME = '" + username + "' AND PASSWORD = '" + password + "'");
    }
}
