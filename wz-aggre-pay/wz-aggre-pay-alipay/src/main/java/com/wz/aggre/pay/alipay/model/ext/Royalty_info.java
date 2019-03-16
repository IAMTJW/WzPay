package com.wz.aggre.pay.alipay.model.ext;

import lombok.Data;

import java.util.List;

/**
 * @author tianjunwei
 * 2019/3/16 11:40
 */

@Data
public class Royalty_info {


    private String royalty_type;
    private List<RoyaltyDetailInfos> royalty_detail_infos;

}
