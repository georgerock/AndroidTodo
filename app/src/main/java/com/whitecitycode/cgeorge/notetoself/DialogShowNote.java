package com.whitecitycode.cgeorge.notetoself;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by cgeorge on 7/9/17.
 */

public class DialogShowNote extends DialogFragment {

    private Note mNote;

    //Initiate the Dialog
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState){

        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        LayoutInflater inflater = getActivity().getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.dialog_show_note, null);

        TextView txtDescription = (TextView) dialogView.findViewById(R.id.txtDescription);
        TextView txtTitle = (TextView) dialogView.findViewById(R.id.txtTitle);
        ImageView ivImportant = (ImageView) dialogView.findViewById(R.id.imageViewImportant);
        ImageView ivTodo = (ImageView) dialogView.findViewById(R.id.imageViewTodo);
        ImageView ivIdea = (ImageView) dialogView.findViewById(R.id.imageViewIdea);

        if (!mNote.isIdeea()){
            ivIdea.setVisibility(View.GONE);
        }
        if (!mNote.isImportant()){
            ivImportant.setVisibility(View.GONE);
        }
        if (!mNote.isTodo()){
            ivTodo.setVisibility(View.GONE);
        }

        Button btnOK = (Button) dialogView.findViewById(R.id.BtnOk);

        builder.setView(dialogView).setMessage("Your Note");

        btnOK.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v){
                dismiss();
            }
        });

        return builder.create();
    }

    //Receive a Note from Main Activity
    public void sendNoteSelected(Note selectedNote){
        mNote = selectedNote;
    }
}
