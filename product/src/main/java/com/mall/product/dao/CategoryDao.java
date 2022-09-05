package com.mall.product.dao;

import com.mall.product.entity.CategoryEntity;
import io.renren.common.dao.BaseDao;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 *
 * @author yukai 634444980@11.com
 * @since 1.0.0 2022-09-04
 */
@Mapper
public interface CategoryDao extends BaseDao<CategoryEntity> {
	
}