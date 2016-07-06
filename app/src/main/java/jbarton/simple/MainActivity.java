package jbarton.simple;

import android.app.Application;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.test.ApplicationTestCase;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;



public class  MainActivity extends AppCompatActivity {
    /* declare the varies          */
    private TextView mnameTextView;
    private TextView nschoolTextView;
    private Button nButton;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

// }; This was ending the class.  Not sure why there is a ;


    protected void onCreate(Bundle savedIntanceState) {
        super.onCreate(savedIntanceState);
        setContentView(R.layout.activity_main);

        mnameTextView = (TextView) findViewById(R.id.myname);
        nschoolTextView = (TextView) findViewById(R.id.school);
        nButton = (Button) findViewById(R.id.button);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String school = "Thank you for clicking the button";
                String myname = "HelloDearSir";

                nschoolTextView.setText(school);
                mnameTextView.setText(myname);
                nButton.setVisibility(View.GONE);
            }
        };
        nButton.setOnClickListener(listener);
    }}

        /**
         * Below is your old onclick code with the added of where the end of onCreate.
         * Basically, the first onclick had nothing in it
         * The strings need to start with a S
         * nButton.setOnClickListener(); is missing listenr
         * I made a video to help point out some of this.
         *      https://youtu.be/gNJ8pQhqg8E
         *
         * I have the code working. Please compare it with the comments or the versions.
         * And, thanks for asking. Please feel free to ask me anything in the future.
         *
         *

         View.OnClickListenr listenr = new OnclickListener() {
         public void onClick(view V) {


         }


         }


         public void onClick(View v) {

         string school = "Thank you for clicking the button";
         string myname = "HelloDearSir";

         nschoolTextView.setText(school);
         mnameTextView.setText(myname);
         nButton.setVisibility(View.GONE);
         }

         ;

         // } The end of your onCreate was here
         nButton.setOnClickListener();

         */






