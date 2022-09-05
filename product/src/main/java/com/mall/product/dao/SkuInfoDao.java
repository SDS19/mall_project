package com.mall.product.dao;

import com.mall.product.entity.SkuInfoEntity;
import io.renren.common.dao.BaseDao;
import org.apache.ibatis.annotations.Mapper;

/**
 * sku信息
 *
 * @author yukai 634444980@11.com
 * @since 1.0.0 2022-09-04
 */
@Mapper
public interface SkuInfoDao extends BaseDao<SkuInfoEntity> {
	
}