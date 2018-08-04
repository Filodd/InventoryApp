package com.example.android.inventoryapp.data;

import android.provider.BaseColumns;

public class InventoryContract {

    public InventoryContract() {
    }

    /**
     * Inner class that defines constant values for the Inventory database table.
     * Each entry in the table represents a single product.
     */
    public static final class InventoryEntry implements BaseColumns {

        /**
         * Name of database table for inventory
         */
        public final static String TABLE_NAME = "product";

        //Column of table
        public final static String _ID = BaseColumns._ID;
        public final static String COLUMN_PRODUCT_NAME = "product_name";
        public final static String COLUMN_PRICE = "price";
        public final static String COLUMN_QUANTITY = "quantity";
        public final static String COLUMN_SUPPLIER_NAME = "supplier_name";
        public final static String COLUMN_SUPPLIER_PHONE_NUMBER = "supplier_phone_number";

        /**
         * Possible values for the gender of the product.
         */
        public static final int SUPPLIER_UNKNOWN = 0;
        public static final int SUPPLIER_BOOK_DISTRIBUTION = 1;
        public static final int SUPPLIER_ARGOSY = 2;
        public static final int SUPPLIER_BOOK_NEST = 3;
        public static final int SUPPLIER_BOOK_CENTRE = 4;
    }
}

