package com.handongkeji.utils;

import com.google.gson.Gson;
import com.google.gson.JsonElement;

import java.io.Reader;
import java.lang.reflect.Type;

/**
 * Created by Administrator on 2016/11/1.
 */
public class GsonUtils {

    private static Gson gson = new Gson();

    public static <T> T fromJson(String json, Class clazz) {
        return (T) fromJson(json, (Type) clazz);
    }

    public static <T> T fromJson(String json, Type type) {
        return (T) gson.fromJson(json, type);
    }

    public static <T> T fromJson(Reader reader, Class clazz){
        return (T) gson.fromJson(reader,clazz);
    }

    public static <T> T fromJson(Reader reader, Type type){
        return (T)gson.fromJson(reader,type);
    }

    public static JsonElement toJson(Object object, Type typeOfSrc){
        return gson.toJsonTree(object, typeOfSrc);
    }

    public static String toJson(Object o){
        return gson.toJson(o);
    }
}
