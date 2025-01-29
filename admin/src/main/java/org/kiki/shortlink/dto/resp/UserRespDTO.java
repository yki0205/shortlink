package org.kiki.shortlink.dto.resp;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Data;
import org.kiki.shortlink.common.serialize.PhoneDesensitizationSerializer;
@Data
public class UserRespDTO {
    /**
     * id
     */
    private Long id;

    /**
     * 用户名
     */
    private String username;

    /**
     * 真实姓名
     */
    private String real_name;

    /**
     * 手机号
     */
    @JsonSerialize(using = PhoneDesensitizationSerializer.class)
    private String phone;

    /**
     * 邮箱
     */
    private String mail;
}
