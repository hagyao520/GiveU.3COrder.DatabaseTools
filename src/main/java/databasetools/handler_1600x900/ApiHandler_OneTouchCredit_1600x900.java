package databasetools.handler_1600x900;

import java.awt.Color;
import java.awt.Component;
import java.util.Map;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import databasetools.util.Constants;
import databasetools.util.DBHelper;
import databasetools.util.HttpRequestUtil;

public class ApiHandler_OneTouchCredit_1600x900 {
	
	private static String IPProtocol ="http"
	+"://";
	private static String ServerIP  = "10.10.11.132"
	+":";
	private static String ServerPort = "8066";
    
    @SuppressWarnings("unused")
	private static final Logger LOG = LoggerFactory.getLogger(DBHelper.class);
    
	private static JTextArea JsonData;

	public static String UserBoundStore(String userId,String password,String Value) throws Exception {
			    
	    //指定请求的Api地址
	    String PremiseUrl = IPProtocol+ServerIP+ServerPort+"/api/Test/Login";
	    String ApiUrl = IPProtocol+ServerIP+ServerPort+"/api/Common/GetSellerPlace";
	    
	    //指定请求参数
	    final String Param = "{" +
                "\"userId\": \""+userId+"\",\"password\": \""+password+"\",\"type\": \"string\",\"version\": \"string\",\"identification\": \"string\"}";
       
        final String Param1 = "{" +
                "\"salesId\": \""+userId+"\",\"identification\": \"string\",\"roleId\": \"string\"}";
        
        //指定API地址,请求参数,发起请求,获取Cookie值
        Map<String, String> CookieVal = HttpRequestUtil.getPostCcookie(PremiseUrl,Param);
		
        String name = HttpRequestUtil.GetJsonStringValue(ApiUrl, Param1, CookieVal,Value);
 
		return name;
	}
	
	public static String StoreBoundCommodityType(String userId,String password,String Value,String Value1) throws Exception {
	    
	    //指定请求的Api地址
	    String PremiseUrl = IPProtocol+ServerIP+ServerPort+"/api/Test/Login";
	    String ApiUrl = IPProtocol+ServerIP+ServerPort+"/api/CreditApply/GetSellerPlace";
	    
	    //指定请求参数
	    final String Param = "{" +
                "\"userId\": \""+userId+"\",\"password\": \""+password+"\",\"type\": \"string\",\"version\": \"string\",\"identification\": \"string\"}";
       
        final String Param1 = "{" +
                "\"salesId\": \""+userId+"\",\"identification\": \"string\",\"roleId\": \"string\"}";
        
        //指定API地址,请求参数,发起请求,获取Cookie值
        Map<String, String> CookieVal = HttpRequestUtil.getPostCcookie(PremiseUrl,Param);
		
        String name = HttpRequestUtil.GetJsonValue(ApiUrl, Param1, CookieVal,Value,Value1);
 
		return name;
	}

	public static String StoreBoundProductVersion(String userId,String password,String Value,String Value1) throws Exception {
	    
	    //指定请求的Api地址
	    String PremiseUrl = IPProtocol+ServerIP+ServerPort+"/api/Test/Login";
	    String ApiUrl = IPProtocol+ServerIP+ServerPort+"/api/CreditApply/GetSellerPlace";
	    
	    //指定请求参数
	    final String Param = "{" +
                "\"userId\": \""+userId+"\",\"password\": \""+password+"\",\"type\": \"string\",\"version\": \"string\",\"identification\": \"string\"}";
       
        final String Param1 = "{" +
                "\"salesId\": \""+userId+"\",\"identification\": \"string\",\"roleId\": \"string\"}";
        
        //指定API地址,请求参数,发起请求,获取Cookie值
        Map<String, String> CookieVal = HttpRequestUtil.getPostCcookie(PremiseUrl,Param);
		
        String name = HttpRequestUtil.GetJsonValue(ApiUrl, Param1, CookieVal,Value,Value1);
 
		return name;
	}

	public static String StoreBoundProductType(String userId,String password,String Value) throws Exception {
	    
	    //指定请求的Api地址
	    String PremiseUrl = IPProtocol+ServerIP+ServerPort+"/api/Test/Login";
	    String ApiUrl = IPProtocol+ServerIP+ServerPort+"/api/CreditApply/GetProductType";
	    
	    //指定请求参数
	    final String Param = "{" +
                "\"userId\": \""+userId+"\",\"password\": \""+password+"\",\"type\": \"string\",\"version\": \"string\",\"identification\": \"string\"}";
       
        final String Param1 = "{" +
        		"\"prodVersionId\": \"0\",\"salesId\": \""+userId+"\",\"identification\": \"string\",\"roleId\": \"string\"}";
        
        //指定API地址,请求参数,发起请求,获取Cookie值
        Map<String, String> CookieVal = HttpRequestUtil.getPostCcookie(PremiseUrl,Param);
		
        String name = HttpRequestUtil.GetJsonStringValue(ApiUrl, Param1, CookieVal,Value);
 
		return name;
	}
		
	public static String ProductInforMation(String storeId,String goodsCategoryId,String searchTypeId,String productTypeId,String price,String firstPay,String isWallet,String userId,String password,String Value,String Value1) throws Exception {
	    
	    //指定请求的Api地址
	    String PremiseUrl = IPProtocol+ServerIP+ServerPort+"/api/Test/Login";
	    String ApiUrl = IPProtocol+ServerIP+ServerPort+"/api/CreditApply/SearchProduct";
	    
	    //指定请求参数
	    final String Param = "{" +
                "\"userId\": \""+userId+"\",\"password\": \""+password+"\",\"type\": \"string\",\"version\": \"string\",\"identification\": \"string\"}";
       
        final String Param1 = "{" +
        		"\"storeId\": \""+storeId+"\",\"searchTypeId\": \""+searchTypeId+"\",\"productTypeId\": \""+productTypeId+"\",\"goodsCategoryId\": \""+goodsCategoryId+"\","
        	  + "\"price\": \""+price+"\",\"firstPay\": \""+firstPay+"\",\"isWallet\": \""+isWallet+"\",\"salesId\": \""+userId+"\",\"identification\": \"string\",\"roleId\": \"string\"}";
        
        //指定API地址,请求参数,发起请求,获取Cookie值
        Map<String, String> CookieVal = HttpRequestUtil.getPostCcookie(PremiseUrl,Param);
		
        String name = HttpRequestUtil.GetJsonValue(ApiUrl, Param1, CookieVal,Value,Value1);
 
		return name;
	}	
	
	public static String TypeBoundGoods(String goodsTypeId,String userId,String password,String Value) throws Exception {
	    
	    //指定请求的Api地址
	    String PremiseUrl = IPProtocol+ServerIP+ServerPort+"/api/Test/Login";
	    String ApiUrl = IPProtocol+ServerIP+ServerPort+"/api/CreditApply/GetGoodsSubType";
	    
	    //指定请求参数
	    final String Param = "{" +
                "\"userId\": \""+userId+"\",\"password\": \""+password+"\",\"type\": \"string\",\"version\": \"string\",\"identification\": \"string\"}";
       
        final String Param1 = "{" +
        		"\"goodsTypeId\": \""+goodsTypeId+"\",\"creditAmount\": \"0\",\"searchTypeId\": \"0\",\"goodsCategoryId\": \"0\",\"salesId\": \""+userId+"\",\"identification\": \"string\",\"roleId\": \"string\"}";
        
        //指定API地址,请求参数,发起请求,获取Cookie值
        Map<String, String> CookieVal = HttpRequestUtil.getPostCcookie(PremiseUrl,Param);
		
        String name = HttpRequestUtil.GetJsonStringValue(ApiUrl, Param1, CookieVal,Value);
 
		return name;
	}	

	public static String GoodsBoundBrands(String GoodsSubTypeValue,String goodsTypeId,String userId,String password,String Value) throws Exception {
	    
	    //指定请求的Api地址
	    String PremiseUrl = IPProtocol+ServerIP+ServerPort+"/api/Test/Login";
	    String ApiUrl = IPProtocol+ServerIP+ServerPort+"/api/CreditApply/GetBrandsModel";
	    
	    //指定请求参数
	    final String Param = "{" +
                "\"userId\": \""+userId+"\",\"password\": \""+password+"\",\"type\": \"string\",\"version\": \"string\",\"identification\": \"string\"}";
       
        final String Param1 = "{" +
        		"\"goodsTypeId\": \""+GoodsSubTypeValue+"\",\"creditAmount\": \"0\",\"searchTypeId\": \"0\",\"goodsCategoryId\": \""+goodsTypeId+"\",\"salesId\": \""+userId+"\",\"identification\": \"string\",\"roleId\": \"string\"}";
        
        //指定API地址,请求参数,发起请求,获取Cookie值
        Map<String, String> CookieVal = HttpRequestUtil.getPostCcookie(PremiseUrl,Param);
		
        String name = HttpRequestUtil.GetJsonStringValue(ApiUrl, Param1, CookieVal,Value);
 
		return name;
	}
	
	public static String OneManualCredit(
	        String brand,String healthFee,String model,String price,String secureFee,String selfPay,String subTypeId,String comprehensiveInsuranceFee,String information,String goodsLocationNumber,String isCarryWifi,
	        String identAddress,String province,String city,String region,String identAuth,String goodsTypeId,String identExp,String identNo,String identPhoneBack,String identPhoneFront,String isStudent,
	        String nationalId,String price1,String productCode,String productVersionId,String productsTypeId,String selfPay1,String sellerPlaceId,String userName,String powerFlag,String powerFee,String insuranceFee,
	        String insuranceFlag,String shoppingCouponsFee,String treasureChestFlag,String treasureChestFee,
		    String userId,String password,String Value) throws Exception {
		    
		    //指定请求的Api地址
		    String PremiseUrl = IPProtocol+ServerIP+ServerPort+"/api/Test/Login";
		    String ApiUrl = IPProtocol+ServerIP+ServerPort+"/api/CreditApply/CreateCredit";
		    
		    //指定请求参数
		    final String Param = "{" +
	                "\"userId\": \""+userId+"\",\"password\": \""+password+"\",\"type\": \"string\",\"version\": \"string\",\"identification\": \"string\"}";

	        final String Param1 = "{"+
	          "\"goods\":[{"+"\"producer\": \"string\",\"brand\": \""+brand+"\",\"healthFee\": \""+healthFee+"\",\"model\": \""+model+"\","
	        + "\"price\": \""+price+"\",\"secureFee\": \""+secureFee+"\",\"selfPay\": \""+selfPay+"\",\"subTypeId\": \""+subTypeId+"\","
	        + "\"comprehensiveInsuranceFee\": \""+comprehensiveInsuranceFee+"\",\"information\": \"string\",\"goodsLocationNumber\": \""+goodsLocationNumber+"\",\"isCarryWifi\": \""+isCarryWifi+"\"}],"
	        
	        + "\"identAddress\": \""+identAddress+"\",\"province\": \""+province+"\",\"city\": \""+city+"\",\"region\": \""+region+"\",\"identAuth\": \""+identAuth+"\",\"goodsTypeId\": \""+goodsTypeId+"\","
	        + "\"identExp\": \""+identExp+"\",\"identStart\": \"string\",\"identNo\": \""+identNo+"\",\"identPhoneBack\": \""+identPhoneBack+"\",\"identPhoneFront\": \""+identPhoneFront+"\",\"isStudent\": \""+isStudent+"\","
	        + "\"nationalId\": \""+nationalId+"\",\"price\": \""+price1+"\",\"productCode\": \""+productCode+"\",\"productVersionId\": \""+productVersionId+"\",\"productsTypeId\": \""+productsTypeId+"\",\"selfPay\": \""+selfPay1+"\","
	        + "\"sellerPlaceId\": \""+sellerPlaceId+"\",\"userName\": \""+userName+"\",\"powerFlag\": \""+powerFlag+"\",\"powerFee\": \""+powerFee+"\",\"insuranceFee\": \""+insuranceFee+"\",\"insuranceFlag\": \""+insuranceFlag+"\","
	        + "\"shoppingCouponsFee\": \""+shoppingCouponsFee+"\",\"treasureChestFlag\": \""+treasureChestFlag+"\",\"treasureChestFee\": \""+treasureChestFee+"\",\"salesId\": \""+userId+"\",\"identification\": \"string\",\"roleId\": \"string\"}";
	          
	        //指定API地址,请求参数,发起请求,获取Cookie值
        Map<String, String> CookieVal = HttpRequestUtil.getPostCcookie(PremiseUrl,Param);
		
        String name = HttpRequestUtil.GetJsonStringValue(ApiUrl, Param1, CookieVal,Value);
        if (null != name || "".equals(name)) {
		    JOptionPane.showMessageDialog(null, "创建订单成功,请查看结果！");   
		}else{
			JOptionPane.showMessageDialog(null, "创建订单失败【提交参数错误丨接口请求异常】,请检查后重试！");
		}
		return name;
		
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
        databasetools.ui.frame_1600x900.OneTouchCredit_1600x900.DataDisplayList.getViewport().add(JsonData); 
    } 
    
	/** 
     * 定义选项框Box 
     * @param table 
	 * @return 
     */  
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static Component DefinitionBox(JComboBox Box,int x,int y,int l,int w,String Value,String Value1,String Value2,String Value3,String Value4,String Value5,String Value6,String Value7,String Value8,String Value9){ 
    	
    	Box = new JComboBox();
    	Box.setBounds(x, y, l, w);
    	Box.setFont(Constants.BASIC_FONT3);
    	Box.addItem(Value);
    	Box.addItem(Value1);  
    	Box.addItem(Value2);  
    	Box.addItem(Value3);  
    	Box.addItem(Value4);  
    	Box.addItem(Value5);  
    	Box.addItem(Value6);  
    	Box.addItem(Value7);  
    	Box.addItem(Value8);  
    	Box.addItem(Value9);     
    	Box.setSelectedIndex(0);
//    	databasetools.ui.frame.OneTouchCredit_1920x1080.MainPanel.add(Box);
    	
		return Box;
    } 
}
