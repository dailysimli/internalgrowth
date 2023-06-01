package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity5 extends AppCompatActivity {

    private Button btn_move4;

    private RadioGroup rg73, rg74, rg75, rg76, rg77, rg78, rg79, rg80, rg81, rg82, rg83, rg84, rg85, rg86, rg87, rg88, rg89, rg90, rg91, rg92, rg93, rg94, rg95, rg96; // 한 문제
    private RadioButton rb73_1, rb73_2, rb73_3, rb73_4, rb73_5;
    private RadioButton rb74_1, rb74_2, rb74_3, rb74_4, rb74_5;
    private RadioButton rb75_1, rb75_2, rb75_3, rb75_4, rb75_5;
    private RadioButton rb76_1, rb76_2, rb76_3, rb76_4, rb76_5;
    private RadioButton rb77_1, rb77_2, rb77_3, rb77_4, rb77_5;
    private RadioButton rb78_1, rb78_2, rb78_3, rb78_4, rb78_5;
    private RadioButton rb79_1, rb79_2, rb79_3, rb79_4, rb79_5;
    private RadioButton rb80_1, rb80_2, rb80_3, rb80_4, rb80_5;
    private RadioButton rb81_1, rb81_2, rb81_3, rb81_4, rb81_5;
    private RadioButton rb82_1, rb82_2, rb82_3, rb82_4, rb82_5;
    private RadioButton rb83_1, rb83_2, rb83_3, rb83_4, rb83_5;
    private RadioButton rb84_1, rb84_2, rb84_3, rb84_4, rb84_5;
    private RadioButton rb85_1, rb85_2, rb85_3, rb85_4, rb85_5;
    private RadioButton rb86_1, rb86_2, rb86_3, rb86_4, rb86_5;
    private RadioButton rb87_1, rb87_2, rb87_3, rb87_4, rb87_5;
    private RadioButton rb88_1, rb88_2, rb88_3, rb88_4, rb88_5;
    private RadioButton rb89_1, rb89_2, rb89_3, rb89_4, rb89_5;
    private RadioButton rb90_1, rb90_2, rb90_3, rb90_4, rb90_5;
    private RadioButton rb91_1, rb91_2, rb91_3, rb91_4, rb91_5;
    private RadioButton rb92_1, rb92_2, rb92_3, rb92_4, rb92_5;
    private RadioButton rb93_1, rb93_2, rb93_3, rb93_4, rb93_5;
    private RadioButton rb94_1, rb94_2, rb94_3, rb94_4, rb94_5;
    private RadioButton rb95_1, rb95_2, rb95_3, rb95_4, rb95_5;
    private RadioButton rb96_1, rb96_2, rb96_3, rb96_4, rb96_5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        btn_move4 = (Button) findViewById(R.id.btn_move4);



        rg73 = findViewById(R.id.rg73);//라디오 버튼을 담고 있는 그룹
        rb73_1 = findViewById(R.id.rb73_1); //라디오 버튼
        rb73_2 = findViewById(R.id.rb73_2); //라디오 버튼
        rb73_3 = findViewById(R.id.rb73_3);
        rb73_4 = findViewById(R.id.rb73_4);
        rb73_5 = findViewById(R.id.rb73_5);

        rg74 = findViewById(R.id.rg74);//라디오 버튼을 담고 있는 그룹
        rb74_1 = findViewById(R.id.rb74_1); //라디오 버튼
        rb74_2 = findViewById(R.id.rb74_2); //라디오 버튼
        rb74_3 = findViewById(R.id.rb74_3);
        rb74_4 = findViewById(R.id.rb74_4);
        rb74_5 = findViewById(R.id.rb74_5);

        rg75 = findViewById(R.id.rg75);//라디오 버튼을 담고 있는 그룹
        rb75_1 = findViewById(R.id.rb75_1); //라디오 버튼
        rb75_2 = findViewById(R.id.rb75_2); //라디오 버튼
        rb75_3 = findViewById(R.id.rb75_3);
        rb75_4 = findViewById(R.id.rb75_4);
        rb75_5 = findViewById(R.id.rb75_5);

        rg76 = findViewById(R.id.rg76);//라디오 버튼을 담고 있는 그룹
        rb76_1 = findViewById(R.id.rb76_1); //라디오 버튼
        rb76_2 = findViewById(R.id.rb76_2); //라디오 버튼
        rb76_3 = findViewById(R.id.rb76_3);
        rb76_4 = findViewById(R.id.rb76_4);
        rb76_5 = findViewById(R.id.rb76_5);

        rg77 = findViewById(R.id.rg77);//라디오 버튼을 담고 있는 그룹
        rb77_1 = findViewById(R.id.rb77_1); //라디오 버튼
        rb77_2 = findViewById(R.id.rb77_2); //라디오 버튼
        rb77_3 = findViewById(R.id.rb77_3);
        rb77_4 = findViewById(R.id.rb77_4);
        rb77_5 = findViewById(R.id.rb77_5);

        rg78 = findViewById(R.id.rg78);//라디오 버튼을 담고 있는 그룹
        rb78_1 = findViewById(R.id.rb78_1); //라디오 버튼
        rb78_2 = findViewById(R.id.rb78_2); //라디오 버튼
        rb78_3 = findViewById(R.id.rb78_3);
        rb78_4 = findViewById(R.id.rb78_4);
        rb78_5 = findViewById(R.id.rb78_5);

        rg79 = findViewById(R.id.rg79);//라디오 버튼을 담고 있는 그룹
        rb79_1 = findViewById(R.id.rb79_1); //라디오 버튼
        rb79_2 = findViewById(R.id.rb79_2); //라디오 버튼
        rb79_3 = findViewById(R.id.rb79_3);
        rb79_4 = findViewById(R.id.rb79_4);
        rb79_5 = findViewById(R.id.rb79_5);

        rg80 = findViewById(R.id.rg80);//라디오 버튼을 담고 있는 그룹
        rb80_1 = findViewById(R.id.rb80_1); //라디오 버튼
        rb80_2 = findViewById(R.id.rb80_2); //라디오 버튼
        rb80_3 = findViewById(R.id.rb80_3);
        rb80_4 = findViewById(R.id.rb80_4);
        rb80_5 = findViewById(R.id.rb80_5);

        rg81 = findViewById(R.id.rg81);//라디오 버튼을 담고 있는 그룹
        rb81_1 = findViewById(R.id.rb81_1); //라디오 버튼
        rb81_2 = findViewById(R.id.rb81_2); //라디오 버튼
        rb81_3 = findViewById(R.id.rb81_3);
        rb81_4 = findViewById(R.id.rb81_4);
        rb81_5 = findViewById(R.id.rb81_5);

        rg82 = findViewById(R.id.rg82);//라디오 버튼을 담고 있는 그룹
        rb82_1 = findViewById(R.id.rb82_1); //라디오 버튼
        rb82_2 = findViewById(R.id.rb82_2); //라디오 버튼
        rb82_3 = findViewById(R.id.rb82_3);
        rb82_4 = findViewById(R.id.rb82_4);
        rb82_5 = findViewById(R.id.rb82_5);

        rg83 = findViewById(R.id.rg83);//라디오 버튼을 담고 있는 그룹
        rb83_1 = findViewById(R.id.rb83_1); //라디오 버튼
        rb83_2 = findViewById(R.id.rb83_2); //라디오 버튼
        rb83_3 = findViewById(R.id.rb83_3);
        rb83_4 = findViewById(R.id.rb83_4);
        rb83_5 = findViewById(R.id.rb83_5);

        rg84 = findViewById(R.id.rg84);//라디오 버튼을 담고 있는 그룹
        rb84_1 = findViewById(R.id.rb84_1); //라디오 버튼
        rb84_2 = findViewById(R.id.rb84_2); //라디오 버튼
        rb84_3 = findViewById(R.id.rb84_3);
        rb84_4 = findViewById(R.id.rb84_4);
        rb84_5 = findViewById(R.id.rb84_5);

        rg85 = findViewById(R.id.rg85);//라디오 버튼을 담고 있는 그룹
        rb85_1 = findViewById(R.id.rb85_1); //라디오 버튼
        rb85_2 = findViewById(R.id.rb85_2); //라디오 버튼
        rb85_3 = findViewById(R.id.rb85_3);
        rb85_4 = findViewById(R.id.rb85_4);
        rb85_5 = findViewById(R.id.rb85_5);

        rg86 = findViewById(R.id.rg86);//라디오 버튼을 담고 있는 그룹
        rb86_1 = findViewById(R.id.rb86_1); //라디오 버튼
        rb86_2 = findViewById(R.id.rb86_2); //라디오 버튼
        rb86_3 = findViewById(R.id.rb86_3);
        rb86_4 = findViewById(R.id.rb86_4);
        rb86_5 = findViewById(R.id.rb86_5);

        rg87 = findViewById(R.id.rg87);//라디오 버튼을 담고 있는 그룹
        rb87_1 = findViewById(R.id.rb87_1); //라디오 버튼
        rb87_2 = findViewById(R.id.rb87_2); //라디오 버튼
        rb87_3 = findViewById(R.id.rb87_3);
        rb87_4 = findViewById(R.id.rb87_4);
        rb87_5 = findViewById(R.id.rb87_5);

        rg88 = findViewById(R.id.rg88);//라디오 버튼을 담고 있는 그룹
        rb88_1 = findViewById(R.id.rb88_1); //라디오 버튼
        rb88_2 = findViewById(R.id.rb88_2); //라디오 버튼
        rb88_3 = findViewById(R.id.rb88_3);
        rb88_4 = findViewById(R.id.rb88_4);
        rb88_5 = findViewById(R.id.rb88_5);

        rg89 = findViewById(R.id.rg89);//라디오 버튼을 담고 있는 그룹
        rb89_1 = findViewById(R.id.rb89_1); //라디오 버튼
        rb89_2 = findViewById(R.id.rb89_2); //라디오 버튼
        rb89_3 = findViewById(R.id.rb89_3);
        rb89_4 = findViewById(R.id.rb89_4);
        rb89_5 = findViewById(R.id.rb89_5);

        rg90 = findViewById(R.id.rg90);//라디오 버튼을 담고 있는 그룹
        rb90_1 = findViewById(R.id.rb90_1); //라디오 버튼
        rb90_2 = findViewById(R.id.rb90_2); //라디오 버튼
        rb90_3 = findViewById(R.id.rb90_3);
        rb90_4 = findViewById(R.id.rb90_4);
        rb90_5 = findViewById(R.id.rb90_5);

        rg91 = findViewById(R.id.rg91);//라디오 버튼을 담고 있는 그룹
        rb91_1 = findViewById(R.id.rb91_1); //라디오 버튼
        rb91_2 = findViewById(R.id.rb91_2); //라디오 버튼
        rb91_3 = findViewById(R.id.rb91_3);
        rb91_4 = findViewById(R.id.rb91_4);
        rb91_5 = findViewById(R.id.rb91_5);

        rg92 = findViewById(R.id.rg92);//라디오 버튼을 담고 있는 그룹
        rb92_1 = findViewById(R.id.rb92_1); //라디오 버튼
        rb92_2 = findViewById(R.id.rb92_2); //라디오 버튼
        rb92_3 = findViewById(R.id.rb92_3);
        rb92_4 = findViewById(R.id.rb92_4);
        rb92_5 = findViewById(R.id.rb92_5);

        rg93 = findViewById(R.id.rg93);//라디오 버튼을 담고 있는 그룹
        rb93_1 = findViewById(R.id.rb93_1); //라디오 버튼
        rb93_2 = findViewById(R.id.rb93_2); //라디오 버튼
        rb93_3 = findViewById(R.id.rb93_3);
        rb93_4 = findViewById(R.id.rb93_4);
        rb93_5 = findViewById(R.id.rb93_5);

        rg94 = findViewById(R.id.rg94);//라디오 버튼을 담고 있는 그룹
        rb94_1 = findViewById(R.id.rb94_1); //라디오 버튼
        rb94_2 = findViewById(R.id.rb94_2); //라디오 버튼
        rb94_3 = findViewById(R.id.rb94_3);
        rb94_4 = findViewById(R.id.rb94_4);
        rb94_5 = findViewById(R.id.rb94_5);

        rg95 = findViewById(R.id.rg95);//라디오 버튼을 담고 있는 그룹
        rb95_1 = findViewById(R.id.rb95_1); //라디오 버튼
        rb95_2 = findViewById(R.id.rb95_2); //라디오 버튼
        rb95_3 = findViewById(R.id.rb95_3);
        rb95_4 = findViewById(R.id.rb95_4);
        rb95_5 = findViewById(R.id.rb95_5);

        rg96 = findViewById(R.id.rg96);//라디오 버튼을 담고 있는 그룹
        rb96_1 = findViewById(R.id.rb96_1); //라디오 버튼
        rb96_2 = findViewById(R.id.rb96_2); //라디오 버튼
        rb96_3 = findViewById(R.id.rb96_3);
        rb96_4 = findViewById(R.id.rb96_4);
        rb96_5 = findViewById(R.id.rb96_5);


        rg73.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override // 라디오 버튼들의 상태 값의 변경됨을 감지
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb73_1) {
                    Toast.makeText(MainActivity5.this, "매우 그렇지 않다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(72,1);


                } else if (i == R.id.rb73_2) {
                    Toast.makeText(MainActivity5.this, "그렇지 않다.", Toast.LENGTH_SHORT).show();
                    AnswerData.result(72,2);

                } else if (i == R.id.rb73_3) {
                    Toast.makeText(MainActivity5.this, "보통이다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(72,3);

                } else if (i == R.id.rb73_4) {
                    Toast.makeText(MainActivity5.this, "그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(72,4);

                } else if (i == R.id.rb73_5) {
                    Toast.makeText(MainActivity5.this, "매우 그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(72,5);
                }

            }
        });

        rg74.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override // 라디오 버튼들의 상태 값의 변경됨을 감지
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb74_1) {
                    Toast.makeText(MainActivity5.this, "매우 그렇지 않다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(73,1);


                } else if (i == R.id.rb74_2) {
                    Toast.makeText(MainActivity5.this, "그렇지 않다.", Toast.LENGTH_SHORT).show();
                    AnswerData.result(73,2);

                } else if (i == R.id.rb74_3) {
                    Toast.makeText(MainActivity5.this, "보통이다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(73,3);

                } else if (i == R.id.rb74_4) {
                    Toast.makeText(MainActivity5.this, "그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(73,4);

                } else if (i == R.id.rb74_5) {
                    Toast.makeText(MainActivity5.this, "매우 그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(73,5);
                }

            }
        });

        rg75.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override // 라디오 버튼들의 상태 값의 변경됨을 감지
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb75_1) {
                    Toast.makeText(MainActivity5.this, "매우 그렇지 않다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(74,1);


                } else if (i == R.id.rb75_2) {
                    Toast.makeText(MainActivity5.this, "그렇지 않다.", Toast.LENGTH_SHORT).show();
                    AnswerData.result(74,2);

                } else if (i == R.id.rb75_3) {
                    Toast.makeText(MainActivity5.this, "보통이다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(74,3);

                } else if (i == R.id.rb75_4) {
                    Toast.makeText(MainActivity5.this, "그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(74,4);

                } else if (i == R.id.rb75_5) {
                    Toast.makeText(MainActivity5.this, "매우 그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(74,5);
                }

            }
        });

        rg76.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override // 라디오 버튼들의 상태 값의 변경됨을 감지
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb76_1) {
                    Toast.makeText(MainActivity5.this, "매우 그렇지 않다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(75,1);


                } else if (i == R.id.rb76_2) {
                    Toast.makeText(MainActivity5.this, "그렇지 않다.", Toast.LENGTH_SHORT).show();
                    AnswerData.result(75,2);

                } else if (i == R.id.rb76_3) {
                    Toast.makeText(MainActivity5.this, "보통이다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(75,3);

                } else if (i == R.id.rb76_4) {
                    Toast.makeText(MainActivity5.this, "그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(75,4);

                } else if (i == R.id.rb76_5) {
                    Toast.makeText(MainActivity5.this, "매우 그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(75,5);
                }

            }
        });

        rg77.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override // 라디오 버튼들의 상태 값의 변경됨을 감지
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb77_1) {
                    Toast.makeText(MainActivity5.this, "매우 그렇지 않다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(76,1);


                } else if (i == R.id.rb77_2) {
                    Toast.makeText(MainActivity5.this, "그렇지 않다.", Toast.LENGTH_SHORT).show();
                    AnswerData.result(76,2);

                } else if (i == R.id.rb77_3) {
                    Toast.makeText(MainActivity5.this, "보통이다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(76,3);

                } else if (i == R.id.rb77_4) {
                    Toast.makeText(MainActivity5.this, "그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(76,4);

                } else if (i == R.id.rb77_5) {
                    Toast.makeText(MainActivity5.this, "매우 그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(76,5);
                }

            }
        });

        rg78.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override // 라디오 버튼들의 상태 값의 변경됨을 감지
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb78_1) {
                    Toast.makeText(MainActivity5.this, "매우 그렇지 않다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(77,1);


                } else if (i == R.id.rb78_2) {
                    Toast.makeText(MainActivity5.this, "그렇지 않다.", Toast.LENGTH_SHORT).show();
                    AnswerData.result(77,2);

                } else if (i == R.id.rb78_3) {
                    Toast.makeText(MainActivity5.this, "보통이다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(77,3);

                } else if (i == R.id.rb78_4) {
                    Toast.makeText(MainActivity5.this, "그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(77,4);

                } else if (i == R.id.rb78_5) {
                    Toast.makeText(MainActivity5.this, "매우 그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(77,5);
                }

            }
        });

        rg79.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override // 라디오 버튼들의 상태 값의 변경됨을 감지
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb79_1) {
                    Toast.makeText(MainActivity5.this, "매우 그렇지 않다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(78,1);


                } else if (i == R.id.rb79_2) {
                    Toast.makeText(MainActivity5.this, "그렇지 않다.", Toast.LENGTH_SHORT).show();
                    AnswerData.result(78,2);

                } else if (i == R.id.rb79_3) {
                    Toast.makeText(MainActivity5.this, "보통이다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(78,3);

                } else if (i == R.id.rb79_4) {
                    Toast.makeText(MainActivity5.this, "그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(78,4);

                } else if (i == R.id.rb79_5) {
                    Toast.makeText(MainActivity5.this, "매우 그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(78,5);
                }

            }
        });

        rg80.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override // 라디오 버튼들의 상태 값의 변경됨을 감지
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb80_1) {
                    Toast.makeText(MainActivity5.this, "매우 그렇지 않다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(79,1);


                } else if (i == R.id.rb80_2) {
                    Toast.makeText(MainActivity5.this, "그렇지 않다.", Toast.LENGTH_SHORT).show();
                    AnswerData.result(79,2);

                } else if (i == R.id.rb80_3) {
                    Toast.makeText(MainActivity5.this, "보통이다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(79,3);

                } else if (i == R.id.rb80_4) {
                    Toast.makeText(MainActivity5.this, "그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(79,4);

                } else if (i == R.id.rb80_5) {
                    Toast.makeText(MainActivity5.this, "매우 그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(79,5);
                }

            }
        });

        rg81.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override // 라디오 버튼들의 상태 값의 변경됨을 감지
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb81_1) {
                    Toast.makeText(MainActivity5.this, "매우 그렇지 않다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(80,1);


                } else if (i == R.id.rb81_2) {
                    Toast.makeText(MainActivity5.this, "그렇지 않다.", Toast.LENGTH_SHORT).show();
                    AnswerData.result(80,2);

                } else if (i == R.id.rb81_3) {
                    Toast.makeText(MainActivity5.this, "보통이다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(80,3);

                } else if (i == R.id.rb81_4) {
                    Toast.makeText(MainActivity5.this, "그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(80,4);

                } else if (i == R.id.rb81_5) {
                    Toast.makeText(MainActivity5.this, "매우 그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(80,5);
                }

            }
        });

        rg82.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override // 라디오 버튼들의 상태 값의 변경됨을 감지
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb82_1) {
                    Toast.makeText(MainActivity5.this, "매우 그렇지 않다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(81,1);


                } else if (i == R.id.rb82_2) {
                    Toast.makeText(MainActivity5.this, "그렇지 않다.", Toast.LENGTH_SHORT).show();
                    AnswerData.result(81,2);

                } else if (i == R.id.rb82_3) {
                    Toast.makeText(MainActivity5.this, "보통이다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(81,3);

                } else if (i == R.id.rb82_4) {
                    Toast.makeText(MainActivity5.this, "그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(81,4);

                } else if (i == R.id.rb82_5) {
                    Toast.makeText(MainActivity5.this, "매우 그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(81,5);
                }

            }
        });

        rg83.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override // 라디오 버튼들의 상태 값의 변경됨을 감지
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb83_1) {
                    Toast.makeText(MainActivity5.this, "매우 그렇지 않다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(82,1);


                } else if (i == R.id.rb83_2) {
                    Toast.makeText(MainActivity5.this, "그렇지 않다.", Toast.LENGTH_SHORT).show();
                    AnswerData.result(82,2);

                } else if (i == R.id.rb83_3) {
                    Toast.makeText(MainActivity5.this, "보통이다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(82,3);

                } else if (i == R.id.rb83_4) {
                    Toast.makeText(MainActivity5.this, "그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(82,4);

                } else if (i == R.id.rb83_5) {
                    Toast.makeText(MainActivity5.this, "매우 그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(82,5);
                }

            }
        });

        rg84.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override // 라디오 버튼들의 상태 값의 변경됨을 감지
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb84_1) {
                    Toast.makeText(MainActivity5.this, "매우 그렇지 않다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(83,1);


                } else if (i == R.id.rb84_2) {
                    Toast.makeText(MainActivity5.this, "그렇지 않다.", Toast.LENGTH_SHORT).show();
                    AnswerData.result(83,2);

                } else if (i == R.id.rb84_3) {
                    Toast.makeText(MainActivity5.this, "보통이다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(83,3);

                } else if (i == R.id.rb84_4) {
                    Toast.makeText(MainActivity5.this, "그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(83,4);

                } else if (i == R.id.rb84_5) {
                    Toast.makeText(MainActivity5.this, "매우 그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(83,5);
                }

            }
        });

        rg85.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override // 라디오 버튼들의 상태 값의 변경됨을 감지
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb85_1) {
                    Toast.makeText(MainActivity5.this, "매우 그렇지 않다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(84,1);


                } else if (i == R.id.rb85_2) {
                    Toast.makeText(MainActivity5.this, "그렇지 않다.", Toast.LENGTH_SHORT).show();
                    AnswerData.result(84,2);

                } else if (i == R.id.rb85_3) {
                    Toast.makeText(MainActivity5.this, "보통이다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(84,3);

                } else if (i == R.id.rb85_4) {
                    Toast.makeText(MainActivity5.this, "그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(84,4);

                } else if (i == R.id.rb85_5) {
                    Toast.makeText(MainActivity5.this, "매우 그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(84,5);
                }

            }
        });

        rg86.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override // 라디오 버튼들의 상태 값의 변경됨을 감지
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb86_1) {
                    Toast.makeText(MainActivity5.this, "매우 그렇지 않다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(85,1);


                } else if (i == R.id.rb86_2) {
                    Toast.makeText(MainActivity5.this, "그렇지 않다.", Toast.LENGTH_SHORT).show();
                    AnswerData.result(85,2);

                } else if (i == R.id.rb86_3) {
                    Toast.makeText(MainActivity5.this, "보통이다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(85,3);

                } else if (i == R.id.rb86_4) {
                    Toast.makeText(MainActivity5.this, "그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(85,4);

                } else if (i == R.id.rb86_5) {
                    Toast.makeText(MainActivity5.this, "매우 그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(85,5);
                }

            }
        });

        rg87.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override // 라디오 버튼들의 상태 값의 변경됨을 감지
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb87_1) {
                    Toast.makeText(MainActivity5.this, "매우 그렇지 않다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(86,1);


                } else if (i == R.id.rb87_2) {
                    Toast.makeText(MainActivity5.this, "그렇지 않다.", Toast.LENGTH_SHORT).show();
                    AnswerData.result(86,2);

                } else if (i == R.id.rb87_3) {
                    Toast.makeText(MainActivity5.this, "보통이다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(86,3);

                } else if (i == R.id.rb87_4) {
                    Toast.makeText(MainActivity5.this, "그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(86,4);

                } else if (i == R.id.rb87_5) {
                    Toast.makeText(MainActivity5.this, "매우 그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(86,5);
                }

            }
        });

        rg88.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override // 라디오 버튼들의 상태 값의 변경됨을 감지
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb88_1) {
                    Toast.makeText(MainActivity5.this, "매우 그렇지 않다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(87,1);


                } else if (i == R.id.rb88_2) {
                    Toast.makeText(MainActivity5.this, "그렇지 않다.", Toast.LENGTH_SHORT).show();
                    AnswerData.result(87,2);

                } else if (i == R.id.rb88_3) {
                    Toast.makeText(MainActivity5.this, "보통이다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(87,3);

                } else if (i == R.id.rb88_4) {
                    Toast.makeText(MainActivity5.this, "그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(87,4);

                } else if (i == R.id.rb88_5) {
                    Toast.makeText(MainActivity5.this, "매우 그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(87,5);
                }

            }
        });

        rg89.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override // 라디오 버튼들의 상태 값의 변경됨을 감지
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb89_1) {
                    Toast.makeText(MainActivity5.this, "매우 그렇지 않다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(88,1);


                } else if (i == R.id.rb89_2) {
                    Toast.makeText(MainActivity5.this, "그렇지 않다.", Toast.LENGTH_SHORT).show();
                    AnswerData.result(88,2);

                } else if (i == R.id.rb89_3) {
                    Toast.makeText(MainActivity5.this, "보통이다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(88,3);

                } else if (i == R.id.rb89_4) {
                    Toast.makeText(MainActivity5.this, "그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(88,4);

                } else if (i == R.id.rb89_5) {
                    Toast.makeText(MainActivity5.this, "매우 그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(88,5);
                }

            }
        });

        rg90.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override // 라디오 버튼들의 상태 값의 변경됨을 감지
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb90_1) {
                    Toast.makeText(MainActivity5.this, "매우 그렇지 않다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(89,1);


                } else if (i == R.id.rb90_2) {
                    Toast.makeText(MainActivity5.this, "그렇지 않다.", Toast.LENGTH_SHORT).show();
                    AnswerData.result(89,2);

                } else if (i == R.id.rb90_3) {
                    Toast.makeText(MainActivity5.this, "보통이다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(89,3);

                } else if (i == R.id.rb90_4) {
                    Toast.makeText(MainActivity5.this, "그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(89,4);

                } else if (i == R.id.rb90_5) {
                    Toast.makeText(MainActivity5.this, "매우 그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(89,5);
                }

            }
        });

        rg91.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override // 라디오 버튼들의 상태 값의 변경됨을 감지
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb91_1) {
                    Toast.makeText(MainActivity5.this, "매우 그렇지 않다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(90,1);


                } else if (i == R.id.rb91_2) {
                    Toast.makeText(MainActivity5.this, "그렇지 않다.", Toast.LENGTH_SHORT).show();
                    AnswerData.result(90,2);

                } else if (i == R.id.rb91_3) {
                    Toast.makeText(MainActivity5.this, "보통이다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(90,3);

                } else if (i == R.id.rb91_4) {
                    Toast.makeText(MainActivity5.this, "그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(90,4);

                } else if (i == R.id.rb91_5) {
                    Toast.makeText(MainActivity5.this, "매우 그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(90,5);
                }

            }
        });

        rg92.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override // 라디오 버튼들의 상태 값의 변경됨을 감지
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb92_1) {
                    Toast.makeText(MainActivity5.this, "매우 그렇지 않다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(91,1);


                } else if (i == R.id.rb92_2) {
                    Toast.makeText(MainActivity5.this, "그렇지 않다.", Toast.LENGTH_SHORT).show();
                    AnswerData.result(91,2);

                } else if (i == R.id.rb92_3) {
                    Toast.makeText(MainActivity5.this, "보통이다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(91,3);

                } else if (i == R.id.rb92_4) {
                    Toast.makeText(MainActivity5.this, "그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(91,4);

                } else if (i == R.id.rb92_5) {
                    Toast.makeText(MainActivity5.this, "매우 그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(91,5);
                }

            }
        });

        rg93.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override // 라디오 버튼들의 상태 값의 변경됨을 감지
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb93_1) {
                    Toast.makeText(MainActivity5.this, "매우 그렇지 않다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(92,1);


                } else if (i == R.id.rb93_2) {
                    Toast.makeText(MainActivity5.this, "그렇지 않다.", Toast.LENGTH_SHORT).show();
                    AnswerData.result(92,2);

                } else if (i == R.id.rb93_3) {
                    Toast.makeText(MainActivity5.this, "보통이다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(92,3);

                } else if (i == R.id.rb93_4) {
                    Toast.makeText(MainActivity5.this, "그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(92,4);

                } else if (i == R.id.rb93_5) {
                    Toast.makeText(MainActivity5.this, "매우 그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(92,5);
                }

            }
        });

        rg94.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override // 라디오 버튼들의 상태 값의 변경됨을 감지
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb94_1) {
                    Toast.makeText(MainActivity5.this, "매우 그렇지 않다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(93,1);


                } else if (i == R.id.rb94_2) {
                    Toast.makeText(MainActivity5.this, "그렇지 않다.", Toast.LENGTH_SHORT).show();
                    AnswerData.result(93,2);

                } else if (i == R.id.rb94_3) {
                    Toast.makeText(MainActivity5.this, "보통이다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(93,3);

                } else if (i == R.id.rb94_4) {
                    Toast.makeText(MainActivity5.this, "그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(93,4);

                } else if (i == R.id.rb94_5) {
                    Toast.makeText(MainActivity5.this, "매우 그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(93,5);
                }

            }
        });

        rg95.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override // 라디오 버튼들의 상태 값의 변경됨을 감지
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb95_1) {
                    Toast.makeText(MainActivity5.this, "매우 그렇지 않다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(94,1);


                } else if (i == R.id.rb95_2) {
                    Toast.makeText(MainActivity5.this, "그렇지 않다.", Toast.LENGTH_SHORT).show();
                    AnswerData.result(94,2);

                } else if (i == R.id.rb95_3) {
                    Toast.makeText(MainActivity5.this, "보통이다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(94,3);

                } else if (i == R.id.rb95_4) {
                    Toast.makeText(MainActivity5.this, "그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(94,4);

                } else if (i == R.id.rb95_5) {
                    Toast.makeText(MainActivity5.this, "매우 그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(94,5);
                }

            }
        });

        rg96.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override // 라디오 버튼들의 상태 값의 변경됨을 감지
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb96_1) {
                    Toast.makeText(MainActivity5.this, "매우 그렇지 않다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(95,1);


                } else if (i == R.id.rb96_2) {
                    Toast.makeText(MainActivity5.this, "그렇지 않다.", Toast.LENGTH_SHORT).show();
                    AnswerData.result(95,2);

                } else if (i == R.id.rb96_3) {
                    Toast.makeText(MainActivity5.this, "보통이다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(95,3);

                } else if (i == R.id.rb96_4) {
                    Toast.makeText(MainActivity5.this, "그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(95,4);

                } else if (i == R.id.rb96_5) {
                    Toast.makeText(MainActivity5.this, "매우 그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(95,5);
                }

            }
        });


        btn_move4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity5.this,MainActivity6.class);
                startActivity(intent);
            }
        });
    }
}