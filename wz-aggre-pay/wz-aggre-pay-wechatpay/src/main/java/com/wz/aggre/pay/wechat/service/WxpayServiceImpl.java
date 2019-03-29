package com.wz.aggre.pay.wechat.service;


import com.github.binarywang.wxpay.config.WxPayConfig;
import com.github.binarywang.wxpay.service.WxPayService;
import com.github.binarywang.wxpay.service.impl.WxPayServiceImpl;

/**
 * @author tianjunwei
 * @date 2019/3/28 19:00
 */

public class WxpayServiceImpl implements WxpayService {

    @Override
    public String appPay() {
        return null;
    }

    @Override
    public String refund() {
        return null;
    }

    public void getWxClient(){
        WxPayService wxpayService = new WxPayServiceImpl();
        WxPayConfig wxPayConfig = new WxPayConfig();

        wxPayConfig.setMchId("mchId");
        wxPayConfig.setAppId("appId");
        wxPayConfig.setKeyPath("certLocalPath");
        wxPayConfig.setMchKey("key");
        wxPayConfig.setNotifyUrl("notifyUrl");
        wxPayConfig.setTradeType("tradeType");
        wxpayService.setConfig(wxPayConfig);


    }

}
