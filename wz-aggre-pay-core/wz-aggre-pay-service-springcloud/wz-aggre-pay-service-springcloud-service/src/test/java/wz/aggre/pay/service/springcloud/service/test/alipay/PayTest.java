package wz.aggre.pay.service.springcloud.service.test.alipay;

import redis.clients.jedis.Jedis;

import java.util.concurrent.CountDownLatch;

/**
 * @author tianjunwei
 * @date 2019/4/28 10:25
 */

public class PayTest {

    private static final String LOCK_SUCCESS = "OK";
    private static final String SET_IF_NOT_EXIST = "NX";
    private static final String SET_WITH_EXPIRE_TIME = "PX";

    private static CountDownLatch countDownLatch ;

    private Jedis jedis;

    private Object lock = new Object();

    public static void main(String[] args) throws Exception {

        final PayTest payTest = new PayTest();

        countDownLatch = new CountDownLatch(6);

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {

                    payTest.pay("111111");
                    payTest.countDownLatch.countDown();
                }catch (Exception e){

                }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {

                    payTest.pay("111111");
                    payTest.countDownLatch.countDown();
                }catch (Exception e){

                }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {

                    payTest.pay("111111");
                    payTest.countDownLatch.countDown();
                }catch (Exception e){

                }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {

                    payTest.pay("111111");
                    payTest.countDownLatch.countDown();
                }catch (Exception e){

                }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {

                    payTest.pay("111111");
                    payTest.countDownLatch.countDown();
                }catch (Exception e){

                }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {

                    payTest.pay("111111");
                    payTest.countDownLatch.countDown();
                }catch (Exception e){

                }
            }
        }).start();


        payTest.countDownLatch.await();
        System.err.println("结束");

        System.in.read();

    }

    public Jedis init() {

        synchronized (lock) {
            if (jedis == null) {
                System.err.println("11");
                jedis = new Jedis("127.0.0.1", 6379);
            }else {
                System.err.println("22");
            }
        }
        return jedis;

    }

    private Boolean lock(String lockKey, String requestId, int expireTime) {

        Jedis jedis = init();

        String result = jedis.set(lockKey, requestId, SET_IF_NOT_EXIST, SET_WITH_EXPIRE_TIME, expireTime);
        if (LOCK_SUCCESS.equals(result)) {
            return true;
        }
        return false;
    }

    public String pay(String tradeNo) {
        Jedis jedis = init();
        try {
            while (true) {
                Boolean result = lock("lock" + tradeNo, tradeNo, 30000);
                if (result) {
                   if(jedis.exists(tradeNo)){
                       System.err.println("1");
                       return jedis.get(tradeNo);
                   }else {
                       System.err.println("2");
                       jedis.set(tradeNo,tradeNo);
                       return jedis.get(tradeNo);
                   }
                }else {
                    System.err.println("3");
                }
                Thread.sleep(300);
            }

        } catch (Exception e) {

        } finally {

        }
        return null;
    }

}
