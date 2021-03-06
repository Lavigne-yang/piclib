package com.yc.piclib.domain;

import lombok.Data;

import java.util.List;

//分页的实体.
@Data
public class PageDomain<T> {
    private Integer page = 1;   //当前第几页
    private Integer pageSize = 10;  //总页数
    private Long total = 0L;  //总记录数
    private  Integer totalPages;

    private List<T> data;


}
