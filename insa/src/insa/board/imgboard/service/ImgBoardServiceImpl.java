package insa.board.imgboard.service;

import insa.board.imgboard.dao.ImgBoardDao;
import insa.board.imgboard.dto.ImgBoardDTO;

import java.util.List;

import javax.inject.Inject;

public class ImgBoardServiceImpl implements ImgBoardService {
    
    @Inject
    ImgBoardDao dao;
	
	@Override
	public void create(ImgBoardDTO dto) {
       		
	}

	@Override
	public List<ImgBoardDTO> list() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(ImgBoardDTO dto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int num) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ImgBoardDTO view(int num) {
		// TODO Auto-generated method stub
		return null;
	}
  
}
