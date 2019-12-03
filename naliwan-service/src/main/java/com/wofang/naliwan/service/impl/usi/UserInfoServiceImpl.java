package com.wofang.naliwan.service.impl.usi;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wofang.naliwan.mapper.UserInfoMapper;
import com.wofang.naliwan.model.usi.UserInfo;
import com.wofang.naliwan.service.usi.UserInfoService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 用户信息接口实现类
 *
 * @author youzhian
 */
@Service
public class UserInfoServiceImpl extends ServiceImpl<UserInfoMapper,UserInfo> implements UserInfoService {

    @Override
    public List<UserInfo> queryUserByName(String userName) {
        return null;
    }
}
