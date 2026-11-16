package io.github.kotlinmania.windowssys.windows.win32.system.dataexchange

import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.w

public val APPCLASS_MASK: Int = 15

public val APPCLASS_MONITOR: DdeInitializeCommand = 1u

public val APPCLASS_STANDARD: DdeInitializeCommand = 0u

public val APPCMD_CLIENTONLY: DdeInitializeCommand = 16u

public val APPCMD_FILTERINITS: DdeInitializeCommand = 32u

public val APPCMD_MASK: Int = 4080

public val CADV_LATEACK: UInt = 65535u

public val CBF_FAIL_ADVISES: DdeInitializeCommand = 16384u

public val CBF_FAIL_ALLSVRXACTIONS: DdeInitializeCommand = 258048u

public val CBF_FAIL_CONNECTIONS: DdeInitializeCommand = 8192u

public val CBF_FAIL_EXECUTES: DdeInitializeCommand = 32768u

public val CBF_FAIL_POKES: DdeInitializeCommand = 65536u

public val CBF_FAIL_REQUESTS: DdeInitializeCommand = 131072u

public val CBF_FAIL_SELFCONNECTIONS: DdeInitializeCommand = 4096u

public val CBF_SKIP_ALLNOTIFICATIONS: DdeInitializeCommand = 3932160u

public val CBF_SKIP_CONNECT_CONFIRMS: DdeInitializeCommand = 262144u

public val CBF_SKIP_DISCONNECTS: DdeInitializeCommand = 2097152u

public val CBF_SKIP_REGISTRATIONS: DdeInitializeCommand = 524288u

public val CBF_SKIP_UNREGISTRATIONS: DdeInitializeCommand = 1048576u

public val CP_WINANSI: Int = 1004

public val CP_WINNEUTRAL: Int = 1200

public val CP_WINUNICODE: Int = 1200

public val DDE_FACK: UInt = 32768u

public val DDE_FACKREQ: UInt = 32768u

public val DDE_FAPPSTATUS: UInt = 255u

public val DDE_FBUSY: UInt = 16384u

public val DDE_FDEFERUPD: UInt = 16384u

public val DDE_FNOTPROCESSED: UInt = 0u

public val DDE_FRELEASE: UInt = 8192u

public val DDE_FREQUESTED: UInt = 4096u

public val DMLERR_ADVACKTIMEOUT: UInt = 16384u

public val DMLERR_BUSY: UInt = 16385u

public val DMLERR_DATAACKTIMEOUT: UInt = 16386u

public val DMLERR_DLL_NOT_INITIALIZED: UInt = 16387u

public val DMLERR_DLL_USAGE: UInt = 16388u

public val DMLERR_EXECACKTIMEOUT: UInt = 16389u

public val DMLERR_FIRST: UInt = 16384u

public val DMLERR_INVALIDPARAMETER: UInt = 16390u

public val DMLERR_LAST: UInt = 16401u

public val DMLERR_LOW_MEMORY: UInt = 16391u

public val DMLERR_MEMORY_ERROR: UInt = 16392u

public val DMLERR_NOTPROCESSED: UInt = 16393u

public val DMLERR_NO_CONV_ESTABLISHED: UInt = 16394u

public val DMLERR_NO_ERROR: UInt = 0u

public val DMLERR_POKEACKTIMEOUT: UInt = 16395u

public val DMLERR_POSTMSG_FAILED: UInt = 16396u

public val DMLERR_REENTRANCY: UInt = 16397u

public val DMLERR_SERVER_DIED: UInt = 16398u

public val DMLERR_SYS_ERROR: UInt = 16399u

public val DMLERR_UNADVACKTIMEOUT: UInt = 16400u

public val DMLERR_UNFOUND_QUEUE_ID: UInt = 16401u

public val DNS_FILTEROFF: DdeNameServiceCmd = 8u

public val DNS_FILTERON: DdeNameServiceCmd = 4u

public val DNS_REGISTER: DdeNameServiceCmd = 1u

public val DNS_UNREGISTER: DdeNameServiceCmd = 2u

public val EC_DISABLE: DdeEnableCallbackCmd = 8u

public val EC_ENABLEALL: DdeEnableCallbackCmd = 0u

public val EC_ENABLEONE: DdeEnableCallbackCmd = 128u

public val EC_QUERYWAITING: DdeEnableCallbackCmd = 2u

public val HDATA_APPOWNED: UInt = 1u

public val MAX_MONITORS: UInt = 4u

public val MF_CALLBACKS: DdeInitializeCommand = 134217728u

public val MF_CONV: DdeInitializeCommand = 1073741824u

public val MF_ERRORS: DdeInitializeCommand = 268435456u

public val MF_HSZ_INFO: DdeInitializeCommand = 16777216u

public val MF_LINKS: DdeInitializeCommand = 536870912u

public val MF_MASK: UInt = 4278190080u

public val MF_POSTMSGS: DdeInitializeCommand = 67108864u

public val MF_SENDMSGS: DdeInitializeCommand = 33554432u

public val MH_CLEANUP: UInt = 4u

public val MH_CREATE: UInt = 1u

public val MH_DELETE: UInt = 3u

public val MH_KEEP: UInt = 2u

public val MSGF_DDEMGR: UInt = 32769u

public val QID_SYNC: UInt = 4294967295u

public val ST_ADVISE: ConvinfoStatus = 2u

public val ST_BLOCKED: ConvinfoStatus = 8u

public val ST_BLOCKNEXT: ConvinfoStatus = 128u

public val ST_CLIENT: ConvinfoStatus = 16u

public val ST_CONNECTED: ConvinfoStatus = 1u

public val ST_INLIST: ConvinfoStatus = 64u

public val ST_ISLOCAL: ConvinfoStatus = 4u

public val ST_ISSELF: ConvinfoStatus = 256u

public val ST_TERMINATED: ConvinfoStatus = 32u

public val SZDDESYS_ITEM_FORMATS: Pcwstr = w("Formats")

public val SZDDESYS_ITEM_HELP: Pcwstr = w("Help")

public val SZDDESYS_ITEM_RTNMSG: Pcwstr = w("ReturnMessage")

public val SZDDESYS_ITEM_STATUS: Pcwstr = w("Status")

public val SZDDESYS_ITEM_SYSITEMS: Pcwstr = w("SysItems")

public val SZDDESYS_ITEM_TOPICS: Pcwstr = w("Topics")

public val SZDDESYS_TOPIC: Pcwstr = w("System")

public val SZDDE_ITEM_ITEMLIST: Pcwstr = w("TopicItemList")

public val TIMEOUT_ASYNC: UInt = 4294967295u

public val WM_DDE_ACK: UInt = 996u

public val WM_DDE_ADVISE: UInt = 994u

public val WM_DDE_DATA: UInt = 997u

public val WM_DDE_EXECUTE: UInt = 1000u

public val WM_DDE_FIRST: UInt = 992u

public val WM_DDE_INITIATE: UInt = 992u

public val WM_DDE_LAST: UInt = 1000u

public val WM_DDE_POKE: UInt = 999u

public val WM_DDE_REQUEST: UInt = 998u

public val WM_DDE_TERMINATE: UInt = 993u

public val WM_DDE_UNADVISE: UInt = 995u

public val XCLASS_BOOL: UInt = 4096u

public val XCLASS_DATA: UInt = 8192u

public val XCLASS_FLAGS: UInt = 16384u

public val XCLASS_MASK: UInt = 64512u

public val XCLASS_NOTIFICATION: UInt = 32768u

public val XST_ADVACKRCVD: ConvinfoConversationState = 13u

public val XST_ADVDATAACKRCVD: ConvinfoConversationState = 16u

public val XST_ADVDATASENT: ConvinfoConversationState = 15u

public val XST_ADVSENT: ConvinfoConversationState = 11u

public val XST_CONNECTED: ConvinfoConversationState = 2u

public val XST_DATARCVD: ConvinfoConversationState = 6u

public val XST_EXECACKRCVD: ConvinfoConversationState = 10u

public val XST_EXECSENT: ConvinfoConversationState = 9u

public val XST_INCOMPLETE: ConvinfoConversationState = 1u

public val XST_INIT1: ConvinfoConversationState = 3u

public val XST_INIT2: ConvinfoConversationState = 4u

public val XST_NULL: ConvinfoConversationState = 0u

public val XST_POKEACKRCVD: ConvinfoConversationState = 8u

public val XST_POKESENT: ConvinfoConversationState = 7u

public val XST_REQSENT: ConvinfoConversationState = 5u

public val XST_UNADVACKRCVD: ConvinfoConversationState = 14u

public val XST_UNADVSENT: ConvinfoConversationState = 12u

public val XTYPF_ACKREQ: UInt = 8u

public val XTYPF_NOBLOCK: UInt = 2u

public val XTYPF_NODATA: UInt = 4u

public val XTYP_ADVDATA: DdeClientTransactionType = 16400u

public val XTYP_ADVREQ: DdeClientTransactionType = 8226u

public val XTYP_ADVSTART: DdeClientTransactionType = 4144u

public val XTYP_ADVSTOP: DdeClientTransactionType = 32832u

public val XTYP_CONNECT: DdeClientTransactionType = 4194u

public val XTYP_CONNECT_CONFIRM: DdeClientTransactionType = 32882u

public val XTYP_DISCONNECT: DdeClientTransactionType = 32962u

public val XTYP_EXECUTE: DdeClientTransactionType = 16464u

public val XTYP_MASK: UInt = 240u

public val XTYP_MONITOR: DdeClientTransactionType = 33010u

public val XTYP_POKE: DdeClientTransactionType = 16528u

public val XTYP_REGISTER: DdeClientTransactionType = 32930u

public val XTYP_REQUEST: DdeClientTransactionType = 8368u

public val XTYP_SHIFT: UInt = 4u

public val XTYP_UNREGISTER: DdeClientTransactionType = 32978u

public val XTYP_WILDCONNECT: DdeClientTransactionType = 8418u

public val XTYP_XACT_COMPLETE: DdeClientTransactionType = 32896u
