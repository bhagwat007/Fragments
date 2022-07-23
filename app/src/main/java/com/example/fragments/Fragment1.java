package com.example.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Fragment1#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Fragment1 extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Fragment1() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Fragment1.
     */
    // TODO: Rename and change types and number of parameters
    public static Fragment1 newInstance(String param1, String param2) {
        Fragment1 fragment = new Fragment1();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
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
                             Bundle savedInstanceState ) {

        View view = inflater.inflate(R.layout.fragment_1, container, false);
        ArrayList<String> year = new ArrayList<>();

        year.add("2022");
        year.add("2021");
        year.add("2020");
        year.add("2019");
        year.add("2018");
        year.add("2017");
        year.add("2016");
        year.add("2015");
        year.add("2014");
        year.add("2013");
        year.add("2012");
        year.add("2011");
        year.add("2010");
        year.add("2009");
        year.add("2008");
        year.add("2007");
        year.add("2006");
        year.add("2005");
        year.add("2004");
        year.add("2003");
        year.add("2002");
        year.add("2001");
        year.add("2000");
        year.add("1999");
        year.add("1998");
        year.add("1997");
        year.add("1996");
        year.add("1995");
        year.add("1994");
        year.add("1993");

        ListView listView = (ListView) view.findViewById(R.id.mainMenu);

        ArrayAdapter<String> itemAdapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, year);
        listView.setAdapter(itemAdapter);

        return view;
    }
}






