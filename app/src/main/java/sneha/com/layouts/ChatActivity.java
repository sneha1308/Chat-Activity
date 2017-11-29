package sneha.com.layouts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class ChatActivity extends AppCompatActivity {
    private EditText message_et;
    private ImageView send_bt;
    private TextView message_tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);

        send_bt = findViewById(R.id.send_btn);
        message_et = findViewById(R.id.message_et);
        message_tv = findViewById(R.id.message_tv);


        send_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                message_tv.setText(message_et.getText().toString());
                message_et.setText("");

            }
        });
    }


}
