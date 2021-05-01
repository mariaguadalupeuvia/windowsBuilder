package proyecto21;

import java.util.Scanner;

public class Arrays 
{

	public void eliminar(int[] vec, int posiones, int posicion )
	{
		int i ;
		for (i = posicion; i < posiones -1; i++)
		{
			vec[i] = vec[i+1];
		}
	}
	
	public int insertarOrdenado(int[] vec, int posiciones, int valor)
	{
		int i =0;
		
		while((i < posiciones) && (vec[i] <= valor))
		{
			i++;
		}
		
		vec[i+1] = valor;
		return 0;
	}
	


	public int buscar(int[] vec, int posiciones, int valor)
	{
		int i = 0;
		
		while(i < posiciones && vec[i] != valor)
		{
			i++;
		}
		
		if (i == posiciones)
		{
			return -1;
		}
		else
		{
			return i;
		}
	}
	
	public void mostrarArray(int[] vec, int posiciones)
	{
		for(int i = 0; i < posiciones; i++)
		{
			System.out.print(" " + vec[i] + " " );
		}
	}
	
	public void colecciones()
	{

		Scanner sc = new Scanner(System.in);
		
		int[] numeros = {10, 5 , 3, 19 , 0, 7 , 5};
		
		int max;
		
		numeros[0] = 7;
		numeros[3] = 4;
		
		for (int i = 0; i <= 6; i ++)
		{
			numeros[i] = sc.nextInt();
			
			System.out.println(numeros[i]);
		}
		
		
		System.out.println(numeros[3]);
		
		max = numeros[6];
		
		for (int i = 0; i <= 5; i ++)
		{
			if(max < numeros[i])
			{
				max = numeros[i];
			}
			
		}
		
		numeros[6] = 10;
		
	}
	
	public void ordenar(int[] vec)//algoritmo de burbuja o burbujeo
	{
		boolean ordenado = false;
		int i = 0;
		int j = 5;
		int aux;
		
		while(!ordenado)
		{
			ordenado = true;
			for(i = 0; i <= j; i++)
			{
				// {1, 5 , 3, 19 , 0, 7 , 5};
				if(vec[i] < vec[i+1]) 
				{
					aux = vec[i];
					// {1, 5 , 3, 19 , 0, 7 , 5};
					vec[i] = vec[i+1];
					// {5, 5 , 3, 19 , 0, 7 , 5};
					vec[i+1] = aux;
					//{5, 1 , 3, 19 , 0, 7 , 5};
					ordenado = false;
				}
			}
		}
	}
}
