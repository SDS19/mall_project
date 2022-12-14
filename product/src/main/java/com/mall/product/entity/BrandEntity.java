package com.mall.product.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * 品牌
 *
 * @author yukai 634444980@11.com
 * @since 1.0.0 2022-09-04
 */
@Data
@TableName("pms_brand")
public class BrandEntity {

    /**
     * 品牌id
     */
	private Long brandId;
    /**
     * 品牌名
     */
	private String name;
    /**
     * 品牌logo地址
     */
	private String logo;
    /**
     * 介绍
     */
	private String descript;
    /**
     * 显示状态[0-不显示；1-显示]
     */
	private Integer showStatus;
    /**
     * 检索首字母
     */
	private String firstLetter;
    /**
     * 排序
     */
	private Integer sort;
}