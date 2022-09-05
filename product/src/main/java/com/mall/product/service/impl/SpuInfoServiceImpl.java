package com.mall.product.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.mall.product.dao.SpuInfoDao;
import com.mall.product.dto.SpuInfoDTO;
import com.mall.product.entity.SpuInfoEntity;
import com.mall.product.service.SpuInfoService;
import io.renren.common.service.impl.CrudServiceImpl;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * spu信息
 *
 * @author yukai 634444980@11.com
 * @since 1.0.0 2022-09-04
 */
@Service
public class SpuInfoServiceImpl extends CrudServiceImpl<SpuInfoDao, SpuInfoEntity, SpuInfoDTO> implements SpuInfoService {

    @Override
    public QueryWrapper<SpuInfoEntity> getWrapper(Map<String, Object> params){
        String id = (String)params.get("id");

        QueryWrapper<SpuInfoEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(StringUtils.isNotBlank(id), "id", id);

        return wrapper;
    }


}