package com.wz.aggre.pay.alipay.model.ext;

import lombok.Data;

/**
 * @author tianjunwei
 * 2019/3/16 11:44
 */

@Data
public class AgreementSignParams {

    private String personal_product_code;
    private String sign_scene;
    private String external_agreement_no;
    private String external_logon_id;
    private String sign_validity_period;
    private String third_party_type;
    private String buckle_app_id;
    private String buckle_merchant_id;
    private String promo_params;

}
