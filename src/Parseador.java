import java.io.InputStream;


public class Parseador {

	public static void main(String[] args) throws Exception {
		parser();
		//JSONObject Jojo = new JSONObject("C:\\Documents and Settings\\invitado\\Desktop\\ref.json");
		//return Jojo.toString();
	}

	public static JSONArray parser() {
		InputStream is = Parseador.class.getResourceAsStream("C:\\Documents and Settings\\invitado\\Desktop\\ref.json");
		JSONTokener Toktok = new JSONTokener(is);
		JSONArray arr = new JSONArray(Toktok);
		return arr;
	}

}
