package insa.board.notice.mapper;

import org.apache.ibatis.annotations.Select;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;


public interface NoticeMapper {
  
	@Select(" select sysdate from dual")
	public String getTime();

	
}
