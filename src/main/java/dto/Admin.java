package dto;

public class Admin extends User {
    private int accessLevel;


    public Admin(String name, Integer age, String lastName, int accessLevel) {
        super(name, age, lastName);
        this.accessLevel = accessLevel;
    }


    public Admin(String name, Integer age, String lastName) {
        super(name, age, lastName);
    }

    public Admin() {
    }

    public int getAccessLevel() {
        return accessLevel;
    }

    public void setAccessLevel(int accessLevel) {
        this.accessLevel = accessLevel;
    }

    /**
     * Метод повышения уровня админа
     * 1. уровень ++  (+1)
     **/
    public int appLevel(){
        if(accessLevel == 6){
            System.out.println("Max level");
            return accessLevel;
        }
        if(accessLevel > 6){
            System.out.println("This level of admin is not available");
            return accessLevel;
        }
        if (accessLevel < 0){
            System.out.println("Level cannot be below zero");
            return accessLevel;
        }
        accessLevel++;
        return accessLevel;
    }
    /**
     * Метод понижения уровня
     * 1.Проверить уровень , самый минимальный нельзя понизить
     * Если уровень нулевой то выводим сообщение "Нельзя понизить , самый низкий уровень"
     * 2. уровень -- (-1)
     *
     */

    public int downLevel(){
        if(accessLevel == 0){
            System.out.println("The lowest level, cannot be lowered!");
            return accessLevel;
        }
        if(accessLevel > 0 && accessLevel <= 6){
            accessLevel--;
            return accessLevel;
        }else{
            System.out.println("Error!!!");
            return accessLevel;
        }
    }

    /**
     * Метод понижения уровня до начального (0)
     * 1.Проверить какой уровень , если меньше 0 и больше 6 , то выпадает ошибка. если = 0 то сообщение что уже самый низкий уровень. А если допустимое значение то понижаем уровень до 0.
     *
     */

    public int zeroLevel(){
        if(accessLevel < 0 || accessLevel > 6){
            System.out.println("Error!");
            return accessLevel;
        }
        if (accessLevel == 0){
            System.out.println("The lowest level, cannot be lowered!");
            return accessLevel;
        }else{
            accessLevel = 0;
            return accessLevel;
        }
    }
}
