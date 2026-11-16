package io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn

import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.w

public val AJ_IFC_SECURITY_INHERIT: AlljoynInterfacedescriptionSecuritypolicy = 0

public val AJ_IFC_SECURITY_OFF: AlljoynInterfacedescriptionSecuritypolicy = 2

public val AJ_IFC_SECURITY_REQUIRED: AlljoynInterfacedescriptionSecuritypolicy = 1

public val ALLJOYN_ARRAY: AlljoynTypeid = 97

public val ALLJOYN_BIG_ENDIAN: UByte = 66u.toUByte()

public val ALLJOYN_BOOLEAN: AlljoynTypeid = 98

public val ALLJOYN_BOOLEAN_ARRAY: AlljoynTypeid = 25185

public val ALLJOYN_BYTE: AlljoynTypeid = 121

public val ALLJOYN_BYTE_ARRAY: AlljoynTypeid = 31073

public val ALLJOYN_CRED_CERT_CHAIN: UShort = 4u.toUShort()

public val ALLJOYN_CRED_EXPIRATION: UShort = 32u.toUShort()

public val ALLJOYN_CRED_LOGON_ENTRY: UShort = 16u.toUShort()

public val ALLJOYN_CRED_NEW_PASSWORD: UShort = 4097u.toUShort()

public val ALLJOYN_CRED_ONE_TIME_PWD: UShort = 8193u.toUShort()

public val ALLJOYN_CRED_PASSWORD: UShort = 1u.toUShort()

public val ALLJOYN_CRED_PRIVATE_KEY: UShort = 8u.toUShort()

public val ALLJOYN_CRED_USER_NAME: UShort = 2u.toUShort()

public val ALLJOYN_DICT_ENTRY: AlljoynTypeid = 101

public val ALLJOYN_DICT_ENTRY_CLOSE: AlljoynTypeid = 125

public val ALLJOYN_DICT_ENTRY_OPEN: AlljoynTypeid = 123

public val ALLJOYN_DISCONNECTED: UInt = 4u

public val ALLJOYN_DOUBLE: AlljoynTypeid = 100

public val ALLJOYN_DOUBLE_ARRAY: AlljoynTypeid = 25697

public val ALLJOYN_HANDLE: AlljoynTypeid = 104

public val ALLJOYN_INT16: AlljoynTypeid = 110

public val ALLJOYN_INT16_ARRAY: AlljoynTypeid = 28257

public val ALLJOYN_INT32: AlljoynTypeid = 105

public val ALLJOYN_INT32_ARRAY: AlljoynTypeid = 26977

public val ALLJOYN_INT64: AlljoynTypeid = 120

public val ALLJOYN_INT64_ARRAY: AlljoynTypeid = 30817

public val ALLJOYN_INVALID: AlljoynTypeid = 0

public val ALLJOYN_LITTLE_ENDIAN: UByte = 108u.toUByte()

public val ALLJOYN_MEMBER_ANNOTATE_DEPRECATED: UByte = 2u.toUByte()

public val ALLJOYN_MEMBER_ANNOTATE_GLOBAL_BROADCAST: UByte = 32u.toUByte()

public val ALLJOYN_MEMBER_ANNOTATE_NO_REPLY: UByte = 1u.toUByte()

public val ALLJOYN_MEMBER_ANNOTATE_SESSIONCAST: UByte = 4u.toUByte()

public val ALLJOYN_MEMBER_ANNOTATE_SESSIONLESS: UByte = 8u.toUByte()

public val ALLJOYN_MEMBER_ANNOTATE_UNICAST: UByte = 16u.toUByte()

public val ALLJOYN_MESSAGE_DEFAULT_TIMEOUT: UInt = 25000u

public val ALLJOYN_MESSAGE_ERROR: AlljoynMessagetype = 3

public val ALLJOYN_MESSAGE_FLAG_ALLOW_REMOTE_MSG: UInt = 4u

public val ALLJOYN_MESSAGE_FLAG_AUTO_START: UInt = 2u

public val ALLJOYN_MESSAGE_FLAG_ENCRYPTED: UInt = 128u

public val ALLJOYN_MESSAGE_FLAG_GLOBAL_BROADCAST: UInt = 32u

public val ALLJOYN_MESSAGE_FLAG_NO_REPLY_EXPECTED: UInt = 1u

public val ALLJOYN_MESSAGE_FLAG_SESSIONLESS: UInt = 16u

public val ALLJOYN_MESSAGE_INVALID: AlljoynMessagetype = 0

public val ALLJOYN_MESSAGE_METHOD_CALL: AlljoynMessagetype = 1

public val ALLJOYN_MESSAGE_METHOD_RET: AlljoynMessagetype = 2

public val ALLJOYN_MESSAGE_SIGNAL: AlljoynMessagetype = 4

public val ALLJOYN_NAMED_PIPE_CONNECT_SPEC: Pcwstr = w("npipe:")

public val ALLJOYN_OBJECT_PATH: AlljoynTypeid = 111

public val ALLJOYN_PROP_ACCESS_READ: UByte = 1u.toUByte()

public val ALLJOYN_PROP_ACCESS_RW: UByte = 3u.toUByte()

public val ALLJOYN_PROP_ACCESS_WRITE: UByte = 2u.toUByte()

public val ALLJOYN_PROXIMITY_ANY: UInt = 255u

public val ALLJOYN_PROXIMITY_NETWORK: UInt = 2u

public val ALLJOYN_PROXIMITY_PHYSICAL: UInt = 1u

public val ALLJOYN_READ_READY: UInt = 1u

public val ALLJOYN_SESSIONLOST_INVALID: AlljoynSessionlostreason = 0

public val ALLJOYN_SESSIONLOST_LINK_TIMEOUT: AlljoynSessionlostreason = 4

public val ALLJOYN_SESSIONLOST_REASON_OTHER: AlljoynSessionlostreason = 5

public val ALLJOYN_SESSIONLOST_REMOTE_END_CLOSED_ABRUPTLY: AlljoynSessionlostreason = 2

public val ALLJOYN_SESSIONLOST_REMOTE_END_LEFT_SESSION: AlljoynSessionlostreason = 1

public val ALLJOYN_SESSIONLOST_REMOVED_BY_BINDER: AlljoynSessionlostreason = 3

public val ALLJOYN_SIGNATURE: AlljoynTypeid = 103

public val ALLJOYN_STRING: AlljoynTypeid = 115

public val ALLJOYN_STRUCT: AlljoynTypeid = 114

public val ALLJOYN_STRUCT_CLOSE: AlljoynTypeid = 41

public val ALLJOYN_STRUCT_OPEN: AlljoynTypeid = 40

public val ALLJOYN_TRAFFIC_TYPE_MESSAGES: UInt = 1u

public val ALLJOYN_TRAFFIC_TYPE_RAW_RELIABLE: UInt = 4u

public val ALLJOYN_TRAFFIC_TYPE_RAW_UNRELIABLE: UInt = 2u

public val ALLJOYN_UINT16: AlljoynTypeid = 113

public val ALLJOYN_UINT16_ARRAY: AlljoynTypeid = 29025

public val ALLJOYN_UINT32: AlljoynTypeid = 117

public val ALLJOYN_UINT32_ARRAY: AlljoynTypeid = 30049

public val ALLJOYN_UINT64: AlljoynTypeid = 116

public val ALLJOYN_UINT64_ARRAY: AlljoynTypeid = 29793

public val ALLJOYN_VARIANT: AlljoynTypeid = 118

public val ALLJOYN_WILDCARD: AlljoynTypeid = 42

public val ALLJOYN_WRITE_READY: UInt = 2u

public val ANNOUNCED: AlljoynAboutAnnounceflag = 1

public val CAPABLE_ECDHE_ECDSA: AlljoynClaimcapabilityMasks = 4

public val CAPABLE_ECDHE_NULL: AlljoynClaimcapabilityMasks = 1

public val CAPABLE_ECDHE_SPEKE: AlljoynClaimcapabilityMasks = 8

public val CLAIMABLE: AlljoynApplicationstate = 1

public val CLAIMED: AlljoynApplicationstate = 2

public val ER_ABOUT_ABOUTDATA_MISSING_REQUIRED_FIELD: QStatus = 37157

public val ER_ABOUT_DEFAULT_LANGUAGE_NOT_SPECIFIED: QStatus = 37155

public val ER_ABOUT_FIELD_ALREADY_SPECIFIED: QStatus = 37147

public val ER_ABOUT_INVALID_ABOUTDATA_FIELD_APPID_SIZE: QStatus = 37163

public val ER_ABOUT_INVALID_ABOUTDATA_FIELD_VALUE: QStatus = 37162

public val ER_ABOUT_INVALID_ABOUTDATA_LISTENER: QStatus = 37158

public val ER_ABOUT_SESSIONPORT_NOT_BOUND: QStatus = 37156

public val ER_ALERTED_THREAD: QStatus = 4098

public val ER_ALLJOYN_ACCESS_PERMISSION_ERROR: QStatus = 37028

public val ER_ALLJOYN_ACCESS_PERMISSION_WARNING: QStatus = 37027

public val ER_ALLJOYN_ADVERTISENAME_REPLY_ALREADY_ADVERTISING: QStatus = 37005

public val ER_ALLJOYN_ADVERTISENAME_REPLY_FAILED: QStatus = 37006

public val ER_ALLJOYN_ADVERTISENAME_REPLY_TRANSPORT_NOT_AVAILABLE: QStatus = 37004

public val ER_ALLJOYN_BINDSESSIONPORT_REPLY_ALREADY_EXISTS: QStatus = 36992

public val ER_ALLJOYN_BINDSESSIONPORT_REPLY_FAILED: QStatus = 36993

public val ER_ALLJOYN_BINDSESSIONPORT_REPLY_INVALID_OPTS: QStatus = 37018

public val ER_ALLJOYN_CANCELADVERTISENAME_REPLY_FAILED: QStatus = 37008

public val ER_ALLJOYN_CANCELFINDADVERTISEDNAME_REPLY_FAILED: QStatus = 37013

public val ER_ALLJOYN_FINDADVERTISEDNAME_REPLY_ALREADY_DISCOVERING: QStatus = 37010

public val ER_ALLJOYN_FINDADVERTISEDNAME_REPLY_FAILED: QStatus = 37011

public val ER_ALLJOYN_FINDADVERTISEDNAME_REPLY_TRANSPORT_NOT_AVAILABLE: QStatus = 37009

public val ER_ALLJOYN_JOINSESSION_REPLY_ALREADY_JOINED: QStatus = 37019

public val ER_ALLJOYN_JOINSESSION_REPLY_BAD_SESSION_OPTS: QStatus = 36999

public val ER_ALLJOYN_JOINSESSION_REPLY_CONNECT_FAILED: QStatus = 36997

public val ER_ALLJOYN_JOINSESSION_REPLY_FAILED: QStatus = 37000

public val ER_ALLJOYN_JOINSESSION_REPLY_NO_SESSION: QStatus = 36995

public val ER_ALLJOYN_JOINSESSION_REPLY_REJECTED: QStatus = 36998

public val ER_ALLJOYN_JOINSESSION_REPLY_UNREACHABLE: QStatus = 36996

public val ER_ALLJOYN_LEAVESESSION_REPLY_FAILED: QStatus = 37003

public val ER_ALLJOYN_LEAVESESSION_REPLY_NO_SESSION: QStatus = 37002

public val ER_ALLJOYN_ONAPPRESUME_REPLY_FAILED: QStatus = 37100

public val ER_ALLJOYN_ONAPPRESUME_REPLY_UNSUPPORTED: QStatus = 37101

public val ER_ALLJOYN_ONAPPSUSPEND_REPLY_FAILED: QStatus = 37098

public val ER_ALLJOYN_ONAPPSUSPEND_REPLY_UNSUPPORTED: QStatus = 37099

public val ER_ALLJOYN_PING_FAILED: QStatus = 37111

public val ER_ALLJOYN_PING_REPLY_FAILED: QStatus = 37143

public val ER_ALLJOYN_PING_REPLY_INCOMPATIBLE_REMOTE_ROUTING_NODE: QStatus = 37140

public val ER_ALLJOYN_PING_REPLY_IN_PROGRESS: QStatus = 37145

public val ER_ALLJOYN_PING_REPLY_TIMEOUT: QStatus = 37141

public val ER_ALLJOYN_PING_REPLY_UNKNOWN_NAME: QStatus = 37142

public val ER_ALLJOYN_PING_REPLY_UNREACHABLE: QStatus = 37112

public val ER_ALLJOYN_REMOVESESSIONMEMBER_INCOMPATIBLE_REMOTE_DAEMON: QStatus = 37107

public val ER_ALLJOYN_REMOVESESSIONMEMBER_NOT_BINDER: QStatus = 37104

public val ER_ALLJOYN_REMOVESESSIONMEMBER_NOT_FOUND: QStatus = 37106

public val ER_ALLJOYN_REMOVESESSIONMEMBER_NOT_MULTIPOINT: QStatus = 37105

public val ER_ALLJOYN_REMOVESESSIONMEMBER_REPLY_FAILED: QStatus = 37108

public val ER_ALLJOYN_REMOVESESSIONMEMBER_REPLY_NO_SESSION: QStatus = 37103

public val ER_ALLJOYN_SETLINKTIMEOUT_REPLY_FAILED: QStatus = 37026

public val ER_ALLJOYN_SETLINKTIMEOUT_REPLY_NOT_SUPPORTED: QStatus = 37024

public val ER_ALLJOYN_SETLINKTIMEOUT_REPLY_NO_DEST_SUPPORT: QStatus = 37025

public val ER_ALLJOYN_UNBINDSESSIONPORT_REPLY_BAD_PORT: QStatus = 37016

public val ER_ALLJOYN_UNBINDSESSIONPORT_REPLY_FAILED: QStatus = 37017

public val ER_APPLICATION_STATE_LISTENER_ALREADY_EXISTS: QStatus = 37184

public val ER_APPLICATION_STATE_LISTENER_NO_SUCH_LISTENER: QStatus = 37185

public val ER_ARDP_BACKPRESSURE: QStatus = 37122

public val ER_ARDP_DISCONNECTING: QStatus = 37139

public val ER_ARDP_INVALID_CONNECTION: QStatus = 37135

public val ER_ARDP_INVALID_RESPONSE: QStatus = 37134

public val ER_ARDP_INVALID_STATE: QStatus = 37124

public val ER_ARDP_PERSIST_TIMEOUT: QStatus = 37126

public val ER_ARDP_PROBE_TIMEOUT: QStatus = 37127

public val ER_ARDP_REMOTE_CONNECTION_RESET: QStatus = 37128

public val ER_ARDP_TTL_EXPIRED: QStatus = 37125

public val ER_ARDP_VERSION_NOT_SUPPORTED: QStatus = 37151

public val ER_ARDP_WRITE_BLOCKED: QStatus = 37153

public val ER_AUTH_FAIL: QStatus = 4100

public val ER_AUTH_USER_REJECT: QStatus = 4101

public val ER_BAD_ARG_1: QStatus = 12

public val ER_BAD_ARG_2: QStatus = 13

public val ER_BAD_ARG_3: QStatus = 14

public val ER_BAD_ARG_4: QStatus = 15

public val ER_BAD_ARG_5: QStatus = 16

public val ER_BAD_ARG_6: QStatus = 17

public val ER_BAD_ARG_7: QStatus = 18

public val ER_BAD_ARG_8: QStatus = 19

public val ER_BAD_ARG_COUNT: QStatus = 28

public val ER_BAD_HOSTNAME: QStatus = 4112

public val ER_BAD_STRING_ENCODING: QStatus = 4120

public val ER_BAD_TRANSPORT_MASK: QStatus = 37088

public val ER_BUFFER_TOO_SMALL: QStatus = 3

public val ER_BUS_ALREADY_CONNECTED: QStatus = 36932

public val ER_BUS_ALREADY_LISTENING: QStatus = 36934

public val ER_BUS_ANNOTATION_ALREADY_EXISTS: QStatus = 37082

public val ER_BUS_AUTHENTICATION_PENDING: QStatus = 37031

public val ER_BUS_BAD_BODY_LEN: QStatus = 36879

public val ER_BUS_BAD_BUS_NAME: QStatus = 36874

public val ER_BUS_BAD_CHILD_PATH: QStatus = 36927

public val ER_BUS_BAD_ERROR_NAME: QStatus = 36873

public val ER_BUS_BAD_HDR_FLAGS: QStatus = 36878

public val ER_BUS_BAD_HEADER_FIELD: QStatus = 36868

public val ER_BUS_BAD_HEADER_LEN: QStatus = 36880

public val ER_BUS_BAD_INTERFACE_NAME: QStatus = 36872

public val ER_BUS_BAD_LENGTH: QStatus = 36876

public val ER_BUS_BAD_MEMBER_NAME: QStatus = 36871

public val ER_BUS_BAD_OBJ_PATH: QStatus = 36870

public val ER_BUS_BAD_SENDER_ID: QStatus = 36908

public val ER_BUS_BAD_SEND_PARAMETER: QStatus = 36906

public val ER_BUS_BAD_SESSION_OPTS: QStatus = 36980

public val ER_BUS_BAD_SIGNATURE: QStatus = 36869

public val ER_BUS_BAD_TRANSPORT_ARGS: QStatus = 36903

public val ER_BUS_BAD_VALUE: QStatus = 36877

public val ER_BUS_BAD_VALUE_TYPE: QStatus = 36867

public val ER_BUS_BAD_XML: QStatus = 36926

public val ER_BUS_BLOCKING_CALL_NOT_ALLOWED: QStatus = 36960

public val ER_BUS_BUS_ALREADY_STARTED: QStatus = 36939

public val ER_BUS_BUS_NOT_STARTED: QStatus = 36940

public val ER_BUS_CANNOT_ADD_HANDLER: QStatus = 36965

public val ER_BUS_CANNOT_ADD_INTERFACE: QStatus = 36964

public val ER_BUS_CANNOT_EXPAND_MESSAGE: QStatus = 36930

public val ER_BUS_CONNECTION_REJECTED: QStatus = 36981

public val ER_BUS_CONNECT_FAILED: QStatus = 36913

public val ER_BUS_CORRUPT_KEYSTORE: QStatus = 36952

public val ER_BUS_DESCRIPTION_ALREADY_EXISTS: QStatus = 37188

public val ER_BUS_DESTINATION_NOT_AUTHENTICATED: QStatus = 37029

public val ER_BUS_ELEMENT_NOT_FOUND: QStatus = 36976

public val ER_BUS_EMPTY_MESSAGE: QStatus = 36910

public val ER_BUS_ENDPOINT_CLOSING: QStatus = 36920

public val ER_BUS_ENDPOINT_REDIRECTED: QStatus = 37030

public val ER_BUS_ERRORS: QStatus = 36864

public val ER_BUS_ERROR_NAME_MISSING: QStatus = 36890

public val ER_BUS_ERROR_RESPONSE: QStatus = 36925

public val ER_BUS_ESTABLISH_FAILED: QStatus = 36884

public val ER_BUS_HANDLES_MISMATCH: QStatus = 36973

public val ER_BUS_HANDLES_NOT_ENABLED: QStatus = 36972

public val ER_BUS_HDR_EXPANSION_INVALID: QStatus = 36946

public val ER_BUS_IFACE_ALREADY_EXISTS: QStatus = 36924

public val ER_BUS_INCOMPATIBLE_DAEMON: QStatus = 37094

public val ER_BUS_INTERFACE_ACTIVATED: QStatus = 37015

public val ER_BUS_INTERFACE_MISMATCH: QStatus = 36921

public val ER_BUS_INTERFACE_MISSING: QStatus = 36886

public val ER_BUS_INTERFACE_NO_SUCH_MEMBER: QStatus = 36891

public val ER_BUS_INVALID_AUTH_MECHANISM: QStatus = 36958

public val ER_BUS_INVALID_HEADER_CHECKSUM: QStatus = 36942

public val ER_BUS_INVALID_HEADER_SERIAL: QStatus = 36944

public val ER_BUS_KEYBLOB_OP_INVALID: QStatus = 36941

public val ER_BUS_KEYSTORE_NOT_LOADED: QStatus = 36966

public val ER_BUS_KEYSTORE_VERSION_MISMATCH: QStatus = 36959

public val ER_BUS_KEY_EXPIRED: QStatus = 36951

public val ER_BUS_KEY_STORE_NOT_LOADED: QStatus = 36937

public val ER_BUS_KEY_UNAVAILABLE: QStatus = 36935

public val ER_BUS_LISTENER_ALREADY_SET: QStatus = 37022

public val ER_BUS_MATCH_RULE_NOT_FOUND: QStatus = 37110

public val ER_BUS_MEMBER_ALREADY_EXISTS: QStatus = 36922

public val ER_BUS_MEMBER_MISSING: QStatus = 36888

public val ER_BUS_MEMBER_NO_SUCH_SIGNATURE: QStatus = 36896

public val ER_BUS_MESSAGE_DECRYPTION_FAILED: QStatus = 36949

public val ER_BUS_MESSAGE_NOT_ENCRYPTED: QStatus = 36943

public val ER_BUS_METHOD_CALL_ABORTED: QStatus = 36963

public val ER_BUS_MISSING_COMPRESSION_TOKEN: QStatus = 36947

public val ER_BUS_NAME_TOO_LONG: QStatus = 36875

public val ER_BUS_NOT_ALLOWED: QStatus = 36918

public val ER_BUS_NOT_AUTHENTICATING: QStatus = 36915

public val ER_BUS_NOT_AUTHORIZED: QStatus = 37032

public val ER_BUS_NOT_A_COMPLETE_TYPE: QStatus = 36954

public val ER_BUS_NOT_A_DICTIONARY: QStatus = 36977

public val ER_BUS_NOT_COMPRESSED: QStatus = 36931

public val ER_BUS_NOT_CONNECTED: QStatus = 36933

public val ER_BUS_NOT_NUL_TERMINATED: QStatus = 36897

public val ER_BUS_NOT_OWNER: QStatus = 36911

public val ER_BUS_NO_AUTHENTICATION_MECHANISM: QStatus = 36938

public val ER_BUS_NO_CALL_FOR_REPLY: QStatus = 36953

public val ER_BUS_NO_ENDPOINT: QStatus = 36905

public val ER_BUS_NO_LISTENER: QStatus = 36916

public val ER_BUS_NO_PEER_GUID: QStatus = 36948

public val ER_BUS_NO_ROUTE: QStatus = 36904

public val ER_BUS_NO_SESSION: QStatus = 36975

public val ER_BUS_NO_SUCH_ANNOTATION: QStatus = 37081

public val ER_BUS_NO_SUCH_HANDLE: QStatus = 36971

public val ER_BUS_NO_SUCH_INTERFACE: QStatus = 36895

public val ER_BUS_NO_SUCH_MESSAGE: QStatus = 37102

public val ER_BUS_NO_SUCH_OBJECT: QStatus = 36892

public val ER_BUS_NO_SUCH_PROPERTY: QStatus = 36898

public val ER_BUS_NO_SUCH_SERVICE: QStatus = 36956

public val ER_BUS_NO_TRANSPORTS: QStatus = 36902

public val ER_BUS_OBJECT_NOT_REGISTERED: QStatus = 37091

public val ER_BUS_OBJECT_NO_SUCH_INTERFACE: QStatus = 36894

public val ER_BUS_OBJECT_NO_SUCH_MEMBER: QStatus = 36893

public val ER_BUS_OBJ_ALREADY_EXISTS: QStatus = 36928

public val ER_BUS_OBJ_NOT_FOUND: QStatus = 36929

public val ER_BUS_PATH_MISSING: QStatus = 36887

public val ER_BUS_PEER_AUTH_VERSION_MISMATCH: QStatus = 37023

public val ER_BUS_PING_GROUP_NOT_FOUND: QStatus = 37159

public val ER_BUS_POLICY_VIOLATION: QStatus = 36955

public val ER_BUS_PROPERTY_ACCESS_DENIED: QStatus = 36901

public val ER_BUS_PROPERTY_ALREADY_EXISTS: QStatus = 36923

public val ER_BUS_PROPERTY_VALUE_NOT_SET: QStatus = 36900

public val ER_BUS_READ_ERROR: QStatus = 36865

public val ER_BUS_REMOVED_BY_BINDER: QStatus = 37109

public val ER_BUS_REMOVED_BY_BINDER_SELF: QStatus = 37160

public val ER_BUS_REPLY_IS_ERROR_MESSAGE: QStatus = 36914

public val ER_BUS_REPLY_SERIAL_MISSING: QStatus = 36889

public val ER_BUS_SECURITY_FATAL: QStatus = 36950

public val ER_BUS_SECURITY_NOT_ENABLED: QStatus = 37021

public val ER_BUS_SELF_CONNECT: QStatus = 37020

public val ER_BUS_SET_PROPERTY_REJECTED: QStatus = 36912

public val ER_BUS_SET_WRONG_SIGNATURE: QStatus = 36899

public val ER_BUS_SIGNATURE_MISMATCH: QStatus = 36961

public val ER_BUS_STOPPING: QStatus = 36962

public val ER_BUS_TIME_TO_LIVE_EXPIRED: QStatus = 36945

public val ER_BUS_TRANSPORT_ACCESS_DENIED: QStatus = 37164

public val ER_BUS_TRANSPORT_NOT_AVAILABLE: QStatus = 36957

public val ER_BUS_TRANSPORT_NOT_STARTED: QStatus = 36909

public val ER_BUS_TRUNCATED: QStatus = 36936

public val ER_BUS_UNEXPECTED_DISPOSITION: QStatus = 37014

public val ER_BUS_UNEXPECTED_SIGNATURE: QStatus = 36885

public val ER_BUS_UNKNOWN_INTERFACE: QStatus = 36883

public val ER_BUS_UNKNOWN_PATH: QStatus = 36882

public val ER_BUS_UNKNOWN_SERIAL: QStatus = 36881

public val ER_BUS_UNMATCHED_REPLY_SERIAL: QStatus = 36907

public val ER_BUS_WAIT_FAILED: QStatus = 36978

public val ER_BUS_WRITE_ERROR: QStatus = 36866

public val ER_BUS_WRITE_QUEUE_FULL: QStatus = 36919

public val ER_CERTIFICATE_NOT_FOUND: QStatus = 37166

public val ER_COMMON_ERRORS: QStatus = 4096

public val ER_CONNECTION_LIMIT_EXCEEDED: QStatus = 37152

public val ER_CONN_REFUSED: QStatus = 27

public val ER_CORRUPT_KEYBLOB: QStatus = 4115

public val ER_CRYPTO_ERROR: QStatus = 4109

public val ER_CRYPTO_HASH_UNINITIALIZED: QStatus = 4123

public val ER_CRYPTO_ILLEGAL_PARAMETERS: QStatus = 4122

public val ER_CRYPTO_INSUFFICIENT_SECURITY: QStatus = 4121

public val ER_CRYPTO_KEY_UNAVAILABLE: QStatus = 4111

public val ER_CRYPTO_KEY_UNUSABLE: QStatus = 4113

public val ER_CRYPTO_TRUNCATED: QStatus = 4110

public val ER_DBUS_RELEASE_NAME_REPLY_NON_EXISTENT: QStatus = 36987

public val ER_DBUS_RELEASE_NAME_REPLY_NOT_OWNER: QStatus = 36988

public val ER_DBUS_RELEASE_NAME_REPLY_RELEASED: QStatus = 36986

public val ER_DBUS_REQUEST_NAME_REPLY_ALREADY_OWNER: QStatus = 36985

public val ER_DBUS_REQUEST_NAME_REPLY_EXISTS: QStatus = 36984

public val ER_DBUS_REQUEST_NAME_REPLY_IN_QUEUE: QStatus = 36983

public val ER_DBUS_REQUEST_NAME_REPLY_PRIMARY_OWNER: QStatus = 36982

public val ER_DBUS_START_REPLY_ALREADY_RUNNING: QStatus = 36990

public val ER_DEADLOCK: QStatus = 31

public val ER_DEAD_THREAD: QStatus = 4117

public val ER_DIGEST_MISMATCH: QStatus = 37170

public val ER_DUPLICATE_CERTIFICATE: QStatus = 37167

public val ER_DUPLICATE_KEY: QStatus = 37171

public val ER_EMPTY_KEY_BLOB: QStatus = 4114

public val ER_END_OF_DATA: QStatus = 26

public val ER_EOF: QStatus = 30

public val ER_EXTERNAL_THREAD: QStatus = 4108

public val ER_FAIL: QStatus = 1

public val ER_FEATURE_NOT_AVAILABLE: QStatus = 37177

public val ER_INIT_FAILED: QStatus = 7

public val ER_INVALID_ADDRESS: QStatus = 20

public val ER_INVALID_APPLICATION_STATE: QStatus = 37176

public val ER_INVALID_CERTIFICATE: QStatus = 37165

public val ER_INVALID_CERTIFICATE_USAGE: QStatus = 37182

public val ER_INVALID_CERT_CHAIN: QStatus = 37174

public val ER_INVALID_CONFIG: QStatus = 37161

public val ER_INVALID_DATA: QStatus = 21

public val ER_INVALID_GUID: QStatus = 4126

public val ER_INVALID_HTTP_METHOD_USED_FOR_RENDEZVOUS_SERVER_INTERFACE_MESSAGE: QStatus = 37075

public val ER_INVALID_KEY_ENCODING: QStatus = 4116

public val ER_INVALID_ON_DEMAND_CONNECTION_MESSAGE_RESPONSE: QStatus = 37074

public val ER_INVALID_PERSISTENT_CONNECTION_MESSAGE_RESPONSE: QStatus = 37073

public val ER_INVALID_RENDEZVOUS_SERVER_INTERFACE_MESSAGE: QStatus = 37072

public val ER_INVALID_SIGNAL_EMISSION_TYPE: QStatus = 37183

public val ER_INVALID_STREAM: QStatus = 4129

public val ER_IODISPATCH_STOPPING: QStatus = 4131

public val ER_KEY_STORE_ALREADY_INITIALIZED: QStatus = 37178

public val ER_KEY_STORE_ID_NOT_YET_SET: QStatus = 37179

public val ER_LANGUAGE_NOT_SUPPORTED: QStatus = 37146

public val ER_MANAGEMENT_ALREADY_STARTED: QStatus = 37186

public val ER_MANAGEMENT_NOT_STARTED: QStatus = 37187

public val ER_MANIFEST_NOT_FOUND: QStatus = 37173

public val ER_MANIFEST_REJECTED: QStatus = 37181

public val ER_MISSING_DIGEST_IN_CERTIFICATE: QStatus = 37169

public val ER_NONE: QStatus = 65535

public val ER_NOT_CONN: QStatus = 4141

public val ER_NOT_CONNECTED_TO_RENDEZVOUS_SERVER: QStatus = 37070

public val ER_NOT_IMPLEMENTED: QStatus = 9

public val ER_NO_COMMON_TRUST: QStatus = 37172

public val ER_NO_SUCH_ALARM: QStatus = 4102

public val ER_NO_SUCH_DEVICE: QStatus = 37084

public val ER_NO_TRUST_ANCHOR: QStatus = 37175

public val ER_OK: QStatus = 0

public val ER_OPEN_FAILED: QStatus = 24

public val ER_OS_ERROR: QStatus = 4

public val ER_OUT_OF_MEMORY: QStatus = 5

public val ER_P2P: QStatus = 37085

public val ER_P2P_BUSY: QStatus = 37093

public val ER_P2P_DISABLED: QStatus = 37092

public val ER_P2P_FORBIDDEN: QStatus = 37097

public val ER_P2P_NOT_CONNECTED: QStatus = 37087

public val ER_P2P_NO_GO: QStatus = 37095

public val ER_P2P_NO_STA: QStatus = 37096

public val ER_P2P_TIMEOUT: QStatus = 37086

public val ER_PACKET_BAD_CRC: QStatus = 37039

public val ER_PACKET_BAD_FORMAT: QStatus = 37034

public val ER_PACKET_BAD_PARAMETER: QStatus = 37038

public val ER_PACKET_BUS_NO_SUCH_CHANNEL: QStatus = 37033

public val ER_PACKET_CHANNEL_FAIL: QStatus = 37036

public val ER_PACKET_CONNECT_TIMEOUT: QStatus = 37035

public val ER_PACKET_TOO_LARGE: QStatus = 37037

public val ER_PARSE_ERROR: QStatus = 25

public val ER_PERMISSION_DENIED: QStatus = 37154

public val ER_POLICY_NOT_NEWER: QStatus = 37180

public val ER_PROXIMITY_CONNECTION_ESTABLISH_FAIL: QStatus = 37089

public val ER_PROXIMITY_NO_PEERS_FOUND: QStatus = 37090

public val ER_READ_ERROR: QStatus = 22

public val ER_RENDEZVOUS_SERVER_DEACTIVATED_USER: QStatus = 37067

public val ER_RENDEZVOUS_SERVER_ERR401_UNAUTHORIZED_REQUEST: QStatus = 37078

public val ER_RENDEZVOUS_SERVER_ERR500_INTERNAL_ERROR: QStatus = 37076

public val ER_RENDEZVOUS_SERVER_ERR503_STATUS_UNAVAILABLE: QStatus = 37077

public val ER_RENDEZVOUS_SERVER_ROOT_CERTIFICATE_UNINITIALIZED: QStatus = 37080

public val ER_RENDEZVOUS_SERVER_UNKNOWN_USER: QStatus = 37068

public val ER_RENDEZVOUS_SERVER_UNRECOVERABLE_ERROR: QStatus = 37079

public val ER_SLAP_CRC_ERROR: QStatus = 4137

public val ER_SLAP_ERROR: QStatus = 4138

public val ER_SLAP_HDR_CHECKSUM_ERROR: QStatus = 4133

public val ER_SLAP_INVALID_PACKET_LEN: QStatus = 4132

public val ER_SLAP_INVALID_PACKET_TYPE: QStatus = 4134

public val ER_SLAP_LEN_MISMATCH: QStatus = 4135

public val ER_SLAP_OTHER_END_CLOSED: QStatus = 4139

public val ER_SLAP_PACKET_TYPE_MISMATCH: QStatus = 4136

public val ER_SOCKET_BIND_ERROR: QStatus = 6

public val ER_SOCK_CLOSING: QStatus = 37083

public val ER_SOCK_OTHER_END_CLOSED: QStatus = 11

public val ER_SSL_CONNECT: QStatus = 4106

public val ER_SSL_ERRORS: QStatus = 4104

public val ER_SSL_INIT: QStatus = 4105

public val ER_SSL_VERIFY: QStatus = 4107

public val ER_STOPPING_THREAD: QStatus = 4097

public val ER_TCP_MAX_UNTRUSTED: QStatus = 37144

public val ER_THREADPOOL_EXHAUSTED: QStatus = 4127

public val ER_THREADPOOL_STOPPING: QStatus = 4128

public val ER_THREAD_NO_WAIT: QStatus = 4124

public val ER_THREAD_RUNNING: QStatus = 4118

public val ER_THREAD_STOPPING: QStatus = 4119

public val ER_TIMEOUT: QStatus = 10

public val ER_TIMER_EXITING: QStatus = 4125

public val ER_TIMER_FALLBEHIND: QStatus = 4103

public val ER_TIMER_FULL: QStatus = 4130

public val ER_TIMER_NOT_ALLOWED: QStatus = 4140

public val ER_UDP_BACKPRESSURE: QStatus = 37123

public val ER_UDP_BUSHELLO: QStatus = 37129

public val ER_UDP_DEMUX_NO_ENDPOINT: QStatus = 37114

public val ER_UDP_DISCONNECT: QStatus = 37118

public val ER_UDP_EARLY_EXIT: QStatus = 37137

public val ER_UDP_ENDPOINT_NOT_STARTED: QStatus = 37149

public val ER_UDP_ENDPOINT_REMOVED: QStatus = 37150

public val ER_UDP_ENDPOINT_STALLED: QStatus = 37133

public val ER_UDP_INVALID: QStatus = 37131

public val ER_UDP_LOCAL_DISCONNECT: QStatus = 37136

public val ER_UDP_LOCAL_DISCONNECT_FAIL: QStatus = 37138

public val ER_UDP_MESSAGE: QStatus = 37130

public val ER_UDP_MSG_TOO_LONG: QStatus = 37113

public val ER_UDP_NOT_DISCONNECTED: QStatus = 37148

public val ER_UDP_NOT_IMPLEMENTED: QStatus = 37119

public val ER_UDP_NO_LISTENER: QStatus = 37120

public val ER_UDP_NO_NETWORK: QStatus = 37115

public val ER_UDP_STOPPING: QStatus = 37121

public val ER_UDP_UNEXPECTED_FLOW: QStatus = 37117

public val ER_UDP_UNEXPECTED_LENGTH: QStatus = 37116

public val ER_UDP_UNSUPPORTED: QStatus = 37132

public val ER_UNABLE_TO_CONNECT_TO_RENDEZVOUS_SERVER: QStatus = 37069

public val ER_UNABLE_TO_SEND_MESSAGE_TO_RENDEZVOUS_SERVER: QStatus = 37071

public val ER_UNKNOWN_CERTIFICATE: QStatus = 37168

public val ER_UTF_CONVERSION_FAILED: QStatus = 2

public val ER_WARNING: QStatus = 29

public val ER_WOULDBLOCK: QStatus = 8

public val ER_WRITE_ERROR: QStatus = 23

public val ER_XML_ACLS_MISSING: QStatus = 8211

public val ER_XML_ACL_ALL_TYPE_PEER_WITH_OTHERS: QStatus = 8207

public val ER_XML_ACL_PEERS_MISSING: QStatus = 8212

public val ER_XML_ACL_PEER_NOT_UNIQUE: QStatus = 8209

public val ER_XML_ACL_PEER_PUBLIC_KEY_SET: QStatus = 8210

public val ER_XML_ANNOTATION_NOT_UNIQUE: QStatus = 8222

public val ER_XML_CONVERTER_ERROR: QStatus = 8192

public val ER_XML_INTERFACE_MEMBERS_MISSING: QStatus = 8194

public val ER_XML_INTERFACE_NAME_NOT_UNIQUE: QStatus = 8219

public val ER_XML_INVALID_ACL_PEER_CHILDREN_COUNT: QStatus = 8206

public val ER_XML_INVALID_ACL_PEER_PUBLIC_KEY: QStatus = 8208

public val ER_XML_INVALID_ACL_PEER_TYPE: QStatus = 8205

public val ER_XML_INVALID_ANNOTATIONS_COUNT: QStatus = 8198

public val ER_XML_INVALID_ATTRIBUTE_VALUE: QStatus = 8200

public val ER_XML_INVALID_BASE64: QStatus = 8218

public val ER_XML_INVALID_ELEMENT_CHILDREN_COUNT: QStatus = 8202

public val ER_XML_INVALID_ELEMENT_NAME: QStatus = 8199

public val ER_XML_INVALID_INTERFACE_NAME: QStatus = 8214

public val ER_XML_INVALID_MANIFEST_VERSION: QStatus = 8216

public val ER_XML_INVALID_MEMBER_ACTION: QStatus = 8196

public val ER_XML_INVALID_MEMBER_NAME: QStatus = 8215

public val ER_XML_INVALID_MEMBER_TYPE: QStatus = 8195

public val ER_XML_INVALID_OBJECT_PATH: QStatus = 8213

public val ER_XML_INVALID_OID: QStatus = 8217

public val ER_XML_INVALID_POLICY_SERIAL_NUMBER: QStatus = 8204

public val ER_XML_INVALID_POLICY_VERSION: QStatus = 8203

public val ER_XML_INVALID_RULES_COUNT: QStatus = 8193

public val ER_XML_INVALID_SECURITY_LEVEL_ANNOTATION_VALUE: QStatus = 8201

public val ER_XML_MALFORMED: QStatus = 4099

public val ER_XML_MEMBER_DENY_ACTION_WITH_OTHER: QStatus = 8197

public val ER_XML_MEMBER_NAME_NOT_UNIQUE: QStatus = 8220

public val ER_XML_OBJECT_PATH_NOT_UNIQUE: QStatus = 8221

public val NEED_UPDATE: AlljoynApplicationstate = 3

public val NOT_CLAIMABLE: AlljoynApplicationstate = 0

public val PASSWORD_GENERATED_BY_APPLICATION: AlljoynClaimcapabilityadditionalinfoMasks = 2

public val PASSWORD_GENERATED_BY_SECURITY_MANAGER: AlljoynClaimcapabilityadditionalinfoMasks = 1

public val QCC_FALSE: UInt = 0u

public val QCC_TRUE: UInt = 1u

public val UNANNOUNCED: AlljoynAboutAnnounceflag = 0
