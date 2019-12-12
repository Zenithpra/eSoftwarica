package com.zenith.esoftwaricathidassignment.fragments;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.zenith.esoftwaricathidassignment.R;
import com.zenith.esoftwaricathidassignment.adapters.homeAdapter;


public class homeFragment extends Fragment {


    public homeFragment() {
        // Required empty public constructor
    }



private RecyclerView recyclerView;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_home, container, false);
        recyclerView=view.findViewById(R.id.recyclerView);



        homeAdapter CustomhomeAdapter= new homeAdapter(getActivity());




        recyclerView.setAdapter(CustomhomeAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        return view;
    }



}
