package com.dail.miaosha.model;

import java.io.Serializable;
import java.util.Date;

/**
 * seckill_scene_goods
 * @author 
 */
public class SeckillSceneGoods implements Serializable {
    /**
     * 主键
     */
    private Long id;

    /**
     * 秒杀商品id
     */
    private Long seckillGoodsId;

    /**
     * 秒杀场次id
     */
    private Long seckillSceneId;

    /**
     * 操作人
     */
    private String creator;

    /**
     * 操作时间
     */
    private Date gmtCreated;

    /**
     * 最后修改人
     */
    private String modifier;

    /**
     * 最后修改时间
     */
    private Date gmtModified;

    /**
     * N正常,Y删除
     */
    private String isDeleted;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getSeckillGoodsId() {
        return seckillGoodsId;
    }

    public void setSeckillGoodsId(Long seckillGoodsId) {
        this.seckillGoodsId = seckillGoodsId;
    }

    public Long getSeckillSceneId() {
        return seckillSceneId;
    }

    public void setSeckillSceneId(Long seckillSceneId) {
        this.seckillSceneId = seckillSceneId;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public Date getGmtCreated() {
        return gmtCreated;
    }

    public void setGmtCreated(Date gmtCreated) {
        this.gmtCreated = gmtCreated;
    }

    public String getModifier() {
        return modifier;
    }

    public void setModifier(String modifier) {
        this.modifier = modifier;
    }

    public Date getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    public String getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(String isDeleted) {
        this.isDeleted = isDeleted;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        SeckillSceneGoods other = (SeckillSceneGoods) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getSeckillGoodsId() == null ? other.getSeckillGoodsId() == null : this.getSeckillGoodsId().equals(other.getSeckillGoodsId()))
            && (this.getSeckillSceneId() == null ? other.getSeckillSceneId() == null : this.getSeckillSceneId().equals(other.getSeckillSceneId()))
            && (this.getCreator() == null ? other.getCreator() == null : this.getCreator().equals(other.getCreator()))
            && (this.getGmtCreated() == null ? other.getGmtCreated() == null : this.getGmtCreated().equals(other.getGmtCreated()))
            && (this.getModifier() == null ? other.getModifier() == null : this.getModifier().equals(other.getModifier()))
            && (this.getGmtModified() == null ? other.getGmtModified() == null : this.getGmtModified().equals(other.getGmtModified()))
            && (this.getIsDeleted() == null ? other.getIsDeleted() == null : this.getIsDeleted().equals(other.getIsDeleted()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getSeckillGoodsId() == null) ? 0 : getSeckillGoodsId().hashCode());
        result = prime * result + ((getSeckillSceneId() == null) ? 0 : getSeckillSceneId().hashCode());
        result = prime * result + ((getCreator() == null) ? 0 : getCreator().hashCode());
        result = prime * result + ((getGmtCreated() == null) ? 0 : getGmtCreated().hashCode());
        result = prime * result + ((getModifier() == null) ? 0 : getModifier().hashCode());
        result = prime * result + ((getGmtModified() == null) ? 0 : getGmtModified().hashCode());
        result = prime * result + ((getIsDeleted() == null) ? 0 : getIsDeleted().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", seckillGoodsId=").append(seckillGoodsId);
        sb.append(", seckillSceneId=").append(seckillSceneId);
        sb.append(", creator=").append(creator);
        sb.append(", gmtCreated=").append(gmtCreated);
        sb.append(", modifier=").append(modifier);
        sb.append(", gmtModified=").append(gmtModified);
        sb.append(", isDeleted=").append(isDeleted);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}