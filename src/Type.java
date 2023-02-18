public enum Type {
    ACAR("Легковой автомобиль"),
    BUS("Автобус"),
    FREIGHTCAR("Грузовой транспорт");

    String type;

    Type(String type) {
        this.type = type;
    }

    String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Type{" +
                "type='" + type + '\'' +
                '}';
    }
}