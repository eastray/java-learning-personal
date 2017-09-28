package first.common.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import first.common.dao.AbstractDAO;

@Repository("sampleDAO")
public class SampleDAO extends AbstractDAO {

	@SuppressWarnings("unchecked")
	public List<Map<String, Object>> selectBoardList(Map<String, Object> commandMap) {
		// TODO Auto-generated method stub
		return (List<Map<String, Object>>)selectList("sample.selectBoardList", commandMap);

	}

	public void insertBoard(Map<String, Object> map) {
		// TODO Auto-generated method stub
		insert("sample.insertBoard", map);
	}

	public void updateHitCnt(Map<String, Object> map) {
		// TODO Auto-generated method stub
		update("sample.updateHitCnt", map);

	}

	@SuppressWarnings("unchecked")
	public Map<String, Object> selectBoardDetail(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return (Map<String, Object>) selectOne("sample.selectBoardDetail", map);

	}

	public void updateBoard(Map<String, Object> map) {
		update("sample.updateBoard", map);
	}

	public void deleteBoard(Map<String, Object> map) {
		update("sample.deleteBoard", map);
	}

}
