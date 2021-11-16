package board.service;

import board.domain.boardDTO;
import board.persistence.BoardDAO;

import static board.persistence.JdbcUtil.*;

import java.sql.Connection;

public class BoardReadService {
	public boardDTO read(int bno) {
		Connection con = getConnection();
		BoardDAO dao = new BoardDAO(con);
		
		boardDTO dto = dao.getRow(bno);
		
		close(con);

		return dto;
	}
	
}
