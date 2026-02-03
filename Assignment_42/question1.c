////////////////////////////////////////////////////////////
//
//  File name :     question1.c
//  Description :   This program implements Singly Linear
//                  Linked List and gives the first 
//                  occurrence of a number
//  Author :       Harshada Anil Patil
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


struct node
{
    int data;
    struct node *next;
};

typedef struct node NODE;
typedef struct node* PNODE;
typedef struct node** PPNODE;

////////////////////////////////////////////////////////////
//
//  Function Name : InsertFirst
//
////////////////////////////////////////////////////////////
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

////////////////////////////////////////////////////////////
//
//  Function Name : InsertLast
//
////////////////////////////////////////////////////////////
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

////////////////////////////////////////////////////////////
//
//  Function Name : DeleteFirst
//
////////////////////////////////////////////////////////////
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

////////////////////////////////////////////////////////////
//
//  Function Name : DeleteLast
//
////////////////////////////////////////////////////////////
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

////////////////////////////////////////////////////////////
//
//  Function Name : Display
//
////////////////////////////////////////////////////////////
void Display(PNODE first)
{
    while (first != NULL)
    {
        printf("| %d |->", first->data);
        first = first->next;
    }
    printf("NULL\n");
}

////////////////////////////////////////////////////////////
//
//  Function Name : Count
//
////////////////////////////////////////////////////////////
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

////////////////////////////////////////////////////////////
//
//  Function Name : FirstOccurence
//
////////////////////////////////////////////////////////////
int FirstOccurence(PNODE first, int no)
{
    int iCount = 0;

    while (first != NULL)
    {
        if (first->data == no)
        {
            return iCount;
        }
        first = first->next;
        iCount++;
    }
    return -1;
}

////////////////////////////////////////////////////////////
//
//  ENTRY POINT FUNCTION
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

    printf("Enter the Number You want to search:\n");
    scanf("%d",&iNo);

    Display(head);

    iRet = Count(head);
    printf("Number of nodes are : %d\n", iRet);

    iRet = FirstOccurence(head, iNo);

    if (iRet == -1)
    {
        printf("Element not found\n");
    }
    else
    {
        printf("First occurrence index is : %d\n", iRet);
    }

    return 0;
}

////////////////////////////////////////////////////////////
//
//  Test Cases Successfully Handled by the Application
//
//  Input  : 11 21 51 75 101 111 121
//  Output : First occurrence of 51 is at index 2
//
////////////////////////////////////////////////////////////