import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class TabelaPedido extends AbstractTableModel{
    private Cliente cliente;
    private String[] colunas = new String[]{"Forma", "Tipo da Pizza", "Tamanho(cm²)", "Preço"};
    private List<ItemPedido> lista = new ArrayList();
    private List<Pedido> listaPedido = new ArrayList();

    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return this.colunas.length;
    }
    
    @Override
    public String getColumnName(int index) {
        return this.colunas[index];
    }
    
  

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        ItemPedido customer = lista.get(rowIndex);
        switch (columnIndex) {
           
            case 0: return customer.getForma();
            case 1: return customer.getTipoPizza();
            case 2: return customer.getTamanho();
            case 3: return customer.getPrecoItem();
            default : return null;
        }
    }
    
    public void adicionaItemPedido(ItemPedido customer) {
        this.lista.add(customer);
        this.fireTableRowsInserted(lista.size()-1,lista.size()-1);//Atualizando a JTABLE
        System.out.println(this.lista.size());
    }
    
    public void adicionaPedido(Pedido customer){
        this.listaPedido.add(customer);
        System.out.println(this.listaPedido.size());
    }
    
    public boolean removeItemPedido(ItemPedido customer) {
        int linha = this.lista.indexOf(customer);
        boolean result = this.lista.remove(customer);
        this.fireTableRowsDeleted(linha,linha);//Atualizando a JTABLE
        return result;
    }
    
    public boolean removePedido(Pedido customer){
        boolean result = this.listaPedido.remove(customer);
        return result;
    }

    public void atualizarTabela(List<ItemPedido> lista){
        this.lista = new ArrayList();
        this.lista.addAll(lista);
        this.fireTableDataChanged();
    }
    
    public void limpaTabela() {
        int indice = lista.size()-1;
        if(indice<0)
            indice=0;
        this.lista = new ArrayList();
        this.fireTableRowsDeleted(0,indice);//Atualizando a JTABLE
    }

    public ItemPedido getItemPedido(int linha){
        return lista.get(linha);
    }
    
    public Pedido getPedido(int linha){
        return listaPedido.get(linha);
    }
}
