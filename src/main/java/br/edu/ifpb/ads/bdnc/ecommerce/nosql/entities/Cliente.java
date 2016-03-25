/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.ads.bdnc.ecommerce.nosql.entities;

import java.util.Date;
import java.util.Objects;

/**
 *
 * @author jederson
 */
public class Cliente {
    
    private String CPF;
    private String name;    
    private String email;
    private String telefone;
    private Date dataNascimento;
    private String sexo;
    private String rua;
    private int numero;
    private String bairro;
    private String cidade;
    private String estado;
    private String CEP;
    
    
    public Cliente(){
        
    }

    public Cliente(String CPF, String name, String email, String telefone, Date dataNascimento, String sexo, String rua, int numero, String bairro, String cidade, String estado, String CEP) {
        this.CPF = CPF;
        this.name = name;
        this.email = email;
        this.telefone = telefone;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.CEP = CEP;
    }

    

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 47 * hash + Objects.hashCode(this.CPF);
        hash = 47 * hash + Objects.hashCode(this.name);
        hash = 47 * hash + Objects.hashCode(this.email);
        hash = 47 * hash + Objects.hashCode(this.telefone);
        hash = 47 * hash + Objects.hashCode(this.dataNascimento);
        hash = 47 * hash + Objects.hashCode(this.sexo);
        hash = 47 * hash + Objects.hashCode(this.rua);
        hash = 47 * hash + this.numero;
        hash = 47 * hash + Objects.hashCode(this.bairro);
        hash = 47 * hash + Objects.hashCode(this.cidade);
        hash = 47 * hash + Objects.hashCode(this.estado);
        hash = 47 * hash + Objects.hashCode(this.CEP);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cliente other = (Cliente) obj;
        if (this.numero != other.numero) {
            return false;
        }
        if (!Objects.equals(this.CPF, other.CPF)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        if (!Objects.equals(this.telefone, other.telefone)) {
            return false;
        }
        if (!Objects.equals(this.sexo, other.sexo)) {
            return false;
        }
        if (!Objects.equals(this.rua, other.rua)) {
            return false;
        }
        if (!Objects.equals(this.bairro, other.bairro)) {
            return false;
        }
        if (!Objects.equals(this.cidade, other.cidade)) {
            return false;
        }
        if (!Objects.equals(this.estado, other.estado)) {
            return false;
        }
        if (!Objects.equals(this.CEP, other.CEP)) {
            return false;
        }
        if (!Objects.equals(this.dataNascimento, other.dataNascimento)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Cliente{" + "CPF=" + CPF + ", name=" + name + ", email=" + email + ", telefone=" + telefone + ", dataNascimento=" + dataNascimento + ", sexo=" + sexo + ", rua=" + rua + ", numero=" + numero + ", bairro=" + bairro + ", cidade=" + cidade + ", estado=" + estado + ", CEP=" + CEP + '}';
    }

    
            
    
            

}
