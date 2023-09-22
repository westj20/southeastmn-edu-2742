package domain;

import java.util.ArrayList;

import static domain.DbContext.getInvoices;

public class Invoice {

    private int invoiceId;
    private int status;
    private GDate invoiceDate;
    private ArrayList<LineItem> lineItems = new ArrayList<LineItem>();
    private GDate dueDate;

    public Invoice(int status, GDate invoiceDate, GDate dueDate) {
        this.invoiceId = DbContext.getNextInvoiceId();
        this.status = status;
        this.invoiceDate = invoiceDate;
        this.dueDate = dueDate;
    }

    public Invoice(Invoice invoice) {
        this.invoiceId = invoice.invoiceId;
        this.status = invoice.getStatus();
        this.invoiceDate = new GDate(invoice.getInvoiceDate());
        this.dueDate = new GDate(invoice.getDueDate());


        for (LineItem originalItem : invoice.getLineItems()) {
            this.lineItems.add(new LineItem(originalItem));
        }
    }

    public Invoice copy() {
        return new Invoice(this);
    }

    public void addLineItem(LineItem lineItem) {
        LineItem copy = new LineItem(lineItem);
        this.lineItems.add(copy);
    }

    public LineItem removeLineItem(int index) {
        if (index >= 0 && index < this.lineItems.size()) {
            return this.lineItems.remove(index);
        }
        return null;
    }

    public LineItem removeLineItem(LineItem lineItem) {
        for (int i = 0; i < this.lineItems.size(); i++) {
            LineItem currentItem = this.lineItems.get(i);
            if (currentItem.equals(lineItem)) {
                return this.lineItems.remove(i);
            }
        }
        return null;
    }


    public int getInvoiceId() {
        return invoiceId;
    }

    public int getStatus() {
        return status;
    }

    public GDate getInvoiceDate() {
        return invoiceDate.copy();
    }

    public GDate getDueDate() {
        return dueDate.copy();
    }


    public ArrayList<LineItem> getLineItems() {
        return new ArrayList<>(lineItems);
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "invoiceId=" + invoiceId +
                ", status=" + status +
                ", invoiceDate=" + invoiceDate +
                ", dueDate=" + dueDate +
                '}';
    }
    public String toShortString() {
        return Integer.toString(invoiceId) +
                " ,status: " + status + ", " + invoiceDate;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public void setInvoiceDate(GDate invoiceDate) {
        this.invoiceDate = invoiceDate.copy();
    }

   public void setDueDate(GDate invoiceDate) {
        this.dueDate = dueDate.copy();
    }

    public double total() {

            double totalAmount = 0.0;

            for (LineItem item : lineItems) {
                totalAmount += item.getAmount();
            }

            return totalAmount;
        }

}
