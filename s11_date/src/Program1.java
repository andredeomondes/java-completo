import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Program1 {

    public static void main(String[] args) {
        // Aula: Instanciando data-hora -----------------------------------------------------------------
        // ----------------------------
        // FORMATADORES DE DATA/HORA
        // ----------------------------
        // Esses objetos servem para "ensinar" o Java a interpretar ou exibir datas em um formato específico.
        // Padrões usados:
        // - "dd/MM/yyyy" → dia/mês/ano
        // - "dd/MM/yyyy HH:mm" → dia/mês/ano horas:minutos
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");


        // ----------------------------
        // DATAS E HORÁRIOS LOCAIS
        // ----------------------------
        // LocalDate → armazena apenas a data (ano, mês, dia).
        // LocalDateTime → armazena data e hora (ano, mês, dia, hora, minuto, segundo).
        // Local → considera o fuso horário do computador que está executando.

        LocalDate d01 = LocalDate.now();                  // Data atual (somente data)
        LocalDateTime d02 = LocalDateTime.now();          // Data e hora atuais

        LocalDate d04 = LocalDate.parse("2022-07-20");    // Data em formato ISO (padrão: yyyy-MM-dd)
        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26"); // Data e hora em ISO (yyyy-MM-ddTHH:mm:ss)

        // Usando formatadores personalizados (fmt1 e fmt2)
        LocalDate d08 = LocalDate.parse("20/07/2022", fmt1);           // Data no formato brasileiro
        LocalDateTime d09 = LocalDateTime.parse("20/07/2022 01:30", fmt2); // Data e hora no formato brasileiro

        // Criando manualmente com "of()"
        LocalDate d10 = LocalDate.of(2022, 7, 20);                    // Data específica
        LocalDateTime d11 = LocalDateTime.of(2022, 7, 20, 1, 30);     // Data e hora específicas


        // ----------------------------
        // DATAS E HORÁRIOS GLOBAIS
        // ----------------------------
        // Instant → representa um "ponto fixo no tempo" em UTC (fuso horário de referência mundial).
        // Ele não leva em conta o fuso horário do computador local.

        Instant d03 = Instant.now();   // Momento atual em UTC
        Instant d06 = Instant.parse("2022-07-20T01:30:26Z");       // Z = UTC (padrão mundial)
        Instant d07 = Instant.parse("2022-07-20T01:30:26-03:00");  // Especificando fuso (-03:00)


        // ----------------------------
        // SAÍDA (EXIBINDO RESULTADOS)
        // ----------------------------
        // .toString() → imprime no formato padrão de cada classe
        System.out.println("d01 = " + d01.toString());
        System.out.println("d02 = " + d02.toString());
        System.out.println("d03 = " + d03.toString());
        System.out.println("d04 = " + d04.toString());
        System.out.println("d05 = " + d05.toString());
        System.out.println("d06 = " + d06.toString());
        System.out.println("d07 = " + d07.toString());
        System.out.println("d08 = " + d08.toString());
        System.out.println("d09 = " + d09.toString());
        System.out.println("d10 = " + d10.toString());
        System.out.println("d11 = " + d11.toString());
    }
}
