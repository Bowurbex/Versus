package com.example.jeromeconverset.versus;

import android.renderscript.Sampler;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;
import android.app.Activity;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.AdapterView.OnItemClickListener;

import com.example.jeromeconverset.versus.model.Player;
import com.example.jeromeconverset.versus.model.Tournament;

import static android.R.attr.data;
import static android.R.attr.value;


public class MainActivity extends Activity implements OnItemSelectedListener  {
    public Tournament tournament;
    public TextView textViewContent;
    public Button buttonStartTournament;
    public Button buttonNewTournamentDay;
    public EditText playerOne;
    public EditText playerTwo;
    public EditText numberOfTournamentDays;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewContent = (TextView) findViewById(R.id.tv_content);
        buttonStartTournament = (Button) findViewById(R.id.btn_start_tournament);
        buttonNewTournamentDay = (Button) findViewById(R.id.btn_new_tournamentDay);
        playerOne = (EditText) findViewById(R.id.editTextplayerOne);
        playerTwo = (EditText) findViewById(R.id.editTextplayerTwo);
        numberOfTournamentDays = (EditText) findViewById(R.id.editTextNumberTournamentDays);

        Spinner spinner = (Spinner) findViewById(R.id.spinner);

        spinner.setOnItemSelectedListener(this);

        List selectnumberOfTournamentDays = new ArrayList<>();
        selectnumberOfTournamentDays.add("5 Tournament Days");
        selectnumberOfTournamentDays.add("10 Tournament Days");
        selectnumberOfTournamentDays.add("15 Tournament Days");
        selectnumberOfTournamentDays.add("20 Tournament Days");

        ArrayAdapter dataAdapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item, selectnumberOfTournamentDays);

        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner.setAdapter(dataAdapter);

        buttonStartTournament.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String playerOneFirstName = playerOne.getText().toString();
                String playerTwoFirstName = playerTwo.getText().toString();
                int notd = Integer.parseInt(numberOfTournamentDays.getText().toString());
                startTournament(notd, playerOneFirstName, playerTwoFirstName);
                
                textViewContent.setText(
                        String.format(getResources().getString(R.string.tournament_day_title),
                                tournament.getCurrentTournamentDay().getTournamentDayId(),
                                tournament.getPlayerOne().getFirstName(),
                                tournament.getPlayerTwo().getFirstName()));

                Snackbar.make(v, "CONGRATS you start the tournament", Snackbar.LENGTH_LONG).show();
                buttonStartTournament.setVisibility(View.GONE);
                buttonNewTournamentDay.setVisibility(View.VISIBLE);
            }
        });

        buttonNewTournamentDay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String historic = textViewContent.getText().toString();

                if (!tournament.isTournamentOver()) {
                    startAnotherTournamentDay();
                    historic += "\n\n" + String.format(getResources().getString(R.string.tournament_day_title),
                            tournament.getCurrentTournamentDay().getTournamentDayId(),
                            tournament.getPlayerOne().getFirstName(),
                            tournament.getPlayerTwo().getFirstName());
                    textViewContent.setText(historic);

                    Snackbar.make(v, "CONGRATS you start a new day", Snackbar.LENGTH_LONG).show();
                } else {
                    buttonNewTournamentDay.setVisibility(View.INVISIBLE);
                    Snackbar.make(v, "You may not start new day because of the tournament is Over", Snackbar.LENGTH_LONG).show();
                }
            }
        });




    }

    public void startTournament(int numberOfTournament, String playerOneFirstName, String playerTwoFirstName) {
        Player playerOne = new Player(playerOneFirstName);
        Player playerTwo = new Player(playerTwoFirstName);

        tournament = new Tournament(numberOfTournament, playerOne, playerTwo);
    }

    public void startAnotherTournamentDay() {
        tournament.addTournamentDay();
    }

}

