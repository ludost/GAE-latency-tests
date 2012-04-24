package com.almende.perftest;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class Startup_latency_testServlet  extends com.sun.jersey.spi.container.servlet.ServletContainer {
	@Override
	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
		super.service(req,res);
	}
}
