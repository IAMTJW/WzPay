package com.wz.aggre.pay.alipay.service;

import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.wz.aggre.pay.alipay.model.BaseAlipayConfigModel;
import com.wz.aggre.pay.alipay.model.app.AppPayModel;
import com.wz.aggre.pay.alipay.model.pc.PcPayModel;
import com.wz.aggre.pay.alipay.model.wap.WapPayModel;
import org.springframework.stereotype.Service;

/**
 * @author tianjunwei
 * @date 2019/3/27 16:09
 */

@Service
public class AlipayServiceImpl implements AlipayService {

    @Override
    public String appPay(AppPayModel appPayModel) {

        AlipayClient alipayClient = getAlipayClient(appPayModel);

        return null;
    }

    @Override
    public String wapPay(WapPayModel wapPayModel) {

        AlipayClient alipayClient = getAlipayClient(wapPayModel);


        return null;
    }

    @Override
    public String pcPay(PcPayModel pcPayModel) {

        AlipayClient alipayClient = getAlipayClient(pcPayModel);

        return null;
    }

    @Override
    public String tradePrecreate() {
        return null;
    }

    @Override
    public String tradeCreate() {
        return null;
    }

    @Override
    public String tradePay() {
        return null;
    }

    @Override
    public String tradeClose() {
        return null;
    }

    @Override
    public String tradeRefund() {
        return null;
    }

    @Override
    public String tradeRefundQuery() {
        return null;
    }

    @Override
    public String orderSettle() {
        return null;
    }


    public AlipayClient getAlipayClient(BaseAlipayConfigModel baseAlipayConfig){
        AlipayClient alipayClient = new DefaultAlipayClient(baseAlipayConfig.getUrl(),baseAlipayConfig.getApp_id(),baseAlipayConfig.getRsa_private_key()
                ,baseAlipayConfig.getFormat(),baseAlipayConfig.getCharset(),baseAlipayConfig.getAlipay_public_key(),baseAlipayConfig.getSignType());
        return alipayClient;
    }

}
