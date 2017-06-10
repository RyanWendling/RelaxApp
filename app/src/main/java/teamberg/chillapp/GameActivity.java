package teamberg.chillapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;


public class GameActivity extends AppCompatActivity {

    private ImageButton mHomeButton;
    private ImageButton mSettingsButton;
    private ImageButton mbubb1Button;
    private ImageButton mbubb2Button;
    private ImageButton mbubb3Button;
    private ImageButton mbubb4Button;
    private ImageButton mbubb5Button;
    private ImageButton mbubb6Button;
    private TextView value;

    // counter gives us the total amount of bubbles popped
    private static int counter = 0;
    private String stringVal;
    // when popped equals 6, we make the bubbles visible on the screen again.
    private static int popped = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        popped = 0;

        value = (TextView) findViewById(R.id.point_TextView);

        mSettingsButton = (ImageButton)findViewById(R.id.setting_button);
        mSettingsButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent i = new Intent(GameActivity.this, SettingzActivity.class);
                startActivity(i);
            }
        });

        mHomeButton = (ImageButton)findViewById(R.id.home_button);
        mHomeButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent i = new Intent(GameActivity.this, MainActivity.class);
                startActivity(i);
            }
        });

        mbubb1Button = (ImageButton)findViewById(R.id.bubb1_button);
        mbubb1Button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                mbubb1Button.setVisibility(View.GONE);
                counter++;
                popped++;
                stringVal = Integer.toString(counter);
                value.setText("Score: " + stringVal);
                if (popped % 6 == 0) {
                    mbubb1Button.setVisibility(View.VISIBLE);
                    mbubb2Button.setVisibility(View.VISIBLE);
                    mbubb3Button.setVisibility(View.VISIBLE);
                    mbubb4Button.setVisibility(View.VISIBLE);
                    mbubb5Button.setVisibility(View.VISIBLE);
                    mbubb6Button.setVisibility(View.VISIBLE);
                }
            }
        });

        mbubb2Button = (ImageButton)findViewById(R.id.bubb2_button);
        mbubb2Button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                mbubb2Button.setVisibility(View.GONE);
                counter++;
                popped++;
                stringVal = Integer.toString(counter);
                value.setText("Score: " + stringVal);

                if (popped % 6 == 0) {
                    mbubb1Button.setVisibility(View.VISIBLE);
                    mbubb2Button.setVisibility(View.VISIBLE);
                    mbubb3Button.setVisibility(View.VISIBLE);
                    mbubb4Button.setVisibility(View.VISIBLE);
                    mbubb5Button.setVisibility(View.VISIBLE);
                    mbubb6Button.setVisibility(View.VISIBLE);
                }
            }
        });

        mbubb3Button = (ImageButton)findViewById(R.id.bubb3_button);
        mbubb3Button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                mbubb3Button.setVisibility(View.GONE);
                counter++;
                popped++;
                stringVal = Integer.toString(counter);
                value.setText("Score: " + stringVal);

                if (popped % 6 == 0) {
                    mbubb1Button.setVisibility(View.VISIBLE);
                    mbubb2Button.setVisibility(View.VISIBLE);
                    mbubb3Button.setVisibility(View.VISIBLE);
                    mbubb4Button.setVisibility(View.VISIBLE);
                    mbubb5Button.setVisibility(View.VISIBLE);
                    mbubb6Button.setVisibility(View.VISIBLE);
                }
            }
        });

        mbubb4Button = (ImageButton)findViewById(R.id.bubb4_button);
        mbubb4Button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                mbubb4Button.setVisibility(View.GONE);
                counter++;
                popped++;
                stringVal = Integer.toString(counter);
                value.setText("Score: " + stringVal);

                if (popped % 6 == 0) {
                    mbubb1Button.setVisibility(View.VISIBLE);
                    mbubb2Button.setVisibility(View.VISIBLE);
                    mbubb3Button.setVisibility(View.VISIBLE);
                    mbubb4Button.setVisibility(View.VISIBLE);
                    mbubb5Button.setVisibility(View.VISIBLE);
                    mbubb6Button.setVisibility(View.VISIBLE);
                }
            }
        });

        mbubb5Button = (ImageButton)findViewById(R.id.bubb5_button);
        mbubb5Button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                mbubb5Button.setVisibility(View.GONE);
                counter++;
                popped++;
                stringVal = Integer.toString(counter);
                value.setText("Score: " + stringVal);

                if (popped % 6 == 0) {
                    mbubb1Button.setVisibility(View.VISIBLE);
                    mbubb2Button.setVisibility(View.VISIBLE);
                    mbubb3Button.setVisibility(View.VISIBLE);
                    mbubb4Button.setVisibility(View.VISIBLE);
                    mbubb5Button.setVisibility(View.VISIBLE);
                    mbubb6Button.setVisibility(View.VISIBLE);
                }
            }
        });

        mbubb6Button = (ImageButton)findViewById(R.id.bubb6_button);
        mbubb6Button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                mbubb6Button.setVisibility(View.GONE);
                counter++;
                popped++;
                stringVal = Integer.toString(counter);
                value.setText("Score: " + stringVal);

                if (popped % 6 == 0) {
                    mbubb1Button.setVisibility(View.VISIBLE);
                    mbubb2Button.setVisibility(View.VISIBLE);
                    mbubb3Button.setVisibility(View.VISIBLE);
                    mbubb4Button.setVisibility(View.VISIBLE);
                    mbubb5Button.setVisibility(View.VISIBLE);
                    mbubb6Button.setVisibility(View.VISIBLE);
                }
            }
        });
    }
}
