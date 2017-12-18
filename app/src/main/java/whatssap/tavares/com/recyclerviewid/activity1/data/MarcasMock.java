package whatssap.tavares.com.recyclerviewid.activity1.data;

import android.app.Activity;

import java.util.ArrayList;
import java.util.List;

import whatssap.tavares.com.recyclerviewid.activity1.entities.Car;
import whatssap.tavares.com.recyclerviewid.activity1.entities.Marcas;


/**
 * Classe mock implementada para simular um repositório de dados
 * Ex: Banco de dados, chamada a serviço API
 */
public class MarcasMock {

    // Lista de carros
    private List<Marcas> mListMarcas;

    /**
     * Construtor - Inicia Mock
     */
    public MarcasMock(Activity activity) {
        this.mListMarcas = getCarMockList(activity);
    }

    /**
     * Retorna lista de carros
     */
    public List<Marcas> getList() {
        return this.mListMarcas;
    }

    /**
     * Retorna carro de acordo com o Id
     */
    public Marcas get(int id) {
        return this.mListMarcas.get(id);
    }

    private List<Marcas> getCarMockList(Activity activity) {
        List<Marcas> mMockList = new ArrayList<>();
        int id = 0;

        Marcas marcas = new Marcas(id, "Audi");
        mMockList.add(marcas);

        marcas = new Marcas(++id, "Bugatti");
        mMockList.add(marcas);

        marcas = new Marcas(++id, "Bentley");
        mMockList.add(marcas);

        marcas = new Marcas(++id, "Ferrari");
        mMockList.add(marcas);

        marcas = new Marcas(++id, "Fiat");
        mMockList.add(marcas);

        marcas = new Marcas(++id, "McLaren");
        mMockList.add(marcas);

        marcas = new Marcas(++id, "Chevrolet");
        mMockList.add(marcas);




        return mMockList;
    }

}
