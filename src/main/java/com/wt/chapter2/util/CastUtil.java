package com.wt.chapter2.util;

import org.apache.commons.lang3.StringUtils;
import sun.swing.StringUIClientPropertyKey;

/**
 * 转型操作工具类
 */
public final class CastUtil {
    /**
     * 转为Stirng类型
     */
    public static String castString(Object obj){
        return CastUtil.castString(obj,"");
    }

    /**
     * 转为String类型（提供默认值）
     */
    public static String castString(Object obj,String defaultValue){
        return obj != null ? String.valueOf(obj):defaultValue;
    }

    /**
     * 转为double类型
     */
    public static Double castDouble(Object obj){
        return  CastUtil.castDouble(obj,0.0);
    }

    /**
     * 转为Double(提供默认值)
     */
    public static Double castDouble(Object obj,Double defaultValue){
        Double doubleValue=defaultValue;
        if(obj !=null){
            String stringValue =castString(obj);
            if(StringUtils.isNotEmpty(stringValue)){
                try{
                    doubleValue=Double.parseDouble(stringValue);
                }catch (NumberFormatException e){
                    doubleValue=defaultValue;
                }
            }
        }
        return doubleValue;
    }

    /**
     * 转为long类型
     */
    public static long castLong(Object obj){
        return  CastUtil.castLong(obj,0);
    }

    /**
     * 转为long(提供默认值)
     */
    public static long castLong(Object obj,long defaultValue){
        long longValue=defaultValue;
        if(obj !=null){
            String stringValue =castString(obj);
            if(StringUtils.isNotEmpty(stringValue)){
                try{
                    longValue=Long.parseLong(stringValue);
                }catch (NumberFormatException e){
                    longValue=defaultValue;
                }
            }
        }
        return longValue;
    }

    /**
     * 转为int类型
     */
    public static int castInt(Object obj){
        return  CastUtil.castInt(obj,0);
    }

    /**
     * 转为int类型(提供默认值)
     */
    public static int castInt(Object obj,int defaultValue){
        int intValue=defaultValue;
        if(obj !=null){
            String stringValue =castString(obj);
            if(StringUtils.isNotEmpty(stringValue)){
                try{
                    intValue=Integer.parseInt(stringValue);
                }catch (NumberFormatException e){
                    intValue=defaultValue;
                }
            }
        }
        return intValue;
    }

    /**
     * 转为boolean类型
     */
    public static boolean castBoolean(Object obj){
        return  CastUtil.castBoolean(obj,false);
    }

    /**
     * 转为boolean(提供默认值)
     */
    public static boolean castBoolean(Object obj,boolean defaultValue){
        boolean booleanValue=defaultValue;
        if(obj !=null){
            booleanValue=Boolean.parseBoolean(castString(obj));
        }
        return booleanValue;
    }

}
