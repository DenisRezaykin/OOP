package Controller;

import Model.SumIModel;
import View.View;
/**Класс управления сложением*/
public class SumController implements I_Controller{
    /**Сущность, которая взаимодействует с пользователем*/
    View view;
    /**Модель сложения*/
    SumIModel model;

    public SumController(View view, SumIModel model) {
        this.view = view;
        this.model = model;
    }


    /**
     * Переопределяю интерфейсный метод
     */
    @Override
    public void doIt() {
        int a = view.getValue();
        int b = view.getValue();
        model.setX(a);
        model.setY(b);
        int result = model.result();
        view.print(result, "Сумма: ");
    }
}
