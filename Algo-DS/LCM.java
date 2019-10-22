// Finding LCM using simple alg.

public static int lcm(int number1, int number2) {
 
  if(number1 == 0 || number2 ==0) {
    return 0;
  } 
  
  int absNumber1 = Math.abs(number1);
  int absNumber2 = Math.abs(number2);
  int absHigherNumber = Math.max(absNumber1, absNumber2);
  int absLowerNumber = Math.min(absNumber1, absNumber2);
  int lcm = absHigherNumber;
  
  while(lcm % absLowerNumber != 0) {
    lcm += absHigherNumber;
  }
  
  return lcm;
}

@Test 
public void testLCM(){
  
  Assert.assertEquals(36, lcm(12, 18));
}

// Prime Factorization Approach

public static Map<Integer, Integer> getPrimeFactors(int number) {
    
    int absNumber = Math.abs(number);
 
    Map<Integer, Integer> primeFactorsMap = new HashMap<Integer, Integer>();
 
    for (int factor = 2; factor <= absNumber; factor++) {
        while (absNumber % factor == 0) {
            Integer power = primeFactorsMap.get(factor);
            if (power == null) {
                power = 0;
            }
            primeFactorsMap.put(factor, power + 1);
            absNumber /= factor;
        }
    }
 
    return primeFactorsMap;
}

@Test
public void testGetPrimeFactors() {
    
    Map<Integer, Integer> expectedPrimeFactorsMapForTwelve = new HashMap<>();
    expectedPrimeFactorsMapForTwelve.put(2, 2);
    expectedPrimeFactorsMapForTwelve.put(3, 1);

    Assert.assertEquals(expectedPrimeFactorsMapForTwelve,
      getPrimeFactors(12));

    Map<Integer, Integer> expectedPrimeFactorsMapForEighteen = new HashMap<>();
    expectedPrimeFactorsMapForEighteen.put(2, 1);
    expectedPrimeFactorsMapForEighteen.put(3, 2);

    Assert.assertEquals(expectedPrimeFactorsMapForEighteen,
      getPrimeFactors(18));
}

public static int lcm(int number1, int number2) {
    
    if(number1 == 0 || number2 == 0) {
        return 0;
    }

    Map<Integer, Integer> primeFactorsForNum1 = getPrimeFactors(number1);
    Map<Integer, Integer> primeFactorsForNum2 = getPrimeFactors(number2);

    Set<Integer> primeFactorsUnionSet = new HashSet<>(primeFactorsForNum1.keySet());
    primeFactorsUnionSet.addAll(primeFactorsForNum2.keySet());

    int lcm = 1;

    for (Integer primeFactor : primeFactorsUnionSet) {
        lcm *= Math.pow(primeFactor,
          Math.max(primeFactorsForNum1.getOrDefault(primeFactor, 0),
            primeFactorsForNum2.getOrDefault(primeFactor, 0)));
    }

    return lcm;
}

@Test
public void testLCM() {
  
    Assert.assertEquals(36, lcm(12, 18));
}

// Euclid's Algorithm

public static int gcd(int number1, int number2) {
   
    if (number1 == 0 || number2 == 0) {
        return number1 + number2;
    } else {
        int absNumber1 = Math.abs(number1);
        int absNumber2 = Math.abs(number2);
        int biggerValue = Math.max(absNumber1, absNumber2);
        int smallerValue = Math.min(absNumber1, absNumber2);
     
        return gcd(biggerValue % smallerValue, smallerValue);
    }
}

@Test
public void testGCD() {
    Assert.assertEquals(6, gcd(12, 18));
}

// - For two number - LCM

public static int lcm(int number1, int number2) {
  
    if (number1 == 0 || number2 == 0) {
      return 0;
    } else {
      int gcd = gcd(number1, number2);
    
      return Math.abs(number1 * number2) / gcd;
    }
}

@Test 
public void testLCM() {
    Assert.assertEquals(36, lcm(12, 18));
}

// - For large numbers - LCM

public static BigInteger lcm(BigInteger number1, BigInteger number2) {
  
    BigInteger gcd = number1.gcd(number2);
    BigInteger absProduct = number1.multiply(number2).abs();
    return absProduct.divide(gcd);
}

@Test
public void testLCM() {

    BigInteger number1 = new BigInteger("12");
    BigInteger number2 = new BigInteger("18");
    BigInteger expectedLCM = new BigInteger("36");
    Assert.assertEquals(expectedLCM, BigIntegerLCM.lcm(number1, number2));
}
