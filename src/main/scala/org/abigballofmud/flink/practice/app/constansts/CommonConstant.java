package org.abigballofmud.flink.practice.app.constansts;

/**
 * <p>
 * description
 * </p>
 *
 * @author isacc 2020/02/27 12:35
 * @since 1.0
 */
public interface CommonConstant {

    String INSERT = "INSERT";
    String UPDATE = "UPDATE";
    String UPSERT  = "UPSERT";
    String DELETE = "DELETE";

    String KAFKA_INIT_OFFSET_LATEST = "latest";
    String KAFKA_INIT_OFFSET_EARLIEST = "earliest";
}
