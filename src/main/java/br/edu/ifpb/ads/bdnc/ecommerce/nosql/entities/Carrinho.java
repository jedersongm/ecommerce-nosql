/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.ads.bdnc.ecommerce.nosql.entities;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jederson
 */
public class Carrinho {
    
    private List<Item> itens;
    private Double total;

    public Carrinho(){
        this.itens = new ArrayList<Item>();
        this.total = 0.0;
    }
    public Carrinho(List<Item> itens, Double total) {
        this.itens = itens;
        this.total = total;
    }

    public List<Item> getItens() {
        return itens;
    }

    public void setItens(List<Item> itens) {
        this.itens = itens;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }
    
    public void adicionaItem(Item item){
        if(itens.add(item)){
            total += item.getProduto().getPreco()*item.getQuantidade();            
        }
    }
    
    public void removeItem(Item item){
        if(itens.remove(item)){
            total -= item.getProduto().getPreco()*item.getQuantidade();
        }
    }
    
}
