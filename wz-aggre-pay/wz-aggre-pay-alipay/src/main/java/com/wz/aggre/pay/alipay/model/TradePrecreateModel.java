package com.wz.aggre.pay.alipay.model;

import com.wz.aggre.pay.alipay.model.ext.GoodsDetail;
import lombok.Data;

import java.util.List;

/**
 * @author tianjunwei
 * 2019/3/27 21:05
 */

@Data
public class TradePrecreateModel extends BaseAlipayConfigModel {

    /**
     * 必填 商户订单号,64个字符以内、只能包含字母、数字、下划线；需保证在商户端不重复
     */
    private String out_trade_no;

    /**
     * 必填 订单总金额，单位为元，精确到小数点后两位，取值范围[0.01,100000000] 如果同时传入了【打折金额】，【不可打折金额】，【订单总金额】三者，则必须满足如下条件：【订单总金额】=【打折金额】+【不可打折金额】
     */
    private double total_amount;


    /**
     * 必填 订单标题
     */
    private String subject;

    /**
     * 可选 订单包含的商品列表信息，json格式，其它说明详见商品明细说明
     */
    private List<GoodsDetail> goods_detail;
}
