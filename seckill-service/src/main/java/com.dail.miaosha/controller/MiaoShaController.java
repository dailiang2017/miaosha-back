package com.dail.miaosha.controller;

import com.dail.miaosha.service.MiaoShaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/kill")
public class MiaoShaController {

    @Autowired
    private MiaoShaService miaoShaService;

    @GetMapping("/miaosha")
    public String miaosha(@PathVariable("id") Long id) {
        return null;
    }
}
