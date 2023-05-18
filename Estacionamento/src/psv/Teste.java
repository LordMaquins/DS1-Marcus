package psv;

import java.sql.*;
import java.util.*;

public class Teste {

    public static void main(String[] args) {

        Connection con = Conexao.abrirConexao();
        CarroBean cb = new CarroBean();
        CarroDAO cd = new CarroDAO(con);
        //Testando método inserir 
        cb.setPlaca("JKL2897");
        cb.setCor("Verde");
        cb.setChassi("PO2910JUTRD1032");
        cb.setMarca("");
         cb.setModelo("McLaren Senna");
          cb.setCalota("Espelhada");
           cb.setNomeMotorista("Wilson");
            cb.setDescricao("Carro 3");
             cb.setNumeroVaga("210");
              cb.setHorario("19:45");
               cb.setEstofado("Couro");
        cb.setTipo("Grande");
        
        System.out.println(cd.inserir(cb));

        //Testando excluir 
        
        

        List<CarroBean> lista = cd.listarTodos();

        if (lista != null) {
            for (CarroBean carro : lista) {
                System.out.println("Placa: " + carro.getPlaca());
                System.out.println("Cor: " + carro.getCor());
                System.out.println("Chassi: " + carro.getChassi());
                System.out.println("Marca: " + carro.getMarca());
                System.out.println("Modelo: " + carro.getModelo());
                System.out.println("Calota: " + carro.getCalota());
                System.out.println("NomeMotorista: " + carro.getNomeMotorista());
                System.out.println("Descrição: " + carro.getDescricao());
                System.out.println("NumeroVaga: " + carro.getNumeroVaga());
                System.out.println("Horario: " + carro.getHorario());
                System.out.println("Estofado: " + carro.getEstofado());
                System.out.println("Tipo: " + carro.getTipo());

            }
        }
        Conexao.FecharConexao(con);
    }
}
