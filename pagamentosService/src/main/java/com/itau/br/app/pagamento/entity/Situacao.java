package com.itau.br.app.pagamento.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the TB_XXXX database table.
 * 
 */
@Entity
@Table(name="TB_XXXX", schema="SCHEMA_XXX")
public class Situacao implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="TB_XXXX" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TB_XXXX_GENERATOR")
	@Column(name="CD_SITU_PROP_FORZ_DIGI", unique=true, nullable=false, precision=10)
	private long cdSituacao;

	@Column(name="DS_SITU_PROP_FORZ_DIGI", length=20)
	private String dsSituacao;

	@Column(name="SG_SITU_PROP_FORZ_DIGI", length=1)
	private String sgSituacao;

	public Situacao() {
		//Default Constructor
	}

	public long getCdSituacao() {
		return cdSituacao;
	}

	public void setCdSituacao(long cdSituacao) {
		this.cdSituacao = cdSituacao;
	}

	public String getDsSituacao() {
		return dsSituacao;
	}

	public void setDsSituacao(String dsSituacao) {
		this.dsSituacao = dsSituacao;
	}

	public String getSgSituacao() {
		return sgSituacao;
	}

	public void setSgSituacao(String sgSituacao) {
		this.sgSituacao = sgSituacao;
	}

	

}
