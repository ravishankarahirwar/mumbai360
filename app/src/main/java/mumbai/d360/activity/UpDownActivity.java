package mumbai.d360.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;

import java.util.List;

import mumbai.d360.R;
import mumbai.d360.callbacks.OnTrainSelect;
import mumbai.d360.database.contentvalue.TrainInfo;
import mumbai.d360.database.offlinedb.MessageDBAdapter;
import mumbai.d360.model.Station;
import mumbai.d360.model.Train;

public class UpDownActivity extends AppCompatActivity implements OnTrainSelect {
    UpDownActivityFragment instanceFragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_up_down);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

         instanceFragment=
                (UpDownActivityFragment)getSupportFragmentManager().findFragmentById(R.id.fragment_updown);

        String stationName = getIntent().getExtras().getString("station_name");
        String stKey = getIntent().getExtras().getString("stKey");
        int line = getIntent().getExtras().getInt("line");

        Station station = new Station();
        station.setName(stationName);
        station.setStationCode(stKey);
        station.setLineIndicator(line);
        setTitle(stationName);

        if(instanceFragment != null) {
            instanceFragment.onStationSelect(station);
        }
    }

    @Override
    public void onTrainSelect(Train trainInfo) {
        Intent intent = new Intent(UpDownActivity.this, TrainScheduleActivity.class);
        intent.putExtra("trainkey", trainInfo.getTrainKey());
        intent.putExtra("source_destination", trainInfo.getSource() + " - " + trainInfo.getDestination());
        intent.putExtra("line", trainInfo.getLineIndicator());
        intent.putExtra("direction", trainInfo.getDirection());
        startActivity(intent);
    }
}
