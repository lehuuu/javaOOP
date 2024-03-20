package shapes;
import shapes.hinhtron;

public class test {

    public static void main(String[] args) {
        hinhtron ht = new hinhtron();
        ht.xuatten();
        ht.nhapbankinh();
        ht.tinhchuvi();
        ht.tinhdientich();
        ht.inchuvi();
        ht.indientich();

        hinhvuong hv = new hinhvuong();
        hv.xuatten();
        hv.nhapcanh();
        hv.tinhchuvi();
        hv.tinhdientich();
        hv.inchuvi();
        hv.indientich();

        hinhchunhat hcn = new hinhchunhat();
        hcn.xuatten();
        hcn.nhapchieudaichieurong();
        hcn.tinhchuvi();
        hcn.tinhdientich();
        hcn.inchuvi();
        hcn.indientich();

        hinhtru htru = new hinhtru();
        htru.xuatten();
        htru.nhapchieucao();
        htru.tinhthetich();
        htru.inthetich(); 
    }
}