package com.example.loginexam;

import androidx.annotation.Nullable;

import com.android.volley.AuthFailureError;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

public class LoginRequest extends StringRequest{
    //url설정 (php 파일 연동)
    final static private String URL = "http://com9425.dotcom.co.kr/Register.php";
    private Map<String, String> map;

    public LoginRequest(String userID, String userPassword , Response.Listener<String> listener){
        super(Method.POST,URL,listener,null);

        map=  new HashMap<>();
        map.put("userID",userID);
        map.put("userPassword",userPassword);


    }

    @Nullable
    @Override
    protected Map<String, String> getPostParams() throws AuthFailureError {
        return map;
    }
}
