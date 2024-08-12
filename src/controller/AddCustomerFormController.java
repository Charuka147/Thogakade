package controller;

import javafx.event.ActionEvent;
import javafx.scene.control.TextField;
import model.Customer;

import java.util.ArrayList;

public class AddCustomerFormController {

    public TextField txtID;
    public TextField txtname;
    public TextField txtAdress;
    public TextField txtSalary;
    public TextField txtNumber;
    ArrayList<Customer> customerList = new ArrayList<>();
    public void btnAddOnAction(ActionEvent actionEvent) {
        String id ;
        String name ;
        String address ;
        double salary ;
        String contact ;

        Customer customer = new Customer(txtID.getText(),txtname.getText(),txtAdress.getText(),Double.parseDouble(txtSalary.getText()),txtNumber.getText());

        System.out.println(customer);

        customerList.add(customer);

        customerList.forEach(obj->{
            System.out.println(obj);
        });
    }
}
