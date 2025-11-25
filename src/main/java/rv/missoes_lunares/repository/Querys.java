package rv.missoes_lunares.repository;

import org.dizitart.no2.Nitrite;
import org.dizitart.no2.NitriteCollection;
import static org.dizitart.no2.filters.Filters.eq;
import org.dizitart.no2.Document;

import java.util.UUID;
import java.util.Map;

public abstract class Querys extends Recorder {
	
	private String collection;
	private String _id;
	
	public boolean create(Map<String, Object> dados) {
		try {
			// Abre o banco de dados e seleciona a collection
			Nitrite db = Connection.openDatabase();
			NitriteCollection collection_function = db.getCollection(this.collection);
			
			// Cria o UUID
			String id = UUID.randomUUID().toString();
	        dados.put("_id", id);
	        
	        
	        // Campo temporario, por que a função createDocument exige
	        Document doc = Document.createDocument("_tmp", null);
	        doc.remove("_tmp");
	   
	        // Insere os dados dinâmicamente
	        dados.forEach(doc::put);
	        collection_function.insert(doc);
			
	        // Fecha o banco de dados
			Connection.closeDatabase();
			
			this._id = id;
			return true;
		} catch (Exception e){
			return false;
		}
	}
	
	public boolean updateById(Map<String, Object> dados) {
		try {
			// Abre o banco de dados e seleciona a collection
			Nitrite db = Connection.openDatabase();
			NitriteCollection collection_function = db.getCollection(this.collection);
			
			// Busca pelo registro
			Document doc = collection_function.find(eq("_id", this._id)).firstOrDefault();
			
			// Caso não encontre
			if (doc == null) {
                Connection.closeDatabase();
                return false;
            }
			
			// Insere os dados dinâmicamente
	        dados.forEach(doc::put);
			
	        // Salva
            collection_function.update(eq("_id", this._id), doc);
            
			// Fecha o banco de dados
			Connection.closeDatabase();
		
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public Document findById(String id) {
	    try {
	    	// Abre o banco de dados e seleciona a collection
	        Nitrite db = Connection.openDatabase();
	        NitriteCollection col = db.getCollection(this.collection);

	        // Busca pelo registro
	        Document doc = col.find(eq("_id", id)).firstOrDefault();

        	// Fecha o banco de dados
	        Connection.closeDatabase();

	        return doc;

	    } catch (Exception e) {
	        return null;
	    }
	}
	
}
