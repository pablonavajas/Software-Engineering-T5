package ic.doc.templatemethod;

import static ic.doc.matchers.IterableBeginsWith.beginsWith;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.fail;

public abstract class NumberSequenceTest {

  private NumberSequence sequence;
  private int[] Model;

  public NumberSequenceTest(NumberSequence sequence, int[] Model) {
    this.sequence = sequence;
    this.Model = Model;
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

    assertThat(sequence, beginsWith(Model[0], Model[1], Model[2], Model[3], Model[4]));
  }
}
