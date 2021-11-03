<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<center>
	<form>
		<div class="form-group">
			<label for="userid">아이디</label> <input type="text"
				class="form-control" id="userid" placeholder="아이디를 입력하세요"> <small
				id="emailHelp" class="form-text text-muted"></small>
		</div>
		<div class="form-group">
			<label for="password">비밀번호</label> <input type="password"
				class="form-control" id="password" placeholder="비밀번호를 입력하세요">
		</div>
		<div class="form-group">
			<label for="password">비밀번호 확인</label> <input type="password"
				class="form-control" id="password" placeholder="비밀번호를 다시 입력하세요">
		</div>
		<div class="form-group">
			<label for="username">이름</label> <input type="text"
				class="form-control" id="username" placeholder="이름을 입력하세요">
		</div>
		<div class="custom-control custom-radio">
			<input type="radio" class="custom-control-input"
				id="gender" name="radio-stacked" required>
			<label class="custom-control-label" for="customControlValidation2">남
				<class="custom-control custom-radio">
					<input type="radio" class="custom-control-input"
						id="gender" name="radio-stacked" required>
					<label class="custom-control-label" for="customControlValidation2">여
						</label>
			</label>




			<div class="form-group">
				<label for="email">이메일</label> <input type="email"
					class="form-control" id="email" placeholder="example@gmail.com">
			</div>
			<button type="submit" class="btn btn-primary">입력</button>
			<button type="reset" class="btn btn-primary">취소</button>
	</form>
	</center>
</body>
</html>