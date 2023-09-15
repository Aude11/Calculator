class Addition implements Calculation{
    // create a method
    public int calculate(int[] numbers) {
      int sum = numbers[0];
      for (int i = 1; i < numbers.length; i++) {
          sum += numbers[i];
      }
        return sum;
  }
}
