package com.example.includealltask;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.includealltask.APIClasss.APIClient;
import com.example.includealltask.Bean.APILoginBean;
import com.example.includealltask.Bean.loginpassBean;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class APILoginActivity extends AppCompatActivity {

    EditText emailid, password;
    Button login;
    String TAG = "APILoginActivity";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apilogin);


        emailid = findViewById(R.id.emailid);
        password = findViewById(R.id.password);
        login = findViewById(R.id.login);


        login.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {

                String email = emailid.toString().trim();
                String pass = password.toString().trim();
                UserLogin(email, pass);

            }
        });
    }

    private void UserLogin(String email, final String pass) {


        loginpassBean loginpassBean = new loginpassBean("prematix_chandrakala@hotmail.com", "123");

        Call<APILoginBean> apiLoginBeanCall = APIClient
                .getapiClient()
                .getapiInterface()
                .getloginResponce(loginpassBean);

        apiLoginBeanCall.enqueue(new Callback<APILoginBean>() {
            @Override
            public void onResponse(Call<APILoginBean> call, Response<APILoginBean> response) {
                if (response.isSuccessful()) {
                    APILoginBean apiLoginBeans = response.body();

                    emailid.setText(apiLoginBeans.getEmail());
                    Log.e(TAG, response.body().toString());

                    SharedPreferences sharedPreferences = getSharedPreferences("login", Context.MODE_PRIVATE);
                    SharedPreferences.Editor editor = sharedPreferences.edit();
                    editor.putString("token", response.body().getAccessToken());
                    editor.apply();

                    String token = sharedPreferences.getString("token", null);
                    Log.e(TAG, token);


                    Common.header = token;

                    Intent intent = new Intent(getApplicationContext(), DashBoardActivity.class);
                    startActivity(intent);

                } else {
                    Log.e(TAG, "onResponce: " + response.message());
                    Toast.makeText(APILoginActivity.this, response.message(), Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<APILoginBean> call, Throwable t) {
                Log.e(TAG, "onFailure: " + t.getMessage());
                Toast.makeText(APILoginActivity.this, t.getMessage(), Toast.LENGTH_SHORT).show();

            }
        });


    }
}
