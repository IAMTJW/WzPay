package com.wz.aggre.pay.alipay.service;

import com.wz.aggre.pay.alipay.model.MarketCashCreateModel;
import com.wz.aggre.pay.alipay.model.pass.CashlessvoucherModel;
import com.wz.aggre.pay.alipay.model.pass.SendCashlessvoucherModel;

/**
 *  现金活动相关接口
 *
 * @author tianjunwei
 * 2019/3/30 12:30
 */
public interface AlipaymarketingService {

    String campaignCashCreate(MarketCashCreateModel marketCashCreateModel);

    String campaignCashTrigger(MarketCashCreateModel marketCashCreateModel);

    String campaignCashListQueryRequest(MarketCashCreateModel marketCashCreateModel);

    String campaignCashDetailQueryRequest(MarketCashCreateModel marketCashCreateModel);

    String campaignCashStatus(MarketCashCreateModel marketCashCreateModel);


    //无资金券模板创建接口
    String cashlessvoucherCreate(CashlessvoucherModel cashlessvoucherModel);

    //模板修改
    String cashlessvoucherModify();

    //券发放
    String voucherSend(SendCashlessvoucherModel sendCashlessvoucherModel);



}
