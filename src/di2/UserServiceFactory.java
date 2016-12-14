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
public class UserServiceFactory {
    public UserService getInstance(){
        return new UserService(new UserDataRepositoryImpl());
    }
}
