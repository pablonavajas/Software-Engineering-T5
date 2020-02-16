package ic.doc.templatemethod;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.Test;

public class TriangleNumbersSequenceTest extends NumberSequenceTest {

  private static final TriangleNumbersSequence sequence = new TriangleNumbersSequence();

  public TriangleNumbersSequenceTest() {
    super(sequence, new int[]{1, 3, 6, 10, 15});
  }

  @Test
  public void triangleNumbersIsUndefinedForNegativeIndices() {

    isUndefinedForNegativeIndices();
  }

  @Test
  public void triangleNumbersDefinesFirstTermToBeOne() {

    definesFirstTermToBeOne();
  }

  public void definesSubsequentTermsToBeHalfTheProductOfTheNextTwo() {

    assertThat(sequence.term(1), is(3));
    assertThat(sequence.term(2), is(6));
    assertThat(sequence.term(3), is(10));
    assertThat(sequence.term(4), is(15));
  }

  @Test
  @Override
  public void subsequentTermsRule() {
    definesSubsequentTermsToBeHalfTheProductOfTheNextTwo();
  }

  @Test
  public void triangleNumbersCanBeIteratedThrough() {
    canBeIteratedThrough();
  }
}
