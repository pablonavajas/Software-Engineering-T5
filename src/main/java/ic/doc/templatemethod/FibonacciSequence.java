package ic.doc.templatemethod;

public class FibonacciSequence extends NumberSequence {

  @Override
  public int sequenceProcedure(int i) {

    if (i < 0) {
      throw new IllegalArgumentException("Not defined for indices < 0");
    }
    if (i < 2) {
      return 1;
    }
    return term(i - 1) + term(i - 2);
  }
}
