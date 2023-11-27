package org.softtest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class trieTest {
    Trie trie;

    @BeforeEach
    public void setUp() {
        trie = new Trie();
    }

    @Test
    public void testTrieInsertAndSearch() {
        trie.insert("apple");
        assertTrue(trie.search("apple"));
        assertFalse(trie.search("app"));
        assertTrue(trie.searchPrefix("app"));

        trie.insert("app");
        assertTrue(trie.search("app"));
    }
    @Test
    public void testWordSearch() {
        char[][] board = {
                {'o', 'a', 'a', 'n'},
                {'e', 't', 'a', 'e'},
                {'i', 'h', 'k', 'r'},
                {'i', 'f', 'l', 'v'}
        };

        WordSearch wordSearch = new WordSearch();
        assertTrue(wordSearch.exist(board, "oath"));
        assertFalse(wordSearch.exist(board, "pea"));
    }
}

