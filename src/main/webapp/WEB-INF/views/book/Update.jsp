<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html>
<jsp:include page="../common/Head.jsp"/>
<body>

<h2>책 수정</h2>

<form action="<%= application.getContextPath()%>/books/update" method="post">
  <div class="imgcontainer">
    <img src="img_avatar2.png" alt="Avatar" class="avatar">
  </div>

  <div class="container">
    <label for="bookId"><b>bookId</b></label>
    <input type="text" placeholder="Enter bookId" name="bookId" required>
    
    <label for="bookTitle"><b>bookTitle</b></label>
    <input type="text" placeholder="Enter bookTitle" name="bookTitle" required>
    
    <label for="price"><b>price</b></label>
    <input type="text" placeholder="Enter price" name="price" required>

    <label for="pubId"><b>pubId</b></label>
    <input type="text" placeholder="pubId" name="pubId" required>
        
    <button type="submit">책 수정</button>
    <label>
      <input type="checkbox" checked="checked" name="remember"> Remember me
    </label>
  </div>
</form>
<h2>책 삭제</h2>
<form action="<%= application.getContextPath() %>/books/delete">
  <div class="container">
    <label for="bookId"><b>bookId</b></label>
    <input type="text" placeholder="bookId" name="bookId" required>

    <button type="submit">책 삭제!</button>
  </div>
</form>

</body>
</html>
