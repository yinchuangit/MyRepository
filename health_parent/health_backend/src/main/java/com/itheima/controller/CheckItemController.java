package com.itheima.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.itheima.entity.PageResult;
import com.itheima.entity.QueryPageBean;
import com.itheima.service.CheckItemService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("checkitem/")
public class CheckItemController {
    @Reference
    private CheckItemService checkItemService;

    @RequestMapping("findPage")
    public PageResult select(@RequestBody QueryPageBean queryPageBean){
        return checkItemService.findPage(queryPageBean);
    }
}
