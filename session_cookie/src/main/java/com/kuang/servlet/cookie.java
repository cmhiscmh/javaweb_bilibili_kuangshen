package com.kuang.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Date;

public class cookie extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        Cookie[] cookies = req.getCookies();
        if (cookies!=null){
            out.write("lasttimelogin");
            for (int i = 0; i < cookies.length; i++) {
                Cookie cookie = cookies[i];
                if (cookie.getName().equals("time")){
                    Long value = Long.parseLong(cookie.getValue());
                    Date date = new Date(value);
                    out.write(String.valueOf(date));

                }
            }

    }else {
            System.out.println("fitst");
        }

        Cookie cookie = new Cookie("time", System.currentTimeMillis()+"");
        cookie.setMaxAge(24*60*60);
        resp.addCookie(cookie);

    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }

}
