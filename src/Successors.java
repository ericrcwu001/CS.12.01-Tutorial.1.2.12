public class Successors {
    static Position findPosition(int target, int[][] arr) {
        for (int i = 0; i < arr.length; ++i) {
            for (int j = 0; j < arr[i].length; ++j) {
                if (arr[i][j] == target) {
                    return new Position(i, j);
                }
            }
        }
        return null;
    }

    static Position[][] getSuccessorArray(int[][] arr) {
        // Assuming that the fed 2D array isn't "jagged", e.g. row lengths are different
        Position[][] successorArray = new Position[arr.length][arr[0].length];
        for (int i = 0; i < arr.length; ++i) {
            for (int j = 0; j < arr[i].length; ++j) {
                Position pos = findPosition(arr[i][j]+1, arr);
                successorArray[i][j] = pos;
            }
        }
        return successorArray;
    }
}
