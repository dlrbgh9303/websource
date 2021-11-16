package board.action;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import board.domain.boardDTO;
import board.service.BoardInsertService;
import board.util.UploadUtil;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class BoardInsertAction implements BoardAction {

	private String path;

	@Override
	public BoardActionFoward execute(HttpServletRequest request) throws Exception {

		// request를 UploadUtil 넘기기
		UploadUtil uploadUtil = new UploadUtil();
		Map<String, String> map = uploadUtil.requestParse(request);

		// map에서 값 가져오기
		boardDTO insertDto = new boardDTO();
		insertDto.setName(map.get("name"));
		insertDto.setTitle(map.get("title"));
		insertDto.setContent(map.get("content"));
		insertDto.setPassword(map.get("password"));
		// 파일첨부
		insertDto.setAttach(map.get("attach"));

		// 서비스에게 작업 요청
		BoardInsertService service = new BoardInsertService();
		boolean insertFlag = service.BoardInsert(insertDto);

		// 결과에 따라 이동
		if (!insertFlag) {
			path = "/view/qna_board_write.jsp";
		}

		return new BoardActionFoward(path, true);
	}

}
