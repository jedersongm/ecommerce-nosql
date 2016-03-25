package br.edu.ifpb.ads.bdnc.ecommerce.nosql.fabricas;



public class DaoFactory {
    public static DaoFactoryIF creatFactory(){
        return new DaoFactoryBD();
    }
}
