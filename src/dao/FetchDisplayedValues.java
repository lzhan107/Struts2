package dao;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;

import util.jdbcUtilities;
import bean.SystemEvents;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class FetchDisplayedValues {
	private ArrayList<String> serverNameList = null;
	private ArrayList<SystemEvents> lastOneHundredRecords = null;
	private SystemEvents systemevent = null;
	private ArrayList<Integer> priorityList = null;
	private ArrayList<Integer> NTSeverityList = null;
	private Timestamp maxReceivedAt = null;
	private Timestamp minReceivedAt = null;

	public ArrayList<String> fetchServerNames() {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		String sql = "select distinct FromHost from systemevents;";
		serverNameList = new ArrayList<String>();

		try {
			conn = jdbcUtilities.getConnection();
			stmt = (Statement) conn.createStatement();
			rs = stmt.executeQuery(sql);

			while (rs.next()) {
				serverNameList.add(rs.getString(1));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		jdbcUtilities.closeResultSet(rs);
		jdbcUtilities.closeStatement(stmt);
		jdbcUtilities.closeConnection(conn);

		return serverNameList;
	}

	public ArrayList<SystemEvents> fetchLastOneHundredRecords() {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		String sql = "select ID,CustomerID, ReceivedAt, DeviceReportedTime,f.Message, p.Message, FromHost, " +
					 "s.Message, NTSeverity, Importance, EventSource, EventUser, EventCategory, EventID, " +
					 "EventBinaryData, MaxAvailable, CurrUsage, MinUsage, MaxUsage, InfoUnitID, SysLogTag, " +
					 "EventLogType, GenericFileName, SystemID from systemevents s, FacilityLookup f, " +
					 "PriorityLookup p where s.Priority = p.PriorityLookupCode and s.Facility = f.FacilityLookupCode limit 100;";
		lastOneHundredRecords = new ArrayList<SystemEvents>();

		try {
			conn = jdbcUtilities.getConnection();
			stmt = (Statement) conn.createStatement();
			rs = stmt.executeQuery(sql);

			while (rs.next()) {
				systemevent = new SystemEvents();
				systemevent.setId(rs.getInt(1));
				systemevent.setCustomerID(rs.getInt(2));
				systemevent.setReceivedAt(rs.getDate(3));
				systemevent.setDeviceReportedTime(rs.getTimestamp(4));
				systemevent.setFacilityMessage(rs.getString(5));
				systemevent.setPriorityMessage(rs.getString(6));
				systemevent.setFromHost(rs.getString(7));
				systemevent.setMessage(rs.getString(8));
				systemevent.setNTSeverity(rs.getInt(9));
				systemevent.setImportance(rs.getInt(10));
				systemevent.setEventSource(rs.getString(11));
				systemevent.setEventUser(rs.getString(12));
				systemevent.setEventCategory(rs.getInt(13));
				systemevent.setEventID(rs.getInt(14));
				systemevent.setEventBinaryData(rs.getString(15));
				systemevent.setMaxAvailable(rs.getInt(16));
				systemevent.setCurrUsage(rs.getInt(17));
				systemevent.setMinUsage(rs.getInt(18));
				systemevent.setMaxUsage(rs.getInt(19));
				systemevent.setInfoUnitID(rs.getInt(20));
				systemevent.setSysLogTag(rs.getString(21));
				systemevent.setEventLogType(rs.getString(22));
				systemevent.setGenericFileName(rs.getString(23));
				systemevent.setSystemID(rs.getInt(24));
				lastOneHundredRecords.add(systemevent);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		jdbcUtilities.closeResultSet(rs);
		jdbcUtilities.closeStatement(stmt);
		jdbcUtilities.closeConnection(conn);

		return lastOneHundredRecords;
	}

	public ArrayList<Integer> fetchPriorityList() {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		String sql = "select distinct Priority from systemevents;";
		priorityList = new ArrayList<Integer>();

		try {
			conn = jdbcUtilities.getConnection();
			stmt = (Statement) conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			while(rs.next()){
				priorityList.add(rs.getInt(1));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		jdbcUtilities.closeResultSet(rs);
		jdbcUtilities.closeStatement(stmt);
		jdbcUtilities.closeConnection(conn);
		
		return priorityList;
	}
	
	public ArrayList<Integer> fetchNTServerityList(){
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		String sql = "select distinct NTSeverity from systemevents;";
		NTSeverityList = new ArrayList<Integer>();
		
		try {
			conn = jdbcUtilities.getConnection();
			stmt = (Statement) conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			while(rs.next()){
				NTSeverityList.add(rs.getInt(1));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		jdbcUtilities.closeResultSet(rs);
		jdbcUtilities.closeStatement(stmt);
		jdbcUtilities.closeConnection(conn);
		
		return NTSeverityList;
	}
	
	public Timestamp fetchMaxReceivedAtTime(){
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		String sql = "select max(ReceivedAt) from systemevents;";
		
		try {
			conn = jdbcUtilities.getConnection();
			stmt = (Statement) conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			while(rs.next()){
				maxReceivedAt = rs.getTimestamp(1);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		jdbcUtilities.closeResultSet(rs);
		jdbcUtilities.closeStatement(stmt);
		jdbcUtilities.closeConnection(conn);
		
		return maxReceivedAt;
	}
	
	public Timestamp fetchMinReceivedAtTime(){
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		String sql = "select min(ReceivedAt) from systemevents;";
		
		try {
			conn = jdbcUtilities.getConnection();
			stmt = (Statement) conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			while(rs.next()){
				minReceivedAt = rs.getTimestamp(1);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		jdbcUtilities.closeResultSet(rs);
		jdbcUtilities.closeStatement(stmt);
		jdbcUtilities.closeConnection(conn);
		
		return minReceivedAt;
	}
}
