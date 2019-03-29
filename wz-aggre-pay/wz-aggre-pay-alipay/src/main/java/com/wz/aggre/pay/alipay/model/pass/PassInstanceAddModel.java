package com.wz.aggre.pay.alipay.model.pass;

import com.wz.aggre.pay.alipay.model.BaseAlipayConfigModel;
import lombok.Data;

/**
 * @author tianjunwei
 * @date 2019/3/29 16:02
 */

@Data
public class PassInstanceAddModel extends BaseAlipayConfigModel {


    /**
     * 必填 支付宝pass模版ID，即调用模板创建接口时返回的tpl_id。
     */
    private String tpl_id;

    /**
     * 必填 模版动态参数信息：对应模板中$变量名$的动态参数，见模板创建接口返回值中的tpl_params字段
     */
    private String tpl_params;

    /**
     * 必填 Alipass添加对象识别类型：1–订单信息
     */
    private String recognition_type;

    /**
     * 必填 支付宝用户识别信息：
     * 包括partner_id（商户的签约账号）和out_trade_no（某笔订单号）
     */
    private String recognition_info;

    private String params;

}
