package Model;

public class MultIModel extends CalcIModel {
    /**
     * Класс умножения
     */
    public MultIModel() {
    }

    /**
     * Переопределяю методы интерфейса
     */
    @Override
    public int result() {
        return x * y;
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
