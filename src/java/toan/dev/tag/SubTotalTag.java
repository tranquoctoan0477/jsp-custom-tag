/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package toan.dev.tag;

/**
 *
 * @author tranq
 */
import jakarta.servlet.jsp.tagext.*;
import jakarta.servlet.jsp.*;
import java.io.*;

public class SubTotalTag extends SimpleTagSupport {

    int quantity;
    double price;
    String currency;

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public void doTag() throws JspException, IOException {
        JspWriter out = getJspContext().getOut();
        String rs = switch (currency) {
            case "vi" -> String.format("VND %.2f", quantity * price);
            case "us" -> String.format("USD %.2f", quantity * price);
            default -> throw new AssertionError();
        };
        out.println(rs);
    }
}
