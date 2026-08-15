class Solution:
    def islandPerimeter(self, grid: List[List[int]]) -> int:
        rows, cols = len(grid), len(grid[0])
        visit = set()

        def dfs(i, j):
            # Outside grid OR water
            if i < 0 or j < 0 or i >= rows or j >= cols or grid[i][j] == 0:
                return 1

            # Already visited land
            if (i, j) in visit:
                return 0

            visit.add((i, j))

            return (
                dfs(i + 1, j)
                + dfs(i, j + 1)
                + dfs(i - 1, j)
                + dfs(i, j - 1)
            )

        for i in range(rows):
            for j in range(cols):
                if grid[i][j] == 1:
                    return dfs(i, j)

        return 0