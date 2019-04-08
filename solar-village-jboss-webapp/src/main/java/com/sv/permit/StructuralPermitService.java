/**
 * 
 */
package com.sv.permit;

import java.util.Random;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Application;

/**
 * @author mugdha
 *
 */
@RequestScoped
@Path("/structural")
@Produces({ "application/xml", "application/json" })
@Consumes({ "application/xml", "application/json" })
public class StructuralPermitService {

	private static String[] status = { "IN_PROGRESS","APPROVED", "DENIED" ,"IN_PROGRESS"};

	@POST
	@Path("/rescindPermit")
	@Produces("application/json")
	public String rescindPermit(@QueryParam("requestid") String requestid) {
		
		System.out.println("Received Rescind structural permit request  for id. " + requestid);
		//String requestid = String.valueOf(System.currentTimeMillis());
		String requestStatus = "CANCELLED";
		String pattern = "{ \"requestid\":\"%s\", \"status\":\"%s\" }";
		String response = String.format(pattern, requestid, requestStatus);
		System.out.println("Response to structural request  : " + response);
		return response;
	}

	
	@POST
	@Path("/submitPermitRequest")
	@Produces("application/json")
	public String submitPermitRequest(String customer) {
		System.out.println("Received structural permit request for customer. " + customer);
		String requestId = String.valueOf(System.currentTimeMillis());
		String requestStatus = "IN_PROGRESS";//status[new Random().nextInt(4)];
		String pattern = "{ \"requestid\":\"%s\", \"status\":\"%s\" }";
		String response = String.format(pattern, requestId, requestStatus);
		System.out.println("Response to structural customer : " + response);
		return response;
	}

	@GET 
	@Path("/getPermitRequestStatus")
	@Produces("application/json")
	public String getPermitRequestStatus(@QueryParam("requestid") String requestId) {
		System.out.println("Received get structural permit request statuc for id. " + requestId);
		//String requestId = String.valueOf(System.currentTimeMillis());
		String requestStatus = status[new Random().nextInt(4)];
		String pattern = "{ \"requestid\":\"%s\", \"status\":\"%s\" }";
		String response = String.format(pattern, requestId, requestStatus);
		System.out.println("Response to structural request  : " + response);
		return response;
	}

}
