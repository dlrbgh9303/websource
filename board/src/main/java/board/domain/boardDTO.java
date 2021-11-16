package board.domain;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor


public class boardDTO {
	private int bno;
	private String title;
	private String content;
	private String password;
	private String attach;
	private int readcount;
	private String name;
	private Date regdate;
	private int re_ref;
	private int re_lev;
	private int re_seq;
	
}
