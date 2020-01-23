public int countPrice(int item[]){
	int totalprice = 0;
		if (item.length == 0){
	return -1;
	}
	for( int i=0; i < item.length; i++ ) {
		totalprice += item[i];
	}
	return totalprice;
}

public int countItemPrice(int item[]){
	int totalprice =0;
	int num = item.length;
	if (num == 0){
		return -1;
	}
	for( int k=0; k < num; k++ ) {
		totalprice += item[k];
	}
	return totalprice;
}

public int calcPrice(int ...cost) {
	int totalcost= 0;
	int num = cost.length;
	if (num == 0){
		return -1;
	}
	for( int i=0; i<num; i++ ){
		totalcost += cost[i];
	}
	return totalcost;
}
@Test
public void test02()  throws Throwable  {
	int[] item = new int[0];
	CalcPrice sut = new CalcPrice();
	int actual1 = sut.calcPrice(item);
	assertEquals((-1), int0);
	int actual2 = sut.calcPrice();
	assertEquals((-1), int1);
}

@Test
public void test()  throws Throwable  {
	CalcPrice sut = new CalcPrice();
	int[] item1 = new int[0];
	int[] item2 = new int[100];
	int actual1 = sut.calcPrice(item1);
	assertEquals(0, actual1);
	int actual2 = sut.addition02(item2);
	assertEquals(100, actual2);
}

@Test
public void test01()  throws Throwable  {
	ItemStock02 itemStock02_0 = new ItemStock02();
	int[] intArray0 = new int[4];
	intArray0[0] = 1970;
	int int0 = itemStock02_0.addition02(intArray0);
	assertEquals(1970, int0);
	int[] intArray1 = new int[8];
	intArray1[0] = 1870;
	int int1 = itemStock02_0.addition02(intArray1);
	assertEquals(1870, int1);
}