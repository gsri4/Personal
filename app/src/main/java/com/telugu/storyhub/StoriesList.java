package com.telugu.storyhub;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class StoriesList extends AppCompatActivity {


    private RecyclerView mRcyView_AssetDetails;
    private LinearLayoutManager mLinearLayoutMagager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_storieslist);
        initializeViews();
    }

    private  void initializeViews( ){

        mRcyView_AssetDetails = (RecyclerView)findViewById(R.id.recycleview_batchdetails);
        mRcyView_AssetDetails.setHasFixedSize(true);
        mLinearLayoutMagager = new LinearLayoutManager(this);
        mLinearLayoutMagager.setOrientation(LinearLayoutManager.VERTICAL);
        mRcyView_AssetDetails.setLayoutManager(mLinearLayoutMagager);

        StoriesList_Adapter storiesList_adapter = new StoriesList_Adapter(this);
        mRcyView_AssetDetails.setAdapter(storiesList_adapter);

    }

}
