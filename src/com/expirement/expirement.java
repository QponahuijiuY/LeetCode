package com.expirement;

/**
 * @description:
 * @Author: gengchen.jing@yoyi.com.cn
 * @Date: 2020-06-04 18:45
 */
public class expirement {
//    private ArrayList<Word> wordList;
    public static void main(String[] args) {

        new String();
        new StringBuilder();
        new StringBuffer();
        String a = "a";
        a.replace("a","2");
        System.out.println(a);


    }

        /*expirement no1 = new expirement();
        // 读入单词列表
        no1.inputWordList();
        // 识别单词列表
        for (Word word : no1.wordList) {
            // 识别单词
            no1.whichType(word);
            String temp = word.getCJ2();
            if (temp != null) {
                int index = temp.lastIndexOf(".0");
                if (index == temp.length() - 2)
                    word.setCJ2(temp.substring(0, index));
            }
        }
        // 输出单词列表
        no1.printWordList();
    }

    // 识别单词
    private void whichType(Word word) {
        int w = 0;
        int p = 0;
        int j = 0;
        int e = 1;
        int d = 0;
        String chars[] = word.getStr().split("");
        // 从第一个字符开始
        int i = 0;
        String current_char = chars[i];
        // 数字否?
        if (!isNum(current_char)) {
            word.setCJ1("出错");
            return;
        } else {
            while (true) {
                d = Integer.parseInt(current_char);
                w = w * 10 + d;
                current_char = chars[++i];
                // 数字否?
                if (isNum(current_char)) {
                    continue;
                } else {
                    // 是'.'否?
                    if (current_char.equals(".")) {
                        current_char = chars[++i];
                        // 数字否?
                        if (!isNum(current_char)) {
                            word.setCJ1("出错");
                            return;
                        } else {
                            while (true) {
                                d = Integer.parseInt(current_char);
                                w = w * 10 + d;
                                j = j + 1;
                                current_char = chars[++i];
                                // 数字否?
                                if (isNum(current_char)) {
                                    continue;
                                } else {
                                    // 是'E'否?
                                    if (current_char.equals("E")) {
                                        isE(current_char, chars, i, word, w, p, j, e, d);
                                        return;
                                    } else {
                                        // 退一字符
                                        word.setCJ1("实型");
                                        word.setCJ2((w * Math.pow(10, e * p - j)) + "");
                                        return;
                                    }
                                }
                            }
                        }
                    } else {
                        // 是'E'否?
                        if (current_char.equals("E")) {
                            isE(current_char, chars, i, word, w, p, j, e, d);
                            return;
                        } else {
                            // 退一字符
                            word.setCJ1("整型");
                            word.setCJ2((w * Math.pow(10, e * p - j)) + "");
                            return;
                        }
                    }
                }
            }
        }
    }

    private void isE(String current_char, String[] chars, int i, Word word, int w, int p, int j, int e, int d) {

        current_char = chars[++i];
        // 是'-'否?
        if (current_char.equals("-")) {
            e = -1;
            current_char = chars[++i];
            // 数字否?
            if (isNum(current_char)) {
                while (true) {
                    d = Integer.parseInt(current_char);
                    p = p * 10 + d;
                    current_char = chars[++i];
                    if (isNum(current_char)) {
                        continue;
                    } else {
                        // 退一字符
                        word.setCJ1("实型");
                        word.setCJ2((w * Math.pow(10, e * p - j)) + "");
                        return;
                    }
                }
            } else {
                word.setCJ1("出错");
                return;
            }
        } else {
            // 是'+'否?
            if (current_char.equals("+")) {
                current_char = chars[++i];
                // 数字否?
                if (isNum(current_char)) {
                    while (true) {
                        d = Integer.parseInt(current_char);
                        p = p * 10 + d;
                        current_char = chars[++i];
                        if (isNum(current_char)) {
                            continue;
                        } else {
                            // 退一字符
                            word.setCJ1("实型");
                            word.setCJ2((w * Math.pow(10, e * p - j)) + "");
                            return;
                        }
                    }
                } else {
                    word.setCJ1("出错");
                    return;
                }
            } else {
                // 数字否?
                if (isNum(current_char)) {
                    while (true) {
                        d = Integer.parseInt(current_char);
                        p = p * 10 + d;
                        current_char = chars[++i];
                        if (isNum(current_char)) {
                            continue;
                        } else {
                            // 退一字符
                            word.setCJ1("实型");
                            word.setCJ2((w * Math.pow(10, e * p - j)) + "");
                            return;
                        }
                    }
                } else {
                    word.setCJ1("出错");
                    return;
                }
            }
        }
    }

    // 是否为数字
    private boolean isNum(String string) {

        return "0123456789".contains(string);
    }

    // 读入单词列表
    private void inputWordList() {

        System.out.println("请输入一行字符串，单词间用空格隔开，行尾用英文“;”");
        Scanner scanner = new Scanner(System.in);
        String temp = scanner.nextLine().replace(";", "");
        scanner.close();
        String[] strs = temp.split(" ");
        wordList = new ArrayList<Word>();
        for (String str : strs) {
            Word word = new Word();
            word.setStr(str + "#");
            wordList.add(word);
        }
    }

    // 输出单词列表
    private void printWordList() {

        for (Word word : wordList) {
            System.out.println(word.getStr() + "\t" + word.getCJ2() + "\t" + word.getCJ1());
        }
    }

    // 单词类
    private class Word {
        // str记原始单词
        private String str;
        // CJ1记类型
        private String CJ1;
        // CJ1记数值
        private String CJ2;

        public String getStr() {
            return str;
        }

        public void setStr(String str) {
            this.str = str;
        }

        public String getCJ1() {
            return CJ1;
        }

        public void setCJ1(String cJ1) {
            CJ1 = cJ1;
        }

        public String getCJ2() {
            return CJ2;
        }

        public void setCJ2(String cJ2) {
            CJ2 = cJ2;
        }
    }*/
}
