/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.ads.bdnc.ecommerce.nosql.dao;

import br.edu.ifpb.ads.bdnc.ecommerce.nosql.conexao.ClasseConexao;
import br.edu.ifpb.ads.bdnc.ecommerce.nosql.conexao.ConnectionFactory;
import br.edu.ifpb.ads.bdnc.ecommerce.nosql.entities.Cliente;
import br.edu.ifpb.ads.bdnc.ecommerce.nosql.interfaces.ClienteDaoIF;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.naming.spi.DirStateFactory;
import javax.swing.JOptionPane;

/**
 *
 * @author jederson
 */
public class ClienteDao implements ClienteDaoIF{
    ConnectionFactory factory = new ConnectionFactory();
    ClasseConexao conexao = new ClasseConexao();
    Connection con;
    PreparedStatement pstm;
    
    public ClienteDao(){
        try{
            con = factory.getConnection();
        }catch(SQLException ex){
            ex.printStackTrace();
        }
    }

    @Override
    public void inserir(Cliente c) throws SQLException {
        try{
            conexao.abrir();
            
            String sql = "INSERT INTO cliente(CPF, nome, apelido, senha,email,telefone, dataNascimento,sexo,rua,numero,bairro,cidade,estado,CEP) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?)";
            
            pstm = con.prepareStatement(sql);            
            pstm.setString(1, c.getCPF());
            pstm.setString(2, c.getNome());
            pstm.setString(3, c.getApelido());
            pstm.setString(4, c.getSenha());
            pstm.setString(5, c.getEmail());
            pstm.setString(6, c.getTelefone());
            pstm.setDate(7, (Date) c.getDataNascimento());
            pstm.setString(8, c.getSexo());
            pstm.setInt(9, c.getNumero());
            pstm.setString(10, c.getBairro());
            pstm.setString(11, c.getCidade());
            pstm.setString(12, c.getEstado());
            pstm.setString(13, c.getCEP());            
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso");
        }catch(Exception ex){
            ex.printStackTrace();
        }finally{
            conexao.liberar();
        }
    }

    @Override
    public void remover(Cliente c) throws SQLException {
        try{
            conexao.abrir();
            
            String sql = "DELETE FROM cliente WHERE email = ?";
            
            pstm = con.prepareStatement(sql);
            pstm.setString(1, c.getEmail());
            pstm.executeQuery();
            JOptionPane.showMessageDialog(null, "Cliente removido com sucesso");
        }catch(Exception ex){
            ex.printStackTrace();
        }finally{
            conexao.liberar();
        }
    }

    @Override
    public void atualizar(Cliente c) throws SQLException {
        try{
            conexao.abrir();
            
            String sql = "UPDATE cliente SET CPF = ?, nome = ?, apelido = ?, senha = ?, telefone = ?, dataNascimento = ?, sexo = ?, rua = ?, numero = ?, bairro = ?, cidade = ?,estado = ?,CEP = ? WHERE email = ?";
            pstm = con.prepareStatement(sql);
            pstm.setString(1, c.getCPF());
            pstm.setString(2, c.getNome());
            pstm.setString(3, c.getApelido());
            pstm.setString(4, c.getSenha());            
            pstm.setString(5, c.getTelefone());
            pstm.setDate(6, (Date) c.getDataNascimento());
            pstm.setString(7, c.getSexo());
            pstm.setInt(8, c.getNumero());
            pstm.setString(9, c.getBairro());
            pstm.setString(10, c.getCidade());
            pstm.setString(11, c.getEstado());
            pstm.setString(12, c.getCEP()); 
            pstm.setString(13, c.getEmail());
            pstm.execute();
        }catch(Exception ex){
            ex.printStackTrace();
        }finally{
            conexao.liberar();
        }
    }

    @Override
    public Cliente pesquisarPorCPF(String cpf) throws SQLException {
        try{
            conexao.abrir();
            
            String sql = "SELECT * FROM cliente WHERE CPF = ?";
            
            pstm = con.prepareStatement(sql);
            pstm.setString(1, cpf);
            
            Cliente c = new Cliente();
            
            ResultSet rs = pstm.executeQuery();
            
            while(rs.next()){
                c.setCPF(rs.getString("CPF"));
                c.setNome(rs.getString("nome"));
                c.setApelido(rs.getString("apelido"));
                c.setSenha(rs.getString("senha"));
                c.setEmail(rs.getString("email"));
                c.setTelefone(rs.getString("telefone"));
                c.setDataNascimento(rs.getDate("dataNascimento"));
                c.setSexo(rs.getString("sexo"));
                c.setNumero(rs.getInt("numero"));
                c.setRua(rs.getString("rua"));
                c.setBairro(rs.getString("bairro"));
                c.setCidade(rs.getString("cidade"));
                c.setEstado(rs.getString("estado"));
                c.setCEP(rs.getString("CEP"));
            }            
            
            return c;
            
        }catch(Exception ex){
            ex.printStackTrace();
        }finally{
            conexao.liberar();
        }
        
        return null;
        
    }
    
    @Override
    public Cliente pesquisarPorEmail(String email) throws SQLException{
         try{
            conexao.abrir();
            
            String sql = "SELECT * FROM cliente WHERE email = ?";
            
            pstm = con.prepareStatement(sql);
            pstm.setString(1, email);
            
            Cliente c = new Cliente();
            
            ResultSet rs = pstm.executeQuery();
            
            while(rs.next()){
                c.setCPF(rs.getString("CPF"));
                c.setNome(rs.getString("nome"));
                c.setApelido(rs.getString("apelido"));
                c.setSenha(rs.getString("senha"));
                c.setEmail(rs.getString("email"));
                c.setTelefone(rs.getString("telefone"));
                c.setDataNascimento(rs.getDate("dataNascimento"));
                c.setSexo(rs.getString("sexo"));
                c.setNumero(rs.getInt("numero"));
                c.setRua(rs.getString("rua"));
                c.setBairro(rs.getString("bairro"));
                c.setCidade(rs.getString("cidade"));
                c.setEstado(rs.getString("estado"));
                c.setCEP(rs.getString("CEP"));
            }            
            
            return c;
            
         }catch(Exception ex){
             ex.printStackTrace();
         } finally{
             conexao.liberar();
         }    
         
        return null;
    }

    @Override
    public List<Cliente> pesquisarClintes(String nome) throws SQLException {
        
        try{
            conexao.abrir();
            
            String sql = "SELECT * FROM cliente";
            
            pstm = con.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();
            List<Cliente> clientes = new ArrayList<Cliente>();
            
            while(rs.next()){
                Cliente c = new Cliente();
                c.setCPF(rs.getString("CPF"));
                c.setNome(rs.getString("nome"));
                c.setApelido(rs.getString("apelido"));
                c.setSenha(rs.getString("senha"));
                c.setEmail(rs.getString("email"));
                c.setTelefone(rs.getString("telefone"));
                c.setDataNascimento(rs.getDate("dataNascimento"));
                c.setSexo(rs.getString("sexo"));
                c.setNumero(rs.getInt("numero"));
                c.setRua(rs.getString("rua"));
                c.setBairro(rs.getString("bairro"));
                c.setCidade(rs.getString("cidade"));
                c.setEstado(rs.getString("estado"));
                c.setCEP(rs.getString("CEP"));
                clientes.add(c);
            }
            
            return clientes.isEmpty() ? null : clientes;
            
        } catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
    }
    
}
