package com.example.y.mvp;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * DAO for table "NEWS_TAB_NAME_INFO".
 */
public class NewsTabNameInfoDao extends AbstractDao<NewsTabNameInfo, Integer> {

    public static final String TABLENAME = "NEWS_TAB_NAME_INFO";

    public NewsTabNameInfoDao(DaoConfig config) {
        super(config);
    }


    public NewsTabNameInfoDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /**
     * Creates the underlying database table.
     */
    public static void createTable(SQLiteDatabase db) {
        String constraint = "";
        db.execSQL("CREATE TABLE " + constraint + "\"NEWS_TAB_NAME_INFO\" (" + //
                "\"TAG\" INTEGER PRIMARY KEY ," + // 0: tag
                "\"ID\" INTEGER," + // 1: id
                "\"NAME\" TEXT);"); // 2: name
    }

    /**
     * Drops the underlying database table.
     */
    public static void dropTable(SQLiteDatabase db) {
        String sql = "DROP TABLE " + ("IF EXISTS ") + "\"NEWS_TAB_NAME_INFO\"";
        db.execSQL(sql);
    }

    @Override
    protected void bindValues(SQLiteStatement stmt, NewsTabNameInfo entity) {
        stmt.clearBindings();

        Integer tag = entity.getTag();
        if (tag != null) {
            stmt.bindLong(1, tag);
        }

        Integer id = entity.getId();
        if (id != null) {
            stmt.bindLong(2, id);
        }

        String name = entity.getName();
        if (name != null) {
            stmt.bindString(3, name);
        }
    }

    @Override
    public Integer readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset) ? null : cursor.getInt(offset);
    }

    @Override
    public NewsTabNameInfo readEntity(Cursor cursor, int offset) {
        return new NewsTabNameInfo( //
                cursor.isNull(offset) ? null : cursor.getInt(offset), // tag
                cursor.isNull(offset + 1) ? null : cursor.getInt(offset + 1), // id
                cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2) // name
        );
    }

    @Override
    public void readEntity(Cursor cursor, NewsTabNameInfo entity, int offset) {
        entity.setTag(cursor.isNull(offset) ? null : cursor.getInt(offset));
        entity.setId(cursor.isNull(offset + 1) ? null : cursor.getInt(offset + 1));
        entity.setName(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
    }

    @Override
    protected Integer updateKeyAfterInsert(NewsTabNameInfo entity, long rowId) {
        return entity.getTag();
    }

    @Override
    public Integer getKey(NewsTabNameInfo entity) {
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
     * Properties of entity NewsTabNameInfo.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Tag = new Property(0, Integer.class, "tag", true, "TAG");
        public final static Property Id = new Property(1, Integer.class, "id", false, "ID");
        public final static Property Name = new Property(2, String.class, "name", false, "NAME");
    }

}
