/*
    Copyright 2005, 2005 Burcu Yildiz
    Contact: burcu.yildiz@gmail.com
    
    This file is part of pdf2table.
*/

package pdf2xml;

import java.util.*;

public class Text_Column {

Vector lines;
int width;

  public Text_Column(int w) {
    this.lines = new Vector();
    this.width = w;
  }

}