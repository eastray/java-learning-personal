package example.mybatis.spring.service;

import java.util.List;
import java.util.Map;

public interface SampleService {

	List<Map<String, Object>> selectBoardList(Map<String, Object> commandMap);

	void insertBoard(Map<String, Object> map) throws Exception;

	
}
