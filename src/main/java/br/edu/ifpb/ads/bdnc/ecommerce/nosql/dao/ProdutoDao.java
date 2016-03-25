/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.ads.bdnc.ecommerce.nosql.dao;

import br.edu.ifpb.ads.bdnc.ecommerce.nosql.entities.Produto;
import br.edu.ifpb.ads.bdnc.ecommerce.nosql.interfaces.ProdutoDaoIF;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author jederson
 */
public class ProdutoDao implements ProdutoDaoIF{

    @Override
    public void inserir(Produto p) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void remover(Produto p) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void atualizar(Produto p) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Produto pesquisar(String descricao) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Produto> pesquisarProdutos(String descricao) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
