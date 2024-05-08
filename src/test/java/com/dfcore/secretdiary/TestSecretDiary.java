package com.dfcore.secretdiary;

import jdk.jfr.Description;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestSecretDiary {

    @Nested
    public class constructorTests {
        @Test
        @Description("Tests the secret diary returns an empty array")
        public void testsTheDiaryreturnsAnEmptyArray() {
            // Arrange
            // Act
            SecretDiary diary = new SecretDiary();
            // Assert
            assertEquals(diary.readDiary().size(), 0);


        }

        @Test
        @Description("Tests add diary entry returns arrsy of length 1")
        public void testTheDiaryReturnsAnArrayLength1(){
            // Arrange
            SecretDiary diary = new SecretDiary();
            // Act
            diary.writeDiary("Entry 1");
            // Assert
            assertEquals(diary.readDiary().size(), 1);

        }

        @Test
        @Description("Test that the string returned matches what was added")
        public void testPassingAnEmptyStringIntoWriteDiaryIsntAccepted(){
            // Arrange
            SecretDiary diary = new SecretDiary();
            // Act
            diary.writeDiary("cat");
            // Assert
            assertEquals(diary.readDiary().get(0), "cat");
        }


    }


}
