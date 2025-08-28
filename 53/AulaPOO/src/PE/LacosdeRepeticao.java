package PE;

public class LacosdeRepeticao {
    public static void main(String[] args) throws InterruptedException {

        int contador = 0;
        //LAÇO WHILE
        System.out.println("Laço While");
        while(contador <= 10){
            System.out.println(contador);
            contador++;
            //Thread.sleep(1000);
        }
        System.out.printf("Boom!");

        //LAÇO DO/WHILE
        System.out.println("Laço Do/While");
        do{
            contador--;
            System.out.println(contador);
        }while(contador > 0);

        //LAÇO FOR
        System.out.println("Laço For");
        for(contador = 0; contador < 21; contador++){
            System.out.println(contador);
            Thread.sleep(1000);
        }

    }
}
