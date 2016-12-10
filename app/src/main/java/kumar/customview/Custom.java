package kumar.customview;

import android.content.Context;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by User on 10/10/2016.
 */

public class Custom extends LinearLayout {
    //Linear Layout viewgroup extends//
    EditText e1;
    Button b1;
    String s2;
    public Custom(Context context) {
        super(context);
        kumar(context);
    }

    public Custom(Context context, AttributeSet attrs) {
        super(context, attrs);
        kumar(context);
    }

    @RequiresApi(api = Build.VERSION_CODES.HONEYCOMB)
    public Custom(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public Custom(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }
    public void kumar(Context context)
    {
        this.setOrientation(VERTICAL);
        LayoutInflater inflater = (LayoutInflater)context.getSystemService
                (Context.LAYOUT_INFLATER_SERVICE);

        inflater.inflate(R.layout.custom,this);

    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
        e1=(EditText) findViewById(R.id.editText);
        b1=(Button) findViewById(R.id.button);


    }
    public void Addtext(String s1){
        e1.setText(s1);
    }

    public Button getButton () {
        return b1;
    }
    public String ret(){
        return e1.getText().toString();

    }
}