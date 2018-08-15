package com.wayneSpring.service;

import com.wayneSpring.Dao.userDao;
import com.wayneSpring.Entity.user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by Wayne.A.Z on 2018/4/21.
 */

@Service
public class userService {
//@Autowired 注释，它可以对类成员变量、方法及构造函数进行标注，完成自动装配的工作。 通过 @Autowired的使用来消除 set ，get方法
    @Autowired
    @Qualifier("mongoData")
    private userDao userdao;//new an interface and call function on it and it works...

    public Collection<user> getAllUsers(){
        return new ArrayList<user>(){
            {
                add(new user(5, "Mario"));
            }
        };
    }
    public user getUserByID(int id){return userdao.getUserByID(id);}

    public void deleteUserByID(int id) { userdao.deleteUserByID(id);
    }
    public void updateUsers(user user){
        userdao.updateUsers(user);
    }

    public void insertUser(user user) {
        userdao.insertUsertoDB(user);
    }
}
