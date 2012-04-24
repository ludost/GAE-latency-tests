package com.almende.perftest;

import java.io.IOException;
import javax.servlet.http.*;

import net.sf.json.JSONSerializer;

import com.eaio.uuid.UUID;

@SuppressWarnings("serial")
public class Startup_latency_testServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		resp.setContentType("text/plain");
		resp.getWriter().println("Hello, world");
		
		UUID exampleUUID = new UUID();
		resp.getWriter().println("Generated UUID:"+exampleUUID);
		
		resp.getWriter().println("As JSON, running json-lib: "+JSONSerializer.toJSON(exampleUUID));
	}
}
