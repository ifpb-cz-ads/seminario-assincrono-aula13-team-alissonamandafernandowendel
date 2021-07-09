class Main {
  public static void main(String[] args) {

    Conta c = new Conta("Amanda",013,2000);
    c.sacar(500);
    System.out.println(c.getSaldo());

  }
}