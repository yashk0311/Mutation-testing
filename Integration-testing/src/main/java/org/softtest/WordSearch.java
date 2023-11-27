package org.softtest;

public class WordSearch {
    public boolean exist(char[][] board, String word) {
        if (board == null || board.length == 0 || word == null || word.length() == 0) {
            return false;
        }

        Trie trie = new Trie();
        trie.insert(word);

        int rows = board.length;
        int cols = board[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (exist(board, i, j, trie.root, word)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean exist(char[][] board, int i, int j, TrieNode node, String word) {
        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length || board[i][j] == '#' || node.children[board[i][j] - 'a'] == null) {
            return false;
        }

        char ch = board[i][j];
        node = node.children[ch - 'a'];

        if (node.isEndOfWord) {
            return true;
        }

        board[i][j] = '#';

        boolean exist = exist(board, i + 1, j, node, word) || exist(board, i - 1, j, node, word) ||
                exist(board, i, j + 1, node, word) || exist(board, i, j - 1, node, word);

        board[i][j] = ch;
        return exist;
    }
}
