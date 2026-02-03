#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>

#pragma pack(1)

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

int CountSmaller(PNODE first, int X)
{
    int iCount = 0;

    while (first != NULL)
    {
        if (first->data < X)
        {
            iCount++;
        }
        first = first->next;
    }
    return iCount;
}

int main()
{
    PNODE head = NULL;
    int iRet = 0;
    

    InsertFirst(&head, 75);
    InsertFirst(&head, 50);
    InsertFirst(&head, 21);
    InsertFirst(&head, 11);
    InsertLast(&head, 101);
    InsertLast(&head, 21);
    InsertLast(&head, 121);

    Display(head);
    iRet = Count(head);
    printf("Number of nodes are : %d\n", iRet);

    iRet = CountSmaller(head, 50);
    printf("Count < 50 : %d\n", iRet);

    return 0;
}
