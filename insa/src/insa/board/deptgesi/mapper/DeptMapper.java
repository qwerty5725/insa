package insa.board.deptgesi.mapper;

import insa.board.deptgesi.service.DeptService;
import javax.inject.Inject;
import org.apache.ibatis.annotations.Select;

public interface DeptMapper {
	 
	@Select(" select sysdate from dual")
	public String getTime();

}
