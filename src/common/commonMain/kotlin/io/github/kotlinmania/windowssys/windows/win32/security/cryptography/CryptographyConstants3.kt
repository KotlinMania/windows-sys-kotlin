package io.github.kotlinmania.windowssys.windows.win32.security.cryptography

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.U128
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.s
import io.github.kotlinmania.windowssys.core.w

public val TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256: UInt = 49195u

public val TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA: UInt = 49162u

public val TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384: UInt = 49188u

public val TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384: UInt = 49196u

public val TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA: UInt = 49171u

public val TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256: UInt = 49191u

public val TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256: UInt = 49199u

public val TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA: UInt = 49172u

public val TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384: UInt = 49192u

public val TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384: UInt = 49200u

public val TLS_PSK_EXCHANGE: Pcwstr = w("PSK")

public val TLS_PSK_WITH_AES_128_CBC_SHA256: UInt = 174u

public val TLS_PSK_WITH_AES_128_GCM_SHA256: UInt = 168u

public val TLS_PSK_WITH_AES_256_CBC_SHA384: UInt = 175u

public val TLS_PSK_WITH_AES_256_GCM_SHA384: UInt = 169u

public val TLS_PSK_WITH_NULL_SHA256: UInt = 176u

public val TLS_PSK_WITH_NULL_SHA384: UInt = 177u

public val TLS_RSA_EXPORT1024_WITH_DES_CBC_SHA: UInt = 98u

public val TLS_RSA_EXPORT1024_WITH_RC4_56_SHA: UInt = 100u

public val TLS_RSA_EXPORT_WITH_RC4_40_MD5: UInt = 3u

public val TLS_RSA_PSK_EXCHANGE: Pcwstr = w("RSA_PSK")

public val TLS_RSA_WITH_3DES_EDE_CBC_SHA: UInt = 10u

public val TLS_RSA_WITH_AES_128_CBC_SHA: UInt = 47u

public val TLS_RSA_WITH_AES_128_CBC_SHA256: UInt = 60u

public val TLS_RSA_WITH_AES_128_GCM_SHA256: UInt = 156u

public val TLS_RSA_WITH_AES_256_CBC_SHA: UInt = 53u

public val TLS_RSA_WITH_AES_256_CBC_SHA256: UInt = 61u

public val TLS_RSA_WITH_AES_256_GCM_SHA384: UInt = 157u

public val TLS_RSA_WITH_DES_CBC_SHA: UInt = 9u

public val TLS_RSA_WITH_NULL_MD5: UInt = 1u

public val TLS_RSA_WITH_NULL_SHA: UInt = 2u

public val TLS_RSA_WITH_NULL_SHA256: UInt = 59u

public val TLS_RSA_WITH_RC4_128_MD5: UInt = 4u

public val TLS_RSA_WITH_RC4_128_SHA: UInt = 5u

public val TPM_RSA_SRK_SEAL_KEY: Pcwstr = w("MICROSOFT_PCP_KSP_RSA_SEAL_KEY_3BD1C4BF-004E-4E2F-8A4D-0BF633DCB074")

public val URL_OID_CERTIFICATE_CRL_DIST_POINT: Pcstr = COpaquePointer(2.toLong())

public val URL_OID_CERTIFICATE_CRL_DIST_POINT_AND_OCSP: Pcstr = COpaquePointer(11.toLong())

public val URL_OID_CERTIFICATE_FRESHEST_CRL: Pcstr = COpaquePointer(6.toLong())

public val URL_OID_CERTIFICATE_ISSUER: Pcstr = COpaquePointer(1.toLong())

public val URL_OID_CERTIFICATE_OCSP: Pcstr = COpaquePointer(9.toLong())

public val URL_OID_CERTIFICATE_OCSP_AND_CRL_DIST_POINT: Pcstr = COpaquePointer(10.toLong())

public val URL_OID_CERTIFICATE_ONLY_OCSP: Pcstr = COpaquePointer(13.toLong())

public val URL_OID_CRL_FRESHEST_CRL: Pcstr = COpaquePointer(7.toLong())

public val URL_OID_CRL_ISSUER: Pcstr = COpaquePointer(5.toLong())

public val URL_OID_CROSS_CERT_DIST_POINT: Pcstr = COpaquePointer(8.toLong())

public val URL_OID_CROSS_CERT_SUBJECT_INFO_ACCESS: Pcstr = COpaquePointer(12.toLong())

public val URL_OID_CTL_ISSUER: Pcstr = COpaquePointer(3.toLong())

public val URL_OID_CTL_NEXT_UPDATE: Pcstr = COpaquePointer(4.toLong())

public val URL_OID_GET_OBJECT_URL_FUNC: Pcstr = s("UrlDllGetObjectUrl")

public val USAGE_MATCH_TYPE_AND: UInt = 0u

public val USAGE_MATCH_TYPE_OR: UInt = 1u

public val UNBLOCK_ONLY_PIN: SecretPurpose = 6

public val UNKNOWN_AC: CardFileAccessCondition = 4

public val USER_CREATE_DELETE_DIR_AC: CardDirectoryAccessCondition = 1

public val USER_READ_WRITE_AC: CardFileAccessCondition = 5

public val USER_WRITE_EXECUTE_AC: CardFileAccessCondition = 2

public val X509_ALGORITHM_IDENTIFIER: Pcstr = COpaquePointer(74.toLong())

public val X509_ALTERNATE_NAME: Pcstr = COpaquePointer(12.toLong())

public val X509_ANY_STRING: Int = 6

public val X509_ASN_ENCODING: CertQueryEncodingType = 1u

public val X509_AUTHORITY_INFO_ACCESS: Pcstr = COpaquePointer(32.toLong())

public val X509_AUTHORITY_KEY_ID: Pcstr = COpaquePointer(9.toLong())

public val X509_AUTHORITY_KEY_ID2: Pcstr = COpaquePointer(31.toLong())

public val X509_BASIC_CONSTRAINTS: Pcstr = COpaquePointer(13.toLong())

public val X509_BASIC_CONSTRAINTS2: Pcstr = COpaquePointer(15.toLong())

public val X509_BIOMETRIC_EXT: Pcstr = COpaquePointer(71.toLong())

public val X509_BITS: Pcstr = COpaquePointer(26.toLong())

public val X509_BITS_WITHOUT_TRAILING_ZEROES: Pcstr = COpaquePointer(51.toLong())

public val X509_CERT: Pcstr = COpaquePointer(1.toLong())

public val X509_CERTIFICATE_TEMPLATE: Pcstr = COpaquePointer(64.toLong())

public val X509_CERT_BUNDLE: Pcstr = COpaquePointer(81.toLong())

public val X509_CERT_CRL_TO_BE_SIGNED: Pcstr = COpaquePointer(3.toLong())

public val X509_CERT_PAIR: Pcstr = COpaquePointer(53.toLong())

public val X509_CERT_POLICIES: Pcstr = COpaquePointer(16.toLong())

public val X509_CERT_REQUEST_TO_BE_SIGNED: Pcstr = COpaquePointer(4.toLong())

public val X509_CERT_TO_BE_SIGNED: Pcstr = COpaquePointer(2.toLong())

public val X509_CHOICE_OF_TIME: Pcstr = COpaquePointer(30.toLong())

public val X509_CRL_DIST_POINTS: Pcstr = COpaquePointer(35.toLong())

public val X509_CRL_REASON_CODE: Int = 29

public val X509_CROSS_CERT_DIST_POINTS: Pcstr = COpaquePointer(58.toLong())

public val X509_DH_PARAMETERS: Pcstr = COpaquePointer(47.toLong())

public val X509_DH_PUBLICKEY: Int = 38

public val X509_DSS_PARAMETERS: Pcstr = COpaquePointer(39.toLong())

public val X509_DSS_PUBLICKEY: Int = 38

public val X509_DSS_SIGNATURE: Pcstr = COpaquePointer(40.toLong())

public val X509_ECC_PARAMETERS: Pcstr = COpaquePointer(85.toLong())

public val X509_ECC_PRIVATE_KEY: Pcstr = COpaquePointer(82.toLong())

public val X509_ECC_SIGNATURE: Pcstr = COpaquePointer(47.toLong())

public val X509_ENHANCED_KEY_USAGE: Pcstr = COpaquePointer(36.toLong())

public val X509_ENUMERATED: Pcstr = COpaquePointer(29.toLong())

public val X509_EXTENSIONS: Pcstr = COpaquePointer(5.toLong())

public val X509_INTEGER: Pcstr = COpaquePointer(27.toLong())

public val X509_ISSUING_DIST_POINT: Pcstr = COpaquePointer(54.toLong())

public val X509_KEYGEN_REQUEST_TO_BE_SIGNED: Pcstr = COpaquePointer(21.toLong())

public val X509_KEY_ATTRIBUTES: Pcstr = COpaquePointer(10.toLong())

public val X509_KEY_USAGE: Pcstr = COpaquePointer(14.toLong())

public val X509_KEY_USAGE_RESTRICTION: Pcstr = COpaquePointer(11.toLong())

public val X509_LOGOTYPE_EXT: Pcstr = COpaquePointer(70.toLong())

public val X509_MULTI_BYTE_INTEGER: Pcstr = COpaquePointer(28.toLong())

public val X509_MULTI_BYTE_UINT: Pcstr = COpaquePointer(38.toLong())

public val X509_NAME: Pcstr = COpaquePointer(7.toLong())

public val X509_NAME_CONSTRAINTS: Pcstr = COpaquePointer(55.toLong())

public val X509_NAME_VALUE: Pcstr = COpaquePointer(6.toLong())

public val X509_NDR_ENCODING: UInt = 2u

public val X509_OBJECT_IDENTIFIER: Pcstr = COpaquePointer(73.toLong())

public val X509_OCTET_STRING: Pcstr = COpaquePointer(25.toLong())

public val X509_PKIX_POLICY_QUALIFIER_USERNOTICE: Pcstr = COpaquePointer(46.toLong())

public val X509_POLICY_CONSTRAINTS: Pcstr = COpaquePointer(57.toLong())

public val X509_POLICY_MAPPINGS: Pcstr = COpaquePointer(56.toLong())

public val X509_PUBLIC_KEY_INFO: Pcstr = COpaquePointer(8.toLong())

public val X509_QC_STATEMENTS_EXT: Pcstr = COpaquePointer(42.toLong())

public val X509_SEQUENCE_OF_ANY: Pcstr = COpaquePointer(34.toLong())

public val X509_SUBJECT_DIR_ATTRS: Pcstr = COpaquePointer(84.toLong())

public val X509_SUBJECT_INFO_ACCESS: Int = 32

public val X509_UNICODE_ANY_STRING: Int = 24

public val X509_UNICODE_NAME: Pcstr = COpaquePointer(20.toLong())

public val X509_UNICODE_NAME_VALUE: Pcstr = COpaquePointer(24.toLong())

public val X942_DH_PARAMETERS: Pcstr = COpaquePointer(50.toLong())

public val X942_OTHER_INFO: Pcstr = COpaquePointer(52.toLong())

public val ZERO_PADDING: UInt = 3u

public val C_PRIV_KEY_CACHE_MAX_ITEMS_DEFAULT: UInt = 20u

public val C_PRIV_KEY_CACHE_PURGE_INTERVAL_SECONDS_DEFAULT: UInt = 86400u

public val DW_FORCE_KEY_PROTECTION_DISABLED: UInt = 0u

public val DW_FORCE_KEY_PROTECTION_HIGH: UInt = 2u

public val DW_FORCE_KEY_PROTECTION_USER_SELECT: UInt = 1u

public val SZ_BASE_CSP_DIR: Pcstr = s("mscp")

public val SZ_CACHE_FILE: Pcstr = s("cardcf")

public val SZ_CARD_IDENTIFIER_FILE: Pcstr = s("cardid")

public val SZ_CONTAINER_MAP_FILE: Pcstr = s("cmapfile")

public val SZ_FORCE_KEY_PROTECTION: Pcstr = s("ForceKeyProtection")

public val SZ_INTERMEDIATE_CERTS_DIR: Pcstr = s("mscerts")

public val SZ_KEY_CACHE_ENABLED: Pcstr = s("CachePrivateKeys")

public val SZ_KEY_CACHE_SECONDS: Pcstr = s("PrivateKeyLifetimeSeconds")

public val SZ_KEY_CRYPTOAPI_PRIVATE_KEY_OPTIONS: Pcstr = s("Software\\Policies\\Microsoft\\Cryptography")

public val SZ_OID_VERISIGN_FAIL_INFO: Pcstr = s("2.16.840.1.113733.1.9.4")

public val SZ_OID_VERISIGN_MESSAGE_TYPE: Pcstr = s("2.16.840.1.113733.1.9.2")

public val SZ_OID_VERISIGN_PKI_STATUS: Pcstr = s("2.16.840.1.113733.1.9.3")

public val SZ_OID_VERISIGN_RECIPIENT_NONCE: Pcstr = s("2.16.840.1.113733.1.9.6")

public val SZ_OID_VERISIGN_SENDER_NONCE: Pcstr = s("2.16.840.1.113733.1.9.5")

public val SZ_OID_VERISIGN_TRANSACTION_ID: Pcstr = s("2.16.840.1.113733.1.9.7")

public val SZ_OID_ANSI_X942: Pcstr = s("1.2.840.10046")

public val SZ_OID_ANSI_X942_DH: Pcstr = s("1.2.840.10046.2.1")

public val SZ_OID_ANY_APPLICATION_POLICY: Pcstr = s("1.3.6.1.4.1.311.10.12.1")

public val SZ_OID_ANY_CERT_POLICY: Pcstr = s("2.5.29.32.0")

public val SZ_OID_ANY_ENHANCED_KEY_USAGE: Pcstr = s("2.5.29.37.0")

public val SZ_OID_APPLICATION_CERT_POLICIES: Pcstr = s("1.3.6.1.4.1.311.21.10")

public val SZ_OID_APPLICATION_POLICY_CONSTRAINTS: Pcstr = s("1.3.6.1.4.1.311.21.12")

public val SZ_OID_APPLICATION_POLICY_MAPPINGS: Pcstr = s("1.3.6.1.4.1.311.21.11")

public val SZ_OID_ARCHIVED_KEY_ATTR: Pcstr = s("1.3.6.1.4.1.311.21.13")

public val SZ_OID_ARCHIVED_KEY_CERT_HASH: Pcstr = s("1.3.6.1.4.1.311.21.16")

public val SZ_OID_ATTEST_WHQL_CRYPTO: Pcstr = s("1.3.6.1.4.1.311.10.3.5.1")

public val SZ_OID_ATTR_PLATFORM_SPECIFICATION: Pcstr = s("2.23.133.2.17")

public val SZ_OID_ATTR_SUPPORTED_ALGORITHMS: Pcstr = s("2.5.4.52")

public val SZ_OID_ATTR_TPM_SECURITY_ASSERTIONS: Pcstr = s("2.23.133.2.18")

public val SZ_OID_ATTR_TPM_SPECIFICATION: Pcstr = s("2.23.133.2.16")

public val SZ_OID_AUTHORITY_INFO_ACCESS: Pcstr = s("1.3.6.1.5.5.7.1.1")

public val SZ_OID_AUTHORITY_KEY_IDENTIFIER: Pcstr = s("2.5.29.1")

public val SZ_OID_AUTHORITY_KEY_IDENTIFIER2: Pcstr = s("2.5.29.35")

public val SZ_OID_AUTHORITY_REVOCATION_LIST: Pcstr = s("2.5.4.38")

public val SZ_OID_AUTO_ENROLL_CTL_USAGE: Pcstr = s("1.3.6.1.4.1.311.20.1")

public val SZ_OID_BACKGROUND_OTHER_LOGOTYPE: Pcstr = s("1.3.6.1.5.5.7.20.2")

public val SZ_OID_BASIC_CONSTRAINTS: Pcstr = s("2.5.29.10")

public val SZ_OID_BASIC_CONSTRAINTS2: Pcstr = s("2.5.29.19")

public val SZ_OID_BIOMETRIC_EXT: Pcstr = s("1.3.6.1.5.5.7.1.2")

public val SZ_OID_BIOMETRIC_SIGNING: Pcstr = s("1.3.6.1.4.1.311.10.3.41")

public val SZ_OID_BUSINESS_CATEGORY: Pcstr = s("2.5.4.15")

public val SZ_OID_CA_CERTIFICATE: Pcstr = s("2.5.4.37")

public val SZ_OID_CERTIFICATE_REVOCATION_LIST: Pcstr = s("2.5.4.39")

public val SZ_OID_CERTIFICATE_TEMPLATE: Pcstr = s("1.3.6.1.4.1.311.21.7")

public val SZ_OID_CERTSRV_CA_VERSION: Pcstr = s("1.3.6.1.4.1.311.21.1")

public val SZ_OID_CERTSRV_CROSSCA_VERSION: Pcstr = s("1.3.6.1.4.1.311.21.22")

public val SZ_OID_CERTSRV_PREVIOUS_CERT_HASH: Pcstr = s("1.3.6.1.4.1.311.21.2")

public val SZ_OID_CERT_DISALLOWED_CA_FILETIME_PROP_ID: Pcstr = s("1.3.6.1.4.1.311.10.11.128")

public val SZ_OID_CERT_DISALLOWED_FILETIME_PROP_ID: Pcstr = s("1.3.6.1.4.1.311.10.11.104")

public val SZ_OID_CERT_EXTENSIONS: Pcstr = s("1.3.6.1.4.1.311.2.1.14")

public val SZ_OID_CERT_ISSUER_SERIAL_NUMBER_MD5_HASH_PROP_ID: Pcstr = s("1.3.6.1.4.1.311.10.11.28")

public val SZ_OID_CERT_KEY_IDENTIFIER_PROP_ID: Pcstr = s("1.3.6.1.4.1.311.10.11.20")

public val SZ_OID_CERT_MANIFOLD: Pcstr = s("1.3.6.1.4.1.311.20.3")

public val SZ_OID_CERT_MD5_HASH_PROP_ID: Pcstr = s("1.3.6.1.4.1.311.10.11.4")

public val SZ_OID_CERT_POLICIES: Pcstr = s("2.5.29.32")

public val SZ_OID_CERT_POLICIES_95: Pcstr = s("2.5.29.3")

public val SZ_OID_CERT_POLICIES_95_QUALIFIER1: Pcstr = s("2.16.840.1.113733.1.7.1.1")

public val SZ_OID_CERT_PROP_ID_PREFIX: Pcstr = s("1.3.6.1.4.1.311.10.11.")

public val SZ_OID_CERT_SIGNATURE_HASH_PROP_ID: Pcstr = s("1.3.6.1.4.1.311.10.11.15")

public val SZ_OID_CERT_STRONG_KEY_OS_1: Pcstr = s("1.3.6.1.4.1.311.72.2.1")

public val SZ_OID_CERT_STRONG_KEY_OS_CURRENT: Pcwstr = w("1.3.6.1.4.1.311.72.2.1")

public val SZ_OID_CERT_STRONG_KEY_OS_PREFIX: Pcstr = s("1.3.6.1.4.1.311.72.2.")

public val SZ_OID_CERT_STRONG_SIGN_OS_1: Pcstr = s("1.3.6.1.4.1.311.72.1.1")

public val SZ_OID_CERT_STRONG_SIGN_OS_CURRENT: Pcwstr = w("1.3.6.1.4.1.311.72.1.1")

public val SZ_OID_CERT_STRONG_SIGN_OS_PREFIX: Pcstr = s("1.3.6.1.4.1.311.72.1.")

public val SZ_OID_CERT_SUBJECT_NAME_MD5_HASH_PROP_ID: Pcstr = s("1.3.6.1.4.1.311.10.11.29")

public val SZ_OID_CMC: Pcstr = s("1.3.6.1.5.5.7.7")

public val SZ_OID_CMC_ADD_ATTRIBUTES: Pcstr = s("1.3.6.1.4.1.311.10.10.1")

public val SZ_OID_CMC_ADD_EXTENSIONS: Pcstr = s("1.3.6.1.5.5.7.7.8")

public val SZ_OID_CMC_DATA_RETURN: Pcstr = s("1.3.6.1.5.5.7.7.4")

public val SZ_OID_CMC_DECRYPTED_POP: Pcstr = s("1.3.6.1.5.5.7.7.10")

public val SZ_OID_CMC_ENCRYPTED_POP: Pcstr = s("1.3.6.1.5.5.7.7.9")

public val SZ_OID_CMC_GET_CERT: Pcstr = s("1.3.6.1.5.5.7.7.15")

public val SZ_OID_CMC_GET_CRL: Pcstr = s("1.3.6.1.5.5.7.7.16")

public val SZ_OID_CMC_IDENTIFICATION: Pcstr = s("1.3.6.1.5.5.7.7.2")

public val SZ_OID_CMC_IDENTITY_PROOF: Pcstr = s("1.3.6.1.5.5.7.7.3")

public val SZ_OID_CMC_ID_CONFIRM_CERT_ACCEPTANCE: Pcstr = s("1.3.6.1.5.5.7.7.24")

public val SZ_OID_CMC_ID_POP_LINK_RANDOM: Pcstr = s("1.3.6.1.5.5.7.7.22")

public val SZ_OID_CMC_ID_POP_LINK_WITNESS: Pcstr = s("1.3.6.1.5.5.7.7.23")

public val SZ_OID_CMC_LRA_POP_WITNESS: Pcstr = s("1.3.6.1.5.5.7.7.11")

public val SZ_OID_CMC_QUERY_PENDING: Pcstr = s("1.3.6.1.5.5.7.7.21")

public val SZ_OID_CMC_RECIPIENT_NONCE: Pcstr = s("1.3.6.1.5.5.7.7.7")

public val SZ_OID_CMC_REG_INFO: Pcstr = s("1.3.6.1.5.5.7.7.18")

public val SZ_OID_CMC_RESPONSE_INFO: Pcstr = s("1.3.6.1.5.5.7.7.19")

public val SZ_OID_CMC_REVOKE_REQUEST: Pcstr = s("1.3.6.1.5.5.7.7.17")

public val SZ_OID_CMC_SENDER_NONCE: Pcstr = s("1.3.6.1.5.5.7.7.6")

public val SZ_OID_CMC_STATUS_INFO: Pcstr = s("1.3.6.1.5.5.7.7.1")

public val SZ_OID_CMC_TRANSACTION_ID: Pcstr = s("1.3.6.1.5.5.7.7.5")

public val SZ_OID_CN_ECDSA_SHA256: Pcstr = s("1.2.156.11235.1.1.1")

public val SZ_OID_COMMON_NAME: Pcstr = s("2.5.4.3")

public val SZ_OID_COUNTRY_NAME: Pcstr = s("2.5.4.6")

public val SZ_OID_CRL_DIST_POINTS: Pcstr = s("2.5.29.31")

public val SZ_OID_CRL_NEXT_PUBLISH: Pcstr = s("1.3.6.1.4.1.311.21.4")

public val SZ_OID_CRL_NUMBER: Pcstr = s("2.5.29.20")

public val SZ_OID_CRL_REASON_CODE: Pcstr = s("2.5.29.21")

public val SZ_OID_CRL_SELF_CDP: Pcstr = s("1.3.6.1.4.1.311.21.14")

public val SZ_OID_CRL_VIRTUAL_BASE: Pcstr = s("1.3.6.1.4.1.311.21.3")

public val SZ_OID_CROSS_CERTIFICATE_PAIR: Pcstr = s("2.5.4.40")

public val SZ_OID_CROSS_CERT_DIST_POINTS: Pcstr = s("1.3.6.1.4.1.311.10.9.1")

public val SZ_OID_CTL: Pcstr = s("1.3.6.1.4.1.311.10.1")

public val SZ_OID_CT_CERT_SCTLIST: Pcstr = s("1.3.6.1.4.1.11129.2.4.2")

public val SZ_OID_CT_PKI_DATA: Pcstr = s("1.3.6.1.5.5.7.12.2")

public val SZ_OID_CT_PKI_RESPONSE: Pcstr = s("1.3.6.1.5.5.7.12.3")

public val SZ_OID_DELTA_CRL_INDICATOR: Pcstr = s("2.5.29.27")

public val SZ_OID_DESCRIPTION: Pcstr = s("2.5.4.13")

public val SZ_OID_DESTINATION_INDICATOR: Pcstr = s("2.5.4.27")

public val SZ_OID_DEVICE_SERIAL_NUMBER: Pcstr = s("2.5.4.5")

public val SZ_OID_DH_SINGLE_PASS_STDDH_SHA1_KDF: Pcstr = s("1.3.133.16.840.63.0.2")

public val SZ_OID_DH_SINGLE_PASS_STDDH_SHA256_KDF: Pcstr = s("1.3.132.1.11.1")

public val SZ_OID_DH_SINGLE_PASS_STDDH_SHA384_KDF: Pcstr = s("1.3.132.1.11.2")

public val SZ_OID_DISALLOWED_HASH: Pcwstr = w("1.3.6.1.4.1.311.10.11.15")

public val SZ_OID_DISALLOWED_LIST: Pcstr = s("1.3.6.1.4.1.311.10.3.30")

public val SZ_OID_DN_QUALIFIER: Pcstr = s("2.5.4.46")

public val SZ_OID_DOMAIN_COMPONENT: Pcstr = s("0.9.2342.19200300.100.1.25")

public val SZ_OID_DRM: Pcstr = s("1.3.6.1.4.1.311.10.5.1")

public val SZ_OID_DRM_INDIVIDUALIZATION: Pcstr = s("1.3.6.1.4.1.311.10.5.2")

public val SZ_OID_DS: Pcstr = s("2.5")

public val SZ_OID_DSALG: Pcstr = s("2.5.8")

public val SZ_OID_DSALG_CRPT: Pcstr = s("2.5.8.1")

public val SZ_OID_DSALG_HASH: Pcstr = s("2.5.8.2")

public val SZ_OID_DSALG_RSA: Pcstr = s("2.5.8.1.1")

public val SZ_OID_DSALG_SIGN: Pcstr = s("2.5.8.3")

public val SZ_OID_DS_EMAIL_REPLICATION: Pcstr = s("1.3.6.1.4.1.311.21.19")

public val SZ_OID_DYNAMIC_CODE_GEN_SIGNER: Pcstr = s("1.3.6.1.4.1.311.76.5.1")

public val SZ_OID_ECC_CURVE_BRAINPOOLP160R1: Pcstr = s("1.3.36.3.3.2.8.1.1.1")

public val SZ_OID_ECC_CURVE_BRAINPOOLP160T1: Pcstr = s("1.3.36.3.3.2.8.1.1.2")

public val SZ_OID_ECC_CURVE_BRAINPOOLP192R1: Pcstr = s("1.3.36.3.3.2.8.1.1.3")

public val SZ_OID_ECC_CURVE_BRAINPOOLP192T1: Pcstr = s("1.3.36.3.3.2.8.1.1.4")

public val SZ_OID_ECC_CURVE_BRAINPOOLP224R1: Pcstr = s("1.3.36.3.3.2.8.1.1.5")

public val SZ_OID_ECC_CURVE_BRAINPOOLP224T1: Pcstr = s("1.3.36.3.3.2.8.1.1.6")

public val SZ_OID_ECC_CURVE_BRAINPOOLP256R1: Pcstr = s("1.3.36.3.3.2.8.1.1.7")

public val SZ_OID_ECC_CURVE_BRAINPOOLP256T1: Pcstr = s("1.3.36.3.3.2.8.1.1.8")

public val SZ_OID_ECC_CURVE_BRAINPOOLP320R1: Pcstr = s("1.3.36.3.3.2.8.1.1.9")

public val SZ_OID_ECC_CURVE_BRAINPOOLP320T1: Pcstr = s("1.3.36.3.3.2.8.1.1.10")

public val SZ_OID_ECC_CURVE_BRAINPOOLP384R1: Pcstr = s("1.3.36.3.3.2.8.1.1.11")

public val SZ_OID_ECC_CURVE_BRAINPOOLP384T1: Pcstr = s("1.3.36.3.3.2.8.1.1.12")

public val SZ_OID_ECC_CURVE_BRAINPOOLP512R1: Pcstr = s("1.3.36.3.3.2.8.1.1.13")

public val SZ_OID_ECC_CURVE_BRAINPOOLP512T1: Pcstr = s("1.3.36.3.3.2.8.1.1.14")

public val SZ_OID_ECC_CURVE_EC192WAPI: Pcstr = s("1.2.156.11235.1.1.2.1")

public val SZ_OID_ECC_CURVE_NISTP192: Pcstr = s("1.2.840.10045.3.1.1")

public val SZ_OID_ECC_CURVE_NISTP224: Pcstr = s("1.3.132.0.33")

public val SZ_OID_ECC_CURVE_NISTP256: Pcwstr = w("1.2.840.10045.3.1.7")

public val SZ_OID_ECC_CURVE_NISTP384: Pcwstr = w("1.3.132.0.34")

public val SZ_OID_ECC_CURVE_NISTP521: Pcwstr = w("1.3.132.0.35")

public val SZ_OID_ECC_CURVE_P256: Pcstr = s("1.2.840.10045.3.1.7")

public val SZ_OID_ECC_CURVE_P384: Pcstr = s("1.3.132.0.34")

public val SZ_OID_ECC_CURVE_P521: Pcstr = s("1.3.132.0.35")

public val SZ_OID_ECC_CURVE_SECP160K1: Pcstr = s("1.3.132.0.9")

public val SZ_OID_ECC_CURVE_SECP160R1: Pcstr = s("1.3.132.0.8")

public val SZ_OID_ECC_CURVE_SECP160R2: Pcstr = s("1.3.132.0.30")

public val SZ_OID_ECC_CURVE_SECP192K1: Pcstr = s("1.3.132.0.31")

public val SZ_OID_ECC_CURVE_SECP192R1: Pcwstr = w("1.2.840.10045.3.1.1")

public val SZ_OID_ECC_CURVE_SECP224K1: Pcstr = s("1.3.132.0.32")

public val SZ_OID_ECC_CURVE_SECP224R1: Pcwstr = w("1.3.132.0.33")

public val SZ_OID_ECC_CURVE_SECP256K1: Pcstr = s("1.3.132.0.10")

public val SZ_OID_ECC_CURVE_SECP256R1: Pcwstr = w("1.2.840.10045.3.1.7")

public val SZ_OID_ECC_CURVE_SECP384R1: Pcwstr = w("1.3.132.0.34")

public val SZ_OID_ECC_CURVE_SECP521R1: Pcwstr = w("1.3.132.0.35")

public val SZ_OID_ECC_CURVE_WTLS12: Pcwstr = w("1.3.132.0.33")

public val SZ_OID_ECC_CURVE_WTLS7: Pcwstr = w("1.3.132.0.30")

public val SZ_OID_ECC_CURVE_WTLS9: Pcstr = s("2.23.43.1.4.9")

public val SZ_OID_ECC_CURVE_X962P192V1: Pcstr = s("1.2.840.10045.3.1.1")

public val SZ_OID_ECC_CURVE_X962P192V2: Pcstr = s("1.2.840.10045.3.1.2")

public val SZ_OID_ECC_CURVE_X962P192V3: Pcstr = s("1.2.840.10045.3.1.3")

public val SZ_OID_ECC_CURVE_X962P239V1: Pcstr = s("1.2.840.10045.3.1.4")

public val SZ_OID_ECC_CURVE_X962P239V2: Pcstr = s("1.2.840.10045.3.1.5")

public val SZ_OID_ECC_CURVE_X962P239V3: Pcstr = s("1.2.840.10045.3.1.6")

public val SZ_OID_ECC_CURVE_X962P256V1: Pcwstr = w("1.2.840.10045.3.1.7")

public val SZ_OID_ECC_PUBLIC_KEY: Pcstr = s("1.2.840.10045.2.1")

public val SZ_OID_ECDSA_SHA1: Pcstr = s("1.2.840.10045.4.1")

public val SZ_OID_ECDSA_SHA256: Pcstr = s("1.2.840.10045.4.3.2")

public val SZ_OID_ECDSA_SHA384: Pcstr = s("1.2.840.10045.4.3.3")

public val SZ_OID_ECDSA_SHA512: Pcstr = s("1.2.840.10045.4.3.4")

public val SZ_OID_ECDSA_SPECIFIED: Pcstr = s("1.2.840.10045.4.3")

public val SZ_OID_EFS_RECOVERY: Pcstr = s("1.3.6.1.4.1.311.10.3.4.1")

public val SZ_OID_EMBEDDED_NT_CRYPTO: Pcstr = s("1.3.6.1.4.1.311.10.3.8")

public val SZ_OID_ENCLAVE_SIGNING: Pcstr = s("1.3.6.1.4.1.311.10.3.42")

public val SZ_OID_ENCRYPTED_KEY_HASH: Pcstr = s("1.3.6.1.4.1.311.21.21")

public val SZ_OID_ENHANCED_KEY_USAGE: Pcstr = s("2.5.29.37")

public val SZ_OID_ENROLLMENT_AGENT: Pcstr = s("1.3.6.1.4.1.311.20.2.1")

public val SZ_OID_ENROLLMENT_CSP_PROVIDER: Pcstr = s("1.3.6.1.4.1.311.13.2.2")

public val SZ_OID_ENROLLMENT_NAME_VALUE_PAIR: Pcstr = s("1.3.6.1.4.1.311.13.2.1")

public val SZ_OID_ENROLL_AIK_INFO: Pcstr = s("1.3.6.1.4.1.311.21.39")

public val SZ_OID_ENROLL_ATTESTATION_CHALLENGE: Pcstr = s("1.3.6.1.4.1.311.21.28")

public val SZ_OID_ENROLL_ATTESTATION_STATEMENT: Pcstr = s("1.3.6.1.4.1.311.21.24")

public val SZ_OID_ENROLL_CAXCHGCERT_HASH: Pcstr = s("1.3.6.1.4.1.311.21.27")

public val SZ_OID_ENROLL_CERTTYPE_EXTENSION: Pcstr = s("1.3.6.1.4.1.311.20.2")

public val SZ_OID_ENROLL_EKPUB_CHALLENGE: Pcstr = s("1.3.6.1.4.1.311.21.26")

public val SZ_OID_ENROLL_EKVERIFYCERT: Pcstr = s("1.3.6.1.4.1.311.21.31")

public val SZ_OID_ENROLL_EKVERIFYCREDS: Pcstr = s("1.3.6.1.4.1.311.21.32")

public val SZ_OID_ENROLL_EKVERIFYKEY: Pcstr = s("1.3.6.1.4.1.311.21.30")

public val SZ_OID_ENROLL_EK_CA_KEYID: Pcstr = s("1.3.6.1.4.1.311.21.43")

public val SZ_OID_ENROLL_EK_INFO: Pcstr = s("1.3.6.1.4.1.311.21.23")

public val SZ_OID_ENROLL_ENCRYPTION_ALGORITHM: Pcstr = s("1.3.6.1.4.1.311.21.29")

public val SZ_OID_ENROLL_KEY_AFFINITY: Pcstr = s("1.3.6.1.4.1.311.21.41")

public val SZ_OID_ENROLL_KSP_NAME: Pcstr = s("1.3.6.1.4.1.311.21.25")

public val SZ_OID_ENROLL_SCEP_CHALLENGE_ANSWER: Pcstr = s("1.3.6.1.4.1.311.21.35")

public val SZ_OID_ENROLL_SCEP_CLIENT_REQUEST: Pcstr = s("1.3.6.1.4.1.311.21.37")

public val SZ_OID_ENROLL_SCEP_ERROR: Pcstr = s("1.3.6.1.4.1.311.21.33")

public val SZ_OID_ENROLL_SCEP_SERVER_MESSAGE: Pcstr = s("1.3.6.1.4.1.311.21.38")

public val SZ_OID_ENROLL_SCEP_SERVER_SECRET: Pcstr = s("1.3.6.1.4.1.311.21.40")

public val SZ_OID_ENROLL_SCEP_SERVER_STATE: Pcstr = s("1.3.6.1.4.1.311.21.34")

public val SZ_OID_ENROLL_SCEP_SIGNER_HASH: Pcstr = s("1.3.6.1.4.1.311.21.42")

public val SZ_OID_ENTERPRISE_OID_ROOT: Pcstr = s("1.3.6.1.4.1.311.21.8")

public val SZ_OID_EV_RDN_COUNTRY: Pcstr = s("1.3.6.1.4.1.311.60.2.1.3")

public val SZ_OID_EV_RDN_LOCALE: Pcstr = s("1.3.6.1.4.1.311.60.2.1.1")

public val SZ_OID_EV_RDN_STATE_OR_PROVINCE: Pcstr = s("1.3.6.1.4.1.311.60.2.1.2")

public val SZ_OID_EV_WHQL_CRYPTO: Pcstr = s("1.3.6.1.4.1.311.10.3.39")

public val SZ_OID_FACSIMILE_TELEPHONE_NUMBER: Pcstr = s("2.5.4.23")

public val SZ_OID_FRESHEST_CRL: Pcstr = s("2.5.29.46")

public val SZ_OID_GIVEN_NAME: Pcstr = s("2.5.4.42")

public val SZ_OID_HPKP_DOMAIN_NAME_CTL: Pcstr = s("1.3.6.1.4.1.311.10.3.60")

public val SZ_OID_HPKP_HEADER_VALUE_CTL: Pcstr = s("1.3.6.1.4.1.311.10.3.61")

public val SZ_OID_INFOSEC: Pcstr = s("2.16.840.1.101.2.1")

public val SZ_OID_INFOSEC_SUITE_A_CONFIDENTIALITY: Pcstr = s("2.16.840.1.101.2.1.1.14")

public val SZ_OID_INFOSEC_SUITE_A_INTEGRITY: Pcstr = s("2.16.840.1.101.2.1.1.15")

public val SZ_OID_INFOSEC_SUITE_AK_MAND_SIG: Pcstr = s("2.16.840.1.101.2.1.1.18")

public val SZ_OID_INFOSEC_SUITE_A_KEY_MANAGEMENT: Pcstr = s("2.16.840.1.101.2.1.1.17")

public val SZ_OID_INFOSEC_SUITE_A_SIGNATURE: Pcstr = s("2.16.840.1.101.2.1.1.13")

public val SZ_OID_INFOSEC_SUITE_A_TOKEN_PROTECTION: Pcstr = s("2.16.840.1.101.2.1.1.16")

public val SZ_OID_INFOSEC_MOSAIC_CONFIDENTIALITY: Pcstr = s("2.16.840.1.101.2.1.1.4")

public val SZ_OID_INFOSEC_MOSAIC_INTEGRITY: Pcstr = s("2.16.840.1.101.2.1.1.6")

public val SZ_OID_INFOSEC_MOSAIC_K_MAND_SIG: Pcstr = s("2.16.840.1.101.2.1.1.12")

public val SZ_OID_INFOSEC_MOSAIC_K_MAND_UPD_SIG: Pcstr = s("2.16.840.1.101.2.1.1.20")

public val SZ_OID_INFOSEC_MOSAIC_KEY_MANAGEMENT: Pcstr = s("2.16.840.1.101.2.1.1.10")

public val SZ_OID_INFOSEC_MOSAIC_SIGNATURE: Pcstr = s("2.16.840.1.101.2.1.1.2")

public val SZ_OID_INFOSEC_MOSAIC_TOKEN_PROTECTION: Pcstr = s("2.16.840.1.101.2.1.1.8")

public val SZ_OID_INFOSEC_MOSAIC_UPDATED_INTEG: Pcstr = s("2.16.840.1.101.2.1.1.21")

public val SZ_OID_INFOSEC_MOSAIC_UPDATED_SIG: Pcstr = s("2.16.840.1.101.2.1.1.19")

public val SZ_OID_INFOSEC_SDNS_CONFIDENTIALITY: Pcstr = s("2.16.840.1.101.2.1.1.3")

public val SZ_OID_INFOSEC_SDNS_INTEGRITY: Pcstr = s("2.16.840.1.101.2.1.1.5")

public val SZ_OID_INFOSEC_SDNS_K_MAND_SIG: Pcstr = s("2.16.840.1.101.2.1.1.11")

public val SZ_OID_INFOSEC_SDNS_KEY_MANAGEMENT: Pcstr = s("2.16.840.1.101.2.1.1.9")

public val SZ_OID_INFOSEC_SDNS_SIGNATURE: Pcstr = s("2.16.840.1.101.2.1.1.1")

public val SZ_OID_INFOSEC_SDNS_TOKEN_PROTECTION: Pcstr = s("2.16.840.1.101.2.1.1.7")

public val SZ_OID_INHIBIT_ANY_POLICY: Pcstr = s("2.5.29.54")

public val SZ_OID_INITIALS: Pcstr = s("2.5.4.43")

public val SZ_OID_INTERNATIONALIZED_EMAIL_ADDRESS: Pcstr = s("1.3.6.1.4.1.311.20.2.4")

public val SZ_OID_INTERNATIONAL_ISDN_NUMBER: Pcstr = s("2.5.4.25")

public val SZ_OID_IPSEC_KP_IKE_INTERMEDIATE: Pcstr = s("1.3.6.1.5.5.8.2.2")

public val SZ_OID_ISSUED_CERT_HASH: Pcstr = s("1.3.6.1.4.1.311.21.17")

public val SZ_OID_ISSUER_ALT_NAME: Pcstr = s("2.5.29.8")

public val SZ_OID_ISSUER_ALT_NAME2: Pcstr = s("2.5.29.18")

public val SZ_OID_ISSUING_DIST_POINT: Pcstr = s("2.5.29.28")

public val SZ_OID_IUM_SIGNING: Pcstr = s("1.3.6.1.4.1.311.10.3.37")

public val SZ_OID_KEYID_RDN: Pcstr = s("1.3.6.1.4.1.311.10.7.1")

public val SZ_OID_KEY_ATTRIBUTES: Pcstr = s("2.5.29.2")

public val SZ_OID_KEY_USAGE: Pcstr = s("2.5.29.15")

public val SZ_OID_KEY_USAGE_RESTRICTION: Pcstr = s("2.5.29.4")

public val SZ_OID_KP_CA_EXCHANGE: Pcstr = s("1.3.6.1.4.1.311.21.5")

public val SZ_OID_KP_CSP_SIGNATURE: Pcstr = s("1.3.6.1.4.1.311.10.3.16")

public val SZ_OID_KP_CTL_USAGE_SIGNING: Pcstr = s("1.3.6.1.4.1.311.10.3.1")

public val SZ_OID_KP_DOCUMENT_SIGNING: Pcstr = s("1.3.6.1.4.1.311.10.3.12")

public val SZ_OID_KP_EFS: Pcstr = s("1.3.6.1.4.1.311.10.3.4")

public val SZ_OID_KP_FLIGHT_SIGNING: Pcstr = s("1.3.6.1.4.1.311.10.3.27")

public val SZ_OID_KP_KERNEL_MODE_CODE_SIGNING: Pcstr = s("1.3.6.1.4.1.311.61.1.1")

public val SZ_OID_KP_KERNEL_MODE_HAL_EXTENSION_SIGNING: Pcstr = s("1.3.6.1.4.1.311.61.5.1")

public val SZ_OID_KP_KERNEL_MODE_TRUSTED_BOOT_SIGNING: Pcstr = s("1.3.6.1.4.1.311.61.4.1")

public val SZ_OID_KP_KEY_RECOVERY: Pcstr = s("1.3.6.1.4.1.311.10.3.11")

public val SZ_OID_KP_KEY_RECOVERY_AGENT: Pcstr = s("1.3.6.1.4.1.311.21.6")

public val SZ_OID_KP_LIFETIME_SIGNING: Pcstr = s("1.3.6.1.4.1.311.10.3.13")

public val SZ_OID_KP_MOBILE_DEVICE_SOFTWARE: Pcstr = s("1.3.6.1.4.1.311.10.3.14")

public val SZ_OID_KP_PRIVACY_CA: Pcstr = s("1.3.6.1.4.1.311.21.36")

public val SZ_OID_KP_QUALIFIED_SUBORDINATION: Pcstr = s("1.3.6.1.4.1.311.10.3.10")

public val SZ_OID_KP_SMARTCARD_LOGON: Pcstr = s("1.3.6.1.4.1.311.20.2.2")

public val SZ_OID_KP_SMART_DISPLAY: Pcstr = s("1.3.6.1.4.1.311.10.3.15")

public val SZ_OID_KP_TIME_STAMP_SIGNING: Pcstr = s("1.3.6.1.4.1.311.10.3.2")

public val SZ_OID_KP_TPM_AIK_CERTIFICATE: Pcstr = s("2.23.133.8.3")

public val SZ_OID_KP_TPM_EK_CERTIFICATE: Pcstr = s("2.23.133.8.1")

public val SZ_OID_KP_TPM_PLATFORM_CERTIFICATE: Pcstr = s("2.23.133.8.2")

public val SZ_OID_LEGACY_POLICY_MAPPINGS: Pcstr = s("2.5.29.5")

public val SZ_OID_LICENSES: Pcstr = s("1.3.6.1.4.1.311.10.6.1")

public val SZ_OID_LICENSE_SERVER: Pcstr = s("1.3.6.1.4.1.311.10.6.2")

public val SZ_OID_LOCALITY_NAME: Pcstr = s("2.5.4.7")

public val SZ_OID_LOCAL_MACHINE_KEYSET: Pcstr = s("1.3.6.1.4.1.311.17.2")

public val SZ_OID_LOGOTYPE_EXT: Pcstr = s("1.3.6.1.5.5.7.1.12")

public val SZ_OID_LOYALTY_OTHER_LOGOTYPE: Pcstr = s("1.3.6.1.5.5.7.20.1")

public val SZ_OID_MEMBER: Pcstr = s("2.5.4.31")

public val SZ_OID_MICROSOFT_PUBLISHER_SIGNER: Pcstr = s("1.3.6.1.4.1.311.76.8.1")

public val SZ_OID_NAME_CONSTRAINTS: Pcstr = s("2.5.29.30")

public val SZ_OID_NETSCAPE: Pcstr = s("2.16.840.1.113730")

public val SZ_OID_NETSCAPE_BASE_URL: Pcstr = s("2.16.840.1.113730.1.2")

public val SZ_OID_NETSCAPE_CA_POLICY_URL: Pcstr = s("2.16.840.1.113730.1.8")

public val SZ_OID_NETSCAPE_CA_REVOCATION_URL: Pcstr = s("2.16.840.1.113730.1.4")

public val SZ_OID_NETSCAPE_CERT_EXTENSION: Pcstr = s("2.16.840.1.113730.1")

public val SZ_OID_NETSCAPE_CERT_RENEWAL_URL: Pcstr = s("2.16.840.1.113730.1.7")

public val SZ_OID_NETSCAPE_CERT_SEQUENCE: Pcstr = s("2.16.840.1.113730.2.5")

public val SZ_OID_NETSCAPE_CERT_TYPE: Pcstr = s("2.16.840.1.113730.1.1")

public val SZ_OID_NETSCAPE_COMMENT: Pcstr = s("2.16.840.1.113730.1.13")

public val SZ_OID_NETSCAPE_DATA_TYPE: Pcstr = s("2.16.840.1.113730.2")

public val SZ_OID_NETSCAPE_REVOCATION_URL: Pcstr = s("2.16.840.1.113730.1.3")

public val SZ_OID_NETSCAPE_SSL_SERVER_NAME: Pcstr = s("2.16.840.1.113730.1.12")

public val SZ_OID_NEXT_UPDATE_LOCATION: Pcstr = s("1.3.6.1.4.1.311.10.2")

public val SZ_OID_NIST_AES128_CBC: Pcstr = s("2.16.840.1.101.3.4.1.2")

public val SZ_OID_NIST_AES128_WRAP: Pcstr = s("2.16.840.1.101.3.4.1.5")

public val SZ_OID_NIST_AES192_CBC: Pcstr = s("2.16.840.1.101.3.4.1.22")

public val SZ_OID_NIST_AES192_WRAP: Pcstr = s("2.16.840.1.101.3.4.1.25")

public val SZ_OID_NIST_AES256_CBC: Pcstr = s("2.16.840.1.101.3.4.1.42")

public val SZ_OID_NIST_AES256_WRAP: Pcstr = s("2.16.840.1.101.3.4.1.45")

public val SZ_OID_NIST_SHA256: Pcstr = s("2.16.840.1.101.3.4.2.1")

public val SZ_OID_NIST_SHA384: Pcstr = s("2.16.840.1.101.3.4.2.2")

public val SZ_OID_NIST_SHA512: Pcstr = s("2.16.840.1.101.3.4.2.3")

public val SZ_OID_NT5_CRYPTO: Pcstr = s("1.3.6.1.4.1.311.10.3.6")

public val SZ_OID_NTDS_CA_SECURITY_EXT: Pcstr = s("1.3.6.1.4.1.311.25.2")

public val SZ_OID_NTDS_OBJECTSID: Pcstr = s("1.3.6.1.4.1.311.25.2.1")

public val SZ_OID_NTDS_REPLICATION: Pcstr = s("1.3.6.1.4.1.311.25.1")

public val SZ_OID_NT_PRINCIPAL_NAME: Pcstr = s("1.3.6.1.4.1.311.20.2.3")

public val SZ_OID_OEM_WHQL_CRYPTO: Pcstr = s("1.3.6.1.4.1.311.10.3.7")

public val SZ_OID_OIW: Pcstr = s("1.3.14")

public val SZ_OID_OIWDIR: Pcstr = s("1.3.14.7.2")

public val SZ_OID_OIWDIR_CRPT: Pcstr = s("1.3.14.7.2.1")

public val SZ_OID_OIWDIR_HASH: Pcstr = s("1.3.14.7.2.2")

public val SZ_OID_OIWDIR_SIGN: Pcstr = s("1.3.14.7.2.3")

public val SZ_OID_OIWDIR_MD2: Pcstr = s("1.3.14.7.2.2.1")

public val SZ_OID_OIWDIR_MD2RSA: Pcstr = s("1.3.14.7.2.3.1")

public val SZ_OID_OIWSEC: Pcstr = s("1.3.14.3.2")

public val SZ_OID_OIWSEC_DES_CBC: Pcstr = s("1.3.14.3.2.7")

public val SZ_OID_OIWSEC_DES_CFB: Pcstr = s("1.3.14.3.2.9")

public val SZ_OID_OIWSEC_DES_ECB: Pcstr = s("1.3.14.3.2.6")

public val SZ_OID_OIWSEC_DES_EDE: Pcstr = s("1.3.14.3.2.17")

public val SZ_OID_OIWSEC_DES_MAC: Pcstr = s("1.3.14.3.2.10")

public val SZ_OID_OIWSEC_DES_OFB: Pcstr = s("1.3.14.3.2.8")

public val SZ_OID_OIWSEC_DH_COMM_MOD: Pcstr = s("1.3.14.3.2.16")

public val SZ_OID_OIWSEC_DSA: Pcstr = s("1.3.14.3.2.12")

public val SZ_OID_OIWSEC_DSA_COMM: Pcstr = s("1.3.14.3.2.20")

public val SZ_OID_OIWSEC_DSA_COMM_SHA: Pcstr = s("1.3.14.3.2.21")

public val SZ_OID_OIWSEC_DSA_COMM_SHA1: Pcstr = s("1.3.14.3.2.28")

public val SZ_OID_OIWSEC_DSA_SHA1: Pcstr = s("1.3.14.3.2.27")

public val SZ_OID_OIWSEC_KEY_HASH_SEAL: Pcstr = s("1.3.14.3.2.23")

public val SZ_OID_OIWSEC_MD2RSA_SIGN: Pcstr = s("1.3.14.3.2.24")

public val SZ_OID_OIWSEC_MD4RSA: Pcstr = s("1.3.14.3.2.2")

public val SZ_OID_OIWSEC_MD4RSA2: Pcstr = s("1.3.14.3.2.4")

public val SZ_OID_OIWSEC_MD5RSA: Pcstr = s("1.3.14.3.2.3")

public val SZ_OID_OIWSEC_MD5RSA_SIGN: Pcstr = s("1.3.14.3.2.25")

public val SZ_OID_OIWSEC_MDC2: Pcstr = s("1.3.14.3.2.19")

public val SZ_OID_OIWSEC_MDC2RSA: Pcstr = s("1.3.14.3.2.14")

public val SZ_OID_OIWSEC_RSA_SIGN: Pcstr = s("1.3.14.3.2.11")

public val SZ_OID_OIWSEC_RSA_XCHG: Pcstr = s("1.3.14.3.2.22")

public val SZ_OID_OIWSEC_SHA: Pcstr = s("1.3.14.3.2.18")

public val SZ_OID_OIWSEC_SHA1: Pcstr = s("1.3.14.3.2.26")

public val SZ_OID_OIWSEC_SHA1RSA_SIGN: Pcstr = s("1.3.14.3.2.29")

public val SZ_OID_OIWSEC_SHA_DSA: Pcstr = s("1.3.14.3.2.13")

public val SZ_OID_OIWSEC_SHA_RSA: Pcstr = s("1.3.14.3.2.15")

public val SZ_OID_ORGANIZATIONAL_UNIT_NAME: Pcstr = s("2.5.4.11")

public val SZ_OID_ORGANIZATION_NAME: Pcstr = s("2.5.4.10")

public val SZ_OID_OS_VERSION: Pcstr = s("1.3.6.1.4.1.311.13.2.3")

public val SZ_OID_OWNER: Pcstr = s("2.5.4.32")

public val SZ_OID_PHYSICAL_DELIVERY_OFFICE_NAME: Pcstr = s("2.5.4.19")

public val SZ_OID_PIN_RULES_CTL: Pcstr = s("1.3.6.1.4.1.311.10.3.32")

public val SZ_OID_PIN_RULES_DOMAIN_NAME: Pcstr = s("1.3.6.1.4.1.311.10.3.34")

public val SZ_OID_PIN_RULES_EXT: Pcstr = s("1.3.6.1.4.1.311.10.3.33")

public val SZ_OID_PIN_RULES_LOG_END_DATE_EXT: Pcstr = s("1.3.6.1.4.1.311.10.3.35")

public val SZ_OID_PIN_RULES_SIGNER: Pcstr = s("1.3.6.1.4.1.311.10.3.31")

public val SZ_OID_PKCS: Pcstr = s("1.2.840.113549.1")

public val SZ_OID_PKCS_1: Pcstr = s("1.2.840.113549.1.1")

public val SZ_OID_PKCS_10: Pcstr = s("1.2.840.113549.1.10")

public val SZ_OID_PKCS_12: Pcstr = s("1.2.840.113549.1.12")

public val SZ_OID_PKCS_12_EXTENDED_ATTRIBUTES: Pcstr = s("1.3.6.1.4.1.311.17.3")

public val SZ_OID_PKCS_12_FRIENDLY_NAME_ATTR: Pcstr = s("1.2.840.113549.1.9.20")

public val SZ_OID_PKCS_12_KEY_PROVIDER_NAME_ATTR: Pcstr = s("1.3.6.1.4.1.311.17.1")

public val SZ_OID_PKCS_12_LOCAL_KEY_ID: Pcstr = s("1.2.840.113549.1.9.21")

public val SZ_OID_PKCS_12_PROTECTED_PASSWORD_SECRET_BAG_TYPE_ID: Pcstr = s("1.3.6.1.4.1.311.17.4")

public val SZ_OID_PKCS_12_PBE_IDS: Pcstr = s("1.2.840.113549.1.12.1")

public val SZ_OID_PKCS_12_PBE_WITH_SHA1AND128BIT_RC2: Pcstr = s("1.2.840.113549.1.12.1.5")

public val SZ_OID_PKCS_12_PBE_WITH_SHA1AND128BIT_RC4: Pcstr = s("1.2.840.113549.1.12.1.1")

public val SZ_OID_PKCS_12_PBE_WITH_SHA1AND2KEY_TRIPLE_DES: Pcstr = s("1.2.840.113549.1.12.1.4")

public val SZ_OID_PKCS_12_PBE_WITH_SHA1AND3KEY_TRIPLE_DES: Pcstr = s("1.2.840.113549.1.12.1.3")

public val SZ_OID_PKCS_12_PBE_WITH_SHA1AND40BIT_RC2: Pcstr = s("1.2.840.113549.1.12.1.6")

public val SZ_OID_PKCS_12_PBE_WITH_SHA1AND40BIT_RC4: Pcstr = s("1.2.840.113549.1.12.1.2")

public val SZ_OID_PKCS_2: Pcstr = s("1.2.840.113549.1.2")

public val SZ_OID_PKCS_3: Pcstr = s("1.2.840.113549.1.3")

public val SZ_OID_PKCS_4: Pcstr = s("1.2.840.113549.1.4")

public val SZ_OID_PKCS_5: Pcstr = s("1.2.840.113549.1.5")

public val SZ_OID_PKCS_5_PBES2: Pcstr = s("1.2.840.113549.1.5.13")

public val SZ_OID_PKCS_5_PBKDF2: Pcstr = s("1.2.840.113549.1.5.12")

public val SZ_OID_PKCS_6: Pcstr = s("1.2.840.113549.1.6")

public val SZ_OID_PKCS_7: Pcstr = s("1.2.840.113549.1.7")

public val SZ_OID_PKCS_7_DATA: Pcstr = s("1.2.840.113549.1.7.1")

public val SZ_OID_PKCS_7_DIGESTED: Pcstr = s("1.2.840.113549.1.7.5")

public val SZ_OID_PKCS_7_ENCRYPTED: Pcstr = s("1.2.840.113549.1.7.6")

public val SZ_OID_PKCS_7_ENVELOPED: Pcstr = s("1.2.840.113549.1.7.3")

public val SZ_OID_PKCS_7_SIGNED: Pcstr = s("1.2.840.113549.1.7.2")

public val SZ_OID_PKCS_7_SIGNEDANDENVELOPED: Pcstr = s("1.2.840.113549.1.7.4")

public val SZ_OID_PKCS_8: Pcstr = s("1.2.840.113549.1.8")

public val SZ_OID_PKCS_9: Pcstr = s("1.2.840.113549.1.9")

public val SZ_OID_PKCS_9_CONTENT_TYPE: Pcstr = s("1.2.840.113549.1.9.3")

public val SZ_OID_PKCS_9_MESSAGE_DIGEST: Pcstr = s("1.2.840.113549.1.9.4")

public val SZ_OID_PKINIT_KP_KDC: Pcstr = s("1.3.6.1.5.2.3.5")

public val SZ_OID_PKIX: Pcstr = s("1.3.6.1.5.5.7")

public val SZ_OID_PKIX_ACC_DESCR: Pcstr = s("1.3.6.1.5.5.7.48")

public val SZ_OID_PKIX_CA_ISSUERS: Pcstr = s("1.3.6.1.5.5.7.48.2")

public val SZ_OID_PKIX_CA_REPOSITORY: Pcstr = s("1.3.6.1.5.5.7.48.5")

public val SZ_OID_PKIX_KP: Pcstr = s("1.3.6.1.5.5.7.3")

public val SZ_OID_PKIX_KP_CLIENT_AUTH: Pcstr = s("1.3.6.1.5.5.7.3.2")

public val SZ_OID_PKIX_KP_CODE_SIGNING: Pcstr = s("1.3.6.1.5.5.7.3.3")

public val SZ_OID_PKIX_KP_EMAIL_PROTECTION: Pcstr = s("1.3.6.1.5.5.7.3.4")

public val SZ_OID_PKIX_KP_IPSEC_END_SYSTEM: Pcstr = s("1.3.6.1.5.5.7.3.5")

public val SZ_OID_PKIX_KP_IPSEC_TUNNEL: Pcstr = s("1.3.6.1.5.5.7.3.6")

public val SZ_OID_PKIX_KP_IPSEC_USER: Pcstr = s("1.3.6.1.5.5.7.3.7")

public val SZ_OID_PKIX_KP_OCSP_SIGNING: Pcstr = s("1.3.6.1.5.5.7.3.9")

public val SZ_OID_PKIX_KP_SERVER_AUTH: Pcstr = s("1.3.6.1.5.5.7.3.1")

public val SZ_OID_PKIX_KP_TIMESTAMP_SIGNING: Pcstr = s("1.3.6.1.5.5.7.3.8")

public val SZ_OID_PKIX_NO_SIGNATURE: Pcstr = s("1.3.6.1.5.5.7.6.2")

public val SZ_OID_PKIX_OCSP: Pcstr = s("1.3.6.1.5.5.7.48.1")

public val SZ_OID_PKIX_OCSP_BASIC_SIGNED_RESPONSE: Pcstr = s("1.3.6.1.5.5.7.48.1.1")

public val SZ_OID_PKIX_OCSP_NOCHECK: Pcstr = s("1.3.6.1.5.5.7.48.1.5")

public val SZ_OID_PKIX_OCSP_NONCE: Pcstr = s("1.3.6.1.5.5.7.48.1.2")

public val SZ_OID_PKIX_PE: Pcstr = s("1.3.6.1.5.5.7.1")

public val SZ_OID_PKIX_POLICY_QUALIFIER_CPS: Pcstr = s("1.3.6.1.5.5.7.2.1")

public val SZ_OID_PKIX_POLICY_QUALIFIER_USERNOTICE: Pcstr = s("1.3.6.1.5.5.7.2.2")

public val SZ_OID_PKIX_TIME_STAMPING: Pcstr = s("1.3.6.1.5.5.7.48.3")

public val SZ_OID_PLATFORM_MANIFEST_BINARY_ID: Pcstr = s("1.3.6.1.4.1.311.10.3.28")

public val SZ_OID_POLICY_CONSTRAINTS: Pcstr = s("2.5.29.36")

public val SZ_OID_POLICY_MAPPINGS: Pcstr = s("2.5.29.33")

public val SZ_OID_POSTAL_ADDRESS: Pcstr = s("2.5.4.16")

public val SZ_OID_POSTAL_CODE: Pcstr = s("2.5.4.17")

public val SZ_OID_POST_OFFICE_BOX: Pcstr = s("2.5.4.18")

public val SZ_OID_PREFERRED_DELIVERY_METHOD: Pcstr = s("2.5.4.28")

public val SZ_OID_PRESENTATION_ADDRESS: Pcstr = s("2.5.4.29")

public val SZ_OID_PRIVATEKEY_USAGE_PERIOD: Pcstr = s("2.5.29.16")

public val SZ_OID_PRODUCT_UPDATE: Pcstr = s("1.3.6.1.4.1.311.31.1")

public val SZ_OID_PROTECTED_PROCESS_LIGHT_SIGNER: Pcstr = s("1.3.6.1.4.1.311.10.3.22")

public val SZ_OID_PROTECTED_PROCESS_SIGNER: Pcstr = s("1.3.6.1.4.1.311.10.3.24")

public val SZ_OID_QC_EU_COMPLIANCE: Pcstr = s("0.4.0.1862.1.1")

public val SZ_OID_QC_SSCD: Pcstr = s("0.4.0.1862.1.4")

public val SZ_OID_QC_STATEMENTS_EXT: Pcstr = s("1.3.6.1.5.5.7.1.3")

public val SZ_OID_RDN_DUMMY_SIGNER: Pcstr = s("1.3.6.1.4.1.311.21.9")

public val SZ_OID_RDN_TCG_PLATFORM_MANUFACTURER: Pcstr = s("2.23.133.2.4")

public val SZ_OID_RDN_TCG_PLATFORM_MODEL: Pcstr = s("2.23.133.2.5")

public val SZ_OID_RDN_TCG_PLATFORM_VERSION: Pcstr = s("2.23.133.2.6")

public val SZ_OID_RDN_TPM_MANUFACTURER: Pcstr = s("2.23.133.2.1")

public val SZ_OID_RDN_TPM_MODEL: Pcstr = s("2.23.133.2.2")

public val SZ_OID_RDN_TPM_VERSION: Pcstr = s("2.23.133.2.3")

public val SZ_OID_REASON_CODE_HOLD: Pcstr = s("2.5.29.23")

public val SZ_OID_REGISTERED_ADDRESS: Pcstr = s("2.5.4.26")

public val SZ_OID_REMOVE_CERTIFICATE: Pcstr = s("1.3.6.1.4.1.311.10.8.1")

public val SZ_OID_RENEWAL_CERTIFICATE: Pcstr = s("1.3.6.1.4.1.311.13.1")

public val SZ_OID_REQUEST_CLIENT_INFO: Pcstr = s("1.3.6.1.4.1.311.21.20")

public val SZ_OID_REQUIRE_CERT_CHAIN_POLICY: Pcstr = s("1.3.6.1.4.1.311.21.15")

public val SZ_OID_REVOKED_LIST_SIGNER: Pcstr = s("1.3.6.1.4.1.311.10.3.19")

public val SZ_OID_RFC3161_COUNTER_SIGN: Pcstr = s("1.3.6.1.4.1.311.3.3.1")

public val SZ_OID_RFC3161V21_COUNTER_SIGN: Pcstr = s("1.3.6.1.4.1.311.3.3.2")

public val SZ_OID_RFC3161V21_THUMBPRINTS: Pcstr = s("1.3.6.1.4.1.311.3.3.3")

public val SZ_OID_ROLE_OCCUPANT: Pcstr = s("2.5.4.33")

public val SZ_OID_ROOT_LIST_SIGNER: Pcstr = s("1.3.6.1.4.1.311.10.3.9")

public val SZ_OID_ROOT_PROGRAM_AUTO_UPDATE_CA_REVOCATION: Pcstr = s("1.3.6.1.4.1.311.60.3.1")

public val SZ_OID_ROOT_PROGRAM_AUTO_UPDATE_END_REVOCATION: Pcstr = s("1.3.6.1.4.1.311.60.3.2")

public val SZ_OID_ROOT_PROGRAM_FLAGS: Pcstr = s("1.3.6.1.4.1.311.60.1.1")

public val SZ_OID_ROOT_PROGRAM_NO_OCSP_FAILOVER_TO_CRL: Pcstr = s("1.3.6.1.4.1.311.60.3.3")

public val SZ_OID_RSA: Pcstr = s("1.2.840.113549")

public val SZ_OID_RSAES_OAEP: Pcstr = s("1.2.840.113549.1.1.7")

public val SZ_OID_RSA_DES_EDE3_CBC: Pcstr = s("1.2.840.113549.3.7")

public val SZ_OID_RSA_DH: Pcstr = s("1.2.840.113549.1.3.1")

public val SZ_OID_RSA_ENCRYPT: Pcstr = s("1.2.840.113549.3")

public val SZ_OID_RSA_HASH: Pcstr = s("1.2.840.113549.2")

public val SZ_OID_RSA_MD2: Pcstr = s("1.2.840.113549.2.2")

public val SZ_OID_RSA_MD2RSA: Pcstr = s("1.2.840.113549.1.1.2")

public val SZ_OID_RSA_MD4: Pcstr = s("1.2.840.113549.2.4")

public val SZ_OID_RSA_MD4RSA: Pcstr = s("1.2.840.113549.1.1.3")

public val SZ_OID_RSA_MD5: Pcstr = s("1.2.840.113549.2.5")

public val SZ_OID_RSA_MD5RSA: Pcstr = s("1.2.840.113549.1.1.4")

public val SZ_OID_RSA_MGF1: Pcstr = s("1.2.840.113549.1.1.8")

public val SZ_OID_RSA_PSPECIFIED: Pcstr = s("1.2.840.113549.1.1.9")

public val SZ_OID_RSA_RC2CBC: Pcstr = s("1.2.840.113549.3.2")

public val SZ_OID_RSA_RC4: Pcstr = s("1.2.840.113549.3.4")

public val SZ_OID_RSA_RC5_CBC_PAD: Pcstr = s("1.2.840.113549.3.9")

public val SZ_OID_RSA_RSA: Pcstr = s("1.2.840.113549.1.1.1")

public val SZ_OID_RSA_SETOAEP_RSA: Pcstr = s("1.2.840.113549.1.1.6")

public val SZ_OID_RSA_SHA1RSA: Pcstr = s("1.2.840.113549.1.1.5")

public val SZ_OID_RSA_SHA256RSA: Pcstr = s("1.2.840.113549.1.1.11")

public val SZ_OID_RSA_SHA384RSA: Pcstr = s("1.2.840.113549.1.1.12")

public val SZ_OID_RSA_SHA512RSA: Pcstr = s("1.2.840.113549.1.1.13")

public val SZ_OID_RSA_SMIME_CAPABILITIES: Pcstr = s("1.2.840.113549.1.9.15")

public val SZ_OID_RSA_SMIM_EALG: Pcstr = s("1.2.840.113549.1.9.16.3")

public val SZ_OID_RSA_SMIM_EALG_CMS3DE_SWRAP: Pcstr = s("1.2.840.113549.1.9.16.3.6")

public val SZ_OID_RSA_SMIM_EALG_CMSRC2WRAP: Pcstr = s("1.2.840.113549.1.9.16.3.7")

public val SZ_OID_RSA_SMIM_EALG_ESDH: Pcstr = s("1.2.840.113549.1.9.16.3.5")

public val SZ_OID_RSA_SSA_PSS: Pcstr = s("1.2.840.113549.1.1.10")

public val SZ_OID_RSA_CERT_EXTENSIONS: Pcstr = s("1.2.840.113549.1.9.14")

public val SZ_OID_RSA_CHALLENGE_PWD: Pcstr = s("1.2.840.113549.1.9.7")

public val SZ_OID_RSA_CONTENT_TYPE: Pcstr = s("1.2.840.113549.1.9.3")

public val SZ_OID_RSA_COUNTER_SIGN: Pcstr = s("1.2.840.113549.1.9.6")

public val SZ_OID_RSA_DATA: Pcstr = s("1.2.840.113549.1.7.1")

public val SZ_OID_RSA_DIGESTED_DATA: Pcstr = s("1.2.840.113549.1.7.5")

public val SZ_OID_RSA_EMAIL_ADDR: Pcstr = s("1.2.840.113549.1.9.1")

public val SZ_OID_RSA_ENCRYPTED_DATA: Pcstr = s("1.2.840.113549.1.7.6")

public val SZ_OID_RSA_ENVELOPED_DATA: Pcstr = s("1.2.840.113549.1.7.3")

public val SZ_OID_RSA_EXT_CERT_ATTRS: Pcstr = s("1.2.840.113549.1.9.9")

public val SZ_OID_RSA_HASHED_DATA: Pcstr = s("1.2.840.113549.1.7.5")

public val SZ_OID_RSA_MESSAGE_DIGEST: Pcstr = s("1.2.840.113549.1.9.4")

public val SZ_OID_RSA_PREFER_SIGNED_DATA: Pcstr = s("1.2.840.113549.1.9.15.1")

public val SZ_OID_RSA_SIGN_ENV_DATA: Pcstr = s("1.2.840.113549.1.7.4")

public val SZ_OID_RSA_SIGNED_DATA: Pcstr = s("1.2.840.113549.1.7.2")

public val SZ_OID_RSA_SIGNING_TIME: Pcstr = s("1.2.840.113549.1.9.5")

public val SZ_OID_RSA_UNSTRUCT_ADDR: Pcstr = s("1.2.840.113549.1.9.8")

public val SZ_OID_RSA_UNSTRUCT_NAME: Pcstr = s("1.2.840.113549.1.9.2")

public val SZ_OID_SEARCH_GUIDE: Pcstr = s("2.5.4.14")

public val SZ_OID_SEE_ALSO: Pcstr = s("2.5.4.34")

public val SZ_OID_SERIALIZED: Pcstr = s("1.3.6.1.4.1.311.10.3.3.1")

public val SZ_OID_SERVER_GATED_CRYPTO: Pcstr = s("1.3.6.1.4.1.311.10.3.3")

public val SZ_OID_SGC_NETSCAPE: Pcstr = s("2.16.840.1.113730.4.1")

public val SZ_OID_SITE_PIN_RULES_FLAGS_ATTR: Pcstr = s("1.3.6.1.4.1.311.10.4.3")

public val SZ_OID_SITE_PIN_RULES_INDEX_ATTR: Pcstr = s("1.3.6.1.4.1.311.10.4.2")

public val SZ_OID_SORTED_CTL: Pcstr = s("1.3.6.1.4.1.311.10.1.1")

public val SZ_OID_STATE_OR_PROVINCE_NAME: Pcstr = s("2.5.4.8")

public val SZ_OID_STREET_ADDRESS: Pcstr = s("2.5.4.9")

public val SZ_OID_SUBJECT_ALT_NAME: Pcstr = s("2.5.29.7")

public val SZ_OID_SUBJECT_ALT_NAME2: Pcstr = s("2.5.29.17")

public val SZ_OID_SUBJECT_DIR_ATTRS: Pcstr = s("2.5.29.9")

public val SZ_OID_SUBJECT_INFO_ACCESS: Pcstr = s("1.3.6.1.5.5.7.1.11")

public val SZ_OID_SUBJECT_KEY_IDENTIFIER: Pcstr = s("2.5.29.14")

public val SZ_OID_SUPPORTED_APPLICATION_CONTEXT: Pcstr = s("2.5.4.30")

public val SZ_OID_SUR_NAME: Pcstr = s("2.5.4.4")

public val SZ_OID_SYNC_ROOT_CTL_EXT: Pcstr = s("1.3.6.1.4.1.311.10.3.50")

public val SZ_OID_TELEPHONE_NUMBER: Pcstr = s("2.5.4.20")

public val SZ_OID_TELETEXT_TERMINAL_IDENTIFIER: Pcstr = s("2.5.4.22")

public val SZ_OID_TELEX_NUMBER: Pcstr = s("2.5.4.21")

public val SZ_OID_TIMESTAMP_TOKEN: Pcstr = s("1.2.840.113549.1.9.16.1.4")

public val SZ_OID_TITLE: Pcstr = s("2.5.4.12")

public val SZ_OID_TLS_FEATURES_EXT: Pcstr = s("1.3.6.1.5.5.7.1.24")

public val SZ_OID_USER_CERTIFICATE: Pcstr = s("2.5.4.36")

public val SZ_OID_USER_PASSWORD: Pcstr = s("2.5.4.35")

public val SZ_OID_VERISIGN_BITSTRING_6_13: Pcstr = s("2.16.840.1.113733.1.6.13")

public val SZ_OID_VERISIGN_ISS_STRONG_CRYPTO: Pcstr = s("2.16.840.1.113733.1.8.1")

public val SZ_OID_VERISIGN_ONSITE_JURISDICTION_HASH: Pcstr = s("2.16.840.1.113733.1.6.11")

public val SZ_OID_VERISIGN_PRIVATE_6_9: Pcstr = s("2.16.840.1.113733.1.6.9")

public val SZ_OID_WHQL_CRYPTO: Pcstr = s("1.3.6.1.4.1.311.10.3.5")

public val SZ_OID_WINDOWS_KITS_SIGNER: Pcstr = s("1.3.6.1.4.1.311.10.3.20")

public val SZ_OID_WINDOWS_RT_SIGNER: Pcstr = s("1.3.6.1.4.1.311.10.3.21")

public val SZ_OID_WINDOWS_SOFTWARE_EXTENSION_SIGNER: Pcstr = s("1.3.6.1.4.1.311.10.3.26")

public val SZ_OID_WINDOWS_STORE_SIGNER: Pcstr = s("1.3.6.1.4.1.311.76.3.1")

public val SZ_OID_WINDOWS_TCB_SIGNER: Pcstr = s("1.3.6.1.4.1.311.10.3.23")

public val SZ_OID_WINDOWS_THIRD_PARTY_COMPONENT_SIGNER: Pcstr = s("1.3.6.1.4.1.311.10.3.25")

public val SZ_OID_X21_ADDRESS: Pcstr = s("2.5.4.24")

public val SZ_OID_X957: Pcstr = s("1.2.840.10040")

public val SZ_OID_X957_DSA: Pcstr = s("1.2.840.10040.4.1")

public val SZ_OID_X957_SHA1DSA: Pcstr = s("1.2.840.10040.4.3")

public val SZ_OID_YESNO_TRUST_ATTR: Pcstr = s("1.3.6.1.4.1.311.10.4.1")

public val SZ_PRIV_KEY_CACHE_MAX_ITEMS: Pcstr = s("PrivKeyCacheMaxItems")

public val SZ_PRIV_KEY_CACHE_PURGE_INTERVAL_SECONDS: Pcstr = s("PrivKeyCachePurgeIntervalSeconds")

public val SZ_ROOT_STORE_FILE: Pcstr = s("msroots")

public val SZ_USER_KEYEXCHANGE_CERT_PREFIX: Pcstr = s("kxc")

public val SZ_USER_KEYEXCHANGE_PRIVATE_KEY_PREFIX: Pcstr = s("kxs")

public val SZ_USER_KEYEXCHANGE_PUBLIC_KEY_PREFIX: Pcstr = s("kxp")

public val SZ_USER_SIGNATURE_CERT_PREFIX: Pcstr = s("ksc")

public val SZ_USER_SIGNATURE_PRIVATE_KEY_PREFIX: Pcstr = s("kss")

public val SZ_USER_SIGNATURE_PUBLIC_KEY_PREFIX: Pcstr = s("ksp")

public val SZ_CERT_STORE_PROV_COLLECTION: Pcstr = s("Collection")

public val SZ_CERT_STORE_PROV_FILENAME: Pcwstr = w("File")

public val SZ_CERT_STORE_PROV_FILENAME_W: Pcstr = s("File")

public val SZ_CERT_STORE_PROV_LDAP: Pcwstr = w("Ldap")

public val SZ_CERT_STORE_PROV_LDAP_W: Pcstr = s("Ldap")

public val SZ_CERT_STORE_PROV_MEMORY: Pcstr = s("Memory")

public val SZ_CERT_STORE_PROV_PHYSICAL: Pcwstr = w("Physical")

public val SZ_CERT_STORE_PROV_PHYSICAL_W: Pcstr = s("Physical")

public val SZ_CERT_STORE_PROV_PKCS12: Pcstr = s("PKCS12")

public val SZ_CERT_STORE_PROV_PKCS7: Pcstr = s("PKCS7")

public val SZ_CERT_STORE_PROV_SERIALIZED: Pcstr = s("Serialized")

public val SZ_CERT_STORE_PROV_SMART_CARD: Pcwstr = w("SmartCard")

public val SZ_CERT_STORE_PROV_SMART_CARD_W: Pcstr = s("SmartCard")

public val SZ_CERT_STORE_PROV_SYSTEM: Pcwstr = w("System")

public val SZ_CERT_STORE_PROV_SYSTEM_REGISTRY: Pcwstr = w("SystemRegistry")

public val SZ_CERT_STORE_PROV_SYSTEM_REGISTRY_W: Pcstr = s("SystemRegistry")

public val SZ_CERT_STORE_PROV_SYSTEM_W: Pcstr = s("System")

public val WSZ_CARD_USER_ADMIN: Pcwstr = w("admin")

public val WSZ_CARD_USER_EVERYONE: Pcwstr = w("anonymous")

public val WSZ_CARD_USER_USER: Pcwstr = w("user")

public val WSZ_URI_CANONICALIZATION_C14N: Pcwstr = w("http://www.w3.org/TR/2001/REC-xml-c14n-20010315")

public val WSZ_URI_CANONICALIZATION_C14NC: Pcwstr = w("http://www.w3.org/TR/2001/REC-xml-c14n-20010315#WithComments")

public val WSZ_URI_CANONICALIZATION_EXSLUSIVE_C14N: Pcwstr = w("http://www.w3.org/2001/10/xml-exc-c14n#")

public val WSZ_URI_CANONICALIZATION_EXSLUSIVE_C14NC: Pcwstr = w("http://www.w3.org/2001/10/xml-exc-c14n#WithComments")

public val WSZ_URI_NTDS_OBJECTSID_PREFIX: Pcwstr = w("tag:microsoft.com,2022-09-14:sid:")

public val WSZ_URI_TRANSFORM_XPATH: Pcwstr = w("http://www.w3.org/TR/1999/REC-xpath-19991116")

public val WSZ_URI_XMLNS_DIGSIG_BASE64: Pcwstr = w("http://www.w3.org/2000/09/xmldsig#base64")

public val WSZ_URI_XMLNS_DIGSIG_DSA_SHA1: Pcwstr = w("http://www.w3.org/2000/09/xmldsig#dsa-sha1")

public val WSZ_URI_XMLNS_DIGSIG_ECDSA_SHA1: Pcwstr = w("http://www.w3.org/2001/04/xmldsig-more#ecdsa-sha1")

public val WSZ_URI_XMLNS_DIGSIG_ECDSA_SHA256: Pcwstr = w("http://www.w3.org/2001/04/xmldsig-more#ecdsa-sha256")

public val WSZ_URI_XMLNS_DIGSIG_ECDSA_SHA384: Pcwstr = w("http://www.w3.org/2001/04/xmldsig-more#ecdsa-sha384")

public val WSZ_URI_XMLNS_DIGSIG_ECDSA_SHA512: Pcwstr = w("http://www.w3.org/2001/04/xmldsig-more#ecdsa-sha512")

public val WSZ_URI_XMLNS_DIGSIG_HMAC_SHA1: Pcwstr = w("http://www.w3.org/2000/09/xmldsig#hmac-sha1")

public val WSZ_URI_XMLNS_DIGSIG_HMAC_SHA256: Pcwstr = w("http://www.w3.org/2001/04/xmldsig-more#hmac-sha256")

public val WSZ_URI_XMLNS_DIGSIG_HMAC_SHA384: Pcwstr = w("http://www.w3.org/2001/04/xmldsig-more#hmac-sha384")

public val WSZ_URI_XMLNS_DIGSIG_HMAC_SHA512: Pcwstr = w("http://www.w3.org/2001/04/xmldsig-more#hmac-sha512")

public val WSZ_URI_XMLNS_DIGSIG_RSA_SHA1: Pcwstr = w("http://www.w3.org/2000/09/xmldsig#rsa-sha1")

public val WSZ_URI_XMLNS_DIGSIG_RSA_SHA256: Pcwstr = w("http://www.w3.org/2001/04/xmldsig-more#rsa-sha256")

public val WSZ_URI_XMLNS_DIGSIG_RSA_SHA384: Pcwstr = w("http://www.w3.org/2001/04/xmldsig-more#rsa-sha384")

public val WSZ_URI_XMLNS_DIGSIG_RSA_SHA512: Pcwstr = w("http://www.w3.org/2001/04/xmldsig-more#rsa-sha512")

public val WSZ_URI_XMLNS_DIGSIG_SHA1: Pcwstr = w("http://www.w3.org/2000/09/xmldsig#sha1")

public val WSZ_URI_XMLNS_DIGSIG_SHA256: Pcwstr = w("http://www.w3.org/2001/04/xmlenc#sha256")

public val WSZ_URI_XMLNS_DIGSIG_SHA384: Pcwstr = w("http://www.w3.org/2001/04/xmldsig-more#sha384")

public val WSZ_URI_XMLNS_DIGSIG_SHA512: Pcwstr = w("http://www.w3.org/2001/04/xmlenc#sha512")

public val WSZ_URI_XMLNS_TRANSFORM_BASE64: Pcwstr = w("http://www.w3.org/2000/09/xmldsig#base64")

public val WSZ_URI_XMLNS_TRANSFORM_ENVELOPED: Pcwstr = w("http://www.w3.org/2000/09/xmldsig#enveloped-signature")

public val WSZ_XMLNS_DIGSIG: Pcwstr = w("http://www.w3.org/2000/09/xmldsig#")

public val WSZ_XMLNS_DIGSIG_ID: Pcwstr = w("Id")

public val WSZ_XMLNS_DIGSIG_SIGNATURE_PROPERTIES: Pcwstr = w("http://www.w3.org/2000/09/xmldsig#SignatureProperties")

public val C_CERT_SRV_SETUP: Guid = Guid.fromU128(U128(0x961f180ff55c413duL, 0xa9b37d2af4d8e42fuL))

public val C_CERT_SRV_SETUP_KEY_INFORMATION: Guid = Guid.fromU128(U128(0x3837390654334633uL, 0xb0fb29b7e78262e1uL))

public val C_CERTIFICATE_ENROLLMENT_POLICY_SERVER_SETUP: Guid = Guid.fromU128(U128(0xafe2fa3241b1459duL, 0xa5de49add8a72182uL))

public val C_CERTIFICATE_ENROLLMENT_SERVER_SETUP: Guid = Guid.fromU128(U128(0x9902f3bc88af4cf8uL, 0xae627140531552b6uL))

public val CMSCEP_SETUP: Guid = Guid.fromU128(U128(0xaa4f5c028e7c49c4uL, 0x94fa67a5cc5eadb4uL))

public val CRYPTPROTECT_DEFAULT_PROVIDER: Guid = Guid.fromU128(U128(0xdf9d8cd0150111d1uL, 0x8c7a00c04fc297ebuL))
