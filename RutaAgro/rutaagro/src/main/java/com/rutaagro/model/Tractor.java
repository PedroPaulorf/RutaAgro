package com.rutaagro.model;

import com.rutaagro.enums.OperationalStatus;
import jakarta.persistence.*;

@Entity
@Table(name = "tb_tractor")
public class Tractor extends BaseEntity {

    @Column(nullable = false)
    private String model;

    @Enumerated(EnumType.STRING)
    @Column(name = "operational_status", nullable = false)
    private OperationalStatus operationalStatus;

    public Tractor() {}

    public Tractor(String model, OperationalStatus operationalStatus) {
        this.model = model;
        this.operationalStatus = operationalStatus;
    }

    public String getModel() { return model; }
    public void setModel(String model) { this.model = model; }

    public OperationalStatus getOperationalStatus() { return operationalStatus; }
    public void setOperationalStatus(OperationalStatus operationalStatus) { this.operationalStatus = operationalStatus; }
}