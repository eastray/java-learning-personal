package example.mybatis.spring.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository("sampleDAO")
public class SampleDAO extends AbstractDAO {

	@SuppressWarnings("unchecked")
	public List<Map<String, Object>> selectBoardList(Map<String, Object> commandMap) {
		// TODO Auto-generated method stub
		return (List<Map<String, Object>>)selectList("sample.selectBoardList", commandMap);
	}
	
	public void insertBoard(Map<String, Object> map) throws Exception{
	    insert("sample.insertBoard", map);
	}


}
