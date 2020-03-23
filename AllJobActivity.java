package com.example.myjobs;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import models.Data;

public class AllJobActivity extends AppCompatActivity {
    private Toolbar toolbar;
    //Recycler
    private RecyclerView recyclerView;
    //Firebase
    private DatabaseReference mAllJobPost;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_job);
        toolbar=findViewById(R.id.all_job_post);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("All Job Post");
        //Database
        mAllJobPost=FirebaseDatabase.getInstance().getReference().child("Public database");
        mAllJobPost.keepSynced(true);

        recyclerView=findViewById(R.id.recycler_all_job);
        Context context;
        LinearLayoutManager layoutManager=new LinearLayoutManager(this);
        layoutManager.setReverseLayout(true);
        layoutManager.setStackFromEnd(true);

        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(layoutManager);
    }
    @Override
    protected void onStart() {

        super.onStart();
        FirebaseRecyclerAdapter<Data,AllJobPostViewHolder>adapter=new FirebaseRecyclerAdapter<Data, AllJobPostViewHolder>
                (
                        Data.class,
                        R.layout.alljobpost,
                        AllJobPostViewHolder.class,
                        mAllJobPost
                ) {
            @Override
            protected void onBindViewHolder(@NonNull AllJobPostViewHolder allJobPostViewHolder, int i, @NonNull Data data) {

            }

            @NonNull
            @Override
            public AllJobPostViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
                return null;
                RecyclerView.ViewHolder.setJobTitle(model.getTitle());
                RecyclerView.ViewHolder.setJobDate(model.getDate());
                RecyclerView.ViewHolder.setJobDescription(model.getDescription());
                RecyclerView.ViewHolder.setJobSkills(model.getSkills());
                RecyclerView.ViewHolder.setjobSalary(model.getSalary());

            }
        };
        recyclerView.setAdapter(adapter);
    }
    public static class AllJobPostViewHolder extends RecyclerView.ViewHolder{
        View myview;


        public AllJobPostViewHolder(@NonNull View itemView) {
            super(itemView);
            myview=itemView;
        }

        public void setJobTitle(String title) {
            TextView mTitle=myview.findViewById(R.id.all_job_post_title);
            mTitle.setText(title);
        }
        public void setJobDate(String date){
            TextView mTitle=myview.findViewById(R.id.all_job_post_date);
            mTitle.setText(date);
        }

        public void setJobDescription(String description) {
            TextView mTitle=myview.findViewById(R.id.all_job_post_description);
            mTitle.setText(description);
        }

        public void setJobSkills(String skills) {
            TextView mTitle=myview.findViewById(R.id.all_job_post_skills);
            mTitle.setText(skills);
        }

        public void setSalary(String salary) {
            TextView mTitle=myview.findViewById(R.id.all_job_post_salary);
            mTitle.setText(salary);
        }
    }
}