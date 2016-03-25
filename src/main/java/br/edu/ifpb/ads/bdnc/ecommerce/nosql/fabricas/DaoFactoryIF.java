package br.edu.ifpb.ads.bdnc.ecommerce.nosql.fabricas;

import br.edu.ifpb.ads.bdnc.ecommerce.nosql.interfaces.ClienteDaoIF;
import br.edu.ifpb.ads.bdnc.ecommerce.nosql.interfaces.ProdutoDaoIF;



public interface DaoFactoryIF {
    
    public ProdutoDaoIF criaProdutoDao();
    
    public ClienteDaoIF criaClienteDao();
    
    }
