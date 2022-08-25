package com.atguigu.yygh.hosp.controller;

import com.atguigu.yygh.hosp.service.HospitalSetService;
import com.atguigu.yygh.model.hosp.HospitalSet;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(tags = "医院设置管理")
@RestController
@RequestMapping("/admin/hosp/hospitalSet")
public class HospitalSetController {
    @Autowired
    private HospitalSetService hospitalSetService;

    // 1.查询医院设置表里所有数据
    @ApiOperation(value = "获取所有医院设置")
    @GetMapping("/findAll")
    public List<HospitalSet> findAllHospitalSet(){
        System.out.println("dlskjfksl");
        List<HospitalSet> list = hospitalSetService.list();

        return list;
    }

    // 2.逻辑删除医院设置
    @ApiOperation(value = "删除医院配置")
    @DeleteMapping("{id}")
    public boolean removeHospSet(@PathVariable Long id){
        boolean flag = hospitalSetService.removeById(id);
        return flag;
    }

}
