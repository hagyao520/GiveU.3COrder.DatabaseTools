package databasetools.handler_1600x900;

import java.awt.Color;
import java.awt.Dimension;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Enumeration;
import java.util.Vector;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.RowSorter;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import databasetools.ui.frame.HomePageWindow;
import databasetools.util.ConfigUtil;
import databasetools.util.Constants;
import databasetools.util.DBHelper;

public class DataBaseHandler1_1600x900 {
	 
    private static final Logger LOG = LoggerFactory.getLogger(DBHelper.class);
    
    private static final String Oracle_FDRIVER = ConfigUtil.getProperty("Oracle.jdbc.Fdriver", Constants.CONFIG_JDBC);
   
    private static final String Oracle_FURL = ConfigUtil.getProperty("Oracle.jdbc.Furl", Constants.CONFIG_JDBC);
    
    private static final String Oracle_FUSERNAME = ConfigUtil.getProperty("Oracle.jdbc.Fusername", Constants.CONFIG_JDBC);
    
    private static final String Oracle_FPASSWORD = ConfigUtil.getProperty("Oracle.jdbc.Fpassword", Constants.CONFIG_JDBC);
    
    
    private static final String Oracle_TDRIVER = ConfigUtil.getProperty("Oracle.jdbc.Tdriver", Constants.CONFIG_JDBC);
    
    private static final String Oracle_TURL = ConfigUtil.getProperty("Oracle.jdbc.Turl", Constants.CONFIG_JDBC);
    
    private static final String Oracle_TUSERNAME = ConfigUtil.getProperty("Oracle.jdbc.Tusername", Constants.CONFIG_JDBC);
    
    private static final String Oracle_TPASSWORD = ConfigUtil.getProperty("Oracle.jdbc.Tpassword", Constants.CONFIG_JDBC);
    
    
    private static final String Oracle_DDRIVER = ConfigUtil.getProperty("Oracle.jdbc.Ddriver", Constants.CONFIG_JDBC);
    
    private static final String Oracle_DURL = ConfigUtil.getProperty("Oracle.jdbc.Durl", Constants.CONFIG_JDBC);
    
    private static final String Oracle_DUSERNAME = ConfigUtil.getProperty("Oracle.jdbc.Dusername", Constants.CONFIG_JDBC);
    
    private static final String Oracle_DPASSWORD = ConfigUtil.getProperty("Oracle.jdbc.Dpassword", Constants.CONFIG_JDBC);
    
    
    private static final String MySql_DRIVER = ConfigUtil.getProperty("MySql.jdbc.driver", Constants.CONFIG_JDBC);
    
    private static final String MySql_URL = ConfigUtil.getProperty("MySql.jdbc.url", Constants.CONFIG_JDBC);
    
    private static final String MySql_USERNAME = ConfigUtil.getProperty("MySql.jdbc.username", Constants.CONFIG_JDBC);
    
    private static final String MySql_PASSWORD = ConfigUtil.getProperty("MySql.jdbc.password", Constants.CONFIG_JDBC);
    
	@SuppressWarnings("unused")
	private static JTableHeader jth;
	private static JTable tabDemo;
	private static JTextArea JsonData;
	private static HomePageWindow HomePage;
	
	private static ResultSet rs;
	private static Statement sm;
	private static Connection con;
	private static CallableStatement cs;
	
	public static boolean isEmpty(String str) {
		if (null == str || "".equals(str)) {
			return true;
		}
		return false;
	}
	
	public static boolean isEmpty1(String str) {
		if (null != str || "".equals(str)) {
			return true;
		}
		return false;
	}
	
	public static boolean isEqual(String str1, String str2) {
		if (str1 == str2 || str1.equals(str2)) {
			return true;
		}
		return false;
	}
	
	/** 主页窗口判断 */
	public static HomePageWindow getHomePage() {
		return HomePage != null ? HomePage : null;
	}

    //对比用户ID是否匹配,判断用户是否存在
	public static boolean UserIDcompare(String DataVersion,String User_ID){
	    boolean m = false;
	    String sql = "select ID from dafy_sales.SYS_USER_LIST where ID="+ User_ID +"";
	    try{
	    	 checkConnection_Oracle(DataVersion);
	         ResultSet rs = sm.executeQuery(sql);
	         if(rs.next()){
	              String pa = rs.getString(1);
	              System.out.println(pa+" " +User_ID);
	            if(pa.equals(User_ID)){
	            m = true;
	            }else {
	                   JOptionPane.showMessageDialog(null, "用户ID和数据库不匹配！");
	            }
	            }else {
	                   JOptionPane.showMessageDialog(null, "用户不存在！");
	            }
	            close(sm,rs);
	      }catch(SQLException e){
	            e.printStackTrace();
	      }
	      return m;
	}
	
	//对比合同号是否匹配,判断合同是否存在
	public static boolean contractcompare(String DataVersion,String contract_no){
	    boolean m = false;
	    String sql = "select CONTRACT_NO from dafy_sales.cs_credit where contract_no="+ contract_no +"";
	    try{
	    	 checkConnection_Oracle(DataVersion);
	         ResultSet rs = sm.executeQuery(sql);
	         if(rs.next()){
	              String pa = rs.getString(1);
	              System.out.println(pa+" " +contract_no);
	            if(pa.equals(contract_no)){
	            m = true;
	            }else {
	                   JOptionPane.showMessageDialog(null, "合同号和数据库不匹配！");
	            }
	            }else {
	                   JOptionPane.showMessageDialog(null, "合同号不存在！");
	            }
	            close(sm,rs);
	      }catch(SQLException e){
	            e.printStackTrace();
	      }
	      return m;
	}
	
	//根据用户ID,查询登录用户的所有信息
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static boolean UserInfoButton(String DataVersion,String User_ID){
   
	    String sql = "select * from dafy_sales.SYS_USER_LIST  where ID="+ User_ID +""; 
	 
	    try {
		     checkConnection_Oracle(DataVersion);
	         ResultSet rs = sm.executeQuery(sql);
		     System.out.println(sql);
	         boolean moreRecords = rs.next(); // 定位到达第一条记录
	         if (!moreRecords) {
	            JOptionPane.showMessageDialog(null, "未查询到数据！");
	         }
	         Vector rows = new Vector();
	         Vector columnHeads = new Vector();
	         ResultSetMetaData rsmd = rs.getMetaData(); // 获得rs结果集中列属性信息
	         
	             for (int i = 1; i <= rsmd.getColumnCount(); ++i)
	                  columnHeads.addElement(rsmd.getColumnName(i)); // 获得列名(将列名存放至向量columnHeads)

	               do {
	                rows.addElement(getNextRow(rs, rsmd));
	               } 
	               while (rs.next()); // 利用循环获得所有记录 
	               System.out.println(rows);
	               System.out.println(columnHeads);
	               tabDemo = new JTable(rows, columnHeads); // 将获得的行列数据信息作为参数重新构造表格视图
	               TableViewInquiryContract1_1600x900(tabDemo);   
	                close(sm,rs);
	      }catch (SQLException e) {
		        JOptionPane.showMessageDialog(null,"SQL定义信息有误！");
	            e.printStackTrace();
	            System.err.println(e.getClass().getName() + ": " + e.getMessage());
	      }
	 return false;
	}	
	
	//根根据用户ID，查询用户绑定的商品门店
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static boolean UserBoundStoreButton(String DataVersion,String User_ID){
   
	    String sql = "select rownum,s.* from dafy_sales.SYS_USER_LIST s where ID="+ User_ID +""; 
	 
	    try {
		     checkConnection_Oracle(DataVersion);
	         ResultSet rs = sm.executeQuery(sql);
		     System.out.println(sql);
	         boolean moreRecords = rs.next(); // 定位到达第一条记录
	         if (!moreRecords) {
	            JOptionPane.showMessageDialog(null, "未查询到数据！");
	         }else {
                 JOptionPane.showMessageDialog(null, "查询成功！");
	         }
	         Vector rows = new Vector();
	         Vector columnHeads = new Vector();
	         ResultSetMetaData rsmd = rs.getMetaData(); // 获得rs结果集中列属性信息
	             for (int i = 1; i <= rsmd.getColumnCount(); ++i)
	                  columnHeads.addElement(rsmd.getColumnName(i)); // 获得列名(将列名存放至向量columnHeads)

	               do {
	                rows.addElement(getNextRow(rs, rsmd));
	               } 
	               while (rs.next()); // 利用循环获得所有记录 
	               tabDemo = new JTable(rows, columnHeads); // 将获得的行列数据信息作为参数重新构造表格视图
	               TableViewInquiryContract1_1600x900(tabDemo);   
	                close(sm,rs);
	      }catch (SQLException e) {
		        JOptionPane.showMessageDialog(null,"SQL定义信息有误！");
	            e.printStackTrace();
	            System.err.println(e.getClass().getName() + ": " + e.getMessage());
	      }
	 return false;
	}	
	
	//根据城市名称，查询城市绑定的合同模式
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static boolean CityBoundContractModeButton(String DataVersion,String city){
   
	    String sql = "select rownum,c.* from dafy_sales.cs_creditmodel_city c where city ='"+ city +"'"; 
	 
	    try {
		     checkConnection_Oracle(DataVersion);
	         ResultSet rs = sm.executeQuery(sql);
		     System.out.println(sql);
	         boolean moreRecords = rs.next(); // 定位到达第一条记录
	         if (!moreRecords) {
	            JOptionPane.showMessageDialog(null, "未查询到数据,请重新输入！");
	         }else {
                 JOptionPane.showMessageDialog(null, "查询成功！");
	         }
	         Vector rows = new Vector();
	         Vector columnHeads = new Vector();
	         ResultSetMetaData rsmd = rs.getMetaData(); // 获得rs结果集中列属性信息
	             for (int i = 1; i <= rsmd.getColumnCount(); ++i)
	                  columnHeads.addElement(rsmd.getColumnName(i)); // 获得列名(将列名存放至向量columnHeads)

	               do {
	                rows.addElement(getNextRow(rs, rsmd));
	               } 
	               while (rs.next()); // 利用循环获得所有记录 
	               tabDemo = new JTable(rows, columnHeads); // 将获得的行列数据信息作为参数重新构造表格视图
	               TableViewInquiryContract1_1600x900(tabDemo);   
	                close(sm,rs);
	      }catch (SQLException e) {
	            e.printStackTrace();
	            System.err.println(e.getClass().getName() + ": " + e.getMessage());
	      }
	 return false;
	}	
	
//	//根据门店代码，查询商品门店绑定的商品类型
//	@SuppressWarnings({ "unchecked", "rawtypes" })
//	public static boolean StoreBoundCommodityTypeButton(String DataVersion,String POS_CODE){
//   
//	    String sql = "select * from product_bind_search_type where POS_CODE="+ POS_CODE +""; 
//	 
//	    try {
//		     checkConnection_Oracle(DataVersion);
//	         ResultSet rs = sm.executeQuery(sql);
//		     System.out.println(sql);
//	         boolean moreRecords = rs.next(); // 定位到达第一条记录
//	         if (!moreRecords) {
//	            JOptionPane.showMessageDialog(null, "未查询到数据,请重新输入！");
//	         }else {
//                 JOptionPane.showMessageDialog(null, "查询成功！");
//	         }
//	         Vector rows = new Vector();
//	         Vector columnHeads = new Vector();
//	         ResultSetMetaData rsmd = rs.getMetaData(); // 获得rs结果集中列属性信息
//	             for (int i = 1; i <= rsmd.getColumnCount(); ++i)
//	                  columnHeads.addElement(rsmd.getColumnName(i)); // 获得列名(将列名存放至向量columnHeads)
//
//	               do {
//	                rows.addElement(getNextRow(rs, rsmd));
//	               } 
//	               while (rs.next()); // 利用循环获得所有记录 
//	               tabDemo = new JTable(rows, columnHeads); // 将获得的行列数据信息作为参数重新构造表格视图
//	               TableViewInquiryContract1_1600x900(tabDemo);   
//	                close(sm,rs);
//	      }catch (SQLException e) {
//	            e.printStackTrace();
//	            System.err.println(e.getClass().getName() + ": " + e.getMessage());
//	      }
//	 return false;
//	}	
	
	//根据门店代码，查询商品门店绑定的产品版本
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static boolean StoreBoundProductVersionButton(String DataVersion,String POS_CODE){
   
	    String sql = "select rownum,p.* from dafy_Sales.product_bind_search_type p where POS_CODE="+ POS_CODE +""; 
	 
	    try {
		     checkConnection_Oracle(DataVersion);
	         ResultSet rs = sm.executeQuery(sql);
		     System.out.println(sql);
	         boolean moreRecords = rs.next(); // 定位到达第一条记录
	         if (!moreRecords) {
	            JOptionPane.showMessageDialog(null, "未查询到数据,请重新输入！");
	         }else {
                 JOptionPane.showMessageDialog(null, "查询成功！");
	         }
	         Vector rows = new Vector();
	         Vector columnHeads = new Vector();
	         ResultSetMetaData rsmd = rs.getMetaData(); // 获得rs结果集中列属性信息
	             for (int i = 1; i <= rsmd.getColumnCount(); ++i)
	                  columnHeads.addElement(rsmd.getColumnName(i)); // 获得列名(将列名存放至向量columnHeads)

	               do {
	                rows.addElement(getNextRow(rs, rsmd));
	               } 
	               while (rs.next()); // 利用循环获得所有记录 
	               tabDemo = new JTable(rows, columnHeads); // 将获得的行列数据信息作为参数重新构造表格视图
	               TableViewInquiryContract1_1600x900(tabDemo);   
	                close(sm,rs);
	      }catch (SQLException e) {
	            e.printStackTrace();
	            System.err.println(e.getClass().getName() + ": " + e.getMessage());
	      }
	 return false;
	}	
	
	//根据产品版本代码，注册代码，查询对应的产品版本信息
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static boolean ProductVersionButton(String DataVersion,String REG_VAL_CODE,String REG_NUMBER){
   
	    String sql = "select rownum,r.* from dafy_Sales.registers r where REG_VAL_CODE in("+ REG_VAL_CODE +") and REG_NUMBER="+ REG_NUMBER +""; 
	    
	    try {
		     checkConnection_Oracle(DataVersion);
	         ResultSet rs = sm.executeQuery(sql);
		     System.out.println(sql);
	         boolean moreRecords = rs.next(); // 定位到达第一条记录
	         if (!moreRecords) {
	            JOptionPane.showMessageDialog(null, "未查询到数据,请重新输入！");
	         }else {
                 JOptionPane.showMessageDialog(null, "查询成功！");
	         }
	         Vector rows = new Vector();
	         Vector columnHeads = new Vector();
	         ResultSetMetaData rsmd = rs.getMetaData(); // 获得rs结果集中列属性信息
	             for (int i = 1; i <= rsmd.getColumnCount(); ++i)
	                  columnHeads.addElement(rsmd.getColumnName(i)); // 获得列名(将列名存放至向量columnHeads)

	               do {
	                rows.addElement(getNextRow(rs, rsmd));
	               } 
	               while (rs.next()); // 利用循环获得所有记录 
	               tabDemo = new JTable(rows, columnHeads); // 将获得的行列数据信息作为参数重新构造表格视图
	               TableViewInquiryContract1_1600x900(tabDemo);   
	                close(sm,rs);
	      }catch (SQLException e) {
	    	    JOptionPane.showMessageDialog(null,"产品版本代码或注册代码输入有误！");
	            e.printStackTrace();
	            System.err.println(e.getClass().getName() + ": " + e.getMessage());
	      }
	 return false;
	}	
	
	//根据产品版本代码，注册代码，查询对应的产品版本信息
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static boolean ProductInformationButton(String DataVersion,String credit_model,String GOODS_CA_ID,String search_type,String prod_type,String INIT_PAY,String STATUS){
   
	    String sql = "select rownum,p.* from dafy_sales.cs_creditmodel_product a inner join dafy_sales.product p on a.id_product=p.id "
	    		+ "where a.credit_model ='"+credit_model+"' and p.GOODS_CA_ID ='"+GOODS_CA_ID+"' and p.search_type='"+search_type+"' and p.prod_type='"+prod_type+"' and INIT_PAY='"+INIT_PAY+"' and STATUS='"+STATUS+"'"; 
	    
	    try {
		     checkConnection_Oracle(DataVersion);
	         ResultSet rs = sm.executeQuery(sql);
		     System.out.println(sql);
	         boolean moreRecords = rs.next(); // 定位到达第一条记录
	         if (!moreRecords) {
	            JOptionPane.showMessageDialog(null, "未查询到数据,请重新输入！");
	         }else {
                 JOptionPane.showMessageDialog(null, "查询成功！");
	         }
	         Vector rows = new Vector();
	         Vector columnHeads = new Vector();
	         ResultSetMetaData rsmd = rs.getMetaData(); // 获得rs结果集中列属性信息
	             for (int i = 1; i <= rsmd.getColumnCount(); ++i)
	                  columnHeads.addElement(rsmd.getColumnName(i)); // 获得列名(将列名存放至向量columnHeads)

	               do {
	                rows.addElement(getNextRow(rs, rsmd));
	               } 
	               while (rs.next()); // 利用循环获得所有记录 
	               tabDemo = new JTable(rows, columnHeads); // 将获得的行列数据信息作为参数重新构造表格视图
	               TableViewInquiryContract1_1600x900(tabDemo);   
	                close(sm,rs);
	      }catch (SQLException e) {
	            e.printStackTrace();
	            System.err.println(e.getClass().getName() + ": " + e.getMessage());
	      }
	 return false;
	}	
	
	//根据贷款本金x保险费率计算得出对应产品的保险费
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static boolean InsuranceFeeButton(String DataVersion,String LoanPrincipal,String InsuranceRate,String ProductVersionCode){
   
	    String sql = "select FLOOR("+LoanPrincipal+"*"+InsuranceRate+") as 保险费 ,INSURANCE_FEE_MAX as 保险费上限 from dafy_sales.product p where PROD_CODE ='"+ProductVersionCode+"'"; 
	    
	    try {
		     checkConnection_Oracle(DataVersion);
	         ResultSet rs = sm.executeQuery(sql);
		     System.out.println(sql);
	         boolean moreRecords = rs.next(); // 定位到达第一条记录
	         if (!moreRecords) {
	            JOptionPane.showMessageDialog(null, "未计算出数据,请重新输入！");
	         }else {
                 JOptionPane.showMessageDialog(null, "计算成功！");
	         }
	         Vector rows = new Vector();
	         Vector columnHeads = new Vector();
	         ResultSetMetaData rsmd = rs.getMetaData(); // 获得rs结果集中列属性信息
	             for (int i = 1; i <= rsmd.getColumnCount(); ++i)
	                  columnHeads.addElement(rsmd.getColumnName(i)); // 获得列名(将列名存放至向量columnHeads)

	               do {
	                rows.addElement(getNextRow(rs, rsmd));
	               } 
	               while (rs.next()); // 利用循环获得所有记录 
	               tabDemo = new JTable(rows, columnHeads); // 将获得的行列数据信息作为参数重新构造表格视图
	               TableViewInquiryContract1_1600x900(tabDemo);   
	                close(sm,rs);
	      }catch (SQLException e) {
	            e.printStackTrace();
	            System.err.println(e.getClass().getName() + ": " + e.getMessage());
	      }
	 return false;
	}	
	
	//根据贷款本金x保险费率计算得出对应产品的百宝箱费
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static boolean TreasureBoxFeeButton(String DataVersion,String LoanPrincipal,String TreasureBoxRate,String ProductVersionCode){
   
	    String sql = "select FLOOR("+LoanPrincipal+"*"+TreasureBoxRate+") as 百宝箱费 from dafy_sales.product p where PROD_CODE ='"+ProductVersionCode+"'"; 
	    
	    try {
		     checkConnection_Oracle(DataVersion);
	         ResultSet rs = sm.executeQuery(sql);
		     System.out.println(sql);
	         boolean moreRecords = rs.next(); // 定位到达第一条记录
	         if (!moreRecords) {
	            JOptionPane.showMessageDialog(null, "未计算出数据,请重新输入！");
	         }else {
                 JOptionPane.showMessageDialog(null, "计算成功！");
	         }
	         Vector rows = new Vector();
	         Vector columnHeads = new Vector();
	         ResultSetMetaData rsmd = rs.getMetaData(); // 获得rs结果集中列属性信息
	             for (int i = 1; i <= rsmd.getColumnCount(); ++i)
	                  columnHeads.addElement(rsmd.getColumnName(i)); // 获得列名(将列名存放至向量columnHeads)

	               do {
	                rows.addElement(getNextRow(rs, rsmd));
	               } 
	               while (rs.next()); // 利用循环获得所有记录 
	               tabDemo = new JTable(rows, columnHeads); // 将获得的行列数据信息作为参数重新构造表格视图
	               TableViewInquiryContract1_1600x900(tabDemo);   
	                close(sm,rs);
	      }catch (SQLException e) {
	            e.printStackTrace();
	            System.err.println(e.getClass().getName() + ": " + e.getMessage());
	      }
	 return false;
	}	
	
	//根据贷款本金x商城赠券费率计算得出对应产品的商城赠券费
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static boolean MallCouponsFeeButton(String DataVersion,String LoanPrincipal,String MallCouponsRate,String ProductVersionCode){
   
	    String sql = "select ROUND("+LoanPrincipal+"*"+MallCouponsRate+") as 商城赠券费 from dafy_sales.product p where PROD_CODE ='"+ProductVersionCode+"'"; 
	    
	    try {
		     checkConnection_Oracle(DataVersion);
	         ResultSet rs = sm.executeQuery(sql);
		     System.out.println(sql);
	         boolean moreRecords = rs.next(); // 定位到达第一条记录
	         if (!moreRecords) {
	            JOptionPane.showMessageDialog(null, "未计算出数据,请重新输入！");
	         }else {
                 JOptionPane.showMessageDialog(null, "计算成功！");
	         }
	         Vector rows = new Vector();
	         Vector columnHeads = new Vector();
	         ResultSetMetaData rsmd = rs.getMetaData(); // 获得rs结果集中列属性信息
	             for (int i = 1; i <= rsmd.getColumnCount(); ++i)
	                  columnHeads.addElement(rsmd.getColumnName(i)); // 获得列名(将列名存放至向量columnHeads)

	               do {
	                rows.addElement(getNextRow(rs, rsmd));
	               } 
	               while (rs.next()); // 利用循环获得所有记录 
	               tabDemo = new JTable(rows, columnHeads); // 将获得的行列数据信息作为参数重新构造表格视图
	               TableViewInquiryContract1_1600x900(tabDemo);   
	                close(sm,rs);
	      }catch (SQLException e) {
	            e.printStackTrace();
	            System.err.println(e.getClass().getName() + ": " + e.getMessage());
	      }
	 return false;
	}	
	
	//根据产品代码，计算该产品每期应还费用
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static boolean EachPeriodShouldBeReturnedFeeButton(String DataVersion,String LoanPrincipal,String InsuranceFee,String TreasureBoxFee,String ProductVersionCode){
    
	    String sql = "select ROUND("+LoanPrincipal+"*p.MONTH_RATIO_EIR/100+"+InsuranceFee+"+"+TreasureBoxFee+") as 每期应还 from dafy_sales.product p where PROD_CODE ='"+ProductVersionCode+"'";
	    
	    try {
		     checkConnection_Oracle(DataVersion);
	         ResultSet rs = sm.executeQuery(sql);
		     System.out.println(sql);
	         boolean moreRecords = rs.next(); // 定位到达第一条记录
	         if (!moreRecords) {
	            JOptionPane.showMessageDialog(null, "未计算出数据,请重新输入！");
	         }else {
                 JOptionPane.showMessageDialog(null, "计算成功！");
	         }
	         Vector rows = new Vector();
	         Vector columnHeads = new Vector();
	         ResultSetMetaData rsmd = rs.getMetaData(); // 获得rs结果集中列属性信息
	             for (int i = 1; i <= rsmd.getColumnCount(); ++i)
	                  columnHeads.addElement(rsmd.getColumnName(i)); // 获得列名(将列名存放至向量columnHeads)

	               do {
	                rows.addElement(getNextRow(rs, rsmd));
	               } 
	               while (rs.next()); // 利用循环获得所有记录 
	               tabDemo = new JTable(rows, columnHeads); // 将获得的行列数据信息作为参数重新构造表格视图
	               TableViewInquiryContract1_1600x900(tabDemo);   
	                close(sm,rs);
	      }catch (SQLException e) {
	            e.printStackTrace();
	            System.err.println(e.getClass().getName() + ": " + e.getMessage());
	      }
	 return false;
	}	
	
//	//根据产品代码，计算该产品全面保费用
//	@SuppressWarnings({ "unchecked", "rawtypes" })
//	public static boolean EachPeriodShouldBeReturnedFeeButton(String DataVersion,String LoanPrincipal,String InsuranceFee,String TreasureBoxFee,String ProductVersionCode){
//    
//	    String sql = "select ROUND("+LoanPrincipal+"*p.MONTH_RATIO_EIR/100+"+InsuranceFee+"+"+TreasureBoxFee+") as 每期应还 from dafy_sales.product p where PROD_CODE ='"+ProductVersionCode+"'";
//	    
//	    try {
//		     checkConnection_Oracle(DataVersion);
//	         ResultSet rs = sm.executeQuery(sql);
//		     System.out.println(sql);
//	         boolean moreRecords = rs.next(); // 定位到达第一条记录
//	         if (!moreRecords) {
//	            JOptionPane.showMessageDialog(null, "未计算出数据,请重新输入！");
//	         }else {
//                 JOptionPane.showMessageDialog(null, "计算成功！");
//	         }
//	         Vector rows = new Vector();
//	         Vector columnHeads = new Vector();
//	         ResultSetMetaData rsmd = rs.getMetaData(); // 获得rs结果集中列属性信息
//	             for (int i = 1; i <= rsmd.getColumnCount(); ++i)
//	                  columnHeads.addElement(rsmd.getColumnName(i)); // 获得列名(将列名存放至向量columnHeads)
//
//	               do {
//	                rows.addElement(getNextRow(rs, rsmd));
//	               } 
//	               while (rs.next()); // 利用循环获得所有记录 
//	               tabDemo = new JTable(rows, columnHeads); // 将获得的行列数据信息作为参数重新构造表格视图
//	               TableViewInquiryContract1_1600x900(tabDemo);   
//	                close(sm,rs);
//	      }catch (SQLException e) {
//	            e.printStackTrace();
//	            System.err.println(e.getClass().getName() + ": " + e.getMessage());
//	      }
//	 return false;
//	}		
	
	//根据教育程度注册代码，查询教育程度信息
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static boolean EducationalLevelButton(String DataVersion,String reg_number){
    
	    String sql = "select rownum,a.* from dafy_sales.registers a where a.reg_number=11";
	    
	    try {
		     checkConnection_Oracle(DataVersion);
	         ResultSet rs = sm.executeQuery(sql);
		     System.out.println(sql);
	         boolean moreRecords = rs.next(); // 定位到达第一条记录
	         if (!moreRecords) {
	        	 JOptionPane.showMessageDialog(null, "未查询到数据,请重新输入！");
	         }else {
                 JOptionPane.showMessageDialog(null, "查询成功！");
	         }
	         Vector rows = new Vector();
	         Vector columnHeads = new Vector();
	         ResultSetMetaData rsmd = rs.getMetaData(); // 获得rs结果集中列属性信息
	             for (int i = 1; i <= rsmd.getColumnCount(); ++i)
	                  columnHeads.addElement(rsmd.getColumnName(i)); // 获得列名(将列名存放至向量columnHeads)

	               do {
	                rows.addElement(getNextRow(rs, rsmd));
	               } 
	               while (rs.next()); // 利用循环获得所有记录 
	               tabDemo = new JTable(rows, columnHeads); // 将获得的行列数据信息作为参数重新构造表格视图
	               TableViewInquiryContract1_1600x900(tabDemo);   
	                close(sm,rs);
	      }catch (SQLException e) {
	            e.printStackTrace();
	            System.err.println(e.getClass().getName() + ": " + e.getMessage());
	      }
	 return false;
	}		
	
	//根据住房情况注册代码，查询住房情况信息
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static boolean HousingSituationButton(String DataVersion,String reg_number){
    
	    String sql = "select rownum,a.* from dafy_sales.registers a where a.reg_number=2";
	    
	    try {
		     checkConnection_Oracle(DataVersion);
	         ResultSet rs = sm.executeQuery(sql);
		     System.out.println(sql);
	         boolean moreRecords = rs.next(); // 定位到达第一条记录
	         if (!moreRecords) {
	        	 JOptionPane.showMessageDialog(null, "未查询到数据,请重新输入！");
	         }else {
                 JOptionPane.showMessageDialog(null, "查询成功！");
	         }
	         Vector rows = new Vector();
	         Vector columnHeads = new Vector();
	         ResultSetMetaData rsmd = rs.getMetaData(); // 获得rs结果集中列属性信息
	             for (int i = 1; i <= rsmd.getColumnCount(); ++i)
	                  columnHeads.addElement(rsmd.getColumnName(i)); // 获得列名(将列名存放至向量columnHeads)

	               do {
	                rows.addElement(getNextRow(rs, rsmd));
	               } 
	               while (rs.next()); // 利用循环获得所有记录 
	               tabDemo = new JTable(rows, columnHeads); // 将获得的行列数据信息作为参数重新构造表格视图
	               TableViewInquiryContract1_1600x900(tabDemo);   
	                close(sm,rs);
	      }catch (SQLException e) {
	            e.printStackTrace();
	            System.err.println(e.getClass().getName() + ": " + e.getMessage());
	      }
	 return false;
	}	
	
	//根据婚姻状况注册代码，查询婚姻状况信息
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static boolean MaritalStatusButton(String DataVersion,String reg_number){
    
	    String sql = "select rownum,a.* from dafy_sales.registers a where a.reg_number=3";
	    
	    try {
		     checkConnection_Oracle(DataVersion);
	         ResultSet rs = sm.executeQuery(sql);
		     System.out.println(sql);
	         boolean moreRecords = rs.next(); // 定位到达第一条记录
	         if (!moreRecords) {
	        	 JOptionPane.showMessageDialog(null, "未查询到数据,请重新输入！");
	         }else {
                 JOptionPane.showMessageDialog(null, "查询成功！");
	         }
	         Vector rows = new Vector();
	         Vector columnHeads = new Vector();
	         ResultSetMetaData rsmd = rs.getMetaData(); // 获得rs结果集中列属性信息
	             for (int i = 1; i <= rsmd.getColumnCount(); ++i)
	                  columnHeads.addElement(rsmd.getColumnName(i)); // 获得列名(将列名存放至向量columnHeads)

	               do {
	                rows.addElement(getNextRow(rs, rsmd));
	               } 
	               while (rs.next()); // 利用循环获得所有记录 
	               tabDemo = new JTable(rows, columnHeads); // 将获得的行列数据信息作为参数重新构造表格视图
	               TableViewInquiryContract1_1600x900(tabDemo);   
	                close(sm,rs);
	      }catch (SQLException e) {
	            e.printStackTrace();
	            System.err.println(e.getClass().getName() + ": " + e.getMessage());
	      }
	 return false;
	}	
	
	//根据行业类别注册代码，查询行业类别信息
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static boolean IndustryCategoryButton(String DataVersion,String reg_number){
    
	    String sql = "select rownum,a.* from dafy_sales.registers a where a.reg_number=397";
	    
	    try {
		     checkConnection_Oracle(DataVersion);
	         ResultSet rs = sm.executeQuery(sql);
		     System.out.println(sql);
	         boolean moreRecords = rs.next(); // 定位到达第一条记录
	         if (!moreRecords) {
	        	 JOptionPane.showMessageDialog(null, "未查询到数据,请重新输入！");
	         }else {
                 JOptionPane.showMessageDialog(null, "查询成功！");
	         }
	         Vector rows = new Vector();
	         Vector columnHeads = new Vector();
	         ResultSetMetaData rsmd = rs.getMetaData(); // 获得rs结果集中列属性信息
	             for (int i = 1; i <= rsmd.getColumnCount(); ++i)
	                  columnHeads.addElement(rsmd.getColumnName(i)); // 获得列名(将列名存放至向量columnHeads)

	               do {
	                rows.addElement(getNextRow(rs, rsmd));
	               } 
	               while (rs.next()); // 利用循环获得所有记录 
	               tabDemo = new JTable(rows, columnHeads); // 将获得的行列数据信息作为参数重新构造表格视图
	               TableViewInquiryContract1_1600x900(tabDemo);   
	                close(sm,rs);
	      }catch (SQLException e) {
	            e.printStackTrace();
	            System.err.println(e.getClass().getName() + ": " + e.getMessage());
	      }
	 return false;
	}	
	
	//根据单位性质注册代码，查询单位性质信息
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static boolean UnitPropertiesButton(String DataVersion,String reg_number){
    
	    String sql = "select rownum,a.* from dafy_sales.registers a where a.reg_number=399";
	    
	    try {
		     checkConnection_Oracle(DataVersion);
	         ResultSet rs = sm.executeQuery(sql);
		     System.out.println(sql);
	         boolean moreRecords = rs.next(); // 定位到达第一条记录
	         if (!moreRecords) {
	        	 JOptionPane.showMessageDialog(null, "未查询到数据,请重新输入！");
	         }else {
                 JOptionPane.showMessageDialog(null, "查询成功！");
	         }
	         Vector rows = new Vector();
	         Vector columnHeads = new Vector();
	         ResultSetMetaData rsmd = rs.getMetaData(); // 获得rs结果集中列属性信息
	             for (int i = 1; i <= rsmd.getColumnCount(); ++i)
	                  columnHeads.addElement(rsmd.getColumnName(i)); // 获得列名(将列名存放至向量columnHeads)

	               do {
	                rows.addElement(getNextRow(rs, rsmd));
	               } 
	               while (rs.next()); // 利用循环获得所有记录 
	               tabDemo = new JTable(rows, columnHeads); // 将获得的行列数据信息作为参数重新构造表格视图
	               TableViewInquiryContract1_1600x900(tabDemo);   
	                close(sm,rs);
	      }catch (SQLException e) {
	            e.printStackTrace();
	            System.err.println(e.getClass().getName() + ": " + e.getMessage());
	      }
	 return false;
	}	
	
	//根据职位注册代码，查询职位信息
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static boolean PositionButton(String DataVersion,String reg_number){
    
	    String sql = "select rownum,a.* from dafy_sales.registers a where a.reg_number=398";
	    
	    try {
		     checkConnection_Oracle(DataVersion);
	         ResultSet rs = sm.executeQuery(sql);
		     System.out.println(sql);
	         boolean moreRecords = rs.next(); // 定位到达第一条记录
	         if (!moreRecords) {
	        	 JOptionPane.showMessageDialog(null, "未查询到数据,请重新输入！");
	         }else {
                 JOptionPane.showMessageDialog(null, "查询成功！");
	         }
	         Vector rows = new Vector();
	         Vector columnHeads = new Vector();
	         ResultSetMetaData rsmd = rs.getMetaData(); // 获得rs结果集中列属性信息
	             for (int i = 1; i <= rsmd.getColumnCount(); ++i)
	                  columnHeads.addElement(rsmd.getColumnName(i)); // 获得列名(将列名存放至向量columnHeads)

	               do {
	                rows.addElement(getNextRow(rs, rsmd));
	               } 
	               while (rs.next()); // 利用循环获得所有记录 
	               tabDemo = new JTable(rows, columnHeads); // 将获得的行列数据信息作为参数重新构造表格视图
	               TableViewInquiryContract1_1600x900(tabDemo);   
	                close(sm,rs);
	      }catch (SQLException e) {
	            e.printStackTrace();
	            System.err.println(e.getClass().getName() + ": " + e.getMessage());
	      }
	 return false;
	}		
	
	//根据工作年限注册代码，查询工作年限信息
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static boolean WorkingLifeButton(String DataVersion,String reg_number){
    
	    String sql = "select rownum,a.* from dafy_sales.registers a where a.reg_number=403";
	    
	    try {
		     checkConnection_Oracle(DataVersion);
	         ResultSet rs = sm.executeQuery(sql);
		     System.out.println(sql);
	         boolean moreRecords = rs.next(); // 定位到达第一条记录
	         if (!moreRecords) {
	        	 JOptionPane.showMessageDialog(null, "未查询到数据,请重新输入！");
	         }else {
                 JOptionPane.showMessageDialog(null, "查询成功！");
	         }
	         Vector rows = new Vector();
	         Vector columnHeads = new Vector();
	         ResultSetMetaData rsmd = rs.getMetaData(); // 获得rs结果集中列属性信息
	             for (int i = 1; i <= rsmd.getColumnCount(); ++i)
	                  columnHeads.addElement(rsmd.getColumnName(i)); // 获得列名(将列名存放至向量columnHeads)

	               do {
	                rows.addElement(getNextRow(rs, rsmd));
	               } 
	               while (rs.next()); // 利用循环获得所有记录 
	               tabDemo = new JTable(rows, columnHeads); // 将获得的行列数据信息作为参数重新构造表格视图
	               TableViewInquiryContract1_1600x900(tabDemo);   
	                close(sm,rs);
	      }catch (SQLException e) {
	            e.printStackTrace();
	            System.err.println(e.getClass().getName() + ": " + e.getMessage());
	      }
	 return false;
	}	
	
	//根据支持银行注册代码，查询支持银行卡信息
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static boolean SupportBankButton(String DataVersion,String reg_number){
    
	    String sql = "select rownum,a.* from dafy_sales.registers a where a.reg_number=403";
	    
	    try {
		     checkConnection_Oracle(DataVersion);
	         ResultSet rs = sm.executeQuery(sql);
		     System.out.println(sql);
	         boolean moreRecords = rs.next(); // 定位到达第一条记录
	         if (!moreRecords) {
	        	 JOptionPane.showMessageDialog(null, "未查询到数据,请重新输入！");
	         }else {
                 JOptionPane.showMessageDialog(null, "查询成功！");
	         }
	         Vector rows = new Vector();
	         Vector columnHeads = new Vector();
	         ResultSetMetaData rsmd = rs.getMetaData(); // 获得rs结果集中列属性信息
	             for (int i = 1; i <= rsmd.getColumnCount(); ++i)
	                  columnHeads.addElement(rsmd.getColumnName(i)); // 获得列名(将列名存放至向量columnHeads)

	               do {
	                rows.addElement(getNextRow(rs, rsmd));
	               } 
	               while (rs.next()); // 利用循环获得所有记录 
	               tabDemo = new JTable(rows, columnHeads); // 将获得的行列数据信息作为参数重新构造表格视图
	               TableViewInquiryContract1_1600x900(tabDemo);   
	                close(sm,rs);
	      }catch (SQLException e) {
	            e.printStackTrace();
	            System.err.println(e.getClass().getName() + ": " + e.getMessage());
	      }
	 return false;
	}	
	
	//根据评定内部代码注册代码，查询评定内部代码信息
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static boolean EvaluationOfInternalCodeButton(String DataVersion,String reg_number){
    
	    String sql = "select rownum,a.* from dafy_sales.registers a where a.reg_number=403";
	    
	    try {
		     checkConnection_Oracle(DataVersion);
	         ResultSet rs = sm.executeQuery(sql);
		     System.out.println(sql);
	         boolean moreRecords = rs.next(); // 定位到达第一条记录
	         if (!moreRecords) {
	        	 JOptionPane.showMessageDialog(null, "未查询到数据,请重新输入！");
	         }else {
                 JOptionPane.showMessageDialog(null, "查询成功！");
	         }
	         Vector rows = new Vector();
	         Vector columnHeads = new Vector();
	         ResultSetMetaData rsmd = rs.getMetaData(); // 获得rs结果集中列属性信息
	             for (int i = 1; i <= rsmd.getColumnCount(); ++i)
	                  columnHeads.addElement(rsmd.getColumnName(i)); // 获得列名(将列名存放至向量columnHeads)

	               do {
	                rows.addElement(getNextRow(rs, rsmd));
	               } 
	               while (rs.next()); // 利用循环获得所有记录 
	               tabDemo = new JTable(rows, columnHeads); // 将获得的行列数据信息作为参数重新构造表格视图
	               TableViewInquiryContract1_1600x900(tabDemo);   
	                close(sm,rs);
	      }catch (SQLException e) {
	            e.printStackTrace();
	            System.err.println(e.getClass().getName() + ": " + e.getMessage());
	      }
	 return false;
	}		
	
	//根据手机号,查询信征信授权验证码
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static boolean SMSAuthorizationAuthenticationCodeButton(String DataVersion,String mobile){
    
	    String sql = "select s.code as 验证码,s.* from  dafy_sales.CS_SMS_AUTHORITY s where mobile="+mobile+" order by code";
	    
	    try {
		     checkConnection_Oracle(DataVersion);
	         ResultSet rs = sm.executeQuery(sql);
		     System.out.println(sql);
	         boolean moreRecords = rs.next(); // 定位到达第一条记录
	         if (!moreRecords) {
	        	 JOptionPane.showMessageDialog(null, "未查询到数据,请重新输入！");
	         }else {
                 JOptionPane.showMessageDialog(null, "查询成功！");
	         }
	         Vector rows = new Vector();
	         Vector columnHeads = new Vector();
	         ResultSetMetaData rsmd = rs.getMetaData(); // 获得rs结果集中列属性信息
	             for (int i = 1; i <= rsmd.getColumnCount(); ++i)
	                  columnHeads.addElement(rsmd.getColumnName(i)); // 获得列名(将列名存放至向量columnHeads)

	               do {
	                rows.addElement(getNextRow(rs, rsmd));
	               } 
	               while (rs.next()); // 利用循环获得所有记录 
	               tabDemo = new JTable(rows, columnHeads); // 将获得的行列数据信息作为参数重新构造表格视图
	               TableViewInquiryContract1_1600x900(tabDemo);   
	                close(sm,rs);
	      }catch (SQLException e) {
	            e.printStackTrace();
	            System.err.println(e.getClass().getName() + ": " + e.getMessage());
	      }
	 return false;
	}	
	
	//根据销售ID，查询最新的合同信息
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static boolean CustomerContractButton(String DataVersion,String ID_SA){
    
	    String sql = "select rownum,c.* from dafy_sales.cs_credit c where ID_SA="+ID_SA+" order by APP_DATE DESC";
	    
	    try {
		     checkConnection_Oracle(DataVersion);
	         ResultSet rs = sm.executeQuery(sql);
		     System.out.println(sql);
	         boolean moreRecords = rs.next(); // 定位到达第一条记录
	         if (!moreRecords) {
	        	 JOptionPane.showMessageDialog(null, "未查询到数据,请重新输入！");
	         }else {
                 JOptionPane.showMessageDialog(null, "查询成功！");
	         }
	         Vector rows = new Vector();
	         Vector columnHeads = new Vector();
	         ResultSetMetaData rsmd = rs.getMetaData(); // 获得rs结果集中列属性信息
	             for (int i = 1; i <= rsmd.getColumnCount(); ++i)
	                  columnHeads.addElement(rsmd.getColumnName(i)); // 获得列名(将列名存放至向量columnHeads)

	               do {
	                rows.addElement(getNextRow(rs, rsmd));
	               } 
	               while (rs.next()); // 利用循环获得所有记录 
	               tabDemo = new JTable(rows, columnHeads); // 将获得的行列数据信息作为参数重新构造表格视图
	               TableViewInquiryContract1_1600x900(tabDemo);   
	                close(sm,rs);
	      }catch (SQLException e) {
	            e.printStackTrace();
	            System.err.println(e.getClass().getName() + ": " + e.getMessage());
	      }
	 return false;
	}	
	
	//根据产品代码，计算该产品每期还款费用
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static boolean RepaymentsForEachPeriodFeeButton(String DataVersion,String LoanPrincipal,String InsuranceFee,String TreasureBoxFee,String ComprehensiveInsuranceFee, String ProductVersionCode){
	    
		String sql = "select ROUND("+LoanPrincipal+"*p.MONTH_RATIO_EIR/100+"+InsuranceFee+"+"+TreasureBoxFee+"+"+ComprehensiveInsuranceFee+") as 每期还款 from dafy_sales.product p where PROD_CODE ='"+ProductVersionCode+"'";
		    
		    try {
			     checkConnection_Oracle(DataVersion);
		         ResultSet rs = sm.executeQuery(sql);
			     System.out.println(sql);
		         boolean moreRecords = rs.next(); // 定位到达第一条记录
		         if (!moreRecords) {
		        	 JOptionPane.showMessageDialog(null, "未计算出数据,请重新输入！");
		         }else {
	                 JOptionPane.showMessageDialog(null, "计算成功！");
		         }
		         Vector rows = new Vector();
		         Vector columnHeads = new Vector();
		         ResultSetMetaData rsmd = rs.getMetaData(); // 获得rs结果集中列属性信息
		             for (int i = 1; i <= rsmd.getColumnCount(); ++i)
		                  columnHeads.addElement(rsmd.getColumnName(i)); // 获得列名(将列名存放至向量columnHeads)

		               do {
		                rows.addElement(getNextRow(rs, rsmd));
		               } 
		               while (rs.next()); // 利用循环获得所有记录 
		               tabDemo = new JTable(rows, columnHeads); // 将获得的行列数据信息作为参数重新构造表格视图
		               TableViewInquiryContract1_1600x900(tabDemo);   
		                close(sm,rs);
		      }catch (SQLException e) {
		            e.printStackTrace();
		            System.err.println(e.getClass().getName() + ": " + e.getMessage());
		    }
	return false;
	}	
	
	//根据产品代码，计算该产品每月还款额费用
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static boolean MonthlyReturnFeeButton(String DataVersion,String LoanPrincipal, String ProductVersionCode){
	    
		String sql = "select ROUND("+LoanPrincipal+"*p.MONTH_RATIO_EIR/100) as 每月还款额 from dafy_sales.product p where PROD_CODE ='"+ProductVersionCode+"'";
		    
		    try {
			     checkConnection_Oracle(DataVersion);
		         ResultSet rs = sm.executeQuery(sql);
			     System.out.println(sql);
		         boolean moreRecords = rs.next(); // 定位到达第一条记录
		         if (!moreRecords) {
		        	 JOptionPane.showMessageDialog(null, "未计算出数据,请重新输入！");
		         }else {
	                 JOptionPane.showMessageDialog(null, "计算成功！");
		         }
		         Vector rows = new Vector();
		         Vector columnHeads = new Vector();
		         ResultSetMetaData rsmd = rs.getMetaData(); // 获得rs结果集中列属性信息
		             for (int i = 1; i <= rsmd.getColumnCount(); ++i)
		                  columnHeads.addElement(rsmd.getColumnName(i)); // 获得列名(将列名存放至向量columnHeads)

		               do {
		                rows.addElement(getNextRow(rs, rsmd));
		               } 
		               while (rs.next()); // 利用循环获得所有记录 
		               tabDemo = new JTable(rows, columnHeads); // 将获得的行列数据信息作为参数重新构造表格视图
		               TableViewInquiryContract1_1600x900(tabDemo);   
		                close(sm,rs);
		      }catch (SQLException e) {
		            e.printStackTrace();
		            System.err.println(e.getClass().getName() + ": " + e.getMessage());
		    }
	return false;
	}	
	
	//根据合同号，查询该合同的每月应还本息费用
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static boolean MonthlyWeShouldAlsoPrincipalFeeButton(String DataVersion,String ContractNumber){
    
	    String sql = "select(ROUND((f.credit_amount*(p.month_ir/100)*power(1+(p.month_ir/100),0))/(power(1+(p.month_ir/100),p.payment_num)-1),3))+(ROUND((f.credit_amount*(p.month_ir/100)*power(1+(p.month_ir/100),p.payment_num))/(power(1+(p.month_ir/100),p.payment_num)-1)-(f.credit_amount*(p.month_ir/100)*power(1+(p.month_ir/100),0))/(power(1+(p.month_ir/100),p.payment_num)-1),3)) as 每月应还本息 "
	    		+ "from dafy_sales.cs_credit c "
	    		+ "inner join dafy_sales.product p on p.ID = c.id_product "
	    		+ "inner join dafy_sales.cs_credit_fee f on c.id=f.id_credit "
	    		+ "inner join dafy_sales.cs_experience e on c.id=e.id_credit "
	    		+ "where c.CONTRACT_NO="+ContractNumber+"";
	    
	    try {
		     checkConnection_Oracle(DataVersion);
	         ResultSet rs = sm.executeQuery(sql);
		     System.out.println(sql);
	         boolean moreRecords = rs.next(); // 定位到达第一条记录
	         if (!moreRecords) {
	        	 JOptionPane.showMessageDialog(null, "未查询到数据,请重新输入！");
	         }else {
                 JOptionPane.showMessageDialog(null, "查询成功！");
	         }
	         Vector rows = new Vector();
	         Vector columnHeads = new Vector();
	         ResultSetMetaData rsmd = rs.getMetaData(); // 获得rs结果集中列属性信息
	             for (int i = 1; i <= rsmd.getColumnCount(); ++i)
	                  columnHeads.addElement(rsmd.getColumnName(i)); // 获得列名(将列名存放至向量columnHeads)

	               do {
	                rows.addElement(getNextRow(rs, rsmd));
	               } 
	               while (rs.next()); // 利用循环获得所有记录 
	               tabDemo = new JTable(rows, columnHeads); // 将获得的行列数据信息作为参数重新构造表格视图
	               TableViewInquiryContract1_1600x900(tabDemo);   
	                close(sm,rs);
	      }catch (SQLException e) {
	            e.printStackTrace();
	            System.err.println(e.getClass().getName() + ": " + e.getMessage());
	      }
	 return false;
	}		
	
	//根据合同号，查询该合同的每月应付费用
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static boolean MonthlyPayableFeeButton(String DataVersion,String ContractNumber){
    
	    String sql = "select(round((f.credit_amount*p.month_ratio_eir)/100,0))-((ROUND((f.credit_amount*(p.month_ir/100)*power(1+(p.month_ir/100),0))/(power(1+(p.month_ir/100),p.payment_num)-1),3))+(ROUND((f.credit_amount*(p.month_ir/100)*power(1+(p.month_ir/100),p.payment_num))/(power(1+(p.month_ir/100),p.payment_num)-1)-(f.credit_amount*(p.month_ir/100)*power(1+(p.month_ir/100),0))/(power(1+(p.month_ir/100),p.payment_num)-1),3))) as 每月应付费用 "
	    		+ "from dafy_sales.cs_credit c "
	    		+ "inner join dafy_sales.product p on p.ID = c.id_product "
	    		+ "inner join dafy_sales.cs_credit_fee f on c.id=f.id_credit "
	    		+ "inner join dafy_sales.cs_experience e on c.id=e.id_credit "
	    		+ "where c.CONTRACT_NO="+ContractNumber+"";
	    
	    try {
		     checkConnection_Oracle(DataVersion);
	         ResultSet rs = sm.executeQuery(sql);
		     System.out.println(sql);
	         boolean moreRecords = rs.next(); // 定位到达第一条记录
	         if (!moreRecords) {
	        	 JOptionPane.showMessageDialog(null, "未查询到数据,请重新输入！");
	         }else {
                 JOptionPane.showMessageDialog(null, "查询成功！");
	         }
	         Vector rows = new Vector();
	         Vector columnHeads = new Vector();
	         ResultSetMetaData rsmd = rs.getMetaData(); // 获得rs结果集中列属性信息
	             for (int i = 1; i <= rsmd.getColumnCount(); ++i)
	                  columnHeads.addElement(rsmd.getColumnName(i)); // 获得列名(将列名存放至向量columnHeads)

	               do {
	                rows.addElement(getNextRow(rs, rsmd));
	               } 
	               while (rs.next()); // 利用循环获得所有记录 
	               tabDemo = new JTable(rows, columnHeads); // 将获得的行列数据信息作为参数重新构造表格视图
	               TableViewInquiryContract1_1600x900(tabDemo);   
	                close(sm,rs);
	      }catch (SQLException e) {
	            e.printStackTrace();
	            System.err.println(e.getClass().getName() + ": " + e.getMessage());
	      }
	 return false;
	}	
	
	//根据合同号，查询该合同的月咨询费及月咨询费率
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static boolean MonthlyConsultingFeeAndRateButton(String DataVersion,String ContractNumber){
    
	    String sql = "select p.account_fee as P月咨询费率,f.account_fee_rate as F月咨询费用率,f.account_fee as F月咨询费,round((f.credit_amount*f.account_fee_rate/100),3) as S月咨询费 "
	    		+ "from dafy_sales.cs_credit c "
	    		+ "inner join dafy_sales.product p on p.ID = c.id_product "
	    		+ "inner join dafy_sales.cs_credit_fee f on c.id=f.id_credit "
	    		+ "inner join dafy_sales.cs_experience e on c.id=e.id_credit "
	    		+ "where c.CONTRACT_NO="+ContractNumber+"";
	    
	    try {
		     checkConnection_Oracle(DataVersion);
	         ResultSet rs = sm.executeQuery(sql);
		     System.out.println(sql);
	         boolean moreRecords = rs.next(); // 定位到达第一条记录
	         if (!moreRecords) {
	        	 JOptionPane.showMessageDialog(null, "未查询到数据,请重新输入！");
	         }else {
                 JOptionPane.showMessageDialog(null, "查询成功！");
	         }
	         Vector rows = new Vector();
	         Vector columnHeads = new Vector();
	         ResultSetMetaData rsmd = rs.getMetaData(); // 获得rs结果集中列属性信息
	             for (int i = 1; i <= rsmd.getColumnCount(); ++i)
	                  columnHeads.addElement(rsmd.getColumnName(i)); // 获得列名(将列名存放至向量columnHeads)

	               do {
	                rows.addElement(getNextRow(rs, rsmd));
	               } 
	               while (rs.next()); // 利用循环获得所有记录 
	               tabDemo = new JTable(rows, columnHeads); // 将获得的行列数据信息作为参数重新构造表格视图
	               TableViewInquiryContract1_1600x900(tabDemo);   
	                close(sm,rs);
	      }catch (SQLException e) {
	            e.printStackTrace();
	            System.err.println(e.getClass().getName() + ": " + e.getMessage());
	      }
	 return false;
	}	
	
	//根据合同号，查询该合同的月服务费及月服务费率
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static boolean MonthlyServiceFeeAndRateButton(String DataVersion,String ContractNumber){
    
	    String sql = "select f.cs_fee_rate as F月服务费率,f.cs_fee as F月服务费,round(((f.annuity - f.principal - f.interest - f.account_fee) / f.credit_amount * 100),3)  as s月服务费率,(f.annuity - f.principal - f.interest - f.account_fee) as S月服务费 "
	    		+ "from dafy_sales.cs_credit c "
	    		+ "inner join dafy_sales.product p on p.ID = c.id_product "
	    		+ "inner join dafy_sales.cs_credit_fee f on c.id=f.id_credit "
	    		+ "inner join dafy_sales.cs_experience e on c.id=e.id_credit "
	    		+ "where c.CONTRACT_NO="+ContractNumber+"";
	    
	    try {
		     checkConnection_Oracle(DataVersion);
	         ResultSet rs = sm.executeQuery(sql);
		     System.out.println(sql);
	         boolean moreRecords = rs.next(); // 定位到达第一条记录
	         if (!moreRecords) {
	        	 JOptionPane.showMessageDialog(null, "未查询到数据,请重新输入！");
	         }else {
                 JOptionPane.showMessageDialog(null, "查询成功！");
	         }
	         Vector rows = new Vector();
	         Vector columnHeads = new Vector();
	         ResultSetMetaData rsmd = rs.getMetaData(); // 获得rs结果集中列属性信息
	             for (int i = 1; i <= rsmd.getColumnCount(); ++i)
	                  columnHeads.addElement(rsmd.getColumnName(i)); // 获得列名(将列名存放至向量columnHeads)

	               do {
	                rows.addElement(getNextRow(rs, rsmd));
	               } 
	               while (rs.next()); // 利用循环获得所有记录 
	               tabDemo = new JTable(rows, columnHeads); // 将获得的行列数据信息作为参数重新构造表格视图
	               TableViewInquiryContract1_1600x900(tabDemo);   
	                close(sm,rs);
	      }catch (SQLException e) {
	            e.printStackTrace();
	            System.err.println(e.getClass().getName() + ": " + e.getMessage());
	      }
	 return false;
	}	
	
	//根据合同号，查询该合同的月贷款利率
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static boolean MonthlyLoanInterestRateButton(String DataVersion,String ContractNumber){
    
	    String sql = "select f.month_ir as F月贷款利率,p.month_ir as P月贷款利率 "
	    		+ "from dafy_sales.cs_credit c "
	    		+ "inner join dafy_sales.product p on p.ID = c.id_product "
	    		+ "inner join dafy_sales.cs_credit_fee f on c.id=f.id_credit "
	    		+ "inner join dafy_sales.cs_experience e on c.id=e.id_credit "
	    		+ "where c.CONTRACT_NO="+ContractNumber+"";
	    
	    try {
		     checkConnection_Oracle(DataVersion);
	         ResultSet rs = sm.executeQuery(sql);
		     System.out.println(sql);
	         boolean moreRecords = rs.next(); // 定位到达第一条记录
	         if (!moreRecords) {
	        	 JOptionPane.showMessageDialog(null, "未查询到数据,请重新输入！");
	         }else {
                 JOptionPane.showMessageDialog(null, "查询成功！");
	         }
	         Vector rows = new Vector();
	         Vector columnHeads = new Vector();
	         ResultSetMetaData rsmd = rs.getMetaData(); // 获得rs结果集中列属性信息
	             for (int i = 1; i <= rsmd.getColumnCount(); ++i)
	                  columnHeads.addElement(rsmd.getColumnName(i)); // 获得列名(将列名存放至向量columnHeads)

	               do {
	                rows.addElement(getNextRow(rs, rsmd));
	               } 
	               while (rs.next()); // 利用循环获得所有记录 
	               tabDemo = new JTable(rows, columnHeads); // 将获得的行列数据信息作为参数重新构造表格视图
	               TableViewInquiryContract1_1600x900(tabDemo);   
	                close(sm,rs);
	      }catch (SQLException e) {
	            e.printStackTrace();
	            System.err.println(e.getClass().getName() + ": " + e.getMessage());
	      }
	 return false;
	}	
	
	//根据合同号和状态标识，修改对合同状态
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static boolean ContractStateUpdateButton(String DataVersion,String ContractNumber,String ContractState){
    
		int rs1 = 0;
	    String sql = "update dafy_sales.cs_credit set status='"+ContractState+"' where contract_no ="+ContractNumber+"";
	    String sql1 = "select * from dafy_sales.cs_credit where contract_no ="+ContractNumber+"";
	    
	    try {
		     checkConnection_Oracle(DataVersion);
	         rs1 = sm.executeUpdate(sql);
	         JOptionPane.showMessageDialog(null, "修改成功,共:["+ rs1 +"]条数据发生变化！");
	         ResultSet rs = sm.executeQuery(sql1);
		     System.out.println(sql);
	         boolean moreRecords = rs.next(); // 定位到达第一条记录
	         if (!moreRecords) {
	        	 JOptionPane.showMessageDialog(null, "未查询到数据,请重新输入！");
	         }else {
                 JOptionPane.showMessageDialog(null, "请查看修改结果！");
	         }
	         Vector rows = new Vector();
	         Vector columnHeads = new Vector();
	         ResultSetMetaData rsmd = rs.getMetaData(); // 获得rs结果集中列属性信息
	             for (int i = 1; i <= rsmd.getColumnCount(); ++i)
	                  columnHeads.addElement(rsmd.getColumnName(i)); // 获得列名(将列名存放至向量columnHeads)

	               do {
	                rows.addElement(getNextRow(rs, rsmd));
	               } 
	               while (rs.next()); // 利用循环获得所有记录 
	               tabDemo = new JTable(rows, columnHeads); // 将获得的行列数据信息作为参数重新构造表格视图
	               TableViewInquiryContract1_1600x900(tabDemo);   
	                close(sm,rs);
	      }catch (SQLException e) {
	    	  JOptionPane.showMessageDialog(null, "修改失败,请检查合同状态！");
	            e.printStackTrace();
	            System.err.println(e.getClass().getName() + ": " + e.getMessage());
	      }
	 return false;
	}	
	
	//根据用户名称获取ID_PERSON
	public static String GetValue(String DataVersion,String Userame){
              
		String Value ="";
	    String sql = "select ID from dafy_sales.cs_person where name ='"+Userame+"'";
	    
	    try {
		     checkConnection_Oracle(DataVersion);
		     ResultSet rs = sm.executeQuery(sql);
	         if(rs.next()){
	        	 Value = rs.getString(1);
	         }    
		     System.out.println("ID_PERSON: "+Value);
	         close(sm,rs);
	      }catch (SQLException e) {
	            e.printStackTrace();
	      }
	 return Value;
	}
	
	//根据用户ID_PERSON修改合同状态为取消
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static boolean UpdateContractStateButton(String DataVersion,String ID_PERSON){
    
		int rs1 = 0;
	    String sql = "update dafy_sales.cs_credit set status='t' where ID_PERSON ="+ID_PERSON+"";
	    String sql1 = "select * from dafy_sales.cs_credit where ID_PERSON ="+ID_PERSON+"";
	    
	    try {
		     checkConnection_Oracle(DataVersion);
	         rs1 = sm.executeUpdate(sql);
	         JOptionPane.showMessageDialog(null, "取消该用户所有合同成功,共:["+ rs1 +"]条数据发生变化！");
		     System.out.println(sql);
	         ResultSet rs = sm.executeQuery(sql1);
		     System.out.println(sql1);
	         boolean moreRecords = rs.next(); // 定位到达第一条记录
	         if (!moreRecords) {
	        	 JOptionPane.showMessageDialog(null, "未查询到数据,请重新输入！");
	         }else {
                 JOptionPane.showMessageDialog(null, "请查看修改结果！");
	         }
	         Vector rows = new Vector();
	         Vector columnHeads = new Vector();
	         ResultSetMetaData rsmd = rs.getMetaData(); // 获得rs结果集中列属性信息
	             for (int i = 1; i <= rsmd.getColumnCount(); ++i)
	                  columnHeads.addElement(rsmd.getColumnName(i)); // 获得列名(将列名存放至向量columnHeads)

	               do {
	                rows.addElement(getNextRow(rs, rsmd));
	               } 
	               while (rs.next()); // 利用循环获得所有记录 
	               tabDemo = new JTable(rows, columnHeads); // 将获得的行列数据信息作为参数重新构造表格视图
	               TableViewOneTouchCredit1_1600x900(tabDemo);   
	                close(sm,rs);
	      }catch (SQLException e) {
//	    	  JOptionPane.showMessageDialog(null, "修改失败,请检查用户是否存在！");
//	            e.printStackTrace();
//	            System.err.println(e.getClass().getName() + ": " + e.getMessage());
	      }
	 return false;
	}
	
	//根据手机号,查询短信签章验证码
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static boolean ShortMessageSignatureCodeButton(String DataVersion,String mobile){
    
	    String sql = "select s.MSG_CODE as 验证码,s.* from dafy_sales.sign_sms_result s where mobile='"+mobile+"' order by send_time desc";
	    
	    try {
		     checkConnection_Oracle(DataVersion);
	         ResultSet rs = sm.executeQuery(sql);
		     System.out.println(sql);
	         boolean moreRecords = rs.next(); // 定位到达第一条记录
	         if (!moreRecords) {
	        	 JOptionPane.showMessageDialog(null, "未查询到数据,请重新输入！");
	         }else {
                 JOptionPane.showMessageDialog(null, "查询成功！");
	         }
	         Vector rows = new Vector();
	         Vector columnHeads = new Vector();
	         ResultSetMetaData rsmd = rs.getMetaData(); // 获得rs结果集中列属性信息
	             for (int i = 1; i <= rsmd.getColumnCount(); ++i)
	                  columnHeads.addElement(rsmd.getColumnName(i)); // 获得列名(将列名存放至向量columnHeads)

	               do {
	                rows.addElement(getNextRow(rs, rsmd));
	               } 
	               while (rs.next()); // 利用循环获得所有记录 
	               tabDemo = new JTable(rows, columnHeads); // 将获得的行列数据信息作为参数重新构造表格视图
	               TableViewInquiryContract1_1600x900(tabDemo);   
	                close(sm,rs);
	      }catch (SQLException e) {
	            e.printStackTrace();
	            System.err.println(e.getClass().getName() + ": " + e.getMessage());
	      }
	 return false;
	}	
	
	//根据合同号，查询生成的PDF信息
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static boolean PDFSigningContractButton(String DataVersion,String ContractNumber){
    
	    String sql = "select * from dafy_Sales.signature_record where CONTRACT_NO ="+ContractNumber+"";
	    
	    try {
		     checkConnection_Oracle(DataVersion);
	         ResultSet rs = sm.executeQuery(sql);
		     System.out.println(sql);
	         boolean moreRecords = rs.next(); // 定位到达第一条记录
	         if (!moreRecords) {
	        	 JOptionPane.showMessageDialog(null, "未查询到数据,请重新输入！");
	         }else {
                 JOptionPane.showMessageDialog(null, "查询成功！");
	         }
	         Vector rows = new Vector();
	         Vector columnHeads = new Vector();
	         ResultSetMetaData rsmd = rs.getMetaData(); // 获得rs结果集中列属性信息
	             for (int i = 1; i <= rsmd.getColumnCount(); ++i)
	                  columnHeads.addElement(rsmd.getColumnName(i)); // 获得列名(将列名存放至向量columnHeads)

	               do {
	                rows.addElement(getNextRow(rs, rsmd));
	               } 
	               while (rs.next()); // 利用循环获得所有记录 
	               tabDemo = new JTable(rows, columnHeads); // 将获得的行列数据信息作为参数重新构造表格视图
	               TableViewInquiryContract1_1600x900(tabDemo);  
	               close(sm,rs);          
	      }catch (SQLException e) {
	            e.printStackTrace();
	            System.err.println(e.getClass().getName() + ": " + e.getMessage());
	      }
	 return false;
	}	
	
	//根据合同号，删除签章生成的PDF信息
	public static boolean SignatureRecordDeleteButton(String DataVersion,String ContractID,String ContractNumber) throws SQLException{
    
	    String sql1 = "delete from dafy_sales.Cs_Photo_Verify where id_credit="+ContractID+"";		
	    String sql2 = "delete from dafy_sales.sign_sms_result where contract_no="+ContractNumber+"";
	    String sql3 = "delete from dafy_sales.signature_record where contract_no ="+ContractNumber+"";
	    
	    try {
		     checkConnection_Oracle(DataVersion);
		     sm.addBatch(sql1);
		     sm.addBatch(sql2);
		     sm.addBatch(sql3);
		     sm.executeBatch();
	         JOptionPane.showMessageDialog(null, "删除成功,共:[3]条数据发生变化！");
	      }catch (SQLException e) {
	    	 JOptionPane.showMessageDialog(null, "删除失败,请检查签章状态！");
	    	 con.rollback();
	         e.printStackTrace();
	         System.err.println(e.getClass().getName() + ": " + e.getMessage());
	      }
	 return false;
	}	
	
	//根据存储过程名称，合同号，执行线下消费贷还款激活表存储过程，生成还款计划表
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static boolean StoredProcedureExecutionButton(String DataVersion,String StoredProcedureName,String ContractNumber,String ContractID){
		
	    String sql1 = "update dafy_sales.cs_credit set status='y' where contract_no ="+ContractNumber+"";
	    String sql2 = "{call "+StoredProcedureName+"("+ContractNumber+",?)}";
	    String sql3 = "select * from dafy_Sales.instalment where id_credit="+ContractID+"";
	    
	    try {
		     checkConnection_Oracle(DataVersion);
	         sm.executeUpdate(sql1);
		     cs = con.prepareCall(sql2);
		     cs.setString(1, null);
	         cs.execute();
	         JOptionPane.showMessageDialog(null, "存储过程执行成功！");
	         ResultSet rs = sm.executeQuery(sql3);
		     System.out.println(sql3);
	         boolean moreRecords = rs.next(); // 定位到达第一条记录
	         if (!moreRecords) {
	        	 JOptionPane.showMessageDialog(null, "未查询到数据,请重新输入！");
	         }else {
                 JOptionPane.showMessageDialog(null, "请查看生成的结果！");
	         }
	         Vector rows = new Vector();
	         Vector columnHeads = new Vector();
	         ResultSetMetaData rsmd = rs.getMetaData(); // 获得rs结果集中列属性信息
	             for (int i = 1; i <= rsmd.getColumnCount(); ++i)
	                  columnHeads.addElement(rsmd.getColumnName(i)); // 获得列名(将列名存放至向量columnHeads)

	               do {
	                rows.addElement(getNextRow(rs, rsmd));
	               } 
	               while (rs.next()); // 利用循环获得所有记录 
	               tabDemo = new JTable(rows, columnHeads); // 将获得的行列数据信息作为参数重新构造表格视图
	               TableViewInquiryContract1_1600x900(tabDemo);   
	                close(sm,rs);
	      }catch (SQLException e) {
	    	  JOptionPane.showMessageDialog(null, "修改失败,请检查合同状态！");
	            e.printStackTrace();
	            System.err.println(e.getClass().getName() + ": " + e.getMessage());
	      }
	 return false;
	}	
	
	//根据合同ID，查询对应合同的还款信息
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static boolean ReimbursementPlanQueryButton(String DataVersion,String ContractID){
    
		String sql = "select * from dafy_Sales.instalment where id_credit="+ContractID+"";
	    
	    try {
		     checkConnection_Oracle(DataVersion);
	         ResultSet rs = sm.executeQuery(sql);
		     System.out.println(sql);
	         boolean moreRecords = rs.next(); // 定位到达第一条记录
	         if (!moreRecords) {
	        	 JOptionPane.showMessageDialog(null, "未查询到数据,请重新输入！");
	         }else {
                 JOptionPane.showMessageDialog(null, "查询成功！");
	         }
	         Vector rows = new Vector();
	         Vector columnHeads = new Vector();
	         ResultSetMetaData rsmd = rs.getMetaData(); // 获得rs结果集中列属性信息
	             for (int i = 1; i <= rsmd.getColumnCount(); ++i)
	                  columnHeads.addElement(rsmd.getColumnName(i)); // 获得列名(将列名存放至向量columnHeads)

	               do {
	                rows.addElement(getNextRow(rs, rsmd));
	               } 
	               while (rs.next()); // 利用循环获得所有记录 
	               tabDemo = new JTable(rows, columnHeads); // 将获得的行列数据信息作为参数重新构造表格视图
	               TableViewInquiryContract1_1600x900(tabDemo);   
	                close(sm,rs);
	      }catch (SQLException e) {
	            e.printStackTrace();
	            System.err.println(e.getClass().getName() + ": " + e.getMessage());
	      }
	 return false;
	}	
	
	//根据合同ID，删除对应合同的还款信息
	public static boolean ReimbursementPlanDeleteButton(String DataVersion,String ContractID) throws SQLException{
    
		int i = 0;
		String sql = "delete from dafy_sales.instalment where id_credit="+ContractID+"";
		
	    try {
		     checkConnection_Oracle(DataVersion);
		     i = sm.executeUpdate(sql);
		     JOptionPane.showMessageDialog(null, "删除成功,共:["+ i +"]条数据发生变化！"); 
	         close(sm,rs);
	      }catch (SQLException e) {
	    	    JOptionPane.showMessageDialog(null, "删除失败,请检查合同状态！");
		    	con.rollback();
	            e.printStackTrace();
	            System.err.println(e.getClass().getName() + ": " + e.getMessage());
	      }
	 return false;
	}	
	
	//根据合同ID，查询该合同的所有费用信息
	public static boolean InquiryContractExpensesButton(String DataVersion,String contract_no){
		
		String sql = "select c.contract_no as 合同号,c.credit_model as 合同资金模式,f.credit_amount as f贷款金额,c.credit_amount as c贷款金额,g.goods_credit_amount as g贷款金额,c.init_pay c首付,g.goods_init_pay as g首付,c.price as c商品价格,g.goods_price as g商品价格,(c.credit_amount+c.init_pay) as s商品价格,c.deduct_date as c首次扣款日,e.fst_date_pay as e首次扣款日,(round((f.credit_amount*p.month_ratio_eir)/100,0))+(f.insurance_fee)+(f.power_fee)+(f.treasure_box_fee) as s每月总还款额,i.type_instalment as i本金1,i.value_instalment as i本金费用,f.principal as f第一期本金,ROUND((f.credit_amount*(p.month_ir/100)*power(1+(p.month_ir/100),0))/(power(1+(p.month_ir/100),p.payment_num)-1),3) as s第一期本金,i.type_instalment as i利息2,i.value_instalment as i利息费用,f.interest as f第一期利息,ROUND((f.credit_amount*(p.month_ir/100)*power(1+(p.month_ir/100),p.payment_num))/(power(1+(p.month_ir/100),p.payment_num)-1)-(f.credit_amount*(p.month_ir/100)*power(1+(p.month_ir/100),0))/(power(1+(p.month_ir/100),p.payment_num)-1),4) as s第一期利息,(ROUND((f.credit_amount*(p.month_ir/100)*power(1+(p.month_ir/100),0))/(power(1+(p.month_ir/100),p.payment_num)-1),3))+(ROUND((f.credit_amount*(p.month_ir/100)*power(1+(p.month_ir/100),p.payment_num))/(power(1+(p.month_ir/100),p.payment_num)-1)-(f.credit_amount*(p.month_ir/100)*power(1+(p.month_ir/100),0))/(power(1+(p.month_ir/100),p.payment_num)-1),3))as s每月应还本息,(round((f.credit_amount*p.month_ratio_eir)/100,0))-((ROUND((f.credit_amount*(p.month_ir/100)*power(1+(p.month_ir/100),0))/(power(1+(p.month_ir/100),p.payment_num)-1),3))+(ROUND((f.credit_amount*(p.month_ir/100)*power(1+(p.month_ir/100),p.payment_num))/(power(1+(p.month_ir/100),p.payment_num)-1)-(f.credit_amount*(p.month_ir/100)*power(1+(p.month_ir/100),0))/(power(1+(p.month_ir/100),p.payment_num)-1),3))) as s每月应付费用,f.cs_fee as f月服务费,(f.annuity - f.principal - f.interest - f.account_fee) as s月服务费,f.cs_fee_rate as f月服务费率,round(((f.annuity - f.principal - f.interest - f.account_fee) / f.credit_amount * 100),3) as s月服务费率,c.repay_style as c还款方式,f.annuity as f纯月还款额,c.annuity as c纯月还款额,round((f.credit_amount*p.month_ratio_eir)/100,0) as s纯月还款额,c.power_flag as c权益包购买状态,f.power_fee as f权益包费用,c.power_fee as c权益包费用,e.is_ssi as e是否购买保险,g.insurance_supplier as 保险类型,i.type_instalment as i保险70,i.value_instalment as i保险费,f.insurance_fee as f保险费,c.insurance_fee as c保险费,e.insurance_fee as e保险费,FLOOR(f.credit_amount*0.008) as s保险费,f.discount_amount as f每月优惠金额,round((f.credit_amount*p.month_ratio_bir)/100)-round((f.credit_amount*p.month_ratio_eir)/100) s每月优惠金额,f.lead_amount as f前置咨询费,f.month_ir as f月贷款利率,p.month_ir as p月贷款利率,f.account_fee_rate as f月咨询费用率,p.account_fee as p月咨询费率,f.coupon_amount as f买立减优惠金额,e.coupon_amount as e买立减优惠金额,round(f.credit_amount*p.overpay_year*(1-0.9)/12/100,0) as s买立减优惠金额,f.credit_type as f合同类别,f.account_fee as f月咨询费,round((f.credit_amount*f.account_fee_rate/100),3) as s月咨询费,f.seller_service_fee as f前置商家服务费,(f.credit_amount*p.seller_bonus) as s前置商家服务费,f.customer_service_fee as f前置客户服务费,f.interest_coupon as f每期利息减免,f.finance_coupon as f每期财务费减免,f.stamp_amount as f印花税,(f.credit_amount*0.00005) as s印花税,f.seller_return_fee as f商家返点费用,(f.credit_amount * p.seller_bonus / 100) as s商家返点费用,f.sa_bonus_fee as f销售提成费用,(f.credit_amount * p.sa_bonus / 100) as s销售提成费用,f.cs_fee2 as f月咨询费用2,f.cs_fee_rate2 as f月咨询费率2,f.giveu_month_ir as f即有年化率,p.month_ir as p即有年化率,f.cs_coupon as f每期咨询费减免,f.accident_insurance_fee as f手Q意外保险费用,f.coupon_sales as f抵用券售价,(f.credit_amount*0.1) as s抵用券售价,f.voucher_amount as f抵用券面值,ceil((f.credit_amount*0.1)/100)*100 as s抵用券面值,f.voucher_count as f抵用券数量,(f.voucher_amount/100) as s抵用券数量,i.type_instalment as i百宝箱92,i.value_instalment as i百宝箱费用,g.broken_screen_type as 碎屏零未购买二已购买,g.stag_insurance_type as 碎屏零未购买二已购买,f.broken_screen_service as f碎屏,g.BROKEN_SCREEN_SERVICE as g碎屏,f.stag_insurance_service as f延保,g.STAG_INSURANCE_SERVICE as g延保,y.service_category as 一延保二碎屏,y.goods_category as 零通用一普通二苹果,y.payment_num_price as s碎屏延保费用"
		 		+ " from dafy_sales.cs_credit c inner join dafy_sales.product p on p.ID = c.id_product inner join dafy_sales.cs_credit_fee f on c.id=f.id_credit inner join dafy_sales.cs_experience e on c.id=e.id_credit inner join dafy_sales.cs_goods g on c.id=g.id_credit inner join dafy_sales.product_added_services y on y.payment_num=p.payment_num inner join dafy_sales.instalment i on i.id_credit=c.id "
		 		+ "where c.contract_no="+ contract_no +""
		 		+ "and rownum<=40"
		 		+ "order by i.type_instalment";
		 
		 try {
			  checkConnection_Oracle(DataVersion);
		      ResultSet rs = sm.executeQuery(sql);
		      
		      //计算有多少条记录
		      int count = 0;
		      while(rs.next()){
		      count++;
		      }
		      rs = sm.executeQuery(sql);
		      //将查询获得的记录数据，转换成适合生成JTable的数据形式
		      Object[][] info = new Object[count][92];
		      count = 0;
		      while(rs.next()){
		    	  info[count][0] = rs.getString("合同号");
		    	  info[count][1] = rs.getString("合同资金模式");
		    	  info[count][2] = rs.getString("F贷款金额");
		    	  info[count][3] = rs.getString("C贷款金额");
		    	  info[count][4] = rs.getString("G贷款金额");
		    	  info[count][5] = rs.getString("C首付");
		    	  info[count][6] = rs.getString("G首付");
		    	  info[count][7] = rs.getString("C商品价格");
		    	  info[count][8] = rs.getString("G商品价格");
		    	  info[count][9] = rs.getString("S商品价格");
		    	  info[count][10] = rs.getString("C首次扣款日");
		    	  info[count][11] = rs.getString("E首次扣款日");
		    	  info[count][12] = rs.getString("S每月总还款额");
		    	  info[count][13] = rs.getString("I本金1");
		    	  info[count][14] = rs.getString("I本金费用");
		    	  info[count][15] = rs.getString("F第一期本金");
		    	  info[count][16] = rs.getString("S第一期本金");
		    	  info[count][17] = rs.getString("I利息2");
		    	  info[count][18] = rs.getString("I利息费用");
		    	  info[count][19] = rs.getString("F第一期利息");
		    	  info[count][20] = rs.getString("S第一期利息");
		    	  info[count][21] = rs.getString("S每月应还本息");
		    	  info[count][22] = rs.getString("S每月应付费用");
		    	  info[count][23] = rs.getString("F月服务费");
		    	  info[count][24] = rs.getString("S月服务费");
		    	  info[count][25] = rs.getString("F月服务费率");
		    	  info[count][26] = rs.getString("S月服务费率");
		    	  info[count][27] = rs.getString("C还款方式");
		    	  info[count][28] = rs.getString("F纯月还款额");
		    	  info[count][29] = rs.getString("C纯月还款额");
		    	  info[count][30] = rs.getString("S纯月还款额");
		    	  info[count][31] = rs.getString("C权益包购买状态");
		    	  info[count][32] = rs.getString("F权益包费用");
		    	  info[count][33] = rs.getString("C权益包费用");
		    	  info[count][34] = rs.getString("E是否购买保险");
		    	  info[count][35] = rs.getString("保险类型");
		    	  info[count][36] = rs.getString("I保险70");
		    	  info[count][37] = rs.getString("I保险费");
		    	  info[count][38] = rs.getString("F保险费");
		    	  info[count][39] = rs.getString("C保险费");
		    	  info[count][40] = rs.getString("E保险费");
		    	  info[count][41] = rs.getString("S保险费");
		    	  info[count][42] = rs.getString("F每月优惠金额");
		    	  info[count][43] = rs.getString("S每月优惠金额");
		    	  info[count][44] = rs.getString("F前置咨询费");
		    	  info[count][45] = rs.getString("F月贷款利率");
		    	  info[count][46] = rs.getString("P月贷款利率");
		    	  info[count][47] = rs.getString("F月咨询费用率");
		    	  info[count][48] = rs.getString("P月咨询费率");
		    	  info[count][49] = rs.getString("F买立减优惠金额");
		    	  info[count][50] = rs.getString("E买立减优惠金额");
		    	  info[count][51] = rs.getString("S买立减优惠金额");
		    	  info[count][52] = rs.getString("F合同类别");
		    	  info[count][53] = rs.getString("F月咨询费");
		    	  info[count][54] = rs.getString("S月咨询费");
		    	  info[count][55] = rs.getString("F前置商家服务费");
		    	  info[count][56] = rs.getString("S前置商家服务费");
		    	  info[count][57] = rs.getString("F前置客户服务费");
		    	  info[count][58] = rs.getString("F每期利息减免");
		    	  info[count][59] = rs.getString("F每期财务费减免");
		    	  info[count][60] = rs.getString("F印花税");
		    	  info[count][61] = rs.getString("S印花税");
		    	  info[count][62] = rs.getString("F商家返点费用");
		    	  info[count][63] = rs.getString("S商家返点费用");
		    	  info[count][64] = rs.getString("F销售提成费用");
		    	  info[count][65] = rs.getString("S销售提成费用");
		    	  info[count][66] = rs.getString("F月咨询费用2");
		    	  info[count][67] = rs.getString("F月咨询费率2");
		    	  info[count][68] = rs.getString("F即有年化率");
		    	  info[count][69] = rs.getString("P即有年化率");
		    	  info[count][70] = rs.getString("F每期咨询费减免");
		    	  info[count][71] = rs.getString("F手Q意外保险费用");
		    	  info[count][72] = rs.getString("F抵用券售价");
		    	  info[count][73] = rs.getString("S抵用券售价");
		    	  info[count][74] = rs.getString("F抵用券面值");
		    	  info[count][75] = rs.getString("S抵用券面值");
		    	  info[count][76] = rs.getString("F抵用券数量");
		    	  info[count][77] = rs.getString("S抵用券数量");
		    	  info[count][78] = rs.getString("I百宝箱92");
		    	  info[count][79] = rs.getString("I百宝箱费用");
//		    	  info[count][80] = rs.getString("F百宝箱费用");
//		    	  info[count][81] = rs.getString("S百宝箱费用");
//		    	  info[count][82] = rs.getString("F百宝箱是否购买");
		    	  info[count][83] = rs.getString("碎屏零未购买二已购买");
		    	  info[count][84] = rs.getString("碎屏零未购买二已购买");
		    	  info[count][85] = rs.getString("F碎屏");
		    	  info[count][86] = rs.getString("G碎屏");
		    	  info[count][87] = rs.getString("F延保");
		    	  info[count][88] = rs.getString("G延保");
		    	  info[count][89] = rs.getString("一延保二碎屏");
		    	  info[count][90] = rs.getString("零通用一普通二苹果");
		    	  info[count][91] = rs.getString("S碎屏延保费用");

		       count++;
		       }
		
		       //定义表头
		       String[] title = {
		    		   "合同号",
		    		   "合同资金模式",
		    		   "F贷款金额",
		    		   "C贷款金额",
		    		   "G贷款金额",
		    		   "C首付",
		    		   "G首付",
		    		   "C商品价格",
		    		   "G商品价格",
		    		   "S商品价格",
		    		   "C首次扣款日",
		    		   "E首次扣款日",
		    		   "S每月总还款额",
		    		   "I本金1",
		    		   "I本金费用",
		    		   "F第一期本金",
		    		   "S第一期本金",
		    		   "I利息2",
		    		   "I利息费用",
		    		   "F第一期利息",
		    		   "S第一期利息",
		    		   "S每月应还本息",
		    		   "S每月应付费用",
		    		   "F月服务费",
		    		   "S月服务费",
		    		   "F月服务费率",
		    		   "S月服务费率",
		    		   "C还款方式",
		    		   "F纯月还款额",
		    		   "C纯月还款额",
		    		   "S纯月还款额",
		    		   "C权益包购买状态",
		    		   "F权益包费用",
		    		   "C权益包费用",
		    		   "E是否购买保险",
		    		   "保险类型",
		    		   "I保险70",
		    		   "I保险费",
		    		   "F保险费",
		    		   "C保险费",
		    		   "E保险费",
		    		   "S保险费",
		    		   "F每月优惠金额",
		    		   "S每月优惠金额",
		    		   "F前置咨询费",
		    		   "F月贷款利率",
		    		   "P月贷款利率",
		    		   "F月咨询费用率",
		    		   "P月咨询费率",
		    		   "F买立减优惠金额",
		    		   "E买立减优惠金额",
		    		   "S买立减优惠金额",
		    		   "F合同类别",
		    		   "F月咨询费",
		    		   "S月咨询费",
		    		   "F前置商家服务费",
		    		   "S前置商家服务费",
		    		   "F前置客户服务费",
		    		   "F每期利息减免",
		    		   "F每期财务费减免",
		    		   "F印花税",
		    		   "S印花税",
		    		   "F商家返点费用",
		    		   "S商家返点费用",
		    		   "F销售提成费用",
		    		   "S销售提成费用",
		    		   "F月咨询费用2",
		    		   "F月咨询费率2",
		    		   "F即有年化率",
		    		   "P即有年化率",
		    		   "F每期咨询费减免",
		    		   "F手Q意外保险费用",
		    		   "F抵用券售价",
		    		   "S抵用券售价",
		    		   "F抵用券面值",
		    		   "S抵用券面值",
		    		   "F抵用券数量",
		    		   "S抵用券数量",
		    		   "I百宝箱92",
		    		   "I百宝箱费用",
		    		   "F百宝箱费用",
		    		   "S百宝箱费用",
		    		   "F百宝箱是否购买",
		    		   "碎屏零未购买二已购买",
		    		   "碎屏零未购买二已购买",
		    		   "F碎屏",
		    		   "G碎屏",
		    		   "F延保",
		    		   "G延保",
		    		   "一延保二碎屏",
		    		   "零通用一普通二苹果",
		    		   "S碎屏延保费用",
				 };
		         tabDemo = new JTable(info,title);
		         TableViewInquiryContract1_1600x900(tabDemo);
		         close(sm,rs);
		         }catch (SQLException e) {
			              JOptionPane.showMessageDialog(null,"SQL定义信息有误！");
		                  e.printStackTrace();
		                  System.err.println(e.getClass().getName() + ": " + e.getMessage());
//		                  System.exit(0);
		         }
	 return false;
	}	
	
	//查询对应SQL的SQL详情信息
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static boolean SQLButton(String DataVersion,String Sql){
   
	    String sql = Sql; 
//			    + " and rownum<10000";
	 
	    try {
		     checkConnection_Oracle(DataVersion);
	         ResultSet rs = sm.executeQuery(sql);
		     System.out.println(sql);
	         boolean moreRecords = rs.next(); // 定位到达第一条记录
	         if (!moreRecords) {
	            JOptionPane.showMessageDialog(null, "未查询到数据！");
	         }
	         Vector rows = new Vector();
	         Vector columnHeads = new Vector();
	         ResultSetMetaData rsmd = rs.getMetaData(); // 获得rs结果集中列属性信息
	             for (int i = 1; i <= rsmd.getColumnCount(); ++i)
	                  columnHeads.addElement(rsmd.getColumnName(i)); // 获得列名(将列名存放至向量columnHeads)

	               do {
	                rows.addElement(getNextRow(rs, rsmd));
	               } 
	               while (rs.next()); // 利用循环获得所有记录 
	               tabDemo = new JTable(rows, columnHeads); // 将获得的行列数据信息作为参数重新构造表格视图
	               TableViewInquiryContract1_1600x900(tabDemo);   
	                close(sm,rs);
	      }catch (SQLException e) {
		        JOptionPane.showMessageDialog(null,"SQL定义信息有误！");
	            e.printStackTrace();
	            System.err.println(e.getClass().getName() + ": " + e.getMessage());
	      }
	 return false;
	}	
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	private static Vector getNextRow(ResultSet rs, ResultSetMetaData rsmd) throws SQLException {
        Vector currentRow = new Vector(); // 定义一个向量,用于存放记录
        for (int i = 1; i <= rsmd.getColumnCount(); ++i)
            currentRow.addElement(rs.getString(i)); // 获取记录
        return currentRow; // 返回记录
    }
    
	public static void fitTableColumns(JTable myTable){
	     myTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
	     JTableHeader header = myTable.getTableHeader();
	     int rowCount = myTable.getRowCount();
	     Enumeration<?> columns = myTable.getColumnModel().getColumns();
	     while(columns.hasMoreElements())
	     {
	         TableColumn column = (TableColumn)columns.nextElement();
	         int col = header.getColumnModel().getColumnIndex(column.getIdentifier());
	         int width = (int)header.getDefaultRenderer().getTableCellRendererComponent
	         (myTable, column.getIdentifier(), false, false, -1, col).getPreferredSize().getWidth();
	         for(int row = 0; row < rowCount; row++)
	         {
	             int preferedWidth = (int)myTable.getCellRenderer(row, col).getTableCellRendererComponent
	             (myTable, myTable.getValueAt(row, col), false, false, row, col).getPreferredSize().getWidth();
	             width = Math.max(width, preferedWidth);
	         }
	         header.setResizingColumn(column); //此行很重要
	         column.setWidth(width+myTable.getIntercellSpacing().width);
	     }
	}

    /** 
     * 显示文本数据窗口 
     * @param table 
     */  
    public static void JTextDataWindow(String json){  
    	JsonData = new JTextArea(50,10);  
        JsonData.setTabSize(4);  
        JsonData.setText(json);
        JsonData.setFont(Constants.BASIC_FONT3);  
        JsonData.setBackground(Color.white);
        JsonData.setLineWrap(true);// 激活自动换行功能  
        JsonData.setWrapStyleWord(true);// 激活断行不断字功能       
        databasetools.ui.frame_1600x900.OneTouchCredit1_1600x900.DataDisplayList.getViewport().add(JsonData);  
    } 
    
    /** 
     * 表格数据居中 
     * @param table 
     */  
    public static void setTableColumnCenter(JTable table){  
        DefaultTableCellRenderer r = new DefaultTableCellRenderer();     
        r.setHorizontalAlignment(JLabel.CENTER);     
        table.setDefaultRenderer(Object.class, r);  
    }  
        
    /** 
     * 表格视图设置 
     * @param tabDemo 
     * @param table 
     */  
	public static void TableViewInquiryContract1_1600x900(JTable tabDemo){  
        jth = tabDemo.getTableHeader();
        RowSorter<TableModel> sorter = new TableRowSorter<TableModel>(tabDemo.getModel());
        tabDemo.setRowSorter(sorter);
        //设置数据与单元格边框的眉边距
        tabDemo.setIntercellSpacing(new Dimension(50,5)); 
        //设置数据与单元格边框是否居中等
        setTableColumnCenter(tabDemo);
        //设置每一列的高度
        tabDemo.setRowHeight(30);
        //固定表格的列宽
        //setFixColumnWidth(tabDemo); 
        //根据单元内的数据内容自动调整列宽resize column width accordng to content of cell automatically
        fitTableColumns(tabDemo);
        //将JTable加入到带纵向滚动条的面板中
        databasetools.ui.frame_1600x900.InquiryContract1_1600x900.DataDisplayList.getViewport().add(tabDemo); 
        
        //横向滚动条
        tabDemo.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tabDemo.setColumnSelectionAllowed(true);  
    }
    
    /** 
     * 表格视图设置 
     * @param tabDemo 
     * @param table 
     */  
	public static void TableViewOneTouchCredit1_1600x900(JTable tabDemo){  
        jth = tabDemo.getTableHeader();
        RowSorter<TableModel> sorter = new TableRowSorter<TableModel>(tabDemo.getModel());
        tabDemo.setRowSorter(sorter);
        //设置数据与单元格边框的眉边距
        tabDemo.setIntercellSpacing(new Dimension(50,5)); 
        //设置数据与单元格边框是否居中等
        setTableColumnCenter(tabDemo);
        //设置每一列的高度
        tabDemo.setRowHeight(30);
        //固定表格的列宽
        //setFixColumnWidth(tabDemo); 
        //根据单元内的数据内容自动调整列宽resize column width accordng to content of cell automatically
        fitTableColumns(tabDemo);
        //将JTable加入到带纵向滚动条的面板中
        databasetools.ui.frame_1600x900.OneTouchCredit1_1600x900.DataDisplayList.getViewport().add(tabDemo); 
        
        //横向滚动条
        tabDemo.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tabDemo.setColumnSelectionAllowed(true);  
    }
	
    public static void checkConnection_Oracle(String DataVersion){
        try {
            if(con == null || con.isClosed())
            	connect_Oracle(DataVersion);
        } catch (Exception e) {
        	e.printStackTrace();
        }
    }
    
    @SuppressWarnings("unused")
	private static void checkConnection_MySql(){
        try {
            if(con == null || con.isClosed())
            	connect_MySql();
        } catch (Exception e) {
            LOG.error(e.getMessage(), e.fillInStackTrace());
        }
    }
    
    /**
     * 连接Oracle数据库
     * @throws Exception
     */
    public static void connect_Oracle(String DataVersion) throws Exception{
        try {
        	if("正式环境".equals(DataVersion)){
	    	    Class.forName(Oracle_FDRIVER);
	    	    con = DriverManager.getConnection(Oracle_FURL, Oracle_FUSERNAME, Oracle_FPASSWORD); 
	    	    sm = con.createStatement();
	    	}
	    	if("测试环境".equals(DataVersion)){
	    		Class.forName(Oracle_TDRIVER);
	    	    con = DriverManager.getConnection(Oracle_TURL, Oracle_TUSERNAME, Oracle_TPASSWORD); 
	    	    sm = con.createStatement();
		    }
	    	if("开发环境".equals(DataVersion)){
	    		Class.forName(Oracle_DDRIVER);
	    	    con = DriverManager.getConnection(Oracle_DURL, Oracle_DUSERNAME, Oracle_DPASSWORD); 
	    	    sm = con.createStatement();
		    }
	    	LOG.info("数据库连接成功");
        } catch (Exception e) {
            String message = "数据库连接失败";
            if(e instanceof ClassNotFoundException)
                message = "数据库驱动类未找到";
            throw new Exception(message, e.fillInStackTrace());
        } 
    }
    
    /**
     * 连接MySql数据库
     * @throws Exception
     */
    public static void connect_MySql() throws Exception{
        try {
            Class.forName(MySql_DRIVER);
            con = DriverManager.getConnection(MySql_URL, MySql_USERNAME, MySql_PASSWORD);
            LOG.info("数据库连接成功");
        } catch (Exception e) {
            String message = "数据库连接失败";
            if(e instanceof ClassNotFoundException)
                message = "数据库驱动类未找到";
            throw new Exception(message, e.fillInStackTrace());
        } 
    }
     
    /**
     * 释放资源并关闭数据库
     */
    public static void close(Statement sm, ResultSet rs){
    	try {
    		if(sm != null){
                sm.close();
                sm = null;
            }
            if(rs != null){
                rs.close();
                rs = null;
            }  
            LOG.info("数据库资源释放成功！");
        } catch (SQLException e) {
        	e.printStackTrace();
        	LOG.info("数据库资源释放失败！");
        }
        try {
            if(con != null && !con.isClosed())
            	con.close();
            con = null;
            LOG.info("数据库连接关闭成功！");
        } catch (SQLException e) {
            e.printStackTrace();
            LOG.info("数据库连接关闭失败！");
        }
    }
}
