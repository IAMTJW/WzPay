package com.wz.aggre.pay.alipay.model;

import com.wz.aggre.pay.alipay.model.ext.RoyaltyParameter;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * 统一收单交易结算接口
 *
 * @author tianjunwei
 * 2019/3/16 11:02
 */

@Data
public class OrderSettleModel extends BaseAlipayConfigModel {

    /**
     * 必选 结算请求流水号 开发者自行生成并保证唯一性
     */
    private String out_request_no;

    /**
     * 必选 支付宝订单号
     */
    private String trade_no;


    /**
     * 	分账明细信息
     */
    private List<RoyaltyParameter> royalty_parameters;

}
