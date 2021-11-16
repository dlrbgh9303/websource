package board.action;

import javax.servlet.http.HttpServletRequest;

import board.service.BoardCountUpdateService;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class BoardCountUpdateAction implements BoardAction {

	private String path;
	
	@Override
	public BoardActionFoward execute(HttpServletRequest request) throws Exception {
		int bno = Integer.parseInt(request.getParameter("bno"));
		
		//조회수 변경
		BoardCountUpdateService updateService = new BoardCountUpdateService();
		updateService.readUpdate(bno);
		
		path+="?bno="+bno;
		
		return new BoardActionFoward(path, true);
	}

}
