package org.example;

import org.example.Captured.SeleniumWebForm;

import static org.example.Calenium.*;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        launch("https://www.selenium.dev/selenium/web/web-form.html");

        type_byId(SeleniumWebForm.textBox, "Hello World");
        type_byName(SeleniumWebForm.passwordBox, "Hello World");
        type_byName(SeleniumWebForm.textArea, "Hello World");

        click_byId(SeleniumWebForm.checkBox);
        click_byId(SeleniumWebForm.radioButton);

        String filePath = "C:\\Users\\ApexC\\Desktop\\test.txt";
        //uploadfile(SeleniumWebForm.uploadFile, filePath);

        select_fromDropDown(SeleniumWebForm.dropDownSelect, "Three");
        //select_fromDataList(SeleniumWebForm.dropDownDataList, "Seat");

        //select_futureDate(SeleniumWebForm.datePicker, "24 Mar 2024");

        //slideRange(SeleniumWebForm.rangeSlider, 9);

        Thread.sleep(100);
    }
}