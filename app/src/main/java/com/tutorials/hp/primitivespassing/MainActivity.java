package com.tutorials.hp.primitivespassing;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class MainActivity extends AppCompatActivity {

    //DECLARE VIEWS
    private TextInputEditText txtName, txtID;
    private CheckBox chkTechnologyExists;
    private Button sendBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        this.initializeViews();

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            }
        });

        //WHEN SEND BTN IS CLICKED,SEND
        sendBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sendData();
            }
        });
    }

    /*
    REFERENCE VIEWS WE ARE USING
     */
    private void initializeViews() {
        txtName = (TextInputEditText) findViewById(R.id.nameTxt);
        txtID = (TextInputEditText) findViewById(R.id.txtID);
        chkTechnologyExists = (CheckBox) findViewById(R.id.techExists);
        sendBtn = (Button) findViewById(R.id.sendBtn);

    }

    /*
    SEND DATA TO SECOND ACTIVITY
     */
    private void sendData() {
        //GET PRIMITIVE VALUES TO SEND
        String name = txtName.getText().toString();
        int id = Integer.parseInt(txtID.getText().toString());
        Boolean techExists = chkTechnologyExists.isChecked();

        //PACK THEM IN AN INTENT OBJECT
        Intent i = new Intent(this, SecondActivity.class);
        i.putExtra("NAME_KEY", name);
        i.putExtra("ID_KEY", id);
        i.putExtra("TECHEXISTS_KEY", techExists);

        //LETS LEAVE OUR TXTS CLEARED
        txtName.setText("");
        txtID.setText("");

        //START SECOND ACTIVITY
        this.startActivity(i);
    }


}
