package wz.aggre.pay.service.springcloud.service.test.alipay;

import com.wz.aggre.pay.alipay.model.MarketCashCreateModel;
import com.wz.aggre.pay.alipay.model.pass.CashlessvoucherModel;
import com.wz.aggre.pay.alipay.model.pass.SendCashlessvoucherModel;
import com.wz.aggre.pay.alipay.service.AlipaymarketingService;
import org.junit.Test;
import wz.aggre.pay.service.springcloud.service.test.BaseTest;

import javax.annotation.Resource;

/**
 * @author tianjunwei
 * 2019/3/30 12:34
 */
public class AlipaymarketingServiceTest extends BaseTest {


    @Resource
    private AlipaymarketingService alipaymarketingService;


    @Test
    public void cashCreate() {

        MarketCashCreateModel marketCashCreateModel = new MarketCashCreateModel();

        marketCashCreateModel.setAlipay_public_key("MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA0hJsfeU324d8ef4Twmr1o2qI5Gx0I9dAg4b+0Dqyr8eXwUE/ymXwbedBwbol6FS/D6NlDBo9Im7kOa3wO9SW0EImhjkLKsNw9UNHgwgf2k0iUodEJ9b4HNQ9oclR6Nq8zLpBECEmcUNairkX3dMfc46eU8cRV9fkVA4Ma9OFuzGwcUKSAPC5nPrrGJ6Jccx0XYoSVQcvlQGj2JZu1v45UHU8TA2iTYDN61nZhZfMQwmKvvwO2/j9IzpVoaNCv3IpqpO7AXiFP8tBEBQm9XSMX5XfMXXaJhXTeu34oIumnq7zGYu4gfYemz7aAk8q4zUXl/B3/f/Lj/wOsHgloP7gxwIDAQAB");
        marketCashCreateModel.setApp_id("2016092800613971");
        marketCashCreateModel.setUrl("https://openapi.alipaydev.com/gateway.do");
        marketCashCreateModel.setNotify_url("http://localhost:8080");
        marketCashCreateModel.setReturn_url("http://localhst:8080");
        marketCashCreateModel.setRsa_private_key("MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQCO3MGh8qCgXdT2yqLBvRoLHnkISpWI0YoU9kEpftaMiky3WeuKL5zF8iJ3uVhleP8sIhUzmhiL6cDgE/7kJ5xhcwMRvH3iwVBMhsXlz7+ctxp4rdRs1XmqN6kC+zR7HOX0ULiWeh+ln72+n0+t+SeT4m5R5XXeU4ZbeyuhRAaKq+z5hRkuPGUSrOdCL1k3k8dUHnEU2kGYTj6izQ3t+wbKWVG80gLNKHyfohictYBpME0N7E+7SFtTV6MhFqvfkjU+6pu6PPsFPc7F9QGzYU7fjDwSiRumTuNDrkblnJPErGkpkSKe2y+sXeKdt4BEgnPpe9mF/SP1gs+BTc5VHaDJAgMBAAECggEAPahfVcL+ulfk+yKXviAcZmIfgImYIjW1b7ichQk+Fef2lkeT1c8YzYHkiGGRGjJvhx+qoNvH7lLTsKJQpy3FW3WlBHmip0QhoPWl4bqZC00neqAjh1lXKjTdl/DNRLlDMf/IuwE4OWZJIUVmwUJAZ54ZWPU8uti3qzHssaxHWn+VlTGgJdutoD11DW87WnledxrqCacQe0RpW+Gp3xFhcoiEgRzp/4+xKKdp7zXIYhV8eSg4xvaaiGck6wbP2GTC4TIlnU4U8YXOnyfrnBHIux/iy9be/ClqNrAryC0nBweUBDRSakAJ9Io1ny2OM1ek6XjhtNnLZF5ki3Ano4x7xQKBgQDQe85KN0mZ3s9PJpnGNeVBp5xSd+MgbS51SWeq4tlPZq/KP8y2f7GUK0Ihq8awyKtHbeRuOMfsQSTDD5JweGh/oFBVu32CMpxvP9/6C+yw67oCGMC5IVQ8QT2G7rYN/Pv1exF5hEVFg8btVAJ7PbnTFoh6DP0QzimnIrh3zqICRwKBgQCvbDVFcYPYcc7dsNZcfyVAD3TeNkiqmdDLi76863FbsCQoRNkaMYTEaVPpqsh+cXKrzMDS/Z/agNQqXUYLrTXKKkOmi1OhVmJXr6gEFETZWmx85jolJWimzzpXdieF6gWzSHnKQrQR4tM8DVZM30UE6j/HEdzWjrybodCenfo8bwKBgQCcpYmYpfX9UTZ/CEfecDxzmlaQeFgF00NnCOKFubECQeuvkURlk4iABgjId+LwjbZ0ExPh5XQCBehzT83+B9qsmm4CHL/vBcwYouvNWwxa2qOGU8bq0yoRpAtwyQetdvpxtiipH0NVOfBL/iVnKDfpbTLaUcwLxnvxgtsL2gxMnQKBgQCa60/8XOxX+OH8zE/y7eJiuYO3Pm9cImzPZUF0K+U3WM4Ftg+Y30RmBLKzeDyJ1fy0FiXv70X9vKoiI69ZXoVTXZHTAdZAdD5zO9CAkbnfzchjYRrWdTv/nKDkXpc2315bX1UXN2M5LHzp2sltJ/wXBByA3JiP7wxH0VagzdkRBwKBgEKurZ2H/4tKzxPNK4lvfhWnLtSFuitGvhOJT2QRZHTSUv3ggA8UdJl1vT3meugr7S/JeDAjU0y87M328/VJNPmMdJ33mjAyHuvZmNnXCFMY53AOrt0C5H8Gzu2y4+VrlTba2HbO44V/REKpY4SeSDtu9XTnZ9v6BWX4a0Zyg++a");

        marketCashCreateModel.setParams("{" +
                "\"coupon_name\":\"XXX周年庆红包\"," +
                "\"prize_type\":\"random\"," +
                "\"total_money\":\"1.00\"," +
                "\"total_num\":\"2\"," +
                "\"prize_msg\":\"XXX送您大红包\"," +
                "\"start_time\":\"NowTime\"," +
                "\"end_time\":\"2019-09-20 22:48:30\"," +
                "\"send_freqency\":\"D3|L10\"" +
                "  }");

        String result = alipaymarketingService.campaignCashCreate(marketCashCreateModel);

        System.err.println(result);

    }

    @Test
    public void campaignCashTrigger() {

        MarketCashCreateModel marketCashCreateModel = new MarketCashCreateModel();

        marketCashCreateModel.setAlipay_public_key("MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA0hJsfeU324d8ef4Twmr1o2qI5Gx0I9dAg4b+0Dqyr8eXwUE/ymXwbedBwbol6FS/D6NlDBo9Im7kOa3wO9SW0EImhjkLKsNw9UNHgwgf2k0iUodEJ9b4HNQ9oclR6Nq8zLpBECEmcUNairkX3dMfc46eU8cRV9fkVA4Ma9OFuzGwcUKSAPC5nPrrGJ6Jccx0XYoSVQcvlQGj2JZu1v45UHU8TA2iTYDN61nZhZfMQwmKvvwO2/j9IzpVoaNCv3IpqpO7AXiFP8tBEBQm9XSMX5XfMXXaJhXTeu34oIumnq7zGYu4gfYemz7aAk8q4zUXl/B3/f/Lj/wOsHgloP7gxwIDAQAB");
        marketCashCreateModel.setApp_id("2016092800613971");
        marketCashCreateModel.setUrl("https://openapi.alipaydev.com/gateway.do");
        marketCashCreateModel.setNotify_url("http://localhost:8080");
        marketCashCreateModel.setReturn_url("http://localhst:8080");
        marketCashCreateModel.setRsa_private_key("MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQCO3MGh8qCgXdT2yqLBvRoLHnkISpWI0YoU9kEpftaMiky3WeuKL5zF8iJ3uVhleP8sIhUzmhiL6cDgE/7kJ5xhcwMRvH3iwVBMhsXlz7+ctxp4rdRs1XmqN6kC+zR7HOX0ULiWeh+ln72+n0+t+SeT4m5R5XXeU4ZbeyuhRAaKq+z5hRkuPGUSrOdCL1k3k8dUHnEU2kGYTj6izQ3t+wbKWVG80gLNKHyfohictYBpME0N7E+7SFtTV6MhFqvfkjU+6pu6PPsFPc7F9QGzYU7fjDwSiRumTuNDrkblnJPErGkpkSKe2y+sXeKdt4BEgnPpe9mF/SP1gs+BTc5VHaDJAgMBAAECggEAPahfVcL+ulfk+yKXviAcZmIfgImYIjW1b7ichQk+Fef2lkeT1c8YzYHkiGGRGjJvhx+qoNvH7lLTsKJQpy3FW3WlBHmip0QhoPWl4bqZC00neqAjh1lXKjTdl/DNRLlDMf/IuwE4OWZJIUVmwUJAZ54ZWPU8uti3qzHssaxHWn+VlTGgJdutoD11DW87WnledxrqCacQe0RpW+Gp3xFhcoiEgRzp/4+xKKdp7zXIYhV8eSg4xvaaiGck6wbP2GTC4TIlnU4U8YXOnyfrnBHIux/iy9be/ClqNrAryC0nBweUBDRSakAJ9Io1ny2OM1ek6XjhtNnLZF5ki3Ano4x7xQKBgQDQe85KN0mZ3s9PJpnGNeVBp5xSd+MgbS51SWeq4tlPZq/KP8y2f7GUK0Ihq8awyKtHbeRuOMfsQSTDD5JweGh/oFBVu32CMpxvP9/6C+yw67oCGMC5IVQ8QT2G7rYN/Pv1exF5hEVFg8btVAJ7PbnTFoh6DP0QzimnIrh3zqICRwKBgQCvbDVFcYPYcc7dsNZcfyVAD3TeNkiqmdDLi76863FbsCQoRNkaMYTEaVPpqsh+cXKrzMDS/Z/agNQqXUYLrTXKKkOmi1OhVmJXr6gEFETZWmx85jolJWimzzpXdieF6gWzSHnKQrQR4tM8DVZM30UE6j/HEdzWjrybodCenfo8bwKBgQCcpYmYpfX9UTZ/CEfecDxzmlaQeFgF00NnCOKFubECQeuvkURlk4iABgjId+LwjbZ0ExPh5XQCBehzT83+B9qsmm4CHL/vBcwYouvNWwxa2qOGU8bq0yoRpAtwyQetdvpxtiipH0NVOfBL/iVnKDfpbTLaUcwLxnvxgtsL2gxMnQKBgQCa60/8XOxX+OH8zE/y7eJiuYO3Pm9cImzPZUF0K+U3WM4Ftg+Y30RmBLKzeDyJ1fy0FiXv70X9vKoiI69ZXoVTXZHTAdZAdD5zO9CAkbnfzchjYRrWdTv/nKDkXpc2315bX1UXN2M5LHzp2sltJ/wXBByA3JiP7wxH0VagzdkRBwKBgEKurZ2H/4tKzxPNK4lvfhWnLtSFuitGvhOJT2QRZHTSUv3ggA8UdJl1vT3meugr7S/JeDAjU0y87M328/VJNPmMdJ33mjAyHuvZmNnXCFMY53AOrt0C5H8Gzu2y4+VrlTba2HbO44V/REKpY4SeSDtu9XTnZ9v6BWX4a0Zyg++a");

        marketCashCreateModel.setParams("{" +
                "\"crowd_no\":\"P3yseRFbusMocuIChTjWVea2P7luWXapfa6_2KKO0o3MnSZ96O-zxUfKlHp5cxmx\"," +
                "\"login_id\":\"rwnjgt6318@sandbox.com\"," +
                "\"out_biz_no\":\"1212131\"" +
                "}");

        String result = alipaymarketingService.campaignCashTrigger(marketCashCreateModel);

        System.err.println(result);

    }


    @Test
    public void campaignCashListQueryRequest() {

        MarketCashCreateModel marketCashCreateModel = new MarketCashCreateModel();

        marketCashCreateModel.setAlipay_public_key("MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA0hJsfeU324d8ef4Twmr1o2qI5Gx0I9dAg4b+0Dqyr8eXwUE/ymXwbedBwbol6FS/D6NlDBo9Im7kOa3wO9SW0EImhjkLKsNw9UNHgwgf2k0iUodEJ9b4HNQ9oclR6Nq8zLpBECEmcUNairkX3dMfc46eU8cRV9fkVA4Ma9OFuzGwcUKSAPC5nPrrGJ6Jccx0XYoSVQcvlQGj2JZu1v45UHU8TA2iTYDN61nZhZfMQwmKvvwO2/j9IzpVoaNCv3IpqpO7AXiFP8tBEBQm9XSMX5XfMXXaJhXTeu34oIumnq7zGYu4gfYemz7aAk8q4zUXl/B3/f/Lj/wOsHgloP7gxwIDAQAB");
        marketCashCreateModel.setApp_id("2016092800613971");
        marketCashCreateModel.setUrl("https://openapi.alipaydev.com/gateway.do");
        marketCashCreateModel.setNotify_url("http://localhost:8080");
        marketCashCreateModel.setReturn_url("http://localhst:8080");
        marketCashCreateModel.setRsa_private_key("MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQCO3MGh8qCgXdT2yqLBvRoLHnkISpWI0YoU9kEpftaMiky3WeuKL5zF8iJ3uVhleP8sIhUzmhiL6cDgE/7kJ5xhcwMRvH3iwVBMhsXlz7+ctxp4rdRs1XmqN6kC+zR7HOX0ULiWeh+ln72+n0+t+SeT4m5R5XXeU4ZbeyuhRAaKq+z5hRkuPGUSrOdCL1k3k8dUHnEU2kGYTj6izQ3t+wbKWVG80gLNKHyfohictYBpME0N7E+7SFtTV6MhFqvfkjU+6pu6PPsFPc7F9QGzYU7fjDwSiRumTuNDrkblnJPErGkpkSKe2y+sXeKdt4BEgnPpe9mF/SP1gs+BTc5VHaDJAgMBAAECggEAPahfVcL+ulfk+yKXviAcZmIfgImYIjW1b7ichQk+Fef2lkeT1c8YzYHkiGGRGjJvhx+qoNvH7lLTsKJQpy3FW3WlBHmip0QhoPWl4bqZC00neqAjh1lXKjTdl/DNRLlDMf/IuwE4OWZJIUVmwUJAZ54ZWPU8uti3qzHssaxHWn+VlTGgJdutoD11DW87WnledxrqCacQe0RpW+Gp3xFhcoiEgRzp/4+xKKdp7zXIYhV8eSg4xvaaiGck6wbP2GTC4TIlnU4U8YXOnyfrnBHIux/iy9be/ClqNrAryC0nBweUBDRSakAJ9Io1ny2OM1ek6XjhtNnLZF5ki3Ano4x7xQKBgQDQe85KN0mZ3s9PJpnGNeVBp5xSd+MgbS51SWeq4tlPZq/KP8y2f7GUK0Ihq8awyKtHbeRuOMfsQSTDD5JweGh/oFBVu32CMpxvP9/6C+yw67oCGMC5IVQ8QT2G7rYN/Pv1exF5hEVFg8btVAJ7PbnTFoh6DP0QzimnIrh3zqICRwKBgQCvbDVFcYPYcc7dsNZcfyVAD3TeNkiqmdDLi76863FbsCQoRNkaMYTEaVPpqsh+cXKrzMDS/Z/agNQqXUYLrTXKKkOmi1OhVmJXr6gEFETZWmx85jolJWimzzpXdieF6gWzSHnKQrQR4tM8DVZM30UE6j/HEdzWjrybodCenfo8bwKBgQCcpYmYpfX9UTZ/CEfecDxzmlaQeFgF00NnCOKFubECQeuvkURlk4iABgjId+LwjbZ0ExPh5XQCBehzT83+B9qsmm4CHL/vBcwYouvNWwxa2qOGU8bq0yoRpAtwyQetdvpxtiipH0NVOfBL/iVnKDfpbTLaUcwLxnvxgtsL2gxMnQKBgQCa60/8XOxX+OH8zE/y7eJiuYO3Pm9cImzPZUF0K+U3WM4Ftg+Y30RmBLKzeDyJ1fy0FiXv70X9vKoiI69ZXoVTXZHTAdZAdD5zO9CAkbnfzchjYRrWdTv/nKDkXpc2315bX1UXN2M5LHzp2sltJ/wXBByA3JiP7wxH0VagzdkRBwKBgEKurZ2H/4tKzxPNK4lvfhWnLtSFuitGvhOJT2QRZHTSUv3ggA8UdJl1vT3meugr7S/JeDAjU0y87M328/VJNPmMdJ33mjAyHuvZmNnXCFMY53AOrt0C5H8Gzu2y4+VrlTba2HbO44V/REKpY4SeSDtu9XTnZ9v6BWX4a0Zyg++a");

        marketCashCreateModel.setParams("{" +
                "\"camp_status\":\"READY\"," +
                "\"page_size\":\"10\"," +
                "\"page_index\":\"1\"" +
                "}");

        String result = alipaymarketingService.campaignCashListQueryRequest(marketCashCreateModel);

        System.err.println(result);

    }


    @Test
    public void campaignCashDetailQueryRequest() {

        MarketCashCreateModel marketCashCreateModel = new MarketCashCreateModel();

        marketCashCreateModel.setAlipay_public_key("MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA0hJsfeU324d8ef4Twmr1o2qI5Gx0I9dAg4b+0Dqyr8eXwUE/ymXwbedBwbol6FS/D6NlDBo9Im7kOa3wO9SW0EImhjkLKsNw9UNHgwgf2k0iUodEJ9b4HNQ9oclR6Nq8zLpBECEmcUNairkX3dMfc46eU8cRV9fkVA4Ma9OFuzGwcUKSAPC5nPrrGJ6Jccx0XYoSVQcvlQGj2JZu1v45UHU8TA2iTYDN61nZhZfMQwmKvvwO2/j9IzpVoaNCv3IpqpO7AXiFP8tBEBQm9XSMX5XfMXXaJhXTeu34oIumnq7zGYu4gfYemz7aAk8q4zUXl/B3/f/Lj/wOsHgloP7gxwIDAQAB");
        marketCashCreateModel.setApp_id("2016092800613971");
        marketCashCreateModel.setUrl("https://openapi.alipaydev.com/gateway.do");
        marketCashCreateModel.setNotify_url("http://localhost:8080");
        marketCashCreateModel.setReturn_url("http://localhst:8080");
        marketCashCreateModel.setRsa_private_key("MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQCO3MGh8qCgXdT2yqLBvRoLHnkISpWI0YoU9kEpftaMiky3WeuKL5zF8iJ3uVhleP8sIhUzmhiL6cDgE/7kJ5xhcwMRvH3iwVBMhsXlz7+ctxp4rdRs1XmqN6kC+zR7HOX0ULiWeh+ln72+n0+t+SeT4m5R5XXeU4ZbeyuhRAaKq+z5hRkuPGUSrOdCL1k3k8dUHnEU2kGYTj6izQ3t+wbKWVG80gLNKHyfohictYBpME0N7E+7SFtTV6MhFqvfkjU+6pu6PPsFPc7F9QGzYU7fjDwSiRumTuNDrkblnJPErGkpkSKe2y+sXeKdt4BEgnPpe9mF/SP1gs+BTc5VHaDJAgMBAAECggEAPahfVcL+ulfk+yKXviAcZmIfgImYIjW1b7ichQk+Fef2lkeT1c8YzYHkiGGRGjJvhx+qoNvH7lLTsKJQpy3FW3WlBHmip0QhoPWl4bqZC00neqAjh1lXKjTdl/DNRLlDMf/IuwE4OWZJIUVmwUJAZ54ZWPU8uti3qzHssaxHWn+VlTGgJdutoD11DW87WnledxrqCacQe0RpW+Gp3xFhcoiEgRzp/4+xKKdp7zXIYhV8eSg4xvaaiGck6wbP2GTC4TIlnU4U8YXOnyfrnBHIux/iy9be/ClqNrAryC0nBweUBDRSakAJ9Io1ny2OM1ek6XjhtNnLZF5ki3Ano4x7xQKBgQDQe85KN0mZ3s9PJpnGNeVBp5xSd+MgbS51SWeq4tlPZq/KP8y2f7GUK0Ihq8awyKtHbeRuOMfsQSTDD5JweGh/oFBVu32CMpxvP9/6C+yw67oCGMC5IVQ8QT2G7rYN/Pv1exF5hEVFg8btVAJ7PbnTFoh6DP0QzimnIrh3zqICRwKBgQCvbDVFcYPYcc7dsNZcfyVAD3TeNkiqmdDLi76863FbsCQoRNkaMYTEaVPpqsh+cXKrzMDS/Z/agNQqXUYLrTXKKkOmi1OhVmJXr6gEFETZWmx85jolJWimzzpXdieF6gWzSHnKQrQR4tM8DVZM30UE6j/HEdzWjrybodCenfo8bwKBgQCcpYmYpfX9UTZ/CEfecDxzmlaQeFgF00NnCOKFubECQeuvkURlk4iABgjId+LwjbZ0ExPh5XQCBehzT83+B9qsmm4CHL/vBcwYouvNWwxa2qOGU8bq0yoRpAtwyQetdvpxtiipH0NVOfBL/iVnKDfpbTLaUcwLxnvxgtsL2gxMnQKBgQCa60/8XOxX+OH8zE/y7eJiuYO3Pm9cImzPZUF0K+U3WM4Ftg+Y30RmBLKzeDyJ1fy0FiXv70X9vKoiI69ZXoVTXZHTAdZAdD5zO9CAkbnfzchjYRrWdTv/nKDkXpc2315bX1UXN2M5LHzp2sltJ/wXBByA3JiP7wxH0VagzdkRBwKBgEKurZ2H/4tKzxPNK4lvfhWnLtSFuitGvhOJT2QRZHTSUv3ggA8UdJl1vT3meugr7S/JeDAjU0y87M328/VJNPmMdJ33mjAyHuvZmNnXCFMY53AOrt0C5H8Gzu2y4+VrlTba2HbO44V/REKpY4SeSDtu9XTnZ9v6BWX4a0Zyg++a");

        marketCashCreateModel.setParams("{" +
                "\"crowd_no\":\"P3yseRFbusMocuIChTjWVea2P7luWXapfa6_2KKO0o3MnSZ96O-zxUfKlHp5cxmx\"" +
                "}");

        String result = alipaymarketingService.campaignCashDetailQueryRequest(marketCashCreateModel);

        System.err.println(result);

    }


    @Test
    public void campaignCashStatus() {

        MarketCashCreateModel marketCashCreateModel = new MarketCashCreateModel();

        marketCashCreateModel.setAlipay_public_key("MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA0hJsfeU324d8ef4Twmr1o2qI5Gx0I9dAg4b+0Dqyr8eXwUE/ymXwbedBwbol6FS/D6NlDBo9Im7kOa3wO9SW0EImhjkLKsNw9UNHgwgf2k0iUodEJ9b4HNQ9oclR6Nq8zLpBECEmcUNairkX3dMfc46eU8cRV9fkVA4Ma9OFuzGwcUKSAPC5nPrrGJ6Jccx0XYoSVQcvlQGj2JZu1v45UHU8TA2iTYDN61nZhZfMQwmKvvwO2/j9IzpVoaNCv3IpqpO7AXiFP8tBEBQm9XSMX5XfMXXaJhXTeu34oIumnq7zGYu4gfYemz7aAk8q4zUXl/B3/f/Lj/wOsHgloP7gxwIDAQAB");
        marketCashCreateModel.setApp_id("2016092800613971");
        marketCashCreateModel.setUrl("https://openapi.alipaydev.com/gateway.do");
        marketCashCreateModel.setNotify_url("http://localhost:8080");
        marketCashCreateModel.setReturn_url("http://localhst:8080");
        marketCashCreateModel.setRsa_private_key("MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQCO3MGh8qCgXdT2yqLBvRoLHnkISpWI0YoU9kEpftaMiky3WeuKL5zF8iJ3uVhleP8sIhUzmhiL6cDgE/7kJ5xhcwMRvH3iwVBMhsXlz7+ctxp4rdRs1XmqN6kC+zR7HOX0ULiWeh+ln72+n0+t+SeT4m5R5XXeU4ZbeyuhRAaKq+z5hRkuPGUSrOdCL1k3k8dUHnEU2kGYTj6izQ3t+wbKWVG80gLNKHyfohictYBpME0N7E+7SFtTV6MhFqvfkjU+6pu6PPsFPc7F9QGzYU7fjDwSiRumTuNDrkblnJPErGkpkSKe2y+sXeKdt4BEgnPpe9mF/SP1gs+BTc5VHaDJAgMBAAECggEAPahfVcL+ulfk+yKXviAcZmIfgImYIjW1b7ichQk+Fef2lkeT1c8YzYHkiGGRGjJvhx+qoNvH7lLTsKJQpy3FW3WlBHmip0QhoPWl4bqZC00neqAjh1lXKjTdl/DNRLlDMf/IuwE4OWZJIUVmwUJAZ54ZWPU8uti3qzHssaxHWn+VlTGgJdutoD11DW87WnledxrqCacQe0RpW+Gp3xFhcoiEgRzp/4+xKKdp7zXIYhV8eSg4xvaaiGck6wbP2GTC4TIlnU4U8YXOnyfrnBHIux/iy9be/ClqNrAryC0nBweUBDRSakAJ9Io1ny2OM1ek6XjhtNnLZF5ki3Ano4x7xQKBgQDQe85KN0mZ3s9PJpnGNeVBp5xSd+MgbS51SWeq4tlPZq/KP8y2f7GUK0Ihq8awyKtHbeRuOMfsQSTDD5JweGh/oFBVu32CMpxvP9/6C+yw67oCGMC5IVQ8QT2G7rYN/Pv1exF5hEVFg8btVAJ7PbnTFoh6DP0QzimnIrh3zqICRwKBgQCvbDVFcYPYcc7dsNZcfyVAD3TeNkiqmdDLi76863FbsCQoRNkaMYTEaVPpqsh+cXKrzMDS/Z/agNQqXUYLrTXKKkOmi1OhVmJXr6gEFETZWmx85jolJWimzzpXdieF6gWzSHnKQrQR4tM8DVZM30UE6j/HEdzWjrybodCenfo8bwKBgQCcpYmYpfX9UTZ/CEfecDxzmlaQeFgF00NnCOKFubECQeuvkURlk4iABgjId+LwjbZ0ExPh5XQCBehzT83+B9qsmm4CHL/vBcwYouvNWwxa2qOGU8bq0yoRpAtwyQetdvpxtiipH0NVOfBL/iVnKDfpbTLaUcwLxnvxgtsL2gxMnQKBgQCa60/8XOxX+OH8zE/y7eJiuYO3Pm9cImzPZUF0K+U3WM4Ftg+Y30RmBLKzeDyJ1fy0FiXv70X9vKoiI69ZXoVTXZHTAdZAdD5zO9CAkbnfzchjYRrWdTv/nKDkXpc2315bX1UXN2M5LHzp2sltJ/wXBByA3JiP7wxH0VagzdkRBwKBgEKurZ2H/4tKzxPNK4lvfhWnLtSFuitGvhOJT2QRZHTSUv3ggA8UdJl1vT3meugr7S/JeDAjU0y87M328/VJNPmMdJ33mjAyHuvZmNnXCFMY53AOrt0C5H8Gzu2y4+VrlTba2HbO44V/REKpY4SeSDtu9XTnZ9v6BWX4a0Zyg++a");

        marketCashCreateModel.setParams("{" +
                "\"crowd_no\":\"32qQQerKP8QVlmxA9PdhtaGDPSNKQgzs5apr7yDhVCzMnSZ96O-zxUfKlHp5cxmx\"," +
                "\"camp_status\":\"READY\"" +
                "  }");

        String result = alipaymarketingService.campaignCashStatus(marketCashCreateModel);

        System.err.println(result);

    }

    @Test
    public void cashlessvoucherCreate() {

        CashlessvoucherModel cashlessvoucherModel = new CashlessvoucherModel();

        cashlessvoucherModel.setAlipay_public_key("MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA0hJsfeU324d8ef4Twmr1o2qI5Gx0I9dAg4b+0Dqyr8eXwUE/ymXwbedBwbol6FS/D6NlDBo9Im7kOa3wO9SW0EImhjkLKsNw9UNHgwgf2k0iUodEJ9b4HNQ9oclR6Nq8zLpBECEmcUNairkX3dMfc46eU8cRV9fkVA4Ma9OFuzGwcUKSAPC5nPrrGJ6Jccx0XYoSVQcvlQGj2JZu1v45UHU8TA2iTYDN61nZhZfMQwmKvvwO2/j9IzpVoaNCv3IpqpO7AXiFP8tBEBQm9XSMX5XfMXXaJhXTeu34oIumnq7zGYu4gfYemz7aAk8q4zUXl/B3/f/Lj/wOsHgloP7gxwIDAQAB");
        cashlessvoucherModel.setApp_id("2016092800613971");
        cashlessvoucherModel.setUrl("https://openapi.alipaydev.com/gateway.do");
        cashlessvoucherModel.setNotify_url("http://localhost:8080");
        cashlessvoucherModel.setReturn_url("http://localhst:8080");
        cashlessvoucherModel.setRsa_private_key("MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQCO3MGh8qCgXdT2yqLBvRoLHnkISpWI0YoU9kEpftaMiky3WeuKL5zF8iJ3uVhleP8sIhUzmhiL6cDgE/7kJ5xhcwMRvH3iwVBMhsXlz7+ctxp4rdRs1XmqN6kC+zR7HOX0ULiWeh+ln72+n0+t+SeT4m5R5XXeU4ZbeyuhRAaKq+z5hRkuPGUSrOdCL1k3k8dUHnEU2kGYTj6izQ3t+wbKWVG80gLNKHyfohictYBpME0N7E+7SFtTV6MhFqvfkjU+6pu6PPsFPc7F9QGzYU7fjDwSiRumTuNDrkblnJPErGkpkSKe2y+sXeKdt4BEgnPpe9mF/SP1gs+BTc5VHaDJAgMBAAECggEAPahfVcL+ulfk+yKXviAcZmIfgImYIjW1b7ichQk+Fef2lkeT1c8YzYHkiGGRGjJvhx+qoNvH7lLTsKJQpy3FW3WlBHmip0QhoPWl4bqZC00neqAjh1lXKjTdl/DNRLlDMf/IuwE4OWZJIUVmwUJAZ54ZWPU8uti3qzHssaxHWn+VlTGgJdutoD11DW87WnledxrqCacQe0RpW+Gp3xFhcoiEgRzp/4+xKKdp7zXIYhV8eSg4xvaaiGck6wbP2GTC4TIlnU4U8YXOnyfrnBHIux/iy9be/ClqNrAryC0nBweUBDRSakAJ9Io1ny2OM1ek6XjhtNnLZF5ki3Ano4x7xQKBgQDQe85KN0mZ3s9PJpnGNeVBp5xSd+MgbS51SWeq4tlPZq/KP8y2f7GUK0Ihq8awyKtHbeRuOMfsQSTDD5JweGh/oFBVu32CMpxvP9/6C+yw67oCGMC5IVQ8QT2G7rYN/Pv1exF5hEVFg8btVAJ7PbnTFoh6DP0QzimnIrh3zqICRwKBgQCvbDVFcYPYcc7dsNZcfyVAD3TeNkiqmdDLi76863FbsCQoRNkaMYTEaVPpqsh+cXKrzMDS/Z/agNQqXUYLrTXKKkOmi1OhVmJXr6gEFETZWmx85jolJWimzzpXdieF6gWzSHnKQrQR4tM8DVZM30UE6j/HEdzWjrybodCenfo8bwKBgQCcpYmYpfX9UTZ/CEfecDxzmlaQeFgF00NnCOKFubECQeuvkURlk4iABgjId+LwjbZ0ExPh5XQCBehzT83+B9qsmm4CHL/vBcwYouvNWwxa2qOGU8bq0yoRpAtwyQetdvpxtiipH0NVOfBL/iVnKDfpbTLaUcwLxnvxgtsL2gxMnQKBgQCa60/8XOxX+OH8zE/y7eJiuYO3Pm9cImzPZUF0K+U3WM4Ftg+Y30RmBLKzeDyJ1fy0FiXv70X9vKoiI69ZXoVTXZHTAdZAdD5zO9CAkbnfzchjYRrWdTv/nKDkXpc2315bX1UXN2M5LHzp2sltJ/wXBByA3JiP7wxH0VagzdkRBwKBgEKurZ2H/4tKzxPNK4lvfhWnLtSFuitGvhOJT2QRZHTSUv3ggA8UdJl1vT3meugr7S/JeDAjU0y87M328/VJNPmMdJ33mjAyHuvZmNnXCFMY53AOrt0C5H8Gzu2y4+VrlTba2HbO44V/REKpY4SeSDtu9XTnZ9v6BWX4a0Zyg++a");

        cashlessvoucherModel.setParams("{" +
                "\"voucher_type\":\"CASHLESS_FIX_VOUCHER\"," +
                "\"brand_name\":\"星巴克\"," +
                "\"publish_start_time\":\"2019-04-25 00:00:00\"," +
                "\"publish_end_time\":\"2019-10-30 23:59:59\"," +
                "\"voucher_valid_period\":\"{\\\"type\\\": \\\"ABSOLUTE\\\", \\\"start\\\": \\\"2019-04-10 00:00:00\\\", \\\"end\\\": \\\"2019-05-13 23:59:59\\\"}\"," +
                "\"voucher_available_time\":\"[{\\\"day_rule\\\": \\\"1,2,3,4,5\\\", \\\"time_begin\\\": \\\"09:00:00\\\", \\\"time_end\\\": \\\"22:00:00\\\"}]\"," +
                "\"out_biz_no\":\"20170101000001654bb46ba\"," +
                "\"voucher_description\":\"[\\\"1、本券不可兑换现金，不可找零。\\\",\\\"2、每个用户最多可以领取1张。\\\",\\\"3、如果订单发生退款，优惠券无法退还。\\\"]\"," +
                "\"voucher_quantity\":100," +
                "\"amount\":1.01," +
                "\"total_amount\":10000.00," +
                "\"floor_amount\":10.00" +
                "  }");

        String result = alipaymarketingService.cashlessvoucherCreate(cashlessvoucherModel);

        System.err.println(result);

    }

}
