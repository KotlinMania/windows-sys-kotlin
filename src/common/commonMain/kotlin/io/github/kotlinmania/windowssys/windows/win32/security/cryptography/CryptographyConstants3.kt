package io.github.kotlinmania.windowssys.windows.win32.security.cryptography

import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.s
import io.github.kotlinmania.windowssys.core.w

public val TLS_DHE_RSA_WITH_AES_256_GCM_SHA384: UInt = 159u

public val TLS_ECC_P256_CURVE_KEY_TYPE: UInt = 23u

public val TLS_ECC_P384_CURVE_KEY_TYPE: UInt = 24u

public val TLS_ECC_P521_CURVE_KEY_TYPE: UInt = 25u

public val TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA: UInt = 49161u

public val TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256: UInt = 49187u

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

public val TLS_PSK_EXCHANGE: PCWSTR = w("PSK")

public val TLS_PSK_WITH_AES_128_CBC_SHA256: UInt = 174u

public val TLS_PSK_WITH_AES_128_GCM_SHA256: UInt = 168u

public val TLS_PSK_WITH_AES_256_CBC_SHA384: UInt = 175u

public val TLS_PSK_WITH_AES_256_GCM_SHA384: UInt = 169u

public val TLS_PSK_WITH_NULL_SHA256: UInt = 176u

public val TLS_PSK_WITH_NULL_SHA384: UInt = 177u

public val TLS_RSA_EXPORT1024_WITH_DES_CBC_SHA: UInt = 98u

public val TLS_RSA_EXPORT1024_WITH_RC4_56_SHA: UInt = 100u

public val TLS_RSA_EXPORT_WITH_RC4_40_MD5: UInt = 3u

public val TLS_RSA_PSK_EXCHANGE: PCWSTR = w("RSA_PSK")

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

public val TPM_RSA_SRK_SEAL_KEY: PCWSTR = w("MICROSOFT_PCP_KSP_RSA_SEAL_KEY_3BD1C4BF-004E-4E2F-8A4D-0BF633DCB074")

public val URL_OID_CERTIFICATE_CRL_DIST_POINT: PCSTR = 2.toLong()

public val URL_OID_CERTIFICATE_CRL_DIST_POINT_AND_OCSP: PCSTR = 11.toLong()

public val URL_OID_CERTIFICATE_FRESHEST_CRL: PCSTR = 6.toLong()

public val URL_OID_CERTIFICATE_ISSUER: PCSTR = 1.toLong()

public val URL_OID_CERTIFICATE_OCSP: PCSTR = 9.toLong()

public val URL_OID_CERTIFICATE_OCSP_AND_CRL_DIST_POINT: PCSTR = 10.toLong()

public val URL_OID_CERTIFICATE_ONLY_OCSP: PCSTR = 13.toLong()

public val URL_OID_CRL_FRESHEST_CRL: PCSTR = 7.toLong()

public val URL_OID_CRL_ISSUER: PCSTR = 5.toLong()

public val URL_OID_CROSS_CERT_DIST_POINT: PCSTR = 8.toLong()

public val URL_OID_CROSS_CERT_SUBJECT_INFO_ACCESS: PCSTR = 12.toLong()

public val URL_OID_CTL_ISSUER: PCSTR = 3.toLong()

public val URL_OID_CTL_NEXT_UPDATE: PCSTR = 4.toLong()

public val URL_OID_GET_OBJECT_URL_FUNC: PCSTR = s("UrlDllGetObjectUrl")

public val USAGE_MATCH_TYPE_AND: UInt = 0u

public val USAGE_MATCH_TYPE_OR: UInt = 1u

public val UnblockOnlyPin: SECRET_PURPOSE = 6

public val UnknownAc: CARD_FILE_ACCESS_CONDITION = 4

public val UserCreateDeleteDirAc: CARD_DIRECTORY_ACCESS_CONDITION = 1

public val UserReadWriteAc: CARD_FILE_ACCESS_CONDITION = 5

public val UserWriteExecuteAc: CARD_FILE_ACCESS_CONDITION = 2

public val X509_ALGORITHM_IDENTIFIER: PCSTR = 74.toLong()

public val X509_ALTERNATE_NAME: PCSTR = 12.toLong()

public val X509_ANY_STRING: Int = 6

public val X509_ASN_ENCODING: CERT_QUERY_ENCODING_TYPE = 1u

public val X509_AUTHORITY_INFO_ACCESS: PCSTR = 32.toLong()

public val X509_AUTHORITY_KEY_ID: PCSTR = 9.toLong()

public val X509_AUTHORITY_KEY_ID2: PCSTR = 31.toLong()

public val X509_BASIC_CONSTRAINTS: PCSTR = 13.toLong()

public val X509_BASIC_CONSTRAINTS2: PCSTR = 15.toLong()

public val X509_BIOMETRIC_EXT: PCSTR = 71.toLong()

public val X509_BITS: PCSTR = 26.toLong()

public val X509_BITS_WITHOUT_TRAILING_ZEROES: PCSTR = 51.toLong()

public val X509_CERT: PCSTR = 1.toLong()

public val X509_CERTIFICATE_TEMPLATE: PCSTR = 64.toLong()

public val X509_CERT_BUNDLE: PCSTR = 81.toLong()

public val X509_CERT_CRL_TO_BE_SIGNED: PCSTR = 3.toLong()

public val X509_CERT_PAIR: PCSTR = 53.toLong()

public val X509_CERT_POLICIES: PCSTR = 16.toLong()

public val X509_CERT_REQUEST_TO_BE_SIGNED: PCSTR = 4.toLong()

public val X509_CERT_TO_BE_SIGNED: PCSTR = 2.toLong()

public val X509_CHOICE_OF_TIME: PCSTR = 30.toLong()

public val X509_CRL_DIST_POINTS: PCSTR = 35.toLong()

public val X509_CRL_REASON_CODE: Int = 29

public val X509_CROSS_CERT_DIST_POINTS: PCSTR = 58.toLong()

public val X509_DH_PARAMETERS: PCSTR = 47.toLong()

public val X509_DH_PUBLICKEY: Int = 38

public val X509_DSS_PARAMETERS: PCSTR = 39.toLong()

public val X509_DSS_PUBLICKEY: Int = 38

public val X509_DSS_SIGNATURE: PCSTR = 40.toLong()

public val X509_ECC_PARAMETERS: PCSTR = 85.toLong()

public val X509_ECC_PRIVATE_KEY: PCSTR = 82.toLong()

public val X509_ECC_SIGNATURE: PCSTR = 47.toLong()

public val X509_ENHANCED_KEY_USAGE: PCSTR = 36.toLong()

public val X509_ENUMERATED: PCSTR = 29.toLong()

public val X509_EXTENSIONS: PCSTR = 5.toLong()

public val X509_INTEGER: PCSTR = 27.toLong()

public val X509_ISSUING_DIST_POINT: PCSTR = 54.toLong()

public val X509_KEYGEN_REQUEST_TO_BE_SIGNED: PCSTR = 21.toLong()

public val X509_KEY_ATTRIBUTES: PCSTR = 10.toLong()

public val X509_KEY_USAGE: PCSTR = 14.toLong()

public val X509_KEY_USAGE_RESTRICTION: PCSTR = 11.toLong()

public val X509_LOGOTYPE_EXT: PCSTR = 70.toLong()

public val X509_MULTI_BYTE_INTEGER: PCSTR = 28.toLong()

public val X509_MULTI_BYTE_UINT: PCSTR = 38.toLong()

public val X509_NAME: PCSTR = 7.toLong()

public val X509_NAME_CONSTRAINTS: PCSTR = 55.toLong()

public val X509_NAME_VALUE: PCSTR = 6.toLong()

public val X509_NDR_ENCODING: UInt = 2u

public val X509_OBJECT_IDENTIFIER: PCSTR = 73.toLong()

public val X509_OCTET_STRING: PCSTR = 25.toLong()

public val X509_PKIX_POLICY_QUALIFIER_USERNOTICE: PCSTR = 46.toLong()

public val X509_POLICY_CONSTRAINTS: PCSTR = 57.toLong()

public val X509_POLICY_MAPPINGS: PCSTR = 56.toLong()

public val X509_PUBLIC_KEY_INFO: PCSTR = 8.toLong()

public val X509_QC_STATEMENTS_EXT: PCSTR = 42.toLong()

public val X509_SEQUENCE_OF_ANY: PCSTR = 34.toLong()

public val X509_SUBJECT_DIR_ATTRS: PCSTR = 84.toLong()

public val X509_SUBJECT_INFO_ACCESS: Int = 32

public val X509_UNICODE_ANY_STRING: Int = 24

public val X509_UNICODE_NAME: PCSTR = 20.toLong()

public val X509_UNICODE_NAME_VALUE: PCSTR = 24.toLong()

public val X942_DH_PARAMETERS: PCSTR = 50.toLong()

public val X942_OTHER_INFO: PCSTR = 52.toLong()

public val ZERO_PADDING: UInt = 3u

public val cPRIV_KEY_CACHE_MAX_ITEMS_DEFAULT: UInt = 20u

public val cPRIV_KEY_CACHE_PURGE_INTERVAL_SECONDS_DEFAULT: UInt = 86400u

public val dwFORCE_KEY_PROTECTION_DISABLED: UInt = 0u

public val dwFORCE_KEY_PROTECTION_HIGH: UInt = 2u

public val dwFORCE_KEY_PROTECTION_USER_SELECT: UInt = 1u

public val szBASE_CSP_DIR: PCSTR = s("mscp")

public val szCACHE_FILE: PCSTR = s("cardcf")

public val szCARD_IDENTIFIER_FILE: PCSTR = s("cardid")

public val szCONTAINER_MAP_FILE: PCSTR = s("cmapfile")

public val szFORCE_KEY_PROTECTION: PCSTR = s("ForceKeyProtection")

public val szINTERMEDIATE_CERTS_DIR: PCSTR = s("mscerts")

public val szKEY_CACHE_ENABLED: PCSTR = s("CachePrivateKeys")

public val szKEY_CACHE_SECONDS: PCSTR = s("PrivateKeyLifetimeSeconds")

public val szKEY_CRYPTOAPI_PRIVATE_KEY_OPTIONS: PCSTR = s("Software\\Policies\\Microsoft\\Cryptography")

public val szOIDVerisign_FailInfo: PCSTR = s("2.16.840.1.113733.1.9.4")

public val szOIDVerisign_MessageType: PCSTR = s("2.16.840.1.113733.1.9.2")

public val szOIDVerisign_PkiStatus: PCSTR = s("2.16.840.1.113733.1.9.3")

public val szOIDVerisign_RecipientNonce: PCSTR = s("2.16.840.1.113733.1.9.6")

public val szOIDVerisign_SenderNonce: PCSTR = s("2.16.840.1.113733.1.9.5")

public val szOIDVerisign_TransactionID: PCSTR = s("2.16.840.1.113733.1.9.7")

public val szOID_ANSI_X942: PCSTR = s("1.2.840.10046")

public val szOID_ANSI_X942_DH: PCSTR = s("1.2.840.10046.2.1")

public val szOID_ANY_APPLICATION_POLICY: PCSTR = s("1.3.6.1.4.1.311.10.12.1")

public val szOID_ANY_CERT_POLICY: PCSTR = s("2.5.29.32.0")

public val szOID_ANY_ENHANCED_KEY_USAGE: PCSTR = s("2.5.29.37.0")

public val szOID_APPLICATION_CERT_POLICIES: PCSTR = s("1.3.6.1.4.1.311.21.10")

public val szOID_APPLICATION_POLICY_CONSTRAINTS: PCSTR = s("1.3.6.1.4.1.311.21.12")

public val szOID_APPLICATION_POLICY_MAPPINGS: PCSTR = s("1.3.6.1.4.1.311.21.11")

public val szOID_ARCHIVED_KEY_ATTR: PCSTR = s("1.3.6.1.4.1.311.21.13")

public val szOID_ARCHIVED_KEY_CERT_HASH: PCSTR = s("1.3.6.1.4.1.311.21.16")

public val szOID_ATTEST_WHQL_CRYPTO: PCSTR = s("1.3.6.1.4.1.311.10.3.5.1")

public val szOID_ATTR_PLATFORM_SPECIFICATION: PCSTR = s("2.23.133.2.17")

public val szOID_ATTR_SUPPORTED_ALGORITHMS: PCSTR = s("2.5.4.52")

public val szOID_ATTR_TPM_SECURITY_ASSERTIONS: PCSTR = s("2.23.133.2.18")

public val szOID_ATTR_TPM_SPECIFICATION: PCSTR = s("2.23.133.2.16")

public val szOID_AUTHORITY_INFO_ACCESS: PCSTR = s("1.3.6.1.5.5.7.1.1")

public val szOID_AUTHORITY_KEY_IDENTIFIER: PCSTR = s("2.5.29.1")

public val szOID_AUTHORITY_KEY_IDENTIFIER2: PCSTR = s("2.5.29.35")

public val szOID_AUTHORITY_REVOCATION_LIST: PCSTR = s("2.5.4.38")

public val szOID_AUTO_ENROLL_CTL_USAGE: PCSTR = s("1.3.6.1.4.1.311.20.1")

public val szOID_BACKGROUND_OTHER_LOGOTYPE: PCSTR = s("1.3.6.1.5.5.7.20.2")

public val szOID_BASIC_CONSTRAINTS: PCSTR = s("2.5.29.10")

public val szOID_BASIC_CONSTRAINTS2: PCSTR = s("2.5.29.19")

public val szOID_BIOMETRIC_EXT: PCSTR = s("1.3.6.1.5.5.7.1.2")

public val szOID_BIOMETRIC_SIGNING: PCSTR = s("1.3.6.1.4.1.311.10.3.41")

public val szOID_BUSINESS_CATEGORY: PCSTR = s("2.5.4.15")

public val szOID_CA_CERTIFICATE: PCSTR = s("2.5.4.37")

public val szOID_CERTIFICATE_REVOCATION_LIST: PCSTR = s("2.5.4.39")

public val szOID_CERTIFICATE_TEMPLATE: PCSTR = s("1.3.6.1.4.1.311.21.7")

public val szOID_CERTSRV_CA_VERSION: PCSTR = s("1.3.6.1.4.1.311.21.1")

public val szOID_CERTSRV_CROSSCA_VERSION: PCSTR = s("1.3.6.1.4.1.311.21.22")

public val szOID_CERTSRV_PREVIOUS_CERT_HASH: PCSTR = s("1.3.6.1.4.1.311.21.2")

public val szOID_CERT_DISALLOWED_CA_FILETIME_PROP_ID: PCSTR = s("1.3.6.1.4.1.311.10.11.128")

public val szOID_CERT_DISALLOWED_FILETIME_PROP_ID: PCSTR = s("1.3.6.1.4.1.311.10.11.104")

public val szOID_CERT_EXTENSIONS: PCSTR = s("1.3.6.1.4.1.311.2.1.14")

public val szOID_CERT_ISSUER_SERIAL_NUMBER_MD5_HASH_PROP_ID: PCSTR = s("1.3.6.1.4.1.311.10.11.28")

public val szOID_CERT_KEY_IDENTIFIER_PROP_ID: PCSTR = s("1.3.6.1.4.1.311.10.11.20")

public val szOID_CERT_MANIFOLD: PCSTR = s("1.3.6.1.4.1.311.20.3")

public val szOID_CERT_MD5_HASH_PROP_ID: PCSTR = s("1.3.6.1.4.1.311.10.11.4")

public val szOID_CERT_POLICIES: PCSTR = s("2.5.29.32")

public val szOID_CERT_POLICIES_95: PCSTR = s("2.5.29.3")

public val szOID_CERT_POLICIES_95_QUALIFIER1: PCSTR = s("2.16.840.1.113733.1.7.1.1")

public val szOID_CERT_PROP_ID_PREFIX: PCSTR = s("1.3.6.1.4.1.311.10.11.")

public val szOID_CERT_SIGNATURE_HASH_PROP_ID: PCSTR = s("1.3.6.1.4.1.311.10.11.15")

public val szOID_CERT_STRONG_KEY_OS_1: PCSTR = s("1.3.6.1.4.1.311.72.2.1")

public val szOID_CERT_STRONG_KEY_OS_CURRENT: PCWSTR = w("1.3.6.1.4.1.311.72.2.1")

public val szOID_CERT_STRONG_KEY_OS_PREFIX: PCSTR = s("1.3.6.1.4.1.311.72.2.")

public val szOID_CERT_STRONG_SIGN_OS_1: PCSTR = s("1.3.6.1.4.1.311.72.1.1")

public val szOID_CERT_STRONG_SIGN_OS_CURRENT: PCWSTR = w("1.3.6.1.4.1.311.72.1.1")

public val szOID_CERT_STRONG_SIGN_OS_PREFIX: PCSTR = s("1.3.6.1.4.1.311.72.1.")

public val szOID_CERT_SUBJECT_NAME_MD5_HASH_PROP_ID: PCSTR = s("1.3.6.1.4.1.311.10.11.29")

public val szOID_CMC: PCSTR = s("1.3.6.1.5.5.7.7")

public val szOID_CMC_ADD_ATTRIBUTES: PCSTR = s("1.3.6.1.4.1.311.10.10.1")

public val szOID_CMC_ADD_EXTENSIONS: PCSTR = s("1.3.6.1.5.5.7.7.8")

public val szOID_CMC_DATA_RETURN: PCSTR = s("1.3.6.1.5.5.7.7.4")

public val szOID_CMC_DECRYPTED_POP: PCSTR = s("1.3.6.1.5.5.7.7.10")

public val szOID_CMC_ENCRYPTED_POP: PCSTR = s("1.3.6.1.5.5.7.7.9")

public val szOID_CMC_GET_CERT: PCSTR = s("1.3.6.1.5.5.7.7.15")

public val szOID_CMC_GET_CRL: PCSTR = s("1.3.6.1.5.5.7.7.16")

public val szOID_CMC_IDENTIFICATION: PCSTR = s("1.3.6.1.5.5.7.7.2")

public val szOID_CMC_IDENTITY_PROOF: PCSTR = s("1.3.6.1.5.5.7.7.3")

public val szOID_CMC_ID_CONFIRM_CERT_ACCEPTANCE: PCSTR = s("1.3.6.1.5.5.7.7.24")

public val szOID_CMC_ID_POP_LINK_RANDOM: PCSTR = s("1.3.6.1.5.5.7.7.22")

public val szOID_CMC_ID_POP_LINK_WITNESS: PCSTR = s("1.3.6.1.5.5.7.7.23")

public val szOID_CMC_LRA_POP_WITNESS: PCSTR = s("1.3.6.1.5.5.7.7.11")

public val szOID_CMC_QUERY_PENDING: PCSTR = s("1.3.6.1.5.5.7.7.21")

public val szOID_CMC_RECIPIENT_NONCE: PCSTR = s("1.3.6.1.5.5.7.7.7")

public val szOID_CMC_REG_INFO: PCSTR = s("1.3.6.1.5.5.7.7.18")

public val szOID_CMC_RESPONSE_INFO: PCSTR = s("1.3.6.1.5.5.7.7.19")

public val szOID_CMC_REVOKE_REQUEST: PCSTR = s("1.3.6.1.5.5.7.7.17")

public val szOID_CMC_SENDER_NONCE: PCSTR = s("1.3.6.1.5.5.7.7.6")

public val szOID_CMC_STATUS_INFO: PCSTR = s("1.3.6.1.5.5.7.7.1")

public val szOID_CMC_TRANSACTION_ID: PCSTR = s("1.3.6.1.5.5.7.7.5")

public val szOID_CN_ECDSA_SHA256: PCSTR = s("1.2.156.11235.1.1.1")

public val szOID_COMMON_NAME: PCSTR = s("2.5.4.3")

public val szOID_COUNTRY_NAME: PCSTR = s("2.5.4.6")

public val szOID_CRL_DIST_POINTS: PCSTR = s("2.5.29.31")

public val szOID_CRL_NEXT_PUBLISH: PCSTR = s("1.3.6.1.4.1.311.21.4")

public val szOID_CRL_NUMBER: PCSTR = s("2.5.29.20")

public val szOID_CRL_REASON_CODE: PCSTR = s("2.5.29.21")

public val szOID_CRL_SELF_CDP: PCSTR = s("1.3.6.1.4.1.311.21.14")

public val szOID_CRL_VIRTUAL_BASE: PCSTR = s("1.3.6.1.4.1.311.21.3")

public val szOID_CROSS_CERTIFICATE_PAIR: PCSTR = s("2.5.4.40")

public val szOID_CROSS_CERT_DIST_POINTS: PCSTR = s("1.3.6.1.4.1.311.10.9.1")

public val szOID_CTL: PCSTR = s("1.3.6.1.4.1.311.10.1")

public val szOID_CT_CERT_SCTLIST: PCSTR = s("1.3.6.1.4.1.11129.2.4.2")

public val szOID_CT_PKI_DATA: PCSTR = s("1.3.6.1.5.5.7.12.2")

public val szOID_CT_PKI_RESPONSE: PCSTR = s("1.3.6.1.5.5.7.12.3")

public val szOID_DELTA_CRL_INDICATOR: PCSTR = s("2.5.29.27")

public val szOID_DESCRIPTION: PCSTR = s("2.5.4.13")

public val szOID_DESTINATION_INDICATOR: PCSTR = s("2.5.4.27")

public val szOID_DEVICE_SERIAL_NUMBER: PCSTR = s("2.5.4.5")

public val szOID_DH_SINGLE_PASS_STDDH_SHA1_KDF: PCSTR = s("1.3.133.16.840.63.0.2")

public val szOID_DH_SINGLE_PASS_STDDH_SHA256_KDF: PCSTR = s("1.3.132.1.11.1")

public val szOID_DH_SINGLE_PASS_STDDH_SHA384_KDF: PCSTR = s("1.3.132.1.11.2")

public val szOID_DISALLOWED_HASH: PCWSTR = w("1.3.6.1.4.1.311.10.11.15")

public val szOID_DISALLOWED_LIST: PCSTR = s("1.3.6.1.4.1.311.10.3.30")

public val szOID_DN_QUALIFIER: PCSTR = s("2.5.4.46")

public val szOID_DOMAIN_COMPONENT: PCSTR = s("0.9.2342.19200300.100.1.25")

public val szOID_DRM: PCSTR = s("1.3.6.1.4.1.311.10.5.1")

public val szOID_DRM_INDIVIDUALIZATION: PCSTR = s("1.3.6.1.4.1.311.10.5.2")

public val szOID_DS: PCSTR = s("2.5")

public val szOID_DSALG: PCSTR = s("2.5.8")

public val szOID_DSALG_CRPT: PCSTR = s("2.5.8.1")

public val szOID_DSALG_HASH: PCSTR = s("2.5.8.2")

public val szOID_DSALG_RSA: PCSTR = s("2.5.8.1.1")

public val szOID_DSALG_SIGN: PCSTR = s("2.5.8.3")

public val szOID_DS_EMAIL_REPLICATION: PCSTR = s("1.3.6.1.4.1.311.21.19")

public val szOID_DYNAMIC_CODE_GEN_SIGNER: PCSTR = s("1.3.6.1.4.1.311.76.5.1")

public val szOID_ECC_CURVE_BRAINPOOLP160R1: PCSTR = s("1.3.36.3.3.2.8.1.1.1")

public val szOID_ECC_CURVE_BRAINPOOLP160T1: PCSTR = s("1.3.36.3.3.2.8.1.1.2")

public val szOID_ECC_CURVE_BRAINPOOLP192R1: PCSTR = s("1.3.36.3.3.2.8.1.1.3")

public val szOID_ECC_CURVE_BRAINPOOLP192T1: PCSTR = s("1.3.36.3.3.2.8.1.1.4")

public val szOID_ECC_CURVE_BRAINPOOLP224R1: PCSTR = s("1.3.36.3.3.2.8.1.1.5")

public val szOID_ECC_CURVE_BRAINPOOLP224T1: PCSTR = s("1.3.36.3.3.2.8.1.1.6")

public val szOID_ECC_CURVE_BRAINPOOLP256R1: PCSTR = s("1.3.36.3.3.2.8.1.1.7")

public val szOID_ECC_CURVE_BRAINPOOLP256T1: PCSTR = s("1.3.36.3.3.2.8.1.1.8")

public val szOID_ECC_CURVE_BRAINPOOLP320R1: PCSTR = s("1.3.36.3.3.2.8.1.1.9")

public val szOID_ECC_CURVE_BRAINPOOLP320T1: PCSTR = s("1.3.36.3.3.2.8.1.1.10")

public val szOID_ECC_CURVE_BRAINPOOLP384R1: PCSTR = s("1.3.36.3.3.2.8.1.1.11")

public val szOID_ECC_CURVE_BRAINPOOLP384T1: PCSTR = s("1.3.36.3.3.2.8.1.1.12")

public val szOID_ECC_CURVE_BRAINPOOLP512R1: PCSTR = s("1.3.36.3.3.2.8.1.1.13")

public val szOID_ECC_CURVE_BRAINPOOLP512T1: PCSTR = s("1.3.36.3.3.2.8.1.1.14")

public val szOID_ECC_CURVE_EC192WAPI: PCSTR = s("1.2.156.11235.1.1.2.1")

public val szOID_ECC_CURVE_NISTP192: PCSTR = s("1.2.840.10045.3.1.1")

public val szOID_ECC_CURVE_NISTP224: PCSTR = s("1.3.132.0.33")

public val szOID_ECC_CURVE_NISTP256: PCWSTR = w("1.2.840.10045.3.1.7")

public val szOID_ECC_CURVE_NISTP384: PCWSTR = w("1.3.132.0.34")

public val szOID_ECC_CURVE_NISTP521: PCWSTR = w("1.3.132.0.35")

public val szOID_ECC_CURVE_P256: PCSTR = s("1.2.840.10045.3.1.7")

public val szOID_ECC_CURVE_P384: PCSTR = s("1.3.132.0.34")

public val szOID_ECC_CURVE_P521: PCSTR = s("1.3.132.0.35")

public val szOID_ECC_CURVE_SECP160K1: PCSTR = s("1.3.132.0.9")

public val szOID_ECC_CURVE_SECP160R1: PCSTR = s("1.3.132.0.8")

public val szOID_ECC_CURVE_SECP160R2: PCSTR = s("1.3.132.0.30")

public val szOID_ECC_CURVE_SECP192K1: PCSTR = s("1.3.132.0.31")

public val szOID_ECC_CURVE_SECP192R1: PCWSTR = w("1.2.840.10045.3.1.1")

public val szOID_ECC_CURVE_SECP224K1: PCSTR = s("1.3.132.0.32")

public val szOID_ECC_CURVE_SECP224R1: PCWSTR = w("1.3.132.0.33")

public val szOID_ECC_CURVE_SECP256K1: PCSTR = s("1.3.132.0.10")

public val szOID_ECC_CURVE_SECP256R1: PCWSTR = w("1.2.840.10045.3.1.7")

public val szOID_ECC_CURVE_SECP384R1: PCWSTR = w("1.3.132.0.34")

public val szOID_ECC_CURVE_SECP521R1: PCWSTR = w("1.3.132.0.35")

public val szOID_ECC_CURVE_WTLS12: PCWSTR = w("1.3.132.0.33")

public val szOID_ECC_CURVE_WTLS7: PCWSTR = w("1.3.132.0.30")

public val szOID_ECC_CURVE_WTLS9: PCSTR = s("2.23.43.1.4.9")

public val szOID_ECC_CURVE_X962P192V1: PCSTR = s("1.2.840.10045.3.1.1")

public val szOID_ECC_CURVE_X962P192V2: PCSTR = s("1.2.840.10045.3.1.2")

public val szOID_ECC_CURVE_X962P192V3: PCSTR = s("1.2.840.10045.3.1.3")

public val szOID_ECC_CURVE_X962P239V1: PCSTR = s("1.2.840.10045.3.1.4")

public val szOID_ECC_CURVE_X962P239V2: PCSTR = s("1.2.840.10045.3.1.5")

public val szOID_ECC_CURVE_X962P239V3: PCSTR = s("1.2.840.10045.3.1.6")

public val szOID_ECC_CURVE_X962P256V1: PCWSTR = w("1.2.840.10045.3.1.7")

public val szOID_ECC_PUBLIC_KEY: PCSTR = s("1.2.840.10045.2.1")

public val szOID_ECDSA_SHA1: PCSTR = s("1.2.840.10045.4.1")

public val szOID_ECDSA_SHA256: PCSTR = s("1.2.840.10045.4.3.2")

public val szOID_ECDSA_SHA384: PCSTR = s("1.2.840.10045.4.3.3")

public val szOID_ECDSA_SHA512: PCSTR = s("1.2.840.10045.4.3.4")

public val szOID_ECDSA_SPECIFIED: PCSTR = s("1.2.840.10045.4.3")

public val szOID_EFS_RECOVERY: PCSTR = s("1.3.6.1.4.1.311.10.3.4.1")

public val szOID_EMBEDDED_NT_CRYPTO: PCSTR = s("1.3.6.1.4.1.311.10.3.8")

public val szOID_ENCLAVE_SIGNING: PCSTR = s("1.3.6.1.4.1.311.10.3.42")

public val szOID_ENCRYPTED_KEY_HASH: PCSTR = s("1.3.6.1.4.1.311.21.21")

public val szOID_ENHANCED_KEY_USAGE: PCSTR = s("2.5.29.37")

public val szOID_ENROLLMENT_AGENT: PCSTR = s("1.3.6.1.4.1.311.20.2.1")

public val szOID_ENROLLMENT_CSP_PROVIDER: PCSTR = s("1.3.6.1.4.1.311.13.2.2")

public val szOID_ENROLLMENT_NAME_VALUE_PAIR: PCSTR = s("1.3.6.1.4.1.311.13.2.1")

public val szOID_ENROLL_AIK_INFO: PCSTR = s("1.3.6.1.4.1.311.21.39")

public val szOID_ENROLL_ATTESTATION_CHALLENGE: PCSTR = s("1.3.6.1.4.1.311.21.28")

public val szOID_ENROLL_ATTESTATION_STATEMENT: PCSTR = s("1.3.6.1.4.1.311.21.24")

public val szOID_ENROLL_CAXCHGCERT_HASH: PCSTR = s("1.3.6.1.4.1.311.21.27")

public val szOID_ENROLL_CERTTYPE_EXTENSION: PCSTR = s("1.3.6.1.4.1.311.20.2")

public val szOID_ENROLL_EKPUB_CHALLENGE: PCSTR = s("1.3.6.1.4.1.311.21.26")

public val szOID_ENROLL_EKVERIFYCERT: PCSTR = s("1.3.6.1.4.1.311.21.31")

public val szOID_ENROLL_EKVERIFYCREDS: PCSTR = s("1.3.6.1.4.1.311.21.32")

public val szOID_ENROLL_EKVERIFYKEY: PCSTR = s("1.3.6.1.4.1.311.21.30")

public val szOID_ENROLL_EK_CA_KEYID: PCSTR = s("1.3.6.1.4.1.311.21.43")

public val szOID_ENROLL_EK_INFO: PCSTR = s("1.3.6.1.4.1.311.21.23")

public val szOID_ENROLL_ENCRYPTION_ALGORITHM: PCSTR = s("1.3.6.1.4.1.311.21.29")

public val szOID_ENROLL_KEY_AFFINITY: PCSTR = s("1.3.6.1.4.1.311.21.41")

public val szOID_ENROLL_KSP_NAME: PCSTR = s("1.3.6.1.4.1.311.21.25")

public val szOID_ENROLL_SCEP_CHALLENGE_ANSWER: PCSTR = s("1.3.6.1.4.1.311.21.35")

public val szOID_ENROLL_SCEP_CLIENT_REQUEST: PCSTR = s("1.3.6.1.4.1.311.21.37")

public val szOID_ENROLL_SCEP_ERROR: PCSTR = s("1.3.6.1.4.1.311.21.33")

public val szOID_ENROLL_SCEP_SERVER_MESSAGE: PCSTR = s("1.3.6.1.4.1.311.21.38")

public val szOID_ENROLL_SCEP_SERVER_SECRET: PCSTR = s("1.3.6.1.4.1.311.21.40")

public val szOID_ENROLL_SCEP_SERVER_STATE: PCSTR = s("1.3.6.1.4.1.311.21.34")

public val szOID_ENROLL_SCEP_SIGNER_HASH: PCSTR = s("1.3.6.1.4.1.311.21.42")

public val szOID_ENTERPRISE_OID_ROOT: PCSTR = s("1.3.6.1.4.1.311.21.8")

public val szOID_EV_RDN_COUNTRY: PCSTR = s("1.3.6.1.4.1.311.60.2.1.3")

public val szOID_EV_RDN_LOCALE: PCSTR = s("1.3.6.1.4.1.311.60.2.1.1")

public val szOID_EV_RDN_STATE_OR_PROVINCE: PCSTR = s("1.3.6.1.4.1.311.60.2.1.2")

public val szOID_EV_WHQL_CRYPTO: PCSTR = s("1.3.6.1.4.1.311.10.3.39")

public val szOID_FACSIMILE_TELEPHONE_NUMBER: PCSTR = s("2.5.4.23")

public val szOID_FRESHEST_CRL: PCSTR = s("2.5.29.46")

public val szOID_GIVEN_NAME: PCSTR = s("2.5.4.42")

public val szOID_HPKP_DOMAIN_NAME_CTL: PCSTR = s("1.3.6.1.4.1.311.10.3.60")

public val szOID_HPKP_HEADER_VALUE_CTL: PCSTR = s("1.3.6.1.4.1.311.10.3.61")

public val szOID_INFOSEC: PCSTR = s("2.16.840.1.101.2.1")

public val szOID_INFOSEC_SuiteAConfidentiality: PCSTR = s("2.16.840.1.101.2.1.1.14")

public val szOID_INFOSEC_SuiteAIntegrity: PCSTR = s("2.16.840.1.101.2.1.1.15")

public val szOID_INFOSEC_SuiteAKMandSig: PCSTR = s("2.16.840.1.101.2.1.1.18")

public val szOID_INFOSEC_SuiteAKeyManagement: PCSTR = s("2.16.840.1.101.2.1.1.17")

public val szOID_INFOSEC_SuiteASignature: PCSTR = s("2.16.840.1.101.2.1.1.13")

public val szOID_INFOSEC_SuiteATokenProtection: PCSTR = s("2.16.840.1.101.2.1.1.16")

public val szOID_INFOSEC_mosaicConfidentiality: PCSTR = s("2.16.840.1.101.2.1.1.4")

public val szOID_INFOSEC_mosaicIntegrity: PCSTR = s("2.16.840.1.101.2.1.1.6")

public val szOID_INFOSEC_mosaicKMandSig: PCSTR = s("2.16.840.1.101.2.1.1.12")

public val szOID_INFOSEC_mosaicKMandUpdSig: PCSTR = s("2.16.840.1.101.2.1.1.20")

public val szOID_INFOSEC_mosaicKeyManagement: PCSTR = s("2.16.840.1.101.2.1.1.10")

public val szOID_INFOSEC_mosaicSignature: PCSTR = s("2.16.840.1.101.2.1.1.2")

public val szOID_INFOSEC_mosaicTokenProtection: PCSTR = s("2.16.840.1.101.2.1.1.8")

public val szOID_INFOSEC_mosaicUpdatedInteg: PCSTR = s("2.16.840.1.101.2.1.1.21")

public val szOID_INFOSEC_mosaicUpdatedSig: PCSTR = s("2.16.840.1.101.2.1.1.19")

public val szOID_INFOSEC_sdnsConfidentiality: PCSTR = s("2.16.840.1.101.2.1.1.3")

public val szOID_INFOSEC_sdnsIntegrity: PCSTR = s("2.16.840.1.101.2.1.1.5")

public val szOID_INFOSEC_sdnsKMandSig: PCSTR = s("2.16.840.1.101.2.1.1.11")

public val szOID_INFOSEC_sdnsKeyManagement: PCSTR = s("2.16.840.1.101.2.1.1.9")

public val szOID_INFOSEC_sdnsSignature: PCSTR = s("2.16.840.1.101.2.1.1.1")

public val szOID_INFOSEC_sdnsTokenProtection: PCSTR = s("2.16.840.1.101.2.1.1.7")

public val szOID_INHIBIT_ANY_POLICY: PCSTR = s("2.5.29.54")

public val szOID_INITIALS: PCSTR = s("2.5.4.43")

public val szOID_INTERNATIONALIZED_EMAIL_ADDRESS: PCSTR = s("1.3.6.1.4.1.311.20.2.4")

public val szOID_INTERNATIONAL_ISDN_NUMBER: PCSTR = s("2.5.4.25")

public val szOID_IPSEC_KP_IKE_INTERMEDIATE: PCSTR = s("1.3.6.1.5.5.8.2.2")

public val szOID_ISSUED_CERT_HASH: PCSTR = s("1.3.6.1.4.1.311.21.17")

public val szOID_ISSUER_ALT_NAME: PCSTR = s("2.5.29.8")

public val szOID_ISSUER_ALT_NAME2: PCSTR = s("2.5.29.18")

public val szOID_ISSUING_DIST_POINT: PCSTR = s("2.5.29.28")

public val szOID_IUM_SIGNING: PCSTR = s("1.3.6.1.4.1.311.10.3.37")

public val szOID_KEYID_RDN: PCSTR = s("1.3.6.1.4.1.311.10.7.1")

public val szOID_KEY_ATTRIBUTES: PCSTR = s("2.5.29.2")

public val szOID_KEY_USAGE: PCSTR = s("2.5.29.15")

public val szOID_KEY_USAGE_RESTRICTION: PCSTR = s("2.5.29.4")

public val szOID_KP_CA_EXCHANGE: PCSTR = s("1.3.6.1.4.1.311.21.5")

public val szOID_KP_CSP_SIGNATURE: PCSTR = s("1.3.6.1.4.1.311.10.3.16")

public val szOID_KP_CTL_USAGE_SIGNING: PCSTR = s("1.3.6.1.4.1.311.10.3.1")

public val szOID_KP_DOCUMENT_SIGNING: PCSTR = s("1.3.6.1.4.1.311.10.3.12")

public val szOID_KP_EFS: PCSTR = s("1.3.6.1.4.1.311.10.3.4")

public val szOID_KP_FLIGHT_SIGNING: PCSTR = s("1.3.6.1.4.1.311.10.3.27")

public val szOID_KP_KERNEL_MODE_CODE_SIGNING: PCSTR = s("1.3.6.1.4.1.311.61.1.1")

public val szOID_KP_KERNEL_MODE_HAL_EXTENSION_SIGNING: PCSTR = s("1.3.6.1.4.1.311.61.5.1")

public val szOID_KP_KERNEL_MODE_TRUSTED_BOOT_SIGNING: PCSTR = s("1.3.6.1.4.1.311.61.4.1")

public val szOID_KP_KEY_RECOVERY: PCSTR = s("1.3.6.1.4.1.311.10.3.11")

public val szOID_KP_KEY_RECOVERY_AGENT: PCSTR = s("1.3.6.1.4.1.311.21.6")

public val szOID_KP_LIFETIME_SIGNING: PCSTR = s("1.3.6.1.4.1.311.10.3.13")

public val szOID_KP_MOBILE_DEVICE_SOFTWARE: PCSTR = s("1.3.6.1.4.1.311.10.3.14")

public val szOID_KP_PRIVACY_CA: PCSTR = s("1.3.6.1.4.1.311.21.36")

public val szOID_KP_QUALIFIED_SUBORDINATION: PCSTR = s("1.3.6.1.4.1.311.10.3.10")

public val szOID_KP_SMARTCARD_LOGON: PCSTR = s("1.3.6.1.4.1.311.20.2.2")

public val szOID_KP_SMART_DISPLAY: PCSTR = s("1.3.6.1.4.1.311.10.3.15")

public val szOID_KP_TIME_STAMP_SIGNING: PCSTR = s("1.3.6.1.4.1.311.10.3.2")

public val szOID_KP_TPM_AIK_CERTIFICATE: PCSTR = s("2.23.133.8.3")

public val szOID_KP_TPM_EK_CERTIFICATE: PCSTR = s("2.23.133.8.1")

public val szOID_KP_TPM_PLATFORM_CERTIFICATE: PCSTR = s("2.23.133.8.2")

public val szOID_LEGACY_POLICY_MAPPINGS: PCSTR = s("2.5.29.5")

public val szOID_LICENSES: PCSTR = s("1.3.6.1.4.1.311.10.6.1")

public val szOID_LICENSE_SERVER: PCSTR = s("1.3.6.1.4.1.311.10.6.2")

public val szOID_LOCALITY_NAME: PCSTR = s("2.5.4.7")

public val szOID_LOCAL_MACHINE_KEYSET: PCSTR = s("1.3.6.1.4.1.311.17.2")

public val szOID_LOGOTYPE_EXT: PCSTR = s("1.3.6.1.5.5.7.1.12")

public val szOID_LOYALTY_OTHER_LOGOTYPE: PCSTR = s("1.3.6.1.5.5.7.20.1")

public val szOID_MEMBER: PCSTR = s("2.5.4.31")

public val szOID_MICROSOFT_PUBLISHER_SIGNER: PCSTR = s("1.3.6.1.4.1.311.76.8.1")

public val szOID_NAME_CONSTRAINTS: PCSTR = s("2.5.29.30")

public val szOID_NETSCAPE: PCSTR = s("2.16.840.1.113730")

public val szOID_NETSCAPE_BASE_URL: PCSTR = s("2.16.840.1.113730.1.2")

public val szOID_NETSCAPE_CA_POLICY_URL: PCSTR = s("2.16.840.1.113730.1.8")

public val szOID_NETSCAPE_CA_REVOCATION_URL: PCSTR = s("2.16.840.1.113730.1.4")

public val szOID_NETSCAPE_CERT_EXTENSION: PCSTR = s("2.16.840.1.113730.1")

public val szOID_NETSCAPE_CERT_RENEWAL_URL: PCSTR = s("2.16.840.1.113730.1.7")

public val szOID_NETSCAPE_CERT_SEQUENCE: PCSTR = s("2.16.840.1.113730.2.5")

public val szOID_NETSCAPE_CERT_TYPE: PCSTR = s("2.16.840.1.113730.1.1")

public val szOID_NETSCAPE_COMMENT: PCSTR = s("2.16.840.1.113730.1.13")

public val szOID_NETSCAPE_DATA_TYPE: PCSTR = s("2.16.840.1.113730.2")

public val szOID_NETSCAPE_REVOCATION_URL: PCSTR = s("2.16.840.1.113730.1.3")

public val szOID_NETSCAPE_SSL_SERVER_NAME: PCSTR = s("2.16.840.1.113730.1.12")

public val szOID_NEXT_UPDATE_LOCATION: PCSTR = s("1.3.6.1.4.1.311.10.2")

public val szOID_NIST_AES128_CBC: PCSTR = s("2.16.840.1.101.3.4.1.2")

public val szOID_NIST_AES128_WRAP: PCSTR = s("2.16.840.1.101.3.4.1.5")

public val szOID_NIST_AES192_CBC: PCSTR = s("2.16.840.1.101.3.4.1.22")

public val szOID_NIST_AES192_WRAP: PCSTR = s("2.16.840.1.101.3.4.1.25")

public val szOID_NIST_AES256_CBC: PCSTR = s("2.16.840.1.101.3.4.1.42")

public val szOID_NIST_AES256_WRAP: PCSTR = s("2.16.840.1.101.3.4.1.45")

public val szOID_NIST_sha256: PCSTR = s("2.16.840.1.101.3.4.2.1")

public val szOID_NIST_sha384: PCSTR = s("2.16.840.1.101.3.4.2.2")

public val szOID_NIST_sha512: PCSTR = s("2.16.840.1.101.3.4.2.3")

public val szOID_NT5_CRYPTO: PCSTR = s("1.3.6.1.4.1.311.10.3.6")

public val szOID_NTDS_CA_SECURITY_EXT: PCSTR = s("1.3.6.1.4.1.311.25.2")

public val szOID_NTDS_OBJECTSID: PCSTR = s("1.3.6.1.4.1.311.25.2.1")

public val szOID_NTDS_REPLICATION: PCSTR = s("1.3.6.1.4.1.311.25.1")

public val szOID_NT_PRINCIPAL_NAME: PCSTR = s("1.3.6.1.4.1.311.20.2.3")

public val szOID_OEM_WHQL_CRYPTO: PCSTR = s("1.3.6.1.4.1.311.10.3.7")

public val szOID_OIW: PCSTR = s("1.3.14")

public val szOID_OIWDIR: PCSTR = s("1.3.14.7.2")

public val szOID_OIWDIR_CRPT: PCSTR = s("1.3.14.7.2.1")

public val szOID_OIWDIR_HASH: PCSTR = s("1.3.14.7.2.2")

public val szOID_OIWDIR_SIGN: PCSTR = s("1.3.14.7.2.3")

public val szOID_OIWDIR_md2: PCSTR = s("1.3.14.7.2.2.1")

public val szOID_OIWDIR_md2RSA: PCSTR = s("1.3.14.7.2.3.1")

public val szOID_OIWSEC: PCSTR = s("1.3.14.3.2")

public val szOID_OIWSEC_desCBC: PCSTR = s("1.3.14.3.2.7")

public val szOID_OIWSEC_desCFB: PCSTR = s("1.3.14.3.2.9")

public val szOID_OIWSEC_desECB: PCSTR = s("1.3.14.3.2.6")

public val szOID_OIWSEC_desEDE: PCSTR = s("1.3.14.3.2.17")

public val szOID_OIWSEC_desMAC: PCSTR = s("1.3.14.3.2.10")

public val szOID_OIWSEC_desOFB: PCSTR = s("1.3.14.3.2.8")

public val szOID_OIWSEC_dhCommMod: PCSTR = s("1.3.14.3.2.16")

public val szOID_OIWSEC_dsa: PCSTR = s("1.3.14.3.2.12")

public val szOID_OIWSEC_dsaComm: PCSTR = s("1.3.14.3.2.20")

public val szOID_OIWSEC_dsaCommSHA: PCSTR = s("1.3.14.3.2.21")

public val szOID_OIWSEC_dsaCommSHA1: PCSTR = s("1.3.14.3.2.28")

public val szOID_OIWSEC_dsaSHA1: PCSTR = s("1.3.14.3.2.27")

public val szOID_OIWSEC_keyHashSeal: PCSTR = s("1.3.14.3.2.23")

public val szOID_OIWSEC_md2RSASign: PCSTR = s("1.3.14.3.2.24")

public val szOID_OIWSEC_md4RSA: PCSTR = s("1.3.14.3.2.2")

public val szOID_OIWSEC_md4RSA2: PCSTR = s("1.3.14.3.2.4")

public val szOID_OIWSEC_md5RSA: PCSTR = s("1.3.14.3.2.3")

public val szOID_OIWSEC_md5RSASign: PCSTR = s("1.3.14.3.2.25")

public val szOID_OIWSEC_mdc2: PCSTR = s("1.3.14.3.2.19")

public val szOID_OIWSEC_mdc2RSA: PCSTR = s("1.3.14.3.2.14")

public val szOID_OIWSEC_rsaSign: PCSTR = s("1.3.14.3.2.11")

public val szOID_OIWSEC_rsaXchg: PCSTR = s("1.3.14.3.2.22")

public val szOID_OIWSEC_sha: PCSTR = s("1.3.14.3.2.18")

public val szOID_OIWSEC_sha1: PCSTR = s("1.3.14.3.2.26")

public val szOID_OIWSEC_sha1RSASign: PCSTR = s("1.3.14.3.2.29")

public val szOID_OIWSEC_shaDSA: PCSTR = s("1.3.14.3.2.13")

public val szOID_OIWSEC_shaRSA: PCSTR = s("1.3.14.3.2.15")

public val szOID_ORGANIZATIONAL_UNIT_NAME: PCSTR = s("2.5.4.11")

public val szOID_ORGANIZATION_NAME: PCSTR = s("2.5.4.10")

public val szOID_OS_VERSION: PCSTR = s("1.3.6.1.4.1.311.13.2.3")

public val szOID_OWNER: PCSTR = s("2.5.4.32")

public val szOID_PHYSICAL_DELIVERY_OFFICE_NAME: PCSTR = s("2.5.4.19")

public val szOID_PIN_RULES_CTL: PCSTR = s("1.3.6.1.4.1.311.10.3.32")

public val szOID_PIN_RULES_DOMAIN_NAME: PCSTR = s("1.3.6.1.4.1.311.10.3.34")

public val szOID_PIN_RULES_EXT: PCSTR = s("1.3.6.1.4.1.311.10.3.33")

public val szOID_PIN_RULES_LOG_END_DATE_EXT: PCSTR = s("1.3.6.1.4.1.311.10.3.35")

public val szOID_PIN_RULES_SIGNER: PCSTR = s("1.3.6.1.4.1.311.10.3.31")

public val szOID_PKCS: PCSTR = s("1.2.840.113549.1")

public val szOID_PKCS_1: PCSTR = s("1.2.840.113549.1.1")

public val szOID_PKCS_10: PCSTR = s("1.2.840.113549.1.10")

public val szOID_PKCS_12: PCSTR = s("1.2.840.113549.1.12")

public val szOID_PKCS_12_EXTENDED_ATTRIBUTES: PCSTR = s("1.3.6.1.4.1.311.17.3")

public val szOID_PKCS_12_FRIENDLY_NAME_ATTR: PCSTR = s("1.2.840.113549.1.9.20")

public val szOID_PKCS_12_KEY_PROVIDER_NAME_ATTR: PCSTR = s("1.3.6.1.4.1.311.17.1")

public val szOID_PKCS_12_LOCAL_KEY_ID: PCSTR = s("1.2.840.113549.1.9.21")

public val szOID_PKCS_12_PROTECTED_PASSWORD_SECRET_BAG_TYPE_ID: PCSTR = s("1.3.6.1.4.1.311.17.4")

public val szOID_PKCS_12_PbeIds: PCSTR = s("1.2.840.113549.1.12.1")

public val szOID_PKCS_12_pbeWithSHA1And128BitRC2: PCSTR = s("1.2.840.113549.1.12.1.5")

public val szOID_PKCS_12_pbeWithSHA1And128BitRC4: PCSTR = s("1.2.840.113549.1.12.1.1")

public val szOID_PKCS_12_pbeWithSHA1And2KeyTripleDES: PCSTR = s("1.2.840.113549.1.12.1.4")

public val szOID_PKCS_12_pbeWithSHA1And3KeyTripleDES: PCSTR = s("1.2.840.113549.1.12.1.3")

public val szOID_PKCS_12_pbeWithSHA1And40BitRC2: PCSTR = s("1.2.840.113549.1.12.1.6")

public val szOID_PKCS_12_pbeWithSHA1And40BitRC4: PCSTR = s("1.2.840.113549.1.12.1.2")

public val szOID_PKCS_2: PCSTR = s("1.2.840.113549.1.2")

public val szOID_PKCS_3: PCSTR = s("1.2.840.113549.1.3")

public val szOID_PKCS_4: PCSTR = s("1.2.840.113549.1.4")

public val szOID_PKCS_5: PCSTR = s("1.2.840.113549.1.5")

public val szOID_PKCS_5_PBES2: PCSTR = s("1.2.840.113549.1.5.13")

public val szOID_PKCS_5_PBKDF2: PCSTR = s("1.2.840.113549.1.5.12")

public val szOID_PKCS_6: PCSTR = s("1.2.840.113549.1.6")

public val szOID_PKCS_7: PCSTR = s("1.2.840.113549.1.7")

public val szOID_PKCS_7_DATA: PCSTR = s("1.2.840.113549.1.7.1")

public val szOID_PKCS_7_DIGESTED: PCSTR = s("1.2.840.113549.1.7.5")

public val szOID_PKCS_7_ENCRYPTED: PCSTR = s("1.2.840.113549.1.7.6")

public val szOID_PKCS_7_ENVELOPED: PCSTR = s("1.2.840.113549.1.7.3")

public val szOID_PKCS_7_SIGNED: PCSTR = s("1.2.840.113549.1.7.2")

public val szOID_PKCS_7_SIGNEDANDENVELOPED: PCSTR = s("1.2.840.113549.1.7.4")

public val szOID_PKCS_8: PCSTR = s("1.2.840.113549.1.8")

public val szOID_PKCS_9: PCSTR = s("1.2.840.113549.1.9")

public val szOID_PKCS_9_CONTENT_TYPE: PCSTR = s("1.2.840.113549.1.9.3")

public val szOID_PKCS_9_MESSAGE_DIGEST: PCSTR = s("1.2.840.113549.1.9.4")

public val szOID_PKINIT_KP_KDC: PCSTR = s("1.3.6.1.5.2.3.5")

public val szOID_PKIX: PCSTR = s("1.3.6.1.5.5.7")

public val szOID_PKIX_ACC_DESCR: PCSTR = s("1.3.6.1.5.5.7.48")

public val szOID_PKIX_CA_ISSUERS: PCSTR = s("1.3.6.1.5.5.7.48.2")

public val szOID_PKIX_CA_REPOSITORY: PCSTR = s("1.3.6.1.5.5.7.48.5")

public val szOID_PKIX_KP: PCSTR = s("1.3.6.1.5.5.7.3")

public val szOID_PKIX_KP_CLIENT_AUTH: PCSTR = s("1.3.6.1.5.5.7.3.2")

public val szOID_PKIX_KP_CODE_SIGNING: PCSTR = s("1.3.6.1.5.5.7.3.3")

public val szOID_PKIX_KP_EMAIL_PROTECTION: PCSTR = s("1.3.6.1.5.5.7.3.4")

public val szOID_PKIX_KP_IPSEC_END_SYSTEM: PCSTR = s("1.3.6.1.5.5.7.3.5")

public val szOID_PKIX_KP_IPSEC_TUNNEL: PCSTR = s("1.3.6.1.5.5.7.3.6")

public val szOID_PKIX_KP_IPSEC_USER: PCSTR = s("1.3.6.1.5.5.7.3.7")

public val szOID_PKIX_KP_OCSP_SIGNING: PCSTR = s("1.3.6.1.5.5.7.3.9")

public val szOID_PKIX_KP_SERVER_AUTH: PCSTR = s("1.3.6.1.5.5.7.3.1")

public val szOID_PKIX_KP_TIMESTAMP_SIGNING: PCSTR = s("1.3.6.1.5.5.7.3.8")

public val szOID_PKIX_NO_SIGNATURE: PCSTR = s("1.3.6.1.5.5.7.6.2")

public val szOID_PKIX_OCSP: PCSTR = s("1.3.6.1.5.5.7.48.1")

public val szOID_PKIX_OCSP_BASIC_SIGNED_RESPONSE: PCSTR = s("1.3.6.1.5.5.7.48.1.1")

public val szOID_PKIX_OCSP_NOCHECK: PCSTR = s("1.3.6.1.5.5.7.48.1.5")

public val szOID_PKIX_OCSP_NONCE: PCSTR = s("1.3.6.1.5.5.7.48.1.2")

public val szOID_PKIX_PE: PCSTR = s("1.3.6.1.5.5.7.1")

public val szOID_PKIX_POLICY_QUALIFIER_CPS: PCSTR = s("1.3.6.1.5.5.7.2.1")

public val szOID_PKIX_POLICY_QUALIFIER_USERNOTICE: PCSTR = s("1.3.6.1.5.5.7.2.2")

public val szOID_PKIX_TIME_STAMPING: PCSTR = s("1.3.6.1.5.5.7.48.3")

public val szOID_PLATFORM_MANIFEST_BINARY_ID: PCSTR = s("1.3.6.1.4.1.311.10.3.28")

public val szOID_POLICY_CONSTRAINTS: PCSTR = s("2.5.29.36")

public val szOID_POLICY_MAPPINGS: PCSTR = s("2.5.29.33")

public val szOID_POSTAL_ADDRESS: PCSTR = s("2.5.4.16")

public val szOID_POSTAL_CODE: PCSTR = s("2.5.4.17")

public val szOID_POST_OFFICE_BOX: PCSTR = s("2.5.4.18")

public val szOID_PREFERRED_DELIVERY_METHOD: PCSTR = s("2.5.4.28")

public val szOID_PRESENTATION_ADDRESS: PCSTR = s("2.5.4.29")

public val szOID_PRIVATEKEY_USAGE_PERIOD: PCSTR = s("2.5.29.16")

public val szOID_PRODUCT_UPDATE: PCSTR = s("1.3.6.1.4.1.311.31.1")

public val szOID_PROTECTED_PROCESS_LIGHT_SIGNER: PCSTR = s("1.3.6.1.4.1.311.10.3.22")

public val szOID_PROTECTED_PROCESS_SIGNER: PCSTR = s("1.3.6.1.4.1.311.10.3.24")

public val szOID_QC_EU_COMPLIANCE: PCSTR = s("0.4.0.1862.1.1")

public val szOID_QC_SSCD: PCSTR = s("0.4.0.1862.1.4")

public val szOID_QC_STATEMENTS_EXT: PCSTR = s("1.3.6.1.5.5.7.1.3")

public val szOID_RDN_DUMMY_SIGNER: PCSTR = s("1.3.6.1.4.1.311.21.9")

public val szOID_RDN_TCG_PLATFORM_MANUFACTURER: PCSTR = s("2.23.133.2.4")

public val szOID_RDN_TCG_PLATFORM_MODEL: PCSTR = s("2.23.133.2.5")

public val szOID_RDN_TCG_PLATFORM_VERSION: PCSTR = s("2.23.133.2.6")

public val szOID_RDN_TPM_MANUFACTURER: PCSTR = s("2.23.133.2.1")

public val szOID_RDN_TPM_MODEL: PCSTR = s("2.23.133.2.2")

public val szOID_RDN_TPM_VERSION: PCSTR = s("2.23.133.2.3")

public val szOID_REASON_CODE_HOLD: PCSTR = s("2.5.29.23")

public val szOID_REGISTERED_ADDRESS: PCSTR = s("2.5.4.26")

public val szOID_REMOVE_CERTIFICATE: PCSTR = s("1.3.6.1.4.1.311.10.8.1")

public val szOID_RENEWAL_CERTIFICATE: PCSTR = s("1.3.6.1.4.1.311.13.1")

public val szOID_REQUEST_CLIENT_INFO: PCSTR = s("1.3.6.1.4.1.311.21.20")

public val szOID_REQUIRE_CERT_CHAIN_POLICY: PCSTR = s("1.3.6.1.4.1.311.21.15")

public val szOID_REVOKED_LIST_SIGNER: PCSTR = s("1.3.6.1.4.1.311.10.3.19")

public val szOID_RFC3161_counterSign: PCSTR = s("1.3.6.1.4.1.311.3.3.1")

public val szOID_RFC3161v21_counterSign: PCSTR = s("1.3.6.1.4.1.311.3.3.2")

public val szOID_RFC3161v21_thumbprints: PCSTR = s("1.3.6.1.4.1.311.3.3.3")

public val szOID_ROLE_OCCUPANT: PCSTR = s("2.5.4.33")

public val szOID_ROOT_LIST_SIGNER: PCSTR = s("1.3.6.1.4.1.311.10.3.9")

public val szOID_ROOT_PROGRAM_AUTO_UPDATE_CA_REVOCATION: PCSTR = s("1.3.6.1.4.1.311.60.3.1")

public val szOID_ROOT_PROGRAM_AUTO_UPDATE_END_REVOCATION: PCSTR = s("1.3.6.1.4.1.311.60.3.2")

public val szOID_ROOT_PROGRAM_FLAGS: PCSTR = s("1.3.6.1.4.1.311.60.1.1")

public val szOID_ROOT_PROGRAM_NO_OCSP_FAILOVER_TO_CRL: PCSTR = s("1.3.6.1.4.1.311.60.3.3")

public val szOID_RSA: PCSTR = s("1.2.840.113549")

public val szOID_RSAES_OAEP: PCSTR = s("1.2.840.113549.1.1.7")

public val szOID_RSA_DES_EDE3_CBC: PCSTR = s("1.2.840.113549.3.7")

public val szOID_RSA_DH: PCSTR = s("1.2.840.113549.1.3.1")

public val szOID_RSA_ENCRYPT: PCSTR = s("1.2.840.113549.3")

public val szOID_RSA_HASH: PCSTR = s("1.2.840.113549.2")

public val szOID_RSA_MD2: PCSTR = s("1.2.840.113549.2.2")

public val szOID_RSA_MD2RSA: PCSTR = s("1.2.840.113549.1.1.2")

public val szOID_RSA_MD4: PCSTR = s("1.2.840.113549.2.4")

public val szOID_RSA_MD4RSA: PCSTR = s("1.2.840.113549.1.1.3")

public val szOID_RSA_MD5: PCSTR = s("1.2.840.113549.2.5")

public val szOID_RSA_MD5RSA: PCSTR = s("1.2.840.113549.1.1.4")

public val szOID_RSA_MGF1: PCSTR = s("1.2.840.113549.1.1.8")

public val szOID_RSA_PSPECIFIED: PCSTR = s("1.2.840.113549.1.1.9")

public val szOID_RSA_RC2CBC: PCSTR = s("1.2.840.113549.3.2")

public val szOID_RSA_RC4: PCSTR = s("1.2.840.113549.3.4")

public val szOID_RSA_RC5_CBCPad: PCSTR = s("1.2.840.113549.3.9")

public val szOID_RSA_RSA: PCSTR = s("1.2.840.113549.1.1.1")

public val szOID_RSA_SETOAEP_RSA: PCSTR = s("1.2.840.113549.1.1.6")

public val szOID_RSA_SHA1RSA: PCSTR = s("1.2.840.113549.1.1.5")

public val szOID_RSA_SHA256RSA: PCSTR = s("1.2.840.113549.1.1.11")

public val szOID_RSA_SHA384RSA: PCSTR = s("1.2.840.113549.1.1.12")

public val szOID_RSA_SHA512RSA: PCSTR = s("1.2.840.113549.1.1.13")

public val szOID_RSA_SMIMECapabilities: PCSTR = s("1.2.840.113549.1.9.15")

public val szOID_RSA_SMIMEalg: PCSTR = s("1.2.840.113549.1.9.16.3")

public val szOID_RSA_SMIMEalgCMS3DESwrap: PCSTR = s("1.2.840.113549.1.9.16.3.6")

public val szOID_RSA_SMIMEalgCMSRC2wrap: PCSTR = s("1.2.840.113549.1.9.16.3.7")

public val szOID_RSA_SMIMEalgESDH: PCSTR = s("1.2.840.113549.1.9.16.3.5")

public val szOID_RSA_SSA_PSS: PCSTR = s("1.2.840.113549.1.1.10")

public val szOID_RSA_certExtensions: PCSTR = s("1.2.840.113549.1.9.14")

public val szOID_RSA_challengePwd: PCSTR = s("1.2.840.113549.1.9.7")

public val szOID_RSA_contentType: PCSTR = s("1.2.840.113549.1.9.3")

public val szOID_RSA_counterSign: PCSTR = s("1.2.840.113549.1.9.6")

public val szOID_RSA_data: PCSTR = s("1.2.840.113549.1.7.1")

public val szOID_RSA_digestedData: PCSTR = s("1.2.840.113549.1.7.5")

public val szOID_RSA_emailAddr: PCSTR = s("1.2.840.113549.1.9.1")

public val szOID_RSA_encryptedData: PCSTR = s("1.2.840.113549.1.7.6")

public val szOID_RSA_envelopedData: PCSTR = s("1.2.840.113549.1.7.3")

public val szOID_RSA_extCertAttrs: PCSTR = s("1.2.840.113549.1.9.9")

public val szOID_RSA_hashedData: PCSTR = s("1.2.840.113549.1.7.5")

public val szOID_RSA_messageDigest: PCSTR = s("1.2.840.113549.1.9.4")

public val szOID_RSA_preferSignedData: PCSTR = s("1.2.840.113549.1.9.15.1")

public val szOID_RSA_signEnvData: PCSTR = s("1.2.840.113549.1.7.4")

public val szOID_RSA_signedData: PCSTR = s("1.2.840.113549.1.7.2")

public val szOID_RSA_signingTime: PCSTR = s("1.2.840.113549.1.9.5")

public val szOID_RSA_unstructAddr: PCSTR = s("1.2.840.113549.1.9.8")

public val szOID_RSA_unstructName: PCSTR = s("1.2.840.113549.1.9.2")

public val szOID_SEARCH_GUIDE: PCSTR = s("2.5.4.14")

public val szOID_SEE_ALSO: PCSTR = s("2.5.4.34")

public val szOID_SERIALIZED: PCSTR = s("1.3.6.1.4.1.311.10.3.3.1")

public val szOID_SERVER_GATED_CRYPTO: PCSTR = s("1.3.6.1.4.1.311.10.3.3")

public val szOID_SGC_NETSCAPE: PCSTR = s("2.16.840.1.113730.4.1")

public val szOID_SITE_PIN_RULES_FLAGS_ATTR: PCSTR = s("1.3.6.1.4.1.311.10.4.3")

public val szOID_SITE_PIN_RULES_INDEX_ATTR: PCSTR = s("1.3.6.1.4.1.311.10.4.2")

public val szOID_SORTED_CTL: PCSTR = s("1.3.6.1.4.1.311.10.1.1")

public val szOID_STATE_OR_PROVINCE_NAME: PCSTR = s("2.5.4.8")

public val szOID_STREET_ADDRESS: PCSTR = s("2.5.4.9")

public val szOID_SUBJECT_ALT_NAME: PCSTR = s("2.5.29.7")

public val szOID_SUBJECT_ALT_NAME2: PCSTR = s("2.5.29.17")

public val szOID_SUBJECT_DIR_ATTRS: PCSTR = s("2.5.29.9")

public val szOID_SUBJECT_INFO_ACCESS: PCSTR = s("1.3.6.1.5.5.7.1.11")

public val szOID_SUBJECT_KEY_IDENTIFIER: PCSTR = s("2.5.29.14")

public val szOID_SUPPORTED_APPLICATION_CONTEXT: PCSTR = s("2.5.4.30")

public val szOID_SUR_NAME: PCSTR = s("2.5.4.4")

public val szOID_SYNC_ROOT_CTL_EXT: PCSTR = s("1.3.6.1.4.1.311.10.3.50")

public val szOID_TELEPHONE_NUMBER: PCSTR = s("2.5.4.20")

public val szOID_TELETEXT_TERMINAL_IDENTIFIER: PCSTR = s("2.5.4.22")

public val szOID_TELEX_NUMBER: PCSTR = s("2.5.4.21")

public val szOID_TIMESTAMP_TOKEN: PCSTR = s("1.2.840.113549.1.9.16.1.4")

public val szOID_TITLE: PCSTR = s("2.5.4.12")

public val szOID_TLS_FEATURES_EXT: PCSTR = s("1.3.6.1.5.5.7.1.24")

public val szOID_USER_CERTIFICATE: PCSTR = s("2.5.4.36")

public val szOID_USER_PASSWORD: PCSTR = s("2.5.4.35")

public val szOID_VERISIGN_BITSTRING_6_13: PCSTR = s("2.16.840.1.113733.1.6.13")

public val szOID_VERISIGN_ISS_STRONG_CRYPTO: PCSTR = s("2.16.840.1.113733.1.8.1")

public val szOID_VERISIGN_ONSITE_JURISDICTION_HASH: PCSTR = s("2.16.840.1.113733.1.6.11")

public val szOID_VERISIGN_PRIVATE_6_9: PCSTR = s("2.16.840.1.113733.1.6.9")

public val szOID_WHQL_CRYPTO: PCSTR = s("1.3.6.1.4.1.311.10.3.5")

public val szOID_WINDOWS_KITS_SIGNER: PCSTR = s("1.3.6.1.4.1.311.10.3.20")

public val szOID_WINDOWS_RT_SIGNER: PCSTR = s("1.3.6.1.4.1.311.10.3.21")

public val szOID_WINDOWS_SOFTWARE_EXTENSION_SIGNER: PCSTR = s("1.3.6.1.4.1.311.10.3.26")

public val szOID_WINDOWS_STORE_SIGNER: PCSTR = s("1.3.6.1.4.1.311.76.3.1")

public val szOID_WINDOWS_TCB_SIGNER: PCSTR = s("1.3.6.1.4.1.311.10.3.23")

public val szOID_WINDOWS_THIRD_PARTY_COMPONENT_SIGNER: PCSTR = s("1.3.6.1.4.1.311.10.3.25")

public val szOID_X21_ADDRESS: PCSTR = s("2.5.4.24")

public val szOID_X957: PCSTR = s("1.2.840.10040")

public val szOID_X957_DSA: PCSTR = s("1.2.840.10040.4.1")

public val szOID_X957_SHA1DSA: PCSTR = s("1.2.840.10040.4.3")

public val szOID_YESNO_TRUST_ATTR: PCSTR = s("1.3.6.1.4.1.311.10.4.1")

public val szPRIV_KEY_CACHE_MAX_ITEMS: PCSTR = s("PrivKeyCacheMaxItems")

public val szPRIV_KEY_CACHE_PURGE_INTERVAL_SECONDS: PCSTR = s("PrivKeyCachePurgeIntervalSeconds")

public val szROOT_STORE_FILE: PCSTR = s("msroots")

public val szUSER_KEYEXCHANGE_CERT_PREFIX: PCSTR = s("kxc")

public val szUSER_KEYEXCHANGE_PRIVATE_KEY_PREFIX: PCSTR = s("kxs")

public val szUSER_KEYEXCHANGE_PUBLIC_KEY_PREFIX: PCSTR = s("kxp")

public val szUSER_SIGNATURE_CERT_PREFIX: PCSTR = s("ksc")

public val szUSER_SIGNATURE_PRIVATE_KEY_PREFIX: PCSTR = s("kss")

public val szUSER_SIGNATURE_PUBLIC_KEY_PREFIX: PCSTR = s("ksp")

public val sz_CERT_STORE_PROV_COLLECTION: PCSTR = s("Collection")

public val sz_CERT_STORE_PROV_FILENAME: PCWSTR = w("File")

public val sz_CERT_STORE_PROV_FILENAME_W: PCSTR = s("File")

public val sz_CERT_STORE_PROV_LDAP: PCWSTR = w("Ldap")

public val sz_CERT_STORE_PROV_LDAP_W: PCSTR = s("Ldap")

public val sz_CERT_STORE_PROV_MEMORY: PCSTR = s("Memory")

public val sz_CERT_STORE_PROV_PHYSICAL: PCWSTR = w("Physical")

public val sz_CERT_STORE_PROV_PHYSICAL_W: PCSTR = s("Physical")

public val sz_CERT_STORE_PROV_PKCS12: PCSTR = s("PKCS12")

public val sz_CERT_STORE_PROV_PKCS7: PCSTR = s("PKCS7")

public val sz_CERT_STORE_PROV_SERIALIZED: PCSTR = s("Serialized")

public val sz_CERT_STORE_PROV_SMART_CARD: PCWSTR = w("SmartCard")

public val sz_CERT_STORE_PROV_SMART_CARD_W: PCSTR = s("SmartCard")

public val sz_CERT_STORE_PROV_SYSTEM: PCWSTR = w("System")

public val sz_CERT_STORE_PROV_SYSTEM_REGISTRY: PCWSTR = w("SystemRegistry")

public val sz_CERT_STORE_PROV_SYSTEM_REGISTRY_W: PCSTR = s("SystemRegistry")

public val sz_CERT_STORE_PROV_SYSTEM_W: PCSTR = s("System")

public val wszCARD_USER_ADMIN: PCWSTR = w("admin")

public val wszCARD_USER_EVERYONE: PCWSTR = w("anonymous")

public val wszCARD_USER_USER: PCWSTR = w("user")

public val wszURI_CANONICALIZATION_C14N: PCWSTR = w("http://www.w3.org/TR/2001/REC-xml-c14n-20010315")

public val wszURI_CANONICALIZATION_C14NC: PCWSTR = w("http://www.w3.org/TR/2001/REC-xml-c14n-20010315#WithComments")

public val wszURI_CANONICALIZATION_EXSLUSIVE_C14N: PCWSTR = w("http://www.w3.org/2001/10/xml-exc-c14n#")

public val wszURI_CANONICALIZATION_EXSLUSIVE_C14NC: PCWSTR = w("http://www.w3.org/2001/10/xml-exc-c14n#WithComments")

public val wszURI_NTDS_OBJECTSID_PREFIX: PCWSTR = w("tag:microsoft.com,2022-09-14:sid:")

public val wszURI_TRANSFORM_XPATH: PCWSTR = w("http://www.w3.org/TR/1999/REC-xpath-19991116")

public val wszURI_XMLNS_DIGSIG_BASE64: PCWSTR = w("http://www.w3.org/2000/09/xmldsig#base64")

public val wszURI_XMLNS_DIGSIG_DSA_SHA1: PCWSTR = w("http://www.w3.org/2000/09/xmldsig#dsa-sha1")

public val wszURI_XMLNS_DIGSIG_ECDSA_SHA1: PCWSTR = w("http://www.w3.org/2001/04/xmldsig-more#ecdsa-sha1")

public val wszURI_XMLNS_DIGSIG_ECDSA_SHA256: PCWSTR = w("http://www.w3.org/2001/04/xmldsig-more#ecdsa-sha256")

public val wszURI_XMLNS_DIGSIG_ECDSA_SHA384: PCWSTR = w("http://www.w3.org/2001/04/xmldsig-more#ecdsa-sha384")

public val wszURI_XMLNS_DIGSIG_ECDSA_SHA512: PCWSTR = w("http://www.w3.org/2001/04/xmldsig-more#ecdsa-sha512")

public val wszURI_XMLNS_DIGSIG_HMAC_SHA1: PCWSTR = w("http://www.w3.org/2000/09/xmldsig#hmac-sha1")

public val wszURI_XMLNS_DIGSIG_HMAC_SHA256: PCWSTR = w("http://www.w3.org/2001/04/xmldsig-more#hmac-sha256")

public val wszURI_XMLNS_DIGSIG_HMAC_SHA384: PCWSTR = w("http://www.w3.org/2001/04/xmldsig-more#hmac-sha384")

public val wszURI_XMLNS_DIGSIG_HMAC_SHA512: PCWSTR = w("http://www.w3.org/2001/04/xmldsig-more#hmac-sha512")

public val wszURI_XMLNS_DIGSIG_RSA_SHA1: PCWSTR = w("http://www.w3.org/2000/09/xmldsig#rsa-sha1")

public val wszURI_XMLNS_DIGSIG_RSA_SHA256: PCWSTR = w("http://www.w3.org/2001/04/xmldsig-more#rsa-sha256")

public val wszURI_XMLNS_DIGSIG_RSA_SHA384: PCWSTR = w("http://www.w3.org/2001/04/xmldsig-more#rsa-sha384")

public val wszURI_XMLNS_DIGSIG_RSA_SHA512: PCWSTR = w("http://www.w3.org/2001/04/xmldsig-more#rsa-sha512")

public val wszURI_XMLNS_DIGSIG_SHA1: PCWSTR = w("http://www.w3.org/2000/09/xmldsig#sha1")

public val wszURI_XMLNS_DIGSIG_SHA256: PCWSTR = w("http://www.w3.org/2001/04/xmlenc#sha256")

public val wszURI_XMLNS_DIGSIG_SHA384: PCWSTR = w("http://www.w3.org/2001/04/xmldsig-more#sha384")

public val wszURI_XMLNS_DIGSIG_SHA512: PCWSTR = w("http://www.w3.org/2001/04/xmlenc#sha512")

public val wszURI_XMLNS_TRANSFORM_BASE64: PCWSTR = w("http://www.w3.org/2000/09/xmldsig#base64")

public val wszURI_XMLNS_TRANSFORM_ENVELOPED: PCWSTR = w("http://www.w3.org/2000/09/xmldsig#enveloped-signature")

public val wszXMLNS_DIGSIG: PCWSTR = w("http://www.w3.org/2000/09/xmldsig#")

public val wszXMLNS_DIGSIG_Id: PCWSTR = w("Id")

public val wszXMLNS_DIGSIG_SignatureProperties: PCWSTR = w("http://www.w3.org/2000/09/xmldsig#SignatureProperties")
