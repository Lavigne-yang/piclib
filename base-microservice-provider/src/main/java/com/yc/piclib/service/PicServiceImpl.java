package com.yc.piclib.service;

import com.yc.bean.Pic;
import com.yc.piclib.dao.PicMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PicServiceImpl implements PicService{


    @Autowired(required = false)
    private PicMapper picMapper;

    @Override
    public Pic getBook(Integer id) {
        return picMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Pic> findAll() {
        return picMapper.selectAll();
    }
}
