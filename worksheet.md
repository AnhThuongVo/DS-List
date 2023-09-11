# 08/31 Worksheet: LinkedLists

## Review

1. In your own words, explain what a LinkedList is.

2. What are the `head` and `tail` pointers of a LinkedList? What should they always point to when the list is not being changed?

3. In your own words, explain why you need a loop to get the element at a specific index in a LinkedList.

## Exploration

In this section of the worksheet, you will recreate the Java code of a (singly-linked) LinkedList. The intention is that, after watching the live-coding videos, you should be able to *independently* think through how a LinkedList works, and to write the code from scratch. We encourage you to do this section of the worksheet *without* referring to the videos.

You can download the starter code in `IntLinkedList.java` and work in your own Java IDE, or you can edit and run the file directly at [repl.it](https://repl.it/@justinnhli/IntLinkedList). Remember to test and save often. In addition to answering the questions here, you should also submit your code to [the autograder](http://autograder.cc.oxy.edu/), which will run the test cases for you.

1. First, we need to create the inner `Node` class. What member variables does it need? What information is stored in each of these member variables? Write the code for these member variables, and initialize them in the `Node` constructor.

2. What are the member variables of the `IntLinkedList` class? What information is stored in each of these member variables? What should they be initialized to? Write the code for these member variables, and initialize them in the `IntLinkedList` constructor.

3. This is an easy one - fill out the code for `size()`, which should return the current number of elements in our `IntLinkedList`.

4. For a singly-linked list, there are two cases we have to think about for `add()`. What are those cases? What should be done in each case? Write the code for `add()` when you understand what should happen in each case.

5. The next method, `get()` requires looping through the nodes to get to the correct index. 

6. The final method, `remove()`, is also the hardest one to write. The code for this method can be broken down into four cases. What are they? What should the code do in each case?

7. Write the code for `remove()`.

## Challenge

In this section, you will write two methods of a *doubly*-linked LinkedList. More information about this data structure can be found in the textbook, Sections 4.6-4.8, but in short, the main distinguishing feature of a doubly-linked list is that nodes have both `next` and `prev` pointers, that point to the next node and the previous node respectively. This means that the code for a doubly-linked list is almost exactly the same as that for a singly-linked lists, except for the node pointers that you have to change when adding and removing elements. These two methods, `add()` and `remove()`, are the ones you will write here. The file `IntDoublyLinkedList.java` contains code for the other methods required.

1. In a doubly-linked list, the `prev` and `next` pointers should point to the previous and next nodes, respectively, except for the first (head) and last (tail) nodes. What should `prev` and `next` be set to in those cases?

2. When we `add()` an element to the end of a doubly-linked list, the main difference from a singly-linked list is that we have to make sure the `prev` pointer is set correctly. Based on your code for the singly-linked list, write the `add()` method of `IntDoublyLinkedList`.

3. The `remove()` method of a doubly-linked list has the same four cases as the singly-linked list. What are they, and what should happen in each case?

4. Write the `remove()` method of `IntDoublyLinkedList`.
