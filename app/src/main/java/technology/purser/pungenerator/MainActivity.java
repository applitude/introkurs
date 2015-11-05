package technology.purser.pungenerator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import java.util.Scanner;
import android.view.View;
import java.io.InputStream;

public class MainActivity extends AppCompatActivity {
    private EditText inputText;
    private TextView outputText;
    private PunMaker p;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputText = (EditText)findViewById(R.id.inputText);
        outputText = (TextView)findViewById(R.id.outputText);



        try{
            InputStream dict = getAssets().open("dict.txt");
            p = new PunMaker(new Scanner(dict));
        }catch(Exception e){

        }



    }
    public void makePun(View v){
        String pun = p.makePun(inputText.getText().toString());
        outputText.setText(pun);
    }


}
