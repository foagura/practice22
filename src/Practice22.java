public class Practice22 {
    public static void main(String[] args){
        /* オーバーロードの練習 */
        Test a = new Test(100);
        a.getId();

        Test b = new Test(200);
        b.getId();

        Test c = new Test(300, "太田");
        c.getIdName();
    }
}

class Test {
    int id;
    String name;

    /* コンストラクタを定義 */
    Test(int i) {
        id = i;
    }

    /* オーバーロードにて同盟のコンストラクタ実装 */
    Test(int i, String str) {
        id = i;
        name = str;
    }

    void getId() {
        System.out.println("ID:" + id);
    }

    void getIdName() {
        System.out.println("ID:" + id);
        System.out.println("名前:" + name);
    }
}
