package com.mall.product.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * sku图片
 *
 * @author yukai 634444980@11.com
 * @since 1.0.0 2022-09-04
 */
@Data
@TableName("pms_sku_images")
public class SkuImagesEntity {

    /**
     * id
     */
	private Long id;
    /**
     * sku_id
     */
	private Long skuId;
    /**
     * 图片地址
     */
	private String imgUrl;
    /**
     * 排序
     */
	private Integer imgSort;
    /**
     * 默认图[0 - 不是默认图，1 - 是默认图]
     */
	private Integer defaultImg;
}