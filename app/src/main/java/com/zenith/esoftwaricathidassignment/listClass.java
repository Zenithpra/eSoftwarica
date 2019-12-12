package com.zenith.esoftwaricathidassignment;


import com.zenith.esoftwaricathidassignment.models.studentModel;

import java.util.ArrayList;
import java.util.List;

public class listClass {

    List<studentModel> listofstudent= new ArrayList<>();




    public List<studentModel> getListofstudent() {
        listofstudent.add(new studentModel("sandesh","1000","asgard","male"));
        listofstudent.add(new studentModel("esh","2000","ard","female"));



        return listofstudent;
    }

    public void setListofstudent(List<studentModel> listofstudent) {


        this.listofstudent = listofstudent;
    }
}
