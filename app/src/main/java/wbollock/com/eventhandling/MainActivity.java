package wbollock.com.eventhandling;

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

        Button buckysButton = (Button) findViewById(R.id.buckysButton); // can now treat button as an object

        buckysButton.setOnClickListener( // sit and wait for someone to click you
            new Button.OnClickListener(){ // interface
                public void onClick(View v) {
                    TextView buckysText = (TextView) findViewById(R.id.buckysText); // make a textview variable that corresponds with the id of the object buckystext
                    buckysText.setText("You clicked it!"); // changing the actual text
                }
            }
        );

        buckysButton.setOnLongClickListener( // long press on button
                new Button.OnLongClickListener() {
                    public boolean onLongClick (View v){
                        TextView buckysText = (TextView) findViewById(R.id.buckysText);
                        buckysText.setText("You long clicked it!");
                    return true; // because boolean, telling Android the long click has ended and we've done something with it
                    }
                }

        );


    }
}
