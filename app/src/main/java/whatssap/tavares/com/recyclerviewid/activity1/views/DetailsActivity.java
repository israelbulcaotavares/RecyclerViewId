package whatssap.tavares.com.recyclerviewid.activity1.views;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;


import whatssap.tavares.com.recyclerviewid.R;
import whatssap.tavares.com.recyclerviewid.activity1.contants.CarrosContants;
import whatssap.tavares.com.recyclerviewid.activity1.data.CarMock;
import whatssap.tavares.com.recyclerviewid.activity1.entities.Car;


public class DetailsActivity extends AppCompatActivity {

    // Variáveis da classe
    private ViewHolder mViewHolder = new ViewHolder();
    private CarMock mCarMock;
    private Car mCar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        getSupportActionBar().setDisplayShowTitleEnabled(false);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);

        // Instancia variáveis
        this.mCarMock = new CarMock(this);

        // Instancia elementos de interfacew

        this.mViewHolder.textModel = (TextView) this.findViewById(R.id.text_model);


        // Obtém o valor passado por parâmetro
        this.getDataFromActivity();

        // Atribui os valores aos elementos de interface
        this.setData();

    }

    /**
     * Atribui os valores aos elementos de interface
     */
    private void setData() {

        this.mViewHolder.textModel.setText(this.mCar.model);

    }

    /**
     * Obtém o valor passado por parâmetro
     */
    private void getDataFromActivity() {
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            this.mCar = this.mCarMock.get(extras.getInt(CarrosContants.CARRO_ID));
        }
    }

    /**
     * ViewHolder
     */
    private static class ViewHolder {

        TextView textModel;

    }

}
