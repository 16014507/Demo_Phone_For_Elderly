package sg.edu.rp.c346.id16014507.demophoneforelderly;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnSon, btnDaughter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSon = findViewById(R.id.buttonCallSon);
        btnSon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentCall = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + 92240336));
                startActivity(intentCall);
            }
        });

        btnDaughter = findViewById(R.id.buttonCallDaughter);
        btnDaughter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentCall = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + 89675543));
                startActivity(intentCall);
            }
        });

    }
}