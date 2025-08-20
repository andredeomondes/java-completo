import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Program2 {

    public static void main(String[] args) {
        // Aula: Convertendo data-hora para texto -----------------------------------------------------------------
        // ----------------------------
        // CRIAÇÃO DE DATAS E HORÁRIOS
        // ----------------------------
        LocalDate d04 = LocalDate.parse("2022-07-20");                   // Apenas a data
        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");  // Data + hora
        Instant d06 = Instant.parse("2022-07-20T01:30:26Z");             // Data e hora em UTC (global)


        // ----------------------------
        // FORMATADORES DE DATA/HORA
        // ----------------------------
        // O DateTimeFormatter serve para transformar datas em textos com formatos personalizados.
        // Exemplo: dd/MM/yyyy → 20/07/2022
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");          // Apenas a data
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");    // Data + hora
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")     // Data + hora
                .withZone(ZoneId.systemDefault()); // Aplica o fuso horário do PC
        DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;    // Padrão ISO para LocalDateTime
        DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT;      // Padrão ISO para Instant


        // ----------------------------
        // FORMATANDO DATAS LOCAIS
        // ----------------------------
        // LocalDate e LocalDateTime têm o método .format() que usa um DateTimeFormatter
        System.out.println("d04 = " + d04.format(fmt1));   // 20/07/2022
        System.out.println("d04 = " + fmt1.format(d04));   // mesmo resultado, outra forma de escrever
        System.out.println("d04 = " + d04.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))); // Criando formatador direto

        // Para LocalDateTime é parecido, mas podemos usar formatos diferentes
        System.out.println("d05 = " + d05.format(fmt1));   // Só a data
        System.out.println("d05 = " + d05.format(fmt2));   // Data + hora
        System.out.println("d05 = " + d05.format(fmt4));   // Formato ISO_DATE_TIME (padrão internacional)


        // ----------------------------
        // FORMATANDO INSTANT (GLOBAL)
        // ----------------------------
        // Como Instant é sempre UTC, precisamos dizer o fuso horário quando usamos formatadores personalizados
        System.out.println("d06 = " + fmt3.format(d06));   // Data + hora no fuso do sistema
        System.out.println("d06 = " + fmt5.format(d06));   // Formato ISO_INSTANT (UTC padrão)
        System.out.println("d06 = " + d06.toString());     // O toString também imprime em ISO (UTC)
    }
}
