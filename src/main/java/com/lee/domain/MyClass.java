package com.lee.domain;

import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

public class MyClass {
    private Integer classId;

    private String classGrade;

    private String classClass;

    private String classMajor;

    private String classCreator;

    private Integer classNumberOfMember;

    private String classIntroduction;

    @DateTimeFormat(pattern="yyyy-MM-dd")
    private LocalDate classCreateTime;

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    public String getClassGrade() {
        return classGrade;
    }

    public void setClassGrade(String classGrade) {
        this.classGrade = classGrade == null ? null : classGrade.trim();
    }

    public String getClassClass() {
        return classClass;
    }

    public void setClassClass(String classClass) {
        this.classClass = classClass == null ? null : classClass.trim();
    }

    public String getClassMajor() {
        return classMajor;
    }

    public void setClassMajor(String classMajor) {
        this.classMajor = classMajor == null ? null : classMajor.trim();
    }

    public String getClassCreator() {
        return classCreator;
    }

    public void setClassCreator(String classCreator) {
        this.classCreator = classCreator == null ? null : classCreator.trim();
    }

    public Integer getClassNumberOfMember() {
        return classNumberOfMember;
    }

    public void setClassNumberOfMember(Integer classNumberOfMember) {
        this.classNumberOfMember = classNumberOfMember;
    }

    public String getClassIntroduction() {
        return classIntroduction;
    }

    public void setClassIntroduction(String classIntroduction) {
        this.classIntroduction = classIntroduction == null ? null : classIntroduction.trim();
    }

    public LocalDate getClassCreateTime() {
        return classCreateTime;
    }

    public void setClassCreateTime(LocalDate classCreateTime) {
        this.classCreateTime = classCreateTime;
    }
}