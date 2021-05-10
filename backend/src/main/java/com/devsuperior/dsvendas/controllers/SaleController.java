package com.devsuperior.dsvendas.controllers;

import com.devsuperior.dsvendas.dto.SaleDto;
import com.devsuperior.dsvendas.services.SaleService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/sales")
public class SaleController {

    private final SaleService saleService;

    public SaleController(SaleService saleService) {
        this.saleService = saleService;
    }

    @GetMapping
    public ResponseEntity<Page<SaleDto>> findAll(Pageable pageable) {
        Page<SaleDto> list = saleService.findAll(pageable);
        return ResponseEntity.ok(list);
    }
}
