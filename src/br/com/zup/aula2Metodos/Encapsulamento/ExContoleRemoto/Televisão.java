package br.com.zup.aula2Metodos.Encapsulamento.ExContoleRemoto;
/*
Crie uma classe Televisão e uma classe ControleRemoto que pode controlar o volume e trocar os canais da televisão.
O controle de volume permite:
-  Aumentar ou diminuir a potência do volume de som em uma unidade de cada vez;
- Aumentar e diminuir o número do canal em uma unidade;
- Trocar para um canal indicado;
- Consultar o valor do volume de som e o canal selecionado;

 */
public class Televisão {
        private int volume;
        private int canal;

        public Televisão(){

        }
        public Televisão (int volume, int canal){
            this.volume = volume;
            this.canal = canal;
        }
        public int getVolume() {
            return volume;
        }

        public void setVolume(int volume) {
            this.volume = volume;
        }

        public int getCanal() {
            return canal;
        }

        public void setCanal(int canal) {
            this.canal = canal;
        }
}
