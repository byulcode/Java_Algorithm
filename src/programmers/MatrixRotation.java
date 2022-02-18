package programmers;

// ��� �׵θ� ȸ���ϱ�
public class MatrixRotation {
	static int[][] matrix;
	public int[] solution(int rows, int columns, int[][] queries) {
        
        matrix = new int[rows][columns];
        
        int[] answer = new int[queries.length];
        
        //��� �ʱ�ȭ
        int cnt = 1;
        for(int i=0; i <rows ; i++) {
        	for(int j=0; j<columns;j++) {
        		matrix[i][j] = columns * i + j + 1;
        	}
        }
        
        for(int i=0; i<queries.length;i++) {
        	answer[i] = rotation(queries[i][0], queries[i][1], queries[i][2], queries[i][3]);
        }
        return answer;
    }
	
	static int rotation(int r1, int c1, int r2, int c2) {
		r1--; r2--; c1--; c2--;
		
		int tmp = matrix[r1][c1];
		int min = tmp;
		
		// ���� �� �Ʒ� -> ��
		for(int i=r1; i<r2; i++) {
			matrix[i][c1] = matrix[i+1][c1];
			min = Math.min(min, matrix[i][c1]);
		}
		
		// �Ʒ��� ���� -> ��
		for(int i=c1; i<c2; i++) {
			matrix[r2][i] = matrix[r2][i+1];
			min = Math.min(min, matrix[r2][i]);
		}
		
		// ������ �� �� -> �Ʒ�
		for(int i=r2; i>r1; i--) {
			matrix[i][c2] = matrix[i-1][c2];
			min = Math.min(min, matrix[i][c2]);
		}
		
		// ���� �� -> ����
		for(int i=c2; i>c1; i--) {
			matrix[r1][i] = matrix[r1][i-1];
			min = Math.min(min, matrix[r1][i]);
		}
		matrix[r1][c1+1] = tmp;
		
		return min;
	}
}
