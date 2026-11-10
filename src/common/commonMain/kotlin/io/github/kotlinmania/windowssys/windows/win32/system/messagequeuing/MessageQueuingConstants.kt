package io.github.kotlinmania.windowssys.windows.win32.system.messagequeuing

import io.github.kotlinmania.windowssys.U128
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.w

public val DEFAULT_M_ACKNOWLEDGE: Mqdefault = 0

public val DEFAULT_M_APPSPECIFIC: Mqdefault = 0

public val DEFAULT_M_AUTH_LEVEL: Mqdefault = 0

public val DEFAULT_M_DELIVERY: Mqdefault = 0

public val DEFAULT_M_JOURNAL: Mqdefault = 0

public val DEFAULT_M_LOOKUPID: Mqdefault = 0

public val DEFAULT_M_PRIORITY: Mqdefault = 3

public val DEFAULT_M_PRIV_LEVEL: Mqdefault = 0

public val DEFAULT_M_SENDERID_TYPE: Mqdefault = 1

public val DEFAULT_Q_AUTHENTICATE: Mqdefault = 0

public val DEFAULT_Q_BASEPRIORITY: Mqdefault = 0

public val DEFAULT_Q_JOURNAL: Mqdefault = 0

public val DEFAULT_Q_JOURNAL_QUOTA: Mqdefault = -1

public val DEFAULT_Q_PRIV_LEVEL: Mqdefault = 1

public val DEFAULT_Q_QUOTA: Mqdefault = -1

public val DEFAULT_Q_TRANSACTION: Mqdefault = 0

public val LONG_LIVED: UInt = 4294967294u

public val MACHINE_ACTION_CONNECT: Pcwstr = w("CONNECT")

public val MACHINE_ACTION_DISCONNECT: Pcwstr = w("DISCONNECT")

public val MACHINE_ACTION_TIDY: Pcwstr = w("TIDY")

public val MGMT_QUEUE_CORRECT_TYPE: Pcwstr = w("YES")

public val MGMT_QUEUE_FOREIGN_TYPE: Pcwstr = w("YES")

public val MGMT_QUEUE_INCORRECT_TYPE: Pcwstr = w("NO")

public val MGMT_QUEUE_LOCAL_LOCATION: Pcwstr = w("LOCAL")

public val MGMT_QUEUE_NOT_FOREIGN_TYPE: Pcwstr = w("NO")

public val MGMT_QUEUE_NOT_TRANSACTIONAL_TYPE: Pcwstr = w("NO")

public val MGMT_QUEUE_REMOTE_LOCATION: Pcwstr = w("REMOTE")

public val MGMT_QUEUE_STATE_CONNECTED: Pcwstr = w("CONNECTED")

public val MGMT_QUEUE_STATE_DISCONNECTED: Pcwstr = w("DISCONNECTED")

public val MGMT_QUEUE_STATE_DISCONNECTING: Pcwstr = w("DISCONNECTING")

public val MGMT_QUEUE_STATE_LOCAL: Pcwstr = w("LOCAL CONNECTION")

public val MGMT_QUEUE_STATE_LOCKED: Pcwstr = w("LOCKED")

public val MGMT_QUEUE_STATE_NEED_VALIDATE: Pcwstr = w("NEED VALIDATION")

public val MGMT_QUEUE_STATE_NONACTIVE: Pcwstr = w("INACTIVE")

public val MGMT_QUEUE_STATE_ONHOLD: Pcwstr = w("ONHOLD")

public val MGMT_QUEUE_STATE_WAITING: Pcwstr = w("WAITING")

public val MGMT_QUEUE_TRANSACTIONAL_TYPE: Pcwstr = w("YES")

public val MGMT_QUEUE_TYPE_CONNECTOR: Pcwstr = w("CONNECTOR")

public val MGMT_QUEUE_TYPE_MACHINE: Pcwstr = w("MACHINE")

public val MGMT_QUEUE_TYPE_MULTICAST: Pcwstr = w("MULTICAST")

public val MGMT_QUEUE_TYPE_PRIVATE: Pcwstr = w("PRIVATE")

public val MGMT_QUEUE_TYPE_PUBLIC: Pcwstr = w("PUBLIC")

public val MGMT_QUEUE_UNKNOWN_TYPE: Pcwstr = w("UNKNOWN")

public val MO_MACHINE_TOKEN: Pcwstr = w("MACHINE")

public val MO_QUEUE_TOKEN: Pcwstr = w("QUEUE")

public val MQCERT_REGISTER_ALWAYS: MqcertRegister = 1

public val MQCERT_REGISTER_IF_NOT_EXIST: MqcertRegister = 2

public val MQCONN_BIND_SOCKET_FAILURE: MQConnectionState = -2147483645

public val MQCONN_CONNECT_SOCKET_FAILURE: MQConnectionState = -2147483644

public val MQCONN_CREATE_SOCKET_FAILURE: MQConnectionState = -2147483646

public val MQCONN_ESTABLISH_PACKET_RECEIVED: MQConnectionState = 1

public val MQCONN_INVALID_SERVER_CERT: MQConnectionState = -2147483639

public val MQCONN_LIMIT_REACHED: MQConnectionState = -2147483638

public val MQCONN_NAME_RESOLUTION_FAILURE: MQConnectionState = -2147483640

public val MQCONN_NOFAILURE: MQConnectionState = 0

public val MQCONN_NOT_READY: MQConnectionState = -2147483641

public val MQCONN_OUT_OF_MEMORY: MQConnectionState = -2147483635

public val MQCONN_PING_FAILURE: MQConnectionState = -2147483647

public val MQCONN_READY: MQConnectionState = 2

public val MQCONN_REFUSED_BY_OTHER_SIDE: MQConnectionState = -2147483637

public val MQCONN_ROUTING_FAILURE: MQConnectionState = -2147483636

public val MQCONN_SEND_FAILURE: MQConnectionState = -2147483642

public val MQCONN_TCP_NOT_ENABLED: MQConnectionState = -2147483643

public val MQCONN_UNKNOWN_FAILURE: MQConnectionState = -2147483648.toInt()

public val MQMSG_ACKNOWLEDGMENT_FULL_REACH_QUEUE: Mqmsgacknowledgement = 5

public val MQMSG_ACKNOWLEDGMENT_FULL_RECEIVE: Mqmsgacknowledgement = 14

public val MQMSG_ACKNOWLEDGMENT_NACK_REACH_QUEUE: Mqmsgacknowledgement = 4

public val MQMSG_ACKNOWLEDGMENT_NACK_RECEIVE: Mqmsgacknowledgement = 12

public val MQMSG_ACKNOWLEDGMENT_NEG_ARRIVAL: Mqmsgacknowledgement = 4

public val MQMSG_ACKNOWLEDGMENT_NEG_RECEIVE: Mqmsgacknowledgement = 8

public val MQMSG_ACKNOWLEDGMENT_NONE: Mqmsgacknowledgement = 0

public val MQMSG_ACKNOWLEDGMENT_POS_ARRIVAL: Mqmsgacknowledgement = 1

public val MQMSG_ACKNOWLEDGMENT_POS_RECEIVE: Mqmsgacknowledgement = 2

public val MQMSG_AUTHENTICATED_QM_MESSAGE: UInt = 11u

public val MQMSG_AUTHENTICATED_SIG10: Mqmsgauthentication = 1

public val MQMSG_AUTHENTICATED_SIG20: Mqmsgauthentication = 3

public val MQMSG_AUTHENTICATED_SIG30: Mqmsgauthentication = 5

public val MQMSG_AUTHENTICATED_SIGXML: Mqmsgauthentication = 9

public val MQMSG_AUTHENTICATION_NOT_REQUESTED: Mqmsgauthentication = 0

public val MQMSG_AUTHENTICATION_REQUESTED: Mqmsgauthentication = 1

public val MQMSG_AUTHENTICATION_REQUESTED_EX: Mqmsgauthentication = 3

public val MQMSG_AUTH_LEVEL_ALWAYS: Mqmsgauthlevel = 1

public val MQMSG_AUTH_LEVEL_MSMQ10: Mqmsgauthlevel = 2

public val MQMSG_AUTH_LEVEL_MSMQ20: Mqmsgauthlevel = 4

public val MQMSG_AUTH_LEVEL_NONE: Mqmsgauthlevel = 0

public val MQMSG_AUTH_LEVEL_SIG10: Mqmsgauthlevel = 2

public val MQMSG_AUTH_LEVEL_SIG20: Mqmsgauthlevel = 4

public val MQMSG_AUTH_LEVEL_SIG30: Mqmsgauthlevel = 8

public val MQMSG_CALG_DES: Mqcalg = 26113

public val MQMSG_CALG_DSS_SIGN: Mqcalg = 8704

public val MQMSG_CALG_MAC: Mqcalg = 32773

public val MQMSG_CALG_MD2: Mqcalg = 32769

public val MQMSG_CALG_MD4: Mqcalg = 32770

public val MQMSG_CALG_MD5: Mqcalg = 32771

public val MQMSG_CALG_RC2: Mqcalg = 26114

public val MQMSG_CALG_RC4: Mqcalg = 26625

public val MQMSG_CALG_RSA_KEYX: Mqcalg = 41984

public val MQMSG_CALG_RSA_SIGN: Mqcalg = 9216

public val MQMSG_CALG_SEAL: Mqcalg = 26626

public val MQMSG_CALG_SHA: Mqcalg = 32772

public val MQMSG_CALG_SHA1: Mqcalg = 32772

public val MQMSG_CLASS_ACK_REACH_QUEUE: Mqmsgclass = 2

public val MQMSG_CLASS_ACK_RECEIVE: Mqmsgclass = 16384

public val MQMSG_CLASS_NACK_ACCESS_DENIED: Mqmsgclass = 32772

public val MQMSG_CLASS_NACK_BAD_DST_Q: Mqmsgclass = 32768

public val MQMSG_CLASS_NACK_BAD_ENCRYPTION: Mqmsgclass = 32775

public val MQMSG_CLASS_NACK_BAD_SIGNATURE: Mqmsgclass = 32774

public val MQMSG_CLASS_NACK_COULD_NOT_ENCRYPT: Mqmsgclass = 32776

public val MQMSG_CLASS_NACK_HOP_COUNT_EXCEEDED: Mqmsgclass = 32773

public val MQMSG_CLASS_NACK_NOT_TRANSACTIONAL_MSG: Mqmsgclass = 32778

public val MQMSG_CLASS_NACK_NOT_TRANSACTIONAL_Q: Mqmsgclass = 32777

public val MQMSG_CLASS_NACK_PURGED: Mqmsgclass = 32769

public val MQMSG_CLASS_NACK_Q_DELETED: Mqmsgclass = 49152

public val MQMSG_CLASS_NACK_Q_EXCEED_QUOTA: Mqmsgclass = 32771

public val MQMSG_CLASS_NACK_Q_PURGED: Mqmsgclass = 49153

public val MQMSG_CLASS_NACK_REACH_QUEUE_TIMEOUT: Mqmsgclass = 32770

public val MQMSG_CLASS_NACK_RECEIVE_TIMEOUT: Mqmsgclass = 49154

public val MQMSG_CLASS_NACK_RECEIVE_TIMEOUT_AT_SENDER: Mqmsgclass = 49155

public val MQMSG_CLASS_NACK_SOURCE_COMPUTER_GUID_CHANGED: Mqmsgclass = 32780

public val MQMSG_CLASS_NACK_UNSUPPORTED_CRYPTO_PROVIDER: Mqmsgclass = 32779

public val MQMSG_CLASS_NORMAL: Mqmsgclass = 0

public val MQMSG_CLASS_REPORT: Mqmsgclass = 1

public val MQMSG_CORRELATIONID_SIZE: Mqmsgidsize = 20

public val MQMSG_CURRENT: Mqmsgcursor = 1

public val MQMSG_DEADLETTER: Mqmsgjournal = 1

public val MQMSG_DELIVERY_EXPRESS: Mqmsgdelivery = 0

public val MQMSG_DELIVERY_RECOVERABLE: Mqmsgdelivery = 1

public val MQMSG_FIRST: Mqmsgcursor = 0

public val MQMSG_FIRST_IN_XACT: UInt = 1u

public val MQMSG_JOURNAL: Mqmsgjournal = 2

public val MQMSG_JOURNAL_NONE: Mqmsgjournal = 0

public val MQMSG_LAST_IN_XACT: UInt = 1u

public val MQMSG_MSGID_SIZE: Mqmsgidsize = 20

public val MQMSG_NEXT: Mqmsgcursor = 2

public val MQMSG_NOT_FIRST_IN_XACT: UInt = 0u

public val MQMSG_NOT_LAST_IN_XACT: UInt = 0u

public val MQMSG_PRIV_LEVEL_BODY_AES: UInt = 5u

public val MQMSG_PRIV_LEVEL_BODY_BASE: Mqmsgprivlevel = 1

public val MQMSG_PRIV_LEVEL_BODY_ENHANCED: Mqmsgprivlevel = 3

public val MQMSG_PRIV_LEVEL_NONE: Mqmsgprivlevel = 0

public val MQMSG_SENDERID_TYPE_NONE: Mqmsgsenderidtype = 0

public val MQMSG_SENDERID_TYPE_SID: Mqmsgsenderidtype = 1

public val MQMSG_SEND_ROUTE_TO_REPORT_QUEUE: Mqmsgtrace = 1

public val MQMSG_TRACE_NONE: Mqmsgtrace = 0

public val MQMSG_XACTID_SIZE: Mqmsgidsize = 20

public val MQSEC_CHANGE_QUEUE_PERMISSIONS: Mqqueueaccessmask = 262144u

public val MQSEC_DELETE_JOURNAL_MESSAGE: Mqqueueaccessmask = 8u

public val MQSEC_DELETE_MESSAGE: Mqqueueaccessmask = 1u

public val MQSEC_DELETE_QUEUE: Mqqueueaccessmask = 65536u

public val MQSEC_GET_QUEUE_PERMISSIONS: Mqqueueaccessmask = 131072u

public val MQSEC_GET_QUEUE_PROPERTIES: Mqqueueaccessmask = 32u

public val MQSEC_PEEK_MESSAGE: Mqqueueaccessmask = 2u

public val MQSEC_QUEUE_GENERIC_ALL: Mqqueueaccessmask = 983103u

public val MQSEC_QUEUE_GENERIC_EXECUTE: Mqqueueaccessmask = 0u

public val MQSEC_QUEUE_GENERIC_READ: Mqqueueaccessmask = 131115u

public val MQSEC_QUEUE_GENERIC_WRITE: Mqqueueaccessmask = 131108u

public val MQSEC_RECEIVE_JOURNAL_MESSAGE: Mqqueueaccessmask = 10u

public val MQSEC_RECEIVE_MESSAGE: Mqqueueaccessmask = 3u

public val MQSEC_SET_QUEUE_PROPERTIES: Mqqueueaccessmask = 16u

public val MQSEC_TAKE_QUEUE_OWNERSHIP: Mqqueueaccessmask = 524288u

public val MQSEC_WRITE_MESSAGE: Mqqueueaccessmask = 4u

public val MQ_ACTION_PEEK_CURRENT: UInt = 2147483648u

public val MQ_ACTION_PEEK_NEXT: UInt = 2147483649u

public val MQ_ACTION_RECEIVE: UInt = 0u

public val MQ_ADMIN_ACCESS: Mqaccess = 128

public val MQ_AUTHENTICATE: Mqauthenticate = 1

public val MQ_AUTHENTICATE_NONE: Mqauthenticate = 0

public val MQ_CORRUPTED_QUEUE_WAS_DELETED: Mqerror = -1072824216

public val MQ_DENY_NONE: Mqshare = 0

public val MQ_DENY_RECEIVE_SHARE: Mqshare = 1

public val MQ_ERROR: Mqerror = -1072824319

public val MQ_ERROR_ACCESS_DENIED: Mqerror = -1072824283

public val MQ_ERROR_BAD_SECURITY_CONTEXT: Mqerror = -1072824267

public val MQ_ERROR_BAD_XML_FORMAT: Mqerror = -1072824174

public val MQ_ERROR_BUFFER_OVERFLOW: Mqerror = -1072824294

public val MQ_ERROR_CANNOT_CREATE_CERT_STORE: Mqerror = -1072824209

public val MQ_ERROR_CANNOT_CREATE_HASH_EX: Mqerror = -1072824191

public val MQ_ERROR_CANNOT_CREATE_ON_GC: Mqerror = -1072824201

public val MQ_ERROR_CANNOT_CREATE_PSC_OBJECTS: Mqerror = -1072824171

public val MQ_ERROR_CANNOT_DELETE_PSC_OBJECTS: Mqerror = -1072824189

public val MQ_ERROR_CANNOT_GET_DN: Mqerror = -1072824194

public val MQ_ERROR_CANNOT_GRANT_ADD_GUID: Mqerror = -1072824206

public val MQ_ERROR_CANNOT_HASH_DATA_EX: Mqerror = -1072824193

public val MQ_ERROR_CANNOT_IMPERSONATE_CLIENT: Mqerror = -1072824284

public val MQ_ERROR_CANNOT_JOIN_DOMAIN: Mqerror = -1072824202

public val MQ_ERROR_CANNOT_LOAD_MQAD: Mqerror = -1072824187

public val MQ_ERROR_CANNOT_LOAD_MQDSSRV: Mqerror = -1072824186

public val MQ_ERROR_CANNOT_LOAD_MSMQOCM: Mqerror = -1072824205

public val MQ_ERROR_CANNOT_OPEN_CERT_STORE: Mqerror = -1072824208

public val MQ_ERROR_CANNOT_SET_CRYPTO_SEC_DESCR: Mqerror = -1072824212

public val MQ_ERROR_CANNOT_SIGN_DATA_EX: Mqerror = -1072824192

public val MQ_ERROR_CANNOT_UPDATE_PSC_OBJECTS: Mqerror = -1072824170

public val MQ_ERROR_CANT_CREATE_CERT_STORE: Mqerror = -1072824209

public val MQ_ERROR_CANT_OPEN_CERT_STORE: Mqerror = -1072824208

public val MQ_ERROR_CANT_RESOLVE_SITES: Mqerror = -1072824183

public val MQ_ERROR_CERTIFICATE_NOT_PROVIDED: Mqerror = -1072824211

public val MQ_ERROR_COMPUTER_DOES_NOT_SUPPORT_ENCRYPTION: Mqerror = -1072824269

public val MQ_ERROR_CORRUPTED_INTERNAL_CERTIFICATE: Mqerror = -1072824275

public val MQ_ERROR_CORRUPTED_PERSONAL_CERT_STORE: Mqerror = -1072824271

public val MQ_ERROR_CORRUPTED_SECURITY_DATA: Mqerror = -1072824272

public val MQ_ERROR_COULD_NOT_GET_ACCOUNT_INFO: Mqerror = -1072824265

public val MQ_ERROR_COULD_NOT_GET_USER_SID: Mqerror = -1072824266

public val MQ_ERROR_DELETE_CN_IN_USE: Mqerror = -1072824248

public val MQ_ERROR_DEPEND_WKS_LICENSE_OVERFLOW: Mqerror = -1072824217

public val MQ_ERROR_DS_BIND_ROOT_FOREST: Mqerror = -1072824177

public val MQ_ERROR_DS_ERROR: Mqerror = -1072824253

public val MQ_ERROR_DS_IS_FULL: Mqerror = -1072824254

public val MQ_ERROR_DS_LOCAL_USER: Mqerror = -1072824176

public val MQ_ERROR_DTC_CONNECT: Mqerror = -1072824244

public val MQ_ERROR_ENCRYPTION_PROVIDER_NOT_SUPPORTED: Mqerror = -1072824213

public val MQ_ERROR_FAIL_VERIFY_SIGNATURE_EX: Mqerror = -1072824190

public val MQ_ERROR_FORMATNAME_BUFFER_TOO_SMALL: Mqerror = -1072824289

public val MQ_ERROR_GC_NEEDED: Mqerror = -1072824178

public val MQ_ERROR_GUID_NOT_MATCHING: Mqerror = -1072824200

public val MQ_ERROR_ILLEGAL_CONTEXT: Mqerror = -1072824229

public val MQ_ERROR_ILLEGAL_CURSOR_ACTION: Mqerror = -1072824292

public val MQ_ERROR_ILLEGAL_ENTERPRISE_OPERATION: Mqerror = -1072824207

public val MQ_ERROR_ILLEGAL_FORMATNAME: Mqerror = -1072824290

public val MQ_ERROR_ILLEGAL_MQCOLUMNS: Mqerror = -1072824264

public val MQ_ERROR_ILLEGAL_MQPRIVATEPROPS: Mqerror = -1072824197

public val MQ_ERROR_ILLEGAL_MQQMPROPS: Mqerror = -1072824255

public val MQ_ERROR_ILLEGAL_MQQUEUEPROPS: Mqerror = -1072824259

public val MQ_ERROR_ILLEGAL_OPERATION: Mqerror = -1072824220

public val MQ_ERROR_ILLEGAL_PROPERTY_SIZE: Mqerror = -1072824261

public val MQ_ERROR_ILLEGAL_PROPERTY_VALUE: Mqerror = -1072824296

public val MQ_ERROR_ILLEGAL_PROPERTY_VT: Mqerror = -1072824295

public val MQ_ERROR_ILLEGAL_PROPID: Mqerror = -1072824263

public val MQ_ERROR_ILLEGAL_QUEUE_PATHNAME: Mqerror = -1072824300

public val MQ_ERROR_ILLEGAL_RELATION: Mqerror = -1072824262

public val MQ_ERROR_ILLEGAL_RESTRICTION_PROPID: Mqerror = -1072824260

public val MQ_ERROR_ILLEGAL_SECURITY_DESCRIPTOR: Mqerror = -1072824287

public val MQ_ERROR_ILLEGAL_SORT: Mqerror = -1072824304

public val MQ_ERROR_ILLEGAL_SORT_PROPID: Mqerror = -1072824228

public val MQ_ERROR_ILLEGAL_USER: Mqerror = -1072824303

public val MQ_ERROR_INSUFFICIENT_PROPERTIES: Mqerror = -1072824257

public val MQ_ERROR_INSUFFICIENT_RESOURCES: Mqerror = -1072824281

public val MQ_ERROR_INTERNAL_USER_CERT_EXIST: Mqerror = -1072824274

public val MQ_ERROR_INVALID_CERTIFICATE: Mqerror = -1072824276

public val MQ_ERROR_INVALID_HANDLE: Mqerror = -1072824313

public val MQ_ERROR_INVALID_OWNER: Mqerror = -1072824252

public val MQ_ERROR_INVALID_PARAMETER: Mqerror = -1072824314

public val MQ_ERROR_IO_TIMEOUT: Mqerror = -1072824293

public val MQ_ERROR_LABEL_BUFFER_TOO_SMALL: Mqerror = -1072824226

public val MQ_ERROR_LABEL_TOO_LONG: Mqerror = -1072824227

public val MQ_ERROR_MACHINE_EXISTS: Mqerror = -1072824256

public val MQ_ERROR_MACHINE_NOT_FOUND: Mqerror = -1072824307

public val MQ_ERROR_MESSAGE_ALREADY_RECEIVED: Mqerror = -1072824291

public val MQ_ERROR_MESSAGE_LOCKED_UNDER_TRANSACTION: Hresult = 0xC00E009Cu.toInt()

public val MQ_ERROR_MESSAGE_NOT_AUTHENTICATED: Hresult = 0xC00E009Bu.toInt()

public val MQ_ERROR_MESSAGE_NOT_FOUND: Mqerror = -1072824184

public val MQ_ERROR_MESSAGE_STORAGE_FAILED: Mqerror = -1072824278

public val MQ_ERROR_MISSING_CONNECTOR_TYPE: Mqerror = -1072824235

public val MQ_ERROR_MQIS_READONLY_MODE: Mqerror = -1072824224

public val MQ_ERROR_MQIS_SERVER_EMPTY: Mqerror = -1072824225

public val MQ_ERROR_MULTI_SORT_KEYS: Mqerror = -1072824179

public val MQ_ERROR_NOT_A_CORRECT_OBJECT_CLASS: Mqerror = -1072824180

public val MQ_ERROR_NOT_SUPPORTED_BY_DEPENDENT_CLIENTS: Mqerror = -1072824182

public val MQ_ERROR_NO_DS: Mqerror = -1072824301

public val MQ_ERROR_NO_ENTRY_POINT_MSMQOCM: Mqerror = -1072824204

public val MQ_ERROR_NO_GC_IN_DOMAIN: Mqerror = -1072824196

public val MQ_ERROR_NO_INTERNAL_USER_CERT: Mqerror = -1072824273

public val MQ_ERROR_NO_MQUSER_OU: Mqerror = -1072824188

public val MQ_ERROR_NO_MSMQ_SERVERS_ON_DC: Mqerror = -1072824203

public val MQ_ERROR_NO_MSMQ_SERVERS_ON_GC: Mqerror = -1072824195

public val MQ_ERROR_NO_RESPONSE_FROM_OBJECT_SERVER: Mqerror = -1072824247

public val MQ_ERROR_OBJECT_SERVER_NOT_AVAILABLE: Mqerror = -1072824246

public val MQ_ERROR_OPERATION_CANCELLED: Mqerror = -1072824312

public val MQ_ERROR_OPERATION_NOT_SUPPORTED_BY_REMOTE_COMPUTER: Mqerror = -1072824181

public val MQ_ERROR_PRIVILEGE_NOT_HELD: Mqerror = -1072824282

public val MQ_ERROR_PROPERTIES_CONFLICT: Mqerror = -1072824185

public val MQ_ERROR_PROPERTY: Mqerror = -1072824318

public val MQ_ERROR_PROPERTY_NOTALLOWED: Mqerror = -1072824258

public val MQ_ERROR_PROV_NAME_BUFFER_TOO_SMALL: Mqerror = -1072824221

public val MQ_ERROR_PUBLIC_KEY_DOES_NOT_EXIST: Mqerror = -1072824198

public val MQ_ERROR_PUBLIC_KEY_NOT_FOUND: Mqerror = -1072824199

public val MQ_ERROR_QUEUE_DELETED: Mqerror = -1072824230

public val MQ_ERROR_QUEUE_EXISTS: Mqerror = -1072824315

public val MQ_ERROR_QUEUE_NOT_ACTIVE: Mqerror = -1072824316

public val MQ_ERROR_QUEUE_NOT_AVAILABLE: Mqerror = -1072824245

public val MQ_ERROR_QUEUE_NOT_FOUND: Mqerror = -1072824317

public val MQ_ERROR_Q_ADS_PROPERTY_NOT_SUPPORTED: Mqerror = -1072824175

public val MQ_ERROR_Q_DNS_PROPERTY_NOT_SUPPORTED: Mqerror = -1072824210

public val MQ_ERROR_REMOTE_MACHINE_NOT_AVAILABLE: Mqerror = -1072824215

public val MQ_ERROR_RESOLVE_ADDRESS: Hresult = 0xC00E0099u.toInt()

public val MQ_ERROR_RESULT_BUFFER_TOO_SMALL: Mqerror = -1072824250

public val MQ_ERROR_SECURITY_DESCRIPTOR_TOO_SMALL: Mqerror = -1072824285

public val MQ_ERROR_SENDERID_BUFFER_TOO_SMALL: Mqerror = -1072824286

public val MQ_ERROR_SENDER_CERT_BUFFER_TOO_SMALL: Mqerror = -1072824277

public val MQ_ERROR_SERVICE_NOT_AVAILABLE: Mqerror = -1072824309

public val MQ_ERROR_SHARING_VIOLATION: Mqerror = -1072824311

public val MQ_ERROR_SIGNATURE_BUFFER_TOO_SMALL: Mqerror = -1072824222

public val MQ_ERROR_STALE_HANDLE: Mqerror = -1072824234

public val MQ_ERROR_SYMM_KEY_BUFFER_TOO_SMALL: Mqerror = -1072824223

public val MQ_ERROR_TOO_MANY_PROPERTIES: Hresult = 0xC00E009Au.toInt()

public val MQ_ERROR_TRANSACTION_ENLIST: Mqerror = -1072824232

public val MQ_ERROR_TRANSACTION_IMPORT: Mqerror = -1072824242

public val MQ_ERROR_TRANSACTION_SEQUENCE: Mqerror = -1072824239

public val MQ_ERROR_TRANSACTION_USAGE: Mqerror = -1072824240

public val MQ_ERROR_UNINITIALIZED_OBJECT: Mqerror = -1072824172

public val MQ_ERROR_UNSUPPORTED_ACCESS_MODE: Mqerror = -1072824251

public val MQ_ERROR_UNSUPPORTED_CLASS: Mqerror = -1072824173

public val MQ_ERROR_UNSUPPORTED_FORMATNAME_OPERATION: Mqerror = -1072824288

public val MQ_ERROR_UNSUPPORTED_OPERATION: Mqerror = -1072824214

public val MQ_ERROR_USER_BUFFER_TOO_SMALL: Mqerror = -1072824280

public val MQ_ERROR_WKS_CANT_SERVE_CLIENT: Mqerror = -1072824218

public val MQ_ERROR_WRITE_NOT_ALLOWED: Mqerror = -1072824219

public val MQ_INFORMATION_DUPLICATE_PROPERTY: Mqwarning = 1074659333

public val MQ_INFORMATION_FORMATNAME_BUFFER_TOO_SMALL: Mqwarning = 1074659337

public val MQ_INFORMATION_ILLEGAL_PROPERTY: Mqwarning = 1074659330

public val MQ_INFORMATION_INTERNAL_USER_CERT_EXIST: Mqwarning = 1074659338

public val MQ_INFORMATION_OPERATION_PENDING: Mqwarning = 1074659334

public val MQ_INFORMATION_OWNER_IGNORED: Mqwarning = 1074659339

public val MQ_INFORMATION_PROPERTY: Mqwarning = 1074659329

public val MQ_INFORMATION_PROPERTY_IGNORED: Mqwarning = 1074659331

public val MQ_INFORMATION_UNSUPPORTED_PROPERTY: Mqwarning = 1074659332

public val MQ_JOURNAL: Mqjournal = 1

public val MQ_JOURNAL_NONE: Mqjournal = 0

public val MQ_LOOKUP_PEEK_CURRENT: UInt = 1073741840u

public val MQ_LOOKUP_PEEK_FIRST: UInt = 1073741844u

public val MQ_LOOKUP_PEEK_LAST: UInt = 1073741848u

public val MQ_LOOKUP_PEEK_NEXT: UInt = 1073741841u

public val MQ_LOOKUP_PEEK_PREV: UInt = 1073741842u

public val MQ_LOOKUP_RECEIVE_ALLOW_PEEK: UInt = 1073742112u

public val MQ_LOOKUP_RECEIVE_CURRENT: UInt = 1073741856u

public val MQ_LOOKUP_RECEIVE_FIRST: UInt = 1073741860u

public val MQ_LOOKUP_RECEIVE_LAST: UInt = 1073741864u

public val MQ_LOOKUP_RECEIVE_NEXT: UInt = 1073741857u

public val MQ_LOOKUP_RECEIVE_PREV: UInt = 1073741858u

public val MQ_MAX_MSG_LABEL_LEN: Mqmsgmax = 249

public val MQ_MAX_PRIORITY: Mqpriority = 7

public val MQ_MAX_Q_LABEL_LEN: Mqmax = 124

public val MQ_MAX_Q_NAME_LEN: Mqmax = 124

public val MQ_MIN_PRIORITY: Mqpriority = 0

public val MQ_MOVE_ACCESS: UInt = 4u

public val MQ_MTS_TRANSACTION: Mqtransaction = 1

public val MQ_NO_TRANSACTION: Mqtransaction = 0

public val MQ_OK: Hresult = 0x0u.toInt()

public val MQ_PEEK_ACCESS: Mqaccess = 32

public val MQ_PRIV_LEVEL_BODY: Mqprivlevel = 2

public val MQ_PRIV_LEVEL_NONE: Mqprivlevel = 0

public val MQ_PRIV_LEVEL_OPTIONAL: Mqprivlevel = 1

public val MQ_QUEUE_STATE_CONNECTED: QueueState = 6

public val MQ_QUEUE_STATE_DISCONNECTED: QueueState = 1

public val MQ_QUEUE_STATE_DISCONNECTING: QueueState = 7

public val MQ_QUEUE_STATE_LOCAL_CONNECTION: QueueState = 0

public val MQ_QUEUE_STATE_LOCKED: QueueState = 8

public val MQ_QUEUE_STATE_NEEDVALIDATE: QueueState = 3

public val MQ_QUEUE_STATE_NONACTIVE: QueueState = 5

public val MQ_QUEUE_STATE_ONHOLD: QueueState = 4

public val MQ_QUEUE_STATE_WAITING: QueueState = 2

public val MQ_RECEIVE_ACCESS: Mqaccess = 1

public val MQ_SEND_ACCESS: Mqaccess = 2

public val MQ_SINGLE_MESSAGE: Mqtransaction = 3

public val MQ_STATUS_FOREIGN: ForeignStatus = 0

public val MQ_STATUS_NOT_FOREIGN: ForeignStatus = 1

public val MQ_STATUS_UNKNOWN: ForeignStatus = 2

public val MQ_TRANSACTIONAL: Mqtransactional = 1

public val MQ_TRANSACTIONAL_NONE: Mqtransactional = 0

public val MQ_TYPE_CONNECTOR: QueueType = 3

public val MQ_TYPE_MACHINE: QueueType = 2

public val MQ_TYPE_MULTICAST: QueueType = 4

public val MQ_TYPE_PRIVATE: QueueType = 1

public val MQ_TYPE_PUBLIC: QueueType = 0

public val MQ_XACT_STATUS_NOT_XACT: XactStatus = 1

public val MQ_XACT_STATUS_UNKNOWN: XactStatus = 2

public val MQ_XACT_STATUS_XACT: XactStatus = 0

public val MQ_XA_TRANSACTION: Mqtransaction = 2

public val MSMQ_CONNECTED: Pcwstr = w("CONNECTED")

public val MSMQ_DISCONNECTED: Pcwstr = w("DISCONNECTED")

public val PREQ: UInt = 4u

public val PRGE: UInt = 3u

public val PRGT: UInt = 2u

public val PRLE: UInt = 1u

public val PRLT: UInt = 0u

public val PRNE: UInt = 5u

public val PROPID_MGMT_MSMQ_ACTIVEQUEUES: UInt = 1u

public val PROPID_MGMT_MSMQ_BASE: UInt = 0u

public val PROPID_MGMT_MSMQ_BYTES_IN_ALL_QUEUES: UInt = 6u

public val PROPID_MGMT_MSMQ_CONNECTED: UInt = 4u

public val PROPID_MGMT_MSMQ_DSSERVER: UInt = 3u

public val PROPID_MGMT_MSMQ_PRIVATEQ: UInt = 2u

public val PROPID_MGMT_MSMQ_TYPE: UInt = 5u

public val PROPID_MGMT_QUEUE_BASE: UInt = 0u

public val PROPID_MGMT_QUEUE_BYTES_IN_JOURNAL: UInt = 10u

public val PROPID_MGMT_QUEUE_BYTES_IN_QUEUE: UInt = 8u

public val PROPID_MGMT_QUEUE_CONNECTION_HISTORY: UInt = 25u

public val PROPID_MGMT_QUEUE_EOD_FIRST_NON_ACK: UInt = 16u

public val PROPID_MGMT_QUEUE_EOD_LAST_ACK: UInt = 13u

public val PROPID_MGMT_QUEUE_EOD_LAST_ACK_COUNT: UInt = 15u

public val PROPID_MGMT_QUEUE_EOD_LAST_ACK_TIME: UInt = 14u

public val PROPID_MGMT_QUEUE_EOD_LAST_NON_ACK: UInt = 17u

public val PROPID_MGMT_QUEUE_EOD_NEXT_SEQ: UInt = 18u

public val PROPID_MGMT_QUEUE_EOD_NO_ACK_COUNT: UInt = 20u

public val PROPID_MGMT_QUEUE_EOD_NO_READ_COUNT: UInt = 19u

public val PROPID_MGMT_QUEUE_EOD_RESEND_COUNT: UInt = 23u

public val PROPID_MGMT_QUEUE_EOD_RESEND_INTERVAL: UInt = 22u

public val PROPID_MGMT_QUEUE_EOD_RESEND_TIME: UInt = 21u

public val PROPID_MGMT_QUEUE_EOD_SOURCE_INFO: UInt = 24u

public val PROPID_MGMT_QUEUE_FOREIGN: UInt = 6u

public val PROPID_MGMT_QUEUE_FORMATNAME: UInt = 2u

public val PROPID_MGMT_QUEUE_JOURNAL_MESSAGE_COUNT: UInt = 9u

public val PROPID_MGMT_QUEUE_JOURNAL_USED_QUOTA: UInt = 10u

public val PROPID_MGMT_QUEUE_LOCATION: UInt = 4u

public val PROPID_MGMT_QUEUE_MESSAGE_COUNT: UInt = 7u

public val PROPID_MGMT_QUEUE_NEXTHOPS: UInt = 12u

public val PROPID_MGMT_QUEUE_PATHNAME: UInt = 1u

public val PROPID_MGMT_QUEUE_STATE: UInt = 11u

public val PROPID_MGMT_QUEUE_SUBQUEUE_COUNT: UInt = 26u

public val PROPID_MGMT_QUEUE_SUBQUEUE_NAMES: UInt = 27u

public val PROPID_MGMT_QUEUE_TYPE: UInt = 3u

public val PROPID_MGMT_QUEUE_USED_QUOTA: UInt = 8u

public val PROPID_MGMT_QUEUE_XACT: UInt = 5u

public val PROPID_M_ABORT_COUNT: UInt = 69u

public val PROPID_M_ACKNOWLEDGE: UInt = 6u

public val PROPID_M_ADMIN_QUEUE: UInt = 17u

public val PROPID_M_ADMIN_QUEUE_LEN: UInt = 18u

public val PROPID_M_APPSPECIFIC: UInt = 8u

public val PROPID_M_ARRIVEDTIME: UInt = 32u

public val PROPID_M_AUTHENTICATED: UInt = 25u

public val PROPID_M_AUTHENTICATED_EX: UInt = 53u

public val PROPID_M_AUTH_LEVEL: UInt = 24u

public val PROPID_M_BASE: UInt = 0u

public val PROPID_M_BODY: UInt = 9u

public val PROPID_M_BODY_SIZE: UInt = 10u

public val PROPID_M_BODY_TYPE: UInt = 42u

public val PROPID_M_CLASS: UInt = 1u

public val PROPID_M_COMPOUND_MESSAGE: UInt = 63u

public val PROPID_M_COMPOUND_MESSAGE_SIZE: UInt = 64u

public val PROPID_M_CONNECTOR_TYPE: UInt = 38u

public val PROPID_M_CORRELATIONID: UInt = 3u

public val PROPID_M_CORRELATIONID_SIZE: UInt = 20u

public val PROPID_M_DEADLETTER_QUEUE: UInt = 67u

public val PROPID_M_DEADLETTER_QUEUE_LEN: UInt = 68u

public val PROPID_M_DELIVERY: UInt = 5u

public val PROPID_M_DEST_FORMAT_NAME: UInt = 58u

public val PROPID_M_DEST_FORMAT_NAME_LEN: UInt = 59u

public val PROPID_M_DEST_QUEUE: UInt = 33u

public val PROPID_M_DEST_QUEUE_LEN: UInt = 34u

public val PROPID_M_DEST_SYMM_KEY: UInt = 43u

public val PROPID_M_DEST_SYMM_KEY_LEN: UInt = 44u

public val PROPID_M_ENCRYPTION_ALG: UInt = 27u

public val PROPID_M_EXTENSION: UInt = 35u

public val PROPID_M_EXTENSION_LEN: UInt = 36u

public val PROPID_M_FIRST_IN_XACT: UInt = 50u

public val PROPID_M_HASH_ALG: UInt = 26u

public val PROPID_M_JOURNAL: UInt = 7u

public val PROPID_M_LABEL: UInt = 11u

public val PROPID_M_LABEL_LEN: UInt = 12u

public val PROPID_M_LAST_IN_XACT: UInt = 51u

public val PROPID_M_LAST_MOVE_TIME: UInt = 75u

public val PROPID_M_LOOKUPID: UInt = 60u

public val PROPID_M_MOVE_COUNT: UInt = 70u

public val PROPID_M_MSGID: UInt = 2u

public val PROPID_M_MSGID_SIZE: UInt = 20u

public val PROPID_M_PRIORITY: UInt = 4u

public val PROPID_M_PRIV_LEVEL: UInt = 23u

public val PROPID_M_PROV_NAME: UInt = 48u

public val PROPID_M_PROV_NAME_LEN: UInt = 49u

public val PROPID_M_PROV_TYPE: UInt = 47u

public val PROPID_M_RESP_FORMAT_NAME: UInt = 54u

public val PROPID_M_RESP_FORMAT_NAME_LEN: UInt = 55u

public val PROPID_M_RESP_QUEUE: UInt = 15u

public val PROPID_M_RESP_QUEUE_LEN: UInt = 16u

public val PROPID_M_SECURITY_CONTEXT: UInt = 37u

public val PROPID_M_SENDERID: UInt = 20u

public val PROPID_M_SENDERID_LEN: UInt = 21u

public val PROPID_M_SENDERID_TYPE: UInt = 22u

public val PROPID_M_SENDER_CERT: UInt = 28u

public val PROPID_M_SENDER_CERT_LEN: UInt = 29u

public val PROPID_M_SENTTIME: UInt = 31u

public val PROPID_M_SIGNATURE: UInt = 45u

public val PROPID_M_SIGNATURE_LEN: UInt = 46u

public val PROPID_M_SOAP_BODY: UInt = 66u

public val PROPID_M_SOAP_ENVELOPE: UInt = 61u

public val PROPID_M_SOAP_ENVELOPE_LEN: UInt = 62u

public val PROPID_M_SOAP_HEADER: UInt = 65u

public val PROPID_M_SRC_MACHINE_ID: UInt = 30u

public val PROPID_M_TIME_TO_BE_RECEIVED: UInt = 14u

public val PROPID_M_TIME_TO_REACH_QUEUE: UInt = 13u

public val PROPID_M_TRACE: UInt = 41u

public val PROPID_M_VERSION: UInt = 19u

public val PROPID_M_XACTID: UInt = 52u

public val PROPID_M_XACTID_SIZE: UInt = 20u

public val PROPID_M_XACT_STATUS_QUEUE: UInt = 39u

public val PROPID_M_XACT_STATUS_QUEUE_LEN: UInt = 40u

public val PROPID_PC_BASE: UInt = 5800u

public val PROPID_PC_DS_ENABLED: UInt = 5802u

public val PROPID_PC_VERSION: UInt = 5801u

public val PROPID_QM_BASE: UInt = 200u

public val PROPID_QM_CONNECTION: UInt = 204u

public val PROPID_QM_ENCRYPTION_PK: UInt = 205u

public val PROPID_QM_ENCRYPTION_PK_AES: UInt = 244u

public val PROPID_QM_ENCRYPTION_PK_BASE: UInt = 231u

public val PROPID_QM_ENCRYPTION_PK_ENHANCED: UInt = 232u

public val PROPID_QM_MACHINE_ID: UInt = 202u

public val PROPID_QM_PATHNAME: UInt = 203u

public val PROPID_QM_PATHNAME_DNS: UInt = 233u

public val PROPID_QM_SITE_ID: UInt = 201u

public val PROPID_Q_ADS_PATH: UInt = 126u

public val PROPID_Q_AUTHENTICATE: UInt = 111u

public val PROPID_Q_BASE: UInt = 100u

public val PROPID_Q_BASEPRIORITY: UInt = 106u

public val PROPID_Q_CREATE_TIME: UInt = 109u

public val PROPID_Q_INSTANCE: UInt = 101u

public val PROPID_Q_JOURNAL: UInt = 104u

public val PROPID_Q_JOURNAL_QUOTA: UInt = 107u

public val PROPID_Q_LABEL: UInt = 108u

public val PROPID_Q_MODIFY_TIME: UInt = 110u

public val PROPID_Q_MULTICAST_ADDRESS: UInt = 125u

public val PROPID_Q_PATHNAME: UInt = 103u

public val PROPID_Q_PATHNAME_DNS: UInt = 124u

public val PROPID_Q_PRIV_LEVEL: UInt = 112u

public val PROPID_Q_QUOTA: UInt = 105u

public val PROPID_Q_TRANSACTION: UInt = 113u

public val PROPID_Q_TYPE: UInt = 102u

public val QUERY_SORTASCEND: UInt = 0u

public val QUERY_SORTDESCEND: UInt = 1u

public val QUEUE_ACTION_EOD_RESEND: Pcwstr = w("EOD_RESEND")

public val QUEUE_ACTION_PAUSE: Pcwstr = w("PAUSE")

public val QUEUE_ACTION_RESUME: Pcwstr = w("RESUME")

public val REL_EQ: Relops = 1

public val REL_GE: Relops = 6

public val REL_GT: Relops = 4

public val REL_LE: Relops = 5

public val REL_LT: Relops = 3

public val REL_NEQ: Relops = 2

public val REL_NOP: Relops = 0

public val MQ_QTYPE_REPORT: Guid = Guid.fromU128(U128(0x55ee8f32cce911cfuL, 0xb1080020afd61ce9uL))

public val MQ_QTYPE_TEST: Guid = Guid.fromU128(U128(0x55ee8f33cce911cfuL, 0xb1080020afd61ce9uL))

public val MSMQ_APPLICATION: Guid = Guid.fromU128(U128(0xd7d6e086dccd11d0uL, 0xaa4b0060970debaeuL))

public val MSMQ_COLLECTION: Guid = Guid.fromU128(U128(0xf72b90312f0c43e8uL, 0x924ee6052cdc493fuL))

public val MSMQ_COORDINATED_TRANSACTION_DISPENSER: Guid = Guid.fromU128(U128(0xd7d6e082dccd11d0uL, 0xaa4b0060970debaeuL))

public val MSMQ_DESTINATION: Guid = Guid.fromU128(U128(0xeba96b18216811d3uL, 0x898c00e02c074f6buL))

public val MSMQ_EVENT: Guid = Guid.fromU128(U128(0xd7d6e07adccd11d0uL, 0xaa4b0060970debaeuL))

public val MSMQ_MANAGEMENT: Guid = Guid.fromU128(U128(0x39ce96fef4c54484uL, 0xa1434c2d5d324229uL))

public val MSMQ_MESSAGE: Guid = Guid.fromU128(U128(0xd7d6e075dccd11d0uL, 0xaa4b0060970debaeuL))

public val MSMQ_OUTGOING_QUEUE_MANAGEMENT: Guid = Guid.fromU128(U128(0x188401c247a4feduL, 0x99c6bf14119d7055uL))

public val MSMQ_QUERY: Guid = Guid.fromU128(U128(0xd7d6e073dccd11d0uL, 0xaa4b0060970debaeuL))

public val MSMQ_QUEUE: Guid = Guid.fromU128(U128(0xd7d6e079dccd11d0uL, 0xaa4b0060970debaeuL))

public val MSMQ_QUEUE_INFO: Guid = Guid.fromU128(U128(0xd7d6e07cdccd11d0uL, 0xaa4b0060970debaeuL))

public val MSMQ_QUEUE_INFOS: Guid = Guid.fromU128(U128(0xd7d6e07edccd11d0uL, 0xaa4b0060970debaeuL))

public val MSMQ_QUEUE_MANAGEMENT: Guid = Guid.fromU128(U128(0x33b6d07ef27d42fauL, 0xb2d7bf82e11e9374uL))

public val MSMQ_TRANSACTION: Guid = Guid.fromU128(U128(0xd7d6e080dccd11d0uL, 0xaa4b0060970debaeuL))

public val MSMQ_TRANSACTION_DISPENSER: Guid = Guid.fromU128(U128(0xd7d6e084dccd11d0uL, 0xaa4b0060970debaeuL))
