package com.wz.aggre.pay.alipay.model.pc;

import com.wz.aggre.pay.alipay.model.BaseAlipayConfig;
import com.wz.aggre.pay.alipay.model.ext.*;
import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * @author tianjunwei
 * 2019/3/16 11:36
 */

@Data
public class PcPayModel extends BaseAlipayConfig {

    private String out_trade_no;
    private String product_code;
    private double total_amount;
    private String subject;
    private String body;
    private Date time_expire;
    private List<GoodsDetail> goods_detail;
    private String passback_params;
    private ExtendParams extend_params;
    private String goods_type;
    private String timeout_express;
    private String promo_params;
    private Royalty_info royalty_info;
    private SubMerchant sub_merchant;
    private String enable_pay_channels;
    private String store_id;
    private String disable_pay_channels;
    private String qr_pay_mode;
    private int qrcode_width;
    private SettleInfo settle_info;
    private InvoiceInfo invoice_info;
    private AgreementSignParams agreement_sign_params;
    private String integration_type;
    private String request_from_url;
    private String business_params;
    private ExtUserInfo ext_user_info;

}
