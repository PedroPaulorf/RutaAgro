package com.rutaagro.dto;

import com.rutaagro.enums.OperationalStatus;
import java.util.UUID;

public record TractorResponse(
        UUID id,
        String model,
        OperationalStatus operationalStatus) {
}
