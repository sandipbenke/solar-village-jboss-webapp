/**
 * 
 */
package com.sv.permit;

import java.util.Random;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.ApplicationPath;
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
@Path("/electrical")
@Produces({ "application/xml", "application/json" })
@Consumes({ "application/xml", "application/json" })
public class ElectricalPermitService{

	private static String[] status = { "APPROVED", "DENIED", "IN_PROGRESS" };

	@POST
	@Path("/rescindPermit")
	@Produces("application/json")
	public String rescindPermit(@QueryParam("requestid") String requestid) {
		System.out.println("Received get electrical permit request statuc for id. " + requestid);
		//String requestid = String.valueOf(System.currentTimeMillis());
		String requestStatus = "CANCELLED";
		String pattern = "{ \"requestid\":\"%s\", \"status\":\"%s\" }";
		String response = String.format(pattern, requestid, requestStatus);
		System.out.println("Response to request  : " + response);
		return response;
	}

	
	@POST
	@Path("submitPermitRequest")
	@Produces("application/json")
	public String submitPermitRequest(String customer) {
		System.out.println("Received electrical permit request for customer. " + customer);
		String requestId = String.valueOf(System.currentTimeMillis());
		String requestStatus = status[new Random().nextInt(3)];
		String pattern = "{ \"requestid\":\"%s\", \"status\":\"%s\" }";
		String response = String.format(pattern, requestId, requestStatus);
		System.out.println("Response to customer : " + response);
		return response;
	}

	@GET 
	@Path("getPermitRequestStatus")
	@Produces("application/json")
	public String getPermitRequestStatus(@QueryParam("requestid") String requestid) {
		System.out.println("Received get electrical permit request statuc for id. " + requestid);
		//String requestid = String.valueOf(System.currentTimeMillis());
		String requestStatus = status[new Random().nextInt(3)];
		String pattern = "{ \"requestid\":\"%s\", \"status\":\"%s\" }";
		String response = String.format(pattern, requestid, requestStatus);
		System.out.println("Response to request  : " + response);
		return response;
	}

}
