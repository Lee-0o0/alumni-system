package com.lee.domain;

import com.alibaba.excel.annotation.ExcelProperty;

public class Alumni {
    @ExcelProperty("学号")
    private String alumniNumber;

    @ExcelProperty("姓名")
    private String alumniName;

    @ExcelProperty("性别")
    private String alumniGender;

    @ExcelProperty("年级")
    private String alumniGrade;

    @ExcelProperty("专业")
    private String alumniMajor;

    @ExcelProperty("所在城市")
    private String alumniCity;

    @ExcelProperty("联系电话")
    private String alumniPhone;

    @ExcelProperty("邮箱")
    private String alumniMail;

    @ExcelProperty("公司")
    private String alumniCompany;

    @ExcelProperty("介绍")
    private String alumniMotto;

    @ExcelProperty("所在班级编号")
    private Integer alumniClass;

    public String getAlumniNumber() {
        return alumniNumber;
    }

    public void setAlumniNumber(String alumniNumber) {
        this.alumniNumber = alumniNumber == null ? null : alumniNumber.trim();
    }

    public String getAlumniName() {
        return alumniName;
    }

    public void setAlumniName(String alumniName) {
        this.alumniName = alumniName == null ? null : alumniName.trim();
    }

    public String getAlumniGender() {
        return alumniGender;
    }

    public void setAlumniGender(String alumniGender) {
        this.alumniGender = alumniGender == null ? null : alumniGender.trim();
    }

    public String getAlumniGrade() {
        return alumniGrade;
    }

    public void setAlumniGrade(String alumniGrade) {
        this.alumniGrade = alumniGrade == null ? null : alumniGrade.trim();
    }

    public String getAlumniMajor() {
        return alumniMajor;
    }

    public void setAlumniMajor(String alumniMajor) {
        this.alumniMajor = alumniMajor == null ? null : alumniMajor.trim();
    }

    public String getAlumniCity() {
        return alumniCity;
    }

    public void setAlumniCity(String alumniCity) {
        this.alumniCity = alumniCity == null ? null : alumniCity.trim();
    }

    public String getAlumniPhone() {
        return alumniPhone;
    }

    public void setAlumniPhone(String alumniPhone) {
        this.alumniPhone = alumniPhone == null ? null : alumniPhone.trim();
    }

    public String getAlumniMail() {
        return alumniMail;
    }

    public void setAlumniMail(String alumniMail) {
        this.alumniMail = alumniMail == null ? null : alumniMail.trim();
    }

    public String getAlumniCompany() {
        return alumniCompany;
    }

    public void setAlumniCompany(String alumniCompany) {
        this.alumniCompany = alumniCompany == null ? null : alumniCompany.trim();
    }

    public String getAlumniMotto() {
        return alumniMotto;
    }

    public void setAlumniMotto(String alumniMotto) {
        this.alumniMotto = alumniMotto == null ? null : alumniMotto.trim();
    }

    public Integer getAlumniClass() {
        return alumniClass;
    }

    public void setAlumniClass(Integer alumniClass) {
        this.alumniClass = alumniClass;
    }

    @Override
    public String toString() {
        return "Alumni{"
                + "alumniNumber='"
                + alumniNumber
                + '\''
                + ", alumniName='"
                + alumniName
                + '\''
                + ", alumniGender='"
                + alumniGender
                + '\''
                + ", alumniGrade='"
                + alumniGrade
                + '\''
                + ", alumniMajor='"
                + alumniMajor
                + '\''
                + ", alumniCity='"
                + alumniCity
                + '\''
                + ", alumniPhone='"
                + alumniPhone
                + '\''
                + ", alumniMail='"
                + alumniMail
                + '\''
                + ", alumniCompany='"
                + alumniCompany
                + '\''
                + ", alumniMotto='"
                + alumniMotto
                + '\''
                + ", alumniClass="
                + alumniClass
                + '}';
    }
}
