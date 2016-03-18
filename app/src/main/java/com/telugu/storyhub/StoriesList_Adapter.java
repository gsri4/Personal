package com.telugu.storyhub;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by sgajula on 17/03/16.
 */
public class StoriesList_Adapter  extends RecyclerView.Adapter<StoriesList_Adapter.ViewHolder> {


        String[] storyNamesList = {"Story-1","Story-2","Story-3","Story-4","Story-5","Story-6","Story-7","Story-8","Story-9"};
   Context mContext;

    public StoriesList_Adapter(Activity context) {
        this.mContext = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_storiesdetails, parent, false);
        return new ViewHolder(view);
    }



    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        
        holder.storyName.setText(storyNamesList[position]);
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext,StoryDetailView.class);
                mContext.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return storyNamesList.length;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        TextView storyName;
        CardView cardView;

        public ViewHolder(View view) {
            super(view);
            storyName = (TextView)view.findViewById(R.id.txt_devdetailsLabel);
            cardView = (CardView)view.findViewById(R.id.storydetails_cardview);

        }

    }
}
