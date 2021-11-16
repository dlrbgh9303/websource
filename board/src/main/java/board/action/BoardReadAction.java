package board.action;

import javax.servlet.http.HttpServletRequest;

import board.domain.boardDTO;
import board.service.BoardCountUpdateService;
import board.service.BoardReadService;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class BoardReadAction implements BoardAction {

	private String path;
	
	
	
	@Override
	public BoardActionFoward execute(HttpServletRequest request) throws Exception {
		// list.do>bno1 bno 값 가져오기
		
		
		int bno = Integer.parseInt(request.getParameter("bno"));
		
	
		
		// 서비스 요청
		BoardReadService service = new BoardReadService();
		boardDTO dto = service.read(bno);
		
		request.setAttribute("dto", dto);
		
		// 이동
		return new BoardActionFoward(path,false);
	}

}
