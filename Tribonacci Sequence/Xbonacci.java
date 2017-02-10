public class Xbonacci {

  public double[] tribonacci(double[] s, int n) {
    if(n == 0 )
      return new double[0];
    else if(s.length >= n)
      return Arrays.copyOfRange(s, 0, n);
    else {
      List<Double> arraylist = DoubleStream.of(s).mapToObj(Double::valueOf).collect(Collectors.toCollection(ArrayList::new));
      for(int number = s.length; number < n; number++)
        arraylist.add(number, arraylist.get(number-3) + arraylist.get(number-2) + arraylist.get(number-1));
      return arraylist.stream().mapToDouble(Double::doubleValue).toArray();
    }
  }
}
