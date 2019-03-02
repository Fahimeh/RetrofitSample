package com.retrofitsample.fhashemian.retrofitsample;

import android.app.Activity;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.widget.Toast;

import com.retrofitsample.fhashemian.retrofitsample.interfaces.GetDataService;
import com.retrofitsample.fhashemian.retrofitsample.model.HttpResponse;
import com.retrofitsample.fhashemian.retrofitsample.model.MonitoringSchedualeBody;
import com.retrofitsample.fhashemian.retrofitsample.model.MonitoringSchedule;
import com.retrofitsample.fhashemian.retrofitsample.network.RetrofitClientInstance;

import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends Activity {
    ProgressDialog progressDoalog;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        progressDoalog = new ProgressDialog(MainActivity.this);
        progressDoalog.setMessage("Loading....");
        progressDoalog.show();

       /* GetDataService service = RetrofitClientInstance.getRetrofitInstance().create(GetDataService.class);
        Call<List<RetroPhoto>> call = service.getAllPhotos();
        call.enqueue(new Callback<List<RetroPhoto>>() {
            @Override
            public void onResponse(Call<List<RetroPhoto>> call, Response<List<RetroPhoto>> response) {
                progressDoalog.dismiss();
                List<RetroPhoto> retroPhotos=response.body();
            }

            @Override
            public void onFailure(Call<List<RetroPhoto>> call, Throwable t) {
                progressDoalog.dismiss();
                Toast.makeText(MainActivity.this, "Something went wrong...Please try later!", Toast.LENGTH_SHORT).show();
            }
        });*/
        GetDataService service=RetrofitClientInstance.getRetrofitInstance().create(GetDataService.class);
        MonitoringSchedualeBody msBody=new MonitoringSchedualeBody();
        msBody.token="A3410394-FB3F-494B-AD27-BFAE3CD57D7C";
        msBody.personId="1292";
        retrofit2.Call<HttpResponse<MonitoringSchedule>> call=service.getAllMonitoringScheduale("application/json",msBody);
        call.enqueue(new Callback<HttpResponse<MonitoringSchedule>>() {
            @Override
            public void onResponse(retrofit2.Call<HttpResponse<MonitoringSchedule>> call, Response<HttpResponse<MonitoringSchedule>> response) {
                progressDoalog.dismiss();
                Log.e("Response=",response.body().getResultMessage());
            }

            @Override
            public void onFailure(retrofit2.Call<HttpResponse<MonitoringSchedule>> call, Throwable t) {
                progressDoalog.dismiss();
                Toast.makeText(MainActivity.this, "Something went wrong...Please try later!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
