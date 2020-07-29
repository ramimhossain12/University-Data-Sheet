package com.example.university_data_sheet;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class DataViewHolder  extends RecyclerView.ViewHolder {

   TextView headm,departmentm,employ,student,university;
    public DataViewHolder(@NonNull View itemView) {
        super(itemView);

        headm = itemView.findViewById(R.id.head42ID);
        departmentm = itemView.findViewById(R.id.depertID);
        employ = itemView.findViewById(R.id.employeeID);
        student = itemView.findViewById(R.id.stuID);
        university = itemView.findViewById(R.id.universityID);
    }
}
