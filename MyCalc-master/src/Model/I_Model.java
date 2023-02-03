package Model;

/**
 * Глобальная модель калькулятора
 */
public interface I_Model {
    /**
     * Метод возвращает результат
     */
    int result();

    /**
     * Метод устанавливает первое число
     */
    void setX(int value);

    /**
     * Метод устанавливает второе число
     */
    void setY(int value);
}


