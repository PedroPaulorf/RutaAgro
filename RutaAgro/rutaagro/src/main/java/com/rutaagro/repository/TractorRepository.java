package com.rutaagro.repository;

import com.rutaagro.model.Tractor;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TractorRepository extends JpaRepository<Tractor, UUID> {

}
