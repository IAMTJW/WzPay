package com.wz.aggre.pay.alipay.model;

import lombok.Data;

import java.io.Serializable;

/**
 *   公共参数
 *
 * @author tianjunwei
 * 2019/3/16 10:54
 */

@Data
public class BaseAlipayConfigModel implements Serializable {


    // 商户appid
    private String app_id;

    // 私钥 pkcs8格式的
    private String rsa_private_key;

    //通知地址
    private String notify_url;

    //支持成功返回地址
    private String return_url;

    // 请求网关地址
    private String url = "https://openapi.alipay.com/gateway.do";

    // 编码
    private  String charset = "UTF-8";

    // 返回格式
    private   String format = "json";

    // 支付宝公钥
    private String alipay_public_key;

    // RSA2
    private  String signType = "RSA2";

}
