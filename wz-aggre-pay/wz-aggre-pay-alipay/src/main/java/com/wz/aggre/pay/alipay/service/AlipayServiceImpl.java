package com.wz.aggre.pay.alipay.service;

import com.alibaba.fastjson.JSON;
import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.request.*;
import com.alipay.api.response.*;
import com.wz.aggre.pay.alipay.model.*;
import com.wz.aggre.pay.alipay.model.app.AppPayModel;
import com.wz.aggre.pay.alipay.model.pc.PcPayModel;
import com.wz.aggre.pay.alipay.model.wap.WapPayModel;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * @author tianjunwei
 * @date 2019/3/27 16:09
 */

@Service
public class AlipayServiceImpl implements AlipayService {

    @Override
    public String appPay(AppPayModel appPayModel) {

        AlipayClient alipayClient = getAlipayClient(appPayModel);
        AlipayTradeAppPayRequest request = new AlipayTradeAppPayRequest();
        request.setBizContent("");
        try {
            AlipayTradeAppPayResponse response = alipayClient.pageExecute(request);
            if (response.isSuccess()) {
               return response.getBody();
            } else {
                return response.getMsg();
            }
        }catch (AlipayApiException ex){
            throw new IllegalStateException(ex);
        }
    }

    @Override
    public String wapPay(WapPayModel wapPayModel) {

        AlipayClient alipayClient = getAlipayClient(wapPayModel);
        AlipayTradeWapPayRequest request = new AlipayTradeWapPayRequest();
        request.setBizContent("");
        try {
            AlipayTradeWapPayResponse  response = alipayClient.pageExecute(request);
            if (response.isSuccess()) {
                return response.getBody();
            } else {
                return response.getMsg();
            }
        }catch (AlipayApiException ex){
            throw new IllegalStateException(ex);
        }
    }

    @Override
    public String pcPay(PcPayModel pcPayModel) {

        AlipayClient alipayClient = getAlipayClient(pcPayModel);
        AlipayTradePagePayRequest request = new AlipayTradePagePayRequest();
        request.setBizContent("");

        try {
            AlipayTradePagePayResponse response = alipayClient.pageExecute(request);
            if (response.isSuccess()) {
                return response.getBody();
            } else {
                return response.getMsg();
            }
        }catch (AlipayApiException ex){
            throw new IllegalStateException(ex);
        }
    }

    @Override
    public String tradePrecreate(TradePrecreateModel tradePrecreateModel) {

        AlipayClient alipayClient = getAlipayClient(tradePrecreateModel);
        AlipayTradePrecreateRequest request = new AlipayTradePrecreateRequest();
        request.setBizContent("");

        try {
            AlipayTradePrecreateResponse response = alipayClient.execute(request);
            if (response.isSuccess()) {
                return response.getBody();
            } else {
                return response.getMsg();
            }
        }catch (AlipayApiException ex){
            throw new IllegalStateException(ex);
        }
    }

    @Override
    public String tradeCreate(TradeCreateModel tradeCreateModel) {

        AlipayClient alipayClient = getAlipayClient(tradeCreateModel);
        AlipayTradeCreateRequest request = new AlipayTradeCreateRequest();

        Map<String,Object> params = new HashMap<String,Object>();
        params.put("out_trade_no",tradeCreateModel.getOut_trade_no());
        params.put("total_amount",tradeCreateModel.getTotal_amount());
        params.put("subject",tradeCreateModel.getSubject());
        params.put("buyer_id",tradeCreateModel.getBuyer_id());

        request.setBizContent(JSON.toJSONString(params));


        try {
            AlipayTradeCreateResponse response = alipayClient.execute(request);
            if (response.isSuccess()) {
                return response.getBody();
            } else {
                return response.getMsg();
            }
        }catch (AlipayApiException ex){
            throw new IllegalStateException(ex);
        }
    }

    @Override
    public String tradePay(TradePayModel tradePayModel) {

        AlipayClient alipayClient = getAlipayClient(tradePayModel);
        AlipayTradePayRequest request = new AlipayTradePayRequest();
        request.setBizContent("");

        Map<String,Object> params = new HashMap<String,Object>();
        params.put("out_trade_no",tradePayModel.getOut_trade_no());
        params.put("total_amount",tradePayModel.getTotal_amount());
        params.put("subject",tradePayModel.getSubject());

        params.put("scene",tradePayModel.getScene());
        params.put("auth_code",tradePayModel.getAuth_code());

        request.setBizContent(JSON.toJSONString(params));

        try {
            AlipayTradePayResponse response = alipayClient.execute(request);
            if (response.isSuccess()) {
                return response.getBody();
            } else {
                return response.getMsg();
            }
        }catch (AlipayApiException ex){
            throw new IllegalStateException(ex);
        }
    }

    @Override
    public String tradeClose(TradeCloseModel tradeCloseModel) {

        AlipayClient alipayClient = getAlipayClient(tradeCloseModel);
        AlipayTradeCloseRequest request = new AlipayTradeCloseRequest();
        request.setBizContent("");

        try {
            AlipayTradeCloseResponse response = alipayClient.execute(request);
            if (response.isSuccess()) {
                return response.getBody();
            } else {
                return response.getMsg();
            }
        }catch (AlipayApiException ex){
            throw new IllegalStateException(ex);
        }
    }

    @Override
    public String tradeRefund(TradeRefundModel tradeRefundModel) {

        AlipayClient alipayClient = getAlipayClient(tradeRefundModel);
        AlipayTradeRefundRequest request = new AlipayTradeRefundRequest();
        request.setBizContent("");


        try {
            AlipayTradeRefundResponse response = alipayClient.execute(request);
            if (response.isSuccess()) {
                return response.getBody();
            } else {
                return response.getMsg();
            }
        }catch (AlipayApiException ex){
            throw new IllegalStateException(ex);
        }
    }

    @Override
    public String tradeRefundQuery(RefundQueryModel refundQueryModel) {

        AlipayClient alipayClient = getAlipayClient(refundQueryModel);
        AlipayTradeFastpayRefundQueryRequest request = new AlipayTradeFastpayRefundQueryRequest();
        request.setBizContent("");
        try {
            AlipayTradeFastpayRefundQueryResponse response = alipayClient.execute(request);
            if (response.isSuccess()) {
                return response.getBody();
            } else {
                return response.getMsg();
            }
        }catch (AlipayApiException ex){
            throw new IllegalStateException(ex);
        }
    }

    @Override
    public String orderSettle(OrderSettleModel orderSettleModel) {

        AlipayClient alipayClient = getAlipayClient(orderSettleModel);
        AlipayTradeOrderSettleRequest request = new AlipayTradeOrderSettleRequest();
        request.setBizContent("");

        try {
            AlipayTradeOrderSettleResponse response = alipayClient.execute(request);
            if (response.isSuccess()) {
                return response.getBody();
            } else {
                return response.getMsg();
            }
        }catch (AlipayApiException ex){
            throw new IllegalStateException(ex);
        }
    }

    public AlipayClient getAlipayClient(BaseAlipayConfigModel baseAlipayConfig){
        AlipayClient alipayClient = new DefaultAlipayClient(baseAlipayConfig.getUrl(),baseAlipayConfig.getApp_id(),baseAlipayConfig.getRsa_private_key()
                ,baseAlipayConfig.getFormat(),baseAlipayConfig.getCharset(),baseAlipayConfig.getAlipay_public_key(),baseAlipayConfig.getSignType());
        return alipayClient;
    }

}
