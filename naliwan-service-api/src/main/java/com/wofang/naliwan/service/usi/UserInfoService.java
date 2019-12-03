package com.wofang.naliwan.service.usi;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wofang.naliwan.model.usi.UserInfo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * 用户信息接口
 * @author youzhian
 */
@FeignClient(value="naliwan-service")
public interface UserInfoService extends IService<UserInfo> {

    @GetMapping("queryUserByName")
    public List<UserInfo> queryUserByName(@RequestParam("userName") String userName);
}
