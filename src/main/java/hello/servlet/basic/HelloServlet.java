package hello.servlet.basic;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "helloServlet", urlPatterns = "/hello")
public class HelloServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("HelloServlet.service"); // hello가 호출되면 sout이 찍힘
        System.out.println("request = " + request);
        System.out.println("response = " + response);

        String username = request.getParameter("username"); // 쿼리파라미터의 값을 가져옴
        System.out.println("username = " + username);

        // 응답 헤더 메시지에 값을 설정
        response.setContentType("text/plain");
        response.setCharacterEncoding("utf-8");

        // 클라이언트한테 텍스트 타입의 바디 데이터를 보여줌
        response.getWriter().write("hello " + username);
    }
}
