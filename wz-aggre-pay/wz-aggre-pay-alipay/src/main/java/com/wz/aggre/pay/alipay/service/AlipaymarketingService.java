package com.wz.aggre.pay.alipay.service;

import com.wz.aggre.pay.alipay.model.MarketCashCreateModel;

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

}
