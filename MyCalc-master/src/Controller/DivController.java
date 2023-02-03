package Controller;

import Model.DivIModel;
import View.View;
/**Класс управления делением*/
public class DivController implements I_Controller {
    /**Сущность, которая взаимодействует с пользователем*/
    View view;
    /**Модель деления*/
    DivIModel divModel;

    public DivController(View view, DivIModel divModel) {
        this.view = view;
        this.divModel = divModel;
    }

    /**
     * Переопределяю интерфейсный метод
     */
    @Override
    public void doIt() {
        int a = view.getValue();
        int b = view.getValueDiv();
        divModel.setX(a);
        divModel.setY(b);
        int result = divModel.result();
        view.print(result, "Частное: ");

    }
}
