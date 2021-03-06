package first.common.service;

import java.util.List;
import java.util.Map;

public interface SampleService {

	List<Map<String, Object>> selectBoardList(Map<String, Object> commandMap);

	void insertBoard(Map<String, Object> map);

	Map<String, Object> selectBoardDetail(Map<String, Object> map);

	void updateBoard(Map<String, Object> map);

	void deleteBoard(Map<String, Object> map);

}
