package com.example.demo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

@ExtendWith( SpringExtension.class)
@SpringBootTest
@AutoConfigureMockMvc
class DockerJenkinsIntegrationApplicationTests {

	@Autowired
	private MockMvc mockMvc;

	@Test
	public void getsAllRides() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.get("/demo/hi")
			.accept(MediaType.APPLICATION_JSON))
			.andReturn();
	}

}
