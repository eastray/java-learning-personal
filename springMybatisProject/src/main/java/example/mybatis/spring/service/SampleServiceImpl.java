package example.mybatis.spring.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import example.mybatis.spring.dao.SampleDAO;

@Service("sampleService")
public class SampleServiceImpl implements SampleService {
	Logger log = Logger.getLogger(this.getClass());
	
	@Resource(name="sampleDAO")
	private SampleDAO sampleDAO;

	@Override
	public List<Map<String, Object>> selectBoardList(Map<String, Object> commandMap) {
		// TODO Auto-generated method stub
		return sampleDAO.selectBoardList(commandMap);
	}

	@Override
	public void insertBoard(Map<String, Object> map) throws Exception {
		 sampleDAO.insertBoard(map);
		
	}

		
}
