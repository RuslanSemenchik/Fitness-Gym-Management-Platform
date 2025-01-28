package de.ait;

import java.time.LocalDate;

public class FinanceRecord {
    private String id;
    private String typeRecord;
    private double amount;
    private String description;
    private LocalDate date;

    public FinanceRecord(String id, String typeRecord, double amount, String description, LocalDate date) {
        this.id = id;
        this.typeRecord = typeRecord;
        this.amount = amount;
        this.description = description;
        this.date = date;
    }

    public String getId() {
        return id;
    }

    public String getTypeRecord() {
        return typeRecord;
    }

    public double getAmount() {
        return amount;
    }

    public String getDescription() {
        return description;
    }

    public LocalDate getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "FinanceRecord{" +
                "id='" + id + '\'' +
                ", typeRecord='" + typeRecord + '\'' +
                ", amount=" + amount +
                ", description='" + description + '\'' +
                ", date=" + date +
                '}';
    }
}
