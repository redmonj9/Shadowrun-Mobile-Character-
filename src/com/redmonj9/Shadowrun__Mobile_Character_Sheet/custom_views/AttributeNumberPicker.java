package com.redmonj9.Shadowrun__Mobile_Character_Sheet.custom_views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import com.redmonj9.Shadowrun__Mobile_Character_Sheet.R;

public class AttributeNumberPicker extends LinearLayout{

  private Button minusButton;
  private Button plusButton;
  private EditText attributeValue;

  public AttributeNumberPicker(Context context) {
    super(context);
    initializeViews(context);
  }

  public AttributeNumberPicker(Context context, AttributeSet attrs) {
    super(context, attrs);
    initializeViews(context);
  }

  public AttributeNumberPicker(Context context, AttributeSet attrs, int defStyleAttr) {
    super(context, attrs, defStyleAttr);
    initializeViews(context);
  }

  public AttributeNumberPicker(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
    super(context, attrs, defStyleAttr, defStyleRes);
    initializeViews(context);
  }

  private void initializeViews(Context context){
    LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    inflater.inflate(R.layout.attribute_number_picker, this);
  }

  @Override
  protected void onFinishInflate(){
    super.onFinishInflate();

    minusButton = (Button) this.findViewById(R.id.attribute_minus_button);
    minusButton.setBackgroundResource(android.R.drawable.ic_media_previous);
    minusButton.setOnClickListener(new OnClickListener() {
      @Override
      public void onClick(View v) {
        int currentValue = Integer.parseInt(attributeValue.getText().toString());
        setAttributeValue(currentValue--);
      }
    });

    plusButton = (Button) this.findViewById(R.id.attribute_plus_button);
    plusButton.setBackgroundResource(android.R.drawable.ic_media_next);
    plusButton.setOnClickListener(new OnClickListener() {
      @Override
      public void onClick(View v) {
        int currentValue = Integer.parseInt(attributeValue.getText().toString());
        setAttributeValue(currentValue++);
      }
    });

    attributeValue = (EditText) this.findViewById(R.id.attribute_value);
    attributeValue.setText("1");
  }

  public void setAttributeValue(int value){
    attributeValue.setText(""+value);
  }
}
