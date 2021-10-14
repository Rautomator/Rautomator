package rautomator.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "analysis")
public class AnalysisSpec {

	private @Id @GeneratedValue Long id;
	@Column(name = "types", nullable = false)
	private String type;
	@Column(name = "name", nullable = false)
	private String name;
	@Column(name = "details")
	private String details;

	public AnalysisSpec() {
	}

	public AnalysisSpec(String type, String name, String details) {

		this.type = type;
		this.name = name;
		this.details = details;
	}

	public Long getId() {
		return this.id;
	}

	public String getType() {
		return this.type;
	}

	public String getName() {
		return this.name;
	}

	public String getDetails() {
		return this.details;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((details == null) ? 0 : details.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
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
		AnalysisSpec other = (AnalysisSpec) obj;
		if (details == null) {
			if (other.details != null)
				return false;
		} else if (!details.equals(other.details))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "AnalysisSpec [id=" + id + ", type=" + type + ", name=" + name + ", details=" + details + "]";
	}

}
