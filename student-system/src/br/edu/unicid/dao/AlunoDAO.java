package br.edu.unicid.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import br.edu.unicid.model.Aluno;
import br.edu.unicid.util.ConnectionFactory;

public class AlunoDAO {
	private Connection conn;
	private PreparedStatement ps;
	private ResultSet rs; 
	private Aluno aluno;

	public AlunoDAO() throws Exception {
		// chama a classe ConnectionFactory e estabele uma conexão
		try {
			this.conn = ConnectionFactory.getConnection();
		} catch (Exception e) {
			throw new Exception("erro: \n" + e.getMessage());
		}
	}

	// método de salvar

	public void salvar(Aluno aluno) throws Exception {
		if (aluno == null)
			throw new Exception("O valor passado nao pode ser nulo");
		try {
			String SQL = "INSERT INTO "
					+ "aluno (Rgm, "
					+ "Nome, Email, "
					+ "Data,"
					+ "Idade, Endereco, PortNot, PortFal, MatNot, MatFal, IngNot, IngFal, EspCurso, EspPeri) "
					+ "values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
			ps = conn.prepareStatement(SQL);
			ps.setInt(1, aluno.getRgm());
			ps.setString(2, aluno.getNome());
			ps.setString(3, aluno.getEmail());
			ps.setString(4, aluno.getData());
			ps.setInt(5, aluno.getIdade());
			ps.setString(6, aluno.getEndereco());
			ps.setInt(7, aluno.getPortNot());
			ps.setInt(8, aluno.getPortFal());
			ps.setInt(9, aluno.getMatNot());
			ps.setInt(10, aluno.getMatFal());
			ps.setInt(11, aluno.getIngNot());
			ps.setInt(12, aluno.getIngFal());
			ps.setString(13, aluno.getEspCurso());
			ps.setString(14, aluno.getEspPeri());
			
			ps.executeUpdate(); 
		} catch (SQLException sqle) {
			throw new Exception("Erro ao inserir dados " + sqle);
		} finally {
			ConnectionFactory.closeConnection(conn, ps);
		}
	}

	// método de atualizar

	public void atualizar(Aluno aluno) throws Exception {
		if (aluno == null)
			throw new Exception("O valor passado nao pode ser nulo");
		try {
			String SQL = "UPDATE aluno set Nome=?, "
					+ "Email=?, Data=?, "
					+ "Idade=?, Endereco=? , PortNot=?, PortFal=?, MatNot=?, MatFal=?, IngNot=?, IngFal=?, EspCurso=?, EspPeri=?"
					+ "WHERE Rgm = ?";
			ps = conn.prepareStatement(SQL);
			ps.setString(1, aluno.getNome());
			ps.setString(2, aluno.getEmail());
			ps.setString(3, aluno.getData());
			ps.setInt(4, aluno.getIdade());
			ps.setString(5, aluno.getEndereco());
			ps.setInt(6, aluno.getRgm());
			ps.setInt(7, aluno.getPortNot());
			ps.setInt(8, aluno.getPortFal());
			ps.setInt(9, aluno.getMatNot());
			ps.setInt(10, aluno.getMatFal());
			ps.setInt(11, aluno.getIngNot());
			ps.setInt(12, aluno.getIngFal());
			ps.setString(13, aluno.getEspCurso());
			ps.setString(14, aluno.getEspPeri());
			ps.executeUpdate();
			
		} catch (SQLException sqle) {
			throw new Exception("Erro ao alterar dados " + sqle);
		} finally {
			ConnectionFactory.closeConnection(conn, ps);
		}
	}

	// método de excluir

	public void excluir(Aluno aluno) throws Exception {
		if (aluno == null)
			throw new Exception("O valor passado nao pode ser nulo");
		try {
			String SQL = "DELETE FROM aluno"
					+ " WHERE Rgm = ?";
			conn = this.conn;
			ps = conn.prepareStatement(SQL);
			ps.setInt(1, aluno.getRgm());
			ps.executeUpdate();
		} catch (SQLException sqle) {
			throw new Exception("Erro ao excluir dados " + sqle);
		} finally {
			ConnectionFactory.closeConnection(conn, ps);
		}
	}

	// Procurar Aluno

	public Aluno procurarAluno(int rgm) throws Exception {

		try {
			String SQL = "SELECT  * FROM aluno WHERE Rgm=?";
			conn = this.conn;
			ps = conn.prepareStatement(SQL);
			ps.setInt(1, rgm);			
			rs = ps.executeQuery();
			if (rs.next()) {
				int ca = rs.getInt(1);
				String nome = rs.getString(2);
				String email = rs.getString(3);
				String Data = rs.getString(4);
				int idade = rs.getInt(5);
				String endereco = rs.getString(6);
				int PortNot = rs.getInt(7);
				int PortFal = rs.getInt(8);
				int MatNot = rs.getInt(9);
				int MatFal = rs.getInt(10);
				int IngNot = rs.getInt(11);
				int IngFal = rs.getInt(12);
				String EspCurso = rs.getString(13);
				String EspPeri = rs.getString(14);
				
				
			
				aluno = new Aluno(ca, nome, email, Data, idade, endereco, PortNot, PortFal, MatNot, MatFal, IngNot, IngFal, EspCurso, EspPeri);
			}
			return aluno;
		} catch (SQLException sqle) {
			throw new Exception(sqle);
		} finally {
			ConnectionFactory.closeConnection(conn, ps, rs);
		}
	}
// Listar todos os alunos

	public List todosAlunos() throws Exception {
		try {
			conn = this.conn;
			ps = conn.prepareStatement("SELECT * FROM aluno");
			rs = ps.executeQuery();
			List<Aluno> list = new ArrayList<Aluno>();
			while (rs.next()) {
				int ca = rs.getInt(1);
				String nome = rs.getString(2);
				String email = rs.getString(3);
				String Data = rs.getString(4);
				int idade = rs.getInt(5);
				String endereco = rs.getString(6);
				int PortNot = rs.getInt(7);
				int PortFal = rs.getInt(8);
				int MatNot = rs.getInt(9);
				int MatFal = rs.getInt(10);
				int IngNot = rs.getInt(11);
				int IngFal = rs.getInt(12);
				String EspCurso = rs.getString(13);
				String EspPeri = rs.getString(14);
				
				list.add(new Aluno(ca, nome, email, Data, idade, endereco, PortNot, PortFal, MatNot, MatFal, IngNot, IngFal, EspCurso, EspPeri));
			}
			return list;
		} catch (SQLException sqle) {
			throw new Exception(sqle);
		} finally {
			ConnectionFactory.closeConnection(conn, ps, rs);
		}
	}
}

