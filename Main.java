class Main {
  public static void main(String[] args) {
    String sentence = "Army or not - you must realize you are doomed.";
    int number = 1;
    String space = " ";
    String sign = "-";

    for (int i = 0; i < sentence.length(); i ++){
       if (sentence.substring(i, i + 1).equals(sign)){
         number --;
       }
       else if (sentence.substring(i, i + 1).equals(space)){
         number ++;
       } 
    }

    System.out.println("There are " + number + " words in this sentence.");
  }
}