package io.github.kotlinmania.windowssys.windows.win32.networking.winsock

import io.github.kotlinmania.windowssys.U128
import io.github.kotlinmania.windowssys.core.Guid

public val WSASYSCALLFAILURE: WsaError = 10107

public val WSASYSNOTREADY: WsaError = 10091

public val WSASYS_STATUS_LEN: UInt = 128u

public val WSATRY_AGAIN: WsaError = 11002

public val WSATYPE_NOT_FOUND: WsaError = 10109

public val WSAVERNOTSUPPORTED: WsaError = 10092

public val WSA_E_CANCELLED: WsaError = 10111

public val WSA_E_NO_MORE: WsaError = 10110

public val WSA_FLAG_ACCESS_SYSTEM_SECURITY: UInt = 64u

public val WSA_FLAG_MULTIPOINT_C_LEAF: UInt = 4u

public val WSA_FLAG_MULTIPOINT_C_ROOT: UInt = 2u

public val WSA_FLAG_MULTIPOINT_D_LEAF: UInt = 16u

public val WSA_FLAG_MULTIPOINT_D_ROOT: UInt = 8u

public val WSA_FLAG_NO_HANDLE_INHERIT: UInt = 128u

public val WSA_FLAG_OVERLAPPED: UInt = 1u

public val WSA_FLAG_REGISTERED_IO: UInt = 256u

public val WSA_INFINITE: UInt = 4294967295u

public val WSA_INVALID_EVENT: Wsaevent = 0.toLong()

public val WSA_INVALID_HANDLE: WsaError = 6

public val WSA_INVALID_PARAMETER: WsaError = 87

public val WSA_IO_INCOMPLETE: WsaError = 996

public val WSA_IO_PENDING: WsaError = 997

public val WSA_IPSEC_NAME_POLICY_ERROR: WsaError = 11033

public val WSA_MAXIMUM_WAIT_EVENTS: UInt = 64u

public val WSA_NOT_ENOUGH_MEMORY: WsaError = 8

public val WSA_OPERATION_ABORTED: WsaError = 995

public val WSA_QOS_ADMISSION_FAILURE: WsaError = 11010

public val WSA_QOS_BAD_OBJECT: WsaError = 11013

public val WSA_QOS_BAD_STYLE: WsaError = 11012

public val WSA_QOS_EFILTERCOUNT: WsaError = 11021

public val WSA_QOS_EFILTERSTYLE: WsaError = 11019

public val WSA_QOS_EFILTERTYPE: WsaError = 11020

public val WSA_QOS_EFLOWCOUNT: WsaError = 11023

public val WSA_QOS_EFLOWDESC: WsaError = 11026

public val WSA_QOS_EFLOWSPEC: WsaError = 11017

public val WSA_QOS_EOBJLENGTH: WsaError = 11022

public val WSA_QOS_EPOLICYOBJ: WsaError = 11025

public val WSA_QOS_EPROVSPECBUF: WsaError = 11018

public val WSA_QOS_EPSFILTERSPEC: WsaError = 11028

public val WSA_QOS_EPSFLOWSPEC: WsaError = 11027

public val WSA_QOS_ESDMODEOBJ: WsaError = 11029

public val WSA_QOS_ESERVICETYPE: WsaError = 11016

public val WSA_QOS_ESHAPERATEOBJ: WsaError = 11030

public val WSA_QOS_EUNKOWNPSOBJ: WsaError = 11024

public val WSA_QOS_GENERIC_ERROR: WsaError = 11015

public val WSA_QOS_NO_RECEIVERS: WsaError = 11008

public val WSA_QOS_NO_SENDERS: WsaError = 11007

public val WSA_QOS_POLICY_FAILURE: WsaError = 11011

public val WSA_QOS_RECEIVERS: WsaError = 11005

public val WSA_QOS_REQUEST_CONFIRMED: WsaError = 11009

public val WSA_QOS_RESERVED_PETYPE: WsaError = 11031

public val WSA_QOS_SENDERS: WsaError = 11006

public val WSA_QOS_TRAFFIC_CTRL_ERROR: WsaError = 11014

public val WSA_SECURE_HOST_NOT_FOUND: WsaError = 11032

public val WSA_WAIT_EVENT_0: WsaError = 0

public val WSA_WAIT_FAILED: UInt = 4294967295u

public val WSA_WAIT_IO_COMPLETION: WsaError = 192

public val WSA_WAIT_TIMEOUT: UInt = 258u

public val WSK_SO_BASE: UInt = 16384u

public val WSPDESCRIPTION_LEN: UInt = 255u

public val WSS_OPERATION_IN_PROGRESS: Int = 259

public val WSA_BEHAVIOR_ALL: WsaCompatibilityBehaviorId = 0

public val WSA_BEHAVIOR_AUTO_TUNING: WsaCompatibilityBehaviorId = 2

public val WSA_BEHAVIOR_RECEIVE_BUFFERING: WsaCompatibilityBehaviorId = 1

public val XP1_CONNECTIONLESS: UInt = 1u

public val XP1_CONNECT_DATA: UInt = 128u

public val XP1_DISCONNECT_DATA: UInt = 256u

public val XP1_EXPEDITED_DATA: UInt = 64u

public val XP1_GRACEFUL_CLOSE: UInt = 32u

public val XP1_GUARANTEED_DELIVERY: UInt = 2u

public val XP1_GUARANTEED_ORDER: UInt = 4u

public val XP1_IFS_HANDLES: UInt = 131072u

public val XP1_INTERRUPT: UInt = 16384u

public val XP1_MESSAGE_ORIENTED: UInt = 8u

public val XP1_MULTIPOINT_CONTROL_PLANE: UInt = 2048u

public val XP1_MULTIPOINT_DATA_PLANE: UInt = 4096u

public val XP1_PARTIAL_MESSAGE: UInt = 262144u

public val XP1_PSEUDO_STREAM: UInt = 16u

public val XP1_QOS_SUPPORTED: UInt = 8192u

public val XP1_SAN_SUPPORT_SDP: UInt = 524288u

public val XP1_SUPPORT_BROADCAST: UInt = 512u

public val XP1_SUPPORT_MULTIPOINT: UInt = 1024u

public val XP1_UNI_RECV: UInt = 65536u

public val XP1_UNI_SEND: UInt = 32768u

public val XP_BANDWIDTH_ALLOCATION: UInt = 2048u

public val XP_CONNECTIONLESS: UInt = 1u

public val XP_CONNECT_DATA: UInt = 128u

public val XP_DISCONNECT_DATA: UInt = 256u

public val XP_ENCRYPTS: UInt = 8192u

public val XP_EXPEDITED_DATA: UInt = 64u

public val XP_FRAGMENTATION: UInt = 4096u

public val XP_GRACEFUL_CLOSE: UInt = 32u

public val XP_GUARANTEED_DELIVERY: UInt = 2u

public val XP_GUARANTEED_ORDER: UInt = 4u

public val XP_MESSAGE_ORIENTED: UInt = 8u

public val XP_PSEUDO_STREAM: UInt = 16u

public val XP_SUPPORTS_BROADCAST: UInt = 512u

public val XP_SUPPORTS_MULTICAST: UInt = 1024u

public val BIG_ENDIAN: UInt = 4321u

public val LITTLE_ENDIAN: UInt = 1234u

public val PDP_ENDIAN: UInt = 3412u

public val SS_MAXSIZE: UInt = 128u

public val ASSOCIATE_NAMERES_CONTEXT: Guid = Guid.fromU128(U128(0x59a38b67d4fe46e1uL, 0xba3c87ea74ca3049uL))

public val NLA_NAMESPACE_GUID: Guid = Guid.fromU128(U128(0x6642243a3ba84aa6uL, 0xbaa52e0bd71fdd83uL))

public val NLA_SERVICE_CLASS_GUID: Guid = Guid.fromU128(U128(0x37e515b5c94a43uL, 0xbada8b48a87ad239uL))

public val REAL_TIME_NOTIFICATION_CAPABILITY: Guid = Guid.fromU128(U128(0x6b59819a5cae492duL, 0xa9012a3c2c50164fuL))

public val REAL_TIME_NOTIFICATION_CAPABILITY_EX: Guid = Guid.fromU128(U128(0x6843da03154a4616uL, 0xa50844371295f96buL))

public val SOCKET_DEFAULT2_QM_POLICY: Guid = Guid.fromU128(U128(0xaec2ef9c3a4d4d3euL, 0x8842239942e39a47uL))

public val WSAID_ACCEPTEX: Guid = Guid.fromU128(U128(0xb5367df1cbac11cfuL, 0x95ca00805f48a192uL))

public val WSAID_CONNECTEX: Guid = Guid.fromU128(U128(0x25a207b9ddf34660uL, 0x8ee976e58c74063euL))

public val WSAID_DISCONNECTEX: Guid = Guid.fromU128(U128(0x7fda2e118630436fuL, 0xa031f536a6eec157uL))

public val WSAID_GETACCEPTEXSOCKADDRS: Guid = Guid.fromU128(U128(0xb5367df2cbac11cfuL, 0x95ca00805f48a192uL))

public val WSAID_MULTIPLE_RIO: Guid = Guid.fromU128(U128(0x8509e08196dd4005uL, 0xb1659e2ee8c79e3fuL))

public val WSAID_TRANSMITFILE: Guid = Guid.fromU128(U128(0xb5367df0cbac11cfuL, 0x95ca00805f48a192uL))

public val WSAID_TRANSMITPACKETS: Guid = Guid.fromU128(U128(0xd9689da01f9011d3uL, 0x997100c04f68c876uL))

public val WSAID_WSAPOLL: Guid = Guid.fromU128(U128(0x18c76f85dc664964uL, 0x972e23c27238312buL))

public val WSAID_WSARECVMSG: Guid = Guid.fromU128(U128(0xf689d7c86f1f436buL, 0x8a53e54fe351c322uL))

public val WSAID_WSASENDMSG: Guid = Guid.fromU128(U128(0xa441e712754f43cauL, 0x84a70dee44cf606duL))
