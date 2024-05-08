package com.dfcore.secretdiary;

import jdk.jfr.Description;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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
    @Nested
    public class lockMechanismTests{
        @Test
        @Description("Test to see if the diaries lock status is returned")
        public void testThatTheDefaultLockStatusIsReturned(){
            // Arrange
            SecretDiary diary = new SecretDiary();
            // Act

            // Assert
            assertFalse(diary.lockStatus());
        }
        @Test
        @Description("Test to see when locking it gets changed to locked")
        public void testThatLockingItChangesItToLocked(){
            // Arrange
            SecretDiary diary = new SecretDiary();
            // Act
            diary.lock();
            // Assert
            assertTrue(diary.lockStatus());
        }

        @Test
        @Description("Test to see if unlocking when locked, will make it return unlocked")
        public void testThatUnlockingUnlocksTheDiary(){
            // Arrange
            SecretDiary diary = new SecretDiary();
            diary.lock();
            // Act
            diary.unlock("1234");
            // Assert
            assertFalse(diary.lockStatus());
        }
        @Test
        @Description("Test to see if the incorrect pin dose not unlocks the diary")
        public void testThatIncorrectPinDoseNotUnlockTheDiary(){
            // Arrange
            SecretDiary diary = new SecretDiary();
            diary.lock();
            // Act
            diary.unlock("1111");
            // Assert
            assertTrue(diary.lockStatus());
        }

        @Test
        @Description("Test to see if the correct pin dose unlock the diary")
        public void testThatCorrectPinDoseUnlockTheDiary(){
            // Arrange
            SecretDiary diary = new SecretDiary();
            diary.lock();
            // Act
            diary.unlock("1234");
            // Assert
            assertFalse(diary.lockStatus());
        }

        @Test
        @Description("Test to ensure a locked diary can't be joined")
        public void testToEnsureLockedDiaryDoesntReturnEntries(){
            // Arrange
            SecretDiary diary = new SecretDiary();
            diary.writeDiary("Shouldn't see this");

            // Act
            diary.lock();
            // Assert
            assertEquals(diary.readDiary().size(), 0);
        }
        @Test
        @Description("Test to ensure a locked diary can't be written to ")
        public void testToEnsureLockedDiaryDoesntTakeAnEntry(){
            // Arrange
            SecretDiary diary = new SecretDiary();
            diary.lock();
            // Act
            diary.writeDiary("Shouldn't see this");
            diary.unlock("1234");
            // Assert
            assertEquals(diary.readDiary().size(), 0);
        }
    }



}
