package com.ljf.jdbc;

import java.sql.*;
import java.util.Random;
import java.util.UUID;

/**
 * @Author: ljf
 * @Create: 2021/12/18 21:46
 * @Description: 插入一千万数据到user_info_ten_million
 **/
public class InsertUserInfoTenMillionByJdbcRunnable implements Runnable{
    // 插入数据

    String url = "jdbc:mysql://124.70.176.95:3306/ljf?useUnicode=true&characterEncoding=UTF-8&rewriteBatchedStatements=true";
    String name = "com.mysql.jdbc.Driver";
    String user = "root";
    String password = "123456";
    Connection conn = null;
    PreparedStatement pstm =null;
    ResultSet rt = null;

    @Override
    public void run() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url, user, password);

            String sql = "INSERT INTO user_info_ten_million(user_name,age,sex,phone,uuid,address,id_desc,integral,describes,dept_id,label,create_time,update_time,delete_flag) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            pstm = conn.prepareStatement(sql);

            for (int i = 0; i < 10000; i++) {
                pstm.setString(1, Util.getStrName());
                pstm.setInt   (2, new Random().nextInt(100));
                pstm.setString(3, i%2==0?"男":"女");
                pstm.setString(4, Util.getPhone());
                pstm.setString(5, UUID.randomUUID().toString());
                pstm.setString(6, Util.getStr2());
                pstm.setInt   (7, -1);
                pstm.setInt   (8, Util.getIntegral());
                pstm.setString(9, Util.getStr());
                if (i<=500){
                    pstm.setInt(10, 1);
                }else if (i > 500 && i<=3000){
                    pstm.setInt(10, 2);
                } else if (i > 3000 && i <= 6000){
                    pstm.setInt(10, 3);
                }else if (i > 6000 && i<=8000){
                    pstm.setInt(10, 4);
                }else if (i > 8000 && i<=10000){
                    pstm.setInt(10, 5);
                }else{
                    pstm.setInt(10, 6);
                }
                pstm.setString(11, Util.getLabel());
                pstm.setDate(12, new Date(new java.util.Date().getTime()));
                pstm.setDate(13, new Date(new java.util.Date().getTime()));
                pstm.setInt(14, 0);
                pstm.addBatch();
            }
            pstm.executeBatch();

        }catch (Exception e){
            e.printStackTrace();
        }finally{
            if(pstm!=null){
                try {
                    pstm.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                    throw new RuntimeException(e);
                }
            }
            if(conn!=null){
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                    throw new RuntimeException(e);
                }
            }
        }

    }
}
