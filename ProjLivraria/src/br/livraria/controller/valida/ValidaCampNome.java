/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.livraria.controller.valida;
/**
 * Função tem como objetivo, validar o campo. 
 * Se consta um nome de uma pessoa. 
 * Usa como parâmetro se o campo consta número
 * Caracter especial, String Null ou apenas com espaço.
 * 
 * @String Recebe uma String como parametro.
 * @return Retorno um boolean
 * @author jackson
 */
public class ValidaCampNome {
    public static boolean validaNome(String nome){
        boolean valida;
        if (nome == null || "".equals(nome.trim())){
            valida = false;
            return valida;
        }
        else{
        if (nome.matches("[A-z a-z]{"+nome.length()+"}"))
            return valida = true;
        else
            return valida = false;
    }
    }
    }
