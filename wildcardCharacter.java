class Message<T> {
    private T message;

    public T getMessage() {
        return message;
    }

    public void setMessage(T message) {
        this.message = message;
    }
}

public class TestDemo {
    public static void main(String[] args) {
        Message<String> message = new Message();
        message.setMessage("欢迎您");
        fun(message);
    }

    public static void fun(Message<String> temp) {
        System.out.println(temp.getMessage());
    }
}
