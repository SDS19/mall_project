package com.mall.product.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.mall.product.dao.SkuSaleAttrValueDao;
import com.mall.product.dto.SkuSaleAttrValueDTO;
import com.mall.product.entity.SkuSaleAttrValueEntity;
import com.mall.product.service.SkuSaleAttrValueService;
import io.renren.common.service.impl.CrudServiceImpl;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * sku销售属性&值
 *
 * @author yukai 634444980@11.com
 * @since 1.0.0 2022-09-04
 */
@Service
public class SkuSaleAttrValueServiceImpl extends CrudServiceImpl<SkuSaleAttrValueDao, SkuSaleAttrValueEntity, SkuSaleAttrValueDTO> implements SkuSaleAttrValueService {

    @Override
    public QueryWrapper<SkuSaleAttrValueEntity> getWrapper(Map<String, Object> params){
        String id = (String)params.get("id");

        QueryWrapper<SkuSaleAttrValueEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(StringUtils.isNotBlank(id), "id", id);

        return wrapper;
    }


}