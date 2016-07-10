package example.sangcv.b3_42separateclass;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn1 = (Button) findViewById(R.id.btn1);
        Button btn2 = (Button) findViewById(R.id.btn2);
        tv = (TextView) findViewById(R.id.tv);
        btn1.setOnClickListener(new showText(getString(R.string.hello_text),this));
        btn2.setOnClickListener(new showText(getString(R.string.bye_text),this));
    }
    public void showMessage(String message) {
        tv.setText(message);
    }
}
