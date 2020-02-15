package ic.doc.strategy;

import java.util.Iterator;

public class NumberSequence implements Iterable<Integer> {

  private SequenceFormatter sequence;

  public NumberSequence(SequenceFormatter sequence) {

    this.sequence = sequence;
  }

  public int term(int i) {

    return sequence.term(i);
  }

  public Iterator<Integer> iterator() {

    return new SequenceIterator();
  }

  private class SequenceIterator implements Iterator<Integer> {

    private int index = 0;

    @Override
    public boolean hasNext() {

      return true;
    }

    @Override
    public Integer next() {

      return sequence.term(index++);
    }

    @Override
    public void remove() {

      throw new UnsupportedOperationException("remove is not implemented");
    }
  }
}
