package whatssap.tavares.com.recyclerviewid.activity1.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import whatssap.tavares.com.recyclerviewid.R;
import whatssap.tavares.com.recyclerviewid.activity1.entities.Car;
import whatssap.tavares.com.recyclerviewid.activity1.listener.OnListClickInteractionListener;
import whatssap.tavares.com.recyclerviewid.activity1.viewholder.CarViewHolder;


/**
 * Classe Adapter que extende a classe RecyclerView.Adapter
 * Necessária para implementação da RecyclerView
 */
public class CarListAdapter extends RecyclerView.Adapter<CarViewHolder> {

    // Lista de carros
    private List<Car> mListCars;

    // Interface que define as ações
    private OnListClickInteractionListener mOnListClickInteractionListener;

    /**
     * Construtor
     */
    public CarListAdapter(List<Car> cars, OnListClickInteractionListener listener) {
        this.mListCars = cars;
        this.mOnListClickInteractionListener = listener;
    }

    /**
     * Responsável pela criação de linha
     */
    @Override
    public CarViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        // Obtém o contexto
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        // Instancia o layout para manipulação dos elementos
        View carView = inflater.inflate(R.layout.row_car_list, parent, false);

        // Passa a ViewHolder
        return new CarViewHolder(carView);
    }

    /**
     * Responsável por atribuir valores após linha criada
     */
    @Override
    public void onBindViewHolder(CarViewHolder holder, int position) {
        Car car = this.mListCars.get(position);
        holder.bindData(car, this.mOnListClickInteractionListener);
    }

    @Override
    public int getItemCount() {
        return this.mListCars.size();
    }

}
