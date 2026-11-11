package com.rutaagro.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.transaction.annotation.Transactional;
import com.rutaagro.model.Tractor;
import com.rutaagro.enums.OperationalStatus;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Optional;

@SpringBootTest
@ActiveProfiles("test")
@Transactional

class TractorRepositoryTest {

    @Autowired
    private TractorRepository tractorRepository;

    @Test
    void shouldSaveAndFindTractor() {
        // Arrange: preparar um trator com dados de teste
        Tractor tractor = new Tractor("John Deere 8R", OperationalStatus.AWAITING_MISSION);
        // Act: salvar no banco e buscar pelo ID
        Tractor savedTractor = tractorRepository.save(tractor);
        Optional<Tractor> retrievedTractor = tractorRepository.findById(savedTractor.getId());

        // Teste visual temporario
        System.out.println("\n==================================================");
        System.out.println(" RUTA AGRO - TESTE DE PERSISTÊNCIA BEM SUCEDIDO! ");
        System.out.println("==================================================");
        System.out.println("ID Gerado no Banco: " + savedTractor.getId());
        System.out.println("Modelo do Trator   : " +
                retrievedTractor.get().getModel());
        System.out.println("Status Operacional : " +
                retrievedTractor.get().getOperationalStatus());
        System.out.println("==================================================\n");

        // Assert: conferir os dados recuperados
        assertTrue(retrievedTractor.isPresent());
        assertEquals("John Deere 8R", retrievedTractor.get().getModel());
        assertEquals(OperationalStatus.AWAITING_MISSION,
                retrievedTractor.get().getOperationalStatus());
        assertNotNull(retrievedTractor.get().getCreatedAt());
        assertNotNull(retrievedTractor.get().getUpdatedAt());
    }
}