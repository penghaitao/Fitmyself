package com.wartechwick.fitmyselft.data;

import android.provider.BaseColumns;

public class FitContract {
	
	/* Inner class that defines the table contents of the fit table */
	public static final class FitEntry implements BaseColumns {
		
		public static final String TABLE_NAME = "fit";
		
		public static final String COLUMN_GETUP_TIME = "getup_time";
		
		public static final String COLUMN_RUN = "run";
		public static final String COLUMN_PUSHUP = "pushup";
		public static final String COLUMN_SWIM = "swim";
		
		
	}

}
