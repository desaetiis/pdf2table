/*
    Copyright 2005, 2005 Burcu Yildiz
    Contact: burcu.yildiz@gmail.com
    
    This file is part of pdf2table.
*/

package pdf2xml;

import java.util.*;

public class Column {

  Vector cells;
  int left;
  int right;
  int empty_cells;
  int header;
    
  public Column(int l, int r) {
    this.cells = new Vector();	 
    this.left = l;
    this.right = r;
    this.empty_cells = 0;
    this.header = -1;
  }
  
  public Column() {
  	this.cells = new Vector();
  	this.left = -1;
  	this.right = -1;
  	this.empty_cells = 0;
  	this.header = -1;
  }

  public Object clone() {
    Column c = new Column(this.left, this.right);
	c.cells.addAll(this.cells);
    return c;
  }
}