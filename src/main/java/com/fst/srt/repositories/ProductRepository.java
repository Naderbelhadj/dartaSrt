package com.fst.srt.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.fst.srt.entities.Produit;
@Repository
public interface ProductRepository extends JpaRepository <Produit,Long> {

}
