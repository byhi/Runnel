package com.byhi.runnel.runnelapplication.repository;

import com.byhi.runnel.runnelapplication.modal.OutPayEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OutPayRepository extends JpaRepository<OutPayEntity,Long > {
}
