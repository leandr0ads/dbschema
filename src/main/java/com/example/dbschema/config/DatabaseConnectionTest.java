//package com.example.dbschema.config;
//
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import javax.sql.DataSource;
//import java.sql.Connection;
//import java.sql.DatabaseMetaData;
//
//@Configuration
//public class DatabaseConnectionTest {
//
//    @Bean
//    public CommandLineRunner testDatabaseConnection(DataSource dataSource) {
//        return args -> {
//            System.out.println("╔════════════════════════════════════════╗");
//            System.out.println("║  TESTANDO CONEXÃO COM O BANCO DE DADOS ║");
//            System.out.println("╚════════════════════════════════════════╝");
//
//            try (Connection conn = dataSource.getConnection()) {
//                DatabaseMetaData metaData = conn.getMetaData();
//
//                System.out.println("✅ Conexão estabelecida com sucesso!");
//                System.out.println("▸ Banco de dados: " + metaData.getDatabaseProductName());
//                System.out.println("▸ Versão: " + metaData.getDatabaseProductVersion());
//                System.out.println("▸ URL: " + metaData.getURL());
//                System.out.println("▸ Usuário: " + metaData.getUserName());
//
//                System.out.println("\n⏳ Executando teste de consulta...");
//                try (var stmt = conn.createStatement();
//                     var rs = stmt.executeQuery("SELECT 1")) {
//                    if (rs.next()) {
//                        System.out.println("✅ Teste de consulta executado com sucesso!");
//                    }
//                }
//            } catch (Exception e) {
//                System.err.println("❌ Falha na conexão com o banco de dados:");
//                e.printStackTrace();
//            }
//        };
//    }
//}