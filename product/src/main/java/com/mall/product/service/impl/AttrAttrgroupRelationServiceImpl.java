package com.mall.product.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.mall.product.dao.AttrAttrgroupRelationDao;
import com.mall.product.dto.AttrAttrgroupRelationDTO;
import com.mall.product.entity.AttrAttrgroupRelationEntity;
import com.mall.product.service.AttrAttrgroupRelationService;
import io.renren.common.service.impl.CrudServiceImpl;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 属性&属性分组关联
 *
 * @author yukai 634444980@11.com
 * @since 1.0.0 2022-09-04
 */
@Service
public class AttrAttrgroupRelationServiceImpl extends CrudServiceImpl<AttrAttrgroupRelationDao, AttrAttrgroupRelationEntity, AttrAttrgroupRelationDTO> implements AttrAttrgroupRelationService {

    @Override
    public QueryWrapper<AttrAttrgroupRelationEntity> getWrapper(Map<String, Object> params){
        String id = (String)params.get("id");

        QueryWrapper<AttrAttrgroupRelationEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(StringUtils.isNotBlank(id), "id", id);

        return wrapper;
    }


}