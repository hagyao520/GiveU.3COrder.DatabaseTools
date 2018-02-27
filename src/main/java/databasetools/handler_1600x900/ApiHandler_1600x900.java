package databasetools.handler_1600x900;

import java.awt.Color;
import java.awt.Component;
import java.util.Map;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import databasetools.util.Constants;
import databasetools.util.DBHelper;
import databasetools.util.HttpRequestUtil;
import databasetools.util.JsonFormatUtil;

public class ApiHandler_1600x900 {
	
	private static String IPProtocol ="http"
	+"://";
	private static String ServerIP  = "10.10.11.132"
	+":";
	private static String ServerPort = "8066";
    
    @SuppressWarnings("unused")
	private static final Logger LOG = LoggerFactory.getLogger(DBHelper.class);

	private static JTextArea JsonData;

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
	
	public static void UserInfo(String userId,String password) throws Exception {
	    
	    //指定请求的Api地址
	    String PremiseUrl = IPProtocol+ServerIP+ServerPort+"/api/Test/Login";
	    String ApiUrl = IPProtocol+ServerIP+ServerPort+"/api/Account/Login";
	    
	    //指定请求参数
//        final String Param = "{" +
//              "\"userId\": \"666666\",\"password\": \"612426\",\"type\": \"string\",\"version\": \"string\",\"identification\": \"string\"}";
       
	    final String Param = "{" +
                "\"userId\": \""+userId+"\",\"password\": \""+password+"\",\"type\": \"string\",\"version\": \"string\",\"identification\": \"string\"}";
	    
        final String Param1 = "{" +
                "\"userId\": \""+userId+"\",\"password\": \""+password+"\",\"type\": \"string\",\"version\": \"string\",\"identification\": \"string\"}";
        
        //指定API地址,请求参数,发起请求,获取Cookie值
        Map<String, String> CookieVal = HttpRequestUtil.getPostCcookie(PremiseUrl,Param);
		
        //指定API地址,请求参数,发起请求,获取Josn结果
        String JsonResult = HttpRequestUtil.GetJsonResult(ApiUrl,Param1,CookieVal);
        
        //将JsonResult字符串格式化
        JsonFormatUtil JsonFormat = new JsonFormatUtil();
        String json=JsonFormat.formatJson(JsonResult);
        
        JOptionPane.showMessageDialog(null,"查询成功！");
        
        //将格式的Josn显示在窗口中
        JTextDataWindow(json);	
	}
	
	public static void UserBoundStore(String userId,String password) throws Exception {
			    
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
		
        //指定API地址,请求参数,发起请求,获取Josn结果
        String JsonResult = HttpRequestUtil.GetJsonResult(ApiUrl,Param1,CookieVal);
        
        //将JsonResult字符串格式化
        JsonFormatUtil JsonFormat = new JsonFormatUtil();
        String json=JsonFormat.formatJson(JsonResult);
           
        JOptionPane.showMessageDialog(null,"查询成功！");
        
        //将格式的Josn显示在窗口中
        JTextDataWindow(json);	
	}
	
	public static void StoreBoundCommodityType(String userId,String password) throws Exception {
	    
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
		
        //指定API地址,请求参数,发起请求,获取Josn结果
        String JsonResult = HttpRequestUtil.GetJsonResult(ApiUrl,Param1,CookieVal);
        
        //将JsonResult字符串格式化
        JsonFormatUtil JsonFormat = new JsonFormatUtil();
        String json=JsonFormat.formatJson(JsonResult);
           
        JOptionPane.showMessageDialog(null,"查询成功！");
        
        //将格式的Josn显示在窗口中
        JTextDataWindow(json);	
	}	

	public static void StoreBoundProductVersion(String userId,String password) throws Exception {
	    
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
		
        //指定API地址,请求参数,发起请求,获取Josn结果
        String JsonResult = HttpRequestUtil.GetJsonResult(ApiUrl,Param1,CookieVal);
        
        //将JsonResult字符串格式化
        JsonFormatUtil JsonFormat = new JsonFormatUtil();
        String json=JsonFormat.formatJson(JsonResult);
           
        JOptionPane.showMessageDialog(null,"查询成功！");
        
        //将格式的Josn显示在窗口中
        JTextDataWindow(json);	
	}
	
	public static void StoreBoundProductType(String userId,String password) throws Exception {
	    
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
		
        //指定API地址,请求参数,发起请求,获取Josn结果
        String JsonResult = HttpRequestUtil.GetJsonResult(ApiUrl,Param1,CookieVal);
        
        //将JsonResult字符串格式化
        JsonFormatUtil JsonFormat = new JsonFormatUtil();
        String json=JsonFormat.formatJson(JsonResult);
           
        JOptionPane.showMessageDialog(null,"查询成功！");
        
        //将格式的Josn显示在窗口中
        JTextDataWindow(json);	
	}	

	public static void ProductInforMation(String storeId,String goodsCategoryId,String searchTypeId,String productTypeId,String price,String firstPay,String isWallet,String userId,String password) throws Exception {
	    
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
		
        //指定API地址,请求参数,发起请求,获取Josn结果
        String JsonResult = HttpRequestUtil.GetJsonResult(ApiUrl,Param1,CookieVal);
        
        //将JsonResult字符串格式化
        JsonFormatUtil JsonFormat = new JsonFormatUtil();
        String json=JsonFormat.formatJson(JsonResult);
           
        JOptionPane.showMessageDialog(null,"查询成功！");
        
        //将格式的Josn显示在窗口中
        JTextDataWindow(json);	
	}	
	
	public static void TypeBoundGoods(String goodsTypeId,String userId,String password) throws Exception {	    
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
		
        //指定API地址,请求参数,发起请求,获取Josn结果
        String JsonResult = HttpRequestUtil.GetJsonResult(ApiUrl,Param1,CookieVal);
        
        //将JsonResult字符串格式化
        JsonFormatUtil JsonFormat = new JsonFormatUtil();
        String json=JsonFormat.formatJson(JsonResult);
           
        JOptionPane.showMessageDialog(null,"查询成功！");
        
        //将格式的Josn显示在窗口中
        JTextDataWindow(json);	
	}
	
	public static void GoodsBoundBrands(String GoodsSubTypeValue,String goodsTypeId,String userId,String password) throws Exception {
	    
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
		
        //指定API地址,请求参数,发起请求,获取Josn结果
        String JsonResult = HttpRequestUtil.GetJsonResult(ApiUrl,Param1,CookieVal);
 
        //将JsonResult字符串格式化
        JsonFormatUtil JsonFormat = new JsonFormatUtil();
        String json=JsonFormat.formatJson(JsonResult);
           
        JOptionPane.showMessageDialog(null,"查询成功！");
        
        //将格式的Josn显示在窗口中
        JTextDataWindow(json);	
	}	
	
	public static void OneManualCredit(
        String brand,String healthFee,String model,String price,String secureFee,String selfPay,String subTypeId,String comprehensiveInsuranceFee,String information,String goodsLocationNumber,String isCarryWifi,
        String identAddress,String province,String city,String region,String identAuth,String goodsTypeId,String identExp,String identNo,String identPhoneBack,String identPhoneFront,String isStudent,
        String nationalId,String price1,String productCode,String productVersionId,String productsTypeId,String selfPay1,String sellerPlaceId,String userName,String powerFlag,String powerFee,String insuranceFee,
        String insuranceFlag,String shoppingCouponsFee,String treasureChestFlag,String treasureChestFee,
	    String userId,String password) throws Exception {
	    
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
		
        //指定API地址,请求参数,发起请求,获取Josn结果
        String JsonResult = HttpRequestUtil.GetJsonResult(ApiUrl,Param1,CookieVal);
 	
        //将Result字符串转换为JSON
        JSONObject object_result = new JSONObject(JsonResult);
        String Result_Status = object_result.getString("status");
        	
        if("true".equals(Result_Status)){
		    JOptionPane.showMessageDialog(null, "创建订单成功,请查看结果！");   
		}else{
			JOptionPane.showMessageDialog(null, "创建订单失败【提交参数错误丨接口请求异常】,请检查后重试！");
		}

        //将JsonResult字符串格式化
        JsonFormatUtil JsonFormat = new JsonFormatUtil();
        String json=JsonFormat.formatJson(JsonResult);
		JTextDataWindow(json);		
	}
	
	public static void OneManualCreditBaseInfo(
	        String cellPhone,String childrenCount,String creditId,String educationTypeId,String familyTel,String familyTotalIncome,String houseTypeId,String marriageTypeId,String monthExpend,String monthIncome,String qq,String wechart,
	        String city,String detail,String province,String region,
	        String email,String isStudent,String userId,String password) throws Exception {
		    
		    //指定请求的Api地址
		    String PremiseUrl = IPProtocol+ServerIP+ServerPort+"/api/Test/Login";
		    String ApiUrl = IPProtocol+ServerIP+ServerPort+"/api/CreditApply/SaveCreditBaseInfo";
		    
		    //指定请求参数
		    final String Param = "{" +
	        "\"userId\": \""+userId+"\",\"password\": \""+password+"\",\"type\": \"string\",\"version\": \"string\",\"identification\": \"string\"}";

	        final String Param1 = "{"+
	        "\"liveInfo\":[{"+"\"city\": \""+city+"\",\"detail\": \""+detail+"\",\"province\": \""+province+"\",\"region\": \""+region+"\"}],"
	        
	        + "\"cellPhone\": \""+cellPhone+"\",\"childrenCount\": \""+childrenCount+"\",\"creditId\": \""+creditId+"\",\"educationTypeId\": \""+educationTypeId+"\",\"familyTel\": \""+familyTel+"\",\"familyTotalIncome\": \""+familyTotalIncome+"\","
	        + "\"houseTypeId\": \""+houseTypeId+"\",\"marriageTypeId\": \""+marriageTypeId+"\",\"monthExpend\": \""+monthExpend+"\",\"monthIncome\": \""+monthIncome+"\",\"qq\": \""+qq+"\",\"wechart\": \""+wechart+"\","
	        + "\"email\": \""+email+"\",\"isStudent\": \""+isStudent+"\",\"salesId\": \""+userId+"\",\"identification\": \"string\",\"roleId\": \"string\"}";
	          
	        //指定API地址,请求参数,发起请求,获取Cookie值
	        Map<String, String> CookieVal = HttpRequestUtil.getPostCcookie(PremiseUrl,Param);
			
	        //指定API地址,请求参数,发起请求,获取Josn结果
	        String JsonResult = HttpRequestUtil.GetJsonResult(ApiUrl,Param1,CookieVal);
	 	
	        //将Result字符串转换为JSON
	        JSONObject object_result = new JSONObject(JsonResult);
	        String Result_Status = object_result.getString("status");
	        	
	        if("true".equals(Result_Status)){
			    JOptionPane.showMessageDialog(null, "保存合同基本信息成功,请查看结果！");   
			}else{
				JOptionPane.showMessageDialog(null, "保存合同基本信息失败【提交参数错误丨接口请求异常】,请检查后重试！");
			}

	        //将JsonResult字符串格式化
	        JsonFormatUtil JsonFormat = new JsonFormatUtil();
	        String json=JsonFormat.formatJson(JsonResult);
			JTextDataWindow(json);		
	}
	
	public static void OneManualCreditCompanyInfo(
	        String compAddDetail,String compCity,String compName,String compProvince,String compRegion,String companyPropertyId,String creditId,String entryDate,String industryTypeId,String jobsTypeId,String workPhone,String workPhoneExt,
	        String workYears,String department,String userId,String password) throws Exception {
		    
		    //指定请求的Api地址
		    String PremiseUrl = IPProtocol+ServerIP+ServerPort+"/api/Test/Login";
		    String ApiUrl = IPProtocol+ServerIP+ServerPort+"/api/CreditApply/SaveCreditCompanyInfo";
		    
		    //指定请求参数
		    final String Param = "{" +
	        "\"userId\": \""+userId+"\",\"password\": \""+password+"\",\"type\": \"string\",\"version\": \"string\",\"identification\": \"string\"}";

	        final String Param1 = "{"+
	        "\"compAddDetail\": \""+compAddDetail+"\",\"compCity\": \""+compCity+"\",\"compName\": \""+compName+"\",\"compProvince\": \""+compProvince+"\",\"compRegion\": \""+compRegion+"\",\"companyPropertyId\": \""+companyPropertyId+"\","
	      + "\"creditId\": \""+creditId+"\",\"entryDate\": \""+entryDate+"\",\"industryTypeId\": \""+industryTypeId+"\",\"jobsTypeId\": \""+jobsTypeId+"\",\"workPhone\": \""+workPhone+"\",\"workPhoneExt\": \""+workPhoneExt+"\","
	      + "\"workYears\": \""+workYears+"\",\"department\": \""+department+"\",\"salesId\": \""+userId+"\",\"identification\": \"string\",\"roleId\": \"string\"}";

	          
	        //指定API地址,请求参数,发起请求,获取Cookie值
	        Map<String, String> CookieVal = HttpRequestUtil.getPostCcookie(PremiseUrl,Param);
			
	        //指定API地址,请求参数,发起请求,获取Josn结果
	        String JsonResult = HttpRequestUtil.GetJsonResult(ApiUrl,Param1,CookieVal);
	 	
	        //将Result字符串转换为JSON
	        JSONObject object_result = new JSONObject(JsonResult);
	        String Result_Status = object_result.getString("status");
	        	
	        if("true".equals(Result_Status)){
			    JOptionPane.showMessageDialog(null, "保存合同单位信息成功,请查看结果！");   
			}else{
				JOptionPane.showMessageDialog(null, "保存合同单位信息失败【提交参数错误丨接口请求异常】,请检查后重试！");
			}

	        //将JsonResult字符串格式化
	        JsonFormatUtil JsonFormat = new JsonFormatUtil();
	        String json=JsonFormat.formatJson(JsonResult);
			JTextDataWindow(json);		
	}	

	public static void OneManualCreditLinkInfo(
	        String creditId,int type,String linkerName,String phone,String relationTypeID,
	        String userId,String password) throws Exception {
		    
		    //指定请求的Api地址
		    String PremiseUrl = IPProtocol+ServerIP+ServerPort+"/api/Test/Login";
		    String ApiUrl = IPProtocol+ServerIP+ServerPort+"/api/CreditApply/SaveCreditLinkInfo";
		    
		    //指定请求参数
		    final String Param = "{" +
	        "\"userId\": \""+userId+"\",\"password\": \""+password+"\",\"type\": \"string\",\"version\": \"string\",\"identification\": \"string\"}";

	        final String Param1 = "{"+
	        "\"relations\":[{"+"\"type\": \""+type+"\",\"linkerName\": \""+linkerName+"\",\"phone\": \""+phone+"\",\"relationTypeID\": \""+relationTypeID+"\"}],"
	        
	        + "\"creditId\": \""+creditId+"\",\"salesId\": \""+userId+"\",\"identification\": \"string\",\"roleId\": \"string\"}";

	          
	        //指定API地址,请求参数,发起请求,获取Cookie值
	        Map<String, String> CookieVal = HttpRequestUtil.getPostCcookie(PremiseUrl,Param);
			
	        //指定API地址,请求参数,发起请求,获取Josn结果
	        String JsonResult = HttpRequestUtil.GetJsonResult(ApiUrl,Param1,CookieVal);
	 	
	        //将Result字符串转换为JSON
	        JSONObject object_result = new JSONObject(JsonResult);
	        String Result_Status = object_result.getString("status");
	        	
	        if("true".equals(Result_Status)){
			    JOptionPane.showMessageDialog(null, "保存合同联系人信息成功,请查看结果！");   
			}else{
				JOptionPane.showMessageDialog(null, "保存合同联系人信息失败【提交参数错误丨接口请求异常】,请检查后重试！");
			}

	        //将JsonResult字符串格式化
	        JsonFormatUtil JsonFormat = new JsonFormatUtil();
	        String json=JsonFormat.formatJson(JsonResult);
			JTextDataWindow(json);		
	}
	
	public static void OneManualCreditBankInfo(
	        String bankAccountNo,String bankCity,String bankId,String bankPhoto,String bankProvince,String creditId,String branch,
	        String userId,String password) throws Exception {
		    
		    //指定请求的Api地址
		    String PremiseUrl = IPProtocol+ServerIP+ServerPort+"/api/Test/Login";
		    String ApiUrl = IPProtocol+ServerIP+ServerPort+"/api/CreditApply/SaveBankInfo";
		    
		    //指定请求参数
		    final String Param = "{" +
	        "\"userId\": \""+userId+"\",\"password\": \""+password+"\",\"type\": \"string\",\"version\": \"string\",\"identification\": \"string\"}";

	        final String Param1 = "{"+
	        "\"bankAccountNo\": \""+bankAccountNo+"\",\"bankCity\": \""+bankCity+"\",\"bankId\": \""+bankId+"\",\"bankPhoto\": \""+bankPhoto+"\",\"bankProvince\": \""+bankProvince+"\",\"creditId\": \""+creditId+"\","
	      + "\"branch\": \""+branch+"\",\"salesId\": \""+userId+"\",\"identification\": \"string\",\"roleId\": \"string\"}";

	          
	        //指定API地址,请求参数,发起请求,获取Cookie值
	        Map<String, String> CookieVal = HttpRequestUtil.getPostCcookie(PremiseUrl,Param);
			
	        //指定API地址,请求参数,发起请求,获取Josn结果
	        String JsonResult = HttpRequestUtil.GetJsonResult(ApiUrl,Param1,CookieVal);
	 	
	        //将Result字符串转换为JSON
	        JSONObject object_result = new JSONObject(JsonResult);
	        String Result_Status = object_result.getString("status");
	        	
	        if("true".equals(Result_Status)){
			    JOptionPane.showMessageDialog(null, "保存合同银行卡信息成功,请查看结果！");   
			}else{
				JOptionPane.showMessageDialog(null, "保存合同银行卡信息失败【提交参数错误丨接口请求异常】,请检查后重试！");
			}

	        //将JsonResult字符串格式化
	        JsonFormatUtil JsonFormat = new JsonFormatUtil();
	        String json=JsonFormat.formatJson(JsonResult);
			JTextDataWindow(json);		
	}	
	
	public static void OneManualCreditOtherInfo(
	        String creditId,String innerCode,String remark,String shop,String isShop,
	        String userId,String password) throws Exception {
		    
		    //指定请求的Api地址
		    String PremiseUrl = IPProtocol+ServerIP+ServerPort+"/api/Test/Login";
		    String ApiUrl = IPProtocol+ServerIP+ServerPort+"/api/CreditApply/SaveOtherInfo";
		    
		    //指定请求参数
		    final String Param = "{" +
	        "\"userId\": \""+userId+"\",\"password\": \""+password+"\",\"type\": \"string\",\"version\": \"string\",\"identification\": \"string\"}";

	        final String Param1 = "{"+
	        "\"creditId\": \""+creditId+"\",\"innerCode\": \""+innerCode+"\",\"remark\": \""+remark+"\",\"shop\": \""+shop+"\",\"isShop\": \""+isShop+"\","
	      + "\"salesId\": \""+userId+"\",\"identification\": \"string\",\"roleId\": \"string\"}";

	          
	        //指定API地址,请求参数,发起请求,获取Cookie值
	        Map<String, String> CookieVal = HttpRequestUtil.getPostCcookie(PremiseUrl,Param);
			
	        //指定API地址,请求参数,发起请求,获取Josn结果
	        String JsonResult = HttpRequestUtil.GetJsonResult(ApiUrl,Param1,CookieVal);
	 	
	        //将Result字符串转换为JSON
	        JSONObject object_result = new JSONObject(JsonResult);
	        String Result_Status = object_result.getString("status");
	        	
	        if("true".equals(Result_Status)){
			    JOptionPane.showMessageDialog(null, "保存合同其他信息成功,请查看结果！");   
			}else{
				JOptionPane.showMessageDialog(null, "保存合同其他信息失败【提交参数错误丨接口请求异常】,请检查后重试！");
			}

	        //将JsonResult字符串格式化
	        JsonFormatUtil JsonFormat = new JsonFormatUtil();
	        String json=JsonFormat.formatJson(JsonResult);
			JTextDataWindow(json);		
	}	
	
	public static void OneManualCreditUploadPhoto(
	        String creditId,String flowType,String name,String path,String photoType,
	        String userId,String password) throws Exception {
		    
		    //指定请求的Api地址
		    String PremiseUrl = IPProtocol+ServerIP+ServerPort+"/api/Test/Login";
		    String ApiUrl = IPProtocol+ServerIP+ServerPort+"/api/CreditApply/UploadOnePhoto";
		    
		    //指定请求参数
		    final String Param = "{" +
	        "\"userId\": \""+userId+"\",\"password\": \""+password+"\",\"type\": \"string\",\"version\": \"string\",\"identification\": \"string\"}";

	        final String Param1 = "{"+
	        "\"photos\":[{"+"\"name\": \""+name+"\",\"path\": \""+path+"\",\"photoType\": \""+photoType+"\"}],"
	        
	        + "\"creditId\": \""+creditId+"\",\"flowType\": \""+flowType+"\",\"salesId\": \""+userId+"\",\"identification\": \"string\",\"roleId\": \"string\"}";
	        
	        //指定API地址,请求参数,发起请求,获取Cookie值
	        Map<String, String> CookieVal = HttpRequestUtil.getPostCcookie(PremiseUrl,Param);
			
	        //指定API地址,请求参数,发起请求,获取Josn结果
	        String JsonResult = HttpRequestUtil.GetJsonResult(ApiUrl,Param1,CookieVal);
	 	
	        //将Result字符串转换为JSON
	        JSONObject object_result = new JSONObject(JsonResult);
	        String Result_Status = object_result.getString("status");
	        	
	        if("true".equals(Result_Status)){
			    JOptionPane.showMessageDialog(null, "上传影像证明图片成功,请查看结果！");   
			}else{
				JOptionPane.showMessageDialog(null, "上传影像证明图片失败【提交参数错误丨接口请求异常】,请检查后重试！");
			}

	        //将JsonResult字符串格式化
	        JsonFormatUtil JsonFormat = new JsonFormatUtil();
	        String json=JsonFormat.formatJson(JsonResult);
			JTextDataWindow(json);		
	}	
	
	public static void OneManualCreditSubmit(
	        String creditId,String userId,String password) throws Exception {
		    
		    //指定请求的Api地址
		    String PremiseUrl = IPProtocol+ServerIP+ServerPort+"/api/Test/Login";
		    String ApiUrl = IPProtocol+ServerIP+ServerPort+"/api/CreditApply/SubmitCredit";
		    
		    //指定请求参数
		    final String Param = "{" +
	        "\"userId\": \""+userId+"\",\"password\": \""+password+"\",\"type\": \"string\",\"version\": \"string\",\"identification\": \"string\"}";

	        final String Param1 = "{"+
	        "\"creditId\": \""+creditId+"\",\"password\": \""+password+"\",\"latitude\": \"string\",\"longitude\": \"string\","
	      + "\"salesId\": \""+userId+"\",\"identification\": \"string\",\"roleId\": \"string\"}";

	          
	        //指定API地址,请求参数,发起请求,获取Cookie值
	        Map<String, String> CookieVal = HttpRequestUtil.getPostCcookie(PremiseUrl,Param);
			
	        //指定API地址,请求参数,发起请求,获取Josn结果
	        String JsonResult = HttpRequestUtil.GetJsonResult(ApiUrl,Param1,CookieVal);
	 	
	        //将Result字符串转换为JSON
	        JSONObject object_result = new JSONObject(JsonResult);
	        String Result_Status = object_result.getString("status");
	        	
	        if("true".equals(Result_Status)){
			    JOptionPane.showMessageDialog(null, "提交合同成功,请查看结果！");   
			}else{
				JOptionPane.showMessageDialog(null, "提交合同失败【提交参数错误丨接口请求异常】,请检查后重试！");
			}

	        //将JsonResult字符串格式化
	        JsonFormatUtil JsonFormat = new JsonFormatUtil();
	        String json=JsonFormat.formatJson(JsonResult);
			JTextDataWindow(json);		
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
