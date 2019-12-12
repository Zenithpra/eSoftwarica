package com.zenith.esoftwaricathidassignment.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.zenith.esoftwaricathidassignment.R;
import com.zenith.esoftwaricathidassignment.models.studentModel;

import java.util.ArrayList;
import java.util.List;

public class homeAdapter extends RecyclerView.Adapter<homeAdapter.HomeViewHolder> {


    Context mContent;
    List<studentModel> studentList = new ArrayList<>();

    public homeAdapter(Context mContent) {
        this.mContent = mContent;
        studentList.add(new studentModel("zenith", "21", "ash", "male"));
        studentList.add(new studentModel("ki", "20", "aaa", "female"));

    }

    @NonNull
    @Override
    public HomeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.homeview, parent, false);

        return new HomeViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull final HomeViewHolder holder, final int position) {
        final studentModel studentModel = studentList.get(position);
        holder.txtName.setText(studentModel.getName());
        holder.txtAge.setText(studentModel.getAge());
        holder.txtLocation.setText(studentModel.getLocation());
        holder.txtGender.setText(studentModel.getGender());

        String gender = holder.txtGender.getText().toString();


        if (gender.equals("male")) {
            holder.imgStudent.setImageResource(R.drawable.male);
        } else {
            holder.imgStudent.setImageResource(R.drawable.female);
        }


        holder.btnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                studentList.remove(position);
                notifyItemRemoved(position);

            }
        });


        holder.imgStudent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = holder.txtName.getText().toString();
                Toast.makeText(mContent, "Hello This is " + name, Toast.LENGTH_SHORT).show();
            }
        });


    }


    @Override
    public int getItemCount() {
        return studentList.size();
    }

    public class HomeViewHolder extends RecyclerView.ViewHolder {

        private TextView txtName, txtAge, txtLocation, txtGender;
        private ImageButton btnDelete;
        private ImageView imgStudent;

        public HomeViewHolder(@NonNull View itemView) {
            super(itemView);
            txtName = itemView.findViewById(R.id.txtname);
            txtAge = itemView.findViewById(R.id.txtage);
            txtLocation = itemView.findViewById(R.id.txtlocation);
            txtGender = itemView.findViewById(R.id.txtgender);
            imgStudent = itemView.findViewById(R.id.imgstudent);

            btnDelete = itemView.findViewById(R.id.btndelete);


        }
    }
}
