package rv.missoes_lunares.repository;

import java.io.*;

public abstract class Recorder extends Reader {
	
	public boolean saveObject(Object obj, String id, String local) {
		try {
			
			// Valida se o path solicitado existe
			boolean control = false;
			String path[] = {"Atronauta", "MissaoHasAtronauta", "MissaoHasNave", "Missao", "Nave"};
			for (int i = 0; i < path.length; i++) {
				if (local == path[i]) {
					control = true;
					break;
				}
			}
			
			if (control == false) { 
				return false;
			}
			
			// Garante que o diretório existe
	        File dir = new File(local + "Repository");
	        if (!dir.exists()) {
	            dir.mkdirs(); // cria todas as pastas, se necessário
	        }

	        // Monta o caminho completo
	        File arquivo = new File(dir, id);

	        // Salva o objeto
	        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(arquivo))) {
	            out.writeObject(obj);
	        }

	        return true;
		} catch (Exception e) {
			return false;
		}
	}
}
