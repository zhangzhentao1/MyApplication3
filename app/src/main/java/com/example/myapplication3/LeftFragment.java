package com.example.myapplication3;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class LeftFragment extends Fragment {
    public String str="中华人民共和国";
    public List<String> list=new ArrayList<>();
    public MainActivity jianDie;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        jianDie=(MainActivity)getActivity();
        list.add("aaaa");
        list.add("bbbb");
        list.add("cccc");
        list.add("dddd");
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View fragmentToView= inflater.inflate(R.layout.fragment_left, container, false);
        Log.d("LeftFragment",jianDie.aaa);
        jianDie.bbbb();
        return fragmentToView;
    }
    public void a(){
        Log.d("LeftFragment","陈梓鹏的大哥，张振涛");
    }
}
