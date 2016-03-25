package br.edu.ifpb.ads.bdnc.ecommerce.nosql.fabricas;



import br.edu.ifpb.ads.bdnc.ecommerce.nosql.dao.ClienteDao;
import br.edu.ifpb.ads.bdnc.ecommerce.nosql.dao.ProdutoDao;
import br.edu.ifpb.ads.bdnc.ecommerce.nosql.interfaces.ClienteDaoIF;
import br.edu.ifpb.ads.bdnc.ecommerce.nosql.interfaces.ProdutoDaoIF;


public class DaoFactoryBD implements DaoFactoryIF{
    
    private DaoFactoryBD instance;
    
    public ClienteDaoIF criaClienteDao() {
        return new ClienteDao();
    }

    public ProdutoDaoIF criaProdutoDao(){
        return new ProdutoDao();
    }
    

}
