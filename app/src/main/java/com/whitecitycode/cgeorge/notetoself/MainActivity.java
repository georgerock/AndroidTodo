package com.whitecitycode.cgeorge.notetoself;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    //Temporary
    Note mTempNote= new Note();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener (){
            @Override
            public void onClick(View v){
                // new DialogShowNote
                DialogShowNote dialog = new DialogShowNote();
                // send the note
                dialog.sendNoteSelected(mTempNote);
                // Create the dialog
                dialog.show(getFragmentManager(), "123");
            }
        });
    }

    public void createNewNote(Note n) {
        mTempNote = n;
    }

}
