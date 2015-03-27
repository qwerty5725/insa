package insa.board.imgboard.controller;

import insa.board.imgboard.dto.ImgBoardDTO;
import insa.board.imgboard.service.ImgBoardService;

import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

public class ImgBoardControllerImpl implements ImgBoardController {

	@Inject
	ImgBoardService service;
	
	@RequestMapping(value="/write.insa" , method=RequestMethod.POST)
	public ModelAndView create(HttpServletRequest request, ImgBoardDTO dto) {
        
		service.create(dto);
		ModelAndView model = new ModelAndView();
		return model;
         		
	}
    @RequestMapping(value="/update.insa", method=RequestMethod.GET)
	public ModelAndView updatePage(HttpServletRequest request, ImgBoardDTO dto) {
        ModelAndView model = new ModelAndView();
        model.setViewName("update");
        return model;
	}
    @RequestMapping(value="/update.insa", method=RequestMethod.POST)
	public ModelAndView update(HttpServletRequest request, ImgBoardDTO dto) {
		service.update(dto);
		return null; //redirect
	}

	public ModelAndView delete(HttpServletRequest request) {
		int num = Integer.parseInt(request.getParameter("num"));
        service.delete(num);
		return null; //redirect
	}

	@Override
	public ModelAndView list(HttpServletRequest request) {
          
		ModelAndView model = new ModelAndView();
		List<ImgBoardDTO> list = service.list();
		model.addObject("list", list);
		model.setViewName("list");
		return model;
	}

	@Override
	public ModelAndView view(HttpServletRequest request, ImgBoardDTO dto) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
