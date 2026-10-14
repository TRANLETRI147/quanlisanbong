package com.tri.quanlisanbanh.repository;

import com.tri.quanlisanbanh.entity.SanBong;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SanBongRepository extends JpaRepository<SanBong, Long> {
}