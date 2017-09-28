package example.mybatis.spring;

import java.text.DateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
/*import org.slf4j.Logger;
import org.slf4j.LoggerFactory;*/
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import example.mybatis.spring.common.CommandMap;
import example.mybatis.spring.service.SampleService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	//private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	Logger log = Logger.getLogger(this.getClass());
	
	@Resource(name="sampleService")
	private SampleService sampleService;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		//log.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
	@RequestMapping(value="/sample/list")
	public ModelAndView openSampleBoardList(Map<String, Object> commandMap) throws Exception {
		
		log.debug("Intercepter Test");
		
		ModelAndView mv = new ModelAndView("/sample/boardList");
		
		List<Map<String, Object>> list = sampleService.selectBoardList(commandMap);
		mv.addObject("list", list);
		
		return mv;
	}
	
	@RequestMapping(value="/test")
	public ModelAndView testMapArgumentResolver(CommandMap commandMap) throws Exception{
	    ModelAndView mv = new ModelAndView("");
	     
	    if(commandMap.isEmpty() == false){
	        Iterator<Entry<String,Object>> iterator = commandMap.getMap().entrySet().iterator();
	        Entry<String,Object> entry = null;
	        while(iterator.hasNext()){
	            entry = iterator.next();
	            System.out.println("key : "+entry.getKey()+", value : "+entry.getValue());
	            log.debug("key : "+entry.getKey()+", value : "+entry.getValue());
	        }
	    }
	    return mv;
	}
	
	@RequestMapping(value="/sample/write")
	public ModelAndView openBoardWrite(CommandMap commandMap) throws Exception{
	    ModelAndView mv = new ModelAndView("/sample/boardWrite");
	     
	    //return "sample/boardWrite";
	    return mv;
	}
	
	@RequestMapping(value="/sample/insert")
	public ModelAndView insertBoard(CommandMap commandMap) throws Exception{
	    ModelAndView mv = new ModelAndView("redirect:/sample/list");
	     
	    sampleService.insertBoard(commandMap.getMap());
	     
	    return mv;
	}


}
