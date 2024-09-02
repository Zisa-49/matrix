#include<stdio.h>
int main()
{
    int i,j,r,c,A[100][100],B[100][100],C[100][100];

    printf("Enter the number of rows and colume:");
    scanf("%d %d",&r,&c);

    printf("Enter the elements for A matrix:");
    for(i=0;i<r;i++)
    {
        for(j=0;j<c;j++)
        {
            printf("A[%d][%d]=",r,c);
            scanf("%d",&A[i][j]);
        }
        printf("\n");
    }
    printf("Enter the elements for B matrix:");
    for(i=0;i<r;i++)
    {
        for(j=0;j<c;j++)
        {
            printf("B[%d][%d]=",r,c);
            scanf("%d",&B[i][j]);
        }
        printf("\n");
    }
    printf("A= ");
    for(i=0;i<r;i++)
    {
        printf("\t");
        for(j=0;j<r;j++)
        {
            printf("%d ", A[i][j]);
        }
        printf("\n");
    }
        printf("B= ");
    for(i=0;i<r;i++)
    {
        printf("\t");
        for(j=0;j<r;j++)
        {
            printf("%d ",B[i][j]);
        }
        printf("\n");
    }
    for(i=0;i<r;i++)
    {
        for(j=0;j<r;j++)
        {
            C[i][j]=A[i][j]+B[i][j];
        }
    }
    printf("\nA+B= ");
    for(i=0;i<r;i++)
    {

        for(j=0;j<r;j++)
        {
            printf("%d ",C[i][j]);
        }
        printf("\n");
        printf("\t");
    }

    return 0;
}
