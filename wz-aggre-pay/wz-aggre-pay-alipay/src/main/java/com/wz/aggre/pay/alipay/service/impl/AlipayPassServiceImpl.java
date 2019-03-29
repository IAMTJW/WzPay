package com.wz.aggre.pay.alipay.service.impl;

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
        request.setBizContent("{" +
                "\"unique_id\":\"20140709150010\"," +
                "\"tpl_content\":\"{\\\"logo\\\": \\\"\\\",\\\"strip\\\": null,\\\"icon\\\": null,\\\"content\\\": {}}\"" +
                "  }");
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
        request.setBizContent("{" +
                "\"tpl_id\":\"f038871a4b1151e8038bb9277c3d52e3\"," +
                "\"tpl_content\":\"{\\\"logo\\\": \\\"\\\",\\\"strip\\\": null,\\\"icon\\\": null,\\\"content\\\": {}}\"" +
                "  }");

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
        request.setBizContent("{" +
                "\"tpl_id\":\"f038871a4b1151e8038bb9277c3d52e3\"," +
                "\"tpl_params\":\"{\\\"title\\\":\\\"券标题\\\",\\\"channelID\\\":\\\"xxx\\\",\\\"serialNumer\\\":\\\"xxxx\\\"}\"," +
                "\"recognition_type\":\"1\"," +
                "\"recognition_info\":\"{\\\"partner_id\\\":\\\"2088102114633762\\\",\\\"out_trade_no\\\":\\\"1234567\\\"}\"" +
                "  }");

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
        request.setBizContent("{" +
                "\"serial_number\":\"209919213\"," +
                "\"channel_id\":\"2088918273\"," +
                "\"tpl_params\":\"{\\\"title\\\":\\\"券标题\\\",\\\"channelID\\\":\\\"xxx\\\",\\\"serialNumer\\\":\\\"xxxx\\\"}\"," +
                "\"status\":\"USED\"," +
                "\"verify_code\":\"8612231273\"," +
                "\"verify_type\":\"wave\"" +
                "  }");

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
