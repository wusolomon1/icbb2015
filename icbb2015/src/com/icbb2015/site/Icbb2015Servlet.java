package com.icbb2015.site;

import java.io.IOException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class Icbb2015Servlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		resp.setContentType("text/plain");
		resp.getWriter().println("Hello, world");
	}
}
