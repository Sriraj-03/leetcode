/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* mergeTwoLists(struct ListNode* l1, struct ListNode* l2) {
    struct ListNode dummy;
    struct ListNode* current = &dummy;
    dummy.next = NULL;

    while (l1 != NULL && l2 != NULL) {
        if (l1->val < l2->val) {
            current->next = l1;
            l1 = l1->next;
        } else {
            current->next = l2;
            l2 = l2->next;
        }
        current = current->next;
    }

    if (l1 != NULL) {
        current->next = l1;
    } else {
        current->next = l2;
    }

    return dummy.next;
}

struct ListNode* mergeKLists(struct ListNode** lists, int listsSize) {
    if (listsSize == 0) return NULL;

    while (listsSize > 1) {
        int newSize = (listsSize + 1) / 2;
        for (int i = 0; i < listsSize / 2; i++) {
            lists[i] = mergeTwoLists(lists[i], lists[listsSize - 1 - i]);
        }
        listsSize = newSize;
    }

    return lists[0];
}


// #include <stdio.h>
// #include <stdlib.h>

// // Definition for singly-linked list.
// struct ListNode {
//     int val;
//     struct ListNode *next;
// };

// // Function to create a new node
// struct ListNode* createNode(int val) {
//     struct ListNode* newNode = (struct ListNode*)malloc(sizeof(struct ListNode));
//     newNode->val = val;
//     newNode->next = NULL;
//     return newNode;
// }

// // Function to merge two sorted linked lists
// struct ListNode* mergeTwoLists(struct ListNode* l1, struct ListNode* l2) {
//     struct ListNode dummy;
//     struct ListNode* current = &dummy;
//     dummy.next = NULL;

//     while (l1 != NULL && l2 != NULL) {
//         if (l1->val < l2->val) {
//             current->next = l1;
//             l1 = l1->next;
//         } else {
//             current->next = l2;
//             l2 = l2->next;
//         }
//         current = current->next;
//     }

//     if (l1 != NULL) {
//         current->next = l1;
//     } else {
//         current->next = l2;
//     }

//     return dummy.next;
// }

// // Function to merge k sorted linked lists
// struct ListNode* mergeKLists(struct ListNode** lists, int listsSize) {
//     if (listsSize == 0) return NULL;

//     while (listsSize > 1) {
//         int newSize = (listsSize + 1) / 2;
//         for (int i = 0; i < listsSize / 2; i++) {
//             lists[i] = mergeTwoLists(lists[i], lists[listsSize - 1 - i]);
//         }
//         listsSize = newSize;
//     }

//     return lists[0];
// }

// // Function to print the linked list
// void printList(struct ListNode* node) {
//     while (node != NULL) {
//         printf("%d ", node->val);
//         node = node->next;
//     }
//     printf("\n");
// }

// int main() {
//     // Example input
//     struct ListNode* lists[3];

//     lists[0] = createNode(1);
//     lists[0]->next = createNode(4);
//     lists[0]->next->next = createNode(5);

//     lists[1] = createNode(1);
//     lists[1]->next = createNode(3);
//     lists[1]->next->next = createNode(4);

//     lists[2] = createNode(2);
//     lists[2]->next = createNode(6);

//     struct ListNode* result = mergeKLists(lists, 3);
//     printList(result);

//     return 0;
// }
