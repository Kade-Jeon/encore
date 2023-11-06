package com.optimagrowth.kbo.service;

import java.util.List;

import com.optimagrowth.kbo.repository.KboRepository;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.optimagrowth.kbo.model.Kbo;
@Service
public class KboService {

    private static final Logger logger = LoggerFactory.getLogger(KboService.class);

    @Autowired
    private KboRepository repository;

    public List<Kbo> findByTeamName(String team){
        List<Kbo> teams = repository.findByTeamName(team);
        return teams;
    }
}
