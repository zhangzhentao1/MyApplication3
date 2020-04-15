package com.example.myapplication3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    public String aaa="陈梓鹏最爱老八";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //得到碎片
        LeftFragment lf_1=(LeftFragment)getSupportFragmentManager()
                .findFragmentById(R.id.f1);
        Toast.makeText(MainActivity.this,lf_1.str,Toast.LENGTH_LONG).show();
        List<String> list=new  ArrayList<>();
        list=lf_1.list;
        for (String s:list){
            Log.d("MainActivity",s);
        }
        lf_1.a();
    }
    public void bbbb(){
        Log.d("LeftFragment","18级移动应用班的美食家");
    }
}
