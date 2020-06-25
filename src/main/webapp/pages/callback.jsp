<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>return</title>
</head>
<body>

<table>
    <thead>
    <tr>
        <th>订单号</th>
        <th>支付宝交易号</th>
        <th>总金额</th>
    </tr>
    </thead>
    <tbody>
    <tr>
        <th><%=request.getAttribute("trade_no")%>
        </th>
        <th><%=request.getAttribute("out_trade_no")%>
        </th>
        <th><%=request.getAttribute("total_amount")%>
        </th>
    </tr>
    </tbody>
</table>


</body>
</html>
