package com.yc.piclib.dao;


import com.yc.bean.Pic;
import org.apache.ibatis.annotations.Mapper;


@Mapper//tk.mybatis根据这个接口自动生成实现类
public interface PicMapper extends MisBaseMapper<Pic>{

}
