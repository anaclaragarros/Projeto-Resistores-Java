# Projeto Resistores – Código de Cores

## Descrição do Projeto

Este projeto foi desenvolvido para resolver o problema de conversão de valores de resistência em ohms para suas respectivas sequências de cores de resistores, de acordo com o código de cores padrão. Os resistores são componentes elétricos que utilizam faixas coloridas para indicar seu valor de resistência e a tolerância permitida.

## Requisitos

O programa deve receber como entrada uma string que contém o valor de resistência seguido de "ohms", como por exemplo `"47 ohms"`, e deve retornar uma string que representa a sequência de cores correspondente, separadas por espaços.

### Regras de Conversão

1. **Para resistores menores que 1000 ohms:**
   - O valor de ohms é dado como um número simples.
   - Exemplo: `"47 ohms"` deve retornar `"amarelo violeta preto dourado"`.

2. **Para resistores maiores ou iguais a 1000 ohms, mas menores que 1.000.000 ohms:**
   - O valor de ohms é dividido por 1000 e tem um "k" minúsculo.
   - Exemplo: `"4.7k ohms"` deve retornar `"amarelo violeta vermelho dourado"`.

3. **Para resistores maiores ou iguais a 1.000.000 ohms:**
   - O valor de ohms é dividido por 1.000.000 e tem um "M" maiúsculo.
   - Exemplo: `"1M ohms"` deve retornar `"marrom preto verde dourado"`.

### Exemplo de Cores

- "10 ohms" => "marrom preto preto dourado"
- "100 ohms" => "marrom preto marrom dourado"
- "220 ohms" => "vermelho vermelho marrom dourado"
- "330 ohms" => "laranja laranja marrom dourado"
- "470 ohms" => "amarelo violeta marrom dourado"
- "680 ohms" => "azul cinza marrom dourado"
- "1k ohms" => "marrom preto vermelho dourado"
- "2M ohms" => "vermelho preto verde dourado"

## Estrutura do Código

O projeto é composto por uma classe principal chamada `ResistorColorCode` que contém os seguintes elementos:

- **Mapeamento de Cores:** Um mapa que relaciona dígitos numéricos (0-9) às suas cores correspondentes.
- **Método `getResistorColors(String input)`:** Este método converte o valor de resistência em uma sequência de cores.
- **Método `main(String[] args)`:** Método de teste que executa exemplos para verificar o funcionamento do código.

## Como Executar

1. Clone o repositório para sua máquina local.
2. Navegue até o diretório onde o arquivo `ResistorColorCode.java` está localizado.
3. Compile o arquivo usando o seguinte comando:
   ```sh
   javac ResistorColorCode.java
