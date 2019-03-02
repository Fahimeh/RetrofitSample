package com.retrofitsample.fhashemian.retrofitsample.model;

import com.google.gson.annotations.SerializedName;

public class HttpResponse<T> {
    @SerializedName("ResultMessage")
    private String ResultMessage;

    @SerializedName("Result")
    private T Result;

    public HttpResponse(String ResultMessage,T Result){
        this.ResultMessage=ResultMessage;
        this.Result=Result;
    }

    public String getResultMessage(){
        return ResultMessage;
    }
    public void setResultMessage(String ResultMessage){
        this.ResultMessage=ResultMessage;
    }

    public T getResult(){
        return Result;
    }
    public void setResult(T Result){
        this.Result=Result;
    }

}
