package com.wayneSpring.Dao;

import com.wayneSpring.Entity.user;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.Collection;

/**
 * Created by Wayne.A.Z on 2018/4/24.
 */
@Repository
@Qualifier("mongoData")
public class MongoUserDaoImpl implements  userDao {



    @Override
    public Collection<user> getAllUsers() {
        return null;
    }

    @Override
    public user getUserByID(int id) {
        return null;
    }

    @Override
    public void deleteUserByID(int id) {

    }

    @Override
    public void updateUsers(user user) {

    }

    @Override
    public void insertUsertoDB(user user) {

    }
}
