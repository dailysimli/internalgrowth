package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity7 extends AppCompatActivity {




    private static int[][] convertToMatrix(int[] list, int rows, int cols) {
        if (list.length != rows * cols) {
            throw new IllegalArgumentException("Invalid list size for the given matrix dimensions.");
        }

        int[][] matrix = new int[rows][cols];
        int index = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = list[index++];
            }
        }

        return matrix;
    }




    private static List<Integer> calculateRowSum(int[][] matrix) {
        List<Integer> rowSum = new ArrayList<>();

        for (int i = 0; i < matrix.length; i++) {
            int sum = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
            rowSum.add(sum);
        }

        return rowSum;
    }








    private static List<String> mapRowSum(List<Integer> rowSum) {
        List<String> mappedRowSum = new ArrayList<>();
        String[] mapping = {"창의성", "호기심", "개방성", "학구열", "지혜", "사랑", "친절성", "사회지능", "용감성", "끈기", "진실성", "활력", "용서", "겸손", "신중성", "자기조절", "시민정신", "공정성", "리더십", "감상력", "감사", "유머감각", "영성", "낙관성"};

        for (int i = 0; i < rowSum.size(); i++) {
            int index = i % mapping.length;
            mappedRowSum.add(mapping[index]);
        }

        return mappedRowSum;

    }

    private static int findMaxRowSum(List<Integer> rowSum) {
        int maxRowSum = Integer.MIN_VALUE;

        for (int sum : rowSum) {
            if (sum > maxRowSum) {
                maxRowSum = sum;
            }
        }

        return maxRowSum;
    }

    private static List<String> findMappingForMaxRowSum(List<Integer> rowSum, List<String> mappedRowSum, int maxRowSum) {
        List<String> maxRowSumMapping = new ArrayList<>();

        for (int i = 0; i < rowSum.size(); i++) {
            if (rowSum.get(i) == maxRowSum) {
                maxRowSumMapping.add(rowSum.get(i) + " -> " + mappedRowSum.get(i));
            }
        }

        return maxRowSumMapping;
    }



    private static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    private Button btn_move6;


    private RadioGroup rg115, rg116, rg117, rg118, rg119, rg120,rg121, rg122, rg123, rg124, rg125, rg126, rg127, rg128, rg129, rg130, rg131, rg132, rg133, rg134, rg135, rg136, rg137, rg138, rg139, rg140,
            rg141, rg142, rg143, rg144;

    private RadioButton rb115_1, rb115_2, rb115_3, rb115_4, rb115_5;
    private RadioButton rb116_1, rb116_2, rb116_3, rb116_4, rb116_5;
    private RadioButton rb117_1, rb117_2, rb117_3, rb117_4, rb117_5;
    private RadioButton rb118_1, rb118_2, rb118_3, rb118_4, rb118_5;
    private RadioButton rb119_1, rb119_2, rb119_3, rb119_4, rb119_5;
    private RadioButton rb120_1, rb120_2, rb120_3, rb120_4, rb120_5;
    private RadioButton rb121_1, rb121_2, rb121_3, rb121_4, rb121_5;
    private RadioButton rb122_1, rb122_2, rb122_3, rb122_4, rb122_5;
    private RadioButton rb123_1, rb123_2, rb123_3, rb123_4, rb123_5;
    private RadioButton rb124_1, rb124_2, rb124_3, rb124_4, rb124_5;
    private RadioButton rb125_1, rb125_2, rb125_3, rb125_4, rb125_5;
    private RadioButton rb126_1, rb126_2, rb126_3, rb126_4, rb126_5;
    private RadioButton rb127_1, rb127_2, rb127_3, rb127_4, rb127_5;
    private RadioButton rb128_1, rb128_2, rb128_3, rb128_4, rb128_5;
    private RadioButton rb129_1, rb129_2, rb129_3, rb129_4, rb129_5;
    private RadioButton rb130_1, rb130_2, rb130_3, rb130_4, rb130_5;
    private RadioButton rb131_1, rb131_2, rb131_3, rb131_4, rb131_5;
    private RadioButton rb132_1, rb132_2, rb132_3, rb132_4, rb132_5;
    private RadioButton rb133_1, rb133_2, rb133_3, rb133_4, rb133_5;
    private RadioButton rb134_1, rb134_2, rb134_3, rb134_4, rb134_5;
    private RadioButton rb135_1, rb135_2, rb135_3, rb135_4, rb135_5;
    private RadioButton rb136_1, rb136_2, rb136_3, rb136_4, rb136_5;
    private RadioButton rb137_1, rb137_2, rb137_3, rb137_4, rb137_5;
    private RadioButton rb138_1, rb138_2, rb138_3, rb138_4, rb138_5;
    private RadioButton rb139_1, rb139_2, rb139_3, rb139_4, rb139_5;
    private RadioButton rb140_1, rb140_2, rb140_3, rb140_4, rb140_5;
    private RadioButton rb141_1, rb141_2, rb141_3, rb141_4, rb141_5;
    private RadioButton rb142_1, rb142_2, rb142_3, rb142_4, rb142_5;
    private RadioButton rb143_1, rb143_2, rb143_3, rb143_4, rb143_5;
    private RadioButton rb144_1, rb144_2, rb144_3, rb144_4, rb144_5;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);

        btn_move6= (Button)findViewById(R.id.btn_move6);


        rg115 = findViewById(R.id.rg115);//라디오 버튼을 담고 있는 그룹
        rb115_1 = findViewById(R.id.rb115_1); //라디오 버튼
        rb115_2 = findViewById(R.id.rb115_2); //라디오 버튼
        rb115_3 = findViewById(R.id.rb115_3);
        rb115_4 = findViewById(R.id.rb115_4);
        rb115_5 = findViewById(R.id.rb115_5);

        rg116 = findViewById(R.id.rg116);//라디오 버튼을 담고 있는 그룹
        rb116_1 = findViewById(R.id.rb116_1); //라디오 버튼
        rb116_2 = findViewById(R.id.rb116_2); //라디오 버튼
        rb116_3 = findViewById(R.id.rb116_3);
        rb116_4 = findViewById(R.id.rb116_4);
        rb116_5 = findViewById(R.id.rb116_5);

        rg117 = findViewById(R.id.rg117);//라디오 버튼을 담고 있는 그룹
        rb117_1 = findViewById(R.id.rb117_1); //라디오 버튼
        rb117_2 = findViewById(R.id.rb117_2); //라디오 버튼
        rb117_3 = findViewById(R.id.rb117_3);
        rb117_4 = findViewById(R.id.rb117_4);
        rb117_5 = findViewById(R.id.rb117_5);

        rg118 = findViewById(R.id.rg118);//라디오 버튼을 담고 있는 그룹
        rb118_1 = findViewById(R.id.rb118_1); //라디오 버튼
        rb118_2 = findViewById(R.id.rb118_2); //라디오 버튼
        rb118_3 = findViewById(R.id.rb118_3);
        rb118_4 = findViewById(R.id.rb118_4);
        rb118_5 = findViewById(R.id.rb118_5);

        rg119 = findViewById(R.id.rg119);//라디오 버튼을 담고 있는 그룹
        rb119_1 = findViewById(R.id.rb119_1); //라디오 버튼
        rb119_2 = findViewById(R.id.rb119_2); //라디오 버튼
        rb119_3 = findViewById(R.id.rb119_3);
        rb119_4 = findViewById(R.id.rb119_4);
        rb119_5 = findViewById(R.id.rb119_5);

        rg120 = findViewById(R.id.rg120);//라디오 버튼을 담고 있는 그룹
        rb120_1 = findViewById(R.id.rb120_1); //라디오 버튼
        rb120_2 = findViewById(R.id.rb120_2); //라디오 버튼
        rb120_3 = findViewById(R.id.rb120_3);
        rb120_4 = findViewById(R.id.rb120_4);
        rb120_5 = findViewById(R.id.rb120_5);

        rg121 = findViewById(R.id.rg121);//라디오 버튼을 담고 있는 그룹
        rb121_1 = findViewById(R.id.rb121_1); //라디오 버튼
        rb121_2 = findViewById(R.id.rb121_2); //라디오 버튼
        rb121_3 = findViewById(R.id.rb121_3);
        rb121_4 = findViewById(R.id.rb121_4);
        rb121_5 = findViewById(R.id.rb121_5);

        rg122 = findViewById(R.id.rg122);//라디오 버튼을 담고 있는 그룹
        rb122_1 = findViewById(R.id.rb122_1); //라디오 버튼
        rb122_2 = findViewById(R.id.rb122_2); //라디오 버튼
        rb122_3 = findViewById(R.id.rb122_3);
        rb122_4 = findViewById(R.id.rb122_4);
        rb122_5 = findViewById(R.id.rb122_5);

        rg123 = findViewById(R.id.rg123);//라디오 버튼을 담고 있는 그룹
        rb123_1 = findViewById(R.id.rb123_1); //라디오 버튼
        rb123_2 = findViewById(R.id.rb123_2); //라디오 버튼
        rb123_3 = findViewById(R.id.rb123_3);
        rb123_4 = findViewById(R.id.rb123_4);
        rb123_5 = findViewById(R.id.rb123_5);

        rg124 = findViewById(R.id.rg124);//라디오 버튼을 담고 있는 그룹
        rb124_1 = findViewById(R.id.rb124_1); //라디오 버튼
        rb124_2 = findViewById(R.id.rb124_2); //라디오 버튼
        rb124_3 = findViewById(R.id.rb124_3);
        rb124_4 = findViewById(R.id.rb124_4);
        rb124_5 = findViewById(R.id.rb124_5);

        rg125 = findViewById(R.id.rg125);//라디오 버튼을 담고 있는 그룹
        rb125_1 = findViewById(R.id.rb125_1); //라디오 버튼
        rb125_2 = findViewById(R.id.rb125_2); //라디오 버튼
        rb125_3 = findViewById(R.id.rb125_3);
        rb125_4 = findViewById(R.id.rb125_4);
        rb125_5 = findViewById(R.id.rb125_5);

        rg126 = findViewById(R.id.rg126);//라디오 버튼을 담고 있는 그룹
        rb126_1 = findViewById(R.id.rb126_1); //라디오 버튼
        rb126_2 = findViewById(R.id.rb126_2); //라디오 버튼
        rb126_3 = findViewById(R.id.rb126_3);
        rb126_4 = findViewById(R.id.rb126_4);
        rb126_5 = findViewById(R.id.rb126_5);

        rg127 = findViewById(R.id.rg127);//라디오 버튼을 담고 있는 그룹
        rb127_1 = findViewById(R.id.rb127_1); //라디오 버튼
        rb127_2 = findViewById(R.id.rb127_2); //라디오 버튼
        rb127_3 = findViewById(R.id.rb127_3);
        rb127_4 = findViewById(R.id.rb127_4);
        rb127_5 = findViewById(R.id.rb127_5);

        rg128 = findViewById(R.id.rg128);//라디오 버튼을 담고 있는 그룹
        rb128_1 = findViewById(R.id.rb128_1); //라디오 버튼
        rb128_2 = findViewById(R.id.rb128_2); //라디오 버튼
        rb128_3 = findViewById(R.id.rb128_3);
        rb128_4 = findViewById(R.id.rb128_4);
        rb128_5 = findViewById(R.id.rb128_5);

        rg129 = findViewById(R.id.rg129);//라디오 버튼을 담고 있는 그룹
        rb129_1 = findViewById(R.id.rb129_1); //라디오 버튼
        rb129_2 = findViewById(R.id.rb129_2); //라디오 버튼
        rb129_3 = findViewById(R.id.rb129_3);
        rb129_4 = findViewById(R.id.rb129_4);
        rb129_5 = findViewById(R.id.rb129_5);

        rg130 = findViewById(R.id.rg130);//라디오 버튼을 담고 있는 그룹
        rb130_1 = findViewById(R.id.rb130_1); //라디오 버튼
        rb130_2 = findViewById(R.id.rb130_2); //라디오 버튼
        rb130_3 = findViewById(R.id.rb130_3);
        rb130_4 = findViewById(R.id.rb130_4);
        rb130_5 = findViewById(R.id.rb130_5);


        rg131 = findViewById(R.id.rg131);//라디오 버튼을 담고 있는 그룹
        rb131_1 = findViewById(R.id.rb131_1); //라디오 버튼
        rb131_2 = findViewById(R.id.rb131_2); //라디오 버튼
        rb131_3 = findViewById(R.id.rb131_3);
        rb131_4 = findViewById(R.id.rb131_4);
        rb131_5 = findViewById(R.id.rb131_5);

        rg132 = findViewById(R.id.rg132);//라디오 버튼을 담고 있는 그룹
        rb132_1 = findViewById(R.id.rb132_1); //라디오 버튼
        rb132_2 = findViewById(R.id.rb132_2); //라디오 버튼
        rb132_3 = findViewById(R.id.rb132_3);
        rb132_4 = findViewById(R.id.rb132_4);
        rb132_5 = findViewById(R.id.rb132_5);

        rg133 = findViewById(R.id.rg133);//라디오 버튼을 담고 있는 그룹
        rb133_1 = findViewById(R.id.rb133_1); //라디오 버튼
        rb133_2 = findViewById(R.id.rb133_2); //라디오 버튼
        rb133_3 = findViewById(R.id.rb133_3);
        rb133_4 = findViewById(R.id.rb133_4);
        rb133_5 = findViewById(R.id.rb133_5);

        rg134 = findViewById(R.id.rg134);//라디오 버튼을 담고 있는 그룹
        rb134_1 = findViewById(R.id.rb134_1); //라디오 버튼
        rb134_2 = findViewById(R.id.rb134_2); //라디오 버튼
        rb134_3 = findViewById(R.id.rb134_3);
        rb134_4 = findViewById(R.id.rb134_4);
        rb134_5 = findViewById(R.id.rb134_5);

        rg135 = findViewById(R.id.rg135);//라디오 버튼을 담고 있는 그룹
        rb135_1 = findViewById(R.id.rb135_1); //라디오 버튼
        rb135_2 = findViewById(R.id.rb135_2); //라디오 버튼
        rb135_3 = findViewById(R.id.rb135_3);
        rb135_4 = findViewById(R.id.rb135_4);
        rb135_5 = findViewById(R.id.rb135_5);

        rg136 = findViewById(R.id.rg136);//라디오 버튼을 담고 있는 그룹
        rb136_1 = findViewById(R.id.rb136_1); //라디오 버튼
        rb136_2 = findViewById(R.id.rb136_2); //라디오 버튼
        rb136_3 = findViewById(R.id.rb136_3);
        rb136_4 = findViewById(R.id.rb136_4);
        rb136_5 = findViewById(R.id.rb136_5);

        rg137 = findViewById(R.id.rg137);//라디오 버튼을 담고 있는 그룹
        rb137_1 = findViewById(R.id.rb137_1); //라디오 버튼
        rb137_2 = findViewById(R.id.rb137_2); //라디오 버튼
        rb137_3 = findViewById(R.id.rb137_3);
        rb137_4 = findViewById(R.id.rb137_4);
        rb137_5 = findViewById(R.id.rb137_5);

        rg138 = findViewById(R.id.rg138);//라디오 버튼을 담고 있는 그룹
        rb138_1 = findViewById(R.id.rb138_1); //라디오 버튼
        rb138_2 = findViewById(R.id.rb138_2); //라디오 버튼
        rb138_3 = findViewById(R.id.rb138_3);
        rb138_4 = findViewById(R.id.rb138_4);
        rb138_5 = findViewById(R.id.rb138_5);

        rg139 = findViewById(R.id.rg139);//라디오 버튼을 담고 있는 그룹
        rb139_1 = findViewById(R.id.rb139_1); //라디오 버튼
        rb139_2 = findViewById(R.id.rb139_2); //라디오 버튼
        rb139_3 = findViewById(R.id.rb139_3);
        rb139_4 = findViewById(R.id.rb139_4);
        rb139_5 = findViewById(R.id.rb139_5);

        rg140 = findViewById(R.id.rg140);//라디오 버튼을 담고 있는 그룹
        rb140_1 = findViewById(R.id.rb140_1); //라디오 버튼
        rb140_2 = findViewById(R.id.rb140_2); //라디오 버튼
        rb140_3 = findViewById(R.id.rb140_3);
        rb140_4 = findViewById(R.id.rb140_4);
        rb140_5 = findViewById(R.id.rb140_5);

        rg141 = findViewById(R.id.rg141);//라디오 버튼을 담고 있는 그룹
        rb141_1 = findViewById(R.id.rb141_1); //라디오 버튼
        rb141_2 = findViewById(R.id.rb141_2); //라디오 버튼
        rb141_3 = findViewById(R.id.rb141_3);
        rb141_4 = findViewById(R.id.rb141_4);
        rb141_5 = findViewById(R.id.rb141_5);

        rg142 = findViewById(R.id.rg142);//라디오 버튼을 담고 있는 그룹
        rb142_1 = findViewById(R.id.rb142_1); //라디오 버튼
        rb142_2 = findViewById(R.id.rb142_2); //라디오 버튼
        rb142_3 = findViewById(R.id.rb142_3);
        rb142_4 = findViewById(R.id.rb142_4);
        rb142_5 = findViewById(R.id.rb142_5);

        rg143 = findViewById(R.id.rg143);//라디오 버튼을 담고 있는 그룹
        rb143_1 = findViewById(R.id.rb143_1); //라디오 버튼
        rb143_2 = findViewById(R.id.rb143_2); //라디오 버튼
        rb143_3 = findViewById(R.id.rb143_3);
        rb143_4 = findViewById(R.id.rb143_4);
        rb143_5 = findViewById(R.id.rb143_5);

        rg144 = findViewById(R.id.rg144);//라디오 버튼을 담고 있는 그룹
        rb144_1 = findViewById(R.id.rb144_1); //라디오 버튼
        rb144_2 = findViewById(R.id.rb144_2); //라디오 버튼
        rb144_3 = findViewById(R.id.rb144_3);
        rb144_4 = findViewById(R.id.rb144_4);
        rb144_5 = findViewById(R.id.rb144_5);



        rg115.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override // 라디오 버튼들의 상태 값의 변경됨을 감지
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb115_1) {
                    Toast.makeText(MainActivity7.this, "매우 그렇지 않다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(14,1);


                } else if (i == R.id.rb115_2) {
                    Toast.makeText(MainActivity7.this, "그렇지 않다.", Toast.LENGTH_SHORT).show();
                    AnswerData.result(114,2);

                } else if (i == R.id.rb115_3) {
                    Toast.makeText(MainActivity7.this, "보통이다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(114,3);

                } else if (i == R.id.rb115_4) {
                    Toast.makeText(MainActivity7.this, "그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(114,4);

                } else if (i == R.id.rb115_5) {
                    Toast.makeText(MainActivity7.this, "매우 그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(114,5);
                }

            }
        });

        rg116.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override // 라디오 버튼들의 상태 값의 변경됨을 감지
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb116_1) {
                    Toast.makeText(MainActivity7.this, "매우 그렇지 않다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(5,1);


                } else if (i == R.id.rb116_2) {
                    Toast.makeText(MainActivity7.this, "그렇지 않다.", Toast.LENGTH_SHORT).show();
                    AnswerData.result(115,2);

                } else if (i == R.id.rb116_3) {
                    Toast.makeText(MainActivity7.this, "보통이다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(115,3);

                } else if (i == R.id.rb116_4) {
                    Toast.makeText(MainActivity7.this, "그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(115,4);

                } else if (i == R.id.rb116_5) {
                    Toast.makeText(MainActivity7.this, "매우 그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(115,5);
                }

            }
        });

        rg117.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override // 라디오 버튼들의 상태 값의 변경됨을 감지
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb117_1) {
                    Toast.makeText(MainActivity7.this, "매우 그렇지 않다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(116,1);


                } else if (i == R.id.rb117_2) {
                    Toast.makeText(MainActivity7.this, "그렇지 않다.", Toast.LENGTH_SHORT).show();
                    AnswerData.result(116,2);

                } else if (i == R.id.rb117_3) {
                    Toast.makeText(MainActivity7.this, "보통이다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(116,3);

                } else if (i == R.id.rb117_4) {
                    Toast.makeText(MainActivity7.this, "그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(116,4);

                } else if (i == R.id.rb117_5) {
                    Toast.makeText(MainActivity7.this, "매우 그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(116,5);
                }

            }
        });

        rg118.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override // 라디오 버튼들의 상태 값의 변경됨을 감지
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb118_1) {
                    Toast.makeText(MainActivity7.this, "매우 그렇지 않다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(117,1);


                } else if (i == R.id.rb118_2) {
                    Toast.makeText(MainActivity7.this, "그렇지 않다.", Toast.LENGTH_SHORT).show();
                    AnswerData.result(117,2);

                } else if (i == R.id.rb118_3) {
                    Toast.makeText(MainActivity7.this, "보통이다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(117,3);

                } else if (i == R.id.rb118_4) {
                    Toast.makeText(MainActivity7.this, "그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(117,4);

                } else if (i == R.id.rb118_5) {
                    Toast.makeText(MainActivity7.this, "매우 그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(117,5);
                }

            }
        });

        rg119.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override // 라디오 버튼들의 상태 값의 변경됨을 감지
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb119_1) {
                    Toast.makeText(MainActivity7.this, "매우 그렇지 않다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(118,1);


                } else if (i == R.id.rb119_2) {
                    Toast.makeText(MainActivity7.this, "그렇지 않다.", Toast.LENGTH_SHORT).show();
                    AnswerData.result(118,2);

                } else if (i == R.id.rb119_3) {
                    Toast.makeText(MainActivity7.this, "보통이다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(118,3);

                } else if (i == R.id.rb119_4) {
                    Toast.makeText(MainActivity7.this, "그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(118,4);

                } else if (i == R.id.rb119_5) {
                    Toast.makeText(MainActivity7.this, "매우 그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(118,5);
                }

            }
        });

        rg120.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override // 라디오 버튼들의 상태 값의 변경됨을 감지
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb120_1) {
                    Toast.makeText(MainActivity7.this, "매우 그렇지 않다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(119,1);


                } else if (i == R.id.rb120_2) {
                    Toast.makeText(MainActivity7.this, "그렇지 않다.", Toast.LENGTH_SHORT).show();
                    AnswerData.result(119,2);

                } else if (i == R.id.rb120_3) {
                    Toast.makeText(MainActivity7.this, "보통이다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(119,3);

                } else if (i == R.id.rb120_4) {
                    Toast.makeText(MainActivity7.this, "그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(119,4);

                } else if (i == R.id.rb120_5) {
                    Toast.makeText(MainActivity7.this, "매우 그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(119,5);
                }

            }
        });

        rg121.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override // 라디오 버튼들의 상태 값의 변경됨을 감지
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb121_1) {
                    Toast.makeText(MainActivity7.this, "매우 그렇지 않다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(120,1);


                } else if (i == R.id.rb121_2) {
                    Toast.makeText(MainActivity7.this, "그렇지 않다.", Toast.LENGTH_SHORT).show();
                    AnswerData.result(120,2);

                } else if (i == R.id.rb121_3) {
                    Toast.makeText(MainActivity7.this, "보통이다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(120,3);

                } else if (i == R.id.rb121_4) {
                    Toast.makeText(MainActivity7.this, "그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(120,4);

                } else if (i == R.id.rb121_5) {
                    Toast.makeText(MainActivity7.this, "매우 그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(120,5);
                }

            }
        });

        rg122.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override // 라디오 버튼들의 상태 값의 변경됨을 감지
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb122_1) {
                    Toast.makeText(MainActivity7.this, "매우 그렇지 않다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(121,1);


                } else if (i == R.id.rb122_2) {
                    Toast.makeText(MainActivity7.this, "그렇지 않다.", Toast.LENGTH_SHORT).show();
                    AnswerData.result(121,2);

                } else if (i == R.id.rb122_3) {
                    Toast.makeText(MainActivity7.this, "보통이다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(121,3);

                } else if (i == R.id.rb122_4) {
                    Toast.makeText(MainActivity7.this, "그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(121,4);

                } else if (i == R.id.rb122_5) {
                    Toast.makeText(MainActivity7.this, "매우 그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(121,5);
                }

            }
        });

        rg123.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override // 라디오 버튼들의 상태 값의 변경됨을 감지
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb123_1) {
                    Toast.makeText(MainActivity7.this, "매우 그렇지 않다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(122,1);


                } else if (i == R.id.rb123_2) {
                    Toast.makeText(MainActivity7.this, "그렇지 않다.", Toast.LENGTH_SHORT).show();
                    AnswerData.result(122,2);

                } else if (i == R.id.rb123_3) {
                    Toast.makeText(MainActivity7.this, "보통이다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(122,3);

                } else if (i == R.id.rb123_4) {
                    Toast.makeText(MainActivity7.this, "그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(122,4);

                } else if (i == R.id.rb123_5) {
                    Toast.makeText(MainActivity7.this, "매우 그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(122,5);
                }

            }
        });

        rg124.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override // 라디오 버튼들의 상태 값의 변경됨을 감지
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb124_1) {
                    Toast.makeText(MainActivity7.this, "매우 그렇지 않다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(123,1);


                } else if (i == R.id.rb124_2) {
                    Toast.makeText(MainActivity7.this, "그렇지 않다.", Toast.LENGTH_SHORT).show();
                    AnswerData.result(123,2);

                } else if (i == R.id.rb124_3) {
                    Toast.makeText(MainActivity7.this, "보통이다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(123,3);

                } else if (i == R.id.rb124_4) {
                    Toast.makeText(MainActivity7.this, "그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(123,4);

                } else if (i == R.id.rb124_5) {
                    Toast.makeText(MainActivity7.this, "매우 그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(123,5);
                }

            }
        });

        rg125.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override // 라디오 버튼들의 상태 값의 변경됨을 감지
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb125_1) {
                    Toast.makeText(MainActivity7.this, "매우 그렇지 않다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(124,1);


                } else if (i == R.id.rb125_2) {
                    Toast.makeText(MainActivity7.this, "그렇지 않다.", Toast.LENGTH_SHORT).show();
                    AnswerData.result(124,2);

                } else if (i == R.id.rb125_3) {
                    Toast.makeText(MainActivity7.this, "보통이다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(124,3);

                } else if (i == R.id.rb125_4) {
                    Toast.makeText(MainActivity7.this, "그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(124,4);

                } else if (i == R.id.rb125_5) {
                    Toast.makeText(MainActivity7.this, "매우 그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(124,5);
                }

            }
        });

        rg126.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override // 라디오 버튼들의 상태 값의 변경됨을 감지
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb126_1) {
                    Toast.makeText(MainActivity7.this, "매우 그렇지 않다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(125,1);


                } else if (i == R.id.rb126_2) {
                    Toast.makeText(MainActivity7.this, "그렇지 않다.", Toast.LENGTH_SHORT).show();
                    AnswerData.result(125,2);

                } else if (i == R.id.rb126_3) {
                    Toast.makeText(MainActivity7.this, "보통이다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(125,3);

                } else if (i == R.id.rb126_4) {
                    Toast.makeText(MainActivity7.this, "그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(125,4);

                } else if (i == R.id.rb126_5) {
                    Toast.makeText(MainActivity7.this, "매우 그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(125,5);
                }

            }
        });

        rg127.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override // 라디오 버튼들의 상태 값의 변경됨을 감지
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb127_1) {
                    Toast.makeText(MainActivity7.this, "매우 그렇지 않다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(126,1);


                } else if (i == R.id.rb127_2) {
                    Toast.makeText(MainActivity7.this, "그렇지 않다.", Toast.LENGTH_SHORT).show();
                    AnswerData.result(126,2);

                } else if (i == R.id.rb127_3) {
                    Toast.makeText(MainActivity7.this, "보통이다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(126,3);

                } else if (i == R.id.rb127_4) {
                    Toast.makeText(MainActivity7.this, "그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(126,4);

                } else if (i == R.id.rb127_5) {
                    Toast.makeText(MainActivity7.this, "매우 그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(126,5);
                }

            }
        });

        rg128.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override // 라디오 버튼들의 상태 값의 변경됨을 감지
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb128_1) {
                    Toast.makeText(MainActivity7.this, "매우 그렇지 않다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(127,1);


                } else if (i == R.id.rb128_2) {
                    Toast.makeText(MainActivity7.this, "그렇지 않다.", Toast.LENGTH_SHORT).show();
                    AnswerData.result(127,2);

                } else if (i == R.id.rb128_3) {
                    Toast.makeText(MainActivity7.this, "보통이다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(127,3);

                } else if (i == R.id.rb128_4) {
                    Toast.makeText(MainActivity7.this, "그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(127,4);

                } else if (i == R.id.rb128_5) {
                    Toast.makeText(MainActivity7.this, "매우 그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(127,5);
                }

            }
        });

        rg129.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override // 라디오 버튼들의 상태 값의 변경됨을 감지
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb129_1) {
                    Toast.makeText(MainActivity7.this, "매우 그렇지 않다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(128,1);


                } else if (i == R.id.rb129_2) {
                    Toast.makeText(MainActivity7.this, "그렇지 않다.", Toast.LENGTH_SHORT).show();
                    AnswerData.result(128,2);

                } else if (i == R.id.rb129_3) {
                    Toast.makeText(MainActivity7.this, "보통이다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(128,3);

                } else if (i == R.id.rb129_4) {
                    Toast.makeText(MainActivity7.this, "그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(128,4);

                } else if (i == R.id.rb129_5) {
                    Toast.makeText(MainActivity7.this, "매우 그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(128,5);
                }

            }
        });

        rg130.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override // 라디오 버튼들의 상태 값의 변경됨을 감지
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb130_1) {
                    Toast.makeText(MainActivity7.this, "매우 그렇지 않다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(129,1);


                } else if (i == R.id.rb130_2) {
                    Toast.makeText(MainActivity7.this, "그렇지 않다.", Toast.LENGTH_SHORT).show();
                    AnswerData.result(129,2);

                } else if (i == R.id.rb130_3) {
                    Toast.makeText(MainActivity7.this, "보통이다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(129,3);

                } else if (i == R.id.rb130_4) {
                    Toast.makeText(MainActivity7.this, "그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(129,4);

                } else if (i == R.id.rb130_5) {
                    Toast.makeText(MainActivity7.this, "매우 그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(129,5);
                }

            }
        });

        rg131.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override // 라디오 버튼들의 상태 값의 변경됨을 감지
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb131_1) {
                    Toast.makeText(MainActivity7.this, "매우 그렇지 않다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(130,1);


                } else if (i == R.id.rb131_2) {
                    Toast.makeText(MainActivity7.this, "그렇지 않다.", Toast.LENGTH_SHORT).show();
                    AnswerData.result(130,2);

                } else if (i == R.id.rb131_3) {
                    Toast.makeText(MainActivity7.this, "보통이다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(130,3);

                } else if (i == R.id.rb131_4) {
                    Toast.makeText(MainActivity7.this, "그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(130,4);

                } else if (i == R.id.rb131_5) {
                    Toast.makeText(MainActivity7.this, "매우 그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(130,5);
                }

            }
        });

        rg132.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override // 라디오 버튼들의 상태 값의 변경됨을 감지
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb132_1) {
                    Toast.makeText(MainActivity7.this, "매우 그렇지 않다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(131,1);


                } else if (i == R.id.rb132_2) {
                    Toast.makeText(MainActivity7.this, "그렇지 않다.", Toast.LENGTH_SHORT).show();
                    AnswerData.result(131,2);

                } else if (i == R.id.rb132_3) {
                    Toast.makeText(MainActivity7.this, "보통이다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(131,3);

                } else if (i == R.id.rb132_4) {
                    Toast.makeText(MainActivity7.this, "그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(131,4);

                } else if (i == R.id.rb132_5) {
                    Toast.makeText(MainActivity7.this, "매우 그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(131,5);
                }

            }
        });

        rg133.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override // 라디오 버튼들의 상태 값의 변경됨을 감지
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb133_1) {
                    Toast.makeText(MainActivity7.this, "매우 그렇지 않다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(132,1);


                } else if (i == R.id.rb133_2) {
                    Toast.makeText(MainActivity7.this, "그렇지 않다.", Toast.LENGTH_SHORT).show();
                    AnswerData.result(132,2);

                } else if (i == R.id.rb133_3) {
                    Toast.makeText(MainActivity7.this, "보통이다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(132,3);

                } else if (i == R.id.rb133_4) {
                    Toast.makeText(MainActivity7.this, "그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(132,4);

                } else if (i == R.id.rb133_5) {
                    Toast.makeText(MainActivity7.this, "매우 그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(132,5);
                }

            }
        });

        rg134.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override // 라디오 버튼들의 상태 값의 변경됨을 감지
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb134_1) {
                    Toast.makeText(MainActivity7.this, "매우 그렇지 않다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(133,1);


                } else if (i == R.id.rb134_2) {
                    Toast.makeText(MainActivity7.this, "그렇지 않다.", Toast.LENGTH_SHORT).show();
                    AnswerData.result(133,2);

                } else if (i == R.id.rb134_3) {
                    Toast.makeText(MainActivity7.this, "보통이다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(133,3);

                } else if (i == R.id.rb134_4) {
                    Toast.makeText(MainActivity7.this, "그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(133,4);

                } else if (i == R.id.rb134_5) {
                    Toast.makeText(MainActivity7.this, "매우 그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(133,5);
                }

            }
        });

        rg135.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override // 라디오 버튼들의 상태 값의 변경됨을 감지
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb135_1) {
                    Toast.makeText(MainActivity7.this, "매우 그렇지 않다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(134,1);


                } else if (i == R.id.rb135_2) {
                    Toast.makeText(MainActivity7.this, "그렇지 않다.", Toast.LENGTH_SHORT).show();
                    AnswerData.result(134,2);

                } else if (i == R.id.rb135_3) {
                    Toast.makeText(MainActivity7.this, "보통이다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(134,3);

                } else if (i == R.id.rb135_4) {
                    Toast.makeText(MainActivity7.this, "그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(134,4);

                } else if (i == R.id.rb135_5) {
                    Toast.makeText(MainActivity7.this, "매우 그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(134,5);
                }

            }
        });

        rg136.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override // 라디오 버튼들의 상태 값의 변경됨을 감지
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb136_1) {
                    Toast.makeText(MainActivity7.this, "매우 그렇지 않다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(135,1);


                } else if (i == R.id.rb136_2) {
                    Toast.makeText(MainActivity7.this, "그렇지 않다.", Toast.LENGTH_SHORT).show();
                    AnswerData.result(135,2);

                } else if (i == R.id.rb136_3) {
                    Toast.makeText(MainActivity7.this, "보통이다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(135,3);

                } else if (i == R.id.rb136_4) {
                    Toast.makeText(MainActivity7.this, "그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(135,4);

                } else if (i == R.id.rb136_5) {
                    Toast.makeText(MainActivity7.this, "매우 그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(135,5);
                }

            }
        });

        rg137.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override // 라디오 버튼들의 상태 값의 변경됨을 감지
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb137_1) {
                    Toast.makeText(MainActivity7.this, "매우 그렇지 않다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(136,1);


                } else if (i == R.id.rb137_2) {
                    Toast.makeText(MainActivity7.this, "그렇지 않다.", Toast.LENGTH_SHORT).show();
                    AnswerData.result(136,2);

                } else if (i == R.id.rb137_3) {
                    Toast.makeText(MainActivity7.this, "보통이다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(136,3);

                } else if (i == R.id.rb137_4) {
                    Toast.makeText(MainActivity7.this, "그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(136,4);

                } else if (i == R.id.rb137_5) {
                    Toast.makeText(MainActivity7.this, "매우 그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(136,5);
                }

            }
        });

        rg138.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override // 라디오 버튼들의 상태 값의 변경됨을 감지
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb138_1) {
                    Toast.makeText(MainActivity7.this, "매우 그렇지 않다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(137,1);


                } else if (i == R.id.rb138_2) {
                    Toast.makeText(MainActivity7.this, "그렇지 않다.", Toast.LENGTH_SHORT).show();
                    AnswerData.result(137,2);

                } else if (i == R.id.rb138_3) {
                    Toast.makeText(MainActivity7.this, "보통이다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(137,3);

                } else if (i == R.id.rb138_4) {
                    Toast.makeText(MainActivity7.this, "그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(137,4);

                } else if (i == R.id.rb138_5) {
                    Toast.makeText(MainActivity7.this, "매우 그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(137,5);
                }

            }
        });

        rg139.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override // 라디오 버튼들의 상태 값의 변경됨을 감지
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb139_1) {
                    Toast.makeText(MainActivity7.this, "매우 그렇지 않다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(138,1);


                } else if (i == R.id.rb139_2) {
                    Toast.makeText(MainActivity7.this, "그렇지 않다.", Toast.LENGTH_SHORT).show();
                    AnswerData.result(138,2);

                } else if (i == R.id.rb139_3) {
                    Toast.makeText(MainActivity7.this, "보통이다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(138,3);

                } else if (i == R.id.rb139_4) {
                    Toast.makeText(MainActivity7.this, "그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(138,4);

                } else if (i == R.id.rb139_5) {
                    Toast.makeText(MainActivity7.this, "매우 그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(138,5);
                }

            }
        });

        rg140.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override // 라디오 버튼들의 상태 값의 변경됨을 감지
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb140_1) {
                    Toast.makeText(MainActivity7.this, "매우 그렇지 않다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(139,1);


                } else if (i == R.id.rb140_2) {
                    Toast.makeText(MainActivity7.this, "그렇지 않다.", Toast.LENGTH_SHORT).show();
                    AnswerData.result(139,2);

                } else if (i == R.id.rb140_3) {
                    Toast.makeText(MainActivity7.this, "보통이다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(139,3);

                } else if (i == R.id.rb140_4) {
                    Toast.makeText(MainActivity7.this, "그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(139,4);

                } else if (i == R.id.rb140_5) {
                    Toast.makeText(MainActivity7.this, "매우 그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(139,5);
                }

            }
        });

        rg141.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override // 라디오 버튼들의 상태 값의 변경됨을 감지
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb141_1) {
                    Toast.makeText(MainActivity7.this, "매우 그렇지 않다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(140,1);


                } else if (i == R.id.rb141_2) {
                    Toast.makeText(MainActivity7.this, "그렇지 않다.", Toast.LENGTH_SHORT).show();
                    AnswerData.result(140,2);

                } else if (i == R.id.rb141_3) {
                    Toast.makeText(MainActivity7.this, "보통이다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(140,3);

                } else if (i == R.id.rb141_4) {
                    Toast.makeText(MainActivity7.this, "그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(140,4);

                } else if (i == R.id.rb141_5) {
                    Toast.makeText(MainActivity7.this, "매우 그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(140,5);
                }

            }
        });

        rg142.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override // 라디오 버튼들의 상태 값의 변경됨을 감지
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb142_1) {
                    Toast.makeText(MainActivity7.this, "매우 그렇지 않다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(141,1);


                } else if (i == R.id.rb142_2) {
                    Toast.makeText(MainActivity7.this, "그렇지 않다.", Toast.LENGTH_SHORT).show();
                    AnswerData.result(141,2);

                } else if (i == R.id.rb142_3) {
                    Toast.makeText(MainActivity7.this, "보통이다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(141,3);

                } else if (i == R.id.rb142_4) {
                    Toast.makeText(MainActivity7.this, "그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(141,4);

                } else if (i == R.id.rb142_5) {
                    Toast.makeText(MainActivity7.this, "매우 그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(141,5);
                }

            }
        });

        rg143.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override // 라디오 버튼들의 상태 값의 변경됨을 감지
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb143_1) {
                    Toast.makeText(MainActivity7.this, "매우 그렇지 않다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(142,1);


                } else if (i == R.id.rb143_2) {
                    Toast.makeText(MainActivity7.this, "그렇지 않다.", Toast.LENGTH_SHORT).show();
                    AnswerData.result(142,2);

                } else if (i == R.id.rb143_3) {
                    Toast.makeText(MainActivity7.this, "보통이다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(142,3);

                } else if (i == R.id.rb143_4) {
                    Toast.makeText(MainActivity7.this, "그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(142,4);

                } else if (i == R.id.rb143_5) {
                    Toast.makeText(MainActivity7.this, "매우 그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(142,5);
                }

            }
        });

        rg144.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override // 라디오 버튼들의 상태 값의 변경됨을 감지
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb144_1) {
                    Toast.makeText(MainActivity7.this, "매우 그렇지 않다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(143,1);

                } else if (i == R.id.rb144_2) {
                    Toast.makeText(MainActivity7.this, "보통이다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(143,2);

                } else if (i == R.id.rb144_3) {
                    Toast.makeText(MainActivity7.this, "보통이다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(143,3);

                } else if (i == R.id.rb144_4) {
                    Toast.makeText(MainActivity7.this, "그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(143,4);

                } else if (i == R.id.rb144_5) {
                    Toast.makeText(MainActivity7.this, "매우 그렇다", Toast.LENGTH_SHORT).show();
                    AnswerData.result(143,5);
                }

            }
        });

        btn_move6.setOnClickListener(new View.OnClickListener() {
            

            @Override
            public void onClick(View view) {



                String[] mapping = {"창의성", "호기심", "개방성", "학구열", "지혜", "사랑", "친절성", "사회지능", "용감성", "끈기", "진실성", "활력", "용서", "겸손", "신중성", "자기조절", "시민정신", "공정성", "리더십", "감상력", "감사", "유머감각", "영성", "낙관성"};
                int max = 0;
                int maxIndex = 0;

                int[][] matrix = convertToMatrix(AnswerData.count, 24, 6);
                List<Integer> rowsum = calculateRowSum(matrix);

                for(int i = 0; i<rowsum.size(); i++){
                    if (rowsum.get(i) > max){
                        max = rowsum.get(i);
                        maxIndex = i;
                    }
                }
                ////////////////////////////////////////////////////////////////////////////////

//                int[][] matrix = convertToMatrix(AnswerData.count, 24, 6);
                //int[][] matrix = convertToMatrix(AnswerData.count, 24, 6);
                //List<Integer> rowSum = calculateRowSum(matrix);
                //List<String> mappedRowSum = mapRowSum(rowSum);
                //int maxRowSum = findMaxRowSum(rowSum);

                //List<String> maxRowSumMapping = findMappingForMaxRowSum(rowSum, mappedRowSum, maxRowSum);

                //printMatrix(matrix);

                //System.out.println("Row Sums:");
                //for (int ij = 0; ij < rowSum.size(); ij++) {
                //    System.out.println(rowSum.get(ij) + " ->" + mappedRowSum.get(ij));
                //}
                //System.out.println("Max Row Sum: ");
                //System.out.println("Mapping for Max Row Sum:");
                //for (String DE : maxRowSumMapping) {
                //    System.out.println(maxRowSumMapping);
                //}
                //System.out.println(maxRowSum);

                Intent intent = new Intent(MainActivity7.this, MainActivity8.class);
                intent.putExtra("result",max);
                intent.putExtra("result1",mapping[maxIndex]);

                System.out.println(max);
                System.out.println(mapping[maxIndex]);


                startActivity(intent);

            }
        });

    }
}