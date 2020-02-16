package ic.doc.templatemethod;

public class TriangleNumbersSequence extends NumberSequence {

  @Override
  public int sequenceProcedure(int i) {

    return (i + 1) * (i + 2) / 2;
  }

}

