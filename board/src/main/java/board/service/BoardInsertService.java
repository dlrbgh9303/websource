package board.service;

import java.sql.Connection;

import board.domain.boardDTO;
import board.persistence.BoardDAO;
import static board.persistence.JdbcUtil.*;

//비즈니스 로직
public class BoardInsertService {
 public boolean BoardInsert(boardDTO insertDto) {
	 Connection con = getConnection(); 
	 BoardDAO dao = new BoardDAO(con);
	 
	 boolean insertFlag = dao.insert(insertDto);
	 if (insertFlag) {
		commit(con);
	}else {
		rollback(con);
	}
	 close(con);
	 return insertFlag;
 }
}
