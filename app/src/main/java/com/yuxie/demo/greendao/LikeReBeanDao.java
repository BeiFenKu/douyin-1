package com.yuxie.demo.greendao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.yuxie.demo.dq.LikeReBean;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "LIKE_RE_BEAN".
*/
public class LikeReBeanDao extends AbstractDao<LikeReBean, Long> {

    public static final String TABLENAME = "LIKE_RE_BEAN";

    /**
     * Properties of entity LikeReBean.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property VoideoId = new Property(1, String.class, "voideoId", false, "VOIDEO_ID");
        public final static Property Token = new Property(2, String.class, "token", false, "TOKEN");
    }


    public LikeReBeanDao(DaoConfig config) {
        super(config);
    }
    
    public LikeReBeanDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"LIKE_RE_BEAN\" (" + //
                "\"_id\" INTEGER PRIMARY KEY ," + // 0: id
                "\"VOIDEO_ID\" TEXT," + // 1: voideoId
                "\"TOKEN\" TEXT);"); // 2: token
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"LIKE_RE_BEAN\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, LikeReBean entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String voideoId = entity.getVoideoId();
        if (voideoId != null) {
            stmt.bindString(2, voideoId);
        }
 
        String token = entity.getToken();
        if (token != null) {
            stmt.bindString(3, token);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, LikeReBean entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String voideoId = entity.getVoideoId();
        if (voideoId != null) {
            stmt.bindString(2, voideoId);
        }
 
        String token = entity.getToken();
        if (token != null) {
            stmt.bindString(3, token);
        }
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public LikeReBean readEntity(Cursor cursor, int offset) {
        LikeReBean entity = new LikeReBean( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // voideoId
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2) // token
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, LikeReBean entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setVoideoId(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setToken(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(LikeReBean entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(LikeReBean entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(LikeReBean entity) {
        return entity.getId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
