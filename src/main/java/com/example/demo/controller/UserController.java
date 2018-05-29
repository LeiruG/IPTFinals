package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.response.ShopListResponse;
import com.example.demo.response.SystemResponse;
import com.example.demo.service.ShopService;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Lucem on 26/05/2018.
 */

@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    private ShopService shopService;


    @RequestMapping(value="/register",
            method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)//APPLICATION_JSON_VALUE
    @ResponseBody
    public SystemResponse addUser(
            @RequestBody User user
    ){
        userService.saveUser(user);
        return new SystemResponse(true,user.getUsername()+" is added successfully.");
    }

    @RequestMapping(value = "/login",
            method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public SystemResponse login(
            @RequestBody User user){
        SystemResponse systemResponse = new SystemResponse();
        systemResponse.setFlag(userService.login(user));
        if(systemResponse.isFlag()){
            systemResponse.setMsg("Welcome to the Unlucky Shop, " + user.getUsername());
        }else{
            systemResponse.setMsg("Wrong Username or Password");
        }
        return systemResponse;
    }

    @RequestMapping(value = "/shopList",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public ShopListResponse getItems(){
        ShopListResponse slr = new ShopListResponse();

        //Fetch all the items in the DB
        slr.setItems(shopService.getItems());

        //Assuming its Successful
        SystemResponse systemResponse = new SystemResponse(true,"Fetch Successful.");
        slr.setSystemResponse(systemResponse);

        return slr;
    }


}
