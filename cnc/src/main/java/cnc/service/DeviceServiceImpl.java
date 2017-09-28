package cnc.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cnc.dao.IDeviceDao;
import cnc.dto.DeviceDto;

@Service("deviceService")
public class DeviceServiceImpl implements DeviceService {

	Logger log = Logger.getLogger(this.getClass());
	
	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public List<DeviceDto> getDevices() throws Exception {

		IDeviceDao dao = sqlSession.getMapper(IDeviceDao.class);
		
		return dao.getDevices();
	}
}
