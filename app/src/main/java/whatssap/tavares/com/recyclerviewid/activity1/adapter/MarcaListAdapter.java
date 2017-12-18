package whatssap.tavares.com.recyclerviewid.activity1.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import whatssap.tavares.com.recyclerviewid.R;
import whatssap.tavares.com.recyclerviewid.activity1.entities.Car;
import whatssap.tavares.com.recyclerviewid.activity1.entities.Marcas;
import whatssap.tavares.com.recyclerviewid.activity1.listener.OnListClickInteractionListener;
import whatssap.tavares.com.recyclerviewid.activity1.viewholder.CarViewHolder;
import whatssap.tavares.com.recyclerviewid.activity1.viewholder.MarcasViewHolder;


/**
 * Classe Adapter que extende a classe RecyclerView.Adapter
 * Necessária para implementação da RecyclerView
 */
public class MarcaListAdapter extends RecyclerView.Adapter<MarcasViewHolder> {

    // Lista de carros
    private List<Marcas> mListMarcas;

    // Interface que define as ações
    private OnListClickInteractionListener mOnListClickInteractionListener;

    /**
     * Construtor
     */
    public MarcaListAdapter(List<Marcas> marcas, OnListClickInteractionListener listener) {
        this.mListMarcas = marcas;
        this.mOnListClickInteractionListener = listener;
    }

    /**
     * Responsável pela criação de linha
     */
    @Override
    public MarcasViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        // Obtém o contexto
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        // Instancia o layout para manipulação dos elementos
        View marcaView = inflater.inflate(R.layout.row_car_list2, parent, false);

        // Passa a ViewHolder
        return new MarcasViewHolder(marcaView);
    }

    /**
     * Responsável por atribuir valores após linha criada
     */
    @Override
    public void onBindViewHolder(MarcasViewHolder holder, int position) {
        Marcas marcas = this.mListMarcas.get(position);
        holder.bindData(marcas, this.mOnListClickInteractionListener);
    }

    @Override
    public int getItemCount() {
        return this.mListMarcas.size();
    }

}
