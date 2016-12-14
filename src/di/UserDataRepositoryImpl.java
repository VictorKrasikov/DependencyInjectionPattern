/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package di;


public class UserDataRepositoryImpl implements UserDataRepository {

    @Override
    public void save(User user) {
        System.out.println("User " + user.name + " was saved!!!");
    }
    
}
