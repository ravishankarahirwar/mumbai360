package mumbai.d360.activity;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import mumbai.d360.R;
import mumbai.d360.model.Station;
import mumbai.d360.model.Train;

public class TrainScheduleActivity extends AppCompatActivity {
    TrainScheduleActivityFragment trainScheduleActivityFragment;
    FloatingActionButton share;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_train_schedule);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        String trainkey = getIntent().getExtras().getString("trainkey");
        String source_destination = getIntent().getExtras().getString("source_destination");
        int line = getIntent().getExtras().getInt("line");
        int direction = getIntent().getExtras().getInt("direction");

        setTitle(source_destination);
        trainScheduleActivityFragment =
                (TrainScheduleActivityFragment)getSupportFragmentManager().findFragmentById(R.id.fragment_train_schedule);
        trainScheduleActivityFragment.onTrainSeclected(trainkey,source_destination,line,direction);

        share = (FloatingActionButton) findViewById(R.id.share);
        share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                trainScheduleActivityFragment.setShareIntent();

            }
        });
    }

}
