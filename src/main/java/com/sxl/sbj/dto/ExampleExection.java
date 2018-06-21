package com.sxl.sbj.dto;

import com.sxl.sbj.entity.User;
import com.sxl.sbj.enums.ExampleStateEnum;

import java.util.List;

/**
 * @author SxL
 * Created on 6/6/2018 18:33.
 */
public class ExampleExection {
    /** 结果状态
     *
     */
    private int state;

    /** 状态标识
     *
     */
    private String stateInfo;

    /** 店铺数量
     *
     */
    private int count;

    /** 操作的实体
     *
     */
    private User user;

    /** 获取的实体列表
     *
     */
    private List<User> userList;

    public ExampleExection() {
    }

    /** 失败的构造器
     *
     * @param stateEnum 状态
     */
    public ExampleExection(ExampleStateEnum stateEnum) {
        this.state = stateEnum.getState();
        this.stateInfo = stateEnum.getStateInfo();
    }

    /** 成功的构造器
     *
     * @param stateEnum 状态
     * @param user 实体
     */
    public ExampleExection(ExampleStateEnum stateEnum, User user) {
        this.state = stateEnum.getState();
        this.stateInfo = stateEnum.getStateInfo();
        this.user = user;
    }

    /** 成功的构造器
     *
     * @param stateEnum 状态
     * @param userList 实体列表
     */
    public ExampleExection(ExampleStateEnum stateEnum, List<User> userList) {
        this.state = stateEnum.getState();
        this.stateInfo = stateEnum.getStateInfo();
        this.userList = userList;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getStateInfo() {
        return stateInfo;
    }

    public void setStateInfo(String stateInfo) {
        this.stateInfo = stateInfo;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }
}
