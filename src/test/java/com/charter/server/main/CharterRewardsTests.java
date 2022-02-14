package com.charter.server.main;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;


public class CharterRewardsTests extends CharterRewardsApplicationTests {

	@Autowired
	private WebApplicationContext webApplicationContext;

	private MockMvc mockMvc;

	@Test
	public void testGenerateCustomerRewards() throws Exception {
		mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
		mockMvc.perform(post("/rewards/calculaterewards")
		        .contentType(MediaType.APPLICATION_JSON)
				.content(getCustomerRequest()))
				.andExpect(status().isOk());

	}
	
	private String getCustomerRequest() {
		return "{\n"
				+ "      \"name\": \"Bob\",\n"
				+ "      \"orders\": [\n"
				+ "         {\n"
				+ "          \"orderId\": \"100\",\n"
				+ "          \"orderTotal\": \"120\",\n"
				+ "          \"orderDate\" : \"2022-01-22\" \n"
				+ "          \n"
				+ "        },\n"
				+ "        {\n"
				+ "          \"orderId\": \"101\",\n"
				+ "          \"orderTotal\": \"200\",\n"
				+ "          \"orderDate\" : \"2022-01-19\" \n"
				+ "          \n"
				+ "        },\n"
				+ "        {\n"
				+ "          \"orderId\": \"102\",\n"
				+ "          \"orderTotal\": \"300\",\n"
				+ "          \"orderDate\" : \"2022-02-02\" \n"
				+ "          \n"
				+ "        }\n"
				+ "      ]\n"
				+ "    }";
	}
	

}