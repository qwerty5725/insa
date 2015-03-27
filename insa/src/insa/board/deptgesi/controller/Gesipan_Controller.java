package insa.board.deptgesi.controller;

import insa.board.deptgesi.service.DeptService;
import insa.board.notice.service.NoticeService;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Gesipan_Controller {
	
	 @Inject
	    DeptService service;
	
		@RequestMapping(value="/index.insa", method = RequestMethod.GET)
		public ModelAndView goIndex(){
			ModelAndView model = new ModelAndView();
			String sys  = service.sysdate();
			model.addObject("sys", sys);
			model.setViewName("mainpage");
			return model;
	}
}
