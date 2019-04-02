package com.dail.miaosha.dto;

import lombok.Data;

import java.text.DecimalFormat;

/**
 * @Description:
 * @Author: dail
 * @CreateDate: 2019/4/2 15:59
 */
@Data
public class GoodsODTO {

    //秒杀商品表的主键
    private Long id;

    private Long goodsId;
    //商品名称
    private String goodsName;
    //商品标题
    private String goodsTitle;
    //商品图片
    private String goodsImg;
    //商品描述
    private String goodsDesc;
    //原价
    private Long goodsPrice;
    //原库存
    private Long goodsStock;
    //场次
    private Long seckillSceneId;
    //秒杀价
    private Long seckillGoodsPrice;
    //秒杀库存
    private Long seckillGoodsStock;
    //秒杀总库存
    private Long seckillTotalStock;
    //百分比
    private String percentage;

    DecimalFormat df = new DecimalFormat("#");

    public String getPercentage() {
        return df.format((Double.longBitsToDouble(seckillGoodsStock)/Double.longBitsToDouble(seckillTotalStock))*100);
    }
}
