package rautomator.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import rautomator.model.transformer.DataSerializer;

@Entity
@Table(name = "of2")
public class Of {

	private @Id @GeneratedValue String id;

	private String variable;

	@ManyToOne()
	@JoinColumn(name = "data_id")
	@JsonSerialize(using = DataSerializer.class)
	private DataSpec dataSpec;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getVariable() {
		return variable;
	}

	public void setVariable(String variable) {
		this.variable = variable;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((variable == null) ? 0 : variable.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Of other = (Of) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (variable == null) {
			if (other.variable != null)
				return false;
		} else if (!variable.equals(other.variable))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Of [id=" + id + ", variable=" + variable + "]";
	}

	// relaciones

	public DataSpec getDataSpec() {
		return dataSpec;
	}

	public void setDataSpec(DataSpec dataSpec) {
		this.dataSpec = dataSpec;
	}

}
