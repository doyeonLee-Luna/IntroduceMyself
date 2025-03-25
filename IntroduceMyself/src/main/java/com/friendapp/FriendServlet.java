package com.friendapp;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/friend")
public class FriendServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    // 친구 맺기 폼에서 POST 요청 처리
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 폼에서 입력된 값 가져오기
        String name = request.getParameter("name");
        String reason = request.getParameter("reason");

        // 콘솔에 입력된 값 출력
        System.out.println("Name: " + name);
        System.out.println("Reason: " + reason);

        // 응답을 HTML로 반환
        response.setContentType("text/html");
        response.getWriter().append("<!DOCTYPE html>")
                            .append("<html lang=\"ko\">")
                            .append("<head>")
                            .append("<meta charset=\"UTF-8\">")
                            .append("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">")
                            .append("<link rel=\"stylesheet\" href=\"style.css\">")  // 기존 style.css 링크 추가
                            .append("<title>Be My Friend - Response</title>")
                            .append("</head>")
                            .append("<body>")
                            .append("<div class=\"container\">")
                            .append("<h1>You're My Friend!</h1><br>")
                            .append("<p>Name: " + name + "</p>")
                            .append("<p>Reason: " + reason + "</p>")
                            .append("<a href=\"index.html\" class=\"btn\">Go Back</a>")
                            .append("</div>")
                            .append("</body>")
                            .append("</html>");
    }
}
