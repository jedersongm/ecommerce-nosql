/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.ads.bdnc.ecommerce.nosql.dao;

import br.edu.ifpb.ads.bdnc.ecommerce.nosql.conexao.ClasseConexao;
import br.edu.ifpb.ads.bdnc.ecommerce.nosql.conexao.ConnectionFactory;
import br.edu.ifpb.ads.bdnc.ecommerce.nosql.entities.Produto;
import br.edu.ifpb.ads.bdnc.ecommerce.nosql.interfaces.ProdutoDaoIF;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author jederson
 */
public class ProdutoDao implements ProdutoDaoIF{

    ConnectionFactory factory = new ConnectionFactory();
    ClasseConexao conexao = new ClasseConexao();
    Connection con;
    PreparedStatement pstm;
    
    public ProdutoDao(){
        try{
            con = factory.getConnection();
        }catch(SQLException ex){
        }
    }
    
    @Override
    public void inserir(Produto p) throws SQLException {
        try{
            conexao.abrir();
            
            String sql = "INSERT INTO produto(cod,descricao,preco) VALUES(?,?,?)";
            
            pstm = con.prepareStatement(sql);
            pstm.setInt(1, p.getCod());
            pstm.setString(2, p.getDescricao());
            pstm.setDouble(3, p.getPreco());
            
            pstm.executeQuery();
            JOptionPane.showMessageDialog(null, "Produto cadastrado com sucesso");
        }catch(SQLException ex){
            System.out.println(ex);
        }finally{
            conexao.liberar();
        }
    }

    @Override
    public void remover(Produto p) throws SQLException {
        try{
            conexao.abrir();
            
            String sql = "DELETE FROM produto WHERE cod = ?";
            
            pstm = con.prepareStatement(sql);
            pstm.setInt(1,p.getCod());
            
            pstm.executeQuery();
            
        }finally{
            conexao.liberar();
        }
    }

    @Override
    public void atualizar(Produto p) throws SQLException {
       try{
           conexao.abrir();
           
           String sql = "UDPATE produto SET descricao=?, preco=? WHERE cod=?";
           
           pstm = con.prepareStatement(sql);
           pstm.setString(1, p.getDescricao());
           pstm.setDouble(2, p.getPreco());
           pstm.setInt(3, p.getCod());
           
           pstm.executeUpdate();
           
       }catch(Exception ex){
           ex.printStackTrace();
       }finally{
           conexao.liberar();
       }
    }

    @Override
    public Produto pesquisar(String descricao) throws SQLException {
        try{
            conexao.abrir();
            
            String sql = "SELECT * FROM produto WHERE descricao ILIKE '%"+descricao+"%'";
            
            pstm = con.prepareStatement(sql);
            
            ResultSet rs = pstm.executeQuery();
            
            Produto p = new Produto();
            
            while(rs.next()){
                p.setCod(rs.getInt("cod"));
                p.setDescricao(rs.getString("descricao"));
                p.setPreco(rs.getDouble("preco"));
            }
            
            return p;
            
        }catch(Exception ex){
            ex.printStackTrace();
        }finally{
            conexao.liberar();
        }
        
        return null;
    }

    @Override
    public List<Produto> pesquisarProdutos(String descricao) throws SQLException {
        
        try{
            conexao.abrir();
            
            String sql = "SELECT cod, descricao, preco FROM produto";
            
            pstm = con.prepareStatement(sql);
            
            ResultSet rs = pstm.executeQuery();
            
            List<Produto> stock = new ArrayList<Produto>();
            
            while(rs.next()){
                Produto p = new Produto();
                p.setCod(rs.getInt("cod"));
                p.setDescricao(rs.getString("descricao"));
                p.setPreco(rs.getDouble("preco"));
                stock.add(p);
            }
            
            return stock.isEmpty() ? null:stock;
            
        }catch(Exception ex){
            ex.printStackTrace();
        }finally{
            conexao.liberar();
        }
        return null;
    }
    
}
