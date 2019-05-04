<%@ page pageEncoding="utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<jsp:include page="./include/header.jsp" />

<div><h4>
<c:forEach items="${users}" var="u">
    <div>
        <div>user: ${u}</div>
        <form action="/user/delete" method="post">
            <input type="hidden" value="${u.id}" name="id" />
            <input type="submit" value="Delete" />
        </form>
    </div>
</c:forEach>
</h4>
</div>

<jsp:include page="./include/footer.jsp" />
