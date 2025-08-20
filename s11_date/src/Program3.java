package app;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Program3 {

    public static void main(String[] args) {
        // Aula: Convertendo data-hora global para local -----------------------------------------------------------------
        // ----------------------------
        // OBSERVAÇÃO
        // ----------------------------
        // Listar todos os fusos horários disponíveis no Java (só descomentar):
        // for (String s : ZoneId.getAvailableZoneIds())
        //     System.out.println(s);

        // ----------------------------
        // CRIAÇÃO DE DATAS
        // ----------------------------
        LocalDate d04 = LocalDate.parse("2022-07-20");                   // Apenas a data
        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");  // Data + hora (local)
        Instant d06 = Instant.parse("2022-07-20T01:30:26Z");             // Data + hora em UTC (global)


        // ----------------------------
        // CONVERSÃO DE INSTANT → LOCALDATE / LOCALDATETIME
        // ----------------------------
        // Aqui pegamos um "Instant" (UTC) e o transformamos em datas locais usando diferentes fusos horários
        LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault()); // Data no fuso horário do sistema
        LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));  // Data no fuso de Portugal
        LocalDateTime r3 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault()); // Data+hora no fuso do sistema
        LocalDateTime r4 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));  // Data+hora no fuso de Portugal

        // ----------------------------
        // EXIBINDO RESULTADOS DAS CONVERSÕES
        // ----------------------------
        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);
        System.out.println("r3 = " + r3);
        System.out.println("r4 = " + r4);


        // ----------------------------
        // ACESSANDO CAMPOS DE UMA DATA
        // ----------------------------
        // LocalDate (d04) → pegar partes da data
        System.out.println("d04 dia = " + d04.getDayOfMonth()); // Dia do mês (20)
        System.out.println("d04 mês = " + d04.getMonthValue()); // Número do mês (7 → julho)
        System.out.println("d04 ano = " + d04.getYear());       // Ano (2022)

        // LocalDateTime (d05) → pegar partes da hora
        System.out.println("d05 hora = " + d05.getHour());      // Hora (1)
        System.out.println("d05 minutos = " + d05.getMinute()); // Minutos (30)
    }}
