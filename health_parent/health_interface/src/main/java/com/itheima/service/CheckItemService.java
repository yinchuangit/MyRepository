package com.itheima.service;

import com.itheima.entity.PageResult;
import com.itheima.entity.QueryPageBean;

public interface CheckItemService {
     PageResult findPage(QueryPageBean queryPageBean);
}
