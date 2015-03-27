package insa.board.imgboard.mapper;

import java.util.List;

import insa.board.imgboard.dto.ImgBoardDTO;

public interface ImgboardMapper {
    
	//�Խñ۸��
	public List<ImgBoardDTO> list();
	
	//���ۼ�
	public void create(ImgBoardDTO dto);
	
	//�ۼ���
	public void update(ImgBoardDTO dto);
	
	//�ۻ���
	public void delete(int num);
	
	//�󼼺���
	public ImgBoardDTO view(int num);
	
}
