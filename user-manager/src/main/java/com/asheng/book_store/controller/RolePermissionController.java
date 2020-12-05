package com.asheng.book_store.controller;

import com.asheng.book_store.domain.RolePermission;
import com.asheng.book_store.service.RolePermissionService;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (RolePermission)表控制层
 *
 * @author makejava
 * @since 2020-12-02 14:35:32
 */
@Api(tags = "角色与权限相关联操作API",value = "这个是values，并不知道有什么作用！")
@RestController
@RequestMapping("rolePermission")
public class RolePermissionController {
    /**
     * 服务对象
     */
    @Resource
    private RolePermissionService rolePermissionService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public RolePermission selectOne(Integer id) {
        return this.rolePermissionService.queryById(id);
    }

}