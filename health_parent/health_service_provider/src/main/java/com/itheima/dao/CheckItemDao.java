package com.itheima.dao;

import com.github.pagehelper.Page;
import com.itheima.pojo.CheckItem;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CheckItemDao {
     Page<CheckItem> selectByCondition(String queryString);
}
