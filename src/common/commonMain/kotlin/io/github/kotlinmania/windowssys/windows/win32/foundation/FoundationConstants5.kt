package io.github.kotlinmania.windowssys.windows.win32.foundation

import io.github.kotlinmania.windowssys.core.Hresult

public val RPC_NT_PIPE_EMPTY: Ntstatus = 0xC0030061u.toInt()

public val RPC_NT_PROCNUM_OUT_OF_RANGE: Ntstatus = 0xC002002Eu.toInt()

public val RPC_NT_PROTOCOL_ERROR: Ntstatus = 0xC002001Du.toInt()

public val RPC_NT_PROTSEQ_NOT_FOUND: Ntstatus = 0xC002002Du.toInt()

public val RPC_NT_PROTSEQ_NOT_SUPPORTED: Ntstatus = 0xC0020004u.toInt()

public val RPC_NT_PROXY_ACCESS_DENIED: Ntstatus = 0xC0020064u.toInt()

public val RPC_NT_SEC_PKG_ERROR: Ntstatus = 0xC0020057u.toInt()

public val RPC_NT_SEND_INCOMPLETE: Ntstatus = 0x400200AFu.toInt()

public val RPC_NT_SERVER_TOO_BUSY: Ntstatus = 0xC0020018u.toInt()

public val RPC_NT_SERVER_UNAVAILABLE: Ntstatus = 0xC0020017u.toInt()

public val RPC_NT_SS_CANNOT_GET_CALL_HANDLE: Ntstatus = 0xC0030008u.toInt()

public val RPC_NT_SS_CHAR_TRANS_OPEN_FAIL: Ntstatus = 0xC0030002u.toInt()

public val RPC_NT_SS_CHAR_TRANS_SHORT_FILE: Ntstatus = 0xC0030003u.toInt()

public val RPC_NT_SS_CONTEXT_DAMAGED: Ntstatus = 0xC0030006u.toInt()

public val RPC_NT_SS_CONTEXT_MISMATCH: Ntstatus = 0xC0030005u.toInt()

public val RPC_NT_SS_HANDLES_MISMATCH: Ntstatus = 0xC0030007u.toInt()

public val RPC_NT_SS_IN_NULL_CONTEXT: Ntstatus = 0xC0030004u.toInt()

public val RPC_NT_STRING_TOO_LONG: Ntstatus = 0xC002002Cu.toInt()

public val RPC_NT_TYPE_ALREADY_REGISTERED: Ntstatus = 0xC002000Du.toInt()

public val RPC_NT_UNKNOWN_AUTHN_LEVEL: Ntstatus = 0xC0020031u.toInt()

public val RPC_NT_UNKNOWN_AUTHN_SERVICE: Ntstatus = 0xC0020030u.toInt()

public val RPC_NT_UNKNOWN_AUTHN_TYPE: Ntstatus = 0xC002002Au.toInt()

public val RPC_NT_UNKNOWN_AUTHZ_SERVICE: Ntstatus = 0xC0020033u.toInt()

public val RPC_NT_UNKNOWN_IF: Ntstatus = 0xC0020012u.toInt()

public val RPC_NT_UNKNOWN_MGR_TYPE: Ntstatus = 0xC0020011u.toInt()

public val RPC_NT_UNSUPPORTED_AUTHN_LEVEL: Ntstatus = 0xC0020053u.toInt()

public val RPC_NT_UNSUPPORTED_NAME_SYNTAX: Ntstatus = 0xC0020026u.toInt()

public val RPC_NT_UNSUPPORTED_TRANS_SYN: Ntstatus = 0xC002001Fu.toInt()

public val RPC_NT_UNSUPPORTED_TYPE: Ntstatus = 0xC0020021u.toInt()

public val RPC_NT_UUID_LOCAL_ONLY: Ntstatus = 0x40020056u.toInt()

public val RPC_NT_UUID_NO_ADDRESS: Ntstatus = 0xC0020028u.toInt()

public val RPC_NT_WRONG_ES_VERSION: Ntstatus = 0xC003005Au.toInt()

public val RPC_NT_WRONG_KIND_OF_BINDING: Ntstatus = 0xC0020002u.toInt()

public val RPC_NT_WRONG_PIPE_VERSION: Ntstatus = 0xC003005Eu.toInt()

public val RPC_NT_WRONG_STUB_VERSION: Ntstatus = 0xC003005Bu.toInt()

public val RPC_NT_ZERO_DIVIDE: Ntstatus = 0xC0020044u.toInt()

public val RPC_S_CALLPENDING: Hresult = 0x80010115u.toInt()

public val RPC_S_WAITONTIMER: Hresult = 0x80010116u.toInt()

public val RPC_X_BAD_STUB_DATA: Int = 1783

public val RPC_X_BYTE_COUNT_TOO_SMALL: Int = 1782

public val RPC_X_ENUM_VALUE_OUT_OF_RANGE: Int = 1781

public val RPC_X_ENUM_VALUE_TOO_LARGE: Int = 1781

public val RPC_X_INVALID_BOUND: Int = -1073610717

public val RPC_X_INVALID_BUFFER: Int = -1073741306

public val RPC_X_INVALID_ES_ACTION: Int = 1827

public val RPC_X_INVALID_PIPE_OBJECT: Int = 1830

public val RPC_X_INVALID_PIPE_OPERATION: Int = 1831

public val RPC_X_INVALID_TAG: Int = -1073610718

public val RPC_X_NO_MEMORY: Int = -1073741801

public val RPC_X_NO_MORE_ENTRIES: Int = 1772

public val RPC_X_NULL_REF_POINTER: Int = 1780

public val RPC_X_PIPE_APP_MEMORY: Int = -1073741801

public val RPC_X_PIPE_CLOSED: Int = 1916

public val RPC_X_PIPE_DISCIPLINE_ERROR: Int = 1917

public val RPC_X_PIPE_EMPTY: Int = 1918

public val RPC_X_SS_CANNOT_GET_CALL_HANDLE: Int = 1779

public val RPC_X_SS_CHAR_TRANS_OPEN_FAIL: Int = 1773

public val RPC_X_SS_CHAR_TRANS_SHORT_FILE: Int = 1774

public val RPC_X_SS_CONTEXT_DAMAGED: Int = 1777

public val RPC_X_SS_CONTEXT_MISMATCH: Int = -1073545211

public val RPC_X_SS_HANDLES_MISMATCH: Int = 1778

public val RPC_X_SS_IN_NULL_CONTEXT: Int = 1775

public val RPC_X_WRONG_ES_VERSION: Int = 1828

public val RPC_X_WRONG_PIPE_ORDER: Int = 1831

public val RPC_X_WRONG_PIPE_VERSION: Int = 1832

public val RPC_X_WRONG_STUB_VERSION: Int = 1829

public val SCARD_E_BAD_SEEK: Hresult = 0x80100029u.toInt()

public val SCARD_E_CANCELLED: Hresult = 0x80100002u.toInt()

public val SCARD_E_CANT_DISPOSE: Hresult = 0x8010000Eu.toInt()

public val SCARD_E_CARD_UNSUPPORTED: Hresult = 0x8010001Cu.toInt()

public val SCARD_E_CERTIFICATE_UNAVAILABLE: Hresult = 0x8010002Du.toInt()

public val SCARD_E_COMM_DATA_LOST: Hresult = 0x8010002Fu.toInt()

public val SCARD_E_DIR_NOT_FOUND: Hresult = 0x80100023u.toInt()

public val SCARD_E_DUPLICATE_READER: Hresult = 0x8010001Bu.toInt()

public val SCARD_E_FILE_NOT_FOUND: Hresult = 0x80100024u.toInt()

public val SCARD_E_ICC_CREATEORDER: Hresult = 0x80100021u.toInt()

public val SCARD_E_ICC_INSTALLATION: Hresult = 0x80100020u.toInt()

public val SCARD_E_INSUFFICIENT_BUFFER: Hresult = 0x80100008u.toInt()

public val SCARD_E_INVALID_ATR: Hresult = 0x80100015u.toInt()

public val SCARD_E_INVALID_CHV: Hresult = 0x8010002Au.toInt()

public val SCARD_E_INVALID_HANDLE: Hresult = 0x80100003u.toInt()

public val SCARD_E_INVALID_PARAMETER: Hresult = 0x80100004u.toInt()

public val SCARD_E_INVALID_TARGET: Hresult = 0x80100005u.toInt()

public val SCARD_E_INVALID_VALUE: Hresult = 0x80100011u.toInt()

public val SCARD_E_NOT_READY: Hresult = 0x80100010u.toInt()

public val SCARD_E_NOT_TRANSACTED: Hresult = 0x80100016u.toInt()

public val SCARD_E_NO_ACCESS: Hresult = 0x80100027u.toInt()

public val SCARD_E_NO_DIR: Hresult = 0x80100025u.toInt()

public val SCARD_E_NO_FILE: Hresult = 0x80100026u.toInt()

public val SCARD_E_NO_KEY_CONTAINER: Hresult = 0x80100030u.toInt()

public val SCARD_E_NO_MEMORY: Hresult = 0x80100006u.toInt()

public val SCARD_E_NO_PIN_CACHE: Hresult = 0x80100033u.toInt()

public val SCARD_E_NO_READERS_AVAILABLE: Hresult = 0x8010002Eu.toInt()

public val SCARD_E_NO_SERVICE: Hresult = 0x8010001Du.toInt()

public val SCARD_E_NO_SMARTCARD: Hresult = 0x8010000Cu.toInt()

public val SCARD_E_NO_SUCH_CERTIFICATE: Hresult = 0x8010002Cu.toInt()

public val SCARD_E_PCI_TOO_SMALL: Hresult = 0x80100019u.toInt()

public val SCARD_E_PIN_CACHE_EXPIRED: Hresult = 0x80100032u.toInt()

public val SCARD_E_PROTO_MISMATCH: Hresult = 0x8010000Fu.toInt()

public val SCARD_E_READER_UNAVAILABLE: Hresult = 0x80100017u.toInt()

public val SCARD_E_READER_UNSUPPORTED: Hresult = 0x8010001Au.toInt()

public val SCARD_E_READ_ONLY_CARD: Hresult = 0x80100034u.toInt()

public val SCARD_E_SERVER_TOO_BUSY: Hresult = 0x80100031u.toInt()

public val SCARD_E_SERVICE_STOPPED: Hresult = 0x8010001Eu.toInt()

public val SCARD_E_SHARING_VIOLATION: Hresult = 0x8010000Bu.toInt()

public val SCARD_E_SYSTEM_CANCELLED: Hresult = 0x80100012u.toInt()

public val SCARD_E_TIMEOUT: Hresult = 0x8010000Au.toInt()

public val SCARD_E_UNEXPECTED: Hresult = 0x8010001Fu.toInt()

public val SCARD_E_UNKNOWN_CARD: Hresult = 0x8010000Du.toInt()

public val SCARD_E_UNKNOWN_READER: Hresult = 0x80100009u.toInt()

public val SCARD_E_UNKNOWN_RES_MNG: Hresult = 0x8010002Bu.toInt()

public val SCARD_E_UNSUPPORTED_FEATURE: Hresult = 0x80100022u.toInt()

public val SCARD_E_WRITE_TOO_MANY: Hresult = 0x80100028u.toInt()

public val SCARD_F_COMM_ERROR: Hresult = 0x80100013u.toInt()

public val SCARD_F_INTERNAL_ERROR: Hresult = 0x80100001u.toInt()

public val SCARD_F_UNKNOWN_ERROR: Hresult = 0x80100014u.toInt()

public val SCARD_F_WAITED_TOO_LONG: Hresult = 0x80100007u.toInt()

public val SCARD_P_SHUTDOWN: Hresult = 0x80100018u.toInt()

public val SCARD_W_CACHE_ITEM_NOT_FOUND: Hresult = 0x80100070u.toInt()

public val SCARD_W_CACHE_ITEM_STALE: Hresult = 0x80100071u.toInt()

public val SCARD_W_CACHE_ITEM_TOO_BIG: Hresult = 0x80100072u.toInt()

public val SCARD_W_CANCELLED_BY_USER: Hresult = 0x8010006Eu.toInt()

public val SCARD_W_CARD_NOT_AUTHENTICATED: Hresult = 0x8010006Fu.toInt()

public val SCARD_W_CHV_BLOCKED: Hresult = 0x8010006Cu.toInt()

public val SCARD_W_EOF: Hresult = 0x8010006Du.toInt()

public val SCARD_W_REMOVED_CARD: Hresult = 0x80100069u.toInt()

public val SCARD_W_RESET_CARD: Hresult = 0x80100068u.toInt()

public val SCARD_W_SECURITY_VIOLATION: Hresult = 0x8010006Au.toInt()

public val SCARD_W_UNPOWERED_CARD: Hresult = 0x80100067u.toInt()

public val SCARD_W_UNRESPONSIVE_CARD: Hresult = 0x80100066u.toInt()

public val SCARD_W_UNSUPPORTED_CARD: Hresult = 0x80100065u.toInt()

public val SCARD_W_WRONG_CHV: Hresult = 0x8010006Bu.toInt()

public val SCHED_E_ACCOUNT_DBASE_CORRUPT: Hresult = 0x80041311u.toInt()

public val SCHED_E_ACCOUNT_INFORMATION_NOT_SET: Hresult = 0x8004130Fu.toInt()

public val SCHED_E_ACCOUNT_NAME_NOT_FOUND: Hresult = 0x80041310u.toInt()

public val SCHED_E_ALREADY_RUNNING: Hresult = 0x8004131Fu.toInt()

public val SCHED_E_CANNOT_OPEN_TASK: Hresult = 0x8004130Du.toInt()

public val SCHED_E_DEPRECATED_FEATURE_USED: Hresult = 0x80041330u.toInt()

public val SCHED_E_INVALIDVALUE: Hresult = 0x80041318u.toInt()

public val SCHED_E_INVALID_TASK: Hresult = 0x8004130Eu.toInt()

public val SCHED_E_INVALID_TASK_HASH: Hresult = 0x80041321u.toInt()

public val SCHED_E_MALFORMEDXML: Hresult = 0x8004131Au.toInt()

public val SCHED_E_MISSINGNODE: Hresult = 0x80041319u.toInt()

public val SCHED_E_NAMESPACE: Hresult = 0x80041317u.toInt()

public val SCHED_E_NO_SECURITY_SERVICES: Hresult = 0x80041312u.toInt()

public val SCHED_E_PAST_END_BOUNDARY: Hresult = 0x8004131Eu.toInt()

public val SCHED_E_SERVICE_NOT_AVAILABLE: Hresult = 0x80041322u.toInt()

public val SCHED_E_SERVICE_NOT_INSTALLED: Hresult = 0x8004130Cu.toInt()

public val SCHED_E_SERVICE_NOT_LOCALSYSTEM: Int = 6200

public val SCHED_E_SERVICE_NOT_RUNNING: Hresult = 0x80041315u.toInt()

public val SCHED_E_SERVICE_TOO_BUSY: Hresult = 0x80041323u.toInt()

public val SCHED_E_START_ON_DEMAND: Hresult = 0x80041328u.toInt()

public val SCHED_E_TASK_ATTEMPTED: Hresult = 0x80041324u.toInt()

public val SCHED_E_TASK_DISABLED: Hresult = 0x80041326u.toInt()

public val SCHED_E_TASK_NOT_READY: Hresult = 0x8004130Au.toInt()

public val SCHED_E_TASK_NOT_RUNNING: Hresult = 0x8004130Bu.toInt()

public val SCHED_E_TASK_NOT_UBPM_COMPAT: Hresult = 0x80041329u.toInt()

public val SCHED_E_TASK_NOT_V1_COMPAT: Hresult = 0x80041327u.toInt()

public val SCHED_E_TOO_MANY_NODES: Hresult = 0x8004131Du.toInt()

public val SCHED_E_TRIGGER_NOT_FOUND: Hresult = 0x80041309u.toInt()

public val SCHED_E_UNEXPECTEDNODE: Hresult = 0x80041316u.toInt()

public val SCHED_E_UNKNOWN_OBJECT_VERSION: Hresult = 0x80041313u.toInt()

public val SCHED_E_UNSUPPORTED_ACCOUNT_OPTION: Hresult = 0x80041314u.toInt()

public val SCHED_E_USER_NOT_LOGGED_ON: Hresult = 0x80041320u.toInt()

public val SCHED_S_BATCH_LOGON_PROBLEM: Hresult = 0x4131Cu.toInt()

public val SCHED_S_EVENT_TRIGGER: Hresult = 0x41308u.toInt()

public val SCHED_S_SOME_TRIGGERS_FAILED: Hresult = 0x4131Bu.toInt()

public val SCHED_S_TASK_DISABLED: Hresult = 0x41302u.toInt()

public val SCHED_S_TASK_HAS_NOT_RUN: Hresult = 0x41303u.toInt()

public val SCHED_S_TASK_NOT_SCHEDULED: Hresult = 0x41305u.toInt()

public val SCHED_S_TASK_NO_MORE_RUNS: Hresult = 0x41304u.toInt()

public val SCHED_S_TASK_NO_VALID_TRIGGERS: Hresult = 0x41307u.toInt()

public val SCHED_S_TASK_QUEUED: Hresult = 0x41325u.toInt()

public val SCHED_S_TASK_READY: Hresult = 0x41300u.toInt()

public val SCHED_S_TASK_RUNNING: Hresult = 0x41301u.toInt()

public val SCHED_S_TASK_TERMINATED: Hresult = 0x41306u.toInt()

public val SDIAG_E_CANCELLED: Int = -2143551232

public val SDIAG_E_CANNOTRUN: Int = -2143551224

public val SDIAG_E_DISABLED: Int = -2143551226

public val SDIAG_E_MANAGEDHOST: Int = -2143551229

public val SDIAG_E_NOVERIFIER: Int = -2143551228

public val SDIAG_E_POWERSHELL: Int = -2143551230

public val SDIAG_E_RESOURCE: Int = -2143551222

public val SDIAG_E_ROOTCAUSE: Int = -2143551221

public val SDIAG_E_SCRIPT: Int = -2143551231

public val SDIAG_E_TRUST: Int = -2143551225

public val SDIAG_E_VERSION: Int = -2143551223

public val SDIAG_S_CANNOTRUN: Int = 3932421

public val SEARCH_E_NOMONIKER: Hresult = 0x800416A1u.toInt()

public val SEARCH_E_NOREGION: Hresult = 0x800416A2u.toInt()

public val SEARCH_S_NOMOREHITS: Hresult = 0x416A0u.toInt()

public val SEC_E_ALGORITHM_MISMATCH: Hresult = 0x80090331u.toInt()

public val SEC_E_APPLICATION_PROTOCOL_MISMATCH: Hresult = 0x80090367u.toInt()

public val SEC_E_BAD_BINDINGS: Hresult = 0x80090346u.toInt()

public val SEC_E_BAD_PKGID: Hresult = 0x80090316u.toInt()

public val SEC_E_BUFFER_TOO_SMALL: Hresult = 0x80090321u.toInt()

public val SEC_E_CANNOT_INSTALL: Hresult = 0x80090307u.toInt()

public val SEC_E_CANNOT_PACK: Hresult = 0x80090309u.toInt()

public val SEC_E_CERT_EXPIRED: Hresult = 0x80090328u.toInt()

public val SEC_E_CERT_UNKNOWN: Hresult = 0x80090327u.toInt()

public val SEC_E_CERT_WRONG_USAGE: Hresult = 0x80090349u.toInt()

public val SEC_E_CONTEXT_EXPIRED: Hresult = 0x80090317u.toInt()

public val SEC_E_CROSSREALM_DELEGATION_FAILURE: Hresult = 0x80090357u.toInt()

public val SEC_E_CRYPTO_SYSTEM_INVALID: Hresult = 0x80090337u.toInt()

public val SEC_E_DECRYPT_FAILURE: Hresult = 0x80090330u.toInt()

public val SEC_E_DELEGATION_POLICY: Hresult = 0x8009035Eu.toInt()

public val SEC_E_DELEGATION_REQUIRED: Hresult = 0x80090345u.toInt()

public val SEC_E_DOWNGRADE_DETECTED: Hresult = 0x80090350u.toInt()

public val SEC_E_ENCRYPT_FAILURE: Hresult = 0x80090329u.toInt()

public val SEC_E_EXT_BUFFER_TOO_SMALL: Hresult = 0x8009036Au.toInt()

public val SEC_E_ILLEGAL_MESSAGE: Hresult = 0x80090326u.toInt()

public val SEC_E_INCOMPLETE_CREDENTIALS: Hresult = 0x80090320u.toInt()

public val SEC_E_INCOMPLETE_MESSAGE: Hresult = 0x80090318u.toInt()

public val SEC_E_INSUFFICIENT_BUFFERS: Hresult = 0x8009036Bu.toInt()

public val SEC_E_INSUFFICIENT_MEMORY: Hresult = 0x80090300u.toInt()

public val SEC_E_INTERNAL_ERROR: Hresult = 0x80090304u.toInt()

public val SEC_E_INVALID_HANDLE: Hresult = 0x80090301u.toInt()

public val SEC_E_INVALID_PARAMETER: Hresult = 0x8009035Du.toInt()

public val SEC_E_INVALID_TOKEN: Hresult = 0x80090308u.toInt()

public val SEC_E_INVALID_UPN_NAME: Hresult = 0x80090369u.toInt()

public val SEC_E_ISSUING_CA_UNTRUSTED: Hresult = 0x80090352u.toInt()

public val SEC_E_ISSUING_CA_UNTRUSTED_KDC: Hresult = 0x80090359u.toInt()

public val SEC_E_KDC_CERT_EXPIRED: Hresult = 0x8009035Au.toInt()

public val SEC_E_KDC_CERT_REVOKED: Hresult = 0x8009035Bu.toInt()

public val SEC_E_KDC_INVALID_REQUEST: Hresult = 0x80090340u.toInt()

public val SEC_E_KDC_UNABLE_TO_REFER: Hresult = 0x80090341u.toInt()

public val SEC_E_KDC_UNKNOWN_ETYPE: Hresult = 0x80090342u.toInt()

public val SEC_E_LOGON_DENIED: Hresult = 0x8009030Cu.toInt()

public val SEC_E_MAX_REFERRALS_EXCEEDED: Hresult = 0x80090338u.toInt()

public val SEC_E_MESSAGE_ALTERED: Hresult = 0x8009030Fu.toInt()

public val SEC_E_MULTIPLE_ACCOUNTS: Hresult = 0x80090347u.toInt()

public val SEC_E_MUST_BE_KDC: Hresult = 0x80090339u.toInt()

public val SEC_E_MUTUAL_AUTH_FAILED: Hresult = 0x80090363u.toInt()

public val SEC_E_NOT_OWNER: Hresult = 0x80090306u.toInt()

public val SEC_E_NOT_SUPPORTED: Int = -2146893054

public val SEC_E_NO_AUTHENTICATING_AUTHORITY: Hresult = 0x80090311u.toInt()

public val SEC_E_NO_CONTEXT: Hresult = 0x80090361u.toInt()

public val SEC_E_NO_CREDENTIALS: Hresult = 0x8009030Eu.toInt()

public val SEC_E_NO_IMPERSONATION: Hresult = 0x8009030Bu.toInt()

public val SEC_E_NO_IP_ADDRESSES: Hresult = 0x80090335u.toInt()

public val SEC_E_NO_KERB_KEY: Hresult = 0x80090348u.toInt()

public val SEC_E_NO_PA_DATA: Hresult = 0x8009033Cu.toInt()

public val SEC_E_NO_S4U_PROT_SUPPORT: Hresult = 0x80090356u.toInt()

public val SEC_E_NO_SPM: Int = -2146893052

public val SEC_E_NO_TGT_REPLY: Hresult = 0x80090334u.toInt()

public val SEC_E_OK: Hresult = 0x0u.toInt()

public val SEC_E_ONLY_HTTPS_ALLOWED: Hresult = 0x80090365u.toInt()

public val SEC_E_OUT_OF_SEQUENCE: Hresult = 0x80090310u.toInt()

public val SEC_E_PKINIT_CLIENT_FAILURE: Hresult = 0x80090354u.toInt()

public val SEC_E_PKINIT_NAME_MISMATCH: Hresult = 0x8009033Du.toInt()

public val SEC_E_PKU2U_CERT_FAILURE: Hresult = 0x80090362u.toInt()

public val SEC_E_POLICY_NLTM_ONLY: Hresult = 0x8009035Fu.toInt()

public val SEC_E_QOP_NOT_SUPPORTED: Hresult = 0x8009030Au.toInt()

public val SEC_E_REVOCATION_OFFLINE_C: Hresult = 0x80090353u.toInt()

public val SEC_E_REVOCATION_OFFLINE_KDC: Hresult = 0x80090358u.toInt()

public val SEC_E_SECPKG_NOT_FOUND: Hresult = 0x80090305u.toInt()

public val SEC_E_SECURITY_QOS_FAILED: Hresult = 0x80090332u.toInt()

public val SEC_E_SHUTDOWN_IN_PROGRESS: Hresult = 0x8009033Fu.toInt()

public val SEC_E_SMARTCARD_CERT_EXPIRED: Hresult = 0x80090355u.toInt()

public val SEC_E_SMARTCARD_CERT_REVOKED: Hresult = 0x80090351u.toInt()

public val SEC_E_SMARTCARD_LOGON_REQUIRED: Hresult = 0x8009033Eu.toInt()

public val SEC_E_STRONG_CRYPTO_NOT_SUPPORTED: Hresult = 0x8009033Au.toInt()

public val SEC_E_TARGET_UNKNOWN: Hresult = 0x80090303u.toInt()

public val SEC_E_TIME_SKEW: Hresult = 0x80090324u.toInt()

public val SEC_E_TOO_MANY_PRINCIPALS: Hresult = 0x8009033Bu.toInt()

public val SEC_E_UNFINISHED_CONTEXT_DELETED: Hresult = 0x80090333u.toInt()

public val SEC_E_UNKNOWN_CREDENTIALS: Hresult = 0x8009030Du.toInt()

public val SEC_E_UNSUPPORTED_FUNCTION: Hresult = 0x80090302u.toInt()

public val SEC_E_UNSUPPORTED_PREAUTH: Hresult = 0x80090343u.toInt()

public val SEC_E_UNTRUSTED_ROOT: Hresult = 0x80090325u.toInt()

public val SEC_E_WRONG_CREDENTIAL_HANDLE: Hresult = 0x80090336u.toInt()

public val SEC_E_WRONG_PRINCIPAL: Hresult = 0x80090322u.toInt()

public val SEC_I_ASYNC_CALL_PENDING: Hresult = 0x90368u.toInt()

public val SEC_I_COMPLETE_AND_CONTINUE: Hresult = 0x90314u.toInt()

public val SEC_I_COMPLETE_NEEDED: Hresult = 0x90313u.toInt()

public val SEC_I_CONTEXT_EXPIRED: Hresult = 0x90317u.toInt()

public val SEC_I_CONTINUE_NEEDED: Hresult = 0x90312u.toInt()

public val SEC_I_CONTINUE_NEEDED_MESSAGE_OK: Hresult = 0x90366u.toInt()

public val SEC_I_GENERIC_EXTENSION_RECEIVED: Hresult = 0x90316u.toInt()

public val SEC_I_INCOMPLETE_CREDENTIALS: Hresult = 0x90320u.toInt()

public val SEC_I_LOCAL_LOGON: Hresult = 0x90315u.toInt()

public val SEC_I_MESSAGE_FRAGMENT: Hresult = 0x90364u.toInt()

public val SEC_I_NO_LSA_CONTEXT: Hresult = 0x90323u.toInt()

public val SEC_I_NO_RENEGOTIATION: Hresult = 0x90360u.toInt()

public val SEC_I_RENEGOTIATE: Hresult = 0x90321u.toInt()

public val SEC_I_SIGNATURE_NEEDED: Hresult = 0x9035Cu.toInt()

public val SEVERITY_ERROR: UInt = 1u

public val SEVERITY_SUCCESS: UInt = 0u

public val SPAPI_E_AUTHENTICODE_DISALLOWED: Hresult = 0x800F0240u.toInt()

public val SPAPI_E_AUTHENTICODE_PUBLISHER_NOT_TRUSTED: Hresult = 0x800F0243u.toInt()

public val SPAPI_E_AUTHENTICODE_TRUSTED_PUBLISHER: Hresult = 0x800F0241u.toInt()

public val SPAPI_E_AUTHENTICODE_TRUST_NOT_ESTABLISHED: Hresult = 0x800F0242u.toInt()

public val SPAPI_E_BAD_INTERFACE_INSTALLSECT: Hresult = 0x800F021Du.toInt()

public val SPAPI_E_BAD_SECTION_NAME_LINE: Hresult = 0x800F0001u.toInt()

public val SPAPI_E_BAD_SERVICE_INSTALLSECT: Hresult = 0x800F0217u.toInt()

public val SPAPI_E_CANT_LOAD_CLASS_ICON: Hresult = 0x800F020Cu.toInt()

public val SPAPI_E_CANT_REMOVE_DEVINST: Hresult = 0x800F0232u.toInt()

public val SPAPI_E_CLASS_MISMATCH: Hresult = 0x800F0201u.toInt()

public val SPAPI_E_DEVICE_INSTALLER_NOT_READY: Hresult = 0x800F0246u.toInt()

public val SPAPI_E_DEVICE_INSTALL_BLOCKED: Hresult = 0x800F0248u.toInt()

public val SPAPI_E_DEVICE_INTERFACE_ACTIVE: Hresult = 0x800F021Bu.toInt()

public val SPAPI_E_DEVICE_INTERFACE_REMOVED: Hresult = 0x800F021Cu.toInt()

public val SPAPI_E_DEVINFO_DATA_LOCKED: Hresult = 0x800F0213u.toInt()

public val SPAPI_E_DEVINFO_LIST_LOCKED: Hresult = 0x800F0212u.toInt()

public val SPAPI_E_DEVINFO_NOT_REGISTERED: Hresult = 0x800F0208u.toInt()

public val SPAPI_E_DEVINSTALL_QUEUE_NONNATIVE: Hresult = 0x800F0230u.toInt()

public val SPAPI_E_DEVINST_ALREADY_EXISTS: Hresult = 0x800F0207u.toInt()

public val SPAPI_E_DI_BAD_PATH: Hresult = 0x800F0214u.toInt()

public val SPAPI_E_DI_DONT_INSTALL: Hresult = 0x800F022Bu.toInt()

public val SPAPI_E_DI_DO_DEFAULT: Hresult = 0x800F020Eu.toInt()

public val SPAPI_E_DI_FUNCTION_OBSOLETE: Hresult = 0x800F023Eu.toInt()

public val SPAPI_E_DI_NOFILECOPY: Hresult = 0x800F020Fu.toInt()

public val SPAPI_E_DI_POSTPROCESSING_REQUIRED: Hresult = 0x800F0226u.toInt()

public val SPAPI_E_DRIVER_INSTALL_BLOCKED: Hresult = 0x800F0249u.toInt()

public val SPAPI_E_DRIVER_NONNATIVE: Hresult = 0x800F0234u.toInt()

public val SPAPI_E_DRIVER_STORE_ADD_FAILED: Hresult = 0x800F0247u.toInt()

public val SPAPI_E_DRIVER_STORE_DELETE_FAILED: Hresult = 0x800F024Cu.toInt()

public val SPAPI_E_DUPLICATE_FOUND: Hresult = 0x800F0202u.toInt()

public val SPAPI_E_ERROR_NOT_INSTALLED: Hresult = 0x800F1000u.toInt()

public val SPAPI_E_EXPECTED_SECTION_NAME: Hresult = 0x800F0000u.toInt()

public val SPAPI_E_FILEQUEUE_LOCKED: Hresult = 0x800F0216u.toInt()

public val SPAPI_E_FILE_HASH_NOT_IN_CATALOG: Hresult = 0x800F024Bu.toInt()

public val SPAPI_E_GENERAL_SYNTAX: Hresult = 0x800F0003u.toInt()

public val SPAPI_E_INCORRECTLY_COPIED_INF: Hresult = 0x800F0237u.toInt()

public val SPAPI_E_INF_IN_USE_BY_DEVICES: Hresult = 0x800F023Du.toInt()

public val SPAPI_E_INVALID_CLASS: Hresult = 0x800F0206u.toInt()

public val SPAPI_E_INVALID_CLASS_INSTALLER: Hresult = 0x800F020Du.toInt()

public val SPAPI_E_INVALID_COINSTALLER: Hresult = 0x800F0227u.toInt()

public val SPAPI_E_INVALID_DEVINST_NAME: Hresult = 0x800F0205u.toInt()

public val SPAPI_E_INVALID_FILTER_DRIVER: Hresult = 0x800F022Cu.toInt()

public val SPAPI_E_INVALID_HWPROFILE: Hresult = 0x800F0210u.toInt()

public val SPAPI_E_INVALID_INF_LOGCONFIG: Hresult = 0x800F022Au.toInt()

public val SPAPI_E_INVALID_MACHINENAME: Hresult = 0x800F0220u.toInt()

public val SPAPI_E_INVALID_PROPPAGE_PROVIDER: Hresult = 0x800F0224u.toInt()

public val SPAPI_E_INVALID_REFERENCE_STRING: Hresult = 0x800F021Fu.toInt()

public val SPAPI_E_INVALID_REG_PROPERTY: Hresult = 0x800F0209u.toInt()

public val SPAPI_E_INVALID_TARGET: Hresult = 0x800F0233u.toInt()

public val SPAPI_E_IN_WOW64: Hresult = 0x800F0235u.toInt()

public val SPAPI_E_KEY_DOES_NOT_EXIST: Hresult = 0x800F0204u.toInt()

public val SPAPI_E_LINE_NOT_FOUND: Hresult = 0x800F0102u.toInt()

public val SPAPI_E_MACHINE_UNAVAILABLE: Hresult = 0x800F0222u.toInt()

public val SPAPI_E_NON_WINDOWS_DRIVER: Hresult = 0x800F022Eu.toInt()

public val SPAPI_E_NON_WINDOWS_NT_DRIVER: Hresult = 0x800F022Du.toInt()

public val SPAPI_E_NOT_AN_INSTALLED_OEM_INF: Hresult = 0x800F023Cu.toInt()

public val SPAPI_E_NOT_DISABLEABLE: Hresult = 0x800F0231u.toInt()

public val SPAPI_E_NO_ASSOCIATED_CLASS: Hresult = 0x800F0200u.toInt()

public val SPAPI_E_NO_ASSOCIATED_SERVICE: Hresult = 0x800F0219u.toInt()

public val SPAPI_E_NO_AUTHENTICODE_CATALOG: Hresult = 0x800F023Fu.toInt()

public val SPAPI_E_NO_BACKUP: Hresult = 0x800F0103u.toInt()

public val SPAPI_E_NO_CATALOG_FOR_OEM_INF: Hresult = 0x800F022Fu.toInt()

public val SPAPI_E_NO_CLASSINSTALL_PARAMS: Hresult = 0x800F0215u.toInt()

public val SPAPI_E_NO_CLASS_DRIVER_LIST: Hresult = 0x800F0218u.toInt()

public val SPAPI_E_NO_COMPAT_DRIVERS: Hresult = 0x800F0228u.toInt()

public val SPAPI_E_NO_CONFIGMGR_SERVICES: Hresult = 0x800F0223u.toInt()

public val SPAPI_E_NO_DEFAULT_DEVICE_INTERFACE: Hresult = 0x800F021Au.toInt()

public val SPAPI_E_NO_DEVICE_ICON: Hresult = 0x800F0229u.toInt()

public val SPAPI_E_NO_DEVICE_SELECTED: Hresult = 0x800F0211u.toInt()

public val SPAPI_E_NO_DRIVER_SELECTED: Hresult = 0x800F0203u.toInt()

public val SPAPI_E_NO_INF: Hresult = 0x800F020Au.toInt()

public val SPAPI_E_NO_SUCH_DEVICE_INTERFACE: Hresult = 0x800F0225u.toInt()

public val SPAPI_E_NO_SUCH_DEVINST: Hresult = 0x800F020Bu.toInt()

public val SPAPI_E_NO_SUCH_INTERFACE_CLASS: Hresult = 0x800F021Eu.toInt()

public val SPAPI_E_ONLY_VALIDATE_VIA_AUTHENTICODE: Hresult = 0x800F0245u.toInt()

public val SPAPI_E_PNP_REGISTRY_ERROR: Hresult = 0x800F023Au.toInt()

public val SPAPI_E_REMOTE_COMM_FAILURE: Hresult = 0x800F0221u.toInt()

public val SPAPI_E_REMOTE_REQUEST_UNSUPPORTED: Hresult = 0x800F023Bu.toInt()

public val SPAPI_E_SCE_DISABLED: Hresult = 0x800F0238u.toInt()

public val SPAPI_E_SECTION_NAME_TOO_LONG: Hresult = 0x800F0002u.toInt()

public val SPAPI_E_SECTION_NOT_FOUND: Hresult = 0x800F0101u.toInt()

public val SPAPI_E_SET_SYSTEM_RESTORE_POINT: Hresult = 0x800F0236u.toInt()

public val SPAPI_E_SIGNATURE_OSATTRIBUTE_MISMATCH: Hresult = 0x800F0244u.toInt()

public val SPAPI_E_UNKNOWN_EXCEPTION: Hresult = 0x800F0239u.toInt()

public val SPAPI_E_UNRECOVERABLE_STACK_OVERFLOW: Hresult = 0x800F0300u.toInt()

public val SPAPI_E_WRONG_INF_STYLE: Hresult = 0x800F0100u.toInt()

public val SPAPI_E_WRONG_INF_TYPE: Hresult = 0x800F024Au.toInt()

public val SQLITE_E_ABORT: Hresult = 0x87AF0004u.toInt()

public val SQLITE_E_ABORT_ROLLBACK: Hresult = 0x87AF0204u.toInt()

public val SQLITE_E_AUTH: Hresult = 0x87AF0017u.toInt()

public val SQLITE_E_BUSY: Hresult = 0x87AF0005u.toInt()

public val SQLITE_E_BUSY_RECOVERY: Hresult = 0x87AF0105u.toInt()

public val SQLITE_E_BUSY_SNAPSHOT: Hresult = 0x87AF0205u.toInt()

public val SQLITE_E_CANTOPEN: Hresult = 0x87AF000Eu.toInt()

public val SQLITE_E_CANTOPEN_CONVPATH: Hresult = 0x87AF040Eu.toInt()

public val SQLITE_E_CANTOPEN_FULLPATH: Hresult = 0x87AF030Eu.toInt()

public val SQLITE_E_CANTOPEN_ISDIR: Hresult = 0x87AF020Eu.toInt()

public val SQLITE_E_CANTOPEN_NOTEMPDIR: Hresult = 0x87AF010Eu.toInt()

public val SQLITE_E_CONSTRAINT: Hresult = 0x87AF0013u.toInt()

public val SQLITE_E_CONSTRAINT_CHECK: Hresult = 0x87AF0113u.toInt()

public val SQLITE_E_CONSTRAINT_COMMITHOOK: Hresult = 0x87AF0213u.toInt()

public val SQLITE_E_CONSTRAINT_FOREIGNKEY: Hresult = 0x87AF0313u.toInt()

public val SQLITE_E_CONSTRAINT_FUNCTION: Hresult = 0x87AF0413u.toInt()

public val SQLITE_E_CONSTRAINT_NOTNULL: Hresult = 0x87AF0513u.toInt()

public val SQLITE_E_CONSTRAINT_PRIMARYKEY: Hresult = 0x87AF0613u.toInt()

public val SQLITE_E_CONSTRAINT_ROWID: Hresult = 0x87AF0A13u.toInt()

public val SQLITE_E_CONSTRAINT_TRIGGER: Hresult = 0x87AF0713u.toInt()

public val SQLITE_E_CONSTRAINT_UNIQUE: Hresult = 0x87AF0813u.toInt()

public val SQLITE_E_CONSTRAINT_VTAB: Hresult = 0x87AF0913u.toInt()

public val SQLITE_E_CORRUPT: Hresult = 0x87AF000Bu.toInt()

public val SQLITE_E_CORRUPT_VTAB: Hresult = 0x87AF010Bu.toInt()

public val SQLITE_E_DONE: Hresult = 0x87AF0065u.toInt()

public val SQLITE_E_EMPTY: Hresult = 0x87AF0010u.toInt()

public val SQLITE_E_ERROR: Hresult = 0x87AF0001u.toInt()

public val SQLITE_E_FORMAT: Hresult = 0x87AF0018u.toInt()

public val SQLITE_E_FULL: Hresult = 0x87AF000Du.toInt()

public val SQLITE_E_INTERNAL: Hresult = 0x87AF0002u.toInt()

public val SQLITE_E_INTERRUPT: Hresult = 0x87AF0009u.toInt()

public val SQLITE_E_IOERR: Hresult = 0x87AF000Au.toInt()

public val SQLITE_E_IOERR_ACCESS: Hresult = 0x87AF0D0Au.toInt()

public val SQLITE_E_IOERR_AUTH: Hresult = 0x87AF1A03u.toInt()

public val SQLITE_E_IOERR_BLOCKED: Hresult = 0x87AF0B0Au.toInt()

public val SQLITE_E_IOERR_CHECKRESERVEDLOCK: Hresult = 0x87AF0E0Au.toInt()

public val SQLITE_E_IOERR_CLOSE: Hresult = 0x87AF100Au.toInt()

public val SQLITE_E_IOERR_CONVPATH: Hresult = 0x87AF1A0Au.toInt()

public val SQLITE_E_IOERR_DELETE: Hresult = 0x87AF0A0Au.toInt()

public val SQLITE_E_IOERR_DELETE_NOENT: Hresult = 0x87AF170Au.toInt()

public val SQLITE_E_IOERR_DIR_CLOSE: Hresult = 0x87AF110Au.toInt()

public val SQLITE_E_IOERR_DIR_FSYNC: Hresult = 0x87AF050Au.toInt()

public val SQLITE_E_IOERR_FSTAT: Hresult = 0x87AF070Au.toInt()

public val SQLITE_E_IOERR_FSYNC: Hresult = 0x87AF040Au.toInt()

public val SQLITE_E_IOERR_GETTEMPPATH: Hresult = 0x87AF190Au.toInt()

public val SQLITE_E_IOERR_LOCK: Hresult = 0x87AF0F0Au.toInt()

public val SQLITE_E_IOERR_MMAP: Hresult = 0x87AF180Au.toInt()

public val SQLITE_E_IOERR_NOMEM: Hresult = 0x87AF0C0Au.toInt()

public val SQLITE_E_IOERR_RDLOCK: Hresult = 0x87AF090Au.toInt()

public val SQLITE_E_IOERR_READ: Hresult = 0x87AF010Au.toInt()

public val SQLITE_E_IOERR_SEEK: Hresult = 0x87AF160Au.toInt()

public val SQLITE_E_IOERR_SHMLOCK: Hresult = 0x87AF140Au.toInt()

public val SQLITE_E_IOERR_SHMMAP: Hresult = 0x87AF150Au.toInt()

public val SQLITE_E_IOERR_SHMOPEN: Hresult = 0x87AF120Au.toInt()

public val SQLITE_E_IOERR_SHMSIZE: Hresult = 0x87AF130Au.toInt()

public val SQLITE_E_IOERR_SHORT_READ: Hresult = 0x87AF020Au.toInt()

public val SQLITE_E_IOERR_TRUNCATE: Hresult = 0x87AF060Au.toInt()

public val SQLITE_E_IOERR_UNLOCK: Hresult = 0x87AF080Au.toInt()

public val SQLITE_E_IOERR_VNODE: Hresult = 0x87AF1A02u.toInt()

public val SQLITE_E_IOERR_WRITE: Hresult = 0x87AF030Au.toInt()

public val SQLITE_E_LOCKED: Hresult = 0x87AF0006u.toInt()

public val SQLITE_E_LOCKED_SHAREDCACHE: Hresult = 0x87AF0106u.toInt()

public val SQLITE_E_MISMATCH: Hresult = 0x87AF0014u.toInt()

public val SQLITE_E_MISUSE: Hresult = 0x87AF0015u.toInt()

public val SQLITE_E_NOLFS: Hresult = 0x87AF0016u.toInt()

public val SQLITE_E_NOMEM: Hresult = 0x87AF0007u.toInt()

public val SQLITE_E_NOTADB: Hresult = 0x87AF001Au.toInt()

public val SQLITE_E_NOTFOUND: Hresult = 0x87AF000Cu.toInt()

public val SQLITE_E_NOTICE: Hresult = 0x87AF001Bu.toInt()

public val SQLITE_E_NOTICE_RECOVER_ROLLBACK: Hresult = 0x87AF021Bu.toInt()

public val SQLITE_E_NOTICE_RECOVER_WAL: Hresult = 0x87AF011Bu.toInt()

public val SQLITE_E_PERM: Hresult = 0x87AF0003u.toInt()

public val SQLITE_E_PROTOCOL: Hresult = 0x87AF000Fu.toInt()

public val SQLITE_E_RANGE: Hresult = 0x87AF0019u.toInt()

public val SQLITE_E_READONLY: Hresult = 0x87AF0008u.toInt()

public val SQLITE_E_READONLY_CANTLOCK: Hresult = 0x87AF0208u.toInt()

public val SQLITE_E_READONLY_DBMOVED: Hresult = 0x87AF0408u.toInt()

public val SQLITE_E_READONLY_RECOVERY: Hresult = 0x87AF0108u.toInt()

public val SQLITE_E_READONLY_ROLLBACK: Hresult = 0x87AF0308u.toInt()

public val SQLITE_E_ROW: Hresult = 0x87AF0064u.toInt()

public val SQLITE_E_SCHEMA: Hresult = 0x87AF0011u.toInt()

public val SQLITE_E_TOOBIG: Hresult = 0x87AF0012u.toInt()

public val SQLITE_E_WARNING: Hresult = 0x87AF001Cu.toInt()

public val SQLITE_E_WARNING_AUTOINDEX: Hresult = 0x87AF011Cu.toInt()

public val STATEREPOSITORY_ERROR_CACHE_CORRUPTED: Hresult = 0x80670012u.toInt()

public val STATEREPOSITORY_ERROR_DICTIONARY_CORRUPTED: Hresult = 0x80670005u.toInt()

public val STATEREPOSITORY_E_BLOCKED: Hresult = 0x80670006u.toInt()

public val STATEREPOSITORY_E_BUSY_RECOVERY_RETRY: Hresult = 0x80670008u.toInt()

public val STATEREPOSITORY_E_BUSY_RECOVERY_TIMEOUT_EXCEEDED: Hresult = 0x8067000Du.toInt()

public val STATEREPOSITORY_E_BUSY_RETRY: Hresult = 0x80670007u.toInt()

public val STATEREPOSITORY_E_BUSY_TIMEOUT_EXCEEDED: Hresult = 0x8067000Cu.toInt()

public val STATEREPOSITORY_E_CACHE_NOT_INIITALIZED: Hresult = 0x80670015u.toInt()

public val STATEREPOSITORY_E_CONCURRENCY_LOCKING_FAILURE: Hresult = 0x80670001u.toInt()

public val STATEREPOSITORY_E_CONFIGURATION_INVALID: Hresult = 0x80670003u.toInt()

public val STATEREPOSITORY_E_DEPENDENCY_NOT_RESOLVED: Hresult = 0x80670016u.toInt()

public val STATEREPOSITORY_E_LOCKED_RETRY: Hresult = 0x80670009u.toInt()

public val STATEREPOSITORY_E_LOCKED_SHAREDCACHE_RETRY: Hresult = 0x8067000Au.toInt()

public val STATEREPOSITORY_E_LOCKED_SHAREDCACHE_TIMEOUT_EXCEEDED: Hresult = 0x8067000Fu.toInt()

public val STATEREPOSITORY_E_LOCKED_TIMEOUT_EXCEEDED: Hresult = 0x8067000Eu.toInt()

public val STATEREPOSITORY_E_SERVICE_STOP_IN_PROGRESS: Hresult = 0x80670010u.toInt()

public val STATEREPOSITORY_E_STATEMENT_INPROGRESS: Hresult = 0x80670002u.toInt()

public val STATEREPOSITORY_E_TRANSACTION_REQUIRED: Hresult = 0x8067000Bu.toInt()

public val STATEREPOSITORY_E_UNKNOWN_SCHEMA_VERSION: Hresult = 0x80670004u.toInt()

public val STATEREPOSITORY_TRANSACTION_CALLER_ID_CHANGED: Hresult = 0x670013u.toInt()

public val STATEREPOSITORY_TRANSACTION_IN_PROGRESS: Hresult = 0x80670014u.toInt()

public val STATEREPOSTORY_E_NESTED_TRANSACTION_NOT_SUPPORTED: Hresult = 0x80670011u.toInt()

public val STATUS_ABANDONED: Ntstatus = 0x80u.toInt()

public val STATUS_ABANDONED_WAIT_0: Ntstatus = 0x80u.toInt()

public val STATUS_ABANDONED_WAIT_63: Ntstatus = 0xBFu.toInt()

public val STATUS_ABANDON_HIBERFILE: Ntstatus = 0x40000033u.toInt()

public val STATUS_ABIOS_INVALID_COMMAND: Ntstatus = 0xC0000113u.toInt()

public val STATUS_ABIOS_INVALID_LID: Ntstatus = 0xC0000114u.toInt()

public val STATUS_ABIOS_INVALID_SELECTOR: Ntstatus = 0xC0000116u.toInt()

public val STATUS_ABIOS_LID_ALREADY_OWNED: Ntstatus = 0xC0000111u.toInt()

public val STATUS_ABIOS_LID_NOT_EXIST: Ntstatus = 0xC0000110u.toInt()

public val STATUS_ABIOS_NOT_LID_OWNER: Ntstatus = 0xC0000112u.toInt()

public val STATUS_ABIOS_NOT_PRESENT: Ntstatus = 0xC000010Fu.toInt()

public val STATUS_ABIOS_SELECTOR_NOT_AVAILABLE: Ntstatus = 0xC0000115u.toInt()

public val STATUS_ACCESS_AUDIT_BY_POLICY: Ntstatus = 0x40000032u.toInt()

public val STATUS_ACCESS_DENIED: Ntstatus = 0xC0000022u.toInt()

public val STATUS_ACCESS_DISABLED_BY_POLICY_DEFAULT: Ntstatus = 0xC0000361u.toInt()

public val STATUS_ACCESS_DISABLED_BY_POLICY_OTHER: Ntstatus = 0xC0000364u.toInt()

public val STATUS_ACCESS_DISABLED_BY_POLICY_PATH: Ntstatus = 0xC0000362u.toInt()

public val STATUS_ACCESS_DISABLED_BY_POLICY_PUBLISHER: Ntstatus = 0xC0000363u.toInt()

public val STATUS_ACCESS_DISABLED_NO_SAFER_UI_BY_POLICY: Ntstatus = 0xC0000372u.toInt()

public val STATUS_ACCESS_VIOLATION: Ntstatus = 0xC0000005u.toInt()

public val STATUS_ACPI_ACQUIRE_GLOBAL_LOCK: Ntstatus = 0xC0140012u.toInt()

public val STATUS_ACPI_ADDRESS_NOT_MAPPED: Ntstatus = 0xC014000Cu.toInt()

public val STATUS_ACPI_ALREADY_INITIALIZED: Ntstatus = 0xC0140013u.toInt()

public val STATUS_ACPI_ASSERT_FAILED: Ntstatus = 0xC0140003u.toInt()

public val STATUS_ACPI_FATAL: Ntstatus = 0xC0140006u.toInt()

public val STATUS_ACPI_HANDLER_COLLISION: Ntstatus = 0xC014000Eu.toInt()

public val STATUS_ACPI_INCORRECT_ARGUMENT_COUNT: Ntstatus = 0xC014000Bu.toInt()

public val STATUS_ACPI_INVALID_ACCESS_SIZE: Ntstatus = 0xC0140011u.toInt()

public val STATUS_ACPI_INVALID_ARGTYPE: Ntstatus = 0xC0140008u.toInt()

public val STATUS_ACPI_INVALID_ARGUMENT: Ntstatus = 0xC0140005u.toInt()

public val STATUS_ACPI_INVALID_DATA: Ntstatus = 0xC014000Fu.toInt()

public val STATUS_ACPI_INVALID_EVENTTYPE: Ntstatus = 0xC014000Du.toInt()

public val STATUS_ACPI_INVALID_INDEX: Ntstatus = 0xC0140004u.toInt()

public val STATUS_ACPI_INVALID_MUTEX_LEVEL: Ntstatus = 0xC0140015u.toInt()

public val STATUS_ACPI_INVALID_OBJTYPE: Ntstatus = 0xC0140009u.toInt()

public val STATUS_ACPI_INVALID_OPCODE: Ntstatus = 0xC0140001u.toInt()

public val STATUS_ACPI_INVALID_REGION: Ntstatus = 0xC0140010u.toInt()

public val STATUS_ACPI_INVALID_SUPERNAME: Ntstatus = 0xC0140007u.toInt()

public val STATUS_ACPI_INVALID_TABLE: Ntstatus = 0xC0140019u.toInt()

public val STATUS_ACPI_INVALID_TARGETTYPE: Ntstatus = 0xC014000Au.toInt()

public val STATUS_ACPI_MUTEX_NOT_OWNED: Ntstatus = 0xC0140016u.toInt()

public val STATUS_ACPI_MUTEX_NOT_OWNER: Ntstatus = 0xC0140017u.toInt()

public val STATUS_ACPI_NOT_INITIALIZED: Ntstatus = 0xC0140014u.toInt()

public val STATUS_ACPI_POWER_REQUEST_FAILED: Ntstatus = 0xC0140021u.toInt()

public val STATUS_ACPI_REG_HANDLER_FAILED: Ntstatus = 0xC0140020u.toInt()

public val STATUS_ACPI_RS_ACCESS: Ntstatus = 0xC0140018u.toInt()

public val STATUS_ACPI_STACK_OVERFLOW: Ntstatus = 0xC0140002u.toInt()

public val STATUS_ADAPTER_HARDWARE_ERROR: Ntstatus = 0xC00000C2u.toInt()

public val STATUS_ADDRESS_ALREADY_ASSOCIATED: Ntstatus = 0xC0000238u.toInt()

public val STATUS_ADDRESS_ALREADY_EXISTS: Ntstatus = 0xC000020Au.toInt()

public val STATUS_ADDRESS_CLOSED: Ntstatus = 0xC000020Bu.toInt()

public val STATUS_ADDRESS_NOT_ASSOCIATED: Ntstatus = 0xC0000239u.toInt()

public val STATUS_ADMINLESS_ACCESS_DENIED: Ntstatus = 0xC000A204u.toInt()

public val STATUS_ADVANCED_INSTALLER_FAILED: Ntstatus = 0xC0150020u.toInt()

public val STATUS_AGENTS_EXHAUSTED: Ntstatus = 0xC0000085u.toInt()

public val STATUS_ALERTED: Ntstatus = 0x101u.toInt()

public val STATUS_ALIAS_EXISTS: Ntstatus = 0xC0000154u.toInt()

public val STATUS_ALLOCATE_BUCKET: Ntstatus = 0xC000022Fu.toInt()

public val STATUS_ALLOTTED_SPACE_EXCEEDED: Ntstatus = 0xC0000099u.toInt()

public val STATUS_ALL_SIDS_FILTERED: Ntstatus = 0xC000035Eu.toInt()

public val STATUS_ALL_USER_TRUST_QUOTA_EXCEEDED: Ntstatus = 0xC0000402u.toInt()

public val STATUS_ALPC_CHECK_COMPLETION_LIST: Ntstatus = 0x40000030u.toInt()

public val STATUS_ALREADY_COMMITTED: Ntstatus = 0xC0000021u.toInt()

public val STATUS_ALREADY_COMPLETE: Ntstatus = 0xFFu.toInt()

public val STATUS_ALREADY_DISCONNECTED: Ntstatus = 0x80000025u.toInt()

public val STATUS_ALREADY_HAS_STREAM_ID: Ntstatus = 0xC000050Eu.toInt()

public val STATUS_ALREADY_INITIALIZED: Ntstatus = 0xC0000510u.toInt()

public val STATUS_ALREADY_REGISTERED: Ntstatus = 0xC0000718u.toInt()

public val STATUS_ALREADY_WIN32: Ntstatus = 0x4000001Bu.toInt()

public val STATUS_AMBIGUOUS_SYSTEM_DEVICE: Ntstatus = 0xC0000451u.toInt()

public val STATUS_APC_RETURNED_WHILE_IMPERSONATING: Ntstatus = 0xC0000711u.toInt()

public val STATUS_APISET_NOT_HOSTED: Ntstatus = 0xC0000481u.toInt()

public val STATUS_APISET_NOT_PRESENT: Ntstatus = 0xC0000482u.toInt()

public val STATUS_APPEXEC_APP_COMPAT_BLOCK: Ntstatus = 0xC0EC0008u.toInt()

public val STATUS_APPEXEC_CALLER_WAIT_TIMEOUT: Ntstatus = 0xC0EC0009u.toInt()

public val STATUS_APPEXEC_CALLER_WAIT_TIMEOUT_LICENSING: Ntstatus = 0xC0EC000Bu.toInt()

public val STATUS_APPEXEC_CALLER_WAIT_TIMEOUT_RESOURCES: Ntstatus = 0xC0EC000Cu.toInt()

public val STATUS_APPEXEC_CALLER_WAIT_TIMEOUT_TERMINATION: Ntstatus = 0xC0EC000Au.toInt()

public val STATUS_APPEXEC_CONDITION_NOT_SATISFIED: Ntstatus = 0xC0EC0000u.toInt()

public val STATUS_APPEXEC_HANDLE_INVALIDATED: Ntstatus = 0xC0EC0001u.toInt()

public val STATUS_APPEXEC_HOST_ID_MISMATCH: Ntstatus = 0xC0EC0006u.toInt()

public val STATUS_APPEXEC_INVALID_HOST_GENERATION: Ntstatus = 0xC0EC0002u.toInt()

public val STATUS_APPEXEC_INVALID_HOST_STATE: Ntstatus = 0xC0EC0004u.toInt()

public val STATUS_APPEXEC_NO_DONOR: Ntstatus = 0xC0EC0005u.toInt()

public val STATUS_APPEXEC_UNEXPECTED_PROCESS_REGISTRATION: Ntstatus = 0xC0EC0003u.toInt()

public val STATUS_APPEXEC_UNKNOWN_USER: Ntstatus = 0xC0EC0007u.toInt()

public val STATUS_APPHELP_BLOCK: Ntstatus = 0xC000035Du.toInt()

public val STATUS_APPX_FILE_NOT_ENCRYPTED: Ntstatus = 0xC00004A6u.toInt()

public val STATUS_APPX_INTEGRITY_FAILURE_CLR_NGEN: Ntstatus = 0xC000047Fu.toInt()

public val STATUS_APP_DATA_CORRUPT: Ntstatus = 0xC000A283u.toInt()

public val STATUS_APP_DATA_EXPIRED: Ntstatus = 0xC000A282u.toInt()

public val STATUS_APP_DATA_LIMIT_EXCEEDED: Ntstatus = 0xC000A284u.toInt()

public val STATUS_APP_DATA_NOT_FOUND: Ntstatus = 0xC000A281u.toInt()

public val STATUS_APP_DATA_REBOOT_REQUIRED: Ntstatus = 0xC000A285u.toInt()

public val STATUS_APP_INIT_FAILURE: Ntstatus = 0xC0000145u.toInt()

public val STATUS_ARBITRATION_UNHANDLED: Ntstatus = 0x40000026u.toInt()

public val STATUS_ARRAY_BOUNDS_EXCEEDED: Ntstatus = 0xC000008Cu.toInt()

public val STATUS_ASSERTION_FAILURE: Ntstatus = 0xC0000420u.toInt()

public val STATUS_ATTACHED_EXECUTABLE_MEMORY_WRITE: Ntstatus = 0xC0000725u.toInt()

public val STATUS_ATTRIBUTE_NOT_PRESENT: Ntstatus = 0xC000050Cu.toInt()

public val STATUS_AUDIO_ENGINE_NODE_NOT_FOUND: Ntstatus = 0xC0440001u.toInt()

public val STATUS_AUDITING_DISABLED: Ntstatus = 0xC0000356u.toInt()

public val STATUS_AUDIT_FAILED: Ntstatus = 0xC0000244u.toInt()

public val STATUS_AUTHIP_FAILURE: Ntstatus = 0xC000A086u.toInt()

public val STATUS_AUTH_TAG_MISMATCH: Ntstatus = 0xC000A002u.toInt()

public val STATUS_BACKUP_CONTROLLER: Ntstatus = 0xC0000187u.toInt()

public val STATUS_BAD_BINDINGS: Ntstatus = 0xC000035Bu.toInt()

public val STATUS_BAD_CLUSTERS: Ntstatus = 0xC0000805u.toInt()

public val STATUS_BAD_COMPRESSION_BUFFER: Ntstatus = 0xC0000242u.toInt()

public val STATUS_BAD_CURRENT_DIRECTORY: Ntstatus = 0x40000007u.toInt()

public val STATUS_BAD_DATA: Ntstatus = 0xC000090Bu.toInt()

public val STATUS_BAD_DESCRIPTOR_FORMAT: Ntstatus = 0xC00000E7u.toInt()

public val STATUS_BAD_DEVICE_TYPE: Ntstatus = 0xC00000CBu.toInt()

public val STATUS_BAD_DLL_ENTRYPOINT: Ntstatus = 0xC0000251u.toInt()

public val STATUS_BAD_FILE_TYPE: Ntstatus = 0xC0000903u.toInt()

public val STATUS_BAD_FUNCTION_TABLE: Ntstatus = 0xC00000FFu.toInt()

public val STATUS_BAD_IMPERSONATION_LEVEL: Ntstatus = 0xC00000A5u.toInt()

public val STATUS_BAD_INHERITANCE_ACL: Ntstatus = 0xC000007Du.toInt()

public val STATUS_BAD_INITIAL_PC: Ntstatus = 0xC000000Au.toInt()

public val STATUS_BAD_INITIAL_STACK: Ntstatus = 0xC0000009u.toInt()

public val STATUS_BAD_KEY: Ntstatus = 0xC000090Au.toInt()

public val STATUS_BAD_LOGON_SESSION_STATE: Ntstatus = 0xC0000104u.toInt()

public val STATUS_BAD_MASTER_BOOT_RECORD: Ntstatus = 0xC00000A9u.toInt()

public val STATUS_BAD_MCFG_TABLE: Ntstatus = 0xC0000908u.toInt()

public val STATUS_BAD_NETWORK_NAME: Ntstatus = 0xC00000CCu.toInt()

public val STATUS_BAD_NETWORK_PATH: Ntstatus = 0xC00000BEu.toInt()

public val STATUS_BAD_REMOTE_ADAPTER: Ntstatus = 0xC00000C5u.toInt()

public val STATUS_BAD_SERVICE_ENTRYPOINT: Ntstatus = 0xC0000252u.toInt()

public val STATUS_BAD_STACK: Ntstatus = 0xC0000028u.toInt()

public val STATUS_BAD_TOKEN_TYPE: Ntstatus = 0xC00000A8u.toInt()

public val STATUS_BAD_VALIDATION_CLASS: Ntstatus = 0xC00000A7u.toInt()

public val STATUS_BAD_WORKING_SET_LIMIT: Ntstatus = 0xC000004Cu.toInt()

public val STATUS_BCD_NOT_ALL_ENTRIES_IMPORTED: Ntstatus = 0x80390001u.toInt()

public val STATUS_BCD_NOT_ALL_ENTRIES_SYNCHRONIZED: Ntstatus = 0x80390003u.toInt()

public val STATUS_BCD_TOO_MANY_ELEMENTS: Ntstatus = 0xC0390002u.toInt()

public val STATUS_BEGINNING_OF_MEDIA: Ntstatus = 0x8000001Fu.toInt()

public val STATUS_BEYOND_VDL: Ntstatus = 0xC0000432u.toInt()

public val STATUS_BIOS_FAILED_TO_CONNECT_INTERRUPT: Ntstatus = 0xC000016Eu.toInt()

public val STATUS_BIZRULES_NOT_ENABLED: Ntstatus = 0x40000034u.toInt()

public val STATUS_BLOCKED_BY_PARENTAL_CONTROLS: Ntstatus = 0xC0000488u.toInt()

public val STATUS_BLOCK_SHARED: Ntstatus = 0xC0000915u.toInt()

public val STATUS_BLOCK_SOURCE_WEAK_REFERENCE_INVALID: Ntstatus = 0xC0000913u.toInt()

public val STATUS_BLOCK_TARGET_WEAK_REFERENCE_INVALID: Ntstatus = 0xC0000914u.toInt()

public val STATUS_BLOCK_TOO_MANY_REFERENCES: Ntstatus = 0xC000048Cu.toInt()

public val STATUS_BLOCK_WEAK_REFERENCE_INVALID: Ntstatus = 0xC0000912u.toInt()

public val STATUS_BREAKPOINT: Ntstatus = 0x80000003u.toInt()

public val STATUS_BTH_ATT_ATTRIBUTE_NOT_FOUND: Ntstatus = 0xC042000Au.toInt()

public val STATUS_BTH_ATT_ATTRIBUTE_NOT_LONG: Ntstatus = 0xC042000Bu.toInt()

public val STATUS_BTH_ATT_INSUFFICIENT_AUTHENTICATION: Ntstatus = 0xC0420005u.toInt()

public val STATUS_BTH_ATT_INSUFFICIENT_AUTHORIZATION: Ntstatus = 0xC0420008u.toInt()

public val STATUS_BTH_ATT_INSUFFICIENT_ENCRYPTION: Ntstatus = 0xC042000Fu.toInt()

public val STATUS_BTH_ATT_INSUFFICIENT_ENCRYPTION_KEY_SIZE: Ntstatus = 0xC042000Cu.toInt()

public val STATUS_BTH_ATT_INSUFFICIENT_RESOURCES: Ntstatus = 0xC0420011u.toInt()

public val STATUS_BTH_ATT_INVALID_ATTRIBUTE_VALUE_LENGTH: Ntstatus = 0xC042000Du.toInt()

public val STATUS_BTH_ATT_INVALID_HANDLE: Ntstatus = 0xC0420001u.toInt()

public val STATUS_BTH_ATT_INVALID_OFFSET: Ntstatus = 0xC0420007u.toInt()

public val STATUS_BTH_ATT_INVALID_PDU: Ntstatus = 0xC0420004u.toInt()

public val STATUS_BTH_ATT_PREPARE_QUEUE_FULL: Ntstatus = 0xC0420009u.toInt()

public val STATUS_BTH_ATT_READ_NOT_PERMITTED: Ntstatus = 0xC0420002u.toInt()

public val STATUS_BTH_ATT_REQUEST_NOT_SUPPORTED: Ntstatus = 0xC0420006u.toInt()

public val STATUS_BTH_ATT_UNKNOWN_ERROR: Ntstatus = 0xC0421000u.toInt()

public val STATUS_BTH_ATT_UNLIKELY: Ntstatus = 0xC042000Eu.toInt()

public val STATUS_BTH_ATT_UNSUPPORTED_GROUP_TYPE: Ntstatus = 0xC0420010u.toInt()

public val STATUS_BTH_ATT_WRITE_NOT_PERMITTED: Ntstatus = 0xC0420003u.toInt()

public val STATUS_BUFFER_ALL_ZEROS: Ntstatus = 0x117u.toInt()

public val STATUS_BUFFER_OVERFLOW: Ntstatus = 0x80000005u.toInt()

public val STATUS_BUFFER_TOO_SMALL: Ntstatus = 0xC0000023u.toInt()

public val STATUS_BUS_RESET: Ntstatus = 0x8000001Du.toInt()

public val STATUS_BYPASSIO_FLT_NOT_SUPPORTED: Ntstatus = 0xC00004D2u.toInt()

public val STATUS_CACHE_PAGE_LOCKED: Ntstatus = 0x115u.toInt()

public val STATUS_CALLBACK_BYPASS: Ntstatus = 0xC0000503u.toInt()

public val STATUS_CALLBACK_INVOKE_INLINE: Ntstatus = 0xC000048Bu.toInt()

public val STATUS_CALLBACK_POP_STACK: Ntstatus = 0xC0000423u.toInt()

public val STATUS_CALLBACK_RETURNED_LANG: Ntstatus = 0xC000071Fu.toInt()

public val STATUS_CALLBACK_RETURNED_LDR_LOCK: Ntstatus = 0xC000071Eu.toInt()

public val STATUS_CALLBACK_RETURNED_PRI_BACK: Ntstatus = 0xC0000720u.toInt()

public val STATUS_CALLBACK_RETURNED_THREAD_AFFINITY: Ntstatus = 0xC0000721u.toInt()

public val STATUS_CALLBACK_RETURNED_THREAD_PRIORITY: Ntstatus = 0xC000071Bu.toInt()

public val STATUS_CALLBACK_RETURNED_TRANSACTION: Ntstatus = 0xC000071Du.toInt()

public val STATUS_CALLBACK_RETURNED_WHILE_IMPERSONATING: Ntstatus = 0xC0000710u.toInt()

public val STATUS_CANCELLED: Ntstatus = 0xC0000120u.toInt()

public val STATUS_CANNOT_ABORT_TRANSACTIONS: Ntstatus = 0xC019004Du.toInt()

public val STATUS_CANNOT_ACCEPT_TRANSACTED_WORK: Ntstatus = 0xC019004Cu.toInt()

public val STATUS_CANNOT_BREAK_OPLOCK: Ntstatus = 0xC0000909u.toInt()

public val STATUS_CANNOT_DELETE: Ntstatus = 0xC0000121u.toInt()

public val STATUS_CANNOT_EXECUTE_FILE_IN_TRANSACTION: Ntstatus = 0xC0190044u.toInt()

public val STATUS_CANNOT_GRANT_REQUESTED_OPLOCK: Ntstatus = 0x8000002Eu.toInt()

public val STATUS_CANNOT_IMPERSONATE: Ntstatus = 0xC000010Du.toInt()

public val STATUS_CANNOT_LOAD_REGISTRY_FILE: Ntstatus = 0xC0000218u.toInt()

public val STATUS_CANNOT_MAKE: Ntstatus = 0xC00002EAu.toInt()

public val STATUS_CANNOT_SWITCH_RUNLEVEL: Ntstatus = 0xC000A141u.toInt()

public val STATUS_CANT_ACCESS_DOMAIN_INFO: Ntstatus = 0xC00000DAu.toInt()

public val STATUS_CANT_ATTACH_TO_DEV_VOLUME: Ntstatus = 0xC00004DFu.toInt()

public val STATUS_CANT_BREAK_TRANSACTIONAL_DEPENDENCY: Ntstatus = 0xC0190037u.toInt()

public val STATUS_CANT_CLEAR_ENCRYPTION_FLAG: Ntstatus = 0xC00004B8u.toInt()

public val STATUS_CANT_CREATE_MORE_STREAM_MINIVERSIONS: Ntstatus = 0xC0190026u.toInt()

public val STATUS_CANT_CROSS_RM_BOUNDARY: Ntstatus = 0xC0190038u.toInt()

public val STATUS_CANT_DISABLE_MANDATORY: Ntstatus = 0xC000005Du.toInt()

public val STATUS_CANT_ENABLE_DENY_ONLY: Ntstatus = 0xC00002B3u.toInt()

public val STATUS_CANT_OPEN_ANONYMOUS: Ntstatus = 0xC00000A6u.toInt()

public val STATUS_CANT_OPEN_MINIVERSION_WITH_MODIFY_INTENT: Ntstatus = 0xC0190025u.toInt()

public val STATUS_CANT_RECOVER_WITH_HANDLE_OPEN: Ntstatus = 0x80190031u.toInt()

public val STATUS_CANT_TERMINATE_SELF: Ntstatus = 0xC00000DBu.toInt()

public val STATUS_CANT_WAIT: Ntstatus = 0xC00000D8u.toInt()

public val STATUS_CARDBUS_NOT_SUPPORTED: Ntstatus = 0x40000027u.toInt()

public val STATUS_CASE_DIFFERING_NAMES_IN_DIR: Ntstatus = 0xC00004B3u.toInt()

public val STATUS_CASE_SENSITIVE_PATH: Ntstatus = 0xC00004BAu.toInt()

public val STATUS_CC_NEEDS_CALLBACK_SECTION_DRAIN: Ntstatus = 0xC000A008u.toInt()

public val STATUS_CERTIFICATE_MAPPING_NOT_UNIQUE: Ntstatus = 0xC0000714u.toInt()

public val STATUS_CERTIFICATE_VALIDATION_PREFERENCE_CONFLICT: Ntstatus = 0xC00001B5u.toInt()

public val STATUS_CHECKING_FILE_SYSTEM: Ntstatus = 0x40000014u.toInt()

public val STATUS_CHECKOUT_REQUIRED: Ntstatus = 0xC0000902u.toInt()

public val STATUS_CHILD_MUST_BE_VOLATILE: Ntstatus = 0xC0000181u.toInt()

public val STATUS_CHILD_PROCESS_BLOCKED: Ntstatus = 0xC000049Du.toInt()

public val STATUS_CIMFS_IMAGE_CORRUPT: Ntstatus = 0xC000C001u.toInt()

public val STATUS_CIMFS_IMAGE_VERSION_NOT_SUPPORTED: Ntstatus = 0xC000C002u.toInt()

public val STATUS_CLEANER_CARTRIDGE_INSTALLED: Ntstatus = 0x80000027u.toInt()

public val STATUS_CLIENT_SERVER_PARAMETERS_INVALID: Ntstatus = 0xC0000223u.toInt()

public val STATUS_CLIP_DEVICE_LICENSE_MISSING: Ntstatus = 0xC0EA0003u.toInt()

public val STATUS_CLIP_KEYHOLDER_LICENSE_MISSING_OR_INVALID: Ntstatus = 0xC0EA0005u.toInt()

public val STATUS_CLIP_LICENSE_DEVICE_ID_MISMATCH: Ntstatus = 0xC0EA000Au.toInt()

public val STATUS_CLIP_LICENSE_EXPIRED: Ntstatus = 0xC0EA0006u.toInt()

public val STATUS_CLIP_LICENSE_HARDWARE_ID_OUT_OF_TOLERANCE: Ntstatus = 0xC0EA0009u.toInt()

public val STATUS_CLIP_LICENSE_INVALID_SIGNATURE: Ntstatus = 0xC0EA0004u.toInt()

public val STATUS_CLIP_LICENSE_NOT_FOUND: Ntstatus = 0xC0EA0002u.toInt()

public val STATUS_CLIP_LICENSE_NOT_SIGNED: Ntstatus = 0xC0EA0008u.toInt()

public val STATUS_CLIP_LICENSE_SIGNED_BY_UNKNOWN_SOURCE: Ntstatus = 0xC0EA0007u.toInt()

public val STATUS_CLOUD_FILE_ACCESS_DENIED: Ntstatus = 0xC000CF18u.toInt()

public val STATUS_CLOUD_FILE_ALREADY_CONNECTED: Ntstatus = 0xC000CF09u.toInt()

public val STATUS_CLOUD_FILE_AUTHENTICATION_FAILED: Ntstatus = 0xC000CF0Fu.toInt()

public val STATUS_CLOUD_FILE_CONNECTED_PROVIDER_ONLY: Ntstatus = 0xC000CF0Du.toInt()

public val STATUS_CLOUD_FILE_DEHYDRATION_DISALLOWED: Ntstatus = 0xC000CF20u.toInt()

public val STATUS_CLOUD_FILE_INCOMPATIBLE_HARDLINKS: Ntstatus = 0xC000CF19u.toInt()

public val STATUS_CLOUD_FILE_INSUFFICIENT_RESOURCES: Ntstatus = 0xC000CF10u.toInt()

public val STATUS_CLOUD_FILE_INVALID_REQUEST: Ntstatus = 0xC000CF0Bu.toInt()

public val STATUS_CLOUD_FILE_IN_USE: Ntstatus = 0xC000CF14u.toInt()

public val STATUS_CLOUD_FILE_METADATA_CORRUPT: Ntstatus = 0xC000CF02u.toInt()

public val STATUS_CLOUD_FILE_METADATA_TOO_LARGE: Ntstatus = 0xC000CF03u.toInt()

public val STATUS_CLOUD_FILE_NETWORK_UNAVAILABLE: Ntstatus = 0xC000CF11u.toInt()

public val STATUS_CLOUD_FILE_NOT_IN_SYNC: Ntstatus = 0xC000CF08u.toInt()

public val STATUS_CLOUD_FILE_NOT_SUPPORTED: Ntstatus = 0xC000CF0Au.toInt()

public val STATUS_CLOUD_FILE_NOT_UNDER_SYNC_ROOT: Ntstatus = 0xC000CF13u.toInt()

public val STATUS_CLOUD_FILE_PINNED: Ntstatus = 0xC000CF15u.toInt()

public val STATUS_CLOUD_FILE_PROPERTY_BLOB_CHECKSUM_MISMATCH: Ntstatus = 0x8000CF00u.toInt()

public val STATUS_CLOUD_FILE_PROPERTY_BLOB_TOO_LARGE: Ntstatus = 0x8000CF04u.toInt()

public val STATUS_CLOUD_FILE_PROPERTY_CORRUPT: Ntstatus = 0xC000CF17u.toInt()

public val STATUS_CLOUD_FILE_PROPERTY_LOCK_CONFLICT: Ntstatus = 0xC000CF1Au.toInt()

public val STATUS_CLOUD_FILE_PROPERTY_VERSION_NOT_SUPPORTED: Ntstatus = 0xC000CF06u.toInt()

public val STATUS_CLOUD_FILE_PROVIDER_NOT_RUNNING: Ntstatus = 0xC000CF01u.toInt()

public val STATUS_CLOUD_FILE_PROVIDER_TERMINATED: Ntstatus = 0xC000CF1Du.toInt()

public val STATUS_CLOUD_FILE_READ_ONLY_VOLUME: Ntstatus = 0xC000CF0Cu.toInt()

public val STATUS_CLOUD_FILE_REQUEST_ABORTED: Ntstatus = 0xC000CF16u.toInt()

public val STATUS_CLOUD_FILE_REQUEST_CANCELED: Ntstatus = 0xC000CF1Bu.toInt()

public val STATUS_CLOUD_FILE_REQUEST_TIMEOUT: Ntstatus = 0xC000CF1Fu.toInt()

public val STATUS_CLOUD_FILE_SYNC_ROOT_METADATA_CORRUPT: Ntstatus = 0xC000CF00u.toInt()

public val STATUS_CLOUD_FILE_TOO_MANY_PROPERTY_BLOBS: Ntstatus = 0x8000CF05u.toInt()

public val STATUS_CLOUD_FILE_UNSUCCESSFUL: Ntstatus = 0xC000CF12u.toInt()

public val STATUS_CLOUD_FILE_US_MESSAGE_TIMEOUT: Ntstatus = 0xC000CF21u.toInt()

public val STATUS_CLOUD_FILE_VALIDATION_FAILED: Ntstatus = 0xC000CF0Eu.toInt()

public val STATUS_CLUSTER_CAM_TICKET_REPLAY_DETECTED: Ntstatus = 0xC0130031u.toInt()

public val STATUS_CLUSTER_CSV_AUTO_PAUSE_ERROR: Ntstatus = 0xC0130021u.toInt()

public val STATUS_CLUSTER_CSV_INVALID_HANDLE: Ntstatus = 0xC0130029u.toInt()

public val STATUS_CLUSTER_CSV_NOT_REDIRECTED: Ntstatus = 0xC0130023u.toInt()

public val STATUS_CLUSTER_CSV_NO_SNAPSHOTS: Ntstatus = 0xC0130027u.toInt()

public val STATUS_CLUSTER_CSV_READ_OPLOCK_BREAK_IN_PROGRESS: Ntstatus = 0xC0130020u.toInt()

public val STATUS_CLUSTER_CSV_REDIRECTED: Ntstatus = 0xC0130022u.toInt()

public val STATUS_CLUSTER_CSV_SNAPSHOT_CREATION_IN_PROGRESS: Ntstatus = 0xC0130025u.toInt()

public val STATUS_CLUSTER_CSV_SUPPORTED_ONLY_ON_COORDINATOR: Ntstatus = 0xC0130030u.toInt()

public val STATUS_CLUSTER_CSV_VOLUME_DRAINING: Ntstatus = 0xC0130024u.toInt()

public val STATUS_CLUSTER_CSV_VOLUME_DRAINING_SUCCEEDED_DOWNLEVEL: Ntstatus = 0xC0130026u.toInt()

public val STATUS_CLUSTER_CSV_VOLUME_NOT_LOCAL: Ntstatus = 0xC0130019u.toInt()

public val STATUS_CLUSTER_INVALID_NETWORK: Ntstatus = 0xC0130010u.toInt()

public val STATUS_CLUSTER_INVALID_NETWORK_PROVIDER: Ntstatus = 0xC013000Bu.toInt()

public val STATUS_CLUSTER_INVALID_NODE: Ntstatus = 0xC0130001u.toInt()

public val STATUS_CLUSTER_INVALID_REQUEST: Ntstatus = 0xC013000Au.toInt()

public val STATUS_CLUSTER_JOIN_IN_PROGRESS: Ntstatus = 0xC0130003u.toInt()

public val STATUS_CLUSTER_JOIN_NOT_IN_PROGRESS: Ntstatus = 0xC013000Fu.toInt()

public val STATUS_CLUSTER_LOCAL_NODE_NOT_FOUND: Ntstatus = 0xC0130005u.toInt()

public val STATUS_CLUSTER_NETINTERFACE_EXISTS: Ntstatus = 0xC0130008u.toInt()

public val STATUS_CLUSTER_NETINTERFACE_NOT_FOUND: Ntstatus = 0xC0130009u.toInt()

public val STATUS_CLUSTER_NETWORK_ALREADY_OFFLINE: Ntstatus = 0x80130004u.toInt()

public val STATUS_CLUSTER_NETWORK_ALREADY_ONLINE: Ntstatus = 0x80130003u.toInt()

public val STATUS_CLUSTER_NETWORK_EXISTS: Ntstatus = 0xC0130006u.toInt()

public val STATUS_CLUSTER_NETWORK_NOT_FOUND: Ntstatus = 0xC0130007u.toInt()

public val STATUS_CLUSTER_NETWORK_NOT_INTERNAL: Ntstatus = 0xC0130016u.toInt()

public val STATUS_CLUSTER_NODE_ALREADY_DOWN: Ntstatus = 0x80130002u.toInt()

public val STATUS_CLUSTER_NODE_ALREADY_MEMBER: Ntstatus = 0x80130005u.toInt()

public val STATUS_CLUSTER_NODE_ALREADY_UP: Ntstatus = 0x80130001u.toInt()

public val STATUS_CLUSTER_NODE_DOWN: Ntstatus = 0xC013000Cu.toInt()

public val STATUS_CLUSTER_NODE_EXISTS: Ntstatus = 0xC0130002u.toInt()

public val STATUS_CLUSTER_NODE_NOT_FOUND: Ntstatus = 0xC0130004u.toInt()

public val STATUS_CLUSTER_NODE_NOT_MEMBER: Ntstatus = 0xC013000Eu.toInt()

public val STATUS_CLUSTER_NODE_NOT_PAUSED: Ntstatus = 0xC0130014u.toInt()

public val STATUS_CLUSTER_NODE_PAUSED: Ntstatus = 0xC0130013u.toInt()

public val STATUS_CLUSTER_NODE_UNREACHABLE: Ntstatus = 0xC013000Du.toInt()

public val STATUS_CLUSTER_NODE_UP: Ntstatus = 0xC0130012u.toInt()

public val STATUS_CLUSTER_NON_CSV_PATH: Ntstatus = 0xC0130018u.toInt()

public val STATUS_CLUSTER_NO_NET_ADAPTERS: Ntstatus = 0xC0130011u.toInt()

public val STATUS_CLUSTER_NO_SECURITY_CONTEXT: Ntstatus = 0xC0130015u.toInt()

public val STATUS_CLUSTER_POISONED: Ntstatus = 0xC0130017u.toInt()

public val STATUS_COMMITMENT_LIMIT: Ntstatus = 0xC000012Du.toInt()

public val STATUS_COMMITMENT_MINIMUM: Ntstatus = 0xC00002C8u.toInt()

public val STATUS_COMPRESSED_FILE_NOT_SUPPORTED: Ntstatus = 0xC000047Bu.toInt()

public val STATUS_COMPRESSION_DISABLED: Ntstatus = 0xC0000426u.toInt()

public val STATUS_COMPRESSION_NOT_ALLOWED_IN_TRANSACTION: Ntstatus = 0xC0190056u.toInt()

public val STATUS_COMPRESSION_NOT_BENEFICIAL: Ntstatus = 0xC000046Fu.toInt()

public val STATUS_CONFLICTING_ADDRESSES: Ntstatus = 0xC0000018u.toInt()

public val STATUS_CONNECTION_ABORTED: Ntstatus = 0xC0000241u.toInt()

public val STATUS_CONNECTION_ACTIVE: Ntstatus = 0xC000023Bu.toInt()

public val STATUS_CONNECTION_COUNT_LIMIT: Ntstatus = 0xC0000246u.toInt()

public val STATUS_CONNECTION_DISCONNECTED: Ntstatus = 0xC000020Cu.toInt()

public val STATUS_CONNECTION_INVALID: Ntstatus = 0xC000023Au.toInt()

public val STATUS_CONNECTION_IN_USE: Ntstatus = 0xC0000108u.toInt()

public val STATUS_CONNECTION_REFUSED: Ntstatus = 0xC0000236u.toInt()

public val STATUS_CONNECTION_RESET: Ntstatus = 0xC000020Du.toInt()

public val STATUS_CONTAINER_ASSIGNED: Ntstatus = 0xC0000508u.toInt()

public val STATUS_CONTENT_BLOCKED: Ntstatus = 0xC0000804u.toInt()

public val STATUS_CONTEXT_MISMATCH: Ntstatus = 0xC0000719u.toInt()

public val STATUS_CONTEXT_STOWED_EXCEPTION: Ntstatus = 0xC000027Cu.toInt()

public val STATUS_CONTROL_C_EXIT: Ntstatus = 0xC000013Au.toInt()

public val STATUS_CONTROL_STACK_VIOLATION: Ntstatus = 0xC00001B2u.toInt()

public val STATUS_CONVERT_TO_LARGE: Ntstatus = 0xC000022Cu.toInt()

public val STATUS_COPY_PROTECTION_FAILURE: Ntstatus = 0xC0000305u.toInt()

public val STATUS_CORRUPT_LOG_CLEARED: Ntstatus = 0xC000080Du.toInt()

public val STATUS_CORRUPT_LOG_CORRUPTED: Ntstatus = 0xC000080Au.toInt()

public val STATUS_CORRUPT_LOG_DELETED_FULL: Ntstatus = 0xC000080Cu.toInt()

public val STATUS_CORRUPT_LOG_OVERFULL: Ntstatus = 0xC0000809u.toInt()

public val STATUS_CORRUPT_LOG_UNAVAILABLE: Ntstatus = 0xC000080Bu.toInt()

public val STATUS_CORRUPT_LOG_UPLEVEL_RECORDS: Ntstatus = 0xC0000811u.toInt()

public val STATUS_CORRUPT_SYSTEM_FILE: Ntstatus = 0xC00002C4u.toInt()

public val STATUS_COULD_NOT_INTERPRET: Ntstatus = 0xC00000B9u.toInt()

public val STATUS_COULD_NOT_RESIZE_LOG: Ntstatus = 0x80190009u.toInt()

public val STATUS_CPU_SET_INVALID: Ntstatus = 0xC00001AFu.toInt()

public val STATUS_CRASH_DUMP: Ntstatus = 0x116u.toInt()

public val STATUS_CRC_ERROR: Ntstatus = 0xC000003Fu.toInt()

public val STATUS_CRED_REQUIRES_CONFIRMATION: Ntstatus = 0xC0000440u.toInt()

public val STATUS_CRM_PROTOCOL_ALREADY_EXISTS: Ntstatus = 0xC019000Fu.toInt()

public val STATUS_CRM_PROTOCOL_NOT_FOUND: Ntstatus = 0xC0190011u.toInt()

public val STATUS_CROSSREALM_DELEGATION_FAILURE: Ntstatus = 0xC000040Bu.toInt()

public val STATUS_CROSS_PARTITION_VIOLATION: Ntstatus = 0xC000060Bu.toInt()

public val STATUS_CRYPTO_SYSTEM_INVALID: Ntstatus = 0xC00002F3u.toInt()

public val STATUS_CSS_AUTHENTICATION_FAILURE: Ntstatus = 0xC0000306u.toInt()

public val STATUS_CSS_KEY_NOT_ESTABLISHED: Ntstatus = 0xC0000308u.toInt()

public val STATUS_CSS_KEY_NOT_PRESENT: Ntstatus = 0xC0000307u.toInt()

public val STATUS_CSS_REGION_MISMATCH: Ntstatus = 0xC000030Au.toInt()

public val STATUS_CSS_RESETS_EXHAUSTED: Ntstatus = 0xC000030Bu.toInt()

public val STATUS_CSS_SCRAMBLED_SECTOR: Ntstatus = 0xC0000309u.toInt()

public val STATUS_CSV_IO_PAUSE_TIMEOUT: Ntstatus = 0xC0130028u.toInt()

public val STATUS_CS_ENCRYPTION_EXISTING_ENCRYPTED_FILE: Ntstatus = 0xC0000443u.toInt()

public val STATUS_CS_ENCRYPTION_FILE_NOT_CSE: Ntstatus = 0xC0000445u.toInt()

public val STATUS_CS_ENCRYPTION_INVALID_SERVER_RESPONSE: Ntstatus = 0xC0000441u.toInt()

public val STATUS_CS_ENCRYPTION_NEW_ENCRYPTED_FILE: Ntstatus = 0xC0000444u.toInt()

public val STATUS_CS_ENCRYPTION_UNSUPPORTED_SERVER: Ntstatus = 0xC0000442u.toInt()

public val STATUS_CTLOG_INCONSISTENT_TRACKING_FILE: Ntstatus = 0xC03A0024u.toInt()

public val STATUS_CTLOG_INVALID_TRACKING_STATE: Ntstatus = 0xC03A0023u.toInt()

public val STATUS_CTLOG_LOGFILE_SIZE_EXCEEDED_MAXSIZE: Ntstatus = 0xC03A0021u.toInt()

public val STATUS_CTLOG_TRACKING_NOT_INITIALIZED: Ntstatus = 0xC03A0020u.toInt()

public val STATUS_CTLOG_VHD_CHANGED_OFFLINE: Ntstatus = 0xC03A0022u.toInt()

public val STATUS_CTL_FILE_NOT_SUPPORTED: Ntstatus = 0xC0000057u.toInt()

public val STATUS_CTX_BAD_VIDEO_MODE: Ntstatus = 0xC00A0018u.toInt()

public val STATUS_CTX_CDM_CONNECT: Ntstatus = 0x400A0004u.toInt()

public val STATUS_CTX_CDM_DISCONNECT: Ntstatus = 0x400A0005u.toInt()

public val STATUS_CTX_CLIENT_LICENSE_IN_USE: Ntstatus = 0xC00A0034u.toInt()

public val STATUS_CTX_CLIENT_LICENSE_NOT_SET: Ntstatus = 0xC00A0033u.toInt()

public val STATUS_CTX_CLIENT_QUERY_TIMEOUT: Ntstatus = 0xC00A0026u.toInt()

public val STATUS_CTX_CLOSE_PENDING: Ntstatus = 0xC00A0006u.toInt()

public val STATUS_CTX_CONSOLE_CONNECT: Ntstatus = 0xC00A0028u.toInt()

public val STATUS_CTX_CONSOLE_DISCONNECT: Ntstatus = 0xC00A0027u.toInt()

public val STATUS_CTX_GRAPHICS_INVALID: Ntstatus = 0xC00A0022u.toInt()

public val STATUS_CTX_INVALID_MODEMNAME: Ntstatus = 0xC00A0009u.toInt()

public val STATUS_CTX_INVALID_PD: Ntstatus = 0xC00A0002u.toInt()

public val STATUS_CTX_INVALID_WD: Ntstatus = 0xC00A002Eu.toInt()

public val STATUS_CTX_LICENSE_CLIENT_INVALID: Ntstatus = 0xC00A0012u.toInt()

public val STATUS_CTX_LICENSE_EXPIRED: Ntstatus = 0xC00A0014u.toInt()

public val STATUS_CTX_LICENSE_NOT_AVAILABLE: Ntstatus = 0xC00A0013u.toInt()

public val STATUS_CTX_LOGON_DISABLED: Ntstatus = 0xC00A0037u.toInt()

public val STATUS_CTX_MODEM_INF_NOT_FOUND: Ntstatus = 0xC00A0008u.toInt()

public val STATUS_CTX_MODEM_RESPONSE_BUSY: Ntstatus = 0xC00A000Eu.toInt()

public val STATUS_CTX_MODEM_RESPONSE_NO_CARRIER: Ntstatus = 0xC00A000Cu.toInt()

public val STATUS_CTX_MODEM_RESPONSE_NO_DIALTONE: Ntstatus = 0xC00A000Du.toInt()

public val STATUS_CTX_MODEM_RESPONSE_TIMEOUT: Ntstatus = 0xC00A000Bu.toInt()

public val STATUS_CTX_MODEM_RESPONSE_VOICE: Ntstatus = 0xC00A000Fu.toInt()

public val STATUS_CTX_NOT_CONSOLE: Ntstatus = 0xC00A0024u.toInt()

public val STATUS_CTX_NO_OUTBUF: Ntstatus = 0xC00A0007u.toInt()

public val STATUS_CTX_PD_NOT_FOUND: Ntstatus = 0xC00A0003u.toInt()

public val STATUS_CTX_RESPONSE_ERROR: Ntstatus = 0xC00A000Au.toInt()

public val STATUS_CTX_SECURITY_LAYER_ERROR: Ntstatus = 0xC00A0038u.toInt()

public val STATUS_CTX_SHADOW_DENIED: Ntstatus = 0xC00A002Au.toInt()

public val STATUS_CTX_SHADOW_DISABLED: Ntstatus = 0xC00A0031u.toInt()

public val STATUS_CTX_SHADOW_ENDED_BY_MODE_CHANGE: Ntstatus = 0xC00A0035u.toInt()

public val STATUS_CTX_SHADOW_INVALID: Ntstatus = 0xC00A0030u.toInt()

public val STATUS_CTX_SHADOW_NOT_RUNNING: Ntstatus = 0xC00A0036u.toInt()

public val STATUS_CTX_TD_ERROR: Ntstatus = 0xC00A0010u.toInt()

public val STATUS_CTX_WD_NOT_FOUND: Ntstatus = 0xC00A002Fu.toInt()

public val STATUS_CTX_WINSTATION_ACCESS_DENIED: Ntstatus = 0xC00A002Bu.toInt()

public val STATUS_CTX_WINSTATION_BUSY: Ntstatus = 0xC00A0017u.toInt()

public val STATUS_CTX_WINSTATION_NAME_COLLISION: Ntstatus = 0xC00A0016u.toInt()

public val STATUS_CTX_WINSTATION_NAME_INVALID: Ntstatus = 0xC00A0001u.toInt()

public val STATUS_CTX_WINSTATION_NOT_FOUND: Ntstatus = 0xC00A0015u.toInt()

public val STATUS_CURRENT_DOMAIN_NOT_ALLOWED: Ntstatus = 0xC00002E9u.toInt()

public val STATUS_CURRENT_TRANSACTION_NOT_VALID: Ntstatus = 0xC0190018u.toInt()

public val STATUS_DATATYPE_MISALIGNMENT: Ntstatus = 0x80000002u.toInt()

public val STATUS_DATATYPE_MISALIGNMENT_ERROR: Ntstatus = 0xC00002C5u.toInt()

public val STATUS_DATA_CHECKSUM_ERROR: Ntstatus = 0xC0000470u.toInt()

public val STATUS_DATA_ERROR: Ntstatus = 0xC000003Eu.toInt()

public val STATUS_DATA_LATE_ERROR: Ntstatus = 0xC000003Du.toInt()

public val STATUS_DATA_LOST_REPAIR: Ntstatus = 0x80000803u.toInt()

public val STATUS_DATA_NOT_ACCEPTED: Ntstatus = 0xC000021Bu.toInt()

public val STATUS_DATA_OVERRUN: Ntstatus = 0xC000003Cu.toInt()

public val STATUS_DATA_OVERWRITTEN: Ntstatus = 0x130u.toInt()

public val STATUS_DAX_MAPPING_EXISTS: Ntstatus = 0xC000049Cu.toInt()

public val STATUS_DEBUGGER_INACTIVE: Ntstatus = 0xC0000354u.toInt()

public val STATUS_DEBUG_ATTACH_FAILED: Ntstatus = 0xC0000219u.toInt()

public val STATUS_DECRYPTION_FAILED: Ntstatus = 0xC000028Bu.toInt()

public val STATUS_DELAY_LOAD_FAILED: Ntstatus = 0xC0000412u.toInt()

public val STATUS_DELETE_PENDING: Ntstatus = 0xC0000056u.toInt()

public val STATUS_DESTINATION_ELEMENT_FULL: Ntstatus = 0xC0000284u.toInt()

public val STATUS_DEVICE_ALREADY_ATTACHED: Ntstatus = 0xC0000038u.toInt()

public val STATUS_DEVICE_BUSY: Ntstatus = 0x80000011u.toInt()

public val STATUS_DEVICE_CONFIGURATION_ERROR: Ntstatus = 0xC0000182u.toInt()

public val STATUS_DEVICE_DATA_ERROR: Ntstatus = 0xC000009Cu.toInt()

public val STATUS_DEVICE_DOES_NOT_EXIST: Ntstatus = 0xC00000C0u.toInt()

public val STATUS_DEVICE_DOOR_OPEN: Ntstatus = 0x80000289u.toInt()

public val STATUS_DEVICE_ENUMERATION_ERROR: Ntstatus = 0xC0000366u.toInt()

public val STATUS_DEVICE_FEATURE_NOT_SUPPORTED: Ntstatus = 0xC0000463u.toInt()

public val STATUS_DEVICE_HARDWARE_ERROR: Ntstatus = 0xC0000483u.toInt()

public val STATUS_DEVICE_HINT_NAME_BUFFER_TOO_SMALL: Ntstatus = 0xC0000496u.toInt()

public val STATUS_DEVICE_HUNG: Ntstatus = 0xC0000507u.toInt()

public val STATUS_DEVICE_INSUFFICIENT_RESOURCES: Ntstatus = 0xC0000468u.toInt()

public val STATUS_DEVICE_IN_MAINTENANCE: Ntstatus = 0xC0000499u.toInt()

public val STATUS_DEVICE_NOT_CONNECTED: Ntstatus = 0xC000009Du.toInt()

public val STATUS_DEVICE_NOT_PARTITIONED: Ntstatus = 0xC0000174u.toInt()

public val STATUS_DEVICE_NOT_READY: Ntstatus = 0xC00000A3u.toInt()

public val STATUS_DEVICE_OFF_LINE: Ntstatus = 0x80000010u.toInt()

public val STATUS_DEVICE_PAPER_EMPTY: Ntstatus = 0x8000000Eu.toInt()

public val STATUS_DEVICE_POWERED_OFF: Ntstatus = 0x8000000Fu.toInt()

public val STATUS_DEVICE_POWER_CYCLE_REQUIRED: Ntstatus = 0x80000031u.toInt()

public val STATUS_DEVICE_POWER_FAILURE: Ntstatus = 0xC000009Eu.toInt()

public val STATUS_DEVICE_PROTOCOL_ERROR: Ntstatus = 0xC0000186u.toInt()

public val STATUS_DEVICE_REMOVED: Ntstatus = 0xC00002B6u.toInt()

public val STATUS_DEVICE_REQUIRES_CLEANING: Ntstatus = 0x80000288u.toInt()

public val STATUS_DEVICE_RESET_REQUIRED: Ntstatus = 0x800001B6u.toInt()

public val STATUS_DEVICE_SUPPORT_IN_PROGRESS: Ntstatus = 0x80000030u.toInt()

public val STATUS_DEVICE_UNREACHABLE: Ntstatus = 0xC0000464u.toInt()

public val STATUS_DEVICE_UNRESPONSIVE: Ntstatus = 0xC000050Au.toInt()

public val STATUS_DFS_EXIT_PATH_FOUND: Ntstatus = 0xC000009Bu.toInt()

public val STATUS_DFS_UNAVAILABLE: Ntstatus = 0xC000026Du.toInt()

public val STATUS_DIF_BINDING_API_NOT_FOUND: Ntstatus = 0xC0000C7Fu.toInt()

public val STATUS_DIF_IOCALLBACK_NOT_REPLACED: Ntstatus = 0xC0000C76u.toInt()

public val STATUS_DIF_LIVEDUMP_LIMIT_EXCEEDED: Ntstatus = 0xC0000C77u.toInt()

public val STATUS_DIF_VOLATILE_DRIVER_HOTPATCHED: Ntstatus = 0xC0000C79u.toInt()

public val STATUS_DIF_VOLATILE_DRIVER_IS_NOT_RUNNING: Ntstatus = 0xC0000C7Bu.toInt()

public val STATUS_DIF_VOLATILE_INVALID_INFO: Ntstatus = 0xC0000C7Au.toInt()

public val STATUS_DIF_VOLATILE_NOT_ALLOWED: Ntstatus = 0xC0000C7Eu.toInt()

public val STATUS_DIF_VOLATILE_PLUGIN_CHANGE_NOT_ALLOWED: Ntstatus = 0xC0000C7Du.toInt()

public val STATUS_DIF_VOLATILE_PLUGIN_IS_NOT_RUNNING: Ntstatus = 0xC0000C7Cu.toInt()

public val STATUS_DIF_VOLATILE_SECTION_NOT_LOCKED: Ntstatus = 0xC0000C78u.toInt()

public val STATUS_DIRECTORY_IS_A_REPARSE_POINT: Ntstatus = 0xC0000281u.toInt()

public val STATUS_DIRECTORY_NOT_EMPTY: Ntstatus = 0xC0000101u.toInt()

public val STATUS_DIRECTORY_NOT_RM: Ntstatus = 0xC0190008u.toInt()

public val STATUS_DIRECTORY_NOT_SUPPORTED: Ntstatus = 0xC000047Cu.toInt()

public val STATUS_DIRECTORY_SERVICE_REQUIRED: Ntstatus = 0xC00002B1u.toInt()

public val STATUS_DISK_CORRUPT_ERROR: Ntstatus = 0xC0000032u.toInt()

public val STATUS_DISK_FULL: Ntstatus = 0xC000007Fu.toInt()

public val STATUS_DISK_OPERATION_FAILED: Ntstatus = 0xC000016Au.toInt()

public val STATUS_DISK_QUOTA_EXCEEDED: Ntstatus = 0xC0000802u.toInt()

public val STATUS_DISK_RECALIBRATE_FAILED: Ntstatus = 0xC0000169u.toInt()

public val STATUS_DISK_REPAIR_DISABLED: Ntstatus = 0xC0000800u.toInt()

public val STATUS_DISK_REPAIR_REDIRECTED: Ntstatus = 0x40000807u.toInt()

public val STATUS_DISK_REPAIR_UNSUCCESSFUL: Ntstatus = 0xC0000808u.toInt()

public val STATUS_DISK_RESET_FAILED: Ntstatus = 0xC000016Bu.toInt()

public val STATUS_DISK_RESOURCES_EXHAUSTED: Ntstatus = 0xC0000461u.toInt()

public val STATUS_DLL_INIT_FAILED: Ntstatus = 0xC0000142u.toInt()

public val STATUS_DLL_INIT_FAILED_LOGOFF: Ntstatus = 0xC000026Bu.toInt()

public val STATUS_DLL_MIGHT_BE_INCOMPATIBLE: Ntstatus = 0x8000002Cu.toInt()

public val STATUS_DLL_MIGHT_BE_INSECURE: Ntstatus = 0x8000002Bu.toInt()

public val STATUS_DLL_NOT_FOUND: Ntstatus = 0xC0000135u.toInt()

public val STATUS_DM_OPERATION_LIMIT_EXCEEDED: Ntstatus = 0xC0370600u.toInt()

public val STATUS_DOMAIN_CONTROLLER_NOT_FOUND: Ntstatus = 0xC0000233u.toInt()

public val STATUS_DOMAIN_CTRLR_CONFIG_ERROR: Ntstatus = 0xC000015Eu.toInt()

public val STATUS_DOMAIN_EXISTS: Ntstatus = 0xC00000E0u.toInt()

public val STATUS_DOMAIN_LIMIT_EXCEEDED: Ntstatus = 0xC00000E1u.toInt()

public val STATUS_DOMAIN_TRUST_INCONSISTENT: Ntstatus = 0xC000019Bu.toInt()

public val STATUS_DRIVERS_LEAKING_LOCKED_PAGES: Ntstatus = 0x4000002Du.toInt()

public val STATUS_DRIVER_BLOCKED: Ntstatus = 0xC000036Cu.toInt()

public val STATUS_DRIVER_BLOCKED_CRITICAL: Ntstatus = 0xC000036Bu.toInt()

public val STATUS_DRIVER_CANCEL_TIMEOUT: Ntstatus = 0xC000021Eu.toInt()

public val STATUS_DRIVER_DATABASE_ERROR: Ntstatus = 0xC000036Du.toInt()

public val STATUS_DRIVER_ENTRYPOINT_NOT_FOUND: Ntstatus = 0xC0000263u.toInt()

public val STATUS_DRIVER_FAILED_PRIOR_UNLOAD: Ntstatus = 0xC000038Eu.toInt()

public val STATUS_DRIVER_FAILED_SLEEP: Ntstatus = 0xC00002C2u.toInt()

public val STATUS_DRIVER_INTERNAL_ERROR: Ntstatus = 0xC0000183u.toInt()

public val STATUS_DRIVER_ORDINAL_NOT_FOUND: Ntstatus = 0xC0000262u.toInt()

public val STATUS_DRIVER_PROCESS_TERMINATED: Ntstatus = 0xC0000450u.toInt()

public val STATUS_DRIVER_UNABLE_TO_LOAD: Ntstatus = 0xC000026Cu.toInt()

public val STATUS_DS_ADMIN_LIMIT_EXCEEDED: Ntstatus = 0xC00002C1u.toInt()

public val STATUS_DS_AG_CANT_HAVE_UNIVERSAL_MEMBER: Ntstatus = 0xC0000358u.toInt()

public val STATUS_DS_ATTRIBUTE_OR_VALUE_EXISTS: Ntstatus = 0xC00002A4u.toInt()

public val STATUS_DS_ATTRIBUTE_TYPE_UNDEFINED: Ntstatus = 0xC00002A3u.toInt()

public val STATUS_DS_BUSY: Ntstatus = 0xC00002A5u.toInt()

public val STATUS_DS_CANT_MOD_OBJ_CLASS: Ntstatus = 0xC00002AEu.toInt()

public val STATUS_DS_CANT_MOD_PRIMARYGROUPID: Ntstatus = 0xC00002D0u.toInt()

public val STATUS_DS_CANT_ON_NON_LEAF: Ntstatus = 0xC00002ACu.toInt()

public val STATUS_DS_CANT_ON_RDN: Ntstatus = 0xC00002ADu.toInt()

public val STATUS_DS_CANT_START: Ntstatus = 0xC00002E1u.toInt()

public val STATUS_DS_CROSS_DOM_MOVE_FAILED: Ntstatus = 0xC00002AFu.toInt()

public val STATUS_DS_DOMAIN_NAME_EXISTS_IN_FOREST: Ntstatus = 0xC000041Au.toInt()

public val STATUS_DS_DOMAIN_RENAME_IN_PROGRESS: Ntstatus = 0xC0000801u.toInt()

public val STATUS_DS_DUPLICATE_ID_FOUND: Ntstatus = 0xC0000405u.toInt()

public val STATUS_DS_FLAT_NAME_EXISTS_IN_FOREST: Ntstatus = 0xC000041Bu.toInt()

public val STATUS_DS_GC_NOT_AVAILABLE: Ntstatus = 0xC00002B0u.toInt()

public val STATUS_DS_GC_REQUIRED: Ntstatus = 0xC00002E4u.toInt()

public val STATUS_DS_GLOBAL_CANT_HAVE_CROSSDOMAIN_MEMBER: Ntstatus = 0xC00002DAu.toInt()

public val STATUS_DS_GLOBAL_CANT_HAVE_LOCAL_MEMBER: Ntstatus = 0xC00002D7u.toInt()

public val STATUS_DS_GLOBAL_CANT_HAVE_UNIVERSAL_MEMBER: Ntstatus = 0xC00002D8u.toInt()

public val STATUS_DS_GROUP_CONVERSION_ERROR: Ntstatus = 0xC0000406u.toInt()

public val STATUS_DS_HAVE_PRIMARY_MEMBERS: Ntstatus = 0xC00002DCu.toInt()

public val STATUS_DS_INCORRECT_ROLE_OWNER: Ntstatus = 0xC00002A9u.toInt()

public val STATUS_DS_INIT_FAILURE: Ntstatus = 0xC00002E2u.toInt()

public val STATUS_DS_INIT_FAILURE_CONSOLE: Ntstatus = 0xC00002ECu.toInt()

public val STATUS_DS_INVALID_ATTRIBUTE_SYNTAX: Ntstatus = 0xC00002A2u.toInt()

public val STATUS_DS_INVALID_GROUP_TYPE: Ntstatus = 0xC00002D4u.toInt()

public val STATUS_DS_LOCAL_CANT_HAVE_CROSSDOMAIN_LOCAL_MEMBER: Ntstatus = 0xC00002DBu.toInt()

public val STATUS_DS_LOCAL_MEMBER_OF_LOCAL_ONLY: Ntstatus = 0xC00002E5u.toInt()

public val STATUS_DS_MACHINE_ACCOUNT_QUOTA_EXCEEDED: Ntstatus = 0xC00002E7u.toInt()

public val STATUS_DS_MEMBERSHIP_EVALUATED_LOCALLY: Ntstatus = 0x121u.toInt()

public val STATUS_DS_NAME_NOT_UNIQUE: Ntstatus = 0xC0000404u.toInt()

public val STATUS_DS_NO_ATTRIBUTE_OR_VALUE: Ntstatus = 0xC00002A1u.toInt()

public val STATUS_DS_NO_FPO_IN_UNIVERSAL_GROUPS: Ntstatus = 0xC00002E6u.toInt()

public val STATUS_DS_NO_MORE_RIDS: Ntstatus = 0xC00002A8u.toInt()

public val STATUS_DS_NO_NEST_GLOBALGROUP_IN_MIXEDDOMAIN: Ntstatus = 0xC00002D5u.toInt()

public val STATUS_DS_NO_NEST_LOCALGROUP_IN_MIXEDDOMAIN: Ntstatus = 0xC00002D6u.toInt()

public val STATUS_DS_NO_RIDS_ALLOCATED: Ntstatus = 0xC00002A7u.toInt()

public val STATUS_DS_OBJ_CLASS_VIOLATION: Ntstatus = 0xC00002ABu.toInt()

public val STATUS_DS_OID_MAPPED_GROUP_CANT_HAVE_MEMBERS: Ntstatus = 0xC000A087u.toInt()

public val STATUS_DS_OID_NOT_FOUND: Ntstatus = 0xC000A088u.toInt()

public val STATUS_DS_RIDMGR_DISABLED: Ntstatus = 0xC00002BAu.toInt()

public val STATUS_DS_RIDMGR_INIT_ERROR: Ntstatus = 0xC00002AAu.toInt()

public val STATUS_DS_SAM_INIT_FAILURE: Ntstatus = 0xC00002CBu.toInt()

public val STATUS_DS_SAM_INIT_FAILURE_CONSOLE: Ntstatus = 0xC00002EDu.toInt()

public val STATUS_DS_SENSITIVE_GROUP_VIOLATION: Ntstatus = 0xC00002CDu.toInt()

public val STATUS_DS_SHUTTING_DOWN: Ntstatus = 0x40000370u.toInt()

public val STATUS_DS_SRC_SID_EXISTS_IN_FOREST: Ntstatus = 0xC0000419u.toInt()

public val STATUS_DS_UNAVAILABLE: Ntstatus = 0xC00002A6u.toInt()

public val STATUS_DS_UNIVERSAL_CANT_HAVE_LOCAL_MEMBER: Ntstatus = 0xC00002D9u.toInt()

public val STATUS_DS_VERSION_CHECK_FAILURE: Ntstatus = 0xC0000355u.toInt()

public val STATUS_DUPLICATE_NAME: Ntstatus = 0xC00000BDu.toInt()

public val STATUS_DUPLICATE_OBJECTID: Ntstatus = 0xC000022Au.toInt()

public val STATUS_DUPLICATE_PRIVILEGES: Ntstatus = 0xC00001A6u.toInt()

public val STATUS_DYNAMIC_CODE_BLOCKED: Ntstatus = 0xC0000604u.toInt()

public val STATUS_EAS_NOT_SUPPORTED: Ntstatus = 0xC000004Fu.toInt()

public val STATUS_EA_CORRUPT_ERROR: Ntstatus = 0xC0000053u.toInt()

public val STATUS_EA_LIST_INCONSISTENT: Ntstatus = 0x80000014u.toInt()

public val STATUS_EA_TOO_LARGE: Ntstatus = 0xC0000050u.toInt()

public val STATUS_EFS_ALG_BLOB_TOO_BIG: Ntstatus = 0xC0000352u.toInt()

public val STATUS_EFS_NOT_ALLOWED_IN_TRANSACTION: Ntstatus = 0xC019003Eu.toInt()

public val STATUS_ELEVATION_REQUIRED: Ntstatus = 0xC000042Cu.toInt()

public val STATUS_EMULATION_BREAKPOINT: Ntstatus = 0x40000038u.toInt()

public val STATUS_EMULATION_SYSCALL: Ntstatus = 0x40000039u.toInt()

public val STATUS_ENCLAVE_FAILURE: Ntstatus = 0xC000048Fu.toInt()

public val STATUS_ENCLAVE_IS_TERMINATING: Ntstatus = 0xC0000512u.toInt()

public val STATUS_ENCLAVE_NOT_TERMINATED: Ntstatus = 0xC0000511u.toInt()

public val STATUS_ENCLAVE_VIOLATION: Ntstatus = 0xC00004A2u.toInt()

public val STATUS_ENCOUNTERED_WRITE_IN_PROGRESS: Ntstatus = 0xC0000433u.toInt()

public val STATUS_ENCRYPTED_FILE_NOT_SUPPORTED: Ntstatus = 0xC00004C3u.toInt()

public val STATUS_ENCRYPTED_IO_NOT_POSSIBLE: Ntstatus = 0xC0000810u.toInt()

public val STATUS_ENCRYPTING_METADATA_DISALLOWED: Ntstatus = 0xC00004B7u.toInt()

public val STATUS_ENCRYPTION_DISABLED: Ntstatus = 0xC00004B6u.toInt()

public val STATUS_ENCRYPTION_FAILED: Ntstatus = 0xC000028Au.toInt()

public val STATUS_END_OF_FILE: Ntstatus = 0xC0000011u.toInt()

public val STATUS_END_OF_MEDIA: Ntstatus = 0x8000001Eu.toInt()

public val STATUS_ENLISTMENT_NOT_FOUND: Ntstatus = 0xC0190050u.toInt()

public val STATUS_ENLISTMENT_NOT_SUPERIOR: Ntstatus = 0xC0190033u.toInt()

public val STATUS_ENTRYPOINT_NOT_FOUND: Ntstatus = 0xC0000139u.toInt()

public val STATUS_EOF_ON_GHOSTED_RANGE: Ntstatus = 0xC000A007u.toInt()

public val STATUS_EOM_OVERFLOW: Ntstatus = 0xC0000177u.toInt()

public val STATUS_ERROR_PROCESS_NOT_IN_JOB: Ntstatus = 0xC00001AEu.toInt()

public val STATUS_EVALUATION_EXPIRATION: Ntstatus = 0xC0000268u.toInt()

public val STATUS_EVENTLOG_CANT_START: Ntstatus = 0xC000018Fu.toInt()

public val STATUS_EVENTLOG_FILE_CHANGED: Ntstatus = 0xC0000197u.toInt()

public val STATUS_EVENTLOG_FILE_CORRUPT: Ntstatus = 0xC000018Eu.toInt()

public val STATUS_EVENT_DONE: Ntstatus = 0x40000012u.toInt()

public val STATUS_EVENT_PENDING: Ntstatus = 0x40000013u.toInt()

public val STATUS_EXECUTABLE_MEMORY_WRITE: Ntstatus = 0xC0000723u.toInt()

public val STATUS_EXPIRED_HANDLE: Ntstatus = 0xC0190060u.toInt()

public val STATUS_EXTERNAL_BACKING_PROVIDER_UNKNOWN: Ntstatus = 0xC000046Eu.toInt()

public val STATUS_EXTERNAL_SYSKEY_NOT_SUPPORTED: Ntstatus = 0xC00004A1u.toInt()

public val STATUS_EXTRANEOUS_INFORMATION: Ntstatus = 0x80000017u.toInt()

public val STATUS_FAILED_DRIVER_ENTRY: Ntstatus = 0xC0000365u.toInt()

public val STATUS_FAILED_STACK_SWITCH: Ntstatus = 0xC0000373u.toInt()

public val STATUS_FAIL_CHECK: Ntstatus = 0xC0000229u.toInt()

public val STATUS_FAIL_FAST_EXCEPTION: Ntstatus = 0xC0000602u.toInt()

public val STATUS_FASTPATH_REJECTED: Ntstatus = 0xC000A014u.toInt()

public val STATUS_FATAL_APP_EXIT: Ntstatus = 0x40000015u.toInt()

public val STATUS_FATAL_MEMORY_EXHAUSTION: Ntstatus = 0xC00001ADu.toInt()

public val STATUS_FATAL_USER_CALLBACK_EXCEPTION: Ntstatus = 0xC000041Du.toInt()

public val STATUS_FILEMARK_DETECTED: Ntstatus = 0x8000001Bu.toInt()

public val STATUS_FILES_OPEN: Ntstatus = 0xC0000107u.toInt()

public val STATUS_FILE_CHECKED_OUT: Ntstatus = 0xC0000901u.toInt()

public val STATUS_FILE_CLOSED: Ntstatus = 0xC0000128u.toInt()

public val STATUS_FILE_CORRUPT_ERROR: Ntstatus = 0xC0000102u.toInt()

public val STATUS_FILE_DELETED: Ntstatus = 0xC0000123u.toInt()

public val STATUS_FILE_ENCRYPTED: Ntstatus = 0xC0000293u.toInt()

public val STATUS_FILE_FORCED_CLOSED: Ntstatus = 0xC00000B6u.toInt()

public val STATUS_FILE_HANDLE_REVOKED: Ntstatus = 0xC0000910u.toInt()

public val STATUS_FILE_IDENTITY_NOT_PERSISTENT: Ntstatus = 0xC0190036u.toInt()

public val STATUS_FILE_INVALID: Ntstatus = 0xC0000098u.toInt()

public val STATUS_FILE_IS_A_DIRECTORY: Ntstatus = 0xC00000BAu.toInt()

public val STATUS_FILE_IS_OFFLINE: Ntstatus = 0xC0000267u.toInt()

public val STATUS_FILE_LOCKED_WITH_ONLY_READERS: Ntstatus = 0x12Au.toInt()

public val STATUS_FILE_LOCKED_WITH_WRITERS: Ntstatus = 0x12Bu.toInt()

public val STATUS_FILE_LOCK_CONFLICT: Ntstatus = 0xC0000054u.toInt()

public val STATUS_FILE_METADATA_OPTIMIZATION_IN_PROGRESS: Ntstatus = 0xC00001ABu.toInt()

public val STATUS_FILE_NOT_AVAILABLE: Ntstatus = 0xC0000467u.toInt()

public val STATUS_FILE_NOT_ENCRYPTED: Ntstatus = 0xC0000291u.toInt()

public val STATUS_FILE_NOT_SUPPORTED: Ntstatus = 0xC00004B4u.toInt()

public val STATUS_FILE_PROTECTED_UNDER_DPL: Ntstatus = 0xC00004A3u.toInt()

public val STATUS_FILE_RENAMED: Ntstatus = 0xC00000D5u.toInt()

public val STATUS_FILE_SNAP_INVALID_PARAMETER: Ntstatus = 0xC000F505u.toInt()

public val STATUS_FILE_SNAP_IN_PROGRESS: Ntstatus = 0xC000F500u.toInt()

public val STATUS_FILE_SNAP_IO_NOT_COORDINATED: Ntstatus = 0xC000F503u.toInt()

public val STATUS_FILE_SNAP_MODIFY_NOT_SUPPORTED: Ntstatus = 0xC000F502u.toInt()

public val STATUS_FILE_SNAP_UNEXPECTED_ERROR: Ntstatus = 0xC000F504u.toInt()

public val STATUS_FILE_SNAP_USER_SECTION_NOT_SUPPORTED: Ntstatus = 0xC000F501u.toInt()

public val STATUS_FILE_SYSTEM_LIMITATION: Ntstatus = 0xC0000427u.toInt()

public val STATUS_FILE_SYSTEM_VIRTUALIZATION_BUSY: Ntstatus = 0xC000CE03u.toInt()

public val STATUS_FILE_SYSTEM_VIRTUALIZATION_INVALID_OPERATION: Ntstatus = 0xC000CE05u.toInt()

public val STATUS_FILE_SYSTEM_VIRTUALIZATION_METADATA_CORRUPT: Ntstatus = 0xC000CE02u.toInt()

public val STATUS_FILE_SYSTEM_VIRTUALIZATION_PROVIDER_UNKNOWN: Ntstatus = 0xC000CE04u.toInt()

public val STATUS_FILE_SYSTEM_VIRTUALIZATION_UNAVAILABLE: Ntstatus = 0xC000CE01u.toInt()

public val STATUS_FILE_TOO_LARGE: Ntstatus = 0xC0000904u.toInt()

public val STATUS_FIRMWARE_IMAGE_INVALID: Ntstatus = 0xC0000485u.toInt()

public val STATUS_FIRMWARE_SLOT_INVALID: Ntstatus = 0xC0000484u.toInt()

public val STATUS_FIRMWARE_UPDATED: Ntstatus = 0x4000002Cu.toInt()

public val STATUS_FLOATED_SECTION: Ntstatus = 0xC019004Bu.toInt()

public val STATUS_FLOAT_DENORMAL_OPERAND: Ntstatus = 0xC000008Du.toInt()

public val STATUS_FLOAT_DIVIDE_BY_ZERO: Ntstatus = 0xC000008Eu.toInt()

public val STATUS_FLOAT_INEXACT_RESULT: Ntstatus = 0xC000008Fu.toInt()

public val STATUS_FLOAT_INVALID_OPERATION: Ntstatus = 0xC0000090u.toInt()

public val STATUS_FLOAT_MULTIPLE_FAULTS: Ntstatus = 0xC00002B4u.toInt()

public val STATUS_FLOAT_MULTIPLE_TRAPS: Ntstatus = 0xC00002B5u.toInt()

public val STATUS_FLOAT_OVERFLOW: Ntstatus = 0xC0000091u.toInt()

public val STATUS_FLOAT_STACK_CHECK: Ntstatus = 0xC0000092u.toInt()

public val STATUS_FLOAT_UNDERFLOW: Ntstatus = 0xC0000093u.toInt()

public val STATUS_FLOPPY_BAD_REGISTERS: Ntstatus = 0xC0000168u.toInt()

public val STATUS_FLOPPY_ID_MARK_NOT_FOUND: Ntstatus = 0xC0000165u.toInt()

public val STATUS_FLOPPY_UNKNOWN_ERROR: Ntstatus = 0xC0000167u.toInt()

public val STATUS_FLOPPY_VOLUME: Ntstatus = 0xC0000164u.toInt()

public val STATUS_FLOPPY_WRONG_CYLINDER: Ntstatus = 0xC0000166u.toInt()

public val STATUS_FLT_ALREADY_ENLISTED: Ntstatus = 0xC01C001Bu.toInt()

public val STATUS_FLT_BUFFER_TOO_SMALL: Ntstatus = 0x801C0001u.toInt()

public val STATUS_FLT_CBDQ_DISABLED: Ntstatus = 0xC01C000Eu.toInt()

public val STATUS_FLT_CONTEXT_ALLOCATION_NOT_FOUND: Ntstatus = 0xC01C0016u.toInt()

public val STATUS_FLT_CONTEXT_ALREADY_DEFINED: Ntstatus = 0xC01C0002u.toInt()

public val STATUS_FLT_CONTEXT_ALREADY_LINKED: Ntstatus = 0xC01C001Cu.toInt()

public val STATUS_FLT_DELETING_OBJECT: Ntstatus = 0xC01C000Bu.toInt()

public val STATUS_FLT_DISALLOW_FAST_IO: Ntstatus = 0xC01C0004u.toInt()

public val STATUS_FLT_DISALLOW_FSFILTER_IO: Int = -1071906812

public val STATUS_FLT_DO_NOT_ATTACH: Ntstatus = 0xC01C000Fu.toInt()

public val STATUS_FLT_DO_NOT_DETACH: Ntstatus = 0xC01C0010u.toInt()

public val STATUS_FLT_DUPLICATE_ENTRY: Ntstatus = 0xC01C000Du.toInt()

public val STATUS_FLT_FILTER_NOT_FOUND: Ntstatus = 0xC01C0013u.toInt()

public val STATUS_FLT_FILTER_NOT_READY: Ntstatus = 0xC01C0008u.toInt()

public val STATUS_FLT_INSTANCE_ALTITUDE_COLLISION: Ntstatus = 0xC01C0011u.toInt()

public val STATUS_FLT_INSTANCE_NAME_COLLISION: Ntstatus = 0xC01C0012u.toInt()

public val STATUS_FLT_INSTANCE_NOT_FOUND: Ntstatus = 0xC01C0015u.toInt()

public val STATUS_FLT_INTERNAL_ERROR: Ntstatus = 0xC01C000Au.toInt()

public val STATUS_FLT_INVALID_ASYNCHRONOUS_REQUEST: Ntstatus = 0xC01C0003u.toInt()

public val STATUS_FLT_INVALID_CONTEXT_REGISTRATION: Ntstatus = 0xC01C0017u.toInt()

public val STATUS_FLT_INVALID_NAME_REQUEST: Ntstatus = 0xC01C0005u.toInt()

public val STATUS_FLT_IO_COMPLETE: Ntstatus = 0x1C0001u.toInt()

public val STATUS_FLT_MUST_BE_NONPAGED_POOL: Ntstatus = 0xC01C000Cu.toInt()

public val STATUS_FLT_NAME_CACHE_MISS: Ntstatus = 0xC01C0018u.toInt()

public val STATUS_FLT_NOT_INITIALIZED: Ntstatus = 0xC01C0007u.toInt()

public val STATUS_FLT_NOT_SAFE_TO_POST_OPERATION: Ntstatus = 0xC01C0006u.toInt()

public val STATUS_FLT_NO_DEVICE_OBJECT: Ntstatus = 0xC01C0019u.toInt()

public val STATUS_FLT_NO_HANDLER_DEFINED: Ntstatus = 0xC01C0001u.toInt()

public val STATUS_FLT_NO_WAITER_FOR_REPLY: Ntstatus = 0xC01C0020u.toInt()

public val STATUS_FLT_POST_OPERATION_CLEANUP: Ntstatus = 0xC01C0009u.toInt()

public val STATUS_FLT_REGISTRATION_BUSY: Ntstatus = 0xC01C0023u.toInt()

public val STATUS_FLT_VOLUME_ALREADY_MOUNTED: Ntstatus = 0xC01C001Au.toInt()

public val STATUS_FLT_VOLUME_NOT_FOUND: Ntstatus = 0xC01C0014u.toInt()

public val STATUS_FLT_WCOS_NOT_SUPPORTED: Ntstatus = 0xC01C0024u.toInt()

public val STATUS_FORMS_AUTH_REQUIRED: Ntstatus = 0xC0000905u.toInt()

public val STATUS_FOUND_OUT_OF_SCOPE: Ntstatus = 0xC000022Eu.toInt()

public val STATUS_FREE_SPACE_TOO_FRAGMENTED: Ntstatus = 0xC000049Bu.toInt()

public val STATUS_FREE_VM_NOT_AT_BASE: Ntstatus = 0xC000009Fu.toInt()

public val STATUS_FSFILTER_OP_COMPLETED_SUCCESSFULLY: Ntstatus = 0x126u.toInt()

public val STATUS_FS_DRIVER_REQUIRED: Ntstatus = 0xC000019Cu.toInt()

public val STATUS_FS_GUID_MISMATCH: Ntstatus = 0xC00004DEu.toInt()

public val STATUS_FS_METADATA_INCONSISTENT: Ntstatus = 0xC0000518u.toInt()

public val STATUS_FT_DI_SCAN_REQUIRED: Ntstatus = 0xC000046Cu.toInt()

public val STATUS_FT_MISSING_MEMBER: Ntstatus = 0xC000015Fu.toInt()

public val STATUS_FT_ORPHANING: Ntstatus = 0xC000016Du.toInt()

public val STATUS_FT_READ_FAILURE: Ntstatus = 0xC00004ABu.toInt()

public val STATUS_FT_READ_FROM_COPY: Ntstatus = 0x40000035u.toInt()

public val STATUS_FT_READ_FROM_COPY_FAILURE: Ntstatus = 0xC00004BFu.toInt()

public val STATUS_FT_READ_RECOVERY_FROM_BACKUP: Ntstatus = 0x4000000Au.toInt()

public val STATUS_FT_WRITE_FAILURE: Ntstatus = 0xC000046Bu.toInt()

public val STATUS_FT_WRITE_RECOVERY: Ntstatus = 0x4000000Bu.toInt()

public val STATUS_FULLSCREEN_MODE: Ntstatus = 0xC0000159u.toInt()

public val STATUS_FVE_ACTION_NOT_ALLOWED: Ntstatus = 0xC0210009u.toInt()

public val STATUS_FVE_AUTH_INVALID_APPLICATION: Ntstatus = 0xC021001Bu.toInt()

public val STATUS_FVE_AUTH_INVALID_CONFIG: Ntstatus = 0xC021001Cu.toInt()

public val STATUS_FVE_BAD_DATA: Ntstatus = 0xC021000Au.toInt()

public val STATUS_FVE_BAD_INFORMATION: Ntstatus = 0xC0210002u.toInt()

public val STATUS_FVE_BAD_METADATA_POINTER: Ntstatus = 0xC021001Fu.toInt()

public val STATUS_FVE_BAD_PARTITION_SIZE: Ntstatus = 0xC0210005u.toInt()

public val STATUS_FVE_CONV_READ_ERROR: Ntstatus = 0xC021000Du.toInt()

public val STATUS_FVE_CONV_RECOVERY_FAILED: Ntstatus = 0xC0210028u.toInt()

public val STATUS_FVE_CONV_WRITE_ERROR: Ntstatus = 0xC021000Eu.toInt()

public val STATUS_FVE_DATASET_FULL: Ntstatus = 0xC0210043u.toInt()

public val STATUS_FVE_DEBUGGER_ENABLED: Ntstatus = 0xC021001Du.toInt()

public val STATUS_FVE_DEVICE_LOCKEDOUT: Ntstatus = 0xC021003Bu.toInt()

public val STATUS_FVE_DRY_RUN_FAILED: Ntstatus = 0xC021001Eu.toInt()

public val STATUS_FVE_EDRIVE_BAND_ENUMERATION_FAILED: Ntstatus = 0xC0210041u.toInt()

public val STATUS_FVE_EDRIVE_DRY_RUN_FAILED: Ntstatus = 0xC0210038u.toInt()

public val STATUS_FVE_ENH_PIN_INVALID: Ntstatus = 0xC0210031u.toInt()

public val STATUS_FVE_FAILED_AUTHENTICATION: Ntstatus = 0xC0210011u.toInt()

public val STATUS_FVE_FAILED_SECTOR_SIZE: Ntstatus = 0xC0210010u.toInt()

public val STATUS_FVE_FAILED_WRONG_FS: Ntstatus = 0xC0210004u.toInt()

public val STATUS_FVE_FS_MOUNTED: Ntstatus = 0xC0210007u.toInt()

public val STATUS_FVE_FS_NOT_EXTENDED: Ntstatus = 0xC0210006u.toInt()

public val STATUS_FVE_FULL_ENCRYPTION_NOT_ALLOWED_ON_TP_STORAGE: Ntstatus = 0xC0210032u.toInt()

public val STATUS_FVE_INVALID_DATUM_TYPE: Ntstatus = 0xC021002Au.toInt()

public val STATUS_FVE_KEYFILE_INVALID: Ntstatus = 0xC0210014u.toInt()

public val STATUS_FVE_KEYFILE_NOT_FOUND: Ntstatus = 0xC0210013u.toInt()

public val STATUS_FVE_KEYFILE_NO_VMK: Ntstatus = 0xC0210015u.toInt()

public val STATUS_FVE_LOCKED_VOLUME: Ntstatus = 0xC0210000u.toInt()

public val STATUS_FVE_METADATA_FULL: Ntstatus = 0xC0210044u.toInt()

public val STATUS_FVE_MOR_FAILED: Ntstatus = 0xC0210025u.toInt()

public val STATUS_FVE_NOT_ALLOWED_ON_CLUSTER: Ntstatus = 0xC0210035u.toInt()

public val STATUS_FVE_NOT_ALLOWED_ON_CSV_STACK: Ntstatus = 0xC0210034u.toInt()

public val STATUS_FVE_NOT_ALLOWED_TO_UPGRADE_WHILE_CONVERTING: Ntstatus = 0xC0210036u.toInt()

public val STATUS_FVE_NOT_DATA_VOLUME: Ntstatus = 0xC021000Cu.toInt()

public val STATUS_FVE_NOT_DE_VOLUME: Ntstatus = 0xC021003Du.toInt()

public val STATUS_FVE_NOT_ENCRYPTED: Ntstatus = 0xC0210001u.toInt()

public val STATUS_FVE_NOT_OS_VOLUME: Ntstatus = 0xC0210012u.toInt()

public val STATUS_FVE_NO_AUTOUNLOCK_MASTER_KEY: Ntstatus = 0xC0210024u.toInt()

public val STATUS_FVE_NO_FEATURE_LICENSE: Ntstatus = 0xC0210026u.toInt()

public val STATUS_FVE_NO_LICENSE: Ntstatus = 0xC0210008u.toInt()

public val STATUS_FVE_OLD_METADATA_COPY: Ntstatus = 0xC0210020u.toInt()

public val STATUS_FVE_OSV_KSR_NOT_ALLOWED: Ntstatus = 0xC0210040u.toInt()

public val STATUS_FVE_OVERLAPPED_UPDATE: Ntstatus = 0xC021000Fu.toInt()

public val STATUS_FVE_PARTIAL_METADATA: Ntstatus = 0x80210001u.toInt()

public val STATUS_FVE_PIN_INVALID: Ntstatus = 0xC021001Au.toInt()

public val STATUS_FVE_POLICY_ON_RDV_EXCLUSION_LIST: Ntstatus = 0xC0210042u.toInt()

public val STATUS_FVE_POLICY_USER_DISABLE_RDV_NOT_ALLOWED: Ntstatus = 0xC0210027u.toInt()

public val STATUS_FVE_PROTECTION_CANNOT_BE_DISABLED: Ntstatus = 0xC021003Fu.toInt()

public val STATUS_FVE_PROTECTION_DISABLED: Ntstatus = 0xC021003Eu.toInt()

public val STATUS_FVE_RAW_ACCESS: Ntstatus = 0xC0210022u.toInt()

public val STATUS_FVE_RAW_BLOCKED: Ntstatus = 0xC0210023u.toInt()

public val STATUS_FVE_REBOOT_REQUIRED: Ntstatus = 0xC0210021u.toInt()

public val STATUS_FVE_SECUREBOOT_CONFIG_CHANGE: Ntstatus = 0xC021003Au.toInt()

public val STATUS_FVE_SECUREBOOT_DISABLED: Ntstatus = 0xC0210039u.toInt()

public val STATUS_FVE_TOO_SMALL: Ntstatus = 0xC0210003u.toInt()

public val STATUS_FVE_TPM_DISABLED: Ntstatus = 0xC0210016u.toInt()

public val STATUS_FVE_TPM_INVALID_PCR: Ntstatus = 0xC0210018u.toInt()

public val STATUS_FVE_TPM_NO_VMK: Ntstatus = 0xC0210019u.toInt()

public val STATUS_FVE_TPM_SRK_AUTH_NOT_ZERO: Ntstatus = 0xC0210017u.toInt()

public val STATUS_FVE_TRANSIENT_STATE: Ntstatus = 0x80210002u.toInt()

public val STATUS_FVE_VIRTUALIZED_SPACE_TOO_BIG: Ntstatus = 0xC0210029u.toInt()

public val STATUS_FVE_VOLUME_EXTEND_PREVENTS_EOW_DECRYPT: Ntstatus = 0xC021003Cu.toInt()

public val STATUS_FVE_VOLUME_NOT_BOUND: Ntstatus = 0xC021000Bu.toInt()

public val STATUS_FVE_VOLUME_TOO_SMALL: Ntstatus = 0xC0210030u.toInt()

public val STATUS_FVE_WIPE_CANCEL_NOT_APPLICABLE: Ntstatus = 0xC0210037u.toInt()

public val STATUS_FVE_WIPE_NOT_ALLOWED_ON_TP_STORAGE: Ntstatus = 0xC0210033u.toInt()

public val STATUS_FWP_ACTION_INCOMPATIBLE_WITH_LAYER: Ntstatus = 0xC022002Cu.toInt()

public val STATUS_FWP_ACTION_INCOMPATIBLE_WITH_SUBLAYER: Ntstatus = 0xC022002Du.toInt()

public val STATUS_FWP_ALREADY_EXISTS: Ntstatus = 0xC0220009u.toInt()

public val STATUS_FWP_BUILTIN_OBJECT: Ntstatus = 0xC0220017u.toInt()

public val STATUS_FWP_CALLOUT_NOTIFICATION_FAILED: Ntstatus = 0xC0220037u.toInt()

public val STATUS_FWP_CALLOUT_NOT_FOUND: Ntstatus = 0xC0220001u.toInt()

public val STATUS_FWP_CANNOT_PEND: Ntstatus = 0xC0220103u.toInt()

public val STATUS_FWP_CONDITION_NOT_FOUND: Ntstatus = 0xC0220002u.toInt()

public val STATUS_FWP_CONNECTIONS_DISABLED: Ntstatus = 0xC0220041u.toInt()

public val STATUS_FWP_CONTEXT_INCOMPATIBLE_WITH_CALLOUT: Ntstatus = 0xC022002Fu.toInt()

public val STATUS_FWP_CONTEXT_INCOMPATIBLE_WITH_LAYER: Ntstatus = 0xC022002Eu.toInt()

public val STATUS_FWP_DROP_NOICMP: Ntstatus = 0xC0220104u.toInt()

public val STATUS_FWP_DUPLICATE_AUTH_METHOD: Ntstatus = 0xC022003Cu.toInt()

public val STATUS_FWP_DUPLICATE_CONDITION: Ntstatus = 0xC022002Au.toInt()

public val STATUS_FWP_DUPLICATE_KEYMOD: Ntstatus = 0xC022002Bu.toInt()

public val STATUS_FWP_DYNAMIC_SESSION_IN_PROGRESS: Ntstatus = 0xC022000Bu.toInt()

public val STATUS_FWP_EM_NOT_SUPPORTED: Ntstatus = 0xC0220032u.toInt()

public val STATUS_FWP_FILTER_NOT_FOUND: Ntstatus = 0xC0220003u.toInt()

public val STATUS_FWP_IKEEXT_NOT_RUNNING: Ntstatus = 0xC0220044u.toInt()

public val STATUS_FWP_INCOMPATIBLE_AUTH_METHOD: Ntstatus = 0xC0220030u.toInt()

public val STATUS_FWP_INCOMPATIBLE_CIPHER_TRANSFORM: Ntstatus = 0xC022003Au.toInt()

public val STATUS_FWP_INCOMPATIBLE_DH_GROUP: Ntstatus = 0xC0220031u.toInt()

public val STATUS_FWP_INCOMPATIBLE_LAYER: Ntstatus = 0xC0220014u.toInt()

public val STATUS_FWP_INCOMPATIBLE_SA_STATE: Ntstatus = 0xC022001Bu.toInt()

public val STATUS_FWP_INCOMPATIBLE_TXN: Ntstatus = 0xC0220011u.toInt()

public val STATUS_FWP_INJECT_HANDLE_CLOSING: Ntstatus = 0xC0220101u.toInt()

public val STATUS_FWP_INJECT_HANDLE_STALE: Ntstatus = 0xC0220102u.toInt()

public val STATUS_FWP_INVALID_ACTION_TYPE: Ntstatus = 0xC0220024u.toInt()

public val STATUS_FWP_INVALID_AUTH_TRANSFORM: Ntstatus = 0xC0220038u.toInt()

public val STATUS_FWP_INVALID_CIPHER_TRANSFORM: Ntstatus = 0xC0220039u.toInt()

public val STATUS_FWP_INVALID_DNS_NAME: Ntstatus = 0xC0220042u.toInt()

public val STATUS_FWP_INVALID_ENUMERATOR: Ntstatus = 0xC022001Du.toInt()

public val STATUS_FWP_INVALID_FLAGS: Ntstatus = 0xC022001Eu.toInt()

public val STATUS_FWP_INVALID_INTERVAL: Ntstatus = 0xC0220021u.toInt()

public val STATUS_FWP_INVALID_NET_MASK: Ntstatus = 0xC022001Fu.toInt()

public val STATUS_FWP_INVALID_PARAMETER: Ntstatus = 0xC0220035u.toInt()

public val STATUS_FWP_INVALID_RANGE: Ntstatus = 0xC0220020u.toInt()

public val STATUS_FWP_INVALID_TRANSFORM_COMBINATION: Ntstatus = 0xC022003Bu.toInt()

public val STATUS_FWP_INVALID_TUNNEL_ENDPOINT: Ntstatus = 0xC022003Du.toInt()

public val STATUS_FWP_INVALID_WEIGHT: Ntstatus = 0xC0220025u.toInt()

public val STATUS_FWP_IN_USE: Ntstatus = 0xC022000Au.toInt()

public val STATUS_FWP_KEY_DICTATION_INVALID_KEYING_MATERIAL: Ntstatus = 0xC0220040u.toInt()

public val STATUS_FWP_KEY_DICTATOR_ALREADY_REGISTERED: Ntstatus = 0xC022003Fu.toInt()

public val STATUS_FWP_KM_CLIENTS_ONLY: Ntstatus = 0xC0220015u.toInt()

public val STATUS_FWP_L2_DRIVER_NOT_READY: Ntstatus = 0xC022003Eu.toInt()

public val STATUS_FWP_LAYER_NOT_FOUND: Ntstatus = 0xC0220004u.toInt()

public val STATUS_FWP_LIFETIME_MISMATCH: Ntstatus = 0xC0220016u.toInt()

public val STATUS_FWP_MATCH_TYPE_MISMATCH: Ntstatus = 0xC0220026u.toInt()

public val STATUS_FWP_NET_EVENTS_DISABLED: Ntstatus = 0xC0220013u.toInt()

public val STATUS_FWP_NEVER_MATCH: Ntstatus = 0xC0220033u.toInt()

public val STATUS_FWP_NOTIFICATION_DROPPED: Ntstatus = 0xC0220019u.toInt()

public val STATUS_FWP_NOT_FOUND: Ntstatus = 0xC0220008u.toInt()

public val STATUS_FWP_NO_TXN_IN_PROGRESS: Ntstatus = 0xC022000Du.toInt()

public val STATUS_FWP_NULL_DISPLAY_NAME: Ntstatus = 0xC0220023u.toInt()

public val STATUS_FWP_NULL_POINTER: Ntstatus = 0xC022001Cu.toInt()

public val STATUS_FWP_OUT_OF_BOUNDS: Ntstatus = 0xC0220028u.toInt()

public val STATUS_FWP_PROVIDER_CONTEXT_MISMATCH: Ntstatus = 0xC0220034u.toInt()

public val STATUS_FWP_PROVIDER_CONTEXT_NOT_FOUND: Ntstatus = 0xC0220006u.toInt()

public val STATUS_FWP_PROVIDER_NOT_FOUND: Ntstatus = 0xC0220005u.toInt()

public val STATUS_FWP_RESERVED: Ntstatus = 0xC0220029u.toInt()

public val STATUS_FWP_SESSION_ABORTED: Ntstatus = 0xC0220010u.toInt()

public val STATUS_FWP_STILL_ON: Ntstatus = 0xC0220043u.toInt()

public val STATUS_FWP_SUBLAYER_NOT_FOUND: Ntstatus = 0xC0220007u.toInt()

public val STATUS_FWP_TCPIP_NOT_READY: Ntstatus = 0xC0220100u.toInt()

public val STATUS_FWP_TIMEOUT: Ntstatus = 0xC0220012u.toInt()

public val STATUS_FWP_TOO_MANY_CALLOUTS: Ntstatus = 0xC0220018u.toInt()

public val STATUS_FWP_TOO_MANY_SUBLAYERS: Ntstatus = 0xC0220036u.toInt()

public val STATUS_FWP_TRAFFIC_MISMATCH: Ntstatus = 0xC022001Au.toInt()

public val STATUS_FWP_TXN_ABORTED: Ntstatus = 0xC022000Fu.toInt()

public val STATUS_FWP_TXN_IN_PROGRESS: Ntstatus = 0xC022000Eu.toInt()

public val STATUS_FWP_TYPE_MISMATCH: Ntstatus = 0xC0220027u.toInt()

public val STATUS_FWP_WRONG_SESSION: Ntstatus = 0xC022000Cu.toInt()

public val STATUS_FWP_ZERO_LENGTH_ARRAY: Ntstatus = 0xC0220022u.toInt()

public val STATUS_GDI_HANDLE_LEAK: Ntstatus = 0x803F0001u.toInt()

public val STATUS_GENERIC_COMMAND_FAILED: Ntstatus = 0xC0150026u.toInt()

public val STATUS_GENERIC_NOT_MAPPED: Ntstatus = 0xC00000E6u.toInt()

public val STATUS_GHOSTED: Ntstatus = 0x12Fu.toInt()

public val STATUS_GPIO_CLIENT_INFORMATION_INVALID: Ntstatus = 0xC000A122u.toInt()

public val STATUS_GPIO_INCOMPATIBLE_CONNECT_MODE: Ntstatus = 0xC000A126u.toInt()

public val STATUS_GPIO_INTERRUPT_ALREADY_UNMASKED: Ntstatus = 0x8000A127u.toInt()

public val STATUS_GPIO_INVALID_REGISTRATION_PACKET: Ntstatus = 0xC000A124u.toInt()

public val STATUS_GPIO_OPERATION_DENIED: Ntstatus = 0xC000A125u.toInt()

public val STATUS_GPIO_VERSION_NOT_SUPPORTED: Ntstatus = 0xC000A123u.toInt()

public val STATUS_GRACEFUL_DISCONNECT: Ntstatus = 0xC0000237u.toInt()

public val STATUS_GRAPHICS_ADAPTER_ACCESS_NOT_EXCLUDED: Ntstatus = 0xC01E043Bu.toInt()

public val STATUS_GRAPHICS_ADAPTER_CHAIN_NOT_READY: Ntstatus = 0xC01E0433u.toInt()

public val STATUS_GRAPHICS_ADAPTER_MUST_HAVE_AT_LEAST_ONE_SOURCE: Ntstatus = 0xC01E0328u.toInt()

public val STATUS_GRAPHICS_ADAPTER_MUST_HAVE_AT_LEAST_ONE_TARGET: Ntstatus = 0xC01E0329u.toInt()

public val STATUS_GRAPHICS_ADAPTER_WAS_RESET: Ntstatus = 0xC01E0003u.toInt()

public val STATUS_GRAPHICS_ALLOCATION_BUSY: Ntstatus = 0xC01E0102u.toInt()

public val STATUS_GRAPHICS_ALLOCATION_CLOSED: Ntstatus = 0xC01E0112u.toInt()

public val STATUS_GRAPHICS_ALLOCATION_CONTENT_LOST: Ntstatus = 0xC01E0116u.toInt()

public val STATUS_GRAPHICS_ALLOCATION_INVALID: Ntstatus = 0xC01E0106u.toInt()

public val STATUS_GRAPHICS_CANCEL_VIDPN_TOPOLOGY_AUGMENTATION: Ntstatus = 0xC01E035Au.toInt()

public val STATUS_GRAPHICS_CANNOTCOLORCONVERT: Ntstatus = 0xC01E0008u.toInt()

public val STATUS_GRAPHICS_CANT_ACCESS_ACTIVE_VIDPN: Ntstatus = 0xC01E0343u.toInt()

public val STATUS_GRAPHICS_CANT_EVICT_PINNED_ALLOCATION: Ntstatus = 0xC01E0109u.toInt()

public val STATUS_GRAPHICS_CANT_LOCK_MEMORY: Ntstatus = 0xC01E0101u.toInt()

public val STATUS_GRAPHICS_CANT_RENDER_LOCKED_ALLOCATION: Ntstatus = 0xC01E0111u.toInt()

public val STATUS_GRAPHICS_CHAINLINKS_NOT_ENUMERATED: Ntstatus = 0xC01E0432u.toInt()

public val STATUS_GRAPHICS_CHAINLINKS_NOT_POWERED_ON: Ntstatus = 0xC01E0435u.toInt()

public val STATUS_GRAPHICS_CHAINLINKS_NOT_STARTED: Ntstatus = 0xC01E0434u.toInt()

public val STATUS_GRAPHICS_CHILD_DESCRIPTOR_NOT_SUPPORTED: Ntstatus = 0xC01E0401u.toInt()

public val STATUS_GRAPHICS_CLIENTVIDPN_NOT_SET: Ntstatus = 0xC01E035Cu.toInt()

public val STATUS_GRAPHICS_COPP_NOT_SUPPORTED: Ntstatus = 0xC01E0501u.toInt()

public val STATUS_GRAPHICS_DATASET_IS_EMPTY: Ntstatus = 0x401E034Bu.toInt()

public val STATUS_GRAPHICS_DDCCI_INVALID_CAPABILITIES_STRING: Ntstatus = 0xC01E0587u.toInt()

public val STATUS_GRAPHICS_DDCCI_INVALID_DATA: Ntstatus = 0xC01E0585u.toInt()

public val STATUS_GRAPHICS_DDCCI_INVALID_MESSAGE_CHECKSUM: Ntstatus = 0xC01E058Bu.toInt()

public val STATUS_GRAPHICS_DDCCI_INVALID_MESSAGE_COMMAND: Ntstatus = 0xC01E0589u.toInt()

public val STATUS_GRAPHICS_DDCCI_INVALID_MESSAGE_LENGTH: Ntstatus = 0xC01E058Au.toInt()

public val STATUS_GRAPHICS_DDCCI_MONITOR_RETURNED_INVALID_TIMING_STATUS_BYTE: Ntstatus = 0xC01E0586u.toInt()

public val STATUS_GRAPHICS_DDCCI_VCP_NOT_SUPPORTED: Ntstatus = 0xC01E0584u.toInt()

public val STATUS_GRAPHICS_DEPENDABLE_CHILD_STATUS: Ntstatus = 0x401E043Cu.toInt()

public val STATUS_GRAPHICS_DISPLAY_DEVICE_NOT_ATTACHED_TO_DESKTOP: Ntstatus = 0xC01E05E2u.toInt()

public val STATUS_GRAPHICS_DRIVER_MISMATCH: Ntstatus = 0xC01E0009u.toInt()

public val STATUS_GRAPHICS_EMPTY_ADAPTER_MONITOR_MODE_SUPPORT_INTERSECTION: Ntstatus = 0xC01E0325u.toInt()

public val STATUS_GRAPHICS_FREQUENCYRANGE_ALREADY_IN_SET: Ntstatus = 0xC01E031Fu.toInt()

public val STATUS_GRAPHICS_FREQUENCYRANGE_NOT_IN_SET: Ntstatus = 0xC01E031Du.toInt()

public val STATUS_GRAPHICS_GAMMA_RAMP_NOT_SUPPORTED: Ntstatus = 0xC01E0348u.toInt()

public val STATUS_GRAPHICS_GPU_EXCEPTION_ON_DEVICE: Ntstatus = 0xC01E0200u.toInt()

public val STATUS_GRAPHICS_I2C_DEVICE_DOES_NOT_EXIST: Ntstatus = 0xC01E0581u.toInt()

public val STATUS_GRAPHICS_I2C_ERROR_RECEIVING_DATA: Ntstatus = 0xC01E0583u.toInt()

public val STATUS_GRAPHICS_I2C_ERROR_TRANSMITTING_DATA: Ntstatus = 0xC01E0582u.toInt()

public val STATUS_GRAPHICS_I2C_NOT_SUPPORTED: Ntstatus = 0xC01E0580u.toInt()

public val STATUS_GRAPHICS_INCOMPATIBLE_PRIVATE_FORMAT: Ntstatus = 0xC01E0355u.toInt()

public val STATUS_GRAPHICS_INCONSISTENT_DEVICE_LINK_STATE: Ntstatus = 0xC01E0436u.toInt()

public val STATUS_GRAPHICS_INDIRECT_DISPLAY_ABANDON_SWAPCHAIN: Ntstatus = 0xC01E0012u.toInt()

public val STATUS_GRAPHICS_INDIRECT_DISPLAY_DEVICE_STOPPED: Ntstatus = 0xC01E0013u.toInt()

public val STATUS_GRAPHICS_INSUFFICIENT_DMA_BUFFER: Ntstatus = 0xC01E0001u.toInt()

public val STATUS_GRAPHICS_INTERNAL_ERROR: Ntstatus = 0xC01E05E7u.toInt()

public val STATUS_GRAPHICS_INVALID_ACTIVE_REGION: Ntstatus = 0xC01E030Bu.toInt()

public val STATUS_GRAPHICS_INVALID_ALLOCATION_HANDLE: Ntstatus = 0xC01E0114u.toInt()

public val STATUS_GRAPHICS_INVALID_ALLOCATION_INSTANCE: Ntstatus = 0xC01E0113u.toInt()

public val STATUS_GRAPHICS_INVALID_ALLOCATION_USAGE: Ntstatus = 0xC01E0110u.toInt()

public val STATUS_GRAPHICS_INVALID_CLIENT_TYPE: Ntstatus = 0xC01E035Bu.toInt()

public val STATUS_GRAPHICS_INVALID_COLORBASIS: Ntstatus = 0xC01E033Eu.toInt()

public val STATUS_GRAPHICS_INVALID_COPYPROTECTION_TYPE: Ntstatus = 0xC01E034Fu.toInt()

public val STATUS_GRAPHICS_INVALID_DISPLAY_ADAPTER: Ntstatus = 0xC01E0002u.toInt()

public val STATUS_GRAPHICS_INVALID_DRIVER_MODEL: Ntstatus = 0xC01E0004u.toInt()

public val STATUS_GRAPHICS_INVALID_FREQUENCY: Ntstatus = 0xC01E030Au.toInt()

public val STATUS_GRAPHICS_INVALID_GAMMA_RAMP: Ntstatus = 0xC01E0347u.toInt()

public val STATUS_GRAPHICS_INVALID_MODE_PRUNING_ALGORITHM: Ntstatus = 0xC01E0356u.toInt()

public val STATUS_GRAPHICS_INVALID_MONITORDESCRIPTOR: Ntstatus = 0xC01E032Bu.toInt()

public val STATUS_GRAPHICS_INVALID_MONITORDESCRIPTORSET: Ntstatus = 0xC01E032Au.toInt()

public val STATUS_GRAPHICS_INVALID_MONITOR_CAPABILITY_ORIGIN: Ntstatus = 0xC01E0357u.toInt()

public val STATUS_GRAPHICS_INVALID_MONITOR_FREQUENCYRANGE: Ntstatus = 0xC01E031Cu.toInt()

public val STATUS_GRAPHICS_INVALID_MONITOR_FREQUENCYRANGESET: Ntstatus = 0xC01E031Bu.toInt()

public val STATUS_GRAPHICS_INVALID_MONITOR_FREQUENCYRANGE_CONSTRAINT: Ntstatus = 0xC01E0358u.toInt()

public val STATUS_GRAPHICS_INVALID_MONITOR_SOURCEMODESET: Ntstatus = 0xC01E0321u.toInt()

public val STATUS_GRAPHICS_INVALID_MONITOR_SOURCE_MODE: Ntstatus = 0xC01E0322u.toInt()

public val STATUS_GRAPHICS_INVALID_PATH_CONTENT_GEOMETRY_TRANSFORMATION: Ntstatus = 0xC01E0345u.toInt()

public val STATUS_GRAPHICS_INVALID_PATH_CONTENT_TYPE: Ntstatus = 0xC01E034Eu.toInt()

public val STATUS_GRAPHICS_INVALID_PATH_IMPORTANCE_ORDINAL: Ntstatus = 0xC01E0344u.toInt()

public val STATUS_GRAPHICS_INVALID_PHYSICAL_MONITOR_HANDLE: Ntstatus = 0xC01E058Cu.toInt()

public val STATUS_GRAPHICS_INVALID_PIXELFORMAT: Ntstatus = 0xC01E033Du.toInt()

public val STATUS_GRAPHICS_INVALID_PIXELVALUEACCESSMODE: Ntstatus = 0xC01E033Fu.toInt()

public val STATUS_GRAPHICS_INVALID_POINTER: Ntstatus = 0xC01E05E4u.toInt()

public val STATUS_GRAPHICS_INVALID_PRIMARYSURFACE_SIZE: Ntstatus = 0xC01E033Au.toInt()

public val STATUS_GRAPHICS_INVALID_SCANLINE_ORDERING: Ntstatus = 0xC01E0352u.toInt()

public val STATUS_GRAPHICS_INVALID_STRIDE: Ntstatus = 0xC01E033Cu.toInt()

public val STATUS_GRAPHICS_INVALID_TOTAL_REGION: Ntstatus = 0xC01E030Cu.toInt()

public val STATUS_GRAPHICS_INVALID_VIDEOPRESENTSOURCESET: Ntstatus = 0xC01E0315u.toInt()

public val STATUS_GRAPHICS_INVALID_VIDEOPRESENTTARGETSET: Ntstatus = 0xC01E0316u.toInt()

public val STATUS_GRAPHICS_INVALID_VIDEO_PRESENT_SOURCE: Ntstatus = 0xC01E0304u.toInt()

public val STATUS_GRAPHICS_INVALID_VIDEO_PRESENT_SOURCE_MODE: Ntstatus = 0xC01E0310u.toInt()

public val STATUS_GRAPHICS_INVALID_VIDEO_PRESENT_TARGET: Ntstatus = 0xC01E0305u.toInt()

public val STATUS_GRAPHICS_INVALID_VIDEO_PRESENT_TARGET_MODE: Ntstatus = 0xC01E0311u.toInt()

public val STATUS_GRAPHICS_INVALID_VIDPN: Ntstatus = 0xC01E0303u.toInt()

public val STATUS_GRAPHICS_INVALID_VIDPN_PRESENT_PATH: Ntstatus = 0xC01E0319u.toInt()

public val STATUS_GRAPHICS_INVALID_VIDPN_SOURCEMODESET: Ntstatus = 0xC01E0308u.toInt()

public val STATUS_GRAPHICS_INVALID_VIDPN_TARGETMODESET: Ntstatus = 0xC01E0309u.toInt()

public val STATUS_GRAPHICS_INVALID_VIDPN_TARGET_SUBSET_TYPE: Ntstatus = 0xC01E032Fu.toInt()

public val STATUS_GRAPHICS_INVALID_VIDPN_TOPOLOGY: Ntstatus = 0xC01E0300u.toInt()

public val STATUS_GRAPHICS_INVALID_VIDPN_TOPOLOGY_RECOMMENDATION_REASON: Ntstatus = 0xC01E034Du.toInt()

public val STATUS_GRAPHICS_INVALID_VISIBLEREGION_SIZE: Ntstatus = 0xC01E033Bu.toInt()

public val STATUS_GRAPHICS_LEADLINK_NOT_ENUMERATED: Ntstatus = 0xC01E0431u.toInt()

public val STATUS_GRAPHICS_LEADLINK_START_DEFERRED: Ntstatus = 0x401E0437u.toInt()

public val STATUS_GRAPHICS_LINK_CONFIGURATION_IN_PROGRESS: Ntstatus = 0x801E0000u.toInt()

public val STATUS_GRAPHICS_MAX_NUM_PATHS_REACHED: Ntstatus = 0xC01E0359u.toInt()

public val STATUS_GRAPHICS_MCA_INTERNAL_ERROR: Ntstatus = 0xC01E0588u.toInt()

public val STATUS_GRAPHICS_MIRRORING_DEVICES_NOT_SUPPORTED: Ntstatus = 0xC01E05E3u.toInt()

public val STATUS_GRAPHICS_MODE_ALREADY_IN_MODESET: Ntstatus = 0xC01E0314u.toInt()

public val STATUS_GRAPHICS_MODE_ID_MUST_BE_UNIQUE: Ntstatus = 0xC01E0324u.toInt()

public val STATUS_GRAPHICS_MODE_NOT_IN_MODESET: Ntstatus = 0xC01E034Au.toInt()

public val STATUS_GRAPHICS_MODE_NOT_PINNED: Ntstatus = 0x401E0307u.toInt()

public val STATUS_GRAPHICS_MONITORDESCRIPTOR_ALREADY_IN_SET: Ntstatus = 0xC01E032Du.toInt()

public val STATUS_GRAPHICS_MONITORDESCRIPTOR_ID_MUST_BE_UNIQUE: Ntstatus = 0xC01E032Eu.toInt()

public val STATUS_GRAPHICS_MONITORDESCRIPTOR_NOT_IN_SET: Ntstatus = 0xC01E032Cu.toInt()

public val STATUS_GRAPHICS_MONITOR_COULD_NOT_BE_ASSOCIATED_WITH_ADAPTER: Ntstatus = 0xC01E0334u.toInt()

public val STATUS_GRAPHICS_MONITOR_NOT_CONNECTED: Ntstatus = 0xC01E0338u.toInt()

public val STATUS_GRAPHICS_MONITOR_NO_LONGER_EXISTS: Ntstatus = 0xC01E058Du.toInt()

public val STATUS_GRAPHICS_MPO_ALLOCATION_UNPINNED: Ntstatus = 0xC01E0018u.toInt()

public val STATUS_GRAPHICS_MULTISAMPLING_NOT_SUPPORTED: Ntstatus = 0xC01E0349u.toInt()

public val STATUS_GRAPHICS_NOT_A_LINKED_ADAPTER: Ntstatus = 0xC01E0430u.toInt()

public val STATUS_GRAPHICS_NOT_EXCLUSIVE_MODE_OWNER: Ntstatus = 0xC01E0000u.toInt()

public val STATUS_GRAPHICS_NOT_POST_DEVICE_DRIVER: Ntstatus = 0xC01E0438u.toInt()

public val STATUS_GRAPHICS_NO_ACTIVE_VIDPN: Ntstatus = 0xC01E0336u.toInt()

public val STATUS_GRAPHICS_NO_AVAILABLE_IMPORTANCE_ORDINALS: Ntstatus = 0xC01E0354u.toInt()

public val STATUS_GRAPHICS_NO_AVAILABLE_VIDPN_TARGET: Ntstatus = 0xC01E0333u.toInt()

public val STATUS_GRAPHICS_NO_DISPLAY_DEVICE_CORRESPONDS_TO_NAME: Ntstatus = 0xC01E05E1u.toInt()

public val STATUS_GRAPHICS_NO_DISPLAY_MODE_MANAGEMENT_SUPPORT: Ntstatus = 0xC01E0341u.toInt()

public val STATUS_GRAPHICS_NO_MONITORS_CORRESPOND_TO_DISPLAY_DEVICE: Ntstatus = 0xC01E05E5u.toInt()

public val STATUS_GRAPHICS_NO_MORE_ELEMENTS_IN_DATASET: Ntstatus = 0x401E034Cu.toInt()

public val STATUS_GRAPHICS_NO_PREFERRED_MODE: Ntstatus = 0x401E031Eu.toInt()

public val STATUS_GRAPHICS_NO_RECOMMENDED_FUNCTIONAL_VIDPN: Ntstatus = 0xC01E0323u.toInt()

public val STATUS_GRAPHICS_NO_RECOMMENDED_VIDPN_TOPOLOGY: Ntstatus = 0xC01E031Au.toInt()

public val STATUS_GRAPHICS_NO_VIDEO_MEMORY: Ntstatus = 0xC01E0100u.toInt()

public val STATUS_GRAPHICS_NO_VIDPNMGR: Ntstatus = 0xC01E0335u.toInt()

public val STATUS_GRAPHICS_ONLY_CONSOLE_SESSION_SUPPORTED: Ntstatus = 0xC01E05E0u.toInt()

public val STATUS_GRAPHICS_OPM_ALL_HDCP_HARDWARE_ALREADY_IN_USE: Ntstatus = 0xC01E0518u.toInt()

public val STATUS_GRAPHICS_OPM_DRIVER_INTERNAL_ERROR: Ntstatus = 0xC01E051Eu.toInt()

public val STATUS_GRAPHICS_OPM_HDCP_SRM_NEVER_SET: Ntstatus = 0xC01E0516u.toInt()

public val STATUS_GRAPHICS_OPM_INTERNAL_ERROR: Ntstatus = 0xC01E050Bu.toInt()

public val STATUS_GRAPHICS_OPM_INVALID_CONFIGURATION_REQUEST: Ntstatus = 0xC01E0521u.toInt()

public val STATUS_GRAPHICS_OPM_INVALID_ENCRYPTED_PARAMETERS: Ntstatus = 0xC01E0503u.toInt()

public val STATUS_GRAPHICS_OPM_INVALID_HANDLE: Ntstatus = 0xC01E050Cu.toInt()

public val STATUS_GRAPHICS_OPM_INVALID_INFORMATION_REQUEST: Ntstatus = 0xC01E051Du.toInt()

public val STATUS_GRAPHICS_OPM_INVALID_SRM: Ntstatus = 0xC01E0512u.toInt()

public val STATUS_GRAPHICS_OPM_NOT_SUPPORTED: Ntstatus = 0xC01E0500u.toInt()

public val STATUS_GRAPHICS_OPM_NO_PROTECTED_OUTPUTS_EXIST: Ntstatus = 0xC01E0505u.toInt()

public val STATUS_GRAPHICS_OPM_OUTPUT_DOES_NOT_SUPPORT_ACP: Ntstatus = 0xC01E0514u.toInt()

public val STATUS_GRAPHICS_OPM_OUTPUT_DOES_NOT_SUPPORT_CGMSA: Ntstatus = 0xC01E0515u.toInt()

public val STATUS_GRAPHICS_OPM_OUTPUT_DOES_NOT_SUPPORT_HDCP: Ntstatus = 0xC01E0513u.toInt()

public val STATUS_GRAPHICS_OPM_PROTECTED_OUTPUT_DOES_NOT_HAVE_COPP_SEMANTICS: Ntstatus = 0xC01E051Cu.toInt()

public val STATUS_GRAPHICS_OPM_PROTECTED_OUTPUT_DOES_NOT_HAVE_OPM_SEMANTICS: Ntstatus = 0xC01E051Fu.toInt()

public val STATUS_GRAPHICS_OPM_PROTECTED_OUTPUT_NO_LONGER_EXISTS: Ntstatus = 0xC01E051Au.toInt()

public val STATUS_GRAPHICS_OPM_RESOLUTION_TOO_HIGH: Ntstatus = 0xC01E0517u.toInt()

public val STATUS_GRAPHICS_OPM_SIGNALING_NOT_SUPPORTED: Ntstatus = 0xC01E0520u.toInt()

public val STATUS_GRAPHICS_OPM_SPANNING_MODE_ENABLED: Ntstatus = 0xC01E050Fu.toInt()

public val STATUS_GRAPHICS_OPM_THEATER_MODE_ENABLED: Ntstatus = 0xC01E0510u.toInt()

public val STATUS_GRAPHICS_PARAMETER_ARRAY_TOO_SMALL: Ntstatus = 0xC01E05E6u.toInt()

public val STATUS_GRAPHICS_PARTIAL_DATA_POPULATED: Ntstatus = 0x401E000Au.toInt()

public val STATUS_GRAPHICS_PATH_ALREADY_IN_TOPOLOGY: Ntstatus = 0xC01E0313u.toInt()

public val STATUS_GRAPHICS_PATH_CONTENT_GEOMETRY_TRANSFORMATION_NOT_PINNED: Ntstatus = 0x401E0351u.toInt()

public val STATUS_GRAPHICS_PATH_CONTENT_GEOMETRY_TRANSFORMATION_NOT_SUPPORTED: Ntstatus = 0xC01E0346u.toInt()

public val STATUS_GRAPHICS_PATH_NOT_IN_TOPOLOGY: Ntstatus = 0xC01E0327u.toInt()

public val STATUS_GRAPHICS_PINNED_MODE_MUST_REMAIN_IN_SET: Ntstatus = 0xC01E0312u.toInt()

public val STATUS_GRAPHICS_POLLING_TOO_FREQUENTLY: Ntstatus = 0x401E0439u.toInt()

public val STATUS_GRAPHICS_PRESENT_BUFFER_NOT_BOUND: Ntstatus = 0xC01E0010u.toInt()

public val STATUS_GRAPHICS_PRESENT_DENIED: Ntstatus = 0xC01E0007u.toInt()

public val STATUS_GRAPHICS_PRESENT_INVALID_WINDOW: Ntstatus = 0xC01E000Fu.toInt()

public val STATUS_GRAPHICS_PRESENT_MODE_CHANGED: Ntstatus = 0xC01E0005u.toInt()

public val STATUS_GRAPHICS_PRESENT_OCCLUDED: Ntstatus = 0xC01E0006u.toInt()

public val STATUS_GRAPHICS_PRESENT_REDIRECTION_DISABLED: Ntstatus = 0xC01E000Bu.toInt()

public val STATUS_GRAPHICS_PRESENT_UNOCCLUDED: Ntstatus = 0xC01E000Cu.toInt()

public val STATUS_GRAPHICS_PVP_HFS_FAILED: Ntstatus = 0xC01E0511u.toInt()

public val STATUS_GRAPHICS_PVP_INVALID_CERTIFICATE_LENGTH: Ntstatus = 0xC01E050Eu.toInt()

public val STATUS_GRAPHICS_RESOURCES_NOT_RELATED: Ntstatus = 0xC01E0330u.toInt()

public val STATUS_GRAPHICS_SESSION_TYPE_CHANGE_IN_PROGRESS: Ntstatus = 0xC01E05E8u.toInt()

public val STATUS_GRAPHICS_SKIP_ALLOCATION_PREPARATION: Ntstatus = 0x401E0201u.toInt()

public val STATUS_GRAPHICS_SOURCE_ALREADY_IN_SET: Ntstatus = 0xC01E0317u.toInt()
