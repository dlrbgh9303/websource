package member.service;

import static member.persistence.JdbcUtil.commit;
import static member.persistence.JdbcUtil.getConnection;

import java.sql.Connection;

import member.domain.UpdateDTO;
import static member.persistence.JdbcUtil.*;
import member.persistence.MemberDAO;

public class ModifyService {
	private UpdateDTO upDto;
	
	public boolean ModifyService(String new_password, String userid, String password) {
	
	

	Connection con =  getConnection();
	MemberDAO dao = new MemberDAO(con);
	boolean modifyFlag = dao.Modify(upDto);
	
	
	if (modifyFlag) {
		commit(con);
	}else {
		rollback(con);
		
	}
	
	return modifyFlag;
	
	}
}
