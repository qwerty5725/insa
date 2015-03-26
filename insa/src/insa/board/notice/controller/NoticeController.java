package insa.board.notice.controller;

import insa.board.notice.service.NoticeService;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class NoticeController {
 
    @Inject
    NoticeService service;
	
	@RequestMapping(value="/index.insa", method = RequestMethod.GET)
	public ModelAndView goIndex(){
		ModelAndView model = new ModelAndView();
		String sys  = service.sysdate();
		model.addObject("sys", sys);
		model.setViewName("mainpage");
		return model;
	} 
}
