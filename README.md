# Taskly
## Diagrama de classe
``` mermaid
classDiagram
       class User {
        -Long id
        -String name
        -String email
        -String password
        -List[] tasks
    }

    class Task {
        -Long id
        -String name
        -String description
        -Date creationDate
        -Date completionDate
        -TaskStatus status
        -Priority priority
        -User responsible
    }

    class TaskStatus {
        <<enumeration>>
        +PLANNED
        +IN_PROGRESS
        +COMPLETED
    }

    class Priority {
        <<enumeration>>
       +LOW
       +MEDIUM
        +HIGH
    }

    User --> Task : 1..*
    Task *-- TaskStatus : 1..1
    Task *-- Priority : 1..1

    ```
