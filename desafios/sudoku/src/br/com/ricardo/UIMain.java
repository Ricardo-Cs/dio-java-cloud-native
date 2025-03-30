package br.com.ricardo;

import br.com.ricardo.ui.custom.screen.MainScreen;

import java.util.Arrays;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toMap;

public class UIMain {

    public static void main(String[] args) {
        // Verifica se há argumentos antes de processar
        if (args.length == 0) {
            System.out.println("Nenhum argumento fornecido.");
            return;
        }

        final var gameConfig = Stream.of(args)
                .filter(arg -> arg.contains(";")) // Evita exceções se faltar ";"
                .collect(toMap(k -> k.split(";")[0], v -> v.split(";")[1]));

        var mainScreen = new MainScreen(gameConfig);
        mainScreen.buildMainScreen();
    }

}