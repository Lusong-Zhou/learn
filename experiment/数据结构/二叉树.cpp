#include<stdio.h>
#include<malloc.h>
typedef char dataType;
struct TreeNode{
    dataType data;
    TreeNode *lchild,*rchild;
};
void CreateTree(TreeNode *&t,dataType x)			//创建二叉树
{
    dataType d;
    scanf("%c ",&d);
    if(d == x){
        t = NULL;
    }else{
        t = (TreeNode*)malloc(sizeof(TreeNode));
        t->data = d;
        CreateTree(t->lchild,x);
        CreateTree(t->rchild,x);
    }
}
int size(TreeNode *t)				//二叉树的总结点数
	{
    if(t == NULL) return 0;
    if(t->lchild == NULL && t->rchild == NULL) return 1;
    return size(t->lchild)+size(t->rchild)+1;
	}
int Leaf(TreeNode *t)				//二叉树的叶子节点数
	{
    if(t == NULL) return 0;
    if(t->lchild== NULL && t->rchild == NULL) return 1;
    return Leaf(t->lchild)+Leaf(t->rchild);
	}
int Height(TreeNode *t)					//二叉树的高度
	{
    if(t == NULL) return 0;
    int l = Height(t->lchild);
    int r = Height(t->rchild);
    return l>r ? 1+1 : r+1;
	}
int main()
{
    TreeNode *t;
    CreateTree(t,'#');
    printf("二叉树的总结点数为:%d\n",size(t));
    printf("二叉树的叶子节点数为:%d\n",Leaf(t));
    printf("二叉树的高度为:%d\n",Height(t));
}
