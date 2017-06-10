package teamberg.chillapp;

import android.content.Intent;
import android.os.CountDownTimer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;


public class BreatheActivity extends AppCompatActivity {

    private ImageButton mHomeButton;
    private ImageButton mSettingsButton;
    private Button mStartButton;
    private TextView mDisplayTextView;
    private ImageView mStepImageView;
    private TextView mStepTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_breathe);


        mSettingsButton = (ImageButton)findViewById(R.id.setting_button);
        mSettingsButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent i = new Intent(BreatheActivity.this, SettingzActivity.class);
                startActivity(i);
            }
        });


        mHomeButton = (ImageButton)findViewById(R.id.home_button);
        mHomeButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent i = new Intent(BreatheActivity.this, MainActivity.class);
                startActivity(i);
            }
        });


        mStartButton = (Button)findViewById(R.id.start_button);
        mDisplayTextView = (TextView) findViewById(R.id.display_textview);
        mStepTextView = (TextView) findViewById(R.id.step_textview);
        mStepImageView = (ImageView) findViewById(R.id.step_imageview);

        // Start button for breathe exercises
        mStartButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                // Brings up "get ready" image for 3 seconds
                mStepImageView.setVisibility(View.VISIBLE);
                mStepImageView.setImageResource(R.drawable.getready);
                mStepTextView.setText("");

                final Handler handler0 = new Handler();
                handler0.postDelayed(new Runnable() {
                    @Override

                    // do something after 3000 millisecond delay
                    public void run() {

                        // adjust the milli seconds here for inhale/exhale time
                        new CountDownTimer(2000, 500) {

                            public void onTick(long millisUntilFinished) {
                                mDisplayTextView.setText("" + millisUntilFinished / 1000);
                                mStepImageView.setVisibility(View.VISIBLE);
                                mStepImageView.setImageResource(R.drawable.breathein);
                                mStepTextView.setText("Breathe in.");
                            }
                            public void onFinish() {
                            }
                        }.start();
                    }
                }, 3000);


                final Handler handler1 = new Handler();
                handler1.postDelayed(new Runnable() {
                    @Override

                    // do something after 5000 millisecond delay
                    public void run() {

                        // adjust the milli seconds here for inhale/exhale time
                        new CountDownTimer(2000, 500) {

                            public void onTick(long millisUntilFinished) {
                                mDisplayTextView.setText("" + millisUntilFinished / 1000);
                                mStepImageView.setVisibility(View.VISIBLE);
                                mStepImageView.setImageResource(R.drawable.breatheout);
                                mStepTextView.setText("Breathe out.");
                            }
                            public void onFinish() {
                            }
                        }.start();

                    }
                }, 5000);


                final Handler handler2 = new Handler();
                handler2.postDelayed(new Runnable() {
                    @Override

                    // do something after 7000 millisecond delay
                    public void run() {

                        // adjust the milli seconds here for inhale/exhale time
                        new CountDownTimer(2000, 500) {

                            public void onTick(long millisUntilFinished) {
                                mDisplayTextView.setText("" + millisUntilFinished / 1000);
                                mStepImageView.setVisibility(View.VISIBLE);
                                mStepImageView.setImageResource(R.drawable.breathein);
                                mStepTextView.setText("Breathe in.");
                            }
                            public void onFinish() {
                            }
                        }.start();

                    }
                }, 7000);


                final Handler handler3 = new Handler();
                handler3.postDelayed(new Runnable() {
                    @Override

                    // do something after 9000 millisecond delay
                    public void run() {

                        // adjust the milli seconds here for inhale/exhale time
                        new CountDownTimer(3000, 500) {

                            public void onTick(long millisUntilFinished) {
                                mDisplayTextView.setText("" + millisUntilFinished / 1000);
                                mStepImageView.setVisibility(View.VISIBLE);
                                mStepImageView.setImageResource(R.drawable.breatheout);
                                mStepTextView.setText("Breathe out.");
                            }
                            public void onFinish() {
                            }
                        }.start();

                    }
                }, 9000);


                final Handler handler4 = new Handler();
                handler4.postDelayed(new Runnable() {
                    @Override

                    // do something after 12000 millisecond delay
                    public void run() {

                        // adjust the milli seconds here for inhale/exhale time
                        new CountDownTimer(2000, 500) {

                            public void onTick(long millisUntilFinished) {
                                mDisplayTextView.setText("" + millisUntilFinished / 1000);
                                mStepImageView.setVisibility(View.VISIBLE);
                                mStepImageView.setImageResource(R.drawable.breathein);
                                mStepTextView.setText("Breathe in.");
                            }
                            public void onFinish() {
                            }
                        }.start();

                    }
                }, 12000);


                final Handler handler5 = new Handler();
                handler5.postDelayed(new Runnable() {
                    @Override

                    // do something after 14000 millisecond delay
                    public void run() {

                        // adjust the milli seconds here for inhale/exhale time
                        new CountDownTimer(4000, 500) {

                            public void onTick(long millisUntilFinished) {
                                mDisplayTextView.setText("" + millisUntilFinished / 1000);
                                mStepImageView.setVisibility(View.VISIBLE);
                                mStepImageView.setImageResource(R.drawable.breatheout);
                                mStepTextView.setText("Breathe out.");
                            }
                            public void onFinish() {
                            }
                        }.start();

                    }
                }, 14000);


                final Handler handler6 = new Handler();
                handler6.postDelayed(new Runnable() {
                    @Override

                    // do something after 18000 millisecond delay
                    public void run() {

                        // adjust the milli seconds here for inhale/exhale time
                        new CountDownTimer(2000, 500) {

                            public void onTick(long millisUntilFinished) {
                                mDisplayTextView.setText("" + millisUntilFinished / 1000);
                                mStepImageView.setVisibility(View.VISIBLE);
                                mStepImageView.setImageResource(R.drawable.breathein);
                                mStepTextView.setText("Breathe in.");
                            }
                            public void onFinish() {
                            }
                        }.start();

                    }
                }, 18000);


                final Handler handler7 = new Handler();
                handler7.postDelayed(new Runnable() {
                    @Override

                    // do something after 20000 millisecond delay
                    public void run() {

                        // adjust the milli seconds here for inhale/exhale time
                        new CountDownTimer(5000, 500) {

                            public void onTick(long millisUntilFinished) {
                                mDisplayTextView.setText("" + millisUntilFinished / 1000);
                                mStepImageView.setVisibility(View.VISIBLE);
                                mStepImageView.setImageResource(R.drawable.breatheout);
                                mStepTextView.setText("Breathe out.");
                            }
                            public void onFinish() {
                                mDisplayTextView.setText("2");
                                mStepImageView.setVisibility(View.GONE);
                                mStepTextView.setText("done!");
                            }
                        }.start();

                    }
                }, 20000);

            }
        });
    }
}
