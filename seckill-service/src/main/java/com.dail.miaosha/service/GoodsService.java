package com.dail.miaosha.service;

import com.dail.miaosha.dto.GoodsODTO;
import com.dail.miaosha.mapper.GoodsDAO;
import com.dail.miaosha.mapper.SeckillGoodsDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsService {

    @Autowired
    private SeckillGoodsDAO seckillGoodsDAO;

    public List<GoodsODTO> queryList() {
        return seckillGoodsDAO.queryList();
    }
}
