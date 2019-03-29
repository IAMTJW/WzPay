package com.wz.aggre.pay.alipay.model.pass;

import com.wz.aggre.pay.alipay.model.BaseAlipayConfigModel;
import lombok.Data;

/**
 * @author tianjunwei
 * @date 2019/3/29 16:02
 */

@Data
public class PassInstanceUpdateModel extends BaseAlipayConfigModel {


    /**
     * 必填 商户指定卡券唯一值，卡券JSON模板中fileInfo->serialNumber字段对应的值
     */
    private String serial_number;

    /**
     * 必填 代理商代替商户发放卡券后，再代替商户更新卡券时，此值为商户的pid/appid
     */
    private String channel_id;

    /**
     * 必填 券状态，支持更新为USED、CLOSED两种状态
     */
    private String status;


    /**
     * 核销码串值【当状态变更为USED时，建议传】。该值正常为模板中核销区域（Operation）对应的message值。
     */
    private String verify_code;

    /**
     * 核销方式，该值正常为模板中核销区域（Operation）对应的format值。verify_code和verify_type需同时传入
     */
    private String verify_type;

}
