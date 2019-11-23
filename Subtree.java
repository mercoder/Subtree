import java.util.*;
import java.util.Arrays;
public class Subtree
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
    // Here, T1 is the parent tree and T2 is the sub-tree

     //To input number of vertices of T1 Tree
        System.out.println("Enter number of vertices of T1: ");
        int number_of_parent_vertices=sc.nextInt();
     //To input names all vertices of T1 in ascending order in a String
        System.out.println("Enter names of all vertices of T1 in ascending order: ");
        String parent_vertices_names;
        parent_vertices_names=sc.next();
        
    //To input number of vertices of T2 Tree
        System.out.println("Enter number of vertices of T2: ");
        int number_of_sub_vertices=sc.nextInt();
    //To input names of all vertices of T2 in ascending order in String
        System.out.println("Enter names of all vertices of T2 in ascending order: ");
        String sub_vertices_names;
        sub_vertices_names=sc.next();
      
    //To check if number of vertices of T2<= T1
        if(number_of_parent_vertices>=number_of_sub_vertices)
        {
    //To input adjacency matrix of T1 Tree
            System.out.println("Enter Adjacency Matrix of T1 Tree: ");
            int adjacency_matrix_graph[][]= new int[number_of_parent_vertices][number_of_parent_vertices];
            for(int i=0;i<number_of_parent_vertices;i++)
            {
                for(int j=0;j<number_of_parent_vertices;j++)
                {
                    adjacency_matrix_graph[i][j]=sc.nextInt();
                }
            }
            
  
    //To input adjacency matrix of T2 Tree
        System.out.println("Enter Adjacency Matrix of T2 Tree: ");
          int adjacency_matrix_subgraph[][]= new  int[number_of_sub_vertices][number_of_sub_vertices]; 
           for(int i=0;i<number_of_sub_vertices;i++)
           {
               for(int j=0;j<number_of_sub_vertices;j++)
               {
                   adjacency_matrix_subgraph[i][j]=sc.nextInt();
               }
            }

     //To print adjacency matrix on T1 Tree
    System.out.print("Adjacency matrix of T1 Tree: \n");
    for (int i = 0; i < number_of_parent_vertices; i++)
    {
        for (int j = 0; j < number_of_parent_vertices; j++)
        {
                System.out.print(adjacency_matrix_graph[i][j] + " ");
        }      
        System.out.println();
    }

        
    //To print adjacency matrix of T2 Tree
    System.out.print("Adjacency matrix of T2 Tree: \n");
    for (int i = 0; i < number_of_sub_vertices; i++)
    {
        for (int j = 0; j < number_of_sub_vertices; j++)
        {
                System.out.print(adjacency_matrix_subgraph[i][j] + " ");
        }      
        System.out.println();
    }

    //To compare vertices of both trees
            System.out.print("\nVertices present in T1 Tree but not in T2 Tree:\n");
            int poslength=number_of_parent_vertices-number_of_sub_vertices;
            int pos[]=new int[poslength];
            int common[]=new int [number_of_sub_vertices];
            int k=-1;int w=-1;
            for (int i = 0; i <number_of_parent_vertices ; i++) 
            { int j;
             for (j = 0; j < number_of_sub_vertices; j++) 
                    if (parent_vertices_names.charAt(i) == sub_vertices_names.charAt(j)) 
                    {
                        w++;
                        common[w]=i;
                        break;
                    } 
                    
    
                if (j == number_of_sub_vertices) 
                {
                    System.out.println(parent_vertices_names.charAt(i) + " ");
                    k++;
                    pos[k]=i;
                }
            }     
            
    // To create new array after deleting rows and columns of the vertices not present in T2 from T1.
            int adjacency_matrix_graph_final[][]=new int[number_of_sub_vertices][number_of_sub_vertices];

        int r=-1;int n;int l;
         for(int i=0;i<number_of_sub_vertices;i++)
         {r++;int m=0;
             for(int j=0;j<number_of_sub_vertices;j++)
             {
                 n=common[r];
                 l=common[m];
                 adjacency_matrix_graph_final[i][j]=adjacency_matrix_graph[n][l];
                 m++;

             }
            
         }

         int j,i;
         int flag = 1;
         for (i = 0; i < number_of_sub_vertices; i++)
         for (j = 0; j < number_of_sub_vertices; j++)
            if (adjacency_matrix_graph_final[i][j]!= adjacency_matrix_subgraph[i][j]) 
               flag = 0;
         if (flag == 1)
         {System.out.print("RESULT: T2 is a Sub-Tree of T1");}

         else
         System.out.print("RESULT: T2 is not a Sub-Tree of T1");
              
        }
        //end of if 
    
        else
        {
            System.out.println("RESULT:T2 is not a Sub-Tree of T1");
        }
        
    }
}
