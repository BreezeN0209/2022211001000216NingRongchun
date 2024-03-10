package com.NingRongchun.week2.homwork;

import java.util.Locale;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.text.SimpleDateFormat;

public class HelloWorldServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        PrintWriter writer = response.getWriter();
        writer.println("Name:Ning Rongchun");
        writer.println("ID:2022211001000216");
        Date currentDate = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("EEE MMM dd HH:mm:ss zzz yyyy", Locale.ENGLISH);
        String formattedDateTime = dateFormat.format(currentDate);
        writer.println("Date and Time " + formattedDateTime);
    }
    public void doPost(HttpServletRequest request, HttpServletResponse response){

    }
}
