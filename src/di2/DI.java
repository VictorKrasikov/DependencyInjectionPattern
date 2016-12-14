/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package di2;



/**
 *
 * @author Victor
 */
public class DI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new UserServiceFactory().getInstance().persistUser(new User("Vasili"));
        
        
    }
    
}
