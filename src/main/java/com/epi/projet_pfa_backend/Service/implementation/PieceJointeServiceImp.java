package com.epi.projet_pfa_backend.service.implementation;

import com.epi.projet_pfa_backend.Service.PieceJointeService;
import com.epi.projet_pfa_backend.modele.PieceJointe;
import com.epi.projet_pfa_backend.repository.PieceJointeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@AllArgsConstructor
@Service
public class PieceJointeServiceImp implements PieceJointeService {
    private final PieceJointeRepository pieceJointeRepository;
    @Override
    public PieceJointe createPieceJointe(PieceJointe pieceJointe) {
        return pieceJointeRepository.save(pieceJointe);
    }

    @Override
    public List<PieceJointe> readPieceJointe() {
        return pieceJointeRepository.findAll();
    }

    @Override
    public PieceJointe updatePieceJointe(Long id, PieceJointe pieceJointe) {
        return pieceJointeRepository.findById(id)
                .map(pj->{
                    pj.setNom(pieceJointe.getNom());
                    pj.setType(pieceJointe.getType());
                    pj.setReclamation(pieceJointe.getReclamation());
                    pj.setActualite(pieceJointe.getActualite());
                    return pieceJointeRepository.save(pj);
                }).orElseThrow(()->new RuntimeException("piece Jointe non trouvé !!"));
    }

    @Override
    public String DeletePieceJointe(Long id) {
        pieceJointeRepository.deleteById(id);
        return "piece Jointe supprimé avec succées";
    }

    @Override
    public PieceJointe getPieceJointeById(Long id) {
        return  pieceJointeRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("piece Jointe non trouvé!!"));
    }
}
