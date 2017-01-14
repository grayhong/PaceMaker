package com.example.q.pacemaker;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

import android.os.Bundle;

import com.example.q.pacemaker.Adapters.GoalAdapter;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class CommunityGoals extends AppCompatActivity {

    private RecyclerView recyclerView;
    private StaggeredGridLayoutManager staggeredGridLayoutManager;
    private GoalAdapter goalAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_community_goals);

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view_community_goals);
        staggeredGridLayoutManager = new StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.HORIZONTAL);
        goalAdapter = new GoalAdapter(this, getTestGoalItem());

        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(staggeredGridLayoutManager);
        recyclerView.setAdapter(goalAdapter);
    }

    private JSONArray getTestGoalItem() {

        JSONArray test = new JSONArray();

        try {
            JSONObject weight = new JSONObject();
            weight.put("title", "웨이트 트레이닝");
            weight.put("photo", "http://gaslightchiro.com/files/bigstock/2014/07/Beautiful-Young-Female-Exercis-58884710.jpg?w=1060&h=795&a=t");

            JSONObject running = new JSONObject();
            running.put("title", "유산소 운동");
            running.put("photo", "https://static1.squarespace.com/static/557b65c2e4b00283cf1ca9b0/t/5585d703e4b0d4f1a8bc4dc2/1434834698106/shutterstock_139712587.jpg?format=2500w");

            JSONObject study = new JSONObject();
            study.put("title", "스터디");
            study.put("photo", "http://media.salemwebnetwork.com/cms/BST/12790-books-bible-study-school-hands.800w.tn.jpg");

            JSONObject explore = new JSONObject();
            explore.put("title", "탐험");
            explore.put("photo", "https://www.gapyear.com/history-of-travel/images/future-travel.jpg");

            JSONObject travel = new JSONObject();
            travel.put("title", "여행");
            travel.put("photo", "http://www.houseoftravel.co.nz/images/default-source/hot-stores/paris84f1d68287e2639a85d9ff0000167a3d.jpg");

            JSONObject programming = new JSONObject();
            programming.put("title", "프로그래밍");
            programming.put("photo", "http://media02.hongkiat.com/programming-myth/programmer.jpg");

            test.put(weight);
            test.put(running);
            test.put(study);
            test.put(explore);
            test.put(travel);
            test.put(programming);

        } catch (JSONException e) {
            e.printStackTrace();
        }
        return test;
    }
}
