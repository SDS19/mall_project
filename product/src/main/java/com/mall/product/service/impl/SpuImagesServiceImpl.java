package com.mall.product.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.mall.product.dao.SpuImagesDao;
import com.mall.product.dto.SpuImagesDTO;
import com.mall.product.entity.SpuImagesEntity;
import com.mall.product.service.SpuImagesService;
import io.renren.common.service.impl.CrudServiceImpl;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * spu图片
 *
 * @author yukai 634444980@11.com
 * @since 1.0.0 2022-09-04
 */
@Service
public class SpuImagesServiceImpl extends CrudServiceImpl<SpuImagesDao, SpuImagesEntity, SpuImagesDTO> implements SpuImagesService {

    @Override
    public QueryWrapper<SpuImagesEntity> getWrapper(Map<String, Object> params){
        String id = (String)params.get("id");

        QueryWrapper<SpuImagesEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(StringUtils.isNotBlank(id), "id", id);

        return wrapper;
    }


}