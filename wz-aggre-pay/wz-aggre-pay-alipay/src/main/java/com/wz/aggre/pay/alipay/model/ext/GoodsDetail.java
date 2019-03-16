package com.wz.aggre.pay.alipay.model.ext;

import lombok.Data;

/**
 * @author tianjunwei
 * 2019/3/16 11:38
 */
@Data
public class GoodsDetail {

    private String goods_id;
    private String alipay_goods_id;
    private String goods_name;
    private int quantity;
    private int price;
    private String goods_category;
    private String body;
    private String show_url;

}
