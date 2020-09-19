package org.why.service.impl;

import org.apache.dubbo.config.annotation.Service;
import org.why.service.UserService;

/**
 * @author ：why
 * @description：
 * @version:
 */
@Service(interfaceName = "userService2")
public class UserServiceImpl2 implements UserService {
    public String sayHello() {
        return "hello dubbo 22222222222222222222222222222222222222";
    }
}
