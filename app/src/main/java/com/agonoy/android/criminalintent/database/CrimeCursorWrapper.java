package com.agonoy.android.criminalintent.database;

import android.database.Cursor;
import android.database.CursorWrapper;

import com.agonoy.android.criminalintent.Crime;
import com.agonoy.android.criminalintent.database.CrimeDbSchema.CrimeTable;

import java.util.Date;
import java.util.UUID;

import static com.agonoy.android.criminalintent.database.CrimeDbSchema.CrimeTable.*;

public class CrimeCursorWrapper extends CursorWrapper {

    public CrimeCursorWrapper(Cursor cursor) {
        super(cursor);
    }

    public Crime getCrime() {
        String uuidString = getString(getColumnIndex(Cols.UUID));
        String title = getString(getColumnIndex(Cols.TITLE));
        long date = getLong(getColumnIndex(Cols.DATE));
        int isSolved = getInt(getColumnIndex(Cols.SOLVED));

        /** #5 adding suspect to the model layer */
        String suspect = getString(getColumnIndex(CrimeTable.Cols.SUSPECT));

        Crime crime = new Crime(UUID.fromString(uuidString));
        crime.setTitle(title);
        crime.setDate(new Date(date));
        crime.setSolved(isSolved != 0);

        /** #5a adding suspect to the model layer */
        crime.setSuspect(suspect);

        return crime;
    }
}
