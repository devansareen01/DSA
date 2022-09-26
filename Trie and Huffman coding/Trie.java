class TrieNode {
        char data;
        boolean isTerminating;// terminate here means that a meaningful word is completing at that terminating
                              // node
        TrieNode children[];
        int childCount;

        public TrieNode(char data) {
                this.data = data;
                isTerminating = false;
                children = new TrieNode[26];
                childCount = 0;
        }
}

public class Trie {
        private TrieNode root;

        public Trie() {
                root = new TrieNode('\0');
        }

        private void add(TrieNode root, String word) {
                if (word.length() == 0) {
                        root.isTerminating = true;
                        return;
                }
                int childIndex = word.charAt(0) - 'a';
                TrieNode child = root.children[childIndex];
                if (child == null) {
                        child = new TrieNode(word.charAt(0));
                        root.children[childIndex] = child;
                        root.childCount++;
                }
                add(child, word.substring(1));
        }

        public void add(String word) {
                add(root, word);
        }

        public boolean search(String word) {
                return search(root, word);
        }

        private boolean search(TrieNode root, String word) {
                if (word.length() == 0) {
                        return root.isTerminating;
                }
                int childIndex = word.charAt(0) - 'a';
                TrieNode child = root.children[childIndex];
                if (child == null) {
                        return false;
                }
                return search(child, word.substring(1));
        }

        public void remove(String word) {
                remove(root, word);
        }

        private void remove(TrieNode root, String word) {
                if (word.length() == 0) {
                        root.isTerminating = false;
                        return;
                }
                int childIndex = word.charAt(0) - 'a';
                TrieNode child = root.children[childIndex];
                if (child == null) {
                        return;
                }
                remove(child, word.substring(1));
                if (!root.isTerminating && root.childCount == 0) {
                        root.children[childIndex] = null;
                        root.childCount--;
                }

        }
}