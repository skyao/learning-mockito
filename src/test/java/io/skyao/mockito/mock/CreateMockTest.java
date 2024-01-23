package io.skyao.mockito.mock;

import static org.mockito.Mockito.*;
import java.util.List;
import org.junit.Test;

public class CreateMockTest {
  
  @Test
  public void testCreateMockByStaticMethod() {
    List mockedList = mock(List.class);
    mockedList.add("one");
    mockedList.clear();
    verify(mockedList).add("one");
    verify(mockedList).clear();
  }
}
