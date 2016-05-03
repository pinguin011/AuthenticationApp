package org.dissertation.mvc;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.*;


public class SiteEntryControllerTest {

	@InjectMocks
	private SiteEntryController controller;
	
	private MockMvc mockMvc;
	
	@Before
	public void setUp(){
		MockitoAnnotations.initMocks(this);
		
		mockMvc = MockMvcBuilders.standaloneSetup(controller).build();
	}
	
	@Test
	public void test() throws Exception{
		
		mockMvc.perform(get("/test")).andDo(print());
	}
}
