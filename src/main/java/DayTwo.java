import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DayTwo {

    private int twoMatchCount = 0;
    private int threeMatchCount = 0;

    public int getChecksum(String input) {
        for(String s : input.split("\n")) {
            Map<Character, Integer> charCounts = getCharacterCounts(s);
            findMatchCounts(charCounts);
        }
        return twoMatchCount * threeMatchCount;
    }

    private Map<Character, Integer> getCharacterCounts(String s) {
        Map<Character, Integer> charCounts = new HashMap<Character, Integer>();
        for (int i = 0; i < s.length(); ++i)
            if (!charCounts.containsKey(s.charAt(i)))
                charCounts.put(s.charAt(i), 1);
            else
                charCounts.put(s.charAt(i), charCounts.get(s.charAt(i)) + 1);
        return charCounts;
    }

    private void findMatchCounts(Map<Character, Integer> charCounts) {
        boolean tempDoubleCount = false;
        boolean tempTripleCount = false;
        for (int value : charCounts.values()) {
            if(!tempDoubleCount && value == 2) {
                twoMatchCount++;
                tempDoubleCount = true;
            } else if(!tempTripleCount && value == 3) {
                threeMatchCount++;
                tempTripleCount = true;
            }
            if(tempDoubleCount && tempTripleCount)
                break;
        }
    }

    public int getTwoMatchCount() {
        return twoMatchCount;
    }

    public int getThreeMatchCount() {
        return threeMatchCount;
    }

    public static void main(String[] args) {
        DayTwo dayTwo = new DayTwo();
        System.out.println(dayTwo.getChecksum(input));
    }

    private static final String input = "myhposlqgeauywfikztndcvrqr\n" +
                                        "mbhposlxfeauywoikztndcvjqi\n" +
                                        "mbhpoulxgeagywfikytndcvjqr\n" +
                                        "jbhposlxgeauywdikztndcvjqk\n" +
                                        "mbhpsslxueauywfikzfndcvjqr\n" +
                                        "mbhposnxgeauzyfikztndcvjqr\n" +
                                        "ibhposlxgetvywfikztndcvjqr\n" +
                                        "mbcposlxgeauywfikztxdcvjqv\n" +
                                        "mlhposltgeauywfikitndcvjqr\n" +
                                        "mbhpostxgeauywfikztndjvjqy\n" +
                                        "mboboslxglauywfikztndcvjqr\n" +
                                        "mbhpoglxgeahywfikztndcvjqp\n" +
                                        "mbhposlxgeapydpikztndcvjqr\n" +
                                        "mbhposlxseauywfikztnncljqr\n" +
                                        "mbhposlxgeauydfisztndcvjqj\n" +
                                        "mbhposlxgeaugwwikzlndcvjqr\n" +
                                        "mbhpoklxgeauywfikztndvvmqr\n" +
                                        "mbhposlxgeauywfikdtndcmjqx\n" +
                                        "mbhposlxaeauapfikztndcvjqr\n" +
                                        "mbwposgxgeauymfikztndcvjqr\n" +
                                        "mbhposlxgeauvwfirzcndcvjqr\n" +
                                        "mbhpozlxgeaqywfykztndcvjqr\n" +
                                        "mahqoslxgeauywfikzgndcvjqr\n" +
                                        "mbhposlcgexbywfikztndcvjqr\n" +
                                        "ykhposlxgeeuywfikztndcvjqr\n" +
                                        "mbhgoswxgeauywfikztndhvjqr\n" +
                                        "mbhposlxgeauywfikztnocmjqp\n" +
                                        "mbvposfageauywfikztndcvjqr\n" +
                                        "mbhpnslxgeauywfikztndgejqr\n" +
                                        "mblposfxgeauypfikztndcvjqr\n" +
                                        "mbhposlxyeauywfikzpndcvmqr\n" +
                                        "ibhposlbgeauywfikotndcvjqr\n" +
                                        "mbmposlxgeauywfiktwndcvjqr\n" +
                                        "mbhposlxgeduywfikztndfvoqr\n" +
                                        "mbhpoklxdeauywfikztndcvuqr\n" +
                                        "mbhposlxgeauywfikltnlcvuqr\n" +
                                        "mbhposlbgsauywfikztndsvjqr\n" +
                                        "mbhposlxgeauywfirzfndcbjqr\n" +
                                        "mphposlxgeauywfikztndcvjgg\n" +
                                        "mohposlcgeauywfikzsndcvjqr\n" +
                                        "mbhpovlxgeauyqfikotndcvjqr\n" +
                                        "qbhpgslxgeauywqikztndcvjqr\n" +
                                        "mbhposlxweauywfikztndtvjqm\n" +
                                        "pbhposlxgeauywfikztnncvjqm\n" +
                                        "mbbposlxpeauuwfikztndcvjqr\n" +
                                        "mbhposlxgmauyrfikztndcvjir\n" +
                                        "pbhposlqgefuywfikztndcvjqr\n" +
                                        "mbhkoslxgeauywfikztndciwqr\n" +
                                        "mbtpoflxgeauywfikztndrvjqr\n" +
                                        "mbhcoslxveguywfikztndcvjqr\n" +
                                        "mbhpovlxgeauywfhkdtndcvjqr\n" +
                                        "mbhposlxgeauywftrztndcujqr\n" +
                                        "mbhposlxgeaoywfdkzpndcvjqr\n" +
                                        "mbnposlxgeyuywfikztldcvjqr\n" +
                                        "mbaposlxweauywfikftndcvjqr\n" +
                                        "mbhposljgeauywfikztcdcvvqr\n" +
                                        "nbhpkslxgeauywfikzwndcvjqr\n" +
                                        "mbhtoslxgeauywfikzkndcvjdr\n" +
                                        "mbhposxxgeaxywfikztndsvjqr\n" +
                                        "mbdpoflxgeauywfisztndcvjqr\n" +
                                        "mbhposvxgeauywfikztnscvnqr\n" +
                                        "mbcposlxghauywfikztndcgjqr\n" +
                                        "mbhpovlxgeauywpckztndcvjqr\n" +
                                        "mbhpfslxgeauywbikntndcvjqr\n" +
                                        "mbhpowyxgeauywfikztndcvjcr\n" +
                                        "mbhposlxoeatywfikztndcvoqr\n" +
                                        "mchpfslxgeauywfikztidcvjqr\n" +
                                        "mbhposvxgearywfikztndcvjcr\n" +
                                        "mbhposlxgeauywfpcztnduvjqr\n" +
                                        "mbhposlxgmauyyfiqztndcvjqr\n" +
                                        "mbhposlxteauuwfikwtndcvjqr\n" +
                                        "mbhpotlspeauywfikztndcvjqr\n" +
                                        "mbhpoelxgeauywfikztndckjkr\n" +
                                        "mbhpnslxgeauywfikztndcvkqs\n" +
                                        "mbhpksfxgwauywfikztndcvjqr\n" +
                                        "mxhwoglxgeauywfdkztndcvjqr\n" +
                                        "mbhphsbjgeauywfikztndcvjqr\n" +
                                        "mbhposlxgeauwifixztndcvjqr\n" +
                                        "mbhposqxguauywfikztndcwjqr\n" +
                                        "mbhposlngeauywfikztedcvjor\n" +
                                        "nbhposlxgeauywiikztndcyjqr\n" +
                                        "mbhposlxgeauawfykztndcvbqr\n" +
                                        "mbhplslxgeauywcikztndcvjrr\n" +
                                        "fshposlxgeagywfikztndcvjqr\n" +
                                        "mbhposlxgeauymcikztndcxjqr\n" +
                                        "mbhponlxgeauyloikztndcvjqr\n" +
                                        "mbhposrxzeanywfikztndcvjqr\n" +
                                        "mbhtoslxgeajyifikztndcvjqr\n" +
                                        "mbhposixkeauywfikhtndcvjqr\n" +
                                        "mahhoslxgeaufwfikztndcvjqr\n" +
                                        "mbhpdslxteauywfikzvndcvjqr\n" +
                                        "mfhposlxgeauywfiqttndcvjqr\n" +
                                        "mbhplslxheauywfikztnscvjqr\n" +
                                        "mbhpoylxgeauywbizztndcvjqr\n" +
                                        "mbhposlhgeawywfjkztndcvjqr\n" +
                                        "mbhkoslxgkauywfilztndcvjqr\n" +
                                        "mbhposnxgeauywfikztkdcvlqr\n" +
                                        "mvhpxslxgevuywfikztndcvjqr\n" +
                                        "mbhpohlxgeauyrficztndcvjqr\n" +
                                        "mbhsosuxgewuywfikztndcvjqr\n" +
                                        "mbhpoxlxgeauywuikztnhcvjqr\n" +
                                        "mbhposlxqeauyqfikztndcvrqr\n" +
                                        "mbhpchlxgeauywfikztnhcvjqr\n" +
                                        "mbhposlxgeauywoikztndcfqqr\n" +
                                        "pbhposlxgeagmwfikztndcvjqr\n" +
                                        "mxhwoglxgeauywfikztndcvjqr\n" +
                                        "mbhpospxgaauywfikstndcvjqr\n" +
                                        "mbhwoxlxgeauywfgkztndcvjqr\n" +
                                        "mbhposlxgeauywfikvtndhvsqr\n" +
                                        "mbbposlxgesuywfikztnicvjqr\n" +
                                        "mhhjoslxgeauywfikztndccjqr\n" +
                                        "mbhkoslxgeagywffkztndcvjqr\n" +
                                        "mbhposlxgesqywfukztndcvjqr\n" +
                                        "mbdposlxgeauywfilztndcvjqp\n" +
                                        "mbhposlxgeakqwfikztedcvjqr\n" +
                                        "mbhposuxgeayywficztndcvjqr\n" +
                                        "mbhposlxgeauywfxkztndcloqr\n" +
                                        "mchposlxgeauywoiiztndcvjqr\n" +
                                        "tbhporlxgeauywfikztndcvyqr\n" +
                                        "mbhposlxoevuywfikzindcvjqr\n" +
                                        "qbhposlxfevuywfikztndcvjqr\n" +
                                        "mbhposlxfeauvwfikztndcvgqr\n" +
                                        "mbjposlxgsauywfikztnwcvjqr\n" +
                                        "vbhposlxgeauvwfikztndcvjqk\n" +
                                        "pbhposlxguauyrfikztndcvjqr\n" +
                                        "mbhposlcgeauywfiketndcviqr\n" +
                                        "mbsposlxgvauywfikztndcviqr\n" +
                                        "mbhposlxgeauynfxkztndcvjbr\n" +
                                        "mbhposlxtentywfikztndcvjqr\n" +
                                        "mbhposlxgeavywfikztndhvjnr\n" +
                                        "mbhpsvlxgeauywfikztndcvzqr\n" +
                                        "mzhpotlxgeauywfiyztndcvjqr\n" +
                                        "mbhposkqgeauywfiwztndcvjqr\n" +
                                        "mbhposlxoeakywfikztndcvjqt\n" +
                                        "mbhposlxghauywfikbdndcvjqr\n" +
                                        "mbhpossxgeauywfikqxndcvjqr\n" +
                                        "mbhposlxgearywhikztydcvjqr\n" +
                                        "mbhposlxgeaiywfikztndfvjur\n" +
                                        "mbhpxslxgoazywfikztndcvjqr\n" +
                                        "mbhposlxneauywfibqtndcvjqr\n" +
                                        "mnheoslxteauywfikztndcvjqr\n" +
                                        "mbhposlxgeauywfmkztrdcvuqr\n" +
                                        "mbhzowlxgeauywfizztndcvjqr\n" +
                                        "mbhloslxgeauyofikztnucvjqr\n" +
                                        "mbhposlxneagywfbkztndcvjqr\n" +
                                        "mbhposongeauywfikztnzcvjqr\n" +
                                        "mwyposlxgeauywfikztnqcvjqr\n" +
                                        "mbhpnqaxgeauywfikztndcvjqr\n" +
                                        "mboposlxzeauywfioztndcvjqr\n" +
                                        "mbhposledeauywfikztndqvjqr\n" +
                                        "mphpaslxgeauywfbkztndcvjqr\n" +
                                        "mbhposrxgeauywlikbtndcvjqr\n" +
                                        "ybhnoslxgeauywfihztndcvjqr\n" +
                                        "mbhposlxgeauywfikntxccvjqr\n" +
                                        "mbhposlxgeauqwfikutndcfjqr\n" +
                                        "mbhposlxglabywfikztidcvjqr\n" +
                                        "mbhpollxgeauywfikxtnscvjqr\n" +
                                        "mboposlggeaufwfikztndcvjqr\n" +
                                        "mbhposlxgeauywpikedndcvjqr\n" +
                                        "mbhpoklxgeauywpikztndcvjlr\n" +
                                        "mbhposhxgeauywfifztndcvpqr\n" +
                                        "mbhposlxgwagywfikztndcvjwr\n" +
                                        "mbhpokldgeauywfikztngcvjqr\n" +
                                        "nbhposlxgeauywfiketndcvjxr\n" +
                                        "mbhhoslxgexuywfikrtndcvjqr\n" +
                                        "mbhposlxgefujwfikztkdcvjqr\n" +
                                        "mbhposlxggagywfikztndchjqr\n" +
                                        "mbhposlxgeauyvfilztnicvjqr\n" +
                                        "mbhposlkgeauywfikzxndcvoqr\n" +
                                        "mbhposlxgeauvqfikztndcvuqr\n" +
                                        "zbhposlxgfauylfikztndcvjqr\n" +
                                        "mbhyoshxgeauywfikztndcvjqa\n" +
                                        "sbhposlxgeauyxfikztndavjqr\n" +
                                        "mlhposlxgeauywfikzmndcqjqr\n" +
                                        "mbhpaslxgekuywfikztnncvjqr\n" +
                                        "ibhhoslxteauywfikztndcvjqr\n" +
                                        "mbhposlxgeauyodibztndcvjqr\n" +
                                        "mbhposlxgkaoywfikztndcvpqr\n" +
                                        "mbhonslxgearywfikztndcvjqr\n" +
                                        "mbdpoolxgealywfikztndcvjqr\n" +
                                        "mbepfslxgvauywfikztndcvjqr\n" +
                                        "mbhposlygeauywfikztfdcvaqr\n" +
                                        "mthpoalxgeauywnikztndcvjqr\n" +
                                        "mbhpesbogeauywfikztndcvjqr\n" +
                                        "mbhposlxgjauywfikztnmcvjqj\n" +
                                        "mbhnoslxgeauydfikgtndcvjqr\n" +
                                        "mbhpxslxgeauywfikztndcvjcx\n" +
                                        "muhposlxgwauywfipztndcvjqr\n" +
                                        "mbhpcslxgeauywfiqztndcvjbr\n" +
                                        "mbhpomlxgeauywfioftndcvjqr\n" +
                                        "mbhposlfgepuywfikzmndcvjqr\n" +
                                        "mbhsosliteauywfikztndcvjqr\n" +
                                        "mbwposlxgeauywfikztnycveqr\n" +
                                        "mbhpfslxgeauywfqkztndcvjhr\n" +
                                        "mxhbvslxgeauywfikztndcvjqr\n" +
                                        "fbhposlxgeauywfikzcnmcvjqr\n" +
                                        "mbhfosfxgeauywfikztnduvjqr\n" +
                                        "tbhporlxgeauywfikztndcvjqm\n" +
                                        "mhhposlxgeauywfikctnecvjqr\n" +
                                        "mbhposlxgeqtywfikztnmcvjqr\n" +
                                        "qbhpjslxgeauywfikztndevjqr\n" +
                                        "tbhpxslxgeaunwfikztndcvjqr\n" +
                                        "wbhposlxgeadywfikztndcujqr\n" +
                                        "mbhposlvgeauywfpkotndcvjqr\n" +
                                        "mbhposlxgeagywfingtndcvjqr\n" +
                                        "mbnposlxgeauywfikztnvcjjqr\n" +
                                        "mohpoilxgeadywfikztndcvjqr\n" +
                                        "mbhposlsgeauywfikztnxcvgqr\n" +
                                        "mbhposlogeauywfikqtndcvjor\n" +
                                        "mbhroslxgeauypfikztndcvjqg\n" +
                                        "mblposuxgetuywfikztndcvjqr\n" +
                                        "mbhposlogeiuywfikztodcvjqr\n" +
                                        "mbhposlxgeauylfikztedcvrqr\n" +
                                        "mbhfoslxgeautwxikztndcvjqr\n" +
                                        "mbhouslxgeauywfikztnycvjqr\n" +
                                        "mbhposlxgeauywfvkqtndlvjqr\n" +
                                        "mbfposltgeauytfikztndcvjqr\n" +
                                        "mbhposlxgcapywfikztnddvjqr\n" +
                                        "hbhposlxgeasywfikztnxcvjqr\n" +
                                        "mbhposntgeauywfikztcdcvjqr\n" +
                                        "mbhponlxgfauywfirztndcvjqr\n" +
                                        "mbhposlxgeatywlikztndcvrqr\n" +
                                        "mohroslzgeauywfikztndcvjqr\n" +
                                        "mbhpojaxgeauywfifztndcvjqr\n" +
                                        "rbhposlxgwauywfikztndovjqr\n" +
                                        "mbhpoclxgeaeywfikztndcvjqo\n" +
                                        "mbhposllgeauywfikzondcvmqr\n" +
                                        "mbhpxslxgeauywfikzymdcvjqr\n" +
                                        "mbhposlxgeasywxikztndkvjqr\n" +
                                        "mbhposlxgeauywfivztndcmjqx\n" +
                                        "qbhposlxgpauywfikgtndcvjqr\n" +
                                        "mbhposlxgeauyqdikztqdcvjqr\n" +
                                        "cbhposlxgeauywfikttjdcvjqr\n" +
                                        "mbhgoslxgeanywfihztndcvjqr\n" +
                                        "mbhposlxgeajywfhkztndcvjvr\n" +
                                        "mbhpozlxgeauewfmkztndcvjqr\n" +
                                        "mbhposlxgeagywfbiztndcvjqr\n" +
                                        "mbhmoslxgeauywfikztndrnjqr\n" +
                                        "ybhposmxgeauywfikztndcviqr\n" +
                                        "mrwposlxgeauywfikztndpvjqr\n" +
                                        "mbhposlxneauywfikztndcbjqh\n" +
                                        "mbhpowlxheauywfikztndcojqr\n" +
                                        "mbeposlxgeauywfiwztnycvjqr\n" +
                                        "mbhposixgeapywfikztndcvvqr\n" +
                                        "mbhposlxgeauywfikztnbcvjap\n" +
                                        "mzhposixgenuywfikztndcvjqr\n" +
                                        "mbhposgxgeauywyikztndvvjqr\n" +
                                        "mbhposajgeauywfikztzdcvjqr\n" +
                                        "mbhyoslxgeauywfikzsndcvxqr\n" +
                                        "mbhposlxgdauywfikmtndcljqr";

}
