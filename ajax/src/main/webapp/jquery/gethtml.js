/**
 * 
 */
$(function(){
	/*$.ajax({ //방식을 선언하지 않으면 get 방식
		url: "/data/data.html",
		success:function(data){//function 안에 있는 "data"라는 변수의 값이 넘어감
			$("div:last-of-type").html(data);//
		}
	})
})*/
	$.get("/data/data.html",{ 
		success:function(data){//function 안에 있는 "data"라는 변수의 값이 넘어감
			$("div:last-of-type").html(data);//
		}
	})
/*	$.get({ // get 방식으로 명시하면 get 방식으로 요청한 것
		url: "/data/data.html",
		success:function(data){//function 안에 있는 "data"라는 변수의 값이 넘어감
			$("div:last-of-type").html(data);//
		}
	})
*/})//모두 동일한 방식



/*	function gethtml() {
	  //페이지가 로드되자마자 서버가 가지고 있는 html 페이지를 가져와서 div안에 
	  //보여주기 => 비동기식 처리

	  //XMLHttpRequest 객체 생성
	  let httpRequest = new XMLHttpRequest();
	  
	  //생성된 객체를 통해 서버에게 보낼 요청 설정
	  httpRequest.open("get","/data/data.html");
	  //서버로 전송- get 방식일 때는 null or 비워두기, post일 때는 전송할 데이터 포함
	  httpRequest.send(null); 


	  //서버가 응답 : 200(성공), 400(404), 500(서버 에러)
	  httpRequest.onreadystatechange = function(){
		if(httpRequest.readyState == 4){
			if(httpRequest.status == 200){
				let div = document.querySelector("div:last-of-type");
				div.innerHTML = httpRequest.responseText;//응답 내용 보여준 것
			}
		}
	}
	  
	}*/