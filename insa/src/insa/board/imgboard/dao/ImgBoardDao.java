package insa.board.imgboard.dao;

import insa.board.imgboard.dto.ImgBoardDTO;

public interface ImgBoardDao {
  ImgBoardDTO selectBoardNum();
  void  selectBoardList();
  ImgBoardDTO selectBoardView(int boardNum);
  
  
  
  
  
}
