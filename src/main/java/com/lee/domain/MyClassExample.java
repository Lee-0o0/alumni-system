package com.lee.domain;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class MyClassExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MyClassExample() {
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
        protected List<Criterion> classCreateTimeCriteria;

        protected List<Criterion> allCriteria;

        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
            classCreateTimeCriteria = new ArrayList<Criterion>();
        }

        public List<Criterion> getClassCreateTimeCriteria() {
            return classCreateTimeCriteria;
        }

        protected void addClassCreateTimeCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            classCreateTimeCriteria.add(new Criterion(condition, value, "org.apache.ibatis.type.LocalDateTypeHandler"));
            allCriteria = null;
        }

        protected void addClassCreateTimeCriterion(String condition, LocalDate value1, LocalDate value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            classCreateTimeCriteria.add(new Criterion(condition, value1, value2, "org.apache.ibatis.type.LocalDateTypeHandler"));
            allCriteria = null;
        }

        public boolean isValid() {
            return criteria.size() > 0
                || classCreateTimeCriteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            if (allCriteria == null) {
                allCriteria = new ArrayList<Criterion>();
                allCriteria.addAll(criteria);
                allCriteria.addAll(classCreateTimeCriteria);
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

        public Criteria andClassIdIsNull() {
            addCriterion("class_id is null");
            return (Criteria) this;
        }

        public Criteria andClassIdIsNotNull() {
            addCriterion("class_id is not null");
            return (Criteria) this;
        }

        public Criteria andClassIdEqualTo(Integer value) {
            addCriterion("class_id =", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdNotEqualTo(Integer value) {
            addCriterion("class_id <>", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdGreaterThan(Integer value) {
            addCriterion("class_id >", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("class_id >=", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdLessThan(Integer value) {
            addCriterion("class_id <", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdLessThanOrEqualTo(Integer value) {
            addCriterion("class_id <=", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdIn(List<Integer> values) {
            addCriterion("class_id in", values, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdNotIn(List<Integer> values) {
            addCriterion("class_id not in", values, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdBetween(Integer value1, Integer value2) {
            addCriterion("class_id between", value1, value2, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdNotBetween(Integer value1, Integer value2) {
            addCriterion("class_id not between", value1, value2, "classId");
            return (Criteria) this;
        }

        public Criteria andClassGradeIsNull() {
            addCriterion("class_grade is null");
            return (Criteria) this;
        }

        public Criteria andClassGradeIsNotNull() {
            addCriterion("class_grade is not null");
            return (Criteria) this;
        }

        public Criteria andClassGradeEqualTo(String value) {
            addCriterion("class_grade =", value, "classGrade");
            return (Criteria) this;
        }

        public Criteria andClassGradeNotEqualTo(String value) {
            addCriterion("class_grade <>", value, "classGrade");
            return (Criteria) this;
        }

        public Criteria andClassGradeGreaterThan(String value) {
            addCriterion("class_grade >", value, "classGrade");
            return (Criteria) this;
        }

        public Criteria andClassGradeGreaterThanOrEqualTo(String value) {
            addCriterion("class_grade >=", value, "classGrade");
            return (Criteria) this;
        }

        public Criteria andClassGradeLessThan(String value) {
            addCriterion("class_grade <", value, "classGrade");
            return (Criteria) this;
        }

        public Criteria andClassGradeLessThanOrEqualTo(String value) {
            addCriterion("class_grade <=", value, "classGrade");
            return (Criteria) this;
        }

        public Criteria andClassGradeLike(String value) {
            addCriterion("class_grade like", value, "classGrade");
            return (Criteria) this;
        }

        public Criteria andClassGradeNotLike(String value) {
            addCriterion("class_grade not like", value, "classGrade");
            return (Criteria) this;
        }

        public Criteria andClassGradeIn(List<String> values) {
            addCriterion("class_grade in", values, "classGrade");
            return (Criteria) this;
        }

        public Criteria andClassGradeNotIn(List<String> values) {
            addCriterion("class_grade not in", values, "classGrade");
            return (Criteria) this;
        }

        public Criteria andClassGradeBetween(String value1, String value2) {
            addCriterion("class_grade between", value1, value2, "classGrade");
            return (Criteria) this;
        }

        public Criteria andClassGradeNotBetween(String value1, String value2) {
            addCriterion("class_grade not between", value1, value2, "classGrade");
            return (Criteria) this;
        }

        public Criteria andClassClassIsNull() {
            addCriterion("class_class is null");
            return (Criteria) this;
        }

        public Criteria andClassClassIsNotNull() {
            addCriterion("class_class is not null");
            return (Criteria) this;
        }

        public Criteria andClassClassEqualTo(String value) {
            addCriterion("class_class =", value, "classClass");
            return (Criteria) this;
        }

        public Criteria andClassClassNotEqualTo(String value) {
            addCriterion("class_class <>", value, "classClass");
            return (Criteria) this;
        }

        public Criteria andClassClassGreaterThan(String value) {
            addCriterion("class_class >", value, "classClass");
            return (Criteria) this;
        }

        public Criteria andClassClassGreaterThanOrEqualTo(String value) {
            addCriterion("class_class >=", value, "classClass");
            return (Criteria) this;
        }

        public Criteria andClassClassLessThan(String value) {
            addCriterion("class_class <", value, "classClass");
            return (Criteria) this;
        }

        public Criteria andClassClassLessThanOrEqualTo(String value) {
            addCriterion("class_class <=", value, "classClass");
            return (Criteria) this;
        }

        public Criteria andClassClassLike(String value) {
            addCriterion("class_class like", value, "classClass");
            return (Criteria) this;
        }

        public Criteria andClassClassNotLike(String value) {
            addCriterion("class_class not like", value, "classClass");
            return (Criteria) this;
        }

        public Criteria andClassClassIn(List<String> values) {
            addCriterion("class_class in", values, "classClass");
            return (Criteria) this;
        }

        public Criteria andClassClassNotIn(List<String> values) {
            addCriterion("class_class not in", values, "classClass");
            return (Criteria) this;
        }

        public Criteria andClassClassBetween(String value1, String value2) {
            addCriterion("class_class between", value1, value2, "classClass");
            return (Criteria) this;
        }

        public Criteria andClassClassNotBetween(String value1, String value2) {
            addCriterion("class_class not between", value1, value2, "classClass");
            return (Criteria) this;
        }

        public Criteria andClassMajorIsNull() {
            addCriterion("class_major is null");
            return (Criteria) this;
        }

        public Criteria andClassMajorIsNotNull() {
            addCriterion("class_major is not null");
            return (Criteria) this;
        }

        public Criteria andClassMajorEqualTo(String value) {
            addCriterion("class_major =", value, "classMajor");
            return (Criteria) this;
        }

        public Criteria andClassMajorNotEqualTo(String value) {
            addCriterion("class_major <>", value, "classMajor");
            return (Criteria) this;
        }

        public Criteria andClassMajorGreaterThan(String value) {
            addCriterion("class_major >", value, "classMajor");
            return (Criteria) this;
        }

        public Criteria andClassMajorGreaterThanOrEqualTo(String value) {
            addCriterion("class_major >=", value, "classMajor");
            return (Criteria) this;
        }

        public Criteria andClassMajorLessThan(String value) {
            addCriterion("class_major <", value, "classMajor");
            return (Criteria) this;
        }

        public Criteria andClassMajorLessThanOrEqualTo(String value) {
            addCriterion("class_major <=", value, "classMajor");
            return (Criteria) this;
        }

        public Criteria andClassMajorLike(String value) {
            addCriterion("class_major like", value, "classMajor");
            return (Criteria) this;
        }

        public Criteria andClassMajorNotLike(String value) {
            addCriterion("class_major not like", value, "classMajor");
            return (Criteria) this;
        }

        public Criteria andClassMajorIn(List<String> values) {
            addCriterion("class_major in", values, "classMajor");
            return (Criteria) this;
        }

        public Criteria andClassMajorNotIn(List<String> values) {
            addCriterion("class_major not in", values, "classMajor");
            return (Criteria) this;
        }

        public Criteria andClassMajorBetween(String value1, String value2) {
            addCriterion("class_major between", value1, value2, "classMajor");
            return (Criteria) this;
        }

        public Criteria andClassMajorNotBetween(String value1, String value2) {
            addCriterion("class_major not between", value1, value2, "classMajor");
            return (Criteria) this;
        }

        public Criteria andClassCreatorIsNull() {
            addCriterion("class_creator is null");
            return (Criteria) this;
        }

        public Criteria andClassCreatorIsNotNull() {
            addCriterion("class_creator is not null");
            return (Criteria) this;
        }

        public Criteria andClassCreatorEqualTo(String value) {
            addCriterion("class_creator =", value, "classCreator");
            return (Criteria) this;
        }

        public Criteria andClassCreatorNotEqualTo(String value) {
            addCriterion("class_creator <>", value, "classCreator");
            return (Criteria) this;
        }

        public Criteria andClassCreatorGreaterThan(String value) {
            addCriterion("class_creator >", value, "classCreator");
            return (Criteria) this;
        }

        public Criteria andClassCreatorGreaterThanOrEqualTo(String value) {
            addCriterion("class_creator >=", value, "classCreator");
            return (Criteria) this;
        }

        public Criteria andClassCreatorLessThan(String value) {
            addCriterion("class_creator <", value, "classCreator");
            return (Criteria) this;
        }

        public Criteria andClassCreatorLessThanOrEqualTo(String value) {
            addCriterion("class_creator <=", value, "classCreator");
            return (Criteria) this;
        }

        public Criteria andClassCreatorLike(String value) {
            addCriterion("class_creator like", value, "classCreator");
            return (Criteria) this;
        }

        public Criteria andClassCreatorNotLike(String value) {
            addCriterion("class_creator not like", value, "classCreator");
            return (Criteria) this;
        }

        public Criteria andClassCreatorIn(List<String> values) {
            addCriterion("class_creator in", values, "classCreator");
            return (Criteria) this;
        }

        public Criteria andClassCreatorNotIn(List<String> values) {
            addCriterion("class_creator not in", values, "classCreator");
            return (Criteria) this;
        }

        public Criteria andClassCreatorBetween(String value1, String value2) {
            addCriterion("class_creator between", value1, value2, "classCreator");
            return (Criteria) this;
        }

        public Criteria andClassCreatorNotBetween(String value1, String value2) {
            addCriterion("class_creator not between", value1, value2, "classCreator");
            return (Criteria) this;
        }

        public Criteria andClassNumberOfMemberIsNull() {
            addCriterion("class_number_of_member is null");
            return (Criteria) this;
        }

        public Criteria andClassNumberOfMemberIsNotNull() {
            addCriterion("class_number_of_member is not null");
            return (Criteria) this;
        }

        public Criteria andClassNumberOfMemberEqualTo(Integer value) {
            addCriterion("class_number_of_member =", value, "classNumberOfMember");
            return (Criteria) this;
        }

        public Criteria andClassNumberOfMemberNotEqualTo(Integer value) {
            addCriterion("class_number_of_member <>", value, "classNumberOfMember");
            return (Criteria) this;
        }

        public Criteria andClassNumberOfMemberGreaterThan(Integer value) {
            addCriterion("class_number_of_member >", value, "classNumberOfMember");
            return (Criteria) this;
        }

        public Criteria andClassNumberOfMemberGreaterThanOrEqualTo(Integer value) {
            addCriterion("class_number_of_member >=", value, "classNumberOfMember");
            return (Criteria) this;
        }

        public Criteria andClassNumberOfMemberLessThan(Integer value) {
            addCriterion("class_number_of_member <", value, "classNumberOfMember");
            return (Criteria) this;
        }

        public Criteria andClassNumberOfMemberLessThanOrEqualTo(Integer value) {
            addCriterion("class_number_of_member <=", value, "classNumberOfMember");
            return (Criteria) this;
        }

        public Criteria andClassNumberOfMemberIn(List<Integer> values) {
            addCriterion("class_number_of_member in", values, "classNumberOfMember");
            return (Criteria) this;
        }

        public Criteria andClassNumberOfMemberNotIn(List<Integer> values) {
            addCriterion("class_number_of_member not in", values, "classNumberOfMember");
            return (Criteria) this;
        }

        public Criteria andClassNumberOfMemberBetween(Integer value1, Integer value2) {
            addCriterion("class_number_of_member between", value1, value2, "classNumberOfMember");
            return (Criteria) this;
        }

        public Criteria andClassNumberOfMemberNotBetween(Integer value1, Integer value2) {
            addCriterion("class_number_of_member not between", value1, value2, "classNumberOfMember");
            return (Criteria) this;
        }

        public Criteria andClassIntroductionIsNull() {
            addCriterion("class_introduction is null");
            return (Criteria) this;
        }

        public Criteria andClassIntroductionIsNotNull() {
            addCriterion("class_introduction is not null");
            return (Criteria) this;
        }

        public Criteria andClassIntroductionEqualTo(String value) {
            addCriterion("class_introduction =", value, "classIntroduction");
            return (Criteria) this;
        }

        public Criteria andClassIntroductionNotEqualTo(String value) {
            addCriterion("class_introduction <>", value, "classIntroduction");
            return (Criteria) this;
        }

        public Criteria andClassIntroductionGreaterThan(String value) {
            addCriterion("class_introduction >", value, "classIntroduction");
            return (Criteria) this;
        }

        public Criteria andClassIntroductionGreaterThanOrEqualTo(String value) {
            addCriterion("class_introduction >=", value, "classIntroduction");
            return (Criteria) this;
        }

        public Criteria andClassIntroductionLessThan(String value) {
            addCriterion("class_introduction <", value, "classIntroduction");
            return (Criteria) this;
        }

        public Criteria andClassIntroductionLessThanOrEqualTo(String value) {
            addCriterion("class_introduction <=", value, "classIntroduction");
            return (Criteria) this;
        }

        public Criteria andClassIntroductionLike(String value) {
            addCriterion("class_introduction like", value, "classIntroduction");
            return (Criteria) this;
        }

        public Criteria andClassIntroductionNotLike(String value) {
            addCriterion("class_introduction not like", value, "classIntroduction");
            return (Criteria) this;
        }

        public Criteria andClassIntroductionIn(List<String> values) {
            addCriterion("class_introduction in", values, "classIntroduction");
            return (Criteria) this;
        }

        public Criteria andClassIntroductionNotIn(List<String> values) {
            addCriterion("class_introduction not in", values, "classIntroduction");
            return (Criteria) this;
        }

        public Criteria andClassIntroductionBetween(String value1, String value2) {
            addCriterion("class_introduction between", value1, value2, "classIntroduction");
            return (Criteria) this;
        }

        public Criteria andClassIntroductionNotBetween(String value1, String value2) {
            addCriterion("class_introduction not between", value1, value2, "classIntroduction");
            return (Criteria) this;
        }

        public Criteria andClassCreateTimeIsNull() {
            addCriterion("class_create_time is null");
            return (Criteria) this;
        }

        public Criteria andClassCreateTimeIsNotNull() {
            addCriterion("class_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andClassCreateTimeEqualTo(LocalDate value) {
            addClassCreateTimeCriterion("class_create_time =", value, "classCreateTime");
            return (Criteria) this;
        }

        public Criteria andClassCreateTimeNotEqualTo(LocalDate value) {
            addClassCreateTimeCriterion("class_create_time <>", value, "classCreateTime");
            return (Criteria) this;
        }

        public Criteria andClassCreateTimeGreaterThan(LocalDate value) {
            addClassCreateTimeCriterion("class_create_time >", value, "classCreateTime");
            return (Criteria) this;
        }

        public Criteria andClassCreateTimeGreaterThanOrEqualTo(LocalDate value) {
            addClassCreateTimeCriterion("class_create_time >=", value, "classCreateTime");
            return (Criteria) this;
        }

        public Criteria andClassCreateTimeLessThan(LocalDate value) {
            addClassCreateTimeCriterion("class_create_time <", value, "classCreateTime");
            return (Criteria) this;
        }

        public Criteria andClassCreateTimeLessThanOrEqualTo(LocalDate value) {
            addClassCreateTimeCriterion("class_create_time <=", value, "classCreateTime");
            return (Criteria) this;
        }

        public Criteria andClassCreateTimeIn(List<LocalDate> values) {
            addClassCreateTimeCriterion("class_create_time in", values, "classCreateTime");
            return (Criteria) this;
        }

        public Criteria andClassCreateTimeNotIn(List<LocalDate> values) {
            addClassCreateTimeCriterion("class_create_time not in", values, "classCreateTime");
            return (Criteria) this;
        }

        public Criteria andClassCreateTimeBetween(LocalDate value1, LocalDate value2) {
            addClassCreateTimeCriterion("class_create_time between", value1, value2, "classCreateTime");
            return (Criteria) this;
        }

        public Criteria andClassCreateTimeNotBetween(LocalDate value1, LocalDate value2) {
            addClassCreateTimeCriterion("class_create_time not between", value1, value2, "classCreateTime");
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