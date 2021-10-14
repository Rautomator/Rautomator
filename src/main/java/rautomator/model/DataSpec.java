package rautomator.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "data")
public class DataSpec {

	private @Id @GeneratedValue Long id;

	@Column(name = "by2")
	private String by;
	@Column(name = "having2")
	private String having;
	@OneToMany(mappedBy = "dataSpec")
	private Set<Of> of;

	public DataSpec() {
	}

	public DataSpec(String by, String having) {

		this.by = by;
		this.having = having;
	}

	public Long getId() {
		return this.id;
	}

	public String getBy() {
		return this.by;
	}

	public String getHaving() {
		return this.having;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setBy(String by) {
		this.by = by;
	}

	public void setHaving(String having) {
		this.having = having;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((by == null) ? 0 : by.hashCode());
		result = prime * result + ((having == null) ? 0 : having.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());

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
		DataSpec other = (DataSpec) obj;
		if (by == null) {
			if (other.by != null)
				return false;
		} else if (!by.equals(other.by))
			return false;
		if (having == null) {
			if (other.having != null)
				return false;
		} else if (!having.equals(other.having))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;

		return true;
	}

	@Override
	public String toString() {
		return "DataSpec [id=" + id + ", by=" + by + ", having=" + having + "]";
	}

	// relaciones

	public Set<Of> getOf() {
		return of;
	}

	public void setOf(Set<Of> of) {
		this.of = of;
	}

	public void addOf(Of of2) {
		if (this.of == null) {
			this.of = new HashSet<>();
			this.of.add(of2);
			setOf(of);
		} else {
			this.of.add(of2);
		}
	}

}
