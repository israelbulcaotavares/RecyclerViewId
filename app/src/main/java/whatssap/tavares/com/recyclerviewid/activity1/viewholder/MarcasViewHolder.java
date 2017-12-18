package whatssap.tavares.com.recyclerviewid.activity1.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import whatssap.tavares.com.recyclerviewid.R;
import whatssap.tavares.com.recyclerviewid.activity1.entities.Car;
import whatssap.tavares.com.recyclerviewid.activity1.entities.Marcas;
import whatssap.tavares.com.recyclerviewid.activity1.listener.OnListClickInteractionListener;


/**
 * Responsável por fazer as manipulações de elementos de interface
 */
public class MarcasViewHolder extends RecyclerView.ViewHolder {

    // Elemento de interface

    private TextView mTextCarMarca;
    private TextView mTextViewDetails;


    /**
     * Construtor
     */
    public MarcasViewHolder(View itemView) {
        super(itemView);

        this.mTextCarMarca = (TextView) itemView.findViewById(R.id.text_car_model);
        this.mTextViewDetails = (TextView) itemView.findViewById(R.id.text_view_details);
    }

    /**
     * Atribui valores aos elementos
     */
    public void bindData(final Marcas marcas, final OnListClickInteractionListener listener) {

        // Altera valor
        this.mTextCarMarca.setText(marcas.marca);


        // Adciona evento de click
        this.mTextViewDetails.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listener.onClick(marcas.id);
            }
        });
    }

}
