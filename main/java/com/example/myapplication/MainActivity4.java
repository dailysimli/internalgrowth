package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity4 extends AppCompatActivity {

    private Button btn_move3;

    private RadioGroup rg49, rg50, rg51, rg52, rg53, rg54, rg55, rg56, rg57, rg58, rg59, rg60, rg61,rg62, rg63, rg64, rg65, rg66, rg67, rg68, rg69, rg70, rg71, rg72; // 한 문제
    private RadioButton rb49_1, rb49_2, rb49_3, rb49_4, rb49_5;
    private RadioButton rb50_1, rb50_2, rb50_3, rb50_4, rb50_5;
    private RadioButton rb51_1, rb51_2, rb51_3, rb51_4, rb51_5;
    private RadioButton rb52_1, rb52_2, rb52_3, rb52_4, rb52_5;
    private RadioButton rb53_1, rb53_2, rb53_3, rb53_4, rb53_5;
    private RadioButton rb54_1, rb54_2, rb54_3, rb54_4, rb54_5;
    private RadioButton rb55_1, rb55_2, rb55_3, rb55_4, rb55_5;
    private RadioButton rb56_1, rb56_2, rb56_3, rb56_4, rb56_5;
    private RadioButton rb57_1, rb57_2, rb57_3, rb57_4, rb57_5;
    private RadioButton rb58_1, rb58_2, rb58_3, rb58_4, rb58_5;
    private RadioButton rb59_1, rb59_2, rb59_3, rb59_4, rb59_5;
    private RadioButton rb60_1, rb60_2, rb60_3, rb60_4, rb60_5;
    private RadioButton rb61_1, rb61_2, rb61_3, rb61_4, rb61_5;
    private RadioButton rb62_1, rb62_2, rb62_3, rb62_4, rb62_5;
    private RadioButton rb63_1, rb63_2, rb63_3, rb63_4, rb63_5;
    private RadioButton rb64_1, rb64_2, rb64_3, rb64_4, rb64_5;
    private RadioButton rb65_1, rb65_2, rb65_3, rb65_4, rb65_5;
    private RadioButton rb66_1, rb66_2, rb66_3, rb66_4, rb66_5;
    private RadioButton rb67_1, rb67_2, rb67_3, rb67_4, rb67_5;
    private RadioButton rb68_1, rb68_2, rb68_3, rb68_4, rb68_5;
    private RadioButton rb69_1, rb69_2, rb69_3, rb69_4, rb69_5;
    private RadioButton rb70_1, rb70_2, rb70_3, rb70_4, rb70_5;
    private RadioButton rb71_1, rb71_2, rb71_3, rb71_4, rb71_5;
    private RadioButton rb72_1, rb72_2, rb72_3, rb72_4, rb72_5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        btn_move3 = (Button) findViewById(R.id.btn_move3);

        rg49 = findViewById(R.id.rg49);//라디오 버튼을 담고 있는 그룹
        rb49_1 = findViewById(R.id.rb49_1); //라디오 버튼
        rb49_2 = findViewById(R.id.rb49_2); //라디오 버튼
        rb49_3 = findViewById(R.id.rb49_3);
        rb49_4 = findViewById(R.id.rb49_4);
        rb49_5 = findViewById(R.id.rb49_5);

        rg50 = findViewById(R.id.rg50);//라디오 버튼을 담고 있는 그룹
        rb50_1 = findViewById(R.id.rb50_1); //라디오 버튼
        rb50_2 = findViewById(R.id.rb50_2); //라디오 버튼
        rb50_3 = findViewById(R.id.rb50_3);
        rb50_4 = findViewById(R.id.rb50_4);
        rb50_5 = findViewById(R.id.rb50_5);

        rg51 = findViewById(R.id.rg51);//라디오 버튼을 담고 있는 그룹
        rb51_1 = findViewById(R.id.rb51_1); //라디오 버튼
        rb51_2 = findViewById(R.id.rb51_2); //라디오 버튼
        rb51_3 = findViewById(R.id.rb51_3);
        rb51_4 = findViewById(R.id.rb51_4);
        rb51_5 = findViewById(R.id.rb51_5);

        rg52 = findViewById(R.id.rg52);//라디오 버튼을 담고 있는 그룹
        rb52_1 = findViewById(R.id.rb52_1); //라디오 버튼
        rb52_2 = findViewById(R.id.rb52_2); //라디오 버튼
        rb52_3 = findViewById(R.id.rb52_3);
        rb52_4 = findViewById(R.id.rb52_4);
        rb52_5 = findViewById(R.id.rb52_5);

        rg53 = findViewById(R.id.rg53);//라디오 버튼을 담고 있는 그룹
        rb53_1 = findViewById(R.id.rb53_1); //라디오 버튼
        rb53_2 = findViewById(R.id.rb53_2); //라디오 버튼
        rb53_3 = findViewById(R.id.rb53_3);
        rb53_4 = findViewById(R.id.rb53_4);
        rb53_5 = findViewById(R.id.rb53_5);

        rg54 = findViewById(R.id.rg54);//라디오 버튼을 담고 있는 그룹
        rb54_1 = findViewById(R.id.rb54_1); //라디오 버튼
        rb54_2 = findViewById(R.id.rb54_2); //라디오 버튼
        rb54_3 = findViewById(R.id.rb54_3);
        rb54_4 = findViewById(R.id.rb54_4);
        rb54_5 = findViewById(R.id.rb54_5);

        rg55 = findViewById(R.id.rg55);//라디오 버튼을 담고 있는 그룹
        rb55_1 = findViewById(R.id.rb55_1); //라디오 버튼
        rb55_2 = findViewById(R.id.rb55_2); //라디오 버튼
        rb55_3 = findViewById(R.id.rb55_3);
        rb55_4 = findViewById(R.id.rb55_4);
        rb55_5 = findViewById(R.id.rb55_5);

        rg56 = findViewById(R.id.rg56);//라디오 버튼을 담고 있는 그룹
        rb56_1 = findViewById(R.id.rb56_1); //라디오 버튼
        rb56_2 = findViewById(R.id.rb56_2); //라디오 버튼
        rb56_3 = findViewById(R.id.rb56_3);
        rb56_4 = findViewById(R.id.rb56_4);
        rb56_5 = findViewById(R.id.rb56_5);

        rg57 = findViewById(R.id.rg57);//라디오 버튼을 담고 있는 그룹
        rb57_1 = findViewById(R.id.rb57_1); //라디오 버튼
        rb57_2 = findViewById(R.id.rb57_2); //라디오 버튼
        rb57_3 = findViewById(R.id.rb57_3);
        rb57_4 = findViewById(R.id.rb57_4);
        rb57_5 = findViewById(R.id.rb57_5);

        rg58 = findViewById(R.id.rg58);//라디오 버튼을 담고 있는 그룹
        rb58_1 = findViewById(R.id.rb58_1); //라디오 버튼
        rb58_2 = findViewById(R.id.rb58_2); //라디오 버튼
        rb58_3 = findViewById(R.id.rb58_3);
        rb58_4 = findViewById(R.id.rb58_4);
        rb58_5 = findViewById(R.id.rb58_5);

        rg59 = findViewById(R.id.rg59);//라디오 버튼을 담고 있는 그룹
        rb59_1 = findViewById(R.id.rb59_1); //라디오 버튼
        rb59_2 = findViewById(R.id.rb59_2); //라디오 버튼
        rb59_3 = findViewById(R.id.rb59_3);
        rb59_4 = findViewById(R.id.rb59_4);
        rb59_5 = findViewById(R.id.rb59_5);

        rg60 = findViewById(R.id.rg60);//라디오 버튼을 담고 있는 그룹
        rb60_1 = findViewById(R.id.rb60_1); //라디오 버튼
        rb60_2 = findViewById(R.id.rb60_2); //라디오 버튼
        rb60_3 = findViewById(R.id.rb60_3);
        rb60_4 = findViewById(R.id.rb60_4);
        rb60_5 = findViewById(R.id.rb60_5);

        rg61 = findViewById(R.id.rg61);//라디오 버튼을 담고 있는 그룹
        rb61_1 = findViewById(R.id.rb61_1); //라디오 버튼
        rb61_2 = findViewById(R.id.rb61_2); //라디오 버튼
        rb61_3 = findViewById(R.id.rb61_3);
        rb61_4 = findViewById(R.id.rb61_4);
        rb61_5 = findViewById(R.id.rb61_5);

        rg62 = findViewById(R.id.rg62);//라디오 버튼을 담고 있는 그룹
        rb62_1 = findViewById(R.id.rb62_1); //라디오 버튼
        rb62_2 = findViewById(R.id.rb62_2); //라디오 버튼
        rb62_3 = findViewById(R.id.rb62_3);
        rb62_4 = findViewById(R.id.rb62_4);
        rb62_5 = findViewById(R.id.rb62_5);

        rg63 = findViewById(R.id.rg63);//라디오 버튼을 담고 있는 그룹
        rb63_1 = findViewById(R.id.rb63_1); //라디오 버튼
        rb63_2 = findViewById(R.id.rb63_2); //라디오 버튼
        rb63_3 = findViewById(R.id.rb63_3);
        rb63_4 = findViewById(R.id.rb63_4);
        rb63_5 = findViewById(R.id.rb63_5);

        rg64 = findViewById(R.id.rg64);//라디오 버튼을 담고 있는 그룹
        rb64_1 = findViewById(R.id.rb64_1); //라디오 버튼
        rb64_2 = findViewById(R.id.rb64_2); //라디오 버튼
        rb64_3 = findViewById(R.id.rb64_3);
        rb64_4 = findViewById(R.id.rb64_4);
        rb64_5 = findViewById(R.id.rb64_5);

        rg65 = findViewById(R.id.rg65);//라디오 버튼을 담고 있는 그룹
        rb65_1 = findViewById(R.id.rb65_1); //라디오 버튼
        rb65_2 = findViewById(R.id.rb65_2); //라디오 버튼
        rb65_3 = findViewById(R.id.rb65_3);
        rb65_4 = findViewById(R.id.rb65_4);
        rb65_5 = findViewById(R.id.rb65_5);

        rg66 = findViewById(R.id.rg66);//라디오 버튼을 담고 있는 그룹
        rb66_1 = findViewById(R.id.rb66_1); //라디오 버튼
        rb66_2 = findViewById(R.id.rb66_2); //라디오 버튼
        rb66_3 = findViewById(R.id.rb66_3);
        rb66_4 = findViewById(R.id.rb66_4);
        rb66_5 = findViewById(R.id.rb66_5);

        rg67 = findViewById(R.id.rg67);//라디오 버튼을 담고 있는 그룹
        rb67_1 = findViewById(R.id.rb67_1); //라디오 버튼
        rb67_2 = findViewById(R.id.rb67_2); //라디오 버튼
        rb67_3 = findViewById(R.id.rb67_3);
        rb67_4 = findViewById(R.id.rb67_4);
        rb67_5 = findViewById(R.id.rb67_5);

        rg68 = findViewById(R.id.rg68);//라디오 버튼을 담고 있는 그룹
        rb68_1 = findViewById(R.id.rb68_1); //라디오 버튼
        rb68_2 = findViewById(R.id.rb68_2); //라디오 버튼
        rb68_3 = findViewById(R.id.rb68_3);
        rb68_4 = findViewById(R.id.rb68_4);
        rb68_5 = findViewById(R.id.rb68_5);

        rg69 = findViewById(R.id.rg69);//라디오 버튼을 담고 있는 그룹
        rb69_1 = findViewById(R.id.rb69_1); //라디오 버튼
        rb69_2 = findViewById(R.id.rb69_2); //라디오 버튼
        rb69_3 = findViewById(R.id.rb69_3);
        rb69_4 = findViewById(R.id.rb69_4);
        rb69_5 = findViewById(R.id.rb69_5);

        rg70 = findViewById(R.id.rg70);//라디오 버튼을 담고 있는 그룹
        rb70_1 = findViewById(R.id.rb70_1); //라디오 버튼
        rb70_2 = findViewById(R.id.rb70_2); //라디오 버튼
        rb70_3 = findViewById(R.id.rb70_3);
        rb70_4 = findViewById(R.id.rb70_4);
        rb70_5 = findViewById(R.id.rb70_5);

        rg71 = findViewById(R.id.rg71);//라디오 버튼을 담고 있는 그룹
        rb71_1 = findViewById(R.id.rb71_1); //라디오 버튼
        rb71_2 = findViewById(R.id.rb71_2); //라디오 버튼
        rb71_3 = findViewById(R.id.rb71_3);
        rb71_4 = findViewById(R.id.rb71_4);
        rb71_5 = findViewById(R.id.rb71_5);

        rg72 = findViewById(R.id.rg72);//라디오 버튼을 담고 있는 그룹
        rb72_1 = findViewById(R.id.rb72_1); //라디오 버튼
        rb72_2 = findViewById(R.id.rb72_2); //라디오 버튼
        rb72_3 = findViewById(R.id.rb72_3);
        rb72_4 = findViewById(R.id.rb72_4);
        rb72_5 = findViewById(R.id.rb72_5);

        rg49.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override // 라디오 버튼들의 상태 값의 변경됨을 감지
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb49_1) {
                    Toast.makeText(MainActivity4.this, "매우 그렇지 않다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(48,1);


                } else if (i == R.id.rb49_2) {
                    Toast.makeText(MainActivity4.this, "그렇지 않다.", Toast.LENGTH_SHORT).show();
                    AnswerData.result(48,2);

                } else if (i == R.id.rb49_3) {
                    Toast.makeText(MainActivity4.this, "보통이다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(48,3);

                } else if (i == R.id.rb49_4) {
                    Toast.makeText(MainActivity4.this, "그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(48,4);

                } else if (i == R.id.rb49_5) {
                    Toast.makeText(MainActivity4.this, "매우 그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(48,5);
                }

            }
        });

        rg50.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override // 라디오 버튼들의 상태 값의 변경됨을 감지
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb50_1) {
                    Toast.makeText(MainActivity4.this, "매우 그렇지 않다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(49,1);


                } else if (i == R.id.rb50_2) {
                    Toast.makeText(MainActivity4.this, "그렇지 않다.", Toast.LENGTH_SHORT).show();
                    AnswerData.result(49,2);

                } else if (i == R.id.rb50_3) {
                    Toast.makeText(MainActivity4.this, "보통이다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(49,3);

                } else if (i == R.id.rb50_4) {
                    Toast.makeText(MainActivity4.this, "그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(49,4);

                } else if (i == R.id.rb50_5) {
                    Toast.makeText(MainActivity4.this, "매우 그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(49,5);
                }

            }
        });

        rg51.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override // 라디오 버튼들의 상태 값의 변경됨을 감지
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb51_1) {
                    Toast.makeText(MainActivity4.this, "매우 그렇지 않다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(50,1);


                } else if (i == R.id.rb51_2) {
                    Toast.makeText(MainActivity4.this, "그렇지 않다.", Toast.LENGTH_SHORT).show();
                    AnswerData.result(50,2);

                } else if (i == R.id.rb51_3) {
                    Toast.makeText(MainActivity4.this, "보통이다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(50,3);

                } else if (i == R.id.rb51_4) {
                    Toast.makeText(MainActivity4.this, "그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(50,4);

                } else if (i == R.id.rb51_5) {
                    Toast.makeText(MainActivity4.this, "매우 그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(50,5);
                }

            }
        });

        rg52.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override // 라디오 버튼들의 상태 값의 변경됨을 감지
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb52_1) {
                    Toast.makeText(MainActivity4.this, "매우 그렇지 않다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(51,1);


                } else if (i == R.id.rb52_2) {
                    Toast.makeText(MainActivity4.this, "그렇지 않다.", Toast.LENGTH_SHORT).show();
                    AnswerData.result(51,2);

                } else if (i == R.id.rb52_3) {
                    Toast.makeText(MainActivity4.this, "보통이다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(51,3);

                } else if (i == R.id.rb52_4) {
                    Toast.makeText(MainActivity4.this, "그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(51,4);

                } else if (i == R.id.rb52_5) {
                    Toast.makeText(MainActivity4.this, "매우 그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(51,5);
                }

            }
        });

        rg53.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override // 라디오 버튼들의 상태 값의 변경됨을 감지
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb53_1) {
                    Toast.makeText(MainActivity4.this, "매우 그렇지 않다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(52,1);


                } else if (i == R.id.rb53_2) {
                    Toast.makeText(MainActivity4.this, "그렇지 않다.", Toast.LENGTH_SHORT).show();
                    AnswerData.result(52,2);

                } else if (i == R.id.rb53_3) {
                    Toast.makeText(MainActivity4.this, "보통이다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(52,3);

                } else if (i == R.id.rb53_4) {
                    Toast.makeText(MainActivity4.this, "그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(52,4);

                } else if (i == R.id.rb53_5) {
                    Toast.makeText(MainActivity4.this, "매우 그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(52,5);
                }

            }
        });

        rg54.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override // 라디오 버튼들의 상태 값의 변경됨을 감지
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb54_1) {
                    Toast.makeText(MainActivity4.this, "매우 그렇지 않다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(53,1);


                } else if (i == R.id.rb54_2) {
                    Toast.makeText(MainActivity4.this, "그렇지 않다.", Toast.LENGTH_SHORT).show();
                    AnswerData.result(53,2);

                } else if (i == R.id.rb54_3) {
                    Toast.makeText(MainActivity4.this, "보통이다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(53,3);

                } else if (i == R.id.rb54_4) {
                    Toast.makeText(MainActivity4.this, "그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(53,4);

                } else if (i == R.id.rb54_5) {
                    Toast.makeText(MainActivity4.this, "매우 그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(53,5);
                }

            }
        });

        rg55.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override // 라디오 버튼들의 상태 값의 변경됨을 감지
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb55_1) {
                    Toast.makeText(MainActivity4.this, "매우 그렇지 않다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(54,1);


                } else if (i == R.id.rb55_2) {
                    Toast.makeText(MainActivity4.this, "그렇지 않다.", Toast.LENGTH_SHORT).show();
                    AnswerData.result(54,2);

                } else if (i == R.id.rb55_3) {
                    Toast.makeText(MainActivity4.this, "보통이다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(54,3);

                } else if (i == R.id.rb55_4) {
                    Toast.makeText(MainActivity4.this, "그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(54,4);

                } else if (i == R.id.rb55_5) {
                    Toast.makeText(MainActivity4.this, "매우 그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(54,5);
                }

            }
        });

        rg56.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override // 라디오 버튼들의 상태 값의 변경됨을 감지
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb56_1) {
                    Toast.makeText(MainActivity4.this, "매우 그렇지 않다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(5,1);


                } else if (i == R.id.rb56_2) {
                    Toast.makeText(MainActivity4.this, "그렇지 않다.", Toast.LENGTH_SHORT).show();
                    AnswerData.result(55,2);

                } else if (i == R.id.rb56_3) {
                    Toast.makeText(MainActivity4.this, "보통이다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(55,3);

                } else if (i == R.id.rb56_4) {
                    Toast.makeText(MainActivity4.this, "그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(55,4);

                } else if (i == R.id.rb56_5) {
                    Toast.makeText(MainActivity4.this, "매우 그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(55,5);
                }

            }
        });

        rg57.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override // 라디오 버튼들의 상태 값의 변경됨을 감지
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb57_1) {
                    Toast.makeText(MainActivity4.this, "매우 그렇지 않다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(56,1);


                } else if (i == R.id.rb57_2) {
                    Toast.makeText(MainActivity4.this, "그렇지 않다.", Toast.LENGTH_SHORT).show();
                    AnswerData.result(56,2);

                } else if (i == R.id.rb57_3) {
                    Toast.makeText(MainActivity4.this, "보통이다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(56,3);

                } else if (i == R.id.rb57_4) {
                    Toast.makeText(MainActivity4.this, "그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(56,4);

                } else if (i == R.id.rb57_5) {
                    Toast.makeText(MainActivity4.this, "매우 그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(56,5);
                }

            }
        });

        rg58.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override // 라디오 버튼들의 상태 값의 변경됨을 감지
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb58_1) {
                    Toast.makeText(MainActivity4.this, "매우 그렇지 않다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(7,1);


                } else if (i == R.id.rb58_2) {
                    Toast.makeText(MainActivity4.this, "그렇지 않다.", Toast.LENGTH_SHORT).show();
                    AnswerData.result(7,2);

                } else if (i == R.id.rb58_3) {
                    Toast.makeText(MainActivity4.this, "보통이다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(57,3);

                } else if (i == R.id.rb58_4) {
                    Toast.makeText(MainActivity4.this, "그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(7,4);

                } else if (i == R.id.rb58_5) {
                    Toast.makeText(MainActivity4.this, "매우 그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(57,5);
                }

            }
        });

        rg59.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override // 라디오 버튼들의 상태 값의 변경됨을 감지
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb59_1) {
                    Toast.makeText(MainActivity4.this, "매우 그렇지 않다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(58,1);


                } else if (i == R.id.rb59_2) {
                    Toast.makeText(MainActivity4.this, "그렇지 않다.", Toast.LENGTH_SHORT).show();
                    AnswerData.result(58,2);

                } else if (i == R.id.rb59_3) {
                    Toast.makeText(MainActivity4.this, "보통이다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(58,3);

                } else if (i == R.id.rb59_4) {
                    Toast.makeText(MainActivity4.this, "그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(58,4);

                } else if (i == R.id.rb59_5) {
                    Toast.makeText(MainActivity4.this, "매우 그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(58,5);
                }

            }
        });

        rg60.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override // 라디오 버튼들의 상태 값의 변경됨을 감지
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb60_1) {
                    Toast.makeText(MainActivity4.this, "매우 그렇지 않다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(59,1);


                } else if (i == R.id.rb60_2) {
                    Toast.makeText(MainActivity4.this, "그렇지 않다.", Toast.LENGTH_SHORT).show();
                    AnswerData.result(59,2);

                } else if (i == R.id.rb60_3) {
                    Toast.makeText(MainActivity4.this, "보통이다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(59,3);

                } else if (i == R.id.rb60_4) {
                    Toast.makeText(MainActivity4.this, "그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(59,4);

                } else if (i == R.id.rb60_5) {
                    Toast.makeText(MainActivity4.this, "매우 그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(59,5);
                }

            }
        });

        rg61.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override // 라디오 버튼들의 상태 값의 변경됨을 감지
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb61_1) {
                    Toast.makeText(MainActivity4.this, "매우 그렇지 않다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(60,1);


                } else if (i == R.id.rb61_2) {
                    Toast.makeText(MainActivity4.this, "그렇지 않다.", Toast.LENGTH_SHORT).show();
                    AnswerData.result(60,2);

                } else if (i == R.id.rb61_3) {
                    Toast.makeText(MainActivity4.this, "보통이다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(60,3);

                } else if (i == R.id.rb61_4) {
                    Toast.makeText(MainActivity4.this, "그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(60,4);

                } else if (i == R.id.rb61_5) {
                    Toast.makeText(MainActivity4.this, "매우 그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(60,5);
                }

            }
        });

        rg62.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override // 라디오 버튼들의 상태 값의 변경됨을 감지
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb62_1) {
                    Toast.makeText(MainActivity4.this, "매우 그렇지 않다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(61,1);


                } else if (i == R.id.rb62_2) {
                    Toast.makeText(MainActivity4.this, "그렇지 않다.", Toast.LENGTH_SHORT).show();
                    AnswerData.result(61,2);

                } else if (i == R.id.rb62_3) {
                    Toast.makeText(MainActivity4.this, "보통이다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(61,3);

                } else if (i == R.id.rb62_4) {
                    Toast.makeText(MainActivity4.this, "그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(61,4);

                } else if (i == R.id.rb62_5) {
                    Toast.makeText(MainActivity4.this, "매우 그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(61,5);
                }

            }
        });

        rg63.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override // 라디오 버튼들의 상태 값의 변경됨을 감지
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb63_1) {
                    Toast.makeText(MainActivity4.this, "매우 그렇지 않다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(62,1);


                } else if (i == R.id.rb63_2) {
                    Toast.makeText(MainActivity4.this, "그렇지 않다.", Toast.LENGTH_SHORT).show();
                    AnswerData.result(62,2);

                } else if (i == R.id.rb63_3) {
                    Toast.makeText(MainActivity4.this, "보통이다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(62,3);

                } else if (i == R.id.rb63_4) {
                    Toast.makeText(MainActivity4.this, "그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(62,4);

                } else if (i == R.id.rb63_5) {
                    Toast.makeText(MainActivity4.this, "매우 그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(62,5);
                }

            }
        });

        rg64.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override // 라디오 버튼들의 상태 값의 변경됨을 감지
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb64_1) {
                    Toast.makeText(MainActivity4.this, "매우 그렇지 않다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(63,1);


                } else if (i == R.id.rb64_2) {
                    Toast.makeText(MainActivity4.this, "그렇지 않다.", Toast.LENGTH_SHORT).show();
                    AnswerData.result(63,2);

                } else if (i == R.id.rb64_3) {
                    Toast.makeText(MainActivity4.this, "보통이다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(63,3);

                } else if (i == R.id.rb64_4) {
                    Toast.makeText(MainActivity4.this, "그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(63,4);

                } else if (i == R.id.rb64_5) {
                    Toast.makeText(MainActivity4.this, "매우 그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(63,5);
                }

            }
        });

        rg65.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override // 라디오 버튼들의 상태 값의 변경됨을 감지
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb65_1) {
                    Toast.makeText(MainActivity4.this, "매우 그렇지 않다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(64,1);


                } else if (i == R.id.rb65_2) {
                    Toast.makeText(MainActivity4.this, "그렇지 않다.", Toast.LENGTH_SHORT).show();
                    AnswerData.result(64,2);

                } else if (i == R.id.rb65_3) {
                    Toast.makeText(MainActivity4.this, "보통이다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(64,3);

                } else if (i == R.id.rb65_4) {
                    Toast.makeText(MainActivity4.this, "그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(64,4);

                } else if (i == R.id.rb65_5) {
                    Toast.makeText(MainActivity4.this, "매우 그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(64,5);
                }

            }
        });

        rg66.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override // 라디오 버튼들의 상태 값의 변경됨을 감지
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb66_1) {
                    Toast.makeText(MainActivity4.this, "매우 그렇지 않다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(65,1);


                } else if (i == R.id.rb66_2) {
                    Toast.makeText(MainActivity4.this, "그렇지 않다.", Toast.LENGTH_SHORT).show();
                    AnswerData.result(65,2);

                } else if (i == R.id.rb66_3) {
                    Toast.makeText(MainActivity4.this, "보통이다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(65,3);

                } else if (i == R.id.rb66_4) {
                    Toast.makeText(MainActivity4.this, "그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(65,4);

                } else if (i == R.id.rb66_5) {
                    Toast.makeText(MainActivity4.this, "매우 그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(65,5);
                }

            }
        });

        rg67.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override // 라디오 버튼들의 상태 값의 변경됨을 감지
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb67_1) {
                    Toast.makeText(MainActivity4.this, "매우 그렇지 않다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(66,1);


                } else if (i == R.id.rb67_2) {
                    Toast.makeText(MainActivity4.this, "그렇지 않다.", Toast.LENGTH_SHORT).show();
                    AnswerData.result(66,2);

                } else if (i == R.id.rb67_3) {
                    Toast.makeText(MainActivity4.this, "보통이다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(66,3);

                } else if (i == R.id.rb67_4) {
                    Toast.makeText(MainActivity4.this, "그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(66,4);

                } else if (i == R.id.rb67_5) {
                    Toast.makeText(MainActivity4.this, "매우 그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(66,5);
                }

            }
        });

        rg68.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override // 라디오 버튼들의 상태 값의 변경됨을 감지
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb68_1) {
                    Toast.makeText(MainActivity4.this, "매우 그렇지 않다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(67,1);


                } else if (i == R.id.rb68_2) {
                    Toast.makeText(MainActivity4.this, "그렇지 않다.", Toast.LENGTH_SHORT).show();
                    AnswerData.result(67,2);

                } else if (i == R.id.rb68_3) {
                    Toast.makeText(MainActivity4.this, "보통이다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(67,3);

                } else if (i == R.id.rb68_4) {
                    Toast.makeText(MainActivity4.this, "그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(67,4);

                } else if (i == R.id.rb68_5) {
                    Toast.makeText(MainActivity4.this, "매우 그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(67,5);
                }

            }
        });

        rg69.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override // 라디오 버튼들의 상태 값의 변경됨을 감지
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb69_1) {
                    Toast.makeText(MainActivity4.this, "매우 그렇지 않다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(68,1);


                } else if (i == R.id.rb69_2) {
                    Toast.makeText(MainActivity4.this, "그렇지 않다.", Toast.LENGTH_SHORT).show();
                    AnswerData.result(68,2);

                } else if (i == R.id.rb69_3) {
                    Toast.makeText(MainActivity4.this, "보통이다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(68,3);

                } else if (i == R.id.rb69_4) {
                    Toast.makeText(MainActivity4.this, "그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(68,4);

                } else if (i == R.id.rb69_5) {
                    Toast.makeText(MainActivity4.this, "매우 그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(68,5);
                }

            }
        });

        rg70.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override // 라디오 버튼들의 상태 값의 변경됨을 감지
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb70_1) {
                    Toast.makeText(MainActivity4.this, "매우 그렇지 않다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(69,1);


                } else if (i == R.id.rb70_2) {
                    Toast.makeText(MainActivity4.this, "그렇지 않다.", Toast.LENGTH_SHORT).show();
                    AnswerData.result(69,2);

                } else if (i == R.id.rb70_3) {
                    Toast.makeText(MainActivity4.this, "보통이다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(69,3);

                } else if (i == R.id.rb70_4) {
                    Toast.makeText(MainActivity4.this, "그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(69,4);

                } else if (i == R.id.rb70_5) {
                    Toast.makeText(MainActivity4.this, "매우 그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(69,5);
                }

            }
        });

        rg71.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override // 라디오 버튼들의 상태 값의 변경됨을 감지
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb71_1) {
                    Toast.makeText(MainActivity4.this, "매우 그렇지 않다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(70,1);


                } else if (i == R.id.rb71_2) {
                    Toast.makeText(MainActivity4.this, "그렇지 않다.", Toast.LENGTH_SHORT).show();
                    AnswerData.result(70,2);

                } else if (i == R.id.rb71_3) {
                    Toast.makeText(MainActivity4.this, "보통이다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(70,3);

                } else if (i == R.id.rb71_4) {
                    Toast.makeText(MainActivity4.this, "그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(70,4);

                } else if (i == R.id.rb71_5) {
                    Toast.makeText(MainActivity4.this, "매우 그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(70,5);
                }

            }
        });

        rg72.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override // 라디오 버튼들의 상태 값의 변경됨을 감지
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb72_1) {
                    Toast.makeText(MainActivity4.this, "매우 그렇지 않다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(81,1);


                } else if (i == R.id.rb72_2) {
                    Toast.makeText(MainActivity4.this, "그렇지 않다.", Toast.LENGTH_SHORT).show();
                    AnswerData.result(71,2);

                } else if (i == R.id.rb72_3) {
                    Toast.makeText(MainActivity4.this, "보통이다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(71,3);

                } else if (i == R.id.rb72_4) {
                    Toast.makeText(MainActivity4.this, "그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(71,4);

                } else if (i == R.id.rb72_5) {
                    Toast.makeText(MainActivity4.this, "매우 그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(71,5);
                }

            }
        });

        btn_move3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity4.this,MainActivity5.class);
                startActivity(intent);

            }
        });


    }
}