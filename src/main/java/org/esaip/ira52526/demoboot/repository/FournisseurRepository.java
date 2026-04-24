package org.esaip.ira52526.demoboot.repository;

import org.esaip.ira52526.demoboot.bo.Fournisseur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FournisseurRepository extends JpaRepository<Fournisseur, Integer> {
}
