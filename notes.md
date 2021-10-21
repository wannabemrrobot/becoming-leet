### NOTES:

#### Approach dumps:
- If you encounter a problem where it requires finding unique elements or eliminating duplicates, consider using `Hashing Data Structures`.


#### Tree:
- There are two types of data structures based on the arrangement of the data.
  - Linear(Unilevel) [Arrays, Linked Lists, Stacks, Queue].
  - Non-linear(Multilevel) [Tree, Graph].
- Trees are `hierarchial data structures`.
- Trees are `Unidirectional`.
- Trees are `Acyclic` meaning, that they dont form a cycle.
- Terminologies of Tree:
  - `parent` - immediate predecessor of a particular node, it has child nodes.
  - `root` - the top level of the node, which does not have any parent node.
  - `child` - the immediate successor of a particular node, it has parent node.
  - `leaf node` - it has no child node, the last node of the tree hierarchy. It is called as an `external node`.
  - `non-leaf node` - branch nodes which has one or more child nodes, will not the last node of the tree, and also called as an `internal node`.
  - `path` - sequence of consecutive edges from the source to that node.
  - `depth` - length of the path from the root to that particular node.
  - `depth of the tree` - length of the path from the root to the deepest lead node.
  - `depth` is calculated from the top.
  - `depth of the root = 0`
  - `degree` - number of children of that particular node.
  - `degree of the tree` - the maximum degree of all the degrees of the node.
  - `height` - number of edges from the leaf node to that particular node.
  - `height of the tree` - number of edges from the deepest leaf node to the root node.
  - `height` is calculated from the bottom(leaf node).
  - `height of the root = height of the tree`
  - `height != depth`
  - `level` - the count of the node levels starting from the root node.
  - `level` starts from `0`.
  - `level of the tree = height of the tree = depth of the tree`
  - `level of the node = depth of the node`
  - `level of the node != height of the node`
  - `(n) nodes = (n-1) edges` - if we add one edge, it will become cyclic.
  - `ancestor` - the parent of the node is called as ancestor.
  - `descendant` - all the child nodes of a particular node are descendants to that node.
  - `siblings` - two child nodes from the same parent is called as siblings.
  - `subtree` - a tree can have its subtree, which is a child of the root can have its own tree like hierarchy.