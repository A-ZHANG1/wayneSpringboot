package com.wayneSpring.Dao;

import com.wayneSpring.Entity.user;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Wayne.A.Z on 2018/4/21.
 */

//'Repository' annotation makes sure spring initialize all following beans
    //without constructor been called else where
@Repository
@Qualifier("fakeData")//what to be used in service
public class FakeuserDaoImpl implements userDao {
    //a really weird way to initialize hash map here
private static Map<Integer, user> users;
static {
    users=new HashMap<Integer, user>(){
        {
            put(1,new user(1,"Marry"));
            put(2,new user(2,"John"));
            put(3,new user(3,"Leon"));
        }
    };
}

@Override
public Collection<user> getAllUsers(){
    return this.users.values();
}

@Override
public user getUserByID(int id){
    return this.users.get(id);
    }

    @Override
    public void deleteUserByID(int id){
    this.users.remove(id);
    }

    @Override
    public void updateUsers(user user){
        user user1=users.get(user.getId());
        user1.setId(user.getId());
        user1.setName(user.getName());
        users.put(user1.getId(),user1);
    }

    @Override
    public void insertUsertoDB(user user) {
        users.put(user.getId(),user);
    }
}
