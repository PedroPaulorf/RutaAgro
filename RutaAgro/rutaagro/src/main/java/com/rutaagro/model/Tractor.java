package com.rutaagro.model;

import com.rutaagro.enums.OperationalStatus;
import jakarta.persistence.*;

@Entity
@Table(name = "tb_tractor") //criando tabela com "tb_" p SQL
public class Tractor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    //toda vez q cria um trator cmc de um nmr sequencial, ex trator1, trator2...

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

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getModel() { return model; }
    public void setModel(String model) { this.model = model; }

    public OperationalStatus getOperationalStatus() { return operationalStatus; }
    public void setOperationalStatus(OperationalStatus operationalStatus) { this.operationalStatus = operationalStatus; }
}