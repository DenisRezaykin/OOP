package Model;

/**
 * Класс вычитания
 */
public class SubIModel extends CalcIModel {

    public SubIModel() {
    }

    /**
     * Переопределяю методы интерфейса
     */
    @Override
    public int result() {
        return x - y;
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
