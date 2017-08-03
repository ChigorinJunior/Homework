package simbirsoft.android.homework;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    LinearLayout LinearVertical;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //обработчик 1 цвета
        TextView textView1 = (TextView) findViewById(R.id.ChangeColorBackRed);
        textView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView textView = (TextView)findViewById(R.id.ChangeColorBackRed);

                Toast toast = Toast.makeText(getApplicationContext(), "Смена фонового цвета", Toast.LENGTH_LONG);
                toast.show();
                ((LinearLayout) findViewById(R.id.LinearVertical)).setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.ColorChangeRed));
            }
        });

        //обработчик 2 цвета
        TextView textView2 = (TextView) findViewById(R.id.ChangeColorBackBlue);
        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView textView2 = (TextView)findViewById(R.id.ChangeColorBackBlue);
                Toast toast = Toast.makeText(getApplicationContext(), "Смена фонового цвета", Toast.LENGTH_LONG);
                toast.show();
                ((LinearLayout) findViewById(R.id.LinearVertical)).setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.ColorChangeBlue));
            }
        });

        //обработчик 3 цвета
        TextView textView3 = (TextView) findViewById(R.id.ChangeColorBackGreen);
        textView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView textView3 = (TextView)findViewById(R.id.ChangeColorBackGreen);
                Toast toast = Toast.makeText(getApplicationContext(), "Смена фонового цвета", Toast.LENGTH_LONG);
                toast.show();
                ((LinearLayout) findViewById(R.id.LinearVertical)).setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.ColorChangeGreen));
            }
        });

    }
}
