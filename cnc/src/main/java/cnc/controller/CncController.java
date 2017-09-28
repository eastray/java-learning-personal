package cnc.controller;

import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cnc.dto.DeviceDto;
import cnc.service.DeviceService;

@Controller
public class CncController {

	Logger log = Logger.getLogger(this.getClass());

	@Resource(name = "deviceService")
	private DeviceService deviceService;

	@RequestMapping(value = "/devices", method = RequestMethod.GET)
	public String getdevices() throws Exception {
		log.info("/api/v1/devices");

		List<DeviceDto> result = deviceService.getDevices();

		log.info("result: " + result);

		System.out.println(result);

		for (int i = 0; i < result.size(); i++) {
			System.out.println(i + ", DeviceName: " + result.get(i).getDeviceId());
		}
		
		return null;
	}
}
