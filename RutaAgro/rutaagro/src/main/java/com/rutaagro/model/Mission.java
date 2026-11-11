package com.rutaagro.model;

import com.rutaagro.enums.MissionStatus;
import jakarta.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "tb_mission")
public class Mission extends BaseEntity {

    @Column(nullable = false)
    private String description;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private MissionStatus status;


    @Column(name = "start_time")
    private Instant startTime;

    @Column(name = "end_time")
    private Instant endTime;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "tractor_id", nullable = false)
    private Tractor tractor;

    public Mission() {}

    public Mission(String description, MissionStatus status, Tractor tractor) {
        this.description = description;
        this.status = status;
        this.tractor = tractor;
    }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public MissionStatus getStatus() { return status; }
    public void setStatus(MissionStatus status) { this.status = status; }

    public Instant getStartTime() { return startTime; }
    public void setStartTime(Instant startTime) { this.startTime = startTime; }

    public Instant getEndTime() { return endTime; }
    public void setEndTime(Instant endTime) { this.endTime = endTime; }

    public Tractor getTractor() { return tractor; }
    public void setTractor(Tractor tractor) { this.tractor = tractor; }
}