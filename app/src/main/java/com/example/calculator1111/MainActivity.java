package com.example.calculator1111;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private  StringBuilder show_equation=new StringBuilder();
    private ArrayList calculate_equation;
    private  int signal=0;
    Button clear;
    Button offload;
    Button divided;
    Button num7;
    Button num8;
    Button num9;
    Button multiply;
    Button num4;
    Button num5;
    Button num6;
    Button minus;
    Button num1;
    Button num2;
    Button num3;
    Button plus;
    Button num0;
    Button dot;
    Button equal;
    EditText ed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        show_equation=new StringBuilder();
        calculate_equation=new ArrayList<>();
        num0 = findViewById(R.id._0);
        num1 = findViewById(R.id._1);
        num2 = findViewById(R.id._2);
        num3 = findViewById(R.id._3);
        num4 = findViewById(R.id._4);
        num5 = findViewById(R.id._5);
        num6 = findViewById(R.id._6);
        num7 = findViewById(R.id._7);
        num8 = findViewById(R.id._8);
        num9 = findViewById(R.id._9);

        clear = findViewById(R.id._clear);
        offload = findViewById(R.id._offload);
        divided = findViewById(R.id._div);
        multiply = findViewById(R.id._mul);
        minus = findViewById(R.id._min);
        plus = findViewById(R.id._plus);
        dot = findViewById(R.id._dot);
        equal = findViewById(R.id._equ);
        ed = findViewById(R.id._ed);

        ed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ed.setSelection(ed.getText().length());
            }
        });
        offload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!(show_equation.toString().equals(""))) {
                    char temp = show_equation.charAt(show_equation.length() - 1);
                    if (temp>0||temp == '+' || temp == '-' || temp == '*' || temp == '/') {
                        show_equation.deleteCharAt(show_equation.length() - 1);
                        show_equation.append("-");
                    } else
                        show_equation.append("+");
                    ed.setText(show_equation);
                    ed.setSelection(ed.getText().length());
                }
            }
        });
        num0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                if(!(show_equation.toString().equals("0"))){
                    if(signal==0){
                        show_equation.append("0");
                        ed.setText(show_equation);
                        ed.setSelection(ed.getText().length());
                    }else{
                        show_equation.delete(0,show_equation.length());
                        show_equation.append("0");
                        ed.setText(show_equation);
                        ed.setSelection(ed.getText().length());
                        signal=0;
                    }
                }
            }
        });
        num1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(signal==0){
                    show_equation.append("1");
                    ed.setText(show_equation);
                    ed.setSelection(ed.getText().length());
                }else{
                    show_equation.delete(0,show_equation.length());
                    show_equation.append("1");
                    ed.setText(show_equation);
                    ed.setSelection(ed.getText().length());
                    signal=0;
                }
            }
        });
        num2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(signal==0){
                    show_equation.append("2");
                    ed.setText(show_equation);
                    ed.setSelection(ed.getText().length());
                }else{
                    show_equation.delete(0,show_equation.length());
                    show_equation.append("2");
                    ed.setText(show_equation);
                    ed.setSelection(ed.getText().length());
                    signal=0;
                }
            }
        });
        num3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(signal==0){
                    show_equation.append("3");
                    ed.setText(show_equation);
                    ed.setSelection(ed.getText().length());
                }else{
                    show_equation.delete(0,show_equation.length());
                    show_equation.append("3");
                    ed.setText(show_equation);
                    ed.setSelection(ed.getText().length());
                    signal=0;
                }
            }
        });
        num4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(signal==0){
                    show_equation.append("4");
                    ed.setText(show_equation);
                    ed.setSelection(ed.getText().length());
                }else{
                    show_equation.delete(0,show_equation.length());
                    show_equation.append("4");
                    ed.setText(show_equation);
                    ed.setSelection(ed.getText().length());
                    signal=0;
                }
            }
        });
        num5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(signal==0){
                    show_equation.append("5");
                    ed.setText(show_equation);
                    ed.setSelection(ed.getText().length());
                }else{
                    show_equation.delete(0,show_equation.length());
                    show_equation.append("5");
                    ed.setText(show_equation);
                    ed.setSelection(ed.getText().length());
                    signal=0;
                }
            }
        });
        num6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(signal==0){
                    show_equation.append("6");
                    ed.setText(show_equation);
                    ed.setSelection(ed.getText().length());
                }else{
                    show_equation.delete(0,show_equation.length());
                    show_equation.append("6");
                    ed.setText(show_equation);
                    ed.setSelection(ed.getText().length());
                    signal=0;
                }
            }
        });
        num7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(signal==0){
                    show_equation.append("7");
                    ed.setText(show_equation);
                    ed.setSelection(ed.getText().length());
                }else{
                    show_equation.delete(0,show_equation.length());
                    show_equation.append("7");
                    ed.setText(show_equation);
                    ed.setSelection(ed.getText().length());
                    signal=0;
                }
            }
        });
        num8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(signal==0){
                    show_equation.append("8");
                    ed.setText(show_equation);
                    ed.setSelection(ed.getText().length());
                }else{
                    show_equation.delete(0,show_equation.length());
                    show_equation.append("8");
                    ed.setText(show_equation);
                    ed.setSelection(ed.getText().length());
                    signal=0;
                }
            }
        });
        num9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(signal==0){
                    show_equation.append("9");
                    ed.setText(show_equation);
                    ed.setSelection(ed.getText().length());
                }else{
                    show_equation.delete(0,show_equation.length());
                    show_equation.append("9");
                    ed.setText(show_equation);
                    ed.setSelection(ed.getText().length());
                    signal=0;
                }
            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                show_equation.delete(0,show_equation.length());
                calculate_equation.clear();
                signal=0;
                ed.setText("");
            }
        });
        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(signal==0){
                    String a=show_equation.toString();
                    if(a.equals("")){
                        show_equation.append(".");
                        ed.setText(show_equation);
                        ed.setSelection(ed.getText().length());
                    }else{
                        int i;
                        char t='0';
                        for(i=a.length();i>0;i--){
                            t=a.charAt(i-1);
                            if(t=='.'||t=='+'||t=='-'||t=='*'||t=='/')
                                break;
                        }
                        if(i==0){
                            show_equation.append(".");
                            ed.setText(show_equation);
                            ed.setSelection(ed.getText().length());
                        }else if(t=='+'||t=='-'||t=='*'||t=='/'){
                            show_equation.append(".");
                            ed.setText(show_equation);
                            ed.setSelection(ed.getText().length());
                        }
                    }
                }else{
                    show_equation.delete(0,show_equation.length());
                    show_equation.append(".");
                    ed.setText(".");
                    ed.setSelection(ed.getText().length());
                    signal=0;
                }
            }
        });

        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!show_equation.toString().equals("")){
                    signal=1;
                    char temp=show_equation.charAt(show_equation.length()-1);
                    if(show_equation.charAt(0)=='-')
                        show_equation.insert(0,"0");
                    if(temp=='+'||temp=='-')
                        show_equation.append("0");
                    if(temp=='*'||temp=='/')
                        show_equation.append("1");
                    StringBuilder temp1=new StringBuilder();
                    for(int i=0;i<show_equation.length();i++){
                        if(show_equation.charAt(i)>='0'&&show_equation.charAt(i)<='9'||show_equation.charAt(i)=='.'){
                            temp1.append(String.valueOf(show_equation.charAt(i)));
                        }else if(show_equation.charAt(i)=='N'){
                            calculate_equation.add("NaN");
                            i=i+2;
                        }else if(show_equation.charAt(i)=='∞'){
                            calculate_equation.add("∞");
                        }
                        else
                        {
                            if(temp1.length()!=0){
                                calculate_equation.add(temp1.toString());
                                temp1.delete(0,temp1.length());
                            }
                            calculate_equation.add(String.valueOf(show_equation.charAt(i)));
                        }
                    }
                    if(temp1.length()!=0){
                        calculate_equation.add(temp1.toString());
                    }
                    calculate_equation.add("#");
                    String temp8=calculate(calculate_equation);
                    ed.setText(temp8);
                    ed.setSelection(ed.getText().length());
                    show_equation.delete(0,show_equation.length());
                    calculate_equation.clear();
                    show_equation.append(temp8);
                }
            }
        });
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!(show_equation.toString().equals(""))) {
                    signal=0;
                    char temp=show_equation.charAt(show_equation.length()-1);
                    if(temp=='+'||temp=='-'||temp=='*'||temp=='/')
                    {
                        show_equation.deleteCharAt(show_equation.length()-1);
                        show_equation.append("+");
                    }
                    else
                        show_equation.append("+");
                    ed.setText(show_equation);
                    ed.setSelection(ed.getText().length());
                }
            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!(show_equation.toString().equals(""))) {
                    signal=0;
                    char temp=show_equation.charAt(show_equation.length()-1);
                    if(temp=='+'||temp=='-'||temp=='*'||temp=='/')
                    {
                        show_equation.deleteCharAt(show_equation.length()-1);
                        show_equation.append("-");
                    }
                    else
                        show_equation.append("-");
                    ed.setText(show_equation);
                    ed.setSelection(ed.getText().length());
                }
            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!(show_equation.toString().equals(""))) {
                    signal=0;
                    char temp=show_equation.charAt(show_equation.length()-1);
                    if(temp=='+'||temp=='-'||temp=='*'||temp=='/')
                    {
                        show_equation.deleteCharAt(show_equation.length()-1);
                        show_equation.append("*");
                    }
                    else
                        show_equation.append("*");
                    ed.setText(show_equation);
                    ed.setSelection(ed.getText().length());
                }
            }
        });

        divided.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!(show_equation.toString().equals(""))) {
                    signal=0;
                    char temp=show_equation.charAt(show_equation.length()-1);
                    if(temp=='+'||temp=='-'||temp=='*'||temp=='/')
                    {
                        show_equation.deleteCharAt(show_equation.length()-1);
                        show_equation.append("/");
                    }
                    else
                        show_equation.append("/");
                    ed.setText(show_equation);
                    ed.setSelection(ed.getText().length());
                }
            }
        });
    }
    protected boolean operatorPriorityCompare(char operator1,char operator2)
    {
        int o1=0;
        int o2=0;
        switch (operator1){
            case '+':{o1=0;break;}
            case '-':{o1=0;break;}
            case '*':{o1=1;break;}
            case '/':{o1=1;break;}
        }
        switch (operator2){
            case '+':{o2=0;break;}
            case '-':{o2=0;break;}
            case '*':{o2=1;break;}
            case '/':{o2=1;break;}
        }
        if(o1<=o2)
        {
            return false;
        }
        else
            return true;
    }
    public static Double Add(Double d1,Double d2) {
        if(d1==Double.NEGATIVE_INFINITY||d1==Double.POSITIVE_INFINITY||d2==Double.NEGATIVE_INFINITY||d2==Double.POSITIVE_INFINITY){
            return d1+d2;
        }
        if(String.valueOf(d1).equals("NaN")||String.valueOf(d1).equals("NaN")){
            return d1+d2;
        }
        BigDecimal b1 = new BigDecimal(Double.toString(d1));
        BigDecimal b2 = new BigDecimal(Double.toString(d2));
        return b1.add(b2).doubleValue();
    }
    public static Double Sub(Double d1,Double d2){
        if(d1==Double.NEGATIVE_INFINITY||d1==Double.POSITIVE_INFINITY||d2==Double.NEGATIVE_INFINITY||d2==Double.POSITIVE_INFINITY){
            return d1-d2;
        }
        if(String.valueOf(d1).equals("NaN")||String.valueOf(d1).equals("NaN")){
            return d1-d2;
        }
        if(String.valueOf(d1).equals("NaN")||String.valueOf(d1).equals("NaN")){
            return d1*d2;
        }
        BigDecimal b1=new BigDecimal(Double.toString(d1));
        BigDecimal b2=new BigDecimal(Double.toString(d2));
        return b1.subtract(b2).doubleValue();
    }
    public static Double Mul(Double d1,Double d2){
        if(d1==Double.NEGATIVE_INFINITY||d1==Double.POSITIVE_INFINITY||d2==Double.NEGATIVE_INFINITY||d2==Double.POSITIVE_INFINITY){
            return d1*d2;
        }
        if(String.valueOf(d1).equals("NaN")||String.valueOf(d1).equals("NaN")){
            return d1*d2;
        }
        BigDecimal b1=new BigDecimal(Double.toString(d1));
        BigDecimal b2=new BigDecimal(Double.toString(d2));
        return b1.multiply(b2).setScale(8).doubleValue();
    }
    public static Double Div(Double d1,Double d2){
        if(d1==Double.NEGATIVE_INFINITY||d1==Double.POSITIVE_INFINITY||d2==Double.NEGATIVE_INFINITY||d2==Double.POSITIVE_INFINITY){
            return d1/d2;
        }
        if(String.valueOf(d1).equals("NaN")||String.valueOf(d1).equals("NaN")){
            return d1/d2;
        }
        if(d1==0.0&&d2==0.0){
            return Double.NaN;
        }
        if(d2==0.0){
            return d1/d2;
        }
        BigDecimal b1=new BigDecimal(Double.toString(d1));
        BigDecimal b2=new BigDecimal(Double.toString(d2));
        return b1.divide(b2,8,BigDecimal.ROUND_HALF_UP).doubleValue();
    }
    protected String calculate(ArrayList equation){
        Double temp2;
        Double temp3;
        Double result;
        List operator=new ArrayList();
        List<Double> operand=new ArrayList();
        for(int i=0;i<equation.size();i++)
        {
            String temp4=(String) equation.get(i);
            if(temp4.equals("+")||temp4.equals("-")||temp4.equals("*")||temp4.equals("/"))
            {
                if(operator.size()>0)
                {
                    String temp5=operator.get(operator.size()-1).toString();
                    while(!(operatorPriorityCompare(temp4.charAt(0),temp5.charAt(0)))&&operator.size()>0)
                    {
                        operator.remove(operator.size()-1);
                        temp3=operand.get(operand.size()-1);
                        operand.remove(operand.size()-1);
                        temp2=operand.get(operand.size()-1);
                        operand.remove(operand.size()-1);
                        switch (temp5.charAt(0)){
                            case '+':{result=Add(temp2,temp3);operand.add(result);break;}
                            case '-':{result=Sub(temp2,temp3);operand.add(result);break;}
                            case '*':{result=Mul(temp2,temp3);operand.add(result);break;}
                            case '/':{result=Div(temp2,temp3);operand.add(result);break;}
                        }
                        if(operator.size()>0)
                        {
                            temp5=operator.get(operator.size()-1).toString();
                        }
                        else
                            break;
                    }
                    operator.add(temp4);
                }
                else
                    operator.add(temp4);
            }
            else if(temp4.equals("#"))
            {
                while(operator.size()>0)
                {
                    String temp6=(String)operator.get(operator.size()-1);
                    operator.remove(operator.size()-1);
                    temp3=operand.get(operand.size()-1);
                    operand.remove(operand.size()-1);
                    temp2=operand.get(operand.size()-1);
                    operand.remove(operand.size()-1);
                    switch (temp6.charAt(0)){
                        case '+':{result=Add(temp2,temp3);operand.add(result);break;}
                        case '-':{result=Sub(temp2,temp3);operand.add(result);break;}
                        case '*':{result=Mul(temp2,temp3);operand.add(result);break;}
                        case '/':{result=Div(temp2,temp3);operand.add(result);break;}
                    }
                }
            }
            else
            {
                if(temp4.equals("NaN")){
                    operand.add(Double.NaN);
                }else if(temp4.equals("∞")){
                    operand.add(Double.POSITIVE_INFINITY);
                }else{
                    operand.add(Double.parseDouble(temp4));
                }
            }
        }
        if(operand.get(0)==Double.NEGATIVE_INFINITY) return "-∞";
        if(operand.get(0)==Double.POSITIVE_INFINITY) return "∞";
        return operand.get(0).toString();
    }
}
