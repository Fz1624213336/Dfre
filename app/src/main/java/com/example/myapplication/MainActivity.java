package com.example.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.myapplication.Ckerss.Ickerss;
import com.example.myapplication.Perscd.Lperscd;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements Ickerss.IView{
    private RecyclerView mRec;
    private Lperscd lperscd;
    private ArrayList<Shuju.ResultsBean> resultsBeans;
    private Myadapter myadapter;

    //方卓  1810A
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initdata();
    }

    private void initdata() {
        lperscd = new Lperscd(this);
        lperscd.getshu();
    }

    private void initView() {
        mRec = (RecyclerView) findViewById(R.id.rec);
        resultsBeans = new ArrayList<>();
        myadapter = new Myadapter(resultsBeans, this);
        mRec.setLayoutManager(new LinearLayoutManager(this));
        mRec.setAdapter(myadapter);
    }

    @Override
    public void getdata(Shuju shuju) {
        List<Shuju.ResultsBean> results = shuju.getResults();
        resultsBeans.addAll(results);
        myadapter.notifyDataSetChanged();
    }
}
