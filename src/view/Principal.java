package view;
import controller.Ordenacao;

public class Principal {
	public static void main(String[] args) {
		int[] vetor = {2,0,1,3,7,8,5,4,9,6};
		
		Ordenacao oMergeSort = new Ordenacao();
		
		vetor = oMergeSort.mergeSort(vetor , 0 , vetor.length - 1);
		
		System.out.println("");
		System.out.println("===============================");
		for (int valor : vetor) {
			System.out.print(valor + " ");
		}
		System.out.println("");
		System.out.println("===============================");

	}
}
