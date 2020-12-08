package kr.hs.emirim.s2019s11.mirimspinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    int[] imgRes = {R.drawable.poster1,R.drawable.poster2,R.drawable.poster3,R.drawable.poster4,R.drawable.poster5,
            R.drawable.poster6,R.drawable.poster7,R.drawable.poster8,R.drawable.poster9,R.drawable.poster10};
    String[] imgNames = {"톰보이", "타오르는 여인의 초상", "한여름의 판타지아", "테일 오브 테일즈", "호크니",
            "문라이트", "마일스", "Midnight in Paris", "행복한 라짜로", "The World Of Us"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner spinner1 = findViewById(R.id.spinner1);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, imgNames);
        spinner1.setAdapter(adapter);
        spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                final int pos = position;
                ImageView imgView = findViewById(R.id.imgview);
                imgView.setImageResource(imgRes[pos]);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}