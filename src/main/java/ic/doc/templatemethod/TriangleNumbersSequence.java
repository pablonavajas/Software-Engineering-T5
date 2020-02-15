package ic.doc.templatemethod;

public class TriangleNumbersSequence extends NumberSequence {

  @Override
  public int SequenceProcedure(int i) {

    return (i + 1) * (i + 2) / 2;
  }

}

