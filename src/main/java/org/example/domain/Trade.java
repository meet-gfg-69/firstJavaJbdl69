package org.example.domain;

import java.time.LocalDate;

public class Trade {
    private String symbol; // name of the item
    private LocalDate entryDate;
    private LocalDate exitDate;
    private Double buyPrice; // cost price of item
    private Double sellPrice; // sell price of item
    private Long quantity;
    private Double result;

    public Trade(String symbol, LocalDate entryDate, LocalDate exitDate, Double buyPrice, Double sellPrice, Long quantity) {
        this.symbol = symbol;
        this.entryDate = entryDate;
        this.exitDate = exitDate;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
        this.quantity = quantity;
        this.result=(sellPrice-buyPrice)*quantity;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public LocalDate getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(LocalDate entryDate) {
        this.entryDate = entryDate;
    }

    public LocalDate getExitDate() {
        return exitDate;
    }

    public void setExitDate(LocalDate exitDate) {
        this.exitDate = exitDate;
    }

    public Double getBuyPrice() {
        return buyPrice;
    }

    public void setBuyPrice(Double buyPrice) {
        this.buyPrice = buyPrice;
    }

    public Double getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(Double sellPrice) {
        this.sellPrice = sellPrice;
    }

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    public Double getResult() {
        return result;
    }

    public void setResult(Double result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "Trade{" +
                "symbol='" + symbol + '\'' +
                ", entryDate=" + entryDate +
                ", exitDate=" + exitDate +
                ", buyPrice=" + buyPrice +
                ", sellPrice=" + sellPrice +
                ", quantity=" + quantity +
                ", result=" + result +
                '}';
    }

}
