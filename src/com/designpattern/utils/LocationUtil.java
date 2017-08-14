package com.designpattern.utils;

/**
 * 坐标工具类  -- 简单计算坐标间距
 * @author Json<<json1990@foxmail.com>>
 */
public class LocationUtil {
	//计算坐标之间的距离
    public static double getDistance(int x1,int y1,int x2,int y2){
        return Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
    }
}
