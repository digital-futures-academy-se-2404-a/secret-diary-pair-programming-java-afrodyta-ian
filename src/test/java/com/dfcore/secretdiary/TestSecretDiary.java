package com.dfcore.secretdiary;

import jdk.jfr.Description;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestSecretDiary {

    @Nested
    public class constructorTests{
        @Test
        @Description("Tests the secret diary returns an empty array")
        public void testsTheDiaryreturnsAnEmptyArray(){
            // Arrange
            // Act
            SecretDiary diary = new SecretDiary();
            // Assert
            assertEquals(diary.ReadDiary().Length(), 0);


        }
    }
}
