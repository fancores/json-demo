<%@ page pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
  <head>
    <title>json-demo page</title>
    <c:set var="basepath" value="${pageContext.request.contextPath}" />
    <link rel="stylesheet" type="text/css" href="${basepath}/css/style.css" />
    <script type="text/javascript" src="${basepath}/js/jquery-1.6.2.min.js"></script>
    <script type="text/javascript" src="${basepath}/js/index.js"></script>
  </head>
  <body>
    <div id="main" align="center">
      <p>
        <a href="${basepath}/servlet/person" target="_blank" title="点击查看结果">
          ${basepath}/servlet/person
        </a>
      </p>
      <p>
        <textarea rows="10" cols="60" disabled="disabled" id="jsonData">
          >>> 暂无数据（Ctrl + F5 刷新页面） <<<
        </textarea>
      </p>
      <p>
        <span id="load" class="enabled-text">点击加载数据</span>
      </p>
    </div>
  </body>
</html>