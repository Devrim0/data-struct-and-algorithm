package fınalnotlarıveriyapıları;

class nokta {
    int icerik;

    public nokta(int icerik) {
        this.icerik = icerik;
    }
}

public class Odev6_birinci {
    nokta[] dizi;
    int tane;

    public Odev6_birinci(int N) {
        dizi = new nokta[N];
        tane = 0;
    }

    void degistir(int ata, int i) {
        int temp = dizi[ata].icerik;
        dizi[ata].icerik = dizi[i].icerik;
        dizi[i].icerik = temp;
    }

    void yukariCik(int i) {
        int ata = (i - 1) / 2;
        while (ata >= 0 && dizi[ata].icerik > dizi[i].icerik) {
            degistir(ata, i);
            i= ata;
            ata = (i - 1) / 2;
        }
    }

    void minHeap(int i) {
        int solCocuk, sagCocuk;
        solCocuk = 2 * i + 1; //[,1,2,3,4,5,,7,5,4,8]
        sagCocuk = 2 * i + 2;
        while ((solCocuk < tane && dizi[i].icerik < solCocuk) ||
                (sagCocuk < tane && dizi[i].icerik < dizi[sagCocuk].icerik)) {
            if (sagCocuk >= tane || dizi[solCocuk].icerik > dizi[sagCocuk].icerik) {
                degistir(solCocuk, i);
            } else {
                degistir(sagCocuk, i);
            }
            solCocuk = 2 * i + 1;
            sagCocuk = 2 * i + 2;
        }
    }

    void ekle(nokta yeni) {
        tane++; //tane =esaysi
        dizi[tane - 1] = yeni;
        yukariCik(tane - 1);
    }

    int sil() {
        int silinen = dizi[0].icerik;
        dizi[0] = dizi[tane - 1];
        tane--;
        minHeap(0);
        System.out.println("Silinen deger: " + silinen);
        return dizi[0].icerik;
    }

    boolean minHeapMi(int k) {
        int ata = (k - 1) / 2;
        while (ata >= 0 && k > 0) {
            if (dizi[ata].icerik > dizi[k].icerik) {
                return false;
            }
            k--;
            ata = (k - 1) / 2;
        }
        return true;
    }

    void minCevirMax(Odev6_birinci b) {
        for (int i = 0; i < b.dizi.length / 2; i++) {
            dizi[i].icerik = dizi[dizi.length - i - 1].icerik +
                    (dizi[dizi.length - i - 1].icerik = dizi[i].icerik) * 0;
        }
    }

    public static void main(String[] args) {
        Odev6_birinci heap = new Odev6_birinci(8);
        heap.ekle(new nokta(8));
        heap.ekle(new nokta(3));
        heap.ekle(new nokta(4));
        heap.ekle(new nokta(1));
        heap.ekle(new nokta(0));
        heap.ekle(new nokta(88));
        heap.ekle(new nokta(12));
        heap.ekle(new nokta(23));
        System.out.println("Heap agacimiz: ");
        for (int i = 0; i < heap.tane; i++) {
            System.out.print(heap.dizi[i].icerik + " ");
        }
        System.out.println("\n");
        heap.sil();
        System.out.println("Max Heap'e cevrildikten sonra: ");
        heap.minCevirMax(heap);
        for (int i = 0; i < heap.tane; i++) {
            System.out.print(heap.dizi[i].icerik + " ");
        }
        System.out.println("\n");
        System.out.println("Min Heap mi? \n" + heap.minHeapMi(0));
    }
}

    
