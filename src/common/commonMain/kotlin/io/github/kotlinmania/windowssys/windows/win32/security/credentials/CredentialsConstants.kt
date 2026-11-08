package io.github.kotlinmania.windowssys.windows.win32.security.credentials

import io.github.kotlinmania.windowssys.U128
import io.github.kotlinmania.windowssys.core.GUID
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.s
import io.github.kotlinmania.windowssys.core.w
import io.github.kotlinmania.windowssys.windows.win32.foundation.NTSTATUS

public val BinaryBlobCredential: CRED_MARSHAL_TYPE = 3

public val BinaryBlobForSystem: CRED_MARSHAL_TYPE = 5

public val CERT_HASH_LENGTH: UInt = 20u

public val CREDSSP_CRED_EX_VERSION: UInt = 0u

public val CREDSSP_FLAG_REDIRECT: UInt = 1u

public val CREDSSP_NAME: PCWSTR = w("CREDSSP")

public val CREDSSP_SERVER_AUTH_CERTIFICATE: UInt = 2u

public val CREDSSP_SERVER_AUTH_LOOPBACK: UInt = 4u

public val CREDSSP_SERVER_AUTH_NEGOTIATE: UInt = 1u

public val CREDUIWIN_AUTHPACKAGE_ONLY: CREDUIWIN_FLAGS = 16u

public val CREDUIWIN_CHECKBOX: CREDUIWIN_FLAGS = 2u

public val CREDUIWIN_DOWNLEVEL_HELLO_AS_SMART_CARD: UInt = 2147483648u

public val CREDUIWIN_ENUMERATE_ADMINS: CREDUIWIN_FLAGS = 256u

public val CREDUIWIN_ENUMERATE_CURRENT_USER: CREDUIWIN_FLAGS = 512u

public val CREDUIWIN_GENERIC: CREDUIWIN_FLAGS = 1u

public val CREDUIWIN_IGNORE_CLOUDAUTHORITY_NAME: UInt = 262144u

public val CREDUIWIN_IN_CRED_ONLY: CREDUIWIN_FLAGS = 32u

public val CREDUIWIN_PACK_32_WOW: CREDUIWIN_FLAGS = 268435456u

public val CREDUIWIN_PREPROMPTING: CREDUIWIN_FLAGS = 8192u

public val CREDUIWIN_SECURE_PROMPT: CREDUIWIN_FLAGS = 4096u

public val CREDUI_FLAGS_ALWAYS_SHOW_UI: CREDUI_FLAGS = 128u

public val CREDUI_FLAGS_COMPLETE_USERNAME: CREDUI_FLAGS = 2048u

public val CREDUI_FLAGS_DO_NOT_PERSIST: CREDUI_FLAGS = 2u

public val CREDUI_FLAGS_EXCLUDE_CERTIFICATES: CREDUI_FLAGS = 8u

public val CREDUI_FLAGS_EXPECT_CONFIRMATION: CREDUI_FLAGS = 131072u

public val CREDUI_FLAGS_GENERIC_CREDENTIALS: CREDUI_FLAGS = 262144u

public val CREDUI_FLAGS_INCORRECT_PASSWORD: CREDUI_FLAGS = 1u

public val CREDUI_FLAGS_KEEP_USERNAME: CREDUI_FLAGS = 1048576u

public val CREDUI_FLAGS_PASSWORD_ONLY_OK: CREDUI_FLAGS = 512u

public val CREDUI_FLAGS_PERSIST: CREDUI_FLAGS = 4096u

public val CREDUI_FLAGS_REQUEST_ADMINISTRATOR: CREDUI_FLAGS = 4u

public val CREDUI_FLAGS_REQUIRE_CERTIFICATE: CREDUI_FLAGS = 16u

public val CREDUI_FLAGS_REQUIRE_SMARTCARD: CREDUI_FLAGS = 256u

public val CREDUI_FLAGS_SERVER_CREDENTIAL: CREDUI_FLAGS = 16384u

public val CREDUI_FLAGS_SHOW_SAVE_CHECK_BOX: CREDUI_FLAGS = 64u

public val CREDUI_FLAGS_USERNAME_TARGET_CREDENTIALS: CREDUI_FLAGS = 524288u

public val CREDUI_FLAGS_VALIDATE_USERNAME: CREDUI_FLAGS = 1024u

public val CREDUI_MAX_CAPTION_LENGTH: UInt = 128u

public val CREDUI_MAX_DOMAIN_TARGET_LENGTH: UInt = 337u

public val CREDUI_MAX_GENERIC_TARGET_LENGTH: UInt = 32767u

public val CREDUI_MAX_MESSAGE_LENGTH: UInt = 1024u

public val CREDUI_MAX_USERNAME_LENGTH: UInt = 513u

public val CRED_ALLOW_NAME_RESOLUTION: UInt = 1u

public val CRED_CACHE_TARGET_INFORMATION: UInt = 1u

public val CRED_ENUMERATE_ALL_CREDENTIALS: CRED_ENUMERATE_FLAGS = 1u

public val CRED_FLAGS_NGC_CERT: CRED_FLAGS = 128u

public val CRED_FLAGS_OWF_CRED_BLOB: CRED_FLAGS = 8u

public val CRED_FLAGS_PASSWORD_FOR_CERT: CRED_FLAGS = 1u

public val CRED_FLAGS_PROMPT_NOW: CRED_FLAGS = 2u

public val CRED_FLAGS_REQUIRE_CONFIRMATION: CRED_FLAGS = 16u

public val CRED_FLAGS_USERNAME_TARGET: CRED_FLAGS = 4u

public val CRED_FLAGS_VALID_FLAGS: CRED_FLAGS = 61695u

public val CRED_FLAGS_VALID_INPUT_FLAGS: CRED_FLAGS = 61599u

public val CRED_FLAGS_VSM_PROTECTED: CRED_FLAGS = 64u

public val CRED_FLAGS_WILDCARD_MATCH: CRED_FLAGS = 32u

public val CRED_LOGON_TYPES_MASK: UInt = 61440u

public val CRED_MAX_ATTRIBUTES: UInt = 64u

public val CRED_MAX_CREDENTIAL_BLOB_SIZE: UInt = 2560u

public val CRED_MAX_DOMAIN_TARGET_NAME_LENGTH: UInt = 337u

public val CRED_MAX_GENERIC_TARGET_NAME_LENGTH: UInt = 32767u

public val CRED_MAX_STRING_LENGTH: UInt = 256u

public val CRED_MAX_TARGETNAME_ATTRIBUTE_LENGTH: UInt = 256u

public val CRED_MAX_TARGETNAME_NAMESPACE_LENGTH: UInt = 256u

public val CRED_MAX_USERNAME_LENGTH: UInt = 513u

public val CRED_MAX_VALUE_SIZE: UInt = 256u

public val CRED_PACK_GENERIC_CREDENTIALS: CRED_PACK_FLAGS = 4u

public val CRED_PACK_ID_PROVIDER_CREDENTIALS: CRED_PACK_FLAGS = 8u

public val CRED_PACK_PROTECTED_CREDENTIALS: CRED_PACK_FLAGS = 1u

public val CRED_PACK_WOW_BUFFER: CRED_PACK_FLAGS = 2u

public val CRED_PERSIST_ENTERPRISE: CRED_PERSIST = 3u

public val CRED_PERSIST_LOCAL_MACHINE: CRED_PERSIST = 2u

public val CRED_PERSIST_NONE: CRED_PERSIST = 0u

public val CRED_PERSIST_SESSION: CRED_PERSIST = 1u

public val CRED_PRESERVE_CREDENTIAL_BLOB: UInt = 1u

public val CRED_PROTECT_AS_SELF: UInt = 1u

public val CRED_PROTECT_TO_SYSTEM: UInt = 2u

public val CRED_SESSION_WILDCARD_NAME: PCWSTR = w("*Session")

public val CRED_SESSION_WILDCARD_NAME_A: PCSTR = s("*Session")

public val CRED_SESSION_WILDCARD_NAME_W: PCWSTR = w("*Session")

public val CRED_TARGETNAME_ATTRIBUTE_BATCH: PCWSTR = w("batch")

public val CRED_TARGETNAME_ATTRIBUTE_BATCH_A: PCSTR = s("batch")

public val CRED_TARGETNAME_ATTRIBUTE_BATCH_W: PCWSTR = w("batch")

public val CRED_TARGETNAME_ATTRIBUTE_CACHEDINTERACTIVE: PCWSTR = w("cachedinteractive")

public val CRED_TARGETNAME_ATTRIBUTE_CACHEDINTERACTIVE_A: PCSTR = s("cachedinteractive")

public val CRED_TARGETNAME_ATTRIBUTE_CACHEDINTERACTIVE_W: PCWSTR = w("cachedinteractive")

public val CRED_TARGETNAME_ATTRIBUTE_INTERACTIVE: PCWSTR = w("interactive")

public val CRED_TARGETNAME_ATTRIBUTE_INTERACTIVE_A: PCSTR = s("interactive")

public val CRED_TARGETNAME_ATTRIBUTE_INTERACTIVE_W: PCWSTR = w("interactive")

public val CRED_TARGETNAME_ATTRIBUTE_NAME: PCWSTR = w("name")

public val CRED_TARGETNAME_ATTRIBUTE_NAME_A: PCSTR = s("name")

public val CRED_TARGETNAME_ATTRIBUTE_NAME_W: PCWSTR = w("name")

public val CRED_TARGETNAME_ATTRIBUTE_NETWORK: PCWSTR = w("network")

public val CRED_TARGETNAME_ATTRIBUTE_NETWORKCLEARTEXT: PCWSTR = w("networkcleartext")

public val CRED_TARGETNAME_ATTRIBUTE_NETWORKCLEARTEXT_A: PCSTR = s("networkcleartext")

public val CRED_TARGETNAME_ATTRIBUTE_NETWORKCLEARTEXT_W: PCWSTR = w("networkcleartext")

public val CRED_TARGETNAME_ATTRIBUTE_NETWORK_A: PCSTR = s("network")

public val CRED_TARGETNAME_ATTRIBUTE_NETWORK_W: PCWSTR = w("network")

public val CRED_TARGETNAME_ATTRIBUTE_REMOTEINTERACTIVE: PCWSTR = w("remoteinteractive")

public val CRED_TARGETNAME_ATTRIBUTE_REMOTEINTERACTIVE_A: PCSTR = s("remoteinteractive")

public val CRED_TARGETNAME_ATTRIBUTE_REMOTEINTERACTIVE_W: PCWSTR = w("remoteinteractive")

public val CRED_TARGETNAME_ATTRIBUTE_SERVICE: PCWSTR = w("service")

public val CRED_TARGETNAME_ATTRIBUTE_SERVICE_A: PCSTR = s("service")

public val CRED_TARGETNAME_ATTRIBUTE_SERVICE_W: PCWSTR = w("service")

public val CRED_TARGETNAME_ATTRIBUTE_TARGET: PCWSTR = w("target")

public val CRED_TARGETNAME_ATTRIBUTE_TARGET_A: PCSTR = s("target")

public val CRED_TARGETNAME_ATTRIBUTE_TARGET_W: PCWSTR = w("target")

public val CRED_TARGETNAME_DOMAIN_NAMESPACE: PCWSTR = w("Domain")

public val CRED_TARGETNAME_DOMAIN_NAMESPACE_A: PCSTR = s("Domain")

public val CRED_TARGETNAME_DOMAIN_NAMESPACE_W: PCWSTR = w("Domain")

public val CRED_TARGETNAME_LEGACYGENERIC_NAMESPACE_A: PCSTR = s("LegacyGeneric")

public val CRED_TARGETNAME_LEGACYGENERIC_NAMESPACE_W: PCWSTR = w("LegacyGeneric")

public val CRED_TI_CREATE_EXPLICIT_CRED: UInt = 16u

public val CRED_TI_DNSTREE_IS_DFS_SERVER: UInt = 64u

public val CRED_TI_DOMAIN_FORMAT_UNKNOWN: UInt = 2u

public val CRED_TI_ONLY_PASSWORD_REQUIRED: UInt = 4u

public val CRED_TI_SERVER_FORMAT_UNKNOWN: UInt = 1u

public val CRED_TI_USERNAME_TARGET: UInt = 8u

public val CRED_TI_VALID_FLAGS: UInt = 61567u

public val CRED_TI_WORKGROUP_MEMBER: UInt = 32u

public val CRED_TYPE_DOMAIN_CERTIFICATE: CRED_TYPE = 3u

public val CRED_TYPE_DOMAIN_EXTENDED: CRED_TYPE = 6u

public val CRED_TYPE_DOMAIN_PASSWORD: CRED_TYPE = 2u

public val CRED_TYPE_DOMAIN_VISIBLE_PASSWORD: CRED_TYPE = 4u

public val CRED_TYPE_GENERIC: CRED_TYPE = 1u

public val CRED_TYPE_GENERIC_CERTIFICATE: CRED_TYPE = 5u

public val CRED_TYPE_MAXIMUM: CRED_TYPE = 7u

public val CRED_TYPE_MAXIMUM_EX: CRED_TYPE = 1007u

public val CRED_UNPROTECT_ALLOW_TO_SYSTEM: UInt = 2u

public val CRED_UNPROTECT_AS_SELF: UInt = 1u

public val CertCredential: CRED_MARSHAL_TYPE = 1

public val CredForSystemProtection: CRED_PROTECTION_TYPE = 3

public val CredTrustedProtection: CRED_PROTECTION_TYPE = 2

public val CredUnprotected: CRED_PROTECTION_TYPE = 0

public val CredUserProtection: CRED_PROTECTION_TYPE = 1

public val CredsspCertificateCreds: CREDSPP_SUBMIT_TYPE = 13

public val CredsspCredEx: CREDSPP_SUBMIT_TYPE = 100

public val CredsspPasswordCreds: CREDSPP_SUBMIT_TYPE = 2

public val CredsspSchannelCreds: CREDSPP_SUBMIT_TYPE = 4

public val CredsspSubmitBufferBoth: CREDSPP_SUBMIT_TYPE = 50

public val CredsspSubmitBufferBothOld: CREDSPP_SUBMIT_TYPE = 51

public val FILE_DEVICE_SMARTCARD: UInt = 49u

public val GUID_DEVINTERFACE_SMARTCARD_READER: GUID = GUID.from_u128(U128(0x50dd5230ba8a11d1uL, 0xbf5d0000f805f530uL))

public val KeyCredentialManagerOperationErrorStateCertificateFailure: KeyCredentialManagerOperationErrorStates = 4

public val KeyCredentialManagerOperationErrorStateDeviceJoinFailure: KeyCredentialManagerOperationErrorStates = 1

public val KeyCredentialManagerOperationErrorStateHardwareFailure: KeyCredentialManagerOperationErrorStates = 32

public val KeyCredentialManagerOperationErrorStateNone: KeyCredentialManagerOperationErrorStates = 0

public val KeyCredentialManagerOperationErrorStatePinExistsFailure: KeyCredentialManagerOperationErrorStates = 64

public val KeyCredentialManagerOperationErrorStatePolicyFailure: KeyCredentialManagerOperationErrorStates = 16

public val KeyCredentialManagerOperationErrorStateRemoteSessionFailure: KeyCredentialManagerOperationErrorStates = 8

public val KeyCredentialManagerOperationErrorStateTokenFailure: KeyCredentialManagerOperationErrorStates = 2

public val KeyCredentialManagerPinChange: KeyCredentialManagerOperationType = 1

public val KeyCredentialManagerPinReset: KeyCredentialManagerOperationType = 2

public val KeyCredentialManagerProvisioning: KeyCredentialManagerOperationType = 0

public val MAXIMUM_ATTR_STRING_LENGTH: UInt = 32u

public val MAXIMUM_SMARTCARD_READERS: UInt = 10u

public val RSR_MATCH_TYPE_ALL_CARDS: READER_SEL_REQUEST_MATCH_TYPE = 3

public val RSR_MATCH_TYPE_READER_AND_CONTAINER: READER_SEL_REQUEST_MATCH_TYPE = 1

public val RSR_MATCH_TYPE_SERIAL_NUMBER: READER_SEL_REQUEST_MATCH_TYPE = 2

public val SCARD_ABSENT: UInt = 1u

public val SCARD_ALL_READERS: PCWSTR = w("SCard\$AllReaders\u000000")

public val SCARD_ATR_LENGTH: UInt = 33u

public val SCARD_AUDIT_CHV_FAILURE: UInt = 0u

public val SCARD_AUDIT_CHV_SUCCESS: UInt = 1u

public val SCARD_CLASS_COMMUNICATIONS: UInt = 2u

public val SCARD_CLASS_ICC_STATE: UInt = 9u

public val SCARD_CLASS_IFD_PROTOCOL: UInt = 8u

public val SCARD_CLASS_MECHANICAL: UInt = 6u

public val SCARD_CLASS_PERF: UInt = 32766u

public val SCARD_CLASS_POWER_MGMT: UInt = 4u

public val SCARD_CLASS_PROTOCOL: UInt = 3u

public val SCARD_CLASS_SECURITY: UInt = 5u

public val SCARD_CLASS_SYSTEM: UInt = 32767u

public val SCARD_CLASS_VENDOR_DEFINED: UInt = 7u

public val SCARD_CLASS_VENDOR_INFO: UInt = 1u

public val SCARD_COLD_RESET: UInt = 1u

public val SCARD_DEFAULT_READERS: PCWSTR = w("SCard\$DefaultReaders\u000000")

public val SCARD_EJECT_CARD: UInt = 3u

public val SCARD_LEAVE_CARD: UInt = 0u

public val SCARD_LOCAL_READERS: PCWSTR = w("SCard\$LocalReaders\u000000")

public val SCARD_NEGOTIABLE: UInt = 5u

public val SCARD_POWERED: UInt = 4u

public val SCARD_POWER_DOWN: UInt = 0u

public val SCARD_PRESENT: UInt = 2u

public val SCARD_PROTOCOL_DEFAULT: UInt = 2147483648u

public val SCARD_PROTOCOL_OPTIMAL: UInt = 0u

public val SCARD_PROTOCOL_RAW: UInt = 65536u

public val SCARD_PROTOCOL_T0: UInt = 1u

public val SCARD_PROTOCOL_T1: UInt = 2u

public val SCARD_PROTOCOL_UNDEFINED: UInt = 0u

public val SCARD_PROVIDER_CSP: UInt = 2u

public val SCARD_PROVIDER_KSP: UInt = 3u

public val SCARD_PROVIDER_PRIMARY: UInt = 1u

public val SCARD_READER_CONFISCATES: UInt = 4u

public val SCARD_READER_CONTACTLESS: UInt = 8u

public val SCARD_READER_EJECTS: UInt = 2u

public val SCARD_READER_SWALLOWS: UInt = 1u

public val SCARD_READER_TYPE_EMBEDDEDSE: UInt = 2048u

public val SCARD_READER_TYPE_IDE: UInt = 16u

public val SCARD_READER_TYPE_KEYBOARD: UInt = 4u

public val SCARD_READER_TYPE_NFC: UInt = 256u

public val SCARD_READER_TYPE_NGC: UInt = 1024u

public val SCARD_READER_TYPE_PARALELL: UInt = 2u

public val SCARD_READER_TYPE_PCMCIA: UInt = 64u

public val SCARD_READER_TYPE_SCSI: UInt = 8u

public val SCARD_READER_TYPE_SERIAL: UInt = 1u

public val SCARD_READER_TYPE_TPM: UInt = 128u

public val SCARD_READER_TYPE_UICC: UInt = 512u

public val SCARD_READER_TYPE_USB: UInt = 32u

public val SCARD_READER_TYPE_VENDOR: UInt = 240u

public val SCARD_RESET_CARD: UInt = 1u

public val SCARD_SCOPE_SYSTEM: SCARD_SCOPE = 2u

public val SCARD_SCOPE_TERMINAL: UInt = 1u

public val SCARD_SCOPE_USER: SCARD_SCOPE = 0u

public val SCARD_SHARE_DIRECT: UInt = 3u

public val SCARD_SHARE_EXCLUSIVE: UInt = 1u

public val SCARD_SHARE_SHARED: UInt = 2u

public val SCARD_SPECIFIC: UInt = 6u

public val SCARD_STATE_ATRMATCH: SCARD_STATE = 64u

public val SCARD_STATE_CHANGED: SCARD_STATE = 2u

public val SCARD_STATE_EMPTY: SCARD_STATE = 16u

public val SCARD_STATE_EXCLUSIVE: SCARD_STATE = 128u

public val SCARD_STATE_IGNORE: SCARD_STATE = 1u

public val SCARD_STATE_INUSE: SCARD_STATE = 256u

public val SCARD_STATE_MUTE: SCARD_STATE = 512u

public val SCARD_STATE_PRESENT: SCARD_STATE = 32u

public val SCARD_STATE_UNAVAILABLE: SCARD_STATE = 8u

public val SCARD_STATE_UNAWARE: SCARD_STATE = 0u

public val SCARD_STATE_UNKNOWN: SCARD_STATE = 4u

public val SCARD_STATE_UNPOWERED: UInt = 1024u

public val SCARD_SWALLOWED: UInt = 3u

public val SCARD_SYSTEM_READERS: PCWSTR = w("SCard\$SystemReaders\u000000")

public val SCARD_T0_CMD_LENGTH: UInt = 5u

public val SCARD_T0_HEADER_LENGTH: UInt = 7u

public val SCARD_T1_EPILOGUE_LENGTH: UInt = 2u

public val SCARD_T1_EPILOGUE_LENGTH_LRC: UInt = 1u

public val SCARD_T1_MAX_IFS: UInt = 254u

public val SCARD_T1_PROLOGUE_LENGTH: UInt = 3u

public val SCARD_UNKNOWN: UInt = 0u

public val SCARD_UNPOWER_CARD: UInt = 2u

public val SCARD_WARM_RESET: UInt = 2u

public val SCERR_NOCARDNAME: UInt = 16384u

public val SCERR_NOGUIDS: UInt = 32768u

public val SC_DLG_FORCE_UI: UInt = 4u

public val SC_DLG_MINIMAL_UI: UInt = 1u

public val SC_DLG_NO_UI: UInt = 2u

public val SECPKG_ALT_ATTR: UInt = 2147483648u

public val SECPKG_ATTR_C_FULL_IDENT_TOKEN: UInt = 2147483781u

public val STATUS_ACCOUNT_DISABLED: NTSTATUS = 0xC0000072u.toInt()

public val STATUS_ACCOUNT_EXPIRED: NTSTATUS = 0xC0000193u.toInt()

public val STATUS_ACCOUNT_LOCKED_OUT: NTSTATUS = 0xC0000234u.toInt()

public val STATUS_ACCOUNT_RESTRICTION: NTSTATUS = 0xC000006Eu.toInt()

public val STATUS_AUTHENTICATION_FIREWALL_FAILED: NTSTATUS = 0xC0000413u.toInt()

public val STATUS_DOWNGRADE_DETECTED: NTSTATUS = 0xC0000388u.toInt()

public val STATUS_LOGON_FAILURE: NTSTATUS = 0xC000006Du.toInt()

public val STATUS_LOGON_TYPE_NOT_GRANTED: NTSTATUS = 0xC000015Bu.toInt()

public val STATUS_NO_SUCH_LOGON_SESSION: NTSTATUS = 0xC000005Fu.toInt()

public val STATUS_NO_SUCH_USER: NTSTATUS = 0xC0000064u.toInt()

public val STATUS_PASSWORD_EXPIRED: NTSTATUS = 0xC0000071u.toInt()

public val STATUS_PASSWORD_MUST_CHANGE: NTSTATUS = 0xC0000224u.toInt()

public val STATUS_WRONG_PASSWORD: NTSTATUS = 0xC000006Au.toInt()

public val TS_SSP_NAME: PCWSTR = w("TSSSP")

public val TS_SSP_NAME_A: PCSTR = s("TSSSP")

public val UsernameForPackedCredentials: CRED_MARSHAL_TYPE = 4

public val UsernameTargetCredential: CRED_MARSHAL_TYPE = 2

public val szOID_TS_KP_TS_SERVER_AUTH: PCSTR = s("1.3.6.1.4.1.311.54.1.2")
