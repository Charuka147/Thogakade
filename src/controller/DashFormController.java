package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class DashFormController {
    public void btnAddCustomerOnAction(ActionEvent actionEvent) {
        try {
            Scene scene = new Scene(FXMLLoader.load(getClass().getResource("../view/add_customer_form.fxml")));

            Stage stage = new Stage();

            stage.setScene(scene);

            stage.show();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void btnViewCustomerOnAction(ActionEvent actionEvent) {
        try {
            Scene scene = new Scene(FXMLLoader.load(getClass().getResource("../view/view_customer_form.fxml")));

            Stage stage = new Stage();

            stage.setScene(scene);

            stage.show();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
