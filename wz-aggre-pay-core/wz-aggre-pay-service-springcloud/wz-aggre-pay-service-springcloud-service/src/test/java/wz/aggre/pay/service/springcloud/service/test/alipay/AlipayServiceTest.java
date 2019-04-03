package wz.aggre.pay.service.springcloud.service.test.alipay;

import com.wz.aggre.pay.alipay.model.*;
import com.wz.aggre.pay.alipay.model.app.AppPayModel;
import com.wz.aggre.pay.alipay.model.ext.RoyaltyParameter;
import com.wz.aggre.pay.alipay.model.pc.PcPayModel;
import com.wz.aggre.pay.alipay.model.wap.WapPayModel;
import com.wz.aggre.pay.alipay.service.AlipayService;
import org.junit.Test;
import wz.aggre.pay.service.springcloud.service.test.BaseTest;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @author tianjunwei
 * @date 2019/3/28 11:24
 */

public class AlipayServiceTest extends BaseTest {

    @Resource
    AlipayService alipayService;


    @Test
    public void appPay() {

        AppPayModel payModel = new AppPayModel();

        payModel.setTotal_amount(100.00);
        payModel.setSubject("测试订单");
        payModel.setOut_trade_no("232323230");

        payModel.setAlipay_public_key("MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA0hJsfeU324d8ef4Twmr1o2qI5Gx0I9dAg4b+0Dqyr8eXwUE/ymXwbedBwbol6FS/D6NlDBo9Im7kOa3wO9SW0EImhjkLKsNw9UNHgwgf2k0iUodEJ9b4HNQ9oclR6Nq8zLpBECEmcUNairkX3dMfc46eU8cRV9fkVA4Ma9OFuzGwcUKSAPC5nPrrGJ6Jccx0XYoSVQcvlQGj2JZu1v45UHU8TA2iTYDN61nZhZfMQwmKvvwO2/j9IzpVoaNCv3IpqpO7AXiFP8tBEBQm9XSMX5XfMXXaJhXTeu34oIumnq7zGYu4gfYemz7aAk8q4zUXl/B3/f/Lj/wOsHgloP7gxwIDAQAB");
        payModel.setApp_id("2016092800613971");
        payModel.setUrl("https://openapi.alipaydev.com/gateway.do");
        payModel.setNotify_url("http://localhost:8080");
        payModel.setReturn_url("http://localhst:8080");
        payModel.setRsa_private_key("MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQCO3MGh8qCgXdT2yqLBvRoLHnkISpWI0YoU9kEpftaMiky3WeuKL5zF8iJ3uVhleP8sIhUzmhiL6cDgE/7kJ5xhcwMRvH3iwVBMhsXlz7+ctxp4rdRs1XmqN6kC+zR7HOX0ULiWeh+ln72+n0+t+SeT4m5R5XXeU4ZbeyuhRAaKq+z5hRkuPGUSrOdCL1k3k8dUHnEU2kGYTj6izQ3t+wbKWVG80gLNKHyfohictYBpME0N7E+7SFtTV6MhFqvfkjU+6pu6PPsFPc7F9QGzYU7fjDwSiRumTuNDrkblnJPErGkpkSKe2y+sXeKdt4BEgnPpe9mF/SP1gs+BTc5VHaDJAgMBAAECggEAPahfVcL+ulfk+yKXviAcZmIfgImYIjW1b7ichQk+Fef2lkeT1c8YzYHkiGGRGjJvhx+qoNvH7lLTsKJQpy3FW3WlBHmip0QhoPWl4bqZC00neqAjh1lXKjTdl/DNRLlDMf/IuwE4OWZJIUVmwUJAZ54ZWPU8uti3qzHssaxHWn+VlTGgJdutoD11DW87WnledxrqCacQe0RpW+Gp3xFhcoiEgRzp/4+xKKdp7zXIYhV8eSg4xvaaiGck6wbP2GTC4TIlnU4U8YXOnyfrnBHIux/iy9be/ClqNrAryC0nBweUBDRSakAJ9Io1ny2OM1ek6XjhtNnLZF5ki3Ano4x7xQKBgQDQe85KN0mZ3s9PJpnGNeVBp5xSd+MgbS51SWeq4tlPZq/KP8y2f7GUK0Ihq8awyKtHbeRuOMfsQSTDD5JweGh/oFBVu32CMpxvP9/6C+yw67oCGMC5IVQ8QT2G7rYN/Pv1exF5hEVFg8btVAJ7PbnTFoh6DP0QzimnIrh3zqICRwKBgQCvbDVFcYPYcc7dsNZcfyVAD3TeNkiqmdDLi76863FbsCQoRNkaMYTEaVPpqsh+cXKrzMDS/Z/agNQqXUYLrTXKKkOmi1OhVmJXr6gEFETZWmx85jolJWimzzpXdieF6gWzSHnKQrQR4tM8DVZM30UE6j/HEdzWjrybodCenfo8bwKBgQCcpYmYpfX9UTZ/CEfecDxzmlaQeFgF00NnCOKFubECQeuvkURlk4iABgjId+LwjbZ0ExPh5XQCBehzT83+B9qsmm4CHL/vBcwYouvNWwxa2qOGU8bq0yoRpAtwyQetdvpxtiipH0NVOfBL/iVnKDfpbTLaUcwLxnvxgtsL2gxMnQKBgQCa60/8XOxX+OH8zE/y7eJiuYO3Pm9cImzPZUF0K+U3WM4Ftg+Y30RmBLKzeDyJ1fy0FiXv70X9vKoiI69ZXoVTXZHTAdZAdD5zO9CAkbnfzchjYRrWdTv/nKDkXpc2315bX1UXN2M5LHzp2sltJ/wXBByA3JiP7wxH0VagzdkRBwKBgEKurZ2H/4tKzxPNK4lvfhWnLtSFuitGvhOJT2QRZHTSUv3ggA8UdJl1vT3meugr7S/JeDAjU0y87M328/VJNPmMdJ33mjAyHuvZmNnXCFMY53AOrt0C5H8Gzu2y4+VrlTba2HbO44V/REKpY4SeSDtu9XTnZ9v6BWX4a0Zyg++a");

        String result = alipayService.appPay(payModel);

        System.err.println(result);

    }

    @Test
    public void wapPay() {

        WapPayModel wapPayModel = new WapPayModel();

        wapPayModel.setTotal_amount(100.00);
        wapPayModel.setSubject("测试订单");
        wapPayModel.setOut_trade_no("232323231");

        wapPayModel.setAlipay_public_key("MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA0hJsfeU324d8ef4Twmr1o2qI5Gx0I9dAg4b+0Dqyr8eXwUE/ymXwbedBwbol6FS/D6NlDBo9Im7kOa3wO9SW0EImhjkLKsNw9UNHgwgf2k0iUodEJ9b4HNQ9oclR6Nq8zLpBECEmcUNairkX3dMfc46eU8cRV9fkVA4Ma9OFuzGwcUKSAPC5nPrrGJ6Jccx0XYoSVQcvlQGj2JZu1v45UHU8TA2iTYDN61nZhZfMQwmKvvwO2/j9IzpVoaNCv3IpqpO7AXiFP8tBEBQm9XSMX5XfMXXaJhXTeu34oIumnq7zGYu4gfYemz7aAk8q4zUXl/B3/f/Lj/wOsHgloP7gxwIDAQAB");
        wapPayModel.setApp_id("2016092800613971");
        wapPayModel.setUrl("https://openapi.alipaydev.com/gateway.do");
        wapPayModel.setNotify_url("http://localhost:8080");
        wapPayModel.setReturn_url("http://localhst:8080");
        wapPayModel.setRsa_private_key("MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQCO3MGh8qCgXdT2yqLBvRoLHnkISpWI0YoU9kEpftaMiky3WeuKL5zF8iJ3uVhleP8sIhUzmhiL6cDgE/7kJ5xhcwMRvH3iwVBMhsXlz7+ctxp4rdRs1XmqN6kC+zR7HOX0ULiWeh+ln72+n0+t+SeT4m5R5XXeU4ZbeyuhRAaKq+z5hRkuPGUSrOdCL1k3k8dUHnEU2kGYTj6izQ3t+wbKWVG80gLNKHyfohictYBpME0N7E+7SFtTV6MhFqvfkjU+6pu6PPsFPc7F9QGzYU7fjDwSiRumTuNDrkblnJPErGkpkSKe2y+sXeKdt4BEgnPpe9mF/SP1gs+BTc5VHaDJAgMBAAECggEAPahfVcL+ulfk+yKXviAcZmIfgImYIjW1b7ichQk+Fef2lkeT1c8YzYHkiGGRGjJvhx+qoNvH7lLTsKJQpy3FW3WlBHmip0QhoPWl4bqZC00neqAjh1lXKjTdl/DNRLlDMf/IuwE4OWZJIUVmwUJAZ54ZWPU8uti3qzHssaxHWn+VlTGgJdutoD11DW87WnledxrqCacQe0RpW+Gp3xFhcoiEgRzp/4+xKKdp7zXIYhV8eSg4xvaaiGck6wbP2GTC4TIlnU4U8YXOnyfrnBHIux/iy9be/ClqNrAryC0nBweUBDRSakAJ9Io1ny2OM1ek6XjhtNnLZF5ki3Ano4x7xQKBgQDQe85KN0mZ3s9PJpnGNeVBp5xSd+MgbS51SWeq4tlPZq/KP8y2f7GUK0Ihq8awyKtHbeRuOMfsQSTDD5JweGh/oFBVu32CMpxvP9/6C+yw67oCGMC5IVQ8QT2G7rYN/Pv1exF5hEVFg8btVAJ7PbnTFoh6DP0QzimnIrh3zqICRwKBgQCvbDVFcYPYcc7dsNZcfyVAD3TeNkiqmdDLi76863FbsCQoRNkaMYTEaVPpqsh+cXKrzMDS/Z/agNQqXUYLrTXKKkOmi1OhVmJXr6gEFETZWmx85jolJWimzzpXdieF6gWzSHnKQrQR4tM8DVZM30UE6j/HEdzWjrybodCenfo8bwKBgQCcpYmYpfX9UTZ/CEfecDxzmlaQeFgF00NnCOKFubECQeuvkURlk4iABgjId+LwjbZ0ExPh5XQCBehzT83+B9qsmm4CHL/vBcwYouvNWwxa2qOGU8bq0yoRpAtwyQetdvpxtiipH0NVOfBL/iVnKDfpbTLaUcwLxnvxgtsL2gxMnQKBgQCa60/8XOxX+OH8zE/y7eJiuYO3Pm9cImzPZUF0K+U3WM4Ftg+Y30RmBLKzeDyJ1fy0FiXv70X9vKoiI69ZXoVTXZHTAdZAdD5zO9CAkbnfzchjYRrWdTv/nKDkXpc2315bX1UXN2M5LHzp2sltJ/wXBByA3JiP7wxH0VagzdkRBwKBgEKurZ2H/4tKzxPNK4lvfhWnLtSFuitGvhOJT2QRZHTSUv3ggA8UdJl1vT3meugr7S/JeDAjU0y87M328/VJNPmMdJ33mjAyHuvZmNnXCFMY53AOrt0C5H8Gzu2y4+VrlTba2HbO44V/REKpY4SeSDtu9XTnZ9v6BWX4a0Zyg++a");

        String result = alipayService.wapPay(wapPayModel);

        System.err.println(result);

    }


    @Test
    public void pcPay() {


        PcPayModel pcPayModel = new PcPayModel();

        pcPayModel.setTotal_amount(100.00);
        pcPayModel.setSubject("测试订单");
        pcPayModel.setOut_trade_no("232323232");

        pcPayModel.setAlipay_public_key("MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA0hJsfeU324d8ef4Twmr1o2qI5Gx0I9dAg4b+0Dqyr8eXwUE/ymXwbedBwbol6FS/D6NlDBo9Im7kOa3wO9SW0EImhjkLKsNw9UNHgwgf2k0iUodEJ9b4HNQ9oclR6Nq8zLpBECEmcUNairkX3dMfc46eU8cRV9fkVA4Ma9OFuzGwcUKSAPC5nPrrGJ6Jccx0XYoSVQcvlQGj2JZu1v45UHU8TA2iTYDN61nZhZfMQwmKvvwO2/j9IzpVoaNCv3IpqpO7AXiFP8tBEBQm9XSMX5XfMXXaJhXTeu34oIumnq7zGYu4gfYemz7aAk8q4zUXl/B3/f/Lj/wOsHgloP7gxwIDAQAB");
        pcPayModel.setApp_id("2016092800613971");
        pcPayModel.setUrl("https://openapi.alipaydev.com/gateway.do");
        pcPayModel.setNotify_url("http://localhost:8080");
        pcPayModel.setReturn_url("http://localhst:8080");
        pcPayModel.setRsa_private_key("MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQCO3MGh8qCgXdT2yqLBvRoLHnkISpWI0YoU9kEpftaMiky3WeuKL5zF8iJ3uVhleP8sIhUzmhiL6cDgE/7kJ5xhcwMRvH3iwVBMhsXlz7+ctxp4rdRs1XmqN6kC+zR7HOX0ULiWeh+ln72+n0+t+SeT4m5R5XXeU4ZbeyuhRAaKq+z5hRkuPGUSrOdCL1k3k8dUHnEU2kGYTj6izQ3t+wbKWVG80gLNKHyfohictYBpME0N7E+7SFtTV6MhFqvfkjU+6pu6PPsFPc7F9QGzYU7fjDwSiRumTuNDrkblnJPErGkpkSKe2y+sXeKdt4BEgnPpe9mF/SP1gs+BTc5VHaDJAgMBAAECggEAPahfVcL+ulfk+yKXviAcZmIfgImYIjW1b7ichQk+Fef2lkeT1c8YzYHkiGGRGjJvhx+qoNvH7lLTsKJQpy3FW3WlBHmip0QhoPWl4bqZC00neqAjh1lXKjTdl/DNRLlDMf/IuwE4OWZJIUVmwUJAZ54ZWPU8uti3qzHssaxHWn+VlTGgJdutoD11DW87WnledxrqCacQe0RpW+Gp3xFhcoiEgRzp/4+xKKdp7zXIYhV8eSg4xvaaiGck6wbP2GTC4TIlnU4U8YXOnyfrnBHIux/iy9be/ClqNrAryC0nBweUBDRSakAJ9Io1ny2OM1ek6XjhtNnLZF5ki3Ano4x7xQKBgQDQe85KN0mZ3s9PJpnGNeVBp5xSd+MgbS51SWeq4tlPZq/KP8y2f7GUK0Ihq8awyKtHbeRuOMfsQSTDD5JweGh/oFBVu32CMpxvP9/6C+yw67oCGMC5IVQ8QT2G7rYN/Pv1exF5hEVFg8btVAJ7PbnTFoh6DP0QzimnIrh3zqICRwKBgQCvbDVFcYPYcc7dsNZcfyVAD3TeNkiqmdDLi76863FbsCQoRNkaMYTEaVPpqsh+cXKrzMDS/Z/agNQqXUYLrTXKKkOmi1OhVmJXr6gEFETZWmx85jolJWimzzpXdieF6gWzSHnKQrQR4tM8DVZM30UE6j/HEdzWjrybodCenfo8bwKBgQCcpYmYpfX9UTZ/CEfecDxzmlaQeFgF00NnCOKFubECQeuvkURlk4iABgjId+LwjbZ0ExPh5XQCBehzT83+B9qsmm4CHL/vBcwYouvNWwxa2qOGU8bq0yoRpAtwyQetdvpxtiipH0NVOfBL/iVnKDfpbTLaUcwLxnvxgtsL2gxMnQKBgQCa60/8XOxX+OH8zE/y7eJiuYO3Pm9cImzPZUF0K+U3WM4Ftg+Y30RmBLKzeDyJ1fy0FiXv70X9vKoiI69ZXoVTXZHTAdZAdD5zO9CAkbnfzchjYRrWdTv/nKDkXpc2315bX1UXN2M5LHzp2sltJ/wXBByA3JiP7wxH0VagzdkRBwKBgEKurZ2H/4tKzxPNK4lvfhWnLtSFuitGvhOJT2QRZHTSUv3ggA8UdJl1vT3meugr7S/JeDAjU0y87M328/VJNPmMdJ33mjAyHuvZmNnXCFMY53AOrt0C5H8Gzu2y4+VrlTba2HbO44V/REKpY4SeSDtu9XTnZ9v6BWX4a0Zyg++a");

        String result = alipayService.pcPay(pcPayModel);

        System.err.println(result);

    }


    @Test
    public void tradePrecreate() {

        TradePrecreateModel tradePrecreateModel = new TradePrecreateModel();


        tradePrecreateModel.setTotal_amount(100.00);
        tradePrecreateModel.setSubject("测试订单");
        tradePrecreateModel.setOut_trade_no("232323233");

        tradePrecreateModel.setAlipay_public_key("MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA0hJsfeU324d8ef4Twmr1o2qI5Gx0I9dAg4b+0Dqyr8eXwUE/ymXwbedBwbol6FS/D6NlDBo9Im7kOa3wO9SW0EImhjkLKsNw9UNHgwgf2k0iUodEJ9b4HNQ9oclR6Nq8zLpBECEmcUNairkX3dMfc46eU8cRV9fkVA4Ma9OFuzGwcUKSAPC5nPrrGJ6Jccx0XYoSVQcvlQGj2JZu1v45UHU8TA2iTYDN61nZhZfMQwmKvvwO2/j9IzpVoaNCv3IpqpO7AXiFP8tBEBQm9XSMX5XfMXXaJhXTeu34oIumnq7zGYu4gfYemz7aAk8q4zUXl/B3/f/Lj/wOsHgloP7gxwIDAQAB");
        tradePrecreateModel.setApp_id("2016092800613971");
        tradePrecreateModel.setUrl("https://openapi.alipaydev.com/gateway.do");
        tradePrecreateModel.setNotify_url("http://localhost:8080");
        tradePrecreateModel.setReturn_url("http://localhst:8080");
        tradePrecreateModel.setRsa_private_key("MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQCO3MGh8qCgXdT2yqLBvRoLHnkISpWI0YoU9kEpftaMiky3WeuKL5zF8iJ3uVhleP8sIhUzmhiL6cDgE/7kJ5xhcwMRvH3iwVBMhsXlz7+ctxp4rdRs1XmqN6kC+zR7HOX0ULiWeh+ln72+n0+t+SeT4m5R5XXeU4ZbeyuhRAaKq+z5hRkuPGUSrOdCL1k3k8dUHnEU2kGYTj6izQ3t+wbKWVG80gLNKHyfohictYBpME0N7E+7SFtTV6MhFqvfkjU+6pu6PPsFPc7F9QGzYU7fjDwSiRumTuNDrkblnJPErGkpkSKe2y+sXeKdt4BEgnPpe9mF/SP1gs+BTc5VHaDJAgMBAAECggEAPahfVcL+ulfk+yKXviAcZmIfgImYIjW1b7ichQk+Fef2lkeT1c8YzYHkiGGRGjJvhx+qoNvH7lLTsKJQpy3FW3WlBHmip0QhoPWl4bqZC00neqAjh1lXKjTdl/DNRLlDMf/IuwE4OWZJIUVmwUJAZ54ZWPU8uti3qzHssaxHWn+VlTGgJdutoD11DW87WnledxrqCacQe0RpW+Gp3xFhcoiEgRzp/4+xKKdp7zXIYhV8eSg4xvaaiGck6wbP2GTC4TIlnU4U8YXOnyfrnBHIux/iy9be/ClqNrAryC0nBweUBDRSakAJ9Io1ny2OM1ek6XjhtNnLZF5ki3Ano4x7xQKBgQDQe85KN0mZ3s9PJpnGNeVBp5xSd+MgbS51SWeq4tlPZq/KP8y2f7GUK0Ihq8awyKtHbeRuOMfsQSTDD5JweGh/oFBVu32CMpxvP9/6C+yw67oCGMC5IVQ8QT2G7rYN/Pv1exF5hEVFg8btVAJ7PbnTFoh6DP0QzimnIrh3zqICRwKBgQCvbDVFcYPYcc7dsNZcfyVAD3TeNkiqmdDLi76863FbsCQoRNkaMYTEaVPpqsh+cXKrzMDS/Z/agNQqXUYLrTXKKkOmi1OhVmJXr6gEFETZWmx85jolJWimzzpXdieF6gWzSHnKQrQR4tM8DVZM30UE6j/HEdzWjrybodCenfo8bwKBgQCcpYmYpfX9UTZ/CEfecDxzmlaQeFgF00NnCOKFubECQeuvkURlk4iABgjId+LwjbZ0ExPh5XQCBehzT83+B9qsmm4CHL/vBcwYouvNWwxa2qOGU8bq0yoRpAtwyQetdvpxtiipH0NVOfBL/iVnKDfpbTLaUcwLxnvxgtsL2gxMnQKBgQCa60/8XOxX+OH8zE/y7eJiuYO3Pm9cImzPZUF0K+U3WM4Ftg+Y30RmBLKzeDyJ1fy0FiXv70X9vKoiI69ZXoVTXZHTAdZAdD5zO9CAkbnfzchjYRrWdTv/nKDkXpc2315bX1UXN2M5LHzp2sltJ/wXBByA3JiP7wxH0VagzdkRBwKBgEKurZ2H/4tKzxPNK4lvfhWnLtSFuitGvhOJT2QRZHTSUv3ggA8UdJl1vT3meugr7S/JeDAjU0y87M328/VJNPmMdJ33mjAyHuvZmNnXCFMY53AOrt0C5H8Gzu2y4+VrlTba2HbO44V/REKpY4SeSDtu9XTnZ9v6BWX4a0Zyg++a");

        String result = alipayService.tradePrecreate(tradePrecreateModel);

        System.err.println(result);

    }


    @Test
    public void tradeCreate() {

        TradeCreateModel tradeCreateModel = new TradeCreateModel();
        tradeCreateModel.setSubject("测试订单红包");
        tradeCreateModel.setOut_trade_no("344546345634dd61");
        tradeCreateModel.setTotal_amount(1);
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
    public void tradePay() {

        TradePayModel tradeCreateModel = new TradePayModel();
        tradeCreateModel.setScene("bar_code");
        tradeCreateModel.setAuth_code("288359590243835926");
        tradeCreateModel.setSubject("测试订单");
        tradeCreateModel.setOut_trade_no("344546345634dd78");
        tradeCreateModel.setBody("测试数据2");
        tradeCreateModel.setTotal_amount(100);
        tradeCreateModel.setAlipay_public_key("MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA0hJsfeU324d8ef4Twmr1o2qI5Gx0I9dAg4b+0Dqyr8eXwUE/ymXwbedBwbol6FS/D6NlDBo9Im7kOa3wO9SW0EImhjkLKsNw9UNHgwgf2k0iUodEJ9b4HNQ9oclR6Nq8zLpBECEmcUNairkX3dMfc46eU8cRV9fkVA4Ma9OFuzGwcUKSAPC5nPrrGJ6Jccx0XYoSVQcvlQGj2JZu1v45UHU8TA2iTYDN61nZhZfMQwmKvvwO2/j9IzpVoaNCv3IpqpO7AXiFP8tBEBQm9XSMX5XfMXXaJhXTeu34oIumnq7zGYu4gfYemz7aAk8q4zUXl/B3/f/Lj/wOsHgloP7gxwIDAQAB");
        tradeCreateModel.setApp_id("2016092800613971");
        tradeCreateModel.setUrl("https://openapi.alipaydev.com/gateway.do");
        tradeCreateModel.setNotify_url("http://localhost:8080");
        tradeCreateModel.setReturn_url("http://localhst:8080");
        tradeCreateModel.setRsa_private_key("MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQCO3MGh8qCgXdT2yqLBvRoLHnkISpWI0YoU9kEpftaMiky3WeuKL5zF8iJ3uVhleP8sIhUzmhiL6cDgE/7kJ5xhcwMRvH3iwVBMhsXlz7+ctxp4rdRs1XmqN6kC+zR7HOX0ULiWeh+ln72+n0+t+SeT4m5R5XXeU4ZbeyuhRAaKq+z5hRkuPGUSrOdCL1k3k8dUHnEU2kGYTj6izQ3t+wbKWVG80gLNKHyfohictYBpME0N7E+7SFtTV6MhFqvfkjU+6pu6PPsFPc7F9QGzYU7fjDwSiRumTuNDrkblnJPErGkpkSKe2y+sXeKdt4BEgnPpe9mF/SP1gs+BTc5VHaDJAgMBAAECggEAPahfVcL+ulfk+yKXviAcZmIfgImYIjW1b7ichQk+Fef2lkeT1c8YzYHkiGGRGjJvhx+qoNvH7lLTsKJQpy3FW3WlBHmip0QhoPWl4bqZC00neqAjh1lXKjTdl/DNRLlDMf/IuwE4OWZJIUVmwUJAZ54ZWPU8uti3qzHssaxHWn+VlTGgJdutoD11DW87WnledxrqCacQe0RpW+Gp3xFhcoiEgRzp/4+xKKdp7zXIYhV8eSg4xvaaiGck6wbP2GTC4TIlnU4U8YXOnyfrnBHIux/iy9be/ClqNrAryC0nBweUBDRSakAJ9Io1ny2OM1ek6XjhtNnLZF5ki3Ano4x7xQKBgQDQe85KN0mZ3s9PJpnGNeVBp5xSd+MgbS51SWeq4tlPZq/KP8y2f7GUK0Ihq8awyKtHbeRuOMfsQSTDD5JweGh/oFBVu32CMpxvP9/6C+yw67oCGMC5IVQ8QT2G7rYN/Pv1exF5hEVFg8btVAJ7PbnTFoh6DP0QzimnIrh3zqICRwKBgQCvbDVFcYPYcc7dsNZcfyVAD3TeNkiqmdDLi76863FbsCQoRNkaMYTEaVPpqsh+cXKrzMDS/Z/agNQqXUYLrTXKKkOmi1OhVmJXr6gEFETZWmx85jolJWimzzpXdieF6gWzSHnKQrQR4tM8DVZM30UE6j/HEdzWjrybodCenfo8bwKBgQCcpYmYpfX9UTZ/CEfecDxzmlaQeFgF00NnCOKFubECQeuvkURlk4iABgjId+LwjbZ0ExPh5XQCBehzT83+B9qsmm4CHL/vBcwYouvNWwxa2qOGU8bq0yoRpAtwyQetdvpxtiipH0NVOfBL/iVnKDfpbTLaUcwLxnvxgtsL2gxMnQKBgQCa60/8XOxX+OH8zE/y7eJiuYO3Pm9cImzPZUF0K+U3WM4Ftg+Y30RmBLKzeDyJ1fy0FiXv70X9vKoiI69ZXoVTXZHTAdZAdD5zO9CAkbnfzchjYRrWdTv/nKDkXpc2315bX1UXN2M5LHzp2sltJ/wXBByA3JiP7wxH0VagzdkRBwKBgEKurZ2H/4tKzxPNK4lvfhWnLtSFuitGvhOJT2QRZHTSUv3ggA8UdJl1vT3meugr7S/JeDAjU0y87M328/VJNPmMdJ33mjAyHuvZmNnXCFMY53AOrt0C5H8Gzu2y4+VrlTba2HbO44V/REKpY4SeSDtu9XTnZ9v6BWX4a0Zyg++a");

        String result = alipayService.tradePay(tradeCreateModel);
        System.err.println(result);
    }

    @Test
    public void tradeCancel(){

        TradeCancelModel tradeCancelModel = new TradeCancelModel();

        tradeCancelModel.setOut_trade_no("344546345634dd59");

        tradeCancelModel.setAlipay_public_key("MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA0hJsfeU324d8ef4Twmr1o2qI5Gx0I9dAg4b+0Dqyr8eXwUE/ymXwbedBwbol6FS/D6NlDBo9Im7kOa3wO9SW0EImhjkLKsNw9UNHgwgf2k0iUodEJ9b4HNQ9oclR6Nq8zLpBECEmcUNairkX3dMfc46eU8cRV9fkVA4Ma9OFuzGwcUKSAPC5nPrrGJ6Jccx0XYoSVQcvlQGj2JZu1v45UHU8TA2iTYDN61nZhZfMQwmKvvwO2/j9IzpVoaNCv3IpqpO7AXiFP8tBEBQm9XSMX5XfMXXaJhXTeu34oIumnq7zGYu4gfYemz7aAk8q4zUXl/B3/f/Lj/wOsHgloP7gxwIDAQAB");
        tradeCancelModel.setApp_id("2016092800613971");
        tradeCancelModel.setUrl("https://openapi.alipaydev.com/gateway.do");
        tradeCancelModel.setNotify_url("http://localhost:8080");
        tradeCancelModel.setReturn_url("http://localhst:8080");
        tradeCancelModel.setRsa_private_key("MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQCO3MGh8qCgXdT2yqLBvRoLHnkISpWI0YoU9kEpftaMiky3WeuKL5zF8iJ3uVhleP8sIhUzmhiL6cDgE/7kJ5xhcwMRvH3iwVBMhsXlz7+ctxp4rdRs1XmqN6kC+zR7HOX0ULiWeh+ln72+n0+t+SeT4m5R5XXeU4ZbeyuhRAaKq+z5hRkuPGUSrOdCL1k3k8dUHnEU2kGYTj6izQ3t+wbKWVG80gLNKHyfohictYBpME0N7E+7SFtTV6MhFqvfkjU+6pu6PPsFPc7F9QGzYU7fjDwSiRumTuNDrkblnJPErGkpkSKe2y+sXeKdt4BEgnPpe9mF/SP1gs+BTc5VHaDJAgMBAAECggEAPahfVcL+ulfk+yKXviAcZmIfgImYIjW1b7ichQk+Fef2lkeT1c8YzYHkiGGRGjJvhx+qoNvH7lLTsKJQpy3FW3WlBHmip0QhoPWl4bqZC00neqAjh1lXKjTdl/DNRLlDMf/IuwE4OWZJIUVmwUJAZ54ZWPU8uti3qzHssaxHWn+VlTGgJdutoD11DW87WnledxrqCacQe0RpW+Gp3xFhcoiEgRzp/4+xKKdp7zXIYhV8eSg4xvaaiGck6wbP2GTC4TIlnU4U8YXOnyfrnBHIux/iy9be/ClqNrAryC0nBweUBDRSakAJ9Io1ny2OM1ek6XjhtNnLZF5ki3Ano4x7xQKBgQDQe85KN0mZ3s9PJpnGNeVBp5xSd+MgbS51SWeq4tlPZq/KP8y2f7GUK0Ihq8awyKtHbeRuOMfsQSTDD5JweGh/oFBVu32CMpxvP9/6C+yw67oCGMC5IVQ8QT2G7rYN/Pv1exF5hEVFg8btVAJ7PbnTFoh6DP0QzimnIrh3zqICRwKBgQCvbDVFcYPYcc7dsNZcfyVAD3TeNkiqmdDLi76863FbsCQoRNkaMYTEaVPpqsh+cXKrzMDS/Z/agNQqXUYLrTXKKkOmi1OhVmJXr6gEFETZWmx85jolJWimzzpXdieF6gWzSHnKQrQR4tM8DVZM30UE6j/HEdzWjrybodCenfo8bwKBgQCcpYmYpfX9UTZ/CEfecDxzmlaQeFgF00NnCOKFubECQeuvkURlk4iABgjId+LwjbZ0ExPh5XQCBehzT83+B9qsmm4CHL/vBcwYouvNWwxa2qOGU8bq0yoRpAtwyQetdvpxtiipH0NVOfBL/iVnKDfpbTLaUcwLxnvxgtsL2gxMnQKBgQCa60/8XOxX+OH8zE/y7eJiuYO3Pm9cImzPZUF0K+U3WM4Ftg+Y30RmBLKzeDyJ1fy0FiXv70X9vKoiI69ZXoVTXZHTAdZAdD5zO9CAkbnfzchjYRrWdTv/nKDkXpc2315bX1UXN2M5LHzp2sltJ/wXBByA3JiP7wxH0VagzdkRBwKBgEKurZ2H/4tKzxPNK4lvfhWnLtSFuitGvhOJT2QRZHTSUv3ggA8UdJl1vT3meugr7S/JeDAjU0y87M328/VJNPmMdJ33mjAyHuvZmNnXCFMY53AOrt0C5H8Gzu2y4+VrlTba2HbO44V/REKpY4SeSDtu9XTnZ9v6BWX4a0Zyg++a");

        String result = alipayService.tradeCancel(tradeCancelModel);
        System.err.println(result);
    }

    @Test
    public void tradeClose() {
        TradeCloseModel tradeCloseModel = new TradeCloseModel();

        tradeCloseModel.setOut_trade_no("344546345634dd59");

        tradeCloseModel.setAlipay_public_key("MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA0hJsfeU324d8ef4Twmr1o2qI5Gx0I9dAg4b+0Dqyr8eXwUE/ymXwbedBwbol6FS/D6NlDBo9Im7kOa3wO9SW0EImhjkLKsNw9UNHgwgf2k0iUodEJ9b4HNQ9oclR6Nq8zLpBECEmcUNairkX3dMfc46eU8cRV9fkVA4Ma9OFuzGwcUKSAPC5nPrrGJ6Jccx0XYoSVQcvlQGj2JZu1v45UHU8TA2iTYDN61nZhZfMQwmKvvwO2/j9IzpVoaNCv3IpqpO7AXiFP8tBEBQm9XSMX5XfMXXaJhXTeu34oIumnq7zGYu4gfYemz7aAk8q4zUXl/B3/f/Lj/wOsHgloP7gxwIDAQAB");
        tradeCloseModel.setApp_id("2016092800613971");
        tradeCloseModel.setUrl("https://openapi.alipaydev.com/gateway.do");
        tradeCloseModel.setNotify_url("http://localhost:8080");
        tradeCloseModel.setReturn_url("http://localhst:8080");
        tradeCloseModel.setRsa_private_key("MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQCO3MGh8qCgXdT2yqLBvRoLHnkISpWI0YoU9kEpftaMiky3WeuKL5zF8iJ3uVhleP8sIhUzmhiL6cDgE/7kJ5xhcwMRvH3iwVBMhsXlz7+ctxp4rdRs1XmqN6kC+zR7HOX0ULiWeh+ln72+n0+t+SeT4m5R5XXeU4ZbeyuhRAaKq+z5hRkuPGUSrOdCL1k3k8dUHnEU2kGYTj6izQ3t+wbKWVG80gLNKHyfohictYBpME0N7E+7SFtTV6MhFqvfkjU+6pu6PPsFPc7F9QGzYU7fjDwSiRumTuNDrkblnJPErGkpkSKe2y+sXeKdt4BEgnPpe9mF/SP1gs+BTc5VHaDJAgMBAAECggEAPahfVcL+ulfk+yKXviAcZmIfgImYIjW1b7ichQk+Fef2lkeT1c8YzYHkiGGRGjJvhx+qoNvH7lLTsKJQpy3FW3WlBHmip0QhoPWl4bqZC00neqAjh1lXKjTdl/DNRLlDMf/IuwE4OWZJIUVmwUJAZ54ZWPU8uti3qzHssaxHWn+VlTGgJdutoD11DW87WnledxrqCacQe0RpW+Gp3xFhcoiEgRzp/4+xKKdp7zXIYhV8eSg4xvaaiGck6wbP2GTC4TIlnU4U8YXOnyfrnBHIux/iy9be/ClqNrAryC0nBweUBDRSakAJ9Io1ny2OM1ek6XjhtNnLZF5ki3Ano4x7xQKBgQDQe85KN0mZ3s9PJpnGNeVBp5xSd+MgbS51SWeq4tlPZq/KP8y2f7GUK0Ihq8awyKtHbeRuOMfsQSTDD5JweGh/oFBVu32CMpxvP9/6C+yw67oCGMC5IVQ8QT2G7rYN/Pv1exF5hEVFg8btVAJ7PbnTFoh6DP0QzimnIrh3zqICRwKBgQCvbDVFcYPYcc7dsNZcfyVAD3TeNkiqmdDLi76863FbsCQoRNkaMYTEaVPpqsh+cXKrzMDS/Z/agNQqXUYLrTXKKkOmi1OhVmJXr6gEFETZWmx85jolJWimzzpXdieF6gWzSHnKQrQR4tM8DVZM30UE6j/HEdzWjrybodCenfo8bwKBgQCcpYmYpfX9UTZ/CEfecDxzmlaQeFgF00NnCOKFubECQeuvkURlk4iABgjId+LwjbZ0ExPh5XQCBehzT83+B9qsmm4CHL/vBcwYouvNWwxa2qOGU8bq0yoRpAtwyQetdvpxtiipH0NVOfBL/iVnKDfpbTLaUcwLxnvxgtsL2gxMnQKBgQCa60/8XOxX+OH8zE/y7eJiuYO3Pm9cImzPZUF0K+U3WM4Ftg+Y30RmBLKzeDyJ1fy0FiXv70X9vKoiI69ZXoVTXZHTAdZAdD5zO9CAkbnfzchjYRrWdTv/nKDkXpc2315bX1UXN2M5LHzp2sltJ/wXBByA3JiP7wxH0VagzdkRBwKBgEKurZ2H/4tKzxPNK4lvfhWnLtSFuitGvhOJT2QRZHTSUv3ggA8UdJl1vT3meugr7S/JeDAjU0y87M328/VJNPmMdJ33mjAyHuvZmNnXCFMY53AOrt0C5H8Gzu2y4+VrlTba2HbO44V/REKpY4SeSDtu9XTnZ9v6BWX4a0Zyg++a");

        String result = alipayService.tradeClose(tradeCloseModel);
        System.err.println(result);

    }

    @Test
    public void tradeRefund() {
        TradeRefundModel tradeRefundModel = new TradeRefundModel();
        tradeRefundModel.setOut_trade_no("344546345634dd59");
        tradeRefundModel.setRefund_amount(9);
        tradeRefundModel.setRefund_reason("退款4");
        tradeRefundModel.setOut_request_no("1234567");

        tradeRefundModel.setAlipay_public_key("MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA0hJsfeU324d8ef4Twmr1o2qI5Gx0I9dAg4b+0Dqyr8eXwUE/ymXwbedBwbol6FS/D6NlDBo9Im7kOa3wO9SW0EImhjkLKsNw9UNHgwgf2k0iUodEJ9b4HNQ9oclR6Nq8zLpBECEmcUNairkX3dMfc46eU8cRV9fkVA4Ma9OFuzGwcUKSAPC5nPrrGJ6Jccx0XYoSVQcvlQGj2JZu1v45UHU8TA2iTYDN61nZhZfMQwmKvvwO2/j9IzpVoaNCv3IpqpO7AXiFP8tBEBQm9XSMX5XfMXXaJhXTeu34oIumnq7zGYu4gfYemz7aAk8q4zUXl/B3/f/Lj/wOsHgloP7gxwIDAQAB");
        tradeRefundModel.setApp_id("2016092800613971");
        tradeRefundModel.setUrl("https://openapi.alipaydev.com/gateway.do");
        tradeRefundModel.setNotify_url("http://localhost:8080");
        tradeRefundModel.setReturn_url("http://localhst:8080");
        tradeRefundModel.setRsa_private_key("MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQCO3MGh8qCgXdT2yqLBvRoLHnkISpWI0YoU9kEpftaMiky3WeuKL5zF8iJ3uVhleP8sIhUzmhiL6cDgE/7kJ5xhcwMRvH3iwVBMhsXlz7+ctxp4rdRs1XmqN6kC+zR7HOX0ULiWeh+ln72+n0+t+SeT4m5R5XXeU4ZbeyuhRAaKq+z5hRkuPGUSrOdCL1k3k8dUHnEU2kGYTj6izQ3t+wbKWVG80gLNKHyfohictYBpME0N7E+7SFtTV6MhFqvfkjU+6pu6PPsFPc7F9QGzYU7fjDwSiRumTuNDrkblnJPErGkpkSKe2y+sXeKdt4BEgnPpe9mF/SP1gs+BTc5VHaDJAgMBAAECggEAPahfVcL+ulfk+yKXviAcZmIfgImYIjW1b7ichQk+Fef2lkeT1c8YzYHkiGGRGjJvhx+qoNvH7lLTsKJQpy3FW3WlBHmip0QhoPWl4bqZC00neqAjh1lXKjTdl/DNRLlDMf/IuwE4OWZJIUVmwUJAZ54ZWPU8uti3qzHssaxHWn+VlTGgJdutoD11DW87WnledxrqCacQe0RpW+Gp3xFhcoiEgRzp/4+xKKdp7zXIYhV8eSg4xvaaiGck6wbP2GTC4TIlnU4U8YXOnyfrnBHIux/iy9be/ClqNrAryC0nBweUBDRSakAJ9Io1ny2OM1ek6XjhtNnLZF5ki3Ano4x7xQKBgQDQe85KN0mZ3s9PJpnGNeVBp5xSd+MgbS51SWeq4tlPZq/KP8y2f7GUK0Ihq8awyKtHbeRuOMfsQSTDD5JweGh/oFBVu32CMpxvP9/6C+yw67oCGMC5IVQ8QT2G7rYN/Pv1exF5hEVFg8btVAJ7PbnTFoh6DP0QzimnIrh3zqICRwKBgQCvbDVFcYPYcc7dsNZcfyVAD3TeNkiqmdDLi76863FbsCQoRNkaMYTEaVPpqsh+cXKrzMDS/Z/agNQqXUYLrTXKKkOmi1OhVmJXr6gEFETZWmx85jolJWimzzpXdieF6gWzSHnKQrQR4tM8DVZM30UE6j/HEdzWjrybodCenfo8bwKBgQCcpYmYpfX9UTZ/CEfecDxzmlaQeFgF00NnCOKFubECQeuvkURlk4iABgjId+LwjbZ0ExPh5XQCBehzT83+B9qsmm4CHL/vBcwYouvNWwxa2qOGU8bq0yoRpAtwyQetdvpxtiipH0NVOfBL/iVnKDfpbTLaUcwLxnvxgtsL2gxMnQKBgQCa60/8XOxX+OH8zE/y7eJiuYO3Pm9cImzPZUF0K+U3WM4Ftg+Y30RmBLKzeDyJ1fy0FiXv70X9vKoiI69ZXoVTXZHTAdZAdD5zO9CAkbnfzchjYRrWdTv/nKDkXpc2315bX1UXN2M5LHzp2sltJ/wXBByA3JiP7wxH0VagzdkRBwKBgEKurZ2H/4tKzxPNK4lvfhWnLtSFuitGvhOJT2QRZHTSUv3ggA8UdJl1vT3meugr7S/JeDAjU0y87M328/VJNPmMdJ33mjAyHuvZmNnXCFMY53AOrt0C5H8Gzu2y4+VrlTba2HbO44V/REKpY4SeSDtu9XTnZ9v6BWX4a0Zyg++a");

        String result = alipayService.tradeRefund(tradeRefundModel);
        System.err.println(result);

    }


    @Test
    public void orderSettle() {

        OrderSettleModel orderSettleModel = new OrderSettleModel();

        orderSettleModel.setOut_request_no("" + System.currentTimeMillis());
        orderSettleModel.setTrade_no("2019032822001461621000001008");

        List<RoyaltyParameter> royalty_parameters = new ArrayList<RoyaltyParameter>();

        RoyaltyParameter royaltyParameter = new RoyaltyParameter();
        royaltyParameter.setAmount_percentage(100);
        royaltyParameter.setAmount(100.00);
        royaltyParameter.setTrans_in("2088102177561626");
        royaltyParameter.setTrans_out("2088102177615516");
        royaltyParameter.setDesc("怎么不成功");
        royalty_parameters.add(royaltyParameter);
        orderSettleModel.setRoyalty_parameters(royalty_parameters);


        orderSettleModel.setAlipay_public_key("MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA0hJsfeU324d8ef4Twmr1o2qI5Gx0I9dAg4b+0Dqyr8eXwUE/ymXwbedBwbol6FS/D6NlDBo9Im7kOa3wO9SW0EImhjkLKsNw9UNHgwgf2k0iUodEJ9b4HNQ9oclR6Nq8zLpBECEmcUNairkX3dMfc46eU8cRV9fkVA4Ma9OFuzGwcUKSAPC5nPrrGJ6Jccx0XYoSVQcvlQGj2JZu1v45UHU8TA2iTYDN61nZhZfMQwmKvvwO2/j9IzpVoaNCv3IpqpO7AXiFP8tBEBQm9XSMX5XfMXXaJhXTeu34oIumnq7zGYu4gfYemz7aAk8q4zUXl/B3/f/Lj/wOsHgloP7gxwIDAQAB");
        orderSettleModel.setApp_id("2016092800613971");
        orderSettleModel.setUrl("https://openapi.alipaydev.com/gateway.do");
        orderSettleModel.setNotify_url("http://localhost:8080");
        orderSettleModel.setReturn_url("http://localhst:8080");
        orderSettleModel.setRsa_private_key("MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQCO3MGh8qCgXdT2yqLBvRoLHnkISpWI0YoU9kEpftaMiky3WeuKL5zF8iJ3uVhleP8sIhUzmhiL6cDgE/7kJ5xhcwMRvH3iwVBMhsXlz7+ctxp4rdRs1XmqN6kC+zR7HOX0ULiWeh+ln72+n0+t+SeT4m5R5XXeU4ZbeyuhRAaKq+z5hRkuPGUSrOdCL1k3k8dUHnEU2kGYTj6izQ3t+wbKWVG80gLNKHyfohictYBpME0N7E+7SFtTV6MhFqvfkjU+6pu6PPsFPc7F9QGzYU7fjDwSiRumTuNDrkblnJPErGkpkSKe2y+sXeKdt4BEgnPpe9mF/SP1gs+BTc5VHaDJAgMBAAECggEAPahfVcL+ulfk+yKXviAcZmIfgImYIjW1b7ichQk+Fef2lkeT1c8YzYHkiGGRGjJvhx+qoNvH7lLTsKJQpy3FW3WlBHmip0QhoPWl4bqZC00neqAjh1lXKjTdl/DNRLlDMf/IuwE4OWZJIUVmwUJAZ54ZWPU8uti3qzHssaxHWn+VlTGgJdutoD11DW87WnledxrqCacQe0RpW+Gp3xFhcoiEgRzp/4+xKKdp7zXIYhV8eSg4xvaaiGck6wbP2GTC4TIlnU4U8YXOnyfrnBHIux/iy9be/ClqNrAryC0nBweUBDRSakAJ9Io1ny2OM1ek6XjhtNnLZF5ki3Ano4x7xQKBgQDQe85KN0mZ3s9PJpnGNeVBp5xSd+MgbS51SWeq4tlPZq/KP8y2f7GUK0Ihq8awyKtHbeRuOMfsQSTDD5JweGh/oFBVu32CMpxvP9/6C+yw67oCGMC5IVQ8QT2G7rYN/Pv1exF5hEVFg8btVAJ7PbnTFoh6DP0QzimnIrh3zqICRwKBgQCvbDVFcYPYcc7dsNZcfyVAD3TeNkiqmdDLi76863FbsCQoRNkaMYTEaVPpqsh+cXKrzMDS/Z/agNQqXUYLrTXKKkOmi1OhVmJXr6gEFETZWmx85jolJWimzzpXdieF6gWzSHnKQrQR4tM8DVZM30UE6j/HEdzWjrybodCenfo8bwKBgQCcpYmYpfX9UTZ/CEfecDxzmlaQeFgF00NnCOKFubECQeuvkURlk4iABgjId+LwjbZ0ExPh5XQCBehzT83+B9qsmm4CHL/vBcwYouvNWwxa2qOGU8bq0yoRpAtwyQetdvpxtiipH0NVOfBL/iVnKDfpbTLaUcwLxnvxgtsL2gxMnQKBgQCa60/8XOxX+OH8zE/y7eJiuYO3Pm9cImzPZUF0K+U3WM4Ftg+Y30RmBLKzeDyJ1fy0FiXv70X9vKoiI69ZXoVTXZHTAdZAdD5zO9CAkbnfzchjYRrWdTv/nKDkXpc2315bX1UXN2M5LHzp2sltJ/wXBByA3JiP7wxH0VagzdkRBwKBgEKurZ2H/4tKzxPNK4lvfhWnLtSFuitGvhOJT2QRZHTSUv3ggA8UdJl1vT3meugr7S/JeDAjU0y87M328/VJNPmMdJ33mjAyHuvZmNnXCFMY53AOrt0C5H8Gzu2y4+VrlTba2HbO44V/REKpY4SeSDtu9XTnZ9v6BWX4a0Zyg++a");

        String result = alipayService.orderSettle(orderSettleModel);
        System.err.println(result);

    }

    @Test
    public void tradeQuery() {

        TradeQueryModel tradeQueryModel = new TradeQueryModel();

        tradeQueryModel.setOut_trade_no("344546345634dd56");

        tradeQueryModel.setAlipay_public_key("MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA0hJsfeU324d8ef4Twmr1o2qI5Gx0I9dAg4b+0Dqyr8eXwUE/ymXwbedBwbol6FS/D6NlDBo9Im7kOa3wO9SW0EImhjkLKsNw9UNHgwgf2k0iUodEJ9b4HNQ9oclR6Nq8zLpBECEmcUNairkX3dMfc46eU8cRV9fkVA4Ma9OFuzGwcUKSAPC5nPrrGJ6Jccx0XYoSVQcvlQGj2JZu1v45UHU8TA2iTYDN61nZhZfMQwmKvvwO2/j9IzpVoaNCv3IpqpO7AXiFP8tBEBQm9XSMX5XfMXXaJhXTeu34oIumnq7zGYu4gfYemz7aAk8q4zUXl/B3/f/Lj/wOsHgloP7gxwIDAQAB");
        tradeQueryModel.setApp_id("2016092800613971");
        tradeQueryModel.setUrl("https://openapi.alipaydev.com/gateway.do");
        tradeQueryModel.setNotify_url("http://localhost:8080");
        tradeQueryModel.setReturn_url("http://localhst:8080");
        tradeQueryModel.setRsa_private_key("MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQCO3MGh8qCgXdT2yqLBvRoLHnkISpWI0YoU9kEpftaMiky3WeuKL5zF8iJ3uVhleP8sIhUzmhiL6cDgE/7kJ5xhcwMRvH3iwVBMhsXlz7+ctxp4rdRs1XmqN6kC+zR7HOX0ULiWeh+ln72+n0+t+SeT4m5R5XXeU4ZbeyuhRAaKq+z5hRkuPGUSrOdCL1k3k8dUHnEU2kGYTj6izQ3t+wbKWVG80gLNKHyfohictYBpME0N7E+7SFtTV6MhFqvfkjU+6pu6PPsFPc7F9QGzYU7fjDwSiRumTuNDrkblnJPErGkpkSKe2y+sXeKdt4BEgnPpe9mF/SP1gs+BTc5VHaDJAgMBAAECggEAPahfVcL+ulfk+yKXviAcZmIfgImYIjW1b7ichQk+Fef2lkeT1c8YzYHkiGGRGjJvhx+qoNvH7lLTsKJQpy3FW3WlBHmip0QhoPWl4bqZC00neqAjh1lXKjTdl/DNRLlDMf/IuwE4OWZJIUVmwUJAZ54ZWPU8uti3qzHssaxHWn+VlTGgJdutoD11DW87WnledxrqCacQe0RpW+Gp3xFhcoiEgRzp/4+xKKdp7zXIYhV8eSg4xvaaiGck6wbP2GTC4TIlnU4U8YXOnyfrnBHIux/iy9be/ClqNrAryC0nBweUBDRSakAJ9Io1ny2OM1ek6XjhtNnLZF5ki3Ano4x7xQKBgQDQe85KN0mZ3s9PJpnGNeVBp5xSd+MgbS51SWeq4tlPZq/KP8y2f7GUK0Ihq8awyKtHbeRuOMfsQSTDD5JweGh/oFBVu32CMpxvP9/6C+yw67oCGMC5IVQ8QT2G7rYN/Pv1exF5hEVFg8btVAJ7PbnTFoh6DP0QzimnIrh3zqICRwKBgQCvbDVFcYPYcc7dsNZcfyVAD3TeNkiqmdDLi76863FbsCQoRNkaMYTEaVPpqsh+cXKrzMDS/Z/agNQqXUYLrTXKKkOmi1OhVmJXr6gEFETZWmx85jolJWimzzpXdieF6gWzSHnKQrQR4tM8DVZM30UE6j/HEdzWjrybodCenfo8bwKBgQCcpYmYpfX9UTZ/CEfecDxzmlaQeFgF00NnCOKFubECQeuvkURlk4iABgjId+LwjbZ0ExPh5XQCBehzT83+B9qsmm4CHL/vBcwYouvNWwxa2qOGU8bq0yoRpAtwyQetdvpxtiipH0NVOfBL/iVnKDfpbTLaUcwLxnvxgtsL2gxMnQKBgQCa60/8XOxX+OH8zE/y7eJiuYO3Pm9cImzPZUF0K+U3WM4Ftg+Y30RmBLKzeDyJ1fy0FiXv70X9vKoiI69ZXoVTXZHTAdZAdD5zO9CAkbnfzchjYRrWdTv/nKDkXpc2315bX1UXN2M5LHzp2sltJ/wXBByA3JiP7wxH0VagzdkRBwKBgEKurZ2H/4tKzxPNK4lvfhWnLtSFuitGvhOJT2QRZHTSUv3ggA8UdJl1vT3meugr7S/JeDAjU0y87M328/VJNPmMdJ33mjAyHuvZmNnXCFMY53AOrt0C5H8Gzu2y4+VrlTba2HbO44V/REKpY4SeSDtu9XTnZ9v6BWX4a0Zyg++a");

        String result = alipayService.tradeQuery(tradeQueryModel);
        System.err.println(result);

    }

}
