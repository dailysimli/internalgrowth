package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {

    private Button btn_move2;

    private RadioGroup rg31, rg32, rg33, rg34, rg35, rg36, rg37, rg38, rg39, rg40, rg41, rg42, rg43, rg44, rg45, rg46, rg47, rg48; // 한 문제
    private RadioButton rb31_1, rb31_2, rb31_3, rb31_4, rb31_5;
    private RadioButton rb32_1, rb32_2, rb32_3, rb32_4, rb32_5;
    private RadioButton rb33_1, rb33_2, rb33_3, rb33_4, rb33_5;
    private RadioButton rb34_1, rb34_2, rb34_3, rb34_4, rb34_5;
    private RadioButton rb35_1, rb35_2, rb35_3, rb35_4, rb35_5;
    private RadioButton rb36_1, rb36_2, rb36_3, rb36_4, rb36_5;
    private RadioButton rb37_1, rb37_2, rb37_3, rb37_4, rb37_5;
    private RadioButton rb38_1, rb38_2, rb38_3, rb38_4, rb38_5;
    private RadioButton rb39_1, rb39_2, rb39_3, rb39_4, rb39_5;
    private RadioButton rb40_1, rb40_2, rb40_3, rb40_4, rb40_5;
    private RadioButton rb41_1, rb41_2, rb41_3, rb41_4, rb41_5;
    private RadioButton rb42_1, rb42_2, rb42_3, rb42_4, rb42_5;
    private RadioButton rb43_1, rb43_2, rb43_3, rb43_4, rb43_5;
    private RadioButton rb44_1, rb44_2, rb44_3, rb44_4, rb44_5;
    private RadioButton rb45_1, rb45_2, rb45_3, rb45_4, rb45_5;
    private RadioButton rb46_1, rb46_2, rb46_3, rb46_4, rb46_5;
    private RadioButton rb47_1, rb47_2, rb47_3, rb47_4, rb47_5;
    private RadioButton rb48_1, rb48_2, rb48_3, rb48_4, rb48_5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        btn_move2 = (Button) findViewById(R.id.btn_move2);




        rg31 = findViewById(R.id.rg31);//라디오 버튼을 담고 있는 그룹
        rb31_1 = findViewById(R.id.rb31_1); //라디오 버튼
        rb31_2 = findViewById(R.id.rb31_2); //라디오 버튼
        rb31_3 = findViewById(R.id.rb31_3);
        rb31_4 = findViewById(R.id.rb31_4);
        rb31_5 = findViewById(R.id.rb31_5);

        rg32 = findViewById(R.id.rg32);//라디오 버튼을 담고 있는 그룹
        rb32_1 = findViewById(R.id.rb32_1); //라디오 버튼
        rb32_2 = findViewById(R.id.rb32_2); //라디오 버튼
        rb32_3 = findViewById(R.id.rb32_3);
        rb32_4 = findViewById(R.id.rb32_4);
        rb32_5 = findViewById(R.id.rb32_5);

        rg33 = findViewById(R.id.rg33);//라디오 버튼을 담고 있는 그룹
        rb33_1 = findViewById(R.id.rb33_1); //라디오 버튼
        rb33_2 = findViewById(R.id.rb33_2); //라디오 버튼
        rb33_3 = findViewById(R.id.rb33_3);
        rb33_4 = findViewById(R.id.rb33_4);
        rb33_5 = findViewById(R.id.rb33_5);

        rg34 = findViewById(R.id.rg34);//라디오 버튼을 담고 있는 그룹
        rb34_1 = findViewById(R.id.rb34_1); //라디오 버튼
        rb34_2 = findViewById(R.id.rb34_2); //라디오 버튼
        rb34_3 = findViewById(R.id.rb34_3);
        rb34_4 = findViewById(R.id.rb34_4);
        rb34_5 = findViewById(R.id.rb34_5);

        rg35 = findViewById(R.id.rg35);//라디오 버튼을 담고 있는 그룹
        rb35_1 = findViewById(R.id.rb35_1); //라디오 버튼
        rb35_2 = findViewById(R.id.rb35_2); //라디오 버튼
        rb35_3 = findViewById(R.id.rb35_3);
        rb35_4 = findViewById(R.id.rb35_4);
        rb35_5 = findViewById(R.id.rb35_5);

        rg36 = findViewById(R.id.rg36);//라디오 버튼을 담고 있는 그룹
        rb36_1 = findViewById(R.id.rb36_1); //라디오 버튼
        rb36_2 = findViewById(R.id.rb36_2); //라디오 버튼
        rb36_3 = findViewById(R.id.rb36_3);
        rb36_4 = findViewById(R.id.rb36_4);
        rb36_5 = findViewById(R.id.rb36_5);

        rg37 = findViewById(R.id.rg37);//라디오 버튼을 담고 있는 그룹
        rb37_1 = findViewById(R.id.rb37_1); //라디오 버튼
        rb37_2 = findViewById(R.id.rb37_2); //라디오 버튼
        rb37_3 = findViewById(R.id.rb37_3);
        rb37_4 = findViewById(R.id.rb37_4);
        rb37_5 = findViewById(R.id.rb37_5);

        rg38 = findViewById(R.id.rg38);//라디오 버튼을 담고 있는 그룹
        rb38_1 = findViewById(R.id.rb38_1); //라디오 버튼
        rb38_2 = findViewById(R.id.rb38_2); //라디오 버튼
        rb38_3 = findViewById(R.id.rb38_3);
        rb38_4 = findViewById(R.id.rb38_4);
        rb38_5 = findViewById(R.id.rb38_5);

        rg39 = findViewById(R.id.rg39);//라디오 버튼을 담고 있는 그룹
        rb39_1 = findViewById(R.id.rb39_1); //라디오 버튼
        rb39_2 = findViewById(R.id.rb39_2); //라디오 버튼
        rb39_3 = findViewById(R.id.rb39_3);
        rb39_4 = findViewById(R.id.rb39_4);
        rb39_5 = findViewById(R.id.rb39_5);

        rg40 = findViewById(R.id.rg40);//라디오 버튼을 담고 있는 그룹
        rb40_1 = findViewById(R.id.rb40_1); //라디오 버튼
        rb40_2 = findViewById(R.id.rb40_2); //라디오 버튼
        rb40_3 = findViewById(R.id.rb40_3);
        rb40_4 = findViewById(R.id.rb40_4);
        rb40_5 = findViewById(R.id.rb40_5);

        rg41 = findViewById(R.id.rg41);//라디오 버튼을 담고 있는 그룹
        rb41_1 = findViewById(R.id.rb41_1); //라디오 버튼
        rb41_2 = findViewById(R.id.rb41_2); //라디오 버튼
        rb41_3 = findViewById(R.id.rb41_3);
        rb41_4 = findViewById(R.id.rb41_4);
        rb41_5 = findViewById(R.id.rb41_5);

        rg42 = findViewById(R.id.rg42);//라디오 버튼을 담고 있는 그룹
        rb42_1 = findViewById(R.id.rb42_1); //라디오 버튼
        rb42_2 = findViewById(R.id.rb42_2); //라디오 버튼
        rb42_3 = findViewById(R.id.rb42_3);
        rb42_4 = findViewById(R.id.rb42_4);
        rb42_5 = findViewById(R.id.rb42_5);

        rg43 = findViewById(R.id.rg43);//라디오 버튼을 담고 있는 그룹
        rb43_1 = findViewById(R.id.rb43_1); //라디오 버튼
        rb43_2 = findViewById(R.id.rb43_2); //라디오 버튼
        rb43_3 = findViewById(R.id.rb43_3);
        rb43_4 = findViewById(R.id.rb43_4);
        rb43_5 = findViewById(R.id.rb43_5);

        rg44 = findViewById(R.id.rg44);//라디오 버튼을 담고 있는 그룹
        rb44_1 = findViewById(R.id.rb44_1); //라디오 버튼
        rb44_2 = findViewById(R.id.rb44_2); //라디오 버튼
        rb44_3 = findViewById(R.id.rb44_3);
        rb44_4 = findViewById(R.id.rb44_4);
        rb44_5 = findViewById(R.id.rb44_5);

        rg45 = findViewById(R.id.rg45);//라디오 버튼을 담고 있는 그룹
        rb45_1 = findViewById(R.id.rb45_1); //라디오 버튼
        rb45_2 = findViewById(R.id.rb45_2); //라디오 버튼
        rb45_3 = findViewById(R.id.rb45_3);
        rb45_4 = findViewById(R.id.rb45_4);
        rb45_5 = findViewById(R.id.rb45_5);

        rg46 = findViewById(R.id.rg46);//라디오 버튼을 담고 있는 그룹
        rb46_1 = findViewById(R.id.rb46_1); //라디오 버튼
        rb46_2 = findViewById(R.id.rb46_2); //라디오 버튼
        rb46_3 = findViewById(R.id.rb46_3);
        rb46_4 = findViewById(R.id.rb46_4);
        rb46_5 = findViewById(R.id.rb46_5);

        rg47 = findViewById(R.id.rg47);//라디오 버튼을 담고 있는 그룹
        rb47_1 = findViewById(R.id.rb47_1); //라디오 버튼
        rb47_2 = findViewById(R.id.rb47_2); //라디오 버튼
        rb47_3 = findViewById(R.id.rb47_3);
        rb47_4 = findViewById(R.id.rb47_4);
        rb47_5 = findViewById(R.id.rb47_5);

        rg48 = findViewById(R.id.rg48);//라디오 버튼을 담고 있는 그룹
        rb48_1 = findViewById(R.id.rb48_1); //라디오 버튼
        rb48_2 = findViewById(R.id.rb48_2); //라디오 버튼
        rb48_3 = findViewById(R.id.rb48_3);
        rb48_4 = findViewById(R.id.rb48_4);
        rb48_5 = findViewById(R.id.rb48_5);


        rg31.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override // 라디오 버튼들의 상태 값의 변경됨을 감지
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb31_1) {
                    Toast.makeText(MainActivity3.this, "매우 그렇지 않다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(30,1);


                } else if (i == R.id.rb31_2) {
                    Toast.makeText(MainActivity3.this, "그렇지 않다.", Toast.LENGTH_SHORT).show();
                    AnswerData.result(30,2);

                } else if (i == R.id.rb31_3) {
                    Toast.makeText(MainActivity3.this, "보통이다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(30,3);

                } else if (i == R.id.rb31_4) {
                    Toast.makeText(MainActivity3.this, "그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(30,4);

                } else if (i == R.id.rb31_5) {
                    Toast.makeText(MainActivity3.this, "매우 그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(30,5);
                }

            }
        });

        rg32.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override // 라디오 버튼들의 상태 값의 변경됨을 감지
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb32_1) {
                    Toast.makeText(MainActivity3.this, "매우 그렇지 않다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(31,1);


                } else if (i == R.id.rb32_2) {
                    Toast.makeText(MainActivity3.this, "그렇지 않다.", Toast.LENGTH_SHORT).show();
                    AnswerData.result(31,2);

                } else if (i == R.id.rb32_3) {
                    Toast.makeText(MainActivity3.this, "그렇지 않다.", Toast.LENGTH_SHORT).show();
                    AnswerData.result(31,2);

                } else if (i == R.id.rb32_4) {
                    Toast.makeText(MainActivity3.this, "그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(31,4);

                } else if (i == R.id.rb32_5) {
                    Toast.makeText(MainActivity3.this, "매우 그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(31,5);
                }

            }
        });

        rg33.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override // 라디오 버튼들의 상태 값의 변경됨을 감지
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb33_1) {
                    Toast.makeText(MainActivity3.this, "매우 그렇지 않다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(32,1);


                } else if (i == R.id.rb33_2) {
                    Toast.makeText(MainActivity3.this, "그렇지 않다.", Toast.LENGTH_SHORT).show();
                    AnswerData.result(32,2);

                } else if (i == R.id.rb33_3) {
                    Toast.makeText(MainActivity3.this, "보통이다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(32,3);

                } else if (i == R.id.rb33_4) {
                    Toast.makeText(MainActivity3.this, "그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(32,4);

                } else if (i == R.id.rb33_5) {
                    Toast.makeText(MainActivity3.this, "매우 그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(32,5);
                }

            }
        });

        rg34.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override // 라디오 버튼들의 상태 값의 변경됨을 감지
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb34_1) {
                    Toast.makeText(MainActivity3.this, "매우 그렇지 않다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(3,1);


                } else if (i == R.id.rb34_2) {
                    Toast.makeText(MainActivity3.this, "그렇지 않다.", Toast.LENGTH_SHORT).show();
                    AnswerData.result(33,2);

                } else if (i == R.id.rb34_3) {
                    Toast.makeText(MainActivity3.this, "보통이다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(33,3);

                } else if (i == R.id.rb34_4) {
                    Toast.makeText(MainActivity3.this, "그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(33,4);

                } else if (i == R.id.rb34_5) {
                    Toast.makeText(MainActivity3.this, "매우 그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(33,5);
                }

            }
        });

        rg35.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override // 라디오 버튼들의 상태 값의 변경됨을 감지
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb35_1) {
                    Toast.makeText(MainActivity3.this, "매우 그렇지 않다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(34,1);


                } else if (i == R.id.rb35_2) {
                    Toast.makeText(MainActivity3.this, "그렇지 않다.", Toast.LENGTH_SHORT).show();
                    AnswerData.result(34,2);

                } else if (i == R.id.rb35_3) {
                    Toast.makeText(MainActivity3.this, "보통이다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(34,3);

                } else if (i == R.id.rb35_4) {
                    Toast.makeText(MainActivity3.this, "그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(34,4);

                } else if (i == R.id.rb35_5) {
                    Toast.makeText(MainActivity3.this, "매우 그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(34,5);
                }

            }
        });

        rg36.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override // 라디오 버튼들의 상태 값의 변경됨을 감지
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb36_1) {
                    Toast.makeText(MainActivity3.this, "매우 그렇지 않다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(35,1);


                } else if (i == R.id.rb36_2) {
                    Toast.makeText(MainActivity3.this, "그렇지 않다.", Toast.LENGTH_SHORT).show();
                    AnswerData.result(35,2);

                } else if (i == R.id.rb36_3) {
                    Toast.makeText(MainActivity3.this, "보통이다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(35,3);

                } else if (i == R.id.rb36_4) {
                    Toast.makeText(MainActivity3.this, "그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(35,4);

                } else if (i == R.id.rb36_5) {
                    Toast.makeText(MainActivity3.this, "매우 그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(35,5);
                }

            }
        });

        rg37.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override // 라디오 버튼들의 상태 값의 변경됨을 감지
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb37_1) {
                    Toast.makeText(MainActivity3.this, "매우 그렇지 않다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(36,1);


                } else if (i == R.id.rb37_2) {
                    Toast.makeText(MainActivity3.this, "그렇지 않다.", Toast.LENGTH_SHORT).show();
                    AnswerData.result(36,2);

                } else if (i == R.id.rb37_3) {
                    Toast.makeText(MainActivity3.this, "보통이다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(36,3);

                } else if (i == R.id.rb37_4) {
                    Toast.makeText(MainActivity3.this, "그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(36,4);

                } else if (i == R.id.rb37_5) {
                    Toast.makeText(MainActivity3.this, "매우 그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(36,5);
                }

            }
        });

        rg38.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override // 라디오 버튼들의 상태 값의 변경됨을 감지
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb38_1) {
                    Toast.makeText(MainActivity3.this, "매우 그렇지 않다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(7,1);


                } else if (i == R.id.rb38_2) {
                    Toast.makeText(MainActivity3.this, "그렇지 않다.", Toast.LENGTH_SHORT).show();
                    AnswerData.result(7,2);

                } else if (i == R.id.rb38_3) {
                    Toast.makeText(MainActivity3.this, "보통이다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(7,3);

                } else if (i == R.id.rb38_4) {
                    Toast.makeText(MainActivity3.this, "그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(37,4);

                } else if (i == R.id.rb38_5) {
                    Toast.makeText(MainActivity3.this, "매우 그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(37,5);
                }

            }
        });

        rg39.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override // 라디오 버튼들의 상태 값의 변경됨을 감지
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb39_1) {
                    Toast.makeText(MainActivity3.this, "매우 그렇지 않다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(38,1);


                } else if (i == R.id.rb39_2) {
                    Toast.makeText(MainActivity3.this, "그렇지 않다.", Toast.LENGTH_SHORT).show();
                    AnswerData.result(38,2);

                } else if (i == R.id.rb39_3) {
                    Toast.makeText(MainActivity3.this, "보통이다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(38,3);

                } else if (i == R.id.rb39_4) {
                    Toast.makeText(MainActivity3.this, "그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(38,4);

                } else if (i == R.id.rb39_5) {
                    Toast.makeText(MainActivity3.this, "매우 그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(38,5);
                }

            }
        });

        rg40.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override // 라디오 버튼들의 상태 값의 변경됨을 감지
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb40_1) {
                    Toast.makeText(MainActivity3.this, "매우 그렇지 않다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(39,1);


                } else if (i == R.id.rb40_2) {
                    Toast.makeText(MainActivity3.this, "그렇지 않다.", Toast.LENGTH_SHORT).show();
                    AnswerData.result(39,2);

                } else if (i == R.id.rb40_3) {
                    Toast.makeText(MainActivity3.this, "보통이다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(39,3);

                } else if (i == R.id.rb40_4) {
                    Toast.makeText(MainActivity3.this, "그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(39,4);

                } else if (i == R.id.rb40_5) {
                    Toast.makeText(MainActivity3.this, "매우 그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(39,5);
                }

            }
        });

        rg41.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override // 라디오 버튼들의 상태 값의 변경됨을 감지
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb41_1) {
                    Toast.makeText(MainActivity3.this, "매우 그렇지 않다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(40,1);


                } else if (i == R.id.rb41_2) {
                    Toast.makeText(MainActivity3.this, "그렇지 않다.", Toast.LENGTH_SHORT).show();
                    AnswerData.result(40,2);

                } else if (i == R.id.rb41_3) {
                    Toast.makeText(MainActivity3.this, "보통이다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(40,3);

                } else if (i == R.id.rb41_4) {
                    Toast.makeText(MainActivity3.this, "그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(40,4);

                } else if (i == R.id.rb41_5) {
                    Toast.makeText(MainActivity3.this, "매우 그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(40,5);
                }

            }
        });

        rg42.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override // 라디오 버튼들의 상태 값의 변경됨을 감지
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb42_1) {
                    Toast.makeText(MainActivity3.this, "매우 그렇지 않다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(41,1);


                } else if (i == R.id.rb42_2) {
                    Toast.makeText(MainActivity3.this, "그렇지 않다.", Toast.LENGTH_SHORT).show();
                    AnswerData.result(41,2);

                } else if (i == R.id.rb42_3) {
                    Toast.makeText(MainActivity3.this, "보통이다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(41,3);

                } else if (i == R.id.rb42_4) {
                    Toast.makeText(MainActivity3.this, "그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(41,4);

                } else if (i == R.id.rb42_5) {
                    Toast.makeText(MainActivity3.this, "매우 그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(41,5);
                }

            }
        });

        rg43.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override // 라디오 버튼들의 상태 값의 변경됨을 감지
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb43_1) {
                    Toast.makeText(MainActivity3.this, "매우 그렇지 않다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(2,1);


                } else if (i == R.id.rb43_2) {
                    Toast.makeText(MainActivity3.this, "그렇지 않다.", Toast.LENGTH_SHORT).show();
                    AnswerData.result(42,2);

                } else if (i == R.id.rb43_3) {
                    Toast.makeText(MainActivity3.this, "보통이다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(42,3);

                } else if (i == R.id.rb43_4) {
                    Toast.makeText(MainActivity3.this, "그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(42,4);

                } else if (i == R.id.rb43_5) {
                    Toast.makeText(MainActivity3.this, "매우 그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(42,5);
                }

            }
        });

        rg44.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override // 라디오 버튼들의 상태 값의 변경됨을 감지
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb44_1) {
                    Toast.makeText(MainActivity3.this, "매우 그렇지 않다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(43,1);


                } else if (i == R.id.rb44_2) {
                    Toast.makeText(MainActivity3.this, "그렇지 않다.", Toast.LENGTH_SHORT).show();
                    AnswerData.result(43,2);

                } else if (i == R.id.rb44_3) {
                    Toast.makeText(MainActivity3.this, "보통이다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(43,3);

                } else if (i == R.id.rb44_4) {
                    Toast.makeText(MainActivity3.this, "그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(43,4);

                } else if (i == R.id.rb44_5) {
                    Toast.makeText(MainActivity3.this, "매우 그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(43,5);
                }

            }
        });

        rg45.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override // 라디오 버튼들의 상태 값의 변경됨을 감지
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb45_1) {
                    Toast.makeText(MainActivity3.this, "매우 그렇지 않다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(44,1);


                } else if (i == R.id.rb45_2) {
                    Toast.makeText(MainActivity3.this, "그렇지 않다.", Toast.LENGTH_SHORT).show();
                    AnswerData.result(44,2);

                } else if (i == R.id.rb45_3) {
                    Toast.makeText(MainActivity3.this, "보통이다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(44,3);

                } else if (i == R.id.rb45_4) {
                    Toast.makeText(MainActivity3.this, "그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(44,4);

                } else if (i == R.id.rb45_5) {
                    Toast.makeText(MainActivity3.this, "매우 그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(44,5);
                }

            }
        });

        rg46.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override // 라디오 버튼들의 상태 값의 변경됨을 감지
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb46_1) {
                    Toast.makeText(MainActivity3.this, "매우 그렇지 않다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(45,1);


                } else if (i == R.id.rb46_2) {
                    Toast.makeText(MainActivity3.this, "그렇지 않다.", Toast.LENGTH_SHORT).show();
                    AnswerData.result(45,2);

                } else if (i == R.id.rb46_3) {
                    Toast.makeText(MainActivity3.this, "보통이다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(45,3);

                } else if (i == R.id.rb46_4) {
                    Toast.makeText(MainActivity3.this, "그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(45,4);

                } else if (i == R.id.rb46_5) {
                    Toast.makeText(MainActivity3.this, "매우 그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(45,5);
                }

            }
        });

        rg47.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override // 라디오 버튼들의 상태 값의 변경됨을 감지
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb47_1) {
                    Toast.makeText(MainActivity3.this, "매우 그렇지 않다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(46,1);


                } else if (i == R.id.rb47_2) {
                    Toast.makeText(MainActivity3.this, "그렇지 않다.", Toast.LENGTH_SHORT).show();
                    AnswerData.result(46,2);

                } else if (i == R.id.rb47_3) {
                    Toast.makeText(MainActivity3.this, "보통이다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(46,3);

                } else if (i == R.id.rb47_4) {
                    Toast.makeText(MainActivity3.this, "그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(46,4);

                } else if (i == R.id.rb47_5) {
                    Toast.makeText(MainActivity3.this, "매우 그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(46,5);
                }

            }
        });

        rg48.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override // 라디오 버튼들의 상태 값의 변경됨을 감지
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb48_1) {
                    Toast.makeText(MainActivity3.this, "매우 그렇지 않다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(47,1);


                } else if (i == R.id.rb48_2) {
                    Toast.makeText(MainActivity3.this, "그렇지 않다.", Toast.LENGTH_SHORT).show();
                    AnswerData.result(47,2);

                } else if (i == R.id.rb48_3) {
                    Toast.makeText(MainActivity3.this, "보통이다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(47,3);

                } else if (i == R.id.rb48_4) {
                    Toast.makeText(MainActivity3.this, "그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(47,4);

                } else if (i == R.id.rb48_5) {
                    Toast.makeText(MainActivity3.this, "매우 그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(47,5);
                }

            }
        });


        btn_move2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity3.this,MainActivity4.class);
                startActivity(intent);
            }
        });
    }
}