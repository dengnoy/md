package com.example.hp.md.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.hp.md.R;

import java.util.List;

/**
 * Created by HP on 2017/8/22/0022.
 */

public class AdapterInMain extends RecyclerView.Adapter<AdapterInMain.MyHolder> {
    private List<String> mUrls;
    private Context mContext;
    private LayoutInflater mInflater;
private boolean Debug=true;
    public AdapterInMain(List<String> mUrls, Context mContext) {
        this.mUrls = mUrls;
        this.mContext = mContext;
        mInflater=LayoutInflater.from(mContext);
    }

    @Override
    public AdapterInMain.MyHolder onCreateViewHolder(ViewGroup parent, int viewType) {


        return new MyHolder(mInflater.inflate(R.layout.item_layout,parent,false));
    }

    @Override
    public void onBindViewHolder(AdapterInMain.MyHolder holder, int position) {
       Glide.with(mContext)
                .load(mUrls.get(position))
                .into(holder.mIV);


    }

    @Override
    public int getItemCount() {
        return mUrls.size();
    }

    public class MyHolder extends RecyclerView.ViewHolder {
        ImageView mIV;


        public MyHolder(View itemView) {
            super(itemView);

            mIV = (ImageView) itemView.findViewById(R.id.item_image);

        }
    }
}
