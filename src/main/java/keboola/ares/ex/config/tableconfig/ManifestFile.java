/*
 */
package keboola.ares.ex.config.tableconfig;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import com.fasterxml.jackson.databind.annotation.JsonSerialize.Inclusion;

/**
 *
 * @author David Esner <esnerda at gmail.com>
 * @created 2016
 */
@JsonInclude(Include.NON_NULL)
public class ManifestFile {

    @JsonProperty("destination")
    private String destination;
    @JsonProperty("incremental")
    private boolean incremental;
    //"," default
    @JsonProperty("delimiter")
    private String delimiter;
    //"\"" default
    @JsonProperty("enclosure")
    private String enclosure;
    @JsonProperty("primary_key")
    private String[] primaryKey;
    @JsonProperty("columns")
    private String[] columns;
    @JsonProperty("rows_count")
    private Integer rows_count;
    @JsonProperty("data_size_bytes")
    private Integer data_size_bytes;

    public ManifestFile() {
    }

    public ManifestFile(String destination, boolean incremental, String[] primaryKey, String delimiter, String enclosure) {
        this.primaryKey = primaryKey;
        this.destination = destination;
        this.incremental = incremental;
        this.delimiter = delimiter;
        this.enclosure = enclosure;
    }

    @JsonCreator
    public ManifestFile(@JsonProperty("destination") String destination, @JsonProperty("incremental") boolean incremental,
            @JsonProperty("primary_key") String[] primaryKey, @JsonProperty("delimiter") String delimiter,
            @JsonProperty("enclosure") String enclosure, @JsonProperty("rows_count") Integer rows_count,
            @JsonProperty("data_size_bytes") Integer data_size_bytes) {

        this.rows_count = rows_count;
        this.data_size_bytes = data_size_bytes;

        this.destination = destination;
        this.incremental = incremental;
        this.primaryKey = primaryKey;
        //default values
        if (delimiter == null) {
            this.delimiter = ",";
        } else {
            this.delimiter = delimiter;
        }
        if (enclosure == null) {
            this.enclosure = "\"";
        } else {
            this.enclosure = enclosure;
        }
    }

    public String[] getColumns() {
        return columns;
    }

    public void setColumns(String[] columns) {
        this.columns = columns;
    }

    public Integer getRows_count() {
        return rows_count;
    }

    public void setRows_count(Integer rows_count) {
        this.rows_count = rows_count;
    }

    public Integer getData_size_bytes() {
        return data_size_bytes;
    }

    public void setData_size_bytes(Integer data_size_bytes) {
        this.data_size_bytes = data_size_bytes;
    }

    public String[] getPrimaryKey() {
        return primaryKey;
    }

    public void setPrimaryKey(String[] primaryKey) {
        this.primaryKey = primaryKey;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public boolean isIncremental() {
        return incremental;
    }

    public void setIncremental(boolean incremental) {
        this.incremental = incremental;
    }

    public String getDelimiter() {
        return delimiter;
    }

    public void setDelimiter(String delimiter) {
        this.delimiter = delimiter;
    }

    public String getEnclosure() {
        return enclosure;
    }

    public void setEnclosure(String enclosure) {
        this.enclosure = enclosure;
    }

}
