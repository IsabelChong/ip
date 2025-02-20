# 🍒 Berry the Task Manager Bot 

<div style="text-align: center">
<img src="Ui.png" alt="Berry User Interface" align="middle" width="400px"/>
</div>

### 🫅🏻 Bye-bye Duke. Hello to Berry!

Berry is a greenfield project enhancing from the [Duke](https://github.com/nus-cs2103-AY2223S2/ip) template, as part
of a course I have taken - CS2103T at the National University of Singapore (NUS).

---

## Table of Contents
- [📖 Features](#-features)
- [✨ Coming Soon](#-coming-soon)
- [️⬇️ How to Download](#-how-to-download)
- [📕 Commands](#-commands)

---

## 📖 Features

### 1. Quick Task Management

<p> Use Berry just like a <a href="https://en.wikipedia.org/wiki/Command-line_interface">Command Line Interface (CLI)</a>!</p>
<p> This means that if you are a quick typer, Berry makes your task managament even faster! ⚡️ </p>

### 2. Interactive ChatBot Interface

<p> Finished your task and want to finally delete it or mark it as done?</p>

<p> Berry feels happy for you~ See how her appearance changes when you are being productive!</p>

### 3. Categorise Your Tasks `#amazing`

<p> Why put all your tasks together? </p>
<p> You can <code>#hashtag</code> them and put them into categories to sort your tasks easily.</p>

---

## ✨ Coming Soon...
- [x] Finding tasks by keywords
- [ ] Update User Guide to include a tutorial
- [ ] Filter data by tags
- [ ] Mass marking/unmarking/deleting by task index
- [ ] Mass marking/unmarking/deleting by tags

---

## ⬇️ How to Download
1. Download the latest version of berry.jar v0.3 [here](https://github.com/IsabelChong/ip/releases/download/v0.3/berry.jar)
2. Locate your file in the 'Downloads' folder and move it to your 'Desktop'
3. Open 'terminal' on Mac or 'cmd' on Windows, and change directory to the desktop by running `cd Desktop`
4. Open Berry by running `java -jar berry.jar`
5. Start managing your tasks with Berry!

---

## 📕 Commands

### `help` - shows help menu

Got stuck in between and don't feel like opening this website?

Just ask berry to help you in app <:

---

### `todo <task_name> [#<hash_tag>]` - adds a task to do 

This adds a new task for berry to manage.

Example of usage: 

`todo get dinner for family`

Expected outcome:


```
You can do it! I've added this task for ya
    [T][ ] get dinner for family
```

---

### `deadline <task_name> /by<YYYY-MM-DD> [#<hash_tag>]` - adds a task with a deadline

This adds a new task with a deadline for berry to manage.

Example of usage:

`deadline finish assignment /by 2023-12-30`

Expected outcome:


```
You can do it! I've added this task for ya
    [D][ ] finish assignment (by: Dec 30 2023)
```

---

### `event <task_name> /from<YYYY-MM-DD> /to<YYYY-MM-DD> [#<hash_tag>]` - adds an event

This adds a new task as an event between a time period for berry to manage.

Example of usage:

`event flea market popup /from 2023-02-19 /to 2023-03-19`

Expected outcome:


```
You can do it! I've added this task for ya
    [E][ ] flea market popup (from: Feb 19 2023 to: Mar 19 2023)
```

---

### `list` - show all tasks

This asks berry to show all tasks that is being managed at the moment.

Example of usage:

`list`

Expected outcome:


```
Here's what I have for you:
    1. [T][ ] get dinner for family
    2. [D][ ] finish assignment (by: Dec 30 2023)
    3. [E][ ] flea market popup (from: Feb 19 2023 to: Mar 19 2023) 
```

---
### `mark <index>` - mark a task with the list index as done

This asks berry to mark the task indexed by the _list index_, that is seen in your most recent call to `list`, as done.

Example of usage:

`mark 1`

Expected outcome:


```
Alright~ I'll set the task as done!
    [T][X] get dinner for family
```

---
### `unmark <index>` - mark a task with the list index as not done

This asks berry to mark the task indexed by the _list index_, that is seen in your most recent call to `list`, as not done.

Example of usage:

`unmark 1`

Expected outcome:


```
Okay! I'll set the task as not done
    [T][ ] get dinner for family
```

---

### `delete <index>` - deletes a task with the list index

This asks berry to delete the task indexed by the _list index_, that is seen in your most recent call to `list`.

Example of usage:

`delete 1`

Expected outcome:

```
Here you go! I've deleted this task for ya
    [T][ ] get dinner for family
You now have 2 task(s) in the list
```

---
### `find <keyword>` - searches for tasks which contain the keyword

This asks berry to search for tasks which contains the keyword given.

Example of usage:

`find dinner`

Expected outcome:


```
Here's what I found for ya
    1. [T][ ] get dinner for family
```

---

---
### `bye` - exits the program

Berry will say its goodbyes and wait for your return!

Example of usage:

`bye`

Expected outcome:


```
Bye! I hope Berry was helpful to you <:
```

---



