package com.chenwt.excel;

/**
 * @class：TestData
 * @campany：zkzj
 * @author: chenwt
 * @date:2019-08-05 15:32
 * @description: 测试数据bean
 */
public class TestData {
    private int id ;
    private int p_id ;
    private String name ;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getP_id() {
        return p_id;
    }
    public void setP_id(int p_id) {
        this.p_id = p_id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public TestData(int id, int p_id, String name) {
        super();
        this.id = id;
        this.p_id = p_id;
        this.name = name;
    }
}
