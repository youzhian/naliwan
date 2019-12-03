package com.wofang.naliwan.controller.usi;

import com.wofang.naliwan.controller.BaseController;
import com.wofang.naliwan.service.usi.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/usi")
public class UserInfoController extends BaseController {
    /**
     * 接口
     */
    @Autowired
    private UserInfoService userInfoService;

    public ModelAndView index(){
        ModelAndView mv = new ModelAndView("/userinfo/userInfo");

        return mv;
    }
}
