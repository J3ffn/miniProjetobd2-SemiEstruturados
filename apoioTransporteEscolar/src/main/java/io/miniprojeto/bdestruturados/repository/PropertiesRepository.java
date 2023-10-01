package io.miniprojeto.bdestruturados.repository;

import io.miniprojeto.bdestruturados.model.Properties;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PropertiesRepository extends JpaRepository<Properties, Integer> {

}
