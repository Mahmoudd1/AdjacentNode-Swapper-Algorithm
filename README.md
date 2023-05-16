# AdjacentNode-Swapper-Algorithm
This algorithm aims to swap adjacent nodes in a linked list. It takes the head of the linked list as input and returns the modified linked list after swapping adjacent nodes pairwise.
## Approach
Handle the base cases:

If the input head is null, return null.
If the input head has only one node, return the head itself.
Initialize two dummy nodes, a and b, to store the next nodes.

Set a as the node following the second node from the head.
Set b as the second node from the head.
Perform the initial swap of the first two nodes:

Set b.next as the head.
Set head.next as a.
Iterate through the linked list:

While head.next and head.next.next are not null:
Create two temporary nodes, temp1 and temp2, to store the next two nodes.
Swap the positions of temp1 and temp2 by updating the next references.
Update the head.next reference to temp2.
Move head two nodes forward.
Return the modified linked list by returning b, which is the new head after swapping.
## Implementation

The solution is implemented in Java. The swapPairs method takes a ListNode representing the head of the linked list and returns the modified linked list after swapping adjacent nodes pairwise.
``` Java
ListNode head = new ListNode(1);
head.next = new ListNode(2);
head.next.next = new ListNode(3);
head.next.next.next = new ListNode(4);

Solution solution = new Solution();
ListNode swappedList = solution.swapPairs(head);

// Output: 2 -> 1 -> 4 -> 3
``` 
## Complexity Analysis
The time complexity of this algorithm is O(N), where N is the number of nodes in the linked list, as we need to traverse the entire list.

The space complexity is O(1) as we are using a constant amount of additional space.


