package insa.board.deptgesi.service;

import insa.board.notice.mapper.NoticeMapper;
import javax.inject.Inject;
import org.springframework.stereotype.Service;

@Service("NoticeService")
public class DeptService {
	
	@Inject
	NoticeMapper mapper;
	
	 public String sysdate(){
		 String date = mapper.getTime();
		 return date;
	 }
}
