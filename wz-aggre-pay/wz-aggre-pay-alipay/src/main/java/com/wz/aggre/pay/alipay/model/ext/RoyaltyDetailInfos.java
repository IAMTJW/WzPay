package com.wz.aggre.pay.alipay.model.ext;

import lombok.Data;

/**
 * @author tianjunwei
 * 2019/3/16 11:39
 */

@Data
public class RoyaltyDetailInfos {

    private int serial_no;
    private String trans_in_type;
    private String batch_no;
    private String out_relation_id;
    private String trans_out_type;
    private String trans_out;
    private String trans_in;
    private double amount;
    private String desc;
    private String amount_percentage;

}
