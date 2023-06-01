package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    private Button btn_move;

    private RadioGroup rg, rg2, rg3, rg4, rg5, rg6, rg7, rg8, rg9, rg10, rg11, rg12, rg13, rg14, rg15, rg16, rg17, rg18, rg19, rg20, rg21, rg22, rg23, rg24, rg25, rg26, rg27, rg28, rg29, rg30; // �� ����
    private RadioButton rb_1, rb_2, rb_3, rb_4, rb_5;
    private RadioButton rb2_1, rb2_2, rb2_3, rb2_4, rb2_5;
    private RadioButton rb3_1, rb3_2, rb3_3, rb3_4, rb3_5;
    private RadioButton rb4_1, rb4_2, rb4_3, rb4_4, rb4_5;
    private RadioButton rb5_1, rb5_2, rb5_3, rb5_4, rb5_5;
    private RadioButton rb6_1, rb6_2, rb6_3, rb6_4, rb6_5;
    private RadioButton rb7_1, rb7_2, rb7_3, rb7_4, rb7_5;
    private RadioButton rb8_1, rb8_2, rb8_3, rb8_4, rb8_5;
    private RadioButton rb9_1, rb9_2, rb9_3, rb9_4, rb9_5;
    private RadioButton rb10_1, rb10_2, rb10_3, rb10_4, rb10_5;
    private RadioButton rb11_1, rb11_2, rb11_3, rb11_4, rb11_5;
    private RadioButton rb12_1, rb12_2, rb12_3, rb12_4, rb12_5;
    private RadioButton rb13_1, rb13_2, rb13_3, rb13_4, rb13_5;
    private RadioButton rb14_1, rb14_2, rb14_3, rb14_4, rb14_5;
    private RadioButton rb15_1, rb15_2, rb15_3, rb15_4, rb15_5;
    private RadioButton rb16_1, rb16_2, rb16_3, rb16_4, rb16_5;
    private RadioButton rb17_1, rb17_2, rb17_3, rb17_4, rb17_5;
    private RadioButton rb18_1, rb18_2, rb18_3, rb18_4, rb18_5;
    private RadioButton rb19_1, rb19_2, rb19_3, rb19_4, rb19_5;
    private RadioButton rb20_1, rb20_2, rb20_3, rb20_4, rb20_5;
    private RadioButton rb21_1, rb21_2, rb21_3, rb21_4, rb21_5;
    private RadioButton rb22_1, rb22_2, rb22_3, rb22_4, rb22_5;
    private RadioButton rb23_1, rb23_2, rb23_3, rb23_4, rb23_5;
    private RadioButton rb24_1, rb24_2, rb24_3, rb24_4, rb24_5;
    private RadioButton rb25_1, rb25_2, rb25_3, rb25_4, rb25_5;
    private RadioButton rb26_1, rb26_2, rb26_3, rb26_4, rb26_5;
    private RadioButton rb27_1, rb27_2, rb27_3, rb27_4, rb27_5;
    private RadioButton rb28_1, rb28_2, rb28_3, rb28_4, rb28_5;
    private RadioButton rb29_1, rb29_2, rb29_3, rb29_4, rb29_5;
    private RadioButton rb30_1, rb30_2, rb30_3, rb30_4, rb30_5;


    int pos=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);



        rg = findViewById(R.id.rg);
        rb_1 = findViewById(R.id.rb_1);
        rb_2 = findViewById(R.id.rb_2);
        rb_3 = findViewById(R.id.rb_3);
        rb_4 = findViewById(R.id.rb_4);
        rb_5 = findViewById(R.id.rb_5);

        rg2 = findViewById(R.id.rg2);
        rb2_1 = findViewById(R.id.rb2_1);
        rb2_2 = findViewById(R.id.rb2_2);
        rb2_3 = findViewById(R.id.rb2_3);
        rb2_4 = findViewById(R.id.rb2_4);
        rb2_5 = findViewById(R.id.rb2_5);

        rg3 = findViewById(R.id.rg3);
        rb3_1 = findViewById(R.id.rb3_1);
        rb3_2 = findViewById(R.id.rb3_2);
        rb3_3 = findViewById(R.id.rb3_3);
        rb3_4 = findViewById(R.id.rb3_4);
        rb3_5 = findViewById(R.id.rb3_5);

        rg4 = findViewById(R.id.rg4);//���� ��ư�� ��� �ִ� �׷�
        rb4_1 = findViewById(R.id.rb4_1); //���� ��ư
        rb4_2 = findViewById(R.id.rb4_2); //���� ��ư
        rb4_3 = findViewById(R.id.rb4_3);
        rb4_4 = findViewById(R.id.rb4_4);
        rb4_5 = findViewById(R.id.rb4_5);

        rg5 = findViewById(R.id.rg5);//���� ��ư�� ��� �ִ� �׷�
        rb5_1 = findViewById(R.id.rb5_1); //���� ��ư
        rb5_2 = findViewById(R.id.rb5_2); //���� ��ư
        rb5_3 = findViewById(R.id.rb5_3);
        rb5_4 = findViewById(R.id.rb5_4);
        rb5_5 = findViewById(R.id.rb5_5);

        rg6 = findViewById(R.id.rg6);//���� ��ư�� ��� �ִ� �׷�
        rb6_1 = findViewById(R.id.rb6_1); //���� ��ư
        rb6_2 = findViewById(R.id.rb6_2); //���� ��ư
        rb6_3 = findViewById(R.id.rb6_3);
        rb6_4 = findViewById(R.id.rb6_4);
        rb6_5 = findViewById(R.id.rb6_5);

        rg7 = findViewById(R.id.rg7);//���� ��ư�� ��� �ִ� �׷�
        rb7_1 = findViewById(R.id.rb7_1); //���� ��ư
        rb7_2 = findViewById(R.id.rb7_2); //���� ��ư
        rb7_3 = findViewById(R.id.rb7_3);
        rb7_4 = findViewById(R.id.rb7_4);
        rb7_5 = findViewById(R.id.rb7_5);

        rg8 = findViewById(R.id.rg8);//���� ��ư�� ��� �ִ� �׷�
        rb8_1 = findViewById(R.id.rb8_1); //���� ��ư
        rb8_2 = findViewById(R.id.rb8_2); //���� ��ư
        rb8_3 = findViewById(R.id.rb8_3);
        rb8_4 = findViewById(R.id.rb8_4);
        rb8_5 = findViewById(R.id.rb8_5);

        rg9 = findViewById(R.id.rg9);//���� ��ư�� ��� �ִ� �׷�
        rb9_1 = findViewById(R.id.rb9_1); //���� ��ư
        rb9_2 = findViewById(R.id.rb9_2); //���� ��ư
        rb9_3 = findViewById(R.id.rb9_3);
        rb9_4 = findViewById(R.id.rb9_4);
        rb9_5 = findViewById(R.id.rb9_5);

        rg10 = findViewById(R.id.rg10);//���� ��ư�� ��� �ִ� �׷�
        rb10_1 = findViewById(R.id.rb10_1); //���� ��ư
        rb10_2 = findViewById(R.id.rb10_2); //���� ��ư
        rb10_3 = findViewById(R.id.rb10_3);
        rb10_4 = findViewById(R.id.rb10_4);
        rb10_5 = findViewById(R.id.rb10_5);

        rg11 = findViewById(R.id.rg11);//���� ��ư�� ��� �ִ� �׷�
        rb11_1 = findViewById(R.id.rb11_1); //���� ��ư
        rb11_2 = findViewById(R.id.rb11_2); //���� ��ư
        rb11_3 = findViewById(R.id.rb11_3);
        rb11_4 = findViewById(R.id.rb11_4);
        rb11_5 = findViewById(R.id.rb11_5);

        rg12 = findViewById(R.id.rg12);//���� ��ư�� ��� �ִ� �׷�
        rb12_1 = findViewById(R.id.rb12_1); //���� ��ư
        rb12_2 = findViewById(R.id.rb12_2); //���� ��ư
        rb12_3 = findViewById(R.id.rb12_3);
        rb12_4 = findViewById(R.id.rb12_4);
        rb12_5 = findViewById(R.id.rb12_5);

        rg13 = findViewById(R.id.rg13);//���� ��ư�� ��� �ִ� �׷�
        rb13_1 = findViewById(R.id.rb13_1); //���� ��ư
        rb13_2 = findViewById(R.id.rb13_2); //���� ��ư
        rb13_3 = findViewById(R.id.rb13_3);
        rb13_4 = findViewById(R.id.rb13_4);
        rb13_5 = findViewById(R.id.rb13_5);

        rg14 = findViewById(R.id.rg14);//���� ��ư�� ��� �ִ� �׷�
        rb14_1 = findViewById(R.id.rb14_1); //���� ��ư
        rb14_2 = findViewById(R.id.rb14_2); //���� ��ư
        rb14_3 = findViewById(R.id.rb14_3);
        rb14_4 = findViewById(R.id.rb14_4);
        rb14_5 = findViewById(R.id.rb14_5);

        rg15 = findViewById(R.id.rg15);//���� ��ư�� ��� �ִ� �׷�
        rb15_1 = findViewById(R.id.rb15_1); //���� ��ư
        rb15_2 = findViewById(R.id.rb15_2); //���� ��ư
        rb15_3 = findViewById(R.id.rb15_3);
        rb15_4 = findViewById(R.id.rb15_4);
        rb15_5 = findViewById(R.id.rb15_5);

        rg16 = findViewById(R.id.rg16);//���� ��ư�� ��� �ִ� �׷�
        rb16_1 = findViewById(R.id.rb16_1); //���� ��ư
        rb16_2 = findViewById(R.id.rb16_2); //���� ��ư
        rb16_3 = findViewById(R.id.rb16_3);
        rb16_4 = findViewById(R.id.rb16_4);
        rb16_5 = findViewById(R.id.rb16_5);

        rg17 = findViewById(R.id.rg17);//���� ��ư�� ��� �ִ� �׷�
        rb17_1 = findViewById(R.id.rb17_1); //���� ��ư
        rb17_2 = findViewById(R.id.rb17_2); //���� ��ư
        rb17_3 = findViewById(R.id.rb17_3);
        rb17_4 = findViewById(R.id.rb17_4);
        rb17_5 = findViewById(R.id.rb17_5);

        rg18 = findViewById(R.id.rg18);//���� ��ư�� ��� �ִ� �׷�
        rb18_1 = findViewById(R.id.rb18_1); //���� ��ư
        rb18_2 = findViewById(R.id.rb18_2); //���� ��ư
        rb18_3 = findViewById(R.id.rb18_3);
        rb18_4 = findViewById(R.id.rb18_4);
        rb18_5 = findViewById(R.id.rb18_5);

        rg19 = findViewById(R.id.rg19);//���� ��ư�� ��� �ִ� �׷�
        rb19_1 = findViewById(R.id.rb19_1); //���� ��ư
        rb19_2 = findViewById(R.id.rb19_2); //���� ��ư
        rb19_3 = findViewById(R.id.rb19_3);
        rb19_4 = findViewById(R.id.rb19_4);
        rb19_5 = findViewById(R.id.rb19_5);

        rg20 = findViewById(R.id.rg20);//���� ��ư�� ��� �ִ� �׷�
        rb20_1 = findViewById(R.id.rb20_1); //���� ��ư
        rb20_2 = findViewById(R.id.rb20_2); //���� ��ư
        rb20_3 = findViewById(R.id.rb20_3);
        rb20_4 = findViewById(R.id.rb20_4);
        rb20_5 = findViewById(R.id.rb20_5);

        rg21 = findViewById(R.id.rg21);//���� ��ư�� ��� �ִ� �׷�
        rb21_1 = findViewById(R.id.rb21_1); //���� ��ư
        rb21_2 = findViewById(R.id.rb21_2); //���� ��ư
        rb21_3 = findViewById(R.id.rb21_3);
        rb21_4 = findViewById(R.id.rb21_4);
        rb21_5 = findViewById(R.id.rb21_5);

        rg22 = findViewById(R.id.rg22);//���� ��ư�� ��� �ִ� �׷�
        rb22_1 = findViewById(R.id.rb22_1); //���� ��ư
        rb22_2 = findViewById(R.id.rb22_2); //���� ��ư
        rb22_3 = findViewById(R.id.rb22_3);
        rb22_4 = findViewById(R.id.rb22_4);
        rb22_5 = findViewById(R.id.rb22_5);

        rg23 = findViewById(R.id.rg23);//���� ��ư�� ��� �ִ� �׷�
        rb23_1 = findViewById(R.id.rb23_1); //���� ��ư
        rb23_2 = findViewById(R.id.rb23_2); //���� ��ư
        rb23_3 = findViewById(R.id.rb23_3);
        rb23_4 = findViewById(R.id.rb23_4);
        rb23_5 = findViewById(R.id.rb23_5);

        rg24 = findViewById(R.id.rg24);//���� ��ư�� ��� �ִ� �׷�
        rb24_1 = findViewById(R.id.rb24_1); //���� ��ư
        rb24_2 = findViewById(R.id.rb24_2); //���� ��ư
        rb24_3 = findViewById(R.id.rb24_3);
        rb24_4 = findViewById(R.id.rb24_4);
        rb24_5 = findViewById(R.id.rb24_5);

        rg25 = findViewById(R.id.rg25);//���� ��ư�� ��� �ִ� �׷�
        rb25_1 = findViewById(R.id.rb25_1); //���� ��ư
        rb25_2 = findViewById(R.id.rb25_2); //���� ��ư
        rb25_3 = findViewById(R.id.rb25_3);
        rb25_4 = findViewById(R.id.rb25_4);
        rb25_5 = findViewById(R.id.rb25_5);

        rg26 = findViewById(R.id.rg26);//���� ��ư�� ��� �ִ� �׷�
        rb26_1 = findViewById(R.id.rb26_1); //���� ��ư
        rb26_2 = findViewById(R.id.rb26_2); //���� ��ư
        rb26_3 = findViewById(R.id.rb26_3);
        rb26_4 = findViewById(R.id.rb26_4);
        rb26_5 = findViewById(R.id.rb26_5);

        rg27 = findViewById(R.id.rg27);//���� ��ư�� ��� �ִ� �׷�
        rb27_1 = findViewById(R.id.rb27_1); //���� ��ư
        rb27_2 = findViewById(R.id.rb27_2); //���� ��ư
        rb27_3 = findViewById(R.id.rb27_3);
        rb27_4 = findViewById(R.id.rb27_4);
        rb27_5 = findViewById(R.id.rb27_5);

        rg28 = findViewById(R.id.rg28);//���� ��ư�� ��� �ִ� �׷�
        rb28_1 = findViewById(R.id.rb28_1); //���� ��ư
        rb28_2 = findViewById(R.id.rb28_2); //���� ��ư
        rb28_3 = findViewById(R.id.rb28_3);
        rb28_4 = findViewById(R.id.rb28_4);
        rb28_5 = findViewById(R.id.rb28_5);

        rg29 = findViewById(R.id.rg29);//���� ��ư�� ��� �ִ� �׷�
        rb29_1 = findViewById(R.id.rb29_1); //���� ��ư
        rb29_2 = findViewById(R.id.rb29_2); //���� ��ư
        rb29_3 = findViewById(R.id.rb29_3);
        rb29_4 = findViewById(R.id.rb29_4);
        rb29_5 = findViewById(R.id.rb29_5);

        rg30 = findViewById(R.id.rg30);//���� ��ư�� ��� �ִ� �׷�
        rb30_1 = findViewById(R.id.rb30_1); //���� ��ư
        rb30_2 = findViewById(R.id.rb30_2); //���� ��ư
        rb30_3 = findViewById(R.id.rb30_3);
        rb30_4 = findViewById(R.id.rb30_4);
        rb30_5 = findViewById(R.id.rb30_5);
		
        btn_move=findViewById(R.id.btn_move);

        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb_1) {
                    Toast.makeText(MainActivity2.this, "매우 그렇지 않다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(0,1);


                } else if (i == R.id.rb_2) {
                    Toast.makeText(MainActivity2.this, "그렇지 않다.", Toast.LENGTH_SHORT).show();
                    AnswerData.result(0,2);

                } else if (i == R.id.rb_3) {
                    Toast.makeText(MainActivity2.this, "보통이다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(0,3);

                } else if (i == R.id.rb_4) {
                    Toast.makeText(MainActivity2.this, "그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(0,4);

                } else if (i == R.id.rb_5) {
                    Toast.makeText(MainActivity2.this, "매우 그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(0,5);
                }

            }
        });

        rg2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb2_1) {
                    Toast.makeText(MainActivity2.this, "매우 그렇지 않다.", Toast.LENGTH_SHORT).show();
                    AnswerData.result(1,1);


                } else if (i == R.id.rb2_2) {
                    Toast.makeText(MainActivity2.this, "그렇지 않다.", Toast.LENGTH_SHORT).show();
                    AnswerData.result(1,2);

                } else if (i == R.id.rb2_3) {
                    Toast.makeText(MainActivity2.this, "보통이다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(1,3);

                } else if (i == R.id.rb2_4) {
                    Toast.makeText(MainActivity2.this, "그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(1,4);

                } else if (i == R.id.rb2_5) {
                    Toast.makeText(MainActivity2.this, "매우 그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(1,5);
                }

            }
        });

        rg3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb3_1) {
                    Toast.makeText(MainActivity2.this, "매우 그렇지 않다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(2,1);


                } else if (i == R.id.rb3_2) {
                    Toast.makeText(MainActivity2.this, "그렇지 않다.", Toast.LENGTH_SHORT).show();
                    AnswerData.result(2,2);

                } else if (i == R.id.rb3_3) {
                    Toast.makeText(MainActivity2.this, "보통이다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(2,3);

                } else if (i == R.id.rb3_4) {
                    Toast.makeText(MainActivity2.this, "그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(2,4);

                } else if (i == R.id.rb3_5) {
                    Toast.makeText(MainActivity2.this, "매우 그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(2,5);
                }

            }
        });

        rg4.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override // 라디오 버튼들의 상태 값의 변경됨을 감지
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb4_1) {
                    Toast.makeText(MainActivity2.this, "매우 그렇지 않다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(3,1);


                } else if (i == R.id.rb4_2) {
                    Toast.makeText(MainActivity2.this, "그렇지 않다.", Toast.LENGTH_SHORT).show();
                    AnswerData.result(3,2);

                } else if (i == R.id.rb4_3) {
                    Toast.makeText(MainActivity2.this, "보통이다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(3,3);

                } else if (i == R.id.rb4_4) {
                    Toast.makeText(MainActivity2.this, "그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(3,4);

                } else if (i == R.id.rb4_5) {
                    Toast.makeText(MainActivity2.this, "매우 그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(3,5);
                }

            }
        });

        rg5.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override // 라디오 버튼들의 상태 값의 변경됨을 감지
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb5_1) {
                    Toast.makeText(MainActivity2.this, "매우 그렇지 않다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(4,1);


                } else if (i == R.id.rb5_2) {
                    Toast.makeText(MainActivity2.this, "그렇지 않다.", Toast.LENGTH_SHORT).show();
                    AnswerData.result(4,2);

                } else if (i == R.id.rb5_3) {
                    Toast.makeText(MainActivity2.this, "보통이다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(4,3);

                } else if (i == R.id.rb5_4) {
                    Toast.makeText(MainActivity2.this, "그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(4,4);

                } else if (i == R.id.rb5_5) {
                    Toast.makeText(MainActivity2.this, "매우 그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(4,5);
                }

            }
        });

        rg6.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override // 라디오 버튼들의 상태 값의 변경됨을 감지
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb6_1) {
                    Toast.makeText(MainActivity2.this, "매우 그렇지 않다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(5,1);


                } else if (i == R.id.rb6_2) {
                    Toast.makeText(MainActivity2.this, "그렇지 않다.", Toast.LENGTH_SHORT).show();
                    AnswerData.result(5,2);

                } else if (i == R.id.rb6_3) {
                    Toast.makeText(MainActivity2.this, "보통이다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(5,3);

                } else if (i == R.id.rb6_4) {
                    Toast.makeText(MainActivity2.this, "그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(5,4);

                } else if (i == R.id.rb6_5) {
                    Toast.makeText(MainActivity2.this, "매우 그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(5,5);
                }

            }
        });

        rg7.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override // 라디오 버튼들의 상태 값의 변경됨을 감지
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb7_1) {
                    Toast.makeText(MainActivity2.this, "매우 그렇지 않다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(6,1);


                } else if (i == R.id.rb7_2) {
                    Toast.makeText(MainActivity2.this, "그렇지 않다.", Toast.LENGTH_SHORT).show();
                    AnswerData.result(6,2);

                } else if (i == R.id.rb7_3) {
                    Toast.makeText(MainActivity2.this, "보통이다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(6,3);

                } else if (i == R.id.rb7_4) {
                    Toast.makeText(MainActivity2.this, "그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(6,4);

                } else if (i == R.id.rb7_5) {
                    Toast.makeText(MainActivity2.this, "매우 그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(6,5);
                }

            }
        });

        rg8.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override // 라디오 버튼들의 상태 값의 변경됨을 감지
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb8_1) {
                    Toast.makeText(MainActivity2.this, "매우 그렇지 않다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(7,1);


                } else if (i == R.id.rb8_2) {
                    Toast.makeText(MainActivity2.this, "그렇지 않다.", Toast.LENGTH_SHORT).show();
                    AnswerData.result(7,2);

                } else if (i == R.id.rb8_3) {
                    Toast.makeText(MainActivity2.this, "보통이다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(7,3);

                } else if (i == R.id.rb8_4) {
                    Toast.makeText(MainActivity2.this, "그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(7,4);

                } else if (i == R.id.rb8_5) {
                    Toast.makeText(MainActivity2.this, "매우 그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(7,5);
                }

            }
        });

        rg9.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override // 라디오 버튼들의 상태 값의 변경됨을 감지
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb9_1) {
                    Toast.makeText(MainActivity2.this, "매우 그렇지 않다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(8,1);


                } else if (i == R.id.rb9_2) {
                    Toast.makeText(MainActivity2.this, "그렇지 않다.", Toast.LENGTH_SHORT).show();
                    AnswerData.result(8,2);

                } else if (i == R.id.rb9_3) {
                    Toast.makeText(MainActivity2.this, "보통이다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(8,3);

                } else if (i == R.id.rb9_4) {
                    Toast.makeText(MainActivity2.this, "그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(8,4);

                } else if (i == R.id.rb9_5) {
                    Toast.makeText(MainActivity2.this, "매우 그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(8,5);
                }

            }
        });

        rg10.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override // 라디오 버튼들의 상태 값의 변경됨을 감지
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb10_1) {
                    Toast.makeText(MainActivity2.this, "매우 그렇지 않다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(9,1);


                } else if (i == R.id.rb10_2) {
                    Toast.makeText(MainActivity2.this, "그렇지 않다.", Toast.LENGTH_SHORT).show();
                    AnswerData.result(9,2);

                } else if (i == R.id.rb10_3) {
                    Toast.makeText(MainActivity2.this, "보통이다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(9,3);

                } else if (i == R.id.rb10_4) {
                    Toast.makeText(MainActivity2.this, "그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(9,4);

                } else if (i == R.id.rb10_5) {
                    Toast.makeText(MainActivity2.this, "매우 그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(9,5);
                }

            }
        });

        rg11.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override // 라디오 버튼들의 상태 값의 변경됨을 감지
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb11_1) {
                    Toast.makeText(MainActivity2.this, "매우 그렇지 않다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(10,1);


                } else if (i == R.id.rb11_2) {
                    Toast.makeText(MainActivity2.this, "그렇지 않다.", Toast.LENGTH_SHORT).show();
                    AnswerData.result(10,2);

                } else if (i == R.id.rb11_3) {
                    Toast.makeText(MainActivity2.this, "보통이다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(10,3);

                } else if (i == R.id.rb11_4) {
                    Toast.makeText(MainActivity2.this, "그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(10,4);

                } else if (i == R.id.rb11_5) {
                    Toast.makeText(MainActivity2.this, "매우 그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(10,5);
                }

            }
        });

        rg12.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override // 라디오 버튼들의 상태 값의 변경됨을 감지
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb12_1) {
                    Toast.makeText(MainActivity2.this, "매우 그렇지 않다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(11,1);


                } else if (i == R.id.rb12_2) {
                    Toast.makeText(MainActivity2.this, "그렇지 않다.", Toast.LENGTH_SHORT).show();
                    AnswerData.result(11,2);

                } else if (i == R.id.rb12_3) {
                    Toast.makeText(MainActivity2.this, "보통이다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(11,3);

                } else if (i == R.id.rb12_4) {
                    Toast.makeText(MainActivity2.this, "그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(11,4);

                } else if (i == R.id.rb12_5) {
                    Toast.makeText(MainActivity2.this, "매우 그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(11,5);
                }

            }
        });

        rg13.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override // 라디오 버튼들의 상태 값의 변경됨을 감지
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb13_1) {
                    Toast.makeText(MainActivity2.this, "매우 그렇지 않다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(12,1);


                } else if (i == R.id.rb13_2) {
                    Toast.makeText(MainActivity2.this, "그렇지 않다.", Toast.LENGTH_SHORT).show();
                    AnswerData.result(12,2);

                } else if (i == R.id.rb13_3) {
                    Toast.makeText(MainActivity2.this, "보통이다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(12,3);

                } else if (i == R.id.rb13_4) {
                    Toast.makeText(MainActivity2.this, "그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(12,4);

                } else if (i == R.id.rb13_5) {
                    Toast.makeText(MainActivity2.this, "매우 그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(12,5);
                }

            }
        });

        rg14.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override // 라디오 버튼들의 상태 값의 변경됨을 감지
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb14_1) {
                    Toast.makeText(MainActivity2.this, "매우 그렇지 않다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(13,1);


                } else if (i == R.id.rb14_2) {
                    Toast.makeText(MainActivity2.this, "그렇지 않다.", Toast.LENGTH_SHORT).show();
                    AnswerData.result(13,2);

                } else if (i == R.id.rb14_3) {
                    Toast.makeText(MainActivity2.this, "보통이다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(13,3);

                } else if (i == R.id.rb14_4) {
                    Toast.makeText(MainActivity2.this, "그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(13,4);

                } else if (i == R.id.rb14_5) {
                    Toast.makeText(MainActivity2.this, "매우 그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(13,5);
                }

            }
        });

        rg15.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override // 라디오 버튼들의 상태 값의 변경됨을 감지
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb15_1) {
                    Toast.makeText(MainActivity2.this, "매우 그렇지 않다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(14,1);


                } else if (i == R.id.rb15_2) {
                    Toast.makeText(MainActivity2.this, "그렇지 않다.", Toast.LENGTH_SHORT).show();
                    AnswerData.result(14,2);

                } else if (i == R.id.rb15_3) {
                    Toast.makeText(MainActivity2.this, "보통이다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(14,3);

                } else if (i == R.id.rb15_4) {
                    Toast.makeText(MainActivity2.this, "그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(14,4);

                } else if (i == R.id.rb15_5) {
                    Toast.makeText(MainActivity2.this, "매우 그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(14,5);
                }

            }
        });

        rg16.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override // 라디오 버튼들의 상태 값의 변경됨을 감지
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb16_1) {
                    Toast.makeText(MainActivity2.this, "매우 그렇지 않다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(15,1);


                } else if (i == R.id.rb16_2) {
                    Toast.makeText(MainActivity2.this, "그렇지 않다.", Toast.LENGTH_SHORT).show();
                    AnswerData.result(15,2);

                } else if (i == R.id.rb16_3) {
                    Toast.makeText(MainActivity2.this, "보통이다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(15,3);

                } else if (i == R.id.rb16_4) {
                    Toast.makeText(MainActivity2.this, "그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(15,4);

                } else if (i == R.id.rb16_5) {
                    Toast.makeText(MainActivity2.this, "매우 그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(15,5);
                }

            }
        });

        rg17.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override // 라디오 버튼들의 상태 값의 변경됨을 감지
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb17_1) {
                    Toast.makeText(MainActivity2.this, "매우 그렇지 않다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(16,1);


                } else if (i == R.id.rb17_2) {
                    Toast.makeText(MainActivity2.this, "그렇지 않다.", Toast.LENGTH_SHORT).show();
                    AnswerData.result(16,2);

                } else if (i == R.id.rb17_3) {
                    Toast.makeText(MainActivity2.this, "보통이다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(16,3);

                } else if (i == R.id.rb17_4) {
                    Toast.makeText(MainActivity2.this, "그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(16,4);

                } else if (i == R.id.rb17_5) {
                    Toast.makeText(MainActivity2.this, "매우 그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(16,5);
                }

            }
        });

        rg18.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override // 라디오 버튼들의 상태 값의 변경됨을 감지
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb18_1) {
                    Toast.makeText(MainActivity2.this, "매우 그렇지 않다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(17,1);


                } else if (i == R.id.rb18_2) {
                    Toast.makeText(MainActivity2.this, "그렇지 않다.", Toast.LENGTH_SHORT).show();
                    AnswerData.result(17,2);

                } else if (i == R.id.rb18_3) {
                    Toast.makeText(MainActivity2.this, "보통이다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(17,3);

                } else if (i == R.id.rb18_4) {
                    Toast.makeText(MainActivity2.this, "그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(17,4);

                } else if (i == R.id.rb18_5) {
                    Toast.makeText(MainActivity2.this, "매우 그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(17,5);
                }

            }
        });

        rg19.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override // 라디오 버튼들의 상태 값의 변경됨을 감지
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb19_1) {
                    Toast.makeText(MainActivity2.this, "매우 그렇지 않다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(18,1);


                } else if (i == R.id.rb19_2) {
                    Toast.makeText(MainActivity2.this, "그렇지 않다.", Toast.LENGTH_SHORT).show();
                    AnswerData.result(18,2);

                } else if (i == R.id.rb19_3) {
                    Toast.makeText(MainActivity2.this, "보통이다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(18,3);

                } else if (i == R.id.rb19_4) {
                    Toast.makeText(MainActivity2.this, "그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(18,4);

                } else if (i == R.id.rb19_5) {
                    Toast.makeText(MainActivity2.this, "매우 그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(18,5);
                }

            }
        });

        rg20.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override // 라디오 버튼들의 상태 값의 변경됨을 감지
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb20_1) {
                    Toast.makeText(MainActivity2.this, "매우 그렇지 않다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(19,1);


                } else if (i == R.id.rb20_2) {
                    Toast.makeText(MainActivity2.this, "그렇지 않다.", Toast.LENGTH_SHORT).show();
                    AnswerData.result(19,2);

                } else if (i == R.id.rb20_3) {
                    Toast.makeText(MainActivity2.this, "보통이다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(19,3);

                } else if (i == R.id.rb20_4) {
                    Toast.makeText(MainActivity2.this, "그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(19,4);

                } else if (i == R.id.rb20_5) {
                    Toast.makeText(MainActivity2.this, "매우 그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(19,5);
                }

            }
        });

        rg21.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override // 라디오 버튼들의 상태 값의 변경됨을 감지
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb21_1) {
                    Toast.makeText(MainActivity2.this, "매우 그렇지 않다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(20,1);


                } else if (i == R.id.rb21_2) {
                    Toast.makeText(MainActivity2.this, "그렇지 않다.", Toast.LENGTH_SHORT).show();
                    AnswerData.result(20,2);

                } else if (i == R.id.rb21_3) {
                    Toast.makeText(MainActivity2.this, "보통이다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(20,3);

                } else if (i == R.id.rb21_4) {
                    Toast.makeText(MainActivity2.this, "그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(20,4);

                } else if (i == R.id.rb21_5) {
                    Toast.makeText(MainActivity2.this, "매우 그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(20,5);
                }

            }
        });

        rg22.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override // 라디오 버튼들의 상태 값의 변경됨을 감지
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb22_1) {
                    Toast.makeText(MainActivity2.this, "매우 그렇지 않다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(1,1);


                } else if (i == R.id.rb22_2) {
                    Toast.makeText(MainActivity2.this, "그렇지 않다.", Toast.LENGTH_SHORT).show();
                    AnswerData.result(21,2);

                } else if (i == R.id.rb22_3) {
                    Toast.makeText(MainActivity2.this, "보통이다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(21,3);

                } else if (i == R.id.rb22_4) {
                    Toast.makeText(MainActivity2.this, "그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(21,4);

                } else if (i == R.id.rb22_5) {
                    Toast.makeText(MainActivity2.this, "매우 그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(21,5);
                }

            }
        });

        rg23.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override // 라디오 버튼들의 상태 값의 변경됨을 감지
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb23_1) {
                    Toast.makeText(MainActivity2.this, "매우 그렇지 않다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(22,1);


                } else if (i == R.id.rb23_2) {
                    Toast.makeText(MainActivity2.this, "그렇지 않다.", Toast.LENGTH_SHORT).show();
                    AnswerData.result(22,2);

                } else if (i == R.id.rb23_3) {
                    Toast.makeText(MainActivity2.this, "보통이다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(22,3);

                } else if (i == R.id.rb23_4) {
                    Toast.makeText(MainActivity2.this, "그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(22,4);

                } else if (i == R.id.rb23_5) {
                    Toast.makeText(MainActivity2.this, "매우 그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(22,5);
                }

            }
        });

        rg24.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override // 라디오 버튼들의 상태 값의 변경됨을 감지
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb24_1) {
                    Toast.makeText(MainActivity2.this, "매우 그렇지 않다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(23,1);


                } else if (i == R.id.rb24_2) {
                    Toast.makeText(MainActivity2.this, "그렇지 않다.", Toast.LENGTH_SHORT).show();
                    AnswerData.result(23,2);

                } else if (i == R.id.rb24_3) {
                    Toast.makeText(MainActivity2.this, "보통이다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(23,3);

                } else if (i == R.id.rb24_4) {
                    Toast.makeText(MainActivity2.this, "그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(23,4);

                } else if (i == R.id.rb24_5) {
                    Toast.makeText(MainActivity2.this, "매우 그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(23,5);
                }

            }
        });

        rg25.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override // 라디오 버튼들의 상태 값의 변경됨을 감지
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb25_1) {
                    Toast.makeText(MainActivity2.this, "매우 그렇지 않다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(24,1);


                } else if (i == R.id.rb25_2) {
                    Toast.makeText(MainActivity2.this, "그렇지 않다.", Toast.LENGTH_SHORT).show();
                    AnswerData.result(24,2);

                } else if (i == R.id.rb25_3) {
                    Toast.makeText(MainActivity2.this, "보통이다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(24,3);

                } else if (i == R.id.rb25_4) {
                    Toast.makeText(MainActivity2.this, "그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(24,4);

                } else if (i == R.id.rb25_5) {
                    Toast.makeText(MainActivity2.this, "매우 그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(24,5);
                }

            }
        });

        rg26.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override // 라디오 버튼들의 상태 값의 변경됨을 감지
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb26_1) {
                    Toast.makeText(MainActivity2.this, "매우 그렇지 않다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(25,1);


                } else if (i == R.id.rb26_2) {
                    Toast.makeText(MainActivity2.this, "그렇지 않다.", Toast.LENGTH_SHORT).show();
                    AnswerData.result(25,2);

                } else if (i == R.id.rb26_3) {
                    Toast.makeText(MainActivity2.this, "보통이다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(25,3);

                } else if (i == R.id.rb26_4) {
                    Toast.makeText(MainActivity2.this, "그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(25,4);

                } else if (i == R.id.rb26_5) {
                    Toast.makeText(MainActivity2.this, "매우 그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(25,5);
                }

            }
        });

        rg27.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override // 라디오 버튼들의 상태 값의 변경됨을 감지
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb27_1) {
                    Toast.makeText(MainActivity2.this, "매우 그렇지 않다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(26,1);


                } else if (i == R.id.rb27_2) {
                    Toast.makeText(MainActivity2.this, "그렇지 않다.", Toast.LENGTH_SHORT).show();
                    AnswerData.result(26,2);

                } else if (i == R.id.rb27_3) {
                    Toast.makeText(MainActivity2.this, "보통이다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(26,3);

                } else if (i == R.id.rb27_4) {
                    Toast.makeText(MainActivity2.this, "그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(26,4);

                } else if (i == R.id.rb27_5) {
                    Toast.makeText(MainActivity2.this, "매우 그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(26,5);
                }

            }
        });

        rg28.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override // 라디오 버튼들의 상태 값의 변경됨을 감지
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb28_1) {
                    Toast.makeText(MainActivity2.this, "매우 그렇지 않다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(27,1);


                } else if (i == R.id.rb28_2) {
                    Toast.makeText(MainActivity2.this, "그렇지 않다.", Toast.LENGTH_SHORT).show();
                    AnswerData.result(27,2);

                } else if (i == R.id.rb28_3) {
                    Toast.makeText(MainActivity2.this, "보통이다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(27,3);

                } else if (i == R.id.rb28_4) {
                    Toast.makeText(MainActivity2.this, "그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(27,4);

                } else if (i == R.id.rb28_5) {
                    Toast.makeText(MainActivity2.this, "매우 그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(27,5);
                }

            }
        });

        rg29.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override // 라디오 버튼들의 상태 값의 변경됨을 감지
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb29_1) {
                    Toast.makeText(MainActivity2.this, "매우 그렇지 않다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(28,1);


                } else if (i == R.id.rb29_2) {
                    Toast.makeText(MainActivity2.this, "그렇지 않다.", Toast.LENGTH_SHORT).show();
                    AnswerData.result(28,2);

                } else if (i == R.id.rb29_3) {
                    Toast.makeText(MainActivity2.this, "보통이다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(28,3);

                } else if (i == R.id.rb29_4) {
                    Toast.makeText(MainActivity2.this, "그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(28,4);

                } else if (i == R.id.rb29_5) {
                    Toast.makeText(MainActivity2.this, "매우 그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(28,5);
                }

            }
        });

        rg30.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override // 라디오 버튼들의 상태 값의 변경됨을 감지
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb30_1) {
                    Toast.makeText(MainActivity2.this, "매우 그렇지 않다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(29,1);


                } else if (i == R.id.rb30_2) {
                    Toast.makeText(MainActivity2.this, "그렇지 않다.", Toast.LENGTH_SHORT).show();
                    AnswerData.result(29,2);

                } else if (i == R.id.rb30_3) {
                    Toast.makeText(MainActivity2.this, "보통이다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(29,3);

                } else if (i == R.id.rb30_4) {
                    Toast.makeText(MainActivity2.this, "그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(29,4);

                } else if (i == R.id.rb30_5) {
                    Toast.makeText(MainActivity2.this, "그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(29,5);

                }

            }
        });


        btn_move.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity2.this,MainActivity3.class);
                startActivity(intent);
            }
        });

    }
}