package controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class HelloController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String firstName = request.getParameter("firstname");
		String lastName = request.getParameter("lastname");
		Map<String, String> map = new HashMap<>();
		map.put("msg", "Hello " + firstName + " " + lastName);
		ModelAndView mav = new ModelAndView("success", map);
		return mav;
	}

}
