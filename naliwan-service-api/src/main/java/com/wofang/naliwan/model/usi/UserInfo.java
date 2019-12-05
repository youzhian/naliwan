package com.wofang.naliwan.model.usi;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;

/**
 * 用户信息对象
 *
 * @author youzhian
 */
public class UserInfo {
    /**
     * 用户ID
     */
    @TableId("user_id")
    private Long userId;
    /**
     * 用户名
     */
    @TableField("user_name")
    private String userName;

    /**
     * 获取 用户ID
     *
     * @return userId 用户ID
     */
    public Long getUserId() {
        return this.userId;
    }

    /**
     * 设置 用户ID
     *
     * @param userId 用户ID
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 获取 用户名
     *
     * @return userName 用户名
     */
    public String getUserName() {
        return this.userName;
    }

    /**
     * 设置 用户名
     *
     * @param userName 用户名
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }
}
