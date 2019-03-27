package com.wz.aggre.pay.alipay.model.pc;

import com.wz.aggre.pay.alipay.model.BaseAlipayConfigModel;
import com.wz.aggre.pay.alipay.model.ext.*;
import lombok.Data;

import java.util.List;

/**
 * @author tianjunwei
 * 2019/3/16 11:36
 */

@Data
public class PcPayModel extends BaseAlipayConfigModel {

    /**
     * 必填  商户订单号,64个字符以内、可包含字母、数字、下划线；需保证在商户端不重复
     */
    private String out_trade_no;

    /**
     * 必填 销售产品码，与支付宝签约的产品码名称。 注：目前仅支持FAST_INSTANT_TRADE_PAY
     */
    private String product_code;

    /**
     * 必填 订单总金额，单位为元，精确到小数点后两位，取值范围[0.01,100000000]。
     */
    private double total_amount;

    /**
     * 必填 订单标题
     */
    private String subject;

    /**
     *可选 订单描述
     */
    private String body;

    /**
     * 可选 绝对超时时间，格式为yyyy-MM-dd HH:mm:ss
     */
    private String  time_expire;

    /**
     * 可选 订单包含的商品列表信息，json格式，其它说明详见商品明细说明
     */
    private List<GoodsDetail> goods_detail;

    /**
     * 可选 公用回传参数，如果请求时传递了该参数，则返回给商户时会回传该参数。支付宝只会在同步返回（包括跳转回商户网站）和异步通知时将该参数原样返回。本参数必须进行UrlEncode之后才可以发送给支付宝。
     */
    private String passback_params;

    /**
     * 可选 业务扩展参数
     */
    private ExtendParams extend_params;

    /**
     * 可选 商品主类型 :0-虚拟类商品,1-实物类商品
     * 注：虚拟类商品不支持使用花呗渠道
     */
    private String goods_type;

    /**
     * 可选 该笔订单允许的最晚付款时间，逾期将关闭交易。取值范围：1m～15d。m-分钟，h-小时，d-天，1c-当天（1c-当天的情况下，无论交易何时创建，都在0点关闭）。 该参数数值不接受小数点， 如 1.5h，可转换为 90m
     */
    private String timeout_express;

    /**
     *  可选 优惠参数
     * 注：仅与支付宝协商后可用
     */
    private String promo_params;

    /**
     * 可选 描述分账信息，json格式，详见分账参数说明
     */
    private Royalty_info royalty_info;

    /**
     * 可选 间连受理商户信息体，当前只对特殊银行机构特定场景下使用此字段
     */
    private SubMerchant sub_merchant;

    /**
     * 可用渠道,用户只能在指定渠道范围内支付，多个渠道以逗号分割
     * 注，与disable_pay_channels互斥
     * 渠道列表：https://docs.open.alipay.com/common/wifww7
     */
    private String enable_pay_channels;

    /**
     *可选 商户门店编号
     */
    private String store_id;

    /**
     *
     * 可选
     *
     * 禁用渠道,用户不可用指定渠道支付，多个渠道以逗号分割
     * 注，与enable_pay_channels互斥
     * 渠道列表：https://docs.open.alipay.com/common/wifww7
     */
    private String disable_pay_channels;

    /**
     * 可选
     *
     * PC扫码支付的方式，支持前置模式和
     *
     * 跳转模式。
     * 前置模式是将二维码前置到商户
     * 的订单确认页的模式。需要商户在
     * 自己的页面中以 iframe 方式请求
     * 支付宝页面。具体分为以下几种：
     * 0：订单码-简约前置模式，对应 iframe 宽度不能小于600px，高度不能小于300px；
     * 1：订单码-前置模式，对应iframe 宽度不能小于 300px，高度不能小于600px；
     * 3：订单码-迷你前置模式，对应 iframe 宽度不能小于 75px，高度不能小于75px；
     * 4：订单码-可定义宽度的嵌入式二维码，商户可根据需要设定二维码的大小。
     *
     * 跳转模式下，用户的扫码界面是由支付宝生成的，不在商户的域名下。
     * 2：订单码-跳转模式
     *
     */
    private String qr_pay_mode;

    /**
     * 商户自定义二维码宽度
     * 注：qr_pay_mode=4时该参数生效
     */
    private int qrcode_width;

    /**
     * 描述结算信息，json格式，详见结算参数说明
     */
    private SettleInfo settle_info;

    /**
     * 开票信息
     */
    private InvoiceInfo invoice_info;

    /**
     * 签约参数，支付后签约场景使用
     */
    private AgreementSignParams agreement_sign_params;

    /**
     * 请求后页面的集成方式。
     * 取值范围：
     * 1. ALIAPP：支付宝钱包内
     * 2. PCWEB：PC端访问
     * 默认值为PCWEB。
     */
    private String integration_type;

    /**
     * 请求来源地址。如果使用ALIAPP的集成方式，用户中途取消支付会返回该地址。
     */
    private String request_from_url;

    /**
     * 商户传入业务信息，具体值要和支付宝约定，应用于安全，营销等参数直传场景，格式为json格式
     */
    private String business_params;

    /**
     * 外部指定买家
     */
    private ExtUserInfo ext_user_info;

}
