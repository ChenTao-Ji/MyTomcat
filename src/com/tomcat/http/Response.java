package com.tomcat.http;

import java.io.IOException;
import java.io.OutputStream;

/**
 * @author chentao.ji
 */
public class Response {

    public OutputStream outputStream;

    public static final String responseHeader = "HTTP/1.1 200 \r\n"
            + "Content-Type: text/html\r\n"
            + "\r\n";

    public Response(OutputStream outputStream) throws IOException {
        this.outputStream = outputStream;
    }

}
