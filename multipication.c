#include<stdio.h>
int main()
{
    int i,j,k,r1,r2,c1,c2,A[100][100],B[100][100],C[100][100],sum=0;

    printf("Enter the number of rows and colume for A matrix:");
    scanf("%d %d",&r1,&c1);

    printf("Enter the number of rows and colume for B matrix:");
    scanf("%d %d",&r2,&c2);

    while(c1!=r2)
    {
        printf("Error! colume of A matrix not equal to b matrix. ");
            printf("Enter the number of rows and colume for A matrix:");
    scanf("%d %d",&r1,&c1);

    printf("Enter the number of rows and colume for B matrix:");
    scanf("%d %d",&r2,&c2);
    }


    printf("Enter the elements for A matrix:");
    for(i=0;i<r1;i++)
    {
        for(j=0;j<c1;j++)
        {
            printf("A[%d][%d]=",r1,c1);
            scanf("%d",&A[i][j]);
        }
        printf("\n");
    }
    printf("Enter the elements for B matrix:");
    for(i=0;i<r2;i++)
    {
        for(j=0;j<c2;j++)
        {
            printf("B[%d][%d]=",r2,c2);
            scanf("%d",&B[i][j]);
        }
        printf("\n");
    }
    printf("A= ");
    for(i=0;i<r1;i++)
    {
        printf("\t");
        for(j=0;j<c1;j++)
        {
            printf("%d ", A[i][j]);
        }
        printf("\n");
    }
        printf("B= ");
    for(i=0;i<r2;i++)
    {
        printf("\t");
        for(j=0;j<c2;j++)
        {
            printf("%d ",B[i][j]);
        }
        printf("\n");
    }
            for(i=0;i<r1;i++)
    {
        for(j=0;j<c2;j++)
        {

           for(k=0;k<c1;k++)
           {
               sum=sum+A[i][k]*B[k][j];
           }
           C[i][j]=sum;
           sum=0;
        }
    }
    printf("\nA*B= ");
    for(i=0;i<r1;i++)
    {

        for(j=0;j<c2;j++)
        {
            printf("%d ",C[i][j]);
        }
        printf("\n");
        printf("\t");
    }

    return 0;
}
