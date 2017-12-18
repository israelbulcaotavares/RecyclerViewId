package whatssap.tavares.com.recyclerviewid.activity1.data;

import android.app.Activity;
import android.support.v4.content.ContextCompat;

import java.util.ArrayList;
import java.util.List;


import whatssap.tavares.com.recyclerviewid.R;
import whatssap.tavares.com.recyclerviewid.activity1.entities.Car;


/**
 * Classe mock implementada para simular um repositório de dados
 * Ex: Banco de dados, chamada a serviço API
 */
public class CarMock {

    // Lista de carros
    private List<Car> mListCars;

    /**
     * Construtor - Inicia Mock
     */
    public CarMock(Activity activity) {
        this.mListCars = getCarMockList(activity);
    }

    /**
     * Retorna lista de carros
     */
    public List<Car> getList() {
        return this.mListCars;
    }

    /**
     * Retorna carro de acordo com o Id
     */
    public Car get(int id) {
        return this.mListCars.get(id);
    }

    private List<Car> getCarMockList(Activity activity) {
        List<Car> mMockList = new ArrayList<>();
        int id = 0;

        Car audi = new Car(id, "Audi R8");
        mMockList.add(audi);

        audi = new Car(++id, "Audi A1");
        mMockList.add(audi);

        audi = new Car(++id, "Audi A3");
        mMockList.add(audi);

        audi = new Car(++id, "Audi A4");
        mMockList.add(audi);

        audi = new Car(++id, "Audi A5");
        mMockList.add(audi);

        audi = new Car(++id, "Audi A6");
        mMockList.add(audi);

        audi = new Car(++id, "Audi A7");
        mMockList.add(audi);

        audi = new Car(++id, "Audi A8");
        mMockList.add(audi);

        audi = new Car(++id, "Audi A9");
        mMockList.add(audi);

        return mMockList;
    }

}
