package com.valentine1996.pharmacy.model.repository;

import com.valentine1996.pharmacy.model.entity.AccountingSystem;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Interface for work with persistence layout
 *
 * @version 1.0
 */
public interface AccountingSystemRepository extends JpaRepository < AccountingSystem, Long > {
    public AccountingSystem findByName( String name );
}
