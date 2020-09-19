package org.why.controller;

import org.apache.dubbo.config.annotation.Reference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.why.service.UserService;

/**
 * @author ：why
 * @description：
 * @version:
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Reference(interfaceName = "userService2")
    private UserService userService;

    @RequestMapping("/sayHello")
    public String sayYes() {
        return userService.sayHello();
    }
}
