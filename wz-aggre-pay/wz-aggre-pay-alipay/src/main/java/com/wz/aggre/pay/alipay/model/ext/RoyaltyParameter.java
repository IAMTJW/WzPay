package com.wz.aggre.pay.alipay.model.ext;

import lombok.Data;

/**
 * @author tianjunwei
 * @date 2019/3/28 15:44
 */

@Data
public class RoyaltyParameter {

    private String trans_out;
    private String trans_in;
    private double amount;
    private int amount_percentage;
    private String desc;

}
