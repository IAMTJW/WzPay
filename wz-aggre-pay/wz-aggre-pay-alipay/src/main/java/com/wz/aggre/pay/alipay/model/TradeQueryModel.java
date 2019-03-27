package com.wz.aggre.pay.alipay.model;

import com.wz.aggre.pay.alipay.model.ext.GoodsDetail;
import lombok.Data;

import java.util.List;

/**
 * @author tianjunwei
 * 2019/3/27 21:05
 */

@Data
public class TradeQueryModel extends BaseAlipayConfigModel {

    /**
     *支付宝交易号，和商户订单号不能同时为空
     */
    private String trade_no;

    /**
     * 订单支付时传入的商户订单号,和支付宝交易号不能同时为空。 trade_no,out_trade_no如果同时存在优先取trade_no
     */
    private String out_trade_no;


}
