package com.wz.aggre.pay.alipay.model.ext;

import lombok.Data;

/**
 * @author tianjunwei
 * 2019/3/16 11:42
 */

@Data
public class KeyInfo {

    private boolean is_support_invoice;
    private String invoice_merchant_name;
    private String tax_num;

}
