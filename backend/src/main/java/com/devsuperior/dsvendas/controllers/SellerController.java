package com.devsuperior.dsvendas.controllers;

import com.devsuperior.dsvendas.dto.SellerDto;
import com.devsuperior.dsvendas.services.SellerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/sellers")
public class SellerController {

    private final SellerService sellerService;

    public SellerController(SellerService sellerService) {
        this.sellerService = sellerService;
    }

    @GetMapping
    public ResponseEntity<List<SellerDto>> findAll() {
        List<SellerDto> list = sellerService.findAll();
        return ResponseEntity.ok(list);
    }
}
