package whatssap.tavares.com.recyclerviewid.activity1.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import whatssap.tavares.com.recyclerviewid.R;
import whatssap.tavares.com.recyclerviewid.activity1.entities.Car;
import whatssap.tavares.com.recyclerviewid.activity1.listener.OnListClickInteractionListener;


/**
 * Responsável por fazer as manipulações de elementos de interface
 */
public class CarViewHolder extends RecyclerView.ViewHolder {

    // Elemento de interface

    private TextView mTextCarModel;
    private TextView mTextViewDetails;


    /**
     * Construtor
     */
    public CarViewHolder(View itemView) {
        super(itemView);

        this.mTextCarModel = (TextView) itemView.findViewById(R.id.text_car_model);
        this.mTextViewDetails = (TextView) itemView.findViewById(R.id.text_view_details);
    }

    /**
     * Atribui valores aos elementos
     */
    public void bindData(final Car car, final OnListClickInteractionListener listener) {

        // Altera valor
        this.mTextCarModel.setText(car.model);


        // Adciona evento de click
        this.mTextViewDetails.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listener.onClick(car.id);
            }
        });
    }

}
