package Controller;

import Model.MultIModel;
import View.View;

/**
 * Класс управления умножением
 */
public class MultController implements I_Controller {
    /**
     * Сущность, которая взаимодействует с пользователем
     */
    View view;
    /**
     * Модель умножения
     */
    MultIModel multModel;

    public MultController(View view, MultIModel multModel) {
        this.view = view;
        this.multModel = multModel;
    }

    /**
     * Переопределяю интерфейсный метод
     */
    @Override
    public void doIt() {
        int a = view.getValue();
        int b = view.getValue();
        multModel.setX(a);
        multModel.setY(b);
        int result = multModel.result();
        view.print(result, "Произведение: ");
    }
}
