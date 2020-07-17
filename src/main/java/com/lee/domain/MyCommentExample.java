package com.lee.domain;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class MyCommentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MyCommentExample() {
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
        protected List<Criterion> myCommentPublishTimeCriteria;

        protected List<Criterion> allCriteria;

        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
            myCommentPublishTimeCriteria = new ArrayList<Criterion>();
        }

        public List<Criterion> getMyCommentPublishTimeCriteria() {
            return myCommentPublishTimeCriteria;
        }

        protected void addMyCommentPublishTimeCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            myCommentPublishTimeCriteria.add(new Criterion(condition, value, "org.apache.ibatis.type.LocalDateTimeTypeHandler"));
            allCriteria = null;
        }

        protected void addMyCommentPublishTimeCriterion(String condition, LocalDateTime value1, LocalDateTime value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            myCommentPublishTimeCriteria.add(new Criterion(condition, value1, value2, "org.apache.ibatis.type.LocalDateTimeTypeHandler"));
            allCriteria = null;
        }

        public boolean isValid() {
            return criteria.size() > 0
                || myCommentPublishTimeCriteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            if (allCriteria == null) {
                allCriteria = new ArrayList<Criterion>();
                allCriteria.addAll(criteria);
                allCriteria.addAll(myCommentPublishTimeCriteria);
            }
            return allCriteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
            allCriteria = null;
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
            allCriteria = null;
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
            allCriteria = null;
        }

        public Criteria andMycommentIdIsNull() {
            addCriterion("mycomment_id is null");
            return (Criteria) this;
        }

        public Criteria andMycommentIdIsNotNull() {
            addCriterion("mycomment_id is not null");
            return (Criteria) this;
        }

        public Criteria andMycommentIdEqualTo(Integer value) {
            addCriterion("mycomment_id =", value, "mycommentId");
            return (Criteria) this;
        }

        public Criteria andMycommentIdNotEqualTo(Integer value) {
            addCriterion("mycomment_id <>", value, "mycommentId");
            return (Criteria) this;
        }

        public Criteria andMycommentIdGreaterThan(Integer value) {
            addCriterion("mycomment_id >", value, "mycommentId");
            return (Criteria) this;
        }

        public Criteria andMycommentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("mycomment_id >=", value, "mycommentId");
            return (Criteria) this;
        }

        public Criteria andMycommentIdLessThan(Integer value) {
            addCriterion("mycomment_id <", value, "mycommentId");
            return (Criteria) this;
        }

        public Criteria andMycommentIdLessThanOrEqualTo(Integer value) {
            addCriterion("mycomment_id <=", value, "mycommentId");
            return (Criteria) this;
        }

        public Criteria andMycommentIdIn(List<Integer> values) {
            addCriterion("mycomment_id in", values, "mycommentId");
            return (Criteria) this;
        }

        public Criteria andMycommentIdNotIn(List<Integer> values) {
            addCriterion("mycomment_id not in", values, "mycommentId");
            return (Criteria) this;
        }

        public Criteria andMycommentIdBetween(Integer value1, Integer value2) {
            addCriterion("mycomment_id between", value1, value2, "mycommentId");
            return (Criteria) this;
        }

        public Criteria andMycommentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("mycomment_id not between", value1, value2, "mycommentId");
            return (Criteria) this;
        }

        public Criteria andMycommentContentIsNull() {
            addCriterion("mycomment_content is null");
            return (Criteria) this;
        }

        public Criteria andMycommentContentIsNotNull() {
            addCriterion("mycomment_content is not null");
            return (Criteria) this;
        }

        public Criteria andMycommentContentEqualTo(String value) {
            addCriterion("mycomment_content =", value, "mycommentContent");
            return (Criteria) this;
        }

        public Criteria andMycommentContentNotEqualTo(String value) {
            addCriterion("mycomment_content <>", value, "mycommentContent");
            return (Criteria) this;
        }

        public Criteria andMycommentContentGreaterThan(String value) {
            addCriterion("mycomment_content >", value, "mycommentContent");
            return (Criteria) this;
        }

        public Criteria andMycommentContentGreaterThanOrEqualTo(String value) {
            addCriterion("mycomment_content >=", value, "mycommentContent");
            return (Criteria) this;
        }

        public Criteria andMycommentContentLessThan(String value) {
            addCriterion("mycomment_content <", value, "mycommentContent");
            return (Criteria) this;
        }

        public Criteria andMycommentContentLessThanOrEqualTo(String value) {
            addCriterion("mycomment_content <=", value, "mycommentContent");
            return (Criteria) this;
        }

        public Criteria andMycommentContentLike(String value) {
            addCriterion("mycomment_content like", value, "mycommentContent");
            return (Criteria) this;
        }

        public Criteria andMycommentContentNotLike(String value) {
            addCriterion("mycomment_content not like", value, "mycommentContent");
            return (Criteria) this;
        }

        public Criteria andMycommentContentIn(List<String> values) {
            addCriterion("mycomment_content in", values, "mycommentContent");
            return (Criteria) this;
        }

        public Criteria andMycommentContentNotIn(List<String> values) {
            addCriterion("mycomment_content not in", values, "mycommentContent");
            return (Criteria) this;
        }

        public Criteria andMycommentContentBetween(String value1, String value2) {
            addCriterion("mycomment_content between", value1, value2, "mycommentContent");
            return (Criteria) this;
        }

        public Criteria andMycommentContentNotBetween(String value1, String value2) {
            addCriterion("mycomment_content not between", value1, value2, "mycommentContent");
            return (Criteria) this;
        }

        public Criteria andMyCommentPublishTimeIsNull() {
            addCriterion("mycomment_publish_time is null");
            return (Criteria) this;
        }

        public Criteria andMyCommentPublishTimeIsNotNull() {
            addCriterion("mycomment_publish_time is not null");
            return (Criteria) this;
        }

        public Criteria andMyCommentPublishTimeEqualTo(LocalDateTime value) {
            addMyCommentPublishTimeCriterion("mycomment_publish_time =", value, "myCommentPublishTime");
            return (Criteria) this;
        }

        public Criteria andMyCommentPublishTimeNotEqualTo(LocalDateTime value) {
            addMyCommentPublishTimeCriterion("mycomment_publish_time <>", value, "myCommentPublishTime");
            return (Criteria) this;
        }

        public Criteria andMyCommentPublishTimeGreaterThan(LocalDateTime value) {
            addMyCommentPublishTimeCriterion("mycomment_publish_time >", value, "myCommentPublishTime");
            return (Criteria) this;
        }

        public Criteria andMyCommentPublishTimeGreaterThanOrEqualTo(LocalDateTime value) {
            addMyCommentPublishTimeCriterion("mycomment_publish_time >=", value, "myCommentPublishTime");
            return (Criteria) this;
        }

        public Criteria andMyCommentPublishTimeLessThan(LocalDateTime value) {
            addMyCommentPublishTimeCriterion("mycomment_publish_time <", value, "myCommentPublishTime");
            return (Criteria) this;
        }

        public Criteria andMyCommentPublishTimeLessThanOrEqualTo(LocalDateTime value) {
            addMyCommentPublishTimeCriterion("mycomment_publish_time <=", value, "myCommentPublishTime");
            return (Criteria) this;
        }

        public Criteria andMyCommentPublishTimeIn(List<LocalDateTime> values) {
            addMyCommentPublishTimeCriterion("mycomment_publish_time in", values, "myCommentPublishTime");
            return (Criteria) this;
        }

        public Criteria andMyCommentPublishTimeNotIn(List<LocalDateTime> values) {
            addMyCommentPublishTimeCriterion("mycomment_publish_time not in", values, "myCommentPublishTime");
            return (Criteria) this;
        }

        public Criteria andMyCommentPublishTimeBetween(LocalDateTime value1, LocalDateTime value2) {
            addMyCommentPublishTimeCriterion("mycomment_publish_time between", value1, value2, "myCommentPublishTime");
            return (Criteria) this;
        }

        public Criteria andMyCommentPublishTimeNotBetween(LocalDateTime value1, LocalDateTime value2) {
            addMyCommentPublishTimeCriterion("mycomment_publish_time not between", value1, value2, "myCommentPublishTime");
            return (Criteria) this;
        }

        public Criteria andMycommentPostIsNull() {
            addCriterion("mycomment_post is null");
            return (Criteria) this;
        }

        public Criteria andMycommentPostIsNotNull() {
            addCriterion("mycomment_post is not null");
            return (Criteria) this;
        }

        public Criteria andMycommentPostEqualTo(Integer value) {
            addCriterion("mycomment_post =", value, "mycommentPost");
            return (Criteria) this;
        }

        public Criteria andMycommentPostNotEqualTo(Integer value) {
            addCriterion("mycomment_post <>", value, "mycommentPost");
            return (Criteria) this;
        }

        public Criteria andMycommentPostGreaterThan(Integer value) {
            addCriterion("mycomment_post >", value, "mycommentPost");
            return (Criteria) this;
        }

        public Criteria andMycommentPostGreaterThanOrEqualTo(Integer value) {
            addCriterion("mycomment_post >=", value, "mycommentPost");
            return (Criteria) this;
        }

        public Criteria andMycommentPostLessThan(Integer value) {
            addCriterion("mycomment_post <", value, "mycommentPost");
            return (Criteria) this;
        }

        public Criteria andMycommentPostLessThanOrEqualTo(Integer value) {
            addCriterion("mycomment_post <=", value, "mycommentPost");
            return (Criteria) this;
        }

        public Criteria andMycommentPostIn(List<Integer> values) {
            addCriterion("mycomment_post in", values, "mycommentPost");
            return (Criteria) this;
        }

        public Criteria andMycommentPostNotIn(List<Integer> values) {
            addCriterion("mycomment_post not in", values, "mycommentPost");
            return (Criteria) this;
        }

        public Criteria andMycommentPostBetween(Integer value1, Integer value2) {
            addCriterion("mycomment_post between", value1, value2, "mycommentPost");
            return (Criteria) this;
        }

        public Criteria andMycommentPostNotBetween(Integer value1, Integer value2) {
            addCriterion("mycomment_post not between", value1, value2, "mycommentPost");
            return (Criteria) this;
        }

        public Criteria andMycommentParentIsNull() {
            addCriterion("mycomment_parent is null");
            return (Criteria) this;
        }

        public Criteria andMycommentParentIsNotNull() {
            addCriterion("mycomment_parent is not null");
            return (Criteria) this;
        }

        public Criteria andMycommentParentEqualTo(Integer value) {
            addCriterion("mycomment_parent =", value, "mycommentParent");
            return (Criteria) this;
        }

        public Criteria andMycommentParentNotEqualTo(Integer value) {
            addCriterion("mycomment_parent <>", value, "mycommentParent");
            return (Criteria) this;
        }

        public Criteria andMycommentParentGreaterThan(Integer value) {
            addCriterion("mycomment_parent >", value, "mycommentParent");
            return (Criteria) this;
        }

        public Criteria andMycommentParentGreaterThanOrEqualTo(Integer value) {
            addCriterion("mycomment_parent >=", value, "mycommentParent");
            return (Criteria) this;
        }

        public Criteria andMycommentParentLessThan(Integer value) {
            addCriterion("mycomment_parent <", value, "mycommentParent");
            return (Criteria) this;
        }

        public Criteria andMycommentParentLessThanOrEqualTo(Integer value) {
            addCriterion("mycomment_parent <=", value, "mycommentParent");
            return (Criteria) this;
        }

        public Criteria andMycommentParentIn(List<Integer> values) {
            addCriterion("mycomment_parent in", values, "mycommentParent");
            return (Criteria) this;
        }

        public Criteria andMycommentParentNotIn(List<Integer> values) {
            addCriterion("mycomment_parent not in", values, "mycommentParent");
            return (Criteria) this;
        }

        public Criteria andMycommentParentBetween(Integer value1, Integer value2) {
            addCriterion("mycomment_parent between", value1, value2, "mycommentParent");
            return (Criteria) this;
        }

        public Criteria andMycommentParentNotBetween(Integer value1, Integer value2) {
            addCriterion("mycomment_parent not between", value1, value2, "mycommentParent");
            return (Criteria) this;
        }

        public Criteria andMycommentPublisherIsNull() {
            addCriterion("mycomment_publisher is null");
            return (Criteria) this;
        }

        public Criteria andMycommentPublisherIsNotNull() {
            addCriterion("mycomment_publisher is not null");
            return (Criteria) this;
        }

        public Criteria andMycommentPublisherEqualTo(String value) {
            addCriterion("mycomment_publisher =", value, "mycommentPublisher");
            return (Criteria) this;
        }

        public Criteria andMycommentPublisherNotEqualTo(String value) {
            addCriterion("mycomment_publisher <>", value, "mycommentPublisher");
            return (Criteria) this;
        }

        public Criteria andMycommentPublisherGreaterThan(String value) {
            addCriterion("mycomment_publisher >", value, "mycommentPublisher");
            return (Criteria) this;
        }

        public Criteria andMycommentPublisherGreaterThanOrEqualTo(String value) {
            addCriterion("mycomment_publisher >=", value, "mycommentPublisher");
            return (Criteria) this;
        }

        public Criteria andMycommentPublisherLessThan(String value) {
            addCriterion("mycomment_publisher <", value, "mycommentPublisher");
            return (Criteria) this;
        }

        public Criteria andMycommentPublisherLessThanOrEqualTo(String value) {
            addCriterion("mycomment_publisher <=", value, "mycommentPublisher");
            return (Criteria) this;
        }

        public Criteria andMycommentPublisherLike(String value) {
            addCriterion("mycomment_publisher like", value, "mycommentPublisher");
            return (Criteria) this;
        }

        public Criteria andMycommentPublisherNotLike(String value) {
            addCriterion("mycomment_publisher not like", value, "mycommentPublisher");
            return (Criteria) this;
        }

        public Criteria andMycommentPublisherIn(List<String> values) {
            addCriterion("mycomment_publisher in", values, "mycommentPublisher");
            return (Criteria) this;
        }

        public Criteria andMycommentPublisherNotIn(List<String> values) {
            addCriterion("mycomment_publisher not in", values, "mycommentPublisher");
            return (Criteria) this;
        }

        public Criteria andMycommentPublisherBetween(String value1, String value2) {
            addCriterion("mycomment_publisher between", value1, value2, "mycommentPublisher");
            return (Criteria) this;
        }

        public Criteria andMycommentPublisherNotBetween(String value1, String value2) {
            addCriterion("mycomment_publisher not between", value1, value2, "mycommentPublisher");
            return (Criteria) this;
        }

        public Criteria andMycommentDeleteIsNull() {
            addCriterion("mycomment_delete is null");
            return (Criteria) this;
        }

        public Criteria andMycommentDeleteIsNotNull() {
            addCriterion("mycomment_delete is not null");
            return (Criteria) this;
        }

        public Criteria andMycommentDeleteEqualTo(String value) {
            addCriterion("mycomment_delete =", value, "mycommentDelete");
            return (Criteria) this;
        }

        public Criteria andMycommentDeleteNotEqualTo(String value) {
            addCriterion("mycomment_delete <>", value, "mycommentDelete");
            return (Criteria) this;
        }

        public Criteria andMycommentDeleteGreaterThan(String value) {
            addCriterion("mycomment_delete >", value, "mycommentDelete");
            return (Criteria) this;
        }

        public Criteria andMycommentDeleteGreaterThanOrEqualTo(String value) {
            addCriterion("mycomment_delete >=", value, "mycommentDelete");
            return (Criteria) this;
        }

        public Criteria andMycommentDeleteLessThan(String value) {
            addCriterion("mycomment_delete <", value, "mycommentDelete");
            return (Criteria) this;
        }

        public Criteria andMycommentDeleteLessThanOrEqualTo(String value) {
            addCriterion("mycomment_delete <=", value, "mycommentDelete");
            return (Criteria) this;
        }

        public Criteria andMycommentDeleteLike(String value) {
            addCriterion("mycomment_delete like", value, "mycommentDelete");
            return (Criteria) this;
        }

        public Criteria andMycommentDeleteNotLike(String value) {
            addCriterion("mycomment_delete not like", value, "mycommentDelete");
            return (Criteria) this;
        }

        public Criteria andMycommentDeleteIn(List<String> values) {
            addCriterion("mycomment_delete in", values, "mycommentDelete");
            return (Criteria) this;
        }

        public Criteria andMycommentDeleteNotIn(List<String> values) {
            addCriterion("mycomment_delete not in", values, "mycommentDelete");
            return (Criteria) this;
        }

        public Criteria andMycommentDeleteBetween(String value1, String value2) {
            addCriterion("mycomment_delete between", value1, value2, "mycommentDelete");
            return (Criteria) this;
        }

        public Criteria andMycommentDeleteNotBetween(String value1, String value2) {
            addCriterion("mycomment_delete not between", value1, value2, "mycommentDelete");
            return (Criteria) this;
        }
    }

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