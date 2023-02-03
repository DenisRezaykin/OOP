import Controller.DivController;
import Controller.MultController;
import Controller.SubController;
import Controller.SumController;
import Model.DivIModel;
import Model.MultIModel;
import Model.SubIModel;
import Model.SumIModel;
import View.View;
import View.Menu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        View v = new View();
        Presenter p = new Presenter(new SumController(v, new SumIModel()), new SubController(v, new SubIModel()), new DivController(v, new DivIModel()), new MultController(v, new MultIModel()), scanner, new Menu(scanner));
        p.start();
    }
}
