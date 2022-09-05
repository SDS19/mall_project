package com.mall.product.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.mall.product.dao.SkuInfoDao;
import com.mall.product.dto.SkuInfoDTO;
import com.mall.product.entity.SkuInfoEntity;
import com.mall.product.service.SkuInfoService;
import io.renren.common.service.impl.CrudServiceImpl;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * sku信息
 *
 * @author yukai 634444980@11.com
 * @since 1.0.0 2022-09-04
 */
@Service
public class SkuInfoServiceImpl extends CrudServiceImpl<SkuInfoDao, SkuInfoEntity, SkuInfoDTO> implements SkuInfoService {

    @Override
    public QueryWrapper<SkuInfoEntity> getWrapper(Map<String, Object> params){
        String id = (String)params.get("id");

        QueryWrapper<SkuInfoEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(StringUtils.isNotBlank(id), "id", id);

        return wrapper;
    }


}