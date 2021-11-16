package board.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import board.domain.boardDTO;
import board.service.BoardListService;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class BoardListAction implements BoardAction {

	private String path; // /view/qna_board_list.jsp
	
	@Override
	public BoardActionFoward execute(HttpServletRequest request) throws Exception {
			
		
		BoardListService service = new BoardListService();
		List<boardDTO> list =  service.all();
		
		request.setAttribute("list", list);
		
		
		return new BoardActionFoward(path,false);
	}

}
