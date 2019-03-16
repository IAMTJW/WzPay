package com.wz.aggre.pay.alipay.model;

import lombok.Data;

/**
 *
 *   统一收单交易退款查询
 *
 * @author tianjunwei
 * 2019/3/16 10:57
 */

@Data
public class RefundQueryModel extends BaseAlipayConfig{

    /**
     *支付宝交易号，和商户订单号不能同时为空
     */
    private String trade_no;

    /**
     * 订单支付时传入的商户订单号,和支付宝交易号不能同时为空。 trade_no,out_trade_no如果同时存在优先取trade_no
     */
    private String out_trade_no;

    /**
     * 请求退款接口时，传入的退款请求号，如果在退款请求时未传入，则该值为创建交易时的外部交易号
     */
    private String out_request_no;

}
