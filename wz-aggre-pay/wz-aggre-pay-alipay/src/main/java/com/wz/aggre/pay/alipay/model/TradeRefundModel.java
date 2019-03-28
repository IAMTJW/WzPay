package com.wz.aggre.pay.alipay.model;

import lombok.Data;

/**
 * 交易退款接口
 * @author tianjunwei
 * @date 2019/3/27 16:33
 */


@Data
public class TradeRefundModel extends BaseAlipayConfigModel {


    /**
     * 必填 订单支付时传入的商户订单号,不能和 trade_no同时为空。
     */
    private String out_trade_no;

    /**
     * 必填 支付宝交易号，和商户订单号不能同时为空
     */
    private String trade_no;

    /**
     * 必填 需要退款的金额，该金额不能大于订单金额,单位为元，支持两位小数
     */
    private double refund_amount;

    /**
     * 必填 部分退款
     */
    private String out_request_no;


    /**
     * 退款原因
     */
    private String refund_reason;
}
