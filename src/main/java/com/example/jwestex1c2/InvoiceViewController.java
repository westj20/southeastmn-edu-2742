package com.example.jwestex1c2;

import domain.DbContext;
import domain.GDate;
import domain.Invoice;
import domain.LineItem;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class InvoiceViewController {
    private ArrayList<Invoice> invoices = new ArrayList<Invoice>();
    @FXML
    private TextField invoiceIDTextField;
    @FXML
    private TextField statusTextField;
    @FXML
    private TextField invoiceDateTextField;
    @FXML
    private TextField dueDateTextField;
    @FXML
    private Button loadBtn;
    @FXML
    private ComboBox invoicesComboBox;
    @FXML
    private TextField descriptionTextField;
    @FXML
    private TextField amountTextField;
    @FXML
    private ListView lineItemListView;


    @FXML
    private Button saveInvoiceBtn;

    @FXML
    private TextField totalTextField;

    public InvoiceViewController() {
       this.invoices = DbContext.getInvoices();
    }


    private void displayInvoice(Invoice invoice){
        this.invoiceIDTextField.setText(Integer.toString(invoice.getInvoiceId()));
        this.statusTextField.setText(Integer.toString(invoice.getStatus()));
        this.invoiceDateTextField.setText(invoice.getInvoiceDate().toString());
        this.dueDateTextField.setText(invoice.getDueDate().toString());
    }
    @FXML
    protected  void initialize(){
      for (Invoice invoice : this.invoices) {
          invoicesComboBox.getItems().add(invoice.toShortString());
      }
        invoicesComboBox.getSelectionModel().selectFirst();
        Invoice invoice = this.invoices.get(0);
        this.displayInvoice(invoice);
        this.displayLineItems(invoice);
    }

    @FXML
    private void invoiceComboBoxSelected(ActionEvent actionEvent) {
        int index = invoicesComboBox.getSelectionModel().getSelectedIndex();
        if (index >= 0) {
            Invoice invoice = this.invoices.get(index);
            this.displayInvoice(invoice);
            this.displayLineItems(invoice);
        }
    }

    @FXML
    private void updateTotal() {
        double totalAmount = 0.0;

        int selectedInvoiceIndex = invoicesComboBox.getSelectionModel().getSelectedIndex();

        if (selectedInvoiceIndex >= 0) {
            Invoice selectedInvoice = this.invoices.get(selectedInvoiceIndex);
            totalAmount = selectedInvoice.total();
        }

        totalTextField.setText(String.valueOf(totalAmount));
    }

    private void displayLineItems(Invoice invoice) {

        lineItemListView.getItems().clear();


        List<LineItem> lineItems = invoice.getLineItems();


        for (LineItem item : lineItems) {
            lineItemListView.getItems().add(item.toString());
        }


        descriptionTextField.clear();
        amountTextField.clear();


        if (!lineItems.isEmpty()) {
            lineItemListView.getSelectionModel().select(0);
        }


        if (!lineItems.isEmpty()) {
            displayLineItem(lineItems.get(0));
        }
    }

    private void displayLineItem(LineItem lineItem) {
        if (lineItem != null) {
            totalTextField.setText(String.valueOf(lineItem.getTotal()));
            descriptionTextField.setText(lineItem.getDescription());
            amountTextField.setText(String.valueOf(lineItem.getAmount()));
        } else {
            descriptionTextField.clear();
            amountTextField.clear();
        }

    }
    @FXML
    private void lineItemClicked(MouseEvent mouseEvent) {

        int selectedInvoiceIndex = invoicesComboBox.getSelectionModel().getSelectedIndex();

        Invoice selectedInvoice = this.invoices.get(selectedInvoiceIndex);


        List<LineItem> lineItems = selectedInvoice.getLineItems();


        int selectedLineItemIndex = lineItemListView.getSelectionModel().getSelectedIndex();


        if (selectedLineItemIndex >= 0 && selectedLineItemIndex < lineItems.size()) {
            LineItem selectedLineItem = lineItems.get(selectedLineItemIndex);


            displayLineItem(selectedLineItem);
        }
    }

    @FXML
    private void addClicked(ActionEvent actionEvent) {
        int selectedInvoiceIndex = invoicesComboBox.getSelectionModel().getSelectedIndex();

        if (selectedInvoiceIndex >= 0) {
            Invoice selectedInvoice = this.invoices.get(selectedInvoiceIndex);

            try {
                double amount = Double.parseDouble(amountTextField.getText());
                String description = descriptionTextField.getText();

                LineItem newLineItem = new LineItem(amount, description);

                selectedInvoice.addLineItem(newLineItem);

                lineItemListView.getItems().add(newLineItem.toString());

                descriptionTextField.clear();
                amountTextField.clear();

                updateTotal();
            } catch (NumberFormatException e) {

                e.printStackTrace();
            }
        }
    }

    @FXML
    private void deleteClicked(ActionEvent actionEvent) {
        int selectedInvoiceIndex = invoicesComboBox.getSelectionModel().getSelectedIndex();

        if (selectedInvoiceIndex >= 0) {
            Invoice selectedInvoice = this.invoices.get(selectedInvoiceIndex);

            int selectedLineItemIndex = lineItemListView.getSelectionModel().getSelectedIndex();

            if (selectedLineItemIndex >= 0) {

                selectedInvoice.removeLineItem(selectedLineItemIndex);

                lineItemListView.getItems().remove(selectedLineItemIndex);

                descriptionTextField.clear();
                amountTextField.clear();

                updateTotal();
            }
        }
    }

    @FXML
    private void saveInvoiceClicked(ActionEvent actionEvent) {

        int selectedIndex = invoicesComboBox.getSelectionModel().getSelectedIndex();


        if (selectedIndex >= 0) {
            Invoice selectedInvoice = invoices.get(selectedIndex);


            try {
                int newStatus = Integer.parseInt(statusTextField.getText());
                selectedInvoice.setStatus(newStatus);

                String invoiceDateText = invoiceDateTextField.getText();
                String dueDateText = dueDateTextField.getText();


                int invoiceYear = Integer.parseInt(invoiceDateText.substring(0, 4));
                int invoiceMonth = Integer.parseInt(invoiceDateText.substring(6, 7));
                int invoiceDay = Integer.parseInt(invoiceDateText.substring(9, 10));
                GDate invoiceDate = new GDate(invoiceYear, invoiceMonth, invoiceDay);

                int dueYear = Integer.parseInt(dueDateText.substring(0, 4));
                int dueMonth = Integer.parseInt(dueDateText.substring(6, 7));
                int dueDay = Integer.parseInt(dueDateText.substring(9, 10));
                GDate dueDate = new GDate (dueYear, dueMonth, dueDay);

                selectedInvoice.setInvoiceDate(invoiceDate);
                selectedInvoice.setDueDate(dueDate);
                invoicesComboBox.getItems().remove(selectedIndex);
                invoicesComboBox.getItems().add(selectedIndex, selectedInvoice.toShortString());


                invoicesComboBox.getSelectionModel().select(selectedIndex);
            } catch (NumberFormatException e) {

                e.printStackTrace();
            }
        }
    }



    @FXML
    private void saveLineItemClicked(ActionEvent actionEvent) {

        int selectedInvoiceIndex = invoicesComboBox.getSelectionModel().getSelectedIndex();

        Invoice selectedInvoice = this.invoices.get(selectedInvoiceIndex);

        int selectedLineItemIndex = lineItemListView.getSelectionModel().getSelectedIndex();

        if (selectedLineItemIndex >= 0 && selectedLineItemIndex < selectedInvoice.getLineItems().size()) {
            selectedInvoice.removeLineItem(selectedLineItemIndex);
        }

        double amount = Double.parseDouble(amountTextField.getText());
        String description = descriptionTextField.getText();
        LineItem newLineItem = new LineItem(amount, description);

        selectedInvoice.addLineItem(newLineItem);

        if (selectedLineItemIndex >= 0) {
            lineItemListView.getItems().remove(selectedLineItemIndex);
        }

        lineItemListView.getItems().add(newLineItem.toString());
        lineItemListView.getSelectionModel().select(newLineItem.toString());
    }

}


