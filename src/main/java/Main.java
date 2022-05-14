import ru.netology.sqr.SQRService;

public class Main {

    public static void main(String[] args) {
        SQRService service = new SQRService();
        int res = service.crypticCount(700);
        System.out.println(res);
    }
}

