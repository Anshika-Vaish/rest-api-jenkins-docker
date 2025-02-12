package com.code.service_registry;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClient;

@RestController
public class PostInfoQuery {

	
	@GetMapping("myposts/{uid}")
	public PostMessage get(@PathVariable("uid") String uid) {
		String URL="https://jsonplaceholder.typicode.com/posts/"+uid;
		RestClient rs=RestClient.builder().build();
		PostMessage result= rs.get().uri(URL).retrieve().body(PostMessage.class);
		System.out.println(result);
		return result;
		
	}
}
