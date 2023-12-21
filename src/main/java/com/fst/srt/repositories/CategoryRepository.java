package com.fst.srt.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fst.srt.entities.Category;

@Repository
public interface CategoryRepository extends JpaRepository <Category,Long>
{
}
