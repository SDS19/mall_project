package com.mall.product.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * spu图片
 *
 * @author yukai 634444980@11.com
 * @since 1.0.0 2022-09-04
 */
@Data
@TableName("pms_spu_images")
public class SpuImagesEntity {

    /**
     * id
     */
	private Long id;
    /**
     * spu_id
     */
	private Long spuId;
    /**
     * 图片名
     */
	private String imgName;
    /**
     * 图片地址
     */
	private String imgUrl;
    /**
     * 顺序
     */
	private Integer imgSort;
    /**
     * 是否默认图
     */
	private Integer defaultImg;
}