package com.allan.cursomc.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.allan.cursomc.domain.Cliente;
import com.allan.cursomc.domain.Pedido;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Integer> {
	
	@Transactional(readOnly=true)//Reduzir o likin 
	Page<Pedido> findByCliente(Cliente cliente, Pageable pageRequest);

}
