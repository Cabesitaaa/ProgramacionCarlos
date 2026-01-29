package Tema4;
    public class Reloj {
        private int hora, minuto, segundo;
        boolean formato24h;
        public static final int hora_default = 00;
        public static final int min_default = 00;
        public static final int seg_default = 00;

        public Reloj() {
            hora = hora_default;
            minuto = min_default;
            segundo = seg_default;
        }

        public Reloj(int hora, int minuto, int segundo) {
            this.hora = hora;
            this.minuto = minuto;
            this.segundo = segundo;
        }

        public int getHora() {
            return hora;
        }
        public void setHora(int hora) {
            if (hora >= 0 && hora < 25) {
                this.hora = hora;
            }
        }

        public int getMinuto() {
            return minuto;
        }
        public void setMinuto(int minuto) {
            if (minuto >= 0 && minuto <= 60) {
                this.minuto = minuto;
            }
        }

        public int getSegundo() {
            return segundo;
        }
        public void setSegundo(int segundo) {
            if (minuto >= 0 && minuto <= 60) {
                this.segundo = segundo;
            }
        }
        public void setFormato24h(boolean formato24h) {
            this.formato24h = formato24h;
        }

        public void mostrarHora() {
            int MostrarHora = hora;
            if (formato24h) {
                System.out.println("Son las " +MostrarHora+":"+minuto+":"+segundo);
            } else {
                String ampm = "AM";
                if (MostrarHora == 0) {
                    MostrarHora = 12;
                } else if (MostrarHora == 12) {
                    ampm = "PM";
                } else if (MostrarHora > 12) {
                    MostrarHora -=12;
                    ampm = "PM";
                }
                System.out.println("Son las " +MostrarHora+":"+minuto+":"+segundo+" "+ampm);
            }
        }
    }

