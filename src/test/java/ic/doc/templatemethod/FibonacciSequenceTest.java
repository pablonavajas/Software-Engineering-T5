package ic.doc.templatemethod;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.Test;

public class FibonacciSequenceTest extends NumberSequenceTest {

  final static FibonacciSequence sequence = new FibonacciSequence();

  public FibonacciSequenceTest() {
    super(sequence, new int[]{1, 1, 2, 3, 5});
  }

  @Test
  public void fibonacciIsUndefinedForNegativeIndices() {

    isUndefinedForNegativeIndices();
  }

  @Test
  public void fibonacciDefinesFirstTwoTermsToBeOne() {

    definesFirstTwoTermsToBeOne();
  }

  public void definesSubsequentTermsToBeTheSumOfThePreviousTwo() {

    assertThat(sequence.term(2), is(2));
    assertThat(sequence.term(3), is(3));
    assertThat(sequence.term(4), is(5));
  }

  @Test
  @Override
  public void subsequentTermsRule() {
    definesSubsequentTermsToBeTheSumOfThePreviousTwo();
  }

  @Test
  public void fibonacciCanBeIteratedThrough() {
    canBeIteratedThrough();
  }
}