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
public class UserService {
    private UserDataRepository udr;

    UserService(UserDataRepositoryImpl udr) {
        this.udr = udr;
    }
    public void persistUser(User user){
        udr.save(user);
    }
}
