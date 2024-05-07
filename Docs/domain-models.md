# Secret Diary Pair-Programming Project - Domain Models and test plan

## Diary Code

The following are the user stories, domain models and tests for the Diary class.

## User Story 1

![User Story 1: As a user I want to be able to read the diary entries, so I can read what I had previously recorded.](UserCase1.png)

### Domain Model

| Objects    | Properties     | Messages    | Output  |
| ---------- | -------------- | ----------- | ------- |
| secretDiary| - #entries @String[] | - writeDiary() | @void |

### Tests

- [x] the entries array increases in length when writeDiary adds an entry
- [x] an empty or invalid entry should not be added to the diary

## User Story 2

![User Story 2: As a user I want to be able to add to the diary entries, so I can record my thoughts.](UserCase2.png)

### Domain Model

| Objects    | Properties     | Messages    | Output  |
| ---------- | -------------- | ----------- | ------- |
| secretDiary| - #entries @String[] | - readDiary() | @string[] |

### Tests

- [x] read diary returns an array of strings
- [x] returned strings match what was entered

## User Story 3

![User Story 3: As a user I want to know if the diary is locked, so I can know if I can access it.](UserCase3.png)

### Domain Model

| Objects    | Properties     | Messages    | Output  |
| ---------- | -------------- | ----------- | ------- |
| secretDiary| - #lockStatus @boolean | - getLockStatus() | @boolean |

### Tests

- [ ] getLockedStatus should return 'true' when the diary is locked
- [ ] getLockedStatus should return 'false' when the diary is unlocked

## User Story 4

![User Story 4: As a user I want to be able to unlock my diary so I can access my journal when I want to.](UserCase4.png)

### Domain Model

| Objects    | Properties     | Messages    | Output  |
| ---------- | -------------- | ----------- | ------- |
| secretDiary| - #lockStatus @boolean | - unlock(@int) | @void |

### Tests

- [ ] entering the correct pin will unlock the diary
- [ ] entering the incorrect pin will not unlock the diary
- [ ] entering an erroneous value is handled correctly

## User Story 5

![User Story 5: As a user I want to be able to lock the diary, so I can keep my diary secret.](UserCase5.png)

### Domain Model

| Objects    | Properties     | Messages    | Output  |
| ---------- | -------------- | ----------- | ------- |
| secretDiary| - #lockStatus @boolean | - lock() | @void |

### Tests

- [ ] the lock function will lock an unlocked diary

## User Story 6

![User Story 6: As a user I want the diary to only be readable when it is unlocked, so only I can access it.](UserCase6.png)

### Domain Model

| Objects    | Properties     | Messages    | Output  |
| ---------- | -------------- | ----------- | ------- |
| secretDiary| - #lockStatus @boolean <br> - #entries @String[] | - readDiary() | @string[] |

### Tests

- [ ] read diary doesn't return the diaries contents if it is locked
- [ ] unlocking a locked diary allows the diary to then return the contents

## User Story 7

![User Story 7: As a user I want the diary to only be added to when the diary is unlocked, so only I can access it.](UserCase7.png)

### Domain Model

| Objects    | Properties     | Messages    | Output  |
| ---------- | -------------- | ----------- | ------- |
| secretDiary| - #lockStatus @boolean <br> - #entries @String[] | - writeDiary() | @void |

### Tests

- [ ] writeDiary doesn't add to the diaries entries
- [ ] writeDiary will add to the entries if the diary is unlocked

---
## Interface code
The following are the user stories, domain models and tests for the

## User Story 8
As a user I want to be able to access the features of my diary through a menu, so I can choose what i want to do with it

### Domain Model
| Objects    | Properties     | Messages    | Output  |
| ---------- | -------------- | ----------- | ------- |

### Tests

- [ ] interface displays option choices
- [ ] interface loops until exit is chosen
- [ ] choosing to read the diary option opens the read method
- [ ] choosing the write to diary option open the write method

## User Story 9
as a user I want to know if my diary is locked or not on the interface, so I know if I need to unlock it or lock it.

### Domain Model
| Objects    | Properties     | Messages    | Output  |
| ---------- | -------------- | ----------- | ------- |
| secretDiary| - #lockStatus @boolean | getLockStatus() | @void |

### Tests

- [ ] interface displays diaries lock status
- [ ] changing the lock status updates the interface

## User Story 10
As a user I want my diary to display my entries if I request them, so I can read what i wrote previously

### Domain Model
| Objects    | Properties     | Messages    | Output  |
| ---------- | -------------- | ----------- | ------- |
| secretDiary| - #lockStatus @boolean | - writeDiary() | @void |

### Tests

- [ ] interface displays diaries lock status