package com.leisurexi.codeeditor.util;

import org.springframework.util.ResourceUtils;

import java.io.FileNotFoundException;

/**
 * @author: leisurexi
 * @date: 2020-02-02 10:11 上午
 * @description:
 * @since JDK 1.8
 */
public class ResourceUtil {

    /**
     * 获取 resources 文件夹下的绝对路径
     *
     * @param dirName 子文件夹名称
     * @return
     */
    public static String getUrl(String dirName) {
        String path = null;
        try {
            path = ResourceUtils.getURL("classpath:" + dirName).getPath();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return path;
    }

}
