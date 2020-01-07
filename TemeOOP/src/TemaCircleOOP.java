public class TemaCircleOOP {
    //public class Circle {
        //Crearea unui cerc care contine un membru de tip double numit raza si are o metoda prin care obtinem aria cercului.
        private double raza;

        public double getRaza() {
            return raza;
        }

        public void setRaza(double raza) {
            this.raza = raza;
        }

        public double GetAria(double aria) {
            aria = raza * raza * Math.PI;
            return aria;
        }

    }



