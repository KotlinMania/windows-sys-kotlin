package io.github.kotlinmania.windowssys.windows.win32.security.cryptography

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.U128
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.s
import io.github.kotlinmania.windowssys.core.w

public val CMSG_OID_CNG_EXPORT_KEY_TRANS_FUNC: Pcstr = s("CryptMsgDllCNGExportKeyTrans")

public val CMSG_OID_CNG_GEN_CONTENT_ENCRYPT_KEY_FUNC: Pcstr = s("CryptMsgDllCNGGenContentEncryptKey")

public val CMSG_OID_CNG_IMPORT_CONTENT_ENCRYPT_KEY_FUNC: Pcstr = s("CryptMsgDllCNGImportContentEncryptKey")

public val CMSG_OID_CNG_IMPORT_KEY_AGREE_FUNC: Pcstr = s("CryptMsgDllCNGImportKeyAgree")

public val CMSG_OID_CNG_IMPORT_KEY_TRANS_FUNC: Pcstr = s("CryptMsgDllCNGImportKeyTrans")

public val CMSG_OID_EXPORT_ENCRYPT_KEY_FUNC: Pcstr = s("CryptMsgDllExportEncryptKey")

public val CMSG_OID_EXPORT_KEY_AGREE_FUNC: Pcstr = s("CryptMsgDllExportKeyAgree")

public val CMSG_OID_EXPORT_KEY_TRANS_FUNC: Pcstr = s("CryptMsgDllExportKeyTrans")

public val CMSG_OID_EXPORT_MAIL_LIST_FUNC: Pcstr = s("CryptMsgDllExportMailList")

public val CMSG_OID_GEN_CONTENT_ENCRYPT_KEY_FUNC: Pcstr = s("CryptMsgDllGenContentEncryptKey")

public val CMSG_OID_GEN_ENCRYPT_KEY_FUNC: Pcstr = s("CryptMsgDllGenEncryptKey")

public val CMSG_OID_IMPORT_ENCRYPT_KEY_FUNC: Pcstr = s("CryptMsgDllImportEncryptKey")

public val CMSG_OID_IMPORT_KEY_AGREE_FUNC: Pcstr = s("CryptMsgDllImportKeyAgree")

public val CMSG_OID_IMPORT_KEY_TRANS_FUNC: Pcstr = s("CryptMsgDllImportKeyTrans")

public val CMSG_OID_IMPORT_MAIL_LIST_FUNC: Pcstr = s("CryptMsgDllImportMailList")

public val CMSG_RC4_NO_SALT_FLAG: UInt = 1073741824u

public val CMSG_RECIPIENT_COUNT_PARAM: UInt = 17u

public val CMSG_RECIPIENT_INDEX_PARAM: UInt = 18u

public val CMSG_RECIPIENT_INFO_PARAM: UInt = 19u

public val CMSG_SIGNED: CryptMsgType = 2u

public val CMSG_SIGNED_AND_ENVELOPED: CryptMsgType = 4u

public val CMSG_SIGNED_DATA_CMS_VERSION: UInt = 3u

public val CMSG_SIGNED_DATA_NO_SIGN_FLAG: UInt = 128u

public val CMSG_SIGNED_DATA_PKCS_1_5_VERSION: UInt = 1u

public val CMSG_SIGNED_DATA_V1: UInt = 1u

public val CMSG_SIGNED_DATA_V3: UInt = 3u

public val CMSG_SIGNER_AUTH_ATTR_PARAM: UInt = 9u

public val CMSG_SIGNER_CERT_ID_PARAM: UInt = 38u

public val CMSG_SIGNER_CERT_INFO_PARAM: UInt = 7u

public val CMSG_SIGNER_COUNT_PARAM: UInt = 5u

public val CMSG_SIGNER_HASH_ALGORITHM_PARAM: UInt = 8u

public val CMSG_SIGNER_INFO_CMS_VERSION: UInt = 3u

public val CMSG_SIGNER_INFO_PARAM: UInt = 6u

public val CMSG_SIGNER_INFO_PKCS_1_5_VERSION: UInt = 1u

public val CMSG_SIGNER_INFO_V1: UInt = 1u

public val CMSG_SIGNER_INFO_V3: UInt = 3u

public val CMSG_SIGNER_ONLY_FLAG: UInt = 2u

public val CMSG_SIGNER_UNAUTH_ATTR_PARAM: UInt = 10u

public val CMSG_SP3_COMPATIBLE_ENCRYPT_FLAG: UInt = 2147483648u

public val CMSG_TRUSTED_SIGNER_FLAG: UInt = 1u

public val CMSG_TYPE_PARAM: UInt = 1u

public val CMSG_UNPROTECTED_ATTR_PARAM: UInt = 37u

public val CMSG_USE_SIGNER_INDEX_FLAG: UInt = 4u

public val CMSG_VERIFY_COUNTER_SIGN_ENABLE_STRONG_FLAG: UInt = 1u

public val CMSG_VERIFY_SIGNER_CERT: UInt = 2u

public val CMSG_VERIFY_SIGNER_CHAIN: UInt = 3u

public val CMSG_VERIFY_SIGNER_NULL: UInt = 4u

public val CMSG_VERIFY_SIGNER_PUBKEY: UInt = 1u

public val CMSG_VERSION_PARAM: UInt = 30u

public val CMS_SIGNER_INFO: Pcstr = COpaquePointer(501.toLong())

public val CNG_RSA_PRIVATE_KEY_BLOB: Pcstr = COpaquePointer(83.toLong())

public val CNG_RSA_PUBLIC_KEY_BLOB: Pcstr = COpaquePointer(72.toLong())

public val CONTAINER_INFO_CURRENT_VERSION: UInt = 1u

public val CONTAINER_MAP_DEFAULT_CONTAINER: UInt = 2u

public val CONTAINER_MAP_VALID_CONTAINER: UInt = 1u

public val CONTEXT_OID_CAPI2_ANY: Pcstr = COpaquePointer(5.toLong())

public val CONTEXT_OID_CERTIFICATE: Pcstr = COpaquePointer(1.toLong())

public val CONTEXT_OID_CREATE_OBJECT_CONTEXT_FUNC: Pcstr = s("ContextDllCreateObjectContext")

public val CONTEXT_OID_CRL: Pcstr = COpaquePointer(2.toLong())

public val CONTEXT_OID_CTL: Pcstr = COpaquePointer(3.toLong())

public val CONTEXT_OID_OCSP_RESP: Pcstr = COpaquePointer(6.toLong())

public val CONTEXT_OID_PKCS7: Pcstr = COpaquePointer(4.toLong())

public val CP_CACHE_MODE_GLOBAL_CACHE: UInt = 1u

public val CP_CACHE_MODE_NO_CACHE: UInt = 3u

public val CP_CACHE_MODE_SESSION_ONLY: UInt = 2u

public val CP_CARD_AUTHENTICATED_STATE: Pcwstr = w("Authenticated State")

public val CP_CARD_CACHE_MODE: Pcwstr = w("Cache Mode")

public val CP_CARD_CAPABILITIES: Pcwstr = w("Capabilities")

public val CP_CARD_FREE_SPACE: Pcwstr = w("Free Space")

public val CP_CARD_GUID: Pcwstr = w("Card Identifier")

public val CP_CARD_KEYSIZES: Pcwstr = w("Key Sizes")

public val CP_CARD_LIST_PINS: Pcwstr = w("PIN List")

public val CP_CARD_PIN_INFO: Pcwstr = w("PIN Information")

public val CP_CARD_PIN_STRENGTH_CHANGE: Pcwstr = w("PIN Strength Change")

public val CP_CARD_PIN_STRENGTH_UNBLOCK: Pcwstr = w("PIN Strength Unblock")

public val CP_CARD_PIN_STRENGTH_VERIFY: Pcwstr = w("PIN Strength Verify")

public val CP_CARD_PIV: Pcwstr = w("PIV Card")

public val CP_CARD_READ_ONLY: Pcwstr = w("Read Only Mode")

public val CP_CARD_SERIAL_NO: Pcwstr = w("Card Serial Number")

public val CP_CHAINING_MODES: Pcwstr = w("Chaining Modes")

public val CP_ENUM_ALGORITHMS: Pcwstr = w("Algorithms")

public val CP_KEY_IMPORT_SUPPORT: Pcwstr = w("Key Import Support")

public val CP_PADDING_SCHEMES: Pcwstr = w("Padding Schemes")

public val CP_PARENT_WINDOW: Pcwstr = w("Parent Window")

public val CP_PIN_CONTEXT_STRING: Pcwstr = w("PIN Context String")

public val CP_PIV_CARD_CAPABILITY_CONTAINER: Pcwstr = w("PIV CCC")

public val CP_PIV_CARD_HOLDER_UNIQUE_IDENTIFIER: Pcwstr = w("PIV CHUID")

public val CP_PIV_CARD_HOLDER_UNSIGNED_UNIQUE_IDENTIFIER: Pcwstr = w("PIV UCHUID")

public val CP_PIV_CERTIFICATE: Pcwstr = w("PIV Certificate")

public val CP_PIV_FACIAL_IMAGE: Pcwstr = w("PIV Facial Image")

public val CP_PIV_FINGERPRINT: Pcwstr = w("PIV Fingerprint")

public val CP_PIV_GENERATE_KEY: Pcwstr = w("PIV Generate Key")

public val CP_PIV_KEY_HISTORY_OBJECT: Pcwstr = w("PIV Key History Object")

public val CP_PIV_PRINTED_INFORMATION: Pcwstr = w("PIV Printed Information")

public val CP_PIV_PUBLIC_KEY: Pcwstr = w("PIV Public Key")

public val CP_PIV_SECURITY_OBJECT: Pcwstr = w("PIV Security Object")

public val CP_SUPPORTS_WIN_X509_ENROLLMENT: Pcwstr = w("Supports Windows x.509 Enrollment")

public val CREDENTIAL_OID_PASSWORD_CREDENTIALS: Int = 2

public val CREDENTIAL_OID_PASSWORD_CREDENTIALS_A: Pcstr = COpaquePointer(1.toLong())

public val CREDENTIAL_OID_PASSWORD_CREDENTIALS_W: Pcstr = COpaquePointer(2.toLong())

public val CRL_DIST_POINT_ERR_CRL_ISSUER_BIT: Int = -2147483648.toInt()

public val CRL_DIST_POINT_ERR_INDEX_MASK: UInt = 127u

public val CRL_DIST_POINT_ERR_INDEX_SHIFT: UInt = 24u

public val CRL_DIST_POINT_FULL_NAME: UInt = 1u

public val CRL_DIST_POINT_ISSUER_RDN_NAME: UInt = 2u

public val CRL_DIST_POINT_NO_NAME: UInt = 0u

public val CRL_FIND_ANY: UInt = 0u

public val CRL_FIND_EXISTING: UInt = 2u

public val CRL_FIND_ISSUED_BY: UInt = 1u

public val CRL_FIND_ISSUED_BY_AKI_FLAG: UInt = 1u

public val CRL_FIND_ISSUED_BY_BASE_FLAG: UInt = 8u

public val CRL_FIND_ISSUED_BY_DELTA_FLAG: UInt = 4u

public val CRL_FIND_ISSUED_BY_SIGNATURE_FLAG: UInt = 2u

public val CRL_FIND_ISSUED_FOR: UInt = 3u

public val CRL_FIND_ISSUED_FOR_SET_STRONG_PROPERTIES_FLAG: UInt = 16u

public val CRL_REASON_AA_COMPROMISE: UInt = 10u

public val CRL_REASON_AA_COMPROMISE_FLAG: UInt = 128u

public val CRL_REASON_AFFILIATION_CHANGED: CertRevocationStatusReason = 3u

public val CRL_REASON_AFFILIATION_CHANGED_FLAG: UInt = 16u

public val CRL_REASON_CA_COMPROMISE: CertRevocationStatusReason = 2u

public val CRL_REASON_CA_COMPROMISE_FLAG: UInt = 32u

public val CRL_REASON_CERTIFICATE_HOLD: CertRevocationStatusReason = 6u

public val CRL_REASON_CERTIFICATE_HOLD_FLAG: UInt = 2u

public val CRL_REASON_CESSATION_OF_OPERATION: CertRevocationStatusReason = 5u

public val CRL_REASON_CESSATION_OF_OPERATION_FLAG: UInt = 4u

public val CRL_REASON_KEY_COMPROMISE: CertRevocationStatusReason = 1u

public val CRL_REASON_KEY_COMPROMISE_FLAG: UInt = 64u

public val CRL_REASON_PRIVILEGE_WITHDRAWN: UInt = 9u

public val CRL_REASON_PRIVILEGE_WITHDRAWN_FLAG: UInt = 1u

public val CRL_REASON_REMOVE_FROM_CRL: CertRevocationStatusReason = 8u

public val CRL_REASON_SUPERSEDED: CertRevocationStatusReason = 4u

public val CRL_REASON_SUPERSEDED_FLAG: UInt = 8u

public val CRL_REASON_UNSPECIFIED: CertRevocationStatusReason = 0u

public val CRL_REASON_UNUSED_FLAG: UInt = 128u

public val CRL_V1: UInt = 0u

public val CRL_V2: UInt = 1u

public val CROSS_CERT_DIST_POINT_ERR_INDEX_MASK: UInt = 255u

public val CROSS_CERT_DIST_POINT_ERR_INDEX_SHIFT: UInt = 24u

public val CRYPTNET_CACHED_OCSP_SWITCH_TO_CRL_COUNT_DEFAULT: UInt = 50u

public val CRYPTNET_CACHED_OCSP_SWITCH_TO_CRL_COUNT_VALUE_NAME: Pcwstr = w("CryptnetCachedOcspSwitchToCrlCount")

public val CRYPTNET_CRL_BEFORE_OCSP_ENABLE: UInt = 4294967295u

public val CRYPTNET_CRL_PRE_FETCH_DISABLE_INFORMATION_EVENTS_VALUE_NAME: Pcwstr = w("DisableInformationEvents")

public val CRYPTNET_CRL_PRE_FETCH_LOG_FILE_NAME_VALUE_NAME: Pcwstr = w("LogFileName")

public val CRYPTNET_CRL_PRE_FETCH_MAX_AGE_SECONDS_VALUE_NAME: Pcwstr = w("MaxAgeSeconds")

public val CRYPTNET_CRL_PRE_FETCH_MIN_AFTER_NEXT_UPDATE_SECONDS_VALUE_NAME: Pcwstr = w("MinAfterNextUpdateSeconds")

public val CRYPTNET_CRL_PRE_FETCH_MIN_BEFORE_NEXT_UPDATE_SECONDS_VALUE_NAME: Pcwstr = w("MinBeforeNextUpdateSeconds")

public val CRYPTNET_CRL_PRE_FETCH_PROCESS_NAME_LIST_VALUE_NAME: Pcwstr = w("ProcessNameList")

public val CRYPTNET_CRL_PRE_FETCH_PUBLISH_BEFORE_NEXT_UPDATE_SECONDS_VALUE_NAME: Pcwstr = w("PublishBeforeNextUpdateSeconds")

public val CRYPTNET_CRL_PRE_FETCH_PUBLISH_RANDOM_INTERVAL_SECONDS_VALUE_NAME: Pcwstr = w("PublishRandomIntervalSeconds")

public val CRYPTNET_CRL_PRE_FETCH_TIMEOUT_SECONDS_VALUE_NAME: Pcwstr = w("TimeoutSeconds")

public val CRYPTNET_CRL_PRE_FETCH_URL_LIST_VALUE_NAME: Pcwstr = w("PreFetchUrlList")

public val CRYPTNET_MAX_CACHED_OCSP_PER_CRL_COUNT_DEFAULT: UInt = 500u

public val CRYPTNET_MAX_CACHED_OCSP_PER_CRL_COUNT_VALUE_NAME: Pcwstr = w("CryptnetMaxCachedOcspPerCrlCount")

public val CRYPTNET_OCSP_AFTER_CRL_DISABLE: UInt = 4294967295u

public val CRYPTNET_PRE_FETCH_AFTER_CURRENT_TIME_PRE_FETCH_PERIOD_SECONDS_VALUE_NAME: Pcwstr = w("CryptnetPreFetchAfterCurrentTimePreFetchPeriodSeconds")

public val CRYPTNET_PRE_FETCH_AFTER_PUBLISH_PRE_FETCH_DIVISOR_DEFAULT: UInt = 10u

public val CRYPTNET_PRE_FETCH_AFTER_PUBLISH_PRE_FETCH_DIVISOR_VALUE_NAME: Pcwstr = w("CryptnetPreFetchAfterPublishPreFetchDivisor")

public val CRYPTNET_PRE_FETCH_BEFORE_NEXT_UPDATE_PRE_FETCH_DIVISOR_DEFAULT: UInt = 20u

public val CRYPTNET_PRE_FETCH_BEFORE_NEXT_UPDATE_PRE_FETCH_DIVISOR_VALUE_NAME: Pcwstr = w("CryptnetPreFetchBeforeNextUpdatePreFetchDivisor")

public val CRYPTNET_PRE_FETCH_MAX_AFTER_NEXT_UPDATE_PRE_FETCH_PERIOD_SECONDS_VALUE_NAME: Pcwstr = w("CryptnetPreFetchMaxAfterNextUpdatePreFetchPeriodSeconds")

public val CRYPTNET_PRE_FETCH_MAX_MAX_AGE_SECONDS_VALUE_NAME: Pcwstr = w("CryptnetPreFetchMaxMaxAgeSeconds")

public val CRYPTNET_PRE_FETCH_MIN_AFTER_NEXT_UPDATE_PRE_FETCH_PERIOD_SECONDS_VALUE_NAME: Pcwstr = w("CryptnetPreFetchMinAfterNextUpdatePreFetchPeriodSeconds")

public val CRYPTNET_PRE_FETCH_MIN_BEFORE_NEXT_UPDATE_PRE_FETCH_PERIOD_SECONDS_VALUE_NAME: Pcwstr = w("CryptnetPreFetchMinBeforeNextUpdatePreFetchSeconds")

public val CRYPTNET_PRE_FETCH_MIN_MAX_AGE_SECONDS_VALUE_NAME: Pcwstr = w("CryptnetPreFetchMinMaxAgeSeconds")

public val CRYPTNET_PRE_FETCH_MIN_OCSP_VALIDITY_PERIOD_SECONDS_VALUE_NAME: Pcwstr = w("CryptnetPreFetchMinOcspValidityPeriodSeconds")

public val CRYPTNET_PRE_FETCH_RETRIEVAL_TIMEOUT_SECONDS_VALUE_NAME: Pcwstr = w("CryptnetPreFetchRetrievalTimeoutSeconds")

public val CRYPTNET_PRE_FETCH_SCAN_AFTER_TRIGGER_DELAY_SECONDS_DEFAULT: UInt = 60u

public val CRYPTNET_PRE_FETCH_SCAN_AFTER_TRIGGER_DELAY_SECONDS_VALUE_NAME: Pcwstr = w("CryptnetPreFetchScanAfterTriggerDelaySeconds")

public val CRYPTNET_PRE_FETCH_TRIGGER_DISABLE: UInt = 4294967295u

public val CRYPTNET_PRE_FETCH_TRIGGER_PERIOD_SECONDS_VALUE_NAME: Pcwstr = w("CryptnetPreFetchTriggerPeriodSeconds")

public val CRYPTNET_PRE_FETCH_VALIDITY_PERIOD_AFTER_NEXT_UPDATE_PRE_FETCH_DIVISOR_DEFAULT: UInt = 10u

public val CRYPTNET_PRE_FETCH_VALIDITY_PERIOD_AFTER_NEXT_UPDATE_PRE_FETCH_DIVISOR_VALUE_NAME: Pcwstr = w("CryptnetPreFetchValidityPeriodAfterNextUpdatePreFetchDivisor")

public val CRYPTNET_URL_CACHE_DEFAULT_FLUSH: UInt = 0u

public val CRYPTNET_URL_CACHE_DEFAULT_FLUSH_EXEMPT_SECONDS_VALUE_NAME: Pcwstr = w("CryptnetDefaultFlushExemptSeconds")

public val CRYPTNET_URL_CACHE_DISABLE_FLUSH: UInt = 4294967295u

public val CRYPTNET_URL_CACHE_PRE_FETCH_AUTOROOT_CAB: UInt = 5u

public val CRYPTNET_URL_CACHE_PRE_FETCH_BLOB: UInt = 1u

public val CRYPTNET_URL_CACHE_PRE_FETCH_CRL: UInt = 2u

public val CRYPTNET_URL_CACHE_PRE_FETCH_DISALLOWED_CERT_CAB: UInt = 6u

public val CRYPTNET_URL_CACHE_PRE_FETCH_NONE: UInt = 0u

public val CRYPTNET_URL_CACHE_PRE_FETCH_OCSP: UInt = 3u

public val CRYPTNET_URL_CACHE_PRE_FETCH_PIN_RULES_CAB: UInt = 7u

public val CRYPTNET_URL_CACHE_RESPONSE_HTTP: UInt = 1u

public val CRYPTNET_URL_CACHE_RESPONSE_NONE: UInt = 0u

public val CRYPTNET_URL_CACHE_RESPONSE_VALIDATED: UInt = 32768u

public val CRYPTPROTECTMEMORY_BLOCK_SIZE: UInt = 16u

public val CRYPTPROTECTMEMORY_CROSS_PROCESS: UInt = 1u

public val CRYPTPROTECTMEMORY_SAME_LOGON: UInt = 2u

public val CRYPTPROTECTMEMORY_SAME_PROCESS: UInt = 0u

public val CRYPTPROTECT_AUDIT: UInt = 16u

public val CRYPTPROTECT_CRED_REGENERATE: UInt = 128u

public val CRYPTPROTECT_CRED_SYNC: UInt = 8u

public val CRYPTPROTECT_DEFAULT_PROVIDER: Guid = Guid.fromU128(U128(0xdf9d8cd0150111d1uL, 0x8c7a00c04fc297ebuL))

public val CRYPTPROTECT_FIRST_RESERVED_FLAGVAL: UInt = 268435455u

public val CRYPTPROTECT_LAST_RESERVED_FLAGVAL: UInt = 4294967295u

public val CRYPTPROTECT_LOCAL_MACHINE: UInt = 4u

public val CRYPTPROTECT_NO_RECOVERY: UInt = 32u

public val CRYPTPROTECT_PROMPT_ON_PROTECT: UInt = 2u

public val CRYPTPROTECT_PROMPT_ON_UNPROTECT: UInt = 1u

public val CRYPTPROTECT_PROMPT_REQUIRE_STRONG: UInt = 16u

public val CRYPTPROTECT_PROMPT_RESERVED: UInt = 4u

public val CRYPTPROTECT_PROMPT_STRONG: UInt = 8u

public val CRYPTPROTECT_UI_FORBIDDEN: UInt = 1u

public val CRYPTPROTECT_VERIFY_PROTECTION: UInt = 64u

public val CRYPT_ACCUMULATIVE_TIMEOUT: UInt = 2048u

public val CRYPT_ACQUIRE_ALLOW_NCRYPT_KEY_FLAG: CryptAcquireFlags = 65536u

public val CRYPT_ACQUIRE_CACHE_FLAG: CryptAcquireFlags = 1u

public val CRYPT_ACQUIRE_COMPARE_KEY_FLAG: CryptAcquireFlags = 4u

public val CRYPT_ACQUIRE_NCRYPT_KEY_FLAGS_MASK: CryptAcquireFlags = 458752u

public val CRYPT_ACQUIRE_NO_HEALING: CryptAcquireFlags = 8u

public val CRYPT_ACQUIRE_ONLY_NCRYPT_KEY_FLAG: CryptAcquireFlags = 262144u

public val CRYPT_ACQUIRE_PREFER_NCRYPT_KEY_FLAG: CryptAcquireFlags = 131072u

public val CRYPT_ACQUIRE_SILENT_FLAG: CryptAcquireFlags = 64u

public val CRYPT_ACQUIRE_USE_PROV_INFO_FLAG: CryptAcquireFlags = 2u

public val CRYPT_ACQUIRE_WINDOW_HANDLE_FLAG: CryptAcquireFlags = 128u

public val CRYPT_AIA_RETRIEVAL: UInt = 524288u

public val CRYPT_ALL_FUNCTIONS: BcryptResolveProvidersFlags = 1u

public val CRYPT_ALL_PROVIDERS: BcryptResolveProvidersFlags = 2u

public val CRYPT_ANY: BcryptQueryProviderMode = 4u

public val CRYPT_ARCHIVABLE: CryptKeyFlags = 16384u

public val CRYPT_ARCHIVE: UInt = 256u

public val CRYPT_ASN_ENCODING: UInt = 1u

public val CRYPT_ASYNC_RETRIEVAL: UInt = 16u

public val CRYPT_BLOB_VER3: CryptKeyFlags = 128u

public val CRYPT_CACHE_ONLY_RETRIEVAL: UInt = 2u

public val CRYPT_CHECK_FRESHNESS_TIME_VALIDITY: UInt = 1024u

public val CRYPT_CREATE_IV: CryptKeyFlags = 512u

public val CRYPT_CREATE_NEW_FLUSH_ENTRY: UInt = 268435456u

public val CRYPT_CREATE_SALT: CryptKeyFlags = 4u

public val CRYPT_DATA_KEY: CryptKeyFlags = 2048u

public val CRYPT_DECODE_ALLOC_FLAG: UInt = 32768u

public val CRYPT_DECODE_ENABLE_PUNYCODE_FLAG: UInt = 33554432u

public val CRYPT_DECODE_ENABLE_UTF8PERCENT_FLAG: UInt = 67108864u

public val CRYPT_DECODE_NOCOPY_FLAG: UInt = 1u

public val CRYPT_DECODE_NO_SIGNATURE_BYTE_REVERSAL_FLAG: UInt = 8u

public val CRYPT_DECODE_SHARE_OID_STRING_FLAG: UInt = 4u

public val CRYPT_DECODE_TO_BE_SIGNED_FLAG: UInt = 2u

public val CRYPT_DECRYPT: UInt = 2u

public val CRYPT_DECRYPT_RSA_NO_PADDING_CHECK: UInt = 32u

public val CRYPT_DEFAULT_CONTAINER_OPTIONAL: UInt = 128u

public val CRYPT_DEFAULT_CONTEXT: Pcwstr = w("Default")

public val CRYPT_DEFAULT_CONTEXT_AUTO_RELEASE_FLAG: CryptDefaultContextFlags = 1u

public val CRYPT_DEFAULT_CONTEXT_CERT_SIGN_OID: CryptDefaultContextType = 1u

public val CRYPT_DEFAULT_CONTEXT_MULTI_CERT_SIGN_OID: CryptDefaultContextType = 2u

public val CRYPT_DEFAULT_CONTEXT_PROCESS_FLAG: CryptDefaultContextFlags = 2u

public val CRYPT_DEFAULT_OID: Pcstr = s("DEFAULT")

public val CRYPT_DELETEKEYSET: UInt = 16u

public val CRYPT_DELETE_DEFAULT: UInt = 4u

public val CRYPT_DELETE_KEYSET: UInt = 16u

public val CRYPT_DESTROYKEY: CryptKeyFlags = 4u

public val CRYPT_DOMAIN: BcryptTable = 2u

public val CRYPT_DONT_CACHE_RESULT: UInt = 8u

public val CRYPT_DONT_CHECK_TIME_VALIDITY: UInt = 512u

public val CRYPT_DONT_VERIFY_SIGNATURE: UInt = 256u

public val CRYPT_ECC_CMS_SHARED_INFO_SUPPPUBINFO_BYTE_LENGTH: UInt = 4u

public val CRYPT_ECC_PRIVATE_KEY_INFO_V1: UInt = 1u

public val CRYPT_ENABLE_FILE_RETRIEVAL: UInt = 134217728u

public val CRYPT_ENABLE_SSL_REVOCATION_RETRIEVAL: UInt = 8388608u

public val CRYPT_ENCODE_ALLOC_FLAG: CryptEncodeObjectFlags = 32768u

public val CRYPT_ENCODE_DECODE_NONE: UInt = 0u

public val CRYPT_ENCODE_ENABLE_PUNYCODE_FLAG: CryptEncodeObjectFlags = 131072u

public val CRYPT_ENCODE_ENABLE_UTF8PERCENT_FLAG: UInt = 262144u

public val CRYPT_ENCODE_NO_SIGNATURE_BYTE_REVERSAL_FLAG: UInt = 8u

public val CRYPT_ENCRYPT: UInt = 1u

public val CRYPT_ENCRYPT_ALG_OID_GROUP_ID: UInt = 2u

public val CRYPT_ENHKEY_USAGE_OID_GROUP_ID: UInt = 7u

public val CRYPT_EXCLUSIVE: CryptContextConfigFlags = 1u

public val CRYPT_EXPORT: UInt = 4u

public val CRYPT_EXPORTABLE: CryptKeyFlags = 1u

public val CRYPT_EXPORT_KEY: UInt = 64u

public val CRYPT_EXTERNAL_SIGNATURE_LENGTH: UInt = 136u

public val CRYPT_EXT_OR_ATTR_OID_GROUP_ID: UInt = 6u

public val CRYPT_FAILED: UInt = 0u

public val CRYPT_FASTSGC: UInt = 2u

public val CRYPT_FIND_MACHINE_KEYSET_FLAG: CryptFindFlags = 2u

public val CRYPT_FIND_SILENT_KEYSET_FLAG: CryptFindFlags = 64u

public val CRYPT_FIND_USER_KEYSET_FLAG: CryptFindFlags = 1u

public val CRYPT_FIRST: UInt = 1u

public val CRYPT_FIRST_ALG_OID_GROUP_ID: UInt = 1u

public val CRYPT_FLAG_IPSEC: UInt = 16u

public val CRYPT_FLAG_PCT1: UInt = 1u

public val CRYPT_FLAG_SIGNING: UInt = 32u

public val CRYPT_FLAG_SSL2: UInt = 2u

public val CRYPT_FLAG_SSL3: UInt = 4u

public val CRYPT_FLAG_TLS1: UInt = 8u

public val CRYPT_FORCE_KEY_PROTECTION_HIGH: CryptKeyFlags = 32768u

public val CRYPT_FORMAT_COMMA: UInt = 4096u

public val CRYPT_FORMAT_CRLF: UInt = 512u

public val CRYPT_FORMAT_OID: UInt = 4u

public val CRYPT_FORMAT_RDN_CRLF: UInt = 512u

public val CRYPT_FORMAT_RDN_REVERSE: UInt = 2048u

public val CRYPT_FORMAT_RDN_SEMICOLON: UInt = 256u

public val CRYPT_FORMAT_RDN_UNQUOTE: UInt = 1024u

public val CRYPT_FORMAT_SEMICOLON: UInt = 256u

public val CRYPT_FORMAT_SIMPLE: UInt = 1u

public val CRYPT_FORMAT_STR_MULTI_LINE: UInt = 1u

public val CRYPT_FORMAT_STR_NO_HEX: UInt = 16u

public val CRYPT_FORMAT_X509: UInt = 2u

public val CRYPT_GET_INSTALLED_OID_FUNC_FLAG: UInt = 1u

public val CRYPT_GET_URL_FROM_AUTH_ATTRIBUTE: CryptGetUrlFlags = 8u

public val CRYPT_GET_URL_FROM_EXTENSION: CryptGetUrlFlags = 2u

public val CRYPT_GET_URL_FROM_PROPERTY: CryptGetUrlFlags = 1u

public val CRYPT_GET_URL_FROM_UNAUTH_ATTRIBUTE: CryptGetUrlFlags = 4u

public val CRYPT_HASH_ALG_OID_GROUP_ID: UInt = 1u

public val CRYPT_HTTP_POST_RETRIEVAL: UInt = 1048576u

public val CRYPT_IMPL_HARDWARE: UInt = 1u

public val CRYPT_IMPL_MIXED: UInt = 3u

public val CRYPT_IMPL_REMOVABLE: UInt = 8u

public val CRYPT_IMPL_SOFTWARE: UInt = 2u

public val CRYPT_IMPL_UNKNOWN: UInt = 4u

public val CRYPT_IMPORT_KEY: UInt = 128u

public val CRYPT_INITIATOR: CryptKeyFlags = 64u

public val CRYPT_INSTALL_OID_FUNC_BEFORE_FLAG: UInt = 1u

public val CRYPT_INSTALL_OID_INFO_BEFORE_FLAG: UInt = 1u

public val CRYPT_IPSEC_HMAC_KEY: CryptKeyFlags = 256u

public val CRYPT_KDF_OID_GROUP_ID: UInt = 10u

public val CRYPT_KEEP_TIME_VALID: UInt = 128u

public val CRYPT_KEK: CryptKeyFlags = 1024u

public val CRYPT_KEYID_ALLOC_FLAG: UInt = 32768u

public val CRYPT_KEYID_DELETE_FLAG: UInt = 16u

public val CRYPT_KEYID_MACHINE_FLAG: UInt = 32u

public val CRYPT_KEYID_SET_NEW_FLAG: UInt = 8192u

public val CRYPT_KM: BcryptQueryProviderMode = 2u

public val CRYPT_LAST_ALG_OID_GROUP_ID: UInt = 4u

public val CRYPT_LAST_OID_GROUP_ID: UInt = 10u

public val CRYPT_LDAP_AREC_EXCLUSIVE_RETRIEVAL: UInt = 262144u

public val CRYPT_LDAP_INSERT_ENTRY_ATTRIBUTE: UInt = 32768u

public val CRYPT_LDAP_SCOPE_BASE_ONLY_RETRIEVAL: UInt = 8192u

public val CRYPT_LDAP_SIGN_RETRIEVAL: UInt = 65536u

public val CRYPT_LITTLE_ENDIAN: UInt = 1u

public val CRYPT_LOCAL: BcryptTable = 1u

public val CRYPT_LOCALIZED_NAME_ENCODING_TYPE: UInt = 0u

public val CRYPT_LOCALIZED_NAME_OID: Pcstr = s("LocalizedNames")

public val CRYPT_MAC: UInt = 32u

public val CRYPT_MACHINE_DEFAULT: UInt = 1u

public val CRYPT_MACHINE_KEYSET: CryptKeyFlags = 32u

public val CRYPT_MAC_RESOURCE: Pcwstr = w("#667")

public val CRYPT_MAC_RESOURCE_NUMBER: UInt = 667u

public val CRYPT_MATCH_ANY_ENCODING_TYPE: UInt = 4294967295u

public val CRYPT_MAX_PROVIDER_ID: UInt = 999u

public val CRYPT_MESSAGE_BARE_CONTENT_OUT_FLAG: UInt = 1u

public val CRYPT_MESSAGE_ENCAPSULATED_CONTENT_OUT_FLAG: UInt = 2u

public val CRYPT_MESSAGE_KEYID_RECIPIENT_FLAG: UInt = 4u

public val CRYPT_MESSAGE_KEYID_SIGNER_FLAG: UInt = 4u

public val CRYPT_MESSAGE_SILENT_KEYSET_FLAG: UInt = 64u

public val CRYPT_MIN_DEPENDENCIES: CryptImageRefFlags = 1u

public val CRYPT_MM: BcryptQueryProviderMode = 3u

public val CRYPT_MODE_CBC: UInt = 1u

public val CRYPT_MODE_CBCI: UInt = 6u

public val CRYPT_MODE_CBCOFM: UInt = 9u

public val CRYPT_MODE_CBCOFMI: UInt = 10u

public val CRYPT_MODE_CFB: UInt = 4u

public val CRYPT_MODE_CFBP: UInt = 7u

public val CRYPT_MODE_CTS: UInt = 5u

public val CRYPT_MODE_ECB: UInt = 2u

public val CRYPT_MODE_OFB: UInt = 3u

public val CRYPT_MODE_OFBP: UInt = 8u

public val CRYPT_NDR_ENCODING: UInt = 2u

public val CRYPT_NEWKEYSET: UInt = 8u

public val CRYPT_NEXT: UInt = 2u

public val CRYPT_NOHASHOID: UInt = 1u

public val CRYPT_NOT_MODIFIED_RETRIEVAL: UInt = 4194304u

public val CRYPT_NO_AUTH_RETRIEVAL: UInt = 131072u

public val CRYPT_NO_OCSP_FAILOVER_TO_CRL_RETRIEVAL: UInt = 33554432u

public val CRYPT_NO_SALT: CryptKeyFlags = 16u

public val CRYPT_OAEP: CryptKeyFlags = 64u

public val CRYPT_OBJECT_LOCATOR_FIRST_RESERVED_USER_NAME_TYPE: UInt = 33u

public val CRYPT_OBJECT_LOCATOR_LAST_RESERVED_NAME_TYPE: UInt = 32u

public val CRYPT_OBJECT_LOCATOR_LAST_RESERVED_USER_NAME_TYPE: UInt = 65535u

public val CRYPT_OBJECT_LOCATOR_RELEASE_DLL_UNLOAD: CryptObjectLocatorReleaseReason = 4u

public val CRYPT_OBJECT_LOCATOR_RELEASE_PROCESS_EXIT: CryptObjectLocatorReleaseReason = 3u

public val CRYPT_OBJECT_LOCATOR_RELEASE_SERVICE_STOP: CryptObjectLocatorReleaseReason = 2u

public val CRYPT_OBJECT_LOCATOR_RELEASE_SYSTEM_SHUTDOWN: CryptObjectLocatorReleaseReason = 1u

public val CRYPT_OBJECT_LOCATOR_SPN_NAME_TYPE: UInt = 1u

public val CRYPT_OCSP_ONLY_RETRIEVAL: UInt = 16777216u

public val CRYPT_OFFLINE_CHECK_RETRIEVAL: UInt = 16384u

public val CRYPT_OID_CREATE_COM_OBJECT_FUNC: Pcstr = s("CryptDllCreateCOMObject")

public val CRYPT_OID_DECODE_OBJECT_EX_FUNC: Pcstr = s("CryptDllDecodeObjectEx")

public val CRYPT_OID_DECODE_OBJECT_FUNC: Pcstr = s("CryptDllDecodeObject")

public val CRYPT_OID_DISABLE_SEARCH_DS_FLAG: UInt = 2147483648u

public val CRYPT_OID_ENCODE_OBJECT_EX_FUNC: Pcstr = s("CryptDllEncodeObjectEx")

public val CRYPT_OID_ENCODE_OBJECT_FUNC: Pcstr = s("CryptDllEncodeObject")

public val CRYPT_OID_ENUM_PHYSICAL_STORE_FUNC: Pcstr = s("CertDllEnumPhysicalStore")

public val CRYPT_OID_ENUM_SYSTEM_STORE_FUNC: Pcstr = s("CertDllEnumSystemStore")

public val CRYPT_OID_EXPORT_PRIVATE_KEY_INFO_FUNC: Pcstr = s("CryptDllExportPrivateKeyInfoEx")

public val CRYPT_OID_EXPORT_PUBLIC_KEY_INFO_EX2_FUNC: Pcstr = s("CryptDllExportPublicKeyInfoEx2")

public val CRYPT_OID_EXPORT_PUBLIC_KEY_INFO_FROM_BCRYPT_HANDLE_FUNC: Pcstr = s("CryptDllExportPublicKeyInfoFromBCryptKeyHandle")

public val CRYPT_OID_EXPORT_PUBLIC_KEY_INFO_FUNC: Pcstr = s("CryptDllExportPublicKeyInfoEx")

public val CRYPT_OID_EXTRACT_ENCODED_SIGNATURE_PARAMETERS_FUNC: Pcstr = s("CryptDllExtractEncodedSignatureParameters")

public val CRYPT_OID_FIND_LOCALIZED_NAME_FUNC: Pcstr = s("CryptDllFindLocalizedName")

public val CRYPT_OID_FIND_OID_INFO_FUNC: Pcstr = s("CryptDllFindOIDInfo")

public val CRYPT_OID_FORMAT_OBJECT_FUNC: Pcstr = s("CryptDllFormatObject")

public val CRYPT_OID_IMPORT_PRIVATE_KEY_INFO_FUNC: Pcstr = s("CryptDllImportPrivateKeyInfoEx")

public val CRYPT_OID_IMPORT_PUBLIC_KEY_INFO_EX2_FUNC: Pcstr = s("CryptDllImportPublicKeyInfoEx2")

public val CRYPT_OID_IMPORT_PUBLIC_KEY_INFO_FUNC: Pcstr = s("CryptDllImportPublicKeyInfoEx")

public val CRYPT_OID_INFO_ALGID_KEY: UInt = 3u

public val CRYPT_OID_INFO_CNG_ALGID_KEY: UInt = 5u

public val CRYPT_OID_INFO_CNG_SIGN_KEY: UInt = 6u

public val CRYPT_OID_INFO_ECC_PARAMETERS_ALGORITHM: Pcwstr = w("CryptOIDInfoECCParameters")

public val CRYPT_OID_INFO_ECC_WRAP_PARAMETERS_ALGORITHM: Pcwstr = w("CryptOIDInfoECCWrapParameters")

public val CRYPT_OID_INFO_HASH_PARAMETERS_ALGORITHM: Pcwstr = w("CryptOIDInfoHashParameters")

public val CRYPT_OID_INFO_MGF1_PARAMETERS_ALGORITHM: Pcwstr = w("CryptOIDInfoMgf1Parameters")

public val CRYPT_OID_INFO_NAME_KEY: UInt = 2u

public val CRYPT_OID_INFO_NO_PARAMETERS_ALGORITHM: Pcwstr = w("CryptOIDInfoNoParameters")

public val CRYPT_OID_INFO_NO_SIGN_ALGORITHM: Pcwstr = w("CryptOIDInfoNoSign")

public val CRYPT_OID_INFO_OAEP_PARAMETERS_ALGORITHM: Pcwstr = w("CryptOIDInfoOAEPParameters")

public val CRYPT_OID_INFO_OID_GROUP_BIT_LEN_MASK: UInt = 268369920u

public val CRYPT_OID_INFO_OID_GROUP_BIT_LEN_SHIFT: UInt = 16u

public val CRYPT_OID_INFO_OID_KEY: UInt = 1u

public val CRYPT_OID_INFO_OID_KEY_FLAGS_MASK: UInt = 4294901760u

public val CRYPT_OID_INFO_PUBKEY_ENCRYPT_KEY_FLAG: CryptImportPublicKeyFlags = 1073741824u

public val CRYPT_OID_INFO_PUBKEY_SIGN_KEY_FLAG: CryptImportPublicKeyFlags = 2147483648u

public val CRYPT_OID_INFO_SIGN_KEY: UInt = 4u

public val CRYPT_OID_INHIBIT_SIGNATURE_FORMAT_FLAG: UInt = 1u

public val CRYPT_OID_NO_NULL_ALGORITHM_PARA_FLAG: UInt = 4u

public val CRYPT_OID_OPEN_STORE_PROV_FUNC: Pcstr = s("CertDllOpenStoreProv")

public val CRYPT_OID_OPEN_SYSTEM_STORE_PROV_FUNC: Pcstr = s("CertDllOpenSystemStoreProv")

public val CRYPT_OID_PREFER_CNG_ALGID_FLAG: UInt = 1073741824u

public val CRYPT_OID_PUBKEY_ENCRYPT_ONLY_FLAG: UInt = 1073741824u

public val CRYPT_OID_PUBKEY_SIGN_ONLY_FLAG: UInt = 2147483648u

public val CRYPT_OID_REGISTER_PHYSICAL_STORE_FUNC: Pcstr = s("CertDllRegisterPhysicalStore")

public val CRYPT_OID_REGISTER_SYSTEM_STORE_FUNC: Pcstr = s("CertDllRegisterSystemStore")

public val CRYPT_OID_REGPATH: Pcstr = s("Software\\Microsoft\\Cryptography\\OID")

public val CRYPT_OID_REG_DLL_VALUE_NAME: Pcwstr = w("Dll")

public val CRYPT_OID_REG_ENCODING_TYPE_PREFIX: Pcstr = s("EncodingType ")

public val CRYPT_OID_REG_FLAGS_VALUE_NAME: Pcwstr = w("CryptFlags")

public val CRYPT_OID_REG_FUNC_NAME_VALUE_NAME: Pcwstr = w("FuncName")

public val CRYPT_OID_REG_FUNC_NAME_VALUE_NAME_A: Pcstr = s("FuncName")

public val CRYPT_OID_SIGN_AND_ENCODE_HASH_FUNC: Pcstr = s("CryptDllSignAndEncodeHash")

public val CRYPT_OID_SYSTEM_STORE_LOCATION_VALUE_NAME: Pcwstr = w("SystemStoreLocation")

public val CRYPT_OID_UNREGISTER_PHYSICAL_STORE_FUNC: Pcstr = s("CertDllUnregisterPhysicalStore")

public val CRYPT_OID_UNREGISTER_SYSTEM_STORE_FUNC: Pcstr = s("CertDllUnregisterSystemStore")

public val CRYPT_OID_USE_CURVE_NAME_FOR_ENCODE_FLAG: UInt = 536870912u

public val CRYPT_OID_USE_CURVE_PARAMETERS_FOR_ENCODE_FLAG: UInt = 268435456u

public val CRYPT_OID_USE_PUBKEY_PARA_FOR_PKCS7_FLAG: UInt = 2u

public val CRYPT_OID_VERIFY_CERTIFICATE_CHAIN_POLICY_FUNC: Pcstr = s("CertDllVerifyCertificateChainPolicy")

public val CRYPT_OID_VERIFY_CTL_USAGE_FUNC: Pcstr = s("CertDllVerifyCTLUsage")

public val CRYPT_OID_VERIFY_ENCODED_SIGNATURE_FUNC: Pcstr = s("CryptDllVerifyEncodedSignature")

public val CRYPT_OID_VERIFY_REVOCATION_FUNC: Pcstr = s("CertDllVerifyRevocation")

public val CRYPT_ONLINE: CryptKeyFlags = 128u

public val CRYPT_OVERRIDE: CryptContextConfigFlags = 65536u

public val CRYPT_OVERWRITE: UInt = 1u

public val CRYPT_OWF_REPL_LM_HASH: UInt = 1u

public val CRYPT_PARAM_ASYNC_RETRIEVAL_COMPLETION: Pcstr = COpaquePointer(1.toLong())

public val CRYPT_PARAM_CANCEL_ASYNC_RETRIEVAL: Pcstr = COpaquePointer(2.toLong())

public val CRYPT_POLICY_OID_GROUP_ID: UInt = 8u

public val CRYPT_PREGEN: CryptKeyFlags = 64u

public val CRYPT_PRIORITY_BOTTOM: UInt = 4294967295u

public val CRYPT_PRIORITY_TOP: UInt = 0u

public val CRYPT_PROCESS_ISOLATE: CryptImageRefFlags = 65536u

public val CRYPT_PROVIDER_IOCTL__GET_SCHANNEL_INTERFACE: UInt = 4145180u

public val CRYPT_PROVSTRUC_VERSION_V3: UInt = 3u

public val CRYPT_PROXY_CACHE_RETRIEVAL: UInt = 2097152u

public val CRYPT_PSTORE: UInt = 2u

public val CRYPT_PUBKEY_ALG_OID_GROUP_ID: UInt = 3u

public val CRYPT_RANDOM_QUERY_STRING_RETRIEVAL: UInt = 67108864u

public val CRYPT_RC2_128BIT_VERSION: UInt = 58u

public val CRYPT_RC2_40BIT_VERSION: UInt = 160u

public val CRYPT_RC2_56BIT_VERSION: UInt = 52u

public val CRYPT_RC2_64BIT_VERSION: UInt = 120u

public val CRYPT_RDN_ATTR_OID_GROUP_ID: UInt = 5u

public val CRYPT_READ: UInt = 8u

public val CRYPT_RECIPIENT: CryptKeyFlags = 16u

public val CRYPT_REGISTER_FIRST_INDEX: UInt = 0u

public val CRYPT_REGISTER_LAST_INDEX: UInt = 4294967295u

public val CRYPT_RETRIEVE_MAX_ERROR_CONTENT_LENGTH: UInt = 4096u

public val CRYPT_RETRIEVE_MULTIPLE_OBJECTS: UInt = 1u

public val CRYPT_SECRETDIGEST: UInt = 1u

public val CRYPT_SEC_DESCR: UInt = 1u

public val CRYPT_SERVER: UInt = 1024u

public val CRYPT_SF: CryptKeyFlags = 256u

public val CRYPT_SGC: UInt = 1u

public val CRYPT_SGCKEY: CryptKeyFlags = 8192u

public val CRYPT_SGC_ENUM: UInt = 4u

public val CRYPT_SIGN_ALG_OID_GROUP_ID: UInt = 4u

public val CRYPT_SIG_RESOURCE: Pcwstr = w("#666")

public val CRYPT_SIG_RESOURCE_NUMBER: UInt = 666u

public val CRYPT_SIG_RESOURCE_VERSION: UInt = 256u

public val CRYPT_SILENT: UInt = 64u

public val CRYPT_SORTED_CTL_ENCODE_HASHED_SUBJECT_IDENTIFIER_FLAG: UInt = 65536u

public val CRYPT_SSL2_FALLBACK: CryptKeyFlags = 2u

public val CRYPT_STICKY_CACHE_RETRIEVAL: UInt = 4096u

public val CRYPT_STRING_ANY: CryptString = 7u

public val CRYPT_STRING_BASE64: CryptString = 1u

public val CRYPT_STRING_BASE64HEADER: CryptString = 0u

public val CRYPT_STRING_BASE64REQUESTHEADER: CryptString = 3u

public val CRYPT_STRING_BASE64URI: UInt = 13u

public val CRYPT_STRING_BASE64X509CRLHEADER: CryptString = 9u

public val CRYPT_STRING_BASE64_ANY: CryptString = 6u

public val CRYPT_STRING_BINARY: CryptString = 2u

public val CRYPT_STRING_ENCODEMASK: UInt = 255u

public val CRYPT_STRING_HASHDATA: UInt = 268435456u

public val CRYPT_STRING_HEX: CryptString = 4u

public val CRYPT_STRING_HEXADDR: CryptString = 10u

public val CRYPT_STRING_HEXASCII: CryptString = 5u

public val CRYPT_STRING_HEXASCIIADDR: CryptString = 11u

public val CRYPT_STRING_HEXRAW: CryptString = 12u

public val CRYPT_STRING_HEX_ANY: CryptString = 8u

public val CRYPT_STRING_NOCR: UInt = 2147483648u

public val CRYPT_STRING_NOCRLF: UInt = 1073741824u

public val CRYPT_STRING_PERCENTESCAPE: UInt = 134217728u

public val CRYPT_STRING_RESERVED100: UInt = 256u

public val CRYPT_STRING_RESERVED200: UInt = 512u

public val CRYPT_STRING_STRICT: CryptString = 536870912u

public val CRYPT_SUCCEED: UInt = 1u

public val CRYPT_TEMPLATE_OID_GROUP_ID: UInt = 9u

public val CRYPT_TYPE2_FORMAT: UInt = 2u

public val CRYPT_UI_PROMPT: UInt = 4u

public val CRYPT_UM: BcryptQueryProviderMode = 1u

public val CRYPT_UNICODE_NAME_DECODE_DISABLE_IE4_UTF8_FLAG: UInt = 16777216u

public val CRYPT_UNICODE_NAME_ENCODE_DISABLE_CHECK_TYPE_FLAG: CryptEncodeObjectFlags = 1073741824u

public val CRYPT_UNICODE_NAME_ENCODE_ENABLE_T61_UNICODE_FLAG: CryptEncodeObjectFlags = 2147483648u

public val CRYPT_UNICODE_NAME_ENCODE_ENABLE_UTF8_UNICODE_FLAG: CryptEncodeObjectFlags = 536870912u

public val CRYPT_UNICODE_NAME_ENCODE_FORCE_UTF8_UNICODE_FLAG: UInt = 268435456u

public val CRYPT_UPDATE_KEY: UInt = 8u

public val CRYPT_USERDATA: UInt = 1u

public val CRYPT_USER_DEFAULT: UInt = 2u

public val CRYPT_USER_KEYSET: CryptKeyFlags = 4096u

public val CRYPT_USER_PROTECTED: CryptKeyFlags = 2u

public val CRYPT_USER_PROTECTED_STRONG: UInt = 1048576u

public val CRYPT_VERIFYCONTEXT: UInt = 4026531840u

public val CRYPT_VERIFY_CERT_SIGN_CHECK_WEAK_HASH_FLAG: UInt = 8u

public val CRYPT_VERIFY_CERT_SIGN_DISABLE_MD2_MD4_FLAG: CryptVerifyCertFlags = 1u

public val CRYPT_VERIFY_CERT_SIGN_ISSUER_CERT: UInt = 2u

public val CRYPT_VERIFY_CERT_SIGN_ISSUER_CHAIN: UInt = 3u

public val CRYPT_VERIFY_CERT_SIGN_ISSUER_NULL: UInt = 4u

public val CRYPT_VERIFY_CERT_SIGN_ISSUER_PUBKEY: UInt = 1u

public val CRYPT_VERIFY_CERT_SIGN_RETURN_STRONG_PROPERTIES_FLAG: CryptVerifyCertFlags = 4u

public val CRYPT_VERIFY_CERT_SIGN_SET_STRONG_PROPERTIES_FLAG: CryptVerifyCertFlags = 2u

public val CRYPT_VERIFY_CERT_SIGN_SUBJECT_BLOB: UInt = 1u

public val CRYPT_VERIFY_CERT_SIGN_SUBJECT_CERT: UInt = 2u

public val CRYPT_VERIFY_CERT_SIGN_SUBJECT_CRL: UInt = 3u

public val CRYPT_VERIFY_CERT_SIGN_SUBJECT_OCSP_BASIC_SIGNED_RESPONSE: UInt = 4u

public val CRYPT_VERIFY_CONTEXT_SIGNATURE: UInt = 32u

public val CRYPT_VERIFY_DATA_HASH: UInt = 64u

public val CRYPT_VOLATILE: CryptKeyFlags = 4096u

public val CRYPT_WIRE_ONLY_RETRIEVAL: UInt = 4u

public val CRYPT_WRITE: UInt = 16u

public val CRYPT_X931_FORMAT: UInt = 4u

public val CRYPT_X942_COUNTER_BYTE_LENGTH: UInt = 4u

public val CRYPT_X942_KEY_LENGTH_BYTE_LENGTH: UInt = 4u

public val CRYPT_XML_ALGORITHM_INFO_FIND_BY_CNG_ALGID: UInt = 3u

public val CRYPT_XML_ALGORITHM_INFO_FIND_BY_CNG_SIGN_ALGID: UInt = 4u

public val CRYPT_XML_ALGORITHM_INFO_FIND_BY_NAME: UInt = 2u

public val CRYPT_XML_ALGORITHM_INFO_FIND_BY_URI: UInt = 1u

public val CRYPT_XML_BLOB_MAX: UInt = 2147483640u

public val CRYPT_XML_CHARSET_AUTO: CryptXmlCharset = 0

public val CRYPT_XML_CHARSET_UTF16BE: CryptXmlCharset = 3

public val CRYPT_XML_CHARSET_UTF16LE: CryptXmlCharset = 2

public val CRYPT_XML_CHARSET_UTF8: CryptXmlCharset = 1

public val CRYPT_XML_DIGEST_REFERENCE_DATA_TRANSFORMED: UInt = 1u

public val CRYPT_XML_DIGEST_VALUE_MAX: UInt = 128u

public val CRYPT_XML_E_ALGORITHM: Hresult = 0x80092104u.toInt()

public val CRYPT_XML_E_BASE: Hresult = 0x80092100u.toInt()

public val CRYPT_XML_E_ENCODING: Hresult = 0x80092103u.toInt()

public val CRYPT_XML_E_HANDLE: Hresult = 0x80092106u.toInt()

public val CRYPT_XML_E_HASH_FAILED: Hresult = 0x8009210Bu.toInt()

public val CRYPT_XML_E_INVALID_DIGEST: Hresult = 0x80092109u.toInt()

public val CRYPT_XML_E_INVALID_KEYVALUE: Hresult = 0x8009210Fu.toInt()

public val CRYPT_XML_E_INVALID_SIGNATURE: Hresult = 0x8009210Au.toInt()

public val CRYPT_XML_E_LARGE: Hresult = 0x80092101u.toInt()

public val CRYPT_XML_E_LAST: Hresult = 0x80092112u.toInt()

public val CRYPT_XML_E_NON_UNIQUE_ID: Hresult = 0x80092112u.toInt()

public val CRYPT_XML_E_OPERATION: Hresult = 0x80092107u.toInt()

public val CRYPT_XML_E_SIGNER: Hresult = 0x80092111u.toInt()

public val CRYPT_XML_E_SIGN_FAILED: Hresult = 0x8009210Cu.toInt()

public val CRYPT_XML_E_TOO_MANY_SIGNATURES: Hresult = 0x8009210Eu.toInt()

public val CRYPT_XML_E_TOO_MANY_TRANSFORMS: Hresult = 0x80092102u.toInt()

public val CRYPT_XML_E_TRANSFORM: Hresult = 0x80092105u.toInt()

public val CRYPT_XML_E_UNEXPECTED_XML: Hresult = 0x80092110u.toInt()

public val CRYPT_XML_E_UNRESOLVED_REFERENCE: Hresult = 0x80092108u.toInt()

public val CRYPT_XML_E_VERIFY_FAILED: Hresult = 0x8009210Du.toInt()

public val CRYPT_XML_FLAG_ADD_OBJECT_CREATE_COPY: UInt = 1u

public val CRYPT_XML_FLAG_ALWAYS_RETURN_ENCODED_OBJECT: UInt = 1073741824u

public val CRYPT_XML_FLAG_CREATE_REFERENCE_AS_OBJECT: UInt = 1u

public val CRYPT_XML_FLAG_DISABLE_EXTENSIONS: CryptXmlFlags = 268435456u

public val CRYPT_XML_FLAG_ECDSA_DSIG11: UInt = 67108864u

public val CRYPT_XML_FLAG_ENFORCE_ID_NAME_FORMAT: UInt = 134217728u

public val CRYPT_XML_FLAG_ENFORCE_ID_NCNAME_FORMAT: UInt = 536870912u

public val CRYPT_XML_FLAG_NO_SERIALIZE: CryptXmlFlags = 2147483648u

public val CRYPT_XML_GROUP_ID_HASH: CryptXmlGroupId = 1u

public val CRYPT_XML_GROUP_ID_SIGN: CryptXmlGroupId = 2u

public val CRYPT_XML_ID_MAX: UInt = 256u

public val CRYPT_XML_KEYINFO_SPEC_ENCODED: CryptXmlKeyinfoSpec = 1

public val CRYPT_XML_KEYINFO_SPEC_NONE: CryptXmlKeyinfoSpec = 0

public val CRYPT_XML_KEYINFO_SPEC_PARAM: CryptXmlKeyinfoSpec = 2

public val CRYPT_XML_KEYINFO_TYPE_CUSTOM: CryptXmlKeyinfoType = 5u

public val CRYPT_XML_KEYINFO_TYPE_KEYNAME: CryptXmlKeyinfoType = 1u

public val CRYPT_XML_KEYINFO_TYPE_KEYVALUE: CryptXmlKeyinfoType = 2u

public val CRYPT_XML_KEYINFO_TYPE_RETRIEVAL: CryptXmlKeyinfoType = 3u

public val CRYPT_XML_KEYINFO_TYPE_X509DATA: CryptXmlKeyinfoType = 4u

public val CRYPT_XML_KEY_VALUE_TYPE_CUSTOM: CryptXmlKeyValueType = 4u

public val CRYPT_XML_KEY_VALUE_TYPE_DSA: CryptXmlKeyValueType = 1u

public val CRYPT_XML_KEY_VALUE_TYPE_ECDSA: CryptXmlKeyValueType = 3u

public val CRYPT_XML_KEY_VALUE_TYPE_RSA: CryptXmlKeyValueType = 2u

public val CRYPT_XML_OBJECTS_MAX: UInt = 256u

public val CRYPT_XML_PROPERTY_DOC_DECLARATION: CryptXmlPropertyId = 4

public val CRYPT_XML_PROPERTY_MAX_HEAP_SIZE: CryptXmlPropertyId = 1

public val CRYPT_XML_PROPERTY_MAX_SIGNATURES: CryptXmlPropertyId = 3

public val CRYPT_XML_PROPERTY_SIGNATURE_LOCATION: CryptXmlPropertyId = 2

public val CRYPT_XML_PROPERTY_XML_OUTPUT_CHARSET: CryptXmlPropertyId = 5

public val CRYPT_XML_REFERENCES_MAX: UInt = 32760u

public val CRYPT_XML_SIGNATURES_MAX: UInt = 16u

public val CRYPT_XML_SIGNATURE_VALUE_MAX: UInt = 2048u

public val CRYPT_XML_SIGN_ADD_KEYVALUE: CryptXmlFlags = 1u

public val CRYPT_XML_STATUS_DIGESTING: CryptXmlStatusInfoStatus = 4u

public val CRYPT_XML_STATUS_DIGEST_VALID: CryptXmlStatusInfoStatus = 8u

public val CRYPT_XML_STATUS_ERROR_DIGEST_INVALID: CryptXmlStatusErrorStatus = 2u

public val CRYPT_XML_STATUS_ERROR_KEYINFO_NOT_PARSED: CryptXmlStatusErrorStatus = 131072u

public val CRYPT_XML_STATUS_ERROR_NOT_RESOLVED: CryptXmlStatusErrorStatus = 1u

public val CRYPT_XML_STATUS_ERROR_NOT_SUPPORTED_ALGORITHM: CryptXmlStatusErrorStatus = 5u

public val CRYPT_XML_STATUS_ERROR_NOT_SUPPORTED_TRANSFORM: CryptXmlStatusErrorStatus = 8u

public val CRYPT_XML_STATUS_ERROR_SIGNATURE_INVALID: CryptXmlStatusErrorStatus = 65536u

public val CRYPT_XML_STATUS_INTERNAL_REFERENCE: CryptXmlStatusInfoStatus = 1u

public val CRYPT_XML_STATUS_KEY_AVAILABLE: CryptXmlStatusInfoStatus = 2u

public val CRYPT_XML_STATUS_NO_ERROR: UInt = 0u

public val CRYPT_XML_STATUS_OPENED_TO_ENCODE: CryptXmlStatusInfoStatus = 2147483648u

public val CRYPT_XML_STATUS_SIGNATURE_VALID: CryptXmlStatusInfoStatus = 65536u

public val CRYPT_XML_TRANSFORM_MAX: UInt = 16u

public val CRYPT_XML_TRANSFORM_ON_NODESET: CryptXmlTransformFlags = 2u

public val CRYPT_XML_TRANSFORM_ON_STREAM: CryptXmlTransformFlags = 1u

public val CRYPT_XML_TRANSFORM_URI_QUERY_STRING: CryptXmlTransformFlags = 3u

public val CRYPT_XML_X509DATA_TYPE_CERTIFICATE: CryptXmlX509dataType = 4u

public val CRYPT_XML_X509DATA_TYPE_CRL: CryptXmlX509dataType = 5u

public val CRYPT_XML_X509DATA_TYPE_CUSTOM: CryptXmlX509dataType = 6u

public val CRYPT_XML_X509DATA_TYPE_ISSUER_SERIAL: CryptXmlX509dataType = 1u

public val CRYPT_XML_X509DATA_TYPE_SKI: CryptXmlX509dataType = 2u

public val CRYPT_XML_X509DATA_TYPE_SUBJECT_NAME: CryptXmlX509dataType = 3u

public val CRYPT_Y_ONLY: CryptKeyFlags = 1u

public val CSF_AUTHENTICATE: Pcwstr = w("Authenticate")

public val CSF_CHANGE_AUTHENTICATOR: Pcwstr = w("Change Authenticator")

public val CSF_IMPORT_KEYPAIR: Pcwstr = w("Import Key Pair")

public val CTL_ANY_SUBJECT_TYPE: UInt = 1u

public val CTL_CERT_SUBJECT_TYPE: UInt = 2u

public val CTL_ENTRY_FROM_PROP_CHAIN_FLAG: UInt = 1u

public val CTL_FIND_ANY: CertFindType = 0u

public val CTL_FIND_EXISTING: CertFindType = 5u

public val CTL_FIND_MD5_HASH: CertFindType = 2u

public val CTL_FIND_NO_LIST_ID_CBDATA: UInt = 4294967295u

public val CTL_FIND_SAME_USAGE_FLAG: CertFindType = 1u

public val CTL_FIND_SHA1_HASH: CertFindType = 1u

public val CTL_FIND_SUBJECT: CertFindType = 4u

public val CTL_FIND_USAGE: CertFindType = 3u

public val CTL_V1: UInt = 0u

public val CUR_BLOB_VERSION: UInt = 2u

public val CUR_OFFLOAD_VERSION: UInt = 1u

public val CHALLENGE_RESPONSE_PIN_TYPE: SecretType = 2

public val DSA_FIPS186_2: DsafipsversionEnum = 0

public val DSA_FIPS186_3: DsafipsversionEnum = 1

public val DSA_HASH_ALGORITHM_SHA1: HashalgorithmEnum = 0

public val DSA_HASH_ALGORITHM_SHA256: HashalgorithmEnum = 1

public val DSA_HASH_ALGORITHM_SHA512: HashalgorithmEnum = 2

public val DTLS1_0_PROTOCOL_VERSION: UInt = 65279u

public val DTLS1_2_PROTOCOL_VERSION: UInt = 65277u

public val DIGITAL_SIGNATURE_PIN: SecretPurpose = 1

public val DIRECTION_DECRYPT: Direction = 2

public val DIRECTION_ENCRYPT: Direction = 1

public val ECC_CMS_SHARED_INFO: Pcstr = COpaquePointer(77.toLong())

public val ENUM_CEPSETUPPROP_AUTHENTICATION: CEPSetupProperty = 0

public val ENUM_CEPSETUPPROP_CAINFORMATION: MSCEPSetupProperty = 11

public val ENUM_CEPSETUPPROP_CHALLENGEURL: MSCEPSetupProperty = 13

public val ENUM_CEPSETUPPROP_EXCHANGEKEYINFORMATION: MSCEPSetupProperty = 10

public val ENUM_CEPSETUPPROP_KEYBASED_RENEWAL: CEPSetupProperty = 3

public val ENUM_CEPSETUPPROP_MSCEPURL: MSCEPSetupProperty = 12

public val ENUM_CEPSETUPPROP_RANAME_CITY: MSCEPSetupProperty = 6

public val ENUM_CEPSETUPPROP_RANAME_CN: MSCEPSetupProperty = 2

public val ENUM_CEPSETUPPROP_RANAME_COMPANY: MSCEPSetupProperty = 4

public val ENUM_CEPSETUPPROP_RANAME_COUNTRY: MSCEPSetupProperty = 8

public val ENUM_CEPSETUPPROP_RANAME_DEPT: MSCEPSetupProperty = 5

public val ENUM_CEPSETUPPROP_RANAME_EMAIL: MSCEPSetupProperty = 3

public val ENUM_CEPSETUPPROP_RANAME_STATE: MSCEPSetupProperty = 7

public val ENUM_CEPSETUPPROP_SIGNINGKEYINFORMATION: MSCEPSetupProperty = 9

public val ENUM_CEPSETUPPROP_SSLCERTHASH: CEPSetupProperty = 1

public val ENUM_CEPSETUPPROP_URL: CEPSetupProperty = 2

public val ENUM_CEPSETUPPROP_USECHALLENGE: MSCEPSetupProperty = 1

public val ENUM_CEPSETUPPROP_USELOCALSYSTEM: MSCEPSetupProperty = 0

public val ENUM_CESSETUPPROP_ALLOW_KEYBASED_RENEWAL: CESSetupProperty = 6

public val ENUM_CESSETUPPROP_AUTHENTICATION: CESSetupProperty = 2

public val ENUM_CESSETUPPROP_CACONFIG: CESSetupProperty = 1

public val ENUM_CESSETUPPROP_RENEWALONLY: CESSetupProperty = 5

public val ENUM_CESSETUPPROP_SSLCERTHASH: CESSetupProperty = 3

public val ENUM_CESSETUPPROP_URL: CESSetupProperty = 4

public val ENUM_CESSETUPPROP_USE_IISAPPPOOLIDENTITY: CESSetupProperty = 0

public val ENUM_SETUPPROP_CADSSUFFIX: CASetupProperty = 4

public val ENUM_SETUPPROP_CAKEYINFORMATION: CASetupProperty = 1

public val ENUM_SETUPPROP_CANAME: CASetupProperty = 3

public val ENUM_SETUPPROP_CATYPE: CASetupProperty = 0

public val ENUM_SETUPPROP_DATABASEDIRECTORY: CASetupProperty = 9

public val ENUM_SETUPPROP_EXPIRATIONDATE: CASetupProperty = 7

public val ENUM_SETUPPROP_INTERACTIVE: CASetupProperty = 2

public val ENUM_SETUPPROP_INVALID: CASetupProperty = -1

public val ENUM_SETUPPROP_LOGDIRECTORY: CASetupProperty = 10

public val ENUM_SETUPPROP_PARENTCAMACHINE: CASetupProperty = 12

public val ENUM_SETUPPROP_PARENTCANAME: CASetupProperty = 13

public val ENUM_SETUPPROP_PRESERVEDATABASE: CASetupProperty = 8

public val ENUM_SETUPPROP_REQUESTFILE: CASetupProperty = 14

public val ENUM_SETUPPROP_SHAREDFOLDER: CASetupProperty = 11

public val ENUM_SETUPPROP_VALIDITYPERIOD: CASetupProperty = 5

public val ENUM_SETUPPROP_VALIDITYPERIODUNIT: CASetupProperty = 6

public val ENUM_SETUPPROP_WEBCAMACHINE: CASetupProperty = 15

public val ENUM_SETUPPROP_WEBCANAME: CASetupProperty = 16

public val EXPORT_PRIVATE_KEYS: UInt = 4u

public val EXPO_OFFLOAD_FUNC_NAME: Pcstr = s("OffloadModExpo")

public val EXPO_OFFLOAD_REG_VALUE: Pcstr = s("ExpoOffload")

public val E_ICARD_ARGUMENT: Hresult = 0xC0050105u.toInt()

public val E_ICARD_COMMUNICATION: Hresult = 0xC0050100u.toInt()

public val E_ICARD_DATA_ACCESS: Hresult = 0xC0050101u.toInt()

public val E_ICARD_EXPORT: Hresult = 0xC0050102u.toInt()

public val E_ICARD_FAIL: Hresult = 0xC0050115u.toInt()

public val E_ICARD_FAILED_REQUIRED_CLAIMS: Hresult = 0xC0050184u.toInt()

public val E_ICARD_IDENTITY: Hresult = 0xC0050103u.toInt()

public val E_ICARD_IMPORT: Hresult = 0xC0050104u.toInt()

public val E_ICARD_INFORMATIONCARD: Hresult = 0xC0050107u.toInt()

public val E_ICARD_INVALID_PROOF_KEY: Hresult = 0xC0050182u.toInt()

public val E_ICARD_LOGOVALIDATION: Hresult = 0xC0050109u.toInt()

public val E_ICARD_MISSING_APPLIESTO: Hresult = 0xC0050181u.toInt()

public val E_ICARD_PASSWORDVALIDATION: Hresult = 0xC005010Au.toInt()

public val E_ICARD_POLICY: Hresult = 0xC005010Bu.toInt()

public val E_ICARD_PROCESSDIED: Hresult = 0xC005010Cu.toInt()

public val E_ICARD_REFRESH_REQUIRED: Hresult = 0xC0050180u.toInt()

public val E_ICARD_REQUEST: Hresult = 0xC0050106u.toInt()

public val E_ICARD_SERVICE: Hresult = 0xC005010Eu.toInt()

public val E_ICARD_SERVICEBUSY: Hresult = 0xC005010Du.toInt()

public val E_ICARD_SHUTTINGDOWN: Hresult = 0xC005010Fu.toInt()

public val E_ICARD_STOREKEY: Hresult = 0xC0050108u.toInt()

public val E_ICARD_STORE_IMPORT: Hresult = 0xC0050114u.toInt()

public val E_ICARD_TOKENCREATION: Hresult = 0xC0050110u.toInt()

public val E_ICARD_TRUSTEXCHANGE: Hresult = 0xC0050111u.toInt()

public val E_ICARD_UI_INITIALIZATION: Hresult = 0xC005011Au.toInt()

public val E_ICARD_UNKNOWN_REFERENCE: Hresult = 0xC0050183u.toInt()

public val E_ICARD_UNTRUSTED: Hresult = 0xC0050112u.toInt()

public val E_ICARD_USERCANCELLED: Hresult = 0xC0050113u.toInt()

public val EMPTY_PIN_TYPE: SecretType = 3

public val ENCRYPTION_PIN: SecretPurpose = 2

public val EVERYONE_READ_ADMIN_WRITE_AC: CardFileAccessCondition = 3

public val EVERYONE_READ_USER_WRITE_AC: CardFileAccessCondition = 1

public val EXTERNAL_PIN_TYPE: SecretType = 1

public val HP_ALGID: UInt = 1u

public val HP_HASHSIZE: UInt = 4u

public val HP_HASHVAL: CryptSetHashParam = 2u

public val HP_HMAC_INFO: CryptSetHashParam = 5u

public val HP_TLS1PRF_LABEL: UInt = 6u

public val HP_TLS1PRF_SEED: UInt = 7u

public val IFX_RSA_KEYGEN_VUL_AFFECTED_LEVEL_1: UInt = 1u

public val IFX_RSA_KEYGEN_VUL_AFFECTED_LEVEL_2: UInt = 2u

public val IFX_RSA_KEYGEN_VUL_NOT_AFFECTED: UInt = 0u

public val INTERNATIONAL_USAGE: UInt = 1u

public val INVALID_AC: CardFileAccessCondition = 0

public val INVALID_DIR_AC: CardDirectoryAccessCondition = 0

public val KDF_ALGORITHMID: UInt = 8u

public val KDF_CONTEXT: UInt = 14u

public val KDF_GENERIC_PARAMETER: UInt = 17u

public val KDF_HASH_ALGORITHM: UInt = 0u

public val KDF_HKDF_INFO: UInt = 20u

public val KDF_HKDF_SALT: UInt = 19u

public val KDF_HMAC_KEY: UInt = 3u

public val KDF_ITERATION_COUNT: UInt = 16u

public val KDF_KEYBITLENGTH: UInt = 18u

public val KDF_LABEL: UInt = 13u

public val KDF_PARTYUINFO: UInt = 9u

public val KDF_PARTYVINFO: UInt = 10u

public val KDF_SALT: UInt = 15u

public val KDF_SECRET_APPEND: UInt = 2u

public val KDF_SECRET_HANDLE: UInt = 6u

public val KDF_SECRET_PREPEND: UInt = 1u

public val KDF_SUPPPRIVINFO: UInt = 12u

public val KDF_SUPPPUBINFO: UInt = 11u

public val KDF_TLS_PRF_LABEL: UInt = 4u

public val KDF_TLS_PRF_PROTOCOL: UInt = 7u

public val KDF_TLS_PRF_SEED: UInt = 5u

public val KDF_USE_SECRET_AS_HMAC_KEY_FLAG: UInt = 1u

public val KEYSTATEBLOB: UInt = 12u

public val KEY_LENGTH_MASK: UInt = 4294901760u

public val KP_ADMIN_PIN: UInt = 31u

public val KP_ALGID: CryptKeyParamId = 7u

public val KP_BLOCKLEN: CryptKeyParamId = 8u

public val KP_CERTIFICATE: CryptKeyParamId = 26u

public val KP_CLEAR_KEY: UInt = 27u

public val KP_CLIENT_RANDOM: UInt = 21u

public val KP_CMS_DH_KEY_INFO: UInt = 38u

public val KP_CMS_KEY_INFO: UInt = 37u

public val KP_EFFECTIVE_KEYLEN: UInt = 19u

public val KP_G: UInt = 12u

public val KP_GET_USE_COUNT: CryptKeyParamId = 42u

public val KP_HIGHEST_VERSION: UInt = 41u

public val KP_INFO: UInt = 18u

public val KP_IV: UInt = 1u

public val KP_KEYEXCHANGE_PIN: UInt = 32u

public val KP_KEYLEN: CryptKeyParamId = 9u

public val KP_KEYVAL: UInt = 30u

public val KP_MODE: UInt = 4u

public val KP_MODE_BITS: UInt = 5u

public val KP_OAEP_PARAMS: UInt = 36u

public val KP_P: UInt = 11u

public val KP_PADDING: UInt = 3u

public val KP_PERMISSIONS: CryptKeyParamId = 6u

public val KP_PIN_ID: UInt = 43u

public val KP_PIN_INFO: UInt = 44u

public val KP_PRECOMP_MD5: UInt = 24u

public val KP_PRECOMP_SHA: UInt = 25u

public val KP_PREHASH: UInt = 34u

public val KP_PUB_EX_LEN: UInt = 28u

public val KP_PUB_EX_VAL: UInt = 29u

public val KP_PUB_PARAMS: UInt = 39u

public val KP_Q: UInt = 13u

public val KP_RA: UInt = 16u

public val KP_RB: UInt = 17u

public val KP_ROUNDS: UInt = 35u

public val KP_RP: UInt = 23u

public val KP_SALT: CryptKeyParamId = 2u

public val KP_SALT_EX: CryptKeyParamId = 10u

public val KP_SCHANNEL_ALG: UInt = 20u

public val KP_SERVER_RANDOM: UInt = 22u

public val KP_SIGNATURE_PIN: UInt = 33u

public val KP_VERIFY_PARAMS: UInt = 40u

public val KP_X: UInt = 14u

public val KP_Y: UInt = 15u

public val KEY_TYPE_HARDWARE: CertKeyType = 6u

public val KEY_TYPE_OTHER: CertKeyType = 0u

public val KEY_TYPE_PASSPORT: CertKeyType = 3u

public val KEY_TYPE_PASSPORT_REMOTE: CertKeyType = 4u

public val KEY_TYPE_PASSPORT_SMART_CARD: CertKeyType = 5u

public val KEY_TYPE_PHYSICAL_SMART_CARD: CertKeyType = 2u

public val KEY_TYPE_SELF_SIGNED: CertKeyType = 8u

public val KEY_TYPE_SOFTWARE: CertKeyType = 7u

public val KEY_TYPE_VIRTUAL_SMART_CARD: CertKeyType = 1u

public val LEGACY_DH_PRIVATE_BLOB: Pcwstr = w("CAPIDHPRIVATEBLOB")

public val LEGACY_DH_PUBLIC_BLOB: Pcwstr = w("CAPIDHPUBLICBLOB")

public val LEGACY_DSA_PRIVATE_BLOB: Pcwstr = w("CAPIDSAPRIVATEBLOB")

public val LEGACY_DSA_PUBLIC_BLOB: Pcwstr = w("CAPIDSAPUBLICBLOB")

public val LEGACY_DSA_V2_PRIVATE_BLOB: Pcwstr = w("V2CAPIDSAPRIVATEBLOB")

public val LEGACY_DSA_V2_PUBLIC_BLOB: Pcwstr = w("V2CAPIDSAPUBLICBLOB")

public val LEGACY_RSAPRIVATE_BLOB: Pcwstr = w("CAPIPRIVATEBLOB")

public val LEGACY_RSAPUBLIC_BLOB: Pcwstr = w("CAPIPUBLICBLOB")

public val MAXUIDLEN: UInt = 64u

public val MAX_CONTAINER_NAME_LEN: UInt = 39u

public val MAX_PINS: UInt = 8u

public val MICROSOFT_ROOT_CERT_CHAIN_POLICY_CHECK_APPLICATION_ROOT_FLAG: CertChainPolicyFlags = 131072u

public val MICROSOFT_ROOT_CERT_CHAIN_POLICY_DISABLE_FLIGHT_ROOT_FLAG: CertChainPolicyFlags = 262144u

public val MICROSOFT_ROOT_CERT_CHAIN_POLICY_ENABLE_TEST_ROOT_FLAG: CertChainPolicyFlags = 65536u

public val MSCRYPT_ECC_MAX_CURVE_NAME_LENGTH: UInt = 255u

public val MSCRYPT_ECC_MAX_OID_LENGTH: UInt = 255u

public val MS_DEF_DH_SCHANNEL_PROV: Pcwstr = w("Microsoft DH SChannel Cryptographic Provider")

public val MS_DEF_DH_SCHANNEL_PROV_A: Pcstr = s("Microsoft DH SChannel Cryptographic Provider")

public val MS_DEF_DH_SCHANNEL_PROV_W: Pcwstr = w("Microsoft DH SChannel Cryptographic Provider")

public val MS_DEF_DSS_DH_PROV: Pcwstr = w("Microsoft Base DSS and Diffie-Hellman Cryptographic Provider")

public val MS_DEF_DSS_DH_PROV_A: Pcstr = s("Microsoft Base DSS and Diffie-Hellman Cryptographic Provider")

public val MS_DEF_DSS_DH_PROV_W: Pcwstr = w("Microsoft Base DSS and Diffie-Hellman Cryptographic Provider")

public val MS_DEF_DSS_PROV: Pcwstr = w("Microsoft Base DSS Cryptographic Provider")

public val MS_DEF_DSS_PROV_A: Pcstr = s("Microsoft Base DSS Cryptographic Provider")

public val MS_DEF_DSS_PROV_W: Pcwstr = w("Microsoft Base DSS Cryptographic Provider")

public val MS_DEF_PROV: Pcwstr = w("Microsoft Base Cryptographic Provider v1.0")

public val MS_DEF_PROV_A: Pcstr = s("Microsoft Base Cryptographic Provider v1.0")

public val MS_DEF_PROV_W: Pcwstr = w("Microsoft Base Cryptographic Provider v1.0")

public val MS_DEF_RSA_SCHANNEL_PROV: Pcwstr = w("Microsoft RSA SChannel Cryptographic Provider")

public val MS_DEF_RSA_SCHANNEL_PROV_A: Pcstr = s("Microsoft RSA SChannel Cryptographic Provider")

public val MS_DEF_RSA_SCHANNEL_PROV_W: Pcwstr = w("Microsoft RSA SChannel Cryptographic Provider")

public val MS_DEF_RSA_SIG_PROV: Pcwstr = w("Microsoft RSA Signature Cryptographic Provider")

public val MS_DEF_RSA_SIG_PROV_A: Pcstr = s("Microsoft RSA Signature Cryptographic Provider")

public val MS_DEF_RSA_SIG_PROV_W: Pcwstr = w("Microsoft RSA Signature Cryptographic Provider")

public val MS_ENHANCED_PROV: Pcwstr = w("Microsoft Enhanced Cryptographic Provider v1.0")

public val MS_ENHANCED_PROV_A: Pcstr = s("Microsoft Enhanced Cryptographic Provider v1.0")

public val MS_ENHANCED_PROV_W: Pcwstr = w("Microsoft Enhanced Cryptographic Provider v1.0")

public val MS_ENH_DSS_DH_PROV: Pcwstr = w("Microsoft Enhanced DSS and Diffie-Hellman Cryptographic Provider")

public val MS_ENH_DSS_DH_PROV_A: Pcstr = s("Microsoft Enhanced DSS and Diffie-Hellman Cryptographic Provider")

public val MS_ENH_DSS_DH_PROV_W: Pcwstr = w("Microsoft Enhanced DSS and Diffie-Hellman Cryptographic Provider")

public val MS_ENH_RSA_AES_PROV: Pcwstr = w("Microsoft Enhanced RSA and AES Cryptographic Provider")

public val MS_ENH_RSA_AES_PROV_A: Pcstr = s("Microsoft Enhanced RSA and AES Cryptographic Provider")

public val MS_ENH_RSA_AES_PROV_W: Pcwstr = w("Microsoft Enhanced RSA and AES Cryptographic Provider")

public val MS_ENH_RSA_AES_PROV_XP: Pcwstr = w("Microsoft Enhanced RSA and AES Cryptographic Provider (Prototype)")

public val MS_ENH_RSA_AES_PROV_XP_A: Pcstr = s("Microsoft Enhanced RSA and AES Cryptographic Provider (Prototype)")

public val MS_ENH_RSA_AES_PROV_XP_W: Pcwstr = w("Microsoft Enhanced RSA and AES Cryptographic Provider (Prototype)")

public val MS_KEY_PROTECTION_PROVIDER: Pcwstr = w("Microsoft Key Protection Provider")

public val MS_KEY_STORAGE_PROVIDER: Pcwstr = w("Microsoft Software Key Storage Provider")

public val MS_NGC_KEY_STORAGE_PROVIDER: Pcwstr = w("Microsoft Passport Key Storage Provider")

public val MS_PLATFORM_CRYPTO_PROVIDER: Pcwstr = w("Microsoft Platform Crypto Provider")

public val MS_PLATFORM_KEY_STORAGE_PROVIDER: Pcwstr = w("Microsoft Platform Crypto Provider")

public val MS_PRIMITIVE_PROVIDER: Pcwstr = w("Microsoft Primitive Provider")

public val MS_SCARD_PROV: Pcwstr = w("Microsoft Base Smart Card Crypto Provider")

public val MS_SCARD_PROV_A: Pcstr = s("Microsoft Base Smart Card Crypto Provider")

public val MS_SCARD_PROV_W: Pcwstr = w("Microsoft Base Smart Card Crypto Provider")

public val MS_SCHANNEL_PROVIDER: Pcwstr = w("Microsoft SSL Protocol Provider")

public val MS_SMART_CARD_KEY_STORAGE_PROVIDER: Pcwstr = w("Microsoft Smart Card Key Storage Provider")

public val MS_STRONG_PROV: Pcwstr = w("Microsoft Strong Cryptographic Provider")

public val MS_STRONG_PROV_A: Pcstr = s("Microsoft Strong Cryptographic Provider")

public val MS_STRONG_PROV_W: Pcwstr = w("Microsoft Strong Cryptographic Provider")

public val NCRYPTBUFFER_ATTESTATIONSTATEMENT_BLOB: UInt = 51u

public val NCRYPTBUFFER_ATTESTATION_CLAIM_CHALLENGE_REQUIRED: UInt = 53u

public val NCRYPTBUFFER_ATTESTATION_CLAIM_TYPE: UInt = 52u

public val NCRYPTBUFFER_CERT_BLOB: UInt = 47u

public val NCRYPTBUFFER_CLAIM_IDBINDING_NONCE: UInt = 48u

public val NCRYPTBUFFER_CLAIM_KEYATTESTATION_NONCE: UInt = 49u

public val NCRYPTBUFFER_DATA: UInt = 1u

public val NCRYPTBUFFER_ECC_CURVE_NAME: UInt = 60u

public val NCRYPTBUFFER_ECC_PARAMETERS: UInt = 61u

public val NCRYPTBUFFER_EMPTY: UInt = 0u

public val NCRYPTBUFFER_KEY_PROPERTY_FLAGS: UInt = 50u

public val NCRYPTBUFFER_PKCS_ALG_ID: UInt = 43u

public val NCRYPTBUFFER_PKCS_ALG_OID: UInt = 41u

public val NCRYPTBUFFER_PKCS_ALG_PARAM: UInt = 42u

public val NCRYPTBUFFER_PKCS_ATTRS: UInt = 44u

public val NCRYPTBUFFER_PKCS_KEY_NAME: UInt = 45u

public val NCRYPTBUFFER_PKCS_OID: UInt = 40u

public val NCRYPTBUFFER_PKCS_SECRET: UInt = 46u

public val NCRYPTBUFFER_PROTECTION_DESCRIPTOR_STRING: UInt = 3u

public val NCRYPTBUFFER_PROTECTION_FLAGS: UInt = 4u

public val NCRYPTBUFFER_SSL_CLEAR_KEY: UInt = 23u

public val NCRYPTBUFFER_SSL_CLIENT_RANDOM: UInt = 20u

public val NCRYPTBUFFER_SSL_HIGHEST_VERSION: UInt = 22u

public val NCRYPTBUFFER_SSL_KEY_ARG_DATA: UInt = 24u

public val NCRYPTBUFFER_SSL_SERVER_RANDOM: UInt = 21u

public val NCRYPTBUFFER_SSL_SESSION_HASH: UInt = 25u

public val NCRYPTBUFFER_TPM_PLATFORM_CLAIM_NONCE: UInt = 81u

public val NCRYPTBUFFER_TPM_PLATFORM_CLAIM_PCR_MASK: UInt = 80u

public val NCRYPTBUFFER_TPM_PLATFORM_CLAIM_STATIC_CREATE: UInt = 82u

public val NCRYPTBUFFER_TPM_SEAL_NO_DA_PROTECTION: UInt = 73u

public val NCRYPTBUFFER_TPM_SEAL_PASSWORD: UInt = 70u

public val NCRYPTBUFFER_TPM_SEAL_POLICYINFO: UInt = 71u

public val NCRYPTBUFFER_TPM_SEAL_TICKET: UInt = 72u

public val NCRYPTBUFFER_VERSION: UInt = 0u

public val NCRYPTBUFFER_VSM_KEY_ATTESTATION_CLAIM_RESTRICTIONS: UInt = 54u

public val NCRYPT_3DES_112_ALGORITHM: Pcwstr = w("3DES_112")

public val NCRYPT_3DES_ALGORITHM: Pcwstr = w("3DES")

public val NCRYPT_AES_ALGORITHM: Pcwstr = w("AES")

public val NCRYPT_AES_ALGORITHM_GROUP: Pcwstr = w("AES")

public val NCRYPT_ALGORITHM_GROUP_PROPERTY: Pcwstr = w("Algorithm Group")

public val NCRYPT_ALGORITHM_PROPERTY: Pcwstr = w("Algorithm Name")

public val NCRYPT_ALLOW_ALL_USAGES: UInt = 16777215u

public val NCRYPT_ALLOW_ARCHIVING_FLAG: UInt = 4u

public val NCRYPT_ALLOW_DECRYPT_FLAG: UInt = 1u

public val NCRYPT_ALLOW_EXPORT_FLAG: UInt = 1u

public val NCRYPT_ALLOW_KEY_AGREEMENT_FLAG: UInt = 4u

public val NCRYPT_ALLOW_KEY_IMPORT_FLAG: UInt = 8u

public val NCRYPT_ALLOW_PLAINTEXT_ARCHIVING_FLAG: UInt = 8u

public val NCRYPT_ALLOW_PLAINTEXT_EXPORT_FLAG: UInt = 2u

public val NCRYPT_ALLOW_SIGNING_FLAG: UInt = 2u

public val NCRYPT_ALLOW_SILENT_KEY_ACCESS: UInt = 1u

public val NCRYPT_ALTERNATE_KEY_STORAGE_LOCATION_PROPERTY: Pcwstr = w("PCP_ALTERNATE_KEY_STORAGE_LOCATION")

public val NCRYPT_ASSOCIATED_ECDH_KEY: Pcwstr = w("SmartCardAssociatedECDHKey")

public val NCRYPT_ASYMMETRIC_ENCRYPTION_INTERFACE: NcryptAlgorithmNameClass = 3u

public val NCRYPT_ASYMMETRIC_ENCRYPTION_OPERATION: NcryptOperation = 4u

public val NCRYPT_ATTESTATION_FLAG: UInt = 32u

public val NCRYPT_AUTHORITY_KEY_FLAG: UInt = 256u

public val NCRYPT_AUTH_TAG_LENGTH: Pcwstr = w("AuthTagLength")

public val NCRYPT_BLOCK_LENGTH_PROPERTY: Pcwstr = w("Block Length")

public val NCRYPT_CAPI_KDF_ALGORITHM: Pcwstr = w("CAPI_KDF")

public val NCRYPT_CERTIFICATE_PROPERTY: Pcwstr = w("SmartCardKeyCertificate")

public val NCRYPT_CHAINING_MODE_PROPERTY: Pcwstr = w("Chaining Mode")

public val NCRYPT_CHANGEPASSWORD_PROPERTY: Pcwstr = w("PCP_CHANGEPASSWORD")

public val NCRYPT_CIPHER_BLOCK_PADDING_FLAG: UInt = 1u

public val NCRYPT_CIPHER_KEY_BLOB: Pcwstr = w("CipherKeyBlob")

public val NCRYPT_CIPHER_KEY_BLOB_MAGIC: UInt = 1380470851u

public val NCRYPT_CIPHER_NO_PADDING_FLAG: UInt = 0u

public val NCRYPT_CIPHER_OPERATION: NcryptOperation = 1u

public val NCRYPT_CIPHER_OTHER_PADDING_FLAG: UInt = 2u

public val NCRYPT_CLAIM_AUTHORITY_AND_SUBJECT: UInt = 3u

public val NCRYPT_CLAIM_AUTHORITY_ONLY: UInt = 1u

public val NCRYPT_CLAIM_PLATFORM: UInt = 65536u

public val NCRYPT_CLAIM_SUBJECT_ONLY: UInt = 2u

public val NCRYPT_CLAIM_UNKNOWN: UInt = 4096u

public val NCRYPT_CLAIM_VSM_KEY_ATTESTATION_STATEMENT: UInt = 4u

public val NCRYPT_CLAIM_WEB_AUTH_SUBJECT_ONLY: UInt = 258u

public val NCRYPT_DESCR_DELIMITER_AND: Pcwstr = w("AND")

public val NCRYPT_DESCR_DELIMITER_OR: Pcwstr = w("OR")

public val NCRYPT_DESCR_EQUAL: Pcwstr = w("=")

public val NCRYPT_DESX_ALGORITHM: Pcwstr = w("DESX")

public val NCRYPT_DES_ALGORITHM: Pcwstr = w("DES")

public val NCRYPT_DES_ALGORITHM_GROUP: Pcwstr = w("DES")

public val NCRYPT_DH_ALGORITHM: Pcwstr = w("DH")

public val NCRYPT_DH_ALGORITHM_GROUP: Pcwstr = w("DH")

public val NCRYPT_DH_PARAMETERS_PROPERTY: Pcwstr = w("DHParameters")

public val NCRYPT_DISMISS_UI_TIMEOUT_SEC_PROPERTY: Pcwstr = w("SmartCardDismissUITimeoutSeconds")

public val NCRYPT_DO_NOT_FINALIZE_FLAG: UInt = 1024u

public val NCRYPT_DSA_ALGORITHM: Pcwstr = w("DSA")

public val NCRYPT_DSA_ALGORITHM_GROUP: Pcwstr = w("DSA")

public val NCRYPT_ECC_CURVE_NAME_LIST_PROPERTY: Pcwstr = w("ECCCurveNameList")

public val NCRYPT_ECC_CURVE_NAME_PROPERTY: Pcwstr = w("ECCCurveName")

public val NCRYPT_ECC_PARAMETERS_PROPERTY: Pcwstr = w("ECCParameters")

public val NCRYPT_ECDH_ALGORITHM: Pcwstr = w("ECDH")

public val NCRYPT_ECDH_ALGORITHM_GROUP: Pcwstr = w("ECDH")

public val NCRYPT_ECDH_P256_ALGORITHM: Pcwstr = w("ECDH_P256")

public val NCRYPT_ECDH_P384_ALGORITHM: Pcwstr = w("ECDH_P384")

public val NCRYPT_ECDH_P521_ALGORITHM: Pcwstr = w("ECDH_P521")

public val NCRYPT_ECDSA_ALGORITHM: Pcwstr = w("ECDSA")

public val NCRYPT_ECDSA_ALGORITHM_GROUP: Pcwstr = w("ECDSA")

public val NCRYPT_ECDSA_P256_ALGORITHM: Pcwstr = w("ECDSA_P256")

public val NCRYPT_ECDSA_P384_ALGORITHM: Pcwstr = w("ECDSA_P384")

public val NCRYPT_ECDSA_P521_ALGORITHM: Pcwstr = w("ECDSA_P521")

public val NCRYPT_EXPORTED_ISOLATED_KEY_HEADER_CURRENT_VERSION: UInt = 0u

public val NCRYPT_EXPORTED_ISOLATED_KEY_HEADER_V0: UInt = 0u

public val NCRYPT_EXPORT_LEGACY_FLAG: UInt = 2048u

public val NCRYPT_EXPORT_POLICY_PROPERTY: Pcwstr = w("Export Policy")

public val NCRYPT_EXTENDED_ERRORS_FLAG: UInt = 268435456u

public val NCRYPT_HASH_OPERATION: NcryptOperation = 2u

public val NCRYPT_HMAC_SHA256_ALGORITHM: Pcwstr = w("HMAC-SHA256")

public val NCRYPT_IGNORE_DEVICE_STATE_FLAG: UInt = 4096u

public val NCRYPT_IMPL_HARDWARE_FLAG: UInt = 1u

public val NCRYPT_IMPL_HARDWARE_RNG_FLAG: UInt = 16u

public val NCRYPT_IMPL_REMOVABLE_FLAG: UInt = 8u

public val NCRYPT_IMPL_SOFTWARE_FLAG: UInt = 2u

public val NCRYPT_IMPL_TYPE_PROPERTY: Pcwstr = w("Impl Type")

public val NCRYPT_IMPL_VIRTUAL_ISOLATION_FLAG: UInt = 32u

public val NCRYPT_INITIALIZATION_VECTOR: Pcwstr = w("IV")

public val NCRYPT_ISOLATED_KEY_ATTESTED_ATTRIBUTES_CURRENT_VERSION: UInt = 0u

public val NCRYPT_ISOLATED_KEY_ATTESTED_ATTRIBUTES_V0: UInt = 0u

public val NCRYPT_ISOLATED_KEY_ENVELOPE_BLOB: Pcwstr = w("ISOLATED_KEY_ENVELOPE")

public val NCRYPT_ISOLATED_KEY_FLAG_CREATED_IN_ISOLATION: UInt = 1u

public val NCRYPT_ISOLATED_KEY_FLAG_IMPORT_ONLY: UInt = 2u

public val NCRYPT_KDF_KEY_BLOB: Pcwstr = w("KDFKeyBlob")

public val NCRYPT_KDF_KEY_BLOB_MAGIC: UInt = 826688587u

public val NCRYPT_KDF_SECRET_VALUE: Pcwstr = w("KDFKeySecret")

public val NCRYPT_KEY_ACCESS_POLICY_PROPERTY: Pcwstr = w("Key Access Policy")

public val NCRYPT_KEY_ACCESS_POLICY_VERSION: UInt = 1u

public val NCRYPT_KEY_ATTEST_MAGIC: UInt = 1146110283u

public val NCRYPT_KEY_DERIVATION_GROUP: Pcwstr = w("KEY_DERIVATION")

public val NCRYPT_KEY_DERIVATION_INTERFACE: UInt = 7u

public val NCRYPT_KEY_DERIVATION_OPERATION: UInt = 64u

public val NCRYPT_KEY_PROTECTION_ALGORITHM_CERTIFICATE: Pcwstr = w("CERTIFICATE")

public val NCRYPT_KEY_PROTECTION_ALGORITHM_LOCAL: Pcwstr = w("LOCAL")

public val NCRYPT_KEY_PROTECTION_ALGORITHM_LOCKEDCREDENTIALS: Pcwstr = w("LOCKEDCREDENTIALS")

public val NCRYPT_KEY_PROTECTION_ALGORITHM_SDDL: Pcwstr = w("SDDL")

public val NCRYPT_KEY_PROTECTION_ALGORITHM_SID: Pcwstr = w("SID")

public val NCRYPT_KEY_PROTECTION_ALGORITHM_WEBCREDENTIALS: Pcwstr = w("WEBCREDENTIALS")

public val NCRYPT_KEY_PROTECTION_CERT_CERTBLOB: Pcwstr = w("CertBlob")

public val NCRYPT_KEY_PROTECTION_CERT_HASHID: Pcwstr = w("HashId")

public val NCRYPT_KEY_PROTECTION_INTERFACE: UInt = 65540u

public val NCRYPT_KEY_PROTECTION_LOCAL_LOGON: Pcwstr = w("logon")

public val NCRYPT_KEY_PROTECTION_LOCAL_MACHINE: Pcwstr = w("machine")

public val NCRYPT_KEY_PROTECTION_LOCAL_USER: Pcwstr = w("user")

public val NCRYPT_KEY_STORAGE_ALGORITHM: Pcwstr = w("KEY_STORAGE")

public val NCRYPT_KEY_STORAGE_INTERFACE: BcryptInterface = 65537u

public val NCRYPT_KEY_TYPE_PROPERTY: Pcwstr = w("Key Type")

public val NCRYPT_KEY_USAGE_PROPERTY: Pcwstr = w("Key Usage")

public val NCRYPT_LAST_MODIFIED_PROPERTY: Pcwstr = w("Modified")

public val NCRYPT_LENGTHS_PROPERTY: Pcwstr = w("Lengths")

public val NCRYPT_LENGTH_PROPERTY: Pcwstr = w("Length")

public val NCRYPT_MACHINE_KEY_FLAG: NcryptFlags = 32u

public val NCRYPT_MAX_ALG_ID_LENGTH: UInt = 512u

public val NCRYPT_MAX_KEY_NAME_LENGTH: UInt = 512u

public val NCRYPT_MAX_NAME_LENGTH_PROPERTY: Pcwstr = w("Max Name Length")

public val NCRYPT_MAX_PROPERTY_DATA: UInt = 1048576u

public val NCRYPT_MAX_PROPERTY_NAME: UInt = 64u

public val NCRYPT_MD2_ALGORITHM: Pcwstr = w("MD2")

public val NCRYPT_MD4_ALGORITHM: Pcwstr = w("MD4")

public val NCRYPT_MD5_ALGORITHM: Pcwstr = w("MD5")

public val NCRYPT_NAMED_DESCRIPTOR_FLAG: UInt = 1u

public val NCRYPT_NAME_PROPERTY: Pcwstr = w("Name")

public val NCRYPT_NO_CACHED_PASSWORD: UInt = 16384u

public val NCRYPT_NO_KEY_VALIDATION: NcryptFlags = 8u

public val NCRYPT_NO_PADDING_FLAG: NcryptFlags = 1u

public val NCRYPT_OPAQUETRANSPORT_BLOB: Pcwstr = w("OpaqueTransport")

public val NCRYPT_OVERWRITE_KEY_FLAG: NcryptFlags = 128u

public val NCRYPT_PAD_CIPHER_FLAG: UInt = 16u

public val NCRYPT_PAD_OAEP_FLAG: NcryptFlags = 4u

public val NCRYPT_PAD_PKCS1_FLAG: NcryptFlags = 2u

public val NCRYPT_PAD_PSS_FLAG: NcryptFlags = 8u

public val NCRYPT_PBKDF2_ALGORITHM: Pcwstr = w("PBKDF2")

public val NCRYPT_PCP_ALTERNATE_KEY_STORAGE_LOCATION_PROPERTY: Pcwstr = w("PCP_ALTERNATE_KEY_STORAGE_LOCATION")

public val NCRYPT_PCP_CHANGEPASSWORD_PROPERTY: Pcwstr = w("PCP_CHANGEPASSWORD")

public val NCRYPT_PCP_ECC_EKCERT_PROPERTY: Pcwstr = w("PCP_ECC_EKCERT")

public val NCRYPT_PCP_ECC_EKNVCERT_PROPERTY: Pcwstr = w("PCP_ECC_EKNVCERT")

public val NCRYPT_PCP_ECC_EKPUB_PROPERTY: Pcwstr = w("PCP_ECC_EKPUB")

public val NCRYPT_PCP_EKCERT_PROPERTY: Pcwstr = w("PCP_EKCERT")

public val NCRYPT_PCP_EKNVCERT_PROPERTY: Pcwstr = w("PCP_EKNVCERT")

public val NCRYPT_PCP_EKPUB_PROPERTY: Pcwstr = w("PCP_EKPUB")

public val NCRYPT_PCP_ENCRYPTION_KEY: UInt = 2u

public val NCRYPT_PCP_EXPORT_ALLOWED_PROPERTY: Pcwstr = w("PCP_EXPORT_ALLOWED")

public val NCRYPT_PCP_HMACVERIFICATION_KEY: UInt = 16u

public val NCRYPT_PCP_HMAC_AUTH_NONCE: Pcwstr = w("PCP_HMAC_AUTH_NONCE")

public val NCRYPT_PCP_HMAC_AUTH_POLICYINFO: Pcwstr = w("PCP_HMAC_AUTH_POLICYINFO")

public val NCRYPT_PCP_HMAC_AUTH_POLICYREF: Pcwstr = w("PCP_HMAC_AUTH_POLICYREF")

public val NCRYPT_PCP_HMAC_AUTH_SIGNATURE: Pcwstr = w("PCP_HMAC_AUTH_SIGNATURE")

public val NCRYPT_PCP_HMAC_AUTH_TICKET: Pcwstr = w("PCP_HMAC_AUTH_TICKET")

public val NCRYPT_PCP_IDENTITY_KEY: UInt = 8u

public val NCRYPT_PCP_INTERMEDIATE_CA_EKCERT_PROPERTY: Pcwstr = w("PCP_INTERMEDIATE_CA_EKCERT")

public val NCRYPT_PCP_KEYATTESTATION_PROPERTY: Pcwstr = w("PCP_TPM12_KEYATTESTATION")

public val NCRYPT_PCP_KEY_CREATIONHASH_PROPERTY: Pcwstr = w("PCP_KEY_CREATIONHASH")

public val NCRYPT_PCP_KEY_CREATIONTICKET_PROPERTY: Pcwstr = w("PCP_KEY_CREATIONTICKET")

public val NCRYPT_PCP_KEY_USAGE_POLICY_PROPERTY: Pcwstr = w("PCP_KEY_USAGE_POLICY")

public val NCRYPT_PCP_MIGRATIONPASSWORD_PROPERTY: Pcwstr = w("PCP_MIGRATIONPASSWORD")

public val NCRYPT_PCP_NO_DA_PROTECTION_PROPERTY: Pcwstr = w("PCP_NO_DA_PROTECTION")

public val NCRYPT_PCP_PASSWORD_REQUIRED_PROPERTY: Pcwstr = w("PCP_PASSWORD_REQUIRED")

public val NCRYPT_PCP_PCRTABLE_ALGORITHM_PROPERTY: Pcwstr = w("PCP_PCRTABLE_ALGORITHM")

public val NCRYPT_PCP_PCRTABLE_PROPERTY: Pcwstr = w("PCP_PCRTABLE")

public val NCRYPT_PCP_PLATFORMHANDLE_PROPERTY: Pcwstr = w("PCP_PLATFORMHANDLE")

public val NCRYPT_PCP_PLATFORM_BINDING_PCRALGID_PROPERTY: Pcwstr = w("PCP_PLATFORM_BINDING_PCRALGID")

public val NCRYPT_PCP_PLATFORM_BINDING_PCRDIGESTLIST_PROPERTY: Pcwstr = w("PCP_PLATFORM_BINDING_PCRDIGESTLIST")

public val NCRYPT_PCP_PLATFORM_BINDING_PCRDIGEST_PROPERTY: Pcwstr = w("PCP_PLATFORM_BINDING_PCRDIGEST")

public val NCRYPT_PCP_PLATFORM_BINDING_PCRMASK_PROPERTY: Pcwstr = w("PCP_PLATFORM_BINDING_PCRMASK")

public val NCRYPT_PCP_PLATFORM_TYPE_PROPERTY: Pcwstr = w("PCP_PLATFORM_TYPE")

public val NCRYPT_PCP_PROVIDERHANDLE_PROPERTY: Pcwstr = w("PCP_PROVIDERMHANDLE")

public val NCRYPT_PCP_PROVIDER_VERSION_PROPERTY: Pcwstr = w("PCP_PROVIDER_VERSION")

public val NCRYPT_PCP_PSS_SALT_SIZE_PROPERTY: Pcwstr = w("PSS Salt Size")

public val NCRYPT_PCP_RAW_POLICYDIGEST_PROPERTY: Pcwstr = w("PCP_RAW_POLICYDIGEST")

public val NCRYPT_PCP_RSA_EKCERT_PROPERTY: Pcwstr = w("PCP_RSA_EKCERT")

public val NCRYPT_PCP_RSA_EKNVCERT_PROPERTY: Pcwstr = w("PCP_RSA_EKNVCERT")

public val NCRYPT_PCP_RSA_EKPUB_PROPERTY: Pcwstr = w("PCP_RSA_EKPUB")

public val NCRYPT_PCP_RSA_SCHEME_HASH_ALG_PROPERTY: Pcwstr = w("PCP_RSA_SCHEME_HASH_ALG")

public val NCRYPT_PCP_RSA_SCHEME_PROPERTY: Pcwstr = w("PCP_RSA_SCHEME")

public val NCRYPT_PCP_SESSIONID_PROPERTY: Pcwstr = w("PCP_SESSIONID")

public val NCRYPT_PCP_SIGNATURE_KEY: UInt = 1u

public val NCRYPT_PCP_SRKPUB_PROPERTY: Pcwstr = w("PCP_SRKPUB")

public val NCRYPT_PCP_STORAGEPARENT_PROPERTY: Pcwstr = w("PCP_STORAGEPARENT")

public val NCRYPT_PCP_STORAGE_KEY: UInt = 4u

public val NCRYPT_PCP_SYMMETRIC_KEYBITS_PROPERTY: Pcwstr = w("PCP_SYMMETRIC_KEYBITS")

public val NCRYPT_PCP_TPM12_IDACTIVATION_PROPERTY: Pcwstr = w("PCP_TPM12_IDACTIVATION")

public val NCRYPT_PCP_TPM12_IDBINDING_DYNAMIC_PROPERTY: Pcwstr = w("PCP_TPM12_IDBINDING_DYNAMIC")

public val NCRYPT_PCP_TPM12_IDBINDING_PROPERTY: Pcwstr = w("PCP_TPM12_IDBINDING")

public val NCRYPT_PCP_TPM2BNAME_PROPERTY: Pcwstr = w("PCP_TPM2BNAME")

public val NCRYPT_PCP_TPM_FW_VERSION_PROPERTY: Pcwstr = w("PCP_TPM_FW_VERSION")

public val NCRYPT_PCP_TPM_IFX_RSA_KEYGEN_PROHIBITED_PROPERTY: Pcwstr = w("PCP_TPM_IFX_RSA_KEYGEN_PROHIBITED")

public val NCRYPT_PCP_TPM_IFX_RSA_KEYGEN_VULNERABILITY_PROPERTY: Pcwstr = w("PCP_TPM_IFX_RSA_KEYGEN_VULNERABILITY")

public val NCRYPT_PCP_TPM_MANUFACTURER_ID_PROPERTY: Pcwstr = w("PCP_TPM_MANUFACTURER_ID")

public val NCRYPT_PCP_TPM_VERSION_PROPERTY: Pcwstr = w("PCP_TPM_VERSION")

public val NCRYPT_PCP_USAGEAUTH_PROPERTY: Pcwstr = w("PCP_USAGEAUTH")

public val NCRYPT_PERSIST_FLAG: NcryptFlags = 2147483648u

public val NCRYPT_PERSIST_ONLY_FLAG: NcryptFlags = 1073741824u

public val NCRYPT_PIN_CACHE_APPLICATION_IMAGE_PROPERTY: Pcwstr = w("PinCacheApplicationImage")

public val NCRYPT_PIN_CACHE_APPLICATION_STATUS_PROPERTY: Pcwstr = w("PinCacheApplicationStatus")

public val NCRYPT_PIN_CACHE_APPLICATION_TICKET_BYTE_LENGTH: UInt = 90u

public val NCRYPT_PIN_CACHE_APPLICATION_TICKET_PROPERTY: Pcwstr = w("PinCacheApplicationTicket")

public val NCRYPT_PIN_CACHE_CLEAR_FOR_CALLING_PROCESS_OPTION: UInt = 1u

public val NCRYPT_PIN_CACHE_CLEAR_PROPERTY: Pcwstr = w("PinCacheClear")

public val NCRYPT_PIN_CACHE_DISABLE_DPL_FLAG: UInt = 1u

public val NCRYPT_PIN_CACHE_FLAGS_PROPERTY: Pcwstr = w("PinCacheFlags")

public val NCRYPT_PIN_CACHE_FREE_APPLICATION_TICKET_PROPERTY: Pcwstr = w("PinCacheFreeApplicationTicket")

public val NCRYPT_PIN_CACHE_IS_GESTURE_REQUIRED_PROPERTY: Pcwstr = w("PinCacheIsGestureRequired")

public val NCRYPT_PIN_CACHE_PIN_PROPERTY: Pcwstr = w("PinCachePin")

public val NCRYPT_PIN_CACHE_REQUIRE_GESTURE_FLAG: UInt = 1u

public val NCRYPT_PIN_PROMPT_PROPERTY: Pcwstr = w("SmartCardPinPrompt")

public val NCRYPT_PIN_PROPERTY: Pcwstr = w("SmartCardPin")

public val NCRYPT_PKCS7_ENVELOPE_BLOB: Pcwstr = w("PKCS7_ENVELOPE")

public val NCRYPT_PKCS8_PRIVATE_KEY_BLOB: Pcwstr = w("PKCS8_PRIVATEKEY")

public val NCRYPT_PLATFORM_ATTEST_MAGIC: UInt = 1146110288u

public val NCRYPT_PREFER_VIRTUAL_ISOLATION_FLAG: UInt = 65536u

public val NCRYPT_PROTECTED_KEY_BLOB: Pcwstr = w("ProtectedKeyBlob")

public val NCRYPT_PROTECTED_KEY_BLOB_MAGIC: UInt = 1263817296u

public val NCRYPT_PROTECTION_INFO_TYPE_DESCRIPTOR_STRING: UInt = 1u

public val NCRYPT_PROTECT_TO_LOCAL_SYSTEM: UInt = 32768u

public val NCRYPT_PROVIDER_HANDLE_PROPERTY: Pcwstr = w("Provider Handle")

public val NCRYPT_PUBLIC_LENGTH_PROPERTY: Pcwstr = w("PublicKeyLength")

public val NCRYPT_RC2_ALGORITHM: Pcwstr = w("RC2")

public val NCRYPT_RC2_ALGORITHM_GROUP: Pcwstr = w("RC2")

public val NCRYPT_READER_ICON_PROPERTY: Pcwstr = w("SmartCardReaderIcon")

public val NCRYPT_READER_PROPERTY: Pcwstr = w("SmartCardReader")

public val NCRYPT_REGISTER_NOTIFY_FLAG: NcryptFlags = 1u

public val NCRYPT_REQUIRE_KDS_LRPC_BIND_FLAG: UInt = 536870912u

public val NCRYPT_ROOT_CERTSTORE_PROPERTY: Pcwstr = w("SmartcardRootCertStore")

public val NCRYPT_RSA_ALGORITHM: Pcwstr = w("RSA")

public val NCRYPT_RSA_ALGORITHM_GROUP: Pcwstr = w("RSA")

public val NCRYPT_RSA_SIGN_ALGORITHM: Pcwstr = w("RSA_SIGN")

public val NCRYPT_SCARD_NGC_KEY_NAME: Pcwstr = w("SmartCardNgcKeyName")

public val NCRYPT_SCARD_PIN_ID: Pcwstr = w("SmartCardPinId")

public val NCRYPT_SCARD_PIN_INFO: Pcwstr = w("SmartCardPinInfo")

public val NCRYPT_SCHANNEL_INTERFACE: BcryptInterface = 65538u

public val NCRYPT_SCHANNEL_SIGNATURE_INTERFACE: BcryptInterface = 65539u

public val NCRYPT_SEALING_FLAG: UInt = 256u

public val NCRYPT_SECRET_AGREEMENT_INTERFACE: NcryptAlgorithmNameClass = 4u

public val NCRYPT_SECRET_AGREEMENT_OPERATION: NcryptOperation = 8u

public val NCRYPT_SECURE_PIN_PROPERTY: Pcwstr = w("SmartCardSecurePin")

public val NCRYPT_SECURITY_DESCR_PROPERTY: Pcwstr = w("Security Descr")

public val NCRYPT_SECURITY_DESCR_SUPPORT_PROPERTY: Pcwstr = w("Security Descr Support")

public val NCRYPT_SHA1_ALGORITHM: Pcwstr = w("SHA1")

public val NCRYPT_SHA256_ALGORITHM: Pcwstr = w("SHA256")

public val NCRYPT_SHA384_ALGORITHM: Pcwstr = w("SHA384")

public val NCRYPT_SHA512_ALGORITHM: Pcwstr = w("SHA512")

public val NCRYPT_SIGNATURE_INTERFACE: NcryptAlgorithmNameClass = 5u

public val NCRYPT_SIGNATURE_LENGTH_PROPERTY: Pcwstr = w("SignatureLength")

public val NCRYPT_SIGNATURE_OPERATION: NcryptOperation = 16u

public val NCRYPT_SILENT_FLAG: NcryptFlags = 64u

public val NCRYPT_SMARTCARD_GUID_PROPERTY: Pcwstr = w("SmartCardGuid")

public val NCRYPT_SP800108_CTR_HMAC_ALGORITHM: Pcwstr = w("SP800_108_CTR_HMAC")

public val NCRYPT_SP80056A_CONCAT_ALGORITHM: Pcwstr = w("SP800_56A_CONCAT")

public val NCRYPT_SSL_CIPHER_LENGTHS_BLOCK_PADDING: UInt = 1u

public val NCRYPT_SSL_CIPHER_SUITE_EX_VERSION: UInt = 1u

public val NCRYPT_SSL_CLIENT_FLAG: UInt = 1u

public val NCRYPT_SSL_EAP_FAST_ID: UInt = 3u

public val NCRYPT_SSL_EAP_ID: UInt = 0u

public val NCRYPT_SSL_EAP_PRF_FIELD: UInt = 255u

public val NCRYPT_SSL_EAP_TTLSV0_CHLNG_ID: UInt = 2u

public val NCRYPT_SSL_EAP_TTLSV0_ID: UInt = 1u

public val NCRYPT_SSL_EXTERNAL_PSK_FLAG: UInt = 1u

public val NCRYPT_SSL_MAX_NAME_SIZE: UInt = 64u

public val NCRYPT_SSL_RESUMPTION_PSK_FLAG: UInt = 2u

public val NCRYPT_SSL_SERVER_FLAG: UInt = 2u

public val NCRYPT_SSL_SIGN_INCLUDE_HASHOID: UInt = 1u

public val NCRYPT_SSL_SIGN_USE_PSS_PADDING: UInt = 2u

public val NCRYPT_TPM12_PROVIDER: UInt = 65536u

public val NCRYPT_TPM_LOADABLE_KEY_BLOB: Pcwstr = w("PcpTpmProtectedKeyBlob")

public val NCRYPT_TPM_LOADABLE_KEY_BLOB_MAGIC: UInt = 1297371211u

public val NCRYPT_TPM_PAD_PSS_IGNORE_SALT: UInt = 32u

public val NCRYPT_TPM_PLATFORM_ATTESTATION_STATEMENT_CURRENT_VERSION: UInt = 0u

public val NCRYPT_TPM_PLATFORM_ATTESTATION_STATEMENT_V0: UInt = 0u

public val NCRYPT_TPM_PSS_SALT_SIZE_HASHSIZE: UInt = 2u

public val NCRYPT_TPM_PSS_SALT_SIZE_MAXIMUM: UInt = 1u

public val NCRYPT_TPM_PSS_SALT_SIZE_UNKNOWN: UInt = 0u

public val NCRYPT_TREAT_NIST_AS_GENERIC_ECC_FLAG: UInt = 8192u

public val NCRYPT_UI_APPCONTAINER_ACCESS_MEDIUM_FLAG: UInt = 8u

public val NCRYPT_UI_FINGERPRINT_PROTECTION_FLAG: UInt = 4u

public val NCRYPT_UI_FORCE_HIGH_PROTECTION_FLAG: UInt = 2u

public val NCRYPT_UI_POLICY_PROPERTY: Pcwstr = w("UI Policy")

public val NCRYPT_UI_PROTECT_KEY_FLAG: UInt = 1u

public val NCRYPT_UNIQUE_NAME_PROPERTY: Pcwstr = w("Unique Name")

public val NCRYPT_UNPROTECT_NO_DECRYPT: NcryptFlags = 1u

public val NCRYPT_UNREGISTER_NOTIFY_FLAG: NcryptFlags = 2u

public val NCRYPT_USER_CERTSTORE_PROPERTY: Pcwstr = w("SmartCardUserCertStore")

public val NCRYPT_USE_CONTEXT_PROPERTY: Pcwstr = w("Use Context")

public val NCRYPT_USE_COUNT_ENABLED_PROPERTY: Pcwstr = w("Enabled Use Count")

public val NCRYPT_USE_COUNT_PROPERTY: Pcwstr = w("Use Count")

public val NCRYPT_USE_PER_BOOT_KEY_FLAG: UInt = 262144u

public val NCRYPT_USE_PER_BOOT_KEY_PROPERTY: Pcwstr = w("Per Boot Key")

public val NCRYPT_USE_VIRTUAL_ISOLATION_FLAG: UInt = 131072u

public val NCRYPT_USE_VIRTUAL_ISOLATION_PROPERTY: Pcwstr = w("Virtual Iso")

public val NCRYPT_VERSION_PROPERTY: Pcwstr = w("Version")

public val NCRYPT_VSM_KEY_ATTESTATION_CLAIM_RESTRICTIONS_CURRENT_VERSION: UInt = 0u

public val NCRYPT_VSM_KEY_ATTESTATION_CLAIM_RESTRICTIONS_V0: UInt = 0u

public val NCRYPT_VSM_KEY_ATTESTATION_STATEMENT_CURRENT_VERSION: UInt = 0u

public val NCRYPT_VSM_KEY_ATTESTATION_STATEMENT_V0: UInt = 0u

public val NCRYPT_WINDOW_HANDLE_PROPERTY: Pcwstr = w("HWND Handle")

public val NCRYPT_WRITE_KEY_TO_LEGACY_STORE_FLAG: NcryptFlags = 512u

public val NETSCAPE_SIGN_CA_CERT_TYPE: UInt = 1u

public val NETSCAPE_SIGN_CERT_TYPE: UInt = 16u

public val NETSCAPE_SMIME_CA_CERT_TYPE: UInt = 2u

public val NETSCAPE_SMIME_CERT_TYPE: UInt = 32u

public val NETSCAPE_SSL_CA_CERT_TYPE: UInt = 4u

public val NETSCAPE_SSL_CLIENT_AUTH_CERT_TYPE: UInt = 128u

public val NETSCAPE_SSL_SERVER_AUTH_CERT_TYPE: UInt = 64u

public val NON_REPUDIATION_PIN: SecretPurpose = 3

public val OCSP_BASIC_BY_KEY_RESPONDER_ID: UInt = 2u

public val OCSP_BASIC_BY_NAME_RESPONDER_ID: UInt = 1u

public val OCSP_BASIC_GOOD_CERT_STATUS: UInt = 0u

public val OCSP_BASIC_RESPONSE: Pcstr = COpaquePointer(69.toLong())

public val OCSP_BASIC_RESPONSE_V1: UInt = 0u

public val OCSP_BASIC_REVOKED_CERT_STATUS: UInt = 1u

public val OCSP_BASIC_SIGNED_RESPONSE: Pcstr = COpaquePointer(68.toLong())

public val OCSP_BASIC_UNKNOWN_CERT_STATUS: UInt = 2u

public val OCSP_INTERNAL_ERROR_RESPONSE: UInt = 2u

public val OCSP_MALFORMED_REQUEST_RESPONSE: UInt = 1u

public val OCSP_REQUEST: Pcstr = COpaquePointer(66.toLong())

public val OCSP_REQUEST_V1: UInt = 0u

public val OCSP_RESPONSE: Pcstr = COpaquePointer(67.toLong())

public val OCSP_SIGNED_REQUEST: Pcstr = COpaquePointer(65.toLong())

public val OCSP_SIG_REQUIRED_RESPONSE: UInt = 5u

public val OCSP_SUCCESSFUL_RESPONSE: UInt = 0u

public val OCSP_TRY_LATER_RESPONSE: UInt = 3u

public val OCSP_UNAUTHORIZED_RESPONSE: UInt = 6u

public val OPAQUEKEYBLOB: UInt = 9u

public val PIN_CACHE_POLICY_CURRENT_VERSION: UInt = 6u

public val PIN_CHANGE_FLAG_CHANGEPIN: UInt = 2u

public val PIN_CHANGE_FLAG_UNBLOCK: UInt = 1u

public val PIN_INFO_CURRENT_VERSION: UInt = 6u

public val PIN_INFO_REQUIRE_SECURE_ENTRY: UInt = 1u

public val PIN_SET_ALL_ROLES: UInt = 255u

public val PIN_SET_NONE: UInt = 0u

public val PKCS12_ALLOW_OVERWRITE_KEY: CryptKeyFlags = 16384u

public val PKCS12_ALWAYS_CNG_KSP: CryptKeyFlags = 512u

public val PKCS12_CONFIG_REGPATH: Pcwstr = w("Software\\Microsoft\\Windows\\CurrentVersion\\PFX")

public val PKCS12_DISABLE_ENCRYPT_CERTIFICATES: UInt = 256u

public val PKCS12_ENCRYPT_CERTIFICATES: UInt = 512u

public val PKCS12_ENCRYPT_CERTIFICATES_VALUE_NAME: Pcwstr = w("EncryptCertificates")

public val PKCS12_EXPORT_ECC_CURVE_OID: UInt = 8192u

public val PKCS12_EXPORT_ECC_CURVE_PARAMETERS: UInt = 4096u

public val PKCS12_EXPORT_PBES2_PARAMS: UInt = 128u

public val PKCS12_EXPORT_RESERVED_MASK: UInt = 4294901760u

public val PKCS12_EXPORT_SILENT: UInt = 64u

public val PKCS12_IMPORT_RESERVED_MASK: UInt = 4294901760u

public val PKCS12_IMPORT_SILENT: UInt = 64u

public val PKCS12_INCLUDE_EXTENDED_PROPERTIES: CryptKeyFlags = 16u

public val PKCS12_NO_PERSIST_KEY: CryptKeyFlags = 32768u

public val PKCS12_ONLY_CERTIFICATES: UInt = 1024u

public val PKCS12_ONLY_CERTIFICATES_CONTAINER_NAME: Pcwstr = w("PfxContainer")

public val PKCS12_ONLY_CERTIFICATES_PROVIDER_NAME: Pcwstr = w("PfxProvider")

public val PKCS12_ONLY_CERTIFICATES_PROVIDER_TYPE: UInt = 0u

public val PKCS12_ONLY_NOT_ENCRYPTED_CERTIFICATES: UInt = 2048u

public val PKCS12_PBES2_ALG_AES256_SHA256: Pcwstr = w("AES256-SHA256")

public val PKCS12_PBKDF2_ID_HMAC_SHA1: Pcstr = s("1.2.840.113549.2.7")

public val PKCS12_PBKDF2_ID_HMAC_SHA256: Pcstr = s("1.2.840.113549.2.9")

public val PKCS12_PBKDF2_ID_HMAC_SHA384: Pcstr = s("1.2.840.113549.2.10")

public val PKCS12_PBKDF2_ID_HMAC_SHA512: Pcstr = s("1.2.840.113549.2.11")

public val PKCS12_PREFER_CNG_KSP: CryptKeyFlags = 256u

public val PKCS12_PROTECT_TO_DOMAIN_SIDS: UInt = 32u

public val PKCS12_VIRTUAL_ISOLATION_KEY: UInt = 65536u

public val PKCS5_PADDING: UInt = 1u

public val PKCS7_SIGNER_INFO: Pcstr = COpaquePointer(500.toLong())

public val PKCS_7_ASN_ENCODING: CertQueryEncodingType = 65536u

public val PKCS_7_NDR_ENCODING: UInt = 131072u

public val PKCS_ATTRIBUTE: Pcstr = COpaquePointer(22.toLong())

public val PKCS_ATTRIBUTES: Pcstr = COpaquePointer(48.toLong())

public val PKCS_CONTENT_INFO: Pcstr = COpaquePointer(33.toLong())

public val PKCS_CONTENT_INFO_SEQUENCE_OF_ANY: Pcstr = COpaquePointer(23.toLong())

public val PKCS_CTL: Pcstr = COpaquePointer(37.toLong())

public val PKCS_ENCRYPTED_PRIVATE_KEY_INFO: Pcstr = COpaquePointer(45.toLong())

public val PKCS_PRIVATE_KEY_INFO: Pcstr = COpaquePointer(44.toLong())

public val PKCS_RC2_CBC_PARAMETERS: Pcstr = COpaquePointer(41.toLong())

public val PKCS_RSAES_OAEP_PARAMETERS: Pcstr = COpaquePointer(76.toLong())

public val PKCS_RSA_PRIVATE_KEY: Pcstr = COpaquePointer(43.toLong())

public val PKCS_RSA_SSA_PSS_PARAMETERS: Pcstr = COpaquePointer(75.toLong())

public val PKCS_RSA_SSA_PSS_TRAILER_FIELD_BC: UInt = 1u

public val PKCS_SMIME_CAPABILITIES: Pcstr = COpaquePointer(42.toLong())

public val PKCS_SORTED_CTL: Pcstr = COpaquePointer(49.toLong())

public val PKCS_TIME_REQUEST: Pcstr = COpaquePointer(18.toLong())

public val PKCS_UTC_TIME: Pcstr = COpaquePointer(17.toLong())

public val PLAINTEXTKEYBLOB: UInt = 8u

public val PP_ADMIN_PIN: UInt = 31u

public val PP_APPLI_CERT: UInt = 18u

public val PP_CERTCHAIN: UInt = 9u

public val PP_CHANGE_PASSWORD: UInt = 7u

public val PP_CLIENT_HWND: CryptSetProvParamId = 1u

public val PP_CONTAINER: UInt = 6u

public val PP_CONTEXT_INFO: UInt = 11u

public val PP_CRYPT_COUNT_KEY_USE: UInt = 41u

public val PP_DELETEKEY: CryptSetProvParamId = 24u

public val PP_DISMISS_PIN_UI_SEC: UInt = 49u

public val PP_ENUMALGS: UInt = 1u

public val PP_ENUMALGS_EX: UInt = 22u

public val PP_ENUMCONTAINERS: UInt = 2u

public val PP_ENUMELECTROOTS: UInt = 26u

public val PP_ENUMEX_SIGNING_PROT: UInt = 40u

public val PP_ENUMMANDROOTS: UInt = 25u

public val PP_IMPTYPE: UInt = 3u

public val PP_IS_PFX_EPHEMERAL: UInt = 50u

public val PP_KEYEXCHANGE_ALG: CryptSetProvParamId = 14u

public val PP_KEYEXCHANGE_KEYSIZE: CryptSetProvParamId = 12u

public val PP_KEYEXCHANGE_PIN: CryptSetProvParamId = 32u

public val PP_KEYSET_SEC_DESCR: CryptSetProvParamId = 8u

public val PP_KEYSET_TYPE: UInt = 27u

public val PP_KEYSPEC: UInt = 39u

public val PP_KEYSTORAGE: UInt = 17u

public val PP_KEYX_KEYSIZE_INC: UInt = 35u

public val PP_KEY_TYPE_SUBTYPE: UInt = 10u

public val PP_NAME: UInt = 4u

public val PP_PIN_PROMPT_STRING: CryptSetProvParamId = 44u

public val PP_PROVTYPE: UInt = 16u

public val PP_ROOT_CERTSTORE: CryptSetProvParamId = 46u

public val PP_SECURE_KEYEXCHANGE_PIN: CryptSetProvParamId = 47u

public val PP_SECURE_SIGNATURE_PIN: CryptSetProvParamId = 48u

public val PP_SESSION_KEYSIZE: UInt = 20u

public val PP_SGC_INFO: UInt = 37u

public val PP_SIGNATURE_ALG: CryptSetProvParamId = 15u

public val PP_SIGNATURE_KEYSIZE: CryptSetProvParamId = 13u

public val PP_SIGNATURE_PIN: CryptSetProvParamId = 33u

public val PP_SIG_KEYSIZE_INC: UInt = 34u

public val PP_SMARTCARD_GUID: UInt = 45u

public val PP_SMARTCARD_READER: CryptSetProvParamId = 43u

public val PP_SMARTCARD_READER_ICON: UInt = 47u

public val PP_SYM_KEYSIZE: UInt = 19u

public val PP_UI_PROMPT: CryptSetProvParamId = 21u

public val PP_UNIQUE_CONTAINER: UInt = 36u

public val PP_USER_CERTSTORE: CryptSetProvParamId = 42u

public val PP_USE_HARDWARE_RNG: CryptSetProvParamId = 38u

public val PP_VERSION: UInt = 5u

public val PRIVATEKEYBLOB: UInt = 7u

public val PROV_DH_SCHANNEL: UInt = 18u

public val PROV_DSS: UInt = 3u

public val PROV_DSS_DH: UInt = 13u

public val PROV_EC_ECDSA_FULL: UInt = 16u

public val PROV_EC_ECDSA_SIG: UInt = 14u

public val PROV_EC_ECNRA_FULL: UInt = 17u

public val PROV_EC_ECNRA_SIG: UInt = 15u

public val PROV_FORTEZZA: UInt = 4u

public val PROV_INTEL_SEC: UInt = 22u

public val PROV_MS_EXCHANGE: UInt = 5u

public val PROV_REPLACE_OWF: UInt = 23u

public val PROV_RNG: UInt = 21u

public val PROV_RSA_AES: UInt = 24u

public val PROV_RSA_FULL: UInt = 1u

public val PROV_RSA_SCHANNEL: UInt = 12u

public val PROV_RSA_SIG: UInt = 2u

public val PROV_SPYRUS_LYNKS: UInt = 20u

public val PROV_SSL: UInt = 6u

public val PROV_STT_ACQ: UInt = 8u

public val PROV_STT_BRND: UInt = 9u

public val PROV_STT_ISS: UInt = 11u

public val PROV_STT_MER: UInt = 7u

public val PROV_STT_ROOT: UInt = 10u

public val PUBLICKEYBLOB: UInt = 6u

public val PUBLICKEYBLOBEX: UInt = 10u

public val PVK_TYPE_FILE_NAME: SignerPrivateKeyChoice = 1u

public val PVK_TYPE_KEYCONTAINER: SignerPrivateKeyChoice = 2u

public val PIN_CACHE_ALWAYS_PROMPT: PinCachePolicyType = 3

public val PIN_CACHE_NONE: PinCachePolicyType = 2

public val PIN_CACHE_NORMAL: PinCachePolicyType = 0

public val PIN_CACHE_TIMED: PinCachePolicyType = 1

public val PRIMARY_CARD_PIN: SecretPurpose = 5

public val RANDOM_PADDING: UInt = 2u

public val RECIPIENTPOLICYV1: UInt = 1u

public val RECIPIENTPOLICYV2: UInt = 2u

public val REPORT_NOT_ABLE_TO_EXPORT_PRIVATE_KEY: UInt = 2u

public val REPORT_NO_PRIVATE_KEY: UInt = 1u

public val REVOCATION_OID_CRL_REVOCATION: Pcstr = COpaquePointer(1.toLong())

public val ROLE_ADMIN: UInt = 2u

public val ROLE_EVERYONE: UInt = 0u

public val ROLE_PIN_ALWAYS: UInt = 3u

public val ROLE_PUK: UInt = 4u

public val ROLE_USER: UInt = 1u

public val RSA1024BIT_KEY: UInt = 67108864u

public val RSA_CSP_PUBLICKEYBLOB: Pcstr = COpaquePointer(19.toLong())

public val SCARD_PROVIDER_CARD_MODULE: UInt = 2147483649u

public val SCHANNEL_ENC_KEY: UInt = 1u

public val SCHANNEL_MAC_KEY: UInt = 0u

public val SCHEME_OID_RETRIEVE_ENCODED_OBJECTW_FUNC: Pcstr = s("SchemeDllRetrieveEncodedObjectW")

public val SCHEME_OID_RETRIEVE_ENCODED_OBJECT_FUNC: Pcstr = s("SchemeDllRetrieveEncodedObject")

public val SIGNATURE_RESOURCE_NUMBER: UInt = 666u

public val SIGNER_AUTHCODE_ATTR: SignerSignatureAttributeChoice = 1u

public val SIGNER_CERT_POLICY_CHAIN: SignerCertPolicy = 2u

public val SIGNER_CERT_POLICY_CHAIN_NO_ROOT: SignerCertPolicy = 8u

public val SIGNER_CERT_POLICY_SPC: SignerCertPolicy = 4u

public val SIGNER_CERT_POLICY_STORE: SignerCertPolicy = 1u

public val SIGNER_CERT_SPC_CHAIN: SignerCertChoice = 3u

public val SIGNER_CERT_SPC_FILE: SignerCertChoice = 1u

public val SIGNER_CERT_STORE: SignerCertChoice = 2u

public val SIGNER_NO_ATTR: SignerSignatureAttributeChoice = 0u

public val SIGNER_SUBJECT_BLOB: SignerSubjectChoice = 2u

public val SIGNER_SUBJECT_FILE: SignerSubjectChoice = 1u

public val SIGNER_TIMESTAMP_AUTHENTICODE: SignerTimestampFlags = 1u

public val SIGNER_TIMESTAMP_RFC3161: SignerTimestampFlags = 2u

public val SIG_APPEND: SignerSignFlags = 4096u

public val SIMPLEBLOB: UInt = 1u

public val SITE_PIN_RULES_ALL_SUBDOMAINS_FLAG: UInt = 1u

public val SORTED_CTL_EXT_HASHED_SUBJECT_IDENTIFIER_FLAG: UInt = 1u

public val SPC_DIGEST_GENERATE_FLAG: SignerSignFlags = 512u

public val SPC_DIGEST_SIGN_EX_FLAG: SignerSignFlags = 16384u

public val SPC_DIGEST_SIGN_FLAG: SignerSignFlags = 1024u

public val SPC_EXC_PE_PAGE_HASHES_FLAG: SignerSignFlags = 16u

public val SPC_INC_PE_DEBUG_INFO_FLAG: SignerSignFlags = 64u

public val SPC_INC_PE_IMPORT_ADDR_TABLE_FLAG: SignerSignFlags = 32u

public val SPC_INC_PE_PAGE_HASHES_FLAG: SignerSignFlags = 256u

public val SPC_INC_PE_RESOURCES_FLAG: SignerSignFlags = 128u

public val SSL2_PROTOCOL_VERSION: UInt = 2u

public val SSL3_PROTOCOL_VERSION: UInt = 768u

public val SSL_CK_DES_192_EDE3_CBC_WITH_MD5: UInt = 458944u

public val SSL_CK_DES_64_CBC_WITH_MD5: UInt = 393280u

public val SSL_CK_IDEA_128_CBC_WITH_MD5: UInt = 327808u

public val SSL_CK_RC2_128_CBC_EXPORT40_WITH_MD5: UInt = 262272u

public val SSL_CK_RC2_128_CBC_WITH_MD5: UInt = 196736u

public val SSL_CK_RC4_128_EXPORT40_WITH_MD5: UInt = 131200u

public val SSL_CK_RC4_128_WITH_MD5: UInt = 65664u

public val SSL_ECCPUBLIC_BLOB: Pcwstr = w("SSLECCPUBLICBLOB")

public val SSL_ECDSA_ALGORITHM: Pcwstr = w("ECDSA")

public val SSL_F12_ERROR_TEXT_LENGTH: UInt = 256u

public val SSL_HPKP_HEADER_COUNT: UInt = 2u

public val SSL_HPKP_PKP_HEADER_INDEX: UInt = 0u

public val SSL_HPKP_PKP_RO_HEADER_INDEX: UInt = 1u

public val SSL_KEY_PIN_ERROR_TEXT_LENGTH: UInt = 512u

public val SSL_KEY_TYPE_PROPERTY: Pcwstr = w("KEYTYPE")

public val SSL_OBJECT_LOCATOR_CERT_VALIDATION_CONFIG_FUNC: Pcstr = s("SslObjectLocatorInitializeCertValidationConfig")

public val SSL_OBJECT_LOCATOR_ISSUER_LIST_FUNC: Pcstr = s("SslObjectLocatorInitializeIssuerList")

public val SSL_OBJECT_LOCATOR_PFX_FUNC: Pcstr = s("SslObjectLocatorInitializePfx")

public val SYMMETRICWRAPKEYBLOB: UInt = 11u

public val TIMESTAMP_DONT_HASH_DATA: UInt = 1u

public val TIMESTAMP_FAILURE_BAD_ALG: UInt = 0u

public val TIMESTAMP_FAILURE_BAD_FORMAT: UInt = 5u

public val TIMESTAMP_FAILURE_BAD_REQUEST: UInt = 2u

public val TIMESTAMP_FAILURE_EXTENSION_NOT_SUPPORTED: UInt = 16u

public val TIMESTAMP_FAILURE_INFO_NOT_AVAILABLE: UInt = 17u

public val TIMESTAMP_FAILURE_POLICY_NOT_SUPPORTED: UInt = 15u

public val TIMESTAMP_FAILURE_SYSTEM_FAILURE: UInt = 25u

public val TIMESTAMP_FAILURE_TIME_NOT_AVAILABLE: UInt = 14u

public val TIMESTAMP_INFO: Pcstr = COpaquePointer(80.toLong())

public val TIMESTAMP_NO_AUTH_RETRIEVAL: UInt = 131072u

public val TIMESTAMP_REQUEST: Pcstr = COpaquePointer(78.toLong())

public val TIMESTAMP_RESPONSE: Pcstr = COpaquePointer(79.toLong())

public val TIMESTAMP_STATUS_GRANTED: CryptTimestampResponseStatus = 0u

public val TIMESTAMP_STATUS_GRANTED_WITH_MODS: CryptTimestampResponseStatus = 1u

public val TIMESTAMP_STATUS_REJECTED: CryptTimestampResponseStatus = 2u

public val TIMESTAMP_STATUS_REVOCATION_WARNING: CryptTimestampResponseStatus = 4u

public val TIMESTAMP_STATUS_REVOKED: CryptTimestampResponseStatus = 5u

public val TIMESTAMP_STATUS_WAITING: CryptTimestampResponseStatus = 3u

public val TIMESTAMP_VERIFY_CONTEXT_SIGNATURE: UInt = 32u

public val TIMESTAMP_VERSION: CryptTimestampVersion = 1u

public val TIME_VALID_OID_FLUSH_CRL: Pcstr = COpaquePointer(2.toLong())

public val TIME_VALID_OID_FLUSH_CRL_FROM_CERT: Pcstr = COpaquePointer(3.toLong())

public val TIME_VALID_OID_FLUSH_CTL: Pcstr = COpaquePointer(1.toLong())

public val TIME_VALID_OID_FLUSH_FRESHEST_CRL_FROM_CERT: Pcstr = COpaquePointer(4.toLong())

public val TIME_VALID_OID_FLUSH_FRESHEST_CRL_FROM_CRL: Pcstr = COpaquePointer(5.toLong())

public val TIME_VALID_OID_FLUSH_OBJECT_FUNC: Pcstr = s("TimeValidDllFlushObject")

public val TIME_VALID_OID_GET_CRL: Pcstr = COpaquePointer(2.toLong())

public val TIME_VALID_OID_GET_CRL_FROM_CERT: Pcstr = COpaquePointer(3.toLong())

public val TIME_VALID_OID_GET_CTL: Pcstr = COpaquePointer(1.toLong())

public val TIME_VALID_OID_GET_FRESHEST_CRL_FROM_CERT: Pcstr = COpaquePointer(4.toLong())

public val TIME_VALID_OID_GET_FRESHEST_CRL_FROM_CRL: Pcstr = COpaquePointer(5.toLong())

public val TIME_VALID_OID_GET_OBJECT_FUNC: Pcstr = s("TimeValidDllGetObject")

public val TLS1_0_PROTOCOL_VERSION: UInt = 769u

public val TLS1_1_PROTOCOL_VERSION: UInt = 770u

public val TLS1_2_PROTOCOL_VERSION: UInt = 771u

public val TLS1_3_PROTOCOL_VERSION: UInt = 772u

public val TLS1_PROTOCOL_VERSION: UInt = 769u

public val TLS_AES_128_GCM_SHA256: UInt = 4865u

public val TLS_AES_256_GCM_SHA384: UInt = 4866u

public val TLS_DHE_DSS_EXPORT1024_WITH_DES_CBC_SHA: UInt = 99u

public val TLS_DHE_DSS_WITH_3DES_EDE_CBC_SHA: UInt = 19u

public val TLS_DHE_DSS_WITH_AES_128_CBC_SHA: UInt = 50u

public val TLS_DHE_DSS_WITH_AES_128_CBC_SHA256: UInt = 64u

public val TLS_DHE_DSS_WITH_AES_256_CBC_SHA: UInt = 56u

public val TLS_DHE_DSS_WITH_AES_256_CBC_SHA256: UInt = 106u

public val TLS_DHE_DSS_WITH_DES_CBC_SHA: UInt = 18u

public val TLS_DHE_RSA_WITH_3DES_EDE_CBC_SHA: UInt = 22u

public val TLS_DHE_RSA_WITH_AES_128_CBC_SHA: UInt = 51u

public val TLS_DHE_RSA_WITH_AES_128_GCM_SHA256: UInt = 158u

public val TLS_DHE_RSA_WITH_AES_256_CBC_SHA: UInt = 57u
