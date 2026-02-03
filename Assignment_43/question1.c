////////////////////////////////////////////////////////////
//
//  File name :    question1.c
//  Description :   This program implements Singly Linear
//                  Linked List and displays perfect numbers
//  Author :       Harshada Patil
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
//  Function Name : CheckPerfect
//
////////////////////////////////////////////////////////////
void CheckPerfect(PNODE first)
{
    int iCnt = 0;
    int iSum = 0;
    int iNo = 0;

    while (first != NULL)
    {
        iNo = first->data;
        iSum = 0;

        if (iNo < 0)
        {
            iNo = -iNo;
        }

        for (iCnt = 1; iCnt <= (iNo / 2); iCnt++)
        {
            if (iNo % iCnt == 0)
            {
                iSum = iSum + iCnt;
            }
        }

        if (iSum == iNo && iNo != 0)
        {
            printf("Perfect number is : %d\n", iNo);
        }

        first = first->next;
    }
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

    InsertFirst(&head, 75);
    InsertFirst(&head, 51);
    InsertFirst(&head, 6);
    InsertFirst(&head, 11);
    InsertLast(&head, 101);
    InsertLast(&head, 111);
    InsertLast(&head, 121);

    Display(head);

    iRet = Count(head);
    printf("Number of nodes are : %d\n", iRet);

    CheckPerfect(head);

    return 0;
}

////////////////////////////////////////////////////////////
//
//  Test Case
//
//  Input  : 11 6 51 75 101 111 121
//  Output : Perfect number is : 6
//
////////////////////////////////////////////////////////////