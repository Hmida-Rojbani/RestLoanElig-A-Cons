package de.tekup.rest.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import de.tekup.rest.models.CustomerRequest;
import de.tekup.rest.models.WsResponse;

@Service
public class AskServiceRest {

	@Value("${base.url}")
	private String BASE_URL;
	
	@Autowired
	private FeignRestCaller caller;
	
	public WsResponse sendRequestToServerVia(CustomerRequest request) {
		RestTemplate template = new RestTemplate();
		WsResponse response = template.postForObject(BASE_URL+"/check/client/status", 
				request, WsResponse.class);
		return response;
	}
	
	public WsResponse sendRequestToServerViaFeign(CustomerRequest request) {
		
		WsResponse response = caller.callService(request);
		return response;
	}

}
