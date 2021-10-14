package rautomator;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import rautomator.model.AnalysisSpec;
import rautomator.model.DataSpec;
import rautomator.model.Spec;

public class JSONToJavaObjectTest {

	public static void main(String args[]) throws JsonGenerationException, JsonMappingException, IOException {
		AnalysisSpec as = new AnalysisSpec();
		as.setId(13L);
		as.setType("Tipo de prueba");
		as.setName("Nombre de la prueba");
		as.setDetails("Detalles de la prueba");
		DataSpec ds = new DataSpec();
		ds.setId(2L);
		ds.setBy("Where");
		ds.setHaving("Filtro");
		Spec spec = new Spec();
		spec.setId(13L);
		spec.setAnalysis(as);
		spec.setData(ds);

		ObjectMapper mapper = new ObjectMapper();
		String jsonStr = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(spec);
		System.out.println(jsonStr + "\n");
		System.out.println("Deserialización de JSON a objeto Java:");
		Spec spec2 = mapper.readValue(jsonStr, Spec.class);
		System.out.println("Id del objeto Spec: " + spec2.getId() + "\n Analysis Spec - Tipo: "
				+ spec2.getAnalysis().getType() + ", Nombre: " + spec2.getAnalysis().getName() + ", Detalles: "
				+ spec2.getAnalysis().getDetails() + ", By: " + spec2.getData().getBy() + ", Having: "
				+ spec2.getData().getHaving());
	}

}
