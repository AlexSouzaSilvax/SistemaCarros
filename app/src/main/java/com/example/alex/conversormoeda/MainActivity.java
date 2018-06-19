package com.example.alex.conversormoeda;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ViewHolder mViewHolder = new ViewHolder();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.mViewHolder.editValue = (EditText) findViewById(R.id.Valor);
        this.mViewHolder.valorDollar2 = (TextView) findViewById(R.id.ValorDollar2);
        this.mViewHolder.valorEuro2 = (TextView) findViewById(R.id.ValorEuro2);
        this.mViewHolder.btnCalcular = (Button) findViewById(R.id.btnCalcular);

        this.mViewHolder.btnCalcular.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        if (id == R.id.btnCalcular) {
           //this.mViewHolder.btnCalcular.setText("Teste");
            Double value = Double.valueOf(this.mViewHolder.editValue.getText().toString());
            this.mViewHolder.valorDollar2.setText(String.format("%.2f", value * 3.67));
            this.mViewHolder.valorEuro2.setText(String.format("%.2f", value *  4.29));
        }
    }

    private static class ViewHolder {
        EditText editValue;
        TextView valorDollar2;
        TextView valorEuro2;
        Button btnCalcular;

    }
}
