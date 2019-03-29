package com.wz.aggre.pay.alipay.model.pass;

import com.wz.aggre.pay.alipay.model.BaseAlipayConfigModel;
import lombok.Data;

/**
 * @author tianjunwei
 * @date 2019/3/29 15:57
 */

@Data
public class PassTemplateModel extends BaseAlipayConfigModel {

    /**
     * 商户用于控制模版的唯一性。（可以使用时间戳保证唯一性）
     */
    private String unique_id;


    /**
     * 模板内容信息，遵循JSON规范，详情参见tpl_content参数说明：https://doc.open.alipay.com/doc2/detail.htm?treeId=193&articleId=105249&docType=1#tpl_content
     */
    private String tpl_content;

    private String params;

}
