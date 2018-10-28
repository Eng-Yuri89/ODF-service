package com.nanotrick.orderfoodservice.Remote;

import com.nanotrick.orderfoodservice.Model.DataMessage;
import com.nanotrick.orderfoodservice.Model.MyResponse;

import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

/**
 * Created by milymozz on 2018. 2. 15..
 */

public interface APIService {
    @Headers(
            {
                    "Content-Type:application/json",
                    "Authorization:key=AAAApX8khpw:APA91bErcby7omJqOeIZJCKy47LOizbrqV6yBkadnzkY8Vaw375l4KrTwN0aCK1S-Mplsiv8wbtqikThU6rSDfZMP5W26kT343rQIGediGa6ZZZvpNDvM1ko0y7lEu8W1I2yiF0pBBQd"
            }
    )

    @POST("fcm/send")
    retrofit2.Call<MyResponse> sendNotification(@Body DataMessage body);

}
