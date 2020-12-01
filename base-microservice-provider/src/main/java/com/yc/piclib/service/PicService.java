package com.yc.piclib.service;

import com.yc.bean.Pic;

import java.util.List;

public interface PicService {

    public Pic getBook(Integer id);

    public List<Pic> findAll();
}
