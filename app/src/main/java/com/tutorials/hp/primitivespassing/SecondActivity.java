package com.tutorials.hp.primitivespassing;

import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    //DECALRE SECOND ACTIVITY VIEWS
    TextView txtName2;
    TextView txtID2;
    CheckBox chkTechnologyExists2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        //INITIALIZE THESE VIEWS
        txtName2 = (TextView) findViewById(R.id.nameTxtSecond);
        txtID2 = (TextView) findViewById(R.id.txtIDSecond);
        chkTechnologyExists2 = (CheckBox) findViewById(R.id.techExistsSecond);

        //RECEIVE DATA FROM MAIN ACTIVITY
        String name = getIntent().getStringExtra("NAME_KEY");
        int id = getIntent().getIntExtra("ID_KEY", 0);
        Boolean techExists = getIntent().getBooleanExtra("TECHEXISTS_KEY", false);

        //SHOW A TOAST
        Toast.makeText(SecondActivity.this, name, Toast.LENGTH_LONG).show();

        //SET THE DATA TO OUR LOCAL VIEWS
        txtName2.setText(name);
        txtID2.setText(String.valueOf(id));
        chkTechnologyExists2.setChecked(techExists);
    }
}
