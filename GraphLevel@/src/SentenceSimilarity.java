import java.io.*;
import java.util.*;
public class SentenceSimilarity {



        public static void main(String[] args) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(br.readLine());

            String[] sentence1 = br.readLine().split(" ");
            String[] sentence2 = br.readLine().split(" ");

            int m = Integer.parseInt(br.readLine());

            String[][] pairs = new String[m][2];
            for (int i = 0; i < m; i++) {
                pairs[i] = br.readLine().split(" ");
            }

            System.out.println(areSentencesSimilarTwo(sentence1, sentence2, pairs));

        }


        static HashMap<String, String> parent;
        static HashMap<String, Integer> rank;

        public static boolean areSentencesSimilarTwo(String[] Sentence1, String[] Sentence2, String[][] pairs) {
            parent = new HashMap<>();
            rank = new HashMap<>();

            for(int i = 0; i < pairs.length; i++){
                if(!parent.containsKey(pairs[i][0])){
                    parent.put(pairs[i][0], pairs[i][0]);
                    rank.put(pairs[i][0], 0);
                }


                if(!parent.containsKey(pairs[i][1])){
                    parent.put(pairs[i][1], pairs[i][1]);
                    rank.put(pairs[i][1], 0);
                }
            }

            for(int i = 0; i < pairs.length; i++){
                String p0Lead = find(pairs[i][0]);
                String p1Lead = find(pairs[i][1]);

                if(p0Lead.equals(p1Lead) == false){
                    union(p0Lead, p1Lead);
                }
            }

            if(Sentence1.length != Sentence2.length){
                return false;
            }

            for(int i = 0; i < Sentence1.length; i++){
                String w1 = Sentence1[i];
                String w2 = Sentence2[i];

                if(w1.equals(w2)){
                    continue;
                } else if(parent.containsKey(w1) == false  || parent.containsKey(w2) == false){
                    return false;
                }

                String w1l = find(w1);
                String w2l = find(w2);
                if(w1l.equals(w2l) == false){
                    return false;
                }
            }

            return true;
        }

        public static String find(String x){

            if(parent.get(x).equals(x)){
                return x;
            } else {
                String pox = parent.get(x);
                String setLead = find(pox);
                parent.put(x, setLead);
                return setLead;
            }
        }

        public static void union(String xl, String yl){
            if(rank.get(xl) < rank.get(yl)){
                parent.put(xl, yl);
            } else if(rank.get(yl) < rank.get(xl)){
                parent.put(yl, xl);
            } else {
                parent.put(xl, yl);
                rank.put(yl, rank.get(yl) + 1);
            }
        }

    }

/*
Given two sentences sentence1 and sentence2 each represented as a string array and given a 2d array of string pairs where each row contains two words {x,y} indicating that the word x and y are similar.
Return true if sentence1 and sentence2 are similar, or false if they are not similar. Two sentences are similar if they have the same length and sentence1[i] and sentences2[i] are similar.

Note: Similarity relation is transitive.
Input Format
First line contains an integer denoting the sentence length.
Second line contaions the words of sentence1 separated by space.
Third line contains the words of sentence2 separated by space.
Fourth line contains an integer m denoting number of pairs.
Each of next m lines contains 2 words separated by space which are similar.
Output Format
Print true if Sentence1 and Sentence2 are similar else print false.


Sample Input
3
treat fight miss
like train lost
4
treat catch
train fight
like catch
miss lost

Sample Output
true
 */