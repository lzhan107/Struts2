package bean;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.ArrayList;

public class SystemEvents implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private int customerID;
	private Date receivedAt;
	/*Variable for date range*/
	private Date minReceivedAt;
	private Date maxReceivedAt;
	/**/
	/*Variable for record range*/
	private String recordRange;
	/**/
	private Timestamp deviceReportedTime;
	private int facility;
	/**
	 * Variable for facility message
	 */
	private String facilityMessage;
	/**
	 * Variable for priority message
	 */
	private String priorityMessage;
	private int priority;
	private String fromHost;
	private String message;
	private int NTSeverity;
	private int importance;
	private String eventSource;
	private String eventUser;
	private int eventCategory;
	private int eventID;
	private String eventBinaryData;
	private int maxAvailable;
	private int currUsage;
	private int minUsage;
	private int maxUsage;
	private int infoUnitID;
	private String sysLogTag;
	private String eventLogType;
	private String genericFileName;
	private int systemID;
	private ArrayList<String> serverNameList;
	private ArrayList<Integer> priorityList;
	private ArrayList<Integer> NTSeverityList;
	
	public String getRecordRange() {
		return recordRange;
	}
	public void setRecordRange(String recordRange) {
		this.recordRange = recordRange;
	}
	public Date getMinReceivedAt() {
		return minReceivedAt;
	}
	public void setMinReceivedAt(Date minReceivedAt) {
		this.minReceivedAt = minReceivedAt;
	}
	public Date getMaxReceivedAt() {
		return maxReceivedAt;
	}
	public void setMaxReceivedAt(Date maxReceivedAt) {
		this.maxReceivedAt = maxReceivedAt;
	}
	public ArrayList<Integer> getPriorityList() {
		return priorityList;
	}
	public void setPriorityList(ArrayList<Integer> priorityList) {
		this.priorityList = priorityList;
	}
	public ArrayList<Integer> getNTSeverityList() {
		return NTSeverityList;
	}
	public void setNTSeverityList(ArrayList<Integer> nTSeverityList) {
		NTSeverityList = nTSeverityList;
	}
	public ArrayList<String> getServerNameList() {
		return serverNameList;
	}
	public void setServerNameList(ArrayList<String> serverNameList) {
		this.serverNameList = serverNameList;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCustomerID() {
		return customerID;
	}
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	public Date getReceivedAt() {
		return receivedAt;
	}
	public void setReceivedAt(Date receivedAt) {
		this.receivedAt = receivedAt;
	}
	public Timestamp getDeviceReportedTime() {
		return deviceReportedTime;
	}
	public void setDeviceReportedTime(Timestamp deviceReportedTime) {
		this.deviceReportedTime = deviceReportedTime;
	}
	public int getFacility() {
		return facility;
	}
	public void setFacility(int facility) {
		this.facility = facility;
	}
	public int getPriority() {
		return priority;
	}
	public void setPriority(int priority) {
		this.priority = priority;
	}
	public String getFacilityMessage() {
		return facilityMessage;
	}
	public void setFacilityMessage(String facilityMessage) {
		this.facilityMessage = facilityMessage;
	}
	public String getPriorityMessage() {
		return priorityMessage;
	}
	public void setPriorityMessage(String priorityMessage) {
		this.priorityMessage = priorityMessage;
	}
	public String getFromHost() {
		return fromHost;
	}
	public void setFromHost(String fromHost) {
		this.fromHost = fromHost;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public int getNTSeverity() {
		return NTSeverity;
	}
	public void setNTSeverity(int nTSeverity) {
		NTSeverity = nTSeverity;
	}
	public int getImportance() {
		return importance;
	}
	public void setImportance(int importance) {
		this.importance = importance;
	}
	public String getEventSource() {
		return eventSource;
	}
	public void setEventSource(String eventSource) {
		this.eventSource = eventSource;
	}
	public String getEventUser() {
		return eventUser;
	}
	public void setEventUser(String eventUser) {
		this.eventUser = eventUser;
	}
	public int getEventCategory() {
		return eventCategory;
	}
	public void setEventCategory(int eventCategory) {
		this.eventCategory = eventCategory;
	}
	public int getEventID() {
		return eventID;
	}
	public void setEventID(int eventID) {
		this.eventID = eventID;
	}
	public String getEventBinaryData() {
		return eventBinaryData;
	}
	public void setEventBinaryData(String eventBinaryData) {
		this.eventBinaryData = eventBinaryData;
	}
	public int getMaxAvailable() {
		return maxAvailable;
	}
	public void setMaxAvailable(int maxAvailable) {
		this.maxAvailable = maxAvailable;
	}
	public int getCurrUsage() {
		return currUsage;
	}
	public void setCurrUsage(int currUsage) {
		this.currUsage = currUsage;
	}
	public int getMinUsage() {
		return minUsage;
	}
	public void setMinUsage(int minUsage) {
		this.minUsage = minUsage;
	}
	public int getMaxUsage() {
		return maxUsage;
	}
	public void setMaxUsage(int maxUsage) {
		this.maxUsage = maxUsage;
	}
	public int getInfoUnitID() {
		return infoUnitID;
	}
	public void setInfoUnitID(int infoUnitID) {
		this.infoUnitID = infoUnitID;
	}
	public String getSysLogTag() {
		return sysLogTag;
	}
	public void setSysLogTag(String sysLogTag) {
		this.sysLogTag = sysLogTag;
	}
	public String getEventLogType() {
		return eventLogType;
	}
	public void setEventLogType(String eventLogType) {
		this.eventLogType = eventLogType;
	}
	public String getGenericFileName() {
		return genericFileName;
	}
	public void setGenericFileName(String genericFileName) {
		this.genericFileName = genericFileName;
	}
	public int getSystemID() {
		return systemID;
	}
	public void setSystemID(int systemID) {
		this.systemID = systemID;
	}
	
}
