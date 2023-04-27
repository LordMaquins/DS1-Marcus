package psv;

import java.sql.*;
import psv.CarroDAO;

import java.util.*;

public class Teste {

    public static void main(String[] args) {

        Connection con = Conexao.abrirConexao();
        CarroBean cb = new CarroBean();
        CarroDAO cd = new CarroDAO(con);
        //Testando método inserir 
        cb.setPlaca("JKL2897");
        cb.setCor("Verde");
        cb.setDescricao("Carro 3");
        System.out.println(cd.inserir(cb));

        //Testando excluir 
        cb.setPlaca("JKL2897");
        System.out.println(cd.excluir(cb));

        List<CarroBean> lista = cd.listarTodos();

        if (lista != null) {
            for (CarroBean carro : lista) {
                System.out.println("Placa: " + carro.getPlaca());
                System.out.println("Cor: " + carro.getCor());
                System.out.println("Descrição: " + carro.getDescricao());

            }
        }
        Conexao.FecharConexao(con);
    }
}
