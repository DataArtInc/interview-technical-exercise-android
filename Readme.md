# Android Coding Challenge — Studio Ghibli Films

Welcome to Android Coding Challenge. You have 80 minutes to finish the challenge. Please
clone the project, check it out and read the instructions below.

## Requirements

You are given a sample project in Kotlin for an Android app.
The app loads a list of items from the public
[Studio Ghibli API](https://ghibliapi.vercel.app/#tag/Films/operation/getFilms)
and shows them on screen to the user. This project is **defective** and we need your help to fix it!

We would like you to:

1. Refactor the list screen to a presentation pattern
2. In the list screen please apply one of the following variants:
    - Variant A: sort by release year and section by director
    - Variant B: sort by running time and section by producer
    - Variant C: sort by title alphabetically and section by release year
3. Write unit tests!

Bonus task:

- add loading state to list
- add a new feature to show details in a new screen every time the user clicks on an item

This will be a collaborative exercise so feel free to ask us questions and work with us to find a
nice solution to the problem.
You can use any online resources you need (google/stackoverflow/etc), but please do not ask GenAI :D
Be mindful of time, this exercise will last 80 minutes.
Have fun!

We expect **production level quality!**

## Preparation Material

Congrats for making it to the stage of the interviewing process. This section is to help you prepare
on coding challenge interview.

Topics to freshen up on are:

- Android SDK
- Kotlin
- Jetpack Compose
- Clean Architecture
- Presentation Design Patterns (MVP/MVVM/MVI)
- Automated unit testing
- SOLID Principles

## Candidate assessment guide

This section is meant to act as a general assessment guide to help aid interviewers for all tests in
this section. For assessment guidance specific to a test, there will be a section provided in the
relevant readme.

This is by no means a tick box exercise, we do not expect any candidate to be anywhere near getting
all the points for their level and it is simply to be a reference. In many cases, a candidate simply
discussing and justifying a point can indicate how to level them.

| Topic                                           | Consideration                                                                                                                 |
|-------------------------------------------------|-------------------------------------------------------------------------------------------------------------------------------|
| _Capability of Pair Programming_                | Are they collaborative, friendly, and thoughtful? Are they listening, reacting to questions/remarks?                          |
| _Attitude towards building a Testable solution_ | Is the candidate familiar with clean architecture, SOLID principles, TDD?                                                     |
| _Problem solving skills_                        | How the candidate thinks, makes decisions and processes information.                                                          |
| _Tech ability with chosen platform_             | Examples: Android SDKs, Android Studio/IntelliJ, java/kotlin, libraries/tools, ...                                            |
| _Refactoring_                                   | Is the candidate able to identify the functionalities in scope and refactor the code while maintaining the same functionality | 

## Marking guidance

We expect that all candidates will be able to write an application that runs and produces the
correct output.

| Mark or level | Language                                                              | Pairing                                                                                                                                      | Other ?                                                                                                                                                                                      |
|---------------|-----------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| _Junior_      | Candidates might not be fully confident with their language of choice | Candidates might not feel at ease pairing with other engineers and may extensively use external resources/documentation to complete the task |                                                                                                                                                                                              |
| _Mid_         | Candidates should feel comfortable with their language of choice.     | Candidates should feel comfortable pairing with other engineers, but might still use external resources/documentation to complete the task.  | Candidates will be able to clarify the requirements and explain their choices step by step.                                                                                                  |
| _Senior_      | Candidates will feel comfortable with their language of choice.       | Candidates will feel comfortable pairing with other engineers to complete the task on time.                                                  | Candidates will be able to clarify the requirements, ensure data integrity and explain their choices step by step.<br/>Candidates will produce testable, readable and easy-to-maintain code. |
