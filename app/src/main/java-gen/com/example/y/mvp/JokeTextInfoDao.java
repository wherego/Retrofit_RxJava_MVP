package com.example.y.mvp;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * DAO for table "JOKE_TEXT_INFO".
 */
public class JokeTextInfoDao extends AbstractDao<JokeTextInfo, Integer> {

    public static final String TABLENAME = "JOKE_TEXT_INFO";

    public JokeTextInfoDao(DaoConfig config) {
        super(config);
    }


    public JokeTextInfoDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /**
     * Creates the underlying database table.
     */
    public static void createTable(SQLiteDatabase db) {
        String constraint = "";
        db.execSQL("CREATE TABLE " + constraint + "\"JOKE_TEXT_INFO\" (" + //
                "\"TAG\" INTEGER PRIMARY KEY ," + // 0: tag
                "\"ID\" TEXT," + // 1: id
                "\"CT\" TEXT," + // 2: ct
                "\"TEXT\" TEXT," + // 3: text
                "\"TITLE\" TEXT," + // 4: title
                "\"TYPE\" TEXT);"); // 5: type
    }

    /**
     * Drops the underlying database table.
     */
    public static void dropTable(SQLiteDatabase db) {
        String sql = "DROP TABLE " + ("IF EXISTS ") + "\"JOKE_TEXT_INFO\"";
        db.execSQL(sql);
    }

    @Override
    protected void bindValues(SQLiteStatement stmt, JokeTextInfo entity) {
        stmt.clearBindings();

        Integer tag = entity.getTag();
        if (tag != null) {
            stmt.bindLong(1, tag);
        }

        String id = entity.getId();
        if (id != null) {
            stmt.bindString(2, id);
        }

        String ct = entity.getCt();
        if (ct != null) {
            stmt.bindString(3, ct);
        }

        String text = entity.getText();
        if (text != null) {
            stmt.bindString(4, text);
        }

        String title = entity.getTitle();
        if (title != null) {
            stmt.bindString(5, title);
        }

        String type = entity.getType();
        if (type != null) {
            stmt.bindString(6, type);
        }
    }

    @Override
    public Integer readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset) ? null : cursor.getInt(offset);
    }

    @Override
    public JokeTextInfo readEntity(Cursor cursor, int offset) {
        return new JokeTextInfo( //
                cursor.isNull(offset) ? null : cursor.getInt(offset), // tag
                cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // id
                cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // ct
                cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // text
                cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // title
                cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5) // type
        );
    }

    @Override
    public void readEntity(Cursor cursor, JokeTextInfo entity, int offset) {
        entity.setTag(cursor.isNull(offset) ? null : cursor.getInt(offset));
        entity.setId(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setCt(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setText(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setTitle(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setType(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
    }

    @Override
    protected Integer updateKeyAfterInsert(JokeTextInfo entity, long rowId) {
        return entity.getTag();
    }

    @Override
    public Integer getKey(JokeTextInfo entity) {
        if (entity != null) {
            return entity.getTag();
        } else {
            return null;
        }
    }

    @Override
    protected boolean isEntityUpdateable() {
        return true;
    }

    /**
     * Properties of entity JokeTextInfo.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Tag = new Property(0, Integer.class, "tag", true, "TAG");
        public final static Property Id = new Property(1, String.class, "id", false, "ID");
        public final static Property Ct = new Property(2, String.class, "ct", false, "CT");
        public final static Property Text = new Property(3, String.class, "text", false, "TEXT");
        public final static Property Title = new Property(4, String.class, "title", false, "TITLE");
        public final static Property Type = new Property(5, String.class, "type", false, "TYPE");
    }

}
