package in.cdoc.swing;

import java.util.List;

import javax.swing.table.AbstractTableModel;

import org.jyothyit.dom.Country;
import org.jyothyit.sampleprograms.Circle;

public class CountryTableModel extends AbstractTableModel {
  private List<Country> countryList ;
  private String[] columns ; 

  public CountryTableModel(List<Country> countryList){
    super();
    this.countryList = countryList ;
    columns = new String[]{"Code","Name"};
  }

  // Number of column of your table
  public int getColumnCount() {
    return columns.length ;
  }

  // Number of row of your table
  public int getRowCount() {
    return countryList.size();
  }

  // The object to render in a cell
  public Object getValueAt(int row, int col) {
    Country country = countryList.get(row);
    switch(col) {
      case 0: return country.getCode();
      case 1: return country.getName();
      // to complete here...
      default: return null;
    }
  }

  // Optional, the name of your column
  public String getColumnName(int col) {
    return columns[col] ;
  }

}






