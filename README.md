# JAVA program which checks whether T2 is a sub-tree of T1, when both the trees are
represented using adjacency matrix.

Application
Q. A tourist in a city would like to navigate through the city via the metro. The metro map
showing the railway lines and stations is available to the tourist. Write a program that would
help the tourist check if the route that he plans to take is valid as per the metro map.

Here, we assume the metro map to be a tree T1 in which the lines are the branches and the stations
are the vertices of said tree.
The tourist would have to first prepare an adjacency matrix of all the stations(vertices) and
lines(connections) as per the metro map (T1). Then, the person would have to do the same for the
route that he wants to check for(T2).

The program requires one to input the number of vertices of T1, (number of stations from the metro
map) and the naming for the same. Let’s put in 5 as the number of vertices for T1 and ‘abcde’ for the
names of the vertices.
Then, one must input the number of vertices of T2(number of stations of assumed route) and their
names. Let’s input 4 and ‘acde’ for the same.
It then checks if the number of vertices of T2 is less than or equal to that of T1, if not, -the program
prints the result “T2 is not a sub-tree of T1”, i.e the route assumed by the tourist is not a valid route to
take. else- we input the adjacency matrix for both T1 and T2, which is a matrix representation of the
connections between stations.
Then, the program checks for the vertices (stations) that are present in T1 but not in T2. Here we
have b’. This data is then used to create a new adjacency matrix for T1 where we eliminate the rows
and columns of that vertex ‘b’ from the original adjacency vertex of T1.
Now, if the new adjacency matrix of T1 is the same as the adjacency matrix of T2, the program prints
the result “T2 is a sub tree of T1” i.e the route assumed by the tourist is indeed a valid route to take.
