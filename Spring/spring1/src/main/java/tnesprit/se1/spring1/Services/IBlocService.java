package tnesprit.se1.spring1.Services;

import tnesprit.se1.spring1.Entities.Bloc;
import tnesprit.se1.spring1.Entities.Etudiant;

import java.util.List;

public interface IBlocService {
    List<Bloc> retrieveAllBlocs();

    Bloc addBloc(Bloc b);

    Bloc updateBloc(Bloc b);

    Bloc retrieveBloc(Long idBloc);

    void removeBloc(Long idBloc);
}
