package first.common.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import first.common.dao.SampleDAO;

@Service("sampleService")
public class SampleServiceImpl implements SampleService {
	Logger log = Logger.getLogger(this.getClass());

	@Resource(name = "sampleDAO")
	private SampleDAO sampleDAO;

	@Override
	public List<Map<String, Object>> selectBoardList(Map<String, Object> commandMap) {
		// TODO Auto-generated method stub
		return sampleDAO.selectBoardList(commandMap);

	}

	@Override
	public void insertBoard(Map<String, Object> map) {
		// TODO Auto-generated method stub
		sampleDAO.insertBoard(map);
	}

	@Override
	public Map<String, Object> selectBoardDetail(Map<String, Object> map) {
		sampleDAO.updateHitCnt(map);
	    Map<String, Object> resultMap = sampleDAO.selectBoardDetail(map);
	    return resultMap;

	}

	@Override
	public void updateBoard(Map<String, Object> map) {
		sampleDAO.updateBoard(map);
	}

	@Override
	public void deleteBoard(Map<String, Object> map) {
		sampleDAO.deleteBoard(map);
	}

}
