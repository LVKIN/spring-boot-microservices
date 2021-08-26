package com.microservices.credit.account;

import java.io.Serializable;
import java.math.BigDecimal;

public class Credit implements Serializable {
    private BigDecimal credit;

    public Credit() {
        super();
    }

    public Credit(BigDecimal credit) {
        this.credit = credit;
    }

    public BigDecimal getCredit() {
        return credit;
    }

    public void setCredit(BigDecimal credit) {
        this.credit = credit;
    }
}
