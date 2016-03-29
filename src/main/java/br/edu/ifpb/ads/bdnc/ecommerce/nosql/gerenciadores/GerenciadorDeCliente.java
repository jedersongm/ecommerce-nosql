/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.ads.bdnc.ecommerce.nosql.gerenciadores;

import br.edu.ifpb.ads.bdnc.ecommerce.nosql.entities.Cliente;
import br.edu.ifpb.ads.bdnc.ecommerce.nosql.fabricas.DaoFactory;
import br.edu.ifpb.ads.bdnc.ecommerce.nosql.fabricas.DaoFactoryIF;
import br.edu.ifpb.ads.bdnc.ecommerce.nosql.interfaces.ClienteDaoIF;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Jederson
 */
public class GerenciadorDeCliente {
    public void adicionarCliente(String CPF, String nome,String apelido, String senha, String email, String telefone, Date dataNascimento, String sexo, String rua, int numero, String bairro, String cidade, String estado, String CEP) throws SQLException{
        Cliente newCliente = new Cliente(CPF, nome, apelido, senha, email, telefone, dataNascimento, sexo, rua, numero, bairro, cidade, estado, CEP);
       
        DaoFactoryIF fabrica = DaoFactory.creatFactory();
        ClienteDaoIF clientDao = fabrica.criaClienteDao();
        clientDao.inserir(newCliente);
              
    }

    public void removerCliente(String email) throws SQLException{
        DaoFactoryIF fabrica = DaoFactory.creatFactory();
        ClienteDaoIF clientDao = fabrica.criaClienteDao();
        clientDao.remover(email);
    }

    public void atualizarCliente(Cliente c) throws SQLException{
        DaoFactoryIF fabrica = DaoFactory.creatFactory();
        ClienteDaoIF clientDao = fabrica.criaClienteDao();
        clientDao.atualizar(c);
    }

    public Cliente pesquisarPorCPF(String cpf) throws SQLException{
        DaoFactoryIF fabrica = DaoFactory.creatFactory();
        ClienteDaoIF clientDao = fabrica.criaClienteDao();
        return clientDao.pesquisarPorCPF(cpf);
    }
    
    public Cliente pesquisarPorEmail(String email) throws SQLException{
        DaoFactoryIF fabrica = DaoFactory.creatFactory();
        ClienteDaoIF clientDao = fabrica.criaClienteDao();
        return clientDao.pesquisarPorEmail(email);
    }

    public List<Cliente> listarClientes() throws SQLException{
        DaoFactoryIF fabrica = DaoFactory.creatFactory();
        ClienteDaoIF clientDao = fabrica.criaClienteDao();
        return clientDao.listar();
    }
    public boolean verificarExistenciaEmail(String email) throws SQLException {
        DaoFactoryIF fabrica = DaoFactory.creatFactory();
        ClienteDaoIF clientDao = fabrica.criaClienteDao();
        return clientDao.verificarExistenciaEmail(email);
    }
}
