/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.ads.bdnc.ecommerce.nosql.interfaces;

import br.edu.ifpb.ads.bdnc.ecommerce.nosql.entities.Cliente;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author jederson
 */
public interface ClienteDaoIF {

    public void inserir(Cliente c) throws SQLException;

    public void remover(Cliente c) throws SQLException;

    public void atualizar(Cliente c) throws SQLException;

    public Cliente pesquisar(String cpf) throws SQLException;

    public List<Cliente> pesquisarClintes(String nome) throws SQLException;
}
