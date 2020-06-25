package com.dd.config;

import java.io.FileWriter;
import java.io.IOException;

/* *
 *类名：AlipayConfig
 *功能：基础配置类
 *详细：设置帐户有关信息及返回路径
 *修改日期：2017-04-05
 *说明：
 *以下代码只是为了方便商户测试而提供的样例代码，商户可以根据自己网站的需要，按照技术文档编写,并非一定要使用该代码。
 *该代码仅供学习和研究支付宝接口使用，只是提供一个参考。
 */

public class AlipayConfig {

//↓↓↓↓↓↓↓↓↓↓请在这里配置您的基本信息↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓

    // 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
    public static String app_id = "2016102500755101";

    // 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQCdw3SSdIlDaz7coEcdOtymlDvsn8jVoiK6uZ4In8B8V2Q0sJsVKCbmdRWnFU44G8MA985Q88A7iG23GyNgR8yeu6lxipgNPjvfhbAolNazr0hebLqsaRrax2QtoWqEQEH7fpZGsltGq0n8afW4jCVgI9jACa+GVWsh4xHTf2QySJBwTt4wYRSKtfhCOXLJ/6+woxttzESg9AV5f5JcjEsguwPOxy9h0RRbTgb5mhJoesKAjcb31WTPCfx5eZtXsyCnhZDTtqI1YTS4p/OchkTaIZ3NbWUIQ/fTF+oELoDT6XCM+mv2ZFgbOR6rZ6NCm3OedmBCA2DS2iYjGQQ3L6SXAgMBAAECggEAcYaNBDbH77Pk8G6Fvgr1bQmOdaAlrVWXGDcp+Zq7sL5SZXgQoRDbrUrj4e/68XVIxhGMbcR5uF1cVj85HbeND0yLiiDped4mx5o0QX+ZYIPp18j2K8sWgAirlgpp0/FJieh1yzndZOUtwG2fXMW8v4oMF2Tg4hHlneUAluk8+NENRveL1LhK0FvErsjzRomPxbdv2MiHAE4v6oY+e5yHzOlcXae4VoUufsaM7S6qd2v8YGT1aXoDQLxT+NbnODhg1+ZiWEc0+my0FrkTV5bYMOVd8IFrALlnQVMP7BMBhqiQ/ejnF8xGqiUqy6yA7Y3VJ6gi0WZ5oMWjh2hTXZy6AQKBgQDTSBawEOvlY1lXBXL73SQse5HfgQpOMHlPEwwqEFlNdptSCJ7vxfBba3aRCSL+UhJ4b9pGm2Wj/Q5QaAbdFGK5yegCZ8+rtAdKdtBEde8WLWIfgx/2msnqSGtSvmukm6O0kkQP6jDmn1QEBE+6Tzb1KlXV6UnaJc2pe0TxFWJ5twKBgQC/J5XWEu2yFN6qTLnF1Y32NHaxIdKu3iWYWFjeRxoWwd8y7iGHOp2Z3YgZozCONq6Icg5y3Sf8mpKvNdL575b23exzSX/4RuPNfXuQqWE0RzrUzsHW0Eq3zX7E4ApEQtBPggT6YJqiIV9/OWbKinsEhnfFZgGZDK2erLb2vgGsIQKBgBw4ut8Vw4zGcn6POcauyVAvyVJjeC7thqarUqqjuGoCd8jDYgeBFxP/DL1ezQ/PgqwXtL5Nr4vyF2FiI9iQCofqklUP7MtwprCpojQi1KbPtRWkfDaCgooK1lsdGF/KclmCWBkQHSwRCDXpJYUrY5nn58NFABplhk0nLBRP2PGNAoGAf1VXMmsZe277hGXnuikvj7oS9puZRHMmh/0R9b9XWaF7lOmb3ADnyv8PEkTqq1ExoiKYDVvUrygoXh50k5lN7tSWFZX4cOKIDPJxxUOPRMvOHMQ9y2Kk4xs4Pt0e+amoKc5qkn6XgzjH7G/IUVM97x3D2vLATbtsTC6xElwvsQECgYEAy+ebVQfK+KIhvT17r7bRdrrU+qB1rCBHSwgUHYm5hGjDT/18NO610i/TQT6xf5XyWB2gf0wBL1R2VJQKNISUa2tZe8rDA9d6uvgpmo2bRNxSQSG7YV7STyoDAbXjJU/VCjiAVoTkXZh9vlHEv1aYvbL7q3f9/FiCsB9apoPhKb4=";

    // 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAoyyVkVJs+3d6JkMJA4JQb/+QAaVwZ9tKo7MnpLLPUFlB97PyuF5jzFmJn1j47XVqAR97sK1lIAw9qRIgOUa35qChAGJJ3ttwkEIt4ePa8YemYbpdh5sjpu7UpPnUfpS1JrZjhf13JHZvUhlQxOfydTEhEuoYgcspZKczgs1k4r3ZFb+iav3s40cse/OUTZnFJwDVayiYUQFojavDRBrLxN0f+efVOyapgrMlsjsRd4I5EUybYUBz3bk+u2e1yHeMEf/01pAbLPCtNnuAA2DamhDlKcbSKXqp4St5COntJb9ZYEKvXctSWinqE6ACJrja+YXDZFbZnjW8qaZIk48N/QIDAQAB";

    // 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
//    public static String notify_url = "http://localhost:8080/callback/notify";
    public static String notify_url = "http://eastcrash.top/callback/notify";

    // 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
//    public static String return_url = "http://localhost:8080/callback/return";
    public static String return_url = "http://eastcrash.top/callback/return";

    // 签名方式
    public static String sign_type = "RSA2";

    // 字符编码格式
    public static String charset = "utf-8";

    // 支付宝网关
    public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";

    // 支付宝网关
    public static String log_path = "C:\\";


//↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

    /**
     * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
     *
     * @param sWord 要写入日志里的文本内容
     */
    public static void logResult(String sWord) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis() + ".txt");
            writer.write(sWord);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

