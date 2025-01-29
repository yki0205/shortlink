package org.kiki.shortlink.dao.entity;

import lombok.Data;

import com.baomidou.mybatisplus.annotation.TableName;
import org.kiki.shortlink.common.database.BaseDO;
import lombok.Data;
import com.baomidou.mybatisplus.annotation.TableField;

@Data
@TableName("t_user")
public class UserDO extends BaseDO {

    /**
     * id
     */
    private Long id;

    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * 真实姓名
     */
    @TableField("real_name")
    private String real_name;

    /**
     * 手机号
     */
    private String phone;

    /**
     * 邮箱
     */
    private String mail;

    /**
     * 注销时间戳
     */
    private Long deletionTime;
}
