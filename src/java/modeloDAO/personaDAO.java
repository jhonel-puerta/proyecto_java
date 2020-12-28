
package modeloDAO;

import Interfaces.Interface;
import Modelo.Persona;
import config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class personaDAO implements Interface{
    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Persona p = new Persona();
    
    

    @Override
    public List listar() {
        ArrayList<Persona>list=new ArrayList<>();
        String  sql="SELECT * FROM alumno";
        try{
            con = cn.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                Persona p = new Persona();
                p.setId(rs.getInt("ID"));
                p.setNombre(rs.getString("Nombres"));
                p.setApellidos(rs.getString("Apellidos"));
                p.setNota1(rs.getFloat("Nota1"));
                p.setNota2(rs.getFloat("Nota2"));
                p.setPromedio(rs.getFloat("Promedio"));
                list.add(p);
                
            }
            
        } catch (Exception e) {
        }
        return list;
    }

    @Override
    public Persona list(int id) {
        String  sql="SELECT * FROM alumno WHERE ID="+id;
        try{
            con = cn.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                p.setId(rs.getInt("ID"));
                p.setNombre(rs.getString("Nombres"));
                p.setApellidos(rs.getString("Apellidos"));
                p.setNota1(rs.getFloat("Nota1"));
                p.setNota2(rs.getFloat("Nota2"));
                p.setPromedio(rs.getFloat("Promedio"));
                
            }
            
        } catch (Exception e) {
            
        }
        return p;
    }

    @Override
    public boolean add(Persona per) {
        float promedio = (per.getNota1() + per.getNota2() / 2);
        String sql ="INSERT INTO alumno(Nombres, Apellidos, Nota1, Nota2,Promedio) values('"+per.getNombre()+"','"+per.getApellidos()+"','"+per.getNota1()+"','"+per.getNota2()+"','"+per.getPromedio()+"')";
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return false;
        
    }

    @Override
    public boolean edit(Persona per) {
        String sql = "UPDATE alumno SET Nombres='"+per.getNombre()+"',Apellidos='"+per.getApellidos()+"',Nota1='"+per.getNota1()+"',Nota2='"+per.getNota2()+"',Promedio='"+per.getPromedio()+"' WHERE ID="+per.getId();
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return false;
    }   

    @Override
    public boolean eliminar(int id) {
        String sql = "DELETE FROM alumno WHERE ID="+id;
        try {
            con=cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return false;
    }
    
}
