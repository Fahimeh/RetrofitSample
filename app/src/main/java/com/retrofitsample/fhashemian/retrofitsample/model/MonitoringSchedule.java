package com.retrofitsample.fhashemian.retrofitsample.model;

import com.google.gson.annotations.SerializedName;

import java.sql.Date;

public class MonitoringSchedule {
    @SerializedName("Id")
    public long Id;
    @SerializedName("PersonId")
    public long PersonId;
    @SerializedName("ScheduleType")
    public int ScheduleType;
    @SerializedName("ScheduleDateFrom")
    public Date ScheduleDateFrom ;
    @SerializedName("ScheduleDateTo")
    public Date ScheduleDateTo;

    public MonitoringSchedule(long Id,long PersonId,int ScheduleType,Date ScheduleDateFrom,Date ScheduleDateTo){
        this.Id=Id;
        this.PersonId=PersonId;
        this.ScheduleType=ScheduleType;
        this.ScheduleDateFrom=ScheduleDateFrom;
        this.ScheduleDateTo=ScheduleDateTo;
    }

    public void setId(long Id){
        this.Id=Id;
    }
    public long getId(){
        return Id;
    }

    public void setPersonId(long PersonId){
        this.PersonId=PersonId;
    }
    public long getPersonId(){
        return PersonId;
    }

    public void setScheduleType(int ScheduleType){
        this.ScheduleType=ScheduleType;
    }
    public long getScheduleType(){
        return ScheduleType;
    }

    public void setScheduleDateFrom(Date ScheduleDateFrom){
        this.ScheduleDateFrom=ScheduleDateFrom;
    }
    public Date getScheduleDateFrom(){
        return ScheduleDateFrom;
    }

    public void setScheduleType(Date ScheduleDateTo){
        this.ScheduleDateTo=ScheduleDateTo;
    }
    public Date ScheduleDateTo(){
        return ScheduleDateTo;
    }

}
