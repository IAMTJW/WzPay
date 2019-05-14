package com.wz.aggre.pay.alipay.model.pass;

import com.wz.aggre.pay.alipay.model.BaseAlipayConfigModel;
import lombok.Data;

/**
 * @author tianjunwei
 * @date 2019/4/26 15:07
 */

@Data
public class CashlessvoucherModel extends BaseAlipayConfigModel {


    private String voucher_type;

    private String brand_name;

    private String publish_start_time;

    private String publish_end_time;

    private String voucher_valid_period;

    private String voucher_available_time;

    private String out_biz_no;

    private String voucher_description;

    private Integer voucher_quantity;

    private String params;

}
