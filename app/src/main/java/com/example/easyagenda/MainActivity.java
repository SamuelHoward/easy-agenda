package com.example.easyagenda;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Called when the user taps the "Active Agenda" button
    public void goToActiveAgenda(View view) {
        Intent intent = new Intent(this, ActiveAgendaActivity.class);
        startActivity(intent);
    }

    // Called when the user taps the "New Agenda" button
    public void goToNewAgenda(View view) {
        Intent intent = new Intent(this, NewAgendaActivity.class);
        startActivity(intent);
    }

    // Called when the user taps the "Saved Agendas" button
    public void goToSavedAgendas(View view) {
        Intent intent = new Intent(this, SavedAgendasActivity.class);
        startActivity(intent);
    }
}
