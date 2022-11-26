package br.com.boletojuros.adapter.datasource.database.repository;

import br.com.boletojuros.adapter.datasource.database.entity.BoletoCalculadoEntity;
import org.hibernate.cfg.JPAIndexHolder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BoletoCalculadoRepository extends JpaRepository<BoletoCalculadoEntity, Long> {
}
