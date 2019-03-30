package com.shop.repos;

import com.shop.domain.Office;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OfficeRepo extends JpaRepository<Office, Long> {
}
