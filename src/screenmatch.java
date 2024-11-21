public class Main {
    public static void main(String[] args) {
      System.out.println("Bienvenidos a la inmersion Java!");
      // System.out.println("Pelicula Matrix");
      // sout 
      
      int fechaDeLanzamiento = 1999;
      double evaluacion = 4.5;
      boolean incluidoEnElPlanBasico = true;
      String nombre = "Matrix";
      String sinopsis = """
        La mejor pelicula del fin del milenio
        """;
      double mediaEvaluacionUsuario = 0;
      
      System.out.println("Pelicula: " + nombre);
      System.out.println("fecha de lanzamiento: " + fechaDeLanzamiento);
      System.out.println("Evaluación: " + evaluacion);
      System.out.println("Pelicula incluida en el plan básico: " + incluidoEnElPlanBasico);
      
      double mediaEvaluacion = (4.5 + 4.8 + 3) / 3;
      System.out.println("Media de la evaluación de Matrix: " + mediaEvaluacion);
      
      if (fechaDeLanzamiento >= 2023){
        System.out.println("Pelicula popular en el momento");
      } else {
        System.out.println("Pelicula Retro que vale la pena ver");
      }
      
      for (int i = 0; i < 3; i++){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa la nota que le darias a Matrix");
        double notaMatrix = teclado.nextDouble();
        mediaEvaluacionUsuario = mediaEvaluacion + notaMatrix / 3;
      }; 
      System.out.println("La medía de la pelicula Matrix calculada por el usuario es: " + mediaEvaluacionUsuario / 3);
    }
} 