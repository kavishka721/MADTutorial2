package com.example.tute2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtView2 = findViewById(R.id.textView2);
        txtView2.setText(R.string.msg2);

        Log.i("Lifecycle","OnCreate() invoked"   );
    }

    public void onStart(){
        super.onStart();
        Log.i("Lifecycle","onStart() invoked"   );
    }

    public void onRestart(){
        super.onRestart();
        Log.i("Lifecycle","onRestart() invoked"   );
    }

    public void onResume(){
        super.onResume();
        Log.i("Lifecycle","onResume() invoked"   );
    }

    public void onPause(){
        super.onPause();
        Log.i("Lifecycle","onPause() invoked"   );
    }

    public void onStop(){
        super.onStop();
        Log.i("Lifecycle","onStop() invoked"   );
    }


    public void OnDestroy(){
        super.onDestroy();
        Log.i("Lifecycle","onDestroy() invoked"   );
    }
}