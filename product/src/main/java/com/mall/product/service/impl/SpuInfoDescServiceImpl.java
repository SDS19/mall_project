package com.mall.product.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.mall.product.dao.SpuInfoDescDao;
import com.mall.product.dto.SpuInfoDescDTO;
import com.mall.product.entity.SpuInfoDescEntity;
import com.mall.product.service.SpuInfoDescService;
import io.renren.common.service.impl.CrudServiceImpl;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * spu信息介绍
 *
 * @author yukai 634444980@11.com
 * @since 1.0.0 2022-09-04
 */
@Service
public class SpuInfoDescServiceImpl extends CrudServiceImpl<SpuInfoDescDao, SpuInfoDescEntity, SpuInfoDescDTO> implements SpuInfoDescService {

    @Override
    public QueryWrapper<SpuInfoDescEntity> getWrapper(Map<String, Object> params){
        String id = (String)params.get("id");

        QueryWrapper<SpuInfoDescEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(StringUtils.isNotBlank(id), "id", id);

        return wrapper;
    }


}