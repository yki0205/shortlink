package org.kiki.shortlink.controller;

import cn.hutool.core.bean.BeanUtil;
import lombok.RequiredArgsConstructor;
import org.kiki.shortlink.common.convention.result.Result;
import org.kiki.shortlink.common.convention.result.Results;
import org.kiki.shortlink.dto.req.UserRegisterReqDTO;
import org.kiki.shortlink.dto.resp.UserActualRespDTO;
import org.kiki.shortlink.dto.resp.UserRespDTO;
import org.kiki.shortlink.service.UserService;
import org.springframework.web.bind.annotation.*;

/*

用户管理
 */
@RestController
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;
    /**
     * 根据用户名查询用户信息
     */
    @GetMapping("/api/short-link/admin/v1/user/{username}")
    public Result<UserRespDTO> getUserByUsername(@PathVariable("username") String username) {
        return Results.success(userService.getUserByUsername(username));
    }

    /**
     * 根据用户名查询无脱敏用户信息
     */
    @GetMapping("/api/short-link/admin/v1/actual/user/{username}")
    public Result<UserActualRespDTO> getActualUserByUsername(@PathVariable("username") String username) {
        return Results.success(BeanUtil.toBean(userService.getUserByUsername(username), UserActualRespDTO.class));
    }
    /**
     * 查询用户名是否存在
     */

    @GetMapping("/api/short-link/admin/v1/user/has-username")
    public Result<Boolean> hasUsername(@RequestParam("username") String username) {
        return Results.success(userService.hasUsername(username));
    }
    /**
     * 注册用户
     */
    @PostMapping("/api/short-link/admin/v1/user")
    public Result<Void> register(@RequestBody UserRegisterReqDTO requestParam) {
        userService.register(requestParam);
        return Results.success();
    }




}
