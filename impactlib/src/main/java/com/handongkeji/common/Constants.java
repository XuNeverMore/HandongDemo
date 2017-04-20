/**
 * ClassName: Constants.java
 * created on 2013-1-24
 * Copyrights 2013-1-24 hjgang All rights reserved.
 * site: http://t.qq.com/hjgang2012
 * email: hjgang@yahoo.cn
 */
package com.handongkeji.common;

import android.content.Context;

import java.io.File;

/**
 * @author chaiqingshan
 * @category 全局变量
 * @日期 2015-11-24
 * @时间 下午2:05:25
 * @年份 2015
 */
public final class Constants {

    /**
     * 本地缓存目录
     */
    public static String CACHE_DIR;
    /**
     * 图片缓存目录
     */
    public static String CACHE_DIR_IMAGE;
    /**
     * 待上传图片缓存目录
     */
    public static String CACHE_DIR_UPLOADING_IMG;
    /**
     * 图片目录
     */
    public static String CACHE_IMAGE;
    /**
     * 图片名称
     */
    public static final String PHOTO_PATH = "handongkeji_android_photo";
    /**
     * 语音缓存目录
     */
    public static String CACHE_VOICE;

    public static void init(Context context) {
        CACHE_DIR = context.getCacheDir().getAbsolutePath();
        File file = new File(CACHE_DIR, "image");
        file.mkdirs();
        CACHE_IMAGE = file.getAbsolutePath();
        CACHE_DIR_IMAGE = CACHE_IMAGE;
        file = new File(CACHE_DIR, "temp");
        file.mkdirs();
        CACHE_DIR_UPLOADING_IMG = file.getAbsolutePath();
        file = new File(CACHE_DIR, "voice");
        file.mkdirs();
        CACHE_VOICE = file.getAbsolutePath();

        file = new File(CACHE_DIR, "html");
        file.mkdirs();
        ENVIROMENT_DIR_CACHE = file.getAbsolutePath();
    }


    public static String ENVIROMENT_DIR_CACHE;

    private Constants() {

    }

    /**
     * 数据库版本号
     */
    public static final int DB_VERSION = 1;
    /**
     * 数据库名
     */
    public static final String DB_NAME = "android.db";

    /**
     * 与服务器端连接的协议名
     */
    public static final String PROTOCOL = "http://";
    /**
     * 服务器IP
     */
    public static final String HOST = "handongkeji.com";

    public static final String HOST2 = "www.handongkeji.com";
//    public static final String HOST2 = "192.168.1.241";
    /**
     * 服务器端口号
     */
    public static final String PORT2 = ":8090/xiaoweiqiye/";
//    public static final String PORT2 = ":80/xiaoweiqiye/";
    /**
     * 应用上下文完整路径
     */
    public static final String URL_CONTEXTPATH = PROTOCOL + HOST2 + PORT2;
//    public static String URL_CONTEXTPATH = "http://192.168.1.241:80/xiaoweiqiye/";
    //登录
    public static final String URL_LOGIN = URL_CONTEXTPATH +
            "mbuser/login.json";
    //获取验证码
    public static final String URL_GET_CODE = URL_CONTEXTPATH +
            "mbUserPer/getCode.json";
    //检查验证码
    public static final String URL_CHECK_CODE = URL_CONTEXTPATH +
            "mbUserPer/checkCode.json";
    //注册
    public static final String URL_REGISTER = URL_CONTEXTPATH +
            "mbuser/regSetPassword.json";
    //上传图片
    public static final String URL_UP_LOAD_IMG = URL_CONTEXTPATH +
            "tool/uploadAPI.json";

    //修改密码
    public static String ChangPassword = URL_CONTEXTPATH + "mbuser/auth/changePass.json";
    public static final int ChangPasswordSuccess = 3151313;

    //意见反馈
    public static String SaveFeedBAck = URL_CONTEXTPATH + "sysOpinionback/auth/saveSysOpinionback.json";
    public static final int SaveFeedBAckSuccess = 3151358;

    //收货地址
    public static String getShouHuoAddress = URL_CONTEXTPATH + "mbShoppingaddr/auth/getUserAddrList.json";
    public static final int getShouHuoAddressSuccess = 3151416;

    //保存收货地址
    public static String saveshopingAddress = URL_CONTEXTPATH + "mbShoppingaddr/auth/saveShoppingAddr.json";
    public static final int saveshopingAddressSuccess = 3151741;

    //修改手机号码
    public static final String URL_CHANGE_PHONE = URL_CONTEXTPATH +
            "mbuser/auth/updateUserMobile.json";
    public static String URL_FIND_PASSWORD = URL_CONTEXTPATH + "mbuser/forgotPassword.json";

    //修改个人信息
    public static final String URL_MODIFY_PERSONAL_INFORMATION = URL_CONTEXTPATH +
            "mbuser/auth/changeUserInfo.json";
    //设置
    public static final String URL_SET = URL_CONTEXTPATH +
            "mbuser/auth/systemSet.json";

    /**
     * 套餐列表
     */
    public static final String URL_PACKAGE_LIST = URL_CONTEXTPATH + "mixInfo/getMixList.json";

    public static String URL_delete_address = URL_CONTEXTPATH + "mbShoppingaddr/auth/delete.json";
    public static String auth_address = URL_CONTEXTPATH + "mbShoppingaddr/auth/updateShoppingAddr.json";
    public static final int auth_addresSuccess = 3161344;
    public static String Setmoren = URL_CONTEXTPATH + "mbShoppingaddr/auth/setAddrisDefault.json";

    //通过token获取用户信息和企业列表
    public static final String URL_GET_PERSONAL_INFORMATION = URL_CONTEXTPATH +
            "mbuser/getUserByToken.json";
    /**
     * 套餐详情
     */
    public static final String URL_PACKAGE_DETAIL = URL_CONTEXTPATH + "mixInfo/getMixByMixId.json";
    /**
     * 服务列表
     */
    public static final String URL_SERVICE_LIST = URL_CONTEXTPATH + "servInfo/getServList.json";
    /**
     * 服务详情
     */
    public static final String URL_SERVICE_DETAIL = URL_CONTEXTPATH + "servInfo/getServByServerId.json";


    //设置默认企业
    public static final String URL_SET_MO_REN_COMPANY = URL_CONTEXTPATH +
            "mbEnterprise/auth/setdefault.json";

    //通过企业ID获取企业信息
    public static final String URL_GET_COMPANY_INFO_BY_ID = URL_CONTEXTPATH +
            "mbEnterprise/auth/getEnterprise.json";

    //获取常见问题分类列表
    public static final String URL_GET_COMMON_PROBLEM_TYPE = URL_CONTEXTPATH +
            "sysProblemtype/getProblemtypeList.json";

    //获取某个类型的常见问题列表
    public static final String URL_GET_COMMON_PROBLEM_DETAIL = URL_CONTEXTPATH +
            "sysProblem/getProblemList.json";

    //获取优惠券列表
    public static final String URL_GET_YOU_HUI_QUAN = URL_CONTEXTPATH +
            "sysCoupon/auth/getCouponList.json";

    //增值税发票增量
    public static String saveAddinvoice = URL_CONTEXTPATH + "servAddinvoice/auth/saveAddinvoice.json";
    public static final int saveAddinvoiceSuccess = 3241342;

    //获取常见问题分类列表
    public static final String URL_CHANGE_COMPANY_NAME = URL_CONTEXTPATH +
            "servEditenterprise/auth/saveAddinvoice.json";

    public static String saveAddsocial = URL_CONTEXTPATH + "servAddsocial/auth/saveAddsocial.json";
    public static final int saveAddsocialSuccess = 3271617;
    /**
     * 申请开票服务
     */
    public static final String URL_SERVICE_KAIPIAO = URL_CONTEXTPATH + "servCreateinvoice/auth/saveCreateinvoice.json";

    //获取常见问题分类列表
    public static final String URL_GET_JING_YING_FAN_WEI = URL_CONTEXTPATH +
            "mbBusinessrange/getInessrangeList.json";


    /**
     * 服务分类
     */
    public static final String URL_SERVICE_SORT = URL_CONTEXTPATH + "servServertype/getServertypeList.json";
    /**
     * 变更法人
     */
    public static final String URL_CHANGE_LEGALER = URL_CONTEXTPATH + "servEditlegaler/auth/saveEditlegaler.json";

    public static String URL_Save_Reducesocial = URL_CONTEXTPATH + "servReducesocial/auth/saveReducesocial.json";
    public static final int Save_ReducesocialSuccess = 3291430;

    public static String URL_SAVE_HOSPITAL = URL_CONTEXTPATH + "servEdithospital/auth/saveEdithospital.json";

    //申请变更经营范围
    public static final String URL_CHANGE_SCOPE = URL_CONTEXTPATH +
            "servEditbusiness/auth/saveEditbusiness.json";

    //申请增加注册资金
    public static final String URL_ADD_SCOPE = URL_CONTEXTPATH +
            "servAddregcapital/auth/saveAddregcapital.json";
    /**
     * 发票作废
     */
    public static final String URL_SERVICE_ZUOFEI = URL_CONTEXTPATH + "servInvalidinvoice/auth/saveInvalidinvoice.json";
    /**
     * 发票退票
     */
    public static final String URL_SERVICE_TUIPIAO = URL_CONTEXTPATH + "servBackinvoice/auth/saveBackinvoice.json";
    /**
     * 服务广告
     */
    public static final String URL_SERVICE_ADVERTISEMENT = URL_CONTEXTPATH + "sysAd/getList.json";

    public static String URL_SAve_SHEBAOSS = URL_CONTEXTPATH + "servAppendsocial/auth/saveAppendsocial.json";

    public static String URL_SAve_SHEBAOSSs = URL_CONTEXTPATH + "servAppendsocialmore/auth/saveAppendsocialmore.json";

    //申请股权变更
    public static final String URL_CHANGE_GU_QUAN = URL_CONTEXTPATH +
            "servEditshare/auth/saveEditshare.json";

    //申请变更社保基数
    public static final String URL_CHANGE_SHE_BAO_JI_SHU = URL_CONTEXTPATH +
            "servEditradix/auth/saveServEditradix.json";

    //申请工伤一次性医疗补助金
    public static final String URL_YI_CI_XING_YI_LIAO_BU_ZHU_JIN = URL_CONTEXTPATH +
            "servOncehealth/auth/saveServOncehealth.json";

    //申请社保工伤医保工伤报销
    public static final String URL_GONG_SHANG_YI_BAO = URL_CONTEXTPATH +
            "servInjuryexpense/auth/saveServInjuryexpense.json";

    //申请社保生育医保报销
    public static final String URL_SHENG_YU_YI_BAO = URL_CONTEXTPATH +
            "servBirthexpense/auth/saveServInjuryexpense.json";

    //申请社保工伤一次性工伤待遇申领
    public static final String URL_YI_CI_XING_GONG_SHANG_DAI_YU = URL_CONTEXTPATH +
            "servOnceinjury/auth/saveServOnceinjury.json";

    //申请社保最后一人减员
    public static final String URL_ZUI_HOU_YI_REN_JIAN_YUAN = URL_CONTEXTPATH +
            "servLastman/auth/saveServLastman.json";

    //申请社保退休减员
    public static final String URL_TUI_XIU_JIAN_YUAN = URL_CONTEXTPATH +
            "servSocialretire/auth/saveServEditradix.json";

    public static String URL_SAVE_SERVHAND = URL_CONTEXTPATH +
            "servHandexpense/auth/saveServHandexpense.json";
    public static String URL_SAVE_SHENGYU = URL_CONTEXTPATH +
            "servBirthsocial/auth/saveServBirthsocial.json";

    public static String URL_SAVE_SERVEDIT = URL_CONTEXTPATH + "servEditsocial/auth/saveServEditsocial.json";
    //本月收支
    public static final String URL_BENYUE_SHOUZHI = URL_CONTEXTPATH +"mbRevenue/auth/getNowRevenue.json";
    /**
     * 申请记账
     */
    public static final String URL_SERVICE_JIZHANG = URL_CONTEXTPATH +"servRecordbill/auth/saveRecordbill.json";
    //申请社保变更民族
    public static final String URL_CHANGE_NATIONAL = URL_CONTEXTPATH +
            "servEditethnic/auth/saveServEditethnic.json";

    //申请社保变更姓名
    public static final String URL_CHANGE_NAME = URL_CONTEXTPATH +
            "servEditname/auth/saveServEditname.json";
    /**
     * 工商首年
     */
    public static final String URL_PACKAGE_GSSN=URL_CONTEXTPATH +"servRegenterprise/auth/saveRegenterprise.json";

    public static String URL_SAVE_SERVEREDIT = URL_CONTEXTPATH + "servEditidentity/auth/saveServEditidentity.json";
    //企业本月收支信息
    public static final String URL_CURRENT_MONTH_INFO = URL_CONTEXTPATH +
            "mbRevenue/auth/getNowRevenue.json";

    //企业历史收支信息
    public static final String URL_HISTORY_MONTH_INFO = URL_CONTEXTPATH +
            "mbRevenue/auth/getAllRevenue.json";
    /**
     * 服务是否有剩余次数
     */
    public static final String URL_USE_PERMISSION = URL_CONTEXTPATH +"mixUsermixserver/auth/getUsermixserver.json";

    //提交订单
    public static final String URL_SUBMIT_ORDER = URL_CONTEXTPATH +
            "busOrder/auth/saveOrder.json";

    //订单列表
    public static final String URL_ORDER_LIST = URL_CONTEXTPATH +
            "busOrder/auth/getOrderList.json";

    //订单详情
    public static final String URL_ORDER_DETAIL = URL_CONTEXTPATH +
            "busOrder/auth/getOrderByOrderId.json";

    public static String URL_QUERYTUIJIAN = URL_CONTEXTPATH+"/sysRecommend/auth/getRecommendprice.json";

    //支付宝支付utl
    public static String Alipay2 ="";

    //支付宝支付checkstatus
    public static String checkstatus ="";

    //微信支付url
    public static String wxUrl = "";
    public static final String URL_SERVICE_SHIYEJIN = URL_CONTEXTPATH+"servJobless/auth/saveServJobless.json";

    public static final String URL_NEW_CANTONG=URL_CONTEXTPATH+"servCreatesocial/auth/saveServCreatesocial.json";

    public static final String URL_GET_RECOMMEND_CODE = URL_CONTEXTPATH+"sysRecommend/auth/getRecommendprice.json";

    //订单数量
    public static final String URL_ORDER_NUM = URL_CONTEXTPATH+
            "busOrder/auth/getOrderNum.json";

    //取消订单
    public static final String URL_CANCLE_ORDER = URL_CONTEXTPATH+
            "busOrder/auth/delOrderByOrderId.json";

}
