package cnc.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

//@EqualsAndHashCode(callSuper=false)
//@Entity
//@Data
//@Setter
//@Getter
//@ToString
//@AllArgsConstructor
//public class DeviceDto {
//	@Column(name = "device_id")
//	private int deviceId;
//	@Column(name = "device_serial")
//	private String deviceSerial;
//	@Column(name = "device_name")
//	private String deviceName;
//	@Column(name = "device_type")
//	private String deviceType;
//	private String location;
//	private String status;
//	private String battery;
//	@Column(name = "ip_address")
//	private String ipAddress;
//	@Column(name = "join_date")
//	private String joinDate;
//	@Column(name = "modify_date")
//	private String modifyDate;
//	@Column(name = "cnc_id")
//	private int cncId;
//	private String protocol;
//	private boolean sleep;
//	private String description;
//}

public class DeviceDto {
	@JsonProperty("device_id")
	private int deviceId;
	
	@JsonProperty("device_serial")
	private String deviceSerial;
	
	@JsonProperty("device_name")
	private String deviceName;
	
	@JsonProperty("device_type")
	private String deviceType;
	private String location;
	private String status;
	private String battery;
	
	@JsonProperty("ip_address")
	private String ipAddress;
	
	@JsonProperty("join_date")
	private String joinDate;
	
	@JsonProperty("modify_date")
	private String modifyDate;
	
	@JsonProperty("cnc_id")
	private int cncId;
	private String protocol;
	private boolean sleep;
	private String description;

	public DeviceDto() {
		super();
	}

	public DeviceDto(int deviceId, String deviceSerial, String deviceName, String deviceType, String location,
			String status, String battery, String ipAddress, String joinDate, String modifyDate, int cncId,
			String protocol, boolean sleep, String description) {
		super();
		this.deviceId = deviceId;
		this.deviceSerial = deviceSerial;
		this.deviceName = deviceName;
		this.deviceType = deviceType;
		this.location = location;
		this.status = status;
		this.battery = battery;
		this.ipAddress = ipAddress;
		this.joinDate = joinDate;
		this.modifyDate = modifyDate;
		this.cncId = cncId;
		this.protocol = protocol;
		this.sleep = sleep;
		this.description = description;

	}

	public int getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(int deviceId) {
		this.deviceId = deviceId;
	}

	public String getDeviceSerial() {
		return deviceSerial;
	}

	public void setDeviceSerial(String deviceSerial) {
		this.deviceSerial = deviceSerial;
	}

	public String getDeviceName() {
		return deviceName;
	}

	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}

	public String getDeviceType() {
		return deviceType;
	}

	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getBattery() {
		return battery;
	}

	public void setBattery(String battery) {
		this.battery = battery;
	}

	public String getIpAddress() {
		return ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	public String getJoinDate() {
		return joinDate;
	}

	public void setJoinDate(String joinDate) {
		this.joinDate = joinDate;
	}

	public String getModifyDate() {
		return modifyDate;
	}

	public void setModifyDate(String modifyDate) {
		this.modifyDate = modifyDate;
	}

	public int getCncId() {
		return cncId;
	}

	public void setCncId(int cncId) {
		this.cncId = cncId;
	}

	public String getProtocol() {
		return protocol;
	}

	public void setProtocol(String protocol) {
		this.protocol = protocol;
	}

	public boolean isSleep() {
		return sleep;
	}

	public void setSleep(boolean sleep) {
		this.sleep = sleep;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
