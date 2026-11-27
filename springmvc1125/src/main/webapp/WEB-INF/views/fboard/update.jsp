<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@include file="../header.jsp"%>
<div class="container">
	<ul class="list-unstyled text-center mt-5">
        <li class="border-top my-3 fs-4 fw-bold">update</li>
    </ul>
    <div class="row">

        <form autocomplete="off" action="fboardUpdate" method="post">
            <input type="hidden" name="reip" value="<%=request.getRemoteAddr()%>">
            <input type="hidden" name="num" value="${v.num}">
            <div class="row mb-3">
                <label for="subject" class="col-sm-2 col-form-label">제목</label>
                <div class="col-sm-10">
                    <input type="text" name="subject" class="form-control" id="subject" value="${v.subject}">
                </div>
            </div>
            <div class="row mb-3">
                <label for="writer" class="col-sm-2 col-form-label">작성자</label>
                <div class="col-sm-10">
                    <input type="text" name="writer" class="form-control" id="writer" value="${v.writer}">
                </div>
            </div>
            <div class="row">
                <label for="content" class="col-sm-2 col-form-label">내용</label>
                <div class="col-sm-10">
                    <textarea rows="10" name="content" cols="50" id="content">${v.content}</textarea>
                </div>
            </div>
            <div class="container text-center" role="group">
                <button class="btn btn-primary" type="submit">등록</button>
                <button class="btn btn-danger" type="button"
                    onclick="location='fboardList'">누르세요</button>
            </div>
        </form>
    </div>
</div>
<%@include file="../footer.jsp"%>