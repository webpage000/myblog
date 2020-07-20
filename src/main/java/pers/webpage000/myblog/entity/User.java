package pers.webpage000.myblog.entity;

import lombok.Data;

/**
 * @author 王思涵
 * @Description 用户实体表
 * @time 2020/6/4 23:10
 **/
@Data
public class User extends BasicEntity {

    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * 注册日期 sign up date
     */
    private String signDate;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 电话号码 telephone number
     */
    private String phone;

    @Override
    public String getTableName() {
        return "user_user";
    }
}
