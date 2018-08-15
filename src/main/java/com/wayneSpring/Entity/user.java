package com.wayneSpring.Entity;

/**
 * Created by Wayne.A.Z on 2018/4/21.
 */
public class user {
    public int id;
    public String name;
    public user(){}

//keyboard shortcut: alt+insert

    public user(int id,String name) {
        this.id = id;
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.id=0;
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}
