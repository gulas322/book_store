package com.asheng.book_store.controller;

import com.asheng.book_store.domain.AdminOperationGrade;
import com.asheng.book_store.service.AdminOperationGradeService;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (AdminOperationGrade)表控制层
 *
 * @author makejava
 * @since 2020-12-02 14:35:17
 */
@Api(tags = "管理员操作等级相关API",value = "这个是values，并不知道有什么作用！")
@RestController
@RequestMapping("adminOperationGrade")
public class AdminOperationGradeController {
    /**
     * 服务对象
     */
    @Resource
    private AdminOperationGradeService adminOperationGradeService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public AdminOperationGrade selectOne(Integer id) {
        return this.adminOperationGradeService.queryById(id);
    }

}