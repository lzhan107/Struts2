package action;

import java.util.ArrayList;
import java.util.List;

import bean.SystemEvents;

import com.opensymphony.xwork2.ActionSupport;

import dao.FetchDisplayedValues;

public class QueryForm extends ActionSupport{
	private String records;
	private ArrayList<SystemEvents> systemEvents = null;
	private FetchDisplayedValues displayedValues = null;
	private SystemEvents inputValue;
	public String getRecords() {
		return records;
	}
	public void setRecords(String records) {
		this.records = records;
	}
	public ArrayList<SystemEvents> getSystemEvents() {
		return systemEvents;
	}
	public void setSystemEvents(ArrayList<SystemEvents> systemEvents) {
		this.systemEvents = systemEvents;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public String execute(){
		displayedValues = new FetchDisplayedValues();
		systemEvents = new ArrayList<SystemEvents>();
		systemEvents = displayedValues.fetchLastOneHundredRecords();
		//queryBuilder();
		return SUCCESS;
	}
	public String queryBuilder(){
		StringBuilder sql = new StringBuilder("select * from systemevents where");
		inputValue = new SystemEvents();
		
		/**
		 * If not equal to null or 0, add the conditions to WHERE clause
		 */
		if (inputValue.getMinReceivedAt() != null){
			sql.append(" ReceivedAt >= " + inputValue.getMinReceivedAt());
		}
		
		if (inputValue.getMaxReceivedAt() != null){
			sql.append(" and ReceivedAt <= " + inputValue.getMaxReceivedAt());
		}
		
		if (inputValue.getFromHost() != null){
			sql.append(" and FromHost = " + inputValue.getFromHost());
		}
		
		if (inputValue.getPriority() != 0){
			sql.append(" and Priority = " + inputValue.getPriority());
		}
		
		if (inputValue.getNTSeverity() != 0){
			sql.append(" and NTSeverity = " + inputValue.getNTSeverity());
		}
		
		
		
		return sql.toString();
	}
	@Override
	public void validate() {
		
	}
	
}
