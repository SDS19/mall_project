package com.mall.product.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * sku信息
 *
 * @author yukai 634444980@11.com
 * @since 1.0.0 2022-09-04
 */
@Data
@TableName("pms_sku_info")
public class SkuInfoEntity {

    /**
     * skuId
     */
	private Long skuId;
    /**
     * spuId
     */
	private Long spuId;
    /**
     * sku名称
     */
	private String skuName;
    /**
     * sku介绍描述
     */
	private String skuDesc;
    /**
     * 所属分类id
     */
	private Long catalogId;
    /**
     * 品牌id
     */
	private Long brandId;
    /**
     * 默认图片
     */
	private String skuDefaultImg;
    /**
     * 标题
     */
	private String skuTitle;
    /**
     * 副标题
     */
	private String skuSubtitle;
    /**
     * 价格
     */
	private BigDecimal price;
    /**
     * 销量
     */
	private Long saleCount;
}