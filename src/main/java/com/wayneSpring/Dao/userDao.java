package com.wayneSpring.Dao;

import com.wayneSpring.Entity.user;

import java.util.Collection;

/**
 * Created by Wayne.A.Z on 2018/4/24.
 */
public interface userDao {
    Collection<user> getAllUsers();

    user getUserByID(int id);

    void deleteUserByID(int id);

    void updateUsers(user user);

    void insertUsertoDB(user user);
}
