package psv;

import java.sql.*;
import java.util.*;

public class CarroDAO {

    private Connection con;

    public CarroDAO(Connection con) {
        setCon(con);
    }

    public Connection getCon() {
        return con;
    }

    public void setCon(Connection con) {
        this.con = con;
    }

    public String inserir(CarroBean carro) {
        String sql = "insert into carro (placa,cor, chassi, marca, modelo, calota, nomeMotorista,  descricao, numeroVaga, horario, estofado, tipo)values (?,?,?,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setString(1, carro.getPlaca());
            ps.setString(2, carro.getCor());
            ps.setString(3, carro.getChassi());
            ps.setString(4, carro.getMarca());
            ps.setString(5, carro.getModelo());
            ps.setString(6, carro.getCalota());
            ps.setString(7, carro.getNomeMotorista());
            ps.setString(8, carro.getDescricao());
            ps.setString(9, carro.getNumeroVaga());
            ps.setString(10, carro.getHorario());
            ps.setString(11, carro.getEstofado());
            ps.setString(12, carro.getTipo());
            

            if (ps.executeUpdate() > 0) {
                return "Inserido com sucesso.";
            } else {
                return "Erro ao Inserir";
            }

        } catch (SQLException e) {
            return e.getMessage();
        }

    }

    public String alterar(CarroBean carro) {
        String sql = "update carro set cor =?,chassi=?,marca=?,modelo=?,calota=?,nomeMotorista=?, descricao=?, numeroVaga=?, horario=?,estofado=?,tipo";
        sql += "where placa  =?";
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
           ps.setString(1, carro.getPlaca());
            ps.setString(2, carro.getCor());
            ps.setString(3, carro.getChassi());
            ps.setString(4, carro.getMarca());
            ps.setString(5, carro.getModelo());
            ps.setString(6, carro.getCalota());
            ps.setString(7, carro.getNomeMotorista());
            ps.setString(8, carro.getDescricao());
            ps.setString(9, carro.getNumeroVaga());
            ps.setString(10, carro.getHorario());
            ps.setString(11, carro.getEstofado());
            ps.setString(12, carro.getTipo());

            if (ps.executeUpdate() > 0) {
                return " Alterado com sucesso.";
            } else {
                return "Erro ao alterar";
            }
        } catch (SQLException e) {
            return e.getMessage();
        }
    }

    public String excluir(CarroBean carro) {
        String sql = "delete from carro where placa  =?";
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);

            ps.setString(1, carro.getPlaca());
            if (ps.executeUpdate() > 0) {
                return "Excluído com sucesso.";
            } else {
                return "Erro ao excluir";
            }
        } catch (SQLException e) {
            return e.getMessage();
        }
    }

    public List<CarroBean> listarTodos() {
        String sql = "select *from carro";
        List<CarroBean> listaCarro = new ArrayList<CarroBean>();
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            if (rs != null) {
                while (rs.next()) {
                    CarroBean cb = new CarroBean();
                    cb.setPlaca(rs.getString(1));
                    cb.setCor(rs.getString(2));
                    cb.setChassi(rs.getString(3));
                    cb.setMarca(rs.getString(4));
                    cb.setModelo(rs.getString(5));
                    cb.setCalota(rs.getString(6));
                    cb.setNomeMotorista(rs.getString(7));
                    cb.setDescricao(rs.getString(8));
                    cb.setNumeroVaga(rs.getString(9));
                    cb.setHorario(rs.getString(10));
                    cb.setEstofado(rs.getString(11));
                    cb.setTipo(rs.getString(12));
                    listaCarro.add(cb);
                }
                return listaCarro;
            } else {
                return null;
            }

        } catch (SQLException e) {
            return null;
        }
    }

}
