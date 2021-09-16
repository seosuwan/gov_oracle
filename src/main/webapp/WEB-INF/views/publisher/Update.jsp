<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html>
<jsp:include page="../common/Head.jsp"/>
<body>

<h2>출판사 수정</h2>

<form action="<%= application.getContextPath()%>/publishers/update" method="post">
  <div class="imgcontainer">
    <img src="img_avatar2.png" alt="Avatar" class="avatar">
  </div>

  <div class="container">
    <label for="pubId"><b>pubId</b></label>
    <input type="text" placeholder="Enter pubId" name="pubId" required>
    
    <label for="pubName"><b>pubName</b></label>
    <input type="text" placeholder="Enter pubName" name="pubName" required>
    
    <label for="mgrName"><b>mgrName</b></label>
    <input type="text" placeholder="Enter mgrName" name="mgrName" required>

    <label for="phone"><b>phone</b></label>
    <input type="text" placeholder="phone" name="phone" required>
        
    <button type="submit">출판사 수정</button>
    <label>
      <input type="checkbox" checked="checked" name="remember"> Remember me
    </label>
  </div>
</form>
<h2>책 삭제</h2>
<form action="<%= application.getContextPath() %>/publishers/delete">
  <div class="container">
    <label for="pubId"><b>pubId</b></label>
    <input type="text" placeholder="pubId" name="pubId" required>

    <button type="submit">출판사 삭제!</button>
  </div>
</form>

</body>
</html>
