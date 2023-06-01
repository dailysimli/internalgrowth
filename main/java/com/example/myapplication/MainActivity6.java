package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity6 extends AppCompatActivity {

    private Button btn_move5;


    private RadioGroup rg97, rg98, rg99, rg100,rg101, rg102, rg103, rg104, rg105, rg106, rg107, rg108, rg109, rg110, rg111, rg112, rg113, rg114; // 한 문제
    private RadioButton rb97_1, rb97_2, rb97_3, rb97_4, rb97_5;
    private RadioButton rb98_1, rb98_2, rb98_3, rb98_4, rb98_5;
    private RadioButton rb99_1, rb99_2, rb99_3, rb99_4, rb99_5;
    private RadioButton rb100_1, rb100_2, rb100_3, rb100_4, rb100_5;
    private RadioButton rb101_1, rb101_2, rb101_3, rb101_4, rb101_5;
    private RadioButton rb102_1, rb102_2, rb102_3, rb102_4, rb102_5;
    private RadioButton rb103_1, rb103_2, rb103_3, rb103_4, rb103_5;
    private RadioButton rb104_1, rb104_2, rb104_3, rb104_4, rb104_5;
    private RadioButton rb105_1, rb105_2, rb105_3, rb105_4, rb105_5;
    private RadioButton rb106_1, rb106_2, rb106_3, rb106_4, rb106_5;
    private RadioButton rb107_1, rb107_2, rb107_3, rb107_4, rb107_5;
    private RadioButton rb108_1, rb108_2, rb108_3, rb108_4, rb108_5;
    private RadioButton rb109_1, rb109_2, rb109_3, rb109_4, rb109_5;
    private RadioButton rb110_1, rb110_2, rb110_3, rb110_4, rb110_5;
    private RadioButton rb111_1, rb111_2, rb111_3, rb111_4, rb111_5;
    private RadioButton rb112_1, rb112_2, rb112_3, rb112_4, rb112_5;
    private RadioButton rb113_1, rb113_2, rb113_3, rb113_4, rb113_5;
    private RadioButton rb114_1, rb114_2, rb114_3, rb114_4, rb114_5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        btn_move5 = (Button) findViewById(R.id.btn_move5);

        rg97 = findViewById(R.id.rg97);//라디오 버튼을 담고 있는 그룹
        rb97_1 = findViewById(R.id.rb97_1); //라디오 버튼
        rb97_2 = findViewById(R.id.rb97_2); //라디오 버튼
        rb97_3 = findViewById(R.id.rb97_3);
        rb97_4 = findViewById(R.id.rb97_4);
        rb97_5 = findViewById(R.id.rb97_5);

        rg98 = findViewById(R.id.rg98);//라디오 버튼을 담고 있는 그룹
        rb98_1 = findViewById(R.id.rb98_1); //라디오 버튼
        rb98_2 = findViewById(R.id.rb98_2); //라디오 버튼
        rb98_3 = findViewById(R.id.rb98_3);
        rb98_4 = findViewById(R.id.rb98_4);
        rb98_5 = findViewById(R.id.rb98_5);

        rg99 = findViewById(R.id.rg99);//라디오 버튼을 담고 있는 그룹
        rb99_1 = findViewById(R.id.rb99_1); //라디오 버튼
        rb99_2 = findViewById(R.id.rb99_2); //라디오 버튼
        rb99_3 = findViewById(R.id.rb99_3);
        rb99_4 = findViewById(R.id.rb99_4);
        rb99_5 = findViewById(R.id.rb99_5);

        rg100 = findViewById(R.id.rg100);//라디오 버튼을 담고 있는 그룹
        rb100_1 = findViewById(R.id.rb100_1); //라디오 버튼
        rb100_2 = findViewById(R.id.rb100_2); //라디오 버튼
        rb100_3 = findViewById(R.id.rb100_3);
        rb100_4 = findViewById(R.id.rb100_4);
        rb100_5 = findViewById(R.id.rb100_5);


        rg101 = findViewById(R.id.rg101);//라디오 버튼을 담고 있는 그룹
        rb101_1 = findViewById(R.id.rb101_1); //라디오 버튼
        rb101_2 = findViewById(R.id.rb101_2); //라디오 버튼
        rb101_3 = findViewById(R.id.rb101_3);
        rb101_4 = findViewById(R.id.rb101_4);
        rb101_5 = findViewById(R.id.rb101_5);

        rg102 = findViewById(R.id.rg102);//라디오 버튼을 담고 있는 그룹
        rb102_1 = findViewById(R.id.rb102_1); //라디오 버튼
        rb102_2 = findViewById(R.id.rb102_2); //라디오 버튼
        rb102_3 = findViewById(R.id.rb102_3);
        rb102_4 = findViewById(R.id.rb102_4);
        rb102_5 = findViewById(R.id.rb102_5);

        rg103 = findViewById(R.id.rg103);//라디오 버튼을 담고 있는 그룹
        rb103_1 = findViewById(R.id.rb103_1); //라디오 버튼
        rb103_2 = findViewById(R.id.rb103_2); //라디오 버튼
        rb103_3 = findViewById(R.id.rb103_3);
        rb103_4 = findViewById(R.id.rb103_4);
        rb103_5 = findViewById(R.id.rb103_5);

        rg104 = findViewById(R.id.rg104);//라디오 버튼을 담고 있는 그룹
        rb104_1 = findViewById(R.id.rb104_1); //라디오 버튼
        rb104_2 = findViewById(R.id.rb104_2); //라디오 버튼
        rb104_3 = findViewById(R.id.rb104_3);
        rb104_4 = findViewById(R.id.rb104_4);
        rb104_5 = findViewById(R.id.rb104_5);

        rg105 = findViewById(R.id.rg105);//라디오 버튼을 담고 있는 그룹
        rb105_1 = findViewById(R.id.rb105_1); //라디오 버튼
        rb105_2 = findViewById(R.id.rb105_2); //라디오 버튼
        rb105_3 = findViewById(R.id.rb105_3);
        rb105_4 = findViewById(R.id.rb105_4);
        rb105_5 = findViewById(R.id.rb105_5);

        rg106 = findViewById(R.id.rg106);//라디오 버튼을 담고 있는 그룹
        rb106_1 = findViewById(R.id.rb106_1); //라디오 버튼
        rb106_2 = findViewById(R.id.rb106_2); //라디오 버튼
        rb106_3 = findViewById(R.id.rb106_3);
        rb106_4 = findViewById(R.id.rb106_4);
        rb106_5 = findViewById(R.id.rb106_5);

        rg107 = findViewById(R.id.rg107);//라디오 버튼을 담고 있는 그룹
        rb107_1 = findViewById(R.id.rb107_1); //라디오 버튼
        rb107_2 = findViewById(R.id.rb107_2); //라디오 버튼
        rb107_3 = findViewById(R.id.rb107_3);
        rb107_4 = findViewById(R.id.rb107_4);
        rb107_5 = findViewById(R.id.rb107_5);

        rg108 = findViewById(R.id.rg108);//라디오 버튼을 담고 있는 그룹
        rb108_1 = findViewById(R.id.rb108_1); //라디오 버튼
        rb108_2 = findViewById(R.id.rb108_2); //라디오 버튼
        rb108_3 = findViewById(R.id.rb108_3);
        rb108_4 = findViewById(R.id.rb108_4);
        rb108_5 = findViewById(R.id.rb108_5);

        rg109 = findViewById(R.id.rg109);//라디오 버튼을 담고 있는 그룹
        rb109_1 = findViewById(R.id.rb109_1); //라디오 버튼
        rb109_2 = findViewById(R.id.rb109_2); //라디오 버튼
        rb109_3 = findViewById(R.id.rb109_3);
        rb109_4 = findViewById(R.id.rb109_4);
        rb109_5 = findViewById(R.id.rb109_5);

        rg110 = findViewById(R.id.rg110);//라디오 버튼을 담고 있는 그룹
        rb110_1 = findViewById(R.id.rb110_1); //라디오 버튼
        rb110_2 = findViewById(R.id.rb110_2); //라디오 버튼
        rb110_3 = findViewById(R.id.rb110_3);
        rb110_4 = findViewById(R.id.rb110_4);
        rb110_5 = findViewById(R.id.rb110_5);

        rg111 = findViewById(R.id.rg111);//라디오 버튼을 담고 있는 그룹
        rb111_1 = findViewById(R.id.rb111_1); //라디오 버튼
        rb111_2 = findViewById(R.id.rb111_2); //라디오 버튼
        rb111_3 = findViewById(R.id.rb111_3);
        rb111_4 = findViewById(R.id.rb111_4);
        rb111_5 = findViewById(R.id.rb111_5);

        rg112 = findViewById(R.id.rg112);//라디오 버튼을 담고 있는 그룹
        rb112_1 = findViewById(R.id.rb112_1); //라디오 버튼
        rb112_2 = findViewById(R.id.rb112_2); //라디오 버튼
        rb112_3 = findViewById(R.id.rb112_3);
        rb112_4 = findViewById(R.id.rb112_4);
        rb112_5 = findViewById(R.id.rb112_5);

        rg113 = findViewById(R.id.rg113);//라디오 버튼을 담고 있는 그룹
        rb113_1 = findViewById(R.id.rb113_1); //라디오 버튼
        rb113_2 = findViewById(R.id.rb113_2); //라디오 버튼
        rb113_3 = findViewById(R.id.rb113_3);
        rb113_4 = findViewById(R.id.rb113_4);
        rb113_5 = findViewById(R.id.rb113_5);

        rg114 = findViewById(R.id.rg114);//라디오 버튼을 담고 있는 그룹
        rb114_1 = findViewById(R.id.rb114_1); //라디오 버튼
        rb114_2 = findViewById(R.id.rb114_2); //라디오 버튼
        rb114_3 = findViewById(R.id.rb114_3);
        rb114_4 = findViewById(R.id.rb114_4);
        rb114_5 = findViewById(R.id.rb114_5);

        rg97.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override // 라디오 버튼들의 상태 값의 변경됨을 감지
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb97_1) {
                    Toast.makeText(MainActivity6.this, "매우 그렇지 않다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(96,1);


                } else if (i == R.id.rb97_2) {
                    Toast.makeText(MainActivity6.this, "그렇지 않다.", Toast.LENGTH_SHORT).show();
                    AnswerData.result(96,2);

                } else if (i == R.id.rb97_3) {
                    Toast.makeText(MainActivity6.this, "보통이다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(96,3);

                } else if (i == R.id.rb97_4) {
                    Toast.makeText(MainActivity6.this, "그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(96,4);

                } else if (i == R.id.rb97_5) {
                    Toast.makeText(MainActivity6.this, "매우 그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(96,5);
                }

            }
        });

        rg98.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override // 라디오 버튼들의 상태 값의 변경됨을 감지
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb98_1) {
                    Toast.makeText(MainActivity6.this, "매우 그렇지 않다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(97,1);


                } else if (i == R.id.rb98_2) {
                    Toast.makeText(MainActivity6.this, "그렇지 않다.", Toast.LENGTH_SHORT).show();
                    AnswerData.result(97,2);

                } else if (i == R.id.rb98_3) {
                    Toast.makeText(MainActivity6.this, "보통이다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(97,3);

                } else if (i == R.id.rb98_4) {
                    Toast.makeText(MainActivity6.this, "그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(97,4);

                } else if (i == R.id.rb98_5) {
                    Toast.makeText(MainActivity6.this, "매우 그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(97,5);
                }

            }
        });

        rg99.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override // 라디오 버튼들의 상태 값의 변경됨을 감지
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb99_1) {
                    Toast.makeText(MainActivity6.this, "매우 그렇지 않다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(98,1);


                } else if (i == R.id.rb99_2) {
                    Toast.makeText(MainActivity6.this, "그렇지 않다.", Toast.LENGTH_SHORT).show();
                    AnswerData.result(98,2);

                } else if (i == R.id.rb99_3) {
                    Toast.makeText(MainActivity6.this, "보통이다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(98,3);

                } else if (i == R.id.rb99_4) {
                    Toast.makeText(MainActivity6.this, "그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(98,4);

                } else if (i == R.id.rb99_5) {
                    Toast.makeText(MainActivity6.this, "매우 그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(98,5);
                }

            }
        });

        rg100.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override // 라디오 버튼들의 상태 값의 변경됨을 감지
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb100_1) {
                    Toast.makeText(MainActivity6.this, "매우 그렇지 않다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(99,1);


                } else if (i == R.id.rb100_2) {
                    Toast.makeText(MainActivity6.this, "그렇지 않다.", Toast.LENGTH_SHORT).show();
                    AnswerData.result(99,2);

                } else if (i == R.id.rb100_3) {
                    Toast.makeText(MainActivity6.this, "보통이다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(99,3);

                } else if (i == R.id.rb100_4) {
                    Toast.makeText(MainActivity6.this, "그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(99,4);

                } else if (i == R.id.rb100_5) {
                    Toast.makeText(MainActivity6.this, "매우 그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(99,5);
                }

            }
        });

        rg101.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override // 라디오 버튼들의 상태 값의 변경됨을 감지
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb101_1) {
                    Toast.makeText(MainActivity6.this, "매우 그렇지 않다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(100,1);


                } else if (i == R.id.rb101_2) {
                    Toast.makeText(MainActivity6.this, "그렇지 않다.", Toast.LENGTH_SHORT).show();
                    AnswerData.result(100,2);

                } else if (i == R.id.rb101_3) {
                    Toast.makeText(MainActivity6.this, "보통이다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(100,3);

                } else if (i == R.id.rb101_4) {
                    Toast.makeText(MainActivity6.this, "그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(100,4);

                } else if (i == R.id.rb101_5) {
                    Toast.makeText(MainActivity6.this, "매우 그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(100,5);
                }

            }
        });

        rg102.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override // 라디오 버튼들의 상태 값의 변경됨을 감지
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb102_1) {
                    Toast.makeText(MainActivity6.this, "매우 그렇지 않다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(101,1);


                } else if (i == R.id.rb102_2) {
                    Toast.makeText(MainActivity6.this, "그렇지 않다.", Toast.LENGTH_SHORT).show();
                    AnswerData.result(101,2);

                } else if (i == R.id.rb102_3) {
                    Toast.makeText(MainActivity6.this, "보통이다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(101,3);

                } else if (i == R.id.rb102_4) {
                    Toast.makeText(MainActivity6.this, "그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(101,4);

                } else if (i == R.id.rb102_5) {
                    Toast.makeText(MainActivity6.this, "매우 그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(101,5);
                }

            }
        });

        rg103.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override // 라디오 버튼들의 상태 값의 변경됨을 감지
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb103_1) {
                    Toast.makeText(MainActivity6.this, "매우 그렇지 않다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(102,1);


                } else if (i == R.id.rb103_2) {
                    Toast.makeText(MainActivity6.this, "그렇지 않다.", Toast.LENGTH_SHORT).show();
                    AnswerData.result(102,2);

                } else if (i == R.id.rb103_3) {
                    Toast.makeText(MainActivity6.this, "보통이다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(102,3);

                } else if (i == R.id.rb103_4) {
                    Toast.makeText(MainActivity6.this, "그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(102,4);

                } else if (i == R.id.rb103_5) {
                    Toast.makeText(MainActivity6.this, "매우 그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(102,5);
                }

            }
        });

        rg104.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override // 라디오 버튼들의 상태 값의 변경됨을 감지
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb104_1) {
                    Toast.makeText(MainActivity6.this, "매우 그렇지 않다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(103,1);


                } else if (i == R.id.rb104_2) {
                    Toast.makeText(MainActivity6.this, "그렇지 않다.", Toast.LENGTH_SHORT).show();
                    AnswerData.result(103,2);

                } else if (i == R.id.rb104_3) {
                    Toast.makeText(MainActivity6.this, "보통이다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(103,3);

                } else if (i == R.id.rb104_4) {
                    Toast.makeText(MainActivity6.this, "그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(103,4);

                } else if (i == R.id.rb104_5) {
                    Toast.makeText(MainActivity6.this, "매우 그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(103,5);
                }

            }
        });

        rg105.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override // 라디오 버튼들의 상태 값의 변경됨을 감지
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb105_1) {
                    Toast.makeText(MainActivity6.this, "매우 그렇지 않다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(104,1);


                } else if (i == R.id.rb105_2) {
                    Toast.makeText(MainActivity6.this, "그렇지 않다.", Toast.LENGTH_SHORT).show();
                    AnswerData.result(104,2);

                } else if (i == R.id.rb105_3) {
                    Toast.makeText(MainActivity6.this, "보통이다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(104,3);

                } else if (i == R.id.rb105_4) {
                    Toast.makeText(MainActivity6.this, "그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(104,4);

                } else if (i == R.id.rb105_5) {
                    Toast.makeText(MainActivity6.this, "매우 그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(104,5);
                }

            }
        });

        rg106.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override // 라디오 버튼들의 상태 값의 변경됨을 감지
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb106_1) {
                    Toast.makeText(MainActivity6.this, "매우 그렇지 않다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(105,1);


                } else if (i == R.id.rb106_2) {
                    Toast.makeText(MainActivity6.this, "그렇지 않다.", Toast.LENGTH_SHORT).show();
                    AnswerData.result(105,2);

                } else if (i == R.id.rb106_3) {
                    Toast.makeText(MainActivity6.this, "보통이다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(105,3);

                } else if (i == R.id.rb106_4) {
                    Toast.makeText(MainActivity6.this, "그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(105,4);

                } else if (i == R.id.rb106_5) {
                    Toast.makeText(MainActivity6.this, "매우 그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(105,5);
                }

            }
        });

        rg107.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override // 라디오 버튼들의 상태 값의 변경됨을 감지
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb107_1) {
                    Toast.makeText(MainActivity6.this, "매우 그렇지 않다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(106,1);



                } else if (i == R.id.rb107_2) {
                    Toast.makeText(MainActivity6.this, "그렇지 않다.", Toast.LENGTH_SHORT).show();
                    AnswerData.result(106,2);

                } else if (i == R.id.rb107_3) {
                    Toast.makeText(MainActivity6.this, "보통이다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(106,3);

                } else if (i == R.id.rb107_4) {
                    Toast.makeText(MainActivity6.this, "그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(106,4);

                } else if (i == R.id.rb107_5) {
                    Toast.makeText(MainActivity6.this, "매우 그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(106,5);
                }

            }
        });

        rg108.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override // 라디오 버튼들의 상태 값의 변경됨을 감지
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb108_1) {
                    Toast.makeText(MainActivity6.this, "매우 그렇지 않다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(7,1);


                } else if (i == R.id.rb108_2) {
                    Toast.makeText(MainActivity6.this, "그렇지 않다.", Toast.LENGTH_SHORT).show();
                    AnswerData.result(7,2);

                } else if (i == R.id.rb108_3) {
                    Toast.makeText(MainActivity6.this, "보통이다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(7,3);

                } else if (i == R.id.rb108_4) {
                    Toast.makeText(MainActivity6.this, "그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(7,4);

                } else if (i == R.id.rb108_5) {
                    Toast.makeText(MainActivity6.this, "매우 그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(7,5);
                }

            }
        });

        rg109.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override // 라디오 버튼들의 상태 값의 변경됨을 감지
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb109_1) {
                    Toast.makeText(MainActivity6.this, "매우 그렇지 않다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(108,1);


                } else if (i == R.id.rb109_2) {
                    Toast.makeText(MainActivity6.this, "그렇지 않다.", Toast.LENGTH_SHORT).show();
                    AnswerData.result(108,2);

                } else if (i == R.id.rb109_3) {
                    Toast.makeText(MainActivity6.this, "보통이다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(108,3);

                } else if (i == R.id.rb109_4) {
                    Toast.makeText(MainActivity6.this, "그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(108,4);

                } else if (i == R.id.rb109_5) {
                    Toast.makeText(MainActivity6.this, "매우 그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(108,5);
                }

            }
        });

        rg110.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override // 라디오 버튼들의 상태 값의 변경됨을 감지
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb110_1) {
                    Toast.makeText(MainActivity6.this, "매우 그렇지 않다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(109,1);


                } else if (i == R.id.rb110_2) {
                    Toast.makeText(MainActivity6.this, "그렇지 않다.", Toast.LENGTH_SHORT).show();
                    AnswerData.result(109,2);

                } else if (i == R.id.rb110_3) {
                    Toast.makeText(MainActivity6.this, "보통이다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(109,3);

                } else if (i == R.id.rb110_4) {
                    Toast.makeText(MainActivity6.this, "그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(109,4);

                } else if (i == R.id.rb110_5) {
                    Toast.makeText(MainActivity6.this, "매우 그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(109,5);
                }

            }
        });

        rg111.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override // 라디오 버튼들의 상태 값의 변경됨을 감지
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb111_1) {
                    Toast.makeText(MainActivity6.this, "매우 그렇지 않다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(110,1);


                } else if (i == R.id.rb111_2) {
                    Toast.makeText(MainActivity6.this, "그렇지 않다.", Toast.LENGTH_SHORT).show();
                    AnswerData.result(110,2);

                } else if (i == R.id.rb111_3) {
                    Toast.makeText(MainActivity6.this, "보통이다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(110,3);

                } else if (i == R.id.rb111_4) {
                    Toast.makeText(MainActivity6.this, "그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(110,4);

                } else if (i == R.id.rb111_5) {
                    Toast.makeText(MainActivity6.this, "매우 그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(110,5);
                }

            }
        });

        rg112.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override // 라디오 버튼들의 상태 값의 변경됨을 감지
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb112_1) {
                    Toast.makeText(MainActivity6.this, "매우 그렇지 않다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(111,1);


                } else if (i == R.id.rb112_2) {
                    Toast.makeText(MainActivity6.this, "그렇지 않다.", Toast.LENGTH_SHORT).show();
                    AnswerData.result(111,2);

                } else if (i == R.id.rb112_3) {
                    Toast.makeText(MainActivity6.this, "보통이다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(111,3);

                } else if (i == R.id.rb112_4) {
                    Toast.makeText(MainActivity6.this, "그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(111,4);

                } else if (i == R.id.rb112_5) {
                    Toast.makeText(MainActivity6.this, "매우 그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(111,5);
                }

            }
        });

        rg113.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override // 라디오 버튼들의 상태 값의 변경됨을 감지
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb113_1) {
                    Toast.makeText(MainActivity6.this, "매우 그렇지 않다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(112,1);


                } else if (i == R.id.rb113_2) {
                    Toast.makeText(MainActivity6.this, "그렇지 않다.", Toast.LENGTH_SHORT).show();
                    AnswerData.result(112,2);

                } else if (i == R.id.rb113_3) {
                    Toast.makeText(MainActivity6.this, "보통이다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(112,3);

                } else if (i == R.id.rb113_4) {
                    Toast.makeText(MainActivity6.this, "그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(112,4);

                } else if (i == R.id.rb113_5) {
                    Toast.makeText(MainActivity6.this, "매우 그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(112,5);
                }

            }
        });

        rg114.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override // 라디오 버튼들의 상태 값의 변경됨을 감지
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb114_1) {
                    Toast.makeText(MainActivity6.this, "매우 그렇지 않다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(113,1);


                } else if (i == R.id.rb114_2) {
                    Toast.makeText(MainActivity6.this, "그렇지 않다.", Toast.LENGTH_SHORT).show();
                    AnswerData.result(113,2);

                } else if (i == R.id.rb114_3) {
                    Toast.makeText(MainActivity6.this, "보통이다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(113,3);

                } else if (i == R.id.rb114_4) {
                    Toast.makeText(MainActivity6.this, "그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(113,4);

                } else if (i == R.id.rb114_5) {
                    Toast.makeText(MainActivity6.this, "매우 그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(113,5);
                }

            }
        });

        btn_move5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity6.this,MainActivity7.class);
                startActivity(intent);
            }
        });
    }
}