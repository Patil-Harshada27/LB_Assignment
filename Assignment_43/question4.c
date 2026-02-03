///////////////////////////////////////////////////////////
//
//  File name :     question4.c
//  Description :   This program implements Singly Linear
//                  Linked List and returns second
//                  maximum element
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
//  Function Name : SecondMaximum
//
////////////////////////////////////////////////////////////
int SecondMaximum(PNODE first)
{
    int iMax = 0;
    int iSecondMax = 0;


    while (first != NULL)
    {
        if (first->data > iMax)
        {
            iSecondMax = iMax;
            iMax = first->data;
        }
        else if ((first->data > iSecondMax) && (first->data != iMax))
        {
            iSecondMax = first->data;
        }
        first = first->next;
    }

    return iSecondMax;
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
    InsertFirst(&head, 21);
    InsertFirst(&head, 11);
    InsertLast(&head, 101);
    InsertLast(&head, 111);
    InsertLast(&head, 121);

    Display(head);

    iRet = Count(head);
    printf("Number of nodes are : %d\n", iRet);

    iRet = SecondMaximum(head);
    printf("Second maximum element is : %d\n", iRet);

    return 0;
}

////////////////////////////////////////////////////////////
//
//  Test Case
//
//  Input  : 11 21 51 75 101 111 121
//  Output : Second maximum element is : 111
//
////////////////////////////////////////////////////////////