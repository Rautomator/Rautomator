package rautomator.st;

import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.STGroup;
import org.stringtemplate.v4.STGroupFile;

public class RulesFilePython {
	protected static STGroup group;

	public static void main(String[] args) {
		System.out.println("PRUEBA PYTHON");
		System.out.println("=======================");
		/* ============================================= */
		String stringTemplateFile = "templates/RulesFilePython.stg";
		System.out.println("Primera regla");
		group = new STGroupFile(stringTemplateFile);
		ST st = group.getInstanceOf("HWPython");
		st.add("name", "world");
		String result = st.render();
		System.out.println(result);
		/* ============================================= */
		System.out.println("Segunda regla");
		ST st2 = group.getInstanceOf("HW2Python");
		st2.add("name", "mundo");
		String result2 = st2.render();
		System.out.println(result2);

	}
}
