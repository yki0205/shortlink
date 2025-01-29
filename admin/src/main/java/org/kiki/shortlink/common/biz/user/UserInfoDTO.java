package org.kiki.shortlink.common.biz.user;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.alibaba.fastjson2.annotation.JSONField;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserInfoDTO {

    /**
     * 用户 ID
     */
    @JSONField(name = "id")
    private String userId;

    /**
     * 用户名
     */
    private String username;

    /**
     * 真实姓名
     */
    private String realName;


}