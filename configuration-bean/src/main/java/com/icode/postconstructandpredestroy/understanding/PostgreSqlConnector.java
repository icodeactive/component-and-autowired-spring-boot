package com.icode.postconstructandpredestroy.understanding;

public class PostgreSqlConnector extends DatabaseConnector {

    @Override
    public void connect() {
        System.out.println("Đã kết nối tới Postgresql: " + getUrl());
    }

}
