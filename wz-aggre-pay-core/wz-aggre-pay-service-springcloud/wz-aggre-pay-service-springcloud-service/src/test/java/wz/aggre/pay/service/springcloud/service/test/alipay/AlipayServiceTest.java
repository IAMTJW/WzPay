package wz.aggre.pay.service.springcloud.service.test.alipay;

import com.wz.aggre.pay.alipay.model.TradeCreateModel;
import com.wz.aggre.pay.alipay.model.TradePayModel;
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
    public void tradeCreate(){

        TradeCreateModel tradeCreateModel = new TradeCreateModel();
        tradeCreateModel.setSubject("测试订单");
        tradeCreateModel.setOut_trade_no("344546345634dd5");
        tradeCreateModel.setTotal_amount(0.01);
        tradeCreateModel.setAlipay_public_key("MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA0hJsfeU324d8ef4Twmr1o2qI5Gx0I9dAg4b+0Dqyr8eXwUE/ymXwbedBwbol6FS/D6NlDBo9Im7kOa3wO9SW0EImhjkLKsNw9UNHgwgf2k0iUodEJ9b4HNQ9oclR6Nq8zLpBECEmcUNairkX3dMfc46eU8cRV9fkVA4Ma9OFuzGwcUKSAPC5nPrrGJ6Jccx0XYoSVQcvlQGj2JZu1v45UHU8TA2iTYDN61nZhZfMQwmKvvwO2/j9IzpVoaNCv3IpqpO7AXiFP8tBEBQm9XSMX5XfMXXaJhXTeu34oIumnq7zGYu4gfYemz7aAk8q4zUXl/B3/f/Lj/wOsHgloP7gxwIDAQAB");
        tradeCreateModel.setApp_id("2016092800613971");
        tradeCreateModel.setUrl("https://openapi.alipaydev.com/gateway.do");
        tradeCreateModel.setNotify_url("http://localhost:8080");
        tradeCreateModel.setReturn_url("http://localhst:8080");
        tradeCreateModel.setBuyer_id("2088102177561626");
        tradeCreateModel.setRsa_private_key("MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQCO3MGh8qCgXdT2yqLBvRoLHnkISpWI0YoU9kEpftaMiky3WeuKL5zF8iJ3uVhleP8sIhUzmhiL6cDgE/7kJ5xhcwMRvH3iwVBMhsXlz7+ctxp4rdRs1XmqN6kC+zR7HOX0ULiWeh+ln72+n0+t+SeT4m5R5XXeU4ZbeyuhRAaKq+z5hRkuPGUSrOdCL1k3k8dUHnEU2kGYTj6izQ3t+wbKWVG80gLNKHyfohictYBpME0N7E+7SFtTV6MhFqvfkjU+6pu6PPsFPc7F9QGzYU7fjDwSiRumTuNDrkblnJPErGkpkSKe2y+sXeKdt4BEgnPpe9mF/SP1gs+BTc5VHaDJAgMBAAECggEAPahfVcL+ulfk+yKXviAcZmIfgImYIjW1b7ichQk+Fef2lkeT1c8YzYHkiGGRGjJvhx+qoNvH7lLTsKJQpy3FW3WlBHmip0QhoPWl4bqZC00neqAjh1lXKjTdl/DNRLlDMf/IuwE4OWZJIUVmwUJAZ54ZWPU8uti3qzHssaxHWn+VlTGgJdutoD11DW87WnledxrqCacQe0RpW+Gp3xFhcoiEgRzp/4+xKKdp7zXIYhV8eSg4xvaaiGck6wbP2GTC4TIlnU4U8YXOnyfrnBHIux/iy9be/ClqNrAryC0nBweUBDRSakAJ9Io1ny2OM1ek6XjhtNnLZF5ki3Ano4x7xQKBgQDQe85KN0mZ3s9PJpnGNeVBp5xSd+MgbS51SWeq4tlPZq/KP8y2f7GUK0Ihq8awyKtHbeRuOMfsQSTDD5JweGh/oFBVu32CMpxvP9/6C+yw67oCGMC5IVQ8QT2G7rYN/Pv1exF5hEVFg8btVAJ7PbnTFoh6DP0QzimnIrh3zqICRwKBgQCvbDVFcYPYcc7dsNZcfyVAD3TeNkiqmdDLi76863FbsCQoRNkaMYTEaVPpqsh+cXKrzMDS/Z/agNQqXUYLrTXKKkOmi1OhVmJXr6gEFETZWmx85jolJWimzzpXdieF6gWzSHnKQrQR4tM8DVZM30UE6j/HEdzWjrybodCenfo8bwKBgQCcpYmYpfX9UTZ/CEfecDxzmlaQeFgF00NnCOKFubECQeuvkURlk4iABgjId+LwjbZ0ExPh5XQCBehzT83+B9qsmm4CHL/vBcwYouvNWwxa2qOGU8bq0yoRpAtwyQetdvpxtiipH0NVOfBL/iVnKDfpbTLaUcwLxnvxgtsL2gxMnQKBgQCa60/8XOxX+OH8zE/y7eJiuYO3Pm9cImzPZUF0K+U3WM4Ftg+Y30RmBLKzeDyJ1fy0FiXv70X9vKoiI69ZXoVTXZHTAdZAdD5zO9CAkbnfzchjYRrWdTv/nKDkXpc2315bX1UXN2M5LHzp2sltJ/wXBByA3JiP7wxH0VagzdkRBwKBgEKurZ2H/4tKzxPNK4lvfhWnLtSFuitGvhOJT2QRZHTSUv3ggA8UdJl1vT3meugr7S/JeDAjU0y87M328/VJNPmMdJ33mjAyHuvZmNnXCFMY53AOrt0C5H8Gzu2y4+VrlTba2HbO44V/REKpY4SeSDtu9XTnZ9v6BWX4a0Zyg++a");

        String result = alipayService.tradeCreate(tradeCreateModel);
        System.err.println(result);
    }

    @Test
    public void tradePay(){

        TradePayModel tradeCreateModel = new TradePayModel();
        tradeCreateModel.setScene("bar_code");
        tradeCreateModel.setAuth_code("280855582749085525");
        tradeCreateModel.setSubject("测试订单2");
        tradeCreateModel.setOut_trade_no("20190327111223");
        tradeCreateModel.setTotal_amount(0.01);
        tradeCreateModel.setAlipay_public_key("MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA0hJsfeU324d8ef4Twmr1o2qI5Gx0I9dAg4b+0Dqyr8eXwUE/ymXwbedBwbol6FS/D6NlDBo9Im7kOa3wO9SW0EImhjkLKsNw9UNHgwgf2k0iUodEJ9b4HNQ9oclR6Nq8zLpBECEmcUNairkX3dMfc46eU8cRV9fkVA4Ma9OFuzGwcUKSAPC5nPrrGJ6Jccx0XYoSVQcvlQGj2JZu1v45UHU8TA2iTYDN61nZhZfMQwmKvvwO2/j9IzpVoaNCv3IpqpO7AXiFP8tBEBQm9XSMX5XfMXXaJhXTeu34oIumnq7zGYu4gfYemz7aAk8q4zUXl/B3/f/Lj/wOsHgloP7gxwIDAQAB");
        tradeCreateModel.setApp_id("2016092800613971");
        tradeCreateModel.setUrl("https://openapi.alipaydev.com/gateway.do");
        tradeCreateModel.setNotify_url("http://localhost:8080");
        tradeCreateModel.setReturn_url("http://localhst:8080");
        tradeCreateModel.setRsa_private_key("MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQCO3MGh8qCgXdT2yqLBvRoLHnkISpWI0YoU9kEpftaMiky3WeuKL5zF8iJ3uVhleP8sIhUzmhiL6cDgE/7kJ5xhcwMRvH3iwVBMhsXlz7+ctxp4rdRs1XmqN6kC+zR7HOX0ULiWeh+ln72+n0+t+SeT4m5R5XXeU4ZbeyuhRAaKq+z5hRkuPGUSrOdCL1k3k8dUHnEU2kGYTj6izQ3t+wbKWVG80gLNKHyfohictYBpME0N7E+7SFtTV6MhFqvfkjU+6pu6PPsFPc7F9QGzYU7fjDwSiRumTuNDrkblnJPErGkpkSKe2y+sXeKdt4BEgnPpe9mF/SP1gs+BTc5VHaDJAgMBAAECggEAPahfVcL+ulfk+yKXviAcZmIfgImYIjW1b7ichQk+Fef2lkeT1c8YzYHkiGGRGjJvhx+qoNvH7lLTsKJQpy3FW3WlBHmip0QhoPWl4bqZC00neqAjh1lXKjTdl/DNRLlDMf/IuwE4OWZJIUVmwUJAZ54ZWPU8uti3qzHssaxHWn+VlTGgJdutoD11DW87WnledxrqCacQe0RpW+Gp3xFhcoiEgRzp/4+xKKdp7zXIYhV8eSg4xvaaiGck6wbP2GTC4TIlnU4U8YXOnyfrnBHIux/iy9be/ClqNrAryC0nBweUBDRSakAJ9Io1ny2OM1ek6XjhtNnLZF5ki3Ano4x7xQKBgQDQe85KN0mZ3s9PJpnGNeVBp5xSd+MgbS51SWeq4tlPZq/KP8y2f7GUK0Ihq8awyKtHbeRuOMfsQSTDD5JweGh/oFBVu32CMpxvP9/6C+yw67oCGMC5IVQ8QT2G7rYN/Pv1exF5hEVFg8btVAJ7PbnTFoh6DP0QzimnIrh3zqICRwKBgQCvbDVFcYPYcc7dsNZcfyVAD3TeNkiqmdDLi76863FbsCQoRNkaMYTEaVPpqsh+cXKrzMDS/Z/agNQqXUYLrTXKKkOmi1OhVmJXr6gEFETZWmx85jolJWimzzpXdieF6gWzSHnKQrQR4tM8DVZM30UE6j/HEdzWjrybodCenfo8bwKBgQCcpYmYpfX9UTZ/CEfecDxzmlaQeFgF00NnCOKFubECQeuvkURlk4iABgjId+LwjbZ0ExPh5XQCBehzT83+B9qsmm4CHL/vBcwYouvNWwxa2qOGU8bq0yoRpAtwyQetdvpxtiipH0NVOfBL/iVnKDfpbTLaUcwLxnvxgtsL2gxMnQKBgQCa60/8XOxX+OH8zE/y7eJiuYO3Pm9cImzPZUF0K+U3WM4Ftg+Y30RmBLKzeDyJ1fy0FiXv70X9vKoiI69ZXoVTXZHTAdZAdD5zO9CAkbnfzchjYRrWdTv/nKDkXpc2315bX1UXN2M5LHzp2sltJ/wXBByA3JiP7wxH0VagzdkRBwKBgEKurZ2H/4tKzxPNK4lvfhWnLtSFuitGvhOJT2QRZHTSUv3ggA8UdJl1vT3meugr7S/JeDAjU0y87M328/VJNPmMdJ33mjAyHuvZmNnXCFMY53AOrt0C5H8Gzu2y4+VrlTba2HbO44V/REKpY4SeSDtu9XTnZ9v6BWX4a0Zyg++a");

        String result = alipayService.tradePay(tradeCreateModel);
        System.err.println(result);
    }

}
