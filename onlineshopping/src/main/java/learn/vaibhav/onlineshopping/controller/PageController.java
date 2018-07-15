/**
 * 
 */
package learn.vaibhav.onlineshopping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author vaibhav.bansal
 *
 */
@Controller
public class PageController {
	
	@RequestMapping("/")
	public ModelAndView init(){
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("greeting", "Hey welcome to my page");
		return mv;
	}
	
}
