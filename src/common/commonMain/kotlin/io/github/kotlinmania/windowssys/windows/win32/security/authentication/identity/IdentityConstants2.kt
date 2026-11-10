package io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity

import io.github.kotlinmania.windowssys.U128
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.s
import io.github.kotlinmania.windowssys.core.w

public val SL_ID_LICENSE: Slidtype = 3

public val SL_ID_LICENSE_FILE: Slidtype = 2

public val SL_ID_PKEY: Slidtype = 4

public val SL_ID_PRODUCT_SKU: Slidtype = 1

public val SL_ID_STORE_TOKEN: Slidtype = 7

public val SL_INFO_KEY_ACTIVE_PLUGINS: Pcwstr = w("ActivePlugins")

public val SL_INFO_KEY_AUTHOR: Pcwstr = w("Author")

public val SL_INFO_KEY_BIOS_OA2_MINOR_VERSION: Pcwstr = w("BiosOA2MinorVersion")

public val SL_INFO_KEY_BIOS_PKEY: Pcwstr = w("BiosProductKey")

public val SL_INFO_KEY_BIOS_PKEY_DESCRIPTION: Pcwstr = w("BiosProductKeyDescription")

public val SL_INFO_KEY_BIOS_PKEY_PKPN: Pcwstr = w("BiosProductKeyPkPn")

public val SL_INFO_KEY_BIOS_SLIC_STATE: Pcwstr = w("BiosSlicState")

public val SL_INFO_KEY_CHANNEL: Pcwstr = w("Channel")

public val SL_INFO_KEY_DESCRIPTION: Pcwstr = w("Description")

public val SL_INFO_KEY_DIGITAL_PID: Pcwstr = w("DigitalPID")

public val SL_INFO_KEY_DIGITAL_PID2: Pcwstr = w("DigitalPID2")

public val SL_INFO_KEY_IS_KMS: Pcwstr = w("IsKeyManagementService")

public val SL_INFO_KEY_IS_PRS: Pcwstr = w("IsPRS")

public val SL_INFO_KEY_KMS_CURRENT_COUNT: Pcwstr = w("KeyManagementServiceCurrentCount")

public val SL_INFO_KEY_KMS_FAILED_REQUESTS: Pcwstr = w("KeyManagementServiceFailedRequests")

public val SL_INFO_KEY_KMS_LICENSED_REQUESTS: Pcwstr = w("KeyManagementServiceLicensedRequests")

public val SL_INFO_KEY_KMS_NON_GENUINE_GRACE_REQUESTS: Pcwstr = w("KeyManagementServiceNonGenuineGraceRequests")

public val SL_INFO_KEY_KMS_NOTIFICATION_REQUESTS: Pcwstr = w("KeyManagementServiceNotificationRequests")

public val SL_INFO_KEY_KMS_OOB_GRACE_REQUESTS: Pcwstr = w("KeyManagementServiceOOBGraceRequests")

public val SL_INFO_KEY_KMS_OOT_GRACE_REQUESTS: Pcwstr = w("KeyManagementServiceOOTGraceRequests")

public val SL_INFO_KEY_KMS_REQUIRED_CLIENT_COUNT: Pcwstr = w("KeyManagementServiceRequiredClientCount")

public val SL_INFO_KEY_KMS_TOTAL_REQUESTS: Pcwstr = w("KeyManagementServiceTotalRequests")

public val SL_INFO_KEY_KMS_UNLICENSED_REQUESTS: Pcwstr = w("KeyManagementServiceUnlicensedRequests")

public val SL_INFO_KEY_LICENSE_TYPE: Pcwstr = w("LicenseType")

public val SL_INFO_KEY_LICENSOR_URL: Pcwstr = w("LicensorUrl")

public val SL_INFO_KEY_NAME: Pcwstr = w("Name")

public val SL_INFO_KEY_PARTIAL_PRODUCT_KEY: Pcwstr = w("PartialProductKey")

public val SL_INFO_KEY_PRODUCT_KEY_ACTIVATION_URL: Pcwstr = w("PKCURL")

public val SL_INFO_KEY_PRODUCT_SKU_ID: Pcwstr = w("ProductSkuId")

public val SL_INFO_KEY_RIGHT_ACCOUNT_ACTIVATION_URL: Pcwstr = w("RACURL")

public val SL_INFO_KEY_SECURE_PROCESSOR_ACTIVATION_URL: Pcwstr = w("SPCURL")

public val SL_INFO_KEY_SECURE_STORE_ID: Pcwstr = w("SecureStoreId")

public val SL_INFO_KEY_SYSTEM_STATE: Pcwstr = w("SystemState")

public val SL_INFO_KEY_USE_LICENSE_ACTIVATION_URL: Pcwstr = w("EULURL")

public val SL_INFO_KEY_VERSION: Pcwstr = w("Version")

public val SL_INTERNAL_ZONE: UInt = 57344u

public val SL_I_NONGENUINE_GRACE_PERIOD: Hresult = 0x4004F065u.toInt()

public val SL_I_NONGENUINE_GRACE_PERIOD_2: Hresult = 0x4004F068u.toInt()

public val SL_I_OOB_GRACE_PERIOD: Hresult = 0x4004F00Cu.toInt()

public val SL_I_OOT_GRACE_PERIOD: Hresult = 0x4004F00Du.toInt()

public val SL_I_PERPETUAL_OOB_GRACE_PERIOD: Hresult = 0x4004FC05u.toInt()

public val SL_I_STORE_BASED_ACTIVATION: Hresult = 0x4004F401u.toInt()

public val SL_I_TIMEBASED_EXTENDED_GRACE_PERIOD: Hresult = 0x4004FC06u.toInt()

public val SL_I_TIMEBASED_VALIDITY_PERIOD: Hresult = 0x4004FC04u.toInt()

public val SL_LICENSING_STATUS_IN_GRACE_PERIOD: Sllicensingstatus = 2

public val SL_LICENSING_STATUS_LAST: Sllicensingstatus = 4

public val SL_LICENSING_STATUS_LICENSED: Sllicensingstatus = 1

public val SL_LICENSING_STATUS_NOTIFICATION: Sllicensingstatus = 3

public val SL_LICENSING_STATUS_UNLICENSED: Sllicensingstatus = 0

public val SL_MDOLLAR_ZONE: UInt = 40960u

public val SL_MSCH_ZONE: UInt = 49152u

public val SL_PKEY_DETECT: Pcwstr = w("msft:rm/algorithm/pkey/detect")

public val SL_PKEY_MS2005: Pcwstr = w("msft:rm/algorithm/pkey/2005")

public val SL_PKEY_MS2009: Pcwstr = w("msft:rm/algorithm/pkey/2009")

public val SL_POLICY_EVALUATION_MODE_ENABLED: Pcwstr = w("Security-SPP-EvaluationModeEnabled")

public val SL_PROP_ACTIVATION_VALIDATION_IN_PROGRESS: Pcwstr = w("SL_ACTIVATION_VALIDATION_IN_PROGRESS")

public val SL_PROP_BRT_COMMIT: Pcwstr = w("SL_BRT_COMMIT")

public val SL_PROP_BRT_DATA: Pcwstr = w("SL_BRT_DATA")

public val SL_PROP_GENUINE_RESULT: Pcwstr = w("SL_GENUINE_RESULT")

public val SL_PROP_GET_GENUINE_AUTHZ: Pcwstr = w("SL_GET_GENUINE_AUTHZ")

public val SL_PROP_GET_GENUINE_SERVER_AUTHZ: Pcwstr = w("SL_GET_GENUINE_SERVER_AUTHZ")

public val SL_PROP_LAST_ACT_ATTEMPT_HRESULT: Pcwstr = w("SL_LAST_ACT_ATTEMPT_HRESULT")

public val SL_PROP_LAST_ACT_ATTEMPT_SERVER_FLAGS: Pcwstr = w("SL_LAST_ACT_ATTEMPT_SERVER_FLAGS")

public val SL_PROP_LAST_ACT_ATTEMPT_TIME: Pcwstr = w("SL_LAST_ACT_ATTEMPT_TIME")

public val SL_PROP_NONGENUINE_GRACE_FLAG: Pcwstr = w("SL_NONGENUINE_GRACE_FLAG")

public val SL_REARM_REBOOT_REQUIRED: UInt = 1u

public val SL_REFERRALTYPE_APPID: Slreferraltype = 1

public val SL_REFERRALTYPE_BEST_MATCH: Slreferraltype = 4

public val SL_REFERRALTYPE_OVERRIDE_APPID: Slreferraltype = 3

public val SL_REFERRALTYPE_OVERRIDE_SKUID: Slreferraltype = 2

public val SL_REFERRALTYPE_SKUID: Slreferraltype = 0

public val SL_REMAPPING_MDOLLAR_CIDIID_INVALID_CHECK_DIGITS: Hresult = 0x803FA090u.toInt()

public val SL_REMAPPING_MDOLLAR_CIDIID_INVALID_DATA: Hresult = 0x803FA08Eu.toInt()

public val SL_REMAPPING_MDOLLAR_CIDIID_INVALID_DATA_LENGTH: Hresult = 0x803FA08Fu.toInt()

public val SL_REMAPPING_MDOLLAR_CIDIID_INVALID_VERSION: Hresult = 0x803FA08Du.toInt()

public val SL_REMAPPING_MDOLLAR_DIGITALMARKER_BINDING_NOT_CONFIGURED: Hresult = 0x803FA0D4u.toInt()

public val SL_REMAPPING_MDOLLAR_DIGITALMARKER_INVALID_BINDING: Hresult = 0x803FA0D3u.toInt()

public val SL_REMAPPING_MDOLLAR_DMAK_EXTENSION_LIMIT_EXCEEDED: Hresult = 0x803FA080u.toInt()

public val SL_REMAPPING_MDOLLAR_DMAK_LIMIT_EXCEEDED: Hresult = 0x803FA07Fu.toInt()

public val SL_REMAPPING_MDOLLAR_DMAK_OVERRIDE_LIMIT_REACHED: Hresult = 0x803FA0D6u.toInt()

public val SL_REMAPPING_MDOLLAR_FREE_OFFER_EXPIRED: Hresult = 0x803FA400u.toInt()

public val SL_REMAPPING_MDOLLAR_INVALID_ACTCONFIG_ID: Hresult = 0x803FA076u.toInt()

public val SL_REMAPPING_MDOLLAR_INVALID_ARGUMENT: Hresult = 0x803FA07Du.toInt()

public val SL_REMAPPING_MDOLLAR_INVALID_BINDING: Hresult = 0x803FA066u.toInt()

public val SL_REMAPPING_MDOLLAR_INVALID_BINDING_URI: Hresult = 0x803FA07Au.toInt()

public val SL_REMAPPING_MDOLLAR_INVALID_PRODUCT_DATA: Hresult = 0x803FA074u.toInt()

public val SL_REMAPPING_MDOLLAR_INVALID_PRODUCT_DATA_ID: Hresult = 0x803FA073u.toInt()

public val SL_REMAPPING_MDOLLAR_INVALID_PRODUCT_KEY: Hresult = 0x803FA068u.toInt()

public val SL_REMAPPING_MDOLLAR_INVALID_PRODUCT_KEY_FORMAT: Hresult = 0x803FA078u.toInt()

public val SL_REMAPPING_MDOLLAR_INVALID_PRODUCT_KEY_LENGTH: Hresult = 0x803FA077u.toInt()

public val SL_REMAPPING_MDOLLAR_MAXIMUM_UNLOCK_EXCEEDED: Hresult = 0x803FA071u.toInt()

public val SL_REMAPPING_MDOLLAR_NO_RULES_TO_ACTIVATE: Hresult = 0x803FA0C8u.toInt()

public val SL_REMAPPING_MDOLLAR_OEM_SLP_COA0: Hresult = 0x803FA083u.toInt()

public val SL_REMAPPING_MDOLLAR_OSR_DEVICE_BLOCKED: Hresult = 0x803FABC3u.toInt()

public val SL_REMAPPING_MDOLLAR_OSR_DEVICE_THROTTLED: Hresult = 0x803FABBEu.toInt()

public val SL_REMAPPING_MDOLLAR_OSR_DONOR_HWID_NO_ENTITLEMENT: Hresult = 0x803FABB8u.toInt()

public val SL_REMAPPING_MDOLLAR_OSR_GENERIC_ERROR: Hresult = 0x803FABB9u.toInt()

public val SL_REMAPPING_MDOLLAR_OSR_GP_DISABLED: Hresult = 0x803FABBFu.toInt()

public val SL_REMAPPING_MDOLLAR_OSR_HARDWARE_BLOCKED: Hresult = 0x803FABC0u.toInt()

public val SL_REMAPPING_MDOLLAR_OSR_LICENSE_BLOCKED: Hresult = 0x803FABC2u.toInt()

public val SL_REMAPPING_MDOLLAR_OSR_LICENSE_THROTTLED: Hresult = 0x803FABBDu.toInt()

public val SL_REMAPPING_MDOLLAR_OSR_NOT_ADMIN: Hresult = 0x803FABBBu.toInt()

public val SL_REMAPPING_MDOLLAR_OSR_NO_ASSOCIATION: Hresult = 0x803FABBAu.toInt()

public val SL_REMAPPING_MDOLLAR_OSR_USER_BLOCKED: Hresult = 0x803FABC1u.toInt()

public val SL_REMAPPING_MDOLLAR_OSR_USER_THROTTLED: Hresult = 0x803FABBCu.toInt()

public val SL_REMAPPING_MDOLLAR_PRODUCT_KEY_BLOCKED: Hresult = 0x803FA067u.toInt()

public val SL_REMAPPING_MDOLLAR_PRODUCT_KEY_BLOCKED_IPLOCATION: Hresult = 0x803FA0CBu.toInt()

public val SL_REMAPPING_MDOLLAR_PRODUCT_KEY_OUT_OF_RANGE: Hresult = 0x803FA065u.toInt()

public val SL_REMAPPING_MDOLLAR_ROT_OVERRIDE_LIMIT_REACHED: Hresult = 0x803FA0D5u.toInt()

public val SL_REMAPPING_MDOLLAR_TIMEBASED_ACTIVATION_AFTER_END_DATE: Hresult = 0x803FA098u.toInt()

public val SL_REMAPPING_MDOLLAR_TIMEBASED_ACTIVATION_BEFORE_START_DATE: Hresult = 0x803FA097u.toInt()

public val SL_REMAPPING_MDOLLAR_TIMEBASED_ACTIVATION_NOT_AVAILABLE: Hresult = 0x803FA099u.toInt()

public val SL_REMAPPING_MDOLLAR_TIMEBASED_PRODUCT_KEY_NOT_CONFIGURED: Hresult = 0x803FA09Au.toInt()

public val SL_REMAPPING_MDOLLAR_UNSUPPORTED_PRODUCT_KEY: Hresult = 0x803FA06Cu.toInt()

public val SL_REMAPPING_SP_PUB_API_BAD_GET_INFO_QUERY: Hresult = 0xC004D012u.toInt()

public val SL_REMAPPING_SP_PUB_API_HANDLE_NOT_COMMITED: Hresult = 0xC004D081u.toInt()

public val SL_REMAPPING_SP_PUB_API_INVALID_ALGORITHM_TYPE: Hresult = 0xC004D009u.toInt()

public val SL_REMAPPING_SP_PUB_API_INVALID_HANDLE: Hresult = 0xC004D02Cu.toInt()

public val SL_REMAPPING_SP_PUB_API_INVALID_KEY_LENGTH: Hresult = 0xC004D055u.toInt()

public val SL_REMAPPING_SP_PUB_API_INVALID_LICENSE: Hresult = 0xC004D000u.toInt()

public val SL_REMAPPING_SP_PUB_API_NO_AES_PROVIDER: Hresult = 0xC004D073u.toInt()

public val SL_REMAPPING_SP_PUB_API_TOO_MANY_LOADED_ENVIRONMENTS: Hresult = 0xC004D00Cu.toInt()

public val SL_REMAPPING_SP_PUB_CRYPTO_HASH_FINALIZED: Hresult = 0xC004D209u.toInt()

public val SL_REMAPPING_SP_PUB_CRYPTO_INVALID_BLOCK: Hresult = 0xC004D20Fu.toInt()

public val SL_REMAPPING_SP_PUB_CRYPTO_INVALID_BLOCKLENGTH: Hresult = 0xC004D202u.toInt()

public val SL_REMAPPING_SP_PUB_CRYPTO_INVALID_CIPHER: Hresult = 0xC004D203u.toInt()

public val SL_REMAPPING_SP_PUB_CRYPTO_INVALID_CIPHERMODE: Hresult = 0xC004D204u.toInt()

public val SL_REMAPPING_SP_PUB_CRYPTO_INVALID_FORMAT: Hresult = 0xC004D210u.toInt()

public val SL_REMAPPING_SP_PUB_CRYPTO_INVALID_KEYLENGTH: Hresult = 0xC004D201u.toInt()

public val SL_REMAPPING_SP_PUB_CRYPTO_INVALID_PADDING: Hresult = 0xC004D211u.toInt()

public val SL_REMAPPING_SP_PUB_CRYPTO_INVALID_SIGNATURE: Hresult = 0xC004D20Eu.toInt()

public val SL_REMAPPING_SP_PUB_CRYPTO_INVALID_SIGNATURELENGTH: Hresult = 0xC004D20Du.toInt()

public val SL_REMAPPING_SP_PUB_CRYPTO_KEY_NOT_AVAILABLE: Hresult = 0xC004D20Au.toInt()

public val SL_REMAPPING_SP_PUB_CRYPTO_KEY_NOT_FOUND: Hresult = 0xC004D20Bu.toInt()

public val SL_REMAPPING_SP_PUB_CRYPTO_NOT_BLOCK_ALIGNED: Hresult = 0xC004D20Cu.toInt()

public val SL_REMAPPING_SP_PUB_CRYPTO_UNKNOWN_ATTRIBUTEID: Hresult = 0xC004D208u.toInt()

public val SL_REMAPPING_SP_PUB_CRYPTO_UNKNOWN_HASHID: Hresult = 0xC004D207u.toInt()

public val SL_REMAPPING_SP_PUB_CRYPTO_UNKNOWN_KEYID: Hresult = 0xC004D206u.toInt()

public val SL_REMAPPING_SP_PUB_CRYPTO_UNKNOWN_PROVIDERID: Hresult = 0xC004D205u.toInt()

public val SL_REMAPPING_SP_PUB_GENERAL_NOT_INITIALIZED: Hresult = 0xC004D101u.toInt()

public val SL_REMAPPING_SP_PUB_KM_CACHE_IDENTICAL: Hresult = 0x4004D601u.toInt()

public val SL_REMAPPING_SP_PUB_KM_CACHE_POLICY_CHANGED: Hresult = 0x4004D602u.toInt()

public val SL_REMAPPING_SP_PUB_KM_CACHE_TAMPER: Hresult = 0xC004D501u.toInt()

public val SL_REMAPPING_SP_PUB_KM_CACHE_TAMPER_RESTORE_FAILED: Hresult = 0xC004D502u.toInt()

public val SL_REMAPPING_SP_PUB_PROXY_SOFT_TAMPER: Hresult = 0xC004D702u.toInt()

public val SL_REMAPPING_SP_PUB_TAMPER_MODULE_AUTHENTICATION: Hresult = 0xC004D401u.toInt()

public val SL_REMAPPING_SP_PUB_TAMPER_SECURITY_PROCESSOR_PATCHED: Hresult = 0xC004D402u.toInt()

public val SL_REMAPPING_SP_PUB_TIMER_ALREADY_EXISTS: Hresult = 0xC004D30Au.toInt()

public val SL_REMAPPING_SP_PUB_TIMER_EXPIRED: Hresult = 0xC004D30Cu.toInt()

public val SL_REMAPPING_SP_PUB_TIMER_NAME_SIZE_TOO_BIG: Hresult = 0xC004D30Du.toInt()

public val SL_REMAPPING_SP_PUB_TIMER_NOT_FOUND: Hresult = 0xC004D30Bu.toInt()

public val SL_REMAPPING_SP_PUB_TIMER_READ_ONLY: Hresult = 0xC004D311u.toInt()

public val SL_REMAPPING_SP_PUB_TRUSTED_TIME_OK: Hresult = 0x4004D30Fu.toInt()

public val SL_REMAPPING_SP_PUB_TS_ACCESS_DENIED: Hresult = 0xC004D314u.toInt()

public val SL_REMAPPING_SP_PUB_TS_ATTRIBUTE_NOT_FOUND: Hresult = 0xC004D313u.toInt()

public val SL_REMAPPING_SP_PUB_TS_ATTRIBUTE_READ_ONLY: Hresult = 0xC004D312u.toInt()

public val SL_REMAPPING_SP_PUB_TS_DATA_SIZE_TOO_BIG: Hresult = 0xC004D308u.toInt()

public val SL_REMAPPING_SP_PUB_TS_ENTRY_KEY_ALREADY_EXISTS: Hresult = 0xC004D305u.toInt()

public val SL_REMAPPING_SP_PUB_TS_ENTRY_KEY_NOT_FOUND: Hresult = 0xC004D304u.toInt()

public val SL_REMAPPING_SP_PUB_TS_ENTRY_KEY_SIZE_TOO_BIG: Hresult = 0xC004D306u.toInt()

public val SL_REMAPPING_SP_PUB_TS_ENTRY_READ_ONLY: Hresult = 0xC004D310u.toInt()

public val SL_REMAPPING_SP_PUB_TS_FULL: Hresult = 0xC004D30Eu.toInt()

public val SL_REMAPPING_SP_PUB_TS_INVALID_HW_BINDING: Hresult = 0xC004D309u.toInt()

public val SL_REMAPPING_SP_PUB_TS_MAX_REARM_REACHED: Hresult = 0xC004D307u.toInt()

public val SL_REMAPPING_SP_PUB_TS_NAMESPACE_IN_USE: Hresult = 0xC004D316u.toInt()

public val SL_REMAPPING_SP_PUB_TS_NAMESPACE_NOT_FOUND: Hresult = 0xC004D315u.toInt()

public val SL_REMAPPING_SP_PUB_TS_REARMED: Hresult = 0xC004D302u.toInt()

public val SL_REMAPPING_SP_PUB_TS_RECREATED: Hresult = 0xC004D303u.toInt()

public val SL_REMAPPING_SP_PUB_TS_TAMPERED: Hresult = 0xC004D301u.toInt()

public val SL_REMAPPING_SP_PUB_TS_TAMPERED_BREADCRUMB_GENERATION: Hresult = 0xC004D318u.toInt()

public val SL_REMAPPING_SP_PUB_TS_TAMPERED_BREADCRUMB_LOAD_INVALID: Hresult = 0xC004D317u.toInt()

public val SL_REMAPPING_SP_PUB_TS_TAMPERED_DATA_BREADCRUMB_MISMATCH: Hresult = 0xC004D31Bu.toInt()

public val SL_REMAPPING_SP_PUB_TS_TAMPERED_DATA_VERSION_MISMATCH: Hresult = 0xC004D31Cu.toInt()

public val SL_REMAPPING_SP_PUB_TS_TAMPERED_INVALID_DATA: Hresult = 0xC004D319u.toInt()

public val SL_REMAPPING_SP_PUB_TS_TAMPERED_NO_DATA: Hresult = 0xC004D31Au.toInt()

public val SL_REMAPPING_SP_STATUS_ALREADY_EXISTS: Hresult = 0xC004D105u.toInt()

public val SL_REMAPPING_SP_STATUS_DEBUGGER_DETECTED: Hresult = 0x8004D10Bu.toInt()

public val SL_REMAPPING_SP_STATUS_GENERIC_FAILURE: Hresult = 0xC004D103u.toInt()

public val SL_REMAPPING_SP_STATUS_INSUFFICIENT_BUFFER: Hresult = 0xC004D107u.toInt()

public val SL_REMAPPING_SP_STATUS_INVALIDARG: Hresult = 0xC004D104u.toInt()

public val SL_REMAPPING_SP_STATUS_INVALIDDATA: Hresult = 0xC004D108u.toInt()

public val SL_REMAPPING_SP_STATUS_INVALID_SPAPI_CALL: Hresult = 0xC004D109u.toInt()

public val SL_REMAPPING_SP_STATUS_INVALID_SPAPI_VERSION: Hresult = 0xC004D10Au.toInt()

public val SL_REMAPPING_SP_STATUS_NO_MORE_DATA: Hresult = 0xC004D10Cu.toInt()

public val SL_REMAPPING_SP_STATUS_PUSHKEY_CONFLICT: Hresult = 0xC004D701u.toInt()

public val SL_REMAPPING_SP_STATUS_SYSTEM_TIME_SKEWED: Hresult = 0x8004D102u.toInt()

public val SL_SERVER_ZONE: UInt = 45056u

public val SL_SYSTEM_STATE_REBOOT_POLICY_FOUND: UInt = 1u

public val SL_SYSTEM_STATE_TAMPERED: UInt = 2u

public val SPP_MIGRATION_GATHER_ACTIVATED_WINDOWS_STATE: UInt = 2u

public val SPP_MIGRATION_GATHER_ALL: UInt = 4294967295u

public val SPP_MIGRATION_GATHER_MIGRATABLE_APPS: UInt = 1u

public val SP_ACCEPT_CREDENTIALS_NAME: Pcstr = s("SpAcceptCredentials\u0000")

public val SP_PROT_ALL: UInt = 4294967295u

public val SP_PROT_DTLS1_0_CLIENT: UInt = 131072u

public val SP_PROT_DTLS1_0_SERVER: UInt = 65536u

public val SP_PROT_DTLS1_2_CLIENT: UInt = 524288u

public val SP_PROT_DTLS1_2_SERVER: UInt = 262144u

public val SP_PROT_DTLS_CLIENT: UInt = 131072u

public val SP_PROT_DTLS_SERVER: UInt = 65536u

public val SP_PROT_NONE: UInt = 0u

public val SP_PROT_PCT1_CLIENT: UInt = 2u

public val SP_PROT_PCT1_SERVER: UInt = 1u

public val SP_PROT_SSL2_CLIENT: UInt = 8u

public val SP_PROT_SSL2_SERVER: UInt = 4u

public val SP_PROT_SSL3_CLIENT: UInt = 32u

public val SP_PROT_SSL3_SERVER: UInt = 16u

public val SP_PROT_TLS1_0_CLIENT: UInt = 128u

public val SP_PROT_TLS1_0_SERVER: UInt = 64u

public val SP_PROT_TLS1_1_CLIENT: UInt = 512u

public val SP_PROT_TLS1_1_SERVER: UInt = 256u

public val SP_PROT_TLS1_2_CLIENT: UInt = 2048u

public val SP_PROT_TLS1_2_SERVER: UInt = 1024u

public val SP_PROT_TLS1_3PLUS_CLIENT: UInt = 8192u

public val SP_PROT_TLS1_3PLUS_SERVER: UInt = 4096u

public val SP_PROT_TLS1_3_CLIENT: UInt = 8192u

public val SP_PROT_TLS1_3_SERVER: UInt = 4096u

public val SP_PROT_TLS1_CLIENT: UInt = 128u

public val SP_PROT_TLS1_SERVER: UInt = 64u

public val SP_PROT_UNI_CLIENT: UInt = 2147483648u

public val SP_PROT_UNI_SERVER: UInt = 1073741824u

public val SSL2SP_NAME: Pcwstr = w("Microsoft SSL 2.0")

public val SSL2SP_NAME_A: Pcstr = s("Microsoft SSL 2.0")

public val SSL2SP_NAME_W: Pcwstr = w("Microsoft SSL 2.0")

public val SSL3SP_NAME: Pcwstr = w("Microsoft SSL 3.0")

public val SSL3SP_NAME_A: Pcstr = s("Microsoft SSL 3.0")

public val SSL3SP_NAME_W: Pcwstr = w("Microsoft SSL 3.0")

public val SSL_CRACK_CERTIFICATE_NAME: Pcwstr = w("SslCrackCertificate")

public val SSL_FREE_CERTIFICATE_NAME: Pcwstr = w("SslFreeCertificate")

public val SSL_SESSION_DISABLE_RECONNECTS: SchannelSessionTokenFlags = 2u

public val SSL_SESSION_ENABLE_RECONNECTS: SchannelSessionTokenFlags = 1u

public val SSL_SESSION_RECONNECT: UInt = 1u

public val SSPIPFC_CREDPROV_DO_NOT_LOAD: UInt = 4u

public val SSPIPFC_CREDPROV_DO_NOT_SAVE: UInt = 1u

public val SSPIPFC_NO_CHECKBOX: UInt = 2u

public val SSPIPFC_SAVE_CRED_BY_CALLER: UInt = 1u

public val SSPIPFC_USE_CREDUIBROKER: UInt = 8u

public val SZ_ALG_MAX_SIZE: UInt = 64u

public val SASL_AUTH_ZID_FORBIDDEN: SaslAuthzidState = 0

public val SASL_AUTH_ZID_PROCESSED: SaslAuthzidState = 1

public val SE_ADT_PARM_TYPE_ACCESS_MASK: SeAdtParameterType = 7

public val SE_ADT_PARM_TYPE_ACCESS_REASON: SeAdtParameterType = 29

public val SE_ADT_PARM_TYPE_CLAIMS: SeAdtParameterType = 32

public val SE_ADT_PARM_TYPE_DATE_TIME: SeAdtParameterType = 22

public val SE_ADT_PARM_TYPE_DURATION: SeAdtParameterType = 18

public val SE_ADT_PARM_TYPE_FILE_SPEC: SeAdtParameterType = 2

public val SE_ADT_PARM_TYPE_GUID: SeAdtParameterType = 13

public val SE_ADT_PARM_TYPE_HEX_INT64: SeAdtParameterType = 15

public val SE_ADT_PARM_TYPE_HEX_ULONG: SeAdtParameterType = 10

public val SE_ADT_PARM_TYPE_LOGON_HOURS: SeAdtParameterType = 25

public val SE_ADT_PARM_TYPE_LOGON_ID: SeAdtParameterType = 5

public val SE_ADT_PARM_TYPE_LOGON_ID_AS_SID: SeAdtParameterType = 33

public val SE_ADT_PARM_TYPE_LOGON_ID_EX: SeAdtParameterType = 35

public val SE_ADT_PARM_TYPE_LOGON_ID_NO_SID: SeAdtParameterType = 26

public val SE_ADT_PARM_TYPE_LUID: SeAdtParameterType = 14

public val SE_ADT_PARM_TYPE_MESSAGE: SeAdtParameterType = 21

public val SE_ADT_PARM_TYPE_MULTI_SZ_STRING: SeAdtParameterType = 34

public val SE_ADT_PARM_TYPE_NO_LOGON_ID: SeAdtParameterType = 6

public val SE_ADT_PARM_TYPE_NO_UAC: SeAdtParameterType = 20

public val SE_ADT_PARM_TYPE_NONE: SeAdtParameterType = 0

public val SE_ADT_PARM_TYPE_OBJECT_TYPES: SeAdtParameterType = 9

public val SE_ADT_PARM_TYPE_PRIVS: SeAdtParameterType = 8

public val SE_ADT_PARM_TYPE_PTR: SeAdtParameterType = 11

public val SE_ADT_PARM_TYPE_RESOURCE_ATTRIBUTE: SeAdtParameterType = 31

public val SE_ADT_PARM_TYPE_SD: SeAdtParameterType = 24

public val SE_ADT_PARM_TYPE_SID: SeAdtParameterType = 4

public val SE_ADT_PARM_TYPE_SID_LIST: SeAdtParameterType = 17

public val SE_ADT_PARM_TYPE_SOCK_ADDR: SeAdtParameterType = 23

public val SE_ADT_PARM_TYPE_SOCK_ADDR_NO_PORT: SeAdtParameterType = 28

public val SE_ADT_PARM_TYPE_STAGING_REASON: SeAdtParameterType = 30

public val SE_ADT_PARM_TYPE_STRING: SeAdtParameterType = 1

public val SE_ADT_PARM_TYPE_STRING_LIST: SeAdtParameterType = 16

public val SE_ADT_PARM_TYPE_TIME: SeAdtParameterType = 12

public val SE_ADT_PARM_TYPE_ULONG: SeAdtParameterType = 3

public val SE_ADT_PARM_TYPE_ULONG_NO_CONV: SeAdtParameterType = 27

public val SE_ADT_PARM_TYPE_USER_ACCOUNT_CONTROL: SeAdtParameterType = 19

public val SEC_APPLICATION_PROTOCOL_NEGOTIATION_EXT_ALPN: SecApplicationProtocolNegotiationExt = 2

public val SEC_APPLICATION_PROTOCOL_NEGOTIATION_EXT_NPN: SecApplicationProtocolNegotiationExt = 1

public val SEC_APPLICATION_PROTOCOL_NEGOTIATION_EXT_NONE: SecApplicationProtocolNegotiationExt = 0

public val SEC_APPLICATION_PROTOCOL_NEGOTIATION_STATUS_NONE: SecApplicationProtocolNegotiationStatus = 0

public val SEC_APPLICATION_PROTOCOL_NEGOTIATION_STATUS_SELECTED_CLIENT_ONLY: SecApplicationProtocolNegotiationStatus = 2

public val SEC_APPLICATION_PROTOCOL_NEGOTIATION_STATUS_SUCCESS: SecApplicationProtocolNegotiationStatus = 1

public val SEC_DIRECTORY: SecDelegationType = 3

public val SEC_FULL: SecDelegationType = 0

public val SEC_NAME_ALTERNATE_ID: SecpkgNameType = 1

public val SEC_NAME_DN: SecpkgNameType = 3

public val SEC_NAME_FLAT: SecpkgNameType = 2

public val SEC_NAME_SPN: SecpkgNameType = 4

public val SEC_NAME_SAM_COMPATIBLE: SecpkgNameType = 0

public val SEC_OBJECT: SecDelegationType = 4

public val SEC_PKG_ATTR_LAST_CLIENT_TOKEN_MAYBE: SecpkgAttrLctStatus = 2

public val SEC_PKG_ATTR_LAST_CLIENT_TOKEN_NO: SecpkgAttrLctStatus = 1

public val SEC_PKG_ATTR_LAST_CLIENT_TOKEN_YES: SecpkgAttrLctStatus = 0

public val SEC_PKG_CALL_PACKAGE_MAX_MESSAGE: SecpkgCallPackageMessageType = 1026

public val SEC_PKG_CALL_PACKAGE_MIN_MESSAGE: SecpkgCallPackageMessageType = 1024

public val SEC_PKG_CALL_PACKAGE_PIN_DC_MESSAGE: SecpkgCallPackageMessageType = 1024

public val SEC_PKG_CALL_PACKAGE_TRANSFER_CRED_MESSAGE: SecpkgCallPackageMessageType = 1026

public val SEC_PKG_CALL_PACKAGE_UNPIN_ALL_DCS_MESSAGE: SecpkgCallPackageMessageType = 1025

public val SEC_PKG_CRED_CLASS_EPHEMERAL: SecpkgCredClass = 10

public val SEC_PKG_CRED_CLASS_EXPLICIT: SecpkgCredClass = 40

public val SEC_PKG_CRED_CLASS_NONE: SecpkgCredClass = 0

public val SEC_PKG_CRED_CLASS_PERSISTED_GENERIC: SecpkgCredClass = 20

public val SEC_PKG_CRED_CLASS_PERSISTED_SPECIFIC: SecpkgCredClass = 30

public val SEC_SERVICE: SecDelegationType = 1

public val SEC_SESSION_PRIMARY_CRED: SecpkgSessioninfoType = 0

public val SEC_TRAFFIC_SECRET_CLIENT: SecTrafficSecretType = 1

public val SEC_TRAFFIC_SECRET_NONE: SecTrafficSecretType = 0

public val SEC_TRAFFIC_SECRET_SERVER: SecTrafficSecretType = 2

public val SEC_TREE: SecDelegationType = 2

public val SECPKG_CONTEXT_THUNKS: SecpkgExtendedInformationClass = 2

public val SECPKG_EXTRA_OIDS: SecpkgExtendedInformationClass = 5

public val SECPKG_GSS_INFO: SecpkgExtendedInformationClass = 1

public val SECPKG_MAX_INFO: SecpkgExtendedInformationClass = 6

public val SECPKG_MUTUAL_AUTH_LEVEL: SecpkgExtendedInformationClass = 3

public val SECPKG_NEGO2INFO: SecpkgExtendedInformationClass = 7

public val SECPKG_WOW_CLIENT_DLL: SecpkgExtendedInformationClass = 4

public val TLS1SP_NAME: Pcwstr = w("Microsoft TLS 1.0")

public val TLS1SP_NAME_A: Pcstr = s("Microsoft TLS 1.0")

public val TLS1SP_NAME_W: Pcwstr = w("Microsoft TLS 1.0")

public val TLS1_ALERT_ACCESS_DENIED: UInt = 49u

public val TLS1_ALERT_BAD_CERTIFICATE: UInt = 42u

public val TLS1_ALERT_BAD_RECORD_MAC: UInt = 20u

public val TLS1_ALERT_CERTIFICATE_EXPIRED: UInt = 45u

public val TLS1_ALERT_CERTIFICATE_REVOKED: UInt = 44u

public val TLS1_ALERT_CERTIFICATE_UNKNOWN: UInt = 46u

public val TLS1_ALERT_CLOSE_NOTIFY: UInt = 0u

public val TLS1_ALERT_DECODE_ERROR: UInt = 50u

public val TLS1_ALERT_DECOMPRESSION_FAIL: UInt = 30u

public val TLS1_ALERT_DECRYPTION_FAILED: UInt = 21u

public val TLS1_ALERT_DECRYPT_ERROR: UInt = 51u

public val TLS1_ALERT_EXPORT_RESTRICTION: UInt = 60u

public val TLS1_ALERT_FATAL: SchannelAlertTokenAlertType = 2u

public val TLS1_ALERT_HANDSHAKE_FAILURE: UInt = 40u

public val TLS1_ALERT_ILLEGAL_PARAMETER: UInt = 47u

public val TLS1_ALERT_INSUFFIENT_SECURITY: UInt = 71u

public val TLS1_ALERT_INTERNAL_ERROR: UInt = 80u

public val TLS1_ALERT_NO_APP_PROTOCOL: UInt = 120u

public val TLS1_ALERT_NO_RENEGOTIATION: UInt = 100u

public val TLS1_ALERT_PROTOCOL_VERSION: UInt = 70u

public val TLS1_ALERT_RECORD_OVERFLOW: UInt = 22u

public val TLS1_ALERT_UNEXPECTED_MESSAGE: UInt = 10u

public val TLS1_ALERT_UNKNOWN_CA: UInt = 48u

public val TLS1_ALERT_UNKNOWN_PSK_IDENTITY: UInt = 115u

public val TLS1_ALERT_UNSUPPORTED_CERT: UInt = 43u

public val TLS1_ALERT_UNSUPPORTED_EXT: UInt = 110u

public val TLS1_ALERT_USER_CANCELED: UInt = 90u

public val TLS1_ALERT_WARNING: SchannelAlertTokenAlertType = 1u

public val TLS_PARAMS_OPTIONAL: UInt = 1u

public val TOKENBINDING_EXTENSION_FORMAT_UNDEFINED: TokenbindingExtensionFormat = 0

public val TOKENBINDING_KEY_PARAMETERS_TYPE_ANYEXISTING: TokenbindingKeyParametersType = 255

public val TOKENBINDING_KEY_PARAMETERS_TYPE_ECDSAP256: TokenbindingKeyParametersType = 2

public val TOKENBINDING_KEY_PARAMETERS_TYPE_RSA2048_PKCS: TokenbindingKeyParametersType = 0

public val TOKENBINDING_KEY_PARAMETERS_TYPE_RSA2048_PSS: TokenbindingKeyParametersType = 1

public val TOKENBINDING_TYPE_PROVIDED: TokenbindingType = 0

public val TOKENBINDING_TYPE_REFERRED: TokenbindingType = 1

public val TRUSTED_QUERY_AUTH: Int = 64

public val TRUSTED_QUERY_CONTROLLERS: Int = 2

public val TRUSTED_QUERY_DOMAIN_NAME: Int = 1

public val TRUSTED_QUERY_POSIX: Int = 8

public val TRUSTED_SET_AUTH: Int = 32

public val TRUSTED_SET_CONTROLLERS: Int = 4

public val TRUSTED_SET_POSIX: Int = 16

public val TRUST_ATTRIBUTES_USER: UInt = 4278190080u

public val TRUST_ATTRIBUTES_VALID: UInt = 4278386687u

public val TRUST_ATTRIBUTE_CROSS_ORGANIZATION: TrustedDomainTrustAttributes = 16u

public val TRUST_ATTRIBUTE_CROSS_ORGANIZATION_ENABLE_TGT_DELEGATION: UInt = 2048u

public val TRUST_ATTRIBUTE_CROSS_ORGANIZATION_NO_TGT_DELEGATION: UInt = 512u

public val TRUST_ATTRIBUTE_DISABLE_AUTH_TARGET_VALIDATION: UInt = 4096u

public val TRUST_ATTRIBUTE_FILTER_SIDS: TrustedDomainTrustAttributes = 4u

public val TRUST_ATTRIBUTE_FOREST_TRANSITIVE: TrustedDomainTrustAttributes = 8u

public val TRUST_ATTRIBUTE_NON_TRANSITIVE: TrustedDomainTrustAttributes = 1u

public val TRUST_ATTRIBUTE_PIM_TRUST: UInt = 1024u

public val TRUST_ATTRIBUTE_QUARANTINED_DOMAIN: UInt = 4u

public val TRUST_ATTRIBUTE_TREAT_AS_EXTERNAL: TrustedDomainTrustAttributes = 64u

public val TRUST_ATTRIBUTE_TREE_PARENT: UInt = 4194304u

public val TRUST_ATTRIBUTE_TREE_ROOT: UInt = 8388608u

public val TRUST_ATTRIBUTE_TRUST_USES_AES_KEYS: UInt = 256u

public val TRUST_ATTRIBUTE_TRUST_USES_RC4_ENCRYPTION: UInt = 128u

public val TRUST_ATTRIBUTE_UPLEVEL_ONLY: TrustedDomainTrustAttributes = 2u

public val TRUST_ATTRIBUTE_WITHIN_FOREST: TrustedDomainTrustAttributes = 32u

public val TRUST_AUTH_TYPE_CLEAR: LsaAuthInformationAuthType = 2u

public val TRUST_AUTH_TYPE_NONE: LsaAuthInformationAuthType = 0u

public val TRUST_AUTH_TYPE_NT4OWF: LsaAuthInformationAuthType = 1u

public val TRUST_AUTH_TYPE_VERSION: LsaAuthInformationAuthType = 3u

public val TRUST_DIRECTION_BIDIRECTIONAL: TrustedDomainTrustDirection = 3u

public val TRUST_DIRECTION_DISABLED: TrustedDomainTrustDirection = 0u

public val TRUST_DIRECTION_INBOUND: TrustedDomainTrustDirection = 1u

public val TRUST_DIRECTION_OUTBOUND: TrustedDomainTrustDirection = 2u

public val TRUST_TYPE_AAD: UInt = 5u

public val TRUST_TYPE_DCE: TrustedDomainTrustType = 4u

public val TRUST_TYPE_DOWNLEVEL: TrustedDomainTrustType = 1u

public val TRUST_TYPE_MIT: TrustedDomainTrustType = 3u

public val TRUST_TYPE_UPLEVEL: TrustedDomainTrustType = 2u

public val TLS_HASH_ALGORITHM_MD5: ETlsHashAlgorithm = 1

public val TLS_HASH_ALGORITHM_NONE: ETlsHashAlgorithm = 0

public val TLS_HASH_ALGORITHM_SHA1: ETlsHashAlgorithm = 2

public val TLS_HASH_ALGORITHM_SHA224: ETlsHashAlgorithm = 3

public val TLS_HASH_ALGORITHM_SHA256: ETlsHashAlgorithm = 4

public val TLS_HASH_ALGORITHM_SHA384: ETlsHashAlgorithm = 5

public val TLS_HASH_ALGORITHM_SHA512: ETlsHashAlgorithm = 6

public val TLS_PARAMETERS_CNG_ALG_USAGE_CERT_SIG: ETlsAlgorithmUsage = 4

public val TLS_PARAMETERS_CNG_ALG_USAGE_CIPHER: ETlsAlgorithmUsage = 2

public val TLS_PARAMETERS_CNG_ALG_USAGE_DIGEST: ETlsAlgorithmUsage = 3

public val TLS_PARAMETERS_CNG_ALG_USAGE_KEY_EXCHANGE: ETlsAlgorithmUsage = 0

public val TLS_PARAMETERS_CNG_ALG_USAGE_SIGNATURE: ETlsAlgorithmUsage = 1

public val TLS_SIGNATURE_ALGORITHM_ANONYMOUS: ETlsSignatureAlgorithm = 0

public val TLS_SIGNATURE_ALGORITHM_DSA: ETlsSignatureAlgorithm = 2

public val TLS_SIGNATURE_ALGORITHM_ECDSA: ETlsSignatureAlgorithm = 3

public val TLS_SIGNATURE_ALGORITHM_RSA: ETlsSignatureAlgorithm = 1

public val TRUSTED_CONTROLLERS_INFORMATION: TrustedInformationClass = 2

public val TRUSTED_DOMAIN_AUTH_INFORMATION: TrustedInformationClass = 7

public val TRUSTED_DOMAIN_AUTH_INFORMATION_INTERNAL: TrustedInformationClass = 9

public val TRUSTED_DOMAIN_AUTH_INFORMATION_INTERNAL_AES: TrustedInformationClass = 14

public val TRUSTED_DOMAIN_FULL_INFORMATION: TrustedInformationClass = 8

public val TRUSTED_DOMAIN_FULL_INFORMATION2INTERNAL: TrustedInformationClass = 12

public val TRUSTED_DOMAIN_FULL_INFORMATION_INTERNAL: TrustedInformationClass = 10

public val TRUSTED_DOMAIN_FULL_INFORMATION_INTERNAL_AES: TrustedInformationClass = 15

public val TRUSTED_DOMAIN_INFORMATION_BASIC: TrustedInformationClass = 5

public val TRUSTED_DOMAIN_INFORMATION_EX: TrustedInformationClass = 6

public val TRUSTED_DOMAIN_INFORMATION_EX2INTERNAL: TrustedInformationClass = 11

public val TRUSTED_DOMAIN_NAME_INFORMATION: TrustedInformationClass = 1

public val TRUSTED_DOMAIN_SUPPORTED_ENCRYPTION_TYPES: TrustedInformationClass = 13

public val TRUSTED_PASSWORD_INFORMATION: TrustedInformationClass = 4

public val TRUSTED_POSIX_OFFSET_INFORMATION: TrustedInformationClass = 3

public val UNDERSTANDS_LONG_NAMES: UInt = 1u

public val UNISP_NAME: Pcwstr = w("Microsoft Unified Security Protocol Provider")

public val UNISP_NAME_A: Pcstr = s("Microsoft Unified Security Protocol Provider")

public val UNISP_NAME_W: Pcwstr = w("Microsoft Unified Security Protocol Provider")

public val UNISP_RPC_ID: UInt = 14u

public val USER_ACCOUNT_AUTO_LOCKED: UInt = 1024u

public val USER_ACCOUNT_DISABLED: UInt = 1u

public val USER_ALL_PARAMETERS: UInt = 2097152u

public val USER_DONT_EXPIRE_PASSWORD: UInt = 512u

public val USER_DONT_REQUIRE_PREAUTH: UInt = 65536u

public val USER_ENCRYPTED_TEXT_PASSWORD_ALLOWED: UInt = 2048u

public val USER_HOME_DIRECTORY_REQUIRED: UInt = 2u

public val USER_INTERDOMAIN_TRUST_ACCOUNT: UInt = 64u

public val USER_MNS_LOGON_ACCOUNT: UInt = 32u

public val USER_NORMAL_ACCOUNT: UInt = 16u

public val USER_NOT_DELEGATED: UInt = 16384u

public val USER_NO_AUTH_DATA_REQUIRED: UInt = 524288u

public val USER_PARTIAL_SECRETS_ACCOUNT: UInt = 1048576u

public val USER_PASSWORD_EXPIRED: UInt = 131072u

public val USER_PASSWORD_NOT_REQUIRED: UInt = 4u

public val USER_SERVER_TRUST_ACCOUNT: UInt = 256u

public val USER_SMARTCARD_REQUIRED: UInt = 4096u

public val USER_TEMP_DUPLICATE_ACCOUNT: UInt = 8u

public val USER_TRUSTED_FOR_DELEGATION: UInt = 8192u

public val USER_TRUSTED_TO_AUTHENTICATE_FOR_DELEGATION: UInt = 262144u

public val USER_USE_AES_KEYS: UInt = 2097152u

public val USER_USE_DES_KEY_ONLY: UInt = 32768u

public val USER_WORKSTATION_TRUST_ACCOUNT: UInt = 128u

public val WDIGEST_SP_NAME: Pcwstr = w("WDigest")

public val WDIGEST_SP_NAME_A: Pcstr = s("WDigest")

public val WDIGEST_SP_NAME_W: Pcwstr = w("WDigest")

public val WINDOWS_SLID: Guid = Guid.fromU128(U128(0x55c92734d6824d71uL, 0x983ed6ec3f16059fuL))

public val FACILITY_WINDOWS_STORE: UInt = 63u
