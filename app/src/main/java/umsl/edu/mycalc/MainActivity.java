package umsl.edu.mycalc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final CalcModel mModel = new CalcModel();
        Button but_0 = (Button) findViewById(R.id.num_0);
        Button but_1 = (Button) findViewById(R.id.num_1);
        Button but_2 = (Button) findViewById(R.id.num_2);
        Button but_3 = (Button) findViewById(R.id.num_3);
        Button but_4 = (Button) findViewById(R.id.num_4);
        Button but_5 = (Button) findViewById(R.id.num_5);
        Button but_6 = (Button) findViewById(R.id.num_6);
        Button but_7 = (Button) findViewById(R.id.num_7);
        Button but_8 = (Button) findViewById(R.id.num_8);
        Button but_9 = (Button) findViewById(R.id.num_9);
        Button but_back = (Button) findViewById(R.id.back);
        Button but_add = (Button) findViewById(R.id.add);
        Button but_subtract = (Button) findViewById(R.id.subtract);
        Button but_multiply = (Button) findViewById(R.id.multiply);
        Button but_divide = (Button) findViewById(R.id.divide);
        Button but_equals = (Button) findViewById(R.id.equals);
        Button but_flip = (Button) findViewById(R.id.flip_sign);
        Button but_decimal = (Button) findViewById(R.id.decimal);
        Button but_clear = (Button) findViewById(R.id.clear);



        final TextView screen_value = (TextView) findViewById(R.id.total);

        but_0.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                screen_value.setText(mModel.enterNum('0'));
            }
        });
        but_1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                screen_value.setText(mModel.enterNum('1'));
            }
        });
        but_2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                screen_value.setText(mModel.enterNum('2'));
            }
        });
        but_3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                screen_value.setText(mModel.enterNum('3'));
            }
        });
        but_4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                screen_value.setText(mModel.enterNum('4'));
            }
        });
        but_5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                screen_value.setText(mModel.enterNum('5'));
            }
        });
        but_6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                screen_value.setText(mModel.enterNum('6'));
            }
        });
        but_7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                screen_value.setText(mModel.enterNum('7'));
            }
        });
        but_8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                screen_value.setText(mModel.enterNum('8'));
            }
        });
        but_9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                screen_value.setText(mModel.enterNum('9'));
            }
        });
        but_back.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                screen_value.setText(mModel.backSpace());
            }
        });
        but_add.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                mModel.setOperator('+');            }
        });
        but_subtract.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                mModel.setOperator('-');            }
        });
        but_multiply.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                mModel.setOperator('*');            }
        });
        but_divide.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                mModel.setOperator('/');
            }
        });
        but_equals.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                screen_value.setText(mModel.doEquals());
            }
        });
        but_flip.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                screen_value.setText(mModel.flipSign());
            }
        });
        but_decimal.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                screen_value.setText(mModel.putDecimal());
            }
        });
        but_clear.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                screen_value.setText(mModel.clear());
            }
        });
    }
}
