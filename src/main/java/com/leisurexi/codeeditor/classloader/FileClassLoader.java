package com.leisurexi.codeeditor.classloader;

import java.io.FileInputStream;

/**
 * @author: leisurexi
 * @date: 2020-02-02 10:35 上午
 * @description: 自定义类加载器，通过读取 class 文件去加载类
 * @since JDK 1.8
 */
public class FileClassLoader extends ClassLoader {

    /**
     * 根基文件地址加载类
     *
     * @param name class 文件的绝对地址
     * @return
     * @throws ClassNotFoundException
     */
    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        try (FileInputStream inputStream = new FileInputStream(name)) {
            if (inputStream == null) {
                return super.findClass(name);
            }
            byte[] bytes = new byte[inputStream.available()];
            inputStream.read(bytes);
            return defineClass(null, bytes, 0, bytes.length);
        } catch (Exception e) {
            throw new ClassNotFoundException(name);
        }
    }
}
