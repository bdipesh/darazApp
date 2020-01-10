package com.example.darazapp.ui.dashboard;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.darazapp.R;
import com.example.darazapp.SignupActivity;

public class DashboardFragment extends Fragment implements View.OnClickListener {

    private DashboardViewModel dashboardViewModel;
    private Button btnsignup,btnLogin;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_dashboard, container, false);
        btnsignup=root.findViewById(R.id.btnsignup);
        btnsignup.setOnClickListener(this);
        return root;
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.btnsignup:
                Intent intent =new Intent(getContext(), SignupActivity.class);
                startActivity(intent);
        }
    }
}