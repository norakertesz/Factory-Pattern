public class Pizza {


    protected String name;
    void prepare(){
        System.out.println("Pizza " + name +" : wird vorbereitet");
    };
    void bake(){
        System.out.println("Pizza " + name +" : wird gebacken für 2min 30sec");

    };
    void cut(){
        System.out.println("Pizza " + name +" : wird geschnitten");

    };
    void box(){

        System.out.println("Pizza " + name +" : wird in einem Ökokarton eingepackt und mit Liebe verschlossen.");

    };

    @Override
    public String toString() {
        return name;
    }
}
