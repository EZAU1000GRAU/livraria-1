/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.livraria.model.produto;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author jackson.motta
 */
public class MockProdutos {
    
    private static int idProduto = 1;
    
    private static List<Produtos> listaProduto = new ArrayList<Produtos>();
    
    public static void inserirProduto (Produtos produto) 
            throws Exception {
        
        produto.setId(idProduto++);
        
        listaProduto.add(produto);

    }
    public static List<Produtos> ShowAllProduts () throws Exception{
        return listaProduto;      
        
    } 
    
    
}
