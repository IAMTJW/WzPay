package com.wz.aggre.pay.alipay.service;

import com.wz.aggre.pay.alipay.model.pass.PassInstanceAddModel;
import com.wz.aggre.pay.alipay.model.pass.PassInstanceUpdateModel;
import com.wz.aggre.pay.alipay.model.pass.PassTemplateModel;

/**
 * @author tianjunwei
 * @date 2019/3/29 15:47
 */

public interface AlipayPassService {

    String passTemplateAdd(PassTemplateModel passTemplateModel);

    String passTemplateUpdate(PassTemplateModel passTemplateModel);

    String passInstanceAdd(PassInstanceAddModel passInstanceAddModel);

    String passInstanceUpdate(PassInstanceUpdateModel passInstanceUpdateModel);

}
