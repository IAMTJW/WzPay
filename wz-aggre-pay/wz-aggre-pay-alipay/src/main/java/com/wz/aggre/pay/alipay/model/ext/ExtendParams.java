package com.wz.aggre.pay.alipay.model.ext;

import lombok.Data;

/**
 * @author tianjunwei
 * 2019/3/16 11:15
 */

@Data
public class ExtendParams {


    /**
     * 系统商编号
     * 该参数作为系统商返佣数据提取的依据，请填写系统商签约协议的PID
     */
    private String sys_service_provider_id;

    /**
     * 使用花呗分期要进行的分期数
     */
    private String hb_fq_num;

    /**
     * 使用花呗分期需要卖家承担的手续费比例的百分值，传入100代表100%
     */
    private String hb_fq_seller_percent;

    /**
     * 行业数据回流信息, 详见：地铁支付接口参数补充说明
     */
    private String industry_reflux_info;

    /**
     * 卡类型
     */
    private String card_type;

}
