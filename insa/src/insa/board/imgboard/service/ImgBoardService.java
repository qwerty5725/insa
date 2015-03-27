package insa.board.imgboard.service;

import java.util.List;

import insa.board.imgboard.dto.ImgBoardDTO;

public interface ImgBoardService {
  
  void create(ImgBoardDTO dto);
  List<ImgBoardDTO>list();
  void update(ImgBoardDTO dto);
  void delete(int num);
  ImgBoardDTO view(int num);
  
  
}
