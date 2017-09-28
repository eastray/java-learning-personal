package cnc.dao;

import java.util.HashMap;
import java.util.List;

import cnc.dto.DeviceDto;

public interface IDeviceDao {

	//Device getDevices();
	
	public List<DeviceDto> getDevices();
	
	//public String testTable();
	public List<HashMap<String, Object>> testTable();

}
