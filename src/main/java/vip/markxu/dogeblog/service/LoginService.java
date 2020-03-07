package vip.markxu.dogeblog.service;

import org.springframework.stereotype.Service;
import vip.markxu.dogeblog.interfaces.ILogin;
import vip.markxu.dogeblog.vo.LoginVo;

@Service
public class LoginService implements ILogin {

    @Override
    public String login(LoginVo loginVo) {
        return "username:"+loginVo.getName();
    }
}
