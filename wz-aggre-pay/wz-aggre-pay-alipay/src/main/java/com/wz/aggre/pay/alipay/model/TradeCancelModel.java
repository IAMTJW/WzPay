package com.wz.aggre.pay.alipay.model;

import lombok.Data;

/**
 * 交易撤销接口
 * @author tianjunwei
 * @date 2019/3/27 16:33
 */


@Data
public class TradeCancelModel extends BaseAlipayConfigModel {


    /**
     * 必填 订单支付时传入的商户订单号,不能和 trade_no同时为空。
     */
    private String out_trade_no;

    /**
     * 必填 支付宝交易号，和商户订单号不能同时为空
     */
    private String trade_no;

}
