package com.example.myapplication;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

/**
 * Created by 方小茗 on 2019/5/29.
 */

public class Myadapter extends RecyclerView.Adapter<Myadapter.Chiler>{
    private ArrayList<Shuju.ResultsBean> resultsBeans;
    private Context context;

    public Myadapter(ArrayList<Shuju.ResultsBean> resultsBeans, Context context) {
        this.resultsBeans = resultsBeans;
        this.context = context;
    }

    @NonNull
    @Override
    public Myadapter.Chiler onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.item, null);
        return new Chiler(inflate);
    }

    @Override
    public void onBindViewHolder(@NonNull Myadapter.Chiler holder, int position) {
        Shuju.ResultsBean resultsBean = resultsBeans.get(position);
        holder.tv.setText(resultsBean.getDesc());
        RequestOptions requestOptions = new RequestOptions().circleCrop();
        Glide.with(context).load(resultsBean.getUrl()).apply(requestOptions).into(holder.iv);
    }

    @Override
    public int getItemCount() {
        return resultsBeans.size();
    }

    public class Chiler extends RecyclerView.ViewHolder {

        private ImageView iv;
        private TextView tv;

        public Chiler(View itemView) {
            super(itemView);
            iv = itemView.findViewById(R.id.iv);
            tv = itemView.findViewById(R.id.tv);
        }
    }
}
