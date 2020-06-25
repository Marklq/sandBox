package com.dd.Controller;

import com.alibaba.fastjson.JSON;
import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.request.AlipayTradeQueryRequest;
import com.dd.config.AlipayConfig;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;

@Controller
@RequestMapping("/query")
public class queryController {

    /**
     * http://localhost/query/query?out_trade_no=202062423198423&trade_no=2020062422001414390504945769
     * http://localhost/query/query?out_trade_no=202062423198423&trade_no=
     * 使用单个参数就可进行查询
     * <p>
     * 不可以这样写
     * http://localhost/query/query?out_trade_no=202062423198423&trade_no=null
     *
     * @param out_trade_no
     * @param trade_no
     * @return
     * @throws UnsupportedEncodingException
     */
    @RequestMapping("/query")
    @ResponseBody
    public String queryByTrade_no(String out_trade_no, String trade_no) throws UnsupportedEncodingException {
        //获得初始化的AlipayClient
        AlipayClient alipayClient = new DefaultAlipayClient(AlipayConfig.gatewayUrl, AlipayConfig.app_id, AlipayConfig.merchant_private_key, "json", AlipayConfig.charset, AlipayConfig.alipay_public_key, AlipayConfig.sign_type);

        //设置请求参数
        AlipayTradeQueryRequest alipayRequest = new AlipayTradeQueryRequest();

        //商户订单号，商户网站订单系统中唯一订单号
        String out_trade_no1 = new String(out_trade_no.getBytes("ISO-8859-1"), "UTF-8");
        //支付宝交易号
        String trade_no1 = new String(trade_no.getBytes("ISO-8859-1"), "UTF-8");
        //请二选一设置

        alipayRequest.setBizContent("{\"out_trade_no\":\"" + out_trade_no1 + "\"," + "\"trade_no\":\"" + trade_no1 + "\"}");

        //请求
        String result = null;
        try {
            result = alipayClient.execute(alipayRequest).getBody();
        } catch (AlipayApiException e) {
            e.printStackTrace();
        }

        //输出
        return JSON.toJSONString(result);
    }


}
