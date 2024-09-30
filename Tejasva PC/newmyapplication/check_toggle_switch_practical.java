package com.example.newmyapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.ToggleButton;

public class check_toggle_switch_practical extends AppCompatActivity {
  Switch switch1,switch2;
  TextView t21;
  ToggleButton t1;
  CheckBox c1,c2,c3;
//  RadioButton r1,r2;
    RadioGroup r1;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_toggle_switch_practical);
        switch1 = findViewById(R.id.switch1);
        switch2= findViewById(R.id.switch2);
        t1 = findViewById(R.id.toggleButton1);
        t21 = findViewById(R.id.textView2);
        c1 = findViewById(R.id.checkBox);
        c2= findViewById(R.id.checkBox2);
        c3 = findViewById(R.id.checkBox3);
        r1= findViewById(R.id.radiogroup);
//        r1= findViewById(R.id.radioButton);
//        r2= findViewById(R.id.radioButton2);
        switch1.setOnCheckedChangeListener(
                new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                        if(switch1.isChecked()){
                            t21.setText("switch 1 is checked");
                        }else{
                            t21.setText("switch 1 is unchecked ");
                        }
                    }
                }
        );

        switch2.setOnCheckedChangeListener(
                new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                        if (switch2.isChecked()){
                            t21.setText("switch 2 is checked");
                        }else{
                            t21.setText("switch 2 is unchecked ");
                        }
                    }
                }
        );

  t1.setOnCheckedChangeListener(
          new CompoundButton.OnCheckedChangeListener() {
              @Override
              public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                  if (t1.isChecked()){
                      t21.setText("toggle button is checked");
                  }else{
                      t21.setText("toggle button is unchecked ");
                  }
              }
          }
  );

  c1.setOnCheckedChangeListener(
          new CompoundButton.OnCheckedChangeListener() {
              @Override
              public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                  if(c1.isChecked()){
                      t21.setText("Checkbox 1 button is checked");
                  }else{
                      t21.setText("checkbox 1 button is unchecked ");
                  }
              }
          }
  );

  c2.setOnCheckedChangeListener(
          new CompoundButton.OnCheckedChangeListener() {
              @Override
              public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                  if(c2.isChecked()){
                      t21.setText("Checkbox 2 button is checked");
                  }else{
                      t21.setText("checkbox 2 button is unchecked ");
                  }
              }
          }
  );

  c3.setOnCheckedChangeListener(
          new CompoundButton.OnCheckedChangeListener() {
              @Override
              public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                  if(c3.isChecked()){
                      t21.setText("Checkbox 3 button is checked");
                  }else{
                      t21.setText("checkbox 3 button is unchecked ");
                  }}
          }
  );

//   r1.setOnCheckedChangeListener(
//           new CompoundButton.OnCheckedChangeListener() {
//               @Override
//               public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
//                   if(isChecked){
//                       t21.setText("Radiobutton 1 button is checked");
//                   }else{
//                       t21.setText("RadioButton 1 button is unchecked ");
//
//                   }
//               }
//           }
//   );
//
//   r2.setOnCheckedChangeListener(
//           new CompoundButton.OnCheckedChangeListener() {
//               @Override
//               public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
//                   if (isChecked){
//                       t21.setText("Radiobutton 2 button is checked");
//                   }else{
//                       t21.setText("RadioButton 1 button is unchecked ");
//
//                   }
//               }
//           }
//   );

        r1.setOnCheckedChangeListener(
                new RadioGroup.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(RadioGroup group, int checkedId) {
                        RadioButton rbutton = findViewById(checkedId);
                        t21.setText(checkedId + "   "+rbutton.getText());
                    }
                }
        );
    }
}