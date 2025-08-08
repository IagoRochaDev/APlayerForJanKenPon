# APlayerForJanKenPon

Um competidor inteligente para o jogo **JanKenPon (Pedra-Papel-Tesoura)**, desenvolvido como parte da disciplina de **Programação Orientada a Objetos** no curso de **Ciência da Computação** – IFNMG, 2025/2.

## 🎯 Objetivo

Implementar um jogador baseado na classe abstrata `AbstractPlayer`, fornecida pelo projeto [JanKenPon](https://github.com/guisso/JanKenPon), com lógica própria para decidir movimentos no jogo Pedra-Papel-Tesoura. O jogador participa de disputas automáticas contra outros competidores dentro do ambiente de simulação do [JanKenPonManager](https://github.com/guisso/JanKenPonManager).

## 🛠 Tecnologias Utilizadas

- Java 17+
- Maven
- IDE recomendada: NetBeans (ou IntelliJ/Eclipse)
- Projeto integrado ao `JanKenPonManager` via sistema de build Maven

## 📁 Estrutura do Projeto

- `src/main/java/...` — Implementação da classe competidora que estende `AbstractPlayer`
- `pom.xml` — Configuração Maven para compilar o projeto e copiar o `.jar` final para o diretório `players` do JanKenPonManager

## 🚀 Como Executar

1. Clone os projetos base:
   ```bash
   git clone https://github.com/guisso/JanKenPon
   git clone https://github.com/guisso/JanKenPonManager
