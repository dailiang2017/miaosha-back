package com.dail.miaosha.controller;

import com.dail.miaosha.dto.GoodsODTO;
import com.dail.miaosha.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/goods")
public class GoodsController {

    @Autowired
    private GoodsService goodsService;

    @GetMapping("/queryList")
    public List<GoodsODTO> queryList() {
        return goodsService.queryList();
    }
}
