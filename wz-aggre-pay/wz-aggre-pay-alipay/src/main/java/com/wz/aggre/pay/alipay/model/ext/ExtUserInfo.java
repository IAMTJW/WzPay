package com.wz.aggre.pay.alipay.model.ext;

import lombok.Data;

/**
 * @author tianjunwei
 * 2019/3/16 11:14
 */

@Data
public class ExtUserInfo {

    /**
     * 姓名
     */
    private String name;

    /**
     * 手机号
     */
    private String mobile;

    /**
     * 身份证：IDENTITY_CARD、护照：PASSPORT、军官证：OFFICER_CARD、士兵证：SOLDIER_CARD、户口本：HOKOU等。如有其它类型需要支持，请与蚂蚁金服工作人员联系。
     */
    private String cert_type;

    /**
     * 证件号
     */
    private String cert_no;

    /**
     * 允许的最小买家年龄，买家年龄必须大于等于所传数值
     * 注：
     * 1. need_check_info=T时该参数才有效
     * 2. min_age为整数，必须大于等于0
     */
    private String min_age;

    /**
     * 是否强制校验付款人身份信息
     * T:强制校验，F：不强制
     */
    private String fix_buyer;

    /**
     * 是否强制校验身份信息
     * T:强制校验，F：不强制
     */
    private String need_check_info;

}
