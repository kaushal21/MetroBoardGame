# Assignment Two Feedback

## Group  tue10e
u6953044 Tom Stephens
u6671630 Kyle Robertson
u7028766 Kaushal Sharma

## Tutor Comment

Well done! Thank you for your efforts on this assignment. You make some good use of the object-oriented features with well-selected classes. 
The implementation of these classes can be improved, so that you can decode the string representations into objects, 
and deal with the objects in your solution rather than still relying more on manipulation of strings. 
I also suggest that you may not make Score class as a subclass of Player, as they do not have inheritance relationship intrinsically.

It would be better if you could make good use of data structures like list, map and so on. For expamle, in *checkPlacementSequence()*, 
you can condiser using a map to store the types of tiles and corresponing numbers of such tile that has been placed (tile -> counters); 
it is easier to operate and more flexible than using two arrays.

For the GUI design, it is user-friendly and intuitive to use. It is very good that you extend what you learnt from the lab and 
highlight the valid position on the game board. Sometimes the game does not run smoothly. I cannot place a tile on any position of the board 
every now and then when I'm playing the normal mode. And I cannot place a tile from the beginning if I choose to use Constructed Tile, 
therefore I'm not able to run this variant. If I choose to hold a tile in hand and draw another tile, the second tile have to be placed, 
but I find that I can still pick the first tile to place on board.
  
## Mark

**  10.7/13.0**

## Miscellaneous marks

| Level | Requirement | Result |
|:-:|---|:-:|
||All files correct                     | 0.5/.5  |
||Authorship clear for all classes      | 0.25/.25 |
||Program runs from JAR                 | 0.5/.5  |
||Appropriate use of Git                | 0.5/.5  |
|P|Appropriate use of OO features       | 0.65/.75 |
|P|Presentation PDF complete            | 0.5/.5  |
|CR|Program well designed               | 0.5/.5  |
|CR|Comments clear and sufficient       | 0.25/.25 |
|CR|Coding style good                   | 0.25/.25 |
|CR|Appropriate use of JUnit tests      | 0.25/.25 |
|D|Design and code of very high quality | 0.3/.5  |
|D|Demonstrates interesting extensions  | 0.25/.75 |
|D|Works well and easy to run           | 0.1/.25 |
|HD|Game is exceptional                 | 0.4/1.0 |

**Total for miscellaneous marks:**  5.2/6.75

## Game marks (manual)

| Level | Requirement | Result |
|:-:|---|:-:|
|CR|Tiles snap into place (8)        | 0.25/.25 |
|CR|Only valid placements allowed (8)| 0.25/.25 |
|CR|Score updated after placement (8)| 0.5/.5  |
|D |Basic computer opponent (10)     | 0.5/.5  |
|HD|Advanced computer opponent (11)  | 0/.5  |
|HD|Variants (12)                    | 0/.25 |

**Total for manual marks:** 1.5/2.25

## Test results

```
Test Name   Tests Passed  Weighting    Score
-----              -----      -----    -----
task2                4/4        0.5      0.5
task3                3/3        0.5      0.5
task5                4/4        0.5      0.5
task6                4/4        1.0      1.0
task7                3/3       0.75     0.75
task9                3/3       0.75     0.75
-----              -----     Total:  4.0/4.0
```
## Originality statements

#### Originality statement G
# IMPORTANT: It is very important that you correctly complete this originality
# statement.
#
# This is your statement of your submitted work being your own.
# Incorrectly filling out this statement could lead to charges
# of academic misconduct.
# 
# For information on how to fill this out correctly, see
# https://cs.anu.edu.au/courses/comp1110/help/faq/09-originality/
#

declaration: >-
  Stage G represents the culmination of the entire assignment.  We declare that
  everything we have submitted for for all stages of this assignment was
  entirely our own work, with the following exceptions:

# Sign *your* name and uids here. (Remove entries if you have fewer
# than three members.)
signatures:
  - name: Tom Stephens
    uid: u6953044
  - name: Kyle Robertson
    uid: u6671630
  - name: Kaushal Sharma
    uid: u7028766

#### Originality statement F
# IMPORTANT: It is very important that you correctly complete this originality
# statement.
#
# This is your statement of your submitted work being your own.
# Incorrectly filling out this statement could lead to charges
# of academic misconduct.
# 
# For information on how to fill this out correctly, see
# https://cs.anu.edu.au/courses/comp1110/help/faq/09-originality/
#

declaration: >-
  We declare that everything we have submitted for Stage F of this assignment
  and all stages before it is entirely our own work, with the following
  exceptions:


# Sign *your* name and uids here. (Remove entries if you have fewer
# than three members.)
signatures:
  - name: Tom Stephens
    uid: u6953044
  - name: Kyle Robertson
    uid: u6671630
  - name: Kaushal Sharma
    uid: u7028766

#### Originality statements E
# IMPORTANT: It is very important that you correctly complete this originality
# statement.
#
# This is your statement of your submitted work being your own.
# Incorrectly filling out this statement could lead to charges
# of academic misconduct.
# 
# For information on how to fill this out correctly, see
# https://cs.anu.edu.au/courses/comp1110/help/faq/09-originality/
#

declaration: >-
  I declare that everything I have submitted for stage D of this assignment
  and all stages before it is entirely my own work, with the following
  exceptions:

# Use this to list any code that you used that you did not write,
# aside from code provided by the lecturer.  Provide a comment
# explaining your use and the URL to that code and the licence for
# that code
#
# Add as many "url+licence+comment" entries as necessary
# (or remove it altogether if you haven't used any external code)
code:
  - comment: Used for placing tiles on the screen, by listening to the gridPane then getting the rowIndex and colIndex and placing the current tile there.
    url: https://stackoverflow.com/questions/28320110/javafx-how-to-get-column-and-row-index-in-gridpane
    licence: CC-BY-SA

# sign *your* name and uid here
name: Kyle Robertson
uid: u6671630
# IMPORTANT: It is very important that you correctly complete this originality
# statement.
#
# This is your statement of your submitted work being your own.
# Incorrectly filling out this statement could lead to charges
# of academic misconduct.
#
# For information on how to fill this out correctly, see
# https://cs.anu.edu.au/courses/comp1110/help/faq/09-originality/
#

declaration: >-
  I declare that everything I have submitted for stage D of this assignment
  and all stages before it is entirely my own work, with the following
  exceptions:

# Use this to list names of people who you collaborated with, and a
# comment about what you collaborated on.
#
# Add as many "name+comment" entries as necessary
# (or remove it altogether if you haven't collaborated with anyone)
collaboration:
  - name: Sebastian Tierney
    comment: >-
      We discussed Task 7 conceptually but did not share code.

# sign *your* name and uid here
name: Tom Stephens
uid: u6953044
# IMPORTANT: It is very important that you correctly complete this originality
# statement.
#
# This is your statement of your submitted work being your own.
# Incorrectly filling out this statement could lead to charges
# of academic misconduct.
# 
# For information on how to fill this out correctly, see
# https://cs.anu.edu.au/courses/comp1110/help/faq/09-originality/
#

declaration: >-
  I declare that everything I have submitted for stage D of this assignment
  and all stages before it is entirely my own work, with the following
  exceptions:

# sign *your* name and uid here
name: Kaushal Sharma
uid: u7028766

#### Originality statements D
# IMPORTANT: It is very important that you correctly complete this originality
# statement.
#
# This is your statement of your submitted work being your own.
# Incorrectly filling out this statement could lead to charges
# of academic misconduct.
# 
# For information on how to fill this out correctly, see
# https://cs.anu.edu.au/courses/comp1110/help/faq/09-originality/
#

declaration: >-
  I declare that everything I have submitted for stage D of this assignment
  and all stages before it is entirely my own work, with the following
  exceptions:

# sign *your* name and uid here
name: Kyle Robertson
uid: u6671630
# IMPORTANT: It is very important that you correctly complete this originality
# statement.
#
# This is your statement of your submitted work being your own.
# Incorrectly filling out this statement could lead to charges
# of academic misconduct.
# 
# For information on how to fill this out correctly, see
# https://cs.anu.edu.au/courses/comp1110/help/faq/09-originality/
#

declaration: >-
  I declare that everything I have submitted for stage D of this assignment
  and all stages before it is entirely my own work, with the following
  exceptions:

# sign *your* name and uid here
name: Tom Stephens
uid: u6953044
# IMPORTANT: It is very important that you correctly complete this originality
# statement.
#
# This is your statement of your submitted work being your own.
# Incorrectly filling out this statement could lead to charges
# of academic misconduct.
# 
# For information on how to fill this out correctly, see
# https://cs.anu.edu.au/courses/comp1110/help/faq/09-originality/
#

declaration: >-
  I declare that everything I have submitted for stage D of this assignment
  and all stages before it is entirely my own work, with the following
  exceptions:

# sign *your* name and uid here
name: Kaushal Sharma
uid: u7028766

#### Originality statement C
# IMPORTANT: It is very important that you correctly complete this originality
# statement.
#
# This is your statement of your submitted work being your own.
# Incorrectly filling out this statement could lead to charges
# of academic misconduct.
# 
# For information on how to fill this out correctly, see
# https://cs.anu.edu.au/courses/comp1110/help/faq/09-originality/
#

declaration: >-
  We declare that everything we have submitted for Stage C of this assignment
  and all stages before it is entirely our own work, with the following
  exceptions:

# Sign *your* name and uids here. (Remove entries if you have fewer
# than three members.)
signatures:
  - name: Tom Stephens
    uid: u6953044
  - name: Kaushal Sharma
    uid: u7028766
  - name: Kyle Robertson
    uid: u6671630

#### Originality statement B
# IMPORTANT: It is very important that you correctly complete this originality
# statement.
#
# This is your statement of your submitted work being your own.
# Incorrectly filling out this statement could lead to charges
# of academic misconduct.
# 
# For information on how to fill this out correctly, see
# https://cs.anu.edu.au/courses/comp1110/help/faq/09-originality/
#

declaration: >-
  We declare that everything we have submitted for Stage B of this assignment
  and all stages before it is entirely our own work, with the following
  exceptions:

# Sign *your* name and uids here. (Remove entries if you have fewer
# than three members.)
signatures:
  - name: Tom Stephens
    uid: u6953044
  - name: Kaushal Sharma
    uid: u7028766
  - name: Kyle Robertson
    uid: u6671630

## Git Contributions
#### Commit count via git log
```
      8 Josh Milthorpe <josh.milthorpe@anu.edu.au>
     68 Kaushal <kaushal.sharma@anu.edu.au>
     35 NanoA <u6671730@anu.edu.au>
      2 Shiya Liu <shiya.liu@anu.edu.au>
      8 Shiya Liu <u6783346@anu.edu.au>
    126 Tom Stephens <@u6953044@anu.edu.au>
      1 Tom Stephens <u6953044@anu.edu.au>
      1 u6953044 <u6953044@anu.edu.au>

```
#### Line count via git blame
```
    626 Josh
   1702 Kaushal
   1022 NanoA
    793 Tom
```
## Git Log
```
commit da11ed6d3db3185674f9c0f6b0d008e45d1fbc90
Author: Tom Stephens <u6953044@anu.edu.au>
Date:   Mon Jun 1 01:15:46 2020 +1000

    Update H-presentation.yml

commit 348994166dca12ff38afe468df11f199babf4d6c
Author: Kaushal <kaushal.sharma@anu.edu.au>
Date:   Fri May 29 06:21:51 2020 +1000

    Updated with some Comments and a new Test Case in Tile. Commented the get Constructions checkbox from the starting

commit b4101da85affb369c567838da938b923736c3688
Merge: b04dd5b be9ad42
Author: Kaushal <kaushal.sharma@anu.edu.au>
Date:   Fri May 29 05:39:46 2020 +1000

    Merge remote-tracking branch 'origin/master'

commit b04dd5b32767c428cf23d8f091ff311ba2f2af49
Author: Kaushal <kaushal.sharma@anu.edu.au>
Date:   Fri May 29 05:39:36 2020 +1000

    Updated the H-contribution.yml and H-originality.yml for all the team members

commit be9ad422d05d1165e7aa4c94b314106f686dc9d5
Author: NanoA <u6671730@anu.edu.au>
Date:   Fri May 29 05:32:25 2020 +1000

    Added Comments

commit 0a159c33bd50ff6841e264bb12fefe653369b5b1
Merge: 0473254 9e0afd1
Author: NanoA <u6671730@anu.edu.au>
Date:   Fri May 29 05:31:51 2020 +1000

    Merge remote-tracking branch 'origin/master'

commit 0473254e6bc71baa3c83489c5971d379e2781b4d
Author: NanoA <u6671730@anu.edu.au>
Date:   Fri May 29 05:31:36 2020 +1000

    Added Comments

commit 9e0afd14b3831aad07383966e8ad71be4d114d38
Author: Tom Stephens <@u6953044@anu.edu.au>
Date:   Fri May 29 05:29:50 2020 +1000

    Added more comments

commit 012523823349821fbfca6d99cd5c99bd68cd0895
Merge: 188c951 f45781f
Author: Tom Stephens <@u6953044@anu.edu.au>
Date:   Fri May 29 05:29:23 2020 +1000

    Merge branch 'master' of https://gitlab.cecs.anu.edu.au/u6953044/comp1110-ass2-tue10e

commit 188c9517e10189b19417b1d2f98dee7628bc5069
Author: Tom Stephens <@u6953044@anu.edu.au>
Date:   Fri May 29 05:29:09 2020 +1000

    Added more comments

commit f45781f552f1d84b747a78f42a57e0cc75149e9b
Merge: a1594b9 f3926e4
Author: Kaushal <kaushal.sharma@anu.edu.au>
Date:   Fri May 29 05:18:32 2020 +1000

    Merge remote-tracking branch 'origin/master'

commit f3926e4605de8b231bc4cac8c4272c246ddd121e
Author: NanoA <u6671730@anu.edu.au>
Date:   Fri May 29 05:18:02 2020 +1000

    G-Commits

commit a1594b9fd2256a58e7306747dd0d104cbfd84207
Author: Kaushal <kaushal.sharma@anu.edu.au>
Date:   Fri May 29 05:18:01 2020 +1000

    Updated the G-best-u7028766.yml

commit bf9b575009aa02ae66aeddcfc0abe23850de56bb
Author: NanoA <u6671730@anu.edu.au>
Date:   Fri May 29 05:16:25 2020 +1000

    G-Commits

commit 176f6440dc90909d6c89136f020bcf70eda2684b
Author: NanoA <u6671730@anu.edu.au>
Date:   Fri May 29 05:13:08 2020 +1000

    Fixed game.jar

commit e1a44f5f81b1c24b3f9558844a8829e475bddbdd
Author: Tom Stephens <@u6953044@anu.edu.au>
Date:   Fri May 29 05:11:21 2020 +1000

    added presentation.pdf

commit a65a5b433fd212f44eba44f6ae94e11c5f259134
Merge: 328e73e fdc71a9
Author: Kaushal <kaushal.sharma@anu.edu.au>
Date:   Fri May 29 05:10:04 2020 +1000

    Merge remote-tracking branch 'origin/master'

commit 328e73e9ae357b7bfb88dfa5286f8d47c5d82e9f
Author: Kaushal <kaushal.sharma@anu.edu.au>
Date:   Fri May 29 05:09:50 2020 +1000

    All Tests are Passing.

commit fdc71a934d8d6637432cffe9d486bf32835c3d41
Author: Tom Stephens <@u6953044@anu.edu.au>
Date:   Fri May 29 04:58:36 2020 +1000

    Update originality

commit 2deb920ea5520a41079ba2d580fe13f3bcc2ae17
Author: Tom Stephens <@u6953044@anu.edu.au>
Date:   Fri May 29 04:57:25 2020 +1000

    Update originality and contribution

commit 177f310d74c2e942e28da31ed9fae6264414140f
Author: Tom Stephens <@u6953044@anu.edu.au>
Date:   Fri May 29 04:54:15 2020 +1000

    G-best

commit 17c4ee1e7456cfa66aa870118142bce711a704e9
Author: Tom Stephens <@u6953044@anu.edu.au>
Date:   Fri May 29 04:49:35 2020 +1000

    Update opponent class with tests

commit 74dcbeff410947b6896afb1cdbe6a64465062339
Author: Tom Stephens <@u6953044@anu.edu.au>
Date:   Fri May 29 04:18:47 2020 +1000

    Update opponent class

commit a802d89f0ba695731e50b57860fda30efc46cb0a
Author: Tom Stephens <@u6953044@anu.edu.au>
Date:   Fri May 29 04:01:42 2020 +1000

    G-features

commit df675a7f02e5c1c97b56aa184556387ec5cb101e
Author: Tom Stephens <@u6953044@anu.edu.au>
Date:   Fri May 29 03:47:57 2020 +1000

    Added more tests in ScoreTests

commit 25760fdf269ebcf8c812987cea92cee0e6e089cf
Merge: 82963cb 892f9b1
Author: Tom Stephens <@u6953044@anu.edu.au>
Date:   Fri May 29 03:47:39 2020 +1000

    Merge remote-tracking branch 'origin/master'

commit 82963cb7600efc98bdcc9d7e1c4df7a099919b47
Author: Tom Stephens <@u6953044@anu.edu.au>
Date:   Fri May 29 03:47:14 2020 +1000

    Updates G-features

commit 3e10e7e8442ec5d2630f5b28c13b3a27dde3e96e
Merge: e6d4af6 892f9b1
Author: Kaushal <kaushal.sharma@anu.edu.au>
Date:   Fri May 29 03:46:14 2020 +1000

    Merge branch 'master' of https://gitlab.cecs.anu.edu.au/u6953044/comp1110-ass2-tue10e
    
     Conflicts:
    	game.jar

commit e6d4af61219c3c88590b22f051bc2e1330182cec
Author: Kaushal <kaushal.sharma@anu.edu.au>
Date:   Fri May 29 03:46:00 2020 +1000

    Kaushal Game Point

commit 892f9b182c29835c85ebaf35813723da74c5d5fc
Author: NanoA <u6671730@anu.edu.au>
Date:   Fri May 29 03:41:40 2020 +1000

    Finished Player Tests & added G-Con & G-Orig

commit b4dca54ff6720d3df13d4463380efb4847ba831c
Merge: 493325a 5144c70
Author: Kaushal <kaushal.sharma@anu.edu.au>
Date:   Fri May 29 03:27:34 2020 +1000

    Merge remote-tracking branch 'origin/master'

commit 493325a4e93593883cd96bf931f45ba10ffb751a
Author: Kaushal <kaushal.sharma@anu.edu.au>
Date:   Fri May 29 03:27:21 2020 +1000

    Updated with Final Screen calling

commit 5144c7044e4db4cd48d06732281c38f0e41d4626
Author: Tom Stephens <@u6953044@anu.edu.au>
Date:   Fri May 29 03:20:53 2020 +1000

    Added more tests in ScoreTests

commit f0e7077f434e63e9e62789d6bd787aebdeb035dd
Merge: 01b7831 eead84d
Author: Kaushal <kaushal.sharma@anu.edu.au>
Date:   Fri May 29 03:09:46 2020 +1000

    Merge remote-tracking branch 'origin/master'
    
    # Conflicts:
    #       src/comp1110/ass2/Move.java
    #       src/comp1110/ass2/gui/CreatingBoard.java

commit 01b7831d28c11e5fa4395970786bf87e86d6bfda
Author: Kaushal <kaushal.sharma@anu.edu.au>
Date:   Fri May 29 03:05:47 2020 +1000

    Done with the Unexpected Tile Error

commit eead84d4bae9f44f850ab735977a3fc5358ba55c
Author: Tom Stephens <@u6953044@anu.edu.au>
Date:   Fri May 29 02:57:27 2020 +1000

    Added more tests in ScoreTests

commit 1aa4b5c409fd82717008fef53430c3cf398db747
Merge: d7360f3 2870eab
Author: Tom Stephens <@u6953044@anu.edu.au>
Date:   Fri May 29 02:56:32 2020 +1000

    Merge remote-tracking branch 'origin/master'

commit d7360f314a52406ea442b204fbb238dd64bd8a8f
Author: Tom Stephens <@u6953044@anu.edu.au>
Date:   Fri May 29 02:55:56 2020 +1000

    Added more tests in ScoreTests

commit 2870eabe0629f8b189d5a3c72c658347b011ebaf
Author: NanoA <u6671730@anu.edu.au>
Date:   Fri May 29 02:05:10 2020 +1000

    Finished Player Tests & added G-Con & G-Orig

commit f3b1d4f6c2eeaaaddeced12bdc8b6d8cc054f023
Author: Tom Stephens <@u6953044@anu.edu.au>
Date:   Fri May 29 02:00:56 2020 +1000

    Fixed AI placement error

commit c5db5a3c9a4d22135f3acf7f11e76bf830b8ac49
Author: Tom Stephens <@u6953044@anu.edu.au>
Date:   Fri May 29 01:51:16 2020 +1000

    Updated the Score Class and its tests to include the variant case

commit bfa9aae310a9f3c74f9f1e777e59cf9a62d00e56
Merge: 3693d57 27dc6e3
Author: Kaushal <kaushal.sharma@anu.edu.au>
Date:   Fri May 29 01:20:22 2020 +1000

    Merge remote-tracking branch 'origin/master'

commit 3693d573c92824c5c624b9acbcaf5cb8cb367d07
Author: Kaushal <kaushal.sharma@anu.edu.au>
Date:   Fri May 29 01:20:04 2020 +1000

    Updated Move.java for check more accurate tile placement

commit 27dc6e366ad881a27ce275c1a81e899a90910ea6
Author: Tom Stephens <@u6953044@anu.edu.au>
Date:   Fri May 29 00:53:53 2020 +1000

    Tidied up GetPLayers window

commit f269fb6ebd47801cd06b13adb53d57fb93c453d0
Merge: 79e156a 3d78620
Author: Tom Stephens <@u6953044@anu.edu.au>
Date:   Fri May 29 00:43:48 2020 +1000

    Merge remote-tracking branch 'origin/master'

commit 3d7862090116a87c1bf2fbaec9062886536aaac0
Author: NanoA <u6671730@anu.edu.au>
Date:   Fri May 29 00:31:14 2020 +1000

    Score Checking

commit 79e156a035f5fb7d317a4a908fa64bfbdae41dfc
Merge: ee459e8 8fd2979
Author: Tom Stephens <@u6953044@anu.edu.au>
Date:   Fri May 29 00:03:31 2020 +1000

    Merge remote-tracking branch 'origin/master'

commit ee459e8f8b6f554e99e02b8d8f7d6f134dcefa46
Author: Tom Stephens <@u6953044@anu.edu.au>
Date:   Fri May 29 00:01:52 2020 +1000

    update

commit 8fd2979019711637a825e74ac5dbd74da389d1ee
Merge: 97dafa3 88a7529
Author: Kaushal <kaushal.sharma@anu.edu.au>
Date:   Fri May 29 00:01:00 2020 +1000

    Merge remote-tracking branch 'origin/master'

commit 97dafa3c919eda7c40b4b29835f84a19716d1ff2
Author: Kaushal <kaushal.sharma@anu.edu.au>
Date:   Fri May 29 00:00:15 2020 +1000

    Updated Movement in of Tile in CreatingBoard.java

commit 88a75291437e6869ba727f799e464448460bc2ab
Author: NanoA <u6671730@anu.edu.au>
Date:   Thu May 28 23:40:58 2020 +1000

    Checking merge Issues

commit b36ef8b691806bd4996097d6af0e0f467a254b47
Merge: 9902193 87d630c
Author: Kaushal <kaushal.sharma@anu.edu.au>
Date:   Thu May 28 23:40:38 2020 +1000

    Merge branch 'master' of https://gitlab.cecs.anu.edu.au/u6953044/comp1110-ass2-tue10e
    
     Conflicts:
    	game.jar

commit 990219390d568c8289174ed7ed2bcd70b52b7cdb
Author: Kaushal <kaushal.sharma@anu.edu.au>
Date:   Thu May 28 23:40:26 2020 +1000

    Kaushal Game Point

commit 87d630c8dfb6cb60f9e2ec29a901e5f945fc491c
Author: NanoA <u6671730@anu.edu.au>
Date:   Thu May 28 23:37:29 2020 +1000

    Got Score Working on the Screen

commit 0cb92e96d379f228c27d0aaf5a947ee8c133b193
Merge: a726afc 26f4149
Author: Kaushal <kaushal.sharma@anu.edu.au>
Date:   Thu May 28 23:23:22 2020 +1000

    Merge branch 'master' of https://gitlab.cecs.anu.edu.au/u6953044/comp1110-ass2-tue10e
    
     Conflicts:
    	src/comp1110/ass2/gui/CreatingBoard.java

commit c725240d5f2fe3351eb144c055dd0ee54aa31e22
Author: Tom Stephens <@u6953044@anu.edu.au>
Date:   Thu May 28 23:22:54 2020 +1000

    Updated tests

commit a726afc7202bd9d9850820c590f972c8740b4dce
Author: Kaushal <kaushal.sharma@anu.edu.au>
Date:   Thu May 28 23:22:44 2020 +1000

    Kaushal Game Point

commit 26f4149f18af2c61222cd9f34fdaaa5749bbb250
Author: Tom Stephens <@u6953044@anu.edu.au>
Date:   Thu May 28 23:21:48 2020 +1000

    Task 10 Finished

commit 62e5d96375034fa1b74cd7eeef080ef57dd4a124
Author: NanoA <u6671730@anu.edu.au>
Date:   Thu May 28 23:04:14 2020 +1000

    Got Score Working on the Screen

commit 3007ec48307eb1a63191327e9b715bdc2d3cfada
Merge: 226295b eb2e388
Author: NanoA <u6671730@anu.edu.au>
Date:   Thu May 28 23:00:52 2020 +1000

    Merge remote-tracking branch 'origin/master'
    
    # Conflicts:
    #       game.jar

commit 226295b5d0a5b1b8a05e30d3eb691e4584953dc3
Merge: 9c324f8 00ec30f
Author: NanoA <u6671730@anu.edu.au>
Date:   Thu May 28 22:59:56 2020 +1000

    Merge branch 'master' of https://gitlab.cecs.anu.edu.au/u6953044/comp1110-ass2-tue10e
    
    # Conflicts:
    #       src/comp1110/ass2/gui/CreatingBoard.java

commit 9c324f8bee20c32867404e0e8b2bf9c8d781b0d3
Author: NanoA <u6671730@anu.edu.au>
Date:   Thu May 28 22:57:44 2020 +1000

    Got Score Working on the Screen

commit eb2e3886a5c9398bcee7ab45a93c5df38d4581ea
Merge: d1863ae 00ec30f
Author: Kaushal <kaushal.sharma@anu.edu.au>
Date:   Thu May 28 22:57:35 2020 +1000

    Merge remote-tracking branch 'origin/master'
    
    # Conflicts:
    #       src/comp1110/ass2/gui/CreatingBoard.java

commit d1863ae457225d9770550bbc86a9e232e9d4608d
Author: Kaushal <kaushal.sharma@anu.edu.au>
Date:   Thu May 28 22:57:15 2020 +1000

    Updated how to get Number of Players and AI's

commit 00ec30fa70336cd128d61de95679555816dc60c1
Author: Tom Stephens <@u6953044@anu.edu.au>
Date:   Thu May 28 22:52:08 2020 +1000

    Working on Task 10

commit caef48cadaf47ee88de639de13bf7b1f101f3869
Author: NanoA <u6671730@anu.edu.au>
Date:   Thu May 28 22:41:53 2020 +1000

    Merge branch 'master' of C:\Users\NanoA\IdeaProjects\comp1110-ass2-tue10e with conflicts.

commit b0760534a4220dd9afc54129ebd0347ebfc6abab
Merge: 0f1b92e 4928f8a
Author: Kaushal <kaushal.sharma@anu.edu.au>
Date:   Thu May 28 22:35:41 2020 +1000

    Merge branch 'master' of https://gitlab.cecs.anu.edu.au/u6953044/comp1110-ass2-tue10e

commit 4928f8a74d692cb5c95ec96c0d191ae6ce8c3df5
Author: Tom Stephens <@u6953044@anu.edu.au>
Date:   Thu May 28 22:34:48 2020 +1000

    Getting Task 10 working

commit 0f1b92e1c50c0b94ae19c4c9f0ac18bf360f81a5
Merge: a3d6607 ec9ebf8
Author: Kaushal <kaushal.sharma@anu.edu.au>
Date:   Thu May 28 22:08:06 2020 +1000

    Merge branch 'master' of https://gitlab.cecs.anu.edu.au/u6953044/comp1110-ass2-tue10e
    
     Conflicts:
    	game.jar

commit a3d6607e070b6577c7ade34bb18db7b8931899f7
Author: Kaushal <kaushal.sharma@anu.edu.au>
Date:   Thu May 28 22:07:49 2020 +1000

    Kaushal's Game Point

commit ec9ebf8af9b2abe9b4340580d4fb32984e92c9d5
Author: Tom Stephens <@u6953044@anu.edu.au>
Date:   Thu May 28 18:30:28 2020 +1000

    updated some tests and added comments

commit b8d733d0a2698e8e28fd885296392e32386dec73
Author: Tom Stephens <@u6953044@anu.edu.au>
Date:   Thu May 28 17:24:22 2020 +1000

    Made OpponentAI extend Player

commit 201f65ee54e6a1bac53d0174e1b037f4ac9b1f90
Author: Tom Stephens <@u6953044@anu.edu.au>
Date:   Thu May 28 16:43:27 2020 +1000

    updated originality and contribution

commit f5561eda5a535190764db91c87f503baa059b931
Author: Tom Stephens <@u6953044@anu.edu.au>
Date:   Thu May 28 16:40:14 2020 +1000

    All classes now have Authorship included at the top

commit 0206e04043449cdd96002a3ea8c61a2478bc1844
Author: Tom Stephens <@u6953044@anu.edu.au>
Date:   Thu May 28 15:06:07 2020 +1000

    Separated tests by class and removed OurTests

commit 9bf21f1941233a4b7a99ff7c9dca36f99995b614
Author: Tom Stephens <@u6953044@anu.edu.au>
Date:   Thu May 28 14:40:51 2020 +1000

    Added method to check whether the confirmation box has been checked

commit af570dab0d1ba939a963e445faaf2b785078fd9c
Author: Tom Stephens <@u6953044@anu.edu.au>
Date:   Thu May 28 14:14:56 2020 +1000

    Separated tests by class and removed OurTests

commit 3a440cbb1b8abd8e1bcc931190d1e7e11418bec2
Author: Tom Stephens <@u6953044@anu.edu.au>
Date:   Thu May 28 11:56:03 2020 +1000

    Code cleanup

commit 82fe774a9e8524a92d42dc2a5780da2f55693daf
Author: Tom Stephens <@u6953044@anu.edu.au>
Date:   Thu May 28 11:06:03 2020 +1000

    Code cleanup

commit 47e99ff1025f89dbae230bb9c29da267d3924cde
Author: Tom Stephens <@u6953044@anu.edu.au>
Date:   Thu May 28 11:05:44 2020 +1000

    Code cleanup

commit d73e10f124e074cf82993e7fe7c7e297a2ad58c7
Author: Tom Stephens <@u6953044@anu.edu.au>
Date:   Thu May 28 10:50:58 2020 +1000

    Implemented a basic AI move generator

commit a9056f4466d7889ec0739807e9f26dfc3623e208
Author: Tom Stephens <@u6953044@anu.edu.au>
Date:   Thu May 28 10:48:31 2020 +1000

    made some stuff static so I could ue it elsewhere

commit 4b0a69fe3112fdf2fd5d512b35f17594cf42884b
Author: Tom Stephens <@u6953044@anu.edu.au>
Date:   Thu May 28 10:25:07 2020 +1000

    added Kyle to authorship

commit efae2cde9d1d68d1f33f66940d487297ad3fd55e
Author: Tom Stephens <@u6953044@anu.edu.au>
Date:   Thu May 28 10:11:24 2020 +1000

    fixed typo

commit aa7e1d943d4cf4798ec41e72b0b8455169951f95
Author: Tom Stephens <@u6953044@anu.edu.au>
Date:   Thu May 28 09:35:54 2020 +1000

    added a method to construct a new deck with the construction tile replacing one of the regular ones

commit ad348a3244b08fd40ede025c6eef5e55dbc2d506
Merge: f265658 f76de21
Author: Kaushal <kaushal.sharma@anu.edu.au>
Date:   Wed May 27 22:52:52 2020 +1000

    Updated CreatingBoard.java

commit f265658bcc36a61eef8672ea087c8ffe5bd6d435
Author: Kaushal <kaushal.sharma@anu.edu.au>
Date:   Wed May 27 22:47:30 2020 +1000

    Updates CreatingBoard.java

commit f76de2141dab6962bd0c4ae2d4a239f017126e14
Author: NanoA <u6671730@anu.edu.au>
Date:   Wed May 27 22:07:37 2020 +1000

    Added Check box for construction tile to player screen
    Fixed TestGenerateMoveHelper because function was renamed

commit 7bfbe8fa4120edc3ee936229aed8de033417db3a
Author: Tom Stephens <@u6953044@anu.edu.au>
Date:   Wed May 27 21:56:24 2020 +1000

    Added the construction tile to the game assets

commit ec1bd29f3b52c1041ac48f0509c34f99631fc124
Author: Tom Stephens <@u6953044@anu.edu.au>
Date:   Wed May 27 17:15:11 2020 +1000

    updated to also get the number of AI the player wants in the game

commit 316956d8c741535f63d5efd31a3466c7e3d877fb
Merge: a7bc336 982d709
Author: Tom Stephens <@u6953044@anu.edu.au>
Date:   Wed May 27 15:22:53 2020 +1000

    Merge remote-tracking branch 'origin/master'
    
    # Conflicts:
    #       game.jar

commit a7bc336e536b6e42cc0d46a1b3dd47c5952b3768
Author: Tom Stephens <@u6953044@anu.edu.au>
Date:   Wed May 27 15:22:36 2020 +1000

    Fixing merge conflict

commit 982d70960be11ab95aac59df0b063bc32cf85e3a
Author: NanoA <u6671730@anu.edu.au>
Date:   Tue May 26 17:29:04 2020 +1000

    Merge branch 'master' of https://gitlab.cecs.anu.edu.au/u6953044/comp1110-ass2-tue10e
    Added Authorship for some classes
    # Conflicts:
    #       game.jar

commit 625d7eb2747ac4cdf1476e3476fb8ddbff19757e
Merge: 8e6c185 c2c53ec
Author: NanoA <u6671730@anu.edu.au>
Date:   Tue May 26 17:27:50 2020 +1000

    Merge branch 'master' of https://gitlab.cecs.anu.edu.au/u6953044/comp1110-ass2-tue10e
    
    # Conflicts:
    #       game.jar

commit c2c53ecc8463bfcf77c39414280adf7aad9c0928
Author: Tom Stephens <@u6953044@anu.edu.au>
Date:   Tue May 26 15:20:51 2020 +1000

    Included authorship and updated the jar file to work on Mac

commit 468559aaba07833b3b70539a2e8d9226e95b9e0a
Author: Tom Stephens <@u6953044@anu.edu.au>
Date:   Tue May 26 14:49:14 2020 +1000

    Tightened up comments and included authorship

commit 142e72a66b71bc46d0dce99a32fbd81b68c50c15
Author: Tom Stephens <@u6953044@anu.edu.au>
Date:   Tue May 26 14:16:50 2020 +1000

    Tightened up comments and included authorship

commit 8e6c1857bf3a141f348f4346e50c5287e2251ab3
Author: NanoA <u6671730@anu.edu.au>
Date:   Wed May 20 02:25:30 2020 +1000

    Got the Image to update after each placement, still working on label

commit a103a18a1e677e25482ab4aa02faa12b72976b07
Merge: 648c885 5e365fc
Author: Kaushal <kaushal.sharma@anu.edu.au>
Date:   Wed May 20 01:50:50 2020 +1000

    Merge remote-tracking branch 'origin/master'
    # Conflicts:
    #       game.jar
    #       src/comp1110/ass2/gui/CreatingBoard.java

commit 648c88555b70668fff24d2795ccf84983a9a0d12
Author: Kaushal <kaushal.sharma@anu.edu.au>
Date:   Wed May 20 01:42:06 2020 +1000

    Updated with player picking tile

commit 5e365fce5a23c0a39ca01f9dce5149d247c10b11
Author: NanoA <u6671730@anu.edu.au>
Date:   Wed May 20 01:37:14 2020 +1000

    Got the Image to update after each placement, still working on label

commit 529edb82e1347bb250731a6d66d51bb20d732d3d
Author: Kaushal <kaushal.sharma@anu.edu.au>
Date:   Tue May 19 22:32:23 2020 +1000

    A new version of Viewer in CreatingBoard.java. Its another way of creating board

commit fa2420ea56821d526f0f72e0120d7581df48ea4f
Merge: 901601b 3af2a4b
Author: Kaushal <kaushal.sharma@anu.edu.au>
Date:   Mon May 18 15:14:31 2020 +1000

    Merge branch 'BobsExperiment' of https://gitlab.cecs.anu.edu.au/u6953044/comp1110-ass2-tue10e

commit 901601b4f68fc62bba48eaebfc3977b25c6adaeb
Merge: ed07921 a990bf8
Author: Kaushal <kaushal.sharma@anu.edu.au>
Date:   Sun May 17 18:00:04 2020 +1000

    Merge branch 'feedback' of https://gitlab.cecs.anu.edu.au/u6953044/comp1110-ass2-tue10e

commit ed079218eeb992968e41825e86149520a02dc5f9
Merge: 58a6c65 58e33ae
Author: Kaushal <kaushal.sharma@anu.edu.au>
Date:   Sun May 17 16:38:42 2020 +1000

    Merge branch 'master' of https://gitlab.cecs.anu.edu.au/comp1110/comp1110-ass2

commit 58e33ae0fff770128ad58392ac63fa3a16ea7abc
Author: Josh Milthorpe <josh.milthorpe@anu.edu.au>
Date:   Fri May 15 14:41:37 2020 +1000

    add file H-presentation.yml to record presentation video URL

commit a990bf80ea972286ab7395259b1f8e585e5a074b
Author: Shiya Liu <shiya.liu@anu.edu.au>
Date:   Thu May 14 12:36:00 2020 +1000

    Update feedbackD2F_Review_u6953044

commit 4dc437c87d0c65a5c3338411931d27f9765d56b2
Author: Shiya Liu <u6783346@anu.edu.au>
Date:   Thu May 14 12:30:24 2020 +1000

    update feedback

commit 71289d5ad6b1e81889468fc10c3d3b83e94419f8
Merge: cf4139a a5ee44f
Author: Shiya Liu <u6783346@anu.edu.au>
Date:   Tue May 12 23:50:28 2020 +1000

    Merge branch 'feedback' of https://gitlab.cecs.anu.edu.au/u6953044/comp1110-ass2-tue10e

commit cf4139ace22dbec0c338e8b5b8dc6c763b674ed4
Author: Shiya Liu <u6783346@anu.edu.au>
Date:   Tue May 12 23:42:32 2020 +1000

    update feedback

commit 58a6c652c360380fa3e7141429bdda9506eb59e9
Merge: 2d3e567 3d736a7
Author: Kaushal <kaushal.sharma@anu.edu.au>
Date:   Tue May 12 11:00:58 2020 +1000

    Merge remote-tracking branch 'origin/master'
    
    # Conflicts:
    #       admin/F-review-u6953044.yml

commit 2d3e5671f5b2b316bfe8fe87ab96b900faa30765
Author: Kaushal <kaushal.sharma@anu.edu.au>
Date:   Tue May 12 11:00:13 2020 +1000

    Update F-review-u7028766.yml anf F-review-u6953044.yml for D2F

commit 3d736a79039988cd50d71c81686fa60ce092402f
Author: Tom Stephens <@u6953044@anu.edu.au>
Date:   Tue May 12 10:59:28 2020 +1000

    D2F compliance

commit 80163889aecdbc1cc06e4316fdcaba6eebb8e9f3
Author: Kaushal <kaushal.sharma@anu.edu.au>
Date:   Tue May 12 10:56:31 2020 +1000

    Update F-review-u7028766.yml

commit 2b103e36ed5d3584975ebf48931d5877e5e09cd4
Author: Tom Stephens <@u6953044@anu.edu.au>
Date:   Tue May 12 10:53:43 2020 +1000

    D2F compliance

commit bbb306da662fe90759d114893c96d6cbcdff5014
Author: Tom Stephens <@u6953044@anu.edu.au>
Date:   Tue May 12 10:49:37 2020 +1000

    D2F compliance

commit 2734405c2181995853958fa27e5b181361fb7cc2
Author: Tom Stephens <@u6953044@anu.edu.au>
Date:   Tue May 12 10:44:23 2020 +1000

    D2F compliance

commit 54ee11080a92f26da33a53d2b8a086fa9a8388a9
Merge: b29316c e896e0d
Author: Tom Stephens <@u6953044@anu.edu.au>
Date:   Tue May 12 10:41:37 2020 +1000

    Merge remote-tracking branch 'origin/master'

commit b29316c6c2602d25005c62d052b406000614e918
Author: Tom Stephens <@u6953044@anu.edu.au>
Date:   Tue May 12 10:41:30 2020 +1000

    D2F compliance

commit e896e0dd1d6e68834ac24414d86b5be7ea58dea6
Author: Kaushal <kaushal.sharma@anu.edu.au>
Date:   Tue May 12 10:39:29 2020 +1000

    Update E-originality-u6671630.yml for Kyle

commit d406116fa0642fb39927f1f52be1d215469b8877
Author: Kaushal <kaushal.sharma@anu.edu.au>
Date:   Tue May 12 10:36:22 2020 +1000

    Update E-originality-u6671630.yml for Kyle and F-review-u7028766.yml

commit a2fc6c2875e0aacfac7f922ec701064b1c6149ec
Merge: c66f7ac 5c7f034
Author: Tom Stephens <@u6953044@anu.edu.au>
Date:   Tue May 12 10:33:22 2020 +1000

    Merge remote-tracking branch 'origin/master'

commit c66f7ac79811e7eb48767c6023e0485706f6bc77
Author: Tom Stephens <@u6953044@anu.edu.au>
Date:   Tue May 12 10:33:12 2020 +1000

    D2E compliance

commit 5c7f034332ef6d96907cea9af9e6106ea1e11d95
Author: Kaushal <kaushal.sharma@anu.edu.au>
Date:   Tue May 12 10:30:51 2020 +1000

    Updated F-originality.yml and F-contribution.yml

commit eb16f346fe67d4a392f922effe2a23553dfc8d50
Author: NanoA <u6671730@anu.edu.au>
Date:   Mon May 11 23:57:23 2020 +1000

    Got game.jar to work

commit f8f489914ec6dcdb213c1d584da14b4a4a311c9b
Author: NanoA <u6671730@anu.edu.au>
Date:   Mon May 11 23:17:55 2020 +1000

    Still Working on fixing Pick-up Button.
    Updated D2F Originality, Contribution and code Review

commit 87b6494cb0c31fe2d39d548d4568cb7ef4450963
Author: Tom Stephens <@u6953044@anu.edu.au>
Date:   Sun May 10 20:16:28 2020 +1000

    D2F Code Review

commit 86029e55bfb849aeb830560a6bcb045927ae4451
Author: Tom Stephens <@u6953044@anu.edu.au>
Date:   Sun May 10 16:24:46 2020 +1000

    D2F Contribution and Originality

commit f4bcd27b5de125c6d81a101ce1ea5cd7f6179482
Author: NanoA <u6671730@anu.edu.au>
Date:   Sun May 10 03:17:29 2020 +1000

    Still Working on task 8, just trying to figure out how to update pull from the deck.

commit 51a727bcf6c887758ec8984a8e3ba5f2d07412f2
Merge: 4f26d50 5cef009
Author: NanoA <u6671730@anu.edu.au>
Date:   Sun May 10 03:16:59 2020 +1000

    Merge branch 'master' of https://gitlab.cecs.anu.edu.au/u6953044/comp1110-ass2-tue10e

commit 4f26d5004bac5d69294d0e7354e4d6e7835d38e5
Author: NanoA <u6671730@anu.edu.au>
Date:   Sun May 10 03:16:26 2020 +1000

    Still Working on task 8, just trying to figure out how to update pull from the deck.

commit 5cef00912c5ee46435fb778239436976649a3ea2
Author: Tom Stephens <@u6953044@anu.edu.au>
Date:   Sat May 9 14:49:05 2020 +1000

    Removed useless code from OurTests and added another to test my task 9 helper functions

commit d59b72b05b7952caa62bfec56b229ce86e1793a6
Author: Tom Stephens <@u6953044@anu.edu.au>
Date:   Sat May 9 14:48:14 2020 +1000

    Removed useless code from OurTests and added another to test my task 9 helper functions

commit 18d1710df87fd822c770bc3f06e3550b5501c4c1
Author: Tom Stephens <@u6953044@anu.edu.au>
Date:   Sat May 9 12:51:45 2020 +1000

    Task 9 actually complete this time

commit c2bde2a55d14474070b60582cf6d8868a263fce5
Author: Josh Milthorpe <josh.milthorpe@anu.edu.au>
Date:   Thu May 7 18:27:58 2020 +1000

    Task 9 GenerateMoveTest: improve error messages

commit c1757e94bfd988e4de7b5483f2c543f50985e7d6
Author: Tom Stephens <@u6953044@anu.edu.au>
Date:   Thu May 7 13:25:39 2020 +1000

    Task 9 complete

commit a5ee44f3d67b69b70a337df267267a1dbdd5020f
Author: Shiya Liu <u6783346@anu.edu.au>
Date:   Wed May 6 22:57:03 2020 +1000

    update feedback

commit dc384bc5d544278b65fb9353228a15b2844a6200
Merge: b0ad182 5a5b3c0
Author: Tom Stephens <@u6953044@anu.edu.au>
Date:   Wed May 6 18:53:06 2020 +1000

    Merge branch 'master' of https://gitlab.cecs.anu.edu.au/u6953044/comp1110-ass2-tue10e

commit 5a5b3c0fcbbd481ccef8a93f646e27c12140334b
Author: NanoA <u6671730@anu.edu.au>
Date:   Mon May 4 23:19:54 2020 +1000

    Added missed comments to my code

commit 5f49bf4d423378adfe53f8445f6acc676195256e
Author: Kaushal <kaushal.sharma@anu.edu.au>
Date:   Mon May 4 19:47:40 2020 +1000

    Updated Some JUnit Tests and E-newcode-u7028766.md

commit ede4d25f7e55284d690ad2f4ee6285000c15b228
Merge: 25b1562 9552fd6
Author: Kaushal <kaushal.sharma@anu.edu.au>
Date:   Mon May 4 03:20:16 2020 +1000

    Merge branch 'feedback' of https://gitlab.cecs.anu.edu.au/u6953044/comp1110-ass2-tue10e

commit 25b1562eda0ff5cf90afd41778dd8eaf38ee7200
Merge: 0ede8c1 054e42f
Author: Kaushal <kaushal.sharma@anu.edu.au>
Date:   Mon May 4 03:19:29 2020 +1000

    Merge remote-tracking branch 'origin/master'
    
    # Conflicts:
    #       tests/comp1110/ass2/OurTests.java

commit 0ede8c138442387c7f00efc2d26992fe5752b2f0
Author: Kaushal <kaushal.sharma@anu.edu.au>
Date:   Mon May 4 03:18:01 2020 +1000

    Created Test Cases in OurTests.java. Updated E-newcode-u7028766.md and E-originality-u7028766.yml

commit 054e42f079c0c54d012d6e64c6b49d18d2205317
Author: NanoA <u6671730@anu.edu.au>
Date:   Mon May 4 02:48:43 2020 +1000

    Added Another java test and working on task 8

commit 98285b9e37b4cccbc86a9588b73759f5723109dd
Author: NanoA <u6671730@anu.edu.au>
Date:   Sun May 3 23:24:54 2020 +1000

    Updated D2E newcode and Originality
    Still working on task 8 and finished java tests

commit b0ad182678cffe49083c63c7705761aca8fdd64e
Author: Tom Stephens <@u6953044@anu.edu.au>
Date:   Sun May 3 22:12:44 2020 +1000

    Deliverable D2E

commit 77157f2177372864abbdb7514326e85c7ec21e8b
Author: Tom Stephens <@u6953044@anu.edu.au>
Date:   Sun May 3 18:26:30 2020 +1000

    Deliverable D2E

commit 1b85ea68b6320387da035bcf2a5d17a0d65c527c
Author: Tom Stephens <@u6953044@anu.edu.au>
Date:   Sun May 3 18:25:49 2020 +1000

    Deliverable D2E

commit f237b5f321e1e42cb95d2fb0d00e08d3a1ac3978
Author: Tom Stephens <@u6953044@anu.edu.au>
Date:   Sun May 3 18:22:23 2020 +1000

    Deliverable D2E

commit d51ae09e5ac374d3abef2f4fb4718ccdc65def0a
Author: Tom Stephens <@u6953044@anu.edu.au>
Date:   Sun May 3 18:20:02 2020 +1000

    Created class to hold our tests

commit 79a7cd12e54eedb33f39d7ed1ff569c9f2cde3e9
Author: Tom Stephens <@u6953044@anu.edu.au>
Date:   Sun May 3 18:19:20 2020 +1000

    Moved my test to OurTests.java

commit 28f018761ca8a03ac7f47a08e954baca93f23664
Author: Tom Stephens <@u6953044@anu.edu.au>
Date:   Sun May 3 18:16:45 2020 +1000

    Updated test to now test a helper function

commit c7a2716bb469eaab45de956b38bd9f821eaa6f0f
Author: Tom Stephens <@u6953044@anu.edu.au>
Date:   Sun May 3 18:04:37 2020 +1000

    Deliverable D2E

commit 8a68e8993cca1b43289a479dc2e552560598bf90
Author: Tom Stephens <@u6953044@anu.edu.au>
Date:   Sun May 3 18:03:12 2020 +1000

    Deliverable D2E

commit 08b1521a0d88f3553185be263a5066487be6cea4
Author: Tom Stephens <@u6953044@anu.edu.au>
Date:   Sun May 3 18:01:49 2020 +1000

    Deliverable D2E

commit 458ba0f7474663e551b72e0894555d77deed63a1
Author: Tom Stephens <@u6953044@anu.edu.au>
Date:   Sun May 3 18:00:13 2020 +1000

    Deliverable D2E

commit 5bc1c6049763364c1e44d1fe5120f2f473708ce2
Author: Tom Stephens <@u6953044@anu.edu.au>
Date:   Sun May 3 17:56:42 2020 +1000

    Updated Score.java with comments

commit 54215e680f350deee4ea50a8e95779689fc44418
Author: Tom Stephens <@u6953044@anu.edu.au>
Date:   Sun May 3 17:50:20 2020 +1000

    Added another test for task 7

commit 4e01ff9f39f7d9ff4abb0975b6285b4d2b6d123d
Author: Tom Stephens <@u6953044@anu.edu.au>
Date:   Fri May 1 16:40:30 2020 +1000

    Task 7 now passes all tests

commit aa8312bc7433d68ab834b46b689369d57aefda1d
Author: Tom Stephens <@u6953044@anu.edu.au>
Date:   Thu Apr 30 16:12:17 2020 +1000

    Finished the bulk of Task 7. Doesn't yet pass tests

commit 480f38a09c7ebdad930886c3a189a82272cfa0b9
Author: Tom Stephens <@u6953044@anu.edu.au>
Date:   Wed Apr 29 18:25:33 2020 +1000

    Added getTileAtStation method to Score.java

commit 9552fd6cf182d38a8972a1d5118da8dd3c968c71
Merge: d4cc40f b1bbe64
Author: Shiya Liu <u6783346@anu.edu.au>
Date:   Wed Apr 29 17:44:45 2020 +1000

    Merge branch 'feedback' of https://gitlab.cecs.anu.edu.au/u6953044/comp1110-ass2-tue10e

commit d4cc40fc550896396ad9f08bc99dfe7cac34031a
Author: Shiya Liu <u6783346@anu.edu.au>
Date:   Wed Apr 29 17:40:43 2020 +1000

    update feedback

commit ca7a37129e971adf0c90065d3679099d3c9f1bc3
Author: Tom Stephens <@u6953044@anu.edu.au>
Date:   Wed Apr 29 15:37:02 2020 +1000

    Added atStation method to Score.java

commit 535cdecccfaab7f33f32666604a032e3d0c1410b
Author: NanoA <u6671730@anu.edu.au>
Date:   Tue Apr 28 13:55:45 2020 +1000

    Updated D contributon/originality

commit cc582aba5b682dda8d6f1b5426c444ad959a2805
Author: NanoA <u6671730@anu.edu.au>
Date:   Tue Apr 28 13:50:12 2020 +1000

    Updated D contributon/originality

commit 3244f4ac1e6020e7f492a0cf6724a7032281bf43
Author: NanoA <u6671730@anu.edu.au>
Date:   Tue Apr 28 13:49:02 2020 +1000

    Updated D contributon/originality

commit 2499f8e2af9121519e91a30b94cfc7e7bcaa7581
Author: Tom Stephens <@u6953044@anu.edu.au>
Date:   Mon Apr 27 12:01:37 2020 +1000

    Deliverable D2D

commit e7f367bf7872fcc591bfe22564840d0311b078a8
Author: Tom Stephens <@u6953044@anu.edu.au>
Date:   Mon Apr 27 12:01:09 2020 +1000

    Updated Score and Viewer for deliverable D

commit 4af4e1842d02c932f71c3cd6ec8f9b237ae568c1
Author: Tom Stephens <@u6953044@anu.edu.au>
Date:   Mon Apr 27 11:59:56 2020 +1000

    Updated Score for deliverable D

commit fb2def9333b6374ae7ebe72fccbdca5f36ef2523
Author: Tom Stephens <@u6953044@anu.edu.au>
Date:   Mon Apr 27 11:43:04 2020 +1000

    added 2 new helper methods to help follow a track through the board

commit 08a01cd47e7404804df7952e7ba062999f6e4821
Author: Kaushal <kaushal.sharma@anu.edu.au>
Date:   Mon Apr 27 09:31:18 2020 +1000

    Renamed and Updated D-newcode-u1234567.md and D-originality-u1234567.yml

commit b3194b13d6bdb5adac85349cb5359b9323ca2e7d
Merge: 31a8d18 8afdc24
Author: Kaushal <kaushal.sharma@anu.edu.au>
Date:   Mon Apr 27 09:08:08 2020 +1000

    Merge branch 'master' of https://gitlab.cecs.anu.edu.au/u6953044/comp1110-ass2-tue10e

commit 31a8d18ed25333e60e84977eb9eb22ccd5240bdb
Author: Kaushal <kaushal.sharma@anu.edu.au>
Date:   Mon Apr 27 09:07:21 2020 +1000

    Updated C-originality.yml

commit 595c1d93184e28c59e016c39959b572d3b4606fd
Merge: d16e4d3 b541bcf
Author: Kaushal <kaushal.sharma@anu.edu.au>
Date:   Sat Apr 25 12:07:54 2020 +1000

    Merge branch 'master' of https://gitlab.cecs.anu.edu.au/comp1110/comp1110-ass2

commit b541bcf1225337f12c354b9501076ad05680999a
Author: Josh Milthorpe <josh.milthorpe@anu.edu.au>
Date:   Fri Apr 24 18:47:28 2020 +1000

    add new admin files for new individual code for D2D and D2E

commit e2e6899ca1afbe444edf99101010b40b95c39ca6
Author: Josh Milthorpe <josh.milthorpe@anu.edu.au>
Date:   Fri Apr 24 18:37:05 2020 +1000

    remove hand parameter from Metro.generateMove
    
    This was not actually tested in the unit tests, and the way it was described was
    inconsistent with the rules of the game.
    Thanks for Evan Markou for noticing this.

commit b1bbe6423cf95cf7969942591f9428c002ef1726
Author: Shiya Liu <shiya.liu@anu.edu.au>
Date:   Fri Apr 24 13:59:14 2020 +1000

    Update feedbackD2C.md

commit b3039b033468fe4f8ee98ce807b74bf19c103fb8
Author: Shiya Liu <u6783346@anu.edu.au>
Date:   Fri Apr 24 02:11:03 2020 +1000

    update feedback

commit 8afdc2456698973de1f48046e7d66ac0102f9007
Author: Tom Stephens <@u6953044@anu.edu.au>
Date:   Tue Apr 21 18:54:00 2020 +1000

    added 2 new helper methods to help follow a track through the board

commit d16e4d33225526cbb69581cb66c3e95d241bc548
Author: NanoA <u6671730@anu.edu.au>
Date:   Mon Apr 20 16:17:35 2020 +1000

    Updated C contributon/originality

commit 8a3bcdcc532fcc669dd035189dde99085d11e3ea
Author: Tom Stephens <@u6953044@anu.edu.au>
Date:   Sun Apr 19 16:50:53 2020 +1000

    updated C-contribution

commit 5ef7babfc8226cf6738a072232c4223b9d7902c5
Author: Kaushal <kaushal.sharma@anu.edu.au>
Date:   Sun Apr 19 15:19:56 2020 +1000

    Updated C-originality.yml and C-contribution.yml

commit d9a39127c383218e54913ee66d972d92efa2c001
Author: Tom Stephens <@u6953044@anu.edu.au>
Date:   Sun Apr 19 14:56:38 2020 +1000

    removed some unnecessary code and added a label for the tile in the players hand

commit 15ea565dad34f9e9b242c3a3641e03bfc7937cfe
Author: Tom Stephens <@u6953044@anu.edu.au>
Date:   Sun Apr 19 14:45:24 2020 +1000

    Added a "Pick up Tile" button (just picks up the top of the deck for now)

commit 92e005c649e7e921c7821f8948162a7580dc7a63
Author: Tom Stephens <@u6953044@anu.edu.au>
Date:   Sat Apr 18 17:38:59 2020 +1000

    C - originality statement

commit 19756c0456c4fc80a155e0650b7522b5c068b97e
Author: Tom Stephens <@u6953044@anu.edu.au>
Date:   Sat Apr 18 17:20:08 2020 +1000

    Changed a few messages to make the game easier to understand for the player

commit 20ce567603ae1ed3a35e637877e46fb33887f50c
Author: Tom Stephens <@u6953044@anu.edu.au>
Date:   Sat Apr 18 17:10:16 2020 +1000

    Changed some of the messages given to the players

commit f7a3b9e5599ea03da5ad733cd37ba3cd3ff6fb7a
Merge: c8795e4 339e628
Author: Tom Stephens <@u6953044@anu.edu.au>
Date:   Fri Apr 17 11:51:04 2020 +1000

    Merge branch 'master' of https://gitlab.cecs.anu.edu.au/u6953044/comp1110-ass2-tue10e

commit c8795e468e4acf0ffeff77d4d1a0ab48a06cf0e9
Author: Tom Stephens <@u6953044@anu.edu.au>
Date:   Fri Apr 17 11:50:43 2020 +1000

    fixed typo

commit 339e628c343f5e048ef7a36a1753c0c3315916a9
Merge: d2a0ce6 5383757
Author: Kaushal <kaushal.sharma@anu.edu.au>
Date:   Fri Apr 17 11:49:16 2020 +1000

    Merge remote-tracking branch 'origin/master'

commit d2a0ce60f6a623a5e758848f013ecbb42d9d1cee
Author: Kaushal <kaushal.sharma@anu.edu.au>
Date:   Fri Apr 17 11:48:02 2020 +1000

    Completed Task 6 and Updated Board.java

commit 5383757f15bb071faa8407c94a3d549dd7e29002
Author: Tom Stephens <@u6953044@anu.edu.au>
Date:   Fri Apr 17 11:47:45 2020 +1000

    fixed typo

commit f5c36f91cbeb14375893c873664921149cae46ca
Author: Tom Stephens <@u6953044@anu.edu.au>
Date:   Fri Apr 17 10:39:12 2020 +1000

    Edited some comments slightly - nothing major

commit 306688e9a8af02a73c4d07d1a8e845d705c673ed
Merge: 4aed73a b44d4aa
Author: Kaushal <kaushal.sharma@anu.edu.au>
Date:   Thu Apr 16 23:06:14 2020 +1000

    Merge branch 'master' of https://gitlab.cecs.anu.edu.au/comp1110/comp1110-ass2

commit b44d4aa3a6e23fa21d008973161d4d34d4f2b018
Author: Josh Milthorpe <josh.milthorpe@anu.edu.au>
Date:   Tue Apr 14 09:12:21 2020 +1000

    IsPlacementSequenceValidTest: fix to one test for Rule 4 (was testing a different rule)
    
    GenerateMoveTest: fix two incorrect 'possible moves'
    
    Thanks to Zhichao Tu and Tian Wu for finding these bugs!

commit 4aed73ac428acd9b1098f911381c82e49e476ce4
Author: Kaushal <kaushal.sharma@anu.edu.au>
Date:   Tue Apr 14 08:57:54 2020 +1000

    Edited the Viewer.java file. Created a template for the Viewer.java. And just a basic demo, that accepts number of players and display the initial stage of Board. Also updated the skeleton of files Move.java and Player.java.

commit 549a77feedd4663ea08f4a559abc4f09e3300af5
Author: Kaushal <kaushal.sharma@anu.edu.au>
Date:   Mon Apr 13 16:42:54 2020 +1000

    Completed Task 5 with comments

commit 57703aee0a4256dd0dd3e9ead1969d7c207cd35c
Author: Kaushal <kaushal.sharma@anu.edu.au>
Date:   Thu Apr 9 05:12:51 2020 +1000

    Updated with comments and Moved the functionality for Task 2 and Task 3 form Metro.java to Move.java in new functions

commit e4adcc72dd7086642bdc7b35b46c2ba74307a098
Author: Kaushal <kaushal.sharma@anu.edu.au>
Date:   Thu Apr 9 03:38:39 2020 +1000

    Completed the Task 2 and Task 3.

commit 46173d0130f9c79a8cdd1be99b6ce790fbbd1bc9
Author: Tom Stephens <@u6953044@anu.edu.au>
Date:   Tue Mar 31 11:44:57 2020 +1100

    Cindy

commit 9be951b5835a591ca168aca82ea273e255b942f9
Merge: e7b0d9e 063949b
Author: Kaushal <kaushal.sharma@anu.edu.au>
Date:   Tue Mar 31 11:43:28 2020 +1100

    Merge remote-tracking branch 'origin/master'
    
    # Conflicts:
    #       src/comp1110/ass2/gittest/Main.java

commit e7b0d9eda297547a3a5cc4a56da27cfa058bfcaf
Author: Kaushal <kaushal.sharma@anu.edu.au>
Date:   Tue Mar 31 11:41:15 2020 +1100

    Changes in Main.java with B

commit 063949b57d427ae38e4795e05b980012c85a83b1
Author: Tom Stephens <@u6953044@anu.edu.au>
Date:   Tue Mar 31 11:38:25 2020 +1100

    Alice

commit 3af2a4b0bf898cfa1a39953186b47a2009f4ee54
Author: Kaushal <kaushal.sharma@anu.edu.au>
Date:   Tue Mar 31 11:32:58 2020 +1100

    Updated in Class B with Branching.

commit fdcc745d8fafd6aee4ca9d622fe93ba2c832a27d
Author: Tom Stephens <@u6953044@anu.edu.au>
Date:   Tue Mar 31 11:31:36 2020 +1100

    Cindy

commit 147e00a47c87564f5cd6720ad8dd8241c65fa147
Merge: a756760 e519a7d
Author: Tom Stephens <@u6953044@anu.edu.au>
Date:   Tue Mar 31 11:30:03 2020 +1100

    Merge remote-tracking branch 'origin/master'

commit a756760ba9a8f5c02160dd199b629480edf2f376
Author: Tom Stephens <@u6953044@anu.edu.au>
Date:   Tue Mar 31 11:29:37 2020 +1100

    Cindy

commit 7629b48414147e9a9ad5ab56a07ecb07f12af07a
Merge: c831726 66e4797
Author: Tom Stephens <@u6953044@anu.edu.au>
Date:   Tue Mar 31 11:27:58 2020 +1100

    Merge branch 'master' of https://gitlab.cecs.anu.edu.au/u6953044/comp1110-ass2-tue10e

commit c831726e5770c69c342644ca071e9047af11e7a9
Author: Tom Stephens <@u6953044@anu.edu.au>
Date:   Tue Mar 31 11:27:35 2020 +1100

    Cindy

commit e519a7d1a7b36c8d3f88be5e7dea06f7b6eaa955
Author: Kaushal <kaushal.sharma@anu.edu.au>
Date:   Tue Mar 31 11:27:23 2020 +1100

    Created Class B

commit 66e47971e882d0f88ede8c0891c8f7209dfe12bd
Author: Kaushal <kaushal.sharma@anu.edu.au>
Date:   Tue Mar 31 11:21:48 2020 +1100

    Updated Board and Move Class with some comments.

commit 4639bceedb1443f6a22bdd92d75146379584ba3e
Author: Tom Stephens <@u6953044@anu.edu.au>
Date:   Tue Mar 31 11:20:14 2020 +1100

    Added Kyle to contribution

commit dd4f0322d14a680037d034f84ad06f50ce80c267
Author: Tom Stephens <@u6953044@anu.edu.au>
Date:   Tue Mar 31 11:18:37 2020 +1100

    Alice

commit 0a80cb489b28dc9318bdf17d37ac5c7b03d561d2
Author: Tom Stephens <@u6953044@anu.edu.au>
Date:   Tue Mar 31 10:39:39 2020 +1100

    changed a variable name to totalHands to match the variable in Metro
    removed an unneeded variable from drawFromDeck

commit ba8a6334b4b8e06f3c47604a2458d67fc238d2cf
Merge: 30ec1c7 8c09292
Author: Kaushal <kaushal.sharma@anu.edu.au>
Date:   Tue Mar 31 10:18:13 2020 +1100

    Merge branch 'master' of https://gitlab.cecs.anu.edu.au/u6953044/comp1110-ass2-tue10e

commit 30ec1c7cb91e7f81e65b8488691f3d3a0b713642
Author: Kaushal <kaushal.sharma@anu.edu.au>
Date:   Tue Mar 31 10:17:23 2020 +1100

    Updated Players, Tile and Board Class with some comments and a little bit of functionality.

commit 8c09292190a5377e3a57256cf43f9158b810abd4
Author: Shiya Liu <u6783346@anu.edu.au>
Date:   Tue Mar 31 02:02:14 2020 +1100

    update feedback for D2B

commit 09781cd3c449a6f56ea4976ddd9868321b38dc4d
Author: Tom Stephens <@u6953044@anu.edu.au>
Date:   Mon Mar 30 14:23:23 2020 +1100

    Updated using upstream pull

commit 08e239f81db729ed6db5b5bc38b193fd2f5e376d
Author: Tom Stephens <@u6953044@anu.edu.au>
Date:   Mon Mar 30 14:17:39 2020 +1100

    Updated using upstream pull

commit 0124e45359f4064266675b49522c132c849393a4
Author: Tom Stephens <@u6953044@anu.edu.au>
Date:   Mon Mar 30 14:06:10 2020 +1100

    Updated using upstream pull

commit bab2a9325ad41c7b1d2f064cc29b6260618bd8f6
Merge: ba245be 1f98ca5
Author: Tom Stephens <@u6953044@anu.edu.au>
Date:   Mon Mar 30 14:03:45 2020 +1100

    Merge branch 'master' of https://gitlab.cecs.anu.edu.au/comp1110/comp1110-ass2

commit 1f98ca505f018a3c563965e257ecaf768a305676
Author: Josh Milthorpe <josh.milthorpe@anu.edu.au>
Date:   Fri Mar 27 22:33:20 2020 +1100

    Task 5: add new parameter totalHands to Metro.drawFromDeck() to represent tiles in player hands
    
    Task 6: fix an incorrect test board string and documentation for Metro.isPlacementSequenceValid

commit ba245bee6d35fe6d0456bc49c03965e17553cf31
Author: Tom Stephens <@u6953044@anu.edu.au>
Date:   Tue Mar 24 14:45:09 2020 +1100

    Added comment

commit f5a4fd3a84a76c226823a679a715494524cae6c7
Author: Tom Stephens <@u6953044@anu.edu.au>
Date:   Tue Mar 24 14:41:26 2020 +1100

    Added an array that will represent the innitial deck

commit ddd4b6ce78f2a60f0bbd64ab2e04bceff7bcae94
Author: Tom Stephens <@u6953044@anu.edu.au>
Date:   Tue Mar 24 14:35:24 2020 +1100

    Added some comments that outline how Task 5 might function

commit 290baa4592faedab0ff88ef751bd88276fabfcbf
Author: Tom Stephens <@u6953044@anu.edu.au>
Date:   Tue Mar 24 14:34:47 2020 +1100

    Added a currentHand to the player class which tracks the tile that the player is currently holding

commit 17a0900365bb7b397bd0f3ee79443ed8d8fcd84d
Author: Josh Milthorpe <josh.milthorpe@anu.edu.au>
Date:   Fri Mar 20 20:48:51 2020 +1100

    fixes to README including correct enumeration of player stations

commit 1728e18ef5db2e514ab97223e8ab2cd7353b499e
Author: NanoA <u6671730@anu.edu.au>
Date:   Thu Mar 19 12:23:26 2020 +1100

    Updated Part B

commit 8ce412575f5e3e98170974dca5f1405d28c76929
Author: Kaushal <kaushal.sharma@anu.edu.au>
Date:   Thu Mar 19 12:22:17 2020 +1100

    Updated the Contact info in originality

commit a5c772ce380f4c55d197a0ddff0948befae5fb93
Merge: 44ee629 5758723
Author: Kaushal <kaushal.sharma@anu.edu.au>
Date:   Thu Mar 19 12:20:58 2020 +1100

    Merge remote-tracking branch 'origin/master'

commit 44ee629c4a9686397fba72d60fc192a5ad590909
Author: Kaushal <kaushal.sharma@anu.edu.au>
Date:   Thu Mar 19 12:20:23 2020 +1100

    Updated the Contact info in contributions.yml

commit 5758723400d57ab66c4620db9834d933729c5f27
Author: Tom Stephens <@u6953044@anu.edu.au>
Date:   Thu Mar 19 12:18:42 2020 +1100

    Updated originality

commit 2a8df4fd73c523335cc68dafb3f987ae2b140841
Merge: 410bc85 b8b2cf1
Author: Tom Stephens <@u6953044@anu.edu.au>
Date:   Thu Mar 19 12:18:13 2020 +1100

    Merge branch 'master' of https://gitlab.cecs.anu.edu.au/u6953044/comp1110-ass2-tue10e

commit b8b2cf16d8c36865cd6c5450086790e09551d736
Author: Kaushal <kaushal.sharma@anu.edu.au>
Date:   Thu Mar 19 12:18:12 2020 +1100

    Updated the Contact info in contributions.yml

commit 410bc8570a039bec9122c07147dae0de36c3aec1
Author: Tom Stephens <@u6953044@anu.edu.au>
Date:   Thu Mar 19 12:17:51 2020 +1100

    Updated originality

commit 528dd6d86db982c94724ad84aba1aeb7ad8114bb
Author: Tom Stephens <@u6953044@anu.edu.au>
Date:   Thu Mar 19 12:16:24 2020 +1100

    Updated contribution

commit 4a122ced1aafddd65c936004f2ffb43e544f2fc0
Author: Tom Stephens <@u6953044@anu.edu.au>
Date:   Thu Mar 19 12:11:59 2020 +1100

    Added Tile and Score class and some ideas for methods they might use

commit 63a4ee169fae357db5a5e664c490f6f015711c61
Author: Tom Stephens <@u6953044@anu.edu.au>
Date:   Thu Mar 19 12:11:28 2020 +1100

    Added Player class and some ideas for methods it might use

commit f38b26a862d826f478c77af12e53357e03d6e285
Author: Tom Stephens <@u6953044@anu.edu.au>
Date:   Thu Mar 19 12:11:11 2020 +1100

    Added Player class and some ideas for methods it might use

commit 2bee42cf85f29547b4e0fe1a5c5b308c4a015587
Author: Tom Stephens <@u6953044@anu.edu.au>
Date:   Thu Mar 19 12:07:21 2020 +1100

    Added Score class and some ideas for methods it might use

commit c19a4be52dda04d467a781b4f2ee3940b3b14a33
Author: Tom Stephens <@u6953044@anu.edu.au>
Date:   Thu Mar 19 12:05:59 2020 +1100

    Added Move class and some ideas for methods it might use

commit 7d72ecd1a3a87c79d0cbff4c9c189dae2487e187
Author: Tom Stephens <@u6953044@anu.edu.au>
Date:   Thu Mar 19 12:05:47 2020 +1100

    Added Move class and some ideas for methods it might use

commit 7753721d4e7e7d55b462575db11a969f9ab4f268
Author: Tom Stephens <@u6953044@anu.edu.au>
Date:   Thu Mar 19 12:05:32 2020 +1100

    Added Move class and some ideas for methods it might use

commit 4ff1e429b408d243c0d40690de549f7233e17cd2
Author: Tom Stephens <@u6953044@anu.edu.au>
Date:   Thu Mar 19 12:01:38 2020 +1100

    Added Board class and some ideas for methods it might use

commit bd31959be7c42b6878ce1d980e3f62bddea65681
Author: NanoA <u6671730@anu.edu.au>
Date:   Wed Mar 18 17:05:22 2020 +1100

    Updated Contact info in members

commit 257ed4e97826bfa83e7daaa730b1c3a2270628cd
Author: Kaushal <kaushal.sharma@anu.edu.au>
Date:   Tue Mar 17 10:29:20 2020 +1100

    Updated the Contact info in members.yml

commit 187a8d5a3bfda5737aeb400abec647090a70f1f1
Author: u6953044 <u6953044@anu.edu.au>
Date:   Tue Mar 17 10:27:59 2020 +1100

    Added my Name

commit 9764e64113a3dc262e3bc1c41804c538f52abc2d
Author: Josh Milthorpe <josh.milthorpe@anu.edu.au>
Date:   Tue Mar 17 09:26:52 2020 +1100

    Initial commit
```
## Changes
``` diff
Only in comp1110-ass2/.idea: artifacts
diff -ru -x .git ../master/comp1110-ass2/.idea/modules.xml comp1110-ass2/.idea/modules.xml
--- ../master/comp1110-ass2/.idea/modules.xml	2020-06-08 13:56:27.677860200 +1000
+++ comp1110-ass2/.idea/modules.xml	2020-06-08 14:00:46.257559800 +1000
@@ -5,4 +5,4 @@
       <module fileurl="file://$PROJECT_DIR$/comp1110-ass2.iml" filepath="$PROJECT_DIR$/comp1110-ass2.iml" />
     </modules>
   </component>
-</project>
+</project>
\ No newline at end of file
Only in ../master/comp1110-ass2/.idea/runConfigurations: Viewer.xml
diff -ru -x .git ../master/comp1110-ass2/admin/B-contribution.yml comp1110-ass2/admin/B-contribution.yml
--- ../master/comp1110-ass2/admin/B-contribution.yml	2020-06-08 13:56:27.690865300 +1000
+++ comp1110-ass2/admin/B-contribution.yml	2020-06-08 14:00:46.267533700 +1000
@@ -8,19 +8,19 @@
 # be 100 or 99 (33/33/33 is fine).  (Remove entries if you have fewer than three
 # members).  
 contributions:
-  - uid: 
-    contribution: 
-  - uid:
-    contribution:
-  - uid:
-    contribution:
+  - uid: u6953044
+    contribution: 33
+  - uid: u7028766
+    contribution: 33
+  - uid: u6671630
+    contribution: 33
 
 # Sign *your* name and uids here. (Remove entries if you have fewer
 # than three members)
 signatures:
-  - name:
-    uid:
-  - name:
-    uid:
-  - name:
-    uid:
\ No newline at end of file
+  - name: Tom Stephens
+    uid: u6953044
+  - name: Kaushal Sharma
+    uid: u7028766
+  - name: Kyle Robertson
+    uid: u6671630
\ No newline at end of file
diff -ru -x .git ../master/comp1110-ass2/admin/B-originality.yml comp1110-ass2/admin/B-originality.yml
--- ../master/comp1110-ass2/admin/B-originality.yml	2020-06-08 13:56:27.691827700 +1000
+++ comp1110-ass2/admin/B-originality.yml	2020-06-08 14:00:46.268531400 +1000
@@ -14,45 +14,12 @@
   and all stages before it is entirely our own work, with the following
   exceptions:
 
-# Use this to list names of people who you collaborated with, and a
-# comment about what you collaborated on.
-#
-# Add as many "name+comment" entries as necessary
-# (or remove it altogether if you haven't collaborated with anyone)
-collaboration:
-  - name:
-    comment: >-
-
-# Use this to list any code that you used that you did not write,
-# aside from code provided by the lecturer.  Provide a comment
-# explaining your use and the URL to that code and the licence for
-# that code
-#
-# Add as many "url+licence+comment" entries as necessary
-# (or remove it altogether if you haven't used any external code)
-code:
-  - comment:
-    url:
-    licence:
-
-# Use this to list any assets (artwork, sound, etc) that you used.
-# Provide a comment explaining your use of that asset and the URL
-# and license for the asset
-#
-# Add as many "url+licence+comment" entries as necessary
-# (or remove it altogether if you haven't used any external assets)
-assets:
-  - comment:
-    url:
-    licence:
-
-
 # Sign *your* name and uids here. (Remove entries if you have fewer
 # than three members.)
 signatures:
-  - name:
-    uid:
-  - name:
-    uid:
-  - name:
-    uid:
+  - name: Tom Stephens
+    uid: u6953044
+  - name: Kaushal Sharma
+    uid: u7028766
+  - name: Kyle Robertson
+    uid: u6671630
diff -ru -x .git ../master/comp1110-ass2/admin/C-contribution.yml comp1110-ass2/admin/C-contribution.yml
--- ../master/comp1110-ass2/admin/C-contribution.yml	2020-06-08 13:56:27.693817800 +1000
+++ comp1110-ass2/admin/C-contribution.yml	2020-06-08 14:00:46.269528600 +1000
@@ -8,19 +8,19 @@
 # be 100 or 99 (33/33/33 is fine).  (Remove entries if you have fewer than three
 # members).  
 contributions:
-  - uid: 
-    contribution: 
-  - uid:
-    contribution:
-  - uid:
-    contribution:
+  - uid: u6953044
+    contribution: 33
+  - uid: u7028766
+    contribution: 33
+  - uid: u6671630
+    contribution: 33
 
 # Sign *your* name and uids here. (Remove entries if you have fewer
 # than three members)
 signatures:
-  - name:
-    uid:
-  - name:
-    uid:
-  - name:
-    uid:
\ No newline at end of file
+  - name: Tom Stephens
+    uid: u6953044
+  - name: Kaushal Sharma
+    uid: u7028766
+  - name: Kyle Robertson
+    uid: u6671630
\ No newline at end of file
diff -ru -x .git ../master/comp1110-ass2/admin/C-originality.yml comp1110-ass2/admin/C-originality.yml
--- ../master/comp1110-ass2/admin/C-originality.yml	2020-06-08 13:56:27.695033400 +1000
+++ comp1110-ass2/admin/C-originality.yml	2020-06-08 14:00:46.270525500 +1000
@@ -14,45 +14,12 @@
   and all stages before it is entirely our own work, with the following
   exceptions:
 
-# Use this to list names of people who you collaborated with, and a
-# comment about what you collaborated on.
-#
-# Add as many "name+comment" entries as necessary
-# (or remove it altogether if you haven't collaborated with anyone)
-collaboration:
-  - name:
-    comment: >-
-
-# Use this to list any code that you used that you did not write,
-# aside from code provided by the lecturer.  Provide a comment
-# explaining your use and the URL to that code and the licence for
-# that code
-#
-# Add as many "url+licence+comment" entries as necessary
-# (or remove it altogether if you haven't used any external code)
-code:
-  - comment:
-    url:
-    licence:
-
-# Use this to list any assets (artwork, sound, etc) that you used.
-# Provide a comment explaining your use of that asset and the URL
-# and license for the asset
-#
-# Add as many "url+licence+comment" entries as necessary
-# (or remove it altogether if you haven't used any external assets)
-assets:
-  - comment:
-    url:
-    licence:
-
-
 # Sign *your* name and uids here. (Remove entries if you have fewer
 # than three members.)
 signatures:
-  - name:
-    uid:
-  - name:
-    uid:
-  - name:
-    uid:
+  - name: Tom Stephens
+    uid: u6953044
+  - name: Kaushal Sharma
+    uid: u7028766
+  - name: Kyle Robertson
+    uid: u6671630
Only in ../master/comp1110-ass2/admin: D-newcode-u1234567.md
Only in comp1110-ass2/admin: D-newcode-u6671630.md
Only in comp1110-ass2/admin: D-newcode-u6953044.md
Only in comp1110-ass2/admin: D-newcode-u7028766.md
Only in ../master/comp1110-ass2/admin: D-originality-u1234567.yml
Only in comp1110-ass2/admin: D-originality-u6671630.yml
Only in comp1110-ass2/admin: D-originality-u6953044.yml
Only in comp1110-ass2/admin: D-originality-u7028766.yml
Only in ../master/comp1110-ass2/admin: E-newcode-u1234567.md
Only in comp1110-ass2/admin: E-newcode-u6671630.md
Only in comp1110-ass2/admin: E-newcode-u6953044.md
Only in comp1110-ass2/admin: E-newcode-u7028766.md
Only in ../master/comp1110-ass2/admin: E-originality-u1234567.yml
Only in comp1110-ass2/admin: E-originality-u6671630.yml
Only in comp1110-ass2/admin: E-originality-u6953044.yml
Only in comp1110-ass2/admin: E-originality-u7028766.yml
diff -ru -x .git ../master/comp1110-ass2/admin/F-contribution.yml comp1110-ass2/admin/F-contribution.yml
--- ../master/comp1110-ass2/admin/F-contribution.yml	2020-06-08 13:56:27.699806600 +1000
+++ comp1110-ass2/admin/F-contribution.yml	2020-06-08 14:00:46.279502100 +1000
@@ -8,19 +8,19 @@
 # be 100 or 99 (33/33/33 is fine).  (Remove entries if you have fewer than three
 # members).  
 contributions:
-  - uid: 
-    contribution: 
-  - uid:
-    contribution:
-  - uid:
-    contribution:
+  - uid: u6953044
+    contribution: 33
+  - uid: u6671630
+    contribution: 33
+  - uid: u7028766
+    contribution: 33
 
 # Sign *your* name and uids here. (Remove entries if you have fewer
 # than three members)
 signatures:
-  - name:
-    uid:
-  - name:
-    uid:
-  - name:
-    uid:
\ No newline at end of file
+  - name: Tom Stephens
+    uid: u6953044
+  - name: Kyle Robertson
+    uid: u6671630
+  - name: Kaushal Sharma
+    uid: u7028766
\ No newline at end of file
diff -ru -x .git ../master/comp1110-ass2/admin/F-originality.yml comp1110-ass2/admin/F-originality.yml
--- ../master/comp1110-ass2/admin/F-originality.yml	2020-06-08 13:56:27.700802400 +1000
+++ comp1110-ass2/admin/F-originality.yml	2020-06-08 14:00:46.280834400 +1000
@@ -14,45 +14,13 @@
   and all stages before it is entirely our own work, with the following
   exceptions:
 
-# Use this to list names of people who you collaborated with, and a
-# comment about what you collaborated on.
-#
-# Add as many "name+comment" entries as necessary
-# (or remove it altogether if you haven't collaborated with anyone)
-collaboration:
-  - name:
-    comment: >-
-
-# Use this to list any code that you used that you did not write,
-# aside from code provided by the lecturer.  Provide a comment
-# explaining your use and the URL to that code and the licence for
-# that code
-#
-# Add as many "url+licence+comment" entries as necessary
-# (or remove it altogether if you haven't used any external code)
-code:
-  - comment:
-    url:
-    licence:
-
-# Use this to list any assets (artwork, sound, etc) that you used.
-# Provide a comment explaining your use of that asset and the URL
-# and license for the asset
-#
-# Add as many "url+licence+comment" entries as necessary
-# (or remove it altogether if you haven't used any external assets)
-assets:
-  - comment:
-    url:
-    licence:
-
 
 # Sign *your* name and uids here. (Remove entries if you have fewer
 # than three members.)
 signatures:
-  - name:
-    uid:
-  - name:
-    uid:
-  - name:
-    uid:
+  - name: Tom Stephens
+    uid: u6953044
+  - name: Kyle Robertson
+    uid: u6671630
+  - name: Kaushal Sharma
+    uid: u7028766
Only in ../master/comp1110-ass2/admin: F-review-u1234567.yml
Only in comp1110-ass2/admin: F-review-u6671630.yml
Only in comp1110-ass2/admin: F-review-u6953044.yml
Only in comp1110-ass2/admin: F-review-u7028766.yml
Only in ../master/comp1110-ass2/admin: G-best-u1234567.yml
Only in comp1110-ass2/admin: G-best-u6671630.yml
Only in comp1110-ass2/admin: G-best-u6953044.yml
Only in comp1110-ass2/admin: G-best-u7028766.yml
diff -ru -x .git ../master/comp1110-ass2/admin/G-contribution.yml comp1110-ass2/admin/G-contribution.yml
--- ../master/comp1110-ass2/admin/G-contribution.yml	2020-06-08 13:56:27.704790200 +1000
+++ comp1110-ass2/admin/G-contribution.yml	2020-06-08 14:00:46.285486200 +1000
@@ -2,7 +2,7 @@
 # statement.
  
 declaration: >-
-  Stage G represents the culmunation of the entire assignment.  We declare that
+  Stage G represents the culmination of the entire assignment.  We declare that
   the work toward our submission for all stages of this assignment was
   distributed among the group members as follows:
 
@@ -10,19 +10,19 @@
 # be 100 or 99 (33/33/33 is fine).  (Remove entries if you have fewer than three
 # members).
 contributions:
-  - uid: 
-    contribution: 
-  - uid:
-    contribution:
-  - uid:
-    contribution:
+  - uid: u6953044
+    contribution: 33
+  - uid: u6671630
+    contribution: 33
+  - uid: u7028766
+    contribution: 33
 
 # Sign *your* name and uids here. (Remove entries if you have fewer
 # than three members)
 signatures:
-  - name:
-    uid:
-  - name:
-    uid:
-  - name:
-    uid:
+  - name: Tom Stephens
+    uid: u6953044
+  - name: Kyle Robertson
+    uid: u6671630
+  - name: Kaushal Sharma
+    uid: u7028766
diff -ru -x .git ../master/comp1110-ass2/admin/G-features.md comp1110-ass2/admin/G-features.md
--- ../master/comp1110-ass2/admin/G-features.md	2020-06-08 13:56:27.705788200 +1000
+++ comp1110-ass2/admin/G-features.md	2020-06-08 14:00:46.286483500 +1000
@@ -7,6 +7,7 @@
  - A basic playable game
  - A basic playable game that snaps pieces to the board and checks for validity (Task 9)
  - Computes a score for the game (Task 8)
- - Playable against a computer opponent (Task 11)
 
 additional features...
+
+ - Playable against a computer opponent (Task 10)
diff -ru -x .git ../master/comp1110-ass2/admin/G-originality.yml comp1110-ass2/admin/G-originality.yml
--- ../master/comp1110-ass2/admin/G-originality.yml	2020-06-08 13:56:27.706785400 +1000
+++ comp1110-ass2/admin/G-originality.yml	2020-06-08 14:00:46.287480500 +1000
@@ -10,49 +10,16 @@
 #
 
 declaration: >-
-  Stage G represents the culmunation of the entire assignment.  We declare that
+  Stage G represents the culmination of the entire assignment.  We declare that
   everything we have submitted for for all stages of this assignment was
   entirely our own work, with the following exceptions:
 
-# Use this to list names of people who you collaborated with, and a
-# comment about what you collaborated on.
-#
-# Add as many "name+comment" entries as necessary
-# (or remove it altogether if you haven't collaborated with anyone)
-collaboration:
-  - name:
-    comment: >-
-
-# Use this to list any code that you used that you did not write,
-# aside from code provided by the lecturer.  Provide a comment
-# explaining your use and the URL to that code and the licence for
-# that code
-#
-# Add as many "url+licence+comment" entries as necessary
-# (or remove it altogether if you haven't used any external code)
-code:
-  - comment:
-    url:
-    licence:
-
-# Use this to list any assets (artwork, sound, etc) that you used.
-# Provide a comment explaining your use of that asset and the URL
-# and license for the asset
-#
-# Add as many "url+licence+comment" entries as necessary
-# (or remove it altogether if you haven't used any external assets)
-assets:
-  - comment:
-    url:
-    licence:
-
-
 # Sign *your* name and uids here. (Remove entries if you have fewer
 # than three members.)
 signatures:
-  - name:
-    uid:
-  - name:
-    uid:
-  - name:
-    uid:
+  - name: Tom Stephens
+    uid: u6953044
+  - name: Kyle Robertson
+    uid: u6671630
+  - name: Kaushal Sharma
+    uid: u7028766
diff -ru -x .git ../master/comp1110-ass2/admin/H-contribution.yml comp1110-ass2/admin/H-contribution.yml
--- ../master/comp1110-ass2/admin/H-contribution.yml	2020-06-08 13:56:27.707786500 +1000
+++ comp1110-ass2/admin/H-contribution.yml	2020-06-08 14:00:46.288477400 +1000
@@ -8,19 +8,19 @@
 # be 100 or 99 (33/33/33 is fine).  (Remove entries if you have fewer than three
 # members).  
 contributions:
-  - uid: 
-    contribution: 
-  - uid:
-    contribution:
-  - uid:
-    contribution:
+  - uid: u6953044
+    contribution: 33
+  - uid: u6671630
+    contribution: 33
+  - uid: u7028766
+    contribution: 33
 
 # Sign *your* name and uids here. (Remove entries if you have fewer
 # than three members)
 signatures:
-  - name:
-    uid:
-  - name:
-    uid:
-  - name:
-    uid:
\ No newline at end of file
+  - name: Tom Stephens
+    uid: u6953044
+  - name: Kyle Robertson
+    uid: u6671630
+  - name: Kaushal Sharma
+    uid: u7028766
\ No newline at end of file
diff -ru -x .git ../master/comp1110-ass2/admin/H-originality.yml comp1110-ass2/admin/H-originality.yml
--- ../master/comp1110-ass2/admin/H-originality.yml	2020-06-08 13:56:27.708780600 +1000
+++ comp1110-ass2/admin/H-originality.yml	2020-06-08 14:00:46.288477400 +1000
@@ -14,45 +14,12 @@
   and all stages before it is entirely our own work, with the following
   exceptions:
 
-# Use this to list names of people who you collaborated with, and a
-# comment about what you collaborated on.
-#
-# Add as many "name+comment" entries as necessary
-# (or remove it altogether if you haven't collaborated with anyone)
-collaboration:
-  - name:
-    comment: >-
-
-# Use this to list any code that you used that you did not write,
-# aside from code provided by the lecturer.  Provide a comment
-# explaining your use and the URL to that code and the licence for
-# that code
-#
-# Add as many "url+licence+comment" entries as necessary
-# (or remove it altogether if you haven't used any external code)
-code:
-  - comment:
-    url:
-    licence:
-
-# Use this to list any assets (artwork, sound, etc) that you used.
-# Provide a comment explaining your use of that asset and the URL
-# and license for the asset
-#
-# Add as many "url+licence+comment" entries as necessary
-# (or remove it altogether if you haven't used any external assets)
-assets:
-  - comment:
-    url:
-    licence:
-
-
 # Sign *your* name and uids here. (Remove entries if you have fewer
 # than three members.)
 signatures:
-  - name:
-    uid:
-  - name:
-    uid:
-  - name:
-    uid:
+  - name: Tom Stephens
+    uid: u6953044
+  - name: Kyle Robertson
+    uid: u6671630
+  - name: Kaushal Sharma
+    uid: u7028766
diff -ru -x .git ../master/comp1110-ass2/admin/H-presentation.yml comp1110-ass2/admin/H-presentation.yml
--- ../master/comp1110-ass2/admin/H-presentation.yml	2020-06-08 14:00:48.782726300 +1000
+++ comp1110-ass2/admin/H-presentation.yml	2020-06-08 14:00:46.289474700 +1000
@@ -1,2 +1,2 @@
 # use this file to record the ANU Sharepoint URL for your video presentation
-url: https://anu365-my.sharepoint.com/:v:/g/personal/u1234567_anu_edu_au/xxxx
\ No newline at end of file
+url: https://anu365-my.sharepoint.com/:v:/g/personal/u6953044_anu_edu_au/EbVd7Lr8P3tMtCr-1JRB0p8Ba6cZaj0MrnOQrPWrAuzmIw?e=bVmbUC
\ No newline at end of file
diff -ru -x .git ../master/comp1110-ass2/admin/members.yml comp1110-ass2/admin/members.yml
--- ../master/comp1110-ass2/admin/members.yml	2020-06-08 13:56:27.711770000 +1000
+++ comp1110-ass2/admin/members.yml	2020-06-08 14:00:46.289474700 +1000
@@ -3,9 +3,9 @@
 #
 
 members:
-  - name:
-    uid:
-  - name:
-    uid:
-  - name:
-    uid:
+  - name: Tom Stephens
+    uid: u6953044
+  - name: Kaushal Sharma
+    uid: u7028766
+  - name: Kyle Robertson
+    uid: u6671630
diff -ru -x .git ../master/comp1110-ass2/comp1110-ass2.iml comp1110-ass2/comp1110-ass2.iml
--- ../master/comp1110-ass2/comp1110-ass2.iml	2020-06-08 13:56:27.910224200 +1000
+++ comp1110-ass2/comp1110-ass2.iml	2020-06-08 14:00:46.471610400 +1000
@@ -19,5 +19,15 @@
         <SOURCES />
       </library>
     </orderEntry>
+    <orderEntry type="module-library" scope="TEST">
+      <library name="JUnit4">
+        <CLASSES>
+          <root url="jar://$MAVEN_REPOSITORY$/junit/junit/4.12/junit-4.12.jar!/" />
+          <root url="jar://$MAVEN_REPOSITORY$/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar!/" />
+        </CLASSES>
+        <JAVADOC />
+        <SOURCES />
+      </library>
+    </orderEntry>
   </component>
 </module>
\ No newline at end of file
Only in comp1110-ass2: feedback.md
Only in comp1110-ass2: game.jar
Only in comp1110-ass2: markertmp
Only in comp1110-ass2: META-INF
Only in comp1110-ass2: presentation.pdf
Only in comp1110-ass2/src/comp1110/ass2: Board.java
Only in comp1110-ass2/src/comp1110/ass2: gittest
Only in comp1110-ass2/src/comp1110/ass2/gui: AlertBox.java
Only in comp1110-ass2/src/comp1110/ass2/gui/assets: construction.jpg
Only in comp1110-ass2/src/comp1110/ass2/gui: ConfirmationBox.java
Only in comp1110-ass2/src/comp1110/ass2/gui: CreatingBoard.java
Only in comp1110-ass2/src/comp1110/ass2/gui: FinalScreen.java
Only in comp1110-ass2/src/comp1110/ass2/gui: GetPlayers.java
diff -ru -x .git ../master/comp1110-ass2/src/comp1110/ass2/gui/Viewer.java comp1110-ass2/src/comp1110/ass2/gui/Viewer.java
--- ../master/comp1110-ass2/src/comp1110/ass2/gui/Viewer.java	2020-06-08 13:56:27.913215900 +1000
+++ comp1110-ass2/src/comp1110/ass2/gui/Viewer.java	2020-06-08 14:00:46.884525500 +1000
@@ -1,16 +1,35 @@
 package comp1110.ass2.gui;
 
+import comp1110.ass2.Metro;
+import comp1110.ass2.Move;
+import comp1110.ass2.Player;
+import comp1110.ass2.Tile;
+import javafx.application.Platform;
+import javafx.geometry.Pos;
+import javafx.scene.Node;
+import javafx.scene.image.Image;
+import javafx.scene.image.ImageView;
 import javafx.application.Application;
-import javafx.event.ActionEvent;
-import javafx.event.EventHandler;
+import javafx.geometry.Insets;
 import javafx.scene.Group;
 import javafx.scene.Scene;
 import javafx.scene.control.Button;
 import javafx.scene.control.Label;
 import javafx.scene.control.TextField;
-import javafx.scene.layout.HBox;
+import javafx.scene.layout.*;
+import javafx.scene.paint.Color;
+import javafx.scene.text.Font;
 import javafx.stage.Stage;
 
+import java.io.FileInputStream;
+import java.io.FileNotFoundException;
+
+import java.util.Arrays;
+import java.util.concurrent.atomic.AtomicInteger;
+
+// Authorship: Kaushal Sharma, Kyle Robertson, Tom Stephens
+
+
 /**
  * A very simple viewer for piece placements in the Metro game.
  * <p>
@@ -18,41 +37,419 @@
  * class does not play a game, it just illustrates various piece
  * placements.
  */
-public class Viewer extends Application {
+public class Viewer extends Application{
     /* board layout */
     private static final int SQUARE_SIZE = 70;
     private static final int VIEWER_WIDTH = 1024;
     private static final int VIEWER_HEIGHT = 768;
 
     private static final String URI_BASE = "assets/";
+    private static String plSequence = "";
+    private static String placeSq = "";
+    private static int playerNums = 0;
 
     private final Group root = new Group();
     private final Group controls = new Group();
     private TextField textField;
 
+    // Create a new variable of Tile that hold a new random Deck and its top location
+    Tile newDeck = new Tile();
+
+    // Create a new GridPane object that will hold the board.
+    GridPane newBoard;
+
     /**
      * Draw a placement in the window, removing any previously drawn one
      *
      * @param placement A valid placement string
      */
-    void makePlacement(String placement) {
+
+    void makePlacement(String placement) throws FileNotFoundException {
         // FIXME Task 4: implement the simple placement viewer
+        if(!Metro.isPlacementSequenceValid(placement)){
+            System.out.println("isPieceSequenceWellFormed");
+            AlertBox.alertBox("Please enter a valid placement string");
+            return;
+        }
+        String tile = placement.substring(0, 4);
+        int row = Integer.parseInt(String.valueOf(placement.charAt(4)));
+        int col = Integer.parseInt(String.valueOf(placement.charAt(5)));
+        newBoard = updateBoard(newBoard, tile, row, col);
+    }
+
+    void makePlacementv2(String placementSequence, String tilePlacement, Player player) throws FileNotFoundException {
+        String verifySq = placementSequence + tilePlacement;
+        if(Metro.isPiecePlacementWellFormed(tilePlacement)) {
+            if (!Metro.isPlacementSequenceValid(verifySq)) {
+                AlertBox.alertBox("Please enter a valid placement string");
+                return;
+            }
+            String tile = tilePlacement.substring(0, 4);
+            int row = Integer.parseInt(String.valueOf(tilePlacement.charAt(4)));
+            int col = Integer.parseInt(String.valueOf(tilePlacement.charAt(5)));
+
+            System.out.println();
+            plSequence = Metro.updatePlacement(placementSequence,tilePlacement);
+
+            Metro.getScore(plSequence,playerNums);
+            System.out.println(Arrays.toString(Metro.getScore(plSequence,playerNums)));
+            newBoard = updateBoard(newBoard, tile, row, col);
+            player.setTileInHand(player.getCurrentPlayer(),null);
+
+            System.out.println("Before Player No: " + player.getCurrentPlayer());
+            player.switchTurn();
+            System.out.println("Player No: " + player.getCurrentPlayer());
+        } else
+            {
+        AlertBox.alertBox("Please enter a valid placement string");
+            }
+    }
+
+    void firstMakePlacement (String firstPlacement, String firstTile, Player player) throws FileNotFoundException{
+        if(!Metro.isPlacementSequenceValid(firstTile)) {
+            AlertBox.alertBox("Please enter a valid placement string");
+            return;
+
+        }
+        String tile = firstTile.substring(0, 4);
+        int row = Integer.parseInt(String.valueOf(firstTile.charAt(4)));
+        int col = Integer.parseInt(String.valueOf(firstTile.charAt(5)));
+        plSequence = Metro.updatePlacement(firstPlacement,firstTile);
+        Metro.getScore(plSequence,playerNums);
+        newBoard = updateBoard(newBoard, tile, row, col);
+        player.setTileInHand(player.getCurrentPlayer(),null);
+
+        System.out.println("Before Player No: " + player.getCurrentPlayer());
+        player.switchTurn();
+        System.out.println("Player No: " + player.getCurrentPlayer());
+
+    }
+
+    /**
+     * createBoard function creates initial stage of the board.
+     * This creates a grid of size 10x10.
+     * It displays the stations at the edges and Metro sign at all the corners.
+     * @return GridPane it returns the newly created board with all the stations including the center stations
+     * and all the location where the tile can be placed.
+     */
+    GridPane createBoard(Player player) throws FileNotFoundException {
+        // Create a GridPane to store the board
+        GridPane grid = new GridPane();
+        grid.setPadding(new Insets(0, 25, 0, 5));
+        grid.setAlignment(Pos.CENTER);
+        int startLocation;                                      // Stores the starting number of the station
+
+        // Add all the corner images i.e. Metro.jpg
+        String cornerLocation = "src/comp1110/ass2/gui/assets/tile_back_cover.jpg";
+        ImageView cornerImageView1 = createImage(cornerLocation, 0);
+        ImageView cornerImageView2 = createImage(cornerLocation, 0);
+        ImageView cornerImageView3 = createImage(cornerLocation, 0);
+        ImageView cornerImageView4 = createImage(cornerLocation, 0);
+        GridPane.setConstraints(cornerImageView1, 0, 0);
+        GridPane.setConstraints(cornerImageView2, 9, 0);
+        GridPane.setConstraints(cornerImageView3, 9, 9);
+        GridPane.setConstraints(cornerImageView4, 0, 9);
+        grid.getChildren().addAll(cornerImageView1, cornerImageView2, cornerImageView3, cornerImageView4);
+
+        // Store all the top edge station in the grid i.e. from Station 1 to 8.
+        startLocation = 8;
+        for(int i = 0; i < 8; i++) {
+            String imageLocation = "src/comp1110/ass2/gui/assets/station" + (startLocation) + ".jpg";
+            ImageView imageView = createImage(imageLocation, 180);
+            GridPane.setConstraints(imageView, 1+i, 0);
+            grid.getChildren().addAll(imageView);
+            startLocation--;
+        }
+
+        // Store all the top edge station in the grid i.e. from Station 9 to 16.
+        startLocation = 9;
+        for(int i = 0; i < 8; i++) {
+            String imageLocation = "src/comp1110/ass2/gui/assets/station" + (startLocation) + ".jpg";
+            ImageView imageView = createImage(imageLocation, 90);
+            GridPane.setConstraints(imageView, 0, 1+i);
+            grid.getChildren().addAll(imageView);
+            startLocation++;
+        }
+
+        // Store all the top edge station in the grid i.e. from Station 17 to 24.
+        startLocation = 17;
+        for(int i = 0; i < 8; i++) {
+            String imageLocation = "src/comp1110/ass2/gui/assets/station" + (startLocation) + ".jpg";
+            ImageView imageView = createImage(imageLocation, 0);
+            GridPane.setConstraints(imageView, 1+i, 9);
+            grid.getChildren().addAll(imageView);
+            startLocation++;
+        }
+
+        // Store all the top edge station in the grid i.e. from Station 25 to 32.
+        startLocation = 32;
+        for(int i = 0; i < 8; i++) {
+            String imageLocation = "src/comp1110/ass2/gui/assets/station" + (startLocation) + ".jpg";
+            ImageView imageView = createImage(imageLocation, 270);
+            GridPane.setConstraints(imageView, 9, 1+i);
+            grid.getChildren().addAll(imageView);
+            startLocation--;
+        }
+
+        // Store the GridCell where the tile will be inserted
+        for(int i = 1; i <=8; i++) {
+            for(int j = 1; j <= 8; j++) {
+                // Create a new Label which stores the location and the color.
+                Label gridCell = new Label();
+                // Set the text of this new Label to the location in the grid i.e. (j-1, i-1)
+                gridCell.setText("("+(j-1)+", "+(i-1)+")");
+
+                // Set the Background color of the grid. This creates a chess board type of color effect.
+                if ( i % 2 == 0 ) {
+                    if (j % 2 == 0)
+                        gridCell.setBackground(new Background(new BackgroundFill(Color.rgb(107, 34, 18), CornerRadii.EMPTY, Insets.EMPTY)));
+                    else
+                        gridCell.setBackground(new Background(new BackgroundFill(Color.rgb(0, 0, 0), CornerRadii.EMPTY, Insets.EMPTY)));
+                } else {
+                    if ( j % 2 == 1 )
+                        gridCell.setBackground(new Background(new BackgroundFill(Color.rgb(107, 34, 18), CornerRadii.EMPTY, Insets.EMPTY)));
+                    else
+                        gridCell.setBackground(new Background(new BackgroundFill(Color.rgb(0, 0, 0), CornerRadii.EMPTY, Insets.EMPTY)));
+                }
+
+                // Set the minimum Width and Height for the label.
+                gridCell.setMinWidth(70);
+                gridCell.setMinHeight(70);
+
+                gridCell.setTextFill(Color.rgb(255, 255, 255));                 // Set the Text Color to White
+                gridCell.setFont(Font.font("Arial", 15));                           // Set Font Family to "Arial" and Font size to 12px
+                gridCell.setAlignment(Pos.CENTER);                                       // Set Center Alignment for the Label
+                GridPane.setConstraints(gridCell, i, j);
+                grid.getChildren().addAll(gridCell);
+            }
+        }
+
+        // Store all the central stations in the grid.
+        String centralLocation = "src/comp1110/ass2/gui/assets/centre_station.jpg";
+        ImageView centerImageView1 = createImage(centralLocation, 270);
+        ImageView centerImageView2 = createImage(centralLocation, 0);
+        ImageView centerImageView3 = createImage(centralLocation, 180);
+        ImageView centerImageView4 = createImage(centralLocation, 90);
+        GridPane.setConstraints(centerImageView1, 4, 4);
+        GridPane.setConstraints(centerImageView2, 5, 4);
+        GridPane.setConstraints(centerImageView3, 4, 5);
+        GridPane.setConstraints(centerImageView4, 5, 5);
+        grid.getChildren().addAll(centerImageView1, centerImageView2, centerImageView3, centerImageView4);
+        //Checking which gridCell was clicked, then prints out the gridCell Location.
+        //grid.addEventFilter();
+
+        grid.addEventFilter(javafx.scene.input.MouseEvent.MOUSE_PRESSED, e -> {
+            //Loops through the gridPane looking at each panel and names them node
+            for (Node node : grid.getChildren()) {
+                if (node instanceof Label) {
+                    //Checks if the mouse position in the gridCell, through getting the mouse's position by getSceneX & Y
+                    if (node.getBoundsInParent().contains(e.getSceneX(), e.getSceneY())) {
+                        //Have to use Platform run otherwise you get an java.util.ConcurrentModificationException error
+                        Platform.runLater(new Runnable() {
+                            //You have to run the makePlacementv2 inside this run function.
+                            @Override
+                            public void run() {
+                                //Prints out location of the gridCell.
+                                //System.out.println("Node: " + node + " at " + (GridPane.getRowIndex(node) - 1) + "/" + (GridPane.getColumnIndex(node) - 1));
+                                //Gets the top value from the shuffled deck.
+                                //Places the tile at the gridCell location
+                                if (player.getTileInHand(player.getCurrentPlayer()) != null) {
+                                    //Getting an error, not sure how to fix it yet, still working on it.
+                                    String tileInHand = player.getTileInHand(player.getCurrentPlayer());
+                                    if (plSequence.isEmpty()) {
+                                        //System.out.println(plSequence);
+                                        try {
+                                            firstMakePlacement(plSequence, tileInHand + (GridPane.getRowIndex(node) - 1) + (GridPane.getColumnIndex(node) - 1), player);
+                                        } catch (FileNotFoundException e1) {
+                                            e1.printStackTrace();
+                                        }
+                                    } else {
+                                        try {
+                                            makePlacementv2(plSequence, tileInHand + (GridPane.getRowIndex(node) - 1) + (GridPane.getColumnIndex(node) - 1), player);
+                                        } catch (FileNotFoundException e1) {
+                                            e1.printStackTrace();
+                                        }
+                                    }
+                                } else {
+                                    System.out.println("Player has no Card in their Hand");
+                                }
+                            }
+                        });
+
+                    }
+                }
+            }
+        });
+
+        // Return the newly created Grid.
+        return grid;
     }
 
     /**
-     * Create a basic text field for input and a refresh button.
+     * This function returns a rotated image of size 70x70 with the specified degree
+     * @param imageLocation this is the location of the image i.e. File Path.
+     * @param rotation This indicates the degree by which the images needs to be rotated.
+     * @return It returns the image at the given location which is rotated by the specified degree.
+     * @throws FileNotFoundException, this exception is thrown if the image is not present at the that location.
+     */
+    ImageView createImage(String imageLocation, int rotation) throws FileNotFoundException {
+        FileInputStream fileLocation = new FileInputStream(imageLocation);          // Read the file from that location
+        Image image = new Image(fileLocation);                                      // Create a image
+        ImageView imageView = new ImageView(image);                                 // Get the ImageView from the image
+        imageView.setPreserveRatio(true);                                           // To preserve the image ratio
+        imageView.setFitHeight(70);                                                 // set Image's Height
+        imageView.setFitWidth(70);                                                  // set Image's Width
+        imageView.setRotate(rotation);                                              // Rotate the image by specified degree
+        return imageView;                                                           // Return the ImageView that we created
+    }
+
+    /**
+     * updateBoard() function update the board with the new added tile.
+     * @param board It is a Grid that holds all the placements. We need to update this board by placing a given tile on the given location
+     * @param tile It is the String that hold the new tile that is needed to be placed on the board.
+     * @param row It is the row where the new tile is to be inserted.
+     * @param col It is the column where the new tile is to be inserted.
+     * @return the updated board which is a GridPane with all the Tile Placed.
+     * @throws FileNotFoundException Throws this exception if the image of the tile is not found.
+     */
+    GridPane updateBoard(GridPane board, String tile, int row, int col) throws FileNotFoundException {
+        // Find the tile and store its location
+        String tileLocation = "src/comp1110/ass2/gui/assets/"+tile+".jpg";
+        // Create the image from the location using the create Image() function
+        ImageView tileView = createImage(tileLocation, 0);
+
+        // Store the image at the given location
+        GridPane.setConstraints(tileView, col+1, row+1);
+        board.getChildren().add(tileView);
+
+        // Return the updated board with the new tile placed
+        return board;
+    }
+
+    /**
+     * It returns the right side of the screen which holds the deck
+     * @param player It is the new object of Player class which is used to get number of players and the tiles in their hand
+     * @return It return the grid which will be displayed on the right side tf the screen.
+     * @throws FileNotFoundException This exception may re thrown is the image of the tile from the deck is not found.
+     */
+    VBox deckLocation (Player player) throws FileNotFoundException {
+        // Create a New VBox which will contain what to display on the right side of the screen.
+        VBox deckLoc = new VBox();
+        deckLoc.setPadding(new Insets(0, 0, 0, 0));
+
+        // Creating Label for player's Name
+        Label playerName = new Label("Player "+(player.getCurrentPlayer() + 1));
+        playerName.setAlignment(Pos.CENTER);
+        playerName.setFont(Font.font("Arial", 20));
+        playerName.setTextFill(Color.rgb(0, 0, 0));
+
+        // Create a Label named "DECK" and apply all the properties.
+        Label deckName = new Label("DECK");
+        deckName.setAlignment(Pos.CENTER);
+        deckName.setFont(Font.font("Arial", 20));
+        deckName.setTextFill(Color.rgb(0, 0, 0));
+
+        // Store the top location from the newDeck which is passed.
+        AtomicInteger tempLocationOfTopDeck = new AtomicInteger(newDeck.getTop() - 1);
+        // Store the string value of the tile that is at the top of the deck
+        String topOfDeck = newDeck.getDeck(tempLocationOfTopDeck.get());
+        //String TopOfDeck2 = new;
+
+        // Find the tile that is at the top of deck and store its location
+        String topLocation = "src/comp1110/ass2/gui/assets/" + topOfDeck + ".jpg";
+        // Create the image from the location using the createImage() function
+        ImageView tileView = createImage(topLocation, 0);
+        tileView.setFitHeight(150);
+        tileView.setFitWidth(150);
+
+        // Create a new Label that stores the String value of the tile that is at the top of the deck.
+        Label tile1Name = new Label(topOfDeck);
+        tile1Name.setAlignment(Pos.CENTER);
+        tile1Name.setFont(Font.font("Arial", 15));
+        tile1Name.setTextFill(Color.rgb(0, 0, 0));
+
+
+
+        // Check if the player already holds any tile in his/her hands
+        String tileInHand = player.getTileInHand(player.getCurrentPlayer());
+        if (tileInHand != null) {
+            // Find the tile that is in the player's hand and store its location
+            String playersHandTileLocation = "src/comp1110/ass2/gui/assets/" + tileInHand + ".jpg";
+            // Create the image from the location using the createImage() function
+            ImageView playersHandTileView = createImage(playersHandTileLocation, 0);
+            playersHandTileView.setFitHeight(150);
+            playersHandTileView.setFitWidth(150);
+        } else {
+            // Creating Label that reflects the player's empty hand
+            Label noTileInHand = new Label("No Tile In Hand");
+            noTileInHand.setAlignment(Pos.CENTER);
+            noTileInHand.setFont(Font.font("Arial", 15));
+            noTileInHand.setTextFill(Color.rgb(0, 0, 0));
+            noTileInHand.setPadding(new Insets(5, 25, 5, 55));
+        }
+        // Create a label for this tile
+        Label playerTile1Name = new Label();
+        // Create the image from the location using the createImage() function
+        ImageView handView1 = new ImageView();
+        handView1.setFitHeight(150);
+        handView1.setFitWidth(150);
+        GridPane.setConstraints(handView1, 0, 1);
+        //Create a Label for second tile
+        Label playerTile2Name = new Label();
+        //Create the image for the second tile
+        ImageView handView2 = new ImageView();
+        handView2.setFitHeight(150);
+        handView2.setFitWidth(150);
+        GridPane.setConstraints(handView2, 0, 1);
+
+        //System.out.println(player.numofTilesinHand(player.getTileInHand(player.getCurrentPlayer())));
+        //System.out.println(player.canPickUpTile(,player.getCurrentPlayer()));
+        // Add button to press to pick up a tile from the deck
+        Button getTileButton = new Button("Pick up tile");
+        getTileButton.setOnAction(e -> {
+                if (player.getTileInHand(player.getCurrentPlayer()) == null || (player.getTileInHand(player.getCurrentPlayer())).length() <= 4) {
+                    //System.out.println("Inside Button " + player.numofTilesinHand(player.getTileInHand(player.getCurrentPlayer())));
+                    // adds the tile to the player's hand
+                    // added a string again because it was just placing the same tile over and over again.
+                    // Changed file location because new Image load in a different way to createImage
+                    // because the src folder is the build path.
+                    String pickupTopLocation = "comp1110/ass2/gui/assets/" + newDeck.getDeck(tempLocationOfTopDeck.get()) + ".jpg";
+                    player.setTileInHand(player.getCurrentPlayer(), newDeck.getDeck(tempLocationOfTopDeck.get()));
+                    //Changing image to correct tile in hand.
+                    handView1.setImage(new Image(pickupTopLocation));
+                    // Changing name to match correct tile.
+                    playerTile1Name.setText(newDeck.getDeck(tempLocationOfTopDeck.get()));
+                    //Decreasing the position in deck.
+                    tempLocationOfTopDeck.decrementAndGet();
+                }
+        });
+
+        // Add all of the elements of the right side to the VBox
+        deckLoc.getChildren().addAll(playerName,deckName, tileView, tile1Name, getTileButton, handView1, playerTile1Name);
+        deckLoc.setSpacing(10);
+        deckLoc.setLayoutX(710);
+
+
+        return deckLoc;
+    }
+
+
+
+    /**
+     * Create a basic text field for input and a "Place Tile" button.
      */
     private void makeControls() {
         Label label1 = new Label("Placement:");
         textField = new TextField();
         textField.setPrefWidth(300);
-        Button button = new Button("Refresh");
-        button.setOnAction(new EventHandler<ActionEvent>() {
-            @Override
-            public void handle(ActionEvent e) {
+        Button button = new Button("Place Tile");
+        button.setOnAction(e -> {
+            try {
                 makePlacement(textField.getText());
-                textField.clear();
+            } catch (FileNotFoundException ex) {
+                ex.printStackTrace();
             }
+            textField.clear();
         });
         HBox hb = new HBox();
         hb.getChildren().addAll(label1, textField, button);
@@ -64,14 +461,39 @@
 
     @Override
     public void start(Stage primaryStage) throws Exception {
-        primaryStage.setTitle("FocusGame Viewer");
+        primaryStage.setTitle("Metro Game Viewer");
         Scene scene = new Scene(root, VIEWER_WIDTH, VIEWER_HEIGHT);
 
+        makeControls();
         root.getChildren().add(controls);
 
-        makeControls();
+
+        // Get the number of players from the user using getPlayer() function.
+        int[] tn = GetPlayers.getPlayers();
+        int n = tn[0];
+        playerNums = n;
+        if ( n == -1 )                          // Check if the user wants to quit or continue
+            return;
+        // Create a new variable of Player that hold all the functionality of a player.
+        Player player = new Player( n );
+
+
+        // Create a new Grid. i.e. the initial stage of the board
+        newBoard = createBoard(player);
+
+        // Create a new Grid that holds right side of the screen. i.e. DECK, and the image of the top most tile in deck.
+        VBox rightDeckLocation = deckLocation(player);
+
+        GridPane screenDistribution = new GridPane();
+        GridPane.setConstraints(newBoard, 0, 0);
+        screenDistribution.getChildren().add(newBoard);
+        GridPane.setConstraints(rightDeckLocation, 1, 0);
+        screenDistribution.getChildren().add(rightDeckLocation);
+
+        root.getChildren().add(screenDistribution);
 
         primaryStage.setScene(scene);
         primaryStage.show();
+
     }
 }
diff -ru -x .git ../master/comp1110-ass2/src/comp1110/ass2/Metro.java comp1110-ass2/src/comp1110/ass2/Metro.java
--- ../master/comp1110-ass2/src/comp1110/ass2/Metro.java	2020-06-08 14:00:48.784721800 +1000
+++ comp1110-ass2/src/comp1110/ass2/Metro.java	2020-06-08 14:00:46.866100000 +1000
@@ -1,7 +1,14 @@
 package comp1110.ass2;
 
+// Authorship: Kyle Robertson, Tom Stephens, Kaushal Sharma
+
 public class Metro {
     /**
+     * Creating a tile object. It stores the deck, and the top position of deck.
+     */
+    static Move move = new Move();
+
+    /**
      * Task 2
      * Determine whether a piece placement is well-formed. For a piece
      * placement to be well-formed, it must:
@@ -16,7 +23,7 @@
      */
     public static boolean isPiecePlacementWellFormed(String piecePlacement) {
         // FIXME Task 2: determine whether a piece placement is well-formed
-        return false;
+        return move.checkTilePlacement(piecePlacement);
     }
 
     /**
@@ -34,7 +41,11 @@
      */
     public static boolean isPlacementSequenceWellFormed(String placement) {
         // FIXME Task 3: determine whether a placement sequence is well-formed
-        return false;
+        return move.checkPlacementSequence(placement);
+    }
+
+    public static String updatePlacement (String placement, String tile){
+        return move.updatePlacementSequence(placement,tile);
     }
 
     /**
@@ -49,7 +60,43 @@
      */
     public static String drawFromDeck(String placementSequence, String totalHands) {
         // FIXME Task 5: draw a random tile from the deck
-        return "";
+        // Create a new Tile variable that holds a deck and its top location.
+        Tile updatedDeck = new Tile();
+
+        // Store the number of tiles that are already placed and are in hand
+        int numberOfPlacedTiles = placementSequence.length() / 6;
+        int numberOfTilesInHand = totalHands.length() / 4;
+
+        // If the passed strings are not null then. i.e. there are some already placed tiles or some in hand
+        if ( placementSequence.length() != 0 || totalHands.length() != 0 ) {
+            // Create a list to store already placed tiles
+            String[] placedTiles = new String[numberOfPlacedTiles + numberOfTilesInHand];
+
+            // Store the tiles from the placementSequence to the newly created array.
+            for(int i = 0; i < numberOfPlacedTiles; i++) {
+                placedTiles[i] = placementSequence.substring(i*6, (i*6)+6);
+                placedTiles[i] = placedTiles[i].substring(0, 4);
+            }
+
+            // Store the tiles from the totalHands to the newly created array.
+            for(int i = numberOfPlacedTiles, k = 0; i < numberOfPlacedTiles + numberOfTilesInHand; i++, k++) {
+                placedTiles[i] = totalHands.substring(k*4, (k*4) + 4);
+            }
+
+            // Update the deck i.e. swap the tile that is there in the placedTiles to the last location in the deck.
+            for (String out: placedTiles){
+                Tile.updateDeck( out );
+            }
+        }
+
+        // Create a String variable that will store the returning string
+        String temp = "";
+        // Check if the deck is empty or not
+        if ( updatedDeck.checkDeckNonEmpty() ) {
+            temp = updatedDeck.pop();
+        }
+        // Return the string that is top most tile in the deck.
+        return temp;
     }
 
     /**
@@ -71,7 +118,8 @@
      */
     public static boolean isPlacementSequenceValid(String placementSequence) {
         // FIXME Task 6: determine whether a placement sequence is valid
-        return false;
+        Move checkingPlacementSequence = new Move();
+        return checkingPlacementSequence.isPlacementSequenceValid ( placementSequence );
     }
 
     /**
@@ -84,7 +132,7 @@
      */
     public static int[] getScore(String placementSequence, int numberOfPlayers) {
         // FIXME Task 7: determine the current score for the game
-        return new int[0];
+        return Score.scoreBoard(placementSequence, numberOfPlayers);
     }
 
     /**
@@ -97,7 +145,15 @@
      * @return A valid placement of the given tile
      */
     public static String generateMove(String placementSequence, String piece, int numberOfPlayers) {
+        // Get the number of tiles in the placementSequence
+        int numberOfTiles = placementSequence.length() / 6;
+        // Divide the string into pieces i.e. tile value and its location row and col.
+        String[] tiles = new String[numberOfTiles];
+        for (int i = 0; i < numberOfTiles; i++) {
+            // Put all of the tiles into an array
+            tiles[i] = placementSequence.substring(i * 6, (i * 6) + 6);
+        }
         // FIXME Task 9: generate a valid move
-        return "";
+        return Move.generateValidMove(tiles, piece);
     }
 }
Only in comp1110-ass2/src/comp1110/ass2: Move.java
Only in comp1110-ass2/src/comp1110/ass2: OpponentAI.java
Only in comp1110-ass2/src/comp1110/ass2: Player.java
Only in comp1110-ass2/src/comp1110/ass2: Score.java
Only in comp1110-ass2/src/comp1110/ass2: Tile.java
Only in comp1110-ass2/tests/comp1110/ass2: MoveTests.java
Only in comp1110-ass2/tests/comp1110/ass2: PlayerTests.java
Only in comp1110-ass2/tests/comp1110/ass2: ScoreTests.java
Only in comp1110-ass2/tests/comp1110/ass2: TileTests.java
diff -ru -x .git ../master/comp1110-ass2/tests/comp1110/ass2/Utilities.java comp1110-ass2/tests/comp1110/ass2/Utilities.java
--- ../master/comp1110-ass2/tests/comp1110/ass2/Utilities.java	2020-06-08 14:00:48.788711000 +1000
+++ comp1110-ass2/tests/comp1110/ass2/Utilities.java	2020-06-08 14:00:46.979794000 +1000
@@ -248,4 +248,12 @@
             {57, 26, 26, 24, 55, 13}
     };
 
+    public static final int[][][] FULL_STATION_LOCATION = {
+            {{1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29, 31},{2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30, 32}},
+            {{1, 4, 6, 11, 15, 20, 23, 25, 28, 31},{2, 7, 9, 12, 14, 19, 22, 27, 29, 32},{3, 5, 8, 10, 13, 18, 21, 24, 26, 30}},
+            {{4, 7, 11, 16, 20, 23, 27, 32},{3, 8, 12, 15, 19, 24, 28, 31},{1, 6, 10, 13, 18, 21, 25, 30},{2, 5,  9, 14, 17, 22, 26, 29}},
+            {{1, 5, 10, 14, 22, 28},{6, 12, 18, 23, 27, 32},{3, 7, 15, 19, 25, 29},{2, 9, 13, 21, 26, 30},{4, 8, 11, 20, 24, 31}},
+            {{1, 5, 10, 19, 27},{2, 11, 18, 25, 29},{4, 8, 14, 21, 26},{6, 15, 20, 24, 31},{3, 9, 13, 23, 30},{7, 12, 22, 28, 32}}
+    };
+
 }
Only in comp1110-ass2: weekly_feedback
```
