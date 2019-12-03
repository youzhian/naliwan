package com.wofang.naliwan.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wofang.naliwan.model.usi.UserInfo;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户管理
 * @author 游志安
 */
@Mapper
public interface UserInfoMapper extends BaseMapper<UserInfo> {

}
