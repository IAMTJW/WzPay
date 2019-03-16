package com.wz.aggre.pay.alipay.model.ext;

import lombok.Data;

/**
 * @author tianjunwei
 * 2019/3/16 11:41
 */

@Data
public class SettleDetailInfos {

    private String trans_in_type;
    private String trans_in;
    private String summary_dimension;
    private String settle_entity_id;
    private String settle_entity_type;
    private double amount;

}
