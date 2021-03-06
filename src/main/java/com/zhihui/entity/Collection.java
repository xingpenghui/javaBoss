package com.zhihui.entity;

import java.util.Date;
import java.util.List;

public class Collection {
    private Integer id;

    private Date collectiontime;

    private Integer gid;

    private Integer sid;

    private Integer uid;

    //增加映射字段
    private User user;
    private List<Goods> goods;
    private List<Goodsimgs> goodsimgs;

    public List<Goods> getGoods() {
        return goods;
    }

    public void setGoods(List<Goods> goods) {
        this.goods = goods;
    }

    public List<Goodsimgs> getGoodsimgs() {
        return goodsimgs;
    }

    public void setGoodsimgs(List<Goodsimgs> goodsimgs) {
        this.goodsimgs = goodsimgs;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getCollectiontime() {
        return collectiontime;
    }

    public void setCollectiontime(Date collectiontime) {
        this.collectiontime = collectiontime;
    }

    public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
        this.gid = gid;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }
}