public class TrieUse {
    public static void main(String[] args) {
        Trie t = new Trie();
        t.add("devan");
        t.add("sareen");
        t.remove("sareen");
        System.out.println(t.search("sareen"));
        System.out.println(t.search("devan"));
        System.out.println(t.search("are"));
    }
}
