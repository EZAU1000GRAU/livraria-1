/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.livraria.model.produto;

import java.util.List;

/**
 *
 * @author jackson.motta
 */
public class CrudProduto {
    public static String inserirProduto (Produtos produto){
        String retorno = null;
        
        if(retorno == null){
            try {
                MockProdutos.inserirProduto(produto);
            } catch (Exception e) {
                
                e.printStackTrace();
                retorno = "Erro na fonte de dados";
            }
        }
        // FIM DO METODO inserirProduto
        return retorno;
    }
    
    public static List<Produtos> listarProduto (String share){
        List<Produtos> listaProdutos = null;
        
        try {
            if (share == null || "".equals(share)){
                listaProdutos = MockProdutos.ShowAllProduts();
            }else{
                        System.err.println("Erro no CrudProduto linha 37");
                        }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listaProdutos;
        
        
    }
}
