package insa.board.notice.service;

import insa.board.notice.mapper.NoticeMapper;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

@Service("NoticeService")
public class NoticeService {
	
	@Inject
	NoticeMapper mapper;
	
	 public String sysdate(){
		 String date = mapper.getTime();
		 return date;
	 }
}
