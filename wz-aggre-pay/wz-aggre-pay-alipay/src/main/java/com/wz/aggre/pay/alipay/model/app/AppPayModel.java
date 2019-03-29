package com.wz.aggre.pay.alipay.model.app;

import com.wz.aggre.pay.alipay.model.BaseAlipayConfigModel;
import com.wz.aggre.pay.alipay.model.ext.ExtUserInfo;
import com.wz.aggre.pay.alipay.model.ext.ExtendParams;
import lombok.Data;

import java.util.Date;

/**
 *
 *  app支付
 *
 * @author tianjunwei
 * 2019/3/16 11:10
 */

@Data
public class AppPayModel extends BaseAlipayConfigModel {

    /**
     * 可选 该笔订单允许的最晚付款时间，逾期将关闭交易。取值范围：1m～15d。m-分钟，h-小时，d-天，1c-当天（1c-当天的情况下，无论交易何时创建，都在0点关闭）。 该参数数值不接受小数点， 如 1.5h，可转换为 90m。
     */
    private String timeout_express;

    /**
     * 可选 订单总金额，单位为元，精确到小数点后两位，取值范围[0.01,100000000]
     */
    private Double total_amount;

    /**
     * 可选  销售产品码，商家和支付宝签约的产品码
     */
    private String product_code;

    /**
     * 可选 对一笔交易的具体描述信息。如果是多种商品，请将商品描述字符串累加传给body。
     */
    private String body;

    /**
     * 可选 商品的标题/交易标题/订单标题/订单关键字等。
     */
    private String subject;

    /**
     * 可选 商户网站唯一订单号
     */
    private String out_trade_no;

    /**
     * 可选 绝对超时时间，格式为yyyy-MM-dd HH:mm。
     */
    private Date time_expire;

    /**
     *  可选 商品主类型 :0-虚拟类商品,1-实物类商品
     */
    private String goods_type;

    /**
     * 可选 优惠参数
     * 注：仅与支付宝协商后可用
     */
    private String promo_params;

    /**
     * 可选 公用回传参数，如果请求时传递了该参数，则返回给商户时会回传该参数。支付宝只会在同步返回（包括跳转回商户网站）和异步通知时将该参数原样返回。本参数必须进行UrlEncode之后才可以发送给支付宝。
     */
    private String passback_params;

    /**
     * 业务扩展参数
     */
    private ExtendParams extend_params;

    /**
     *
     */
    private int quantity;

    /**
     * 可用渠道，用户只能在指定渠道范围内支付
     * 当有多个渠道时用“,”分隔
     * 注，与disable_pay_channels互斥  pcredit,moneyFund,debitCardExpress
     */
    private String enable_pay_channels;

    /**
     * 商户门店编号
     */
    private String store_id;

    /**
     * 指定渠道，目前仅支持传入pcredit
     * 若由于用户原因渠道不可用，用户可选择是否用其他渠道支付。
     * 注：该参数不可与花呗分期参数同时传入
     */
    private String specified_channel;

    /**
     * 禁用渠道，用户不可用指定渠道支付
     * 当有多个渠道时用“,”分隔
     * 注，与enable_pay_channels互斥
     */
    private String disable_pay_channels;

    /**
     * 外部指定买家
     */
    private ExtUserInfo ext_user_info;

    /**
     * 商户传入业务信息，具体值要和支付宝约定，应用于安全，营销等参数直传场景，格式为json格式
     */
    private String business_params;


}