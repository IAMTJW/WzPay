package com.wz.aggre.pay.alipay.service.impl;

import com.alibaba.fastjson.JSON;
import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.request.AlipayPassInstanceAddRequest;
import com.alipay.api.request.AlipayPassInstanceUpdateRequest;
import com.alipay.api.request.AlipayPassTemplateAddRequest;
import com.alipay.api.request.AlipayPassTemplateUpdateRequest;
import com.alipay.api.response.*;
import com.wz.aggre.pay.alipay.model.BaseAlipayConfigModel;
import com.wz.aggre.pay.alipay.model.pass.PassInstanceAddModel;
import com.wz.aggre.pay.alipay.model.pass.PassInstanceUpdateModel;
import com.wz.aggre.pay.alipay.model.pass.PassTemplateModel;
import com.wz.aggre.pay.alipay.service.AlipayPassService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * @author tianjunwei
 * @date 2019/3/29 16:15
 */

@Service
public class AlipayPassServiceImpl implements AlipayPassService {

    @Override
    public String passTemplateAdd(PassTemplateModel passTemplateModel) {


        AlipayClient alipayClient = getAlipayClient(passTemplateModel);
        AlipayPassTemplateAddRequest request = new AlipayPassTemplateAddRequest();

        Map<String, Object> params = new HashMap<String, Object>();

        params.put("unique_id", passTemplateModel.getUnique_id());
        params.put("tpl_content", passTemplateModel.getTpl_content());

        request.setBizContent(JSON.toJSONString(params));
        try {
            AlipayPassTemplateAddResponse response = alipayClient.execute(request);
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
    public String passTemplateUpdate(PassTemplateModel passTemplateModel) {


        AlipayClient alipayClient = getAlipayClient(passTemplateModel);
        AlipayPassTemplateUpdateRequest request = new AlipayPassTemplateUpdateRequest();
        Map<String, Object> params = new HashMap<String, Object>();

        params.put("unique_id", passTemplateModel.getUnique_id());
        params.put("tpl_content", passTemplateModel.getTpl_content());

        request.setBizContent(JSON.toJSONString(params));
        try {
            AlipayPassTemplateUpdateResponse response = alipayClient.execute(request);
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
    public String passInstanceAdd(PassInstanceAddModel passInstanceAddModel) {

        AlipayClient alipayClient = getAlipayClient(passInstanceAddModel);
        AlipayPassInstanceAddRequest request = new AlipayPassInstanceAddRequest();

        Map<String, Object> params = new HashMap<String, Object>();

        params.put("tpl_id", passInstanceAddModel.getTpl_id());
        params.put("tpl_params", passInstanceAddModel.getTpl_params());
        params.put("recognition_type", passInstanceAddModel.getRecognition_type());
        params.put("recognition_info", passInstanceAddModel.getRecognition_type());


        request.setBizContent(JSON.toJSONString(params));

        try {
            AlipayPassInstanceAddResponse response = alipayClient.execute(request);
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
    public String passInstanceUpdate(PassInstanceUpdateModel passInstanceUpdateModel) {


        AlipayClient alipayClient = getAlipayClient(passInstanceUpdateModel);
        AlipayPassInstanceUpdateRequest request = new AlipayPassInstanceUpdateRequest();

        Map<String, Object> params = new HashMap<String, Object>();

        params.put("serial_number", passInstanceUpdateModel.getSerial_number());
        params.put("channel_id", passInstanceUpdateModel.getChannel_id());
        params.put("status", passInstanceUpdateModel.getStatus());
        params.put("verify_code", passInstanceUpdateModel.getVerify_code());
        params.put("verify_type", passInstanceUpdateModel.getVerify_type());

        request.setBizContent(JSON.toJSONString(params));

        try {
            AlipayPassInstanceUpdateResponse response = alipayClient.execute(request);
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
