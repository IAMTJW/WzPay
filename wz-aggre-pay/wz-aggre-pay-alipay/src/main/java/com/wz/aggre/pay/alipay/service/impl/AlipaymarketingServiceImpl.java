package com.wz.aggre.pay.alipay.service.impl;

import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.request.*;
import com.alipay.api.response.*;
import com.wz.aggre.pay.alipay.model.BaseAlipayConfigModel;
import com.wz.aggre.pay.alipay.model.MarketCashCreateModel;
import com.wz.aggre.pay.alipay.service.AlipaymarketingService;
import org.springframework.stereotype.Service;

/**
 * @author tianjunwei
 * 2019/3/30 12:32
 */

@Service
public class AlipaymarketingServiceImpl implements AlipaymarketingService {

    @Override
    public String campaignCashCreate(MarketCashCreateModel marketCashCreateModel) {

        AlipayClient alipayClient = getAlipayClient(marketCashCreateModel);
        AlipayMarketingCampaignCashCreateRequest request = new AlipayMarketingCampaignCashCreateRequest();
        request.setBizContent(marketCashCreateModel.getParams());
        try {
            AlipayMarketingCampaignCashCreateResponse response = alipayClient.execute(request);
            if (response.isSuccess()) {
                return response.getBody();
            } else {
                return response.getMsg();
            }
        } catch (AlipayApiException ex) {
            throw new IllegalStateException(ex);
        }

    }

    @Override
    public String campaignCashTrigger(MarketCashCreateModel marketCashCreateModel) {

        AlipayClient alipayClient = getAlipayClient(marketCashCreateModel);
        AlipayMarketingCampaignCashTriggerRequest request = new AlipayMarketingCampaignCashTriggerRequest();
        request.setBizContent(marketCashCreateModel.getParams());
        try {
            AlipayMarketingCampaignCashTriggerResponse response = alipayClient.execute(request);
            if (response.isSuccess()) {
                return response.getBody();
            } else {
                return response.getMsg();
            }
        } catch (AlipayApiException ex) {
            throw new IllegalStateException(ex);
        }
    }


    @Override
    public String campaignCashListQueryRequest(MarketCashCreateModel marketCashCreateModel) {
        AlipayClient alipayClient = getAlipayClient(marketCashCreateModel);
        AlipayMarketingCampaignCashListQueryRequest request = new AlipayMarketingCampaignCashListQueryRequest();
        request.setBizContent(marketCashCreateModel.getParams());
        try {
            AlipayMarketingCampaignCashListQueryResponse response = alipayClient.execute(request);
            if (response.isSuccess()) {
                return response.getBody();
            } else {
                return response.getMsg();
            }
        } catch (AlipayApiException ex) {
            throw new IllegalStateException(ex);
        }
    }


    @Override
    public String campaignCashDetailQueryRequest(MarketCashCreateModel marketCashCreateModel) {

        AlipayClient alipayClient = getAlipayClient(marketCashCreateModel);
        AlipayMarketingCampaignCashDetailQueryRequest request = new AlipayMarketingCampaignCashDetailQueryRequest();
        request.setBizContent(marketCashCreateModel.getParams());
        try {
            AlipayMarketingCampaignCashDetailQueryResponse response = alipayClient.execute(request);
            if (response.isSuccess()) {
                return response.getBody();
            } else {
                return response.getMsg();
            }
        } catch (AlipayApiException ex) {
            throw new IllegalStateException(ex);
        }
    }

    @Override
    public String campaignCashStatus(MarketCashCreateModel marketCashCreateModel) {

        AlipayClient alipayClient = getAlipayClient(marketCashCreateModel);
        AlipayMarketingCampaignCashStatusModifyRequest request = new AlipayMarketingCampaignCashStatusModifyRequest();
        request.setBizContent(marketCashCreateModel.getParams());
        try {
            AlipayMarketingCampaignCashStatusModifyResponse response = alipayClient.execute(request);
            if (response.isSuccess()) {
                return response.getBody();
            } else {
                return response.getMsg();
            }
        } catch (AlipayApiException ex) {
            throw new IllegalStateException(ex);
        }
    }

    public AlipayClient getAlipayClient(BaseAlipayConfigModel baseAlipayConfig) {
        AlipayClient alipayClient = new DefaultAlipayClient(baseAlipayConfig.getUrl(), baseAlipayConfig.getApp_id(), baseAlipayConfig.getRsa_private_key()
                , baseAlipayConfig.getFormat(), baseAlipayConfig.getCharset(), baseAlipayConfig.getAlipay_public_key(), baseAlipayConfig.getSignType());
        return alipayClient;
    }
}
