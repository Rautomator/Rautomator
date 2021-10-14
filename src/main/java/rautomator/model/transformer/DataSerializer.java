package rautomator.model.transformer;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import rautomator.model.DataSpec;

public class DataSerializer extends JsonSerializer<DataSpec> {

	@Override
	public void serialize(DataSpec value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
		gen.writeString(value.getId().toString());
	}

}
