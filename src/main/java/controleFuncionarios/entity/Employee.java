package controleFuncionarios.entity;

import java.math.BigDecimal;
import java.util.Date;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.ManyToAny;
import org.springframework.lang.NonNull;

import controleFuncionarios.entity.auxiliary.Adress;
import controleFuncionarios.validation.ValidateEmployee;

@Entity
@Table(name = "employee")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(nullable = false)
	private String nome;

	@Column(nullable = false, unique = true)
	private String cpf;

	@Column(nullable = false)
	private Date dataNascimento;

	@Column(nullable = false)
	private Date dataContratacao;
	private Date dataDemissao;

	@Column(nullable = false)
	private BigDecimal salarioBase;
	private String telefone;
	private boolean whatsapp;

	@ManyToOne
	private Adress adress;

	public Employee() {
	}

	public Employee(String nome, String cpf, Date dataNascimento, Date dataContratacao, Date dataDemissao,
			BigDecimal salarioBase, String telefone, boolean whatsapp) {
		this.nome = nome;
		setCpf(cpf);
		this.dataNascimento = dataNascimento;
		this.dataContratacao = dataContratacao;
		this.dataDemissao = dataDemissao;
		this.salarioBase = salarioBase;
		this.telefone = telefone;
		this.whatsapp = whatsapp;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {

		return cpf;
	}

	public final void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public Date getDataContratacao() {
		return dataContratacao;
	}

	public void setDataContratacao(Date dataContratacao) {
		this.dataContratacao = dataContratacao;
	}

	public Date getDataDemissao() {
		return dataDemissao;
	}

	public void setDataDemissao(Date dataDemissao) {
		this.dataDemissao = dataDemissao;
	}

	public BigDecimal getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(BigDecimal salarioBase) {
		this.salarioBase = salarioBase;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public boolean isWhatsapp() {
		return whatsapp;
	}

	public void setWhatsapp(boolean whatsapp) {
		this.whatsapp = whatsapp;
	}

}
