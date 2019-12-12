package com.zenith.esoftwaricathidassignment.fragments;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

import com.zenith.esoftwaricathidassignment.R;
import com.zenith.esoftwaricathidassignment.listClass;
import com.zenith.esoftwaricathidassignment.models.studentModel;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class studentFragment extends Fragment implements View.OnClickListener {


    public studentFragment() {
        // Required empty public constructor
    }

    private TextView txtfullname, txtage, txtaddress;

    private RadioButton radioMale, radioFemale, radioOthers;

    private Button btnsave;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_student, container, false);

        txtfullname=view.findViewById(R.id.txtformname);
        txtage=view.findViewById(R.id.txtformage);
        txtaddress=view.findViewById(R.id.txtformaddress);

        radioMale=view.findViewById(R.id.radiomale);
        radioFemale=view.findViewById(R.id.radiofemale);
        radioOthers=view.findViewById(R.id.radioothers);
        btnsave=view.findViewById(R.id.btncalculates);

        btnsave.setOnClickListener(this);

        return view;
    }


    @Override
    public void onClick(View v) {

        List<studentModel> studentlist= new ArrayList<>();

        String username=txtfullname.getText().toString();
        String age=txtage.getText().toString();
        String address=txtaddress.getText().toString();





        studentlist.add(new studentModel(username,age,address,"female"));


        listClass listClass= new listClass();

        listClass.setListofstudent(studentlist);
        Toast.makeText(getContext(), "INSERTED!!", Toast.LENGTH_SHORT).show();



    }
}
