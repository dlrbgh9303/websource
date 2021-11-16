create table board(
	bno number(8),                          
	title nvarchar2(50) not null,
	content nvarchar2(1000) not null,
	password varchar2(20) not null,
	attach nvarchar2(100),
	readcount number(8) default 0,
	name nvarchar2(20) not null,
	regdate date default sysdate,
	re_ref number(8) not null,
	re_lev number(8) not null,
	re_seq number(8) not null
);

-- pk 규칙 정의
alter table board add constraint pk_board primary key(bno);

-- 시퀀스 정의(bno 필드에 사용)
create sequence board_seq;


insert into board(bno,title,content,password,attach,name,re_ref,re_lev,re_seq)
values(board_seq.nextval,'게시판 작성','게시판을 작성해 봅시다','12345',null,'홍길동',board_seq.currval,0,0);


select * from board where bno=81;


update board set readcount = readcount+1 where bno=3;












