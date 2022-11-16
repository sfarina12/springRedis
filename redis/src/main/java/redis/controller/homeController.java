package redis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import redis.entity.Product;
import redis.repository.productRepository;

@Controller
public class homeController {

	@Autowired
	public productRepository prodRepo;
	
	@RequestMapping("/")
	public ModelAndView test()
	{				
		System.out.println("ciao");
		ModelAndView mv=new ModelAndView("home.jsp");
		
		Product p=new Product(0,"giovanni",5);		
		prodRepo.save(p);
		
		return mv;
	}
	
}
