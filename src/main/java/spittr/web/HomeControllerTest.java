package spittr.web;

import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

public class HomeControllerTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		HomeController controller = new HomeController();
		MockMvc mockMvc = MockMvcBuilders.standaloneSetup(controller).build();
		mockMvc.perform(
				MockMvcRequestBuilders.get("/homepage")).andExpect(
							MockMvcResultMatchers.view().name("home"));
	}

}
