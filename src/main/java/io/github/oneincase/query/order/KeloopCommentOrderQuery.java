package io.github.oneincase.query.order;

import lombok.Data;

/**
 * 评论配送员参数对象
 */
@Data
public class KeloopCommentOrderQuery {

    /**
     * trade_no
     * 必填:是	string
     * 配送订单的订单单号，如：16120709314700002
     */
    private String trade_no;
    /**
     * score
     * 必填:是	string
     * 评论分数，可选：1,2,3,4,5
     */
    private String score;
    /**
     * content
     * 必填:是	string
     * 评论内容
     */
    private String content;

}
