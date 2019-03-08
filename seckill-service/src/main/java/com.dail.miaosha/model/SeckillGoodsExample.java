package com.dail.miaosha.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SeckillGoodsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SeckillGoodsExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIsNull() {
            addCriterion("goods_id is null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIsNotNull() {
            addCriterion("goods_id is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdEqualTo(Long value) {
            addCriterion("goods_id =", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotEqualTo(Long value) {
            addCriterion("goods_id <>", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThan(Long value) {
            addCriterion("goods_id >", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThanOrEqualTo(Long value) {
            addCriterion("goods_id >=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThan(Long value) {
            addCriterion("goods_id <", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThanOrEqualTo(Long value) {
            addCriterion("goods_id <=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIn(List<Long> values) {
            addCriterion("goods_id in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotIn(List<Long> values) {
            addCriterion("goods_id not in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdBetween(Long value1, Long value2) {
            addCriterion("goods_id between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotBetween(Long value1, Long value2) {
            addCriterion("goods_id not between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andSeckillSceneIdIsNull() {
            addCriterion("seckill_scene_id is null");
            return (Criteria) this;
        }

        public Criteria andSeckillSceneIdIsNotNull() {
            addCriterion("seckill_scene_id is not null");
            return (Criteria) this;
        }

        public Criteria andSeckillSceneIdEqualTo(Long value) {
            addCriterion("seckill_scene_id =", value, "seckillSceneId");
            return (Criteria) this;
        }

        public Criteria andSeckillSceneIdNotEqualTo(Long value) {
            addCriterion("seckill_scene_id <>", value, "seckillSceneId");
            return (Criteria) this;
        }

        public Criteria andSeckillSceneIdGreaterThan(Long value) {
            addCriterion("seckill_scene_id >", value, "seckillSceneId");
            return (Criteria) this;
        }

        public Criteria andSeckillSceneIdGreaterThanOrEqualTo(Long value) {
            addCriterion("seckill_scene_id >=", value, "seckillSceneId");
            return (Criteria) this;
        }

        public Criteria andSeckillSceneIdLessThan(Long value) {
            addCriterion("seckill_scene_id <", value, "seckillSceneId");
            return (Criteria) this;
        }

        public Criteria andSeckillSceneIdLessThanOrEqualTo(Long value) {
            addCriterion("seckill_scene_id <=", value, "seckillSceneId");
            return (Criteria) this;
        }

        public Criteria andSeckillSceneIdIn(List<Long> values) {
            addCriterion("seckill_scene_id in", values, "seckillSceneId");
            return (Criteria) this;
        }

        public Criteria andSeckillSceneIdNotIn(List<Long> values) {
            addCriterion("seckill_scene_id not in", values, "seckillSceneId");
            return (Criteria) this;
        }

        public Criteria andSeckillSceneIdBetween(Long value1, Long value2) {
            addCriterion("seckill_scene_id between", value1, value2, "seckillSceneId");
            return (Criteria) this;
        }

        public Criteria andSeckillSceneIdNotBetween(Long value1, Long value2) {
            addCriterion("seckill_scene_id not between", value1, value2, "seckillSceneId");
            return (Criteria) this;
        }

        public Criteria andSeckillGoodsPriceIsNull() {
            addCriterion("seckill_goods_price is null");
            return (Criteria) this;
        }

        public Criteria andSeckillGoodsPriceIsNotNull() {
            addCriterion("seckill_goods_price is not null");
            return (Criteria) this;
        }

        public Criteria andSeckillGoodsPriceEqualTo(Long value) {
            addCriterion("seckill_goods_price =", value, "seckillGoodsPrice");
            return (Criteria) this;
        }

        public Criteria andSeckillGoodsPriceNotEqualTo(Long value) {
            addCriterion("seckill_goods_price <>", value, "seckillGoodsPrice");
            return (Criteria) this;
        }

        public Criteria andSeckillGoodsPriceGreaterThan(Long value) {
            addCriterion("seckill_goods_price >", value, "seckillGoodsPrice");
            return (Criteria) this;
        }

        public Criteria andSeckillGoodsPriceGreaterThanOrEqualTo(Long value) {
            addCriterion("seckill_goods_price >=", value, "seckillGoodsPrice");
            return (Criteria) this;
        }

        public Criteria andSeckillGoodsPriceLessThan(Long value) {
            addCriterion("seckill_goods_price <", value, "seckillGoodsPrice");
            return (Criteria) this;
        }

        public Criteria andSeckillGoodsPriceLessThanOrEqualTo(Long value) {
            addCriterion("seckill_goods_price <=", value, "seckillGoodsPrice");
            return (Criteria) this;
        }

        public Criteria andSeckillGoodsPriceIn(List<Long> values) {
            addCriterion("seckill_goods_price in", values, "seckillGoodsPrice");
            return (Criteria) this;
        }

        public Criteria andSeckillGoodsPriceNotIn(List<Long> values) {
            addCriterion("seckill_goods_price not in", values, "seckillGoodsPrice");
            return (Criteria) this;
        }

        public Criteria andSeckillGoodsPriceBetween(Long value1, Long value2) {
            addCriterion("seckill_goods_price between", value1, value2, "seckillGoodsPrice");
            return (Criteria) this;
        }

        public Criteria andSeckillGoodsPriceNotBetween(Long value1, Long value2) {
            addCriterion("seckill_goods_price not between", value1, value2, "seckillGoodsPrice");
            return (Criteria) this;
        }

        public Criteria andSeckillGoodsStockIsNull() {
            addCriterion("seckill_goods_stock is null");
            return (Criteria) this;
        }

        public Criteria andSeckillGoodsStockIsNotNull() {
            addCriterion("seckill_goods_stock is not null");
            return (Criteria) this;
        }

        public Criteria andSeckillGoodsStockEqualTo(Long value) {
            addCriterion("seckill_goods_stock =", value, "seckillGoodsStock");
            return (Criteria) this;
        }

        public Criteria andSeckillGoodsStockNotEqualTo(Long value) {
            addCriterion("seckill_goods_stock <>", value, "seckillGoodsStock");
            return (Criteria) this;
        }

        public Criteria andSeckillGoodsStockGreaterThan(Long value) {
            addCriterion("seckill_goods_stock >", value, "seckillGoodsStock");
            return (Criteria) this;
        }

        public Criteria andSeckillGoodsStockGreaterThanOrEqualTo(Long value) {
            addCriterion("seckill_goods_stock >=", value, "seckillGoodsStock");
            return (Criteria) this;
        }

        public Criteria andSeckillGoodsStockLessThan(Long value) {
            addCriterion("seckill_goods_stock <", value, "seckillGoodsStock");
            return (Criteria) this;
        }

        public Criteria andSeckillGoodsStockLessThanOrEqualTo(Long value) {
            addCriterion("seckill_goods_stock <=", value, "seckillGoodsStock");
            return (Criteria) this;
        }

        public Criteria andSeckillGoodsStockIn(List<Long> values) {
            addCriterion("seckill_goods_stock in", values, "seckillGoodsStock");
            return (Criteria) this;
        }

        public Criteria andSeckillGoodsStockNotIn(List<Long> values) {
            addCriterion("seckill_goods_stock not in", values, "seckillGoodsStock");
            return (Criteria) this;
        }

        public Criteria andSeckillGoodsStockBetween(Long value1, Long value2) {
            addCriterion("seckill_goods_stock between", value1, value2, "seckillGoodsStock");
            return (Criteria) this;
        }

        public Criteria andSeckillGoodsStockNotBetween(Long value1, Long value2) {
            addCriterion("seckill_goods_stock not between", value1, value2, "seckillGoodsStock");
            return (Criteria) this;
        }

        public Criteria andSeckillTotalStockIsNull() {
            addCriterion("seckill_total_stock is null");
            return (Criteria) this;
        }

        public Criteria andSeckillTotalStockIsNotNull() {
            addCriterion("seckill_total_stock is not null");
            return (Criteria) this;
        }

        public Criteria andSeckillTotalStockEqualTo(Long value) {
            addCriterion("seckill_total_stock =", value, "seckillTotalStock");
            return (Criteria) this;
        }

        public Criteria andSeckillTotalStockNotEqualTo(Long value) {
            addCriterion("seckill_total_stock <>", value, "seckillTotalStock");
            return (Criteria) this;
        }

        public Criteria andSeckillTotalStockGreaterThan(Long value) {
            addCriterion("seckill_total_stock >", value, "seckillTotalStock");
            return (Criteria) this;
        }

        public Criteria andSeckillTotalStockGreaterThanOrEqualTo(Long value) {
            addCriterion("seckill_total_stock >=", value, "seckillTotalStock");
            return (Criteria) this;
        }

        public Criteria andSeckillTotalStockLessThan(Long value) {
            addCriterion("seckill_total_stock <", value, "seckillTotalStock");
            return (Criteria) this;
        }

        public Criteria andSeckillTotalStockLessThanOrEqualTo(Long value) {
            addCriterion("seckill_total_stock <=", value, "seckillTotalStock");
            return (Criteria) this;
        }

        public Criteria andSeckillTotalStockIn(List<Long> values) {
            addCriterion("seckill_total_stock in", values, "seckillTotalStock");
            return (Criteria) this;
        }

        public Criteria andSeckillTotalStockNotIn(List<Long> values) {
            addCriterion("seckill_total_stock not in", values, "seckillTotalStock");
            return (Criteria) this;
        }

        public Criteria andSeckillTotalStockBetween(Long value1, Long value2) {
            addCriterion("seckill_total_stock between", value1, value2, "seckillTotalStock");
            return (Criteria) this;
        }

        public Criteria andSeckillTotalStockNotBetween(Long value1, Long value2) {
            addCriterion("seckill_total_stock not between", value1, value2, "seckillTotalStock");
            return (Criteria) this;
        }

        public Criteria andCreatorIsNull() {
            addCriterion("creator is null");
            return (Criteria) this;
        }

        public Criteria andCreatorIsNotNull() {
            addCriterion("creator is not null");
            return (Criteria) this;
        }

        public Criteria andCreatorEqualTo(String value) {
            addCriterion("creator =", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotEqualTo(String value) {
            addCriterion("creator <>", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThan(String value) {
            addCriterion("creator >", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThanOrEqualTo(String value) {
            addCriterion("creator >=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThan(String value) {
            addCriterion("creator <", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThanOrEqualTo(String value) {
            addCriterion("creator <=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLike(String value) {
            addCriterion("creator like", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotLike(String value) {
            addCriterion("creator not like", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorIn(List<String> values) {
            addCriterion("creator in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotIn(List<String> values) {
            addCriterion("creator not in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorBetween(String value1, String value2) {
            addCriterion("creator between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotBetween(String value1, String value2) {
            addCriterion("creator not between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andGmtCreatedIsNull() {
            addCriterion("gmt_created is null");
            return (Criteria) this;
        }

        public Criteria andGmtCreatedIsNotNull() {
            addCriterion("gmt_created is not null");
            return (Criteria) this;
        }

        public Criteria andGmtCreatedEqualTo(Date value) {
            addCriterion("gmt_created =", value, "gmtCreated");
            return (Criteria) this;
        }

        public Criteria andGmtCreatedNotEqualTo(Date value) {
            addCriterion("gmt_created <>", value, "gmtCreated");
            return (Criteria) this;
        }

        public Criteria andGmtCreatedGreaterThan(Date value) {
            addCriterion("gmt_created >", value, "gmtCreated");
            return (Criteria) this;
        }

        public Criteria andGmtCreatedGreaterThanOrEqualTo(Date value) {
            addCriterion("gmt_created >=", value, "gmtCreated");
            return (Criteria) this;
        }

        public Criteria andGmtCreatedLessThan(Date value) {
            addCriterion("gmt_created <", value, "gmtCreated");
            return (Criteria) this;
        }

        public Criteria andGmtCreatedLessThanOrEqualTo(Date value) {
            addCriterion("gmt_created <=", value, "gmtCreated");
            return (Criteria) this;
        }

        public Criteria andGmtCreatedIn(List<Date> values) {
            addCriterion("gmt_created in", values, "gmtCreated");
            return (Criteria) this;
        }

        public Criteria andGmtCreatedNotIn(List<Date> values) {
            addCriterion("gmt_created not in", values, "gmtCreated");
            return (Criteria) this;
        }

        public Criteria andGmtCreatedBetween(Date value1, Date value2) {
            addCriterion("gmt_created between", value1, value2, "gmtCreated");
            return (Criteria) this;
        }

        public Criteria andGmtCreatedNotBetween(Date value1, Date value2) {
            addCriterion("gmt_created not between", value1, value2, "gmtCreated");
            return (Criteria) this;
        }

        public Criteria andModifierIsNull() {
            addCriterion("modifier is null");
            return (Criteria) this;
        }

        public Criteria andModifierIsNotNull() {
            addCriterion("modifier is not null");
            return (Criteria) this;
        }

        public Criteria andModifierEqualTo(String value) {
            addCriterion("modifier =", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotEqualTo(String value) {
            addCriterion("modifier <>", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierGreaterThan(String value) {
            addCriterion("modifier >", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierGreaterThanOrEqualTo(String value) {
            addCriterion("modifier >=", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierLessThan(String value) {
            addCriterion("modifier <", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierLessThanOrEqualTo(String value) {
            addCriterion("modifier <=", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierLike(String value) {
            addCriterion("modifier like", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotLike(String value) {
            addCriterion("modifier not like", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierIn(List<String> values) {
            addCriterion("modifier in", values, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotIn(List<String> values) {
            addCriterion("modifier not in", values, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierBetween(String value1, String value2) {
            addCriterion("modifier between", value1, value2, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotBetween(String value1, String value2) {
            addCriterion("modifier not between", value1, value2, "modifier");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIsNull() {
            addCriterion("gmt_modified is null");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIsNotNull() {
            addCriterion("gmt_modified is not null");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedEqualTo(Date value) {
            addCriterion("gmt_modified =", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotEqualTo(Date value) {
            addCriterion("gmt_modified <>", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedGreaterThan(Date value) {
            addCriterion("gmt_modified >", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedGreaterThanOrEqualTo(Date value) {
            addCriterion("gmt_modified >=", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedLessThan(Date value) {
            addCriterion("gmt_modified <", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedLessThanOrEqualTo(Date value) {
            addCriterion("gmt_modified <=", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIn(List<Date> values) {
            addCriterion("gmt_modified in", values, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotIn(List<Date> values) {
            addCriterion("gmt_modified not in", values, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedBetween(Date value1, Date value2) {
            addCriterion("gmt_modified between", value1, value2, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotBetween(Date value1, Date value2) {
            addCriterion("gmt_modified not between", value1, value2, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIsNull() {
            addCriterion("is_deleted is null");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIsNotNull() {
            addCriterion("is_deleted is not null");
            return (Criteria) this;
        }

        public Criteria andIsDeletedEqualTo(String value) {
            addCriterion("is_deleted =", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotEqualTo(String value) {
            addCriterion("is_deleted <>", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedGreaterThan(String value) {
            addCriterion("is_deleted >", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedGreaterThanOrEqualTo(String value) {
            addCriterion("is_deleted >=", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedLessThan(String value) {
            addCriterion("is_deleted <", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedLessThanOrEqualTo(String value) {
            addCriterion("is_deleted <=", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedLike(String value) {
            addCriterion("is_deleted like", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotLike(String value) {
            addCriterion("is_deleted not like", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIn(List<String> values) {
            addCriterion("is_deleted in", values, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotIn(List<String> values) {
            addCriterion("is_deleted not in", values, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedBetween(String value1, String value2) {
            addCriterion("is_deleted between", value1, value2, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotBetween(String value1, String value2) {
            addCriterion("is_deleted not between", value1, value2, "isDeleted");
            return (Criteria) this;
        }
    }

    /**
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}