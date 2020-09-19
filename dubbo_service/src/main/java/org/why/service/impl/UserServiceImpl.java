package org.why.service.impl;

import org.apache.dubbo.config.annotation.Service;
import org.why.service.UserService;

/**
 * @author ：why
 * @description：
 * @version:
 */
@Service(interfaceName = "userService1")
public class UserServiceImpl implements UserService {
    public String sayHello() {
        return "hello dubbo111111111111111";
    }
}
