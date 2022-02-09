package rautomator.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "spec")
public class Spec {

	private @Id @GeneratedValue Long id;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "analysis_id", referencedColumnName = "id")
	private AnalysisSpec analysis;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "data_id", referencedColumnName = "id")
	private DataSpec data;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "url_id", referencedColumnName = "id")
	private DataSourceSpec url;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public AnalysisSpec getAnalysis() {
		return this.analysis;
	}

	public void setAnalysis(AnalysisSpec analysis) {
		this.analysis = analysis;
	}

	public DataSpec getData() {
		return this.data;
	}

	public void setData(DataSpec data) {
		this.data = data;
	}
	
	public DataSourceSpec getDataSourceSpec() {
		return this.url;
	}

	public void setDataSourceSpec(DataSourceSpec url) {
		this.url = url;
	}


}
