package kumar.customview;

import android.content.Context;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Custom c1;
    Custom c2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        c1=(Custom) findViewById(R.id.custom1);
        c2=(Custom) findViewById(R.id.custom2);

        c1.Addtext("hi");
        c1.getButton().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                c2.Addtext(c1.ret());
            }
        });
        c2.getButton().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                c1.Addtext(c2.ret());
            }
        });

    }


    /**
     * Created by User on 10/10/2016.
     */
}
