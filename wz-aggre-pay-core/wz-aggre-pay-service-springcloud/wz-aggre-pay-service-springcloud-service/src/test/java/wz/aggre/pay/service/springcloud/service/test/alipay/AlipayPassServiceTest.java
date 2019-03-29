package wz.aggre.pay.service.springcloud.service.test.alipay;

import com.alibaba.fastjson.JSON;
import com.wz.aggre.pay.alipay.model.pass.PassInstanceAddModel;
import com.wz.aggre.pay.alipay.model.pass.PassInstanceUpdateModel;
import com.wz.aggre.pay.alipay.model.pass.PassTemplateModel;
import com.wz.aggre.pay.alipay.service.AlipayPassService;
import org.junit.Test;
import wz.aggre.pay.service.springcloud.service.test.BaseTest;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;


/**
 * @author tianjunwei
 * @date 2019/3/29 16:22
 */

public class AlipayPassServiceTest extends BaseTest {


    @Resource
    private AlipayPassService alipayPassService;


    @Test
    public void passTemplateAdd() {

        PassTemplateModel passTemplateModel = new PassTemplateModel();

        passTemplateModel.setAlipay_public_key("MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA0hJsfeU324d8ef4Twmr1o2qI5Gx0I9dAg4b+0Dqyr8eXwUE/ymXwbedBwbol6FS/D6NlDBo9Im7kOa3wO9SW0EImhjkLKsNw9UNHgwgf2k0iUodEJ9b4HNQ9oclR6Nq8zLpBECEmcUNairkX3dMfc46eU8cRV9fkVA4Ma9OFuzGwcUKSAPC5nPrrGJ6Jccx0XYoSVQcvlQGj2JZu1v45UHU8TA2iTYDN61nZhZfMQwmKvvwO2/j9IzpVoaNCv3IpqpO7AXiFP8tBEBQm9XSMX5XfMXXaJhXTeu34oIumnq7zGYu4gfYemz7aAk8q4zUXl/B3/f/Lj/wOsHgloP7gxwIDAQAB");
        passTemplateModel.setApp_id("2016092800613971");
        passTemplateModel.setUrl("https://openapi.alipaydev.com/gateway.do");
        passTemplateModel.setNotify_url("http://localhost:8080");
        passTemplateModel.setReturn_url("http://localhst:8080");
        passTemplateModel.setRsa_private_key("MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQCO3MGh8qCgXdT2yqLBvRoLHnkISpWI0YoU9kEpftaMiky3WeuKL5zF8iJ3uVhleP8sIhUzmhiL6cDgE/7kJ5xhcwMRvH3iwVBMhsXlz7+ctxp4rdRs1XmqN6kC+zR7HOX0ULiWeh+ln72+n0+t+SeT4m5R5XXeU4ZbeyuhRAaKq+z5hRkuPGUSrOdCL1k3k8dUHnEU2kGYTj6izQ3t+wbKWVG80gLNKHyfohictYBpME0N7E+7SFtTV6MhFqvfkjU+6pu6PPsFPc7F9QGzYU7fjDwSiRumTuNDrkblnJPErGkpkSKe2y+sXeKdt4BEgnPpe9mF/SP1gs+BTc5VHaDJAgMBAAECggEAPahfVcL+ulfk+yKXviAcZmIfgImYIjW1b7ichQk+Fef2lkeT1c8YzYHkiGGRGjJvhx+qoNvH7lLTsKJQpy3FW3WlBHmip0QhoPWl4bqZC00neqAjh1lXKjTdl/DNRLlDMf/IuwE4OWZJIUVmwUJAZ54ZWPU8uti3qzHssaxHWn+VlTGgJdutoD11DW87WnledxrqCacQe0RpW+Gp3xFhcoiEgRzp/4+xKKdp7zXIYhV8eSg4xvaaiGck6wbP2GTC4TIlnU4U8YXOnyfrnBHIux/iy9be/ClqNrAryC0nBweUBDRSakAJ9Io1ny2OM1ek6XjhtNnLZF5ki3Ano4x7xQKBgQDQe85KN0mZ3s9PJpnGNeVBp5xSd+MgbS51SWeq4tlPZq/KP8y2f7GUK0Ihq8awyKtHbeRuOMfsQSTDD5JweGh/oFBVu32CMpxvP9/6C+yw67oCGMC5IVQ8QT2G7rYN/Pv1exF5hEVFg8btVAJ7PbnTFoh6DP0QzimnIrh3zqICRwKBgQCvbDVFcYPYcc7dsNZcfyVAD3TeNkiqmdDLi76863FbsCQoRNkaMYTEaVPpqsh+cXKrzMDS/Z/agNQqXUYLrTXKKkOmi1OhVmJXr6gEFETZWmx85jolJWimzzpXdieF6gWzSHnKQrQR4tM8DVZM30UE6j/HEdzWjrybodCenfo8bwKBgQCcpYmYpfX9UTZ/CEfecDxzmlaQeFgF00NnCOKFubECQeuvkURlk4iABgjId+LwjbZ0ExPh5XQCBehzT83+B9qsmm4CHL/vBcwYouvNWwxa2qOGU8bq0yoRpAtwyQetdvpxtiipH0NVOfBL/iVnKDfpbTLaUcwLxnvxgtsL2gxMnQKBgQCa60/8XOxX+OH8zE/y7eJiuYO3Pm9cImzPZUF0K+U3WM4Ftg+Y30RmBLKzeDyJ1fy0FiXv70X9vKoiI69ZXoVTXZHTAdZAdD5zO9CAkbnfzchjYRrWdTv/nKDkXpc2315bX1UXN2M5LHzp2sltJ/wXBByA3JiP7wxH0VagzdkRBwKBgEKurZ2H/4tKzxPNK4lvfhWnLtSFuitGvhOJT2QRZHTSUv3ggA8UdJl1vT3meugr7S/JeDAjU0y87M328/VJNPmMdJ33mjAyHuvZmNnXCFMY53AOrt0C5H8Gzu2y4+VrlTba2HbO44V/REKpY4SeSDtu9XTnZ9v6BWX4a0Zyg++a");


        passTemplateModel.setUnique_id("112233445566");

        Map<String, String> tpl_contentMap = new HashMap<String, String>();

        tpl_contentMap.put("logo", "https://alipass.alipay.com//temps/free/logo.png");
        tpl_contentMap.put("strip", "https://alipass.alipay.com//temps/free/strip.png");
        tpl_contentMap.put("icon", "http://alipassprod.test.alipay.net/temps/free/icon.png");
        tpl_contentMap.put("content","{\"evoucherInfo\":{\"title\":\"四季风情优惠券\",\"type\":\"coupon\",\"product\":\"free\",\"startDate\":\"2019-03-14 15:32:23\",\"endDate\":\"2019-12-27 15:32:23\",\"operation\":[{\"format\":\"qrcode\",\"message\":\"45612346579465\",\"messageEncoding\":\"UTF-8\",\"altText\":\"45612346579465\"},{\"format\":\"barcode\",\"message\":\"45612346579465\",\"messageEncoding\":\"UTF-8\",\"altText\":\"45612346579465\"}],\"einfo\":{\"logoText\":\"四季风情优惠券\",\"headFields\":[{\"key\":\"status\",\"label\":\"状态\",\"value\":\"可使用\",\"type\":\"text\"}],\"primaryFields\":[{\"key\":\"strip\",\"label\":\"\",\"value\":\"凭此券即可打8.5折\",\"type\":\"text\"}],\"secondaryFields\":[{\"key\":\"validDate\",\"label\":\"有效期至：\",\"value\":\"2022-06-18 23:59:59\",\"type\":\"text\"}],\"auxiliaryFields\":[],\"backFields\":[{\"key\":\"description\",\"label\":\"详情描述\",\"value\":\"1.该优惠有效期：截止至2014年06月18日；\\n2.凭此券可以享受以下优惠：\\n享门市价8.5折优惠\\n不与其他优惠同享。详询商家。\",\"type\":\"text\"},{\"key\":\"shops\",\"label\":\"可用门店\",\"value\":\"\",\"type\":\"text\"},{\"key\":\"disclaimer\",\"label\":\"负责声明\",\"value\":\"除特殊注明外，本优惠不能与其他优惠同时享受； 本优惠最终解释权归商家所有，如有疑问请与商家联系。 提示：为了使您得到更好的服务，请在进店时出示本券。\",\"type\":\"text\"}]},\"locations\":[],\"remindInfo\":{\"offset\":\"2\"}},\"merchant\":{\"mname\":\"田军伟\",\"mtel\":\"\",\"minfo\":\"\"},\"platform\":{\"channelID\":\"2088201564809153\",\"webServiceUrl\":\"https://alipass.alipay.com/builder/syncRecord.htm?tempId=2019032915321477973768409\"},\"style\":{\"backgroundColor\":\"RGB(255,126,0)\"},\"fileInfo\":{\"formatVersion\":\"2\",\"canShare\":true,\"canBuy\":false,\"canPresent\":true,\"serialNumber\":\"2019032915352725051420246\",\"supportTaxi\":\"true\",\"taxiSchemaUrl\":\"alipays://platformapi/startapp?appId=20000778&bizid=260&channel=71322\"},\"appInfo\":{\"app\":{\"android_appid\":\"com.taobao.ecoupon\",\"ios_appid\":\"taobaolife://\",\"android_launch\":\"com.taobao.ecoupon\",\"ios_launch\":\"taobaolife://\",\"android_download\":\"http://download.taobaocdn.com/freedom/17988/andriod/Ecoupon_2.0.1_taobao_wap.apk\",\"ios_download\":\"https://itunes.apple.com/cn/app/id583295537\"},\"label\":\"淘宝券券APP\",\"message\":\"点击调起APP\"},\"source\":\"alipassprod\",\"alipayVerify\":[]}");

        passTemplateModel.setTpl_content(JSON.toJSONString(tpl_contentMap));

        String result = alipayPassService.passTemplateAdd(passTemplateModel);

        System.err.println(result);

    }

    @Test
    public void passTemplateUpdate() {

        PassTemplateModel passTemplateModel = new PassTemplateModel();

        passTemplateModel.setAlipay_public_key("MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA0hJsfeU324d8ef4Twmr1o2qI5Gx0I9dAg4b+0Dqyr8eXwUE/ymXwbedBwbol6FS/D6NlDBo9Im7kOa3wO9SW0EImhjkLKsNw9UNHgwgf2k0iUodEJ9b4HNQ9oclR6Nq8zLpBECEmcUNairkX3dMfc46eU8cRV9fkVA4Ma9OFuzGwcUKSAPC5nPrrGJ6Jccx0XYoSVQcvlQGj2JZu1v45UHU8TA2iTYDN61nZhZfMQwmKvvwO2/j9IzpVoaNCv3IpqpO7AXiFP8tBEBQm9XSMX5XfMXXaJhXTeu34oIumnq7zGYu4gfYemz7aAk8q4zUXl/B3/f/Lj/wOsHgloP7gxwIDAQAB");
        passTemplateModel.setApp_id("2016092800613971");
        passTemplateModel.setUrl("https://openapi.alipaydev.com/gateway.do");
        passTemplateModel.setNotify_url("http://localhost:8080");
        passTemplateModel.setReturn_url("http://localhst:8080");
        passTemplateModel.setRsa_private_key("MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQCO3MGh8qCgXdT2yqLBvRoLHnkISpWI0YoU9kEpftaMiky3WeuKL5zF8iJ3uVhleP8sIhUzmhiL6cDgE/7kJ5xhcwMRvH3iwVBMhsXlz7+ctxp4rdRs1XmqN6kC+zR7HOX0ULiWeh+ln72+n0+t+SeT4m5R5XXeU4ZbeyuhRAaKq+z5hRkuPGUSrOdCL1k3k8dUHnEU2kGYTj6izQ3t+wbKWVG80gLNKHyfohictYBpME0N7E+7SFtTV6MhFqvfkjU+6pu6PPsFPc7F9QGzYU7fjDwSiRumTuNDrkblnJPErGkpkSKe2y+sXeKdt4BEgnPpe9mF/SP1gs+BTc5VHaDJAgMBAAECggEAPahfVcL+ulfk+yKXviAcZmIfgImYIjW1b7ichQk+Fef2lkeT1c8YzYHkiGGRGjJvhx+qoNvH7lLTsKJQpy3FW3WlBHmip0QhoPWl4bqZC00neqAjh1lXKjTdl/DNRLlDMf/IuwE4OWZJIUVmwUJAZ54ZWPU8uti3qzHssaxHWn+VlTGgJdutoD11DW87WnledxrqCacQe0RpW+Gp3xFhcoiEgRzp/4+xKKdp7zXIYhV8eSg4xvaaiGck6wbP2GTC4TIlnU4U8YXOnyfrnBHIux/iy9be/ClqNrAryC0nBweUBDRSakAJ9Io1ny2OM1ek6XjhtNnLZF5ki3Ano4x7xQKBgQDQe85KN0mZ3s9PJpnGNeVBp5xSd+MgbS51SWeq4tlPZq/KP8y2f7GUK0Ihq8awyKtHbeRuOMfsQSTDD5JweGh/oFBVu32CMpxvP9/6C+yw67oCGMC5IVQ8QT2G7rYN/Pv1exF5hEVFg8btVAJ7PbnTFoh6DP0QzimnIrh3zqICRwKBgQCvbDVFcYPYcc7dsNZcfyVAD3TeNkiqmdDLi76863FbsCQoRNkaMYTEaVPpqsh+cXKrzMDS/Z/agNQqXUYLrTXKKkOmi1OhVmJXr6gEFETZWmx85jolJWimzzpXdieF6gWzSHnKQrQR4tM8DVZM30UE6j/HEdzWjrybodCenfo8bwKBgQCcpYmYpfX9UTZ/CEfecDxzmlaQeFgF00NnCOKFubECQeuvkURlk4iABgjId+LwjbZ0ExPh5XQCBehzT83+B9qsmm4CHL/vBcwYouvNWwxa2qOGU8bq0yoRpAtwyQetdvpxtiipH0NVOfBL/iVnKDfpbTLaUcwLxnvxgtsL2gxMnQKBgQCa60/8XOxX+OH8zE/y7eJiuYO3Pm9cImzPZUF0K+U3WM4Ftg+Y30RmBLKzeDyJ1fy0FiXv70X9vKoiI69ZXoVTXZHTAdZAdD5zO9CAkbnfzchjYRrWdTv/nKDkXpc2315bX1UXN2M5LHzp2sltJ/wXBByA3JiP7wxH0VagzdkRBwKBgEKurZ2H/4tKzxPNK4lvfhWnLtSFuitGvhOJT2QRZHTSUv3ggA8UdJl1vT3meugr7S/JeDAjU0y87M328/VJNPmMdJ33mjAyHuvZmNnXCFMY53AOrt0C5H8Gzu2y4+VrlTba2HbO44V/REKpY4SeSDtu9XTnZ9v6BWX4a0Zyg++a");


        String result = alipayPassService.passTemplateUpdate(passTemplateModel);

        System.err.println(result);

    }

    @Test
    public void passInstanceAdd() {

        PassInstanceAddModel passInstanceAddModel = new PassInstanceAddModel();

        passInstanceAddModel.setAlipay_public_key("MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA0hJsfeU324d8ef4Twmr1o2qI5Gx0I9dAg4b+0Dqyr8eXwUE/ymXwbedBwbol6FS/D6NlDBo9Im7kOa3wO9SW0EImhjkLKsNw9UNHgwgf2k0iUodEJ9b4HNQ9oclR6Nq8zLpBECEmcUNairkX3dMfc46eU8cRV9fkVA4Ma9OFuzGwcUKSAPC5nPrrGJ6Jccx0XYoSVQcvlQGj2JZu1v45UHU8TA2iTYDN61nZhZfMQwmKvvwO2/j9IzpVoaNCv3IpqpO7AXiFP8tBEBQm9XSMX5XfMXXaJhXTeu34oIumnq7zGYu4gfYemz7aAk8q4zUXl/B3/f/Lj/wOsHgloP7gxwIDAQAB");
        passInstanceAddModel.setApp_id("2016092800613971");
        passInstanceAddModel.setUrl("https://openapi.alipaydev.com/gateway.do");
        passInstanceAddModel.setNotify_url("http://localhost:8080");
        passInstanceAddModel.setReturn_url("http://localhst:8080");
        passInstanceAddModel.setRsa_private_key("MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQCO3MGh8qCgXdT2yqLBvRoLHnkISpWI0YoU9kEpftaMiky3WeuKL5zF8iJ3uVhleP8sIhUzmhiL6cDgE/7kJ5xhcwMRvH3iwVBMhsXlz7+ctxp4rdRs1XmqN6kC+zR7HOX0ULiWeh+ln72+n0+t+SeT4m5R5XXeU4ZbeyuhRAaKq+z5hRkuPGUSrOdCL1k3k8dUHnEU2kGYTj6izQ3t+wbKWVG80gLNKHyfohictYBpME0N7E+7SFtTV6MhFqvfkjU+6pu6PPsFPc7F9QGzYU7fjDwSiRumTuNDrkblnJPErGkpkSKe2y+sXeKdt4BEgnPpe9mF/SP1gs+BTc5VHaDJAgMBAAECggEAPahfVcL+ulfk+yKXviAcZmIfgImYIjW1b7ichQk+Fef2lkeT1c8YzYHkiGGRGjJvhx+qoNvH7lLTsKJQpy3FW3WlBHmip0QhoPWl4bqZC00neqAjh1lXKjTdl/DNRLlDMf/IuwE4OWZJIUVmwUJAZ54ZWPU8uti3qzHssaxHWn+VlTGgJdutoD11DW87WnledxrqCacQe0RpW+Gp3xFhcoiEgRzp/4+xKKdp7zXIYhV8eSg4xvaaiGck6wbP2GTC4TIlnU4U8YXOnyfrnBHIux/iy9be/ClqNrAryC0nBweUBDRSakAJ9Io1ny2OM1ek6XjhtNnLZF5ki3Ano4x7xQKBgQDQe85KN0mZ3s9PJpnGNeVBp5xSd+MgbS51SWeq4tlPZq/KP8y2f7GUK0Ihq8awyKtHbeRuOMfsQSTDD5JweGh/oFBVu32CMpxvP9/6C+yw67oCGMC5IVQ8QT2G7rYN/Pv1exF5hEVFg8btVAJ7PbnTFoh6DP0QzimnIrh3zqICRwKBgQCvbDVFcYPYcc7dsNZcfyVAD3TeNkiqmdDLi76863FbsCQoRNkaMYTEaVPpqsh+cXKrzMDS/Z/agNQqXUYLrTXKKkOmi1OhVmJXr6gEFETZWmx85jolJWimzzpXdieF6gWzSHnKQrQR4tM8DVZM30UE6j/HEdzWjrybodCenfo8bwKBgQCcpYmYpfX9UTZ/CEfecDxzmlaQeFgF00NnCOKFubECQeuvkURlk4iABgjId+LwjbZ0ExPh5XQCBehzT83+B9qsmm4CHL/vBcwYouvNWwxa2qOGU8bq0yoRpAtwyQetdvpxtiipH0NVOfBL/iVnKDfpbTLaUcwLxnvxgtsL2gxMnQKBgQCa60/8XOxX+OH8zE/y7eJiuYO3Pm9cImzPZUF0K+U3WM4Ftg+Y30RmBLKzeDyJ1fy0FiXv70X9vKoiI69ZXoVTXZHTAdZAdD5zO9CAkbnfzchjYRrWdTv/nKDkXpc2315bX1UXN2M5LHzp2sltJ/wXBByA3JiP7wxH0VagzdkRBwKBgEKurZ2H/4tKzxPNK4lvfhWnLtSFuitGvhOJT2QRZHTSUv3ggA8UdJl1vT3meugr7S/JeDAjU0y87M328/VJNPmMdJ33mjAyHuvZmNnXCFMY53AOrt0C5H8Gzu2y4+VrlTba2HbO44V/REKpY4SeSDtu9XTnZ9v6BWX4a0Zyg++a");


        String result = alipayPassService.passInstanceAdd(passInstanceAddModel);

        System.err.println(result);


    }

    @Test
    public void passInstanceUpdate() {

        PassInstanceUpdateModel passInstanceUpdateModel = new PassInstanceUpdateModel();

        passInstanceUpdateModel.setAlipay_public_key("MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA0hJsfeU324d8ef4Twmr1o2qI5Gx0I9dAg4b+0Dqyr8eXwUE/ymXwbedBwbol6FS/D6NlDBo9Im7kOa3wO9SW0EImhjkLKsNw9UNHgwgf2k0iUodEJ9b4HNQ9oclR6Nq8zLpBECEmcUNairkX3dMfc46eU8cRV9fkVA4Ma9OFuzGwcUKSAPC5nPrrGJ6Jccx0XYoSVQcvlQGj2JZu1v45UHU8TA2iTYDN61nZhZfMQwmKvvwO2/j9IzpVoaNCv3IpqpO7AXiFP8tBEBQm9XSMX5XfMXXaJhXTeu34oIumnq7zGYu4gfYemz7aAk8q4zUXl/B3/f/Lj/wOsHgloP7gxwIDAQAB");
        passInstanceUpdateModel.setApp_id("2016092800613971");
        passInstanceUpdateModel.setUrl("https://openapi.alipaydev.com/gateway.do");
        passInstanceUpdateModel.setNotify_url("http://localhost:8080");
        passInstanceUpdateModel.setReturn_url("http://localhst:8080");
        passInstanceUpdateModel.setRsa_private_key("MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQCO3MGh8qCgXdT2yqLBvRoLHnkISpWI0YoU9kEpftaMiky3WeuKL5zF8iJ3uVhleP8sIhUzmhiL6cDgE/7kJ5xhcwMRvH3iwVBMhsXlz7+ctxp4rdRs1XmqN6kC+zR7HOX0ULiWeh+ln72+n0+t+SeT4m5R5XXeU4ZbeyuhRAaKq+z5hRkuPGUSrOdCL1k3k8dUHnEU2kGYTj6izQ3t+wbKWVG80gLNKHyfohictYBpME0N7E+7SFtTV6MhFqvfkjU+6pu6PPsFPc7F9QGzYU7fjDwSiRumTuNDrkblnJPErGkpkSKe2y+sXeKdt4BEgnPpe9mF/SP1gs+BTc5VHaDJAgMBAAECggEAPahfVcL+ulfk+yKXviAcZmIfgImYIjW1b7ichQk+Fef2lkeT1c8YzYHkiGGRGjJvhx+qoNvH7lLTsKJQpy3FW3WlBHmip0QhoPWl4bqZC00neqAjh1lXKjTdl/DNRLlDMf/IuwE4OWZJIUVmwUJAZ54ZWPU8uti3qzHssaxHWn+VlTGgJdutoD11DW87WnledxrqCacQe0RpW+Gp3xFhcoiEgRzp/4+xKKdp7zXIYhV8eSg4xvaaiGck6wbP2GTC4TIlnU4U8YXOnyfrnBHIux/iy9be/ClqNrAryC0nBweUBDRSakAJ9Io1ny2OM1ek6XjhtNnLZF5ki3Ano4x7xQKBgQDQe85KN0mZ3s9PJpnGNeVBp5xSd+MgbS51SWeq4tlPZq/KP8y2f7GUK0Ihq8awyKtHbeRuOMfsQSTDD5JweGh/oFBVu32CMpxvP9/6C+yw67oCGMC5IVQ8QT2G7rYN/Pv1exF5hEVFg8btVAJ7PbnTFoh6DP0QzimnIrh3zqICRwKBgQCvbDVFcYPYcc7dsNZcfyVAD3TeNkiqmdDLi76863FbsCQoRNkaMYTEaVPpqsh+cXKrzMDS/Z/agNQqXUYLrTXKKkOmi1OhVmJXr6gEFETZWmx85jolJWimzzpXdieF6gWzSHnKQrQR4tM8DVZM30UE6j/HEdzWjrybodCenfo8bwKBgQCcpYmYpfX9UTZ/CEfecDxzmlaQeFgF00NnCOKFubECQeuvkURlk4iABgjId+LwjbZ0ExPh5XQCBehzT83+B9qsmm4CHL/vBcwYouvNWwxa2qOGU8bq0yoRpAtwyQetdvpxtiipH0NVOfBL/iVnKDfpbTLaUcwLxnvxgtsL2gxMnQKBgQCa60/8XOxX+OH8zE/y7eJiuYO3Pm9cImzPZUF0K+U3WM4Ftg+Y30RmBLKzeDyJ1fy0FiXv70X9vKoiI69ZXoVTXZHTAdZAdD5zO9CAkbnfzchjYRrWdTv/nKDkXpc2315bX1UXN2M5LHzp2sltJ/wXBByA3JiP7wxH0VagzdkRBwKBgEKurZ2H/4tKzxPNK4lvfhWnLtSFuitGvhOJT2QRZHTSUv3ggA8UdJl1vT3meugr7S/JeDAjU0y87M328/VJNPmMdJ33mjAyHuvZmNnXCFMY53AOrt0C5H8Gzu2y4+VrlTba2HbO44V/REKpY4SeSDtu9XTnZ9v6BWX4a0Zyg++a");


        String result = alipayPassService.passInstanceUpdate(passInstanceUpdateModel);

        System.err.println(result);

    }

}
