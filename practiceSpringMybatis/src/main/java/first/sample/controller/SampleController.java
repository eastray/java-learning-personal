package first.sample.controller;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import first.common.common.CommandMap;
import first.common.logger.LoggerInterceptor;
import first.sample.service.SampleService;

@Controller
public class SampleController {
	// Logger log = Logger.getLogger(this.getClass());
	protected static Logger log = Logger.getLogger(LoggerInterceptor.class.getName());

	@Resource(name = "sampleService")
	private SampleService sampleService;

	@RequestMapping(value = "/sample/list")
	public ModelAndView openSampleList(Map<String, Object> commandMap) throws Exception {
		ModelAndView mv = new ModelAndView("boardList");
		log.debug("Intercepter Test Debug");

		List<Map<String, Object>> list = sampleService.selectBoardList(commandMap);
		mv.addObject("list", list);

		return mv;
	}

	@RequestMapping(value = "/test")
	public void test(Map<String, Object> commandMap) throws Exception {
		System.out.println("here");

		return;
	}

	@RequestMapping(value = "/sample/testMapArgumentResolver")
	public ModelAndView testMapArgumentResolver(CommandMap commandMap) throws Exception {
		ModelAndView mv = new ModelAndView("");

		if (commandMap.isEmpty() == false) {
			Iterator<Entry<String, Object>> iterator = commandMap.getMap().entrySet().iterator();
			Entry<String, Object> entry = null;
			while (iterator.hasNext()) {
				entry = iterator.next();
				log.debug("key : " + entry.getKey() + ", value : " + entry.getValue());
			}
		}
		return mv;
	}
	
	@RequestMapping(value="/sample/write")
	public ModelAndView openBoardWrite(CommandMap commandMap) throws Exception{
	    ModelAndView mv = new ModelAndView("boardWrite");
	     
	    return mv;
	}
	
	@RequestMapping(value="/sample/insert")
	public ModelAndView insertBoard(CommandMap commandMap) throws Exception{
	    ModelAndView mv = new ModelAndView("redirect:/sample/list");
	     
	    sampleService.insertBoard(commandMap.getMap());
	     
	    return mv;
	}
	
	@RequestMapping(value="/sample/detail")
	public ModelAndView openBoardDetail(CommandMap commandMap) throws Exception{
	    ModelAndView mv = new ModelAndView("/boardDetail");
	     
	    Map<String,Object> map = sampleService.selectBoardDetail(commandMap.getMap());
	    mv.addObject("map", map);
	     
	    return mv;
	}
	
	@RequestMapping(value="/sample/modify")
	public ModelAndView openBoardUpdate(CommandMap commandMap) throws Exception{
	    ModelAndView mv = new ModelAndView("/boardModify");
	     
	    Map<String,Object> map = sampleService.selectBoardDetail(commandMap.getMap());
	    mv.addObject("map", map);
	     
	    return mv;
	}
	 
	@RequestMapping(value="/sample/update")
	public ModelAndView updateBoard(CommandMap commandMap) throws Exception{
	    ModelAndView mv = new ModelAndView("redirect:/sample/detail");
	    
	    sampleService.updateBoard(commandMap.getMap());
	     	    
	    mv.addObject("IDX", commandMap.get("IDX"));
	    
	    return mv;
	}

	@RequestMapping(value="/sample/delete")
	public ModelAndView deleteBoard(CommandMap commandMap) throws Exception{
	    ModelAndView mv = new ModelAndView("redirect:/sample/list");
	     
	    sampleService.deleteBoard(commandMap.getMap());
	     
	    return mv;
	}

}
