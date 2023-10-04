package com.example.practica1.adapters;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.practica1.ActivityUserDetail;
import com.example.practica1.R;
import com.example.practica1.entities.Student;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public class StudentAdapter extends RecyclerView.Adapter<StudentAdapter.StudenViewHolder> {

    private final List<Student> students;

    public StudentAdapter(List<Student> students) {
        this.students = students;
    }

    @NonNull
    @NotNull
    @Override
    public StudenViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_student, parent, false);

        return new StudenViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull StudenViewHolder holder, int position) {
        Student student = students.get(position);

        holder.name.setText(student.getName());
        holder.lastName.setText(student.getLastName());
        holder.id.setText(student.getId());

        holder.sent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Iniciar UserDetailActivity y pasar datos del estudiante como extras
                Intent intent = new Intent(view.getContext(), ActivityUserDetail.class);
                intent.putExtra("student_name", student.getName());
                intent.putExtra("student_last_name", student.getLastName());
                intent.putExtra("student_id", student.getId());
                intent.putExtra("student_email", student.getEmail());
                view.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return students.size();
    }

    public static class StudenViewHolder extends RecyclerView.ViewHolder {

        TextView name;
        TextView lastName;
        TextView id;
        Button sent;

        public StudenViewHolder(@NonNull @NotNull View itemView) {
            super(itemView);

            name = itemView.findViewById(R.id.name);
            lastName = itemView.findViewById(R.id.lastName);
            id = itemView.findViewById(R.id.id);
            sent = itemView.findViewById(R.id.sent);
        }
    }

}
