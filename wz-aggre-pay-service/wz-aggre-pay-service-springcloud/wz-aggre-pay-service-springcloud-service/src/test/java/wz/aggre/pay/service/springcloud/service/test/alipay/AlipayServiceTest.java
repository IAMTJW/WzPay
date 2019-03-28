package wz.aggre.pay.service.springcloud.service.test.alipay;

import com.wz.aggre.pay.alipay.service.AlipayService;
import org.junit.Test;
import wz.aggre.pay.service.springcloud.service.test.BaseTest;

import javax.annotation.Resource;

/**
 * @author tianjunwei
 * @date 2019/3/28 11:24
 */

public class AlipayServiceTest extends BaseTest {

    @Resource
    AlipayService alipayService;

    @Test
    public void pcPay(){
        alipayService.pcPay(null);
    }

}
