package ic.doc.templatemethod;

import static ic.doc.matchers.IterableBeginsWith.beginsWith;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.fail;

public abstract class NumberSequenceTest {

  private NumberSequence sequence;
  private int[] model;

  public NumberSequenceTest(NumberSequence sequence, int[] model) {
    this.sequence = sequence;
    this.model = model;
  }

  public void isUndefinedForNegativeIndices() {

    try {
      sequence.term(-1);
      fail("should have thrown exception");
    } catch (IllegalArgumentException e) {
      assertThat(e.getMessage(), containsString("Not defined for indices < 0"));
    }
  }

  public void definesFirstTermToBeOne() {

    assertThat(sequence.term(0), is(1));
  }

  public void definesFirstTwoTermsToBeOne() {

    definesFirstTermToBeOne();
    assertThat(sequence.term(1), is(1));
  }

  public abstract void subsequentTermsRule();

  public void canBeIteratedThrough() {

    assertThat(sequence, beginsWith(model[0], model[1], model[2], model[3], model[4]));
  }
}
