package level12;

// Итак, как ты уже догадался, твоя задача — помочь главному инженеру исправить программу по производству машин так,
// чтобы каждому объекту-машине можно было присвоить уникальное имя.

public class Car {
    private String modelName;
    private int speed;

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
