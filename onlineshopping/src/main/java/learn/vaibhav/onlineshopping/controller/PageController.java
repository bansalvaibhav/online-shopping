/**
 * 
 */
package learn.vaibhav.onlineshopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import learn.vaibhav.shoppingService.dao.CategoryDao;
import learn.vaibhav.shoppingService.dto.Category;

/**
 * @author vaibhav.bansal
 *
 */
@Controller
public class PageController {
	
	@Autowired
	private CategoryDao categoryDao;
	
	@RequestMapping("/")
	public ModelAndView init(){
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "Home");
		mv.addObject("userClickHome", true);
		mv.addObject("categories", categoryDao.list());
		return mv;
	}
	
	@RequestMapping("/about")
	public ModelAndView about(){
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "About Us");
		mv.addObject("userClickAboutUs", true);
		return mv;
	}
	
	@RequestMapping("/contact")
	public ModelAndView contact(){
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "Contact Us");
		mv.addObject("userClickContact", true);
		return mv;
	}
	
/*
 * method to show all products
 * */
	@RequestMapping("/show/all/products")
	public ModelAndView product(){
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "Products");
		mv.addObject("categories", categoryDao.list());
		mv.addObject("userClickAllProducts", true);
		return mv;
	}
	
	@RequestMapping("/show/category/{id}/products")
	public ModelAndView showCategoryProducts(@PathVariable("id") int id){
		ModelAndView mv = new ModelAndView("page");
		
		//categorydao to fetch single category
		Category category = categoryDao.get(Category.class,id);
		if(category!=null){
			mv.addObject("title", category.getName());	
		}
		
		mv.addObject("categories", categoryDao.list());
		mv.addObject("category",category);
		mv.addObject("userClickCategoryProducts", true);
		return mv;
	}
	
}
