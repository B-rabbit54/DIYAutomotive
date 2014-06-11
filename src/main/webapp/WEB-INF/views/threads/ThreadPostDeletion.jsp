<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<t:genericpage>
    <jsp:body>
        <c:choose>
            <c:when test="${Model != null}">
                <a href="/item/next">Next</a>

        <!--Your content goes here-->
        <h2>${Model.name}</h2>
        <hr>
        <c:forEach var="post" items="${Model.posts.allPosts}">
            <a href="/threads/${thread.idThreads}/post/${post.idPost}/edit">${post.postName}</a>
            <a>PostID: ${post.idPost}</a>
        </c:forEach>
        <form method="post">
            Thread ID<input type="text" name="postIDDeletion"/><br/>
            <input type="submit">
        </form>
    </c:when>
    <c:otherwise></c:otherwise>
</c:choose>
    </jsp:body>
</t:genericpage>
