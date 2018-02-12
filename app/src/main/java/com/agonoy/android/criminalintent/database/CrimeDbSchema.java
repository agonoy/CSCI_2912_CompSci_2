package com.agonoy.android.criminalintent.database;

public class CrimeDbSchema {
    public static final class CrimeTable {
        public static final String NAME = "crimes";

        public static final class Cols {
            public static final String UUID = "uuid";
            public static final String TITLE = "title";
            public static final String DATE = "date";
            public static final String SOLVED = "solved";

            /** #3 adding suspect to the model layer */
            public static final String SUSPECT = "suspect";
        }
    }
}