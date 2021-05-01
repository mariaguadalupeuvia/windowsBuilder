package proyecto21;

import java.io.*;

public class ManejadorArchivos 
{
	public void leerArchivo(String nombre)
	{
		BufferedReader br;
		try 
		{
			br = new BufferedReader(new FileReader(nombre));
			String linea = br.readLine();
			
			while(linea != null)
			{
				System.out.println(linea);
				linea = br.readLine();
			}
			
			br.close();
		} 
		catch(Exception ex)
		{
			
		}


		
	}
	public void escribirArchivo(String textoEscribir)
	{
		File f; //este representa el archivo
		FileWriter escritor; //este se usara para escribir en el archivo
		PrintWriter linea; //este tiene el texto a esbribir
		
		f = new File("archivoDePrueba.txt");
		
		try
		{
			if(!f.exists())
			{
				f.createNewFile();
			}
			escritor = new FileWriter(f, true);
			linea = new PrintWriter(escritor);
			
			linea.println(textoEscribir);
			
			linea.close();
			escritor.close();
			
		}
		
		catch(Exception ex)
		{
			
		}
	}
}
