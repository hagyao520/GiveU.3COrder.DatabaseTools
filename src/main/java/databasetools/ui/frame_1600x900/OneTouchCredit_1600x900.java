package databasetools.ui.frame_1600x900;

import java.awt.AWTException;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.MenuItem;
import java.awt.PopupMenu;
import java.awt.SystemTray;
import java.awt.TrayIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

import databasetools.handler_1600x900.ApiHandler_1600x900;
import databasetools.handler_1600x900.ApiHandler_OneTouchCredit_1600x900;
import databasetools.handler_1600x900.DataBaseHandler_1600x900;
import databasetools.util.*;

@SuppressWarnings("serial")
public class OneTouchCredit_1600x900 extends JFrame{
	
	/** 主面板 */
	public static JPanel MainPanel;  
	
	/** 数据展示列表 */
	public static JScrollPane DataDisplayList;
	
	/** 用户后台登录信息查询按钮 */
	private static JButton UserInfoButton;
	/** 用户后台登录信息查询ID输入框 */
	private JTextField UserIDTextField;
	/** 用户后台登录信息查询密码输入框 */
	private JTextField UserPassWordTextField;
	
	/** 用户绑定门店信息查询按钮 */
	private static JButton UserBoundStoreButton;
	/** 商品门店选项框 */
	@SuppressWarnings("rawtypes")
	public static JComboBox UserBoundStoreBox;
	/** 用户绑定门店信息查询序号输入框 */
	private JTextField UserBoundStoreTextField;
	
	/** 门店绑定商品类型信息查询按钮 */
	private static JButton StoreBoundCommodityTypeButton;
	/** 商品类型选项框 */
	@SuppressWarnings("rawtypes")
	public static JComboBox StoreBoundCommodityTypeBox;
	/** 门店绑定商品类型信息查询序号输入框 */
	private JTextField StoreBoundCommodityTypeTextField;
	
	/** 门店绑定产品版本查询按钮 */
	private static JButton StoreBoundProductVersionButton; 
	/** 产品版本选项框 */
	@SuppressWarnings("rawtypes")
	public static JComboBox StoreBoundProductVersionBox;
	/** 门店绑定产品版本查询序号输入框 */
	private JTextField StoreBoundProductVersionTextField;
	
	/** 门店绑定产品类型查询按钮 */
	private static JButton StoreBoundProductTypeButton; 
	/** 产品类型选项框 */
	@SuppressWarnings("rawtypes")
	public static JComboBox StoreBoundProductTypeBox;
	/** 门店绑定产品类型查询序号输入框 */
	private JTextField StoreBoundProductTypeTextField;	

	/** 分期产品信息查询按钮 */
	private static JButton ProductInforMationButton; 
	/** 分期产品选项框 */
	@SuppressWarnings("rawtypes")
	public static JComboBox ProductInforMationBox;
	/** 分期产品信息查询商品门店ID输入框 */
	private JTextField ProductInforMationStorIdTextField;		
	/** 分期产品信息查询商品类型ID输入框 */
	private JTextField ProductInforMationgoodsCategoryIdTextField;		
	/** 分期产品信息查询产品版本ID输入框 */
	private JTextField ProductInforMationSearchTypeIdTextField;
	/** 分期产品信息查询产品类型ID输入框 */
	private JTextField ProductInforMationProductTypeIdTextField;
	/** 分期产品信息查询商品总额输入框 */
	private JTextField ProductInforMationPriceTextField;
	/** 分期产品信息查询首付总额输入框 */
	private JTextField ProductInforMationFirstPayTextField;
	/** 分期产品信息查询首付比例输入框 */
	private JTextField ProductInforMationIsWalletTextField;
	/** 分期产品信息查询序号输入框 */
	private JTextField ProductInforMationTextField;	
	
	/** 类型绑定商品小类查询按钮 */
	private static JButton TypeBoundGoodsButton; 
	/** 商品小类选项框 */
	@SuppressWarnings("rawtypes")
	public static JComboBox TypeBoundGoodsBox;
	/** 类型绑定商品小类查询商品类型ID输入框 */
	private JTextField TypeBoundGoodsGoodsTypeIdTextField;		
	/** 类型绑定商品小类查询序号输入框 */
	private JTextField TypeBoundGoodsTextField;
	
	/** 小类绑定商品品牌查询按钮 */
	private static JButton GoodsBoundBrandsButton; 
	/** 商品品牌选项框 */
	@SuppressWarnings("rawtypes")
	public static JComboBox GoodsBoundBrandsBox;
	/** 小类绑定商品品牌查询商品小类Value输入框 */
	private JTextField GoodsBoundBrandsGoodsSubTypeValueTextField;
	/** 小类绑定商品品牌查询商品类型ID输入框 */
	private JTextField GoodsBoundBrandsGoodsTypeIdTextField;	
	/** 小类绑定商品品牌查询序号输入框 */
	private JTextField GoodsBoundBrandsTextField;	

	/** 保存订单参数Txt*/
	private static JLabel CreateCredit ;

//	/** 商品品牌Txt */
//	private JLabel Brand;
//	/** 商品品牌输入框 */
//	private JTextField BrandTextField;	
	
	/** 商品型号Txt */
	private JLabel Model;
	/** 商品型号输入框 */
	private JTextField ModelTextField;	
	
	/** 医疗费Txt */
	private JLabel HealthFee;
	/** 医疗费输入框 */
	private JTextField HealthFeeTextField;	
	
	/** 安全费Txt */
	private JLabel SecureFee;
	/** 安全费输入框 */
	private JTextField SecureFeeTextField;	
	
	/** 综合保险费Txt */
	private JLabel ComprehensiveInsuranceFee;
	/** 综合保险费输入框 */
	private JTextField ComprehensiveInsuranceFeeTextField;	
	
	/** 信息Txt */
	private JLabel Information;
	/** 信息输入框 */
	private JTextField InformationTextField;	
	
	/** 货位号Txt */
	private JLabel GoodsLocationNumber;
	/** 货位号输入框 */
	private JTextField GoodsLocationNumberTextField;
	
	/** 是否WIFI热点城市Txt */
	private JLabel IsCarryWifi;
	/** 是否WIFI热点城市输入框 */
	private JTextField IsCarryWifiTextField;
	
	/** 是否学生产品Txt */
	private JLabel IsStudent;
	/** 是否学生产品输入框 */
	private JTextField IsStudentTextField;

	/** 是否购买全面保Txt */
	private JLabel PowerFlag;
	/** 是否购买全面保输入框 */
	private JTextField PowerFlagTextField;
	
	/** 全面保费Txt */
	private JLabel PowerFee;
	/** 全面保费输入框 */
	private JTextField PowerFeeTextField;
	
	/** 是否购买保险Txt */
	private JLabel InsuranceFlag;
	/** 是否购买保险输入框 */
	private JTextField InsuranceFlagTextField;
	
	/** 保险费Txt */
	private JLabel InsuranceFee;
	/** 保险费输入框 */
	private JTextField InsuranceFeeTextField;
	
	/** 是否购买百宝箱Txt */
	private JLabel TreasureChestFlag;
	/** 是否购买百宝箱输入框 */
	private JTextField TreasureChestFlagTextField;
	
	/** 百宝箱费Txt */
	private JLabel TreasureChestFee;
	/** 百宝箱费输入框 */
	private JTextField TreasureChestFeeTextField;
	
	/** 商城赠券费Txt */
	private JLabel ShoppingCouponsFee;
	/** 商城赠券费输入框 */
	private JTextField ShoppingCouponsFeeTextField;
	
//	/** 分期产品代码Txt */
//	private JLabel ProductCode;
//	/** 分期产品代码输入框 */
//	private JTextField ProductCodeTextField;
	
	/** 姓名Txt */
	private JLabel UserName;
	/** 姓名输入框 */
	private JTextField UserNameTextField;
	
	/** 民族Txt */
	private JLabel NationalId;
	/** 民族输入框 */
	private JTextField NationalIdTextField;
	
	/** 身份证号码Txt */
	private JLabel IdentNo;
	/** 身份证号码输入框 */
	private JTextField IdentNoTextField;
	
	/** 身份证正面照Txt */
	private JLabel IdentPhoneBack;
	/** 身份证正面照输入框 */
	private JTextField IdentPhoneBackTextField;
	
	/** 身份证反面照Txt */
	private JLabel IdentPhoneFront;
	/** 身份证反面照输入框 */
	private JTextField IdentPhoneFrontTextField;
	
	/** 身份证所属地址Txt */
	private JLabel Address;
	/** 身份证所属省份输入框 */
	private JTextField Address_ProvinceTextField;
	/** 身份证所属城市输入框 */
	private JTextField Address_CityTextField;
	/** 身份证所属区县输入框 */
	private JTextField Address_RegionTextField;
	
	/** 身份证详细地址Txt */
	private JLabel IdentAddress;
	/** 身份证详细地址输入框 */
	private JTextField IdentAddressTextField;

	/** 身份证发证机关Txt */
	private JLabel IdentAuth;
	/** 身份证发证机关输入框 */
	private JTextField IdentAuthTextField;
	
	/** 身份证有效期限Txt */
	private JLabel IdentExp;
	/** 身份证有效期限输入框 */
	private JTextField IdentExpTextField;
	
	/** 保存基础信息参数Txt*/
	private static JLabel SaveCreditBaseInfo;

	/** 现居住地所属地址Txt */
	private JLabel liveInfo;
	/** 现居住地所属省份输入框 */
	private JTextField liveInfo_ProvinceTextField;
	/** 现居住地所属城市输入框 */
	private JTextField liveInfo_CityTextField;
	/** 现居住地所属区县输入框 */
	private JTextField liveInfo_RegionTextField;
	
	/** 现居住地详细地址Txt */
	private JLabel liveInfo_Detail;
	/** 现居住地详细地址输入框 */
	private JTextField liveInfo_DetailTextField;
	
	/** 教育程度Txt */
	private JLabel educationTypeId;
	/** 教育程度输入框 */
	private JTextField educationTypeIdTextField;
	
	/** 个人月收入总额Txt */
	private JLabel monthIncome;
	/** 个人月收入总额输入框 */
	private JTextField monthIncomeTextField;
	
	/** 个人月支出Txt */
	private JLabel monthExpend;
	/** 个人月支出输入框 */
	private JTextField monthExpendTextField;
	
	/** 家庭月收入总额Txt */
	private JLabel familyTotalIncome;
	/** 家庭月收入总额输入框 */
	private JTextField familyTotalIncomeTextField;
	
	/** 手机号Txt */
	private JLabel cellPhone;
	/** 手机号输入框 */
	private JTextField cellPhoneTextField;
	
	/** QQ号Txt */
	private JLabel qq;
	/** QQ号输入框 */
	private JTextField qqTextField;
	
	/** 电子邮箱Txt */
	private JLabel email;
	/** 电子邮箱输入框 */
	private JTextField emailTextField;
	
	/** 微信Txt */
	private JLabel wechart;
	/** 微信输入框 */
	private JTextField wechartTextField;
	
	/** 住房情况Txt */
	private JLabel houseTypeId;
	/** 住房情况输入框 */
	private JTextField houseTypeIdTextField;
	
	/** 婚姻状况Txt */
	private JLabel marriageTypeId;
	/** 婚姻状况输入框 */
	private JTextField marriageTypeIdTextField;

	/** 子女数目Txt */
	private JLabel childrenCount;
	/** 子女数目输入框 */
	private JTextField childrenCountTextField;
	
	/** 家庭固定电话Txt */
	private JLabel familyTel;
	/** 家庭固定电话输入框 */
	private JTextField familyTelTextField;
	
	/** 保存单位信息参数Txt*/
	private static JLabel SaveCreditCompanyInfo;

	/** 单位所属地址Txt */
	private JLabel CompanyAddress;
	/** 单位所属省份输入框 */
	private JTextField CompProvinceTextField;
	/** 单位所属城市输入框 */
	private JTextField CompCityTextField;
	/** 单位所属区县输入框 */
	private JTextField CompRegionTextField;
	
	/** 单位详细地址Txt */
	private JLabel compAddDetail;
	/** 单位详细地址输入框 */
	private JTextField compAddDetailTextField;
	
	/** 单位名称Txt */
	private JLabel compName;
	/** 单位名称输入框 */
	private JTextField compNameTextField;
	
	/** 单位电话Txt */
	private JLabel workPhone;
	/** 单位电话输入框 */
	private JTextField workPhoneTextField;
	
	/** 单位固话分机号Txt */
	private JLabel workPhoneExt;
	/** 单位固话分机号输入框 */
	private JTextField workPhoneExtTextField;
	
	/** 行业类别Txt */
	private JLabel jobsTypeId;
	/** 行业类别输入框 */
	private JTextField jobsTypeIdTextField;
	
	/** 单位性质xt */
	private JLabel companyPropertyId;
	/** 单位性质输入框 */
	private JTextField companyPropertyIdTextField;
	
	/** 任职部门Txt */
	private JLabel department;
	/** 任职部门输入框 */
	private JTextField departmentTextField;
	
	/** 职位Txt */
	private JLabel industryTypeId;
	/** 职位输入框 */
	private JTextField industryTypeIdTextField;
	
	/** 入职时间Txt */
	private JLabel entryDate;
	/** 入职时间输入框 */
	private JTextField entryDateTextField;
	
	/** 工作年限Txt */
	private JLabel workYears;
	/** 工作年限输入框 */
	private JTextField workYearsTextField;
	
	/** 保存联系人信息参数Txt*/
	private static JLabel SaveCreditLinkInfo;
	
	/** 联系人类型Txt */
	private JLabel Contacts;
	/** 联系人类型输入框 */
	private JTextField Contacts_typeTextField;
	
	/** 联系人姓名Txt */
	private JLabel Contacts_linkerName;
	/** 联系人姓名输入框 */
	private JTextField Contacts_linkerNameTextField;
	
	/** 联系人手机号Txt */
	private JLabel Contacts_phone;
	/** 联系人手机号输入框 */
	private JTextField Contacts_phoneTextField;
	
	/** 联系人与本人关系Txt */
	private JLabel Contacts_relationTypeID;
	/** 联系人与本人关系输入框 */
	private JTextField Contacts_relationTypeIDTextField;
	
//	/** 家庭联系人类型Txt */
//	private JLabel Family_type;
//	/** 家庭联系人类型输入框 */
//	private JTextField Family_typeTextField;
//	
//	/** 家庭联系人(一)姓名Txt */
//	private JLabel Family_linkerName;
//	/** 家庭联系人(一)姓名输入框 */
//	private JTextField Family_linkerNameTextField;
//	
//	/** 家庭联系人(一)手机号Txt */
//	private JLabel Family_phone;
//	/** 家庭联系人(一)手机号输入框 */
//	private JTextField Family_phoneTextField;
//	
//	/** 家庭联系人(一)与本人关系Txt */
//	private JLabel Family_relationTypeID;
//	/** 家庭联系人(一)与本人关系输入框 */
//	private JTextField Family_relationTypeIDTextField;
//	
//	/** 其他联系人类型Txt */
//	private JLabel Other_type;
//	/** 其他联系人类型输入框 */
//	private JTextField Other_typeTextField;
//	
//	/** 其他联系人(一)姓名Txt */
//	private JLabel Other_linkerName;
//	/** 其他联系人(一)姓名输入框 */
//	private JTextField Other_linkerNameTextField;
//	
//	/** 其他联系人(一)手机号Txt */
//	private JLabel Other_phone;
//	/** 其他联系人(一)手机号输入框 */
//	private JTextField Other_phoneTextField;
//	
//	/** 其他联系人(一)与本人关系Txt */
//	private JLabel Other_relationTypeID;
//	/** 其他联系人(一)与本人关系输入框 */
//	private JTextField Other_relationTypeIDTextField;
	
	/** 保存银行卡信息参数Txt*/
	private static JLabel SaveBankInfo;
	
	/** 银行卡号码Txt */
	private JLabel bankAccountNo;
	/** 银行卡号码输入框 */
	private JTextField bankAccountNoTextField;
	
	/** 银行卡照片Txt */
	private JLabel bankPhoto;
	/** 银行卡照片输入框 */
	private JTextField bankPhotoTextField;
	
	/** 银行卡类型/所属地Txt */
	private JLabel bankIDAddress ;
	/** 银行卡类型输入框 */
	private JTextField bankIdTextField;
	/** 开户行省份输入框 */
	private JTextField bankProvinceTextField;
	/** 开户行城市输入框 */
	private JTextField bankCityTextField;

	/** 银行卡开户行Txt */
	private JLabel branch;
	/** 银行卡开户行输入框 */
	private JTextField branchTextField;
	
	/** 保存其他信息参数Txt*/
	private static JLabel SaveOtherInfo;
	
	/** 内部代码Txt */
	private JLabel innerCode;
	/** 内部代码输入框 */
	private JTextField innerCodeTextField;
	
	/** 商店Txt */
	private JLabel shop;
	/** 商店输入框 */
	private JTextField shopTextFiel;
	
	/** 是否移动门店Txt */
	private JLabel isShop;
	/** 是否移动门店输入框 */
	private JTextField isShopTextField;
	
	/** 提单备注Txt */
	private JLabel remark;
	/** 提单备注输入框 */
	private JTextField remarkTextFiel;
	
	/** 批量上传影像证明信息参数Txt*/
	private static JLabel UploadOnePhoto;
	
	/** 流式Txt */
	private JLabel flowType;
	/** 流式输入框 */
	private JTextField flowTypeTextField;
	
	/** 图片类型Txt */
	private JLabel photoType;
	/** 图片类型输入框 */
	private JTextField photoTypeTextField;
	
	/** 图片名称Txt */
	private JLabel name;
	/** 图片名称输入框 */
	private JTextField nameTextField;
	
	/** 图片路径Txt */
	private JLabel path;
	/** 图片路径输入框 */
	private JTextField pathTextField;
	
	//-------------------------------------------------
	/** "+"Txt */
	private JLabel plus;
	
	/** 一键手动创建合同订单按钮 */
	private static JButton OneManualCredit;
	
	/** 一键保存合同基础信息按钮 */
	private static JButton OneManualCreditBaseInfo; 
	
	/** 一键保存合同单位信息按钮 */
	private static JButton OneManualCreditCompanyInfo; 
	
	/** 一键保存合同联系人信息按钮 */
	private static JButton OneManualCreditLinkInfo; 
	
	/** 一键保存合同银行卡信息按钮 */
	private static JButton OneManualCreditBankInfo; 
	
	/** 一键保存合同其他信息按钮 */
	private static JButton OneManualCreditOtherInfo; 
	
	/** 一键上传影像证明图片按钮 */
	private static JButton OneManualCreditUploadPhoto; 
	
	/** 一键提交保存合同按钮 */
	private static JButton OneManualCreditSubmit; 

	/** 返回至查询合同费用按钮 */
	private JButton InquiryContractButton;
	
	/** 挂起进程按钮 */
	private JButton HangUpProcessButton;
	/** 挂起进程图标 */
	private TrayIcon icon;
	private SystemTray tray;
	
	public static OneTouchCredit_1600x900 getInstance() {
		OneTouchCredit_1600x900 inst = new OneTouchCredit_1600x900();
		inst.setLocationRelativeTo(null);
		inst.setVisible(true);
		return inst;
	}
	
	public OneTouchCredit_1600x900() {
		super();
		initGUI();
		initTrayIcon();
		initFocusListener();
		initButtonEvent();
	}

	private void initGUI() {
		
	    try {			
			setTitle("By:小智出品，必属精品『欢迎使用<即有宝>自动化测试系统』");
			setSize(1600,870);
			setLocation(0,0);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			DefinitionPanel();
			getContentPane().add(MainPanel, BorderLayout.CENTER);
			DefinitionJScrollPane(620, 4, 763, 600);

			//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
			UserInfoButton = new JButton("用户后台登录信息查询");
			UserInfoButton.setFont(Constants.BASIC_FONT6);
			UserInfoButton.setBounds(10, 4, 152, 22);
			MainPanel.add(UserInfoButton);

			UserIDTextField = new JTextField();
			UserIDTextField.setBounds(170, 4, 214, 21);
			UserIDTextField.setBorder(Constants.LIGHT_GRAY_BORDER);
			UserIDTextField.setText("666666");
			UserIDTextField.setFont(Constants.BASIC_FONT6);
			UserIDTextField.setForeground(Color.GRAY); 
			MainPanel.add(UserIDTextField);
			
			UserPassWordTextField = new JTextField();
			UserPassWordTextField.setBounds(393, 4, 214, 21);
			UserPassWordTextField.setBorder(Constants.LIGHT_GRAY_BORDER);
			UserPassWordTextField.setText("612426");
			UserPassWordTextField.setFont(Constants.BASIC_FONT6);
			UserPassWordTextField.setForeground(Color.GRAY); 
			MainPanel.add(UserPassWordTextField);
			
			//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
			UserBoundStoreButton = new JButton("用户绑定门店信息查询");
			UserBoundStoreButton.setBounds(10, 30, 152, 22);
			UserBoundStoreButton.setFont(Constants.BASIC_FONT6);
	    	MainPanel.add(UserBoundStoreButton);
		
	    	UserBoundStoreTextField = new JTextField();
	    	UserBoundStoreTextField.setBounds(510-78, 30, 175, 21);
	    	UserBoundStoreTextField.setBorder(Constants.LIGHT_GRAY_BORDER);
	    	UserBoundStoreTextField.setText("2");
	    	UserBoundStoreTextField.setFont(Constants.BASIC_FONT6);
	    	UserBoundStoreTextField.setForeground(Color.GRAY); 
			MainPanel.add(UserBoundStoreTextField);
			
//	    	String UserID = String.valueOf(UserIDTextField.getText());
//			String UserPassword = String.valueOf(UserPassWordTextField.getText());
			
//			int StoreID=Integer.parseInt(UserBoundStoreTextField.getText());
//
//            String StoreCode = ApiHandler_OneTouchCredit_1920x1081.UserBoundStore(UserID,UserPassword,"data.code["+StoreID+"-2]");
//            String StoreName = ApiHandler_OneTouchCredit_1920x1081.UserBoundStore(UserID,UserPassword,"data.name["+StoreID+"-2]");
//            String StoreCode1 = ApiHandler_OneTouchCredit_1920x1081.UserBoundStore(UserID,UserPassword,"data.code["+StoreID+"-1]");
//            String StoreName1 = ApiHandler_OneTouchCredit_1920x1081.UserBoundStore(UserID,UserPassword,"data.name["+StoreID+"-1]");
//            String UserBoundStoreValue = StoreCode+"-"+StoreName;
//            String UserBoundStoreValue1 = StoreCode1+"-"+StoreName1;
//	    	DefinitionBox(UserBoundStoreBox, 200, 40, 300, 25,StoreID,UserBoundStoreValue,UserBoundStoreValue1,null,null,null,null,null,null,null,null, null, null, null, null, null, null, null, null
//			,null,null,null,null,null,null,null,null,null);

	    	//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	    	StoreBoundCommodityTypeButton = new JButton("门店绑定商品类型查询");
	    	StoreBoundCommodityTypeButton.setBounds(10, 70-13, 152, 22);
	    	StoreBoundCommodityTypeButton.setFont(Constants.BASIC_FONT6);
	    	MainPanel.add(StoreBoundCommodityTypeButton);

            StoreBoundCommodityTypeTextField = new JTextField();
            StoreBoundCommodityTypeTextField.setBounds(510-78, 70-13, 175, 21);
            StoreBoundCommodityTypeTextField.setBorder(Constants.LIGHT_GRAY_BORDER);
            StoreBoundCommodityTypeTextField.setText("5");
            StoreBoundCommodityTypeTextField.setFont(Constants.BASIC_FONT6);
            StoreBoundCommodityTypeTextField.setForeground(Color.GRAY); 
			MainPanel.add(StoreBoundCommodityTypeTextField);

//			String CommodityTypeData = "data";
//			String CommodityTypeStores = "stores";
//			String CommodityTypeGoodTypes = "goodTypes";
//			int CommodityID=Integer.parseInt(UserBoundStoreTextField.getText())-1;
//			int CommodityTypeID=Integer.parseInt(StoreBoundCommodityTypeTextField.getText());
//			
//	    	String CommodityTypeText = ApiHandler_OneTouchCredit_1920x1081.StoreBoundCommodityType(UserID,UserPassword,""+CommodityTypeData+"."+CommodityTypeStores+"",""+CommodityTypeGoodTypes+"["+CommodityID+"].text[0]");
//	    	String CommodityTypeText1 = ApiHandler_OneTouchCredit_1920x1081.StoreBoundCommodityType(UserID,UserPassword,""+CommodityTypeData+"."+CommodityTypeStores+"",""+CommodityTypeGoodTypes+"["+CommodityID+"].text[1]");
//	    	String CommodityTypeText2 = ApiHandler_OneTouchCredit_1920x1081.StoreBoundCommodityType(UserID,UserPassword,""+CommodityTypeData+"."+CommodityTypeStores+"",""+CommodityTypeGoodTypes+"["+CommodityID+"].text[2]");
//	    	String CommodityTypeText3 = ApiHandler_OneTouchCredit_1920x1081.StoreBoundCommodityType(UserID,UserPassword,""+CommodityTypeData+"."+CommodityTypeStores+"",""+CommodityTypeGoodTypes+"["+CommodityID+"].text[3]");
//	    	String CommodityTypeText4 = ApiHandler_OneTouchCredit_1920x1081.StoreBoundCommodityType(UserID,UserPassword,""+CommodityTypeData+"."+CommodityTypeStores+"",""+CommodityTypeGoodTypes+"["+CommodityID+"].text[4]");
//	    	String CommodityTypeText5 = ApiHandler_OneTouchCredit_1920x1081.StoreBoundCommodityType(UserID,UserPassword,""+CommodityTypeData+"."+CommodityTypeStores+"",""+CommodityTypeGoodTypes+"["+CommodityID+"].text[5]");
//	    	String CommodityTypeText6 = ApiHandler_OneTouchCredit_1920x1081.StoreBoundCommodityType(UserID,UserPassword,""+CommodityTypeData+"."+CommodityTypeStores+"",""+CommodityTypeGoodTypes+"["+CommodityID+"].text[6]");
//	    	String CommodityTypeText7 = ApiHandler_OneTouchCredit_1920x1081.StoreBoundCommodityType(UserID,UserPassword,""+CommodityTypeData+"."+CommodityTypeStores+"",""+CommodityTypeGoodTypes+"["+CommodityID+"].text[7]");
//	    	String CommodityTypeText8 = ApiHandler_OneTouchCredit_1920x1081.StoreBoundCommodityType(UserID,UserPassword,""+CommodityTypeData+"."+CommodityTypeStores+"",""+CommodityTypeGoodTypes+"["+CommodityID+"].text[8]");
//	    	String CommodityTypeText9 = ApiHandler_OneTouchCredit_1920x1081.StoreBoundCommodityType(UserID,UserPassword,""+CommodityTypeData+"."+CommodityTypeStores+"",""+CommodityTypeGoodTypes+"["+CommodityID+"].text[9]");
//	    	String CommodityTypeText10 = ApiHandler_OneTouchCredit_1920x1081.StoreBoundCommodityType(UserID,UserPassword,""+CommodityTypeData+"."+CommodityTypeStores+"",""+CommodityTypeGoodTypes+"["+CommodityID+"].text[10]");
//	    	String CommodityTypeText11 = ApiHandler_OneTouchCredit_1920x1081.StoreBoundCommodityType(UserID,UserPassword,""+CommodityTypeData+"."+CommodityTypeStores+"",""+CommodityTypeGoodTypes+"["+CommodityID+"].text[11]");
//	    	String CommodityTypeText12 = ApiHandler_OneTouchCredit_1920x1081.StoreBoundCommodityType(UserID,UserPassword,""+CommodityTypeData+"."+CommodityTypeStores+"",""+CommodityTypeGoodTypes+"["+CommodityID+"].text[12]");
//	    	String CommodityTypeText13 = ApiHandler_OneTouchCredit_1920x1081.StoreBoundCommodityType(UserID,UserPassword,""+CommodityTypeData+"."+CommodityTypeStores+"",""+CommodityTypeGoodTypes+"["+CommodityID+"].text[13]");
//	    	String CommodityTypeText14 = ApiHandler_OneTouchCredit_1920x1081.StoreBoundCommodityType(UserID,UserPassword,""+CommodityTypeData+"."+CommodityTypeStores+"",""+CommodityTypeGoodTypes+"["+CommodityID+"].text[14]");
//	    	String CommodityTypeText15 = ApiHandler_OneTouchCredit_1920x1081.StoreBoundCommodityType(UserID,UserPassword,""+CommodityTypeData+"."+CommodityTypeStores+"",""+CommodityTypeGoodTypes+"["+CommodityID+"].text[15]");
//	    	String CommodityTypeText16 = ApiHandler_OneTouchCredit_1920x1081.StoreBoundCommodityType(UserID,UserPassword,""+CommodityTypeData+"."+CommodityTypeStores+"",""+CommodityTypeGoodTypes+"["+CommodityID+"].text[16]");
//	    	String CommodityTypeText17 = ApiHandler_OneTouchCredit_1920x1081.StoreBoundCommodityType(UserID,UserPassword,""+CommodityTypeData+"."+CommodityTypeStores+"",""+CommodityTypeGoodTypes+"["+CommodityID+"].text[17]");
//	    	
//            DefinitionBox(StoreBoundCommodityTypeBox, 200, 70, 300, 25,CommodityTypeID,CommodityTypeText,CommodityTypeText1,CommodityTypeText2,CommodityTypeText3,CommodityTypeText4,CommodityTypeText5,
//		    CommodityTypeText6,CommodityTypeText7,CommodityTypeText8,CommodityTypeText9,CommodityTypeText10,CommodityTypeText11,CommodityTypeText12,CommodityTypeText13,CommodityTypeText14,
//		    CommodityTypeText15,CommodityTypeText16,CommodityTypeText17,null,null,null,null,null,null,null,null,null);
            
            //----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
            StoreBoundProductVersionButton = new JButton("门店绑定产品版本查询");
            StoreBoundProductVersionButton.setBounds(10, 100-16, 152, 22);
            StoreBoundProductVersionButton.setFont(Constants.BASIC_FONT6);
	    	MainPanel.add(StoreBoundProductVersionButton);

	    	StoreBoundProductVersionTextField = new JTextField();
	    	StoreBoundProductVersionTextField.setBounds(510-78, 100-15, 175, 21);
	    	StoreBoundProductVersionTextField.setBorder(Constants.LIGHT_GRAY_BORDER);
	    	StoreBoundProductVersionTextField.setText("5");
	    	StoreBoundProductVersionTextField.setFont(Constants.BASIC_FONT6);
	    	StoreBoundProductVersionTextField.setForeground(Color.GRAY); 
			MainPanel.add(StoreBoundProductVersionTextField);

//			String ProductVersionData = "data";
//			String ProductVersionStores = "stores";
//			String ProductVersionProductTypes = "productTypes";
//			int BoundStoreID=Integer.parseInt(UserBoundStoreTextField.getText())-1;
//			int ProductVersionID=Integer.parseInt(StoreBoundProductVersionTextField.getText());
//			
//			String ProductVersionText = ApiHandler_OneTouchCredit_1920x1081.StoreBoundProductVersion(UserID,UserPassword,""+ProductVersionData+"."+ProductVersionStores+"",""+ProductVersionProductTypes+"["+BoundStoreID+"].text[0]");
//	    	String ProductVersionText1 = ApiHandler_OneTouchCredit_1920x1081.StoreBoundProductVersion(UserID,UserPassword,""+ProductVersionData+"."+ProductVersionStores+"",""+ProductVersionProductTypes+"["+BoundStoreID+"].text[1]");
//	    	String ProductVersionText2 = ApiHandler_OneTouchCredit_1920x1081.StoreBoundProductVersion(UserID,UserPassword,""+ProductVersionData+"."+ProductVersionStores+"",""+ProductVersionProductTypes+"["+BoundStoreID+"].text[2]");
//	    	String ProductVersionText3 = ApiHandler_OneTouchCredit_1920x1081.StoreBoundProductVersion(UserID,UserPassword,""+ProductVersionData+"."+ProductVersionStores+"",""+ProductVersionProductTypes+"["+BoundStoreID+"].text[3]");
//	    	String ProductVersionText4 = ApiHandler_OneTouchCredit_1920x1081.StoreBoundProductVersion(UserID,UserPassword,""+ProductVersionData+"."+ProductVersionStores+"",""+ProductVersionProductTypes+"["+BoundStoreID+"].text[4]");
//	    	String ProductVersionText5 = ApiHandler_OneTouchCredit_1920x1081.StoreBoundProductVersion(UserID,UserPassword,""+ProductVersionData+"."+ProductVersionStores+"",""+ProductVersionProductTypes+"["+BoundStoreID+"].text[5]");
//	    	String ProductVersionText6 = ApiHandler_OneTouchCredit_1920x1081.StoreBoundProductVersion(UserID,UserPassword,""+ProductVersionData+"."+ProductVersionStores+"",""+ProductVersionProductTypes+"["+BoundStoreID+"].text[6]");
//	    	String ProductVersionText7 = ApiHandler_OneTouchCredit_1920x1081.StoreBoundProductVersion(UserID,UserPassword,""+ProductVersionData+"."+ProductVersionStores+"",""+ProductVersionProductTypes+"["+BoundStoreID+"].text[7]");
//	    	String ProductVersionText8 = ApiHandler_OneTouchCredit_1920x1081.StoreBoundProductVersion(UserID,UserPassword,""+ProductVersionData+"."+ProductVersionStores+"",""+ProductVersionProductTypes+"["+BoundStoreID+"].text[8]");
//	    	String ProductVersionText9 = ApiHandler_OneTouchCredit_1920x1081.StoreBoundProductVersion(UserID,UserPassword,""+ProductVersionData+"."+ProductVersionStores+"",""+ProductVersionProductTypes+"["+BoundStoreID+"].text[9]");
////	    	String ProductVersionText10 = ApiHandler_OneTouchCredit_1920x1081.StoreBoundCommodityType(UserID,UserPassword,""+ProductVersionData+"."+ProductVersionStores+"",""+ProductVersionProductTypes+"["+BoundStoreID+"].text[10]");
////	    	String ProductVersionText11 = ApiHandler_OneTouchCredit_1920x1081.StoreBoundCommodityType(UserID,UserPassword,""+ProductVersionData+"."+ProductVersionStores+"",""+ProductVersionProductTypes+"["+BoundStoreID+"].text[11]");
////	    	String ProductVersionText12 = ApiHandler_OneTouchCredit_1920x1081.StoreBoundCommodityType(UserID,UserPassword,""+ProductVersionData+"."+ProductVersionStores+"",""+ProductVersionProductTypes+"["+BoundStoreID+"].text[12]");
////	    	String ProductVersionText13 = ApiHandler_OneTouchCredit_1920x1081.StoreBoundCommodityType(UserID,UserPassword,""+ProductVersionData+"."+ProductVersionStores+"",""+ProductVersionProductTypes+"["+BoundStoreID+"].text[13]");
////	    	String ProductVersionText14 = ApiHandler_OneTouchCredit_1920x1081.StoreBoundCommodityType(UserID,UserPassword,""+ProductVersionData+"."+ProductVersionStores+"",""+ProductVersionProductTypes+"["+BoundStoreID+"].text[14]");
////	    	String ProductVersionText15 = ApiHandler_OneTouchCredit_1920x1081.StoreBoundCommodityType(UserID,UserPassword,""+ProductVersionData+"."+ProductVersionStores+"",""+ProductVersionProductTypes+"["+BoundStoreID+"].text[15]");
////	    	String ProductVersionText16 = ApiHandler_OneTouchCredit_1920x1081.StoreBoundCommodityType(UserID,UserPassword,""+ProductVersionData+"."+ProductVersionStores+"",""+ProductVersionProductTypes+"["+BoundStoreID+"].text[16]");
////	    	String ProductVersionText17 = ApiHandler_OneTouchCredit_1920x1081.StoreBoundCommodityType(UserID,UserPassword,""+ProductVersionData+"."+ProductVersionStores+"",""+ProductVersionProductTypes+"["+BoundStoreID+"].text[17]");
//
//            DefinitionBox(StoreBoundProductVersionBox, 200, 100, 300, 25,ProductVersionID,ProductVersionText,ProductVersionText1,ProductVersionText2,ProductVersionText3,ProductVersionText4,ProductVersionText5,
//            ProductVersionText6,ProductVersionText7,ProductVersionText8,ProductVersionText9,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null);
            
            //----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
            StoreBoundProductTypeButton = new JButton("门店绑定产品类型查询");
            StoreBoundProductTypeButton.setBounds(10, 130-19, 152, 22);
            StoreBoundProductTypeButton.setFont(Constants.BASIC_FONT6);
	    	MainPanel.add(StoreBoundProductTypeButton);

	    	StoreBoundProductTypeTextField = new JTextField();
	    	StoreBoundProductTypeTextField.setBounds(510-78, 130-18, 175, 21);
	    	StoreBoundProductTypeTextField.setBorder(Constants.LIGHT_GRAY_BORDER);
	    	StoreBoundProductTypeTextField.setText("1");
	    	StoreBoundProductTypeTextField.setFont(Constants.BASIC_FONT6);
	    	StoreBoundProductTypeTextField.setForeground(Color.GRAY); 
			MainPanel.add(StoreBoundProductTypeTextField);

//			String ProductTypeData = "data";
//			String ProductTypetext = "text";
//			int ProductTypeID = Integer.parseInt(StoreBoundProductTypeTextField.getText());
//			
//			String ProductTypeText = ApiHandler_OneTouchCredit_1920x1081.StoreBoundProductType(UserID,UserPassword,""+ProductTypeData+"."+ProductTypetext+"[0]");
////			String ProductTypeText1 = ApiHandler_OneTouchCredit_1920x1081.StoreBoundProductType(UserID,UserPassword,""+ProductTypeData+"."+ProductTypetext+"[1]");
//
//            DefinitionBox(StoreBoundProductVersionBox, 200, 130, 300, 25,ProductTypeID,ProductTypeText,null,null,null,null,null,
//            		null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null);   		    	
	    	
            //----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
            ProductInforMationButton = new JButton("分期产品信息查询");
            ProductInforMationButton.setBounds(10, 160-22, 152, 81);
            ProductInforMationButton.setFont(Constants.BASIC_FONT6);
	    	MainPanel.add(ProductInforMationButton);

	    	ProductInforMationStorIdTextField = new JTextField();
	    	ProductInforMationStorIdTextField.setBounds(170, 140, 100, 22);
	    	ProductInforMationStorIdTextField.setBorder(Constants.LIGHT_GRAY_BORDER);
	    	ProductInforMationStorIdTextField.setText("91337");
	    	ProductInforMationStorIdTextField.setFont(Constants.BASIC_FONT6);
	    	ProductInforMationStorIdTextField.setForeground(Color.GRAY); 
			MainPanel.add(ProductInforMationStorIdTextField);

			ProductInforMationgoodsCategoryIdTextField = new JTextField();
			ProductInforMationgoodsCategoryIdTextField.setBounds(280, 160-20, 100, 22);
			ProductInforMationgoodsCategoryIdTextField.setBorder(Constants.LIGHT_GRAY_BORDER);
			ProductInforMationgoodsCategoryIdTextField.setText("7");
			ProductInforMationgoodsCategoryIdTextField.setFont(Constants.BASIC_FONT6);
			ProductInforMationgoodsCategoryIdTextField.setForeground(Color.GRAY); 
			MainPanel.add(ProductInforMationgoodsCategoryIdTextField);
			
			ProductInforMationSearchTypeIdTextField = new JTextField();
			ProductInforMationSearchTypeIdTextField.setBounds(390, 160-20, 100, 22);
			ProductInforMationSearchTypeIdTextField.setBorder(Constants.LIGHT_GRAY_BORDER);
			ProductInforMationSearchTypeIdTextField.setText("34");
			ProductInforMationSearchTypeIdTextField.setFont(Constants.BASIC_FONT6);
			ProductInforMationSearchTypeIdTextField.setForeground(Color.GRAY); 
			MainPanel.add(ProductInforMationSearchTypeIdTextField);
			
			ProductInforMationProductTypeIdTextField = new JTextField();
			ProductInforMationProductTypeIdTextField.setBounds(500, 160-20, 107, 22);
			ProductInforMationProductTypeIdTextField.setBorder(Constants.LIGHT_GRAY_BORDER);
			ProductInforMationProductTypeIdTextField.setText("2");
			ProductInforMationProductTypeIdTextField.setFont(Constants.BASIC_FONT6);
			ProductInforMationProductTypeIdTextField.setForeground(Color.GRAY); 
			MainPanel.add(ProductInforMationProductTypeIdTextField);
			
			ProductInforMationPriceTextField = new JTextField();
			ProductInforMationPriceTextField.setBounds(170, 167, 100, 22);
			ProductInforMationPriceTextField.setBorder(Constants.LIGHT_GRAY_BORDER);
			ProductInforMationPriceTextField.setText("5000");
			ProductInforMationPriceTextField.setFont(Constants.BASIC_FONT6);
			ProductInforMationPriceTextField.setForeground(Color.GRAY); 
			MainPanel.add(ProductInforMationPriceTextField);
			
			ProductInforMationFirstPayTextField = new JTextField();
			ProductInforMationFirstPayTextField.setBounds(280, 167, 100, 22);
			ProductInforMationFirstPayTextField.setBorder(Constants.LIGHT_GRAY_BORDER);
			ProductInforMationFirstPayTextField.setText("2000");
			ProductInforMationFirstPayTextField.setFont(Constants.BASIC_FONT6);
	    	ProductInforMationFirstPayTextField.setForeground(Color.GRAY); 
			MainPanel.add(ProductInforMationFirstPayTextField);

			ProductInforMationIsWalletTextField = new JTextField();
			ProductInforMationIsWalletTextField.setBounds(390, 167, 100, 22);
			ProductInforMationIsWalletTextField.setBorder(Constants.LIGHT_GRAY_BORDER);
			ProductInforMationIsWalletTextField.setText("0");
			ProductInforMationIsWalletTextField.setFont(Constants.BASIC_FONT6);
			ProductInforMationIsWalletTextField.setForeground(Color.GRAY); 
			MainPanel.add(ProductInforMationIsWalletTextField);
			
			ProductInforMationTextField = new JTextField();
			ProductInforMationTextField.setBounds(500, 167, 107, 22);
			ProductInforMationTextField.setBorder(Constants.LIGHT_GRAY_BORDER);
			ProductInforMationTextField.setText("3");
			ProductInforMationTextField.setFont(Constants.BASIC_FONT6);
			ProductInforMationTextField.setForeground(Color.GRAY); 
			MainPanel.add(ProductInforMationTextField);
			
//	    	String ProductInforMationStoreId = String.valueOf(ProductInforMationStorIdTextField.getText());
//			String ProductInforMationGoodsCategoryId = String.valueOf(ProductInforMationgoodsCategoryIdTextField.getText());
//			String ProductInforMationSearchTypeId = String.valueOf(ProductInforMationSearchTypeIdTextField.getText());
//			String ProductInforMationProductTypeId = String.valueOf(ProductInforMationProductTypeIdTextField.getText());
//			String ProductInforMationPrice = String.valueOf(ProductInforMationPriceTextField.getText());
//			String ProductInforMationFirstPay = String.valueOf(ProductInforMationFirstPayTextField.getText());
//			String ProductInforMationIsWallet = String.valueOf(ProductInforMationIsWalletTextField.getText());
//	
//			String ProductInforMationData = "data";
//			String ProductInforMationEntities = "entities";
//			String ProductInforMationPaymentNum = "paymentNum";
//			String ProductInforMationPayment = "payment";
//			String ProductInforMationProdCode = "prodCode";
//			String ProductInforMationProdName = "prodName";
//			int ProductInforMationID=Integer.parseInt(ProductInforMationTextField.getText());
//
//			String ProductInforMationPaymentNumText = ApiHandler_OneTouchCredit_1920x1081.ProductInforMation(ProductInforMationStoreId,ProductInforMationGoodsCategoryId,ProductInforMationSearchTypeId,
//			       ProductInforMationProductTypeId,ProductInforMationPrice,ProductInforMationFirstPay,ProductInforMationIsWallet,UserID,UserPassword,""+ProductInforMationData+"."+ProductInforMationEntities+"",""+ProductInforMationPaymentNum+"[0]");
//			
//			String ProductInforMationPaymentText = ApiHandler_OneTouchCredit_1920x1081.ProductInforMation(ProductInforMationStoreId,ProductInforMationGoodsCategoryId,ProductInforMationSearchTypeId,
//				   ProductInforMationProductTypeId,ProductInforMationPrice,ProductInforMationFirstPay,ProductInforMationIsWallet,UserID,UserPassword,""+ProductInforMationData+"."+ProductInforMationEntities+"",""+ProductInforMationPayment+"[0]");
//			
//			String ProductInforMationProdCodeText = ApiHandler_OneTouchCredit_1920x1081.ProductInforMation(ProductInforMationStoreId,ProductInforMationGoodsCategoryId,ProductInforMationSearchTypeId,
//			       ProductInforMationProductTypeId,ProductInforMationPrice,ProductInforMationFirstPay,ProductInforMationIsWallet,UserID,UserPassword,""+ProductInforMationData+"."+ProductInforMationEntities+"",""+ProductInforMationProdCode+"[0]");
//
//			String ProductInforMationProdNameText = ApiHandler_OneTouchCredit_1920x1081.ProductInforMation(ProductInforMationStoreId,ProductInforMationGoodsCategoryId,ProductInforMationSearchTypeId,
//				   ProductInforMationProductTypeId,ProductInforMationPrice,ProductInforMationFirstPay,ProductInforMationIsWallet,UserID,UserPassword,""+ProductInforMationData+"."+ProductInforMationEntities+"",""+ProductInforMationProdName+"[0]");
//			
//
//            String ProductInforMationPaymentNumText1 = ApiHandler_OneTouchCredit_1920x1081.ProductInforMation(ProductInforMationStoreId,ProductInforMationGoodsCategoryId,ProductInforMationSearchTypeId,
//			       ProductInforMationProductTypeId,ProductInforMationPrice,ProductInforMationFirstPay,ProductInforMationIsWallet,UserID,UserPassword,""+ProductInforMationData+"."+ProductInforMationEntities+"",""+ProductInforMationPaymentNum+"[1]");
//			
//			String ProductInforMationPaymentText1 = ApiHandler_OneTouchCredit_1920x1081.ProductInforMation(ProductInforMationStoreId,ProductInforMationGoodsCategoryId,ProductInforMationSearchTypeId,
//				   ProductInforMationProductTypeId,ProductInforMationPrice,ProductInforMationFirstPay,ProductInforMationIsWallet,UserID,UserPassword,""+ProductInforMationData+"."+ProductInforMationEntities+"",""+ProductInforMationPayment+"[1]");
//			
//			String ProductInforMationProdCodeText1 = ApiHandler_OneTouchCredit_1920x1081.ProductInforMation(ProductInforMationStoreId,ProductInforMationGoodsCategoryId,ProductInforMationSearchTypeId,
//			       ProductInforMationProductTypeId,ProductInforMationPrice,ProductInforMationFirstPay,ProductInforMationIsWallet,UserID,UserPassword,""+ProductInforMationData+"."+ProductInforMationEntities+"",""+ProductInforMationProdCode+"[1]");
//
//			String ProductInforMationProdNameText1 = ApiHandler_OneTouchCredit_1920x1081.ProductInforMation(ProductInforMationStoreId,ProductInforMationGoodsCategoryId,ProductInforMationSearchTypeId,
//				   ProductInforMationProductTypeId,ProductInforMationPrice,ProductInforMationFirstPay,ProductInforMationIsWallet,UserID,UserPassword,""+ProductInforMationData+"."+ProductInforMationEntities+"",""+ProductInforMationProdName+"[1]");
//
//			String ProductInforMationPaymentNumText2 = ApiHandler_OneTouchCredit_1920x1081.ProductInforMation(ProductInforMationStoreId,ProductInforMationGoodsCategoryId,ProductInforMationSearchTypeId,
//				   ProductInforMationProductTypeId,ProductInforMationPrice,ProductInforMationFirstPay,ProductInforMationIsWallet,UserID,UserPassword,""+ProductInforMationData+"."+ProductInforMationEntities+"",""+ProductInforMationPaymentNum+"[2]");
//				
//			String ProductInforMationPaymentText2 = ApiHandler_OneTouchCredit_1920x1081.ProductInforMation(ProductInforMationStoreId,ProductInforMationGoodsCategoryId,ProductInforMationSearchTypeId,
//				   ProductInforMationProductTypeId,ProductInforMationPrice,ProductInforMationFirstPay,ProductInforMationIsWallet,UserID,UserPassword,""+ProductInforMationData+"."+ProductInforMationEntities+"",""+ProductInforMationPayment+"[2]");
//				
//			String ProductInforMationProdCodeText2 = ApiHandler_OneTouchCredit_1920x1081.ProductInforMation(ProductInforMationStoreId,ProductInforMationGoodsCategoryId,ProductInforMationSearchTypeId,
//			       ProductInforMationProductTypeId,ProductInforMationPrice,ProductInforMationFirstPay,ProductInforMationIsWallet,UserID,UserPassword,""+ProductInforMationData+"."+ProductInforMationEntities+"",""+ProductInforMationProdCode+"[2]");
//
//			String ProductInforMationProdNameText2 = ApiHandler_OneTouchCredit_1920x1081.ProductInforMation(ProductInforMationStoreId,ProductInforMationGoodsCategoryId,ProductInforMationSearchTypeId,
//				   ProductInforMationProductTypeId,ProductInforMationPrice,ProductInforMationFirstPay,ProductInforMationIsWallet,UserID,UserPassword,""+ProductInforMationData+"."+ProductInforMationEntities+"",""+ProductInforMationProdName+"[2]");
//			
//			String ProductInforMationPaymentNumText3 = ApiHandler_OneTouchCredit_1920x1081.ProductInforMation(ProductInforMationStoreId,ProductInforMationGoodsCategoryId,ProductInforMationSearchTypeId,
//				  ProductInforMationProductTypeId,ProductInforMationPrice,ProductInforMationFirstPay,ProductInforMationIsWallet,UserID,UserPassword,""+ProductInforMationData+"."+ProductInforMationEntities+"",""+ProductInforMationPaymentNum+"[3]");
//					
//			String ProductInforMationPaymentText3 = ApiHandler_OneTouchCredit_1920x1081.ProductInforMation(ProductInforMationStoreId,ProductInforMationGoodsCategoryId,ProductInforMationSearchTypeId,
//				  ProductInforMationProductTypeId,ProductInforMationPrice,ProductInforMationFirstPay,ProductInforMationIsWallet,UserID,UserPassword,""+ProductInforMationData+"."+ProductInforMationEntities+"",""+ProductInforMationPayment+"[3]");
//					
//			String ProductInforMationProdCodeText3 = ApiHandler_OneTouchCredit_1920x1081.ProductInforMation(ProductInforMationStoreId,ProductInforMationGoodsCategoryId,ProductInforMationSearchTypeId,
//				   ProductInforMationProductTypeId,ProductInforMationPrice,ProductInforMationFirstPay,ProductInforMationIsWallet,UserID,UserPassword,""+ProductInforMationData+"."+ProductInforMationEntities+"",""+ProductInforMationProdCode+"[3]");
//
//			String ProductInforMationProdNameText3 = ApiHandler_OneTouchCredit_1920x1081.ProductInforMation(ProductInforMationStoreId,ProductInforMationGoodsCategoryId,ProductInforMationSearchTypeId,
//				   ProductInforMationProductTypeId,ProductInforMationPrice,ProductInforMationFirstPay,ProductInforMationIsWallet,UserID,UserPassword,""+ProductInforMationData+"."+ProductInforMationEntities+"",""+ProductInforMationProdName+"[3]");
//   
//			String ProductInforMationPaymentNumText4 = ApiHandler_OneTouchCredit_1920x1081.ProductInforMation(ProductInforMationStoreId,ProductInforMationGoodsCategoryId,ProductInforMationSearchTypeId,
//				   ProductInforMationProductTypeId,ProductInforMationPrice,ProductInforMationFirstPay,ProductInforMationIsWallet,UserID,UserPassword,""+ProductInforMationData+"."+ProductInforMationEntities+"",""+ProductInforMationPaymentNum+"[4]");
//						
//			String ProductInforMationPaymentText4 = ApiHandler_OneTouchCredit_1920x1081.ProductInforMation(ProductInforMationStoreId,ProductInforMationGoodsCategoryId,ProductInforMationSearchTypeId,
//				   ProductInforMationProductTypeId,ProductInforMationPrice,ProductInforMationFirstPay,ProductInforMationIsWallet,UserID,UserPassword,""+ProductInforMationData+"."+ProductInforMationEntities+"",""+ProductInforMationPayment+"[4]");
//						
//			String ProductInforMationProdCodeText4 = ApiHandler_OneTouchCredit_1920x1081.ProductInforMation(ProductInforMationStoreId,ProductInforMationGoodsCategoryId,ProductInforMationSearchTypeId,
//				   ProductInforMationProductTypeId,ProductInforMationPrice,ProductInforMationFirstPay,ProductInforMationIsWallet,UserID,UserPassword,""+ProductInforMationData+"."+ProductInforMationEntities+"",""+ProductInforMationProdCode+"[4]");
//
//			String ProductInforMationProdNameText4 = ApiHandler_OneTouchCredit_1920x1081.ProductInforMation(ProductInforMationStoreId,ProductInforMationGoodsCategoryId,ProductInforMationSearchTypeId,
//				   ProductInforMationProductTypeId,ProductInforMationPrice,ProductInforMationFirstPay,ProductInforMationIsWallet,UserID,UserPassword,""+ProductInforMationData+"."+ProductInforMationEntities+"",""+ProductInforMationProdName+"[4]");
//			
//			String ProductInforMationPaymentNumText5 = ApiHandler_OneTouchCredit_1920x1081.ProductInforMation(ProductInforMationStoreId,ProductInforMationGoodsCategoryId,ProductInforMationSearchTypeId,
//				   ProductInforMationProductTypeId,ProductInforMationPrice,ProductInforMationFirstPay,ProductInforMationIsWallet,UserID,UserPassword,""+ProductInforMationData+"."+ProductInforMationEntities+"",""+ProductInforMationPaymentNum+"[5]");
//						
//			String ProductInforMationPaymentText5 = ApiHandler_OneTouchCredit_1920x1081.ProductInforMation(ProductInforMationStoreId,ProductInforMationGoodsCategoryId,ProductInforMationSearchTypeId,
//				   ProductInforMationProductTypeId,ProductInforMationPrice,ProductInforMationFirstPay,ProductInforMationIsWallet,UserID,UserPassword,""+ProductInforMationData+"."+ProductInforMationEntities+"",""+ProductInforMationPayment+"[5]");
//						
//			String ProductInforMationProdCodeText5 = ApiHandler_OneTouchCredit_1920x1081.ProductInforMation(ProductInforMationStoreId,ProductInforMationGoodsCategoryId,ProductInforMationSearchTypeId,
//				   ProductInforMationProductTypeId,ProductInforMationPrice,ProductInforMationFirstPay,ProductInforMationIsWallet,UserID,UserPassword,""+ProductInforMationData+"."+ProductInforMationEntities+"",""+ProductInforMationProdCode+"[5]");
//
//			String ProductInforMationProdNameText5 = ApiHandler_OneTouchCredit_1920x1081.ProductInforMation(ProductInforMationStoreId,ProductInforMationGoodsCategoryId,ProductInforMationSearchTypeId,
//			       ProductInforMationProductTypeId,ProductInforMationPrice,ProductInforMationFirstPay,ProductInforMationIsWallet,UserID,UserPassword,""+ProductInforMationData+"."+ProductInforMationEntities+"",""+ProductInforMationProdName+"[5]");
//			
//            String ProductInforMationText = ProductInforMationPaymentNumText+"--->"+ProductInforMationPaymentText+"--->"+ProductInforMationProdCodeText+"--->"+ProductInforMationProdNameText;
//            String ProductInforMationText1 = ProductInforMationPaymentNumText1+"--->"+ProductInforMationPaymentText1+"--->"+ProductInforMationProdCodeText1+"--->"+ProductInforMationProdNameText1;
//            String ProductInforMationText2 = ProductInforMationPaymentNumText2+"--->"+ProductInforMationPaymentText2+"--->"+ProductInforMationProdCodeText2+"--->"+ProductInforMationProdNameText2;
//            String ProductInforMationText3 = ProductInforMationPaymentNumText3+"--->"+ProductInforMationPaymentText3+"--->"+ProductInforMationProdCodeText3+"--->"+ProductInforMationProdNameText3;
//            String ProductInforMationText4 = ProductInforMationPaymentNumText4+"--->"+ProductInforMationPaymentText4+"--->"+ProductInforMationProdCodeText4+"--->"+ProductInforMationProdNameText4;
//            String ProductInforMationText5 = ProductInforMationPaymentNumText5+"--->"+ProductInforMationPaymentText5+"--->"+ProductInforMationProdCodeText5+"--->"+ProductInforMationProdNameText5;
//			
//            DefinitionBox(ProductInforMationBox, 200, 220, 520, 25,ProductInforMationID,ProductInforMationText,ProductInforMationText1,ProductInforMationText2,ProductInforMationText3,ProductInforMationText4,ProductInforMationText5,
//            		null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null);	    	

            //----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
            TypeBoundGoodsButton = new JButton("类型绑定商品小类查询");
            TypeBoundGoodsButton.setBounds(10, 225, 152, 22);
            TypeBoundGoodsButton.setFont(Constants.BASIC_FONT6);
	    	MainPanel.add(TypeBoundGoodsButton);

	    	TypeBoundGoodsGoodsTypeIdTextField = new JTextField();
	    	TypeBoundGoodsGoodsTypeIdTextField.setBounds(170, 225, 125, 21);
	    	TypeBoundGoodsGoodsTypeIdTextField.setBorder(Constants.LIGHT_GRAY_BORDER);
	    	TypeBoundGoodsGoodsTypeIdTextField.setText("7");
	    	TypeBoundGoodsGoodsTypeIdTextField.setFont(Constants.BASIC_FONT6);
	    	TypeBoundGoodsGoodsTypeIdTextField.setForeground(Color.GRAY); 
			MainPanel.add(TypeBoundGoodsGoodsTypeIdTextField);

	    	TypeBoundGoodsTextField = new JTextField();
	    	TypeBoundGoodsTextField.setBounds(305, 225, 140, 21);
	    	TypeBoundGoodsTextField.setBorder(Constants.LIGHT_GRAY_BORDER);
	    	TypeBoundGoodsTextField.setText("1");
	    	TypeBoundGoodsTextField.setFont(Constants.BASIC_FONT6);
	    	TypeBoundGoodsTextField.setForeground(Color.GRAY); 
			MainPanel.add(TypeBoundGoodsTextField);
			
//	    	String TypeBoundGoodsTypeId = String.valueOf(TypeBoundGoodsGoodsTypeIdTextField.getText());
//			
//			String TypeBoundGoodsData = "data";
//			String TypeBoundGoodstext = "text";
//			int TypeBoundGoodsTypeID = Integer.parseInt(TypeBoundGoodsTextField.getText());
//			
//			String TypeBoundGoodsText = ApiHandler_OneTouchCredit_1920x1081.TypeBoundGoods(TypeBoundGoodsTypeId,UserID,UserPassword,""+TypeBoundGoodsData+"."+TypeBoundGoodstext+"[0]");
//			String TypeBoundGoodsText1 = ApiHandler_OneTouchCredit_1920x1081.TypeBoundGoods(TypeBoundGoodsTypeId,UserID,UserPassword,""+TypeBoundGoodsData+"."+TypeBoundGoodstext+"[1]");
//			String TypeBoundGoodsText2 = ApiHandler_OneTouchCredit_1920x1081.TypeBoundGoods(TypeBoundGoodsTypeId,UserID,UserPassword,""+TypeBoundGoodsData+"."+TypeBoundGoodstext+"[2]");
//			String TypeBoundGoodsText3 = ApiHandler_OneTouchCredit_1920x1081.TypeBoundGoods(TypeBoundGoodsTypeId,UserID,UserPassword,""+TypeBoundGoodsData+"."+TypeBoundGoodstext+"[3]");
//			String TypeBoundGoodsText4 = ApiHandler_OneTouchCredit_1920x1081.TypeBoundGoods(TypeBoundGoodsTypeId,UserID,UserPassword,""+TypeBoundGoodsData+"."+TypeBoundGoodstext+"[4]");
//
//            DefinitionBox(TypeBoundGoodsBox, 520, 250, 200, 25,TypeBoundGoodsTypeID,TypeBoundGoodsText,TypeBoundGoodsText1,TypeBoundGoodsText2,TypeBoundGoodsText3,TypeBoundGoodsText4,null,            
//            		null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null);  
                   
            //----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
			GoodsBoundBrandsButton = new JButton("小类绑定商品品牌查询");
			GoodsBoundBrandsButton.setBounds(10, 252, 152, 22);
			GoodsBoundBrandsButton.setFont(Constants.BASIC_FONT6);
	    	MainPanel.add(GoodsBoundBrandsButton);

	    	GoodsBoundBrandsGoodsSubTypeValueTextField = new JTextField();
	    	GoodsBoundBrandsGoodsSubTypeValueTextField.setBounds(170, 252, 80, 21);
	    	GoodsBoundBrandsGoodsSubTypeValueTextField.setBorder(Constants.LIGHT_GRAY_BORDER);
	    	GoodsBoundBrandsGoodsSubTypeValueTextField.setText("21");
	    	GoodsBoundBrandsGoodsSubTypeValueTextField.setFont(Constants.BASIC_FONT6);
	    	GoodsBoundBrandsGoodsSubTypeValueTextField.setForeground(Color.GRAY); 
			MainPanel.add(GoodsBoundBrandsGoodsSubTypeValueTextField);
			
			GoodsBoundBrandsGoodsTypeIdTextField = new JTextField();
			GoodsBoundBrandsGoodsTypeIdTextField.setBounds(260, 252, 80, 21);
			GoodsBoundBrandsGoodsTypeIdTextField.setBorder(Constants.LIGHT_GRAY_BORDER);
			GoodsBoundBrandsGoodsTypeIdTextField.setText("7");
			GoodsBoundBrandsGoodsTypeIdTextField.setFont(Constants.BASIC_FONT6);
			GoodsBoundBrandsGoodsTypeIdTextField.setForeground(Color.GRAY); 
			MainPanel.add(GoodsBoundBrandsGoodsTypeIdTextField);

			GoodsBoundBrandsTextField = new JTextField();
			GoodsBoundBrandsTextField.setBounds(350, 252, 95, 21);
			GoodsBoundBrandsTextField.setBorder(Constants.LIGHT_GRAY_BORDER);
			GoodsBoundBrandsTextField.setText("1");
			GoodsBoundBrandsTextField.setFont(Constants.BASIC_FONT6);
			GoodsBoundBrandsTextField.setForeground(Color.GRAY); 
			MainPanel.add(GoodsBoundBrandsTextField);
			
//	    	String GoodsSubTypeValue = String.valueOf(GoodsBoundBrandsGoodsSubTypeValueTextField.getText());
//			String GoodsCategoryID = String.valueOf(GoodsBoundBrandsGoodsTypeIdTextField.getText());
//	    	
//			String GoodsBoundBrandsData = "data";
//			String GoodsBoundBrandstext = "text";
//			int GoodsBoundBrandsGoodsID = Integer.parseInt(GoodsBoundBrandsTextField.getText());
//			
//			String GoodsBoundBrandsText = ApiHandler_OneTouchCredit_1920x1081.GoodsBoundBrands(GoodsSubTypeValue,GoodsCategoryID,UserID,UserPassword,""+GoodsBoundBrandsData+"."+GoodsBoundBrandstext+"[0]");
//			String GoodsBoundBrandsText1 = ApiHandler_OneTouchCredit_1920x1081.GoodsBoundBrands(GoodsSubTypeValue,GoodsCategoryID,UserID,UserPassword,""+GoodsBoundBrandsData+"."+GoodsBoundBrandstext+"[1]");
//			String GoodsBoundBrandsText2 = ApiHandler_OneTouchCredit_1920x1081.GoodsBoundBrands(GoodsSubTypeValue,GoodsCategoryID,UserID,UserPassword,""+GoodsBoundBrandsData+"."+GoodsBoundBrandstext+"[2]");
//			String GoodsBoundBrandsText3 = ApiHandler_OneTouchCredit_1920x1081.GoodsBoundBrands(GoodsSubTypeValue,GoodsCategoryID,UserID,UserPassword,""+GoodsBoundBrandsData+"."+GoodsBoundBrandstext+"[3]");
//			String GoodsBoundBrandsText4 = ApiHandler_OneTouchCredit_1920x1081.GoodsBoundBrands(GoodsSubTypeValue,GoodsCategoryID,UserID,UserPassword,""+GoodsBoundBrandsData+"."+GoodsBoundBrandstext+"[4]");
//			String GoodsBoundBrandsText5 = ApiHandler_OneTouchCredit_1920x1081.GoodsBoundBrands(GoodsSubTypeValue,GoodsCategoryID,UserID,UserPassword,""+GoodsBoundBrandsData+"."+GoodsBoundBrandstext+"[5]");
//			String GoodsBoundBrandsText6 = ApiHandler_OneTouchCredit_1920x1081.GoodsBoundBrands(GoodsSubTypeValue,GoodsCategoryID,UserID,UserPassword,""+GoodsBoundBrandsData+"."+GoodsBoundBrandstext+"[6]");
//			String GoodsBoundBrandsText7 = ApiHandler_OneTouchCredit_1920x1081.GoodsBoundBrands(GoodsSubTypeValue,GoodsCategoryID,UserID,UserPassword,""+GoodsBoundBrandsData+"."+GoodsBoundBrandstext+"[7]");
//			String GoodsBoundBrandsText8 = ApiHandler_OneTouchCredit_1920x1081.GoodsBoundBrands(GoodsSubTypeValue,GoodsCategoryID,UserID,UserPassword,""+GoodsBoundBrandsData+"."+GoodsBoundBrandstext+"[8]");
//			String GoodsBoundBrandsText9 = ApiHandler_OneTouchCredit_1920x1081.GoodsBoundBrands(GoodsSubTypeValue,GoodsCategoryID,UserID,UserPassword,""+GoodsBoundBrandsData+"."+GoodsBoundBrandstext+"[9]");
//			String GoodsBoundBrandsText10 = ApiHandler_OneTouchCredit_1920x1081.GoodsBoundBrands(GoodsSubTypeValue,GoodsCategoryID,UserID,UserPassword,""+GoodsBoundBrandsData+"."+GoodsBoundBrandstext+"[10]");
//			String GoodsBoundBrandsText11= ApiHandler_OneTouchCredit_1920x1081.GoodsBoundBrands(GoodsSubTypeValue,GoodsCategoryID,UserID,UserPassword,""+GoodsBoundBrandsData+"."+GoodsBoundBrandstext+"[11]");
//			String GoodsBoundBrandsText12 = ApiHandler_OneTouchCredit_1920x1081.GoodsBoundBrands(GoodsSubTypeValue,GoodsCategoryID,UserID,UserPassword,""+GoodsBoundBrandsData+"."+GoodsBoundBrandstext+"[12]");
//			String GoodsBoundBrandsText13 = ApiHandler_OneTouchCredit_1920x1081.GoodsBoundBrands(GoodsSubTypeValue,GoodsCategoryID,UserID,UserPassword,""+GoodsBoundBrandsData+"."+GoodsBoundBrandstext+"[13]");
//			String GoodsBoundBrandsText14 = ApiHandler_OneTouchCredit_1920x1081.GoodsBoundBrands(GoodsSubTypeValue,GoodsCategoryID,UserID,UserPassword,""+GoodsBoundBrandsData+"."+GoodsBoundBrandstext+"[14]");
//			String GoodsBoundBrandsText15 = ApiHandler_OneTouchCredit_1920x1081.GoodsBoundBrands(GoodsSubTypeValue,GoodsCategoryID,UserID,UserPassword,""+GoodsBoundBrandsData+"."+GoodsBoundBrandstext+"[15]");
//			String GoodsBoundBrandsText16 = ApiHandler_OneTouchCredit_1920x1081.GoodsBoundBrands(GoodsSubTypeValue,GoodsCategoryID,UserID,UserPassword,""+GoodsBoundBrandsData+"."+GoodsBoundBrandstext+"[16]");
//			String GoodsBoundBrandsText17 = ApiHandler_OneTouchCredit_1920x1081.GoodsBoundBrands(GoodsSubTypeValue,GoodsCategoryID,UserID,UserPassword,""+GoodsBoundBrandsData+"."+GoodsBoundBrandstext+"[17]");
//			String GoodsBoundBrandsText18 = ApiHandler_OneTouchCredit_1920x1081.GoodsBoundBrands(GoodsSubTypeValue,GoodsCategoryID,UserID,UserPassword,""+GoodsBoundBrandsData+"."+GoodsBoundBrandstext+"[18]");
//			String GoodsBoundBrandsText19 = ApiHandler_OneTouchCredit_1920x1081.GoodsBoundBrands(GoodsSubTypeValue,GoodsCategoryID,UserID,UserPassword,""+GoodsBoundBrandsData+"."+GoodsBoundBrandstext+"[19]");
//			String GoodsBoundBrandsText20 = ApiHandler_OneTouchCredit_1920x1081.GoodsBoundBrands(GoodsSubTypeValue,GoodsCategoryID,UserID,UserPassword,""+GoodsBoundBrandsData+"."+GoodsBoundBrandstext+"[20]");
//			String GoodsBoundBrandsText21 = ApiHandler_OneTouchCredit_1920x1081.GoodsBoundBrands(GoodsSubTypeValue,GoodsCategoryID,UserID,UserPassword,""+GoodsBoundBrandsData+"."+GoodsBoundBrandstext+"[21]");
//			String GoodsBoundBrandsText22 = ApiHandler_OneTouchCredit_1920x1081.GoodsBoundBrands(GoodsSubTypeValue,GoodsCategoryID,UserID,UserPassword,""+GoodsBoundBrandsData+"."+GoodsBoundBrandstext+"[22]");
//			String GoodsBoundBrandsText23 = ApiHandler_OneTouchCredit_1920x1081.GoodsBoundBrands(GoodsSubTypeValue,GoodsCategoryID,UserID,UserPassword,""+GoodsBoundBrandsData+"."+GoodsBoundBrandstext+"[23]");
//			String GoodsBoundBrandsText24 = ApiHandler_OneTouchCredit_1920x1081.GoodsBoundBrands(GoodsSubTypeValue,GoodsCategoryID,UserID,UserPassword,""+GoodsBoundBrandsData+"."+GoodsBoundBrandstext+"[24]");
//			String GoodsBoundBrandsText25 = ApiHandler_OneTouchCredit_1920x1081.GoodsBoundBrands(GoodsSubTypeValue,GoodsCategoryID,UserID,UserPassword,""+GoodsBoundBrandsData+"."+GoodsBoundBrandstext+"[25]");
//			String GoodsBoundBrandsText26 = ApiHandler_OneTouchCredit_1920x1081.GoodsBoundBrands(GoodsSubTypeValue,GoodsCategoryID,UserID,UserPassword,""+GoodsBoundBrandsData+"."+GoodsBoundBrandstext+"[26]");			
//            
////			DefinitionBox(GoodsBoundBrandsBox, 520, 280, 200, 25,GoodsBoundBrandsGoodsID,GoodsBoundBrandsText,GoodsBoundBrandsText1,GoodsBoundBrandsText2,GoodsBoundBrandsText3,GoodsBoundBrandsText4,GoodsBoundBrandsText5,            
////            		GoodsBoundBrandsText6,GoodsBoundBrandsText7,GoodsBoundBrandsText8,GoodsBoundBrandsText9,GoodsBoundBrandsText10,GoodsBoundBrandsText11,GoodsBoundBrandsText12,GoodsBoundBrandsText13,GoodsBoundBrandsText14,
////            		GoodsBoundBrandsText15,GoodsBoundBrandsText16,GoodsBoundBrandsText17,GoodsBoundBrandsText18,GoodsBoundBrandsText19,GoodsBoundBrandsText20,GoodsBoundBrandsText21,GoodsBoundBrandsText22,GoodsBoundBrandsText23,
////            		GoodsBoundBrandsText24,GoodsBoundBrandsText25,GoodsBoundBrandsText26);           
//			GoodsBoundBrandsBox = new JComboBox();  
//			GoodsBoundBrandsBox.addItem(GoodsBoundBrandsText);  
//			GoodsBoundBrandsBox.addItem(GoodsBoundBrandsText1);  
//			GoodsBoundBrandsBox.addItem(GoodsBoundBrandsText2);  
//			GoodsBoundBrandsBox.addItem(GoodsBoundBrandsText3);
//			GoodsBoundBrandsBox.addItem(GoodsBoundBrandsText4);
//			GoodsBoundBrandsBox.addItem(GoodsBoundBrandsText5);
//			GoodsBoundBrandsBox.addItem(GoodsBoundBrandsText6);
//			GoodsBoundBrandsBox.addItem(GoodsBoundBrandsText7);
//			GoodsBoundBrandsBox.addItem(GoodsBoundBrandsText8);
//			GoodsBoundBrandsBox.addItem(GoodsBoundBrandsText9);
//			GoodsBoundBrandsBox.addItem(GoodsBoundBrandsText10);
//			GoodsBoundBrandsBox.addItem(GoodsBoundBrandsText11);
//			GoodsBoundBrandsBox.addItem(GoodsBoundBrandsText12);
//			GoodsBoundBrandsBox.addItem(GoodsBoundBrandsText13);
//			GoodsBoundBrandsBox.addItem(GoodsBoundBrandsText14);
//			GoodsBoundBrandsBox.addItem(GoodsBoundBrandsText15);
//			GoodsBoundBrandsBox.addItem(GoodsBoundBrandsText16);
//			GoodsBoundBrandsBox.addItem(GoodsBoundBrandsText17);
//			GoodsBoundBrandsBox.addItem(GoodsBoundBrandsText18);
//			GoodsBoundBrandsBox.addItem(GoodsBoundBrandsText19);
//			GoodsBoundBrandsBox.addItem(GoodsBoundBrandsText20);
//			GoodsBoundBrandsBox.addItem(GoodsBoundBrandsText21);
//			GoodsBoundBrandsBox.addItem(GoodsBoundBrandsText22);
//			GoodsBoundBrandsBox.addItem(GoodsBoundBrandsText23);
//			GoodsBoundBrandsBox.addItem(GoodsBoundBrandsText24);
//			GoodsBoundBrandsBox.addItem(GoodsBoundBrandsText25);
//			GoodsBoundBrandsBox.addItem(GoodsBoundBrandsText26);
//			GoodsBoundBrandsBox.setFont(Constants.BASIC_FONT3);
//	        GoodsBoundBrandsBox.setBounds(520, 280, 200, 22);
//	        GoodsBoundBrandsBox.setSelectedIndex(GoodsBoundBrandsGoodsID-1);
//			MainPanel.add(GoodsBoundBrandsBox); 
			
			DefinitionJLabel1(CreateCredit,
			"***"
			+ " ---------------------------------"
			+ "『 保 存 订 单 参 数 』"
			+ "----------------------------------"+
			"***",11, 290, 800, 20);
			
            DefinitionJLabel(Model,"商品型号",11, 320, 200, 20);
			ModelTextField = new JTextField();
			ModelTextField.setBounds(140, 318, 140, 22);
			ModelTextField.setBorder(Constants.LIGHT_GRAY_BORDER);
			ModelTextField.setText("Galaxy C8");
			ModelTextField.setFont(Constants.BASIC_FONT6);
	    	ModelTextField.setForeground(Color.GRAY); 
			MainPanel.add(ModelTextField);

			DefinitionJLabel(HealthFee,"医疗费",11, 320+25, 200, 20);
			HealthFeeTextField = new JTextField();
			HealthFeeTextField.setBounds(140, 318+25, 140, 22);
			HealthFeeTextField.setBorder(Constants.LIGHT_GRAY_BORDER);
			HealthFeeTextField.setText("0");
			HealthFeeTextField.setFont(Constants.BASIC_FONT6);
			HealthFeeTextField.setForeground(Color.GRAY); 
			MainPanel.add(HealthFeeTextField);
			
			DefinitionJLabel(SecureFee,"安全费",11, 320+50, 200, 20);
			SecureFeeTextField = new JTextField();
			SecureFeeTextField.setBounds(140, 318+50, 140, 22);
			SecureFeeTextField.setBorder(Constants.LIGHT_GRAY_BORDER);
			SecureFeeTextField.setText("0");
			SecureFeeTextField.setFont(Constants.BASIC_FONT6);
			SecureFeeTextField.setForeground(Color.GRAY); 
			MainPanel.add(SecureFeeTextField);
			
			DefinitionJLabel(ComprehensiveInsuranceFee,"综合保险费",11, 320+75, 200, 20);
			ComprehensiveInsuranceFeeTextField = new JTextField();
			ComprehensiveInsuranceFeeTextField.setBounds(140, 318+75, 140, 22);
			ComprehensiveInsuranceFeeTextField.setBorder(Constants.LIGHT_GRAY_BORDER);
			ComprehensiveInsuranceFeeTextField.setText("1");
			ComprehensiveInsuranceFeeTextField.setFont(Constants.BASIC_FONT6);
			ComprehensiveInsuranceFeeTextField.setForeground(Color.GRAY); 
			MainPanel.add(ComprehensiveInsuranceFeeTextField);
			
			DefinitionJLabel(Information,"信息",11, 320+100, 200, 20);
			InformationTextField = new JTextField();
			InformationTextField.setBounds(140, 318+100, 140, 22);
			InformationTextField.setBorder(Constants.LIGHT_GRAY_BORDER);
			InformationTextField.setText("1");
			InformationTextField.setFont(Constants.BASIC_FONT6);
			InformationTextField.setForeground(Color.GRAY); 
			MainPanel.add(InformationTextField);
			
			DefinitionJLabel(GoodsLocationNumber,"货位号",11, 320+125, 200, 20);
			GoodsLocationNumberTextField = new JTextField();
			GoodsLocationNumberTextField.setBounds(140, 318+125, 140, 22);
			GoodsLocationNumberTextField.setBorder(Constants.LIGHT_GRAY_BORDER);
			GoodsLocationNumberTextField.setText("1");
			GoodsLocationNumberTextField.setFont(Constants.BASIC_FONT6);
			GoodsLocationNumberTextField.setForeground(Color.GRAY); 
			MainPanel.add(GoodsLocationNumberTextField);
			
			DefinitionJLabel(IsCarryWifi,"是否WIFI热点城市",11, 320+150, 200, 20);
			IsCarryWifiTextField = new JTextField();
			IsCarryWifiTextField.setBounds(140, 318+150, 140, 22);
			IsCarryWifiTextField.setBorder(Constants.LIGHT_GRAY_BORDER);
			IsCarryWifiTextField.setText("0");
			IsCarryWifiTextField.setFont(Constants.BASIC_FONT6);
			IsCarryWifiTextField.setForeground(Color.GRAY); 
			MainPanel.add(IsCarryWifiTextField);
			
			DefinitionJLabel(IsStudent,"是否学生产品",11, 320+175, 200, 20);
			IsStudentTextField = new JTextField();
			IsStudentTextField.setBounds(140, 318+175, 140, 22);
			IsStudentTextField.setBorder(Constants.LIGHT_GRAY_BORDER);
			IsStudentTextField.setText("false");
			IsStudentTextField.setFont(Constants.BASIC_FONT6);
			IsStudentTextField.setForeground(Color.GRAY); 
			MainPanel.add(IsStudentTextField);
			
			DefinitionJLabel(InsuranceFlag,"是否购买保险",11, 320+200, 200, 20);
			InsuranceFlagTextField = new JTextField();
			InsuranceFlagTextField.setBounds(140, 318+200, 140, 22);
			InsuranceFlagTextField.setBorder(Constants.LIGHT_GRAY_BORDER);
			InsuranceFlagTextField.setText("1");
			InsuranceFlagTextField.setFont(Constants.BASIC_FONT6);
			InsuranceFlagTextField.setForeground(Color.GRAY); 
			MainPanel.add(InsuranceFlagTextField);
			
			DefinitionJLabel(InsuranceFee,"保险费",11, 320+225, 200, 20);
			InsuranceFeeTextField = new JTextField();
			InsuranceFeeTextField.setBounds(140, 318+225, 140, 22);
			InsuranceFeeTextField.setBorder(Constants.LIGHT_GRAY_BORDER);
			InsuranceFeeTextField.setText("27");
			InsuranceFeeTextField.setFont(Constants.BASIC_FONT6);
			InsuranceFeeTextField.setForeground(Color.GRAY); 
			MainPanel.add(InsuranceFeeTextField);
			
			DefinitionJLabel(TreasureChestFlag,"是否购买百宝箱",11, 320+250, 200, 20);
			TreasureChestFlagTextField = new JTextField();
			TreasureChestFlagTextField.setBounds(140, 318+250, 140, 22);
			TreasureChestFlagTextField.setBorder(Constants.LIGHT_GRAY_BORDER);
			TreasureChestFlagTextField.setText("1");
			TreasureChestFlagTextField.setFont(Constants.BASIC_FONT6);
			TreasureChestFlagTextField.setForeground(Color.GRAY); 
			MainPanel.add(TreasureChestFlagTextField);
			
			DefinitionJLabel(TreasureChestFee,"百宝箱费",11, 320+275, 200, 20);
			TreasureChestFeeTextField = new JTextField();
			TreasureChestFeeTextField.setBounds(140, 318+275, 140, 22);
			TreasureChestFeeTextField.setBorder(Constants.LIGHT_GRAY_BORDER);
			TreasureChestFeeTextField.setText("48");
			TreasureChestFeeTextField.setFont(Constants.BASIC_FONT6);
			TreasureChestFeeTextField.setForeground(Color.GRAY); 
			MainPanel.add(TreasureChestFeeTextField);
			
			DefinitionJLabel(ShoppingCouponsFee,"商城赠券费",300, 320+225, 200, 20);
			ShoppingCouponsFeeTextField = new JTextField();
			ShoppingCouponsFeeTextField.setBounds(408, 318+225, 200, 22);
			ShoppingCouponsFeeTextField.setBorder(Constants.LIGHT_GRAY_BORDER);
			ShoppingCouponsFeeTextField.setText("300");
			ShoppingCouponsFeeTextField.setFont(Constants.BASIC_FONT6);
			ShoppingCouponsFeeTextField.setForeground(Color.GRAY); 
			MainPanel.add(ShoppingCouponsFeeTextField);
			
			DefinitionJLabel(PowerFlag,"是否购买全面保",300, 320+250, 200, 20);
			PowerFlagTextField = new JTextField();
			PowerFlagTextField.setBounds(408, 318+250, 200, 22);
			PowerFlagTextField.setBorder(Constants.LIGHT_GRAY_BORDER);
			PowerFlagTextField.setText("0");
			PowerFlagTextField.setFont(Constants.BASIC_FONT6);
			PowerFlagTextField.setForeground(Color.GRAY); 
			MainPanel.add(PowerFlagTextField);
			
			DefinitionJLabel(PowerFee,"全面保费",300, 320+275, 200, 20);
			PowerFeeTextField = new JTextField();
			PowerFeeTextField.setBounds(408, 318+275, 200, 22);
			PowerFeeTextField.setBorder(Constants.LIGHT_GRAY_BORDER);
			PowerFeeTextField.setText("0");
			PowerFeeTextField.setFont(Constants.BASIC_FONT6);
			PowerFeeTextField.setForeground(Color.GRAY); 
			MainPanel.add(PowerFeeTextField);
			
//			DefinitionJLabel(ProductCode,"分期产品代码",11, 320+450, 200, 20);
//			ProductCodeTextField = new JTextField();
//			ProductCodeTextField.setBounds(160, 318+450, 140, 22);
//			ProductCodeTextField.setBorder(Constants.LIGHT_GRAY_BORDER);
//			ProductCodeTextField.setText("BN_MOB5_Ed");
//			ProductCodeTextField.setFont(Constants.BASIC_FONT6);
//			ProductCodeTextField.setForeground(Color.GRAY); 
//			MainPanel.add(ProductCodeTextField);
			
			//-----------------------------------------------------------------------------------
            DefinitionJLabel(UserName,"姓名",300, 320, 140, 20);
			UserNameTextField = new JTextField();
			UserNameTextField.setBounds(408, 318, 200, 22);
			UserNameTextField.setBorder(Constants.LIGHT_GRAY_BORDER);
			UserNameTextField.setText("自动提单");
			UserNameTextField.setFont(Constants.BASIC_FONT6);
			UserNameTextField.setForeground(Color.GRAY); 
			MainPanel.add(UserNameTextField);
			
			DefinitionJLabel(NationalId,"民族",300, 320+25, 200, 20);
			NationalIdTextField = new JTextField();
			NationalIdTextField.setBounds(408, 318+25, 200, 22);
			NationalIdTextField.setBorder(Constants.LIGHT_GRAY_BORDER);
			NationalIdTextField.setText("汉");
			NationalIdTextField.setFont(Constants.BASIC_FONT6);
			NationalIdTextField.setForeground(Color.GRAY); 
			MainPanel.add(NationalIdTextField);
			
			DefinitionJLabel(IdentNo,"身份证号码",300, 320+50, 200, 20);
			IdentNoTextField = new JTextField();
			IdentNoTextField.setBounds(408, 318+50, 200, 22);
			IdentNoTextField.setBorder(Constants.LIGHT_GRAY_BORDER);
			IdentNoTextField.setText("141023198202231927");
			IdentNoTextField.setFont(Constants.BASIC_FONT6);
			IdentNoTextField.setForeground(Color.GRAY); 
			MainPanel.add(IdentNoTextField);
			
			DefinitionJLabel(IdentPhoneBack,"身份证正面照",300, 320+75, 200, 20);
			IdentPhoneBackTextField = new JTextField();
			IdentPhoneBackTextField.setBounds(408, 318+75, 200, 22);
			IdentPhoneBackTextField.setBorder(Constants.LIGHT_GRAY_BORDER);
			IdentPhoneBackTextField.setText("iVBORw0KGgoAAAANSUhEUgAAAC8AAAAlCAIAAABd3iedAAAGNElEQVRYCe3YS0+VSRAGYOEAgiCgIjKKoJJMNMKgxojREMPSy0KXbtgYd/6PSUx04w9wo8lsjDHeEheiizFR4ySDC3UIElSuQuSi3A8zz6GHb45+cPBMTJzF9KKtr7q66u23qrqP5Pzc1rFqcVSWFOQsyt/l39zvEnW5oP8tNHnLwaRP5OY0VpX+WFFcmJ8IZnNzczmL48+FQZ+bmzs7O5uXl2dOJpOrV6+mnJ+fTyQSTFJ+En9vn5pN/jH06ff+seR8Sh8fmdCA8tMPpel7IPEZZpHEBkJgyuHh4Y6Ojk+fPtXX12/atClCEIyDE6cKDn/rHU13G8mZ0GAlsgtC4AUHgn38+HF8fHzNmjVPnjx59OhRQUFBd3c3s87OzrNnzyIMXPawktP9cPtv0KS7iNCIgY+pqamrV68+ePCgv79fSCTRy5HYPT09DQ0NBw4cCCC+gMJPlPe4/89Qx5fjGlGNGzdu3Lt3DzdbtmxZv359SUnJ2rVrN2zYgCFAL1261NbWZm96muKu4prs0OBAgNu3b1+5cgUmTAwNDQkfClYGi4qKCgsL3759e/78eWY08ZBxzcIBU1OmuolvA0WVXLx4cWZmxuaJiYni4mLEsJycnPTJICAA8cKFC+QTJ07k5+cHkkLV2xj3HDTZcSPetWvXxsbGeORaTZSVleGjsrJy48aNkkUvsHwZCLt8+fLTp09p6A325uWg0GeH5tWrV9qHU8ctLy8HorS0VNSuri40bN26FSYaMqxs5FGxR+EDQ9FnXMguUw8fPgyl44iY4E4AsdEjMD5aWlrevXv34sWLN2/eIFL/P3v2TN+5gaLYcXoGi2pb61dVuQsio68RdK8Ti6FWTp48iRuyZO3Zs8elNzo6ev/+/UOHDp05c6aqqgoa5YXI9vb2dOdLMlSe7Pz1cVd2aDQLJhSspDQ2Nra2th4/fhwfevv06dNAbN68+ebNmzU1NZZwwNLsPkxHE+cmrE5O1q2QKTsN55MgbfLy5ctwst27d8sOnhBD8/79eyRVVFTs3LlTppC0f//+5uZmabKKpODEnA7rC7mvJmMV28yXEXwJL55P4Pbt2+fqkwgl7DM0FJlNXV2dyxqCU6dObd++nc2OHTvsCrFT7hbldDTJZFlTTXIFbmyw2S1nFrW2tlZ7Czk9PX39+vUPHz54BHAQOosNku7evUsPx5EjR7Zt2+YpRWQEhbAkQ4nE6OOuihXqxk4jnIagWtUNDqqrq48dO9bU1KSudZBfGlZVibuRvHfv3oMHDwLtSZdBZRQ8mCNv6cQEubpndAU00Zk4Mg4fPqx39Db+3TG3bt0ST/cqIMwxQIY7SRM9f/4ciwrIAbwVQARW2MRxBE1BwdDKmQpewplk5OjRo3fu3HFudaqNCfoIFGZY2bVr17lz59SN6vaTw6qXIT18Bm5mZioyoUmxsXiUIGBF1/T19XEKGZ6UlMT5DLciWc0GcEgCziO/4OafKk4HF8kjibqW5ixvPz0FkLLQMmLgwAyKYiLIlzmUPHCU7iQ3UxQygxBuv0zcxDc7tMoA4vXr135biU2jeN39BC+DErELPkrFq9jDCx93taQmOzQhvO71KikLCAywRMUWKDKFFaWt0eQIMTRLBk5XVk52//Jb3qq8jLdf+oZIBojsmsGQzkKD3hkYGBgcHATRb3VKQ9bckLBKXLR3ReGrOjzyErhREPhQxd4KGgnyKTDZ7SI82tw34MIa0EceMguZ0PCVPjgKFerc9H7fYMK1Kx40hn6WF8To/PB+WTLSnZDjbAUzcyY04RzBF5kQthF8qo9169YpFwWLGOGh9HiBBRPLsD0em3FYis/LLjANsW0O+wMaV5xPSzgQye/iQFW4b8hW6RmHtg97g7cQPhwmDoUmU09x6rkM2yJWeFe2Kqa3t1fFBHByxIC1boJSPIQpLHuhVECWyKG/Jmfmgs/4nAlNx/BEQ1Xq56YhqrOaVSjvykXB8p7Cu4CDkhD4AwhWsp6HmE3EEFfcLrhcYsqEpn1gHAdVBcniwtR/AEBxUD78nFDCIyMjlEDQwGEpIFY3lLAChB5KmAg04a8C3C4BZEGV8/9fk5ajJvu7eFlP32Lhsw6fnsviFv8W0b/08RcCxKV08Qfa3AAAAABJRU5ErkJggg==");
			IdentPhoneBackTextField.setFont(Constants.BASIC_FONT6);
			IdentPhoneBackTextField.setForeground(Color.GRAY); 
			MainPanel.add(IdentPhoneBackTextField);
			
			DefinitionJLabel(IdentPhoneFront,"身份证反面照",300, 320+100, 200, 20);
			IdentPhoneFrontTextField = new JTextField();
			IdentPhoneFrontTextField.setBounds(408, 318+100, 200, 22);
			IdentPhoneFrontTextField.setBorder(Constants.LIGHT_GRAY_BORDER);
			IdentPhoneFrontTextField.setText("iVBORw0KGgoAAAANSUhEUgAAAC8AAAAlCAIAAABd3iedAAAGNElEQVRYCe3YS0+VSRAGYOEAgiCgIjKKoJJMNMKgxojREMPSy0KXbtgYd/6PSUx04w9wo8lsjDHeEheiizFR4ySDC3UIElSuQuSi3A8zz6GHb45+cPBMTJzF9KKtr7q66u23qrqP5Pzc1rFqcVSWFOQsyt/l39zvEnW5oP8tNHnLwaRP5OY0VpX+WFFcmJ8IZnNzczmL48+FQZ+bmzs7O5uXl2dOJpOrV6+mnJ+fTyQSTFJ+En9vn5pN/jH06ff+seR8Sh8fmdCA8tMPpel7IPEZZpHEBkJgyuHh4Y6Ojk+fPtXX12/atClCEIyDE6cKDn/rHU13G8mZ0GAlsgtC4AUHgn38+HF8fHzNmjVPnjx59OhRQUFBd3c3s87OzrNnzyIMXPawktP9cPtv0KS7iNCIgY+pqamrV68+ePCgv79fSCTRy5HYPT09DQ0NBw4cCCC+gMJPlPe4/89Qx5fjGlGNGzdu3Lt3DzdbtmxZv359SUnJ2rVrN2zYgCFAL1261NbWZm96muKu4prs0OBAgNu3b1+5cgUmTAwNDQkfClYGi4qKCgsL3759e/78eWY08ZBxzcIBU1OmuolvA0WVXLx4cWZmxuaJiYni4mLEsJycnPTJICAA8cKFC+QTJ07k5+cHkkLV2xj3HDTZcSPetWvXxsbGeORaTZSVleGjsrJy48aNkkUvsHwZCLt8+fLTp09p6A325uWg0GeH5tWrV9qHU8ctLy8HorS0VNSuri40bN26FSYaMqxs5FGxR+EDQ9FnXMguUw8fPgyl44iY4E4AsdEjMD5aWlrevXv34sWLN2/eIFL/P3v2TN+5gaLYcXoGi2pb61dVuQsio68RdK8Ti6FWTp48iRuyZO3Zs8elNzo6ev/+/UOHDp05c6aqqgoa5YXI9vb2dOdLMlSe7Pz1cVd2aDQLJhSspDQ2Nra2th4/fhwfevv06dNAbN68+ebNmzU1NZZwwNLsPkxHE+cmrE5O1q2QKTsN55MgbfLy5ctwst27d8sOnhBD8/79eyRVVFTs3LlTppC0f//+5uZmabKKpODEnA7rC7mvJmMV28yXEXwJL55P4Pbt2+fqkwgl7DM0FJlNXV2dyxqCU6dObd++nc2OHTvsCrFT7hbldDTJZFlTTXIFbmyw2S1nFrW2tlZ7Czk9PX39+vUPHz54BHAQOosNku7evUsPx5EjR7Zt2+YpRWQEhbAkQ4nE6OOuihXqxk4jnIagWtUNDqqrq48dO9bU1KSudZBfGlZVibuRvHfv3oMHDwLtSZdBZRQ8mCNv6cQEubpndAU00Zk4Mg4fPqx39Db+3TG3bt0ST/cqIMwxQIY7SRM9f/4ciwrIAbwVQARW2MRxBE1BwdDKmQpewplk5OjRo3fu3HFudaqNCfoIFGZY2bVr17lz59SN6vaTw6qXIT18Bm5mZioyoUmxsXiUIGBF1/T19XEKGZ6UlMT5DLciWc0GcEgCziO/4OafKk4HF8kjibqW5ixvPz0FkLLQMmLgwAyKYiLIlzmUPHCU7iQ3UxQygxBuv0zcxDc7tMoA4vXr135biU2jeN39BC+DErELPkrFq9jDCx93taQmOzQhvO71KikLCAywRMUWKDKFFaWt0eQIMTRLBk5XVk52//Jb3qq8jLdf+oZIBojsmsGQzkKD3hkYGBgcHATRb3VKQ9bckLBKXLR3ReGrOjzyErhREPhQxd4KGgnyKTDZ7SI82tw34MIa0EceMguZ0PCVPjgKFerc9H7fYMK1Kx40hn6WF8To/PB+WTLSnZDjbAUzcyY04RzBF5kQthF8qo9169YpFwWLGOGh9HiBBRPLsD0em3FYis/LLjANsW0O+wMaV5xPSzgQye/iQFW4b8hW6RmHtg97g7cQPhwmDoUmU09x6rkM2yJWeFe2Kqa3t1fFBHByxIC1boJSPIQpLHuhVECWyKG/Jmfmgs/4nAlNx/BEQ1Xq56YhqrOaVSjvykXB8p7Cu4CDkhD4AwhWsp6HmE3EEFfcLrhcYsqEpn1gHAdVBcniwtR/AEBxUD78nFDCIyMjlEDQwGEpIFY3lLAChB5KmAg04a8C3C4BZEGV8/9fk5ajJvu7eFlP32Lhsw6fnsviFv8W0b/08RcCxKV08Qfa3AAAAABJRU5ErkJggg==");
			IdentPhoneFrontTextField.setFont(Constants.BASIC_FONT6);
			IdentPhoneFrontTextField.setForeground(Color.GRAY); 
			MainPanel.add(IdentPhoneFrontTextField);
			
			DefinitionJLabel(Address,"身份证所属地址",300, 320+125, 200, 20);
			Address_ProvinceTextField = new JTextField();
			Address_ProvinceTextField.setBounds(408, 318+125, 60, 22);
			Address_ProvinceTextField.setBorder(Constants.LIGHT_GRAY_BORDER);
			Address_ProvinceTextField.setText("山西");
			Address_ProvinceTextField.setFont(Constants.BASIC_FONT6);
			Address_ProvinceTextField.setForeground(Color.GRAY); 
			MainPanel.add(Address_ProvinceTextField);
			
			Address_CityTextField = new JTextField();
			Address_CityTextField.setBounds(473, 318+125, 60, 22);
			Address_CityTextField.setBorder(Constants.LIGHT_GRAY_BORDER);
			Address_CityTextField.setText("临汾");
			Address_CityTextField.setFont(Constants.BASIC_FONT6);
			Address_CityTextField.setForeground(Color.GRAY); 
			MainPanel.add(Address_CityTextField);
			
			Address_RegionTextField = new JTextField();
			Address_RegionTextField.setBounds(538, 318+125, 70, 22);
			Address_RegionTextField.setBorder(Constants.LIGHT_GRAY_BORDER);
			Address_RegionTextField.setText("襄汾县");
			Address_RegionTextField.setFont(Constants.BASIC_FONT6);
			Address_RegionTextField.setForeground(Color.GRAY); 
			MainPanel.add(Address_RegionTextField);
			
			DefinitionJLabel(IdentAddress,"身份证详细地址",300, 320+150, 200, 20);
			IdentAddressTextField = new JTextField();
			IdentAddressTextField.setBounds(408, 318+150, 200, 22);
			IdentAddressTextField.setBorder(Constants.LIGHT_GRAY_BORDER);
			IdentAddressTextField.setText("山西省临汾市襄汾县华府国际301A");
			IdentAddressTextField.setFont(Constants.BASIC_FONT6);
			IdentAddressTextField.setForeground(Color.GRAY); 
			MainPanel.add(IdentAddressTextField);
			
			DefinitionJLabel(IdentAuth,"身份证发证机关",300, 320+175, 200, 20);
			IdentAuthTextField = new JTextField();
			IdentAuthTextField.setBounds(408, 318+175, 200, 22);
			IdentAuthTextField.setBorder(Constants.LIGHT_GRAY_BORDER);
			IdentAuthTextField.setText("襄汾县公安局");
			IdentAuthTextField.setFont(Constants.BASIC_FONT6);
			IdentAuthTextField.setForeground(Color.GRAY); 
			MainPanel.add(IdentAuthTextField);
			
			DefinitionJLabel(IdentExp,"身份证有效期限",300, 320+200, 200, 20);
			IdentExpTextField = new JTextField();
			IdentExpTextField.setBounds(408, 318+200, 200, 22);
			IdentExpTextField.setBorder(Constants.LIGHT_GRAY_BORDER);
			IdentExpTextField.setText("2013/06/20-2023/06/20");
			IdentExpTextField.setFont(Constants.BASIC_FONT6);
			IdentExpTextField.setForeground(Color.GRAY); 
			MainPanel.add(IdentExpTextField);
			
			DefinitionJLabel1(SaveCreditBaseInfo,
			"***"
			+ " ------------------------------"
			+ "『 保 存 基 础 信 息 参 数 』"
			+ "-------------------------------"+
			"***",11, 760-130, 900, 20);
			
            DefinitionJLabel(liveInfo,"现居住地所属地址",11, 800-140, 200, 20);
	    	liveInfo_ProvinceTextField = new JTextField();
	    	liveInfo_ProvinceTextField.setBounds(140, 798-140, 40, 22);
	    	liveInfo_ProvinceTextField.setBorder(Constants.LIGHT_GRAY_BORDER);
	    	liveInfo_ProvinceTextField.setText("山西");
	    	liveInfo_ProvinceTextField.setFont(Constants.BASIC_FONT6);
	    	liveInfo_ProvinceTextField.setForeground(Color.GRAY); 
			MainPanel.add(liveInfo_ProvinceTextField);
			
			liveInfo_CityTextField = new JTextField();
			liveInfo_CityTextField.setBounds(215-30, 798-140, 40, 22);
			liveInfo_CityTextField.setBorder(Constants.LIGHT_GRAY_BORDER);
			liveInfo_CityTextField.setText("临汾");
			liveInfo_CityTextField.setFont(Constants.BASIC_FONT6);
			liveInfo_CityTextField.setForeground(Color.GRAY); 
			MainPanel.add(liveInfo_CityTextField);
			
			liveInfo_RegionTextField = new JTextField();
			liveInfo_RegionTextField.setBounds(270-40, 798-140, 50, 22);
			liveInfo_RegionTextField.setBorder(Constants.LIGHT_GRAY_BORDER);
			liveInfo_RegionTextField.setText("襄汾县");
			liveInfo_RegionTextField.setFont(Constants.BASIC_FONT6);
			liveInfo_RegionTextField.setForeground(Color.GRAY); 
			MainPanel.add(liveInfo_RegionTextField);
			
			DefinitionJLabel(liveInfo_Detail,"现居住地详细地址",11, 800+30-145, 200, 20);
			liveInfo_DetailTextField = new JTextField();
			liveInfo_DetailTextField.setBounds(160-20, 798+30-145, 140, 22);
			liveInfo_DetailTextField.setBorder(Constants.LIGHT_GRAY_BORDER);
			liveInfo_DetailTextField.setText("山西省临汾市襄汾县华府国际301A");
			liveInfo_DetailTextField.setFont(Constants.BASIC_FONT6);
			liveInfo_DetailTextField.setForeground(Color.GRAY); 
			MainPanel.add(liveInfo_DetailTextField);
			
			DefinitionJLabel(educationTypeId,"教育程度",11, 800+60-150, 200, 20);
			educationTypeIdTextField = new JTextField();
			educationTypeIdTextField.setBounds(160-20, 798+60-150, 140, 22);
			educationTypeIdTextField.setBorder(Constants.LIGHT_GRAY_BORDER);
			educationTypeIdTextField.setText("6");
			educationTypeIdTextField.setFont(Constants.BASIC_FONT6);
			educationTypeIdTextField.setForeground(Color.GRAY); 
			MainPanel.add(educationTypeIdTextField);
			
			DefinitionJLabel(monthIncome,"个人月收入总额",11, 800+90-155, 200, 20);
			monthIncomeTextField = new JTextField();
			monthIncomeTextField.setBounds(160-20, 798+90-155, 140, 22);
			monthIncomeTextField.setBorder(Constants.LIGHT_GRAY_BORDER);
			monthIncomeTextField.setText("5000");
			monthIncomeTextField.setFont(Constants.BASIC_FONT6);
			monthIncomeTextField.setForeground(Color.GRAY); 
			MainPanel.add(monthIncomeTextField);
			
			DefinitionJLabel(monthExpend,"个人月支出",11, 800+120-160, 200, 20);
			monthExpendTextField = new JTextField();
			monthExpendTextField.setBounds(160-20, 798+120-160, 140, 22);
			monthExpendTextField.setBorder(Constants.LIGHT_GRAY_BORDER);
			monthExpendTextField.setText("3000");
			monthExpendTextField.setFont(Constants.BASIC_FONT6);
			monthExpendTextField.setForeground(Color.GRAY); 
			MainPanel.add(monthExpendTextField);
			
			DefinitionJLabel(familyTotalIncome,"家庭月收入总额",11, 800+150-165, 200, 20);
			familyTotalIncomeTextField = new JTextField();
			familyTotalIncomeTextField.setBounds(160-20, 798+150-165, 140, 22);
			familyTotalIncomeTextField.setBorder(Constants.LIGHT_GRAY_BORDER);
			familyTotalIncomeTextField.setText("80000");
			familyTotalIncomeTextField.setFont(Constants.BASIC_FONT6);
			familyTotalIncomeTextField.setForeground(Color.GRAY); 
			MainPanel.add(familyTotalIncomeTextField);
			
			DefinitionJLabel(cellPhone,"手机号",11, 800+180-170, 200, 20);
			cellPhoneTextField = new JTextField();
			cellPhoneTextField.setBounds(160-20, 798+180-170, 140, 22);
			cellPhoneTextField.setBorder(Constants.LIGHT_GRAY_BORDER);
			cellPhoneTextField.setText("13244721532");
			cellPhoneTextField.setFont(Constants.BASIC_FONT6);
			cellPhoneTextField.setForeground(Color.GRAY); 
			MainPanel.add(cellPhoneTextField);
	
			DefinitionJLabel(qq,"QQ号",300, 800-140, 200, 20);
			qqTextField = new JTextField();
			qqTextField.setBounds(408, 798-140, 200, 22);
			qqTextField.setBorder(Constants.LIGHT_GRAY_BORDER);
			qqTextField.setText("1306086304");
			qqTextField.setFont(Constants.BASIC_FONT6);
			qqTextField.setForeground(Color.GRAY); 
			MainPanel.add(qqTextField);
			
			DefinitionJLabel(email,"电子邮箱",300, 800+30-145, 200, 20);
			emailTextField = new JTextField();
			emailTextField.setBounds(408, 798+30-145, 200, 22);
			emailTextField.setBorder(Constants.LIGHT_GRAY_BORDER);
			emailTextField.setText("1306086304@qq.com");
			emailTextField.setFont(Constants.BASIC_FONT6);
			emailTextField.setForeground(Color.GRAY); 
			MainPanel.add(emailTextField);
			
			DefinitionJLabel(wechart,"微信",300, 800+60-150, 200, 20);
			wechartTextField = new JTextField();
			wechartTextField.setBounds(408, 798+60-150, 200, 22);
			wechartTextField.setBorder(Constants.LIGHT_GRAY_BORDER);
			wechartTextField.setText("13244721532");
			wechartTextField.setFont(Constants.BASIC_FONT6);
			wechartTextField.setForeground(Color.GRAY); 
			MainPanel.add(wechartTextField);
			
			DefinitionJLabel(houseTypeId,"住房情况",300, 800+90-155, 200, 20);
			houseTypeIdTextField = new JTextField();
			houseTypeIdTextField.setBounds(408, 798+90-155, 200, 22);
			houseTypeIdTextField.setBorder(Constants.LIGHT_GRAY_BORDER);
			houseTypeIdTextField.setText("1");
			houseTypeIdTextField.setFont(Constants.BASIC_FONT6);
			houseTypeIdTextField.setForeground(Color.GRAY); 
			MainPanel.add(houseTypeIdTextField);
			
			DefinitionJLabel(marriageTypeId,"婚姻状况",300, 800+120-160, 200, 20);
			marriageTypeIdTextField = new JTextField();
			marriageTypeIdTextField.setBounds(408, 798+120-160, 200, 22);
			marriageTypeIdTextField.setBorder(Constants.LIGHT_GRAY_BORDER);
			marriageTypeIdTextField.setText("1");
			marriageTypeIdTextField.setFont(Constants.BASIC_FONT6);
			marriageTypeIdTextField.setForeground(Color.GRAY); 
			MainPanel.add(marriageTypeIdTextField);
			
			DefinitionJLabel(childrenCount,"子女数目",300, 800+150-165, 200, 20);
			childrenCountTextField = new JTextField();
			childrenCountTextField.setBounds(408, 798+150-165, 200, 22);
			childrenCountTextField.setBorder(Constants.LIGHT_GRAY_BORDER);
			childrenCountTextField.setText("0");
			childrenCountTextField.setFont(Constants.BASIC_FONT6);
			childrenCountTextField.setForeground(Color.GRAY); 
			MainPanel.add(childrenCountTextField);
			
			DefinitionJLabel(familyTel,"家庭固定电话",300, 800+180-170, 200, 20);
			familyTelTextField = new JTextField();
			familyTelTextField.setBounds(408, 798+180-170, 200, 22);
			familyTelTextField.setBorder(Constants.LIGHT_GRAY_BORDER);
			familyTelTextField.setText("075588888888");
			familyTelTextField.setFont(Constants.BASIC_FONT6);
			familyTelTextField.setForeground(Color.GRAY); 
			MainPanel.add(familyTelTextField);
			
			DefinitionJLabel1(SaveCreditCompanyInfo,
			"***"
			+ "-----------------------"
			+ "『 保 存 单 位 信 息 参 数 』"
			+ "-----------------------"+
			"***",740-120, 760-130, 900, 20);

			DefinitionJLabel(CompanyAddress,"单位所属地址",740-120, 800-142, 200, 20);
			CompProvinceTextField = new JTextField();
			CompProvinceTextField.setBounds(880-150-15, 800-142, 60, 21);
			CompProvinceTextField.setBorder(Constants.LIGHT_GRAY_BORDER);
			CompProvinceTextField.setText("山西");
			CompProvinceTextField.setFont(Constants.BASIC_FONT6);
			CompProvinceTextField.setForeground(Color.GRAY); 
			MainPanel.add(CompProvinceTextField);
			
			CompCityTextField = new JTextField();
			CompCityTextField.setBounds(960-150-30, 800-142, 60, 22);
			CompCityTextField.setBorder(Constants.LIGHT_GRAY_BORDER);
			CompCityTextField.setText("临汾");
			CompCityTextField.setFont(Constants.BASIC_FONT6);
			CompCityTextField.setForeground(Color.GRAY); 
			MainPanel.add(CompCityTextField);
			
			CompRegionTextField = new JTextField();
			CompRegionTextField.setBounds(1042-150-47, 800-142, 70, 22);
			CompRegionTextField.setBorder(Constants.LIGHT_GRAY_BORDER);
			CompRegionTextField.setText("襄汾县");
			CompRegionTextField.setFont(Constants.BASIC_FONT6);
			CompRegionTextField.setForeground(Color.GRAY); 
			MainPanel.add(CompRegionTextField);
			
			DefinitionJLabel(compAddDetail,"单位详细地址",740-120, 800+25-140, 200, 20);
			compAddDetailTextField = new JTextField();
			compAddDetailTextField.setBounds(880-150-15, 798+25-140, 200, 22);
			compAddDetailTextField.setBorder(Constants.LIGHT_GRAY_BORDER);
			compAddDetailTextField.setText("山西省临汾市襄汾县华府国际301A");
			compAddDetailTextField.setFont(Constants.BASIC_FONT6);
			compAddDetailTextField.setForeground(Color.GRAY); 
			MainPanel.add(compAddDetailTextField);
			
			DefinitionJLabel(compName,"单位名称",740-120, 800+50-140, 200, 20);
			compNameTextField = new JTextField();
			compNameTextField.setBounds(880-150-15, 798+50-140, 200, 22);
			compNameTextField.setBorder(Constants.LIGHT_GRAY_BORDER);
			compNameTextField.setText("即有分期");
			compNameTextField.setFont(Constants.BASIC_FONT6);
			compNameTextField.setForeground(Color.GRAY); 
			MainPanel.add(compNameTextField);
			
			DefinitionJLabel(workPhone,"单位电话",740-120, 800+75-140, 200, 20);
			workPhoneTextField = new JTextField();
			workPhoneTextField.setBounds(880-150-15, 798+75-140, 200, 22);
			workPhoneTextField.setBorder(Constants.LIGHT_GRAY_BORDER);
			workPhoneTextField.setText("075599999999");
			workPhoneTextField.setFont(Constants.BASIC_FONT6);
			workPhoneTextField.setForeground(Color.GRAY); 
			MainPanel.add(workPhoneTextField);
			
			DefinitionJLabel(workPhoneExt,"单位固话分机号",740-120, 800+100-140, 200, 20);
			workPhoneExtTextField = new JTextField();
			workPhoneExtTextField.setBounds(880-150-15, 798+100-140, 200, 22);
			workPhoneExtTextField.setBorder(Constants.LIGHT_GRAY_BORDER);
			workPhoneExtTextField.setText("0755");
			workPhoneExtTextField.setFont(Constants.BASIC_FONT6);
			workPhoneExtTextField.setForeground(Color.GRAY); 
			MainPanel.add(workPhoneExtTextField);
			
			DefinitionJLabel(jobsTypeId,"行业类别",740-120, 800+125-140, 200, 20);
			jobsTypeIdTextField = new JTextField();
			jobsTypeIdTextField.setBounds(880-150-15, 798+125-140, 200, 22);
			jobsTypeIdTextField.setBorder(Constants.LIGHT_GRAY_BORDER);
			jobsTypeIdTextField.setText("8");
			jobsTypeIdTextField.setFont(Constants.BASIC_FONT6);
			jobsTypeIdTextField.setForeground(Color.GRAY); 
			MainPanel.add(jobsTypeIdTextField);
			
			DefinitionJLabel(companyPropertyId,"单位性质",740-120, 800+150-140, 200, 20);
			companyPropertyIdTextField = new JTextField();
			companyPropertyIdTextField.setBounds(880-150-15, 798+150-140, 200, 22);
			companyPropertyIdTextField.setBorder(Constants.LIGHT_GRAY_BORDER);
			companyPropertyIdTextField.setText("3");
			companyPropertyIdTextField.setFont(Constants.BASIC_FONT6);
			companyPropertyIdTextField.setForeground(Color.GRAY); 
			MainPanel.add(companyPropertyIdTextField);
			
			DefinitionJLabel(department,"任职部门",1140-120-90, 800-142, 200, 20);
			departmentTextField = new JTextField();
			departmentTextField.setBounds(1220-120-90, 798-142, 116, 22);
			departmentTextField.setBorder(Constants.LIGHT_GRAY_BORDER);
			departmentTextField.setText("信息科技部");
			departmentTextField.setFont(Constants.BASIC_FONT6);
			departmentTextField.setForeground(Color.GRAY); 
			MainPanel.add(departmentTextField);
			
			DefinitionJLabel(industryTypeId,"职位",1140-120-90, 800+25-140, 200, 20);
			industryTypeIdTextField = new JTextField();
			industryTypeIdTextField.setBounds(1220-120-90, 798+25-140, 116, 22);
			industryTypeIdTextField.setBorder(Constants.LIGHT_GRAY_BORDER);
			industryTypeIdTextField.setText("5");
			industryTypeIdTextField.setFont(Constants.BASIC_FONT6);
			industryTypeIdTextField.setForeground(Color.GRAY); 
			MainPanel.add(industryTypeIdTextField);
			
			DefinitionJLabel(entryDate,"入职时间",1140-120-90, 800+50-140, 200, 20);
			entryDateTextField = new JTextField();
			entryDateTextField.setBounds(1220-120-90, 798+50-140, 116, 22);
			entryDateTextField.setBorder(Constants.LIGHT_GRAY_BORDER);
			entryDateTextField.setText("2016-01");
			entryDateTextField.setFont(Constants.BASIC_FONT6);
			entryDateTextField.setForeground(Color.GRAY); 
			MainPanel.add(entryDateTextField);
			
			DefinitionJLabel(workYears,"工作年限",1140-120-90, 800+75-140, 200, 20);
			workYearsTextField = new JTextField();
			workYearsTextField.setBounds(1220-120-90, 798+75-140, 116, 22);
			workYearsTextField.setBorder(Constants.LIGHT_GRAY_BORDER);
			workYearsTextField.setText("2016-01");
			workYearsTextField.setFont(Constants.BASIC_FONT6);
			workYearsTextField.setForeground(Color.GRAY); 
			MainPanel.add(workYearsTextField);
			
			DefinitionJLabel1(SaveCreditLinkInfo,
			"***"
			+ " --"
			+ "『 保存联系人信息参数 』"
			+ "--"+
			"***",1140, 760-130, 900, 20);
			
			DefinitionJLabel(Contacts,"类型",1380-240, 800-142, 200, 20);
			Contacts_typeTextField = new JTextField();
			Contacts_typeTextField.setBounds(1520-270, 798-142, 135, 22);
			Contacts_typeTextField.setBorder(Constants.LIGHT_GRAY_BORDER);
			Contacts_typeTextField.setText("0");
			Contacts_typeTextField.setFont(Constants.BASIC_FONT6);
			Contacts_typeTextField.setForeground(Color.GRAY); 
			MainPanel.add(Contacts_typeTextField);
			
			DefinitionJLabel(Contacts_linkerName,"联系人姓名",1380-240, 800+25-142, 200, 20);
			Contacts_linkerNameTextField = new JTextField();
			Contacts_linkerNameTextField.setBounds(1520-270, 798+25-142, 135, 22);
			Contacts_linkerNameTextField.setBorder(Constants.LIGHT_GRAY_BORDER);
			Contacts_linkerNameTextField.setText("时光");
			Contacts_linkerNameTextField.setFont(Constants.BASIC_FONT6);
			Contacts_linkerNameTextField.setForeground(Color.GRAY); 
			MainPanel.add(Contacts_linkerNameTextField);
			
			DefinitionJLabel(Contacts_phone,"联系人手机号",1380-240, 800+50-142, 200, 20);
			Contacts_phoneTextField = new JTextField();
			Contacts_phoneTextField.setBounds(1520-270, 798+50-142, 135, 22);
			Contacts_phoneTextField.setBorder(Constants.LIGHT_GRAY_BORDER);
			Contacts_phoneTextField.setText("13466666666");
			Contacts_phoneTextField.setFont(Constants.BASIC_FONT6);
			Contacts_phoneTextField.setForeground(Color.GRAY); 
			MainPanel.add(Contacts_phoneTextField);
			
			DefinitionJLabel(Contacts_relationTypeID,"联系人与本人关系",1380-240, 800+75-142, 200, 20);
			Contacts_relationTypeIDTextField = new JTextField();
			Contacts_relationTypeIDTextField.setBounds(1520-270, 798+75-142, 135, 22);
			Contacts_relationTypeIDTextField.setBorder(Constants.LIGHT_GRAY_BORDER);
			Contacts_relationTypeIDTextField.setText("B");
			Contacts_relationTypeIDTextField.setFont(Constants.BASIC_FONT6);
			Contacts_relationTypeIDTextField.setForeground(Color.GRAY); 
			MainPanel.add(Contacts_relationTypeIDTextField);
			
			DefinitionJLabel1(SaveBankInfo,
			"***"
			+ "-----------------"
			+ "『 保 存 银 行 卡 信 息 参 数 』"
			+ "------------------"+
			"***",1140-120-90, 800+125-165, 900, 20);
						
			DefinitionJLabel(bankAccountNo,"银行卡号码",1140-120-90, 800+125-140, 180, 20);
			bankAccountNoTextField = new JTextField();
			bankAccountNoTextField.setBounds(1230-220, 798+125-140, 116, 22);
			bankAccountNoTextField.setBorder(Constants.LIGHT_GRAY_BORDER);
			bankAccountNoTextField.setText("6217002670009863020");
			bankAccountNoTextField.setFont(Constants.BASIC_FONT6);
			bankAccountNoTextField.setForeground(Color.GRAY); 
			MainPanel.add(bankAccountNoTextField);

			DefinitionJLabel(bankPhoto,"银行卡照片",1140-120-90, 800+150-140, 180, 20);
			bankPhotoTextField = new JTextField();
			bankPhotoTextField.setBounds(1230-220, 798+150-140, 116, 22);
			bankPhotoTextField.setBorder(Constants.LIGHT_GRAY_BORDER);
			bankPhotoTextField.setText("iVBORw0KGgoAAAANSUhEUgAAAC8AAAAlCAIAAABd3iedAAAGNElEQVRYCe3YS0+VSRAGYOEAgiCgIjKKoJJMNMKgxojREMPSy0KXbtgYd/6PSUx04w9wo8lsjDHeEheiizFR4ySDC3UIElSuQuSi3A8zz6GHb45+cPBMTJzF9KKtr7q66u23qrqP5Pzc1rFqcVSWFOQsyt/l39zvEnW5oP8tNHnLwaRP5OY0VpX+WFFcmJ8IZnNzczmL48+FQZ+bmzs7O5uXl2dOJpOrV6+mnJ+fTyQSTFJ+En9vn5pN/jH06ff+seR8Sh8fmdCA8tMPpel7IPEZZpHEBkJgyuHh4Y6Ojk+fPtXX12/atClCEIyDE6cKDn/rHU13G8mZ0GAlsgtC4AUHgn38+HF8fHzNmjVPnjx59OhRQUFBd3c3s87OzrNnzyIMXPawktP9cPtv0KS7iNCIgY+pqamrV68+ePCgv79fSCTRy5HYPT09DQ0NBw4cCCC+gMJPlPe4/89Qx5fjGlGNGzdu3Lt3DzdbtmxZv359SUnJ2rVrN2zYgCFAL1261NbWZm96muKu4prs0OBAgNu3b1+5cgUmTAwNDQkfClYGi4qKCgsL3759e/78eWY08ZBxzcIBU1OmuolvA0WVXLx4cWZmxuaJiYni4mLEsJycnPTJICAA8cKFC+QTJ07k5+cHkkLV2xj3HDTZcSPetWvXxsbGeORaTZSVleGjsrJy48aNkkUvsHwZCLt8+fLTp09p6A325uWg0GeH5tWrV9qHU8ctLy8HorS0VNSuri40bN26FSYaMqxs5FGxR+EDQ9FnXMguUw8fPgyl44iY4E4AsdEjMD5aWlrevXv34sWLN2/eIFL/P3v2TN+5gaLYcXoGi2pb61dVuQsio68RdK8Ti6FWTp48iRuyZO3Zs8elNzo6ev/+/UOHDp05c6aqqgoa5YXI9vb2dOdLMlSe7Pz1cVd2aDQLJhSspDQ2Nra2th4/fhwfevv06dNAbN68+ebNmzU1NZZwwNLsPkxHE+cmrE5O1q2QKTsN55MgbfLy5ctwst27d8sOnhBD8/79eyRVVFTs3LlTppC0f//+5uZmabKKpODEnA7rC7mvJmMV28yXEXwJL55P4Pbt2+fqkwgl7DM0FJlNXV2dyxqCU6dObd++nc2OHTvsCrFT7hbldDTJZFlTTXIFbmyw2S1nFrW2tlZ7Czk9PX39+vUPHz54BHAQOosNku7evUsPx5EjR7Zt2+YpRWQEhbAkQ4nE6OOuihXqxk4jnIagWtUNDqqrq48dO9bU1KSudZBfGlZVibuRvHfv3oMHDwLtSZdBZRQ8mCNv6cQEubpndAU00Zk4Mg4fPqx39Db+3TG3bt0ST/cqIMwxQIY7SRM9f/4ciwrIAbwVQARW2MRxBE1BwdDKmQpewplk5OjRo3fu3HFudaqNCfoIFGZY2bVr17lz59SN6vaTw6qXIT18Bm5mZioyoUmxsXiUIGBF1/T19XEKGZ6UlMT5DLciWc0GcEgCziO/4OafKk4HF8kjibqW5ixvPz0FkLLQMmLgwAyKYiLIlzmUPHCU7iQ3UxQygxBuv0zcxDc7tMoA4vXr135biU2jeN39BC+DErELPkrFq9jDCx93taQmOzQhvO71KikLCAywRMUWKDKFFaWt0eQIMTRLBk5XVk52//Jb3qq8jLdf+oZIBojsmsGQzkKD3hkYGBgcHATRb3VKQ9bckLBKXLR3ReGrOjzyErhREPhQxd4KGgnyKTDZ7SI82tw34MIa0EceMguZ0PCVPjgKFerc9H7fYMK1Kx40hn6WF8To/PB+WTLSnZDjbAUzcyY04RzBF5kQthF8qo9169YpFwWLGOGh9HiBBRPLsD0em3FYis/LLjANsW0O+wMaV5xPSzgQye/iQFW4b8hW6RmHtg97g7cQPhwmDoUmU09x6rkM2yJWeFe2Kqa3t1fFBHByxIC1boJSPIQpLHuhVECWyKG/Jmfmgs/4nAlNx/BEQ1Xq56YhqrOaVSjvykXB8p7Cu4CDkhD4AwhWsp6HmE3EEFfcLrhcYsqEpn1gHAdVBcniwtR/AEBxUD78nFDCIyMjlEDQwGEpIFY3lLAChB5KmAg04a8C3C4BZEGV8/9fk5ajJvu7eFlP32Lhsw6fnsviFv8W0b/08RcCxKV08Qfa3AAAAABJRU5ErkJggg==");
			bankPhotoTextField.setFont(Constants.BASIC_FONT6);
			bankPhotoTextField.setForeground(Color.GRAY); 
			MainPanel.add(bankPhotoTextField);

			DefinitionJLabel(bankIDAddress,"银行卡类型/所属地",1380-240, 798+125-140, 200, 20);
			bankIdTextField = new JTextField();
			bankIdTextField.setBounds(1520-270, 798+125-140, 40, 22);
			bankIdTextField.setBorder(Constants.LIGHT_GRAY_BORDER);
			bankIdTextField.setText("2");
			bankIdTextField.setFont(Constants.BASIC_FONT6);
			bankIdTextField.setForeground(Color.GRAY); 
			MainPanel.add(bankIdTextField);
			
			bankProvinceTextField = new JTextField();
			bankProvinceTextField.setBounds(1570-270-5, 798+125-140, 40, 22);
			bankProvinceTextField.setBorder(Constants.LIGHT_GRAY_BORDER);
			bankProvinceTextField.setText("湖北");
			bankProvinceTextField.setFont(Constants.BASIC_FONT6);
			bankProvinceTextField.setForeground(Color.GRAY); 
			MainPanel.add(bankProvinceTextField);
			
			bankCityTextField = new JTextField();
			bankCityTextField.setBounds(1615-270-5, 798+125-140, 45, 22);
			bankCityTextField.setBorder(Constants.LIGHT_GRAY_BORDER);
			bankCityTextField.setText("襄阳");
			bankCityTextField.setFont(Constants.BASIC_FONT6);
			bankCityTextField.setForeground(Color.GRAY); 
			MainPanel.add(bankCityTextField);
			
			DefinitionJLabel(branch,"银行卡开户行",1380-240, 800+150-140, 200, 20);
			branchTextField = new JTextField();
			branchTextField.setBounds(1520-270, 798+150-140, 135, 22);
			branchTextField.setBorder(Constants.LIGHT_GRAY_BORDER);
			branchTextField.setText("中国建设银行");
			branchTextField.setFont(Constants.BASIC_FONT6);
			branchTextField.setForeground(Color.GRAY); 
			MainPanel.add(branchTextField);
			
			DefinitionJLabel1(SaveOtherInfo,
			"***"
			+ "-"
			+ "『保存其他信息参数』"
			+ "-"+
			"***",1390, 10, 900, 20);
			
			DefinitionJLabel(innerCode,"内部代码",1390, 40, 180, 20);
			innerCodeTextField = new JTextField();
			innerCodeTextField.setBounds(1470, 40, 125, 21);
			innerCodeTextField.setBorder(Constants.LIGHT_GRAY_BORDER);
			innerCodeTextField.setText("1");
			innerCodeTextField.setFont(Constants.BASIC_FONT6);
			innerCodeTextField.setForeground(Color.GRAY); 
			MainPanel.add(innerCodeTextField);
			
			DefinitionJLabel(shop,"商店",1390, 40+25, 180, 20);
			shopTextFiel = new JTextField();
			shopTextFiel.setBounds(1470, 40+25, 125, 21);
			shopTextFiel.setBorder(Constants.LIGHT_GRAY_BORDER);
			shopTextFiel.setText("0");
			shopTextFiel.setFont(Constants.BASIC_FONT6);
			shopTextFiel.setForeground(Color.GRAY); 
			MainPanel.add(shopTextFiel);
			
			DefinitionJLabel(remark,"提单备注",1390, 40+50, 180, 20);
			remarkTextFiel = new JTextField();
			remarkTextFiel.setBounds(1470, 40+50, 125, 21);
			remarkTextFiel.setBorder(Constants.LIGHT_GRAY_BORDER);
			remarkTextFiel.setText("测试提单");
			remarkTextFiel.setFont(Constants.BASIC_FONT6);
			remarkTextFiel.setForeground(Color.GRAY); 
			MainPanel.add(remarkTextFiel);
			
			DefinitionJLabel(isShop,"是否移动门店",1390, 40+75, 180, 20);
			isShopTextField = new JTextField();
			isShopTextField.setBounds(1480, 40+75, 115, 21);
			isShopTextField.setBorder(Constants.LIGHT_GRAY_BORDER);
			isShopTextField.setText("false");
			isShopTextField.setFont(Constants.BASIC_FONT6);
			isShopTextField.setForeground(Color.GRAY); 
			MainPanel.add(isShopTextField);
			
			DefinitionJLabel1(UploadOnePhoto,
			"*"
			+ "-"
			+ "『批量上传影像证明参数』"
			+ "-"+
			"*",1390, 150, 900, 20);
			
			DefinitionJLabel(flowType,"流式",1390, 180, 180, 20);
			flowTypeTextField = new JTextField();
			flowTypeTextField.setBounds(1470, 180, 125, 22);
			flowTypeTextField.setBorder(Constants.LIGHT_GRAY_BORDER);
			flowTypeTextField.setText("10");
			flowTypeTextField.setFont(Constants.BASIC_FONT6);
			flowTypeTextField.setForeground(Color.GRAY); 
			MainPanel.add(flowTypeTextField);
			
			DefinitionJLabel(photoType,"图片类型",1390, 200+5, 180, 20);
			photoTypeTextField = new JTextField();
			photoTypeTextField.setBounds(1470, 200+5, 125, 22);
			photoTypeTextField.setBorder(Constants.LIGHT_GRAY_BORDER);
			photoTypeTextField.setText("42");
			photoTypeTextField.setFont(Constants.BASIC_FONT6);
			photoTypeTextField.setForeground(Color.GRAY); 
			MainPanel.add(photoTypeTextField);
			
			DefinitionJLabel(name,"图片名称",1390, 200+30, 180, 20);
			nameTextField = new JTextField();
			nameTextField.setBounds(1470, 200+30, 125, 22);
			nameTextField.setBorder(Constants.LIGHT_GRAY_BORDER);
			nameTextField.setText("征信授权照片");
			nameTextField.setFont(Constants.BASIC_FONT6);
			nameTextField.setForeground(Color.GRAY); 
			MainPanel.add(nameTextField);
			
			DefinitionJLabel(path,"图片路径",1390, 200+55, 180, 20);
			pathTextField = new JTextField();
			pathTextField.setBounds(1470, 200+55, 125, 22);
			pathTextField.setBorder(Constants.LIGHT_GRAY_BORDER);
			pathTextField.setText("iVBORw0KGgoAAAANSUhEUgAAAC8AAAAlCAIAAABd3iedAAAGNElEQVRYCe3YS0+VSRAGYOEAgiCgIjKKoJJMNMKgxojREMPSy0KXbtgYd/6PSUx04w9wo8lsjDHeEheiizFR4ySDC3UIElSuQuSi3A8zz6GHb45+cPBMTJzF9KKtr7q66u23qrqP5Pzc1rFqcVSWFOQsyt/l39zvEnW5oP8tNHnLwaRP5OY0VpX+WFFcmJ8IZnNzczmL48+FQZ+bmzs7O5uXl2dOJpOrV6+mnJ+fTyQSTFJ+En9vn5pN/jH06ff+seR8Sh8fmdCA8tMPpel7IPEZZpHEBkJgyuHh4Y6Ojk+fPtXX12/atClCEIyDE6cKDn/rHU13G8mZ0GAlsgtC4AUHgn38+HF8fHzNmjVPnjx59OhRQUFBd3c3s87OzrNnzyIMXPawktP9cPtv0KS7iNCIgY+pqamrV68+ePCgv79fSCTRy5HYPT09DQ0NBw4cCCC+gMJPlPe4/89Qx5fjGlGNGzdu3Lt3DzdbtmxZv359SUnJ2rVrN2zYgCFAL1261NbWZm96muKu4prs0OBAgNu3b1+5cgUmTAwNDQkfClYGi4qKCgsL3759e/78eWY08ZBxzcIBU1OmuolvA0WVXLx4cWZmxuaJiYni4mLEsJycnPTJICAA8cKFC+QTJ07k5+cHkkLV2xj3HDTZcSPetWvXxsbGeORaTZSVleGjsrJy48aNkkUvsHwZCLt8+fLTp09p6A325uWg0GeH5tWrV9qHU8ctLy8HorS0VNSuri40bN26FSYaMqxs5FGxR+EDQ9FnXMguUw8fPgyl44iY4E4AsdEjMD5aWlrevXv34sWLN2/eIFL/P3v2TN+5gaLYcXoGi2pb61dVuQsio68RdK8Ti6FWTp48iRuyZO3Zs8elNzo6ev/+/UOHDp05c6aqqgoa5YXI9vb2dOdLMlSe7Pz1cVd2aDQLJhSspDQ2Nra2th4/fhwfevv06dNAbN68+ebNmzU1NZZwwNLsPkxHE+cmrE5O1q2QKTsN55MgbfLy5ctwst27d8sOnhBD8/79eyRVVFTs3LlTppC0f//+5uZmabKKpODEnA7rC7mvJmMV28yXEXwJL55P4Pbt2+fqkwgl7DM0FJlNXV2dyxqCU6dObd++nc2OHTvsCrFT7hbldDTJZFlTTXIFbmyw2S1nFrW2tlZ7Czk9PX39+vUPHz54BHAQOosNku7evUsPx5EjR7Zt2+YpRWQEhbAkQ4nE6OOuihXqxk4jnIagWtUNDqqrq48dO9bU1KSudZBfGlZVibuRvHfv3oMHDwLtSZdBZRQ8mCNv6cQEubpndAU00Zk4Mg4fPqx39Db+3TG3bt0ST/cqIMwxQIY7SRM9f/4ciwrIAbwVQARW2MRxBE1BwdDKmQpewplk5OjRo3fu3HFudaqNCfoIFGZY2bVr17lz59SN6vaTw6qXIT18Bm5mZioyoUmxsXiUIGBF1/T19XEKGZ6UlMT5DLciWc0GcEgCziO/4OafKk4HF8kjibqW5ixvPz0FkLLQMmLgwAyKYiLIlzmUPHCU7iQ3UxQygxBuv0zcxDc7tMoA4vXr135biU2jeN39BC+DErELPkrFq9jDCx93taQmOzQhvO71KikLCAywRMUWKDKFFaWt0eQIMTRLBk5XVk52//Jb3qq8jLdf+oZIBojsmsGQzkKD3hkYGBgcHATRb3VKQ9bckLBKXLR3ReGrOjzyErhREPhQxd4KGgnyKTDZ7SI82tw34MIa0EceMguZ0PCVPjgKFerc9H7fYMK1Kx40hn6WF8To/PB+WTLSnZDjbAUzcyY04RzBF5kQthF8qo9169YpFwWLGOGh9HiBBRPLsD0em3FYis/LLjANsW0O+wMaV5xPSzgQye/iQFW4b8hW6RmHtg97g7cQPhwmDoUmU09x6rkM2yJWeFe2Kqa3t1fFBHByxIC1boJSPIQpLHuhVECWyKG/Jmfmgs/4nAlNx/BEQ1Xq56YhqrOaVSjvykXB8p7Cu4CDkhD4AwhWsp6HmE3EEFfcLrhcYsqEpn1gHAdVBcniwtR/AEBxUD78nFDCIyMjlEDQwGEpIFY3lLAChB5KmAg04a8C3C4BZEGV8/9fk5ajJvu7eFlP32Lhsw6fnsviFv8W0b/08RcCxKV08Qfa3AAAAABJRU5ErkJggg==");
			pathTextField.setFont(Constants.BASIC_FONT6);
			pathTextField.setForeground(Color.GRAY); 
			MainPanel.add(pathTextField);

			//---------------------------------------------------------------------------
//	    	DefinitionButton(OneManualCredit,730, 850, 160, 30,"一键手动生成合同");
			OneManualCredit = new JButton("一键手动创建合同订单");
			OneManualCredit.setBounds(1405, 300, 180, 30);
			OneManualCredit.setFont(Constants.BASIC_FONT6);
	    	MainPanel.add(OneManualCredit);
			
			plus = new JLabel("+");
			plus.setBounds(1490, 330, 160, 30);
			plus.setFont(Constants.DIALOG_FONT);
			MainPanel.add(plus);
			
//	    	DefinitionButton(OneManualCredit,730, 850, 160, 30,"一键手动生成合同");
	    	OneManualCreditBaseInfo = new JButton("一键保存合同基础信息");
	    	OneManualCreditBaseInfo.setBounds(1405, 360, 180, 30);
	    	OneManualCreditBaseInfo.setFont(Constants.BASIC_FONT6);
	    	MainPanel.add(OneManualCreditBaseInfo);
			
			plus = new JLabel("+");
			plus.setBounds(1490, 390, 160, 30);
			plus.setFont(Constants.DIALOG_FONT);
			MainPanel.add(plus);
			
	    	OneManualCreditCompanyInfo = new JButton("一键保存合同单位信息");
	    	OneManualCreditCompanyInfo.setBounds(1405, 420, 180, 30);
	    	OneManualCreditCompanyInfo.setFont(Constants.BASIC_FONT6);
	    	MainPanel.add(OneManualCreditCompanyInfo);
	    	
			plus = new JLabel("+");
			plus.setBounds(1490, 450, 160, 30);
			plus.setFont(Constants.DIALOG_FONT);
			MainPanel.add(plus);
			
	    	OneManualCreditLinkInfo = new JButton("一键保存合同联系人信息");
	    	OneManualCreditLinkInfo.setBounds(1405, 480, 180, 30);
	    	OneManualCreditLinkInfo.setFont(Constants.BASIC_FONT6);
	    	MainPanel.add(OneManualCreditLinkInfo);
	    	
			plus = new JLabel("+");
			plus.setBounds(1490, 510, 160, 30);
			plus.setFont(Constants.DIALOG_FONT);
			MainPanel.add(plus);
			
	    	OneManualCreditBankInfo = new JButton("一键保存合同银行卡信息");
	    	OneManualCreditBankInfo.setBounds(1405, 540, 180, 30);
	    	OneManualCreditBankInfo.setFont(Constants.BASIC_FONT6);
	    	MainPanel.add(OneManualCreditBankInfo);
	    	
			plus = new JLabel("+");
			plus.setBounds(1490, 570, 160, 30);
			plus.setFont(Constants.DIALOG_FONT);
			MainPanel.add(plus);
			
	    	OneManualCreditOtherInfo = new JButton("一键保存合同其他信息");
	    	OneManualCreditOtherInfo.setBounds(1405, 600, 180, 30);
	    	OneManualCreditOtherInfo.setFont(Constants.BASIC_FONT6);
	    	MainPanel.add(OneManualCreditOtherInfo);
	    	
			plus = new JLabel("+");
			plus.setBounds(1490, 630, 160, 30);
			plus.setFont(Constants.DIALOG_FONT);
			MainPanel.add(plus);
			
	    	OneManualCreditUploadPhoto = new JButton("一键上传影像证明图片");
	    	OneManualCreditUploadPhoto.setBounds(1405, 660, 180, 30);
	    	OneManualCreditUploadPhoto.setFont(Constants.BASIC_FONT6);
	    	MainPanel.add(OneManualCreditUploadPhoto);
	    	
			plus = new JLabel("=");
			plus.setBounds(1490, 690, 160, 30);
			plus.setFont(Constants.DIALOG_FONT);
			MainPanel.add(plus);
			
	    	OneManualCreditSubmit = new JButton("一键提交保存合同");
	    	OneManualCreditSubmit.setBounds(1405, 720, 180, 30);
	    	OneManualCreditSubmit.setFont(Constants.BASIC_FONT6);
	    	MainPanel.add(OneManualCreditSubmit);
	    	
	    	InquiryContractButton = new JButton("切换至查询合同费用界面");
	    	InquiryContractButton.setFont(Constants.BASIC_FONT6);
	    	InquiryContractButton.setBounds(1418, 765, 168, 30);
			MainPanel.add(InquiryContractButton);
			
			HangUpProcessButton = new JButton("挂起进程");
			HangUpProcessButton.setFont(Constants.BASIC_FONT6);
			HangUpProcessButton.setBounds(1497, 803, 90, 30);
			MainPanel.add(HangUpProcessButton);
		
			setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	//TODO 这个地方可以考虑，tray就只要一个，在主窗体出来之后换掉其上面的监听
	private void initTrayIcon() {
		if (SystemTray.isSupported()) {
			try {
				tray = SystemTray.getSystemTray();
				icon = new TrayIcon(PictureUtil.getPicture("jyb_icon.png").getImage(), "即有宝");
				icon.setImageAutoSize(true); //自动适应大小
				icon.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseReleased(MouseEvent e) {
						if (e.getButton() == MouseEvent.BUTTON1) {
							setVisible(true);
							//获取焦点
							requestFocus();
						}
					}
				});
				
				PopupMenu pm = new PopupMenu();
				MenuItem mit = new MenuItem("Exit");
				mit.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						tray.remove(icon);
						System.exit(0);
					}
				});
				pm.add(mit);
				icon.setPopupMenu(pm);
				tray.add(icon);

			} catch (AWTException e) {
				//TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	private void initFocusListener() {
					
		//用户后台登录信息ID输入框-焦点事件
		UserIDTextField.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				
				String UserID = String.valueOf(UserIDTextField.getText());
				if (ApiHandler_1600x900.isEmpty(UserID)) {
					UserIDTextField.setText("请输入用户ID...");
					UserIDTextField.setBorder(Constants.LIGHT_GRAY_BORDER);
				}	
			}
			@Override
			public void focusGained(FocusEvent e) {
				
				String UserID = String.valueOf(UserIDTextField.getText());
				if (ApiHandler_1600x900.isEqual(UserID,"请输入用户ID...")) {
					UserIDTextField.setText("");
					UserIDTextField.setBorder(Constants.DARKGRAY_BORDER);
				}
			}	
		});

		//用户后台登录信息密码输入框-焦点事件
		UserPassWordTextField.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				
				String PassWord = String.valueOf(UserPassWordTextField.getText());
				if (ApiHandler_1600x900.isEmpty(PassWord)) {
					UserPassWordTextField.setText("请输入用户密码...");
					UserPassWordTextField.setBorder(Constants.LIGHT_GRAY_BORDER);
				}	
			}
			@Override
			public void focusGained(FocusEvent e) {
				
				String PassWord = String.valueOf(UserPassWordTextField.getText());
				if (ApiHandler_1600x900.isEqual(PassWord,"请输入用户密码...")) {
					UserPassWordTextField.setText("");
					UserPassWordTextField.setBorder(Constants.DARKGRAY_BORDER);
				}
			}	
		});
		
		//用户绑定门店信息查询序号输入框-焦点事件
		UserBoundStoreTextField.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				
				String UserBoundStore = String.valueOf(UserBoundStoreTextField.getText());
				if (ApiHandler_1600x900.isEmpty(UserBoundStore)) {
					UserBoundStoreTextField.setText("请输入门店序号...");
					UserBoundStoreTextField.setBorder(Constants.LIGHT_GRAY_BORDER);
				}	
			}
			@Override
			public void focusGained(FocusEvent e) {
				
				String UserBoundStore = String.valueOf(UserBoundStoreTextField.getText());
				if (ApiHandler_1600x900.isEqual(UserBoundStore,"请输入门店序号...")) {
					UserBoundStoreTextField.setText("");
					UserBoundStoreTextField.setBorder(Constants.DARKGRAY_BORDER);
				}
			}	
		});	
		
		//门店绑定商品类型信息查询序号输入框-焦点事件
		StoreBoundCommodityTypeTextField.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				
				String StoreBoundCommodityType = String.valueOf(StoreBoundCommodityTypeTextField.getText());
				if (ApiHandler_1600x900.isEmpty(StoreBoundCommodityType)) {
					StoreBoundCommodityTypeTextField.setText("请输入商品类型序号...");
					StoreBoundCommodityTypeTextField.setBorder(Constants.LIGHT_GRAY_BORDER);
				}	
			}
			@Override
			public void focusGained(FocusEvent e) {
				
				String StoreBoundCommodityType = String.valueOf(StoreBoundCommodityTypeTextField.getText());
				if (ApiHandler_1600x900.isEqual(StoreBoundCommodityType,"请输入商品类型序号...")) {
					StoreBoundCommodityTypeTextField.setText("");
					StoreBoundCommodityTypeTextField.setBorder(Constants.DARKGRAY_BORDER);
				}
			}	
		});			
		
		//门店绑定产品版本查询序号输入框-焦点事件
		StoreBoundProductVersionTextField.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				
				String StoreBoundProductVersion = String.valueOf(StoreBoundProductVersionTextField.getText());
				if (ApiHandler_1600x900.isEmpty(StoreBoundProductVersion)) {
					StoreBoundProductVersionTextField.setText("请输入产品版本序号...");
					StoreBoundProductVersionTextField.setBorder(Constants.LIGHT_GRAY_BORDER);
				}	
			}
			@Override
			public void focusGained(FocusEvent e) {
				
				String StoreBoundProductVersion = String.valueOf(StoreBoundProductVersionTextField.getText());
				if (ApiHandler_1600x900.isEqual(StoreBoundProductVersion,"请输入产品版本序号...")) {
					StoreBoundProductVersionTextField.setText("");
					StoreBoundProductVersionTextField.setBorder(Constants.DARKGRAY_BORDER);
				}
			}	
		});			
		
		//门店绑定产品类型查询序号输入框-焦点事件
		StoreBoundProductTypeTextField.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				
				String StoreBoundProductType = String.valueOf(StoreBoundProductTypeTextField.getText());
				if (ApiHandler_1600x900.isEmpty(StoreBoundProductType)) {
					StoreBoundProductTypeTextField.setText("请输入产品类型序号...");
					StoreBoundProductTypeTextField.setBorder(Constants.LIGHT_GRAY_BORDER);
				}	
			}
			@Override
			public void focusGained(FocusEvent e) {
				
				String StoreBoundProductType = String.valueOf(StoreBoundProductTypeTextField.getText());
				if (ApiHandler_1600x900.isEqual(StoreBoundProductType,"请输入产品类型序号...")) {
					StoreBoundProductTypeTextField.setText("");
					StoreBoundProductTypeTextField.setBorder(Constants.DARKGRAY_BORDER);
				}
			}	
		});		

		//分期产品信息查询商品门店ID输入框-焦点事件
		ProductInforMationStorIdTextField.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				
				String ProductInforMationStorId = String.valueOf(ProductInforMationStorIdTextField.getText());
				if (ApiHandler_1600x900.isEmpty(ProductInforMationStorId)) {
					ProductInforMationStorIdTextField.setText("请输入商品门店ID...");
					ProductInforMationStorIdTextField.setBorder(Constants.LIGHT_GRAY_BORDER);
				}	
			}
			@Override
			public void focusGained(FocusEvent e) {
				
				String ProductInforMationStorId = String.valueOf(ProductInforMationStorIdTextField.getText());
				if (ApiHandler_1600x900.isEqual(ProductInforMationStorId,"请输入商品门店ID...")) {
					ProductInforMationStorIdTextField.setText("");
					ProductInforMationStorIdTextField.setBorder(Constants.DARKGRAY_BORDER);
				}
			}	
		});			

		//分期产品信息查询商品类型ID输入框-焦点事件
		ProductInforMationgoodsCategoryIdTextField.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				
				String ProductInforMationgoodsCategoryId = String.valueOf(ProductInforMationgoodsCategoryIdTextField.getText());
				if (ApiHandler_1600x900.isEmpty(ProductInforMationgoodsCategoryId)) {
					ProductInforMationgoodsCategoryIdTextField.setText("请输入商品类型ID...");
					ProductInforMationgoodsCategoryIdTextField.setBorder(Constants.LIGHT_GRAY_BORDER);
				}	
			}
			@Override
			public void focusGained(FocusEvent e) {
				
				String ProductInforMationgoodsCategoryId = String.valueOf(ProductInforMationgoodsCategoryIdTextField.getText());
				if (ApiHandler_1600x900.isEqual(ProductInforMationgoodsCategoryId,"请输入商品类型ID...")) {
					ProductInforMationgoodsCategoryIdTextField.setText("");
					ProductInforMationgoodsCategoryIdTextField.setBorder(Constants.DARKGRAY_BORDER);
				}
			}	
		});	
		
		//分期产品信息查询产品版本ID输入框-焦点事件
		ProductInforMationSearchTypeIdTextField.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				
				String ProductInforMationSearchTypeId = String.valueOf(ProductInforMationSearchTypeIdTextField.getText());
				if (ApiHandler_1600x900.isEmpty(ProductInforMationSearchTypeId)) {
					ProductInforMationSearchTypeIdTextField.setText("请输入产品版本ID...");
					ProductInforMationSearchTypeIdTextField.setBorder(Constants.LIGHT_GRAY_BORDER);
				}	
			}
			@Override
			public void focusGained(FocusEvent e) {
				
				String ProductInforMationSearchTypeId = String.valueOf(ProductInforMationSearchTypeIdTextField.getText());
				if (ApiHandler_1600x900.isEqual(ProductInforMationSearchTypeId,"请输入产品版本ID...")) {
					ProductInforMationSearchTypeIdTextField.setText("");
					ProductInforMationSearchTypeIdTextField.setBorder(Constants.DARKGRAY_BORDER);
				}
			}	
		});	
		
		//分期产品信息查询产品类型ID输入框-焦点事件
		ProductInforMationProductTypeIdTextField.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				
				String ProductInforMationProductTypeId = String.valueOf(ProductInforMationProductTypeIdTextField.getText());
				if (ApiHandler_1600x900.isEmpty(ProductInforMationProductTypeId)) {
					ProductInforMationProductTypeIdTextField.setText("请输入产品类型ID...");
					ProductInforMationProductTypeIdTextField.setBorder(Constants.LIGHT_GRAY_BORDER);
				}	
			}
			@Override
			public void focusGained(FocusEvent e) {
				
				String ProductInforMationProductTypeId = String.valueOf(ProductInforMationProductTypeIdTextField.getText());
				if (ApiHandler_1600x900.isEqual(ProductInforMationProductTypeId,"请输入产品类型ID...")) {
					ProductInforMationProductTypeIdTextField.setText("");
					ProductInforMationProductTypeIdTextField.setBorder(Constants.DARKGRAY_BORDER);
				}
			}	
		});	
		
		//分期产品信息查询商品总额输入框-焦点事件
		ProductInforMationPriceTextField.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				
				String ProductInforMationPrice = String.valueOf(ProductInforMationPriceTextField.getText());
				if (ApiHandler_1600x900.isEmpty(ProductInforMationPrice)) {
					ProductInforMationPriceTextField.setText("请输入商品总额...");
					ProductInforMationPriceTextField.setBorder(Constants.LIGHT_GRAY_BORDER);
				}	
			}
			@Override
			public void focusGained(FocusEvent e) {
				
				String ProductInforMationPrice = String.valueOf(ProductInforMationPriceTextField.getText());
				if (ApiHandler_1600x900.isEqual(ProductInforMationPrice,"请输入商品总额...")) {
					ProductInforMationPriceTextField.setText("");
					ProductInforMationPriceTextField.setBorder(Constants.DARKGRAY_BORDER);
				}
			}	
		});	

		//分期产品信息查询首付总额输入框-焦点事件
		ProductInforMationFirstPayTextField.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				
				String ProductInforMationFirstPay = String.valueOf(ProductInforMationFirstPayTextField.getText());
				if (ApiHandler_1600x900.isEmpty(ProductInforMationFirstPay)) {
					ProductInforMationFirstPayTextField.setText("请输入首付总额...");
					ProductInforMationFirstPayTextField.setBorder(Constants.LIGHT_GRAY_BORDER);
				}	
			}
			@Override
			public void focusGained(FocusEvent e) {
				
				String ProductInforMationFirstPay = String.valueOf(ProductInforMationFirstPayTextField.getText());
				if (ApiHandler_1600x900.isEqual(ProductInforMationFirstPay,"请输入首付总额...")) {
					ProductInforMationFirstPayTextField.setText("");
					ProductInforMationFirstPayTextField.setBorder(Constants.DARKGRAY_BORDER);
				}
			}	
		});	
		
		//分期产品信息查询首付比例输入框-焦点事件
		ProductInforMationIsWalletTextField.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				
				String ProductInforMationIsWallet = String.valueOf(ProductInforMationIsWalletTextField.getText());
				if (ApiHandler_1600x900.isEmpty(ProductInforMationIsWallet)) {
					ProductInforMationIsWalletTextField.setText("请输入首付比例...");
					ProductInforMationIsWalletTextField.setBorder(Constants.LIGHT_GRAY_BORDER);
				}	
			}
			@Override
			public void focusGained(FocusEvent e) {
				
				String ProductInforMationIsWallet = String.valueOf(ProductInforMationIsWalletTextField.getText());
				if (ApiHandler_1600x900.isEqual(ProductInforMationIsWallet,"请输入首付比例...")) {
					ProductInforMationIsWalletTextField.setText("");
					ProductInforMationIsWalletTextField.setBorder(Constants.DARKGRAY_BORDER);
				}
			}	
		});
		
		//分期产品信息查询序号输入框-焦点事件
		ProductInforMationTextField.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				
				String ProductInforMation = String.valueOf(ProductInforMationTextField.getText());
				if (ApiHandler_1600x900.isEmpty(ProductInforMation)) {
					ProductInforMationTextField.setText("请输入分期产品序号...");
					ProductInforMationTextField.setBorder(Constants.LIGHT_GRAY_BORDER);
				}	
			}
			@Override
			public void focusGained(FocusEvent e) {
				
				String ProductInforMation = String.valueOf(ProductInforMationTextField.getText());
				if (ApiHandler_1600x900.isEqual(ProductInforMation,"请输入分期产品序号...")) {
					ProductInforMationTextField.setText("");
					ProductInforMationTextField.setBorder(Constants.DARKGRAY_BORDER);
				}
			}	
		});

		//类型绑定商品小类查询商品类型ID输入框-焦点事件
		TypeBoundGoodsGoodsTypeIdTextField.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				
				String BrandBoundGoodsGoodsTypeId = String.valueOf(TypeBoundGoodsGoodsTypeIdTextField.getText());
				if (ApiHandler_1600x900.isEmpty(BrandBoundGoodsGoodsTypeId)) {
					TypeBoundGoodsGoodsTypeIdTextField.setText("请输入商品类型ID...");
					TypeBoundGoodsGoodsTypeIdTextField.setBorder(Constants.LIGHT_GRAY_BORDER);
				}	
			}
			@Override
			public void focusGained(FocusEvent e) {
				
				String BrandBoundGoodsGoodsTypeId = String.valueOf(TypeBoundGoodsGoodsTypeIdTextField.getText());
				if (ApiHandler_1600x900.isEqual(BrandBoundGoodsGoodsTypeId,"请输入商品类型ID...")) {
					TypeBoundGoodsGoodsTypeIdTextField.setText("");
					TypeBoundGoodsGoodsTypeIdTextField.setBorder(Constants.DARKGRAY_BORDER);
				}
			}	
		});	

		//类型绑定商品小类查询序号输入框-焦点事件
		TypeBoundGoodsTextField.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				
				String BrandBoundGoods = String.valueOf(TypeBoundGoodsTextField.getText());
				if (ApiHandler_1600x900.isEmpty(BrandBoundGoods)) {
					TypeBoundGoodsTextField.setText("请输入商品小类序号...");
					TypeBoundGoodsTextField.setBorder(Constants.LIGHT_GRAY_BORDER);
				}	
			}
			@Override
			public void focusGained(FocusEvent e) {
				
				String BrandBoundGoods = String.valueOf(TypeBoundGoodsTextField.getText());
				if (ApiHandler_1600x900.isEqual(BrandBoundGoods,"请输入商品小类序号...")) {
					TypeBoundGoodsTextField.setText("");
					TypeBoundGoodsTextField.setBorder(Constants.DARKGRAY_BORDER);
				}
			}	
		});	

		//小类绑定商品品牌查询商品小类Value输入框-焦点事件
		GoodsBoundBrandsGoodsSubTypeValueTextField.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				
				String GoodsBoundBrandsGoodsSubTypeValue = String.valueOf(GoodsBoundBrandsGoodsSubTypeValueTextField.getText());
				if (ApiHandler_1600x900.isEmpty(GoodsBoundBrandsGoodsSubTypeValue)) {
					GoodsBoundBrandsGoodsSubTypeValueTextField.setText("请输入商品小类Value...");
					GoodsBoundBrandsGoodsSubTypeValueTextField.setBorder(Constants.LIGHT_GRAY_BORDER);
				}	
			}
			@Override
			public void focusGained(FocusEvent e) {
				
				String GoodsBoundBrandsGoodsSubTypeValue = String.valueOf(GoodsBoundBrandsGoodsSubTypeValueTextField.getText());
				if (ApiHandler_1600x900.isEqual(GoodsBoundBrandsGoodsSubTypeValue,"请输入商品小类Value...")) {
					GoodsBoundBrandsGoodsSubTypeValueTextField.setText("");
					GoodsBoundBrandsGoodsSubTypeValueTextField.setBorder(Constants.DARKGRAY_BORDER);
				}
			}	
		});	

		//小类绑定商品品牌查询商品类型ID输入框-焦点事件
		GoodsBoundBrandsGoodsTypeIdTextField.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				
				String GoodsBoundBrandsGoodsTypeId = String.valueOf(GoodsBoundBrandsGoodsTypeIdTextField.getText());
				if (ApiHandler_1600x900.isEmpty(GoodsBoundBrandsGoodsTypeId)) {
					GoodsBoundBrandsGoodsTypeIdTextField.setText("请输入商品类型ID...");
					GoodsBoundBrandsGoodsTypeIdTextField.setBorder(Constants.LIGHT_GRAY_BORDER);
				}	
			}
			@Override
			public void focusGained(FocusEvent e) {
				
				String GoodsBoundBrandsGoodsTypeId = String.valueOf(GoodsBoundBrandsGoodsTypeIdTextField.getText());
				if (ApiHandler_1600x900.isEqual(GoodsBoundBrandsGoodsTypeId,"请输入商品类型ID...")) {
					GoodsBoundBrandsGoodsTypeIdTextField.setText("");
					GoodsBoundBrandsGoodsTypeIdTextField.setBorder(Constants.DARKGRAY_BORDER);
				}
			}	
		});	
		
		//小类绑定商品品牌查询序号输入框-焦点事件
		GoodsBoundBrandsTextField.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				
				String GoodsBoundBrands = String.valueOf(GoodsBoundBrandsTextField.getText());
				if (ApiHandler_1600x900.isEmpty(GoodsBoundBrands)) {
					GoodsBoundBrandsTextField.setText("请输入商品品牌序号...");
					GoodsBoundBrandsTextField.setBorder(Constants.LIGHT_GRAY_BORDER);
				}	
			}
			@Override
			public void focusGained(FocusEvent e) {
				
				String GoodsBoundBrands = String.valueOf(GoodsBoundBrandsTextField.getText());
				if (ApiHandler_1600x900.isEqual(GoodsBoundBrands,"请输入商品品牌序号...")) {
					GoodsBoundBrandsTextField.setText("");
					GoodsBoundBrandsTextField.setBorder(Constants.DARKGRAY_BORDER);
				}
			}	
		});	

		//商品型号输入框-焦点事件
		DefinitionTextFieldFocusAdapter(ModelTextField,"请输入商品型号...");
//		ModelTextField.addFocusListener(new FocusAdapter() {
//			@Override
//			public void focusLost(FocusEvent e) {
//				
//				String Model = String.valueOf(ModelTextField.getText());
//				if (ApiHandler_1920x1080.isEmpty(Model)) {
//					ModelTextField.setText("请输入商品型号...");
//					ModelTextField.setBorder(Constants.LIGHT_GRAY_BORDER);
//				}	
//			}
//			@Override
//			public void focusGained(FocusEvent e) {
//				
//				String Model = String.valueOf(ModelTextField.getText());
//				if (ApiHandler_1920x1080.isEqual(Model,"请输入商品型号...")) {
//					ModelTextField.setText("");
//					ModelTextField.setBorder(Constants.DARKGRAY_BORDER);
//				}
//			}	
//		});	
		
		//医疗费输入框-焦点事件
		DefinitionTextFieldFocusAdapter(HealthFeeTextField,"请输入医疗费...");
		
		//安全费输入框-焦点事件
		DefinitionTextFieldFocusAdapter(SecureFeeTextField,"请输入安全费...");	
		
		//综合保险费输入框-焦点事件
		DefinitionTextFieldFocusAdapter(ComprehensiveInsuranceFeeTextField,"请输入综合保险费...");		
		
		//信息输入框-焦点事件
		DefinitionTextFieldFocusAdapter(InformationTextField,"请输入信息...");
		
		//货位号输入框-焦点事件
		DefinitionTextFieldFocusAdapter(GoodsLocationNumberTextField,"请输入货位号...");
		
		//是否WIFI热点城市输入框-焦点事件
		DefinitionTextFieldFocusAdapter(IsCarryWifiTextField,"请输入是否WIFI热点城市...");
		
		//是否学生产品输入框-焦点事件
		DefinitionTextFieldFocusAdapter(IsStudentTextField,"请输入是否学生产品...");
		
		//是否购买全面保输入框-焦点事件
		DefinitionTextFieldFocusAdapter(PowerFlagTextField,"请输入是否购买全面保...");
		
		//全面保费输入框-焦点事件
		DefinitionTextFieldFocusAdapter(PowerFeeTextField,"请输入全面保费...");
		
		//是否购买保险输入框-焦点事件
		DefinitionTextFieldFocusAdapter(InsuranceFlagTextField,"请输入是否购买保险...");
		
		//保险费输入框-焦点事件
		DefinitionTextFieldFocusAdapter(InsuranceFeeTextField,"请输入保险费...");
		
		//是否购买百宝箱输入框-焦点事件
		DefinitionTextFieldFocusAdapter(TreasureChestFlagTextField,"请输入是否购买百宝箱...");
		
		//百宝箱费输入框-焦点事件
		DefinitionTextFieldFocusAdapter(TreasureChestFeeTextField,"请输入百宝箱费...");
		
		//商城赠券费输入框-焦点事件
		DefinitionTextFieldFocusAdapter(ShoppingCouponsFeeTextField,"请输入商城赠券费...");
		
//		//分期产品代码输入框-焦点事件
//		DefinitionTextFieldFocusAdapter(ProductCodeTextField,"请输入分期产品代码...");
		
		//-----------------------------------------------------------------------------
		//姓名输入框-焦点事件
		DefinitionTextFieldFocusAdapter(UserNameTextField,"请输入姓名...");
		
		//民族输入框-焦点事件
		DefinitionTextFieldFocusAdapter(NationalIdTextField,"请输入民族...");
		
		//身份证号码输入框-焦点事件
		DefinitionTextFieldFocusAdapter(IdentNoTextField,"请输入身份证号码...");
		
		//用户身份证正面照输入框-焦点事件
		DefinitionTextFieldFocusAdapter(IdentPhoneBackTextField,"请输入身份证正面照...");
		
		//用户身份证反面照输入框-焦点事件
		DefinitionTextFieldFocusAdapter(IdentPhoneFrontTextField,"请输入身份证反面照...");

		//身份证所属省份输入框-焦点事件
		DefinitionTextFieldFocusAdapter(Address_ProvinceTextField,"请输入身份证所属省份...");
		
		//身份证所属城市输入框-焦点事件
		DefinitionTextFieldFocusAdapter(Address_CityTextField,"请输入身份证所属城市...");
		
		//身份证所属区县输入框-焦点事件
		DefinitionTextFieldFocusAdapter(Address_RegionTextField,"请输入身份证所属区县...");
		
		//身份证详细地址输入框-焦点事件
		DefinitionTextFieldFocusAdapter(IdentAddressTextField,"请输入身份证详细地址...");
		
		//身份证发证机关输入框-焦点事件
		DefinitionTextFieldFocusAdapter(IdentAuthTextField,"请输入身份证发证机关...");
		
		//身份证有效期限输入框-焦点事件
		DefinitionTextFieldFocusAdapter(IdentExpTextField,"请输入身份证有效期限...");
		
		//-----------------------------------------------------------------------------
		//现居住地所属省份输入框-焦点事件
		DefinitionTextFieldFocusAdapter(liveInfo_ProvinceTextField,"请输入现居住地所属省份...");
		
		//现居住地所属城市输入框-焦点事件
		DefinitionTextFieldFocusAdapter(liveInfo_CityTextField,"请输入现居住地所属城市...");
		
		//现居住地所属区县输入框-焦点事件
		DefinitionTextFieldFocusAdapter(liveInfo_RegionTextField,"请输入现居住地所属区县...");
		
		//现居住地详细地址输入框-焦点事件
		DefinitionTextFieldFocusAdapter(liveInfo_DetailTextField,"请输入现居住地详细地址...");
		
		//教育程度输入框-焦点事件
		DefinitionTextFieldFocusAdapter(educationTypeIdTextField,"请输入教育程度...");
		
		//个人月收入总额输入框-焦点事件
		DefinitionTextFieldFocusAdapter(monthIncomeTextField,"请输入个人月收入总额...");
		
		//个人月支出输入框-焦点事件
		DefinitionTextFieldFocusAdapter(monthExpendTextField,"请输入个人月支出...");
		
		//家庭月收入总额输入框-焦点事件
		DefinitionTextFieldFocusAdapter(familyTotalIncomeTextField,"请输入家庭月收入总额...");
		
		//手机号输入框-焦点事件
		DefinitionTextFieldFocusAdapter(cellPhoneTextField,"请输入手机号...");
		
		//QQ号输入框-焦点事件
		DefinitionTextFieldFocusAdapter(qqTextField,"请输入QQ号...");
		
		//电子邮箱输入框-焦点事件
		DefinitionTextFieldFocusAdapter(emailTextField,"请输入电子邮箱...");
		
		//微信输入框-焦点事件
		DefinitionTextFieldFocusAdapter(wechartTextField,"请输入微信...");
		
		//住房情况输入框-焦点事件
		DefinitionTextFieldFocusAdapter(houseTypeIdTextField,"请输入住房情况...");
		
		//婚姻状况输入框-焦点事件
		DefinitionTextFieldFocusAdapter(marriageTypeIdTextField,"请输入婚姻状况...");
		
		//子女数目输入框-焦点事件
		DefinitionTextFieldFocusAdapter(childrenCountTextField,"请输入子女数目...");
		
		//家庭固定电话输入框-焦点事件
		DefinitionTextFieldFocusAdapter(familyTelTextField,"请输入家庭固定电话...");
		
		//-------------------------------------------------------------------------------
		//单位所属地址输入框-焦点事件
		DefinitionTextFieldFocusAdapter(CompProvinceTextField,"请输入单位所属地址...");
		
		//单位所属城市输入框-焦点事件
		DefinitionTextFieldFocusAdapter(CompCityTextField,"请输入单位所属城市...");
		
		//单位所属区县输入框-焦点事件
		DefinitionTextFieldFocusAdapter(CompRegionTextField,"请输入单位所属区县...");
		
		//单位详细地址输入框-焦点事件
		DefinitionTextFieldFocusAdapter(compAddDetailTextField,"请输入单位详细地址...");
		
		//单位名称输入框-焦点事件
		DefinitionTextFieldFocusAdapter(compNameTextField,"请输入单位名称...");
		
		//单位电话输入框-焦点事件
		DefinitionTextFieldFocusAdapter(workPhoneTextField,"请输入单位电话...");
		
		//单位固话分机号输入框-焦点事件
		DefinitionTextFieldFocusAdapter(workPhoneExtTextField,"请输入单位固话分机号...");
		
		//行业类别输入框-焦点事件
		DefinitionTextFieldFocusAdapter(jobsTypeIdTextField,"请输入行业类别...");
		
		//单位性质输入框-焦点事件
		DefinitionTextFieldFocusAdapter(companyPropertyIdTextField,"请输入单位性质...");
		
		//任职部门输入框-焦点事件
		DefinitionTextFieldFocusAdapter(departmentTextField,"请输入任职部门...");
		
		//职位输入框-焦点事件
		DefinitionTextFieldFocusAdapter(industryTypeIdTextField,"请输入职位...");
		
		//入职时间输入框-焦点事件
		DefinitionTextFieldFocusAdapter(entryDateTextField,"请输入入职时间...");
		
		//工作年限T输入框-焦点事件
		DefinitionTextFieldFocusAdapter(workYearsTextField,"请输入工作年限T...");
		
		//-------------------------------------------------------------------------------
		//联系人类型输入框-焦点事件
		DefinitionTextFieldFocusAdapter(Contacts_typeTextField,"请输入联系人类型...");		
		
		//联系人姓名输入框-焦点事件
		DefinitionTextFieldFocusAdapter(Contacts_linkerNameTextField,"请输入联系人姓名...");	
		
		//联系人手机号输入框-焦点事件
		DefinitionTextFieldFocusAdapter(Contacts_phoneTextField,"请输入联系人手机号...");
		
		//联系人与本人关系输入框-焦点事件
		DefinitionTextFieldFocusAdapter(Contacts_relationTypeIDTextField,"请输入联系人与本人关系...");
		
		//-------------------------------------------------------------------------------
		//银行卡号码输入框-焦点事件
		DefinitionTextFieldFocusAdapter(bankAccountNoTextField,"请输入银行卡号码...");
		
		//银行卡照片输入框-焦点事件
		DefinitionTextFieldFocusAdapter(bankPhotoTextField,"请输入银行卡照片...");
		
		//银行卡类型输入框-焦点事件
		DefinitionTextFieldFocusAdapter(bankIdTextField,"请输入银行卡类型...");
		
		//银行卡开户行省份输入框-焦点事件
		DefinitionTextFieldFocusAdapter(bankProvinceTextField,"请输入开户行省...");
		
		//银行卡开户直辖市输入框-焦点事件
		DefinitionTextFieldFocusAdapter(bankCityTextField,"请输入开户行市...");
		
		//银行卡开户行输入框-焦点事件
		DefinitionTextFieldFocusAdapter(branchTextField,"请输入银行卡开户行...");
		
		//-------------------------------------------------------------------------------
		//内部代码输入框-焦点事件
		DefinitionTextFieldFocusAdapter(innerCodeTextField,"请输入内部代码...");
		
		//商店输入框-焦点事件
		DefinitionTextFieldFocusAdapter(shopTextFiel,"请输入商店...");
		
		//提单备注输入框-焦点事件
		DefinitionTextFieldFocusAdapter(remarkTextFiel,"请输入提单备注...");
		
		//是否移动门店输入框-焦点事件
		DefinitionTextFieldFocusAdapter(isShopTextField,"请输入是否移动门店...");
		
		//-------------------------------------------------------------------------------
		//流式输入框-焦点事件
		DefinitionTextFieldFocusAdapter(flowTypeTextField,"请输入流式...");
		
		//图片类型输入框-焦点事件
		DefinitionTextFieldFocusAdapter(photoTypeTextField,"请输入图片类型...");
		
		//图片名称输入框-焦点事件
		DefinitionTextFieldFocusAdapter(nameTextField,"请输入图片名称...");
		
		//图片路径输入框-焦点事件
		DefinitionTextFieldFocusAdapter(pathTextField,"请输入图片路径...");	
	}
	
	private void initButtonEvent() {  
		
		String DataVersion = databasetools.ui.frame.LoginWindow.DataVersionBox.getSelectedItem().toString();
		
		//用户后台登录信息查询按钮-事件
		UserInfoButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				String UserID = String.valueOf(UserIDTextField.getText());
				String UserPassword = String.valueOf(UserPassWordTextField.getText());
				if("请输入用户ID...".equals(UserID)){
					JOptionPane.showMessageDialog(null, "请输入查询的用户ID！");
					return;
				}
				if("请输入用户密码...".equals(UserPassword)){
					JOptionPane.showMessageDialog(null, "请输入查询的用户密码！");
					return;
				}
				try {
					ApiHandler_1600x900.UserInfo(UserID,UserPassword);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		
		//用户绑定门店信息查询按钮-事件
		UserBoundStoreButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				String UserID = String.valueOf(UserIDTextField.getText());
				String UserPassword = String.valueOf(UserPassWordTextField.getText());
				
				if("请输入用户ID...".equals(UserID)){
					JOptionPane.showMessageDialog(null, "请输入查询的用户ID！");
					return;
				}
				if("请输入用户密码...".equals(UserPassword)){
					JOptionPane.showMessageDialog(null, "请输入查询的用户密码！");
					return;
				}
				try {
					int StoreID=Integer.parseInt(UserBoundStoreTextField.getText());
					String StoreCode = ApiHandler_OneTouchCredit_1600x900.UserBoundStore(UserID,UserPassword,"data.code["+StoreID+"-2]");
					String StoreName = ApiHandler_OneTouchCredit_1600x900.UserBoundStore(UserID,UserPassword,"data.name["+StoreID+"-2]");
		            String StoreCode1 = ApiHandler_OneTouchCredit_1600x900.UserBoundStore(UserID,UserPassword,"data.code["+StoreID+"-1]");
		            String StoreName1 = ApiHandler_OneTouchCredit_1600x900.UserBoundStore(UserID,UserPassword,"data.name["+StoreID+"-1]");
		            String UserBoundStoreValue = StoreCode+"-"+StoreName;
		            String UserBoundStoreValue1 = StoreCode1+"-"+StoreName1;
		            
		            ApiHandler_1600x900.UserBoundStore(UserID,UserPassword);
			    	DefinitionBox(UserBoundStoreBox, 170, 40-10, 253, 21,StoreID,UserBoundStoreValue,UserBoundStoreValue1,null,null,null,null,null,null,null,null, null, null, null, null, null, null, null, null
					,null,null,null,null,null,null,null,null,null);
				} catch (Exception e1) {
					e1.printStackTrace();
				}  
		    }
		});
		
		//门店绑定商品类型查询按钮-事件
		StoreBoundCommodityTypeButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				String UserID = String.valueOf(UserIDTextField.getText());
				String UserPassword = String.valueOf(UserPassWordTextField.getText());
				if("请输入用户ID...".equals(UserID)){
					JOptionPane.showMessageDialog(null, "请输入查询的用户ID！");
					return;
				}
				if("请输入用户密码...".equals(UserPassword)){
					JOptionPane.showMessageDialog(null, "请输入查询的用户密码！");
					return;
				}
				try {
					String CommodityTypeData = "data";
					String CommodityTypeStores = "stores";
					String CommodityTypeGoodTypes = "goodTypes";
					int CommodityID=Integer.parseInt(UserBoundStoreTextField.getText())-1;
					int CommodityTypeID=Integer.parseInt(StoreBoundCommodityTypeTextField.getText());
					
			    	String CommodityTypeText = ApiHandler_OneTouchCredit_1600x900.StoreBoundCommodityType(UserID,UserPassword,""+CommodityTypeData+"."+CommodityTypeStores+"",""+CommodityTypeGoodTypes+"["+CommodityID+"].text[0]");
			    	String CommodityTypeText1 = ApiHandler_OneTouchCredit_1600x900.StoreBoundCommodityType(UserID,UserPassword,""+CommodityTypeData+"."+CommodityTypeStores+"",""+CommodityTypeGoodTypes+"["+CommodityID+"].text[1]");
			    	String CommodityTypeText2 = ApiHandler_OneTouchCredit_1600x900.StoreBoundCommodityType(UserID,UserPassword,""+CommodityTypeData+"."+CommodityTypeStores+"",""+CommodityTypeGoodTypes+"["+CommodityID+"].text[2]");
			    	String CommodityTypeText3 = ApiHandler_OneTouchCredit_1600x900.StoreBoundCommodityType(UserID,UserPassword,""+CommodityTypeData+"."+CommodityTypeStores+"",""+CommodityTypeGoodTypes+"["+CommodityID+"].text[3]");
			    	String CommodityTypeText4 = ApiHandler_OneTouchCredit_1600x900.StoreBoundCommodityType(UserID,UserPassword,""+CommodityTypeData+"."+CommodityTypeStores+"",""+CommodityTypeGoodTypes+"["+CommodityID+"].text[4]");
			    	String CommodityTypeText5 = ApiHandler_OneTouchCredit_1600x900.StoreBoundCommodityType(UserID,UserPassword,""+CommodityTypeData+"."+CommodityTypeStores+"",""+CommodityTypeGoodTypes+"["+CommodityID+"].text[5]");
			    	String CommodityTypeText6 = ApiHandler_OneTouchCredit_1600x900.StoreBoundCommodityType(UserID,UserPassword,""+CommodityTypeData+"."+CommodityTypeStores+"",""+CommodityTypeGoodTypes+"["+CommodityID+"].text[6]");
			    	String CommodityTypeText7 = ApiHandler_OneTouchCredit_1600x900.StoreBoundCommodityType(UserID,UserPassword,""+CommodityTypeData+"."+CommodityTypeStores+"",""+CommodityTypeGoodTypes+"["+CommodityID+"].text[7]");
			    	String CommodityTypeText8 = ApiHandler_OneTouchCredit_1600x900.StoreBoundCommodityType(UserID,UserPassword,""+CommodityTypeData+"."+CommodityTypeStores+"",""+CommodityTypeGoodTypes+"["+CommodityID+"].text[8]");
			    	String CommodityTypeText9 = ApiHandler_OneTouchCredit_1600x900.StoreBoundCommodityType(UserID,UserPassword,""+CommodityTypeData+"."+CommodityTypeStores+"",""+CommodityTypeGoodTypes+"["+CommodityID+"].text[9]");
			    	String CommodityTypeText10 = ApiHandler_OneTouchCredit_1600x900.StoreBoundCommodityType(UserID,UserPassword,""+CommodityTypeData+"."+CommodityTypeStores+"",""+CommodityTypeGoodTypes+"["+CommodityID+"].text[10]");
			    	String CommodityTypeText11 = ApiHandler_OneTouchCredit_1600x900.StoreBoundCommodityType(UserID,UserPassword,""+CommodityTypeData+"."+CommodityTypeStores+"",""+CommodityTypeGoodTypes+"["+CommodityID+"].text[11]");
			    	String CommodityTypeText12 = ApiHandler_OneTouchCredit_1600x900.StoreBoundCommodityType(UserID,UserPassword,""+CommodityTypeData+"."+CommodityTypeStores+"",""+CommodityTypeGoodTypes+"["+CommodityID+"].text[12]");
			    	String CommodityTypeText13 = ApiHandler_OneTouchCredit_1600x900.StoreBoundCommodityType(UserID,UserPassword,""+CommodityTypeData+"."+CommodityTypeStores+"",""+CommodityTypeGoodTypes+"["+CommodityID+"].text[13]");
			    	String CommodityTypeText14 = ApiHandler_OneTouchCredit_1600x900.StoreBoundCommodityType(UserID,UserPassword,""+CommodityTypeData+"."+CommodityTypeStores+"",""+CommodityTypeGoodTypes+"["+CommodityID+"].text[14]");
			    	String CommodityTypeText15 = ApiHandler_OneTouchCredit_1600x900.StoreBoundCommodityType(UserID,UserPassword,""+CommodityTypeData+"."+CommodityTypeStores+"",""+CommodityTypeGoodTypes+"["+CommodityID+"].text[15]");
			    	String CommodityTypeText16 = ApiHandler_OneTouchCredit_1600x900.StoreBoundCommodityType(UserID,UserPassword,""+CommodityTypeData+"."+CommodityTypeStores+"",""+CommodityTypeGoodTypes+"["+CommodityID+"].text[16]");
			    	String CommodityTypeText17 = ApiHandler_OneTouchCredit_1600x900.StoreBoundCommodityType(UserID,UserPassword,""+CommodityTypeData+"."+CommodityTypeStores+"",""+CommodityTypeGoodTypes+"["+CommodityID+"].text[17]");
			    	
		            DefinitionBox(StoreBoundCommodityTypeBox, 170, 70-13, 253, 21,CommodityTypeID,CommodityTypeText,CommodityTypeText1,CommodityTypeText2,CommodityTypeText3,CommodityTypeText4,CommodityTypeText5,
				    CommodityTypeText6,CommodityTypeText7,CommodityTypeText8,CommodityTypeText9,CommodityTypeText10,CommodityTypeText11,CommodityTypeText12,CommodityTypeText13,CommodityTypeText14,
				    CommodityTypeText15,CommodityTypeText16,CommodityTypeText17,null,null,null,null,null,null,null,null,null);
		            
					ApiHandler_1600x900.StoreBoundCommodityType(UserID,UserPassword);
				} catch (Exception e1) {
					e1.printStackTrace();
				}	    	
		    }
		});			

		//门店绑定产品版本查询按钮-事件
		StoreBoundProductVersionButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				String UserID = String.valueOf(UserIDTextField.getText());
				String UserPassword = String.valueOf(UserPassWordTextField.getText());
				if("请输入用户ID...".equals(UserID)){
					JOptionPane.showMessageDialog(null, "请输入查询的用户ID！");
					return;
				}
				if("请输入用户密码...".equals(UserPassword)){
					JOptionPane.showMessageDialog(null, "请输入查询的用户密码！");
					return;
				}
				try {
					String ProductVersionData = "data";
					String ProductVersionStores = "stores";
					String ProductVersionProductTypes = "productTypes";
					int BoundStoreID=Integer.parseInt(UserBoundStoreTextField.getText())-1;
					int ProductVersionID=Integer.parseInt(StoreBoundProductVersionTextField.getText());
					
					String ProductVersionText = ApiHandler_OneTouchCredit_1600x900.StoreBoundProductVersion(UserID,UserPassword,""+ProductVersionData+"."+ProductVersionStores+"",""+ProductVersionProductTypes+"["+BoundStoreID+"].text[0]");
			    	String ProductVersionText1 = ApiHandler_OneTouchCredit_1600x900.StoreBoundProductVersion(UserID,UserPassword,""+ProductVersionData+"."+ProductVersionStores+"",""+ProductVersionProductTypes+"["+BoundStoreID+"].text[1]");
			    	String ProductVersionText2 = ApiHandler_OneTouchCredit_1600x900.StoreBoundProductVersion(UserID,UserPassword,""+ProductVersionData+"."+ProductVersionStores+"",""+ProductVersionProductTypes+"["+BoundStoreID+"].text[2]");
			    	String ProductVersionText3 = ApiHandler_OneTouchCredit_1600x900.StoreBoundProductVersion(UserID,UserPassword,""+ProductVersionData+"."+ProductVersionStores+"",""+ProductVersionProductTypes+"["+BoundStoreID+"].text[3]");
			    	String ProductVersionText4 = ApiHandler_OneTouchCredit_1600x900.StoreBoundProductVersion(UserID,UserPassword,""+ProductVersionData+"."+ProductVersionStores+"",""+ProductVersionProductTypes+"["+BoundStoreID+"].text[4]");
			    	String ProductVersionText5 = ApiHandler_OneTouchCredit_1600x900.StoreBoundProductVersion(UserID,UserPassword,""+ProductVersionData+"."+ProductVersionStores+"",""+ProductVersionProductTypes+"["+BoundStoreID+"].text[5]");
			    	String ProductVersionText6 = ApiHandler_OneTouchCredit_1600x900.StoreBoundProductVersion(UserID,UserPassword,""+ProductVersionData+"."+ProductVersionStores+"",""+ProductVersionProductTypes+"["+BoundStoreID+"].text[6]");
			    	String ProductVersionText7 = ApiHandler_OneTouchCredit_1600x900.StoreBoundProductVersion(UserID,UserPassword,""+ProductVersionData+"."+ProductVersionStores+"",""+ProductVersionProductTypes+"["+BoundStoreID+"].text[7]");
			    	String ProductVersionText8 = ApiHandler_OneTouchCredit_1600x900.StoreBoundProductVersion(UserID,UserPassword,""+ProductVersionData+"."+ProductVersionStores+"",""+ProductVersionProductTypes+"["+BoundStoreID+"].text[8]");
			    	String ProductVersionText9 = ApiHandler_OneTouchCredit_1600x900.StoreBoundProductVersion(UserID,UserPassword,""+ProductVersionData+"."+ProductVersionStores+"",""+ProductVersionProductTypes+"["+BoundStoreID+"].text[9]");
//			    	String ProductVersionText10 = ApiHandler_OneTouchCredit_1920x1081.StoreBoundCommodityType(UserID,UserPassword,""+ProductVersionData+"."+ProductVersionStores+"",""+ProductVersionProductTypes+"["+BoundStoreID+"].text[10]");
//			    	String ProductVersionText11 = ApiHandler_OneTouchCredit_1920x1081.StoreBoundCommodityType(UserID,UserPassword,""+ProductVersionData+"."+ProductVersionStores+"",""+ProductVersionProductTypes+"["+BoundStoreID+"].text[11]");
//			    	String ProductVersionText12 = ApiHandler_OneTouchCredit_1920x1081.StoreBoundCommodityType(UserID,UserPassword,""+ProductVersionData+"."+ProductVersionStores+"",""+ProductVersionProductTypes+"["+BoundStoreID+"].text[12]");
//			    	String ProductVersionText13 = ApiHandler_OneTouchCredit_1920x1081.StoreBoundCommodityType(UserID,UserPassword,""+ProductVersionData+"."+ProductVersionStores+"",""+ProductVersionProductTypes+"["+BoundStoreID+"].text[13]");
//			    	String ProductVersionText14 = ApiHandler_OneTouchCredit_1920x1081.StoreBoundCommodityType(UserID,UserPassword,""+ProductVersionData+"."+ProductVersionStores+"",""+ProductVersionProductTypes+"["+BoundStoreID+"].text[14]");
//			    	String ProductVersionText15 = ApiHandler_OneTouchCredit_1920x1081.StoreBoundCommodityType(UserID,UserPassword,""+ProductVersionData+"."+ProductVersionStores+"",""+ProductVersionProductTypes+"["+BoundStoreID+"].text[15]");
//			    	String ProductVersionText16 = ApiHandler_OneTouchCredit_1920x1081.StoreBoundCommodityType(UserID,UserPassword,""+ProductVersionData+"."+ProductVersionStores+"",""+ProductVersionProductTypes+"["+BoundStoreID+"].text[16]");
//			    	String ProductVersionText17 = ApiHandler_OneTouchCredit_1920x1081.StoreBoundCommodityType(UserID,UserPassword,""+ProductVersionData+"."+ProductVersionStores+"",""+ProductVersionProductTypes+"["+BoundStoreID+"].text[17]");

		            DefinitionBox(StoreBoundProductVersionBox, 170, 85, 253, 21,ProductVersionID,ProductVersionText,ProductVersionText1,ProductVersionText2,ProductVersionText3,ProductVersionText4,ProductVersionText5,
		            ProductVersionText6,ProductVersionText7,ProductVersionText8,ProductVersionText9,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null);
		            
					ApiHandler_1600x900.StoreBoundProductVersion(UserID,UserPassword);
				} catch (Exception e1) {
					e1.printStackTrace();
				}	    	
		    }
		});	

		//门店绑定产品类型查询按钮-事件
		StoreBoundProductTypeButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				String UserID = String.valueOf(UserIDTextField.getText());
				String UserPassword = String.valueOf(UserPassWordTextField.getText());
				if("请输入用户ID...".equals(UserID)){
					JOptionPane.showMessageDialog(null, "请输入查询的用户ID！");
					return;
				}
				if("请输入用户密码...".equals(UserPassword)){
					JOptionPane.showMessageDialog(null, "请输入查询的用户密码！");
					return;
				}
				try {
					String ProductTypeData = "data";
					String ProductTypetext = "text";
					int ProductTypeID = Integer.parseInt(StoreBoundProductTypeTextField.getText());
					
					String ProductTypeText = ApiHandler_OneTouchCredit_1600x900.StoreBoundProductType(UserID,UserPassword,""+ProductTypeData+"."+ProductTypetext+"[0]");
//					String ProductTypeText1 = ApiHandler_OneTouchCredit_1920x1081.StoreBoundProductType(UserID,UserPassword,""+ProductTypeData+"."+ProductTypetext+"[1]");
		            DefinitionBox(StoreBoundProductVersionBox, 170, 130-18, 253, 21,ProductTypeID,ProductTypeText,null,null,null,null,null,
		            		null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null); 
		            
					ApiHandler_1600x900.StoreBoundProductType(UserID,UserPassword);
				} catch (Exception e1) {
					e1.printStackTrace();
				}	    	
		    }
		});	
		
		//分期产品信息查询按钮-事件
		ProductInforMationButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				String UserID = String.valueOf(UserIDTextField.getText());
				String UserPassword = String.valueOf(UserPassWordTextField.getText());
				
		    	String ProductInforMationStoreId = String.valueOf(ProductInforMationStorIdTextField.getText());
				String ProductInforMationGoodsCategoryId = String.valueOf(ProductInforMationgoodsCategoryIdTextField.getText());
				String ProductInforMationSearchTypeId = String.valueOf(ProductInforMationSearchTypeIdTextField.getText());
				String ProductInforMationProductTypeId = String.valueOf(ProductInforMationProductTypeIdTextField.getText());
				String ProductInforMationPrice = String.valueOf(ProductInforMationPriceTextField.getText());
				String ProductInforMationFirstPay = String.valueOf(ProductInforMationFirstPayTextField.getText());
				String ProductInforMationIsWallet = String.valueOf(ProductInforMationIsWalletTextField.getText());
				
				if("请输入用户ID...".equals(UserID)){
					JOptionPane.showMessageDialog(null, "请输入查询的用户ID！");
					return;
				}
				if("请输入用户密码...".equals(UserPassword)){
					JOptionPane.showMessageDialog(null, "请输入查询的用户密码！");
					return;
				}
				if("请输入商品门店ID...".equals(ProductInforMationStoreId)){
					JOptionPane.showMessageDialog(null, "请输入查询的商品门店ID！");
					return;
				}
				if("请输入商品类型ID...".equals(ProductInforMationGoodsCategoryId)){
					JOptionPane.showMessageDialog(null, "请输入查询的商品类型ID！");
					return;
				}
				if("请输入产品版本ID...".equals(ProductInforMationSearchTypeId)){
					JOptionPane.showMessageDialog(null, "请输入查询的产品版本ID！");
					return;
				}
				if("请输入产品类型ID...".equals(ProductInforMationProductTypeId)){
					JOptionPane.showMessageDialog(null, "请输入查询的产品类型ID！");
					return;
				}
				if("请输入首付总额...".equals(ProductInforMationPrice)){
					JOptionPane.showMessageDialog(null, "请输入查询的首付总额！");
					return;
				}
				if("请输入首付总额...".equals(ProductInforMationFirstPay)){
					JOptionPane.showMessageDialog(null, "请输入查询的首付总额！");
					return;
				}
				if("请输入首付比例...".equals(ProductInforMationIsWallet)){
					JOptionPane.showMessageDialog(null, "请输入查询的首付比例！");
					return;
				}
				try {
//					String ProductInforMationStoreId = String.valueOf(ProductInforMationStorIdTextField.getText());
//					String ProductInforMationGoodsCategoryId = String.valueOf(ProductInforMationgoodsCategoryIdTextField.getText());
//					String ProductInforMationSearchTypeId = String.valueOf(ProductInforMationSearchTypeIdTextField.getText());
//					String ProductInforMationProductTypeId = String.valueOf(ProductInforMationProductTypeIdTextField.getText());
//					String ProductInforMationPrice = String.valueOf(ProductInforMationPriceTextField.getText());
//					String ProductInforMationFirstPay = String.valueOf(ProductInforMationFirstPayTextField.getText());
//					String ProductInforMationIsWallet = String.valueOf(ProductInforMationIsWalletTextField.getText());
			
					String ProductInforMationData = "data";
					String ProductInforMationEntities = "entities";
					String ProductInforMationPaymentNum = "paymentNum";
					String ProductInforMationPayment = "payment";
					String ProductInforMationProdCode = "prodCode";
					String ProductInforMationProdName = "prodName";
					int ProductInforMationID=Integer.parseInt(ProductInforMationTextField.getText());

					String ProductInforMationPaymentNumText = ApiHandler_OneTouchCredit_1600x900.ProductInforMation(ProductInforMationStoreId,ProductInforMationGoodsCategoryId,ProductInforMationSearchTypeId,
					       ProductInforMationProductTypeId,ProductInforMationPrice,ProductInforMationFirstPay,ProductInforMationIsWallet,UserID,UserPassword,""+ProductInforMationData+"."+ProductInforMationEntities+"",""+ProductInforMationPaymentNum+"[0]");
					
					String ProductInforMationPaymentText = ApiHandler_OneTouchCredit_1600x900.ProductInforMation(ProductInforMationStoreId,ProductInforMationGoodsCategoryId,ProductInforMationSearchTypeId,
						   ProductInforMationProductTypeId,ProductInforMationPrice,ProductInforMationFirstPay,ProductInforMationIsWallet,UserID,UserPassword,""+ProductInforMationData+"."+ProductInforMationEntities+"",""+ProductInforMationPayment+"[0]");
					
					String ProductInforMationProdCodeText = ApiHandler_OneTouchCredit_1600x900.ProductInforMation(ProductInforMationStoreId,ProductInforMationGoodsCategoryId,ProductInforMationSearchTypeId,
					       ProductInforMationProductTypeId,ProductInforMationPrice,ProductInforMationFirstPay,ProductInforMationIsWallet,UserID,UserPassword,""+ProductInforMationData+"."+ProductInforMationEntities+"",""+ProductInforMationProdCode+"[0]");

					String ProductInforMationProdNameText = ApiHandler_OneTouchCredit_1600x900.ProductInforMation(ProductInforMationStoreId,ProductInforMationGoodsCategoryId,ProductInforMationSearchTypeId,
						   ProductInforMationProductTypeId,ProductInforMationPrice,ProductInforMationFirstPay,ProductInforMationIsWallet,UserID,UserPassword,""+ProductInforMationData+"."+ProductInforMationEntities+"",""+ProductInforMationProdName+"[0]");
					

		            String ProductInforMationPaymentNumText1 = ApiHandler_OneTouchCredit_1600x900.ProductInforMation(ProductInforMationStoreId,ProductInforMationGoodsCategoryId,ProductInforMationSearchTypeId,
					       ProductInforMationProductTypeId,ProductInforMationPrice,ProductInforMationFirstPay,ProductInforMationIsWallet,UserID,UserPassword,""+ProductInforMationData+"."+ProductInforMationEntities+"",""+ProductInforMationPaymentNum+"[1]");
					
					String ProductInforMationPaymentText1 = ApiHandler_OneTouchCredit_1600x900.ProductInforMation(ProductInforMationStoreId,ProductInforMationGoodsCategoryId,ProductInforMationSearchTypeId,
						   ProductInforMationProductTypeId,ProductInforMationPrice,ProductInforMationFirstPay,ProductInforMationIsWallet,UserID,UserPassword,""+ProductInforMationData+"."+ProductInforMationEntities+"",""+ProductInforMationPayment+"[1]");
					
					String ProductInforMationProdCodeText1 = ApiHandler_OneTouchCredit_1600x900.ProductInforMation(ProductInforMationStoreId,ProductInforMationGoodsCategoryId,ProductInforMationSearchTypeId,
					       ProductInforMationProductTypeId,ProductInforMationPrice,ProductInforMationFirstPay,ProductInforMationIsWallet,UserID,UserPassword,""+ProductInforMationData+"."+ProductInforMationEntities+"",""+ProductInforMationProdCode+"[1]");

					String ProductInforMationProdNameText1 = ApiHandler_OneTouchCredit_1600x900.ProductInforMation(ProductInforMationStoreId,ProductInforMationGoodsCategoryId,ProductInforMationSearchTypeId,
						   ProductInforMationProductTypeId,ProductInforMationPrice,ProductInforMationFirstPay,ProductInforMationIsWallet,UserID,UserPassword,""+ProductInforMationData+"."+ProductInforMationEntities+"",""+ProductInforMationProdName+"[1]");

					String ProductInforMationPaymentNumText2 = ApiHandler_OneTouchCredit_1600x900.ProductInforMation(ProductInforMationStoreId,ProductInforMationGoodsCategoryId,ProductInforMationSearchTypeId,
						   ProductInforMationProductTypeId,ProductInforMationPrice,ProductInforMationFirstPay,ProductInforMationIsWallet,UserID,UserPassword,""+ProductInforMationData+"."+ProductInforMationEntities+"",""+ProductInforMationPaymentNum+"[2]");
						
					String ProductInforMationPaymentText2 = ApiHandler_OneTouchCredit_1600x900.ProductInforMation(ProductInforMationStoreId,ProductInforMationGoodsCategoryId,ProductInforMationSearchTypeId,
						   ProductInforMationProductTypeId,ProductInforMationPrice,ProductInforMationFirstPay,ProductInforMationIsWallet,UserID,UserPassword,""+ProductInforMationData+"."+ProductInforMationEntities+"",""+ProductInforMationPayment+"[2]");
						
					String ProductInforMationProdCodeText2 = ApiHandler_OneTouchCredit_1600x900.ProductInforMation(ProductInforMationStoreId,ProductInforMationGoodsCategoryId,ProductInforMationSearchTypeId,
					       ProductInforMationProductTypeId,ProductInforMationPrice,ProductInforMationFirstPay,ProductInforMationIsWallet,UserID,UserPassword,""+ProductInforMationData+"."+ProductInforMationEntities+"",""+ProductInforMationProdCode+"[2]");

					String ProductInforMationProdNameText2 = ApiHandler_OneTouchCredit_1600x900.ProductInforMation(ProductInforMationStoreId,ProductInforMationGoodsCategoryId,ProductInforMationSearchTypeId,
						   ProductInforMationProductTypeId,ProductInforMationPrice,ProductInforMationFirstPay,ProductInforMationIsWallet,UserID,UserPassword,""+ProductInforMationData+"."+ProductInforMationEntities+"",""+ProductInforMationProdName+"[2]");
					
					String ProductInforMationPaymentNumText3 = ApiHandler_OneTouchCredit_1600x900.ProductInforMation(ProductInforMationStoreId,ProductInforMationGoodsCategoryId,ProductInforMationSearchTypeId,
						  ProductInforMationProductTypeId,ProductInforMationPrice,ProductInforMationFirstPay,ProductInforMationIsWallet,UserID,UserPassword,""+ProductInforMationData+"."+ProductInforMationEntities+"",""+ProductInforMationPaymentNum+"[3]");
							
					String ProductInforMationPaymentText3 = ApiHandler_OneTouchCredit_1600x900.ProductInforMation(ProductInforMationStoreId,ProductInforMationGoodsCategoryId,ProductInforMationSearchTypeId,
						  ProductInforMationProductTypeId,ProductInforMationPrice,ProductInforMationFirstPay,ProductInforMationIsWallet,UserID,UserPassword,""+ProductInforMationData+"."+ProductInforMationEntities+"",""+ProductInforMationPayment+"[3]");
							
					String ProductInforMationProdCodeText3 = ApiHandler_OneTouchCredit_1600x900.ProductInforMation(ProductInforMationStoreId,ProductInforMationGoodsCategoryId,ProductInforMationSearchTypeId,
						   ProductInforMationProductTypeId,ProductInforMationPrice,ProductInforMationFirstPay,ProductInforMationIsWallet,UserID,UserPassword,""+ProductInforMationData+"."+ProductInforMationEntities+"",""+ProductInforMationProdCode+"[3]");

					String ProductInforMationProdNameText3 = ApiHandler_OneTouchCredit_1600x900.ProductInforMation(ProductInforMationStoreId,ProductInforMationGoodsCategoryId,ProductInforMationSearchTypeId,
						   ProductInforMationProductTypeId,ProductInforMationPrice,ProductInforMationFirstPay,ProductInforMationIsWallet,UserID,UserPassword,""+ProductInforMationData+"."+ProductInforMationEntities+"",""+ProductInforMationProdName+"[3]");
		   
					String ProductInforMationPaymentNumText4 = ApiHandler_OneTouchCredit_1600x900.ProductInforMation(ProductInforMationStoreId,ProductInforMationGoodsCategoryId,ProductInforMationSearchTypeId,
						   ProductInforMationProductTypeId,ProductInforMationPrice,ProductInforMationFirstPay,ProductInforMationIsWallet,UserID,UserPassword,""+ProductInforMationData+"."+ProductInforMationEntities+"",""+ProductInforMationPaymentNum+"[4]");
								
					String ProductInforMationPaymentText4 = ApiHandler_OneTouchCredit_1600x900.ProductInforMation(ProductInforMationStoreId,ProductInforMationGoodsCategoryId,ProductInforMationSearchTypeId,
						   ProductInforMationProductTypeId,ProductInforMationPrice,ProductInforMationFirstPay,ProductInforMationIsWallet,UserID,UserPassword,""+ProductInforMationData+"."+ProductInforMationEntities+"",""+ProductInforMationPayment+"[4]");
								
					String ProductInforMationProdCodeText4 = ApiHandler_OneTouchCredit_1600x900.ProductInforMation(ProductInforMationStoreId,ProductInforMationGoodsCategoryId,ProductInforMationSearchTypeId,
						   ProductInforMationProductTypeId,ProductInforMationPrice,ProductInforMationFirstPay,ProductInforMationIsWallet,UserID,UserPassword,""+ProductInforMationData+"."+ProductInforMationEntities+"",""+ProductInforMationProdCode+"[4]");

					String ProductInforMationProdNameText4 = ApiHandler_OneTouchCredit_1600x900.ProductInforMation(ProductInforMationStoreId,ProductInforMationGoodsCategoryId,ProductInforMationSearchTypeId,
						   ProductInforMationProductTypeId,ProductInforMationPrice,ProductInforMationFirstPay,ProductInforMationIsWallet,UserID,UserPassword,""+ProductInforMationData+"."+ProductInforMationEntities+"",""+ProductInforMationProdName+"[4]");
					
					String ProductInforMationPaymentNumText5 = ApiHandler_OneTouchCredit_1600x900.ProductInforMation(ProductInforMationStoreId,ProductInforMationGoodsCategoryId,ProductInforMationSearchTypeId,
						   ProductInforMationProductTypeId,ProductInforMationPrice,ProductInforMationFirstPay,ProductInforMationIsWallet,UserID,UserPassword,""+ProductInforMationData+"."+ProductInforMationEntities+"",""+ProductInforMationPaymentNum+"[5]");
								
					String ProductInforMationPaymentText5 = ApiHandler_OneTouchCredit_1600x900.ProductInforMation(ProductInforMationStoreId,ProductInforMationGoodsCategoryId,ProductInforMationSearchTypeId,
						   ProductInforMationProductTypeId,ProductInforMationPrice,ProductInforMationFirstPay,ProductInforMationIsWallet,UserID,UserPassword,""+ProductInforMationData+"."+ProductInforMationEntities+"",""+ProductInforMationPayment+"[5]");
								
					String ProductInforMationProdCodeText5 = ApiHandler_OneTouchCredit_1600x900.ProductInforMation(ProductInforMationStoreId,ProductInforMationGoodsCategoryId,ProductInforMationSearchTypeId,
						   ProductInforMationProductTypeId,ProductInforMationPrice,ProductInforMationFirstPay,ProductInforMationIsWallet,UserID,UserPassword,""+ProductInforMationData+"."+ProductInforMationEntities+"",""+ProductInforMationProdCode+"[5]");

					String ProductInforMationProdNameText5 = ApiHandler_OneTouchCredit_1600x900.ProductInforMation(ProductInforMationStoreId,ProductInforMationGoodsCategoryId,ProductInforMationSearchTypeId,
					       ProductInforMationProductTypeId,ProductInforMationPrice,ProductInforMationFirstPay,ProductInforMationIsWallet,UserID,UserPassword,""+ProductInforMationData+"."+ProductInforMationEntities+"",""+ProductInforMationProdName+"[5]");
					
		            String ProductInforMationText = ProductInforMationPaymentNumText+"--->"+ProductInforMationPaymentText+"--->"+ProductInforMationProdCodeText+"--->"+ProductInforMationProdNameText;
		            String ProductInforMationText1 = ProductInforMationPaymentNumText1+"--->"+ProductInforMationPaymentText1+"--->"+ProductInforMationProdCodeText1+"--->"+ProductInforMationProdNameText1;
		            String ProductInforMationText2 = ProductInforMationPaymentNumText2+"--->"+ProductInforMationPaymentText2+"--->"+ProductInforMationProdCodeText2+"--->"+ProductInforMationProdNameText2;
		            String ProductInforMationText3 = ProductInforMationPaymentNumText3+"--->"+ProductInforMationPaymentText3+"--->"+ProductInforMationProdCodeText3+"--->"+ProductInforMationProdNameText3;
		            String ProductInforMationText4 = ProductInforMationPaymentNumText4+"--->"+ProductInforMationPaymentText4+"--->"+ProductInforMationProdCodeText4+"--->"+ProductInforMationProdNameText4;
		            String ProductInforMationText5 = ProductInforMationPaymentNumText5+"--->"+ProductInforMationPaymentText5+"--->"+ProductInforMationProdCodeText5+"--->"+ProductInforMationProdNameText5;
					
		            DefinitionBox(ProductInforMationBox, 170, 195, 436, 22,ProductInforMationID,ProductInforMationText,ProductInforMationText1,ProductInforMationText2,ProductInforMationText3,ProductInforMationText4,ProductInforMationText5,
		            		null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null);	
		            
					ApiHandler_1600x900.ProductInforMation(ProductInforMationStoreId,ProductInforMationGoodsCategoryId,ProductInforMationSearchTypeId,ProductInforMationProductTypeId,ProductInforMationPrice,
							    ProductInforMationFirstPay,ProductInforMationIsWallet,UserID,UserPassword);
				} catch (Exception e1) {
					e1.printStackTrace();
				}	    	
		    }
		});			

		//类型绑定商品小类查询按钮-事件
		TypeBoundGoodsButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				String UserID = String.valueOf(UserIDTextField.getText());
				String UserPassword = String.valueOf(UserPassWordTextField.getText());
				String TypeBoundGoodsGoodsTypeId = String.valueOf(TypeBoundGoodsGoodsTypeIdTextField.getText());
				
				if("请输入用户ID...".equals(UserID)){
					JOptionPane.showMessageDialog(null, "请输入查询的用户ID！");
					return;
				}
				if("请输入用户密码...".equals(UserPassword)){
					JOptionPane.showMessageDialog(null, "请输入查询的用户密码！");
					return;
				}
				if("请输入商品类型ID...".equals(TypeBoundGoodsGoodsTypeId)){
					JOptionPane.showMessageDialog(null, "请输入查询的商品类型ID！");
					return;
				}
				try {
			    	String TypeBoundGoodsTypeId = String.valueOf(TypeBoundGoodsGoodsTypeIdTextField.getText());
					
					String TypeBoundGoodsData = "data";
					String TypeBoundGoodstext = "text";
					int TypeBoundGoodsTypeID = Integer.parseInt(TypeBoundGoodsTextField.getText());
					
					String TypeBoundGoodsText = ApiHandler_OneTouchCredit_1600x900.TypeBoundGoods(TypeBoundGoodsTypeId,UserID,UserPassword,""+TypeBoundGoodsData+"."+TypeBoundGoodstext+"[0]");
					String TypeBoundGoodsText1 = ApiHandler_OneTouchCredit_1600x900.TypeBoundGoods(TypeBoundGoodsTypeId,UserID,UserPassword,""+TypeBoundGoodsData+"."+TypeBoundGoodstext+"[1]");
					String TypeBoundGoodsText2 = ApiHandler_OneTouchCredit_1600x900.TypeBoundGoods(TypeBoundGoodsTypeId,UserID,UserPassword,""+TypeBoundGoodsData+"."+TypeBoundGoodstext+"[2]");
					String TypeBoundGoodsText3 = ApiHandler_OneTouchCredit_1600x900.TypeBoundGoods(TypeBoundGoodsTypeId,UserID,UserPassword,""+TypeBoundGoodsData+"."+TypeBoundGoodstext+"[3]");
					String TypeBoundGoodsText4 = ApiHandler_OneTouchCredit_1600x900.TypeBoundGoods(TypeBoundGoodsTypeId,UserID,UserPassword,""+TypeBoundGoodsData+"."+TypeBoundGoodstext+"[4]");

		          DefinitionBox(TypeBoundGoodsBox, 457, 225, 150, 21,TypeBoundGoodsTypeID,TypeBoundGoodsText,TypeBoundGoodsText1,TypeBoundGoodsText2,TypeBoundGoodsText3,TypeBoundGoodsText4,null,            
		            		null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null);
		            
					ApiHandler_1600x900.TypeBoundGoods(TypeBoundGoodsGoodsTypeId,UserID,UserPassword);
				} catch (Exception e1) {
					e1.printStackTrace();
				}	    	
		    }
		});		

		//小类绑定商品品牌查询按钮-事件
		GoodsBoundBrandsButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				String UserID = String.valueOf(UserIDTextField.getText());
				String UserPassword = String.valueOf(UserPassWordTextField.getText());
				String GoodsBoundBrandsGoodsSubTypeValue = String.valueOf(GoodsBoundBrandsGoodsSubTypeValueTextField.getText());
				String GoodsBoundBrandsGoodsTypeId = String.valueOf(GoodsBoundBrandsGoodsTypeIdTextField.getText());
				
				if("请输入用户ID...".equals(UserID)){
					JOptionPane.showMessageDialog(null, "请输入查询的用户ID！");
					return;
				}
				if("请输入用户密码...".equals(UserPassword)){
					JOptionPane.showMessageDialog(null, "请输入查询的用户密码！");
					return;
				}
				if("请输入商品小类Value...".equals(GoodsBoundBrandsGoodsSubTypeValue)){
					JOptionPane.showMessageDialog(null, "请输入查询的商品小类Value！");
					return;
				}
				if("请输入商品类型ID...".equals(GoodsBoundBrandsGoodsTypeId)){
					JOptionPane.showMessageDialog(null, "请输入查询的商品类型ID！");
					return;
				}
				try {
					String GoodsSubTypeValue = String.valueOf(GoodsBoundBrandsGoodsSubTypeValueTextField.getText());
					String GoodsCategoryID = String.valueOf(GoodsBoundBrandsGoodsTypeIdTextField.getText());
			    	
					String GoodsBoundBrandsData = "data";
					String GoodsBoundBrandstext = "text";
					int GoodsBoundBrandsGoodsID = Integer.parseInt(GoodsBoundBrandsTextField.getText());
					
					String GoodsBoundBrandsText = ApiHandler_OneTouchCredit_1600x900.GoodsBoundBrands(GoodsSubTypeValue,GoodsCategoryID,UserID,UserPassword,""+GoodsBoundBrandsData+"."+GoodsBoundBrandstext+"[0]");
					String GoodsBoundBrandsText1 = ApiHandler_OneTouchCredit_1600x900.GoodsBoundBrands(GoodsSubTypeValue,GoodsCategoryID,UserID,UserPassword,""+GoodsBoundBrandsData+"."+GoodsBoundBrandstext+"[1]");
					String GoodsBoundBrandsText2 = ApiHandler_OneTouchCredit_1600x900.GoodsBoundBrands(GoodsSubTypeValue,GoodsCategoryID,UserID,UserPassword,""+GoodsBoundBrandsData+"."+GoodsBoundBrandstext+"[2]");
					String GoodsBoundBrandsText3 = ApiHandler_OneTouchCredit_1600x900.GoodsBoundBrands(GoodsSubTypeValue,GoodsCategoryID,UserID,UserPassword,""+GoodsBoundBrandsData+"."+GoodsBoundBrandstext+"[3]");
					String GoodsBoundBrandsText4 = ApiHandler_OneTouchCredit_1600x900.GoodsBoundBrands(GoodsSubTypeValue,GoodsCategoryID,UserID,UserPassword,""+GoodsBoundBrandsData+"."+GoodsBoundBrandstext+"[4]");
					String GoodsBoundBrandsText5 = ApiHandler_OneTouchCredit_1600x900.GoodsBoundBrands(GoodsSubTypeValue,GoodsCategoryID,UserID,UserPassword,""+GoodsBoundBrandsData+"."+GoodsBoundBrandstext+"[5]");
					String GoodsBoundBrandsText6 = ApiHandler_OneTouchCredit_1600x900.GoodsBoundBrands(GoodsSubTypeValue,GoodsCategoryID,UserID,UserPassword,""+GoodsBoundBrandsData+"."+GoodsBoundBrandstext+"[6]");
					String GoodsBoundBrandsText7 = ApiHandler_OneTouchCredit_1600x900.GoodsBoundBrands(GoodsSubTypeValue,GoodsCategoryID,UserID,UserPassword,""+GoodsBoundBrandsData+"."+GoodsBoundBrandstext+"[7]");
					String GoodsBoundBrandsText8 = ApiHandler_OneTouchCredit_1600x900.GoodsBoundBrands(GoodsSubTypeValue,GoodsCategoryID,UserID,UserPassword,""+GoodsBoundBrandsData+"."+GoodsBoundBrandstext+"[8]");
					String GoodsBoundBrandsText9 = ApiHandler_OneTouchCredit_1600x900.GoodsBoundBrands(GoodsSubTypeValue,GoodsCategoryID,UserID,UserPassword,""+GoodsBoundBrandsData+"."+GoodsBoundBrandstext+"[9]");
					String GoodsBoundBrandsText10 = ApiHandler_OneTouchCredit_1600x900.GoodsBoundBrands(GoodsSubTypeValue,GoodsCategoryID,UserID,UserPassword,""+GoodsBoundBrandsData+"."+GoodsBoundBrandstext+"[10]");
					String GoodsBoundBrandsText11= ApiHandler_OneTouchCredit_1600x900.GoodsBoundBrands(GoodsSubTypeValue,GoodsCategoryID,UserID,UserPassword,""+GoodsBoundBrandsData+"."+GoodsBoundBrandstext+"[11]");
					String GoodsBoundBrandsText12 = ApiHandler_OneTouchCredit_1600x900.GoodsBoundBrands(GoodsSubTypeValue,GoodsCategoryID,UserID,UserPassword,""+GoodsBoundBrandsData+"."+GoodsBoundBrandstext+"[12]");
					String GoodsBoundBrandsText13 = ApiHandler_OneTouchCredit_1600x900.GoodsBoundBrands(GoodsSubTypeValue,GoodsCategoryID,UserID,UserPassword,""+GoodsBoundBrandsData+"."+GoodsBoundBrandstext+"[13]");
					String GoodsBoundBrandsText14 = ApiHandler_OneTouchCredit_1600x900.GoodsBoundBrands(GoodsSubTypeValue,GoodsCategoryID,UserID,UserPassword,""+GoodsBoundBrandsData+"."+GoodsBoundBrandstext+"[14]");
					String GoodsBoundBrandsText15 = ApiHandler_OneTouchCredit_1600x900.GoodsBoundBrands(GoodsSubTypeValue,GoodsCategoryID,UserID,UserPassword,""+GoodsBoundBrandsData+"."+GoodsBoundBrandstext+"[15]");
					String GoodsBoundBrandsText16 = ApiHandler_OneTouchCredit_1600x900.GoodsBoundBrands(GoodsSubTypeValue,GoodsCategoryID,UserID,UserPassword,""+GoodsBoundBrandsData+"."+GoodsBoundBrandstext+"[16]");
					String GoodsBoundBrandsText17 = ApiHandler_OneTouchCredit_1600x900.GoodsBoundBrands(GoodsSubTypeValue,GoodsCategoryID,UserID,UserPassword,""+GoodsBoundBrandsData+"."+GoodsBoundBrandstext+"[17]");
					String GoodsBoundBrandsText18 = ApiHandler_OneTouchCredit_1600x900.GoodsBoundBrands(GoodsSubTypeValue,GoodsCategoryID,UserID,UserPassword,""+GoodsBoundBrandsData+"."+GoodsBoundBrandstext+"[18]");
					String GoodsBoundBrandsText19 = ApiHandler_OneTouchCredit_1600x900.GoodsBoundBrands(GoodsSubTypeValue,GoodsCategoryID,UserID,UserPassword,""+GoodsBoundBrandsData+"."+GoodsBoundBrandstext+"[19]");
					String GoodsBoundBrandsText20 = ApiHandler_OneTouchCredit_1600x900.GoodsBoundBrands(GoodsSubTypeValue,GoodsCategoryID,UserID,UserPassword,""+GoodsBoundBrandsData+"."+GoodsBoundBrandstext+"[20]");
					String GoodsBoundBrandsText21 = ApiHandler_OneTouchCredit_1600x900.GoodsBoundBrands(GoodsSubTypeValue,GoodsCategoryID,UserID,UserPassword,""+GoodsBoundBrandsData+"."+GoodsBoundBrandstext+"[21]");
					String GoodsBoundBrandsText22 = ApiHandler_OneTouchCredit_1600x900.GoodsBoundBrands(GoodsSubTypeValue,GoodsCategoryID,UserID,UserPassword,""+GoodsBoundBrandsData+"."+GoodsBoundBrandstext+"[22]");
					String GoodsBoundBrandsText23 = ApiHandler_OneTouchCredit_1600x900.GoodsBoundBrands(GoodsSubTypeValue,GoodsCategoryID,UserID,UserPassword,""+GoodsBoundBrandsData+"."+GoodsBoundBrandstext+"[23]");
					String GoodsBoundBrandsText24 = ApiHandler_OneTouchCredit_1600x900.GoodsBoundBrands(GoodsSubTypeValue,GoodsCategoryID,UserID,UserPassword,""+GoodsBoundBrandsData+"."+GoodsBoundBrandstext+"[24]");
					String GoodsBoundBrandsText25 = ApiHandler_OneTouchCredit_1600x900.GoodsBoundBrands(GoodsSubTypeValue,GoodsCategoryID,UserID,UserPassword,""+GoodsBoundBrandsData+"."+GoodsBoundBrandstext+"[25]");
					String GoodsBoundBrandsText26 = ApiHandler_OneTouchCredit_1600x900.GoodsBoundBrands(GoodsSubTypeValue,GoodsCategoryID,UserID,UserPassword,""+GoodsBoundBrandsData+"."+GoodsBoundBrandstext+"[26]");			

					DefinitionBox(GoodsBoundBrandsBox, 457, 252, 150, 21,GoodsBoundBrandsGoodsID,GoodsBoundBrandsText,GoodsBoundBrandsText1,GoodsBoundBrandsText2,GoodsBoundBrandsText3,GoodsBoundBrandsText4,GoodsBoundBrandsText5,            
		            		GoodsBoundBrandsText6,GoodsBoundBrandsText7,GoodsBoundBrandsText8,GoodsBoundBrandsText9,GoodsBoundBrandsText10,GoodsBoundBrandsText11,GoodsBoundBrandsText12,GoodsBoundBrandsText13,GoodsBoundBrandsText14,
		            		GoodsBoundBrandsText15,GoodsBoundBrandsText16,GoodsBoundBrandsText17,GoodsBoundBrandsText18,GoodsBoundBrandsText19,GoodsBoundBrandsText20,GoodsBoundBrandsText21,GoodsBoundBrandsText22,GoodsBoundBrandsText23,
		            		GoodsBoundBrandsText24,GoodsBoundBrandsText25,GoodsBoundBrandsText26);           
//					GoodsBoundBrandsBox = new JComboBox();  
//					GoodsBoundBrandsBox.addItem(GoodsBoundBrandsText);  
//					GoodsBoundBrandsBox.addItem(GoodsBoundBrandsText1);  
//					GoodsBoundBrandsBox.addItem(GoodsBoundBrandsText2);  
//					GoodsBoundBrandsBox.addItem(GoodsBoundBrandsText3);
//					GoodsBoundBrandsBox.addItem(GoodsBoundBrandsText4);
//					GoodsBoundBrandsBox.addItem(GoodsBoundBrandsText5);
//					GoodsBoundBrandsBox.addItem(GoodsBoundBrandsText6);
//					GoodsBoundBrandsBox.addItem(GoodsBoundBrandsText7);
//					GoodsBoundBrandsBox.addItem(GoodsBoundBrandsText8);
//					GoodsBoundBrandsBox.addItem(GoodsBoundBrandsText9);
//					GoodsBoundBrandsBox.addItem(GoodsBoundBrandsText10);
//					GoodsBoundBrandsBox.addItem(GoodsBoundBrandsText11);
//					GoodsBoundBrandsBox.addItem(GoodsBoundBrandsText12);
//					GoodsBoundBrandsBox.addItem(GoodsBoundBrandsText13);
//					GoodsBoundBrandsBox.addItem(GoodsBoundBrandsText14);
//					GoodsBoundBrandsBox.addItem(GoodsBoundBrandsText15);
//					GoodsBoundBrandsBox.addItem(GoodsBoundBrandsText16);
//					GoodsBoundBrandsBox.addItem(GoodsBoundBrandsText17);
//					GoodsBoundBrandsBox.addItem(GoodsBoundBrandsText18);
//					GoodsBoundBrandsBox.addItem(GoodsBoundBrandsText19);
//					GoodsBoundBrandsBox.addItem(GoodsBoundBrandsText20);
//					GoodsBoundBrandsBox.addItem(GoodsBoundBrandsText21);
//					GoodsBoundBrandsBox.addItem(GoodsBoundBrandsText22);
//					GoodsBoundBrandsBox.addItem(GoodsBoundBrandsText23);
//					GoodsBoundBrandsBox.addItem(GoodsBoundBrandsText24);
//					GoodsBoundBrandsBox.addItem(GoodsBoundBrandsText25);
//					GoodsBoundBrandsBox.addItem(GoodsBoundBrandsText26);
//					GoodsBoundBrandsBox.setFont(Constants.BASIC_FONT3);
//			        GoodsBoundBrandsBox.setBounds(520, 280, 200, 22);
//			        GoodsBoundBrandsBox.setSelectedIndex(GoodsBoundBrandsGoodsID-1);
//					MainPanel.add(GoodsBoundBrandsBox);
					
					ApiHandler_1600x900.GoodsBoundBrands(GoodsBoundBrandsGoodsSubTypeValue,GoodsBoundBrandsGoodsTypeId,UserID,UserPassword);
				} catch (Exception e1) {
					e1.printStackTrace();
				}	    	
		    }
		});	

		//一键手动创建合同订单按钮-事件
		OneManualCredit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				String UserID = String.valueOf(UserIDTextField.getText());
				String UserPassword = String.valueOf(UserPassWordTextField.getText());
				
//				String brand = GoodsBoundBrandsBox.getSelectedItem().toString();
				String price = String.valueOf(ProductInforMationPriceTextField.getText());
				String selfPay = String.valueOf(ProductInforMationFirstPayTextField.getText());
				String subTypeId = String.valueOf(GoodsBoundBrandsGoodsSubTypeValueTextField.getText());
				String goodsTypeId = String.valueOf(ProductInforMationgoodsCategoryIdTextField.getText());
				String productVersionId = String.valueOf(ProductInforMationSearchTypeIdTextField.getText());
				String productsTypeId = String.valueOf(ProductInforMationProductTypeIdTextField.getText());
				String sellerPlaceId = String.valueOf(ProductInforMationStorIdTextField.getText());
				
				String model = String.valueOf(ModelTextField.getText());
				String healthFee = String.valueOf(HealthFeeTextField.getText());
				String secureFee = String.valueOf(SecureFeeTextField.getText());
				String comprehensiveInsuranceFee = String.valueOf(ComprehensiveInsuranceFeeTextField.getText());
				String information = String.valueOf(InformationTextField.getText());
				String goodsLocationNumber = String.valueOf(GoodsLocationNumberTextField.getText());
				String isCarryWifi = String.valueOf(IsCarryWifiTextField.getText());
				String isStudent = String.valueOf(IsStudentTextField.getText());
				String insuranceFlag = String.valueOf(InsuranceFlagTextField.getText());
				String insuranceFee = String.valueOf(InsuranceFeeTextField.getText());
				String treasureChestFlag = String.valueOf(TreasureChestFlagTextField.getText());
				String treasureChestFee = String.valueOf(TreasureChestFeeTextField.getText());
				String shoppingCouponsFee = String.valueOf(ShoppingCouponsFeeTextField.getText());
				String powerFlag = String.valueOf(PowerFlagTextField.getText());
				String powerFee = String.valueOf(PowerFeeTextField.getText());
//				String productCode = String.valueOf(ProductCodeTextField.getText());
				
				String userName = String.valueOf(UserNameTextField.getText());
				String nationalId = String.valueOf(NationalIdTextField.getText());
				String identNo = String.valueOf(IdentNoTextField.getText());
				String identPhoneBack = String.valueOf(IdentPhoneBackTextField.getText());
				String identPhoneFront = String.valueOf(IdentPhoneFrontTextField.getText());
				String province = String.valueOf(Address_ProvinceTextField.getText());
				String city = String.valueOf(Address_CityTextField.getText());
				String region = String.valueOf(Address_RegionTextField.getText());
				String identAddress = String.valueOf(IdentAddressTextField.getText());
				String identAuth = String.valueOf(IdentAuthTextField.getText());
				String identExp = String.valueOf(IdentExpTextField.getText());
				
				if("请输入用户ID...".equals(UserID)){
					JOptionPane.showMessageDialog(null, "请输入用户ID！");
					return;
				}
				if("请输入用户密码...".equals(UserPassword)){
					JOptionPane.showMessageDialog(null, "请输入用户密码！");
					return;
				}
//				if("请输入商品品牌...".equals(brand)){
//					JOptionPane.showMessageDialog(null, "请输入商品品牌！");
//					return;
//				}
				if("请输入医疗费...".equals(healthFee)){
					JOptionPane.showMessageDialog(null, "请输入医疗费！");
					return;
				}
				if("请输入商品型号...".equals(model)){
					JOptionPane.showMessageDialog(null, "请输入商品型号！");
					return;
				}
				if("请输入商品总额...".equals(price)){
					JOptionPane.showMessageDialog(null, "请输入商品总额！");
					return;
				}
				if("请输入安全费...".equals(secureFee)){
					JOptionPane.showMessageDialog(null, "请输入安全费！");
					return;
				}
				if("请输入首付总额...".equals(selfPay)){
					JOptionPane.showMessageDialog(null, "请输入首付总额！");
					return;
				}
				if("请输入商品小类Value...".equals(subTypeId)){
					JOptionPane.showMessageDialog(null, "请输入商品小类Value！");
					return;
				}
				if("请输入综合保险费...".equals(comprehensiveInsuranceFee)){
					JOptionPane.showMessageDialog(null, "请输入综合保险费！");
					return;
				}
				if("请输入信息...".equals(information)){
					JOptionPane.showMessageDialog(null, "请输入信息！");
					return;
				}
				if("请输入货位号...".equals(goodsLocationNumber)){
					JOptionPane.showMessageDialog(null, "请输入货位号！");
					return;
				}
				if("请输入是否WIFI热点城市...".equals(isCarryWifi)){
					JOptionPane.showMessageDialog(null, "请输入是否WIFI热点城市！");
					return;
				}
				if("请输入身份证详细地址...".equals(identAddress)){
					JOptionPane.showMessageDialog(null, "请输入身份证详细地址！");
					return;
				}
				if("请输入身份证所属省份...".equals(province)){
					JOptionPane.showMessageDialog(null, "请输入身份证所属省份！");
					return;
				}
				if("请输入身份证所属城市...".equals(city)){
					JOptionPane.showMessageDialog(null, "请输入身份证所属城市！");
					return;
				}
				if("请输入身份证所属区县...".equals(region)){
					JOptionPane.showMessageDialog(null, "请输入身份证所属区县！");
					return;
				}
				if("请输入身份证发证机关...".equals(identAuth)){
					JOptionPane.showMessageDialog(null, "请输入身份证发证机关！");
					return;
				}
				if("请输入商品类型ID...".equals(goodsTypeId)){
					JOptionPane.showMessageDialog(null, "请输入商品类型ID！");
					return;
				}
				if("请输入身份证有效期限...".equals(identExp)){
					JOptionPane.showMessageDialog(null, "请输入身份证有效期限！");
					return;
				}
				if("请输入身份证号码...".equals(identNo)){
					JOptionPane.showMessageDialog(null, "请输入身份证号码！");
					return;
				}
				if("请输入身份证正面照...".equals(identPhoneBack)){
					JOptionPane.showMessageDialog(null, "请输入身份证正面照！");
					return;
				}
				if("请输入身份证反面照...".equals(identPhoneFront)){
					JOptionPane.showMessageDialog(null, "请输入身份证反面照！");
					return;
				}
				if("请输入是否学生产品...".equals(isStudent)){
					JOptionPane.showMessageDialog(null, "请输入是否学生产品！");
					return;
				}
				if("请输入民族...".equals(nationalId)){
					JOptionPane.showMessageDialog(null, "请输入民族！");
					return;
				}
//				if("请输入分期产品代码...".equals(productCode)){
//					JOptionPane.showMessageDialog(null, "请输入分期产品代码！");
//					return;
//				}
				if("请输入产品版本ID...".equals(productVersionId)){
					JOptionPane.showMessageDialog(null, "请输入产品版本ID！");
					return;
				}
				if("请输入产品类型ID...".equals(productsTypeId)){
					JOptionPane.showMessageDialog(null, "请输入产品类型ID！");
					return;
				}
				if("请输入商品门店ID...".equals(sellerPlaceId)){
					JOptionPane.showMessageDialog(null, "请输入商品门店ID！");
					return;
				}
				if("请输入姓名...".equals(userName)){
					JOptionPane.showMessageDialog(null, "请输入姓名！");
					return;
				}
				if("请输入是否购买全面保...".equals(powerFlag)){
					JOptionPane.showMessageDialog(null, "请输入是否购买全面保！");
					return;
				}
				if("请输入全面保费...".equals(powerFee)){
					JOptionPane.showMessageDialog(null, "请输入全面保费用！");
					return;
				}
				if("请输入保险费...".equals(insuranceFee)){
					JOptionPane.showMessageDialog(null, "请输入保险费用！");
					return;
				}
				if("请输入是否购买保险...".equals(insuranceFlag)){
					JOptionPane.showMessageDialog(null, "请输入是否购买保险！");
					return;
				}
				if("请输入商城赠券费...".equals(shoppingCouponsFee)){
					JOptionPane.showMessageDialog(null, "请输入商城赠券费用！");
					return;
				}
				if("请输入百宝箱费...".equals(treasureChestFee)){
					JOptionPane.showMessageDialog(null, "请输入百宝箱费用！");
					return;
				}
				if("请输入是否购买百宝箱...".equals(treasureChestFlag)){
					JOptionPane.showMessageDialog(null, "请输入是否购买百宝箱！");
					return;
				}
				try {
					String ID_PERSON = DataBaseHandler_1600x900.GetValue(DataVersion,userName);
					DataBaseHandler_1600x900.UpdateContractStateButton(DataVersion,ID_PERSON);
					
			    	String GoodsSubTypeValue = String.valueOf(GoodsBoundBrandsGoodsSubTypeValueTextField.getText());
					String GoodsCategoryID = String.valueOf(GoodsBoundBrandsGoodsTypeIdTextField.getText());
					String GoodsBoundBrandsData = "data";
					String GoodsBoundBrandstext = "text";
					int GoodsBoundBrandsGoodsID = Integer.parseInt(GoodsBoundBrandsTextField.getText())-1;
					String brand = ApiHandler_OneTouchCredit_1600x900.GoodsBoundBrands(GoodsSubTypeValue,GoodsCategoryID,UserID,UserPassword,""+GoodsBoundBrandsData+"."+GoodsBoundBrandstext+"["+GoodsBoundBrandsGoodsID+"]");

					String ProductInforMationStoreId = String.valueOf(ProductInforMationStorIdTextField.getText());
					String ProductInforMationGoodsCategoryId = String.valueOf(ProductInforMationgoodsCategoryIdTextField.getText());
					String ProductInforMationSearchTypeId = String.valueOf(ProductInforMationSearchTypeIdTextField.getText());
					String ProductInforMationProductTypeId = String.valueOf(ProductInforMationProductTypeIdTextField.getText());
					String ProductInforMationPrice = String.valueOf(ProductInforMationPriceTextField.getText());
					String ProductInforMationFirstPay = String.valueOf(ProductInforMationFirstPayTextField.getText());
					String ProductInforMationIsWallet = String.valueOf(ProductInforMationIsWalletTextField.getText());
			
					String ProductInforMationData = "data";
					String ProductInforMationEntities = "entities";
					String ProductInforMationProdCode = "prodCode";
					int ProductInforMationID=Integer.parseInt(ProductInforMationTextField.getText())-1;
					String productCode = ApiHandler_OneTouchCredit_1600x900.ProductInforMation(ProductInforMationStoreId,ProductInforMationGoodsCategoryId,ProductInforMationSearchTypeId,
					       ProductInforMationProductTypeId,ProductInforMationPrice,ProductInforMationFirstPay,ProductInforMationIsWallet,UserID,UserPassword,""+ProductInforMationData+"."+ProductInforMationEntities+"",""+ProductInforMationProdCode+"["+ProductInforMationID+"]");
					
					ApiHandler_1600x900.OneManualCredit(
					brand,healthFee,model,price,secureFee,selfPay,subTypeId,comprehensiveInsuranceFee,information,goodsLocationNumber,isCarryWifi,
					identAddress,province,city,region,identAuth,goodsTypeId,identExp,identNo,identPhoneBack,identPhoneFront,isStudent,nationalId,price,productCode,productVersionId,productsTypeId,selfPay,sellerPlaceId,userName,powerFlag,powerFee,insuranceFee,insuranceFlag,shoppingCouponsFee,treasureChestFlag,treasureChestFee,
					UserID,UserPassword);
				} catch (Exception e1) {	
					e1.printStackTrace();
				}	    	
		    }
		});	
		
		//一键保存合同基础信息按钮-事件
		OneManualCreditBaseInfo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

			    try {
					String UserID = String.valueOf(UserIDTextField.getText());
					String UserPassword = String.valueOf(UserPassWordTextField.getText());
					
//					String brand = GoodsBoundBrandsBox.getSelectedItem().toString();
					String price = String.valueOf(ProductInforMationPriceTextField.getText());
					String selfPay = String.valueOf(ProductInforMationFirstPayTextField.getText());
					String subTypeId = String.valueOf(GoodsBoundBrandsGoodsSubTypeValueTextField.getText());
					String goodsTypeId = String.valueOf(ProductInforMationgoodsCategoryIdTextField.getText());
					String productVersionId = String.valueOf(ProductInforMationSearchTypeIdTextField.getText());
					String productsTypeId = String.valueOf(ProductInforMationProductTypeIdTextField.getText());
					String sellerPlaceId = String.valueOf(ProductInforMationStorIdTextField.getText());
					
					String model = String.valueOf(ModelTextField.getText());
					String healthFee = String.valueOf(HealthFeeTextField.getText());
					String secureFee = String.valueOf(SecureFeeTextField.getText());
					String comprehensiveInsuranceFee = String.valueOf(ComprehensiveInsuranceFeeTextField.getText());
					String information = String.valueOf(InformationTextField.getText());
					String goodsLocationNumber = String.valueOf(GoodsLocationNumberTextField.getText());
					String isCarryWifi = String.valueOf(IsCarryWifiTextField.getText());
					String isStudent = String.valueOf(IsStudentTextField.getText());
					String insuranceFlag = String.valueOf(InsuranceFlagTextField.getText());
					String insuranceFee = String.valueOf(InsuranceFeeTextField.getText());
					String treasureChestFlag = String.valueOf(TreasureChestFlagTextField.getText());
					String treasureChestFee = String.valueOf(TreasureChestFeeTextField.getText());
					String shoppingCouponsFee = String.valueOf(ShoppingCouponsFeeTextField.getText());
					String powerFlag = String.valueOf(PowerFlagTextField.getText());
					String powerFee = String.valueOf(PowerFeeTextField.getText());
//					String productCode = String.valueOf(ProductCodeTextField.getText());
					
					String userName = String.valueOf(UserNameTextField.getText());
					String nationalId = String.valueOf(NationalIdTextField.getText());
					String identNo = String.valueOf(IdentNoTextField.getText());
					String identPhoneBack = String.valueOf(IdentPhoneBackTextField.getText());
					String identPhoneFront = String.valueOf(IdentPhoneFrontTextField.getText());
					String province = String.valueOf(Address_ProvinceTextField.getText());
					String city = String.valueOf(Address_CityTextField.getText());
					String region = String.valueOf(Address_RegionTextField.getText());
					String identAddress = String.valueOf(IdentAddressTextField.getText());
					String identAuth = String.valueOf(IdentAuthTextField.getText());
					String identExp = String.valueOf(IdentExpTextField.getText());
					
					if("请输入用户ID...".equals(UserID)){
						JOptionPane.showMessageDialog(null, "请输入用户ID！");
						return;
					}
					if("请输入用户密码...".equals(UserPassword)){
						JOptionPane.showMessageDialog(null, "请输入用户密码！");
						return;
					}
//					if("请输入商品品牌...".equals(brand)){
//						JOptionPane.showMessageDialog(null, "请输入商品品牌！");
//						return;
//					}
					if("请输入医疗费...".equals(healthFee)){
						JOptionPane.showMessageDialog(null, "请输入医疗费！");
						return;
					}
					if("请输入商品型号...".equals(model)){
						JOptionPane.showMessageDialog(null, "请输入商品型号！");
						return;
					}
					if("请输入商品总额...".equals(price)){
						JOptionPane.showMessageDialog(null, "请输入商品总额！");
						return;
					}
					if("请输入安全费...".equals(secureFee)){
						JOptionPane.showMessageDialog(null, "请输入安全费！");
						return;
					}
					if("请输入首付总额...".equals(selfPay)){
						JOptionPane.showMessageDialog(null, "请输入首付总额！");
						return;
					}
					if("请输入商品小类Value...".equals(subTypeId)){
						JOptionPane.showMessageDialog(null, "请输入商品小类Value！");
						return;
					}
					if("请输入综合保险费...".equals(comprehensiveInsuranceFee)){
						JOptionPane.showMessageDialog(null, "请输入综合保险费！");
						return;
					}
					if("请输入信息...".equals(information)){
						JOptionPane.showMessageDialog(null, "请输入信息！");
						return;
					}
					if("请输入货位号...".equals(goodsLocationNumber)){
						JOptionPane.showMessageDialog(null, "请输入货位号！");
						return;
					}
					if("请输入是否WIFI热点城市...".equals(isCarryWifi)){
						JOptionPane.showMessageDialog(null, "请输入是否WIFI热点城市！");
						return;
					}
					if("请输入身份证详细地址...".equals(identAddress)){
						JOptionPane.showMessageDialog(null, "请输入身份证详细地址！");
						return;
					}
					if("请输入身份证所属省份...".equals(province)){
						JOptionPane.showMessageDialog(null, "请输入身份证所属省份！");
						return;
					}
					if("请输入身份证所属城市...".equals(city)){
						JOptionPane.showMessageDialog(null, "请输入身份证所属城市！");
						return;
					}
					if("请输入身份证所属区县...".equals(region)){
						JOptionPane.showMessageDialog(null, "请输入身份证所属区县！");
						return;
					}
					if("请输入身份证发证机关...".equals(identAuth)){
						JOptionPane.showMessageDialog(null, "请输入身份证发证机关！");
						return;
					}
					if("请输入商品类型ID...".equals(goodsTypeId)){
						JOptionPane.showMessageDialog(null, "请输入商品类型ID！");
						return;
					}
					if("请输入身份证有效期限...".equals(identExp)){
						JOptionPane.showMessageDialog(null, "请输入身份证有效期限！");
						return;
					}
					if("请输入身份证号码...".equals(identNo)){
						JOptionPane.showMessageDialog(null, "请输入身份证号码！");
						return;
					}
					if("请输入身份证正面照...".equals(identPhoneBack)){
						JOptionPane.showMessageDialog(null, "请输入身份证正面照！");
						return;
					}
					if("请输入身份证反面照...".equals(identPhoneFront)){
						JOptionPane.showMessageDialog(null, "请输入身份证反面照！");
						return;
					}
					if("请输入是否学生产品...".equals(isStudent)){
						JOptionPane.showMessageDialog(null, "请输入是否学生产品！");
						return;
					}
					if("请输入民族...".equals(nationalId)){
						JOptionPane.showMessageDialog(null, "请输入民族！");
						return;
					}
//					if("请输入分期产品代码...".equals(productCode)){
//						JOptionPane.showMessageDialog(null, "请输入分期产品代码！");
//						return;
//					}
					if("请输入产品版本ID...".equals(productVersionId)){
						JOptionPane.showMessageDialog(null, "请输入产品版本ID！");
						return;
					}
					if("请输入产品类型ID...".equals(productsTypeId)){
						JOptionPane.showMessageDialog(null, "请输入产品类型ID！");
						return;
					}
					if("请输入商品门店ID...".equals(sellerPlaceId)){
						JOptionPane.showMessageDialog(null, "请输入商品门店ID！");
						return;
					}
					if("请输入姓名...".equals(userName)){
						JOptionPane.showMessageDialog(null, "请输入姓名！");
						return;
					}
					if("请输入是否购买全面保...".equals(powerFlag)){
						JOptionPane.showMessageDialog(null, "请输入是否购买全面保！");
						return;
					}
					if("请输入全面保费...".equals(powerFee)){
						JOptionPane.showMessageDialog(null, "请输入全面保费用！");
						return;
					}
					if("请输入保险费...".equals(insuranceFee)){
						JOptionPane.showMessageDialog(null, "请输入保险费用！");
						return;
					}
					if("请输入是否购买保险...".equals(insuranceFlag)){
						JOptionPane.showMessageDialog(null, "请输入是否购买保险！");
						return;
					}
					if("请输入商城赠券费...".equals(shoppingCouponsFee)){
						JOptionPane.showMessageDialog(null, "请输入商城赠券费用！");
						return;
					}
					if("请输入百宝箱费...".equals(treasureChestFee)){
						JOptionPane.showMessageDialog(null, "请输入百宝箱费用！");
						return;
					}
					if("请输入是否购买百宝箱...".equals(treasureChestFlag)){
						JOptionPane.showMessageDialog(null, "请输入是否购买百宝箱！");
						return;
					}
					
					String ID_PERSON = DataBaseHandler_1600x900.GetValue(DataVersion,userName);
					DataBaseHandler_1600x900.UpdateContractStateButton(DataVersion,ID_PERSON);
					
			    	String GoodsSubTypeValue = String.valueOf(GoodsBoundBrandsGoodsSubTypeValueTextField.getText());
					String GoodsCategoryID = String.valueOf(GoodsBoundBrandsGoodsTypeIdTextField.getText());
					String GoodsBoundBrandsData = "data";
					String GoodsBoundBrandstext = "text";
					int GoodsBoundBrandsGoodsID = Integer.parseInt(GoodsBoundBrandsTextField.getText())-1;
					String brand = ApiHandler_OneTouchCredit_1600x900.GoodsBoundBrands(GoodsSubTypeValue,GoodsCategoryID,UserID,UserPassword,""+GoodsBoundBrandsData+"."+GoodsBoundBrandstext+"["+GoodsBoundBrandsGoodsID+"]");

					String ProductInforMationStoreId = String.valueOf(ProductInforMationStorIdTextField.getText());
					String ProductInforMationGoodsCategoryId = String.valueOf(ProductInforMationgoodsCategoryIdTextField.getText());
					String ProductInforMationSearchTypeId = String.valueOf(ProductInforMationSearchTypeIdTextField.getText());
					String ProductInforMationProductTypeId = String.valueOf(ProductInforMationProductTypeIdTextField.getText());
					String ProductInforMationPrice = String.valueOf(ProductInforMationPriceTextField.getText());
					String ProductInforMationFirstPay = String.valueOf(ProductInforMationFirstPayTextField.getText());
					String ProductInforMationIsWallet = String.valueOf(ProductInforMationIsWalletTextField.getText());
					String ProductInforMationData = "data";
					String ProductInforMationEntities = "entities";
					String ProductInforMationProdCode = "prodCode";
					int ProductInforMationID=Integer.parseInt(ProductInforMationTextField.getText())-1;
					String productCode = ApiHandler_OneTouchCredit_1600x900.ProductInforMation(ProductInforMationStoreId,ProductInforMationGoodsCategoryId,ProductInforMationSearchTypeId,
					       ProductInforMationProductTypeId,ProductInforMationPrice,ProductInforMationFirstPay,ProductInforMationIsWallet,UserID,UserPassword,""+ProductInforMationData+"."+ProductInforMationEntities+"",""+ProductInforMationProdCode+"["+ProductInforMationID+"]");
					
					String creditId =ApiHandler_OneTouchCredit_1600x900.OneManualCredit(
					brand,healthFee,model,price,secureFee,selfPay,subTypeId,comprehensiveInsuranceFee,information,goodsLocationNumber,isCarryWifi,
					identAddress,province,city,region,identAuth,goodsTypeId,identExp,identNo,identPhoneBack,identPhoneFront,isStudent,nationalId,price,productCode,productVersionId,productsTypeId,selfPay,sellerPlaceId,userName,powerFlag,powerFee,insuranceFee,insuranceFlag,shoppingCouponsFee,treasureChestFlag,treasureChestFee,
					UserID,UserPassword,"data.creditId");

					//--------------------------------------------------------------------------------------
				    String cellPhone = String.valueOf(cellPhoneTextField.getText());
				    String childrenCount = String.valueOf(childrenCountTextField.getText());
				    String educationTypeId = String.valueOf(educationTypeIdTextField.getText());
				    String familyTel = String.valueOf(familyTelTextField.getText());
				    String familyTotalIncome = String.valueOf(familyTotalIncomeTextField.getText());
				    String houseTypeId = String.valueOf(houseTypeIdTextField.getText());
				    String marriageTypeId = String.valueOf(marriageTypeIdTextField.getText());			
				    String monthExpend = String.valueOf(monthExpendTextField.getText());
				    String monthIncome = String.valueOf(monthIncomeTextField.getText());
				    String qq = String.valueOf(qqTextField.getText());
				    String wechart = String.valueOf(wechartTextField.getText());
				
				    String liveInfo_city = String.valueOf(liveInfo_CityTextField.getText());
				    String liveInfo_detail = String.valueOf(liveInfo_DetailTextField.getText());
				    String liveInfo_province = String.valueOf(liveInfo_ProvinceTextField.getText());
				    String liveInfo_region = String.valueOf(liveInfo_RegionTextField.getText());
				
				    String email = String.valueOf(emailTextField.getText());
			
				   if("请输入用户ID...".equals(UserID)){
					JOptionPane.showMessageDialog(null, "请输入用户ID！");
					return;
				   }
				   if("请输入用户密码...".equals(UserPassword)){
					JOptionPane.showMessageDialog(null, "请输入用户密码！");
					return;
				   }
				   if("请输入手机号...".equals(cellPhone)){
					JOptionPane.showMessageDialog(null, "请输入手机号！");
					return;
				   }
				   if("请输入子女数目...".equals(childrenCount)){
				 	JOptionPane.showMessageDialog(null, "请输入子女数目！");
					return;
				   }
				   if("请输入教育程度...".equals(educationTypeId)){
					JOptionPane.showMessageDialog(null, "请输入教育程度！");
					return;
				   }
				   if("请输入家庭固定电话...".equals(familyTel)){
					JOptionPane.showMessageDialog(null, "请输入家庭固定电话！");
					return;
				   }
				   if("请输入家庭月收入总额...".equals(familyTotalIncome)){
					JOptionPane.showMessageDialog(null, "请输入家庭月收入总额！");
					return;
				   }
				   if("请输入住房情况...".equals(houseTypeId)){
					JOptionPane.showMessageDialog(null, "请输入住房情况！");
					return;
				   }
				   if("请输入婚姻状况...".equals(marriageTypeId)){
					JOptionPane.showMessageDialog(null, "请输入婚姻状况！");
					return;
				   }
				   if("请输入个人月支出...".equals(monthExpend)){
					JOptionPane.showMessageDialog(null, "请输入个人月支出！");
					return;
				   }
				   if("请输入个人月收入总额...".equals(monthIncome)){
					JOptionPane.showMessageDialog(null, "请输入个人月收入总额！");
					return;
				   }
				   if("请输入QQ号...".equals(qq)){
					JOptionPane.showMessageDialog(null, "请输入QQ号！");
					return;
				   }
				   if("请输入微信...".equals(wechart)){
					JOptionPane.showMessageDialog(null, "请输入微信！");
					return;
				   }
				   if("请输入现居住地所属城市...".equals(liveInfo_city)){
					JOptionPane.showMessageDialog(null, "请输入现居住地所属城市！");
					return;
				   }
				   if("请输入现居住地详细地址...".equals(liveInfo_detail)){
					JOptionPane.showMessageDialog(null, "请输入现居住地详细地址！");
					return;
				   }
				   if("请输入现居住地所属省份...".equals(liveInfo_province)){
					JOptionPane.showMessageDialog(null, "请输入现居住地所属省份！");
					return;
				   }
				   if("请输入现居住地所属区县...".equals(liveInfo_region)){
					JOptionPane.showMessageDialog(null, "请输入现居住地所属区县！");
					return;
				   }
				   if("请输入电子邮箱...".equals(email)){
					JOptionPane.showMessageDialog(null, "请输入电子邮箱！");
					return;
				   }
				   if("请输入是否学生产品...".equals(isStudent)){
					JOptionPane.showMessageDialog(null, "请输入查询的是否学生产品！");
					return;
				   }

					ApiHandler_1600x900.OneManualCreditBaseInfo(
					cellPhone,childrenCount,creditId,educationTypeId,familyTel,familyTotalIncome,houseTypeId,marriageTypeId,monthExpend,monthIncome,qq,wechart,
					liveInfo_city,liveInfo_detail,liveInfo_province,liveInfo_region,
					email,isStudent,UserID,UserPassword);
				} catch (Exception e1) {
					e1.printStackTrace();
				}	
		    }
		});	
		
		//一键保存合同单位信息按钮-事件
		OneManualCreditCompanyInfo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

			    try {
					String UserID = String.valueOf(UserIDTextField.getText());
					String UserPassword = String.valueOf(UserPassWordTextField.getText());
					
//					String brand = GoodsBoundBrandsBox.getSelectedItem().toString();
					String price = String.valueOf(ProductInforMationPriceTextField.getText());
					String selfPay = String.valueOf(ProductInforMationFirstPayTextField.getText());
					String subTypeId = String.valueOf(GoodsBoundBrandsGoodsSubTypeValueTextField.getText());
					String goodsTypeId = String.valueOf(ProductInforMationgoodsCategoryIdTextField.getText());
					String productVersionId = String.valueOf(ProductInforMationSearchTypeIdTextField.getText());
					String productsTypeId = String.valueOf(ProductInforMationProductTypeIdTextField.getText());
					String sellerPlaceId = String.valueOf(ProductInforMationStorIdTextField.getText());
					
					String model = String.valueOf(ModelTextField.getText());
					String healthFee = String.valueOf(HealthFeeTextField.getText());
					String secureFee = String.valueOf(SecureFeeTextField.getText());
					String comprehensiveInsuranceFee = String.valueOf(ComprehensiveInsuranceFeeTextField.getText());
					String information = String.valueOf(InformationTextField.getText());
					String goodsLocationNumber = String.valueOf(GoodsLocationNumberTextField.getText());
					String isCarryWifi = String.valueOf(IsCarryWifiTextField.getText());
					String isStudent = String.valueOf(IsStudentTextField.getText());
					String insuranceFlag = String.valueOf(InsuranceFlagTextField.getText());
					String insuranceFee = String.valueOf(InsuranceFeeTextField.getText());
					String treasureChestFlag = String.valueOf(TreasureChestFlagTextField.getText());
					String treasureChestFee = String.valueOf(TreasureChestFeeTextField.getText());
					String shoppingCouponsFee = String.valueOf(ShoppingCouponsFeeTextField.getText());
					String powerFlag = String.valueOf(PowerFlagTextField.getText());
					String powerFee = String.valueOf(PowerFeeTextField.getText());
//					String productCode = String.valueOf(ProductCodeTextField.getText());
					
					String userName = String.valueOf(UserNameTextField.getText());
					String nationalId = String.valueOf(NationalIdTextField.getText());
					String identNo = String.valueOf(IdentNoTextField.getText());
					String identPhoneBack = String.valueOf(IdentPhoneBackTextField.getText());
					String identPhoneFront = String.valueOf(IdentPhoneFrontTextField.getText());
					String province = String.valueOf(Address_ProvinceTextField.getText());
					String city = String.valueOf(Address_CityTextField.getText());
					String region = String.valueOf(Address_RegionTextField.getText());
					String identAddress = String.valueOf(IdentAddressTextField.getText());
					String identAuth = String.valueOf(IdentAuthTextField.getText());
					String identExp = String.valueOf(IdentExpTextField.getText());
					
					if("请输入用户ID...".equals(UserID)){
						JOptionPane.showMessageDialog(null, "请输入用户ID！");
						return;
					}
					if("请输入用户密码...".equals(UserPassword)){
						JOptionPane.showMessageDialog(null, "请输入用户密码！");
						return;
					}
//					if("请输入商品品牌...".equals(brand)){
//						JOptionPane.showMessageDialog(null, "请输入商品品牌！");
//						return;
//					}
					if("请输入医疗费...".equals(healthFee)){
						JOptionPane.showMessageDialog(null, "请输入医疗费！");
						return;
					}
					if("请输入商品型号...".equals(model)){
						JOptionPane.showMessageDialog(null, "请输入商品型号！");
						return;
					}
					if("请输入商品总额...".equals(price)){
						JOptionPane.showMessageDialog(null, "请输入商品总额！");
						return;
					}
					if("请输入安全费...".equals(secureFee)){
						JOptionPane.showMessageDialog(null, "请输入安全费！");
						return;
					}
					if("请输入首付总额...".equals(selfPay)){
						JOptionPane.showMessageDialog(null, "请输入首付总额！");
						return;
					}
					if("请输入商品小类Value...".equals(subTypeId)){
						JOptionPane.showMessageDialog(null, "请输入商品小类Value！");
						return;
					}
					if("请输入综合保险费...".equals(comprehensiveInsuranceFee)){
						JOptionPane.showMessageDialog(null, "请输入综合保险费！");
						return;
					}
					if("请输入信息...".equals(information)){
						JOptionPane.showMessageDialog(null, "请输入信息！");
						return;
					}
					if("请输入货位号...".equals(goodsLocationNumber)){
						JOptionPane.showMessageDialog(null, "请输入货位号！");
						return;
					}
					if("请输入是否WIFI热点城市...".equals(isCarryWifi)){
						JOptionPane.showMessageDialog(null, "请输入是否WIFI热点城市！");
						return;
					}
					if("请输入身份证详细地址...".equals(identAddress)){
						JOptionPane.showMessageDialog(null, "请输入身份证详细地址！");
						return;
					}
					if("请输入身份证所属省份...".equals(province)){
						JOptionPane.showMessageDialog(null, "请输入身份证所属省份！");
						return;
					}
					if("请输入身份证所属城市...".equals(city)){
						JOptionPane.showMessageDialog(null, "请输入身份证所属城市！");
						return;
					}
					if("请输入身份证所属区县...".equals(region)){
						JOptionPane.showMessageDialog(null, "请输入身份证所属区县！");
						return;
					}
					if("请输入身份证发证机关...".equals(identAuth)){
						JOptionPane.showMessageDialog(null, "请输入身份证发证机关！");
						return;
					}
					if("请输入商品类型ID...".equals(goodsTypeId)){
						JOptionPane.showMessageDialog(null, "请输入商品类型ID！");
						return;
					}
					if("请输入身份证有效期限...".equals(identExp)){
						JOptionPane.showMessageDialog(null, "请输入身份证有效期限！");
						return;
					}
					if("请输入身份证号码...".equals(identNo)){
						JOptionPane.showMessageDialog(null, "请输入身份证号码！");
						return;
					}
					if("请输入身份证正面照...".equals(identPhoneBack)){
						JOptionPane.showMessageDialog(null, "请输入身份证正面照！");
						return;
					}
					if("请输入身份证反面照...".equals(identPhoneFront)){
						JOptionPane.showMessageDialog(null, "请输入身份证反面照！");
						return;
					}
					if("请输入是否学生产品...".equals(isStudent)){
						JOptionPane.showMessageDialog(null, "请输入是否学生产品！");
						return;
					}
					if("请输入民族...".equals(nationalId)){
						JOptionPane.showMessageDialog(null, "请输入民族！");
						return;
					}
//					if("请输入分期产品代码...".equals(productCode)){
//						JOptionPane.showMessageDialog(null, "请输入分期产品代码！");
//						return;
//					}
					if("请输入产品版本ID...".equals(productVersionId)){
						JOptionPane.showMessageDialog(null, "请输入产品版本ID！");
						return;
					}
					if("请输入产品类型ID...".equals(productsTypeId)){
						JOptionPane.showMessageDialog(null, "请输入产品类型ID！");
						return;
					}
					if("请输入商品门店ID...".equals(sellerPlaceId)){
						JOptionPane.showMessageDialog(null, "请输入商品门店ID！");
						return;
					}
					if("请输入姓名...".equals(userName)){
						JOptionPane.showMessageDialog(null, "请输入姓名！");
						return;
					}
					if("请输入是否购买全面保...".equals(powerFlag)){
						JOptionPane.showMessageDialog(null, "请输入是否购买全面保！");
						return;
					}
					if("请输入全面保费...".equals(powerFee)){
						JOptionPane.showMessageDialog(null, "请输入全面保费用！");
						return;
					}
					if("请输入保险费...".equals(insuranceFee)){
						JOptionPane.showMessageDialog(null, "请输入保险费用！");
						return;
					}
					if("请输入是否购买保险...".equals(insuranceFlag)){
						JOptionPane.showMessageDialog(null, "请输入是否购买保险！");
						return;
					}
					if("请输入商城赠券费...".equals(shoppingCouponsFee)){
						JOptionPane.showMessageDialog(null, "请输入商城赠券费用！");
						return;
					}
					if("请输入百宝箱费...".equals(treasureChestFee)){
						JOptionPane.showMessageDialog(null, "请输入百宝箱费用！");
						return;
					}
					if("请输入是否购买百宝箱...".equals(treasureChestFlag)){
						JOptionPane.showMessageDialog(null, "请输入是否购买百宝箱！");
						return;
					}
					
					String ID_PERSON = DataBaseHandler_1600x900.GetValue(DataVersion,userName);
					DataBaseHandler_1600x900.UpdateContractStateButton(DataVersion,ID_PERSON);
					
			    	String GoodsSubTypeValue = String.valueOf(GoodsBoundBrandsGoodsSubTypeValueTextField.getText());
					String GoodsCategoryID = String.valueOf(GoodsBoundBrandsGoodsTypeIdTextField.getText());
					String GoodsBoundBrandsData = "data";
					String GoodsBoundBrandstext = "text";
					int GoodsBoundBrandsGoodsID = Integer.parseInt(GoodsBoundBrandsTextField.getText())-1;
					String brand = ApiHandler_OneTouchCredit_1600x900.GoodsBoundBrands(GoodsSubTypeValue,GoodsCategoryID,UserID,UserPassword,""+GoodsBoundBrandsData+"."+GoodsBoundBrandstext+"["+GoodsBoundBrandsGoodsID+"]");

					String ProductInforMationStoreId = String.valueOf(ProductInforMationStorIdTextField.getText());
					String ProductInforMationGoodsCategoryId = String.valueOf(ProductInforMationgoodsCategoryIdTextField.getText());
					String ProductInforMationSearchTypeId = String.valueOf(ProductInforMationSearchTypeIdTextField.getText());
					String ProductInforMationProductTypeId = String.valueOf(ProductInforMationProductTypeIdTextField.getText());
					String ProductInforMationPrice = String.valueOf(ProductInforMationPriceTextField.getText());
					String ProductInforMationFirstPay = String.valueOf(ProductInforMationFirstPayTextField.getText());
					String ProductInforMationIsWallet = String.valueOf(ProductInforMationIsWalletTextField.getText());
					String ProductInforMationData = "data";
					String ProductInforMationEntities = "entities";
					String ProductInforMationProdCode = "prodCode";
					int ProductInforMationID=Integer.parseInt(ProductInforMationTextField.getText())-1;
					String productCode = ApiHandler_OneTouchCredit_1600x900.ProductInforMation(ProductInforMationStoreId,ProductInforMationGoodsCategoryId,ProductInforMationSearchTypeId,
					       ProductInforMationProductTypeId,ProductInforMationPrice,ProductInforMationFirstPay,ProductInforMationIsWallet,UserID,UserPassword,""+ProductInforMationData+"."+ProductInforMationEntities+"",""+ProductInforMationProdCode+"["+ProductInforMationID+"]");
					
					String creditId =ApiHandler_OneTouchCredit_1600x900.OneManualCredit(
					brand,healthFee,model,price,secureFee,selfPay,subTypeId,comprehensiveInsuranceFee,information,goodsLocationNumber,isCarryWifi,
					identAddress,province,city,region,identAuth,goodsTypeId,identExp,identNo,identPhoneBack,identPhoneFront,isStudent,nationalId,price,productCode,productVersionId,productsTypeId,selfPay,sellerPlaceId,userName,powerFlag,powerFee,insuranceFee,insuranceFlag,shoppingCouponsFee,treasureChestFlag,treasureChestFee,
					UserID,UserPassword,"data.creditId");

					//--------------------------------------------------------------------------------------
				    String compAddDetail = String.valueOf(compAddDetailTextField.getText());
				    String compCity = String.valueOf(CompCityTextField.getText());
				    String compName = String.valueOf(compNameTextField.getText());
				    String compProvince = String.valueOf(CompProvinceTextField.getText());
				    String compRegion = String.valueOf(CompRegionTextField.getText());
				    String companyPropertyId = String.valueOf(companyPropertyIdTextField.getText());
				    String entryDate = String.valueOf(entryDateTextField.getText());			
				    String industryTypeId = String.valueOf(industryTypeIdTextField.getText());
				    String jobsTypeId = String.valueOf(jobsTypeIdTextField.getText());
				    String workPhone = String.valueOf(workPhoneTextField.getText());
				    String workPhoneExt = String.valueOf(workPhoneExtTextField.getText());
				    String workYears = String.valueOf(workYearsTextField.getText());
				    String department = String.valueOf(departmentTextField.getText());

				   if("请输入单位详细地址...".equals(compAddDetail)){
					JOptionPane.showMessageDialog(null, "请输入单位详细地址！");
					return;
				   }
				   if("请输入单位所属城市...".equals(compCity)){
					JOptionPane.showMessageDialog(null, "请输入单位所属城市！");
					return;
				   }
				   if("请输入单位名称...".equals(compName)){
					JOptionPane.showMessageDialog(null, "请输入单位名称！");
					return;
				   }
				   if("请输入单位所属省份...".equals(compProvince)){
				 	JOptionPane.showMessageDialog(null, "请输入单位所属省份！");
					return;
				   }
				   if("请输入单位所属区县...".equals(compRegion)){
					JOptionPane.showMessageDialog(null, "请输入单位所属区县！");
					return;
				   }
				   if("请输入单位性质...".equals(companyPropertyId)){
					JOptionPane.showMessageDialog(null, "请输入单位性质话！");
					return;
				   }
				   if("请输入入职时间...".equals(entryDate)){
					JOptionPane.showMessageDialog(null, "请输入入职时间！");
					return;
				   }
				   if("请输入职位...".equals(industryTypeId)){
					JOptionPane.showMessageDialog(null, "请输入职位！");
					return;
				   }
				   if("请输入行业类别...".equals(jobsTypeId)){
					JOptionPane.showMessageDialog(null, "请输入行业类别！");
					return;
				   }
				   if("请输入单位电话...".equals(workPhone)){
					JOptionPane.showMessageDialog(null, "请输入单位电话！");
					return;
				   }
				   if("请输入单位固话分机号...".equals(workPhoneExt)){
					JOptionPane.showMessageDialog(null, "请输入单位固话分机号！");
					return;
				   }
				   if("请输入工作年限..".equals(workYears)){
					JOptionPane.showMessageDialog(null, "请输入工作年限！");
					return;
				   }
				   if("请输入任职部门...".equals(department)){
					JOptionPane.showMessageDialog(null, "请输入任职部门！");
					return;
				   }

				   ApiHandler_1600x900.OneManualCreditCompanyInfo(
				   compAddDetail,compCity,compName,compProvince,compRegion,companyPropertyId,creditId,entryDate,industryTypeId,jobsTypeId,workPhone,workPhoneExt,
				   workYears,department,UserID,UserPassword);
				} catch (Exception e1) {
					e1.printStackTrace();
				}	
		    }
		});			

		//一键保存合同联系人信息按钮-事件
		OneManualCreditLinkInfo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

			    try {
					String UserID = String.valueOf(UserIDTextField.getText());
					String UserPassword = String.valueOf(UserPassWordTextField.getText());
					
//					String brand = GoodsBoundBrandsBox.getSelectedItem().toString();
					String price = String.valueOf(ProductInforMationPriceTextField.getText());
					String selfPay = String.valueOf(ProductInforMationFirstPayTextField.getText());
					String subTypeId = String.valueOf(GoodsBoundBrandsGoodsSubTypeValueTextField.getText());
					String goodsTypeId = String.valueOf(ProductInforMationgoodsCategoryIdTextField.getText());
					String productVersionId = String.valueOf(ProductInforMationSearchTypeIdTextField.getText());
					String productsTypeId = String.valueOf(ProductInforMationProductTypeIdTextField.getText());
					String sellerPlaceId = String.valueOf(ProductInforMationStorIdTextField.getText());
					
					String model = String.valueOf(ModelTextField.getText());
					String healthFee = String.valueOf(HealthFeeTextField.getText());
					String secureFee = String.valueOf(SecureFeeTextField.getText());
					String comprehensiveInsuranceFee = String.valueOf(ComprehensiveInsuranceFeeTextField.getText());
					String information = String.valueOf(InformationTextField.getText());
					String goodsLocationNumber = String.valueOf(GoodsLocationNumberTextField.getText());
					String isCarryWifi = String.valueOf(IsCarryWifiTextField.getText());
					String isStudent = String.valueOf(IsStudentTextField.getText());
					String insuranceFlag = String.valueOf(InsuranceFlagTextField.getText());
					String insuranceFee = String.valueOf(InsuranceFeeTextField.getText());
					String treasureChestFlag = String.valueOf(TreasureChestFlagTextField.getText());
					String treasureChestFee = String.valueOf(TreasureChestFeeTextField.getText());
					String shoppingCouponsFee = String.valueOf(ShoppingCouponsFeeTextField.getText());
					String powerFlag = String.valueOf(PowerFlagTextField.getText());
					String powerFee = String.valueOf(PowerFeeTextField.getText());
//					String productCode = String.valueOf(ProductCodeTextField.getText());
					
					String userName = String.valueOf(UserNameTextField.getText());
					String nationalId = String.valueOf(NationalIdTextField.getText());
					String identNo = String.valueOf(IdentNoTextField.getText());
					String identPhoneBack = String.valueOf(IdentPhoneBackTextField.getText());
					String identPhoneFront = String.valueOf(IdentPhoneFrontTextField.getText());
					String province = String.valueOf(Address_ProvinceTextField.getText());
					String city = String.valueOf(Address_CityTextField.getText());
					String region = String.valueOf(Address_RegionTextField.getText());
					String identAddress = String.valueOf(IdentAddressTextField.getText());
					String identAuth = String.valueOf(IdentAuthTextField.getText());
					String identExp = String.valueOf(IdentExpTextField.getText());
					
					if("请输入用户ID...".equals(UserID)){
						JOptionPane.showMessageDialog(null, "请输入用户ID！");
						return;
					}
					if("请输入用户密码...".equals(UserPassword)){
						JOptionPane.showMessageDialog(null, "请输入用户密码！");
						return;
					}
//					if("请输入商品品牌...".equals(brand)){
//						JOptionPane.showMessageDialog(null, "请输入商品品牌！");
//						return;
//					}
					if("请输入医疗费...".equals(healthFee)){
						JOptionPane.showMessageDialog(null, "请输入医疗费！");
						return;
					}
					if("请输入商品型号...".equals(model)){
						JOptionPane.showMessageDialog(null, "请输入商品型号！");
						return;
					}
					if("请输入商品总额...".equals(price)){
						JOptionPane.showMessageDialog(null, "请输入商品总额！");
						return;
					}
					if("请输入安全费...".equals(secureFee)){
						JOptionPane.showMessageDialog(null, "请输入安全费！");
						return;
					}
					if("请输入首付总额...".equals(selfPay)){
						JOptionPane.showMessageDialog(null, "请输入首付总额！");
						return;
					}
					if("请输入商品小类Value...".equals(subTypeId)){
						JOptionPane.showMessageDialog(null, "请输入商品小类Value！");
						return;
					}
					if("请输入综合保险费...".equals(comprehensiveInsuranceFee)){
						JOptionPane.showMessageDialog(null, "请输入综合保险费！");
						return;
					}
					if("请输入信息...".equals(information)){
						JOptionPane.showMessageDialog(null, "请输入信息！");
						return;
					}
					if("请输入货位号...".equals(goodsLocationNumber)){
						JOptionPane.showMessageDialog(null, "请输入货位号！");
						return;
					}
					if("请输入是否WIFI热点城市...".equals(isCarryWifi)){
						JOptionPane.showMessageDialog(null, "请输入是否WIFI热点城市！");
						return;
					}
					if("请输入身份证详细地址...".equals(identAddress)){
						JOptionPane.showMessageDialog(null, "请输入身份证详细地址！");
						return;
					}
					if("请输入身份证所属省份...".equals(province)){
						JOptionPane.showMessageDialog(null, "请输入身份证所属省份！");
						return;
					}
					if("请输入身份证所属城市...".equals(city)){
						JOptionPane.showMessageDialog(null, "请输入身份证所属城市！");
						return;
					}
					if("请输入身份证所属区县...".equals(region)){
						JOptionPane.showMessageDialog(null, "请输入身份证所属区县！");
						return;
					}
					if("请输入身份证发证机关...".equals(identAuth)){
						JOptionPane.showMessageDialog(null, "请输入身份证发证机关！");
						return;
					}
					if("请输入商品类型ID...".equals(goodsTypeId)){
						JOptionPane.showMessageDialog(null, "请输入商品类型ID！");
						return;
					}
					if("请输入身份证有效期限...".equals(identExp)){
						JOptionPane.showMessageDialog(null, "请输入身份证有效期限！");
						return;
					}
					if("请输入身份证号码...".equals(identNo)){
						JOptionPane.showMessageDialog(null, "请输入身份证号码！");
						return;
					}
					if("请输入身份证正面照...".equals(identPhoneBack)){
						JOptionPane.showMessageDialog(null, "请输入身份证正面照！");
						return;
					}
					if("请输入身份证反面照...".equals(identPhoneFront)){
						JOptionPane.showMessageDialog(null, "请输入身份证反面照！");
						return;
					}
					if("请输入是否学生产品...".equals(isStudent)){
						JOptionPane.showMessageDialog(null, "请输入是否学生产品！");
						return;
					}
					if("请输入民族...".equals(nationalId)){
						JOptionPane.showMessageDialog(null, "请输入民族！");
						return;
					}
//					if("请输入分期产品代码...".equals(productCode)){
//						JOptionPane.showMessageDialog(null, "请输入分期产品代码！");
//						return;
//					}
					if("请输入产品版本ID...".equals(productVersionId)){
						JOptionPane.showMessageDialog(null, "请输入产品版本ID！");
						return;
					}
					if("请输入产品类型ID...".equals(productsTypeId)){
						JOptionPane.showMessageDialog(null, "请输入产品类型ID！");
						return;
					}
					if("请输入商品门店ID...".equals(sellerPlaceId)){
						JOptionPane.showMessageDialog(null, "请输入商品门店ID！");
						return;
					}
					if("请输入姓名...".equals(userName)){
						JOptionPane.showMessageDialog(null, "请输入姓名！");
						return;
					}
					if("请输入是否购买全面保...".equals(powerFlag)){
						JOptionPane.showMessageDialog(null, "请输入是否购买全面保！");
						return;
					}
					if("请输入全面保费...".equals(powerFee)){
						JOptionPane.showMessageDialog(null, "请输入全面保费用！");
						return;
					}
					if("请输入保险费...".equals(insuranceFee)){
						JOptionPane.showMessageDialog(null, "请输入保险费用！");
						return;
					}
					if("请输入是否购买保险...".equals(insuranceFlag)){
						JOptionPane.showMessageDialog(null, "请输入是否购买保险！");
						return;
					}
					if("请输入商城赠券费...".equals(shoppingCouponsFee)){
						JOptionPane.showMessageDialog(null, "请输入商城赠券费用！");
						return;
					}
					if("请输入百宝箱费...".equals(treasureChestFee)){
						JOptionPane.showMessageDialog(null, "请输入百宝箱费用！");
						return;
					}
					if("请输入是否购买百宝箱...".equals(treasureChestFlag)){
						JOptionPane.showMessageDialog(null, "请输入是否购买百宝箱！");
						return;
					}
					
					String ID_PERSON = DataBaseHandler_1600x900.GetValue(DataVersion,userName);
					DataBaseHandler_1600x900.UpdateContractStateButton(DataVersion,ID_PERSON);
					
			    	String GoodsSubTypeValue = String.valueOf(GoodsBoundBrandsGoodsSubTypeValueTextField.getText());
					String GoodsCategoryID = String.valueOf(GoodsBoundBrandsGoodsTypeIdTextField.getText());
					String GoodsBoundBrandsData = "data";
					String GoodsBoundBrandstext = "text";
					int GoodsBoundBrandsGoodsID = Integer.parseInt(GoodsBoundBrandsTextField.getText())-1;
					String brand = ApiHandler_OneTouchCredit_1600x900.GoodsBoundBrands(GoodsSubTypeValue,GoodsCategoryID,UserID,UserPassword,""+GoodsBoundBrandsData+"."+GoodsBoundBrandstext+"["+GoodsBoundBrandsGoodsID+"]");

					String ProductInforMationStoreId = String.valueOf(ProductInforMationStorIdTextField.getText());
					String ProductInforMationGoodsCategoryId = String.valueOf(ProductInforMationgoodsCategoryIdTextField.getText());
					String ProductInforMationSearchTypeId = String.valueOf(ProductInforMationSearchTypeIdTextField.getText());
					String ProductInforMationProductTypeId = String.valueOf(ProductInforMationProductTypeIdTextField.getText());
					String ProductInforMationPrice = String.valueOf(ProductInforMationPriceTextField.getText());
					String ProductInforMationFirstPay = String.valueOf(ProductInforMationFirstPayTextField.getText());
					String ProductInforMationIsWallet = String.valueOf(ProductInforMationIsWalletTextField.getText());
					String ProductInforMationData = "data";
					String ProductInforMationEntities = "entities";
					String ProductInforMationProdCode = "prodCode";
					int ProductInforMationID=Integer.parseInt(ProductInforMationTextField.getText())-1;
					String productCode = ApiHandler_OneTouchCredit_1600x900.ProductInforMation(ProductInforMationStoreId,ProductInforMationGoodsCategoryId,ProductInforMationSearchTypeId,
					       ProductInforMationProductTypeId,ProductInforMationPrice,ProductInforMationFirstPay,ProductInforMationIsWallet,UserID,UserPassword,""+ProductInforMationData+"."+ProductInforMationEntities+"",""+ProductInforMationProdCode+"["+ProductInforMationID+"]");
					
					String creditId =ApiHandler_OneTouchCredit_1600x900.OneManualCredit(
					brand,healthFee,model,price,secureFee,selfPay,subTypeId,comprehensiveInsuranceFee,information,goodsLocationNumber,isCarryWifi,
					identAddress,province,city,region,identAuth,goodsTypeId,identExp,identNo,identPhoneBack,identPhoneFront,isStudent,nationalId,price,productCode,productVersionId,productsTypeId,selfPay,sellerPlaceId,userName,powerFlag,powerFee,insuranceFee,insuranceFlag,shoppingCouponsFee,treasureChestFlag,treasureChestFee,
					UserID,UserPassword,"data.creditId");

					//--------------------------------------------------------------------------------------
				    int type = Integer.parseInt(Contacts_typeTextField.getText());
				    String linkerName = String.valueOf(Contacts_linkerNameTextField.getText());
				    String phone = String.valueOf(Contacts_phoneTextField.getText());
				    String relationTypeID = String.valueOf(Contacts_relationTypeIDTextField.getText());


				   if("请输入联系人类型...".equals(type)){
					JOptionPane.showMessageDialog(null, "请输入联系人类型！");
					return;
				   }
				   if("请输入联系人姓名...".equals(linkerName)){
					JOptionPane.showMessageDialog(null, "请输入联系人姓名！");
					return;
				   }
				   if("请输入联系人手机号..".equals(phone)){
					JOptionPane.showMessageDialog(null, "请输入联系人手机号！");
					return;
				   }
				   if("请输入联系人与本人关系...".equals(relationTypeID)){
				 	JOptionPane.showMessageDialog(null, "请输入联系人与本人关系！");
					return;
				   }
				   
				   ApiHandler_1600x900.OneManualCreditLinkInfo(creditId,type,linkerName,phone,relationTypeID,UserID,UserPassword);
				   ApiHandler_1600x900.OneManualCreditLinkInfo(creditId,type+1,"时夏","13999999999","5"+relationTypeID,UserID,UserPassword);
				} catch (Exception e1) {
					e1.printStackTrace();
				}	
		    }
		});			
		
		//一键保存合同银行卡信息按钮-事件
		OneManualCreditBankInfo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

			    try {
					String UserID = String.valueOf(UserIDTextField.getText());
					String UserPassword = String.valueOf(UserPassWordTextField.getText());
					
//					String brand = GoodsBoundBrandsBox.getSelectedItem().toString();
					String price = String.valueOf(ProductInforMationPriceTextField.getText());
					String selfPay = String.valueOf(ProductInforMationFirstPayTextField.getText());
					String subTypeId = String.valueOf(GoodsBoundBrandsGoodsSubTypeValueTextField.getText());
					String goodsTypeId = String.valueOf(ProductInforMationgoodsCategoryIdTextField.getText());
					String productVersionId = String.valueOf(ProductInforMationSearchTypeIdTextField.getText());
					String productsTypeId = String.valueOf(ProductInforMationProductTypeIdTextField.getText());
					String sellerPlaceId = String.valueOf(ProductInforMationStorIdTextField.getText());
					
					String model = String.valueOf(ModelTextField.getText());
					String healthFee = String.valueOf(HealthFeeTextField.getText());
					String secureFee = String.valueOf(SecureFeeTextField.getText());
					String comprehensiveInsuranceFee = String.valueOf(ComprehensiveInsuranceFeeTextField.getText());
					String information = String.valueOf(InformationTextField.getText());
					String goodsLocationNumber = String.valueOf(GoodsLocationNumberTextField.getText());
					String isCarryWifi = String.valueOf(IsCarryWifiTextField.getText());
					String isStudent = String.valueOf(IsStudentTextField.getText());
					String insuranceFlag = String.valueOf(InsuranceFlagTextField.getText());
					String insuranceFee = String.valueOf(InsuranceFeeTextField.getText());
					String treasureChestFlag = String.valueOf(TreasureChestFlagTextField.getText());
					String treasureChestFee = String.valueOf(TreasureChestFeeTextField.getText());
					String shoppingCouponsFee = String.valueOf(ShoppingCouponsFeeTextField.getText());
					String powerFlag = String.valueOf(PowerFlagTextField.getText());
					String powerFee = String.valueOf(PowerFeeTextField.getText());
//					String productCode = String.valueOf(ProductCodeTextField.getText());
					
					String userName = String.valueOf(UserNameTextField.getText());
					String nationalId = String.valueOf(NationalIdTextField.getText());
					String identNo = String.valueOf(IdentNoTextField.getText());
					String identPhoneBack = String.valueOf(IdentPhoneBackTextField.getText());
					String identPhoneFront = String.valueOf(IdentPhoneFrontTextField.getText());
					String province = String.valueOf(Address_ProvinceTextField.getText());
					String city = String.valueOf(Address_CityTextField.getText());
					String region = String.valueOf(Address_RegionTextField.getText());
					String identAddress = String.valueOf(IdentAddressTextField.getText());
					String identAuth = String.valueOf(IdentAuthTextField.getText());
					String identExp = String.valueOf(IdentExpTextField.getText());
					
					if("请输入用户ID...".equals(UserID)){
						JOptionPane.showMessageDialog(null, "请输入用户ID！");
						return;
					}
					if("请输入用户密码...".equals(UserPassword)){
						JOptionPane.showMessageDialog(null, "请输入用户密码！");
						return;
					}
//					if("请输入商品品牌...".equals(brand)){
//						JOptionPane.showMessageDialog(null, "请输入商品品牌！");
//						return;
//					}
					if("请输入医疗费...".equals(healthFee)){
						JOptionPane.showMessageDialog(null, "请输入医疗费！");
						return;
					}
					if("请输入商品型号...".equals(model)){
						JOptionPane.showMessageDialog(null, "请输入商品型号！");
						return;
					}
					if("请输入商品总额...".equals(price)){
						JOptionPane.showMessageDialog(null, "请输入商品总额！");
						return;
					}
					if("请输入安全费...".equals(secureFee)){
						JOptionPane.showMessageDialog(null, "请输入安全费！");
						return;
					}
					if("请输入首付总额...".equals(selfPay)){
						JOptionPane.showMessageDialog(null, "请输入首付总额！");
						return;
					}
					if("请输入商品小类Value...".equals(subTypeId)){
						JOptionPane.showMessageDialog(null, "请输入商品小类Value！");
						return;
					}
					if("请输入综合保险费...".equals(comprehensiveInsuranceFee)){
						JOptionPane.showMessageDialog(null, "请输入综合保险费！");
						return;
					}
					if("请输入信息...".equals(information)){
						JOptionPane.showMessageDialog(null, "请输入信息！");
						return;
					}
					if("请输入货位号...".equals(goodsLocationNumber)){
						JOptionPane.showMessageDialog(null, "请输入货位号！");
						return;
					}
					if("请输入是否WIFI热点城市...".equals(isCarryWifi)){
						JOptionPane.showMessageDialog(null, "请输入是否WIFI热点城市！");
						return;
					}
					if("请输入身份证详细地址...".equals(identAddress)){
						JOptionPane.showMessageDialog(null, "请输入身份证详细地址！");
						return;
					}
					if("请输入身份证所属省份...".equals(province)){
						JOptionPane.showMessageDialog(null, "请输入身份证所属省份！");
						return;
					}
					if("请输入身份证所属城市...".equals(city)){
						JOptionPane.showMessageDialog(null, "请输入身份证所属城市！");
						return;
					}
					if("请输入身份证所属区县...".equals(region)){
						JOptionPane.showMessageDialog(null, "请输入身份证所属区县！");
						return;
					}
					if("请输入身份证发证机关...".equals(identAuth)){
						JOptionPane.showMessageDialog(null, "请输入身份证发证机关！");
						return;
					}
					if("请输入商品类型ID...".equals(goodsTypeId)){
						JOptionPane.showMessageDialog(null, "请输入商品类型ID！");
						return;
					}
					if("请输入身份证有效期限...".equals(identExp)){
						JOptionPane.showMessageDialog(null, "请输入身份证有效期限！");
						return;
					}
					if("请输入身份证号码...".equals(identNo)){
						JOptionPane.showMessageDialog(null, "请输入身份证号码！");
						return;
					}
					if("请输入身份证正面照...".equals(identPhoneBack)){
						JOptionPane.showMessageDialog(null, "请输入身份证正面照！");
						return;
					}
					if("请输入身份证反面照...".equals(identPhoneFront)){
						JOptionPane.showMessageDialog(null, "请输入身份证反面照！");
						return;
					}
					if("请输入是否学生产品...".equals(isStudent)){
						JOptionPane.showMessageDialog(null, "请输入是否学生产品！");
						return;
					}
					if("请输入民族...".equals(nationalId)){
						JOptionPane.showMessageDialog(null, "请输入民族！");
						return;
					}
//					if("请输入分期产品代码...".equals(productCode)){
//						JOptionPane.showMessageDialog(null, "请输入分期产品代码！");
//						return;
//					}
					if("请输入产品版本ID...".equals(productVersionId)){
						JOptionPane.showMessageDialog(null, "请输入产品版本ID！");
						return;
					}
					if("请输入产品类型ID...".equals(productsTypeId)){
						JOptionPane.showMessageDialog(null, "请输入产品类型ID！");
						return;
					}
					if("请输入商品门店ID...".equals(sellerPlaceId)){
						JOptionPane.showMessageDialog(null, "请输入商品门店ID！");
						return;
					}
					if("请输入姓名...".equals(userName)){
						JOptionPane.showMessageDialog(null, "请输入姓名！");
						return;
					}
					if("请输入是否购买全面保...".equals(powerFlag)){
						JOptionPane.showMessageDialog(null, "请输入是否购买全面保！");
						return;
					}
					if("请输入全面保费...".equals(powerFee)){
						JOptionPane.showMessageDialog(null, "请输入全面保费用！");
						return;
					}
					if("请输入保险费...".equals(insuranceFee)){
						JOptionPane.showMessageDialog(null, "请输入保险费用！");
						return;
					}
					if("请输入是否购买保险...".equals(insuranceFlag)){
						JOptionPane.showMessageDialog(null, "请输入是否购买保险！");
						return;
					}
					if("请输入商城赠券费...".equals(shoppingCouponsFee)){
						JOptionPane.showMessageDialog(null, "请输入商城赠券费用！");
						return;
					}
					if("请输入百宝箱费...".equals(treasureChestFee)){
						JOptionPane.showMessageDialog(null, "请输入百宝箱费用！");
						return;
					}
					if("请输入是否购买百宝箱...".equals(treasureChestFlag)){
						JOptionPane.showMessageDialog(null, "请输入是否购买百宝箱！");
						return;
					}
					
					String ID_PERSON = DataBaseHandler_1600x900.GetValue(DataVersion,userName);
					DataBaseHandler_1600x900.UpdateContractStateButton(DataVersion,ID_PERSON);
					
			    	String GoodsSubTypeValue = String.valueOf(GoodsBoundBrandsGoodsSubTypeValueTextField.getText());
					String GoodsCategoryID = String.valueOf(GoodsBoundBrandsGoodsTypeIdTextField.getText());
					String GoodsBoundBrandsData = "data";
					String GoodsBoundBrandstext = "text";
					int GoodsBoundBrandsGoodsID = Integer.parseInt(GoodsBoundBrandsTextField.getText())-1;
					String brand = ApiHandler_OneTouchCredit_1600x900.GoodsBoundBrands(GoodsSubTypeValue,GoodsCategoryID,UserID,UserPassword,""+GoodsBoundBrandsData+"."+GoodsBoundBrandstext+"["+GoodsBoundBrandsGoodsID+"]");

					String ProductInforMationStoreId = String.valueOf(ProductInforMationStorIdTextField.getText());
					String ProductInforMationGoodsCategoryId = String.valueOf(ProductInforMationgoodsCategoryIdTextField.getText());
					String ProductInforMationSearchTypeId = String.valueOf(ProductInforMationSearchTypeIdTextField.getText());
					String ProductInforMationProductTypeId = String.valueOf(ProductInforMationProductTypeIdTextField.getText());
					String ProductInforMationPrice = String.valueOf(ProductInforMationPriceTextField.getText());
					String ProductInforMationFirstPay = String.valueOf(ProductInforMationFirstPayTextField.getText());
					String ProductInforMationIsWallet = String.valueOf(ProductInforMationIsWalletTextField.getText());
					String ProductInforMationData = "data";
					String ProductInforMationEntities = "entities";
					String ProductInforMationProdCode = "prodCode";
					int ProductInforMationID=Integer.parseInt(ProductInforMationTextField.getText())-1;
					String productCode = ApiHandler_OneTouchCredit_1600x900.ProductInforMation(ProductInforMationStoreId,ProductInforMationGoodsCategoryId,ProductInforMationSearchTypeId,
					       ProductInforMationProductTypeId,ProductInforMationPrice,ProductInforMationFirstPay,ProductInforMationIsWallet,UserID,UserPassword,""+ProductInforMationData+"."+ProductInforMationEntities+"",""+ProductInforMationProdCode+"["+ProductInforMationID+"]");
					
					String creditId =ApiHandler_OneTouchCredit_1600x900.OneManualCredit(
					brand,healthFee,model,price,secureFee,selfPay,subTypeId,comprehensiveInsuranceFee,information,goodsLocationNumber,isCarryWifi,
					identAddress,province,city,region,identAuth,goodsTypeId,identExp,identNo,identPhoneBack,identPhoneFront,isStudent,nationalId,price,productCode,productVersionId,productsTypeId,selfPay,sellerPlaceId,userName,powerFlag,powerFee,insuranceFee,insuranceFlag,shoppingCouponsFee,treasureChestFlag,treasureChestFee,
					UserID,UserPassword,"data.creditId");

					//--------------------------------------------------------------------------------------
				    String bankAccountNo = String.valueOf(bankAccountNoTextField.getText());
				    String bankCity = String.valueOf(bankCityTextField.getText());
				    String bankId = String.valueOf(bankIdTextField.getText());
				    String bankPhoto = String.valueOf(bankPhotoTextField.getText());
				    String bankProvince = String.valueOf(bankProvinceTextField.getText());
				    String branch = String.valueOf(branchTextField.getText());

				   if("请输入银行卡号码...".equals(bankAccountNo)){
					JOptionPane.showMessageDialog(null, "请输入银行卡号码！");
					return;
				   }
				   if("请输入开户行市...".equals(bankCity)){
					JOptionPane.showMessageDialog(null, "请输入开户行城市！");
					return;
				   }
				   if("请输入银行卡类型...".equals(bankId)){
					JOptionPane.showMessageDialog(null, "请输入银行卡类型！");
					return;
				   }
				   if("请输入银行卡照片...".equals(bankPhoto)){
				 	JOptionPane.showMessageDialog(null, "请输入银行卡照片！");
					return;
				   }
				   if("请输入开户行省...".equals(bankProvince)){
				 	JOptionPane.showMessageDialog(null, "请输入开户行省.！");
					return;
				   }
				   if("请输入银行卡开户行...".equals(branch)){
				 	JOptionPane.showMessageDialog(null, "请输入银行卡开户行！");
					return;
				   }

				   ApiHandler_1600x900.OneManualCreditBankInfo(bankAccountNo,bankCity,bankId,bankPhoto,bankProvince,creditId,branch,UserID,UserPassword);
				} catch (Exception e1) {
					e1.printStackTrace();
				}	
		    }
		});		
		
		//一键保存合同其他信息按钮-事件
		OneManualCreditOtherInfo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

			    try {
					String UserID = String.valueOf(UserIDTextField.getText());
					String UserPassword = String.valueOf(UserPassWordTextField.getText());
					
//					String brand = GoodsBoundBrandsBox.getSelectedItem().toString();
					String price = String.valueOf(ProductInforMationPriceTextField.getText());
					String selfPay = String.valueOf(ProductInforMationFirstPayTextField.getText());
					String subTypeId = String.valueOf(GoodsBoundBrandsGoodsSubTypeValueTextField.getText());
					String goodsTypeId = String.valueOf(ProductInforMationgoodsCategoryIdTextField.getText());
					String productVersionId = String.valueOf(ProductInforMationSearchTypeIdTextField.getText());
					String productsTypeId = String.valueOf(ProductInforMationProductTypeIdTextField.getText());
					String sellerPlaceId = String.valueOf(ProductInforMationStorIdTextField.getText());
					
					String model = String.valueOf(ModelTextField.getText());
					String healthFee = String.valueOf(HealthFeeTextField.getText());
					String secureFee = String.valueOf(SecureFeeTextField.getText());
					String comprehensiveInsuranceFee = String.valueOf(ComprehensiveInsuranceFeeTextField.getText());
					String information = String.valueOf(InformationTextField.getText());
					String goodsLocationNumber = String.valueOf(GoodsLocationNumberTextField.getText());
					String isCarryWifi = String.valueOf(IsCarryWifiTextField.getText());
					String isStudent = String.valueOf(IsStudentTextField.getText());
					String insuranceFlag = String.valueOf(InsuranceFlagTextField.getText());
					String insuranceFee = String.valueOf(InsuranceFeeTextField.getText());
					String treasureChestFlag = String.valueOf(TreasureChestFlagTextField.getText());
					String treasureChestFee = String.valueOf(TreasureChestFeeTextField.getText());
					String shoppingCouponsFee = String.valueOf(ShoppingCouponsFeeTextField.getText());
					String powerFlag = String.valueOf(PowerFlagTextField.getText());
					String powerFee = String.valueOf(PowerFeeTextField.getText());
//					String productCode = String.valueOf(ProductCodeTextField.getText());
					
					String userName = String.valueOf(UserNameTextField.getText());
					String nationalId = String.valueOf(NationalIdTextField.getText());
					String identNo = String.valueOf(IdentNoTextField.getText());
					String identPhoneBack = String.valueOf(IdentPhoneBackTextField.getText());
					String identPhoneFront = String.valueOf(IdentPhoneFrontTextField.getText());
					String province = String.valueOf(Address_ProvinceTextField.getText());
					String city = String.valueOf(Address_CityTextField.getText());
					String region = String.valueOf(Address_RegionTextField.getText());
					String identAddress = String.valueOf(IdentAddressTextField.getText());
					String identAuth = String.valueOf(IdentAuthTextField.getText());
					String identExp = String.valueOf(IdentExpTextField.getText());
					
					if("请输入用户ID...".equals(UserID)){
						JOptionPane.showMessageDialog(null, "请输入用户ID！");
						return;
					}
					if("请输入用户密码...".equals(UserPassword)){
						JOptionPane.showMessageDialog(null, "请输入用户密码！");
						return;
					}
//					if("请输入商品品牌...".equals(brand)){
//						JOptionPane.showMessageDialog(null, "请输入商品品牌！");
//						return;
//					}
					if("请输入医疗费...".equals(healthFee)){
						JOptionPane.showMessageDialog(null, "请输入医疗费！");
						return;
					}
					if("请输入商品型号...".equals(model)){
						JOptionPane.showMessageDialog(null, "请输入商品型号！");
						return;
					}
					if("请输入商品总额...".equals(price)){
						JOptionPane.showMessageDialog(null, "请输入商品总额！");
						return;
					}
					if("请输入安全费...".equals(secureFee)){
						JOptionPane.showMessageDialog(null, "请输入安全费！");
						return;
					}
					if("请输入首付总额...".equals(selfPay)){
						JOptionPane.showMessageDialog(null, "请输入首付总额！");
						return;
					}
					if("请输入商品小类Value...".equals(subTypeId)){
						JOptionPane.showMessageDialog(null, "请输入商品小类Value！");
						return;
					}
					if("请输入综合保险费...".equals(comprehensiveInsuranceFee)){
						JOptionPane.showMessageDialog(null, "请输入综合保险费！");
						return;
					}
					if("请输入信息...".equals(information)){
						JOptionPane.showMessageDialog(null, "请输入信息！");
						return;
					}
					if("请输入货位号...".equals(goodsLocationNumber)){
						JOptionPane.showMessageDialog(null, "请输入货位号！");
						return;
					}
					if("请输入是否WIFI热点城市...".equals(isCarryWifi)){
						JOptionPane.showMessageDialog(null, "请输入是否WIFI热点城市！");
						return;
					}
					if("请输入身份证详细地址...".equals(identAddress)){
						JOptionPane.showMessageDialog(null, "请输入身份证详细地址！");
						return;
					}
					if("请输入身份证所属省份...".equals(province)){
						JOptionPane.showMessageDialog(null, "请输入身份证所属省份！");
						return;
					}
					if("请输入身份证所属城市...".equals(city)){
						JOptionPane.showMessageDialog(null, "请输入身份证所属城市！");
						return;
					}
					if("请输入身份证所属区县...".equals(region)){
						JOptionPane.showMessageDialog(null, "请输入身份证所属区县！");
						return;
					}
					if("请输入身份证发证机关...".equals(identAuth)){
						JOptionPane.showMessageDialog(null, "请输入身份证发证机关！");
						return;
					}
					if("请输入商品类型ID...".equals(goodsTypeId)){
						JOptionPane.showMessageDialog(null, "请输入商品类型ID！");
						return;
					}
					if("请输入身份证有效期限...".equals(identExp)){
						JOptionPane.showMessageDialog(null, "请输入身份证有效期限！");
						return;
					}
					if("请输入身份证号码...".equals(identNo)){
						JOptionPane.showMessageDialog(null, "请输入身份证号码！");
						return;
					}
					if("请输入身份证正面照...".equals(identPhoneBack)){
						JOptionPane.showMessageDialog(null, "请输入身份证正面照！");
						return;
					}
					if("请输入身份证反面照...".equals(identPhoneFront)){
						JOptionPane.showMessageDialog(null, "请输入身份证反面照！");
						return;
					}
					if("请输入是否学生产品...".equals(isStudent)){
						JOptionPane.showMessageDialog(null, "请输入是否学生产品！");
						return;
					}
					if("请输入民族...".equals(nationalId)){
						JOptionPane.showMessageDialog(null, "请输入民族！");
						return;
					}
//					if("请输入分期产品代码...".equals(productCode)){
//						JOptionPane.showMessageDialog(null, "请输入分期产品代码！");
//						return;
//					}
					if("请输入产品版本ID...".equals(productVersionId)){
						JOptionPane.showMessageDialog(null, "请输入产品版本ID！");
						return;
					}
					if("请输入产品类型ID...".equals(productsTypeId)){
						JOptionPane.showMessageDialog(null, "请输入产品类型ID！");
						return;
					}
					if("请输入商品门店ID...".equals(sellerPlaceId)){
						JOptionPane.showMessageDialog(null, "请输入商品门店ID！");
						return;
					}
					if("请输入姓名...".equals(userName)){
						JOptionPane.showMessageDialog(null, "请输入姓名！");
						return;
					}
					if("请输入是否购买全面保...".equals(powerFlag)){
						JOptionPane.showMessageDialog(null, "请输入是否购买全面保！");
						return;
					}
					if("请输入全面保费...".equals(powerFee)){
						JOptionPane.showMessageDialog(null, "请输入全面保费用！");
						return;
					}
					if("请输入保险费...".equals(insuranceFee)){
						JOptionPane.showMessageDialog(null, "请输入保险费用！");
						return;
					}
					if("请输入是否购买保险...".equals(insuranceFlag)){
						JOptionPane.showMessageDialog(null, "请输入是否购买保险！");
						return;
					}
					if("请输入商城赠券费...".equals(shoppingCouponsFee)){
						JOptionPane.showMessageDialog(null, "请输入商城赠券费用！");
						return;
					}
					if("请输入百宝箱费...".equals(treasureChestFee)){
						JOptionPane.showMessageDialog(null, "请输入百宝箱费用！");
						return;
					}
					if("请输入是否购买百宝箱...".equals(treasureChestFlag)){
						JOptionPane.showMessageDialog(null, "请输入是否购买百宝箱！");
						return;
					}
					
					String ID_PERSON = DataBaseHandler_1600x900.GetValue(DataVersion,userName);
					DataBaseHandler_1600x900.UpdateContractStateButton(DataVersion,ID_PERSON);
					
					//--------------------------------------------------------------------------------------
			    	String GoodsSubTypeValue = String.valueOf(GoodsBoundBrandsGoodsSubTypeValueTextField.getText());
					String GoodsCategoryID = String.valueOf(GoodsBoundBrandsGoodsTypeIdTextField.getText());
					String GoodsBoundBrandsData = "data";
					String GoodsBoundBrandstext = "text";
					int GoodsBoundBrandsGoodsID = Integer.parseInt(GoodsBoundBrandsTextField.getText())-1;
					String brand = ApiHandler_OneTouchCredit_1600x900.GoodsBoundBrands(GoodsSubTypeValue,GoodsCategoryID,UserID,UserPassword,""+GoodsBoundBrandsData+"."+GoodsBoundBrandstext+"["+GoodsBoundBrandsGoodsID+"]");

					String ProductInforMationStoreId = String.valueOf(ProductInforMationStorIdTextField.getText());
					String ProductInforMationGoodsCategoryId = String.valueOf(ProductInforMationgoodsCategoryIdTextField.getText());
					String ProductInforMationSearchTypeId = String.valueOf(ProductInforMationSearchTypeIdTextField.getText());
					String ProductInforMationProductTypeId = String.valueOf(ProductInforMationProductTypeIdTextField.getText());
					String ProductInforMationPrice = String.valueOf(ProductInforMationPriceTextField.getText());
					String ProductInforMationFirstPay = String.valueOf(ProductInforMationFirstPayTextField.getText());
					String ProductInforMationIsWallet = String.valueOf(ProductInforMationIsWalletTextField.getText());
					String ProductInforMationData = "data";
					String ProductInforMationEntities = "entities";
					String ProductInforMationProdCode = "prodCode";
					int ProductInforMationID=Integer.parseInt(ProductInforMationTextField.getText())-1;
					String productCode = ApiHandler_OneTouchCredit_1600x900.ProductInforMation(ProductInforMationStoreId,ProductInforMationGoodsCategoryId,ProductInforMationSearchTypeId,
					       ProductInforMationProductTypeId,ProductInforMationPrice,ProductInforMationFirstPay,ProductInforMationIsWallet,UserID,UserPassword,""+ProductInforMationData+"."+ProductInforMationEntities+"",""+ProductInforMationProdCode+"["+ProductInforMationID+"]");
					
					String creditId =ApiHandler_OneTouchCredit_1600x900.OneManualCredit(
					brand,healthFee,model,price,secureFee,selfPay,subTypeId,comprehensiveInsuranceFee,information,goodsLocationNumber,isCarryWifi,
					identAddress,province,city,region,identAuth,goodsTypeId,identExp,identNo,identPhoneBack,identPhoneFront,isStudent,nationalId,price,productCode,productVersionId,productsTypeId,selfPay,sellerPlaceId,userName,powerFlag,powerFee,insuranceFee,insuranceFlag,shoppingCouponsFee,treasureChestFlag,treasureChestFee,
					UserID,UserPassword,"data.creditId");
		
					//--------------------------------------------------------------------------------------
				    String cellPhone = String.valueOf(cellPhoneTextField.getText());
				    String childrenCount = String.valueOf(childrenCountTextField.getText());
				    String educationTypeId = String.valueOf(educationTypeIdTextField.getText());
				    String familyTel = String.valueOf(familyTelTextField.getText());
				    String familyTotalIncome = String.valueOf(familyTotalIncomeTextField.getText());
				    String houseTypeId = String.valueOf(houseTypeIdTextField.getText());
				    String marriageTypeId = String.valueOf(marriageTypeIdTextField.getText());			
				    String monthExpend = String.valueOf(monthExpendTextField.getText());
				    String monthIncome = String.valueOf(monthIncomeTextField.getText());
				    String qq = String.valueOf(qqTextField.getText());
				    String wechart = String.valueOf(wechartTextField.getText());
				
				    String liveInfo_city = String.valueOf(liveInfo_CityTextField.getText());
				    String liveInfo_detail = String.valueOf(liveInfo_DetailTextField.getText());
				    String liveInfo_province = String.valueOf(liveInfo_ProvinceTextField.getText());
				    String liveInfo_region = String.valueOf(liveInfo_RegionTextField.getText());
				
				    String email = String.valueOf(emailTextField.getText());
			
					ApiHandler_1600x900.OneManualCreditBaseInfo(
					cellPhone,childrenCount,creditId,educationTypeId,familyTel,familyTotalIncome,houseTypeId,marriageTypeId,monthExpend,monthIncome,qq,wechart,
					liveInfo_city,liveInfo_detail,liveInfo_province,liveInfo_region,
					email,isStudent,UserID,UserPassword);
					
					//--------------------------------------------------------------------------------------
				    String compAddDetail = String.valueOf(compAddDetailTextField.getText());
				    String compCity = String.valueOf(CompCityTextField.getText());
				    String compName = String.valueOf(compNameTextField.getText());
				    String compProvince = String.valueOf(CompProvinceTextField.getText());
				    String compRegion = String.valueOf(CompRegionTextField.getText());
				    String companyPropertyId = String.valueOf(companyPropertyIdTextField.getText());
				    String entryDate = String.valueOf(entryDateTextField.getText());			
				    String industryTypeId = String.valueOf(industryTypeIdTextField.getText());
				    String jobsTypeId = String.valueOf(jobsTypeIdTextField.getText());
				    String workPhone = String.valueOf(workPhoneTextField.getText());
				    String workPhoneExt = String.valueOf(workPhoneExtTextField.getText());
				    String workYears = String.valueOf(workYearsTextField.getText());
				    String department = String.valueOf(departmentTextField.getText());

				    ApiHandler_1600x900.OneManualCreditCompanyInfo(
				    compAddDetail,compCity,compName,compProvince,compRegion,companyPropertyId,creditId,entryDate,industryTypeId,jobsTypeId,workPhone,workPhoneExt,
				    workYears,department,UserID,UserPassword);
				   
					//--------------------------------------------------------------------------------------
				    int type = Integer.parseInt(Contacts_typeTextField.getText());
				    String linkerName = String.valueOf(Contacts_linkerNameTextField.getText());
				    String phone = String.valueOf(Contacts_phoneTextField.getText());
				    String relationTypeID = String.valueOf(Contacts_relationTypeIDTextField.getText());

				    ApiHandler_1600x900.OneManualCreditLinkInfo(creditId,type,linkerName,phone,relationTypeID,UserID,UserPassword);
				    ApiHandler_1600x900.OneManualCreditLinkInfo(creditId,type+1,"时夏","13999999999","5"+relationTypeID,UserID,UserPassword);
				   
					//--------------------------------------------------------------------------------------
				    String bankAccountNo = String.valueOf(bankAccountNoTextField.getText());
				    String bankCity = String.valueOf(bankCityTextField.getText());
				    String bankId = String.valueOf(bankIdTextField.getText());
				    String bankPhoto = String.valueOf(bankPhotoTextField.getText());
				    String bankProvince = String.valueOf(bankProvinceTextField.getText());
				    String branch = String.valueOf(branchTextField.getText());
				    
				    ApiHandler_1600x900.OneManualCreditBankInfo(bankAccountNo,bankCity,bankId,bankPhoto,bankProvince,creditId,branch,UserID,UserPassword);
				   
					//--------------------------------------------------------------------------------------
				    String innerCode = String.valueOf(innerCodeTextField.getText());
				    String remark = String.valueOf(remarkTextFiel.getText());
				    String shop = String.valueOf(shopTextFiel.getText());
				    String isShop = String.valueOf(isShopTextField.getText());

				    ApiHandler_1600x900.OneManualCreditOtherInfo(creditId,innerCode,remark,shop,isShop,UserID,UserPassword);
				} catch (Exception e1) {
					e1.printStackTrace();
				}	
		    }
		});		
		
		//一键上传影像证明图片按钮-事件
		OneManualCreditUploadPhoto.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

			    try {
					String UserID = String.valueOf(UserIDTextField.getText());
					String UserPassword = String.valueOf(UserPassWordTextField.getText());
					
//					String brand = GoodsBoundBrandsBox.getSelectedItem().toString();
					String price = String.valueOf(ProductInforMationPriceTextField.getText());
					String selfPay = String.valueOf(ProductInforMationFirstPayTextField.getText());
					String subTypeId = String.valueOf(GoodsBoundBrandsGoodsSubTypeValueTextField.getText());
					String goodsTypeId = String.valueOf(ProductInforMationgoodsCategoryIdTextField.getText());
					String productVersionId = String.valueOf(ProductInforMationSearchTypeIdTextField.getText());
					String productsTypeId = String.valueOf(ProductInforMationProductTypeIdTextField.getText());
					String sellerPlaceId = String.valueOf(ProductInforMationStorIdTextField.getText());
					
					String model = String.valueOf(ModelTextField.getText());
					String healthFee = String.valueOf(HealthFeeTextField.getText());
					String secureFee = String.valueOf(SecureFeeTextField.getText());
					String comprehensiveInsuranceFee = String.valueOf(ComprehensiveInsuranceFeeTextField.getText());
					String information = String.valueOf(InformationTextField.getText());
					String goodsLocationNumber = String.valueOf(GoodsLocationNumberTextField.getText());
					String isCarryWifi = String.valueOf(IsCarryWifiTextField.getText());
					String isStudent = String.valueOf(IsStudentTextField.getText());
					String insuranceFlag = String.valueOf(InsuranceFlagTextField.getText());
					String insuranceFee = String.valueOf(InsuranceFeeTextField.getText());
					String treasureChestFlag = String.valueOf(TreasureChestFlagTextField.getText());
					String treasureChestFee = String.valueOf(TreasureChestFeeTextField.getText());
					String shoppingCouponsFee = String.valueOf(ShoppingCouponsFeeTextField.getText());
					String powerFlag = String.valueOf(PowerFlagTextField.getText());
					String powerFee = String.valueOf(PowerFeeTextField.getText());
//					String productCode = String.valueOf(ProductCodeTextField.getText());
					
					String userName = String.valueOf(UserNameTextField.getText());
					String nationalId = String.valueOf(NationalIdTextField.getText());
					String identNo = String.valueOf(IdentNoTextField.getText());
					String identPhoneBack = String.valueOf(IdentPhoneBackTextField.getText());
					String identPhoneFront = String.valueOf(IdentPhoneFrontTextField.getText());
					String province = String.valueOf(Address_ProvinceTextField.getText());
					String city = String.valueOf(Address_CityTextField.getText());
					String region = String.valueOf(Address_RegionTextField.getText());
					String identAddress = String.valueOf(IdentAddressTextField.getText());
					String identAuth = String.valueOf(IdentAuthTextField.getText());
					String identExp = String.valueOf(IdentExpTextField.getText());
					
					if("请输入用户ID...".equals(UserID)){
						JOptionPane.showMessageDialog(null, "请输入用户ID！");
						return;
					}
					if("请输入用户密码...".equals(UserPassword)){
						JOptionPane.showMessageDialog(null, "请输入用户密码！");
						return;
					}
//					if("请输入商品品牌...".equals(brand)){
//						JOptionPane.showMessageDialog(null, "请输入商品品牌！");
//						return;
//					}
					if("请输入医疗费...".equals(healthFee)){
						JOptionPane.showMessageDialog(null, "请输入医疗费！");
						return;
					}
					if("请输入商品型号...".equals(model)){
						JOptionPane.showMessageDialog(null, "请输入商品型号！");
						return;
					}
					if("请输入商品总额...".equals(price)){
						JOptionPane.showMessageDialog(null, "请输入商品总额！");
						return;
					}
					if("请输入安全费...".equals(secureFee)){
						JOptionPane.showMessageDialog(null, "请输入安全费！");
						return;
					}
					if("请输入首付总额...".equals(selfPay)){
						JOptionPane.showMessageDialog(null, "请输入首付总额！");
						return;
					}
					if("请输入商品小类Value...".equals(subTypeId)){
						JOptionPane.showMessageDialog(null, "请输入商品小类Value！");
						return;
					}
					if("请输入综合保险费...".equals(comprehensiveInsuranceFee)){
						JOptionPane.showMessageDialog(null, "请输入综合保险费！");
						return;
					}
					if("请输入信息...".equals(information)){
						JOptionPane.showMessageDialog(null, "请输入信息！");
						return;
					}
					if("请输入货位号...".equals(goodsLocationNumber)){
						JOptionPane.showMessageDialog(null, "请输入货位号！");
						return;
					}
					if("请输入是否WIFI热点城市...".equals(isCarryWifi)){
						JOptionPane.showMessageDialog(null, "请输入是否WIFI热点城市！");
						return;
					}
					if("请输入身份证详细地址...".equals(identAddress)){
						JOptionPane.showMessageDialog(null, "请输入身份证详细地址！");
						return;
					}
					if("请输入身份证所属省份...".equals(province)){
						JOptionPane.showMessageDialog(null, "请输入身份证所属省份！");
						return;
					}
					if("请输入身份证所属城市...".equals(city)){
						JOptionPane.showMessageDialog(null, "请输入身份证所属城市！");
						return;
					}
					if("请输入身份证所属区县...".equals(region)){
						JOptionPane.showMessageDialog(null, "请输入身份证所属区县！");
						return;
					}
					if("请输入身份证发证机关...".equals(identAuth)){
						JOptionPane.showMessageDialog(null, "请输入身份证发证机关！");
						return;
					}
					if("请输入商品类型ID...".equals(goodsTypeId)){
						JOptionPane.showMessageDialog(null, "请输入商品类型ID！");
						return;
					}
					if("请输入身份证有效期限...".equals(identExp)){
						JOptionPane.showMessageDialog(null, "请输入身份证有效期限！");
						return;
					}
					if("请输入身份证号码...".equals(identNo)){
						JOptionPane.showMessageDialog(null, "请输入身份证号码！");
						return;
					}
					if("请输入身份证正面照...".equals(identPhoneBack)){
						JOptionPane.showMessageDialog(null, "请输入身份证正面照！");
						return;
					}
					if("请输入身份证反面照...".equals(identPhoneFront)){
						JOptionPane.showMessageDialog(null, "请输入身份证反面照！");
						return;
					}
					if("请输入是否学生产品...".equals(isStudent)){
						JOptionPane.showMessageDialog(null, "请输入是否学生产品！");
						return;
					}
					if("请输入民族...".equals(nationalId)){
						JOptionPane.showMessageDialog(null, "请输入民族！");
						return;
					}
//					if("请输入分期产品代码...".equals(productCode)){
//						JOptionPane.showMessageDialog(null, "请输入分期产品代码！");
//						return;
//					}
					if("请输入产品版本ID...".equals(productVersionId)){
						JOptionPane.showMessageDialog(null, "请输入产品版本ID！");
						return;
					}
					if("请输入产品类型ID...".equals(productsTypeId)){
						JOptionPane.showMessageDialog(null, "请输入产品类型ID！");
						return;
					}
					if("请输入商品门店ID...".equals(sellerPlaceId)){
						JOptionPane.showMessageDialog(null, "请输入商品门店ID！");
						return;
					}
					if("请输入姓名...".equals(userName)){
						JOptionPane.showMessageDialog(null, "请输入姓名！");
						return;
					}
					if("请输入是否购买全面保...".equals(powerFlag)){
						JOptionPane.showMessageDialog(null, "请输入是否购买全面保！");
						return;
					}
					if("请输入全面保费...".equals(powerFee)){
						JOptionPane.showMessageDialog(null, "请输入全面保费用！");
						return;
					}
					if("请输入保险费...".equals(insuranceFee)){
						JOptionPane.showMessageDialog(null, "请输入保险费用！");
						return;
					}
					if("请输入是否购买保险...".equals(insuranceFlag)){
						JOptionPane.showMessageDialog(null, "请输入是否购买保险！");
						return;
					}
					if("请输入商城赠券费...".equals(shoppingCouponsFee)){
						JOptionPane.showMessageDialog(null, "请输入商城赠券费用！");
						return;
					}
					if("请输入百宝箱费...".equals(treasureChestFee)){
						JOptionPane.showMessageDialog(null, "请输入百宝箱费用！");
						return;
					}
					if("请输入是否购买百宝箱...".equals(treasureChestFlag)){
						JOptionPane.showMessageDialog(null, "请输入是否购买百宝箱！");
						return;
					}
					
					String ID_PERSON = DataBaseHandler_1600x900.GetValue(DataVersion,userName);
					DataBaseHandler_1600x900.UpdateContractStateButton(DataVersion,ID_PERSON);
					
			    	String GoodsSubTypeValue = String.valueOf(GoodsBoundBrandsGoodsSubTypeValueTextField.getText());
					String GoodsCategoryID = String.valueOf(GoodsBoundBrandsGoodsTypeIdTextField.getText());
					String GoodsBoundBrandsData = "data";
					String GoodsBoundBrandstext = "text";
					int GoodsBoundBrandsGoodsID = Integer.parseInt(GoodsBoundBrandsTextField.getText())-1;
					String brand = ApiHandler_OneTouchCredit_1600x900.GoodsBoundBrands(GoodsSubTypeValue,GoodsCategoryID,UserID,UserPassword,""+GoodsBoundBrandsData+"."+GoodsBoundBrandstext+"["+GoodsBoundBrandsGoodsID+"]");

					String ProductInforMationStoreId = String.valueOf(ProductInforMationStorIdTextField.getText());
					String ProductInforMationGoodsCategoryId = String.valueOf(ProductInforMationgoodsCategoryIdTextField.getText());
					String ProductInforMationSearchTypeId = String.valueOf(ProductInforMationSearchTypeIdTextField.getText());
					String ProductInforMationProductTypeId = String.valueOf(ProductInforMationProductTypeIdTextField.getText());
					String ProductInforMationPrice = String.valueOf(ProductInforMationPriceTextField.getText());
					String ProductInforMationFirstPay = String.valueOf(ProductInforMationFirstPayTextField.getText());
					String ProductInforMationIsWallet = String.valueOf(ProductInforMationIsWalletTextField.getText());
					String ProductInforMationData = "data";
					String ProductInforMationEntities = "entities";
					String ProductInforMationProdCode = "prodCode";
					int ProductInforMationID=Integer.parseInt(ProductInforMationTextField.getText())-1;
					String productCode = ApiHandler_OneTouchCredit_1600x900.ProductInforMation(ProductInforMationStoreId,ProductInforMationGoodsCategoryId,ProductInforMationSearchTypeId,
					       ProductInforMationProductTypeId,ProductInforMationPrice,ProductInforMationFirstPay,ProductInforMationIsWallet,UserID,UserPassword,""+ProductInforMationData+"."+ProductInforMationEntities+"",""+ProductInforMationProdCode+"["+ProductInforMationID+"]");
					
					String creditId =ApiHandler_OneTouchCredit_1600x900.OneManualCredit(
					brand,healthFee,model,price,secureFee,selfPay,subTypeId,comprehensiveInsuranceFee,information,goodsLocationNumber,isCarryWifi,
					identAddress,province,city,region,identAuth,goodsTypeId,identExp,identNo,identPhoneBack,identPhoneFront,isStudent,nationalId,price,productCode,productVersionId,productsTypeId,selfPay,sellerPlaceId,userName,powerFlag,powerFee,insuranceFee,insuranceFlag,shoppingCouponsFee,treasureChestFlag,treasureChestFee,
					UserID,UserPassword,"data.creditId");

					//--------------------------------------------------------------------------------------
				    String flowType = String.valueOf(flowTypeTextField.getText());
				    String name = String.valueOf(nameTextField.getText());
				    String path = String.valueOf(pathTextField.getText());
				    String photoType = String.valueOf(photoTypeTextField.getText());

				   if("请输入流式..".equals(flowType)){
					JOptionPane.showMessageDialog(null, "请输入流式！");
					return;
				   }
				   if("请输入图片名称...".equals(name)){
					JOptionPane.showMessageDialog(null, "请输入图片名称！");
					return;
				   }
				   if("请输入图片路径...".equals(path)){
					JOptionPane.showMessageDialog(null, "请输入图片路径！");
					return;
				   }
				   if("请输入图片类型...".equals(photoType)){
				 	JOptionPane.showMessageDialog(null, "请输入图片类型！");
					return;
				   }

				   ApiHandler_1600x900.OneManualCreditUploadPhoto(creditId,flowType,name,path,photoType,UserID,UserPassword);
				   ApiHandler_1600x900.OneManualCreditUploadPhoto(creditId,flowType,"客户门店照片",path,"2",UserID,UserPassword);
				   ApiHandler_1600x900.OneManualCreditUploadPhoto(creditId,flowType,"银行卡",path,"15",UserID,UserPassword);
			    } catch (Exception e1) {
					e1.printStackTrace();
				}	
		    }
		});			
		
		//一键提交保存合同按钮-事件
		OneManualCreditSubmit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

			    try {
					String UserID = String.valueOf(UserIDTextField.getText());
					String UserPassword = String.valueOf(UserPassWordTextField.getText());
					
//					String brand = GoodsBoundBrandsBox.getSelectedItem().toString();
					String price = String.valueOf(ProductInforMationPriceTextField.getText());
					String selfPay = String.valueOf(ProductInforMationFirstPayTextField.getText());
					String subTypeId = String.valueOf(GoodsBoundBrandsGoodsSubTypeValueTextField.getText());
					String goodsTypeId = String.valueOf(ProductInforMationgoodsCategoryIdTextField.getText());
					String productVersionId = String.valueOf(ProductInforMationSearchTypeIdTextField.getText());
					String productsTypeId = String.valueOf(ProductInforMationProductTypeIdTextField.getText());
					String sellerPlaceId = String.valueOf(ProductInforMationStorIdTextField.getText());
					
					String model = String.valueOf(ModelTextField.getText());
					String healthFee = String.valueOf(HealthFeeTextField.getText());
					String secureFee = String.valueOf(SecureFeeTextField.getText());
					String comprehensiveInsuranceFee = String.valueOf(ComprehensiveInsuranceFeeTextField.getText());
					String information = String.valueOf(InformationTextField.getText());
					String goodsLocationNumber = String.valueOf(GoodsLocationNumberTextField.getText());
					String isCarryWifi = String.valueOf(IsCarryWifiTextField.getText());
					String isStudent = String.valueOf(IsStudentTextField.getText());
					String insuranceFlag = String.valueOf(InsuranceFlagTextField.getText());
					String insuranceFee = String.valueOf(InsuranceFeeTextField.getText());
					String treasureChestFlag = String.valueOf(TreasureChestFlagTextField.getText());
					String treasureChestFee = String.valueOf(TreasureChestFeeTextField.getText());
					String shoppingCouponsFee = String.valueOf(ShoppingCouponsFeeTextField.getText());
					String powerFlag = String.valueOf(PowerFlagTextField.getText());
					String powerFee = String.valueOf(PowerFeeTextField.getText());
//					String productCode = String.valueOf(ProductCodeTextField.getText());
					
					String userName = String.valueOf(UserNameTextField.getText());
					String nationalId = String.valueOf(NationalIdTextField.getText());
					String identNo = String.valueOf(IdentNoTextField.getText());
					String identPhoneBack = String.valueOf(IdentPhoneBackTextField.getText());
					String identPhoneFront = String.valueOf(IdentPhoneFrontTextField.getText());
					String province = String.valueOf(Address_ProvinceTextField.getText());
					String city = String.valueOf(Address_CityTextField.getText());
					String region = String.valueOf(Address_RegionTextField.getText());
					String identAddress = String.valueOf(IdentAddressTextField.getText());
					String identAuth = String.valueOf(IdentAuthTextField.getText());
					String identExp = String.valueOf(IdentExpTextField.getText());
					
					if("请输入用户ID...".equals(UserID)){
						JOptionPane.showMessageDialog(null, "请输入用户ID！");
						return;
					}
					if("请输入用户密码...".equals(UserPassword)){
						JOptionPane.showMessageDialog(null, "请输入用户密码！");
						return;
					}
//					if("请输入商品品牌...".equals(brand)){
//						JOptionPane.showMessageDialog(null, "请输入商品品牌！");
//						return;
//					}
					if("请输入医疗费...".equals(healthFee)){
						JOptionPane.showMessageDialog(null, "请输入医疗费！");
						return;
					}
					if("请输入商品型号...".equals(model)){
						JOptionPane.showMessageDialog(null, "请输入商品型号！");
						return;
					}
					if("请输入商品总额...".equals(price)){
						JOptionPane.showMessageDialog(null, "请输入商品总额！");
						return;
					}
					if("请输入安全费...".equals(secureFee)){
						JOptionPane.showMessageDialog(null, "请输入安全费！");
						return;
					}
					if("请输入首付总额...".equals(selfPay)){
						JOptionPane.showMessageDialog(null, "请输入首付总额！");
						return;
					}
					if("请输入商品小类Value...".equals(subTypeId)){
						JOptionPane.showMessageDialog(null, "请输入商品小类Value！");
						return;
					}
					if("请输入综合保险费...".equals(comprehensiveInsuranceFee)){
						JOptionPane.showMessageDialog(null, "请输入综合保险费！");
						return;
					}
					if("请输入信息...".equals(information)){
						JOptionPane.showMessageDialog(null, "请输入信息！");
						return;
					}
					if("请输入货位号...".equals(goodsLocationNumber)){
						JOptionPane.showMessageDialog(null, "请输入货位号！");
						return;
					}
					if("请输入是否WIFI热点城市...".equals(isCarryWifi)){
						JOptionPane.showMessageDialog(null, "请输入是否WIFI热点城市！");
						return;
					}
					if("请输入身份证详细地址...".equals(identAddress)){
						JOptionPane.showMessageDialog(null, "请输入身份证详细地址！");
						return;
					}
					if("请输入身份证所属省份...".equals(province)){
						JOptionPane.showMessageDialog(null, "请输入身份证所属省份！");
						return;
					}
					if("请输入身份证所属城市...".equals(city)){
						JOptionPane.showMessageDialog(null, "请输入身份证所属城市！");
						return;
					}
					if("请输入身份证所属区县...".equals(region)){
						JOptionPane.showMessageDialog(null, "请输入身份证所属区县！");
						return;
					}
					if("请输入身份证发证机关...".equals(identAuth)){
						JOptionPane.showMessageDialog(null, "请输入身份证发证机关！");
						return;
					}
					if("请输入商品类型ID...".equals(goodsTypeId)){
						JOptionPane.showMessageDialog(null, "请输入商品类型ID！");
						return;
					}
					if("请输入身份证有效期限...".equals(identExp)){
						JOptionPane.showMessageDialog(null, "请输入身份证有效期限！");
						return;
					}
					if("请输入身份证号码...".equals(identNo)){
						JOptionPane.showMessageDialog(null, "请输入身份证号码！");
						return;
					}
					if("请输入身份证正面照...".equals(identPhoneBack)){
						JOptionPane.showMessageDialog(null, "请输入身份证正面照！");
						return;
					}
					if("请输入身份证反面照...".equals(identPhoneFront)){
						JOptionPane.showMessageDialog(null, "请输入身份证反面照！");
						return;
					}
					if("请输入是否学生产品...".equals(isStudent)){
						JOptionPane.showMessageDialog(null, "请输入是否学生产品！");
						return;
					}
					if("请输入民族...".equals(nationalId)){
						JOptionPane.showMessageDialog(null, "请输入民族！");
						return;
					}
//					if("请输入分期产品代码...".equals(productCode)){
//						JOptionPane.showMessageDialog(null, "请输入分期产品代码！");
//						return;
//					}
					if("请输入产品版本ID...".equals(productVersionId)){
						JOptionPane.showMessageDialog(null, "请输入产品版本ID！");
						return;
					}
					if("请输入产品类型ID...".equals(productsTypeId)){
						JOptionPane.showMessageDialog(null, "请输入产品类型ID！");
						return;
					}
					if("请输入商品门店ID...".equals(sellerPlaceId)){
						JOptionPane.showMessageDialog(null, "请输入商品门店ID！");
						return;
					}
					if("请输入姓名...".equals(userName)){
						JOptionPane.showMessageDialog(null, "请输入姓名！");
						return;
					}
					if("请输入是否购买全面保...".equals(powerFlag)){
						JOptionPane.showMessageDialog(null, "请输入是否购买全面保！");
						return;
					}
					if("请输入全面保费...".equals(powerFee)){
						JOptionPane.showMessageDialog(null, "请输入全面保费用！");
						return;
					}
					if("请输入保险费...".equals(insuranceFee)){
						JOptionPane.showMessageDialog(null, "请输入保险费用！");
						return;
					}
					if("请输入是否购买保险...".equals(insuranceFlag)){
						JOptionPane.showMessageDialog(null, "请输入是否购买保险！");
						return;
					}
					if("请输入商城赠券费...".equals(shoppingCouponsFee)){
						JOptionPane.showMessageDialog(null, "请输入商城赠券费用！");
						return;
					}
					if("请输入百宝箱费...".equals(treasureChestFee)){
						JOptionPane.showMessageDialog(null, "请输入百宝箱费用！");
						return;
					}
					if("请输入是否购买百宝箱...".equals(treasureChestFlag)){
						JOptionPane.showMessageDialog(null, "请输入是否购买百宝箱！");
						return;
					}
					
					String ID_PERSON = DataBaseHandler_1600x900.GetValue(DataVersion,userName);
					DataBaseHandler_1600x900.UpdateContractStateButton(DataVersion,ID_PERSON);
					
					//--------------------------------------------------------------------------------------
			    	String GoodsSubTypeValue = String.valueOf(GoodsBoundBrandsGoodsSubTypeValueTextField.getText());
					String GoodsCategoryID = String.valueOf(GoodsBoundBrandsGoodsTypeIdTextField.getText());
					String GoodsBoundBrandsData = "data";
					String GoodsBoundBrandstext = "text";
					int GoodsBoundBrandsGoodsID = Integer.parseInt(GoodsBoundBrandsTextField.getText())-1;
					String brand = ApiHandler_OneTouchCredit_1600x900.GoodsBoundBrands(GoodsSubTypeValue,GoodsCategoryID,UserID,UserPassword,""+GoodsBoundBrandsData+"."+GoodsBoundBrandstext+"["+GoodsBoundBrandsGoodsID+"]");

					String ProductInforMationStoreId = String.valueOf(ProductInforMationStorIdTextField.getText());
					String ProductInforMationGoodsCategoryId = String.valueOf(ProductInforMationgoodsCategoryIdTextField.getText());
					String ProductInforMationSearchTypeId = String.valueOf(ProductInforMationSearchTypeIdTextField.getText());
					String ProductInforMationProductTypeId = String.valueOf(ProductInforMationProductTypeIdTextField.getText());
					String ProductInforMationPrice = String.valueOf(ProductInforMationPriceTextField.getText());
					String ProductInforMationFirstPay = String.valueOf(ProductInforMationFirstPayTextField.getText());
					String ProductInforMationIsWallet = String.valueOf(ProductInforMationIsWalletTextField.getText());
					String ProductInforMationData = "data";
					String ProductInforMationEntities = "entities";
					String ProductInforMationProdCode = "prodCode";
					int ProductInforMationID=Integer.parseInt(ProductInforMationTextField.getText())-1;
					String productCode = ApiHandler_OneTouchCredit_1600x900.ProductInforMation(ProductInforMationStoreId,ProductInforMationGoodsCategoryId,ProductInforMationSearchTypeId,
					       ProductInforMationProductTypeId,ProductInforMationPrice,ProductInforMationFirstPay,ProductInforMationIsWallet,UserID,UserPassword,""+ProductInforMationData+"."+ProductInforMationEntities+"",""+ProductInforMationProdCode+"["+ProductInforMationID+"]");
					
					String creditId =ApiHandler_OneTouchCredit_1600x900.OneManualCredit(
					brand,healthFee,model,price,secureFee,selfPay,subTypeId,comprehensiveInsuranceFee,information,goodsLocationNumber,isCarryWifi,
					identAddress,province,city,region,identAuth,goodsTypeId,identExp,identNo,identPhoneBack,identPhoneFront,isStudent,nationalId,price,productCode,productVersionId,productsTypeId,selfPay,sellerPlaceId,userName,powerFlag,powerFee,insuranceFee,insuranceFlag,shoppingCouponsFee,treasureChestFlag,treasureChestFee,
					UserID,UserPassword,"data.creditId");
		
					//--------------------------------------------------------------------------------------
				    String cellPhone = String.valueOf(cellPhoneTextField.getText());
				    String childrenCount = String.valueOf(childrenCountTextField.getText());
				    String educationTypeId = String.valueOf(educationTypeIdTextField.getText());
				    String familyTel = String.valueOf(familyTelTextField.getText());
				    String familyTotalIncome = String.valueOf(familyTotalIncomeTextField.getText());
				    String houseTypeId = String.valueOf(houseTypeIdTextField.getText());
				    String marriageTypeId = String.valueOf(marriageTypeIdTextField.getText());			
				    String monthExpend = String.valueOf(monthExpendTextField.getText());
				    String monthIncome = String.valueOf(monthIncomeTextField.getText());
				    String qq = String.valueOf(qqTextField.getText());
				    String wechart = String.valueOf(wechartTextField.getText());
				
				    String liveInfo_city = String.valueOf(liveInfo_CityTextField.getText());
				    String liveInfo_detail = String.valueOf(liveInfo_DetailTextField.getText());
				    String liveInfo_province = String.valueOf(liveInfo_ProvinceTextField.getText());
				    String liveInfo_region = String.valueOf(liveInfo_RegionTextField.getText());
				
				    String email = String.valueOf(emailTextField.getText());
			
					ApiHandler_1600x900.OneManualCreditBaseInfo(
					cellPhone,childrenCount,creditId,educationTypeId,familyTel,familyTotalIncome,houseTypeId,marriageTypeId,monthExpend,monthIncome,qq,wechart,
					liveInfo_city,liveInfo_detail,liveInfo_province,liveInfo_region,
					email,isStudent,UserID,UserPassword);
					
					//--------------------------------------------------------------------------------------
				    String compAddDetail = String.valueOf(compAddDetailTextField.getText());
				    String compCity = String.valueOf(CompCityTextField.getText());
				    String compName = String.valueOf(compNameTextField.getText());
				    String compProvince = String.valueOf(CompProvinceTextField.getText());
				    String compRegion = String.valueOf(CompRegionTextField.getText());
				    String companyPropertyId = String.valueOf(companyPropertyIdTextField.getText());
				    String entryDate = String.valueOf(entryDateTextField.getText());			
				    String industryTypeId = String.valueOf(industryTypeIdTextField.getText());
				    String jobsTypeId = String.valueOf(jobsTypeIdTextField.getText());
				    String workPhone = String.valueOf(workPhoneTextField.getText());
				    String workPhoneExt = String.valueOf(workPhoneExtTextField.getText());
				    String workYears = String.valueOf(workYearsTextField.getText());
				    String department = String.valueOf(departmentTextField.getText());

				    ApiHandler_1600x900.OneManualCreditCompanyInfo(
				    compAddDetail,compCity,compName,compProvince,compRegion,companyPropertyId,creditId,entryDate,industryTypeId,jobsTypeId,workPhone,workPhoneExt,
				    workYears,department,UserID,UserPassword);
				   
					//--------------------------------------------------------------------------------------
				    int type = Integer.parseInt(Contacts_typeTextField.getText());
				    String linkerName = String.valueOf(Contacts_linkerNameTextField.getText());
				    String phone = String.valueOf(Contacts_phoneTextField.getText());
				    String relationTypeID = String.valueOf(Contacts_relationTypeIDTextField.getText());

				    ApiHandler_1600x900.OneManualCreditLinkInfo(creditId,type,linkerName,phone,relationTypeID,UserID,UserPassword);
				    ApiHandler_1600x900.OneManualCreditLinkInfo(creditId,type+1,"时夏","13999999999","5"+relationTypeID,UserID,UserPassword);
				   
					//--------------------------------------------------------------------------------------
				    String bankAccountNo = String.valueOf(bankAccountNoTextField.getText());
				    String bankCity = String.valueOf(bankCityTextField.getText());
				    String bankId = String.valueOf(bankIdTextField.getText());
				    String bankPhoto = String.valueOf(bankPhotoTextField.getText());
				    String bankProvince = String.valueOf(bankProvinceTextField.getText());
				    String branch = String.valueOf(branchTextField.getText());
				    
				    ApiHandler_1600x900.OneManualCreditBankInfo(bankAccountNo,bankCity,bankId,bankPhoto,bankProvince,creditId,branch,UserID,UserPassword);
				   
					//--------------------------------------------------------------------------------------
				    String innerCode = String.valueOf(innerCodeTextField.getText());
				    String remark = String.valueOf(remarkTextFiel.getText());
				    String shop = String.valueOf(shopTextFiel.getText());
				    String isShop = String.valueOf(isShopTextField.getText());

				    ApiHandler_1600x900.OneManualCreditOtherInfo(creditId,innerCode,remark,shop,isShop,UserID,UserPassword);
				   
					//--------------------------------------------------------------------------------------
				    String flowType = String.valueOf(flowTypeTextField.getText());
				    String name = String.valueOf(nameTextField.getText());
				    String path = String.valueOf(pathTextField.getText());
				    String photoType = String.valueOf(photoTypeTextField.getText());

				    ApiHandler_1600x900.OneManualCreditUploadPhoto(creditId,flowType,name,path,photoType,UserID,UserPassword);
				    ApiHandler_1600x900.OneManualCreditUploadPhoto(creditId,flowType,"客户门店照片",path,"2",UserID,UserPassword);
				    ApiHandler_1600x900.OneManualCreditUploadPhoto(creditId,flowType,"银行卡",path,"15",UserID,UserPassword);
				    
					//--------------------------------------------------------------------------------------
				    ApiHandler_1600x900.OneManualCreditSubmit(creditId,UserID,UserPassword);

			    } catch (Exception e1) {
					e1.printStackTrace();
				}	
		    }
		});			
		
		//返回至查询合同费用按钮-事件
		InquiryContractButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				InquiryContractButton.setBorder(null);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				InquiryContractButton.setBorder(Constants.GRAY_BORDER);
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				Querycontrac();
			}
		});	
		
		//挂起进程按钮事件
		HangUpProcessButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				HangUpProcessButton.setBorder(null);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				HangUpProcessButton.setBorder(Constants.GRAY_BORDER);
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				dispose();
			}
		});
    }

	//返回至查询合同费用按钮处理事件
	private void Querycontrac() {
		super.setVisible(false);
		InquiryContract1_1600x900.getInstance();
	}
	
	/** 
     * 定义主面板窗口JPanel
     * @param JPanel 
	 * @return 
	 * @return 
     */  
	public static void DefinitionPanel(){ 
    	
		MainPanel = new JPanel() {
		//设置背景图片	
//		private static final long serialVersionUID = 1L;
//		  protected void paintComponent(Graphics g) {
//				super.paintComponent(g);
//				g.drawImage(PictureUtil.getPicture("HomePage.png").getImage(), 0, 0, null);
//				this.setOpaque(false);
//		  }
		};
		MainPanel.setLayout(null);
		MainPanel.setBorder(Constants.GRAY_BORDER);	
    } 

	/** 
     *定义分割线
     * @param JPanel 
	 * @return 
	 * @return 
     */  
	public static void DefinitionJLabel1(JLabel Label,String Value,int x,int y,int l,int w){ 
	
		Label = new JLabel(Value);
		Label.setBounds(x, y, l, w);
		Label.setFont(Constants.BASIC_FONT3);
		MainPanel.add(Label);
    }
	
	/** 
     * 定义文本Txt
     * @param JPanel 
	 * @return 
	 * @return 
     */  
	public static void DefinitionJLabel(JLabel Label,String Value,int x,int y,int l,int w){ 
	
		Label = new JLabel(Value+"：");
		Label.setBounds(x, y, l, w);
		Label.setFont(Constants.BASIC_FONT);
		MainPanel.add(Label);
    } 
	
	/** 
     * 定义输入框TextField
     * @param table 
	 * @return 
     */  
	public static Component DefinitionTextField(JTextField TextField,int x,int y,int l,int w,String Value){ 
    	 
    	TextField = new JTextField();
    	TextField.setBounds(x, y, l, w);
    	TextField.setBorder(Constants.LIGHT_GRAY_BORDER);
    	TextField.setText(Value);
    	TextField.setFont(Constants.BASIC_FONT6);
    	TextField.setForeground(Color.GRAY); 
    	MainPanel.add(TextField);
    	
    	return TextField;	 
    } 
	
	/** 
     * 定义输入框-焦点事件
     * @param table 
     */  
	public static void DefinitionTextFieldFocusAdapter(JTextField TextField,String Value){ 
    	 
		TextField.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				
				String Text = String.valueOf(TextField.getText());
				if (ApiHandler_1600x900.isEmpty(Text)) {
					TextField.setText(Value);
					TextField.setBorder(Constants.LIGHT_GRAY_BORDER);
				}	
			}
			@Override
			public void focusGained(FocusEvent e) {
				
				String Text = String.valueOf(TextField.getText());
				if (ApiHandler_1600x900.isEqual(Text,Value)) {
					TextField.setText("");
					TextField.setBorder(Constants.DARKGRAY_BORDER);
				}
			}	
		});
    }

	/** 
     * 定义数据展示窗口JScrollPane
     * @param JPanel 
	 * @return 
	 * @return 
     */  
	public static void DefinitionJScrollPane(int x,int y,int l,int w){ 
	
		DataDisplayList = new JScrollPane();
		DataDisplayList.setBounds(x, y, l, w);
		//设置背景是否透明
		DataDisplayList.setOpaque(false);  
		DataDisplayList.getViewport().setOpaque(false);  
		MainPanel.add(DataDisplayList);
    } 
	
	/** 
     * 定义按钮选项Button
     * @param table 
     */  
	public static Component DefinitionButton(JButton Button,int x,int y,int l,int w,String Value){ 
    	
    	Button = new JButton(Value);
    	Button.setBounds(x, y, l, w);
    	Button.setFont(Constants.BASIC_FONT6);
    	MainPanel.add(Button);
    	
		return Button;	
    }  

	/** 
     * 定义选项框Box 
	 * @param Value10 
	 * @param Value11 
	 * @param Value12 
	 * @param Value13 
	 * @param Value14 
	 * @param Value15 
	 * @param Value16 
	 * @param Value17 
     * @param table 
	 * @return 
	 * @return 
     */  
    @SuppressWarnings({ "rawtypes", "unchecked" })
	public static  void DefinitionBox(JComboBox Box,int x,int y,int l,int w, int ID,String Value,String Value1,String Value2,String Value3,String Value4,String Value5,String Value6,String Value7,String Value8,String Value9, String Value10, String Value11, String Value12, String Value13, String Value14, String Value15, 
			String Value16, String Value17, String Value18, String Value19, String Value20, String Value21, String Value22, String Value23, String Value24, String Value25, String Value26){ 
    	
    	Box = new JComboBox();
    	Box.setBounds(x, y, l, w);
    	Box.setFont(Constants.BASIC_FONT);
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
    	Box.addItem(Value10);
    	Box.addItem(Value11);
    	Box.addItem(Value12);
    	Box.addItem(Value13);
    	Box.addItem(Value14);
    	Box.addItem(Value15);
    	Box.addItem(Value16);
    	Box.addItem(Value17);
    	
    	Box.addItem(Value18);
    	Box.addItem(Value19);
    	Box.addItem(Value20);
    	Box.addItem(Value21);
    	Box.addItem(Value22);
    	Box.addItem(Value23);
    	Box.addItem(Value24);
    	Box.addItem(Value25);
    	Box.addItem(Value26);
    	Box.setVisible(true);
    	Box.setSelectedIndex(ID-1);
    	MainPanel.add(Box);
    	
//    	UserBoundStoreBox1 = new JComboBox();
//    	UserBoundStoreBox1.setBounds(160, 40, 152, 22);
//    	UserBoundStoreBox1.setFont(Constants.BASIC_FONT3);
//    	UserBoundStoreBox1.addItem("请获取商品门店...");    
//    	UserBoundStoreBox1.setSelectedIndex(0);
////    	UserBoundStoreBox.setVisible(true);
//    	MainPanel.add(UserBoundStoreBox1);
    	
//		return Box;
    }   
}
