package com.optimagrowth.kbo.repository;

import com.optimagrowth.kbo.model.Kbo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface KboRepository extends CrudRepository<Kbo, String> {
    public List<Kbo> findByTeamName(String team);
}
