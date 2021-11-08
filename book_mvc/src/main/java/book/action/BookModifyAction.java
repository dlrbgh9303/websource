package book.action;

import javax.servlet.http.HttpServletRequest;

import book.domain.BookDTO;
import book.service.BookModifyService;
import lombok.AllArgsConstructor;


@AllArgsConstructor
public class BookModifyAction implements BookAction {
	private String path;
	
	@Override
	public BookActionForward execute(HttpServletRequest request) throws Exception {
		String code = request.getParameter("code");
		int price = Integer.parseInt(request.getParameter("price"));
		
		
		
		BookModifyService service = new BookModifyService();
		boolean updateFlag = service.bookUpdate(code,price);
		
		//결과에 따라서 페이지 이동
		if (!updateFlag) {
			path = "/index.jsp?tab=modify";
		}else {
			
		}
		
		
		
		return new BookActionForward(path,true);
	}

	
		
	}


