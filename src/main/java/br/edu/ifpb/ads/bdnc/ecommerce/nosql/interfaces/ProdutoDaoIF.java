/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.ads.bdnc.ecommerce.nosql.interfaces;

import br.edu.ifpb.ads.bdnc.ecommerce.nosql.entities.Produto;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author jederson
 */
public interface ProdutoDaoIF {
    
    public void inserir(Produto p) throws SQLException;

    public void remover(Produto p) throws SQLException;

    public void atualizar(Produto p) throws SQLException;

    public Produto pesquisar(String descricao) throws SQLException;

    public List<Produto> pesquisarProdutos(String descricao) throws SQLException;
}
