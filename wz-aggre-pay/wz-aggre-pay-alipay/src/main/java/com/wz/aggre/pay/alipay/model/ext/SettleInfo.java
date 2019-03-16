package com.wz.aggre.pay.alipay.model.ext;

import lombok.Data;

import java.util.List;

/**
 * @author tianjunwei
 * 2019/3/16 11:42
 */

@Data
public class SettleInfo {

    private List<SettleDetailInfos> settle_detail_infos;

}
