package com.assys.controller;

import com.assys.domian.User;
import com.assys.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.WebRequest;



@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public Result login(@RequestBody User user, WebRequest request){
        boolean flag = userService.login(user.getPhone(), user.getPassword());
        System.out.println(user);
        request.setAttribute("user",user,WebRequest.SCOPE_SESSION);
        return new Result(flag?Code.Login_OK:Code.Login_ERROR,flag);
    }

    @PutMapping
    private Result register(@RequestBody User user){
        boolean flag_phone = userService.selectByPhone(user.getPhone());
        if (!flag_phone){//判断电话号码是否已经存在
            boolean flag = userService.register(user);
            return new Result(flag ? Code.Register_OK:Code.Register_ERROR,flag);
        }else {
            System.out.println(user);
            return new Result(Code.Phone_Al_ERROR, false);
        }
    }
}
