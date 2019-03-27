package com.wz.aggre.pay.alipay.model;

import lombok.Data;

/**
 *
 *  交易关闭
 *
 * @author tianjunwei
 * @date 2019/3/27 16:29
 */

@Data
public class TradeCloseModel extends BaseAlipayConfigModel {


    /**
     * 必选 该交易在支付宝系统中的交易流水号。最短 16 位，最长 64 位。和out_trade_no不能同时为空，如果同时传了 out_trade_no和 trade_no，则以 trade_no为准。
     */
    private String trade_no;

    /**
     * 必选 订单支付时传入的商户订单号,和支付宝交易号不能同时为空。 trade_no,out_trade_no如果同时存在优先取trade_no
     */
    private String out_trade_no;

    /**
     * 可选 卖家端自定义的的操作员 ID
     */
    private String operator_id;


}
