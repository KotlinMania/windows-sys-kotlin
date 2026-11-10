package io.github.kotlinmania.windowssys.windows.win32.security.credentials

import io.github.kotlinmania.windowssys.U128
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.s
import io.github.kotlinmania.windowssys.core.w
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus

public val BINARY_BLOB_CREDENTIAL: CredMarshalType = 3

public val BINARY_BLOB_FOR_SYSTEM: CredMarshalType = 5

public val CERT_HASH_LENGTH: UInt = 20u

public val CREDSSP_CRED_EX_VERSION: UInt = 0u

public val CREDSSP_FLAG_REDIRECT: UInt = 1u

public val CREDSSP_NAME: Pcwstr = w("CREDSSP")

public val CREDSSP_SERVER_AUTH_CERTIFICATE: UInt = 2u

public val CREDSSP_SERVER_AUTH_LOOPBACK: UInt = 4u

public val CREDSSP_SERVER_AUTH_NEGOTIATE: UInt = 1u

public val CREDUIWIN_AUTHPACKAGE_ONLY: CreduiwinFlags = 16u

public val CREDUIWIN_CHECKBOX: CreduiwinFlags = 2u

public val CREDUIWIN_DOWNLEVEL_HELLO_AS_SMART_CARD: UInt = 2147483648u

public val CREDUIWIN_ENUMERATE_ADMINS: CreduiwinFlags = 256u

public val CREDUIWIN_ENUMERATE_CURRENT_USER: CreduiwinFlags = 512u

public val CREDUIWIN_GENERIC: CreduiwinFlags = 1u

public val CREDUIWIN_IGNORE_CLOUDAUTHORITY_NAME: UInt = 262144u

public val CREDUIWIN_IN_CRED_ONLY: CreduiwinFlags = 32u

public val CREDUIWIN_PACK_32_WOW: CreduiwinFlags = 268435456u

public val CREDUIWIN_PREPROMPTING: CreduiwinFlags = 8192u

public val CREDUIWIN_SECURE_PROMPT: CreduiwinFlags = 4096u

public val CREDUI_FLAGS_ALWAYS_SHOW_UI: CreduiFlags = 128u

public val CREDUI_FLAGS_COMPLETE_USERNAME: CreduiFlags = 2048u

public val CREDUI_FLAGS_DO_NOT_PERSIST: CreduiFlags = 2u

public val CREDUI_FLAGS_EXCLUDE_CERTIFICATES: CreduiFlags = 8u

public val CREDUI_FLAGS_EXPECT_CONFIRMATION: CreduiFlags = 131072u

public val CREDUI_FLAGS_GENERIC_CREDENTIALS: CreduiFlags = 262144u

public val CREDUI_FLAGS_INCORRECT_PASSWORD: CreduiFlags = 1u

public val CREDUI_FLAGS_KEEP_USERNAME: CreduiFlags = 1048576u

public val CREDUI_FLAGS_PASSWORD_ONLY_OK: CreduiFlags = 512u

public val CREDUI_FLAGS_PERSIST: CreduiFlags = 4096u

public val CREDUI_FLAGS_REQUEST_ADMINISTRATOR: CreduiFlags = 4u

public val CREDUI_FLAGS_REQUIRE_CERTIFICATE: CreduiFlags = 16u

public val CREDUI_FLAGS_REQUIRE_SMARTCARD: CreduiFlags = 256u

public val CREDUI_FLAGS_SERVER_CREDENTIAL: CreduiFlags = 16384u

public val CREDUI_FLAGS_SHOW_SAVE_CHECK_BOX: CreduiFlags = 64u

public val CREDUI_FLAGS_USERNAME_TARGET_CREDENTIALS: CreduiFlags = 524288u

public val CREDUI_FLAGS_VALIDATE_USERNAME: CreduiFlags = 1024u

public val CREDUI_MAX_CAPTION_LENGTH: UInt = 128u

public val CREDUI_MAX_DOMAIN_TARGET_LENGTH: UInt = 337u

public val CREDUI_MAX_GENERIC_TARGET_LENGTH: UInt = 32767u

public val CREDUI_MAX_MESSAGE_LENGTH: UInt = 1024u

public val CREDUI_MAX_USERNAME_LENGTH: UInt = 513u

public val CRED_ALLOW_NAME_RESOLUTION: UInt = 1u

public val CRED_CACHE_TARGET_INFORMATION: UInt = 1u

public val CRED_ENUMERATE_ALL_CREDENTIALS: CredEnumerateFlags = 1u

public val CRED_FLAGS_NGC_CERT: CredFlags = 128u

public val CRED_FLAGS_OWF_CRED_BLOB: CredFlags = 8u

public val CRED_FLAGS_PASSWORD_FOR_CERT: CredFlags = 1u

public val CRED_FLAGS_PROMPT_NOW: CredFlags = 2u

public val CRED_FLAGS_REQUIRE_CONFIRMATION: CredFlags = 16u

public val CRED_FLAGS_USERNAME_TARGET: CredFlags = 4u

public val CRED_FLAGS_VALID_FLAGS: CredFlags = 61695u

public val CRED_FLAGS_VALID_INPUT_FLAGS: CredFlags = 61599u

public val CRED_FLAGS_VSM_PROTECTED: CredFlags = 64u

public val CRED_FLAGS_WILDCARD_MATCH: CredFlags = 32u

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

public val CRED_PACK_GENERIC_CREDENTIALS: CredPackFlags = 4u

public val CRED_PACK_ID_PROVIDER_CREDENTIALS: CredPackFlags = 8u

public val CRED_PACK_PROTECTED_CREDENTIALS: CredPackFlags = 1u

public val CRED_PACK_WOW_BUFFER: CredPackFlags = 2u

public val CRED_PERSIST_ENTERPRISE: CredPersist = 3u

public val CRED_PERSIST_LOCAL_MACHINE: CredPersist = 2u

public val CRED_PERSIST_NONE: CredPersist = 0u

public val CRED_PERSIST_SESSION: CredPersist = 1u

public val CRED_PRESERVE_CREDENTIAL_BLOB: UInt = 1u

public val CRED_PROTECT_AS_SELF: UInt = 1u

public val CRED_PROTECT_TO_SYSTEM: UInt = 2u

public val CRED_SESSION_WILDCARD_NAME: Pcwstr = w("*Session")

public val CRED_SESSION_WILDCARD_NAME_A: Pcstr = s("*Session")

public val CRED_SESSION_WILDCARD_NAME_W: Pcwstr = w("*Session")

public val CRED_TARGETNAME_ATTRIBUTE_BATCH: Pcwstr = w("batch")

public val CRED_TARGETNAME_ATTRIBUTE_BATCH_A: Pcstr = s("batch")

public val CRED_TARGETNAME_ATTRIBUTE_BATCH_W: Pcwstr = w("batch")

public val CRED_TARGETNAME_ATTRIBUTE_CACHEDINTERACTIVE: Pcwstr = w("cachedinteractive")

public val CRED_TARGETNAME_ATTRIBUTE_CACHEDINTERACTIVE_A: Pcstr = s("cachedinteractive")

public val CRED_TARGETNAME_ATTRIBUTE_CACHEDINTERACTIVE_W: Pcwstr = w("cachedinteractive")

public val CRED_TARGETNAME_ATTRIBUTE_INTERACTIVE: Pcwstr = w("interactive")

public val CRED_TARGETNAME_ATTRIBUTE_INTERACTIVE_A: Pcstr = s("interactive")

public val CRED_TARGETNAME_ATTRIBUTE_INTERACTIVE_W: Pcwstr = w("interactive")

public val CRED_TARGETNAME_ATTRIBUTE_NAME: Pcwstr = w("name")

public val CRED_TARGETNAME_ATTRIBUTE_NAME_A: Pcstr = s("name")

public val CRED_TARGETNAME_ATTRIBUTE_NAME_W: Pcwstr = w("name")

public val CRED_TARGETNAME_ATTRIBUTE_NETWORK: Pcwstr = w("network")

public val CRED_TARGETNAME_ATTRIBUTE_NETWORKCLEARTEXT: Pcwstr = w("networkcleartext")

public val CRED_TARGETNAME_ATTRIBUTE_NETWORKCLEARTEXT_A: Pcstr = s("networkcleartext")

public val CRED_TARGETNAME_ATTRIBUTE_NETWORKCLEARTEXT_W: Pcwstr = w("networkcleartext")

public val CRED_TARGETNAME_ATTRIBUTE_NETWORK_A: Pcstr = s("network")

public val CRED_TARGETNAME_ATTRIBUTE_NETWORK_W: Pcwstr = w("network")

public val CRED_TARGETNAME_ATTRIBUTE_REMOTEINTERACTIVE: Pcwstr = w("remoteinteractive")

public val CRED_TARGETNAME_ATTRIBUTE_REMOTEINTERACTIVE_A: Pcstr = s("remoteinteractive")

public val CRED_TARGETNAME_ATTRIBUTE_REMOTEINTERACTIVE_W: Pcwstr = w("remoteinteractive")

public val CRED_TARGETNAME_ATTRIBUTE_SERVICE: Pcwstr = w("service")

public val CRED_TARGETNAME_ATTRIBUTE_SERVICE_A: Pcstr = s("service")

public val CRED_TARGETNAME_ATTRIBUTE_SERVICE_W: Pcwstr = w("service")

public val CRED_TARGETNAME_ATTRIBUTE_TARGET: Pcwstr = w("target")

public val CRED_TARGETNAME_ATTRIBUTE_TARGET_A: Pcstr = s("target")

public val CRED_TARGETNAME_ATTRIBUTE_TARGET_W: Pcwstr = w("target")

public val CRED_TARGETNAME_DOMAIN_NAMESPACE: Pcwstr = w("Domain")

public val CRED_TARGETNAME_DOMAIN_NAMESPACE_A: Pcstr = s("Domain")

public val CRED_TARGETNAME_DOMAIN_NAMESPACE_W: Pcwstr = w("Domain")

public val CRED_TARGETNAME_LEGACYGENERIC_NAMESPACE_A: Pcstr = s("LegacyGeneric")

public val CRED_TARGETNAME_LEGACYGENERIC_NAMESPACE_W: Pcwstr = w("LegacyGeneric")

public val CRED_TI_CREATE_EXPLICIT_CRED: UInt = 16u

public val CRED_TI_DNSTREE_IS_DFS_SERVER: UInt = 64u

public val CRED_TI_DOMAIN_FORMAT_UNKNOWN: UInt = 2u

public val CRED_TI_ONLY_PASSWORD_REQUIRED: UInt = 4u

public val CRED_TI_SERVER_FORMAT_UNKNOWN: UInt = 1u

public val CRED_TI_USERNAME_TARGET: UInt = 8u

public val CRED_TI_VALID_FLAGS: UInt = 61567u

public val CRED_TI_WORKGROUP_MEMBER: UInt = 32u

public val CRED_TYPE_DOMAIN_CERTIFICATE: CredType = 3u

public val CRED_TYPE_DOMAIN_EXTENDED: CredType = 6u

public val CRED_TYPE_DOMAIN_PASSWORD: CredType = 2u

public val CRED_TYPE_DOMAIN_VISIBLE_PASSWORD: CredType = 4u

public val CRED_TYPE_GENERIC: CredType = 1u

public val CRED_TYPE_GENERIC_CERTIFICATE: CredType = 5u

public val CRED_TYPE_MAXIMUM: CredType = 7u

public val CRED_TYPE_MAXIMUM_EX: CredType = 1007u

public val CRED_UNPROTECT_ALLOW_TO_SYSTEM: UInt = 2u

public val CRED_UNPROTECT_AS_SELF: UInt = 1u

public val CERT_CREDENTIAL: CredMarshalType = 1

public val CRED_FOR_SYSTEM_PROTECTION: CredProtectionType = 3

public val CRED_TRUSTED_PROTECTION: CredProtectionType = 2

public val CRED_UNPROTECTED: CredProtectionType = 0

public val CRED_USER_PROTECTION: CredProtectionType = 1

public val CREDSSP_CERTIFICATE_CREDS: CredsppSubmitType = 13

public val CREDSSP_CRED_EX: CredsppSubmitType = 100

public val CREDSSP_PASSWORD_CREDS: CredsppSubmitType = 2

public val CREDSSP_SCHANNEL_CREDS: CredsppSubmitType = 4

public val CREDSSP_SUBMIT_BUFFER_BOTH: CredsppSubmitType = 50

public val CREDSSP_SUBMIT_BUFFER_BOTH_OLD: CredsppSubmitType = 51

public val FILE_DEVICE_SMARTCARD: UInt = 49u

public val KEY_CREDENTIAL_MANAGER_OPERATION_ERROR_STATE_CERTIFICATE_FAILURE: KeyCredentialManagerOperationErrorStates = 4

public val KEY_CREDENTIAL_MANAGER_OPERATION_ERROR_STATE_DEVICE_JOIN_FAILURE: KeyCredentialManagerOperationErrorStates = 1

public val KEY_CREDENTIAL_MANAGER_OPERATION_ERROR_STATE_HARDWARE_FAILURE: KeyCredentialManagerOperationErrorStates = 32

public val KEY_CREDENTIAL_MANAGER_OPERATION_ERROR_STATE_NONE: KeyCredentialManagerOperationErrorStates = 0

public val KEY_CREDENTIAL_MANAGER_OPERATION_ERROR_STATE_PIN_EXISTS_FAILURE: KeyCredentialManagerOperationErrorStates = 64

public val KEY_CREDENTIAL_MANAGER_OPERATION_ERROR_STATE_POLICY_FAILURE: KeyCredentialManagerOperationErrorStates = 16

public val KEY_CREDENTIAL_MANAGER_OPERATION_ERROR_STATE_REMOTE_SESSION_FAILURE: KeyCredentialManagerOperationErrorStates = 8

public val KEY_CREDENTIAL_MANAGER_OPERATION_ERROR_STATE_TOKEN_FAILURE: KeyCredentialManagerOperationErrorStates = 2

public val KEY_CREDENTIAL_MANAGER_PIN_CHANGE: KeyCredentialManagerOperationType = 1

public val KEY_CREDENTIAL_MANAGER_PIN_RESET: KeyCredentialManagerOperationType = 2

public val KEY_CREDENTIAL_MANAGER_PROVISIONING: KeyCredentialManagerOperationType = 0

public val MAXIMUM_ATTR_STRING_LENGTH: UInt = 32u

public val MAXIMUM_SMARTCARD_READERS: UInt = 10u

public val RSR_MATCH_TYPE_ALL_CARDS: ReaderSelRequestMatchType = 3

public val RSR_MATCH_TYPE_READER_AND_CONTAINER: ReaderSelRequestMatchType = 1

public val RSR_MATCH_TYPE_SERIAL_NUMBER: ReaderSelRequestMatchType = 2

public val SCARD_ABSENT: UInt = 1u

public val SCARD_ALL_READERS: Pcwstr = w("SCard\$AllReaders\u000000")

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

public val SCARD_DEFAULT_READERS: Pcwstr = w("SCard\$DefaultReaders\u000000")

public val SCARD_EJECT_CARD: UInt = 3u

public val SCARD_LEAVE_CARD: UInt = 0u

public val SCARD_LOCAL_READERS: Pcwstr = w("SCard\$LocalReaders\u000000")

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

public val SCARD_SCOPE_SYSTEM: ScardScope = 2u

public val SCARD_SCOPE_TERMINAL: UInt = 1u

public val SCARD_SCOPE_USER: ScardScope = 0u

public val SCARD_SHARE_DIRECT: UInt = 3u

public val SCARD_SHARE_EXCLUSIVE: UInt = 1u

public val SCARD_SHARE_SHARED: UInt = 2u

public val SCARD_SPECIFIC: UInt = 6u

public val SCARD_STATE_ATRMATCH: ScardState = 64u

public val SCARD_STATE_CHANGED: ScardState = 2u

public val SCARD_STATE_EMPTY: ScardState = 16u

public val SCARD_STATE_EXCLUSIVE: ScardState = 128u

public val SCARD_STATE_IGNORE: ScardState = 1u

public val SCARD_STATE_INUSE: ScardState = 256u

public val SCARD_STATE_MUTE: ScardState = 512u

public val SCARD_STATE_PRESENT: ScardState = 32u

public val SCARD_STATE_UNAVAILABLE: ScardState = 8u

public val SCARD_STATE_UNAWARE: ScardState = 0u

public val SCARD_STATE_UNKNOWN: ScardState = 4u

public val SCARD_STATE_UNPOWERED: UInt = 1024u

public val SCARD_SWALLOWED: UInt = 3u

public val SCARD_SYSTEM_READERS: Pcwstr = w("SCard\$SystemReaders\u000000")

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

public val STATUS_ACCOUNT_DISABLED: Ntstatus = 0xC0000072u.toInt()

public val STATUS_ACCOUNT_EXPIRED: Ntstatus = 0xC0000193u.toInt()

public val STATUS_ACCOUNT_LOCKED_OUT: Ntstatus = 0xC0000234u.toInt()

public val STATUS_ACCOUNT_RESTRICTION: Ntstatus = 0xC000006Eu.toInt()

public val STATUS_AUTHENTICATION_FIREWALL_FAILED: Ntstatus = 0xC0000413u.toInt()

public val STATUS_DOWNGRADE_DETECTED: Ntstatus = 0xC0000388u.toInt()

public val STATUS_LOGON_FAILURE: Ntstatus = 0xC000006Du.toInt()

public val STATUS_LOGON_TYPE_NOT_GRANTED: Ntstatus = 0xC000015Bu.toInt()

public val STATUS_NO_SUCH_LOGON_SESSION: Ntstatus = 0xC000005Fu.toInt()

public val STATUS_NO_SUCH_USER: Ntstatus = 0xC0000064u.toInt()

public val STATUS_PASSWORD_EXPIRED: Ntstatus = 0xC0000071u.toInt()

public val STATUS_PASSWORD_MUST_CHANGE: Ntstatus = 0xC0000224u.toInt()

public val STATUS_WRONG_PASSWORD: Ntstatus = 0xC000006Au.toInt()

public val TS_SSP_NAME: Pcwstr = w("TSSSP")

public val TS_SSP_NAME_A: Pcstr = s("TSSSP")

public val USERNAME_FOR_PACKED_CREDENTIALS: CredMarshalType = 4

public val USERNAME_TARGET_CREDENTIAL: CredMarshalType = 2

public val SZ_OID_TS_KP_TS_SERVER_AUTH: Pcstr = s("1.3.6.1.4.1.311.54.1.2")

public val GUID_DEVINTERFACE_SMARTCARD_READER: Guid = Guid.fromU128(U128(0x50dd5230ba8a11d1uL, 0xbf5d0000f805f530uL))
