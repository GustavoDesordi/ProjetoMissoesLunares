package rv.missoes_lunares.repository;

import org.dizitart.no2.Nitrite;

public class Connection {
	
	private static String nome_db = "meu_malvado_favorito.db";
	private static String usuario = "gru";
	private static String senha = "minions_vamos_dominar_a_lua";
	private static Nitrite db;
	
	private Connection() {}
	
	public static Nitrite openDatabase() {
		if (db == null || db.isClosed()) {
	
			db = Nitrite.builder().filePath(nome_db).openOrCreate(usuario, senha);
	
		}
		
		return db;
	}
	
	public static void closeDatabase() {
		if (db != null && !db.isClosed()) {
			
			db.close();
			
		}
	}
}
