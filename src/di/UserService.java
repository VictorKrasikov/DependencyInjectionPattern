/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package di;

/**
 *
 * @author Victor
 */
public class UserService {
    private UserDataRepository udr;

    public UserService() {
        this.udr = new UserDataRepositoryImpl();
    }
    public void persistUser(User user){
        udr.save(user);
    }
}
