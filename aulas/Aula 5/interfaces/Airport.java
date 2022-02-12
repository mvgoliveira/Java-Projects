public class Airport {
  public static void main(String[] args) {
    Airport metropolisAirport = new Airport();
    Airplane plane = new Airplane();
    Bird bird = new Bird();

    metropolisAirport.givePermissionToLand(plane);
    // metropolisAirport.checkIsNew(bird); // Não existe isso em bird
  }

  private void givePermissionToLand(Flyer f) {
    f.land();
  }

  private void checkIsNew(Airplane p) {
    System.out.println(p.getIsNew());
  }
}
