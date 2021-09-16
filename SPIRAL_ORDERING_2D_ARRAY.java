package CHAPTER_2;

import java.util.*;

public class SPIRAL_ORDERING_2D_ARRAY {
	public static List<Integer> matrixInSpiralOrder(List<List<Integer>> squareMatrix){
			List<Integer> spiralOrdering = new ArrayList <>();
			for (int offset = 0; offset < Math.ceil(0.5 * squareMatrix.size());++offset) {
			matrixLayerlnClockwise(squareMatrix , offset, spiralOrdering);
			}
			return spiralOrdering ;
			}
			private static void matrixLayerlnClockwise(List<List<Integer>> squareMatrix ,int offset ,List<Integer> spiralOrdering) {
			if (offset == squareMatrix.size() - offset - 1)
			{
			// squareMatrix has odd dimension, and we are at its center.
			spiralOrdering.add(squareMatrix.get(offset).get(offset));
			return ;
			}
			for (int j = offset; j < squareMatrix.size() - offset - 1; ++j)
			{
			spiralOrdering.add(squareMatrix.get(offset).get(j));
			}
			for (int i = offset; i < squareMatrix.size() - offset - 1; ++i)
			{
			spiralOrdering.add(
			squareMatrix.get(i).get(squareMatrix.size() - offset - 1));
			}
			for (int j = squareMatrix.size() - offset - 1; j > offset; --j)
			{
			spiralOrdering.add(
			squareMatrix.get(squareMatrix.size() - offset - 1).get(j));
			}
			for (int i = squareMatrix.size() - offset - 1; i > offset; --i)
			{
			spiralOrdering.add(squareMatrix.get(i).get(offset));
			}
			}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the order of the matrix : ");
		int s=sc.nextInt();
		System.out.println("Enter the elements : ");
		List<List<Integer>> x = new ArrayList<List<Integer>>();
		for(int i=0;i<s;i++) 
		{
			x.add(new ArrayList<Integer>());
			for(int j=0;j<s;j++)
			{
				int n=sc.nextInt();
				x.get(i).add(j,n);
			}
		}
		for(int i=0;i<s;i++) 
		{
		System.out.println(x.get(i));
		}
		System.out.println("The spiral ordering array is : "+matrixInSpiralOrder(x));

	}

}
