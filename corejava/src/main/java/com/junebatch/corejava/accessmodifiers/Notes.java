package com.junebatch.corejava.accessmodifiers;

 class Notes {


    /*

     Public > Protected > Default > Private


     */

     /*

        public    : can be access from any package
        protected : can be accessed within the package or by child classes outside the package
        default   : can be accessed within the package
        private   : can be accessed within the classes

      */

    /*
                    Class                             Method
    public          yes                                 yes

    protected       no                                  yes

    default         yes(without keyword)                yes (with (I) or without keyword (C) )

    private         no                                   yes


     */



  /*

  IMP :

  While overriding :
  Access privileges cannot be reduced to weaker privilege, while assigning a strong access privilege is allowed


   */



}
