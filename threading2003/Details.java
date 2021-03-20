package org.example.threading2003;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

public class Details{
    private AtomicInteger quantityDetails;

    public Details(AtomicInteger quantityDetails) {
        this.quantityDetails = quantityDetails;
    }

    public AtomicInteger getQuantityDetails() {
        return quantityDetails;
    }

    public void setQuantityDetails(AtomicInteger quantityDetails) {
        this.quantityDetails = quantityDetails;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Details details = (Details) o;
        return Objects.equals(quantityDetails, details.quantityDetails);
    }

    @Override
    public int hashCode() {
        return Objects.hash(quantityDetails);
    }

}
