import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Program4 {
    public static void main(String[] args) {

        // Aula: Calculando data-hora  -----------------------------------------------------------------
        // ----------------------------
        // CRIAÇÃO DE DATAS E HORAS
        // ----------------------------
        LocalDate d04 = LocalDate.parse("2022-07-20");                   // Apenas data
        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");  // Data + hora local
        Instant d06 = Instant.parse("2022-07-20T01:30:26Z");             // Data + hora global (UTC)


        // ----------------------------
        // OPERAÇÕES DE SOMA E SUBTRAÇÃO
        // ----------------------------
        // LocalDate e LocalDateTime possuem métodos como plusDays(), minusDays(), etc.
        LocalDate pastWeekDate = d04.minusDays(7);   // Data 7 dias atrás
        LocalDate nextWeekDate = d04.plusDays(7);    // Data 7 dias à frente

        LocalDateTime pastWeekLocalDate = d05.minusDays(7); // Data/hora 7 dias atrás
        LocalDateTime nextWeekLocalDate = d05.plusDays(7);  // Data/hora 7 dias à frente

        // Para Instant, usamos ChronoUnit (unidade de tempo)
        Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS); // 7 dias atrás em UTC
        Instant nextWeekInstant = d06.plus(7, ChronoUnit.DAYS);  // 7 dias à frente em UTC


        // ----------------------------
        // EXIBINDO RESULTADOS
        // ----------------------------
        System.out.println("pastWeekDate = " + pastWeekDate);
        System.out.println("nextWeekDate = " + nextWeekDate);

        System.out.println("pastWeekLocalDate = " + pastWeekLocalDate);
        System.out.println("nextWeekLocalDate = " + nextWeekLocalDate);

        System.out.println("pastWeekInstant = " + pastWeekInstant);
        System.out.println("nextWeekInstant = " + nextWeekInstant);


        // ----------------------------
        // CALCULANDO DURAÇÃO ENTRE DATAS
        // ----------------------------
        // A classe Duration mede intervalos de tempo em segundos, minutos, horas ou dias.
        // Obs: Duration funciona apenas com tipos que possuem horário (LocalDateTime e Instant).
        // Para LocalDate, precisamos converter para "início do dia" (atStartOfDay).

        Duration t1 = Duration.between(pastWeekDate.atStartOfDay(), d04.atStartOfDay()); // Diferença entre duas LocalDate
        Duration t2 = Duration.between(pastWeekLocalDate, d05);                          // Diferença entre duas LocalDateTime
        Duration t3 = Duration.between(pastWeekInstant, d06);                            // Diferença entre dois Instant
        Duration t4 = Duration.between(d06, pastWeekInstant);                            // Ordem invertida (vai dar negativo)


        // ----------------------------
        // EXIBINDO DURAÇÕES
        // ----------------------------
        System.out.println("t1 dias = " + t1.toDays()); // 7
        System.out.println("t2 dias = " + t2.toDays()); // 7
        System.out.println("t3 dias = " + t3.toDays()); // 7
        System.out.println("t4 dias = " + t4.toDays()); // -7 (porque está invertido)
    }
}