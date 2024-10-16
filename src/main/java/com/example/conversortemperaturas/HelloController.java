package com.example.conversortemperaturas;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Tooltip;

import java.util.Calendar;

public class HelloController {

    @FXML
    private TextField sendDate;
    @FXML
    private TextField temperatureField;
    @FXML
    private TextField conversionTempField;
    @FXML
    private TextField conversionTempFieldCelsius;
    @FXML
    private TextField conversionTempFieldFahrenheit;
    @FXML
    private TextField conversionTempFi8eldKelvin;
    @FXML
    private Button celsiusButton;
    @FXML
    private Button farenheitButton;
    @FXML
    private Button kelvinButton;
    @FXML
    private Button restartButton;

    @FXML
    protected void initialize() {

        sendDate.setText(Calendar.getInstance().getTime().toString());
        celsiusButton.setTooltip(new Tooltip("Convertir en Celsius"));
        farenheitButton.setTooltip(new Tooltip("Convertir en Fahrenheit"));
        kelvinButton.setTooltip(new Tooltip("Convertir en Kelvin"));
        restartButton.setTooltip(new Tooltip("Reiniciar datos"));
    }

    @FXML
    protected void restart() {
        sendDate.setText(Calendar.getInstance().getTime().toString());
        conversionTempField.clear();
        temperatureField.clear();
    }


    @FXML
    protected void setConversionTempFieldCelsius() {
        conversionTempField.setText(Double.toString(Double.parseDouble(temperatureField.getText())));
    }

    @FXML
    protected void setConversionTempFieldFahrenheit() {
        Double fahrenheitOpr = Double.parseDouble(temperatureField.getText()) * 9 / 5 + 32;
        conversionTempField.setText(Double.toString(fahrenheitOpr));
    }

    @FXML
    protected void setConversionTempFieldKelvin() {
        Double kelvinOpr = Double.parseDouble(temperatureField.getText()) - 273.15;
        conversionTempField.setText(Double.toString(kelvinOpr));
    }



}