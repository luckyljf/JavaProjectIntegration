package com.ljf.jdbc;

import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @Author: ljf
 * @Create: 2021/12/18 20:57
 * @Description:
 **/
public class ThreadPoolExecutorInstance  {

    public static ThreadPoolExecutor getInstance(){

        ThreadPoolExecutor executor = new ThreadPoolExecutor(8,
                16,
                10,
                TimeUnit.SECONDS,
                new LinkedBlockingDeque<>(100000),
                Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.CallerRunsPolicy());

        return executor;

    }

}
