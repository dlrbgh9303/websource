package board.action;

import javax.servlet.http.HttpServletRequest;

public interface BoardAction {
	public BoardActionFoward execute(HttpServletRequest request) throws Exception;
}
