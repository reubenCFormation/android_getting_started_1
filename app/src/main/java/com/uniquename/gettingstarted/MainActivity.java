package com.uniquename.gettingstarted;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText mEditTitle;
    Button mClickBtn;

    TextView mResultText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initializeFields();
        clickOnBtn();
    }



    public void initializeFields(){
        mEditTitle=findViewById(R.id.my_edit_text);
        mClickBtn=findViewById(R.id.my_button);
        mResultText=findViewById(R.id.result_text);

    }

    public boolean isEditTextFilled(){
        if(mEditTitle.getText().toString().isEmpty()){
            return false;
        }
        else{
            return true;
        }

    }

    public void clickOnBtn(){
        mClickBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(isEditTextFilled()){
                    String getEnteredValue=mEditTitle.getText().toString();
                    mResultText.setText(getEnteredValue);
                }
                else{
                    Toast.makeText(MainActivity.this, "Viullez saisir un champs!!",Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}