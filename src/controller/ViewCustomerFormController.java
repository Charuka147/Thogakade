package controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableArray;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import model.Customer;

public class ViewCustomerFormController {
    public TableView tblCustomers;
    public TableColumn collID;
    public TableColumn collName;
    public TableColumn collAddress;
    public TableColumn collSalary;
    public TableColumn collContact;

    public void btnReloadOnAction(ActionEvent actionEvent) {
        collID.setCellValueFactory(new PropertyValueFactory<>("id"));
        collName.setCellValueFactory(new PropertyValueFactory<>("name"));
        collAddress.setCellValueFactory(new PropertyValueFactory<>("address"));
        collSalary.setCellValueFactory(new PropertyValueFactory<>("salary"));
        collContact.setCellValueFactory(new PropertyValueFactory<>("contact"));

       ObservableList<Customer> customersList = FXCollections.observableArrayList();
        customersList.add(new Customer("001","Saman","gampaha",75000.0,"0768616156"));

        tblCustomers.setItems(customersList);
    }
}
