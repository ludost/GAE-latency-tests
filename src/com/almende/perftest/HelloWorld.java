package com.almende.perftest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import net.sf.json.JSONSerializer;

import com.eaio.uuid.UUID;

@Path("/startup_latency_test")
public class HelloWorld {
	@GET
	@Produces("text/plain")
	public String getHelloWorld(){
		String result = "Hello, world\n";
		
		UUID exampleUUID = new UUID();
		result += "Generated UUID:"+exampleUUID+"\n";
		result += "As JSON, running json-lib: "+JSONSerializer.toJSON(exampleUUID)+"\n";
		return result;
	}
}
