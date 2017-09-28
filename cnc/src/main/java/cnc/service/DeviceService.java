package cnc.service;

import java.util.List;

import cnc.dto.DeviceDto;

public interface DeviceService {
	
	public List<DeviceDto> getDevices() throws Exception;

}
