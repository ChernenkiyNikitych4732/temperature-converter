// Интерфейс для конвертеров температур
interface IConverter {
    double convert(double celsius);
}

// Конвертер в градусы Цельсия
class CelsiusConverter implements IConverter {
    @Override
    public double convert(double celsius) {
        return celsius; // Исходное значение в градусах Цельсия
    }
}

// Конвертер в Кельвины
class KelvinConverter implements IConverter {
    @Override
    public double convert(double celsius) {
        return celsius + 273.15; // Формула перевода в Кельвины
    }
}

// Конвертер в Фаренгейты
class FahrenheitConverter implements IConverter {
    @Override
    public double convert(double celsius) {
        return celsius * 9 / 5 + 32; // Формула перевода в Фаренгейты
    }
}

// Пример использования
public class Main {
    public static void main(String[] args) {
        double celsius = 25; // Пример значения в градусах Цельсия

        IConverter celsiusConverter = new CelsiusConverter();
        IConverter kelvinConverter = new KelvinConverter();
        IConverter fahrenheitConverter = new FahrenheitConverter();

        // Конвертация в градусы Цельсия (не изменится)
        System.out.println("Градусы Цельсия: " + celsiusConverter.convert(celsius));

        // Конвертация в Кельвины
        System.out.println("Кельвины: " + kelvinConverter.convert(celsius));

        // Конвертация в Фаренгейты
        System.out.println("Фаренгейты: " + fahrenheitConverter.convert(celsius));
    }
}
