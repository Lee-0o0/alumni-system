package com.lee.domain;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class PostExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PostExample() {
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
        protected List<Criterion> postPublishTimeCriteria;

        protected List<Criterion> allCriteria;

        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
            postPublishTimeCriteria = new ArrayList<Criterion>();
        }

        public List<Criterion> getPostPublishTimeCriteria() {
            return postPublishTimeCriteria;
        }

        protected void addPostPublishTimeCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            postPublishTimeCriteria.add(new Criterion(condition, value, "org.apache.ibatis.type.LocalDateTimeTypeHandler"));
            allCriteria = null;
        }

        protected void addPostPublishTimeCriterion(String condition, LocalDateTime value1, LocalDateTime value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            postPublishTimeCriteria.add(new Criterion(condition, value1, value2, "org.apache.ibatis.type.LocalDateTimeTypeHandler"));
            allCriteria = null;
        }

        public boolean isValid() {
            return criteria.size() > 0
                || postPublishTimeCriteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            if (allCriteria == null) {
                allCriteria = new ArrayList<Criterion>();
                allCriteria.addAll(criteria);
                allCriteria.addAll(postPublishTimeCriteria);
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

        public Criteria andPostIdIsNull() {
            addCriterion("post_id is null");
            return (Criteria) this;
        }

        public Criteria andPostIdIsNotNull() {
            addCriterion("post_id is not null");
            return (Criteria) this;
        }

        public Criteria andPostIdEqualTo(Integer value) {
            addCriterion("post_id =", value, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdNotEqualTo(Integer value) {
            addCriterion("post_id <>", value, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdGreaterThan(Integer value) {
            addCriterion("post_id >", value, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("post_id >=", value, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdLessThan(Integer value) {
            addCriterion("post_id <", value, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdLessThanOrEqualTo(Integer value) {
            addCriterion("post_id <=", value, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdIn(List<Integer> values) {
            addCriterion("post_id in", values, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdNotIn(List<Integer> values) {
            addCriterion("post_id not in", values, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdBetween(Integer value1, Integer value2) {
            addCriterion("post_id between", value1, value2, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdNotBetween(Integer value1, Integer value2) {
            addCriterion("post_id not between", value1, value2, "postId");
            return (Criteria) this;
        }

        public Criteria andPostTitleIsNull() {
            addCriterion("post_title is null");
            return (Criteria) this;
        }

        public Criteria andPostTitleIsNotNull() {
            addCriterion("post_title is not null");
            return (Criteria) this;
        }

        public Criteria andPostTitleEqualTo(String value) {
            addCriterion("post_title =", value, "postTitle");
            return (Criteria) this;
        }

        public Criteria andPostTitleNotEqualTo(String value) {
            addCriterion("post_title <>", value, "postTitle");
            return (Criteria) this;
        }

        public Criteria andPostTitleGreaterThan(String value) {
            addCriterion("post_title >", value, "postTitle");
            return (Criteria) this;
        }

        public Criteria andPostTitleGreaterThanOrEqualTo(String value) {
            addCriterion("post_title >=", value, "postTitle");
            return (Criteria) this;
        }

        public Criteria andPostTitleLessThan(String value) {
            addCriterion("post_title <", value, "postTitle");
            return (Criteria) this;
        }

        public Criteria andPostTitleLessThanOrEqualTo(String value) {
            addCriterion("post_title <=", value, "postTitle");
            return (Criteria) this;
        }

        public Criteria andPostTitleLike(String value) {
            addCriterion("post_title like", value, "postTitle");
            return (Criteria) this;
        }

        public Criteria andPostTitleNotLike(String value) {
            addCriterion("post_title not like", value, "postTitle");
            return (Criteria) this;
        }

        public Criteria andPostTitleIn(List<String> values) {
            addCriterion("post_title in", values, "postTitle");
            return (Criteria) this;
        }

        public Criteria andPostTitleNotIn(List<String> values) {
            addCriterion("post_title not in", values, "postTitle");
            return (Criteria) this;
        }

        public Criteria andPostTitleBetween(String value1, String value2) {
            addCriterion("post_title between", value1, value2, "postTitle");
            return (Criteria) this;
        }

        public Criteria andPostTitleNotBetween(String value1, String value2) {
            addCriterion("post_title not between", value1, value2, "postTitle");
            return (Criteria) this;
        }

        public Criteria andPostKeyWordIsNull() {
            addCriterion("post_key_word is null");
            return (Criteria) this;
        }

        public Criteria andPostKeyWordIsNotNull() {
            addCriterion("post_key_word is not null");
            return (Criteria) this;
        }

        public Criteria andPostKeyWordEqualTo(String value) {
            addCriterion("post_key_word =", value, "postKeyWord");
            return (Criteria) this;
        }

        public Criteria andPostKeyWordNotEqualTo(String value) {
            addCriterion("post_key_word <>", value, "postKeyWord");
            return (Criteria) this;
        }

        public Criteria andPostKeyWordGreaterThan(String value) {
            addCriterion("post_key_word >", value, "postKeyWord");
            return (Criteria) this;
        }

        public Criteria andPostKeyWordGreaterThanOrEqualTo(String value) {
            addCriterion("post_key_word >=", value, "postKeyWord");
            return (Criteria) this;
        }

        public Criteria andPostKeyWordLessThan(String value) {
            addCriterion("post_key_word <", value, "postKeyWord");
            return (Criteria) this;
        }

        public Criteria andPostKeyWordLessThanOrEqualTo(String value) {
            addCriterion("post_key_word <=", value, "postKeyWord");
            return (Criteria) this;
        }

        public Criteria andPostKeyWordLike(String value) {
            addCriterion("post_key_word like", value, "postKeyWord");
            return (Criteria) this;
        }

        public Criteria andPostKeyWordNotLike(String value) {
            addCriterion("post_key_word not like", value, "postKeyWord");
            return (Criteria) this;
        }

        public Criteria andPostKeyWordIn(List<String> values) {
            addCriterion("post_key_word in", values, "postKeyWord");
            return (Criteria) this;
        }

        public Criteria andPostKeyWordNotIn(List<String> values) {
            addCriterion("post_key_word not in", values, "postKeyWord");
            return (Criteria) this;
        }

        public Criteria andPostKeyWordBetween(String value1, String value2) {
            addCriterion("post_key_word between", value1, value2, "postKeyWord");
            return (Criteria) this;
        }

        public Criteria andPostKeyWordNotBetween(String value1, String value2) {
            addCriterion("post_key_word not between", value1, value2, "postKeyWord");
            return (Criteria) this;
        }

        public Criteria andPostContentIsNull() {
            addCriterion("post_content is null");
            return (Criteria) this;
        }

        public Criteria andPostContentIsNotNull() {
            addCriterion("post_content is not null");
            return (Criteria) this;
        }

        public Criteria andPostContentEqualTo(String value) {
            addCriterion("post_content =", value, "postContent");
            return (Criteria) this;
        }

        public Criteria andPostContentNotEqualTo(String value) {
            addCriterion("post_content <>", value, "postContent");
            return (Criteria) this;
        }

        public Criteria andPostContentGreaterThan(String value) {
            addCriterion("post_content >", value, "postContent");
            return (Criteria) this;
        }

        public Criteria andPostContentGreaterThanOrEqualTo(String value) {
            addCriterion("post_content >=", value, "postContent");
            return (Criteria) this;
        }

        public Criteria andPostContentLessThan(String value) {
            addCriterion("post_content <", value, "postContent");
            return (Criteria) this;
        }

        public Criteria andPostContentLessThanOrEqualTo(String value) {
            addCriterion("post_content <=", value, "postContent");
            return (Criteria) this;
        }

        public Criteria andPostContentLike(String value) {
            addCriterion("post_content like", value, "postContent");
            return (Criteria) this;
        }

        public Criteria andPostContentNotLike(String value) {
            addCriterion("post_content not like", value, "postContent");
            return (Criteria) this;
        }

        public Criteria andPostContentIn(List<String> values) {
            addCriterion("post_content in", values, "postContent");
            return (Criteria) this;
        }

        public Criteria andPostContentNotIn(List<String> values) {
            addCriterion("post_content not in", values, "postContent");
            return (Criteria) this;
        }

        public Criteria andPostContentBetween(String value1, String value2) {
            addCriterion("post_content between", value1, value2, "postContent");
            return (Criteria) this;
        }

        public Criteria andPostContentNotBetween(String value1, String value2) {
            addCriterion("post_content not between", value1, value2, "postContent");
            return (Criteria) this;
        }

        public Criteria andPostPublishTimeIsNull() {
            addCriterion("post_publish_time is null");
            return (Criteria) this;
        }

        public Criteria andPostPublishTimeIsNotNull() {
            addCriterion("post_publish_time is not null");
            return (Criteria) this;
        }

        public Criteria andPostPublishTimeEqualTo(LocalDateTime value) {
            addPostPublishTimeCriterion("post_publish_time =", value, "postPublishTime");
            return (Criteria) this;
        }

        public Criteria andPostPublishTimeNotEqualTo(LocalDateTime value) {
            addPostPublishTimeCriterion("post_publish_time <>", value, "postPublishTime");
            return (Criteria) this;
        }

        public Criteria andPostPublishTimeGreaterThan(LocalDateTime value) {
            addPostPublishTimeCriterion("post_publish_time >", value, "postPublishTime");
            return (Criteria) this;
        }

        public Criteria andPostPublishTimeGreaterThanOrEqualTo(LocalDateTime value) {
            addPostPublishTimeCriterion("post_publish_time >=", value, "postPublishTime");
            return (Criteria) this;
        }

        public Criteria andPostPublishTimeLessThan(LocalDateTime value) {
            addPostPublishTimeCriterion("post_publish_time <", value, "postPublishTime");
            return (Criteria) this;
        }

        public Criteria andPostPublishTimeLessThanOrEqualTo(LocalDateTime value) {
            addPostPublishTimeCriterion("post_publish_time <=", value, "postPublishTime");
            return (Criteria) this;
        }

        public Criteria andPostPublishTimeIn(List<LocalDateTime> values) {
            addPostPublishTimeCriterion("post_publish_time in", values, "postPublishTime");
            return (Criteria) this;
        }

        public Criteria andPostPublishTimeNotIn(List<LocalDateTime> values) {
            addPostPublishTimeCriterion("post_publish_time not in", values, "postPublishTime");
            return (Criteria) this;
        }

        public Criteria andPostPublishTimeBetween(LocalDateTime value1, LocalDateTime value2) {
            addPostPublishTimeCriterion("post_publish_time between", value1, value2, "postPublishTime");
            return (Criteria) this;
        }

        public Criteria andPostPublishTimeNotBetween(LocalDateTime value1, LocalDateTime value2) {
            addPostPublishTimeCriterion("post_publish_time not between", value1, value2, "postPublishTime");
            return (Criteria) this;
        }

        public Criteria andPostPublisherIsNull() {
            addCriterion("post_publisher is null");
            return (Criteria) this;
        }

        public Criteria andPostPublisherIsNotNull() {
            addCriterion("post_publisher is not null");
            return (Criteria) this;
        }

        public Criteria andPostPublisherEqualTo(String value) {
            addCriterion("post_publisher =", value, "postPublisher");
            return (Criteria) this;
        }

        public Criteria andPostPublisherNotEqualTo(String value) {
            addCriterion("post_publisher <>", value, "postPublisher");
            return (Criteria) this;
        }

        public Criteria andPostPublisherGreaterThan(String value) {
            addCriterion("post_publisher >", value, "postPublisher");
            return (Criteria) this;
        }

        public Criteria andPostPublisherGreaterThanOrEqualTo(String value) {
            addCriterion("post_publisher >=", value, "postPublisher");
            return (Criteria) this;
        }

        public Criteria andPostPublisherLessThan(String value) {
            addCriterion("post_publisher <", value, "postPublisher");
            return (Criteria) this;
        }

        public Criteria andPostPublisherLessThanOrEqualTo(String value) {
            addCriterion("post_publisher <=", value, "postPublisher");
            return (Criteria) this;
        }

        public Criteria andPostPublisherLike(String value) {
            addCriterion("post_publisher like", value, "postPublisher");
            return (Criteria) this;
        }

        public Criteria andPostPublisherNotLike(String value) {
            addCriterion("post_publisher not like", value, "postPublisher");
            return (Criteria) this;
        }

        public Criteria andPostPublisherIn(List<String> values) {
            addCriterion("post_publisher in", values, "postPublisher");
            return (Criteria) this;
        }

        public Criteria andPostPublisherNotIn(List<String> values) {
            addCriterion("post_publisher not in", values, "postPublisher");
            return (Criteria) this;
        }

        public Criteria andPostPublisherBetween(String value1, String value2) {
            addCriterion("post_publisher between", value1, value2, "postPublisher");
            return (Criteria) this;
        }

        public Criteria andPostPublisherNotBetween(String value1, String value2) {
            addCriterion("post_publisher not between", value1, value2, "postPublisher");
            return (Criteria) this;
        }

        public Criteria andPostDeleteIsNull() {
            addCriterion("post_delete is null");
            return (Criteria) this;
        }

        public Criteria andPostDeleteIsNotNull() {
            addCriterion("post_delete is not null");
            return (Criteria) this;
        }

        public Criteria andPostDeleteEqualTo(String value) {
            addCriterion("post_delete =", value, "postDelete");
            return (Criteria) this;
        }

        public Criteria andPostDeleteNotEqualTo(String value) {
            addCriterion("post_delete <>", value, "postDelete");
            return (Criteria) this;
        }

        public Criteria andPostDeleteGreaterThan(String value) {
            addCriterion("post_delete >", value, "postDelete");
            return (Criteria) this;
        }

        public Criteria andPostDeleteGreaterThanOrEqualTo(String value) {
            addCriterion("post_delete >=", value, "postDelete");
            return (Criteria) this;
        }

        public Criteria andPostDeleteLessThan(String value) {
            addCriterion("post_delete <", value, "postDelete");
            return (Criteria) this;
        }

        public Criteria andPostDeleteLessThanOrEqualTo(String value) {
            addCriterion("post_delete <=", value, "postDelete");
            return (Criteria) this;
        }

        public Criteria andPostDeleteLike(String value) {
            addCriterion("post_delete like", value, "postDelete");
            return (Criteria) this;
        }

        public Criteria andPostDeleteNotLike(String value) {
            addCriterion("post_delete not like", value, "postDelete");
            return (Criteria) this;
        }

        public Criteria andPostDeleteIn(List<String> values) {
            addCriterion("post_delete in", values, "postDelete");
            return (Criteria) this;
        }

        public Criteria andPostDeleteNotIn(List<String> values) {
            addCriterion("post_delete not in", values, "postDelete");
            return (Criteria) this;
        }

        public Criteria andPostDeleteBetween(String value1, String value2) {
            addCriterion("post_delete between", value1, value2, "postDelete");
            return (Criteria) this;
        }

        public Criteria andPostDeleteNotBetween(String value1, String value2) {
            addCriterion("post_delete not between", value1, value2, "postDelete");
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