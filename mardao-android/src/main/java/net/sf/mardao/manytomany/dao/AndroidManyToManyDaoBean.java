package net.sf.mardao.manytomany.dao;

import android.database.sqlite.SQLiteDatabase;

import net.sf.mardao.api.dao.AbstractDatabaseHelper;

/**
 * Implementation of Business Methods related to entity AndroidManyToMany.
 * This (empty) class is generated by mardao, but edited by developers.
 * It is not overwritten by the generator once it exists.
 *
 * Generated on 2012-05-05T17:25:30.176+0700.
 * @author mardao DAO generator (net.sf.mardao.plugin.ProcessDomainMojo)
 */
public class AndroidManyToManyDaoBean 
	extends GeneratedAndroidManyToManyDaoImpl
		implements AndroidManyToManyDao 
{
    private final String tableName;
    
    /** Constructor */
    public AndroidManyToManyDaoBean(AbstractDatabaseHelper databaseHelper) {
        super(databaseHelper);
        this.tableName = TABLE_NAME;
    }

    /** Constructor */
    public AndroidManyToManyDaoBean(AbstractDatabaseHelper databaseHelper, String tableName) {
        super(databaseHelper);
        this.tableName = tableName;
    }

    /**
     * Implement this table's upgrade methods here. 
     * Upgrades are done version-by-version in the for-switch loop
     * @param sqld
     * @param fromVersion
     * @param toVersion 
     */
    public static void onUpgrade(SQLiteDatabase sqld, int fromVersion, int toVersion) {
        // upgrade version-by-version, one step at a time:
        for (int v = fromVersion; v < toVersion; v++) {
            switch (v) {
                case 0:
                    // do nothing, as first version should be 1
                    break;
                default:
                    throw new UnsupportedOperationException("Not supported yet.");
            }
        }
    }
    
	// TODO: implement your Business Methods here

    @Override
    public String getTableName() {
        return tableName;
    }
    
}
