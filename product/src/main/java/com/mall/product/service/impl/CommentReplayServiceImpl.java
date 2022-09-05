package com.mall.product.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.mall.product.dao.CommentReplayDao;
import com.mall.product.dto.CommentReplayDTO;
import com.mall.product.entity.CommentReplayEntity;
import com.mall.product.service.CommentReplayService;
import io.renren.common.service.impl.CrudServiceImpl;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 商品评价回复关系
 *
 * @author yukai 634444980@11.com
 * @since 1.0.0 2022-09-04
 */
@Service
public class CommentReplayServiceImpl extends CrudServiceImpl<CommentReplayDao, CommentReplayEntity, CommentReplayDTO> implements CommentReplayService {

    @Override
    public QueryWrapper<CommentReplayEntity> getWrapper(Map<String, Object> params){
        String id = (String)params.get("id");

        QueryWrapper<CommentReplayEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(StringUtils.isNotBlank(id), "id", id);

        return wrapper;
    }


}