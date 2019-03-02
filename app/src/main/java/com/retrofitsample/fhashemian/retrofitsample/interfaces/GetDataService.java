package com.retrofitsample.fhashemian.retrofitsample.interfaces;

import com.retrofitsample.fhashemian.retrofitsample.model.HttpResponse;
import com.retrofitsample.fhashemian.retrofitsample.model.MonitoringSchedualeBody;
import com.retrofitsample.fhashemian.retrofitsample.model.MonitoringSchedule;
import com.retrofitsample.fhashemian.retrofitsample.model.RetroPhoto;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface GetDataService {


    @POST("GetMonitoringSchedule")
    Call<HttpResponse<MonitoringSchedule>> getAllMonitoringScheduale(@Header("Content-Type") String content_type, @Body MonitoringSchedualeBody msBody);

    @GET("/photos")
    Call<List<RetroPhoto>> getAllPhotos();
}
