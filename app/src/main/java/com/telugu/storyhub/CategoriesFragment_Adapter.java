package com.telugu.storyhub;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


/**
 * Created by sgajula on 04/03/16.
 */
public class CategoriesFragment_Adapter extends RecyclerView.Adapter<CategoriesFragment_Adapter.ViewHolder>{

    String[] storyTitle = {"Story1","Story2","Story3","Story4","Story5","Story6"};
    String[] storyDesp = {"StoryDescription1","StoryDescription2","StoryDescription3","StoryDescription4","StoryDescription5","StoryDescription6"};
    int[] imgResource = {R.drawable.pic4,R.drawable.pic2,R.drawable.pic3,R.drawable.pic4,R.drawable.pic5,R.drawable.pic6};
    Activity activity;

    public CategoriesFragment_Adapter(Activity act) {
        activity = act;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.categories_detailview, parent, false);
            return new ViewHolder(view);

    }



    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.img_Story.setImageResource(imgResource[position]);
        holder.txt_StoryTitle.setText(storyTitle[position]);
        holder.txt_StoryDesp.setText(storyDesp[position]);
        holder.detailView_CardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent detailIntent = new Intent(activity,StoriesList.class);
                activity.startActivity(detailIntent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return  storyTitle.length;
    }


    public static class ViewHolder extends RecyclerView.ViewHolder {

        TextView txt_StoryTitle, txt_StoryDesp;
        ImageView img_Story;
        CardView detailView_CardView;

        public ViewHolder(View itemView) {
            super(itemView);
            txt_StoryTitle = (TextView)itemView.findViewById(R.id.txt_storyTitle);
            txt_StoryDesp = (TextView)itemView.findViewById(R.id.txt_storyDesp);
            img_Story = (ImageView)itemView.findViewById(R.id.story_imageview);
            detailView_CardView = (CardView)itemView.findViewById(R.id.story_cardview);
        }
    }
}
