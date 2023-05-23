package com.example.nicolasvicente_comp1011200539594;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class DentalPaymentController implements Initializable {

    @FXML
    private TextField addressFld;

    @FXML
    private RadioButton adultRadionBtn;

    @FXML
    private Button calculateButton;

    @FXML
    private CheckBox fillingCheckbox;

    @FXML
    private CheckBox flossingCheckbox;

    @FXML
    private TextField nameFld;

    @FXML
    private ChoiceBox<String> provincesDropdown;

    @FXML
    private CheckBox rootCanalCheckbox;

    @FXML
    private RadioButton seniorRadioBtn;

    @FXML
    private Label totalPriceLabel;

    @FXML
    private RadioButton youthRadioBtn;







    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        // Populate the provincesDropdown with province names
        provincesDropdown.getItems().addAll("Alberta", "Ontario", "Quebec");

        // Set a default value for the provincesDropdown
        provincesDropdown.setValue("Ontario");

    }



        @FXML
        private void calculateButtonClicked() {
            // Get the selected province from provincesDropdown
            String selectedProvince = provincesDropdown.getValue();

            // Get the patient's name from the nameFld
            String patientName = nameFld.getText();


            // Perform calculations based on selected checkboxes, inputs, and province
            // Update the totalPriceLabel with the calculated result

            // Example: Calculate total price based on selected checkboxes
            double totalPrice = 0.0;
            if (flossingCheckbox.isSelected()) {
                // Add flossing price to total
                totalPrice += 20.0;
            }
            if (fillingCheckbox.isSelected()) {
                // Add filling price to total
                totalPrice += 75.0;
            }
            if (rootCanalCheckbox.isSelected()) {
                // Add root canal price to total
                totalPrice += 150.0;
            }

            // Apply discount for senior and youth
            if (seniorRadioBtn.isSelected() || youthRadioBtn.isSelected()) {
                totalPrice *= 0.9; // Apply 10% discount
            }

            // Apply tax based on the selected province
            double taxRate = 0.0;
            if (selectedProvince.equals("Alberta")) {
                taxRate = 0.06;
            } else if (selectedProvince.equals("Ontario")) {
                taxRate = 0.13;
            } else if (selectedProvince.equals("Quebec")) {
                taxRate = 0.05;
            }

            double taxAmount = totalPrice * taxRate;
            double totalPriceWithTax = totalPrice + taxAmount;

            // Update the totalPriceLabel with patient name too
            totalPriceLabel.setText(String.format("Patient: %s%nTotal Price: $%.2f (Tax: $%.2f)", patientName, totalPriceWithTax, taxAmount));
            }
        }












