package pe.edu.sistemas.sisrepweb.domain;
// Generated 19/12/2017 12:58:19 PM by Hibernate Tools 4.3.1.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Escuela generated by hbm2java
 */
@Entity
@Table(name = "escuela", catalog = "modelogeneralfisi")
public class Escuela implements java.io.Serializable {

	private Integer idescuela;
	private int facultadIdfacultad;
	private String escuelaNombre;
	private Set<Plan> plans = new HashSet<Plan>(0);

	public Escuela() {
	}

	public Escuela(int facultadIdfacultad, String escuelaNombre) {
		this.facultadIdfacultad = facultadIdfacultad;
		this.escuelaNombre = escuelaNombre;
	}

	public Escuela(int facultadIdfacultad, String escuelaNombre, Set<Plan> plans) {
		this.facultadIdfacultad = facultadIdfacultad;
		this.escuelaNombre = escuelaNombre;
		this.plans = plans;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "IDESCUELA", unique = true, nullable = false)
	public Integer getIdescuela() {
		return this.idescuela;
	}

	public void setIdescuela(Integer idescuela) {
		this.idescuela = idescuela;
	}

	@Column(name = "FACULTAD_IDFACULTAD", nullable = false)
	public int getFacultadIdfacultad() {
		return this.facultadIdfacultad;
	}

	public void setFacultadIdfacultad(int facultadIdfacultad) {
		this.facultadIdfacultad = facultadIdfacultad;
	}

	@Column(name = "ESCUELA_NOMBRE", nullable = false, length = 45)
	public String getEscuelaNombre() {
		return this.escuelaNombre;
	}

	public void setEscuelaNombre(String escuelaNombre) {
		this.escuelaNombre = escuelaNombre;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "escuela")
	public Set<Plan> getPlans() {
		return this.plans;
	}

	public void setPlans(Set<Plan> plans) {
		this.plans = plans;
	}

}
