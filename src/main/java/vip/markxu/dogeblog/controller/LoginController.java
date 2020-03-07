package vip.markxu.dogeblog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import vip.markxu.dogeblog.interfaces.ILogin;
import vip.markxu.dogeblog.vo.LoginVo;

import javax.annotation.Resource;

@Controller
public class LoginController {

    @Autowired
    private ILogin login;

    @PostMapping("/login")
    @ResponseBody
    public String login(LoginVo loginVo){

        return login.login(loginVo);
    }
}
