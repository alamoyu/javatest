package com.cu.database;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import com.mysql.jdbc.Driver;
import java.util.Date;
import java.sql.Timestamp;
import java.util.ArrayList;
public class Traffic {

	/**
	 * @param args
	 */
	private int id;
	private String num;
	private int flow;
	private Timestamp addtime;
	private int status;
	
	public Traffic(){
		
	}
	public Traffic(int id , String num){
		this.id = id;
		this.num = num;
	}
	
	public Traffic(String pnum,int pflow, Timestamp paddtime, int pstatus){
		this.num= pnum;
		this.flow = pflow;
		this.addtime = paddtime;
		this.status = pstatus;
	}
	
	public Traffic(int pid, String pnum,int pflow, Timestamp paddtime, int pstatus){
		this.id = pid;
		this.num= pnum;
		this.flow = pflow;
		this.addtime = paddtime;
		this.status = pstatus;
	}
	
	public void showID(){
		System.out.println(this.id+"~~~"+this.num);
	}
	
	public int getID(){
		return this.id;
	}
	public void setID(int pid){
		this.id = pid;
	}
	public String getNum(){
		return this.num;
	}
	public void setNum(String pnum){
		this.num = pnum;
	}
	public Timestamp getAddTime(){
		return this.addtime;
	}
	public int getStatus(){
		return this.status;
	}
	
	
	public static Connection getConnection (){
		
		Connection conn = null;
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://10.1.100.214:3306/";
		String db = "rtta";
		String user = "root";
		String pass = "root";
		//String conStr = "jdbc:mysql://10.1.100.214:3306/rtta?"+"user=root&password=root&useUnicode=true&characterEncoding=UTF8";
			
		try{
			Class.forName(driver);
			conn = DriverManager.getConnection(url+db,user,pass);			
		}
		catch (SQLException e){
			e.printStackTrace();
		}
		catch(Exception e){
			e.printStackTrace();
		}	
		return conn;
	}
	public static void closeConnection(Connection conn){
		try{
			if(conn!=null)
			{
				conn.close();
				conn = null;
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
	}
	/**
	 * Add Traffic information to the table Traffic
	 * <yangyu 2015-10-10>
	 * @param t
	 * @return
	 */
	public static boolean addTraffic(Traffic t){
		boolean r = false;
		Connection conn = null;
		try
		{
		conn = getConnection();
		Statement stmt = conn.createStatement();
		String sql = "insert into traffic(num,flow,addtime,status) values('"+t.num+"',"+t.flow+",'"+t.addtime+"',"+t.status+")";
	    System.out.println(sql);
		stmt.executeUpdate(sql);
		
		}		
		catch (Exception e){
			e.printStackTrace();
		}
		finally{
			closeConnection(conn);
		}		
		return r;
	}
	/***
	 * 
	 * @param t
	 * @return
	 */
	public static int insertTraffic(Traffic t){
		int i = 0;
		Connection conn = null;
		String sql = "insert into traffic(num,flow,addtime,status) values(?,?,?,?)";
		PreparedStatement pst = null;
		try{
		conn = getConnection();
		pst = conn.prepareStatement(sql);

		pst.setString(1, t.num);
		pst.setInt(2, t.flow);

		pst.setTimestamp(3,t.addtime);
		pst.setInt(4, t.status);
		
		i = pst.executeUpdate();
		}
		catch (SQLException e){
			e.printStackTrace();
		}
		finally{
			closeConnection(conn);
		}
		
		return i;
	}
	
	
	public static Traffic getTrafficbyID(int pid)
	{
		Traffic t = null;
		Connection conn = null;
		PreparedStatement pst = null;
		String sql = "select * from traffic where id = ?";
		ResultSet rs = null;
		try{
			conn = getConnection();
			pst = conn.prepareStatement(sql);
			pst.setInt(1, pid);
			rs = pst.executeQuery();
			if(rs.next()){
				
				t = new Traffic(
						rs.getInt(1),
						rs.getString(2),
						rs.getInt(3),
						rs.getTimestamp(4),
						rs.getInt(5)					
						);
			}
		
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		finally{
			closeConnection(conn);
		}
		
		
		return t;
	}
	/***
	 * Get all information from  table Traffic
	 * <yangyu 2015-10-10>
	 * @return
	 */
	public static ArrayList<Traffic> getAllTraffic() {
		ArrayList<Traffic> objTrafficList = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		String sql = "select * from traffic";
		Connection conn = null;
		try {
			objTrafficList = new ArrayList<Traffic>();
			conn = getConnection();
			pst = conn.prepareStatement(sql);
			rs = pst.executeQuery();

			while (rs.next()) {
				Traffic objTraffic = new Traffic(
						rs.getInt(1),
						rs.getString(2),
						rs.getInt(3),
						rs.getTimestamp(4),
						rs.getInt(5)						
						);
				if (objTraffic != null)
				{
					objTrafficList.add(objTraffic);
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeConnection(conn);
		
		}
		
		return objTrafficList;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d = new Date();
		Timestamp timeStamp = new Timestamp(d.getTime());
		Traffic t= new Traffic("186", 186,timeStamp,1);
		//addTraffic(t);
		//insertTraffic(t);
		ArrayList<Traffic> alist = getAllTraffic();
		for(Traffic t1:alist){
			System.out.println(t1.getNum());
		}
		
		//
		t = getTrafficbyID(2);
		System.out.println(t.getNum());
	}

}
