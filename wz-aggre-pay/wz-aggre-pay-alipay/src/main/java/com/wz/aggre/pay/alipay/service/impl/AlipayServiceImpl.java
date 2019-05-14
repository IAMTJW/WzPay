package com.wz.aggre.pay.alipay.service.impl;

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
import com.wz.aggre.pay.alipay.service.AlipayService;
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

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("out_trade_no", appPayModel.getOut_trade_no());
        params.put("total_amount", appPayModel.getTotal_amount());
        params.put("subject", appPayModel.getSubject());

        request.setBizContent(JSON.toJSONString(params));
        try {
            AlipayTradeAppPayResponse response = alipayClient.pageExecute(request);
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
    public String wapPay(WapPayModel wapPayModel) {

        AlipayClient alipayClient = getAlipayClient(wapPayModel);
        AlipayTradeWapPayRequest request = new AlipayTradeWapPayRequest();


        Map<String, Object> params = new HashMap<String, Object>();
        params.put("out_trade_no", wapPayModel.getOut_trade_no());
        params.put("total_amount", wapPayModel.getTotal_amount());
        params.put("subject", wapPayModel.getSubject());
        params.put("product_code", "QUICK_WAP_WAY");
        params.put("quit_url", wapPayModel.getQuit_url());

        request.setBizContent(JSON.toJSONString(params));

        try {
            AlipayTradeWapPayResponse response = alipayClient.pageExecute(request);
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
    public String pcPay(PcPayModel pcPayModel) {

        AlipayClient alipayClient = getAlipayClient(pcPayModel);
        AlipayTradePagePayRequest request = new AlipayTradePagePayRequest();


        Map<String, Object> params = new HashMap<String, Object>();
        params.put("out_trade_no", pcPayModel.getOut_trade_no());
        params.put("total_amount", pcPayModel.getTotal_amount());
        params.put("subject", pcPayModel.getSubject());
        params.put("goods_detail", JSON.toJSONString(pcPayModel.getGoods_detail()));

        request.setBizContent(JSON.toJSONString(params));

        try {
            AlipayTradePagePayResponse response = alipayClient.pageExecute(request);
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
    public String tradePrecreate(TradePrecreateModel tradePrecreateModel) {

        AlipayClient alipayClient = getAlipayClient(tradePrecreateModel);
        AlipayTradePrecreateRequest request = new AlipayTradePrecreateRequest();

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("out_trade_no", tradePrecreateModel.getOut_trade_no());
        params.put("total_amount", tradePrecreateModel.getTotal_amount());
        params.put("subject", tradePrecreateModel.getSubject());
        params.put("goods_detail", tradePrecreateModel.getGoods_detail());

        request.setBizContent(JSON.toJSONString(params));


        try {
            AlipayTradePrecreateResponse response = alipayClient.execute(request);
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
    public String tradeCreate(TradeCreateModel tradeCreateModel) {

        AlipayClient alipayClient = getAlipayClient(tradeCreateModel);
        AlipayTradeCreateRequest request = new AlipayTradeCreateRequest();

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("out_trade_no", tradeCreateModel.getOut_trade_no());
        params.put("total_amount", tradeCreateModel.getTotal_amount());
        params.put("subject", tradeCreateModel.getSubject());
        params.put("buyer_id", tradeCreateModel.getBuyer_id());

        request.setBizContent(JSON.toJSONString(params));


        try {
            AlipayTradeCreateResponse response = alipayClient.execute(request);
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
    public String tradePay(TradePayModel tradePayModel) {

        AlipayClient alipayClient = getAlipayClient(tradePayModel);
        AlipayTradePayRequest request = new AlipayTradePayRequest();
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("out_trade_no", tradePayModel.getOut_trade_no());
        params.put("total_amount", tradePayModel.getTotal_amount());
        params.put("subject", tradePayModel.getSubject());
        params.put("body",tradePayModel.getBody());

        params.put("scene", tradePayModel.getScene());
        params.put("auth_code", tradePayModel.getAuth_code());

        request.setBizContent(JSON.toJSONString(params));

        try {
            AlipayTradePayResponse response = alipayClient.execute(request);
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
    public String tradeCancel(TradeCancelModel tradeCancelModel) {
        AlipayClient alipayClient = getAlipayClient(tradeCancelModel);

        AlipayTradeCancelRequest request = new AlipayTradeCancelRequest();

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("out_trade_no", tradeCancelModel.getOut_trade_no());
        params.put("trade_no", tradeCancelModel.getTrade_no());

        request.setBizContent(JSON.toJSONString(params));

        try {
            AlipayTradeCancelResponse response = alipayClient.execute(request);
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
    public String tradeClose(TradeCloseModel tradeCloseModel) {

        AlipayClient alipayClient = getAlipayClient(tradeCloseModel);
        AlipayTradeCloseRequest request = new AlipayTradeCloseRequest();

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("out_trade_no", tradeCloseModel.getOut_trade_no());
        params.put("trade_no", tradeCloseModel.getTrade_no());

        request.setBizContent(JSON.toJSONString(params));

        try {
            AlipayTradeCloseResponse response = alipayClient.execute(request);
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
    public String tradeRefund(TradeRefundModel tradeRefundModel) {

        AlipayClient alipayClient = getAlipayClient(tradeRefundModel);
        AlipayTradeRefundRequest request = new AlipayTradeRefundRequest();

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("out_trade_no", tradeRefundModel.getOut_trade_no());
        params.put("trade_no", tradeRefundModel.getTrade_no());
        params.put("refund_amount", tradeRefundModel.getRefund_amount());
        params.put("out_request_no",tradeRefundModel.getOut_request_no());

        request.setBizContent(JSON.toJSONString(params));

        try {
            AlipayTradeRefundResponse response = alipayClient.execute(request);
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
    public String tradeRefundQuery(RefundQueryModel refundQueryModel) {

        AlipayClient alipayClient = getAlipayClient(refundQueryModel);
        AlipayTradeFastpayRefundQueryRequest request = new AlipayTradeFastpayRefundQueryRequest();

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("out_trade_no", refundQueryModel.getOut_trade_no());
        params.put("trade_no", refundQueryModel.getTrade_no());
        params.put("out_request_no", refundQueryModel.getOut_request_no());

        request.setBizContent(JSON.toJSONString(params));

        try {
            AlipayTradeFastpayRefundQueryResponse response = alipayClient.execute(request);
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
    public String orderSettle(OrderSettleModel orderSettleModel) {

        AlipayClient alipayClient = getAlipayClient(orderSettleModel);
        AlipayTradeOrderSettleRequest request = new AlipayTradeOrderSettleRequest();


        Map<String, Object> params = new HashMap<String, Object>();
        params.put("trade_no", orderSettleModel.getTrade_no());
        params.put("out_request_no", orderSettleModel.getOut_request_no());

        params.put("royalty_parameters",orderSettleModel.getRoyalty_parameters());

        request.setBizContent(JSON.toJSONString(params));

        try {
            AlipayTradeOrderSettleResponse response = alipayClient.execute(request);
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
    public String tradeQuery(TradeQueryModel tradeQueryModel) {

        AlipayClient alipayClient = getAlipayClient(tradeQueryModel);

        AlipayTradeQueryRequest request = new AlipayTradeQueryRequest();

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("trade_no", tradeQueryModel.getTrade_no());
        params.put("out_trade_no", tradeQueryModel.getOut_trade_no());

        request.setBizContent(JSON.toJSONString(params));

        try {
            AlipayTradeQueryResponse response = alipayClient.execute(request);
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
