package com.ljf.jdbc;

import java.util.concurrent.ThreadPoolExecutor;

/**
 * @Author: ljf
 * @Create: 2022/3/15 19:18
 * @Description:
 **/
public class InsertData {

    public static void main(String[] args) {
        // 插入500万数据
/*        ThreadPoolExecutor executor = ThreadPoolExecutorInstance.getInstance();
        for (int i = 0; i <= 500; i++) {
            executor.execute(new InsertUserInfoByJdbcRunnable());
        }
        System.out.println("hep");*/


        // 插入一千万数据
        ThreadPoolExecutor executor = ThreadPoolExecutorInstance.getInstance();
        for (int i = 0; i <= 1000; i++) {
            executor.execute(new InsertUserInfoTenMillionByJdbcRunnable());
        }
        System.out.println("hep");



    }
}
