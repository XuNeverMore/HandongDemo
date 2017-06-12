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


}
