/**
 * mock_dat.json 파일 요청 후 보여주기
 */
$(function(){
	$.get({
		url:"/data/MOCK_DATA.json",
		success:function(data){

			let output ="<table><tr><td>id</th><th>name</th><th>email</th><th>gender</th></tr>ip address</th></tr>";
			
			$(data).find("record").each(function(){
				output+="<tr><td>"+item.id+"</td>";
				output+="<td>"+item.name+"</td>";
				output+="<td>"+item.email+"</td>";
				output+="<td>"+item.gender+"</td>";
				output+="<td>"+item.ip_address+"</td></tr>";
				
			})				
			$("body").append(output);	
		},
		error:function(xhr,textStatus,error){
			$("body").append("데이터 없음");
			}
		})
	})