package com.apps.ridhamad.symcouring;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link DailyFragment#newInstance} factory method to
 * create an instance of this fragment.
 *
 */

//Tanggal Pengerjaan : 15 April 2022 - 8 Mei 2022
//Nim : 10119251
//Nama : Muhamad Ridwan
//Kelas :IF6

public class DailyFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    RecyclerView recyclerView;
    ArrayList<datamodel> dataholder;

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment DailyFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static DailyFragment newInstance(String param1, String param2) {
        DailyFragment fragment = new DailyFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    public DailyFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_daily, container, false);
        recyclerView = view.findViewById(R.id.recview);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        dataholder = new ArrayList<>();

        datamodel ob1 = new datamodel(R.drawable.day_reading, "My New Book", "Buku ini sungguh luar biasa, dengan alur cerita yang tidak terduga. Saya harap ada seri kedua untuk buku ini.", "6 Mei, 05:15");
        dataholder.add(ob1);

        datamodel ob2 = new datamodel(R.drawable.day_eating2, "Makan Bersama", "Sungguh hal yang tidak terduga bertemu teman lama, semoga pertemanan tidak habis seperti makanan.","6 Mei, 11:42");
        dataholder.add(ob2);

        datamodel ob3 = new datamodel(R.drawable.day_walking, "Menikmati Hari", "Terkadang rasa tenang datang dalam sebuah kesederhanaan.","6 Mei, 15:30");
        dataholder.add(ob3);

        datamodel ob4 = new datamodel(R.drawable.day_sunset, "Matahari Tenggelam", "Suasana yang sempurna untuk mengakhiri hari.","6 Mei, 17:50");
        dataholder.add(ob4);

        datamodel ob5 = new datamodel(R.drawable.day_gaming, "Gaming Time", "Semoga gachaku tak seampas hidupmu.","6 Mei, 20:58");
        dataholder.add(ob5);

        recyclerView.setAdapter(new myadapter(dataholder));
        return view;
    }
}