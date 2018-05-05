/*
 * This file is generated by jOOQ.
*/
package shuo.photos.orm.tables.records;


import java.time.LocalDateTime;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;

import shuo.photos.orm.tables.Photos;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PhotosRecord extends UpdatableRecordImpl<PhotosRecord> implements Record4<String, LocalDateTime, String, String> {

    private static final long serialVersionUID = -647447718;

    /**
     * Setter for <code>public.photos.id</code>.
     */
    public void setId(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.photos.id</code>.
     */
    public String getId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>public.photos.uploaded_time</code>.
     */
    public void setUploadedTime(LocalDateTime value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.photos.uploaded_time</code>.
     */
    public LocalDateTime getUploadedTime() {
        return (LocalDateTime) get(1);
    }

    /**
     * Setter for <code>public.photos.name</code>.
     */
    public void setName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.photos.name</code>.
     */
    public String getName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.photos.oss_path</code>.
     */
    public void setOssPath(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.photos.oss_path</code>.
     */
    public String getOssPath() {
        return (String) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<String, LocalDateTime, String, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<String, LocalDateTime, String, String> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return Photos.PHOTOS.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<LocalDateTime> field2() {
        return Photos.PHOTOS.UPLOADED_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Photos.PHOTOS.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Photos.PHOTOS.OSS_PATH;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime value2() {
        return getUploadedTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getOssPath();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PhotosRecord value1(String value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PhotosRecord value2(LocalDateTime value) {
        setUploadedTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PhotosRecord value3(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PhotosRecord value4(String value) {
        setOssPath(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PhotosRecord values(String value1, LocalDateTime value2, String value3, String value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PhotosRecord
     */
    public PhotosRecord() {
        super(Photos.PHOTOS);
    }

    /**
     * Create a detached, initialised PhotosRecord
     */
    public PhotosRecord(String id, LocalDateTime uploadedTime, String name, String ossPath) {
        super(Photos.PHOTOS);

        set(0, id);
        set(1, uploadedTime);
        set(2, name);
        set(3, ossPath);
    }
}
