package member.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import lombok.AllArgsConstructor;
import member.domain.MemberDTO;
import member.service.LoginService;


@AllArgsConstructor
public class LoginAction implements Action {
   private String path;
   
   
   @Override
   public ActionForward excute(HttpServletRequest request) throws Exception {
      
      // 사용자가 입력 값 가져오기 
      String userid = request.getParameter("userid");
      String password = request.getParameter("current_password");
      
      // db작업 부탁 =>service
      LoginService service = new LoginService();
      MemberDTO loginDto = service.loginService(userid, password);
      
      //페이지 이동 
      if(loginDto != null   ) {
         HttpSession session = request.getSession();
         session.setAttribute("loginDto", loginDto);
         
      }
      
      
      return new ActionForward(path,true);
   }

}