package com.rutaagro.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record CreateTractorRequest(
        @NotBlank(message = "The model is mandatory") @Size(max = 255, message = "The model must have up to 255 characters") String model) {
}
