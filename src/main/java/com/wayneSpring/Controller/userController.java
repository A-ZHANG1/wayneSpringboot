package com.wayneSpring.Controller;

import com.wayneSpring.Entity.user;
import com.wayneSpring.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

/**
 * Created by Wayne.A.Z on 2018/4/21.
 */
@RestController
@RequestMapping("/users")
public class userController {

    @Autowired
    private userService userService;

    @RequestMapping(method= RequestMethod.GET)
    public Collection<user> getAllUsers(){return userService.getAllUsers();}

    @RequestMapping(value="/{id}",method=RequestMethod.DELETE)
    public void deleteUserByID(@PathVariable("id") int id){userService.deleteUserByID(id);}

   @RequestMapping(value="/{id}",method=RequestMethod.GET)
    public user getUserByID(@PathVariable("id") int id){return userService.getUserByID(id);}

    @RequestMapping(method=RequestMethod.PUT,consumes= MediaType.APPLICATION_JSON_VALUE)
    public void updateUsers(@RequestBody user user){userService.updateUsers(user);}

   @RequestMapping(method=RequestMethod.POST,consumes= MediaType.APPLICATION_JSON_VALUE)
    public void insertUser(@RequestBody user user){userService.insertUser(user);}

}
