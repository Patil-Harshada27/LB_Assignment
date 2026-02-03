////////////////////////////////////////////////////////////
//
//  File name :   question2.c
//  Description :   This program implements Singly Linear
//                  Linked List and returns the last
//                  occurrence of a number
//  Author :        Harshada Patil
//  Date :          16/12/2025
//
////////////////////////////////////////////////////////////

////////////////////////////////////////////////////////////
//
//  REQUIRED HEADER FILES
//
////////////////////////////////////////////////////////////
#include <stdio.h>
#include <stdlib.h>

#pragma pack(1)

////////////////////////////////////////////////////////////
//
//  Structure Name : node
//  Description    : Structure for singly linked list node
//
////////////////////////////////////////////////////////////
struct node
{
    int data;
    struct node *next;
};

typedef struct node NODE;
typedef struct node* PNODE;
typedef struct node** PPNODE;

void InsertFirst(PPNODE first, int no)
{
    PNODE newn = NULL;

    newn = (PNODE)malloc(sizeof(NODE));
    newn->data = no;
    newn->next = NULL;

    if (*first == NULL)
    {
        *first = newn;
    }
    else
    {
        newn->next = *first;
        *first = newn;
    }
}

void InsertLast(PPNODE first, int no)
{
    PNODE newn = NULL;
    PNODE temp = NULL;

    newn = (PNODE)malloc(sizeof(NODE));
    newn->data = no;
    newn->next = NULL;

    if (*first == NULL)
    {
        *first = newn;
    }
    else
    {
        temp = *first;
        while (temp->next != NULL)
        {
            temp = temp->next;
        }
        temp->next = newn;
    }
}

void DeleteFirst(PPNODE first)
{
    PNODE temp = NULL;

    if (*first == NULL)               // Case 1: Empty list
    {
        return;
    }
    else if ((*first)->next == NULL)  // Case 2: Single node
    {
        free(*first);
        *first = NULL;
    }
    else                              // Case 3: More than one node
    {
        temp = *first;
        *first = (*first)->next;
        free(temp);
    }
}

void DeleteLast(PPNODE first)
{
    PNODE temp = NULL;

    if (*first == NULL)               // Case 1: Empty list
    {
        return;
    }
    else if ((*first)->next == NULL)  // Case 2: Single node
    {
        free(*first);
        *first = NULL;
    }
    else                              // Case 3: More than one node
    {
        temp = *first;
        while (temp->next->next != NULL)
        {
            temp = temp->next;
        }
        free(temp->next);
        temp->next = NULL;
    }
}

void Display(PNODE first)
{
    while (first != NULL)
    {
        printf("| %d |->", first->data);
        first = first->next;
    }
    printf("NULL\n");
}

int Count(PNODE first)
{
    int iCount = 0;

    while (first != NULL)
    {
        iCount++;
        first = first->next;
    }
    return iCount;
}

int LastOccurence(PNODE first, int no)
{
    int iCount = 0;
    int iPos = 0;
    int iFlag = 0;

    while (first != NULL)
    {
        if (first->data == no)
        {
            iPos = iCount;
            iFlag = 1;
        }
        first = first->next;
        iCount++;
    }

    if (iFlag == 0)
    {
        return -1;
    }
    else
    {
        return iPos;
    }
}

////////////////////////////////////////////////////////////
//
//  ENTRY POINT FUNCTION FOR THE APPLICATION
//
////////////////////////////////////////////////////////////
int main()
{
    PNODE head = NULL;
    int iRet = 0;
    int iNo = 0;

    InsertFirst(&head, 75);
    InsertFirst(&head, 51);
    InsertFirst(&head, 21);
    InsertFirst(&head, 11);
    InsertLast(&head, 101);
    InsertLast(&head, 111);
    InsertLast(&head, 121);

    printf("Enter the number you want to search:\n");
    scanf("%d", &iNo);

    Display(head);

    iRet = Count(head);
    printf("Number of nodes are : %d\n", iRet);

    iRet = LastOccurence(head, iNo);

    if (iRet == -1)
    {
        printf("Element not found\n");
    }
    else
    {
        printf("Last occurrence index is : %d\n", iRet);
    }

    return 0;
}

////////////////////////////////////////////////////////////
//
//  Test Cases Successfully Handled by the Application
//
//  Input  : 11 21 51 75 101 111 121
//  Search : 51
//  Output : Last occurrence of 51 is at index 2
//
////////////////////////////////////////////////////////////