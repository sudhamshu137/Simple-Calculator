package com.example.sampleeee;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.udojava.evalex.Expression;

public class MainActivity extends AppCompatActivity {


    TextView res, editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        res = findViewById(R.id.tv);
        editor = findViewById(R.id.tv2);

    }

    public void c(View view){
        res.setText("0");
    }

    public void ac(View view){
        res.setText("0");
        editor.setText("");
    }

    public void del(View view){
        String s = editor.getText().toString();
        if(!(s.isEmpty())) {
            s = s.substring(0, s.length() - 1);
            editor.setText(s);
        }
    }

    public void t00(View view){
        editor.setText(editor.getText() + "00");
    }

    public void t0(View view){
        editor.setText(editor.getText() + "0");
    }

    public void t1(View view){
        editor.setText(editor.getText() + "1");
    }

    public void t2(View view){
        editor.setText(editor.getText() + "2");
    }

    public void t3(View view){
        editor.setText(editor.getText() + "3");
    }

    public void t4(View view){
        editor.setText(editor.getText() + "4");
    }

    public void t5(View view){
        editor.setText(editor.getText() + "5");
    }

    public void t6(View view){
        editor.setText(editor.getText() + "6");
    }

    public void t7(View view){
        editor.setText(editor.getText() + "7");
    }

    public void t8(View view){
        editor.setText(editor.getText() + "8");
    }

    public void t9(View view){
        editor.setText(editor.getText() + "9");
    }

    public void dot(View view){
        editor.setText(editor.getText() + ".");
    }

    public void plus(View view){
        editor.setText(editor.getText() + "+");
    }

    public void minus(View view){
        editor.setText(editor.getText() + "-");
    }

    public void into(View view){
        editor.setText(editor.getText() + "*");
    }

    public void divide(View view){
        editor.setText(editor.getText() + "/");
    }

    @SuppressLint("SetTextI18n")
    public void equals(View view){

        String str = editor.getText().toString();

        if(!(str.isEmpty())){

            for(int i=0; i<str.length(); i++){
                if( (str.substring(str.length() - 1).equals("*")) || str.substring(str.length() - 1).equals("/") || str.substring(str.length() - 1).equals("+") || str.substring(str.length() - 1).equals("-")){
                    str = str.substring(0, str.length() - 1);
                }
                else{
                    break;
                }
            }

            for(int j=0; j<str.length(); j++){

                if( str.charAt(0) == '*' || str.charAt(0) == '/' || str.charAt(0) == '-' || str.charAt(0) == '+'){
                    str = str.substring(1, str.length() - 1);
                }
                else{
                    break;
                }
            }

            res.setText(new Expression(str).eval().toString());
        }

    }

}