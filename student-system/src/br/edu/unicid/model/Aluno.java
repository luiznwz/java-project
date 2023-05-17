package br.edu.unicid.model;

public class Aluno {
	private int rgm;
	private String nome;
	private String email;
	private int idade ;
	private String endereco;
	private String Data;
	private int PortNot;
	private int PortFal;
	private int MatNot;
	private int MatFal;
	private int IngNot;
	private int IngFal;
	private String EspCurso;
	private String EspPeri;
	
	

	// construtor vazio
	public Aluno() {
		// TODO Auto-generated constructor stub
	}
	// construtor com campos
	public Aluno (int rgm, String nome, String email, String Data, int idade, String endereco, int PortNot, int PortFal, int MatNot, int MatFal, int IngNot, int IngFal, String EspCurso, String EspPeri){
		this.rgm = rgm;
		this.nome = nome;
		this.email = email;
		this.Data = Data;
		this.idade = idade;
		this.endereco = endereco;
		this.PortFal = PortFal;	
		this.PortNot = PortNot;
		this.MatNot = MatNot;
		this.MatFal = MatFal;
		this.IngNot = IngNot;
		this.IngFal = IngFal;
		this.EspCurso = EspCurso;
		this.EspPeri = EspPeri;
		
		
		
	}
	// getters e setters
	public int getRgm() {
		return rgm;
	}
	public void setRgm(int rgm) {
		this.rgm = rgm;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getData() {
		return Data;
	}
	public void setData(String Data) {
		this.Data = Data;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public int getPortNot() {
		return PortNot;
	}
	public void setPortNot(int PortNot) {
		this.PortNot = PortNot;
	}
	public int getMatNot() {
		return MatNot;
	}
	public void setMatNot(int MatNot) {
		this.MatNot = MatNot;
	}
	public int getIngNot() {
		return IngNot;
	}
	public void setIngNot(int IngNot) {
		this.IngNot = IngNot;
	}
	public int getPortFal() {
		return PortFal;
	}
	public void setPortFal(int PortFal) {
		this.PortFal = PortFal;
	}
	public int getMatFal() {
		return MatFal;
	}
	public void setMatFal(int MatFal) {
		this.MatFal = MatFal;
	}
	public int getIngFal() {
		return IngFal;
	}
	public void setIngFal(int IngFal) {
		this.IngFal = IngFal;}
	
	public String getEspCurso() {
		return EspCurso;
	}
	public void setEspCurso(String EspCurso) {
		this.EspCurso = EspCurso;
	}
	public String getEspPeri() {
		return EspPeri;
	}
	public void setEspPeri(String EspPeri) {
		this.EspPeri = EspPeri;
	}

		
	}
	

		
	
	
