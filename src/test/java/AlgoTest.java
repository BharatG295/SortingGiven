package test.java;

import static org.junit.Assert.*;

import org.junit.Test;

import main.java.Item;
import main.java.SortAlgos;

public class AlgoTest {

	
	
	
	@Test
	public void test1() {
		Item[] A = new Item[10];
		A[0] = new Item(5);
		A[1] = new Item(9);
		A[2] = new Item(7);
		A[3] = new Item(4);
		A[4] = new Item(2);
		A[5] = new Item(1);
		A[6] = new Item(0);
		A[7] = new Item(8);
		A[8] = new Item(6);
		A[9] = new Item(3);
		SortAlgos.bubbleSort(A);
		assertTrue(A[0].key == (new Item(0)).key);
		assertTrue(A[1].key == (new Item(1)).key);
		assertTrue(A[2].key == (new Item(2)).key);
		assertTrue(A[3].key == (new Item(3)).key);
		assertTrue(A[4].key == (new Item(4)).key);
		assertTrue(A[5].key == (new Item(5)).key);
		assertTrue(A[6].key == (new Item(6)).key);
		assertTrue(A[7].key == (new Item(7)).key);
		assertTrue(A[8].key == (new Item(8)).key);
		assertTrue(A[9].key == (new Item(9)).key);
	}
	
	//Test 2 does edge coverage & condition coverage
	@Test(expected = NullPointerException.class)
	public void test2() {
		Item[] A = null;
		SortAlgos.bubbleSort(A);
	}
	
	//Test 3 does edge coverage & condition coverage
	@Test(expected = ArrayIndexOutOfBoundsException.class)
	public void test3() {
		Item[] A = new Item[0];
		SortAlgos.bubbleSort(A);
		assertFalse(A[0].key == (new Item(0)).key);
	}
	
	@Test
	public void test4() {
		Item[] A = new Item[1];
		A[0] = new Item(2);
		SortAlgos.bubbleSort(A);
		assertTrue(A[0].key == (new Item(2)).key);
	}
	
	//Test 5 does the edge coverage
	@Test
	public void test5() {
		Item[] A = new Item[10];
		A[0] = new Item(0);
		A[1] = new Item(1);
		A[2] = new Item(2);
		A[3] = new Item(3);
		A[4] = new Item(4);
		A[5] = new Item(5);
		A[6] = new Item(6);
		A[7] = new Item(7);
		A[8] = new Item(8);
		A[9] = new Item(9);
		SortAlgos.bubbleSort(A);
		assertTrue(A[0].key == (new Item(0)).key);
		assertTrue(A[1].key == (new Item(1)).key);
		assertTrue(A[2].key == (new Item(2)).key);
		assertTrue(A[3].key == (new Item(3)).key);
		assertTrue(A[4].key == (new Item(4)).key);
		assertTrue(A[5].key == (new Item(5)).key);
		assertTrue(A[6].key == (new Item(6)).key);
		assertTrue(A[7].key == (new Item(7)).key);
		assertTrue(A[8].key == (new Item(8)).key);
		assertTrue(A[9].key == (new Item(9)).key);
	}
	
	//Test 6 does node, edge & condition coverage
	@Test
	public void test6() {
		Item[] A = new Item[10];
		A[0] = new Item(9);
		A[1] = new Item(8);
		A[2] = new Item(7);
		A[3] = new Item(6);
		A[4] = new Item(5);
		A[5] = new Item(4);
		A[6] = new Item(3);
		A[7] = new Item(2);
		A[8] = new Item(1);
		A[9] = new Item(0);
		SortAlgos.bubbleSort(A);
		assertTrue(A[0].key == (new Item(0)).key);
		assertTrue(A[1].key == (new Item(1)).key);
		assertTrue(A[2].key == (new Item(2)).key);
		assertTrue(A[3].key == (new Item(3)).key);
		assertTrue(A[4].key == (new Item(4)).key);
		assertTrue(A[5].key == (new Item(5)).key);
		assertTrue(A[6].key == (new Item(6)).key);
		assertTrue(A[7].key == (new Item(7)).key);
		assertTrue(A[8].key == (new Item(8)).key);
		assertTrue(A[9].key == (new Item(9)).key);
	}
	
	
	//More Tests to improve Code coverage of SortAlgos.java
	
	//Selection Sort
	@Test
	public void test7() {
		Item[] A = new Item[10];
		A[0] = new Item(5);
		A[1] = new Item(9);
		A[2] = new Item(7);
		A[3] = new Item(4);
		A[4] = new Item(2);
		A[5] = new Item(1);
		A[6] = new Item(0);
		A[7] = new Item(8);
		A[8] = new Item(6);
		A[9] = new Item(3);
		SortAlgos.selectionSort(A);
		assertTrue(A[0].key == (new Item(0)).key);
		assertTrue(A[1].key == (new Item(1)).key);
		assertTrue(A[2].key == (new Item(2)).key);
		assertTrue(A[3].key == (new Item(3)).key);
		assertTrue(A[4].key == (new Item(4)).key);
		assertTrue(A[5].key == (new Item(5)).key);
		assertTrue(A[6].key == (new Item(6)).key);
		assertTrue(A[7].key == (new Item(7)).key);
		assertTrue(A[8].key == (new Item(8)).key);
		assertTrue(A[9].key == (new Item(9)).key);
	}
	
	@Test(expected = NullPointerException.class)
	public void test8() {
		Item[] A = null;
		SortAlgos.selectionSort(A);
	}
	
	@Test(expected = ArrayIndexOutOfBoundsException.class)
	public void test9() {
		Item[] A = new Item[0];
		SortAlgos.selectionSort(A);
		assertFalse(A[0].key == (new Item(0)).key);
	}
	
	@Test
	public void test10() {
		Item[] A = new Item[1];
		A[0] = new Item(2);
		SortAlgos.selectionSort(A);
		assertTrue(A[0].key == (new Item(2)).key);
	}
	
	@Test
	public void test11() {
		Item[] A = new Item[10];
		A[0] = new Item(0);
		A[1] = new Item(1);
		A[2] = new Item(2);
		A[3] = new Item(3);
		A[4] = new Item(4);
		A[5] = new Item(5);
		A[6] = new Item(6);
		A[7] = new Item(7);
		A[8] = new Item(8);
		A[9] = new Item(9);
		SortAlgos.selectionSort(A);
		assertTrue(A[0].key == (new Item(0)).key);
		assertTrue(A[1].key == (new Item(1)).key);
		assertTrue(A[2].key == (new Item(2)).key);
		assertTrue(A[3].key == (new Item(3)).key);
		assertTrue(A[4].key == (new Item(4)).key);
		assertTrue(A[5].key == (new Item(5)).key);
		assertTrue(A[6].key == (new Item(6)).key);
		assertTrue(A[7].key == (new Item(7)).key);
		assertTrue(A[8].key == (new Item(8)).key);
		assertTrue(A[9].key == (new Item(9)).key);
	}
	
	@Test
	public void test12() {
		Item[] A = new Item[10];
		A[0] = new Item(9);
		A[1] = new Item(8);
		A[2] = new Item(7);
		A[3] = new Item(6);
		A[4] = new Item(5);
		A[5] = new Item(4);
		A[6] = new Item(3);
		A[7] = new Item(2);
		A[8] = new Item(1);
		A[9] = new Item(0);
		SortAlgos.selectionSort(A);
		assertTrue(A[0].key == (new Item(0)).key);
		assertTrue(A[1].key == (new Item(1)).key);
		assertTrue(A[2].key == (new Item(2)).key);
		assertTrue(A[3].key == (new Item(3)).key);
		assertTrue(A[4].key == (new Item(4)).key);
		assertTrue(A[5].key == (new Item(5)).key);
		assertTrue(A[6].key == (new Item(6)).key);
		assertTrue(A[7].key == (new Item(7)).key);
		assertTrue(A[8].key == (new Item(8)).key);
		assertTrue(A[9].key == (new Item(9)).key);
	}
	
	
	//Insertion Sort
		@Test
		public void test13() {
			Item[] A = new Item[10];
			A[0] = new Item(5);
			A[1] = new Item(9);
			A[2] = new Item(7);
			A[3] = new Item(4);
			A[4] = new Item(2);
			A[5] = new Item(1);
			A[6] = new Item(0);
			A[7] = new Item(8);
			A[8] = new Item(6);
			A[9] = new Item(3);
			SortAlgos.insertionSort(A);
			assertTrue(A[0].key == (new Item(0)).key);
			assertTrue(A[1].key == (new Item(1)).key);
			assertTrue(A[2].key == (new Item(2)).key);
			assertTrue(A[3].key == (new Item(3)).key);
			assertTrue(A[4].key == (new Item(4)).key);
			assertTrue(A[5].key == (new Item(5)).key);
			assertTrue(A[6].key == (new Item(6)).key);
			assertTrue(A[7].key == (new Item(7)).key);
			assertTrue(A[8].key == (new Item(8)).key);
			assertTrue(A[9].key == (new Item(9)).key);
		}
		
		@Test(expected = NullPointerException.class)
		public void test14() {
			Item[] A = null;
			SortAlgos.insertionSort(A);
		}
		
		@Test(expected = ArrayIndexOutOfBoundsException.class)
		public void test15() {
			Item[] A = new Item[0];
			SortAlgos.insertionSort(A);
			assertFalse(A[0].key == (new Item(0)).key);
		}
		
		@Test
		public void test16() {
			Item[] A = new Item[1];
			A[0] = new Item(2);
			SortAlgos.insertionSort(A);
			assertTrue(A[0].key == (new Item(2)).key);
		}
		
		@Test
		public void test17() {
			Item[] A = new Item[10];
			A[0] = new Item(0);
			A[1] = new Item(1);
			A[2] = new Item(2);
			A[3] = new Item(3);
			A[4] = new Item(4);
			A[5] = new Item(5);
			A[6] = new Item(6);
			A[7] = new Item(7);
			A[8] = new Item(8);
			A[9] = new Item(9);
			SortAlgos.insertionSort(A);
			assertTrue(A[0].key == (new Item(0)).key);
			assertTrue(A[1].key == (new Item(1)).key);
			assertTrue(A[2].key == (new Item(2)).key);
			assertTrue(A[3].key == (new Item(3)).key);
			assertTrue(A[4].key == (new Item(4)).key);
			assertTrue(A[5].key == (new Item(5)).key);
			assertTrue(A[6].key == (new Item(6)).key);
			assertTrue(A[7].key == (new Item(7)).key);
			assertTrue(A[8].key == (new Item(8)).key);
			assertTrue(A[9].key == (new Item(9)).key);
		}
		
		@Test
		public void test18() {
			Item[] A = new Item[10];
			A[0] = new Item(9);
			A[1] = new Item(8);
			A[2] = new Item(7);
			A[3] = new Item(6);
			A[4] = new Item(5);
			A[5] = new Item(4);
			A[6] = new Item(3);
			A[7] = new Item(2);
			A[8] = new Item(1);
			A[9] = new Item(0);
			SortAlgos.insertionSort(A);
			assertTrue(A[0].key == (new Item(0)).key);
			assertTrue(A[1].key == (new Item(1)).key);
			assertTrue(A[2].key == (new Item(2)).key);
			assertTrue(A[3].key == (new Item(3)).key);
			assertTrue(A[4].key == (new Item(4)).key);
			assertTrue(A[5].key == (new Item(5)).key);
			assertTrue(A[6].key == (new Item(6)).key);
			assertTrue(A[7].key == (new Item(7)).key);
			assertTrue(A[8].key == (new Item(8)).key);
			assertTrue(A[9].key == (new Item(9)).key);
		}
		
		
		//Merge Sort
		@Test
		public void test19() {
			Item[] A = new Item[10];
			A[0] = new Item(5);
			A[1] = new Item(9);
			A[2] = new Item(7);
			A[3] = new Item(4);
			A[4] = new Item(2);
			A[5] = new Item(1);
			A[6] = new Item(0);
			A[7] = new Item(8);
			A[8] = new Item(6);
			A[9] = new Item(3);
			SortAlgos.mergeSort(A);
			assertTrue(A[0].key == (new Item(0)).key);
			assertTrue(A[1].key == (new Item(1)).key);
			assertTrue(A[2].key == (new Item(2)).key);
			assertTrue(A[3].key == (new Item(3)).key);
			assertTrue(A[4].key == (new Item(4)).key);
			assertTrue(A[5].key == (new Item(5)).key);
			assertTrue(A[6].key == (new Item(6)).key);
			assertTrue(A[7].key == (new Item(7)).key);
			assertTrue(A[8].key == (new Item(8)).key);
			assertTrue(A[9].key == (new Item(9)).key);
		}
		
		@Test(expected = NullPointerException.class)
		public void test20() {
			Item[] A = null;
			SortAlgos.mergeSort(A);
		}
		
		@Test(expected = StackOverflowError.class)
		public void test21() {
			Item[] A = new Item[0];
			SortAlgos.mergeSort(A);
			assertFalse(A[0].key == (new Item(0)).key);
		}
		
		@Test
		public void test22() {
			Item[] A = new Item[1];
			A[0] = new Item(2);
			SortAlgos.mergeSort(A);
			assertTrue(A[0].key == (new Item(2)).key);
		}
		
		@Test
		public void test23() {
			Item[] A = new Item[10];
			A[0] = new Item(0);
			A[1] = new Item(1);
			A[2] = new Item(2);
			A[3] = new Item(3);
			A[4] = new Item(4);
			A[5] = new Item(5);
			A[6] = new Item(6);
			A[7] = new Item(7);
			A[8] = new Item(8);
			A[9] = new Item(9);
			SortAlgos.mergeSort(A);
			assertTrue(A[0].key == (new Item(0)).key);
			assertTrue(A[1].key == (new Item(1)).key);
			assertTrue(A[2].key == (new Item(2)).key);
			assertTrue(A[3].key == (new Item(3)).key);
			assertTrue(A[4].key == (new Item(4)).key);
			assertTrue(A[5].key == (new Item(5)).key);
			assertTrue(A[6].key == (new Item(6)).key);
			assertTrue(A[7].key == (new Item(7)).key);
			assertTrue(A[8].key == (new Item(8)).key);
			assertTrue(A[9].key == (new Item(9)).key);
		}
		
		@Test
		public void test24() {
			Item[] A = new Item[10];
			A[0] = new Item(9);
			A[1] = new Item(8);
			A[2] = new Item(7);
			A[3] = new Item(6);
			A[4] = new Item(5);
			A[5] = new Item(4);
			A[6] = new Item(3);
			A[7] = new Item(2);
			A[8] = new Item(1);
			A[9] = new Item(0);
			SortAlgos.mergeSort(A);
			assertTrue(A[0].key == (new Item(0)).key);
			assertTrue(A[1].key == (new Item(1)).key);
			assertTrue(A[2].key == (new Item(2)).key);
			assertTrue(A[3].key == (new Item(3)).key);
			assertTrue(A[4].key == (new Item(4)).key);
			assertTrue(A[5].key == (new Item(5)).key);
			assertTrue(A[6].key == (new Item(6)).key);
			assertTrue(A[7].key == (new Item(7)).key);
			assertTrue(A[8].key == (new Item(8)).key);
			assertTrue(A[9].key == (new Item(9)).key);
		}
	
	
		//Quick Sort
		@Test
		public void test25() {
			Item[] A = new Item[10];
			A[0] = new Item(5);
			A[1] = new Item(9);
			A[2] = new Item(7);
			A[3] = new Item(4);
			A[4] = new Item(2);
			A[5] = new Item(1);
			A[6] = new Item(0);
			A[7] = new Item(8);
			A[8] = new Item(6);
			A[9] = new Item(3);
			SortAlgos.quickSort(A);
			assertTrue(A[0].key == (new Item(0)).key);
			assertTrue(A[1].key == (new Item(1)).key);
			assertTrue(A[2].key == (new Item(2)).key);
			assertTrue(A[3].key == (new Item(3)).key);
			assertTrue(A[4].key == (new Item(4)).key);
			assertTrue(A[5].key == (new Item(5)).key);
			assertTrue(A[6].key == (new Item(6)).key);
			assertTrue(A[7].key == (new Item(7)).key);
			assertTrue(A[8].key == (new Item(8)).key);
			assertTrue(A[9].key == (new Item(9)).key);
		}
		
		@Test(expected = NullPointerException.class)
		public void test26() {
			Item[] A = null;
			SortAlgos.quickSort(A);
		}
		
		@Test(expected = ArrayIndexOutOfBoundsException.class)
		public void test27() {
			Item[] A = new Item[0];
			SortAlgos.quickSort(A);
			assertFalse(A[0].key == (new Item(0)).key);
		}
		
		@Test
		public void test28() {
			Item[] A = new Item[1];
			A[0] = new Item(2);
			SortAlgos.quickSort(A);
			assertTrue(A[0].key == (new Item(2)).key);
		}
		
		@Test
		public void test29() {
			Item[] A = new Item[10];
			A[0] = new Item(0);
			A[1] = new Item(1);
			A[2] = new Item(2);
			A[3] = new Item(3);
			A[4] = new Item(4);
			A[5] = new Item(5);
			A[6] = new Item(6);
			A[7] = new Item(7);
			A[8] = new Item(8);
			A[9] = new Item(9);
			SortAlgos.quickSort(A);
			assertTrue(A[0].key == (new Item(0)).key);
			assertTrue(A[1].key == (new Item(1)).key);
			assertTrue(A[2].key == (new Item(2)).key);
			assertTrue(A[3].key == (new Item(3)).key);
			assertTrue(A[4].key == (new Item(4)).key);
			assertTrue(A[5].key == (new Item(5)).key);
			assertTrue(A[6].key == (new Item(6)).key);
			assertTrue(A[7].key == (new Item(7)).key);
			assertTrue(A[8].key == (new Item(8)).key);
			assertTrue(A[9].key == (new Item(9)).key);
		}
		
		@Test
		public void test30() {
			Item[] A = new Item[10];
			A[0] = new Item(9);
			A[1] = new Item(8);
			A[2] = new Item(7);
			A[3] = new Item(6);
			A[4] = new Item(5);
			A[5] = new Item(4);
			A[6] = new Item(3);
			A[7] = new Item(2);
			A[8] = new Item(1);
			A[9] = new Item(0);
			SortAlgos.quickSort(A);
			assertTrue(A[0].key == (new Item(0)).key);
			assertTrue(A[1].key == (new Item(1)).key);
			assertTrue(A[2].key == (new Item(2)).key);
			assertTrue(A[3].key == (new Item(3)).key);
			assertTrue(A[4].key == (new Item(4)).key);
			assertTrue(A[5].key == (new Item(5)).key);
			assertTrue(A[6].key == (new Item(6)).key);
			assertTrue(A[7].key == (new Item(7)).key);
			assertTrue(A[8].key == (new Item(8)).key);
			assertTrue(A[9].key == (new Item(9)).key);
		}
		
		//Selection Sort
		@Test
		public void test31() {
			Item[] A = new Item[10];
			A[0] = new Item(5);
			A[1] = new Item(9);
			A[2] = new Item(7);
			A[3] = new Item(4);
			A[4] = new Item(2);
			A[5] = new Item(1);
			A[6] = new Item(0);
			A[7] = new Item(8);
			A[8] = new Item(6);
			A[9] = new Item(3);
			SortAlgos.heapSort(A);
			assertTrue(A[0].key == (new Item(0)).key);
			assertTrue(A[1].key == (new Item(1)).key);
			assertTrue(A[2].key == (new Item(2)).key);
			assertTrue(A[3].key == (new Item(3)).key);
			assertTrue(A[4].key == (new Item(4)).key);
			assertTrue(A[5].key == (new Item(5)).key);
			assertTrue(A[6].key == (new Item(6)).key);
			assertTrue(A[7].key == (new Item(7)).key);
			assertTrue(A[8].key == (new Item(8)).key);
			assertTrue(A[9].key == (new Item(9)).key);
		}
		
		@Test(expected = NullPointerException.class)
		public void test32() {
			Item[] A = null;
			SortAlgos.heapSort(A);
		}
		
		@Test(expected = ArrayIndexOutOfBoundsException.class)
		public void test33() {
			Item[] A = new Item[0];
			SortAlgos.heapSort(A);
			assertFalse(A[0].key == (new Item(0)).key);
		}
		
		@Test
		public void test34() {
			Item[] A = new Item[1];
			A[0] = new Item(2);
			SortAlgos.heapSort(A);
			assertTrue(A[0].key == (new Item(2)).key);
		}
		
		@Test
		public void test35() {
			Item[] A = new Item[10];
			A[0] = new Item(0);
			A[1] = new Item(1);
			A[2] = new Item(2);
			A[3] = new Item(3);
			A[4] = new Item(4);
			A[5] = new Item(5);
			A[6] = new Item(6);
			A[7] = new Item(7);
			A[8] = new Item(8);
			A[9] = new Item(9);
			SortAlgos.heapSort(A);
			assertTrue(A[0].key == (new Item(0)).key);
			assertTrue(A[1].key == (new Item(1)).key);
			assertTrue(A[2].key == (new Item(2)).key);
			assertTrue(A[3].key == (new Item(3)).key);
			assertTrue(A[4].key == (new Item(4)).key);
			assertTrue(A[5].key == (new Item(5)).key);
			assertTrue(A[6].key == (new Item(6)).key);
			assertTrue(A[7].key == (new Item(7)).key);
			assertTrue(A[8].key == (new Item(8)).key);
			assertTrue(A[9].key == (new Item(9)).key);
		}
		
		@Test
		public void test36() {
			Item[] A = new Item[10];
			A[0] = new Item(9);
			A[1] = new Item(8);
			A[2] = new Item(7);
			A[3] = new Item(6);
			A[4] = new Item(5);
			A[5] = new Item(4);
			A[6] = new Item(3);
			A[7] = new Item(2);
			A[8] = new Item(1);
			A[9] = new Item(0);
			SortAlgos.heapSort(A);
			assertTrue(A[0].key == (new Item(0)).key);
			assertTrue(A[1].key == (new Item(1)).key);
			assertTrue(A[2].key == (new Item(2)).key);
			assertTrue(A[3].key == (new Item(3)).key);
			assertTrue(A[4].key == (new Item(4)).key);
			assertTrue(A[5].key == (new Item(5)).key);
			assertTrue(A[6].key == (new Item(6)).key);
			assertTrue(A[7].key == (new Item(7)).key);
			assertTrue(A[8].key == (new Item(8)).key);
			assertTrue(A[9].key == (new Item(9)).key);
		}
		
		@Test 
		public void all_same_test() {
			Item[] A = new Item[3];
			A[0] = new Item(5);
			A[1] = new Item(5);
			A[2] = new Item(5);
			SortAlgos.bubbleSort(A);
			assertTrue(A[0].key == (new Item(5)).key);
			assertTrue(A[1].key == (new Item(5)).key);
			assertTrue(A[2].key == (new Item(5)).key);
			SortAlgos.selectionSort(A);
			assertTrue(A[0].key == (new Item(5)).key);
			assertTrue(A[1].key == (new Item(5)).key);
			assertTrue(A[2].key == (new Item(5)).key);
			SortAlgos.insertionSort(A);
			assertTrue(A[0].key == (new Item(5)).key);
			assertTrue(A[1].key == (new Item(5)).key);
			assertTrue(A[2].key == (new Item(5)).key);
			SortAlgos.quickSort(A);
			assertTrue(A[0].key == (new Item(5)).key);
			assertTrue(A[1].key == (new Item(5)).key);
			assertTrue(A[2].key == (new Item(5)).key);
			SortAlgos.mergeSort(A);
			assertTrue(A[0].key == (new Item(5)).key);
			assertTrue(A[1].key == (new Item(5)).key);
			assertTrue(A[2].key == (new Item(5)).key);
			SortAlgos.heapSort(A);
			assertTrue(A[0].key == (new Item(5)).key);
			assertTrue(A[1].key == (new Item(5)).key);
			assertTrue(A[2].key == (new Item(5)).key);
			
			
		}
}
