package io.github.kotlinmania.windowssys.windows.win32.system.distributedtransactioncoordinator

import io.github.kotlinmania.windowssys.U128
import io.github.kotlinmania.windowssys.core.Guid

public val CLSID_MS_DTC_TRANSACTION: Guid = Guid.fromU128(U128(0x39f8d76b092811d1uL, 0x97df00c04fb9618auL))

public val CLSID_MS_DTC_TRANSACTION_MANAGER: Guid = Guid.fromU128(U128(0x5b18ab61091d11d1uL, 0x97df00c04fb9618auL))

public val CLUSTERRESOURCE_APPLICATIONTYPE: Applicationtype = 1

public val DTCINITIATEDRECOVERYWORK_CHECKLUSTATUS: Dtcinitiatedrecoverywork = 1

public val DTCINITIATEDRECOVERYWORK_TMDOWN: Dtcinitiatedrecoverywork = 3

public val DTCINITIATEDRECOVERYWORK_TRANS: Dtcinitiatedrecoverywork = 2

public val DTCINSTALL_E_CLIENT_ALREADY_INSTALLED: Int = 384

public val DTCINSTALL_E_SERVER_ALREADY_INSTALLED: Int = 385

public val DTCLUCOMPARESTATESCONFIRMATION_CONFIRM: Dtclucomparestatesconfirmation = 1

public val DTCLUCOMPARESTATESCONFIRMATION_PROTOCOL: Dtclucomparestatesconfirmation = 2

public val DTCLUCOMPARESTATESERROR_PROTOCOL: Dtclucomparestateserror = 1

public val DTCLUCOMPARESTATESRESPONSE_OK: Dtclucomparestatesresponse = 1

public val DTCLUCOMPARESTATESRESPONSE_PROTOCOL: Dtclucomparestatesresponse = 2

public val DTCLUCOMPARESTATE_COMMITTED: Dtclucomparestate = 1

public val DTCLUCOMPARESTATE_HEURISTICCOMMITTED: Dtclucomparestate = 2

public val DTCLUCOMPARESTATE_HEURISTICMIXED: Dtclucomparestate = 3

public val DTCLUCOMPARESTATE_HEURISTICRESET: Dtclucomparestate = 4

public val DTCLUCOMPARESTATE_INDOUBT: Dtclucomparestate = 5

public val DTCLUCOMPARESTATE_RESET: Dtclucomparestate = 6

public val DTCLUXLNCONFIRMATION_COLDWARMMISMATCH: Dtcluxlnconfirmation = 3

public val DTCLUXLNCONFIRMATION_CONFIRM: Dtcluxlnconfirmation = 1

public val DTCLUXLNCONFIRMATION_LOGNAMEMISMATCH: Dtcluxlnconfirmation = 2

public val DTCLUXLNCONFIRMATION_OBSOLETE: Dtcluxlnconfirmation = 4

public val DTCLUXLNERROR_COLDWARMMISMATCH: Dtcluxlnerror = 3

public val DTCLUXLNERROR_LOGNAMEMISMATCH: Dtcluxlnerror = 2

public val DTCLUXLNERROR_PROTOCOL: Dtcluxlnerror = 1

public val DTCLUXLNRESPONSE_COLDWARMMISMATCH: Dtcluxlnresponse = 4

public val DTCLUXLNRESPONSE_LOGNAMEMISMATCH: Dtcluxlnresponse = 3

public val DTCLUXLNRESPONSE_OK_SENDCONFIRMATION: Dtcluxlnresponse = 2

public val DTCLUXLNRESPONSE_OK_SENDOURXLNBACK: Dtcluxlnresponse = 1

public val DTCLUXLN_COLD: Dtcluxln = 1

public val DTCLUXLN_WARM: Dtcluxln = 2

public val DTC_INSTALL_OVERWRITE_CLIENT: UInt = 1u

public val DTC_INSTALL_OVERWRITE_SERVER: UInt = 2u

public val DTC_STATUS_CONTINUING: DtcStatus = 5

public val DTC_STATUS_E_CANTCONTROL: DtcStatus = 8

public val DTC_STATUS_FAILED: DtcStatus = 9

public val DTC_STATUS_PAUSED: DtcStatus = 4

public val DTC_STATUS_PAUSING: DtcStatus = 3

public val DTC_STATUS_STARTED: DtcStatus = 2

public val DTC_STATUS_STARTING: DtcStatus = 1

public val DTC_STATUS_STOPPED: DtcStatus = 7

public val DTC_STATUS_STOPPING: DtcStatus = 6

public val DTC_STATUS_UNKNOWN: DtcStatus = 0

public val INCOMING_AUTHENTICATION_REQUIRED: AuthenticationLevel = 1

public val ISOFLAG_OPTIMISTIC: Isoflag = 16

public val ISOFLAG_READONLY: Isoflag = 32

public val ISOFLAG_RETAIN_ABORT: Isoflag = 8

public val ISOFLAG_RETAIN_ABORT_DC: Isoflag = 4

public val ISOFLAG_RETAIN_ABORT_NO: Isoflag = 12

public val ISOFLAG_RETAIN_BOTH: Isoflag = 10

public val ISOFLAG_RETAIN_COMMIT: Isoflag = 2

public val ISOFLAG_RETAIN_COMMIT_DC: Isoflag = 1

public val ISOFLAG_RETAIN_COMMIT_NO: Isoflag = 3

public val ISOFLAG_RETAIN_DONTCARE: Isoflag = 5

public val ISOFLAG_RETAIN_NONE: Isoflag = 15

public val ISOLATIONLEVEL_BROWSE: Isolationlevel = 256

public val ISOLATIONLEVEL_CHAOS: Isolationlevel = 16

public val ISOLATIONLEVEL_CURSORSTABILITY: Isolationlevel = 4096

public val ISOLATIONLEVEL_ISOLATED: Isolationlevel = 1048576

public val ISOLATIONLEVEL_READCOMMITTED: Isolationlevel = 4096

public val ISOLATIONLEVEL_READUNCOMMITTED: Isolationlevel = 256

public val ISOLATIONLEVEL_REPEATABLEREAD: Isolationlevel = 65536

public val ISOLATIONLEVEL_SERIALIZABLE: Isolationlevel = 1048576

public val ISOLATIONLEVEL_UNSPECIFIED: Isolationlevel = -1

public val LOCAL_APPLICATIONTYPE: Applicationtype = 0

public val MAXBQUALSIZE: UInt = 64u

public val MAXGTRIDSIZE: UInt = 64u

public val MAXINFOSIZE: UInt = 256u

public val MAX_TRAN_DESC: TxMiscConstants = 40

public val MUTUAL_AUTHENTICATION_REQUIRED: AuthenticationLevel = 2

public val NO_AUTHENTICATION_REQUIRED: AuthenticationLevel = 0

public val OLE_TM_CONFIG_VERSION_1: UInt = 1u

public val OLE_TM_CONFIG_VERSION_2: UInt = 2u

public val OLE_TM_FLAG_INTERNAL_TO_TM: UInt = 1073741824u

public val OLE_TM_FLAG_NOAGILERECOVERY: UInt = 2u

public val OLE_TM_FLAG_NODEMANDSTART: UInt = 1u

public val OLE_TM_FLAG_NONE: UInt = 0u

public val OLE_TM_FLAG_QUERY_SERVICE_LOCKSTATUS: UInt = 2147483648u

public val RMNAMESZ: UInt = 32u

public val TMASYNC: Int = -2147483648.toInt()

public val TMENDRSCAN: Int = 8388608

public val TMER_INVAL: Int = -2

public val TMER_PROTO: Int = -3

public val TMER_TMERR: Int = -1

public val TMFAIL: Int = 536870912

public val TMJOIN: Int = 2097152

public val TMMIGRATE: Int = 1048576

public val TMMULTIPLE: Int = 4194304

public val TMNOFLAGS: Int = 0

public val TMNOMIGRATE: Int = 2

public val TMNOWAIT: Int = 268435456

public val TMONEPHASE: Int = 1073741824

public val TMREGISTER: Int = 1

public val TMRESUME: Int = 134217728

public val TMSTARTRSCAN: Int = 16777216

public val TMSUCCESS: Int = 67108864

public val TMSUSPEND: Int = 33554432

public val TMUSEASYNC: Int = 4

public val TM_JOIN: UInt = 2u

public val TM_OK: UInt = 0u

public val TM_RESUME: UInt = 1u

public val XACTCONST_TIMEOUTINFINITE: Xactconst = 0

public val XACTHEURISTIC_ABORT: Xactheuristic = 1

public val XACTHEURISTIC_COMMIT: Xactheuristic = 2

public val XACTHEURISTIC_DAMAGE: Xactheuristic = 3

public val XACTHEURISTIC_DANGER: Xactheuristic = 4

public val XACTRM_NOREADONLYPREPARES: Xactrm = 2

public val XACTRM_OPTIMISTICLASTWINS: Xactrm = 1

public val XACTSTAT_ABORTED: Xactstat = 512

public val XACTSTAT_ABORTING: Xactstat = 256

public val XACTSTAT_ALL: Xactstat = 524287

public val XACTSTAT_CLOSED: Xactstat = 262144

public val XACTSTAT_COMMITRETAINING: Xactstat = 128

public val XACTSTAT_COMMITTED: Xactstat = 1024

public val XACTSTAT_COMMITTING: Xactstat = 64

public val XACTSTAT_FORCED_ABORT: Xactstat = 32768

public val XACTSTAT_FORCED_COMMIT: Xactstat = 65536

public val XACTSTAT_HEURISTIC_ABORT: Xactstat = 2048

public val XACTSTAT_HEURISTIC_COMMIT: Xactstat = 4096

public val XACTSTAT_HEURISTIC_DAMAGE: Xactstat = 8192

public val XACTSTAT_HEURISTIC_DANGER: Xactstat = 16384

public val XACTSTAT_INDOUBT: Xactstat = 131072

public val XACTSTAT_NONE: Xactstat = 0

public val XACTSTAT_NOTPREPARED: Xactstat = 524227

public val XACTSTAT_OPEN: Xactstat = 3

public val XACTSTAT_OPENNORMAL: Xactstat = 1

public val XACTSTAT_OPENREFUSED: Xactstat = 2

public val XACTSTAT_PREPARED: Xactstat = 8

public val XACTSTAT_PREPARERETAINED: Xactstat = 32

public val XACTSTAT_PREPARERETAINING: Xactstat = 16

public val XACTSTAT_PREPARING: Xactstat = 4

public val XACTTC_ASYNC: Xacttc = 4

public val XACTTC_ASYNC_PHASEONE: Xacttc = 4

public val XACTTC_NONE: Xacttc = 0

public val XACTTC_SYNC: Xacttc = 2

public val XACTTC_SYNC_PHASEONE: Xacttc = 1

public val XACTTC_SYNC_PHASETWO: Xacttc = 2

public val XACT_E_CONNECTION_REQUEST_DENIED: XactDtcConstants = -2147168000

public val XACT_E_DUPLICATE_GUID: XactDtcConstants = -2147167998

public val XACT_E_DUPLICATE_LU: XactDtcConstants = -2147167991

public val XACT_E_DUPLICATE_TRANSID: XactDtcConstants = -2147167989

public val XACT_E_LRMRECOVERYALREADYDONE: XactDtcConstants = -2147167982

public val XACT_E_LU_BUSY: XactDtcConstants = -2147167988

public val XACT_E_LU_DOWN: XactDtcConstants = -2147167986

public val XACT_E_LU_NOT_CONNECTED: XactDtcConstants = -2147167990

public val XACT_E_LU_NOT_FOUND: XactDtcConstants = -2147167992

public val XACT_E_LU_NO_RECOVERY_PROCESS: XactDtcConstants = -2147167987

public val XACT_E_LU_RECOVERING: XactDtcConstants = -2147167985

public val XACT_E_LU_RECOVERY_MISMATCH: XactDtcConstants = -2147167984

public val XACT_E_NOLASTRESOURCEINTERFACE: XactDtcConstants = -2147167981

public val XACT_E_NOTSINGLEPHASE: XactDtcConstants = -2147167997

public val XACT_E_PROTOCOL: XactDtcConstants = -2147167995

public val XACT_E_RECOVERYALREADYDONE: XactDtcConstants = -2147167996

public val XACT_E_RECOVERY_FAILED: XactDtcConstants = -2147167993

public val XACT_E_RM_FAILURE: XactDtcConstants = -2147167994

public val XACT_E_RM_UNAVAILABLE: XactDtcConstants = -2147167983

public val XACT_E_TOOMANY_ENLISTMENTS: XactDtcConstants = -2147167999

public val XACT_OK_NONOTIFY: XactDtcConstants = 315649

public val XACT_S_NONOTIFY: XactDtcConstants = 315648

public val XAER_ASYNC: Int = -2

public val XAER_DUPID: Int = -8

public val XAER_INVAL: Int = -5

public val XAER_NOTA: Int = -4

public val XAER_OUTSIDE: Int = -9

public val XAER_PROTO: Int = -6

public val XAER_RMERR: Int = -3

public val XAER_RMFAIL: Int = -7

public val XA_FMTID_DTC: UInt = 4478019u

public val XA_FMTID_DTC_VER1: UInt = 21255235u

public val XA_HEURCOM: UInt = 7u

public val XA_HEURHAZ: UInt = 8u

public val XA_HEURMIX: UInt = 5u

public val XA_HEURRB: UInt = 6u

public val XA_NOMIGRATE: UInt = 9u

public val XA_OK: UInt = 0u

public val XA_RBBASE: UInt = 100u

public val XA_RBCOMMFAIL: UInt = 101u

public val XA_RBDEADLOCK: UInt = 102u

public val XA_RBEND: UInt = 107u

public val XA_RBINTEGRITY: UInt = 103u

public val XA_RBOTHER: UInt = 104u

public val XA_RBPROTO: UInt = 105u

public val XA_RBROLLBACK: UInt = 100u

public val XA_RBTIMEOUT: UInt = 106u

public val XA_RBTRANSIENT: UInt = 107u

public val XA_RDONLY: UInt = 3u

public val XA_RETRY: UInt = 4u

public val XA_SWITCH_F_DTC: UInt = 1u

public val XIDDATASIZE: UInt = 128u

public val DW_USER_MS_SQLSERVER: XactDtcConstants = 65535
