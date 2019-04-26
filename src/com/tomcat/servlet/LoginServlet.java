package com.tomcat.servlet;

import com.tomcat.http.Request;
import com.tomcat.http.Response;

import java.io.OutputStream;

/**
 * @author chentao.ji
 */
public class LoginServlet extends Servlet {

    @Override
    public void doGet(Request request, Response response) {
        this.doPost(request, response);
    }

    @Override
    public void doPost(Request request, Response response) {
        try {
            OutputStream outputStream = response.outputStream;
            String res = Response.responseHeader + "Hello,welcome to here !";
            outputStream.write(res.getBytes());
            outputStream.flush();
            outputStream.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
