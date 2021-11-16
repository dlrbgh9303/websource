package board.service;

import java.sql.Connection;
import java.util.List;

import board.domain.boardDTO;
import board.persistence.BoardDAO;

import static board.persistence.JdbcUtil.*;

public class BoardListService {
	public List<boardDTO> all(){
		Connection con = getConnection();
		BoardDAO dao = new BoardDAO(con);
		
		List<boardDTO> list = dao.getList();
		
		
		close(con);
		
		return list;
	}
}
