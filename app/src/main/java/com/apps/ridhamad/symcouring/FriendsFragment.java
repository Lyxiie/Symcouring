package com.apps.ridhamad.symcouring;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

//Tanggal Pengerjaan : 15 April 2022 - 8 Mei 2022
//        Nim : 10119251
//        Nama : Muhamad Ridwan
//        Kelas :IF6

public class FriendsFragment extends Fragment {

    RecyclerView recyclerView;
    ArrayList<MainModel> mainModels;
    MainAdapter mainAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_friends, container, false);
        recyclerView = view.findViewById(R.id.recycler_view);

        Integer[] langLogo = {R.drawable.bg_man_asep, R.drawable.bg_man_budi, R.drawable.bg_man_cecep};

        String[] langName = {"Asep", "Budi", "Cecep"};

        String[] langDesc = {"No: 081234114999 \n City: Bandung \n E-mail: Asep@gmail.com", "No: 082675855188 \n City: Semarang \n E-mail: Budi@gmail.com", "No: 083447509117 \n City: Surabaya \n E-mail: Cecep@gmail.com"};

        mainModels = new ArrayList<>();
        for (int i=0;i<langLogo.length;i++) {
            MainModel model = new MainModel(langLogo[i], langName[i], langDesc[i]);
            mainModels.add(model);
        }

        LinearLayoutManager layoutManager = new LinearLayoutManager(
                getActivity(), LinearLayoutManager.HORIZONTAL, false
        );

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        mainAdapter = new MainAdapter(getActivity(), mainModels);
        recyclerView.setAdapter(mainAdapter);


        return view;
    }
}