<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@include file="../header.jsp"%>
<%-- 경로 설정 --%>
<c:set var="rPath" value="${pageContext.request.contextPath}/resources"/>

<%-- UI시작 : views/updemo/upform.jsp --%>
<div class="container">
	<div class="row">
		<h2>파일업로드 폼 데모</h2>
		<%--enctype="multipart/form-data"  == input type="file" --%>
		<form id="upform" enctype="multipart/form-data" method="post" action="uploadpro">
			<input type="hidden" name="reip" value="<%=request.getRemoteAddr()%>">
			<div class="form-group">
				<label for="title">제목</label>
				<%-- pattern=".{5,100}" 사용해서 범위를 정규표현식으로 처리  
            $('#title').attr(
            --%>
				<input type="text" class="form-control" id="title"
					placeholder="제목 입력(5-100)" name="title" maxlength="100"
					required="required" pattern=".{5,100}">
			</div>
			<div class="form-group">
				<label for="content">내용</label>
				<textarea class="form-control" rows="5" id="content" name="content"
					placeholder="내용 작성">오늘은 ...</textarea>
			</div>
			<div class="form-group">
				<label for="writer">작성자</label> <input type="text"
					class="form-control" id="writer" placeholder="작성자(2자-30자)"
					name="writer" pattern=".{2,30}" value="테스형" required="required">
			</div>
			<div class="form-group">
				<label for="mfile">이미지</label>
				<div class="col-sm-10">
					<input type="file" class="form-control" id="mfile" name="mfile">
				</div>
				<div class="col-sm-10">
					<%-- 이미지 미리보기 --%>
					<img src="${rPath}/images/noimage.png" id="imgx"
						style="width: 150px; border: dotted 1px; margin: 5px 5px">
				</div>
			</div>
			<div class="form-group">
				<button type="submit" class="btn btn-primary">등록</button>
				
			</div>
		</form>
	</div>
	</div>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
<script>
    function readURL(input){
         // input type="file" 의 주소를 가져온다.
        if(input.files && input.files[0]){ //파일 업로드가 되었을때
            console.log("파일 업로드 동작!")
            //javascript I/O
            var reader = new FileReader();
            // 리스너
            reader.onload = function(e){
                console.log("이벤트 발생:"+e.target.result);
                //핸들링 - 이미지를 바이트코드로 읽어 왔으니, 배치하면 끝 
                //아이디 선택자 $('#id').attr('속성',값)
                //<img src='e.target.result' id='imgx'>
                $('#imgx').attr('src',e.target.result);
            }
            reader.readAsDataURL(input.files[0]);
        }
    }
    //jQuery시작
    $(function(){
        //id="mfile" 
        //파일업로드의 아이디 값을 선택해서,   change이벤트가 발생 했을 때 함수를 호출 !
        $('#mfile').change(function(){
            console.log("파일에 변화가 생겼습니다.");
            //jQuery나 javascript에서도 this 동일 => 현재객체 
            //$(this) <input type="file" id="mfile" value="a.jpg"/>
            //$(this).val() 로 value="a.jpg" 값을 가져옴 
            console.log("객체 this는 file Tag.val()"+$(this).val());
            //함수로 파일의 주소를 매개변수로 전달 
            readURL(this);
        });
    });
</script>