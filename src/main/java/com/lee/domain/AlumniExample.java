package com.lee.domain;

import java.util.ArrayList;
import java.util.List;

public class AlumniExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AlumniExample() {
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

        public Criteria andAlumniNumberIsNull() {
            addCriterion("alumni_number is null");
            return (Criteria) this;
        }

        public Criteria andAlumniNumberIsNotNull() {
            addCriterion("alumni_number is not null");
            return (Criteria) this;
        }

        public Criteria andAlumniNumberEqualTo(String value) {
            addCriterion("alumni_number =", value, "alumniNumber");
            return (Criteria) this;
        }

        public Criteria andAlumniNumberNotEqualTo(String value) {
            addCriterion("alumni_number <>", value, "alumniNumber");
            return (Criteria) this;
        }

        public Criteria andAlumniNumberGreaterThan(String value) {
            addCriterion("alumni_number >", value, "alumniNumber");
            return (Criteria) this;
        }

        public Criteria andAlumniNumberGreaterThanOrEqualTo(String value) {
            addCriterion("alumni_number >=", value, "alumniNumber");
            return (Criteria) this;
        }

        public Criteria andAlumniNumberLessThan(String value) {
            addCriterion("alumni_number <", value, "alumniNumber");
            return (Criteria) this;
        }

        public Criteria andAlumniNumberLessThanOrEqualTo(String value) {
            addCriterion("alumni_number <=", value, "alumniNumber");
            return (Criteria) this;
        }

        public Criteria andAlumniNumberLike(String value) {
            addCriterion("alumni_number like", value, "alumniNumber");
            return (Criteria) this;
        }

        public Criteria andAlumniNumberNotLike(String value) {
            addCriterion("alumni_number not like", value, "alumniNumber");
            return (Criteria) this;
        }

        public Criteria andAlumniNumberIn(List<String> values) {
            addCriterion("alumni_number in", values, "alumniNumber");
            return (Criteria) this;
        }

        public Criteria andAlumniNumberNotIn(List<String> values) {
            addCriterion("alumni_number not in", values, "alumniNumber");
            return (Criteria) this;
        }

        public Criteria andAlumniNumberBetween(String value1, String value2) {
            addCriterion("alumni_number between", value1, value2, "alumniNumber");
            return (Criteria) this;
        }

        public Criteria andAlumniNumberNotBetween(String value1, String value2) {
            addCriterion("alumni_number not between", value1, value2, "alumniNumber");
            return (Criteria) this;
        }

        public Criteria andAlumniNameIsNull() {
            addCriterion("alumni_name is null");
            return (Criteria) this;
        }

        public Criteria andAlumniNameIsNotNull() {
            addCriterion("alumni_name is not null");
            return (Criteria) this;
        }

        public Criteria andAlumniNameEqualTo(String value) {
            addCriterion("alumni_name =", value, "alumniName");
            return (Criteria) this;
        }

        public Criteria andAlumniNameNotEqualTo(String value) {
            addCriterion("alumni_name <>", value, "alumniName");
            return (Criteria) this;
        }

        public Criteria andAlumniNameGreaterThan(String value) {
            addCriterion("alumni_name >", value, "alumniName");
            return (Criteria) this;
        }

        public Criteria andAlumniNameGreaterThanOrEqualTo(String value) {
            addCriterion("alumni_name >=", value, "alumniName");
            return (Criteria) this;
        }

        public Criteria andAlumniNameLessThan(String value) {
            addCriterion("alumni_name <", value, "alumniName");
            return (Criteria) this;
        }

        public Criteria andAlumniNameLessThanOrEqualTo(String value) {
            addCriterion("alumni_name <=", value, "alumniName");
            return (Criteria) this;
        }

        public Criteria andAlumniNameLike(String value) {
            addCriterion("alumni_name like", value, "alumniName");
            return (Criteria) this;
        }

        public Criteria andAlumniNameNotLike(String value) {
            addCriterion("alumni_name not like", value, "alumniName");
            return (Criteria) this;
        }

        public Criteria andAlumniNameIn(List<String> values) {
            addCriterion("alumni_name in", values, "alumniName");
            return (Criteria) this;
        }

        public Criteria andAlumniNameNotIn(List<String> values) {
            addCriterion("alumni_name not in", values, "alumniName");
            return (Criteria) this;
        }

        public Criteria andAlumniNameBetween(String value1, String value2) {
            addCriterion("alumni_name between", value1, value2, "alumniName");
            return (Criteria) this;
        }

        public Criteria andAlumniNameNotBetween(String value1, String value2) {
            addCriterion("alumni_name not between", value1, value2, "alumniName");
            return (Criteria) this;
        }

        public Criteria andAlumniGenderIsNull() {
            addCriterion("alumni_gender is null");
            return (Criteria) this;
        }

        public Criteria andAlumniGenderIsNotNull() {
            addCriterion("alumni_gender is not null");
            return (Criteria) this;
        }

        public Criteria andAlumniGenderEqualTo(String value) {
            addCriterion("alumni_gender =", value, "alumniGender");
            return (Criteria) this;
        }

        public Criteria andAlumniGenderNotEqualTo(String value) {
            addCriterion("alumni_gender <>", value, "alumniGender");
            return (Criteria) this;
        }

        public Criteria andAlumniGenderGreaterThan(String value) {
            addCriterion("alumni_gender >", value, "alumniGender");
            return (Criteria) this;
        }

        public Criteria andAlumniGenderGreaterThanOrEqualTo(String value) {
            addCriterion("alumni_gender >=", value, "alumniGender");
            return (Criteria) this;
        }

        public Criteria andAlumniGenderLessThan(String value) {
            addCriterion("alumni_gender <", value, "alumniGender");
            return (Criteria) this;
        }

        public Criteria andAlumniGenderLessThanOrEqualTo(String value) {
            addCriterion("alumni_gender <=", value, "alumniGender");
            return (Criteria) this;
        }

        public Criteria andAlumniGenderLike(String value) {
            addCriterion("alumni_gender like", value, "alumniGender");
            return (Criteria) this;
        }

        public Criteria andAlumniGenderNotLike(String value) {
            addCriterion("alumni_gender not like", value, "alumniGender");
            return (Criteria) this;
        }

        public Criteria andAlumniGenderIn(List<String> values) {
            addCriterion("alumni_gender in", values, "alumniGender");
            return (Criteria) this;
        }

        public Criteria andAlumniGenderNotIn(List<String> values) {
            addCriterion("alumni_gender not in", values, "alumniGender");
            return (Criteria) this;
        }

        public Criteria andAlumniGenderBetween(String value1, String value2) {
            addCriterion("alumni_gender between", value1, value2, "alumniGender");
            return (Criteria) this;
        }

        public Criteria andAlumniGenderNotBetween(String value1, String value2) {
            addCriterion("alumni_gender not between", value1, value2, "alumniGender");
            return (Criteria) this;
        }

        public Criteria andAlumniGradeIsNull() {
            addCriterion("alumni_grade is null");
            return (Criteria) this;
        }

        public Criteria andAlumniGradeIsNotNull() {
            addCriterion("alumni_grade is not null");
            return (Criteria) this;
        }

        public Criteria andAlumniGradeEqualTo(String value) {
            addCriterion("alumni_grade =", value, "alumniGrade");
            return (Criteria) this;
        }

        public Criteria andAlumniGradeNotEqualTo(String value) {
            addCriterion("alumni_grade <>", value, "alumniGrade");
            return (Criteria) this;
        }

        public Criteria andAlumniGradeGreaterThan(String value) {
            addCriterion("alumni_grade >", value, "alumniGrade");
            return (Criteria) this;
        }

        public Criteria andAlumniGradeGreaterThanOrEqualTo(String value) {
            addCriterion("alumni_grade >=", value, "alumniGrade");
            return (Criteria) this;
        }

        public Criteria andAlumniGradeLessThan(String value) {
            addCriterion("alumni_grade <", value, "alumniGrade");
            return (Criteria) this;
        }

        public Criteria andAlumniGradeLessThanOrEqualTo(String value) {
            addCriterion("alumni_grade <=", value, "alumniGrade");
            return (Criteria) this;
        }

        public Criteria andAlumniGradeLike(String value) {
            addCriterion("alumni_grade like", value, "alumniGrade");
            return (Criteria) this;
        }

        public Criteria andAlumniGradeNotLike(String value) {
            addCriterion("alumni_grade not like", value, "alumniGrade");
            return (Criteria) this;
        }

        public Criteria andAlumniGradeIn(List<String> values) {
            addCriterion("alumni_grade in", values, "alumniGrade");
            return (Criteria) this;
        }

        public Criteria andAlumniGradeNotIn(List<String> values) {
            addCriterion("alumni_grade not in", values, "alumniGrade");
            return (Criteria) this;
        }

        public Criteria andAlumniGradeBetween(String value1, String value2) {
            addCriterion("alumni_grade between", value1, value2, "alumniGrade");
            return (Criteria) this;
        }

        public Criteria andAlumniGradeNotBetween(String value1, String value2) {
            addCriterion("alumni_grade not between", value1, value2, "alumniGrade");
            return (Criteria) this;
        }

        public Criteria andAlumniMajorIsNull() {
            addCriterion("alumni_major is null");
            return (Criteria) this;
        }

        public Criteria andAlumniMajorIsNotNull() {
            addCriterion("alumni_major is not null");
            return (Criteria) this;
        }

        public Criteria andAlumniMajorEqualTo(String value) {
            addCriterion("alumni_major =", value, "alumniMajor");
            return (Criteria) this;
        }

        public Criteria andAlumniMajorNotEqualTo(String value) {
            addCriterion("alumni_major <>", value, "alumniMajor");
            return (Criteria) this;
        }

        public Criteria andAlumniMajorGreaterThan(String value) {
            addCriterion("alumni_major >", value, "alumniMajor");
            return (Criteria) this;
        }

        public Criteria andAlumniMajorGreaterThanOrEqualTo(String value) {
            addCriterion("alumni_major >=", value, "alumniMajor");
            return (Criteria) this;
        }

        public Criteria andAlumniMajorLessThan(String value) {
            addCriterion("alumni_major <", value, "alumniMajor");
            return (Criteria) this;
        }

        public Criteria andAlumniMajorLessThanOrEqualTo(String value) {
            addCriterion("alumni_major <=", value, "alumniMajor");
            return (Criteria) this;
        }

        public Criteria andAlumniMajorLike(String value) {
            addCriterion("alumni_major like", value, "alumniMajor");
            return (Criteria) this;
        }

        public Criteria andAlumniMajorNotLike(String value) {
            addCriterion("alumni_major not like", value, "alumniMajor");
            return (Criteria) this;
        }

        public Criteria andAlumniMajorIn(List<String> values) {
            addCriterion("alumni_major in", values, "alumniMajor");
            return (Criteria) this;
        }

        public Criteria andAlumniMajorNotIn(List<String> values) {
            addCriterion("alumni_major not in", values, "alumniMajor");
            return (Criteria) this;
        }

        public Criteria andAlumniMajorBetween(String value1, String value2) {
            addCriterion("alumni_major between", value1, value2, "alumniMajor");
            return (Criteria) this;
        }

        public Criteria andAlumniMajorNotBetween(String value1, String value2) {
            addCriterion("alumni_major not between", value1, value2, "alumniMajor");
            return (Criteria) this;
        }

        public Criteria andAlumniCityIsNull() {
            addCriterion("alumni_city is null");
            return (Criteria) this;
        }

        public Criteria andAlumniCityIsNotNull() {
            addCriterion("alumni_city is not null");
            return (Criteria) this;
        }

        public Criteria andAlumniCityEqualTo(String value) {
            addCriterion("alumni_city =", value, "alumniCity");
            return (Criteria) this;
        }

        public Criteria andAlumniCityNotEqualTo(String value) {
            addCriterion("alumni_city <>", value, "alumniCity");
            return (Criteria) this;
        }

        public Criteria andAlumniCityGreaterThan(String value) {
            addCriterion("alumni_city >", value, "alumniCity");
            return (Criteria) this;
        }

        public Criteria andAlumniCityGreaterThanOrEqualTo(String value) {
            addCriterion("alumni_city >=", value, "alumniCity");
            return (Criteria) this;
        }

        public Criteria andAlumniCityLessThan(String value) {
            addCriterion("alumni_city <", value, "alumniCity");
            return (Criteria) this;
        }

        public Criteria andAlumniCityLessThanOrEqualTo(String value) {
            addCriterion("alumni_city <=", value, "alumniCity");
            return (Criteria) this;
        }

        public Criteria andAlumniCityLike(String value) {
            addCriterion("alumni_city like", value, "alumniCity");
            return (Criteria) this;
        }

        public Criteria andAlumniCityNotLike(String value) {
            addCriterion("alumni_city not like", value, "alumniCity");
            return (Criteria) this;
        }

        public Criteria andAlumniCityIn(List<String> values) {
            addCriterion("alumni_city in", values, "alumniCity");
            return (Criteria) this;
        }

        public Criteria andAlumniCityNotIn(List<String> values) {
            addCriterion("alumni_city not in", values, "alumniCity");
            return (Criteria) this;
        }

        public Criteria andAlumniCityBetween(String value1, String value2) {
            addCriterion("alumni_city between", value1, value2, "alumniCity");
            return (Criteria) this;
        }

        public Criteria andAlumniCityNotBetween(String value1, String value2) {
            addCriterion("alumni_city not between", value1, value2, "alumniCity");
            return (Criteria) this;
        }

        public Criteria andAlumniPhoneIsNull() {
            addCriterion("alumni_phone is null");
            return (Criteria) this;
        }

        public Criteria andAlumniPhoneIsNotNull() {
            addCriterion("alumni_phone is not null");
            return (Criteria) this;
        }

        public Criteria andAlumniPhoneEqualTo(String value) {
            addCriterion("alumni_phone =", value, "alumniPhone");
            return (Criteria) this;
        }

        public Criteria andAlumniPhoneNotEqualTo(String value) {
            addCriterion("alumni_phone <>", value, "alumniPhone");
            return (Criteria) this;
        }

        public Criteria andAlumniPhoneGreaterThan(String value) {
            addCriterion("alumni_phone >", value, "alumniPhone");
            return (Criteria) this;
        }

        public Criteria andAlumniPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("alumni_phone >=", value, "alumniPhone");
            return (Criteria) this;
        }

        public Criteria andAlumniPhoneLessThan(String value) {
            addCriterion("alumni_phone <", value, "alumniPhone");
            return (Criteria) this;
        }

        public Criteria andAlumniPhoneLessThanOrEqualTo(String value) {
            addCriterion("alumni_phone <=", value, "alumniPhone");
            return (Criteria) this;
        }

        public Criteria andAlumniPhoneLike(String value) {
            addCriterion("alumni_phone like", value, "alumniPhone");
            return (Criteria) this;
        }

        public Criteria andAlumniPhoneNotLike(String value) {
            addCriterion("alumni_phone not like", value, "alumniPhone");
            return (Criteria) this;
        }

        public Criteria andAlumniPhoneIn(List<String> values) {
            addCriterion("alumni_phone in", values, "alumniPhone");
            return (Criteria) this;
        }

        public Criteria andAlumniPhoneNotIn(List<String> values) {
            addCriterion("alumni_phone not in", values, "alumniPhone");
            return (Criteria) this;
        }

        public Criteria andAlumniPhoneBetween(String value1, String value2) {
            addCriterion("alumni_phone between", value1, value2, "alumniPhone");
            return (Criteria) this;
        }

        public Criteria andAlumniPhoneNotBetween(String value1, String value2) {
            addCriterion("alumni_phone not between", value1, value2, "alumniPhone");
            return (Criteria) this;
        }

        public Criteria andAlumniMailIsNull() {
            addCriterion("alumni_mail is null");
            return (Criteria) this;
        }

        public Criteria andAlumniMailIsNotNull() {
            addCriterion("alumni_mail is not null");
            return (Criteria) this;
        }

        public Criteria andAlumniMailEqualTo(String value) {
            addCriterion("alumni_mail =", value, "alumniMail");
            return (Criteria) this;
        }

        public Criteria andAlumniMailNotEqualTo(String value) {
            addCriterion("alumni_mail <>", value, "alumniMail");
            return (Criteria) this;
        }

        public Criteria andAlumniMailGreaterThan(String value) {
            addCriterion("alumni_mail >", value, "alumniMail");
            return (Criteria) this;
        }

        public Criteria andAlumniMailGreaterThanOrEqualTo(String value) {
            addCriterion("alumni_mail >=", value, "alumniMail");
            return (Criteria) this;
        }

        public Criteria andAlumniMailLessThan(String value) {
            addCriterion("alumni_mail <", value, "alumniMail");
            return (Criteria) this;
        }

        public Criteria andAlumniMailLessThanOrEqualTo(String value) {
            addCriterion("alumni_mail <=", value, "alumniMail");
            return (Criteria) this;
        }

        public Criteria andAlumniMailLike(String value) {
            addCriterion("alumni_mail like", value, "alumniMail");
            return (Criteria) this;
        }

        public Criteria andAlumniMailNotLike(String value) {
            addCriterion("alumni_mail not like", value, "alumniMail");
            return (Criteria) this;
        }

        public Criteria andAlumniMailIn(List<String> values) {
            addCriterion("alumni_mail in", values, "alumniMail");
            return (Criteria) this;
        }

        public Criteria andAlumniMailNotIn(List<String> values) {
            addCriterion("alumni_mail not in", values, "alumniMail");
            return (Criteria) this;
        }

        public Criteria andAlumniMailBetween(String value1, String value2) {
            addCriterion("alumni_mail between", value1, value2, "alumniMail");
            return (Criteria) this;
        }

        public Criteria andAlumniMailNotBetween(String value1, String value2) {
            addCriterion("alumni_mail not between", value1, value2, "alumniMail");
            return (Criteria) this;
        }

        public Criteria andAlumniCompanyIsNull() {
            addCriterion("alumni_company is null");
            return (Criteria) this;
        }

        public Criteria andAlumniCompanyIsNotNull() {
            addCriterion("alumni_company is not null");
            return (Criteria) this;
        }

        public Criteria andAlumniCompanyEqualTo(String value) {
            addCriterion("alumni_company =", value, "alumniCompany");
            return (Criteria) this;
        }

        public Criteria andAlumniCompanyNotEqualTo(String value) {
            addCriterion("alumni_company <>", value, "alumniCompany");
            return (Criteria) this;
        }

        public Criteria andAlumniCompanyGreaterThan(String value) {
            addCriterion("alumni_company >", value, "alumniCompany");
            return (Criteria) this;
        }

        public Criteria andAlumniCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("alumni_company >=", value, "alumniCompany");
            return (Criteria) this;
        }

        public Criteria andAlumniCompanyLessThan(String value) {
            addCriterion("alumni_company <", value, "alumniCompany");
            return (Criteria) this;
        }

        public Criteria andAlumniCompanyLessThanOrEqualTo(String value) {
            addCriterion("alumni_company <=", value, "alumniCompany");
            return (Criteria) this;
        }

        public Criteria andAlumniCompanyLike(String value) {
            addCriterion("alumni_company like", value, "alumniCompany");
            return (Criteria) this;
        }

        public Criteria andAlumniCompanyNotLike(String value) {
            addCriterion("alumni_company not like", value, "alumniCompany");
            return (Criteria) this;
        }

        public Criteria andAlumniCompanyIn(List<String> values) {
            addCriterion("alumni_company in", values, "alumniCompany");
            return (Criteria) this;
        }

        public Criteria andAlumniCompanyNotIn(List<String> values) {
            addCriterion("alumni_company not in", values, "alumniCompany");
            return (Criteria) this;
        }

        public Criteria andAlumniCompanyBetween(String value1, String value2) {
            addCriterion("alumni_company between", value1, value2, "alumniCompany");
            return (Criteria) this;
        }

        public Criteria andAlumniCompanyNotBetween(String value1, String value2) {
            addCriterion("alumni_company not between", value1, value2, "alumniCompany");
            return (Criteria) this;
        }

        public Criteria andAlumniMottoIsNull() {
            addCriterion("alumni_motto is null");
            return (Criteria) this;
        }

        public Criteria andAlumniMottoIsNotNull() {
            addCriterion("alumni_motto is not null");
            return (Criteria) this;
        }

        public Criteria andAlumniMottoEqualTo(String value) {
            addCriterion("alumni_motto =", value, "alumniMotto");
            return (Criteria) this;
        }

        public Criteria andAlumniMottoNotEqualTo(String value) {
            addCriterion("alumni_motto <>", value, "alumniMotto");
            return (Criteria) this;
        }

        public Criteria andAlumniMottoGreaterThan(String value) {
            addCriterion("alumni_motto >", value, "alumniMotto");
            return (Criteria) this;
        }

        public Criteria andAlumniMottoGreaterThanOrEqualTo(String value) {
            addCriterion("alumni_motto >=", value, "alumniMotto");
            return (Criteria) this;
        }

        public Criteria andAlumniMottoLessThan(String value) {
            addCriterion("alumni_motto <", value, "alumniMotto");
            return (Criteria) this;
        }

        public Criteria andAlumniMottoLessThanOrEqualTo(String value) {
            addCriterion("alumni_motto <=", value, "alumniMotto");
            return (Criteria) this;
        }

        public Criteria andAlumniMottoLike(String value) {
            addCriterion("alumni_motto like", value, "alumniMotto");
            return (Criteria) this;
        }

        public Criteria andAlumniMottoNotLike(String value) {
            addCriterion("alumni_motto not like", value, "alumniMotto");
            return (Criteria) this;
        }

        public Criteria andAlumniMottoIn(List<String> values) {
            addCriterion("alumni_motto in", values, "alumniMotto");
            return (Criteria) this;
        }

        public Criteria andAlumniMottoNotIn(List<String> values) {
            addCriterion("alumni_motto not in", values, "alumniMotto");
            return (Criteria) this;
        }

        public Criteria andAlumniMottoBetween(String value1, String value2) {
            addCriterion("alumni_motto between", value1, value2, "alumniMotto");
            return (Criteria) this;
        }

        public Criteria andAlumniMottoNotBetween(String value1, String value2) {
            addCriterion("alumni_motto not between", value1, value2, "alumniMotto");
            return (Criteria) this;
        }

        public Criteria andAlumniClassIsNull() {
            addCriterion("alumni_class is null");
            return (Criteria) this;
        }

        public Criteria andAlumniClassIsNotNull() {
            addCriterion("alumni_class is not null");
            return (Criteria) this;
        }

        public Criteria andAlumniClassEqualTo(Integer value) {
            addCriterion("alumni_class =", value, "alumniClass");
            return (Criteria) this;
        }

        public Criteria andAlumniClassNotEqualTo(Integer value) {
            addCriterion("alumni_class <>", value, "alumniClass");
            return (Criteria) this;
        }

        public Criteria andAlumniClassGreaterThan(Integer value) {
            addCriterion("alumni_class >", value, "alumniClass");
            return (Criteria) this;
        }

        public Criteria andAlumniClassGreaterThanOrEqualTo(Integer value) {
            addCriterion("alumni_class >=", value, "alumniClass");
            return (Criteria) this;
        }

        public Criteria andAlumniClassLessThan(Integer value) {
            addCriterion("alumni_class <", value, "alumniClass");
            return (Criteria) this;
        }

        public Criteria andAlumniClassLessThanOrEqualTo(Integer value) {
            addCriterion("alumni_class <=", value, "alumniClass");
            return (Criteria) this;
        }

        public Criteria andAlumniClassIn(List<Integer> values) {
            addCriterion("alumni_class in", values, "alumniClass");
            return (Criteria) this;
        }

        public Criteria andAlumniClassNotIn(List<Integer> values) {
            addCriterion("alumni_class not in", values, "alumniClass");
            return (Criteria) this;
        }

        public Criteria andAlumniClassBetween(Integer value1, Integer value2) {
            addCriterion("alumni_class between", value1, value2, "alumniClass");
            return (Criteria) this;
        }

        public Criteria andAlumniClassNotBetween(Integer value1, Integer value2) {
            addCriterion("alumni_class not between", value1, value2, "alumniClass");
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