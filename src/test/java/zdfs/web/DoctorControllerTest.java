package zdfs.web;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.context.WebApplicationContext;



@ContextConfiguration(locations= {"classpath:applicationContext.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration(value="src/main/webapp/WEB-INF/spring-mvc-servlet.xml")
public class DoctorControllerTest {

	@Autowired
	private WebApplicationContext wac;
	private MockMvc mockMvc;
	
	@Before
	public void setup() {
		this.mockMvc=MockMvcBuilders.webAppContextSetup(this.wac).build();
		//this.docController=wac.getBean(DoctorController.class);
		
	}
	
	//@Ignore
	@Test
	public void testRegister() throws Exception {
		/*
		 * @RequestParam("tel") int tel
								,@RequestParam("code") String code
								,@RequestParam("pwd") String pwd
								,@RequestParam("email") String email
			,@RequestParam("name") String name
			,@RequestParam("birthday") String birthday
			,@RequestParam("hospital") String hospital
			,@RequestParam("department") String department
			,@RequestParam("job") String job
			,@RequestParam("good_at") String good_at
		 */
		
		String code="";
		String pwd="";
		String email="";
		String birthday="";
		String hospital="";
		String department="";
		String job="";
		String good_at="";
		
		MultiValueMap<String, String> params=new LinkedMultiValueMap<>();
			params.add("code", code);
			params.add("pwd", pwd);
			params.add("email", email);
			params.add("birthday", birthday);
			params.add("hospital", hospital);
			params.add("department", department);
			params.add("job", job);
			params.add("good_at", good_at);
		
		//Assert.assertNotNull(docController);
			
		mockMvc.perform(post("/doctor/register")
							//.accept(MediaType.APPLICATION_FORM_URLENCODED)
							//.characterEncoding("UTF-8")
							//.params(params)
				).andExpect(status().isOk())
				.andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8));
	}
	
	@Ignore
	@Test
	public void testLogin() throws Exception{
		
		String tel="9090910";
		String pwd="hemomomowerwer";
		
		mockMvc.perform(post("/doctor/login")
						.param("tel", tel)
						.param("pwd",pwd)
				).andExpect(status().isOk());
		
	}
	
	
	
}
