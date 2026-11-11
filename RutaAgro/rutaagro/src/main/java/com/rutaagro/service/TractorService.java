package com.rutaagro.service;

import com.rutaagro.dto.CreateTractorRequest;
import com.rutaagro.dto.TractorResponse;
import com.rutaagro.enums.OperationalStatus;
import com.rutaagro.model.Tractor;
import com.rutaagro.repository.TractorRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class TractorService {

    private final TractorRepository repository;

    public TractorService(TractorRepository repository) {
        this.repository = repository;
    }

    @Transactional
    public TractorResponse create(CreateTractorRequest request) {
        Tractor tractor = new Tractor(
                request.model().strip(),
                OperationalStatus.AWAITING_MISSION);

        Tractor saved = repository.save(tractor);

        return toResponse(saved);
    }

    @Transactional(readOnly = true)
    public List<TractorResponse> findAll() {
        return repository.findAll()
            .stream()
            .filter(tractor -> !tractor.isDeleted())
            .map(this::toResponse)
            .toList();
    }

    private TractorResponse toResponse(Tractor tractor) {
        return new TractorResponse(
            tractor.getId(),
            tractor.getModel(),
            tractor.getOperationalStatus()
        );
    }
}

