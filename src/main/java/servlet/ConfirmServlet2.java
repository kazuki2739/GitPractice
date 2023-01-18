package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dto.book;

/**
 * Servlet implementation class RegisterConfirmServlet
 */
@WebServlet("/ConfirmServlet2")
public class ConfirmServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ConfirmServlet2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		HttpSession session = request.getSession();
		book user = (book)session.getAttribute("user");
		String name = request.getParameter("name");
		String tyosha = request.getParameter("tyosha");
		String shuppan = request.getParameter("shuppan");
		String isbn = request.getParameter("isbn");
		String loginID = user.getLoginID();
		String salt = user.getSalt();
		String pw = user.getPw();
		String hashedPW = user.getHashedPW();
		
		book book = new book(-1, name, tyosha, shuppan, isbn, loginID, salt, pw, hashedPW);
		
		// セッションスコープのインスタンス取得
//		HttpSession session = request.getSession();
		
		// セッションスコープに値の保存
		// 第1引数：キー
		// 第2引数：保存する値
		session.setAttribute("input_data2", book);
		
		String view = "WEB-INF/view/confirm2.jsp";
		RequestDispatcher dispatcher = request.getRequestDispatcher(view);
		dispatcher.forward(request, response);	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
