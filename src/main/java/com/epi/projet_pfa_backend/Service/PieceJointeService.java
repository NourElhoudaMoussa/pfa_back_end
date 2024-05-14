package com.epi.projet_pfa_backend.Service;



import com.epi.projet_pfa_backend.modele.PieceJointe;

import java.util.List;

public interface PieceJointeService {
    PieceJointe createPieceJointe(PieceJointe pieceJointe);
    List<PieceJointe> readPieceJointe();
    PieceJointe updatePieceJointe(Long id, PieceJointe pieceJointe);
    String DeletePieceJointe(Long id);
    PieceJointe getPieceJointeById(Long id);
}
