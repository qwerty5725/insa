package insa.board.imgboard.mapper;

import java.util.List;

import insa.board.imgboard.dto.ImgBoardDTO;

public interface ImgboardMapper {
    
	//게시글목록
	public List<ImgBoardDTO> list();
	
	//글작성
	public void create(ImgBoardDTO dto);
	
	//글수정
	public void update(ImgBoardDTO dto);
	
	//글삭제
	public void delete(int num);
	
	//상세보기
	public ImgBoardDTO view(int num);
	
}
