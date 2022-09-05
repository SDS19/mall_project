package com.mall.product.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.mall.product.dao.AttrDao;
import com.mall.product.dto.AttrDTO;
import com.mall.product.entity.AttrEntity;
import com.mall.product.service.AttrService;
import io.renren.common.service.impl.CrudServiceImpl;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 商品属性
 *
 * @author yukai 634444980@11.com
 * @since 1.0.0 2022-09-04
 */
@Service
public class AttrServiceImpl extends CrudServiceImpl<AttrDao, AttrEntity, AttrDTO> implements AttrService {

    @Override
    public QueryWrapper<AttrEntity> getWrapper(Map<String, Object> params){
        String id = (String)params.get("id");

        QueryWrapper<AttrEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(StringUtils.isNotBlank(id), "id", id);

        return wrapper;
    }


}