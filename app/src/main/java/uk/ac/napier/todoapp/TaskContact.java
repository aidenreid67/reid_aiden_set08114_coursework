package uk.ac.napier.todoapp;


import android.provider.BaseColumns;

class TaskContract {
    static final String DB_NAME = "uk.ac.napier.todoapp";
    static final int DB_VERSION = 1;

    class TaskEntry implements BaseColumns {
        static final String TABLE = "tasks";

        static final String COL_TASK_TITLE = "title";
    }
}
