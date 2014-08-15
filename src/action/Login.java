package action;


import java.sql.Date;
import java.sql.Timestamp;
import java.util.ArrayList;

import bean.User;

import com.opensymphony.xwork2.ActionSupport;

import dao.FetchDisplayedValues;

public class Login extends ActionSupport{
	private User userBean;
	private FetchDisplayedValues displayedValues = null;
	private ArrayList<String> serverNameList = null;
	private ArrayList<Integer> priorityList = null;
	private ArrayList<Integer> NTSeverityList = null;
	private Timestamp maxReceivedAt = null;
	private Timestamp minReceivedAt = null;
	
	public User getUserBean() {
		return userBean;
	}

	public void setUserBean(User userBean) {
		this.userBean = userBean;
	}

	public ArrayList<String> getServerNameList() {
		return serverNameList;
	}

	public void setServerNameList(ArrayList<String> serverNameList) {
		this.serverNameList = serverNameList;
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

	public Timestamp getMaxReceivedAt() {
		return maxReceivedAt;
	}

	public void setMaxReceivedAt(Timestamp maxReceivedAt) {
		this.maxReceivedAt = maxReceivedAt;
	}

	public Timestamp getMinReceivedAt() {
		return minReceivedAt;
	}

	public void setMinReceivedAt(Timestamp minReceivedAt) {
		this.minReceivedAt = minReceivedAt;
	}

	@Override
	public String execute() throws Exception {
		displayedValues = new FetchDisplayedValues();
		serverNameList = new ArrayList<String>();
		priorityList = new ArrayList<Integer>();
		
		//get serverNameList
		/**
		 * Important -- We need use getter and setter in order to put values in VauleStack
		 */
		serverNameList = displayedValues.fetchServerNames();
		priorityList = displayedValues.fetchPriorityList();
		NTSeverityList = displayedValues.fetchNTServerityList();
		maxReceivedAt = displayedValues.fetchMaxReceivedAtTime();
		minReceivedAt = displayedValues.fetchMinReceivedAtTime();
		System.out.println(maxReceivedAt);
		System.out.println(minReceivedAt);
		return SUCCESS;
	}

	@Override
	public void validate() {
		if (userBean.getUsername().length() == 0 || !userBean.getUsername().equals("root")){
			addFieldError("userBean.username", "Username is not correct");
		}
		if (userBean.getPassword().length() == 0 || !userBean.getPassword().equals("admin")){
			addFieldError("userBean.password", "Password is not correct");
		}
	}
	
}
