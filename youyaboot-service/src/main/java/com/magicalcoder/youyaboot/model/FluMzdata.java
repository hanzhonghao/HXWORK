package com.magicalcoder.youyaboot.model;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.math.*;
import java.io.Serializable;
import lombok.Data;
/**
* 代码为自动生成 Created by www.magicalcoder.com
* 软件作者：何栋宇 qq:709876443
* 如果你改变了此类 read 请将此行删除
* 欢迎加入官方QQ群:648595928
*/
@Data
public class FluMzdata implements Serializable{

    private String admid;//ADMID
    private String patype;//PATYPE
    private String patdept;//PATDEPT
    private String patientname;//PATIENTNAME
    private String sex;//SEX
    private String papmino;//PAPMINO
    private String birthdate;//BIRTHDATE
    private String age;//AGE
    private String iszd;//ISZD
    private String patidno;//PATIDNO
    private String admdat;//ADMDAT
    private String patzs;//PATZS

    
    public String getAdmid(){
        return admid;
    }
    public void setAdmid(String admid){
        this.admid = admid;
    }

    public String getPatype(){
        return patype;
    }
    public void setPatype(String patype){
        this.patype = patype;
    }

    public String getPatdept(){
        return patdept;
    }
    public void setPatdept(String patdept){
        this.patdept = patdept;
    }

    public String getPatientname(){
        return patientname;
    }
    public void setPatientname(String patientname){
        this.patientname = patientname;
    }

    public String getSex(){
        return sex;
    }
    public void setSex(String sex){
        this.sex = sex;
    }

    public String getPapmino(){
        return papmino;
    }
    public void setPapmino(String papmino){
        this.papmino = papmino;
    }

    public String getBirthdate(){
        return birthdate;
    }
    public void setBirthdate(String birthdate){
        this.birthdate = birthdate;
    }

    public String getAge(){
        return age;
    }
    public void setAge(String age){
        this.age = age;
    }

    public String getIszd(){
        return iszd;
    }
    public void setIszd(String iszd){
        this.iszd = iszd;
    }

    public String getPatidno(){
        return patidno;
    }
    public void setPatidno(String patidno){
        this.patidno = patidno;
    }

    public String getAdmdat(){
        return admdat;
    }
    public void setAdmdat(String admdat){
        this.admdat = admdat;
    }

    public String getPatzs(){
        return patzs;
    }
    public void setPatzs(String patzs){
        this.patzs = patzs;
    }
}
