package Model;

/**
 * Класс целочисленного деления
 */
public class DivIModel extends CalcIModel {

    public DivIModel() {
    }

    /**
     * Переопределяю методы интерфейса
     */
    @Override
    public int result() {
        return x / y;
    }

    @Override
    public void setX(int value) {
        super.x = value;
    }

    @Override
    public void setY(int value) {
        super.y = value;
    }
}
