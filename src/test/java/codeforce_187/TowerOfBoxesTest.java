package codeforce_187;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.MockedStatic;
import org.mockito.Mockito;


import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.*;

class TowerOfBoxesTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void main() {

    }

    @Test
    public void givenArgumentAsConsoleInput_WhenReadFromSubstitutedByteArrayInputStream_ThenSuccessfullyCalculate() throws IOException {
        String[] arguments = new String[]{"-i", "CONSOLE"};
        try (MockedStatic mockedStatic = Mockito.mockStatic(TowerOfBoxes.class, Mockito.CALLS_REAL_METHODS);
             InputStream fips = new ByteArrayInputStream("1 2 3".getBytes())) {

            InputStream original = System.in;

            System.setIn(fips);

            ArgumentCaptor stringArgumentCaptor = ArgumentCaptor.forClass(String.class);

            TowerOfBoxes.main(arguments);

            //mockedStatic.verify(() -> TowerOfBoxes.main(stringArgumentCaptor.capture()));

            System.setIn(original);
        }
    }
}