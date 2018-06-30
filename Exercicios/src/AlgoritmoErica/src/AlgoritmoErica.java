package AlgoritmoErica.src;
import java.util.Random;

public class AlgoritmoErica {
    public static void main(String[] args) {
        
        int n=1000; 		// declara o tamanho do vetor
        double numX,numY;	// declara as variaveis para fazer a conta na formula
        
        Random gerador  = new Random();
        double [] vetor  = new double[n];//Vetor para armazenar os valores para U1 da formula 
        double [] vetor2 = new double[n];//Vetor para armazenar os valores para U2 da formula
        double [] x = new double[n];//Vetor para armazenar X no resultado da formula de Gauss
        double [] y = new double[n];//Vetor para armazenar Y no resultado da formula de Gauss
              
        
        for ( int i = 0; i < n; i++) // enquanto i nao chegar ao maximo de numeros ele continuara executando
        {	
        	do {		// Utilizado para fazer o teste no final para saber se o X é maior que 1
        	numX=-1;	// Para cada loop deve-se ter esta afirmação para entrar no laço while
        	x[i] = 2;	// Para cada loop deve-se ter esta afirmação para entrar no laço while
        	
        	while(numX < 0) // Enquanto a conta der valor negativo manterá no laço
        	{
        		
        		vetor [i] = gerador.nextDouble();	//Gera número aleatório de 0 a 1 para U1
            	vetor2[i] = gerador.nextDouble();	//Gera número aleatório de 0 a 1 para U2
            	numX = -2*(Math.log10(vetor[i])*Math.cos(2*Math.PI*vetor2[i]));// parte da fórmula para saber se numX será negativo
                    	        	
        	}
        	
        	x [i] = Math.sqrt(numX);// A fórmula próriamente dita,se numX for negativo não é executado por isso todo este laço
        	
        	}while(x[i] > 1.0);// Para manter o número de X menor que 1, se for maior executa os comandos novamente
        	
        	
        	do {	// Utilizado para fazer o teste no final para saber se o Y é maior que 1
        	numY=-1;// Para cada loop deve-se ter esta afirmação para entrar no laço while
        	y[i]=2;	// Para cada loop deve-se ter esta afirmação para entrar no laço while
        	
        	while(numY < 0)	// Enquanto a conta der valor negativo manterá no laço
        	{
        		vetor [i] = gerador.nextDouble();	//Gera número aleatório de 0 a 1 para U1
            	vetor2[i] = gerador.nextDouble();	//Gera número aleatório de 0 a 1 para U2
            	numY = -2*(Math.log10(vetor[i])*Math.sin(2*Math.PI*vetor2[i]));// parte da fórmula para saber se numX será negativo
        	 
        	}
        	
        	y [i] = Math.sqrt(numY);// A fórmula próriamente dita, se numY for negativo não é executado por isso todo este laço
        	
        	}while(y[i] > 1.0);// Para manter o número de Y menor que 1, se for maior executa os comandos novamente
        	
        
        }
        
        for ( int i = 0; i < n; i++) 
        {
        	System.out.println(x[i]);  	//Printa todos os números da fórmula para X  	
        }
        
        System.out.println();// pula a linha
        System.out.println();// pula a linha
        
        for ( int i = 0; i < n; i++)
        {
        	System.out.println(y[i]);	//Printa todos os números da fórmula para Y
        	
        }
        
    }   
}
