package com.smartpichub.service;

import com.smartpichub.model.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;
import com.smartpichub.model.vo.LoginUserVO;

import javax.servlet.http.HttpServletRequest;

/**
* @author derhi
* @description 针对表【user(用户)】的数据库操作Service
* @createDate 2026-02-21 00:00:26
*/
public interface UserService extends IService<User> {

    /**
     * 用户注册
     * @param userAccount 用户账户
     * @param userPassword 用户密码
     * @param checkPassword 校验密码
     * @return 新用户 id
     */
    long userRegister(String userAccount, String userPassword, String checkPassword);

    /**
     * 用户登录
     *
     * @param userAccount  用户账户
     * @param userPassword 用户密码
     * @param request
     * @return 脱敏后的用户信息
     */
    LoginUserVO userLogin(String userAccount, String userPassword, HttpServletRequest request);


    /**
     * 获取当前登录用户
     *
     * @param request
     * @return
     */
    User getLoginUser(HttpServletRequest request);

    LoginUserVO getLoginUserVO(User loginUser);

    /**
     * 用户注销
     *
     * @param request
     * @return
     */
    boolean userLogout(HttpServletRequest request);

}
