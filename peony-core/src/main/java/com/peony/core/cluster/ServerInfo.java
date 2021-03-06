package com.peony.core.cluster;

import com.alibaba.fastjson.JSONObject;
import com.peony.core.data.persistence.orm.annotation.DBEntity;

import java.io.Serializable;

/**
 * Created by a on 2016/8/31.
 * // TODO 变量命名需要修改
 */
@DBEntity(tableName = "serverinfo",pks = {"id"})
public class ServerInfo implements Serializable {
    private int id; // 服id，对应配置文件的serverId
    private String name; // 服名称
    private String innerHost; // 内网地址
    private String publicHost; // 外网地址
    private int netEventPort; // 网络事件端口
    private int requestPort; // 前端请求端口
    private int type; // 服务器类型，可以自定义

    private int accountCount; // 账号数量
    private int hot; // 火爆程度，根据最近的登陆情况计算
    private int state; // 状态 0不能用，1能用



    public ServerInfo(){

    }

    public JSONObject toJson(){
        JSONObject ret = new JSONObject();
        ret.put("id",id);
        ret.put("name",name);
        ret.put("innerHost",innerHost);
        ret.put("publicHost",publicHost);
        ret.put("netEventPort",netEventPort);
        ret.put("requestPort",requestPort);
        ret.put("type",type);
        ret.put("accountCount",accountCount);
        ret.put("hot",hot);
        ret.put("state",state);
        return ret;
    }
    public JSONObject toClientJson(){
        JSONObject ret = new JSONObject();
        ret.put("id",id);
        ret.put("publicHost",publicHost);
        ret.put("requestPort",requestPort);
        return ret;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id){
        this.id = id;
    }

    public int getId(){
        return this.id;
    }

    public String getInnerAddress(){
        return new StringBuilder(innerHost).append(":").append(netEventPort).toString();
    }

    @Override
    public String toString(){
        return new StringBuilder(innerHost).append(":").append(netEventPort).toString();
    }

    public String getHost() {
        return innerHost;
    }

    public void setHost(String host) {
        this.innerHost = host;
    }

    public String getPublicHost() {
        return publicHost;
    }

    public void setPublicHost(String publicHost) {
        this.publicHost = publicHost;
    }

    public int getNetEventPort() {
        return netEventPort;
    }

    public void setNetEventPort(int netEventPort) {
        this.netEventPort = netEventPort;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getRequestPort() {
        return requestPort;
    }

    public void setRequestPort(int requestPort) {
        this.requestPort = requestPort;
    }


    public String getInnerHost() {
        return innerHost;
    }

    public void setInnerHost(String innerHost) {
        this.innerHost = innerHost;
    }


    public int getAccountCount() {
        return accountCount;
    }

    public void setAccountCount(int accountCount) {
        this.accountCount = accountCount;
    }

    public int getHot() {
        return hot;
    }

    public void setHot(int hot) {
        this.hot = hot;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

}
