package dto;

public class Manager extends BaseUser {
    public Manager(int id, String name, Integer age, String lastName, String role){
        super(id, name, age, lastName, "Manager");
    }
    public Manager(){

    }

    @Override
    public String getRole(){
        return "Manager";
    }

    @Override
    public String updateName(String name, String lastName) {
        return "";
    }

    @Override
    public Integer updateAge(Integer age){
        return age;
    }

    /**
     * Создание заявки
     *1.Название валидация :
     * - пустое
     * - не состоит из пробелов
     * - количество символов
     * 2.Если валидация пройдена , то мы возвращаем return "Заявка создана"
     * 3.Если валидация не пройдена , то возвращаем сообщение.
     *
     */

    public String createOrder(String orderTitle){
        if(orderTitle == null){
           throw new IllegalArgumentException("Название заявки не может быть null");
        }
        if (orderTitle.isEmpty()){
            throw new IllegalArgumentException("Название не может быть пустым");
        }
        if (orderTitle.isBlank()){
            throw new IllegalArgumentException("Название не может состоять из пробелов");
        }
        if (orderTitle.length() < 4 || orderTitle.length() > 20){
            throw new IllegalArgumentException("Длинна названия не проходит валидацию");
        }
        return "Заявка создана";

    }


}
