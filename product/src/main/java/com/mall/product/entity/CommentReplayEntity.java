package com.mall.product.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * 商品评价回复关系
 *
 * @author yukai 634444980@11.com
 * @since 1.0.0 2022-09-04
 */
@Data
@TableName("pms_comment_replay")
public class CommentReplayEntity {

    /**
     * id
     */
	private Long id;
    /**
     * 评论id
     */
	private Long commentId;
    /**
     * 回复id
     */
	private Long replyId;
}