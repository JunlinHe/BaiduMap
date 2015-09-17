package com.skyids.map.servlet;

import com.skyids.map.bean.TerminalInfo;
import net.sf.json.JSONArray;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

/**
 * Created by User on 2015/9/16.
 */
public class GetTerminalInfoServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //response.setContentType("text/html;charset=UTF-8");
        response.setContentType("application/json;charset=UTF-8");
        PrintWriter out = response.getWriter();

        //JSONObject json = new JSONObject();
        JSONArray array = new JSONArray();
        TerminalInfo ti;
        String s = request.getParameter("id");
        ti = new TerminalInfo();
        float f1 = (float)Math.random();
        float f2 = (float)Math.random();
        ti.setLng(f1*40+80);//80-120内的随机单精度浮点数
        ti.setLat(f2 * 10 + 30);//30-40内的随机单精度浮点数
        ti.settID("id" + f1);
        ti.setOtherInfo("根据ID：" + s+" 获取信息");

        array.add(ti);


        out.write("{\"data\":" + array + "}");

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
