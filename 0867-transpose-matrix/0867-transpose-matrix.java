class Solution 
{
    public int[][] transpose(int[][] matrix) 
    {
        int n1=matrix.length;
        int n2=matrix[0].length;
        int result[][]=new int[n2][n1];
        for(int i=0;i<n1;i++)
        {
            for(int j=0;j<n2;j++)
            {
                result[j][i]=matrix[i][j];
            }
        }
        return result;
    }
}