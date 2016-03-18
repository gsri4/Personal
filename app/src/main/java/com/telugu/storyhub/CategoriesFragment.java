package com.telugu.storyhub;

import android.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.security.KeyStore;

public class CategoriesFragment extends Fragment {

    private RecyclerView mRecyclerView_Categories;
    private LinearLayoutManager mLinearLayoutManager;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view  = inflater.inflate(R.layout.activity_categories,null,false);

        mRecyclerView_Categories = (RecyclerView)view.findViewById(R.id.recview_categories);
        CategoriesFragment_Adapter categoriesFragment_adapter = new CategoriesFragment_Adapter(getActivity());
        mLinearLayoutManager = new LinearLayoutManager(getActivity());
        mLinearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        mRecyclerView_Categories.setLayoutManager(mLinearLayoutManager);
        mRecyclerView_Categories.setAdapter(categoriesFragment_adapter);


        return view;
    }
}
