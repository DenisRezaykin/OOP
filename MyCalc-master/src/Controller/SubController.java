package Controller;

import Model.SubIModel;
import View.View;

/**
 * Класс управления вычитанием
 */
public class SubController implements I_Controller {
    /**
     * Сущность, которая взаимодействует с пользователем
     */
    View view;
    /**
     * Модель вычитания
     */
    SubIModel subModel;

    public SubController(View view, SubIModel subModel) {
        this.view = view;
        this.subModel = subModel;
    }

    /**
     * Переопределяю интерфейсный метод
     */
    @Override
    public void doIt() {
        int a = view.getValue();
        int b = view.getValue();
        subModel.setX(a);
        subModel.setY(b);
        int result = subModel.result();
        view.print(result, "Разность: ");
    }
}
