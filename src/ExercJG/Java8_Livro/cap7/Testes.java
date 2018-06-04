package ExercJG.Java8_Livro.cap7;

public class Testes {

}

class testesTelevisor {

    public static void main(String[] args) {

        Televisor televisor = new Televisor();

        televisor.canal = 150;
        televisor.volume = 3;
        televisor.aumentarVolume();
        televisor.aumentarVolume();
        televisor.trocarCanal(10);
        televisor.mostrar();
    }
}

class testesCelular {

    public static void main(String[] args) {

        System.out.println("  :::  1º Empresa  :::");
        Celular celular1 = new Celular();
        celular1.numero = "21 9 6464-5673.";
        Celular.empresa = "Cross System LTDA.";
        System.out.println("Celular 1: " + celular1.numero);
        System.out.println("Empresa 1: " + Celular.empresa);

        System.out.println("\n  :::  2º Empresa  :::");
        Celular celular2 = new Celular();
        celular2.numero = "21 9 5673-6464.";
        Celular.empresa = "AX Tecnologi LTDA.";
        System.out.println("Celular 2: " + celular1.numero);
        System.out.println("Empresa 2: " + Celular.empresa);

        System.out.println("\n  :::  3º Empresa  :::");
        Celular celular3 = new Celular();
        celular3.numero = "21 9 7364-5664.";
        Celular.empresa = "HONDA MOTORS SA.";
        System.out.println("Celular 3: " + celular1.numero);
        System.out.println("Empresa 3: " + Celular.empresa);

    }
}

class testesTelevisorEncapsulamento {

    public static void main(String[] args) {

        TelevisorEncapsulada televisor = new TelevisorEncapsulada();

        televisor.setCanal(150);
        televisor.aumentarCanal();
        televisor.setVolume(3);
        televisor.diminuirVolume();
        System.out.println(televisor.getCanal());
        System.out.println(televisor.getVolume());
    }
}

class testesTelevisorExem7_7 {

    public static void main(String[] args) {

        TelevisorExem7_7 televisor1 = new TelevisorExem7_7();
        TelevisorExem7_7 televisor2 = new TelevisorExem7_7(150);
        TelevisorExem7_7 televisor3 = new TelevisorExem7_7(150, 3);

        televisor1.mostrar();
        televisor2.mostrar();
        televisor3.mostrar();
    }
}
