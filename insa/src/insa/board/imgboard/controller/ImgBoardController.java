package insa.board.imgboard.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import insa.board.imgboard.dto.ImgBoardDTO;

import org.springframework.web.servlet.ModelAndView;

public interface ImgBoardController {
   ModelAndView create(HttpServletRequest request, ImgBoardDTO dto);
   ModelAndView update(HttpServletRequest request, ImgBoardDTO dto);
   ModelAndView delete(HttpServletRequest request);
   ModelAndView list(HttpServletRequest request);
   ModelAndView view(HttpServletRequest request,ImgBoardDTO dto);
   
     
}
