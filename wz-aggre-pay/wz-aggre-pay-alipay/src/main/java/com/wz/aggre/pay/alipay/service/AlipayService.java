package com.wz.aggre.pay.alipay.service;

import com.wz.aggre.pay.alipay.model.*;
import com.wz.aggre.pay.alipay.model.app.AppPayModel;
import com.wz.aggre.pay.alipay.model.pc.PcPayModel;
import com.wz.aggre.pay.alipay.model.wap.WapPayModel;

/**
 *
 * 支付相关接口
 *
 * @author tianjunwei
 * @date 2019/3/27 15:40
 */

public interface AlipayService {

    /**
     *  app pay
     * @return
     */
    String appPay(AppPayModel appPayModel);

    /**
     * wap pay
     * @return
     */
    String wapPay(WapPayModel wapPayModel);


    /**
     * pc pay
     * @return
     */
    String pcPay(PcPayModel pcPayModel);


    /**
     * 交易预创建
     * @return
     */
    String tradePrecreate(TradePrecreateModel tradePrecreateModel);


    /**
     * 交易创建
     * @return
     */
    String tradeCreate(TradeCreateModel tradeCreateModel);


    /**
     * 交易支付
     * @return
     */
    String tradePay(TradePayModel tradePayModel);

    /**
     * 未支付交易关闭
     * @return
     */
    String tradeClose(TradeCloseModel tradeCloseModel);


    /**
     * 交易退款
     * @return
     */
    String tradeRefund(TradeRefundModel tradeRefundModel);

    /**
     * 退款查询
     * @return
     */
    String tradeRefundQuery(RefundQueryModel refundQueryModel);

    /**
     *  收单交易结算
     * @return
     */
    String orderSettle(OrderSettleModel orderSettleModel);


    /**
     * 交易查询
     * @return
     */
    String tradeQuery(TradeQueryModel tradeQueryModel);



}
