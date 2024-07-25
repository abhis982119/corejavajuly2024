package com.junebatch.corejava.thissuper.superkeyword.variable;

public class B extends A {

  public String companyName = "Google";


    public String getCompanyName() {
        return companyName;
    }

    public String getParentCompanyName() {
      return super.companyName;
    }

}
