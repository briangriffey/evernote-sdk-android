/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package com.evernote.edam.notestore;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.Arrays;

import org.apache.thrift.*;
import org.apache.thrift.meta_data.*;
import org.apache.thrift.transport.*;
import org.apache.thrift.protocol.*;

/**
 * This structure is passed from clients to the Evernote service when they wish
 * to relay coarse-grained usage metrics to the service to help improve
 * products.
 * 
 * <dl>
 *  <dt>sessions</dt>
 *  <dd>
 *    This field contains a count of the number of usage "sessions" that have
 *    occurred with this client which have not previously been reported to
 *    the service.
 *    A "session" is defined as one of the 96 fifteen-minute intervals of the
 *    day when someone used Evernote's interface at least once.
 *    So if a user interacts with an Evernote client at 12:18, 12:24, and 12:36,
 *    and then the client synchronizes at 12:39, it would report that there were
 *    two previously-unreported sessions (one session for the 12:15-12:30 time
 *    period, and one for the 12:30-12:45 period).
 *    If the user used Evernote again at 12:41 and synchronized at 12:43, it
 *    would not report any new sessions, because the 12:30-12:45 session had
 *    already been reported.
 *  </dd>
 * </dl>
 */
public class ClientUsageMetrics implements TBase<ClientUsageMetrics, ClientUsageMetrics._Fields>, java.io.Serializable, Cloneable {
  private static final TStruct STRUCT_DESC = new TStruct("ClientUsageMetrics");

  private static final TField SESSIONS_FIELD_DESC = new TField("sessions", TType.I32, (short)1);

  private int sessions;

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements TFieldIdEnum {
    SESSIONS((short)1, "sessions");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // SESSIONS
          return SESSIONS;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __SESSIONS_ISSET_ID = 0;
  private boolean[] __isset_vector = new boolean[1];

  public static final Map<_Fields, FieldMetaData> metaDataMap;
  static {
    Map<_Fields, FieldMetaData> tmpMap = new EnumMap<_Fields, FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.SESSIONS, new FieldMetaData("sessions", TFieldRequirementType.OPTIONAL, 
        new FieldValueMetaData(TType.I32)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    FieldMetaData.addStructMetaDataMap(ClientUsageMetrics.class, metaDataMap);
  }

  public ClientUsageMetrics() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ClientUsageMetrics(ClientUsageMetrics other) {
    System.arraycopy(other.__isset_vector, 0, __isset_vector, 0, other.__isset_vector.length);
    this.sessions = other.sessions;
  }

  public ClientUsageMetrics deepCopy() {
    return new ClientUsageMetrics(this);
  }

  public void clear() {
    setSessionsIsSet(false);
    this.sessions = 0;
  }

  public int getSessions() {
    return this.sessions;
  }

  public void setSessions(int sessions) {
    this.sessions = sessions;
    setSessionsIsSet(true);
  }

  public void unsetSessions() {
    __isset_vector[__SESSIONS_ISSET_ID] = false;
  }

  /** Returns true if field sessions is set (has been asigned a value) and false otherwise */
  public boolean isSetSessions() {
    return __isset_vector[__SESSIONS_ISSET_ID];
  }

  public void setSessionsIsSet(boolean value) {
    __isset_vector[__SESSIONS_ISSET_ID] = value;
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case SESSIONS:
      if (value == null) {
        unsetSessions();
      } else {
        setSessions((Integer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case SESSIONS:
      return new Integer(getSessions());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been asigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case SESSIONS:
      return isSetSessions();
    }
    throw new IllegalStateException();
  }

  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ClientUsageMetrics)
      return this.equals((ClientUsageMetrics)that);
    return false;
  }

  public boolean equals(ClientUsageMetrics that) {
    if (that == null)
      return false;

    boolean this_present_sessions = true && this.isSetSessions();
    boolean that_present_sessions = true && that.isSetSessions();
    if (this_present_sessions || that_present_sessions) {
      if (!(this_present_sessions && that_present_sessions))
        return false;
      if (this.sessions != that.sessions)
        return false;
    }

    return true;
  }

  public int hashCode() {
    return 0;
  }

  public int compareTo(ClientUsageMetrics other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    ClientUsageMetrics typedOther = (ClientUsageMetrics)other;

    lastComparison = Boolean.valueOf(isSetSessions()).compareTo(typedOther.isSetSessions());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSessions()) {      lastComparison = TBaseHelper.compareTo(this.sessions, typedOther.sessions);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(TProtocol iprot) throws TException {
    TField field;
    iprot.readStructBegin();
    while (true)
    {
      field = iprot.readFieldBegin();
      if (field.type == TType.STOP) { 
        break;
      }
      switch (field.id) {
        case 1: // SESSIONS
          if (field.type == TType.I32) {
            this.sessions = iprot.readI32();
            setSessionsIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        default:
          TProtocolUtil.skip(iprot, field.type);
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();
    validate();
  }

  public void write(TProtocol oprot) throws TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    if (isSetSessions()) {
      oprot.writeFieldBegin(SESSIONS_FIELD_DESC);
      oprot.writeI32(this.sessions);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  public String toString() {
    StringBuilder sb = new StringBuilder("ClientUsageMetrics(");
    boolean first = true;

    if (isSetSessions()) {
      sb.append("sessions:");
      sb.append(this.sessions);
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
  }

}
