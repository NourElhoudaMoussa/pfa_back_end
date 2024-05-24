package com.epi.projet_pfa_backend.controller;

import com.epi.projet_pfa_backend.Service.PieceJointeService;
import com.epi.projet_pfa_backend.modele.PieceJointe;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/PieceJointe")
@AllArgsConstructor
public class PieceJointeController {
    private final PieceJointeService pieceJointeService;

    @PostMapping("/createPieceJointe")
    public PieceJointe createPieceJointe(@RequestBody PieceJointe pieceJointe) {
        return pieceJointeService.createPieceJointe(pieceJointe);
    }

    @GetMapping("/getAllPieceJointe")
    public List<PieceJointe> readPieceJointe() {
        return pieceJointeService.readPieceJointe();
    }

    @PutMapping("/updatePieceJointe/{id}")
    public PieceJointe updatePieceJointe(@PathVariable Long id, @RequestBody PieceJointe pieceJointe) {
        return pieceJointeService.updatePieceJointe(id, pieceJointe);
    }

    @DeleteMapping("/deletePieceJointe/{id}")
    public String deletePieceJointe(@PathVariable Long id) {
        return pieceJointeService.DeletePieceJointe(id);
    }

    @GetMapping("/getPieceJointeById/{id}")
    public PieceJointe getPieceJointeById(@PathVariable Long id){
        return pieceJointeService.getPieceJointeById(id);
    }

}
