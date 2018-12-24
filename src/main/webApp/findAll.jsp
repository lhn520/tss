<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>搜索</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<body>
<table align="center" border="1px" style="text-align: center">
    <tr>
        <td style="text-align: left">
            总记录数：${requestScope.counts }
        </td>
    </tr>
    <c:forEach items="${requestScope.poetries }" var="poetries">
        <tr>
            <td>
                <p>诗名:${poetries.title}</p>
            </td>
        <tr>
        <tr>
            <td>
                <p>作者：${poetries.name}</p>
            </td>
        </tr>
        <tr>
            <td>
                <p>${poetries.content}</p>
            </td>
        </tr>
    </c:forEach>
    <tr>
        <c:if test="${requestScope.pageIndex != 1}">
            <td>
                <a href="${pageContext.request.contextPath}/find/findAll?pageIndex=${requestScope.pageIndex - 1}&text=${requestScope.text}">上一页</a>
            </td>
        </c:if>
        <c:if test="${requestScope.pageIndex == 1}">
            <td>
                上一页
            </td>
        </c:if>
    </tr>
    <tr>
        <c:if test="${requestScope.pageIndex < requestScope.pageCounts}">
            <td colspan="4">
                <a href="${pageContext.request.contextPath}/find/findAll?pageIndex=${requestScope.pageIndex + 1}&text=${requestScope.text}">下一页</a>
            </td>
        </c:if>
        <c:if test="${requestScope.pageIndex == requestScope.pageCounts}">
            <td colspan="4">
                下一页
            </td>
        </c:if>
    </ >
    <tr>
        <td>
            <input type="button" class="button" value="返回"onclick="location='${pageContext.request.contextPath}/find.jsp'" />
        </td>
    </tr>
</table>

</body>
</html>