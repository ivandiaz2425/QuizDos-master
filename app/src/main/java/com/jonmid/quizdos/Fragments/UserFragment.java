package com.jonmid.quizdos.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.jonmid.quizdos.Adapters.UserAdapterDiazIvan;
import com.jonmid.quizdos.Models.UserModelDiazIvan;
import com.jonmid.quizdos.R;

import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class UserFragment extends Fragment {
    Button button;
    RecyclerView recyclerView;
    List<UserModelDiazIvan> DiazIvanList;
    UserAdapterDiazIvan adapterDiazIvan;


    public UserFragment() {
        // Required empty public constructor


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_user, container, false);
    }

}


