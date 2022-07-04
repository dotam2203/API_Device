package com.api.repository;

import com.api.entity.ChiTietThietBiEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ChiTietThietBiRepository extends JpaRepository<ChiTietThietBiEntity, Integer> {
    List<ChiTietThietBiEntity> findByCtThietBi_MaTB(String maThietBi);
}
