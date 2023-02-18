import Drivers.DriverD;

import java.io.Serializable;

public class FreightCar extends Transport<DriverD> {
    public FreightCar(String brand, String model, int engineCapacity, DriverD driver, CarryingCapacity carryingCapacity) {
        super(brand, model, engineCapacity, driver);
    }

    public enum CarryingCapacity {
        n1(0, 3.5f),
        n2(3.5f, 12f),
        n3(12, 0);
        private float weightMax;
        private float weightMin;

        CarryingCapacity(float weightMin, float weightMax) {
            this.weightMin = weightMin;
            this.weightMax = weightMax;
        }


        CarryingCapacity() {
        }

        public float getWeightMax() {
            return weightMax;
        }

        public void setWeightMax(float weightMax) {
            this.weightMax = weightMax;
        }

        public float getWeightMin() {
            return weightMin;
        }

        public void setWeightMin(float weightMin) {
            this.weightMin = weightMin;
        }

        @Override
        public String toString() {
            return "Грузоподьемность{" +
                    "Тип = " + this.name() + "\n"
                    + (weightMin > 0 ? weightMin : "нижняя граница тон") +
                    (weightMax > 0 ? weightMax : "верхняя граница тон") +
                    '}';
        }
    }

    @Override
    public String getBrand() {
        return brand;
    }

    @Override
    void printType(Type name) {

    }

    @Override
    void startMoving() {
        System.out.println("Начало движения");
    }

    @Override
    void movingStop() {
        System.out.println("Конец движения");
    }

    @Override
    public void pitStop() {
        System.out.println("Пит - стоп");
    }

    @Override
    public void bestLapTimes(String time) {
        System.out.println("Лучшие время = " + time);

    }

    @Override
    boolean passDiagnostics() throws TransportTypeExeption {
        return false;
    }

    @Override
        public void maxSpeed () {
            int minBound = 40;
            int maxBound = 140;
            int maxSpeed = (int) (minBound + (maxBound - minBound) * Math.random());
            System.out.println("Максимальная скорость = " + maxSpeed);

        }

        @Override
        Type getType () {
            return Type.FREIGHTCAR;
        }

        @Override
        void printType () {
            String message = "Данных по транспортному средству недостаточно";
            Serializable serializable = getType() == null ? message : getType();
            System.out.println(serializable);
        }
    }
