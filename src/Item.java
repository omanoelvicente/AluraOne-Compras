import java.util.Objects;

public class Item implements Comparable<Item> {
    private String descricaoItem;
    private double valorItem;



    public Item(String descricaoItem, double valorItem) {
        this.descricaoItem = descricaoItem;
        this.valorItem = valorItem;
    }
    public String getDescricaoItem() {
        return descricaoItem;
    }


    public double getValorItem() {
        return valorItem;
    }


    @Override
    public String toString() {
        return String.format("""
                Descrição: %s
                Valor R$:%.2f
                --------------------
                """, this.getDescricaoItem(), this.getValorItem());
    }

    @Override
    public int compareTo(Item outroItem) {
        return (int) (this.getValorItem() - outroItem.getValorItem());
    }
}
